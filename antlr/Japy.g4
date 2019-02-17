
/**
 * The differences with Java:
 * - block
 * - ;
 * - indent
 */
grammar Japy;

tokens { INDENT, DEDENT }

@lexer::header {
	import java.util.List;
	import java.util.ArrayList;
	import java.util.stream.Collectors;
	import org.antlr.v4.runtime.Token;
}

@lexer::members {

	private List<Token> token_queue = new ArrayList<>();
	private List<Integer> indents = new ArrayList<>();
	private int opened = 0;
	private Token last_token = null;

	@Override
	public void reset() {
		// A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
		token_queue.clear();

		// The stack that keeps track of the indentation level.
		indents.clear();

		// The amount of opened braces, brackets and parenthesis.
		opened = 0;

		super.reset();
	};

	@Override
	public void emit(Token token) {
		if (token != null) {
			super.emit(token);
		} else {
			super.emit();
		}
		token_queue.add(token);
	};

	@Override
	public Token nextToken() {
		// Check if the end-of-file is ahead and there are still some DEDENTS expected.
		if (this._input.LA(1) == JapyParser.EOF && indents.size() > 0) {

			// Remove any trailing EOF tokens from our buffer.
			token_queue = token_queue.stream()
							.filter((token) -> token.getType() != JapyParser.EOF)
							.collect(Collectors.toList());

			// First emit an extra line break that serves as the end of the statement.
			// emit(commonToken(JapyParser.NEWLINE, "\n"));

			// Now emit as much DEDENT tokens as needed.
			while (!indents.isEmpty()) {
				emit(createDedent());
				indents.remove(indents.size() - 1);
			}

			// Put the EOF back on the token stream.
			emit(commonToken(JapyParser.EOF, "<EOF>"));
		}

		Token next = super.nextToken();

		if (next.getChannel() == Token.DEFAULT_CHANNEL) {
			// Keep track of the last token on the default channel.
			last_token = next;
		}

		Token tmp;
		return (tmp = token_queue.remove(0)) == null ? next : tmp;
	}

	/* Create Dedent Token */
	private Token createDedent() {
		CommonToken dedent = commonToken(JapyParser.DEDENT, "");
		if (last_token != null) {
			dedent.setLine(last_token.getLine());
		}
		return dedent;
	}
 
	/* Create CommonToken */
	private CommonToken commonToken(int type, String text) {
		int stop = this._tokenStartCharIndex - 1;
		int start = text.length() > 0 ? stop - text.length() + 1 : stop;
		CommonToken token = new CommonToken(this._tokenFactorySourcePair, type, 
										Lexer.DEFAULT_TOKEN_CHANNEL, start, stop);
		token.setText(text);
		return token;
	}

	/* Calculate TAB's number in @Param{ whitespace } */
	private int getIndentationCount(String whitespace) {
		int count = 0;
		for (int i = 0, limit = whitespace.length(); i < limit; i++) {
			if (whitespace.charAt(i) == '\t') {
				count += 8 - count % 8;
			} else {
				count++;
			}
		}
		return count;
	}

	private boolean atStartOfInput() {
		return this._tokenStartCharIndex == 0;
	}

}

/*
 * Productions from §3 (Lexical Structure)
 */

literal
	:	IntegerLiteral
	|	FloatingPointLiteral
	|	BooleanLiteral
	|	CharacterLiteral
	|	StringLiteral
	|	NullLiteral
	;

/*
 * Productions from §4 (Types, Values, and Variables)
 */

primitiveType
	:	annotation* numericType
	|	annotation* 'boolean'
	;

numericType
	:	integralType
	|	floatingPointType
	;

integralType
	:	'byte'
	|	'short'
	|	'int'
	|	'long'
	|	'char'
	;

floatingPointType
	:	'float'
	|	'double'
	;

referenceType
	:	classOrInterfaceType
	|	typeVariable
	|	arrayType
	;

/*classOrInterfaceType
	:	classType
	|	interfaceType
	;
*/
classOrInterfaceType
	:	(	classType_lfno_classOrInterfaceType
		|	interfaceType_lfno_classOrInterfaceType
		)
		(	classType_lf_classOrInterfaceType
		|	interfaceType_lf_classOrInterfaceType
		)*
	;

classType
	:	annotation* identifier typeArguments?
	|	classOrInterfaceType '.' annotation* identifier typeArguments?
	;

classType_lf_classOrInterfaceType
	:	'.' annotation* identifier typeArguments?
	;

classType_lfno_classOrInterfaceType
	:	annotation* identifier typeArguments?
	;

interfaceType
	:	classType
	;

interfaceType_lf_classOrInterfaceType
	:	classType_lf_classOrInterfaceType
	;

interfaceType_lfno_classOrInterfaceType
	:	classType_lfno_classOrInterfaceType
	;

typeVariable
	:	annotation* identifier
	;

arrayType
	:	primitiveType dims
	|	classOrInterfaceType dims
	|	typeVariable dims
	;

dims
	:	annotation* '[' ']' (annotation* '[' ']')*
	;

typeParameter
	:	typeParameterModifier* identifier typeBound?
	;

typeParameterModifier
	:	annotation
	;

typeBound
	:	'extends' typeVariable
	|	'extends' classOrInterfaceType additionalBound*
	;

additionalBound
	:	'&' interfaceType
	;

