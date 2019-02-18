
class TreeNode(object):
    def __init__(self, name, value):
        self.name = name
        self.value = value
        self.children = []

    def add_child(self, child, match_path=None):
        if match_path:
            tmp = base = self
            names = match_path.split('.')
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
        else: self.children.append(child)

    def match(self, name):
        return self.name == name

    def match_children(self, name):
        for child in self.children:
            if child.match(name):
                return child
    
    def match_all(self, path):
        p = path.split('.')
        base = self
        for name in p:
            base = base.match_children(name)
            if not base:
                return None
        return base            

    def __str__(self):
        return 'TreeNode(name=%s, value=%s)' % (self.name, self.value)
    
    def print_tree(self, tab=''):
        print(tab + self.__str__())
        tab += '  '
        for child in self.children:
            child.print_tree(tab)

class Grammar(object):
    def __init__(self, name, content):
        self.name = name
        self.content = content
    
    def __str__(self):
        return 'Grammar(%s:%s)' % (self.name, self.content)

class Grammars(object):
    grs = {}
    def __init__(self, func):
        grs = func()
        if grs == None or not isinstance(grs, dict):
            raise Exception('method decorated with @Grammars must return a dict')
        for key, value in grs.values():
            if key in Grammars.grs:
                raise Exception('duplicated grammar name: ' + key)
            Grammars.grs[key] = Grammar(key, value)

class TestManager(object):
    def __init__(self):
        self.tests = TreeNode('src', None)
        self.loadpath = None
        self.ctx = None

    def add_test(self, func):
        test = TreeNode(func.__name__, func)
        self.tests.add_child(test, match_path=self.loadpath)
    
    def set_loadpath(self, loadpath):
        self.loadpath = loadpath

test_manager = TestManager()

def Test(func):
    test_manager.add_test(func)