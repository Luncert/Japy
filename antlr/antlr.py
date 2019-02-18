#!/usr/bin/env python3
# -*- coding:utf-8 -*-

import os
from os import path as Path
import sys
import argparse
import shutil

from antlr_unit import test_manager
    
if __name__ == "__main__":
    workpath = Path.dirname(Path.abspath(__file__))

    parser = argparse.ArgumentParser()
    subparsers = parser.add_subparsers(help='commands')

    # build commands
    def build(args):
        if os.system('antlr4 %s.g4 -o target' % args.name) != 0:
            print('failed to execute antlr4')
            exit(-1)

        # 修改target目录下所有java文件的package行
        cwd = os.getcwd()
        input_path = Path.join(cwd, 'target')
        output_path = Path.join(cwd, args.output, 'src', 'main', 'java', *args.package.split('.'))
        for fileName in os.listdir(input_path):
            filePath = Path.join(input_path, fileName)
            if fileName.endswith('.java'):
                data = None
                with open(filePath, 'rb') as f:
                    data = f.read()
                    data = 'package org.luncert.grammar;\n' + data.decode('utf-8')
                with open(Path.join(output_path, fileName), 'wb') as f:
                    f.write(data.encode('utf-8'))

    build_parser = subparsers.add_parser('build',   help='build java code')
    build_parser.add_argument('--name',     '-n',   help='grammar name', required=True)
    build_parser.add_argument('--output',   '-o',   help='output maven project\'s path', required=True)
    build_parser.add_argument('--package',  '-p',   help='package name', required=True)
    build_parser.set_defaults(func=build)

    # antlr test commands
    def antlr_test(args):
        if args.update:
            if os.system('antlr4 %s.g4 -o target && cd target && javac *.java' % args.name) != 0:
                print('update failed')
                exit(-1)

        grun_cmd = 'cd target && grun %s %s ' % (args.name, args.rule)

        input_files = []
        for item in args.input:
            filepath = Path.join(workpath, item)
            if Path.isdir(filepath):
                for filename in os.listdir(filepath):
                    input_files.append(Path.join(filepath, filename))
            else: input_files.append(filepath)
        grun_cmd += ' '.join(input_files)

        if args.gui:
            grun_cmd += ' -gui'
        if args.tree:
            grun_cmd += ' -tree'
        if args.tokens:
            grun_cmd += ' -tokens'
        if args.trace:
            grun_cmd += ' -trace'
        if args.SLL:
            grun_cmd += ' -SLL'
        if args.diagnostics:
            grun_cmd += ' -diagnostics'
        if args.encoding:
            grun_cmd += ' -encoding ' + args.encoding
        if args.ps:
            grun_cmd += ' -ps ' + args.ps

        if os.system(grun_cmd) != 0:
            print('test fialed')
            exit(-1)

    test_parser = subparsers.add_parser('antlr_test',     help='test grammar with antlr tools')
    test_parser.add_argument('--name',   '-n',      help='grammar name', required=True)
    test_parser.add_argument('--rule',   '-r',      help='grammar rule', required=True)
    test_parser.add_argument('--gui',    '-gui',    help='grun params: 在对话框中以可视化方式显示语法分析树', action='store_true')
    test_parser.add_argument('--tree',   '-tree',   help='grun params: 以LISP格式打印出语法分析树', action='store_true')
    test_parser.add_argument('--tokens', '-tokens', help='grun params: 打印出词法符号流', action='store_true')
    test_parser.add_argument('--trace',  '-trace',  help='grun params: 打印规则的名字以及进入和离开该规则时的词法符号', action='store_true')
    test_parser.add_argument('--SLL',    '-SLL',    help='grun params: 使用另外一种更快但功能稍弱的解析策略', action='store_true')
    test_parser.add_argument('--diagnostics',   '-diagnostics',    help='grun params: 开启解析过程中的调试信息输出', action='store_true')
    test_parser.add_argument('--encoding',   '-encoding',    help='grun params: 若当前的区域设定无法正确读取输入，使用这个选项制定测试组件输入文件的编码')
    test_parser.add_argument('--ps',     '-ps',     help='grun params: 以PostScript格式生成可视化语法分析树，然后将其存储')
    test_parser.add_argument('--input',  '-i',      help='specify input file names', nargs='*', required=True)
    test_parser.add_argument('--update', '-u',      help='recompile after changing grammar file', action='store_true')
    test_parser.set_defaults(func=antlr_test)

    # clean commands
    def clean(args):
        target_path = Path.join(workpath, 'target')
        if Path.exists(target_path):
            shutil.rmtree(path='target')

    clean_parser = subparsers.add_parser('clean',   help='clean output')
    clean_parser.set_defaults(func=clean)

    # unit test commands
        
    def loadGrammars(base):
        with open(Path.join(base, '__init__.py'), 'wb'):
            pass
        for name in os.listdir(base):
            path = Path.join(base, name)
            if Path.isdir(path) and not name == '__pycache__':
                loadGrammars(path)
            elif not name.startswith('__init__') and name.endswith('.py'):
                import_path = path.replace('\\', '.').replace('/', '.').replace('.py', '')
                test_manager.set_loadpath(import_path)
                __import__(import_path, fromlist=['*'])

    def unit_test(args):
        if not Path.exists('src'):
            raise Exception('could not found src directory in cwd')
        if not Path.isdir('src'):
            raise Exception('src is not a directory')
        loadGrammars('src')
        test_manager.tests.print_tree()

    run_parser = subparsers.add_parser('unit_test',   help='run antlr unit test')
    run_parser.set_defaults(func=unit_test)

    # parse

    args = parser.parse_args()
    args.func(args)
    