typeArguments
	:	'<' typeArgumentList '>'
	;

typeArgumentList
	:	typeArgument (',' typeArgument)*
	;

typeArgument
	:	referenceType
	|	wildcard
	;

wildcard
	:	annotation* '?' wildcardBounds?
	;

wildcardBounds
	:	'extends' referenceType
	|	'super' referenceType
	;

/*
 * Productions from §6 (Names)
 */

moduleName
	:	identifier
	|	moduleName '.' identifier
	;

packageName
	:	identifier
	|	packageName '.' identifier
	;

typeName
	:	identifier
	|	packageOrTypeName '.' identifier
	;

packageOrTypeName
	:	identifier
	|	packageOrTypeName '.' identifier
	;

expressionName
	:	identifier
	|	ambiguousName '.' identifier
	;

methodName
	:	identifier
	;

ambiguousName
	:	identifier
	|	ambiguousName '.' identifier
	;

/*
 * Productions from §7 (Packages)
 */

compilationUnit
	: 
	(NEWLINE | ordinaryCompilation
	|	modularCompilation)
	;

ordinaryCompilation
	:	packageDeclaration? importDeclaration* typeDeclaration* EOF
	;

modularCompilation
	:	importDeclaration* moduleDeclaration
	;

packageDeclaration
	:	packageModifier* PACKAGE packageName
	;

packageModifier
	:	annotation
	;

importDeclaration
	:	singleTypeImportDeclaration
	|	typeImportOnDemandDeclaration
	|	singleStaticImportDeclaration
	|	staticImportOnDemandDeclaration
	;

singleTypeImportDeclaration
	:	IMPORT typeName
	;

typeImportOnDemandDeclaration
	:	IMPORT packageOrTypeName '.' '*'
	;

singleStaticImportDeclaration
	:	IMPORT STATIC typeName '.' identifier
	;

staticImportOnDemandDeclaration
	:	IMPORT STATIC typeName '.' '*'
	;

typeDeclaration
	:	classDeclaration
	|	interfaceDeclaration
	|	';'
	;

moduleDeclaration
	:	annotation* 'open'? 'module' moduleName '{' moduleDirective* '}'
	;

moduleDirective
	:	'requires' requiresModifier* moduleName ';'
	|	'exports' packageName ('to' moduleName (',' moduleName)*)? ';'
	|	'opens' packageName ('to' moduleName (',' moduleName)*)? ';'
	|	'uses' typeName ';'
	|	'provides' typeName 'with' typeName (',' typeName)* ';'
	;

requiresModifier
	:	'transitive'
	|	'static'
	;

/*
 * Productions from §8 (Classes)
 */

classDeclaration
	:	normalClassDeclaration
	|	enumDeclaration
	;

normalClassDeclaration
	:	classModifier* CLASS identifier typeParameters? superclass? superinterfaces? ':' classBody
	;

classModifier
	:	annotation
	|	PUBLIC
	|	PROTECTED
	|	PRIVATE
	|	ABSTRACT
	|	STATIC
	|	FINAL
	|	STRICTFP
	;

typeParameters
	:	'<' typeParameterList '>'
	;

typeParameterList
	:	typeParameter (',' typeParameter)*
	;

superclass
	:	'>' classType
	;

superinterfaces
	:	'-' interfaceTypeList
	;

interfaceTypeList
	:	interfaceType (',' interfaceType)*
	;

classBody
	:	NEWLINE INDENT classBodyDeclaration+ DEDENT
	;

classBodyDeclaration
	:	classMemberDeclaration
	|	instanceInitializer
	|	staticInitializer
	|	constructorDeclaration
	;

classMemberDeclaration
	:	fieldDeclaration
	|	methodDeclaration
	|	classDeclaration
	|	interfaceDeclaration
	|	';'
	;

fieldDeclaration
	:	fieldModifier* unannType variableDeclaratorList
	;

fieldModifier
	:	annotation
	|	'public'
	|	'protected'
	|	'private'
	|	'static'
	|	'final'
	|	'transient'
	|	'volatile'
	;

variableDeclaratorList
	:	variableDeclarator (',' variableDeclarator)*
	;

variableDeclarator
	:	variableDeclaratorId ('=' variableInitializer)?
	;

variableDeclaratorId
	:	identifier dims?
	;

variableInitializer
	:	expression
	|	arrayInitializer
	;

unannType
	:	unannPrimitiveType
	|	unannReferenceType
	;

unannPrimitiveType
	:	numericType
	|	'boolean'
	;

unannReferenceType
	:	unannClassOrInterfaceType
	|	unannTypeVariable
	|	unannArrayType
	;

/*unannClassOrInterfaceType
	:	unannClassType
	|	unannInterfaceType
	;
*/

unannClassOrInterfaceType
	:	(	unannClassType_lfno_unannClassOrInterfaceType
		|	unannInterfaceType_lfno_unannClassOrInterfaceType
		)
		(	unannClassType_lf_unannClassOrInterfaceType
		|	unannInterfaceType_lf_unannClassOrInterfaceType
		)*
	;

unannClassType
	:	identifier typeArguments?
	|	unannClassOrInterfaceType '.' annotation* identifier typeArguments?
	;

unannClassType_lf_unannClassOrInterfaceType
	:	'.' annotation* identifier typeArguments?
	;

unannClassType_lfno_unannClassOrInterfaceType
	:	identifier typeArguments?
	;

