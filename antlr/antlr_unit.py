
import os
import shutil
from subprocess import Popen, PIPE

class GrunCmdBuilder(object):
    def __init__(self):
        self.name = ''
        self.rule = ''
        self.gui = False
        self.tree = False
        self.tokens = False
        self.trace = False
        self.SLL = False
        self.diagnostics = False
        self.encoding = ''
        self.ps = ''

    def build(self):
        grun_cmd = 'java org.antlr.v4.gui.TestRig %s %s ' % (self.name, self.rule)
        if self.gui: grun_cmd += ' -gui'
        if self.tree: grun_cmd += ' -tree'
        if self.tokens: grun_cmd += ' -tokens'
        if self.trace: grun_cmd += ' -trace'
        if self.SLL: grun_cmd += ' -SLL'
        if self.diagnostics: grun_cmd += ' -diagnostics'
        if self.encoding: grun_cmd += ' -encoding ' + self.encoding
        if self.ps: grun_cmd += ' -ps ' + self.ps
        print(grun_cmd)
        return grun_cmd

class TreeNode(object):
    def __init__(self, name, value):
        self.name = name
        self.value = value
        self.children = []

    def add_child(self, child, match_path=None):
        if match_path:
            self.match_or_create(match_path).add_child(child)
        else: self.children.append(child)

    def match(self, name):
        return self.name == name

    def match_children(self, name):
        for child in self.children:
            if child.match(name):
                return child
    
    def match_all(self, path):
        base = self
        names = path if isinstance(path, list) else path.split('.')
        if not base.match(names[0]):
            return None

        names.pop(0)
        for name in names:
            base = base.match_children(name)
            if not base: return None
        return base
    
    def match_all_from_children(self, path):
        names = path if isinstance(path, list) else path.split('.')
        base = self.match_children(names[0])
        if not base: return None

        names.pop(0)
        for name in names:
            base = base.match_children(name)
            if not base: return None
        return base

    def match_or_create(self, path):
        tmp = base = self
        names = path if isinstance(path, list) else path.split('.')
        if not base.match(names[0]):
            return None

        i, limit = 1, len(names)
        while i < limit:
            name = names[i]
            base = base.match_children(name)
            if not base:
                base = tmp
                while i < limit:
                    name = names[i]
                    tmp = TreeNode(name, None)
                    base.add_child(tmp)
                    base = tmp
                    i += 1
                break
            else: i += 1
        return base

    def __str__(self):
        return 'TreeNode(name=%s, value=%s)' % (self.name, self.value)
    
    def print_tree(self, indent=''):
        print(indent + self.__str__())
        indent += '  '
        for child in self.children:
            child.print_tree(indent)

class Grammar(object):
    def __init__(self, name, content):
        self.name = name
        self.content = content
    
    def __str__(self):
        return 'Grammar(%s:%s)' % (self.name, self.content)

# Annotation
class Grammars(object):
    grs = {}
    def __init__(self, func):
        grs = func()
        if grs == None or not isinstance(grs, dict):
            raise Exception('method decorated with @Grammars must return a dict')
        for key, value in grs.items():
            if key in Grammars.grs:
                raise Exception('duplicated grammar name: ' + key)
            Grammars.grs[key] = Grammar(key, value)

class TestManager(object):
    def __init__(self):
        self.tests = TreeNode('src', None)
        self.loadpath = None
        self.ctx = TestContext()

    def add_test(self, func):
        tmp = self.tests.match_or_create(self.loadpath)
        if not tmp.value:
            tmp.value = {}
        tmp.value[func.__name__] = func
    
    def test(self, path):
        def raise_exception():
            raise Exception('cound not find test unit with specify path: ' + path)
        i = path.find('#')
        unit_name = None
        if i >= 0:
            names = path[:i].split('.')
            unit_name = path[i + 1:]
        else: names = path.split('.')
        names.insert(0, 'src')
        base = self.tests.match_all(names)
        
        if not base or not base.value:
            raise_exception()
        if unit_name:
            if not unit_name in base.value:
                raise_exception()
            base.value[unit_name](self.ctx)
        else:
            for test in base.value.values():
                test(self.ctx)
    
    def set_loadpath(self, loadpath):
        self.loadpath = loadpath

class TestContext(object):
    def get_grammar(self, grammar_name):
        if not grammar_name in Grammars.grs:
            raise Exception('cound not found grammar with name: ' + grammar_name)
        return Grammars.grs[grammar_name]

    def test(self, grammar_name, test_source, requires=(), **grun_config):
        '''
        requires: declare grammar dependencies
        grun_config: gui, tree, tokens, trace, SLL, diagnostics, encoding, ps
        '''
        align_num = 22 + len(grammar_name)
        print('-' * align_num)
        print('> testing grammar %s' % grammar_name)
        # build g4 file
        raw = 'grammar %s;' % grammar_name
        g = self.get_grammar(grammar_name)
        raw += g.name + ':' + g.content + ';\n'
        for g_name in requires:
            g = self.get_grammar(g_name)
            raw += g.name + ':' + g.content + ';\n'
        # write into tmp file
        filename = '%s.g4' % grammar_name
        with open(filename, 'wb') as f:
            f.write(raw.encode('utf-8'))

        if os.path.exists('tmp'):
            shutil.rmtree(path='tmp')
        if os.system('antlr4 %s -o tmp && cd tmp && javac *.java' % filename) != 0:
            print('compile grammar failed: ' + grammar_name)
            exit(-1)

        # build grun cmd        
        grun_builder = GrunCmdBuilder()
        grun_builder.rule = grun_builder.name = grammar_name
        for key, value in grun_config.items():
            if hasattr(grun_builder, key):
                setattr(grun_builder, key, value)

        p = Popen(grun_builder.build(), stdin=PIPE, stdout=PIPE, stderr=PIPE, cwd='tmp')
        p.stdin.write(test_source.encode('utf-8'))
        p.stdin.close()
        ret = p.wait()
        if ret != 0:
            print('execute grammar test failed: %s, error code: %d' % (grammar_name, ret))
        else:
            err = p.stderr.read().decode('utf-8')
            test_result = '> test %s' % ('failed' if err else 'passed')
            print(test_result)
            if err:
                print(err)
            print(p.stdout.read().decode('utf-8'))

        print('-' * align_num)

        os.remove(filename)
        shutil.rmtree(path='tmp')

test_manager = TestManager()

# Annotation
def Test(func):
    test_manager.add_test(func)
