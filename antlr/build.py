#!/usr/bin/env python3
# -*- coding:utf-8 -*-

import os

if os.system('antlr4 Japy.g4 -o target') != 0:
    print('failed to execute antlr4')
    exit(-1)

# 修改target目录下所有java文件的package行
inputPath = os.path.join(os.getcwd(), 'target')
outputPath = '../japy/src/main/java/org/luncert/grammar'
for fileName in os.listdir(inputPath):
    filePath = os.path.join(inputPath, fileName)
    if fileName.endswith('.java'):
        data = None
        with open(filePath, 'rb') as f:
            data = f.read()
            data = 'package org.luncert.grammar;\n' + data
        with open(os.path.join(outputPath, fileName), 'wb') as f:
            f.write(data)
    os.remove(filePath)
os.rmdir(inputPath)