unannInterfaceType
	:	unannClassType
	;

unannInterfaceType_lf_unannClassOrInterfaceType
	:	unannClassType_lf_unannClassOrInterfaceType
	;

unannInterfaceType_lfno_unannClassOrInterfaceType
	:	unannClassType_lfno_unannClassOrInterfaceType
	;

unannTypeVariable
	:	identifier
	;

unannArrayType
	:	unannPrimitiveType dims
	|	unannClassOrInterfaceType dims
	|	unannTypeVariable dims
	;

methodDeclaration
	:	methodModifier* methodHeader ':' methodBody
	;

methodModifier
	:	annotation
	|	PUBLIC
	|	PROTECTED
	|	PRIVATE
	|	ABSTRACT
	|	STATIC
	|	FINAL
	|	SYNCHRONIZED
	|	NATIVE
	|	STRICTFP
	;

methodHeader
	:	result methodDeclarator throws_?
	|	typeParameters annotation* result methodDeclarator throws_?
	;

result
	:	unannType
	|	VOID
	;

methodDeclarator
	:	identifier '(' formalParameterList? ')' dims?
	;

formalParameterList
	:	formalParameters ',' lastFormalParameter
	|	lastFormalParameter
	|	receiverParameter
	;

formalParameters
	:	formalParameter (',' formalParameter)*
	|	receiverParameter (',' formalParameter)*
	;

formalParameter
	:	variableModifier* unannType variableDeclaratorId
	;

variableModifier
	:	annotation
	|	FINAL
	;

lastFormalParameter
	:	variableModifier* unannType annotation* '...' variableDeclaratorId
	|	formalParameter
	;

receiverParameter
	:	annotation* unannType (identifier '.')? THIS
	;

throws_
	:	THROWS exceptionTypeList
	;

exceptionTypeList
	:	exceptionType (',' exceptionType)*
	;

exceptionType
	:	classType
	|	typeVariable
	;

methodBody
	:	statement
	|	NEWLINE INDENT blockStatements DEDENT
	;

instanceInitializer
	:	blockStatements
	;

staticInitializer
	:	STATIC ':' suite
	;

constructorDeclaration
	:	constructorModifier* constructorDeclarator throws_? ':' constructorBody
	;

constructorModifier
	:	annotation
	|	PUBLIC
	|	PROTECTED
	|	PRIVATE
	;

constructorDeclarator
	:	typeParameters? simpleTypeName '(' formalParameterList? ')'
	;

simpleTypeName
	:	identifier
	;

constructorBody
	:	statement
	|	NEWLINE INDENT explicitConstructorInvocation? blockStatements? DEDENT
	;

explicitConstructorInvocation
	:	typeArguments? THIS '(' argumentList? ')' ';'
	|	typeArguments? SUPER '(' argumentList? ')' ';'
	|	expressionName '.' typeArguments? SUPER '(' argumentList? ')' ';'
	|	primary '.' typeArguments? SUPER '(' argumentList? ')' ';'
	;

enumDeclaration
	:	classModifier* ENUM identifier superinterfaces? ':' enumBody
	;

enumBody
	:	NEWLINE INDENT enumConstantList? ','? enumBodyDeclarations? DEDENT
	;

enumConstantList
	:	enumConstant (',' enumConstant)*
	;

enumConstant
	:	enumConstantModifier* identifier ('(' argumentList? ')')? ':' classBody?
	;

enumConstantModifier
	:	annotation
	;

enumBodyDeclarations
	:	';' classBodyDeclaration*
	;

/*
 * Productions from §9 (Interfaces)
 */

interfaceDeclaration
	:	normalInterfaceDeclaration
	|	annotationTypeDeclaration
	;

normalInterfaceDeclaration
	:	interfaceModifier* INTERFACE identifier typeParameters? extendsInterfaces? ':' interfaceBody
	;

interfaceModifier
	:	annotation
	|	PUBLIC
	|	PROTECTED
	|	PRIVATE
	|	ABSTRACT
	|	STATIC
	|	STRICTFP
	;

extendsInterfaces
	:	'>' interfaceTypeList
	;

interfaceBody
	:	NEWLINE INDENT interfaceMemberDeclaration* DEDENT
	;

interfaceMemberDeclaration
	:	constantDeclaration
	|	interfaceMethodDeclaration
	|	classDeclaration
	|	interfaceDeclaration
	;

constantDeclaration
	:	constantModifier* unannType variableDeclaratorList
	;

constantModifier
	:	annotation
	|	PUBLIC
	|	STATIC
	|	FINAL
	;

interfaceMethodDeclaration
	:	interfaceMethodModifier* methodHeader ':' methodBody
	;

interfaceMethodModifier
	:	annotation
	|	PUBLIC
	|	PRIVATE//Introduced in Java 9
	|	ABSTRACT
	|	DEFAULT
	|	STATIC
	|	STRICTFP
	;

annotationTypeDeclaration
	:	interfaceModifier* AT INTERFACE identifier ':' annotationTypeBody
	;

annotationTypeBody
	:	NEWLINE INDENT annotationTypeMemberDeclaration* DEDENT
	;

annotationTypeMemberDeclaration
	:	annotationTypeElementDeclaration
	|	constantDeclaration
	|	classDeclaration
	|	interfaceDeclaration
	;

