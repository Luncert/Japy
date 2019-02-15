# Changes
* WS: \r\n\t
* delete EXTENDS: >
* delete IMPLEMENTS: -
* extendsInterfaces: >
* superclass: >
* superinterfaces: -
* add @lexer::header
* add @lexer::members
* add NEWLINE
* add tokens { INDENT, DEDENT }
* classBody: add ':' NEWLINE in the head
* interfaceBody: add ':' NEWLINE in the head
* enumBody: add ':' NEWLINE in the head
* fieldDeclaration: delete ';'
* block
* blockStatements

# Note
* moduleDeclaration 没有处理
* enumBodyDeclarations

# Where is indent needed?
* class declaration
* method declaration
* while statement
* for statement
* if statement
* try catch statement
* do while statement