annotationTypeElementDeclaration
	:	annotationTypeElementModifier* unannType identifier '(' ')' dims? defaultValue?
	;

annotationTypeElementModifier
	:	annotation
	|	PUBLIC
	|	ABSTRACT
	;

defaultValue
	:	DEFAULT elementValue
	;

annotation
	:	normalAnnotation
	|	markerAnnotation
	|	singleElementAnnotation
	;

normalAnnotation
	:	AT typeName '(' elementValuePairList? ')'
	;

elementValuePairList
	:	elementValuePair (',' elementValuePair)*
	;

elementValuePair
	:	identifier '=' elementValue
	;

elementValue
	:	conditionalExpression
	|	elementValueArrayInitializer
	|	annotation
	;

elementValueArrayInitializer
	:	'{' elementValueList? ','? '}'
	;

elementValueList
	:	elementValue (',' elementValue)*
	;

markerAnnotation
	:	AT typeName
	;

singleElementAnnotation
	:	AT typeName '(' elementValue ')'
	;

/*
 * Productions from §10 (Arrays)
 */

arrayInitializer
	:	'{' variableInitializerList? ','? '}'
	;

variableInitializerList
	:	variableInitializer (',' variableInitializer)*
	;

/*
 * Productions from §14 (Blocks and Statements)
 */

blockStatements
	:	blockStatement+
	;

blockStatement
	:	localVariableDeclarationStatement
	|	classDeclaration
	|	statement
	;

localVariableDeclarationStatement
	:	localVariableDeclaration
	;

localVariableDeclaration
	:	variableModifier* unannType variableDeclaratorList
	;

suite
	:	(simpleStatement | NEWLINE INDENT statement+ DEDENT)
	;

simpleStatement
	:	smallStatement (';' smallStatement)* ';'?
	;

smallStatement
	:	passStatement
	|	expressionStatement
	|	assertStatement
	|	doStatement
	|	breakStatement
	|	continueStatement
	|	returnStatement
	|	synchronizedStatement
	|	throwStatement
	|	tryStatement
	|	ifStatement
	|	whileStatement
	|	forStatement
	;

statement
	:	passStatement
	|	expressionStatement
	|	assertStatement
	|	doStatement
	|	breakStatement
	|	continueStatement
	|	returnStatement
	|	synchronizedStatement
	|	throwStatement
	|	tryStatement
	|	ifStatement
	|	whileStatement
	|	forStatement
	|	switchStatement
	|	labeledStatement
	;

passStatement
	:	PASS
	;

labeledStatement
	:	identifier ':' statement
	;

expressionStatement
	:	statementExpression
	;

statementExpression
	:	assignment
	|	preIncrementExpression
	|	preDecrementExpression
	|	postIncrementExpression
	|	postDecrementExpression
	|	methodInvocation
	|	classInstanceCreationExpression
	;

assertStatement
	:	ASSERT expression
	|	ASSERT expression ':' expression
	;

switchStatement
	:	SWITCH expression ':' switchBlock
	;

switchBlock
	:	NEWLINE INDENT switchBlockStatementGroup* switchLabel* DEDENT
	;

switchBlockStatementGroup
	:	NEWLINE INDENT switchLabels blockStatements DEDENT
	;

switchLabels
	:	switchLabel+
	;

switchLabel
	:	NEWLINE CASE constantExpression ':'
	|	NEWLINE CASE enumConstantName ':'
	|	NEWLINE DEFAULT ':'
	;

enumConstantName
	:	identifier
	;

ifStatement
	:	IF expression ':' suite (ELSE IF expression ':' suite)* (ELSE ':' suite)?
	;

whileStatement
	:	WHILE expression ':' suite
	;

doStatement
	:	DO WHILE expression expression ':' suite
	;

forStatement
	:	basicForStatement
	|	enhancedForStatement
	;

basicForStatement
	: FOR forInit? ';' expression? ';' forUpdate? ':' suite
	;

forInit
	:	statementExpressionList
	|	localVariableDeclaration
	;

forUpdate
	:	statementExpressionList
	;

statementExpressionList
	:	statementExpression (',' statementExpression)*
	;

enhancedForStatement
	:	FOR variableModifier* unannType variableDeclaratorId IN expression ':' suite
	;

breakStatement
	:	BREAK identifier?
	;

continueStatement
	:	CONTINUE identifier?
	;

returnStatement
	:	RETURN expression?
	;

throwStatement
	:	THROW expression
	;

synchronizedStatement
	:	SYNCHRONIZED expression ':' suite
	;

tryStatement
	:	TRY ':' suite catches
	|	TRY ':' suite catches? finally_
	|	tryWithResourcesStatement
	;

catches
	:	catchClause+
	;

catchClause
	:	CATCH catchFormalParameter ':' suite
	;

catchFormalParameter
	:	variableModifier* catchType variableDeclaratorId
	;

catchType
	:	unannClassType ('|' classType)*
	;

finally_
	:	FINALLY ':' suite
	;

tryWithResourcesStatement
	:	TRY resourceSpecification ':' suite catches? finally_?
	;

resourceSpecification
	:	'(' resourceList ';'? ')'
	;

resourceList
	:	resource (';' resource)*
	;

resource
	:	variableModifier* unannType variableDeclaratorId '=' expression
	|	variableAccess//Introduced in Java 9
	;

variableAccess
	:	expressionName
	|	fieldAccess
	;

/*
 * Productions from §15 (Expressions)
 */

/*primary
	:	primaryNoNewArray
	|	arrayCreationExpression
	;
*/

primary
	:	(	primaryNoNewArray_lfno_primary
		|	arrayCreationExpression
		)
		(	primaryNoNewArray_lf_primary
		)*
	;

primaryNoNewArray
	:	literal
	|	classLiteral
	|	THIS
	|	typeName '.' THIS
	|	'(' expression ')'
	|	classInstanceCreationExpression
	|	fieldAccess
	|	arrayAccess
	|	methodInvocation
	|	methodReference
	;

primaryNoNewArray_lf_arrayAccess
	:
	;

primaryNoNewArray_lfno_arrayAccess
	:	literal
	|	typeName ('[' ']')* '.' CLASS
	|	VOID '.' CLASS
	|	THIS
	|	typeName '.' THIS
	|	'(' expression ')'
	|	classInstanceCreationExpression
	|	fieldAccess
	|	methodInvocation
	|	methodReference
	;

primaryNoNewArray_lf_primary
	:	classInstanceCreationExpression_lf_primary
	|	fieldAccess_lf_primary
	|	arrayAccess_lf_primary
	|	methodInvocation_lf_primary
	|	methodReference_lf_primary
	;

primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
	:
	;

primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
	:	classInstanceCreationExpression_lf_primary
	|	fieldAccess_lf_primary
	|	methodInvocation_lf_primary
	|	methodReference_lf_primary
	;

primaryNoNewArray_lfno_primary
	:	literal
	|	typeName ('[' ']')* '.' CLASS
	|	unannPrimitiveType ('[' ']')* '.' CLASS
	|	VOID '.' CLASS
	|	THIS
	|	typeName '.' THIS
	|	'(' expression ')'
	|	classInstanceCreationExpression_lfno_primary
	|	fieldAccess_lfno_primary
	|	arrayAccess_lfno_primary
	|	methodInvocation_lfno_primary
	|	methodReference_lfno_primary
	;

primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
	:
	;

primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
	:	literal
	|	typeName ('[' ']')* '.' CLASS
	|	unannPrimitiveType ('[' ']')* '.' CLASS
	|	VOID '.' CLASS
	|	THIS
	|	typeName '.' THIS
	|	'(' expression ')'
	|	classInstanceCreationExpression_lfno_primary
	|	fieldAccess_lfno_primary
	|	methodInvocation_lfno_primary
	|	methodReference_lfno_primary
	;

classLiteral
	:	(typeName | numericType | BOOLEAN) ('[' ']')* '.' CLASS
	|	VOID '.' CLASS
	;

classInstanceCreationExpression
	:	NEW typeArguments? annotation* identifier ('.' annotation* identifier)* typeArgumentsOrDiamond? '(' argumentList? ')' ':' classBody?
	|	expressionName '.' NEW typeArguments? annotation* identifier typeArgumentsOrDiamond? '(' argumentList? ')' ':' classBody?
	|	primary '.' NEW typeArguments? annotation* identifier typeArgumentsOrDiamond? '(' argumentList? ')' ':' classBody?
	;

classInstanceCreationExpression_lf_primary
	:	'.' NEW typeArguments? annotation* identifier typeArgumentsOrDiamond? '(' argumentList? ')' ':' classBody?
	;

classInstanceCreationExpression_lfno_primary
	:	NEW typeArguments? annotation* identifier ('.' annotation* identifier)* typeArgumentsOrDiamond? '(' argumentList? ')' ':' classBody?
	|	expressionName '.' NEW typeArguments? annotation* identifier typeArgumentsOrDiamond? '(' argumentList? ')' ':' classBody?
	;

typeArgumentsOrDiamond
	:	typeArguments
	|	'<' '>'
	;

fieldAccess
	:	primary '.' identifier
	|	SUPER '.' identifier
	|	typeName '.' SUPER '.' identifier
	;

fieldAccess_lf_primary
	:	'.' identifier
	;

fieldAccess_lfno_primary
	:	SUPER '.' identifier
	|	typeName '.' SUPER '.' identifier
	;

/*arrayAccess
	:	expressionName '[' expression ']'
	|	primaryNoNewArray '[' expression ']'
	;
*/

arrayAccess
	:	(	expressionName '[' expression ']'
		|	primaryNoNewArray_lfno_arrayAccess '[' expression ']'
		)
		(	primaryNoNewArray_lf_arrayAccess '[' expression ']'
		)*
	;

arrayAccess_lf_primary
	:	(	primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary '[' expression ']'
		)
		(	primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary '[' expression ']'
		)*
	;

arrayAccess_lfno_primary
	:	(	expressionName '[' expression ']'
		|	primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary '[' expression ']'
		)
		(	primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary '[' expression ']'
		)*
	;


methodInvocation
	:	methodName '(' argumentList? ')'
	|	typeName '.' typeArguments? identifier '(' argumentList? ')'
	|	expressionName '.' typeArguments? identifier '(' argumentList? ')'
	|	primary '.' typeArguments? identifier '(' argumentList? ')'
	|	SUPER '.' typeArguments? identifier '(' argumentList? ')'
	|	typeName '.' SUPER '.' typeArguments? identifier '(' argumentList? ')'
	;

methodInvocation_lf_primary
	:	'.' typeArguments? identifier '(' argumentList? ')'
	;

methodInvocation_lfno_primary
	:	methodName '(' argumentList? ')'
	|	typeName '.' typeArguments? identifier '(' argumentList? ')'
	|	expressionName '.' typeArguments? identifier '(' argumentList? ')'
	|	SUPER '.' typeArguments? identifier '(' argumentList? ')'
	|	typeName '.' SUPER '.' typeArguments? identifier '(' argumentList? ')'
	;

argumentList
	:	expression (',' expression)*
	;

methodReference
	:	expressionName '::' typeArguments? identifier
	|	referenceType '::' typeArguments? identifier
	|	primary '::' typeArguments? identifier
	|	SUPER '::' typeArguments? identifier
	|	typeName '.' SUPER '::' typeArguments? identifier
	|	classType '::' typeArguments? NEW
	|	arrayType '::' NEW
	;

methodReference_lf_primary
	:	'::' typeArguments? identifier
	;

methodReference_lfno_primary
	:	expressionName '::' typeArguments? identifier
	|	referenceType '::' typeArguments? identifier
	|	SUPER '::' typeArguments? identifier
	|	typeName '.' SUPER '::' typeArguments? identifier
	|	classType '::' typeArguments? NEW
	|	arrayType '::' NEW
	;

arrayCreationExpression
	:	NEW primitiveType dimExprs dims?
	|	NEW classOrInterfaceType dimExprs dims?
	|	NEW primitiveType dims arrayInitializer
	|	NEW classOrInterfaceType dims arrayInitializer
	;

dimExprs
	:	dimExpr+
	;

dimExpr
	:	annotation* '[' expression ']'
	;

constantExpression
	:	expression
	;

expression
	:	lambdaExpression
	|	assignmentExpression
	;

lambdaExpression
	:	lambdaParameters '->' lambdaBody
	;

lambdaParameters
	:	identifier
	|	'(' formalParameterList? ')'
	|	'(' inferredFormalParameterList ')'
	;

inferredFormalParameterList
	:	identifier (',' identifier)*
	;

lambdaBody
	:	expression
	|	'{' blockStatements '}'
	;

assignmentExpression
	:	conditionalExpression
	|	assignment
	;

assignment
	:	leftHandSide assignmentOperator expression
	;

leftHandSide
	:	expressionName
	|	fieldAccess
	|	arrayAccess
	;

assignmentOperator
	:	'='
	|	'*='
	|	'/='
	|	'%='
	|	'+='
	|	'-='
	|	'<<='
	|	'>>='
	|	'>>>='
	|	'&='
	|	'^='
	|	'|='
	;

conditionalExpression
	:	conditionalOrExpression
	|	conditionalOrExpression '?' expression ':' (conditionalExpression|lambdaExpression)
	;

conditionalOrExpression
	:	conditionalAndExpression
	|	conditionalOrExpression '||' conditionalAndExpression
	;

conditionalAndExpression
	:	inclusiveOrExpression
	|	conditionalAndExpression '&&' inclusiveOrExpression
	;

inclusiveOrExpression
	:	exclusiveOrExpression
	|	inclusiveOrExpression '|' exclusiveOrExpression
	;

exclusiveOrExpression
	:	andExpression
	|	exclusiveOrExpression '^' andExpression
	;

andExpression
	:	equalityExpression
	|	andExpression '&' equalityExpression
	;

equalityExpression
	:	relationalExpression
	|	equalityExpression '==' relationalExpression
	|	equalityExpression '!=' relationalExpression
	;

relationalExpression
	:	shiftExpression
	|	relationalExpression '<' shiftExpression
	|	relationalExpression '>' shiftExpression
	|	relationalExpression '<=' shiftExpression
	|	relationalExpression '>=' shiftExpression
	|	relationalExpression INSTANCEOF referenceType
	;

shiftExpression
	:	additiveExpression
	|	shiftExpression '<' '<' additiveExpression
	|	shiftExpression '>' '>' additiveExpression
	|	shiftExpression '>' '>' '>' additiveExpression
	;

additiveExpression
	:	multiplicativeExpression
	|	additiveExpression '+' multiplicativeExpression
	|	additiveExpression '-' multiplicativeExpression
	;

multiplicativeExpression
	:	unaryExpression
	|	multiplicativeExpression '*' unaryExpression
	|	multiplicativeExpression '/' unaryExpression
	|	multiplicativeExpression '%' unaryExpression
	;

unaryExpression
	:	preIncrementExpression
	|	preDecrementExpression
	|	'+' unaryExpression
	|	'-' unaryExpression
	|	unaryExpressionNotPlusMinus
	;

preIncrementExpression
	:	'++' unaryExpression
	;

preDecrementExpression
	:	'--' unaryExpression
	;

unaryExpressionNotPlusMinus
	:	primary
	|	expressionName
	|	postfixExpression
	|	'~' unaryExpression
	|	'!' unaryExpression
	|	castExpression
	;

/*postfixExpression
	:	primary
	|	expressionName
	|	postIncrementExpression
	|	postDecrementExpression
	;
*/

postfixExpression
	:	postIncrementExpression_lf_postfixExpression
		|	postDecrementExpression_lf_postfixExpression
	;

postIncrementExpression
	:	(	primary
		|	expressionName )
		postfixExpression* '++'
	;

postIncrementExpression_lf_postfixExpression
	:	'++'
	;

postDecrementExpression
	:	(	primary
		|	expressionName )
		postfixExpression* '--'
	;

postDecrementExpression_lf_postfixExpression
	:	'--'
	;

castExpression
	:	'(' primitiveType ')' unaryExpression
	|	'(' referenceType additionalBound* ')' unaryExpressionNotPlusMinus
	|	'(' referenceType additionalBound* ')' lambdaExpression
	;

// LEXER

identifier : Identifier | 'to' | 'module' | 'open' | 'with' | 'provides' | 'uses' | 'opens' | 'requires' | 'exports';

// §3.9 Keywords

ABSTRACT : 'abstract';
ASSERT : 'assert';
BOOLEAN : 'boolean';
BREAK : 'break';
BYTE : 'byte';
CASE : 'case';
CATCH : 'catch';
CHAR : 'char';
CLASS : 'class';
CONST : 'const';
CONTINUE : 'continue';
DEFAULT : 'default';
DO : 'do';
DOUBLE : 'double';
ELSE : 'else';
ENUM : 'enum';
// EXTENDS : '>';
FINAL : 'final';
FINALLY : 'finally';
FLOAT : 'float';
FOR : 'for';
IF : 'if';
GOTO : 'goto';
// IMPLEMENTS : '-';
IMPORT : 'import';
INSTANCEOF : 'instanceof';
IN : 'in';
INT : 'int';
INTERFACE : 'interface';
LONG : 'long';
NATIVE : 'native';
NEW : 'new';
PACKAGE : 'package';
PASS: 'pass';
PRIVATE : 'private';
PROTECTED : 'protected';
PUBLIC : 'public';
RETURN : 'return';
SHORT : 'short';
STATIC : 'static';
STRICTFP : 'strictfp';
SUPER : 'super';
SWITCH : 'switch';
SYNCHRONIZED : 'synchronized';
THIS : 'this';
THROW : 'throw';
THROWS : 'throws';
TRANSIENT : 'transient';
TRY : 'try';
VOID : 'void';
VOLATILE : 'volatile';
WHILE : 'while';
UNDER_SCORE : '_';//Introduced in Java 9

NEWLINE
	: ( {this.atStartOfInput()}? SPACES
	| ('\r'? '\n' | '\r') SPACES? )
	{
		String text = this.getText();
		int next = this._input.LA(1);

		if (this.opened > 0
			|| next == '/' && _input.LA(2) == '/' /* '//' */
			|| next == '/' && _input.LA(2) == '*' /* '/*' */
			|| next == 13 /* '\r' */
			|| next == 10 /* '\n' */)
		{
			// If we're inside a list or on a blank line, ignore all indents, dedents and line breaks.
			this.skip();
		} else {
			String newLine = text.replaceAll("[^\r\n]+", ""); // exclude SPACES
			String spaces = text.replaceAll("[\r\n]+", ""); // exclude '\r' '\n'

			int indent = this.getIndentationCount(spaces);
			int previous = !this.indents.isEmpty() ?
							this.indents.get(this.indents.size() - 1) : 0;

			if (indent == previous) {
				// skip indents of the same size as the present indent-size
				this.skip();
			} else if (indent > previous) {
				// emit Indent

			this.emit(this.commonToken(JapyParser.NEWLINE, newLine));
				this.indents.add(indent);
				this.emit(this.commonToken(JapyParser.INDENT, spaces));
			} else {
				// Possibly emit more than 1 DEDENT token.
				while (!this.indents.isEmpty() && this.indents.get(indents.size() - 1) > indent) {
					this.emit(this.createDedent());
					this.indents.remove(this.indents.size() - 1);
				}
			}
		}
	}
	;

// §3.10.1 Integer Literals

IntegerLiteral
	:	DecimalIntegerLiteral
	|	HexIntegerLiteral
	|	OctalIntegerLiteral
	|	BinaryIntegerLiteral
	;

fragment DecimalIntegerLiteral
	:	DecimalNumeral IntegerTypeSuffix?
	;

fragment HexIntegerLiteral
	:	HexNumeral IntegerTypeSuffix?
	;

fragment OctalIntegerLiteral
	:	OctalNumeral IntegerTypeSuffix?
	;

fragment BinaryIntegerLiteral
	:	BinaryNumeral IntegerTypeSuffix?
	;

fragment IntegerTypeSuffix
	:	[lL]
	;

fragment DecimalNumeral
	:	'0'
	|	NonZeroDigit (Digits? | Underscores Digits)
	;

fragment Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

fragment Digit
	:	'0'
	|	NonZeroDigit
	;

fragment NonZeroDigit
	:	[1-9]
	;

fragment DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

fragment DigitOrUnderscore
	:	Digit
	|	'_'
	;

fragment Underscores
	:	'_'+
	;

fragment HexNumeral
	:	'0' [xX] HexDigits
	;

fragment HexDigits
	:	HexDigit (HexDigitsAndUnderscores? HexDigit)?
	;

fragment HexDigit
	:	[0-9a-fA-F]
	;

fragment HexDigitsAndUnderscores
	:	HexDigitOrUnderscore+
	;

fragment HexDigitOrUnderscore
	:	HexDigit
	|	'_'
	;

fragment OctalNumeral
	:	'0' Underscores? OctalDigits
	;

fragment OctalDigits
	:	OctalDigit (OctalDigitsAndUnderscores? OctalDigit)?
	;

fragment OctalDigit
	:	[0-7]
	;

fragment OctalDigitsAndUnderscores
	:	OctalDigitOrUnderscore+
	;

fragment OctalDigitOrUnderscore
	:	OctalDigit
	|	'_'
	;

fragment BinaryNumeral
	:	'0' [bB] BinaryDigits
	;

fragment BinaryDigits
	:	BinaryDigit (BinaryDigitsAndUnderscores? BinaryDigit)?
	;

fragment BinaryDigit
	:	[01]
	;

fragment BinaryDigitsAndUnderscores
	:	BinaryDigitOrUnderscore+
	;

fragment BinaryDigitOrUnderscore
	:	BinaryDigit
	|	'_'
	;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
	:	DecimalFloatingPointLiteral
	|	HexadecimalFloatingPointLiteral
	;

fragment DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart? FloatTypeSuffix?
	|	'.' Digits ExponentPart? FloatTypeSuffix?
	|	Digits ExponentPart FloatTypeSuffix?
	|	Digits FloatTypeSuffix
	;

fragment ExponentPart
	:	ExponentIndicator SignedInteger
	;

fragment ExponentIndicator
	:	[eE]
	;

fragment SignedInteger
	:	Sign? Digits
	;

fragment Sign
	:	[+-]
	;

fragment FloatTypeSuffix
	:	[fFdD]
	;

fragment HexadecimalFloatingPointLiteral
	:	HexSignificand BinaryExponent FloatTypeSuffix?
	;

fragment HexSignificand
	:	HexNumeral '.'?
	|	'0' [xX] HexDigits? '.' HexDigits
	;

fragment BinaryExponent
	:	BinaryExponentIndicator SignedInteger
	;

fragment BinaryExponentIndicator
	:	[pP]
	;

// §3.10.3 Boolean Literals

BooleanLiteral
	:	'true'
	|	'false'
	;

// §3.10.4 Character Literals

CharacterLiteral
	:	'\'' SingleCharacter '\''
	|	'\'' EscapeSequence '\''
	;

fragment SingleCharacter
	:	~['\\\r\n]
	;

// §3.10.5 String Literals

StringLiteral
	:	'"' StringCharacters? '"'
	;

fragment StringCharacters
	:	StringCharacter+
	;

fragment StringCharacter
	:	~["\\\r\n]
	|	EscapeSequence
	;

// §3.10.6 Escape Sequences for Character and String Literals

fragment EscapeSequence
	:	'\\' [btnfr"'\\]
	|	OctalEscape
    |   UnicodeEscape // This is not in the spec but prevents having to preprocess the input
	;

fragment OctalEscape
	:	'\\' OctalDigit
	|	'\\' OctalDigit OctalDigit
	|	'\\' ZeroToThree OctalDigit OctalDigit
	;

fragment ZeroToThree
	:	[0-3]
	;

// This is not in the spec but prevents having to preprocess the input
fragment UnicodeEscape
    :   '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;

// §3.10.7 The Null Literal

NullLiteral
	:	'null'
	;

// §3.11 Separators

LPAREN : '(' {this.opened++;};
RPAREN : ')' {this.opened--;};
LBRACE : '{' {this.opened++;};
RBRACE : '}' {this.opened--;};
LBRACK : '[' {this.opened++;};
RBRACK : ']' {this.opened--;};
SEMI : ';';
COMMA : ',';
DOT : '.';
ELLIPSIS : '...';
AT : '@';
COLONCOLON : '::';


// §3.12 Operators

ASSIGN : '=';
GT : '>';
LT : '<';
BANG : '!';
TILDE : '~';
QUESTION : '?';
COLON : ':';
ARROW : '->';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
AND : '&&';
OR : '||';
INC : '++';
DEC : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
BITAND : '&';
BITOR : '|';
CARET : '^';
MOD : '%';
//LSHIFT : '<<';
//RSHIFT : '>>';
//URSHIFT : '>>>';

ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
AND_ASSIGN : '&=';
OR_ASSIGN : '|=';
XOR_ASSIGN : '^=';
MOD_ASSIGN : '%=';
LSHIFT_ASSIGN : '<<=';
RSHIFT_ASSIGN : '>>=';
URSHIFT_ASSIGN : '>>>=';

// §3.8 Identifiers (must appear after all keywords in the grammar)

Identifier
	:	JavaLetter JavaLetterOrDigit*
	;

fragment JavaLetter
	:	[a-zA-Z$_] // these are the "java letters" below 0x7F
	|	// covers all characters above 0x7F which are not a surrogate
		~[\u0000-\u007F\uD800-\uDBFF]
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;

fragment JavaLetterOrDigit
	:	[a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
	|	// covers all characters above 0x7F which are not a surrogate
		~[\u0000-\u007F\uD800-\uDBFF]
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;

//
// Whitespace (NOTE: exclude TAB) and comments
//

SKIP_
	:	( SPACES | COMMENT | LINE_COMMENT | LINE_JOINING ) -> skip
	;

fragment SPACES
	:	[ \t]+
	;

fragment COMMENT
    :   '/*' .*? '*/'
    ;

fragment LINE_COMMENT
    :   '//' ~[\r\n]*
    ;

fragment LINE_JOINING
	:	'\\' SPACES? ( '\r'? '\n' | '\r' )
	;