package org.luncert.grammar;
// Generated from Japy.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JapyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ABSTRACT=12, ASSERT=13, BOOLEAN=14, BREAK=15, BYTE=16, 
		CASE=17, CATCH=18, CHAR=19, CLASS=20, CONST=21, CONTINUE=22, DEFAULT=23, 
		DO=24, DOUBLE=25, ELSE=26, ENUM=27, FINAL=28, FINALLY=29, FLOAT=30, FOR=31, 
		IF=32, GOTO=33, IMPORT=34, INSTANCEOF=35, IN=36, INT=37, INTERFACE=38, 
		LONG=39, NATIVE=40, NEW=41, PACKAGE=42, PASS=43, PRIVATE=44, PROTECTED=45, 
		PUBLIC=46, RETURN=47, SHORT=48, STATIC=49, STRICTFP=50, SUPER=51, SWITCH=52, 
		SYNCHRONIZED=53, THIS=54, THROW=55, THROWS=56, TRANSIENT=57, TRY=58, VOID=59, 
		VOLATILE=60, WHILE=61, UNDER_SCORE=62, NEWLINE=63, IntegerLiteral=64, 
		FloatingPointLiteral=65, BooleanLiteral=66, CharacterLiteral=67, StringLiteral=68, 
		NullLiteral=69, LPAREN=70, RPAREN=71, LBRACE=72, RBRACE=73, LBRACK=74, 
		RBRACK=75, SEMI=76, COMMA=77, DOT=78, ELLIPSIS=79, AT=80, COLONCOLON=81, 
		ASSIGN=82, GT=83, LT=84, BANG=85, TILDE=86, QUESTION=87, COLON=88, ARROW=89, 
		EQUAL=90, LE=91, GE=92, NOTEQUAL=93, AND=94, OR=95, INC=96, DEC=97, ADD=98, 
		SUB=99, MUL=100, DIV=101, BITAND=102, BITOR=103, CARET=104, MOD=105, ADD_ASSIGN=106, 
		SUB_ASSIGN=107, MUL_ASSIGN=108, DIV_ASSIGN=109, AND_ASSIGN=110, OR_ASSIGN=111, 
		XOR_ASSIGN=112, MOD_ASSIGN=113, LSHIFT_ASSIGN=114, RSHIFT_ASSIGN=115, 
		URSHIFT_ASSIGN=116, Identifier=117, WS=118, COMMENT=119, LINE_COMMENT=120, 
		INDENT=121, DEDENT=122;
	public static final int
		RULE_literal = 0, RULE_primitiveType = 1, RULE_numericType = 2, RULE_integralType = 3, 
		RULE_floatingPointType = 4, RULE_referenceType = 5, RULE_classOrInterfaceType = 6, 
		RULE_classType = 7, RULE_classType_lf_classOrInterfaceType = 8, RULE_classType_lfno_classOrInterfaceType = 9, 
		RULE_interfaceType = 10, RULE_interfaceType_lf_classOrInterfaceType = 11, 
		RULE_interfaceType_lfno_classOrInterfaceType = 12, RULE_typeVariable = 13, 
		RULE_arrayType = 14, RULE_dims = 15, RULE_typeParameter = 16, RULE_typeParameterModifier = 17, 
		RULE_typeBound = 18, RULE_additionalBound = 19, RULE_typeArguments = 20, 
		RULE_typeArgumentList = 21, RULE_typeArgument = 22, RULE_wildcard = 23, 
		RULE_wildcardBounds = 24, RULE_moduleName = 25, RULE_packageName = 26, 
		RULE_typeName = 27, RULE_packageOrTypeName = 28, RULE_expressionName = 29, 
		RULE_methodName = 30, RULE_ambiguousName = 31, RULE_compilationUnit = 32, 
		RULE_ordinaryCompilation = 33, RULE_modularCompilation = 34, RULE_packageDeclaration = 35, 
		RULE_packageModifier = 36, RULE_importDeclaration = 37, RULE_singleTypeImportDeclaration = 38, 
		RULE_typeImportOnDemandDeclaration = 39, RULE_singleStaticImportDeclaration = 40, 
		RULE_staticImportOnDemandDeclaration = 41, RULE_typeDeclaration = 42, 
		RULE_moduleDeclaration = 43, RULE_moduleDirective = 44, RULE_requiresModifier = 45, 
		RULE_classDeclaration = 46, RULE_normalClassDeclaration = 47, RULE_classModifier = 48, 
		RULE_typeParameters = 49, RULE_typeParameterList = 50, RULE_superclass = 51, 
		RULE_superinterfaces = 52, RULE_interfaceTypeList = 53, RULE_classBody = 54, 
		RULE_classBodyDeclaration = 55, RULE_classMemberDeclaration = 56, RULE_fieldDeclaration = 57, 
		RULE_fieldModifier = 58, RULE_variableDeclaratorList = 59, RULE_variableDeclarator = 60, 
		RULE_variableDeclaratorId = 61, RULE_variableInitializer = 62, RULE_unannType = 63, 
		RULE_unannPrimitiveType = 64, RULE_unannReferenceType = 65, RULE_unannClassOrInterfaceType = 66, 
		RULE_unannClassType = 67, RULE_unannClassType_lf_unannClassOrInterfaceType = 68, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 69, RULE_unannInterfaceType = 70, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 71, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 72, 
		RULE_unannTypeVariable = 73, RULE_unannArrayType = 74, RULE_methodDeclaration = 75, 
		RULE_methodModifier = 76, RULE_methodHeader = 77, RULE_result = 78, RULE_methodDeclarator = 79, 
		RULE_formalParameterList = 80, RULE_formalParameters = 81, RULE_formalParameter = 82, 
		RULE_variableModifier = 83, RULE_lastFormalParameter = 84, RULE_receiverParameter = 85, 
		RULE_throws_ = 86, RULE_exceptionTypeList = 87, RULE_exceptionType = 88, 
		RULE_methodBody = 89, RULE_instanceInitializer = 90, RULE_staticInitializer = 91, 
		RULE_constructorDeclaration = 92, RULE_constructorModifier = 93, RULE_constructorDeclarator = 94, 
		RULE_simpleTypeName = 95, RULE_constructorBody = 96, RULE_explicitConstructorInvocation = 97, 
		RULE_enumDeclaration = 98, RULE_enumBody = 99, RULE_enumConstantList = 100, 
		RULE_enumConstant = 101, RULE_enumConstantModifier = 102, RULE_enumBodyDeclarations = 103, 
		RULE_interfaceDeclaration = 104, RULE_normalInterfaceDeclaration = 105, 
		RULE_interfaceModifier = 106, RULE_extendsInterfaces = 107, RULE_interfaceBody = 108, 
		RULE_interfaceMemberDeclaration = 109, RULE_constantDeclaration = 110, 
		RULE_constantModifier = 111, RULE_interfaceMethodDeclaration = 112, RULE_interfaceMethodModifier = 113, 
		RULE_annotationTypeDeclaration = 114, RULE_annotationTypeBody = 115, RULE_annotationTypeMemberDeclaration = 116, 
		RULE_annotationTypeElementDeclaration = 117, RULE_annotationTypeElementModifier = 118, 
		RULE_defaultValue = 119, RULE_annotation = 120, RULE_normalAnnotation = 121, 
		RULE_elementValuePairList = 122, RULE_elementValuePair = 123, RULE_elementValue = 124, 
		RULE_elementValueArrayInitializer = 125, RULE_elementValueList = 126, 
		RULE_markerAnnotation = 127, RULE_singleElementAnnotation = 128, RULE_arrayInitializer = 129, 
		RULE_variableInitializerList = 130, RULE_blockStatements = 131, RULE_blockStatement = 132, 
		RULE_localVariableDeclarationStatement = 133, RULE_localVariableDeclaration = 134, 
		RULE_suite = 135, RULE_simpleStatement = 136, RULE_smallStatement = 137, 
		RULE_statement = 138, RULE_passStatement = 139, RULE_labeledStatement = 140, 
		RULE_expressionStatement = 141, RULE_statementExpression = 142, RULE_assertStatement = 143, 
		RULE_switchStatement = 144, RULE_switchBlock = 145, RULE_switchBlockStatementGroup = 146, 
		RULE_switchLabels = 147, RULE_switchLabel = 148, RULE_enumConstantName = 149, 
		RULE_ifStatement = 150, RULE_whileStatement = 151, RULE_doStatement = 152, 
		RULE_forStatement = 153, RULE_basicForStatement = 154, RULE_forInit = 155, 
		RULE_forUpdate = 156, RULE_statementExpressionList = 157, RULE_enhancedForStatement = 158, 
		RULE_breakStatement = 159, RULE_continueStatement = 160, RULE_returnStatement = 161, 
		RULE_throwStatement = 162, RULE_synchronizedStatement = 163, RULE_tryStatement = 164, 
		RULE_catches = 165, RULE_catchClause = 166, RULE_catchFormalParameter = 167, 
		RULE_catchType = 168, RULE_finally_ = 169, RULE_tryWithResourcesStatement = 170, 
		RULE_resourceSpecification = 171, RULE_resourceList = 172, RULE_resource = 173, 
		RULE_variableAccess = 174, RULE_primary = 175, RULE_primaryNoNewArray = 176, 
		RULE_primaryNoNewArray_lf_arrayAccess = 177, RULE_primaryNoNewArray_lfno_arrayAccess = 178, 
		RULE_primaryNoNewArray_lf_primary = 179, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 180, 
		RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 181, RULE_primaryNoNewArray_lfno_primary = 182, 
		RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 183, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 184, 
		RULE_classLiteral = 185, RULE_classInstanceCreationExpression = 186, RULE_classInstanceCreationExpression_lf_primary = 187, 
		RULE_classInstanceCreationExpression_lfno_primary = 188, RULE_typeArgumentsOrDiamond = 189, 
		RULE_fieldAccess = 190, RULE_fieldAccess_lf_primary = 191, RULE_fieldAccess_lfno_primary = 192, 
		RULE_arrayAccess = 193, RULE_arrayAccess_lf_primary = 194, RULE_arrayAccess_lfno_primary = 195, 
		RULE_methodInvocation = 196, RULE_methodInvocation_lf_primary = 197, RULE_methodInvocation_lfno_primary = 198, 
		RULE_argumentList = 199, RULE_methodReference = 200, RULE_methodReference_lf_primary = 201, 
		RULE_methodReference_lfno_primary = 202, RULE_arrayCreationExpression = 203, 
		RULE_dimExprs = 204, RULE_dimExpr = 205, RULE_constantExpression = 206, 
		RULE_expression = 207, RULE_lambdaExpression = 208, RULE_lambdaParameters = 209, 
		RULE_inferredFormalParameterList = 210, RULE_lambdaBody = 211, RULE_assignmentExpression = 212, 
		RULE_assignment = 213, RULE_leftHandSide = 214, RULE_assignmentOperator = 215, 
		RULE_conditionalExpression = 216, RULE_conditionalOrExpression = 217, 
		RULE_conditionalAndExpression = 218, RULE_inclusiveOrExpression = 219, 
		RULE_exclusiveOrExpression = 220, RULE_andExpression = 221, RULE_equalityExpression = 222, 
		RULE_relationalExpression = 223, RULE_shiftExpression = 224, RULE_additiveExpression = 225, 
		RULE_multiplicativeExpression = 226, RULE_unaryExpression = 227, RULE_preIncrementExpression = 228, 
		RULE_preDecrementExpression = 229, RULE_unaryExpressionNotPlusMinus = 230, 
		RULE_postfixExpression = 231, RULE_postIncrementExpression = 232, RULE_postIncrementExpression_lf_postfixExpression = 233, 
		RULE_postDecrementExpression = 234, RULE_postDecrementExpression_lf_postfixExpression = 235, 
		RULE_castExpression = 236, RULE_identifier = 237;
	private static String[] makeRuleNames() {
		return new String[] {
			"literal", "primitiveType", "numericType", "integralType", "floatingPointType", 
			"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
			"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
			"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
			"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
			"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
			"moduleName", "packageName", "typeName", "packageOrTypeName", "expressionName", 
			"methodName", "ambiguousName", "compilationUnit", "ordinaryCompilation", 
			"modularCompilation", "packageDeclaration", "packageModifier", "importDeclaration", 
			"singleTypeImportDeclaration", "typeImportOnDemandDeclaration", "singleStaticImportDeclaration", 
			"staticImportOnDemandDeclaration", "typeDeclaration", "moduleDeclaration", 
			"moduleDirective", "requiresModifier", "classDeclaration", "normalClassDeclaration", 
			"classModifier", "typeParameters", "typeParameterList", "superclass", 
			"superinterfaces", "interfaceTypeList", "classBody", "classBodyDeclaration", 
			"classMemberDeclaration", "fieldDeclaration", "fieldModifier", "variableDeclaratorList", 
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", 
			"unannType", "unannPrimitiveType", "unannReferenceType", "unannClassOrInterfaceType", 
			"unannClassType", "unannClassType_lf_unannClassOrInterfaceType", "unannClassType_lfno_unannClassOrInterfaceType", 
			"unannInterfaceType", "unannInterfaceType_lf_unannClassOrInterfaceType", 
			"unannInterfaceType_lfno_unannClassOrInterfaceType", "unannTypeVariable", 
			"unannArrayType", "methodDeclaration", "methodModifier", "methodHeader", 
			"result", "methodDeclarator", "formalParameterList", "formalParameters", 
			"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
			"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
			"staticInitializer", "constructorDeclaration", "constructorModifier", 
			"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
			"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
			"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
			"interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
			"constantDeclaration", "constantModifier", "interfaceMethodDeclaration", 
			"interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", 
			"annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
			"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
			"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
			"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
			"variableInitializerList", "blockStatements", "blockStatement", "localVariableDeclarationStatement", 
			"localVariableDeclaration", "suite", "simpleStatement", "smallStatement", 
			"statement", "passStatement", "labeledStatement", "expressionStatement", 
			"statementExpression", "assertStatement", "switchStatement", "switchBlock", 
			"switchBlockStatementGroup", "switchLabels", "switchLabel", "enumConstantName", 
			"ifStatement", "whileStatement", "doStatement", "forStatement", "basicForStatement", 
			"forInit", "forUpdate", "statementExpressionList", "enhancedForStatement", 
			"breakStatement", "continueStatement", "returnStatement", "throwStatement", 
			"synchronizedStatement", "tryStatement", "catches", "catchClause", "catchFormalParameter", 
			"catchType", "finally_", "tryWithResourcesStatement", "resourceSpecification", 
			"resourceList", "resource", "variableAccess", "primary", "primaryNoNewArray", 
			"primaryNoNewArray_lf_arrayAccess", "primaryNoNewArray_lfno_arrayAccess", 
			"primaryNoNewArray_lf_primary", "primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", 
			"primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", "primaryNoNewArray_lfno_primary", 
			"primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", "primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", 
			"classLiteral", "classInstanceCreationExpression", "classInstanceCreationExpression_lf_primary", 
			"classInstanceCreationExpression_lfno_primary", "typeArgumentsOrDiamond", 
			"fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
			"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", 
			"methodInvocation", "methodInvocation_lf_primary", "methodInvocation_lfno_primary", 
			"argumentList", "methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
			"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
			"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
			"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
			"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
			"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
			"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
			"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
			"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
			"postDecrementExpression_lf_postfixExpression", "castExpression", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'extends'", "'open'", "'module'", "'requires'", "'exports'", "'to'", 
			"'opens'", "'uses'", "'provides'", "'with'", "'transitive'", "'abstract'", 
			"'assert'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
			"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", 
			"'else'", "'enum'", "'final'", "'finally'", "'float'", "'for'", "'if'", 
			"'goto'", "'import'", "'instanceof'", "'in'", "'int'", "'interface'", 
			"'long'", "'native'", "'new'", "'package'", "'pass'", "'private'", "'protected'", 
			"'public'", "'return'", "'short'", "'static'", "'strictfp'", "'super'", 
			"'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", 
			"'try'", "'void'", "'volatile'", "'while'", "'_'", null, null, null, 
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'...'", "'@'", "'::'", "'='", "'>'", "'<'", "'!'", 
			"'~'", "'?'", "':'", "'->'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
			"'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
			"'<<='", "'>>='", "'>>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
			"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
			"FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPORT", "INSTANCEOF", 
			"IN", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PASS", 
			"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
			"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
			"TRY", "VOID", "VOLATILE", "WHILE", "UNDER_SCORE", "NEWLINE", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ELLIPSIS", "AT", "COLONCOLON", "ASSIGN", "GT", 
			"LT", "BANG", "TILDE", "QUESTION", "COLON", "ARROW", "EQUAL", "LE", "GE", 
			"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
			"BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "WS", "COMMENT", "LINE_COMMENT", 
			"INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Japy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JapyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(JapyParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JapyParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JapyParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JapyParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JapyParser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(JapyParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(JapyParser.BOOLEAN, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primitiveType);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(478);
					annotation();
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(484);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(485);
					annotation();
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(491);
				match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericType);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(JapyParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JapyParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JapyParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JapyParser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(JapyParser.CHAR, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitIntegralType(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(JapyParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JapyParser.DOUBLE, 0); }
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitFloatingPointType(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_referenceType);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(507);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(508);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(513);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(511);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(512);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classType);
		int _la;
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(518);
					annotation();
					}
					}
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(524);
				identifier();
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(525);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				classOrInterfaceType();
				setState(529);
				match(DOT);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(530);
					annotation();
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536);
				identifier();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(537);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(DOT);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(543);
				annotation();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			identifier();
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(550);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(553);
				annotation();
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
			identifier();
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(560);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTypeVariable(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(569);
				annotation();
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayType);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				primitiveType();
				setState(578);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				classOrInterfaceType();
				setState(581);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				typeVariable();
				setState(584);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(JapyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JapyParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JapyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JapyParser.RBRACK, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(588);
				annotation();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
			match(LBRACK);
			setState(595);
			match(RBRACK);
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(596);
						annotation();
						}
						}
						setState(601);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(602);
					match(LBRACK);
					setState(603);
					match(RBRACK);
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(609);
				typeParameterModifier();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615);
			identifier();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(616);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTypeParameterModifier(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeBound);
		int _la;
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(T__0);
				setState(622);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(T__0);
				setState(624);
				classOrInterfaceType();
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(625);
					additionalBound();
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(JapyParser.BITAND, 0); }
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAdditionalBound(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(BITAND);
			setState(634);
			interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JapyParser.LT, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode GT() { return getToken(JapyParser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(LT);
			setState(637);
			typeArgumentList();
			setState(638);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTypeArgumentList(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			typeArgument();
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(641);
				match(COMMA);
				setState(642);
				typeArgument();
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgument);
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(JapyParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitWildcard(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(652);
				annotation();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(658);
			match(QUESTION);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==SUPER) {
				{
				setState(659);
				wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JapyParser.SUPER, 0); }
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitWildcardBounds(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcardBounds);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(T__0);
				setState(663);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				match(SUPER);
				setState(665);
				referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public ModuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitModuleName(this);
		}
	}

	public final ModuleNameContext moduleName() throws RecognitionException {
		return moduleName(0);
	}

	private ModuleNameContext moduleName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ModuleNameContext _localctx = new ModuleNameContext(_ctx, _parentState);
		ModuleNameContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_moduleName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(669);
			identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ModuleNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_moduleName);
					setState(671);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(672);
					match(DOT);
					setState(673);
					identifier();
					}
					} 
				}
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(680);
			identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(682);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(683);
					match(DOT);
					setState(684);
					identifier();
					}
					} 
				}
				setState(689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				packageOrTypeName(0);
				setState(692);
				match(DOT);
				setState(693);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(698);
			identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(700);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(701);
					match(DOT);
					setState(702);
					identifier();
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitExpressionName(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionName);
		try {
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				ambiguousName(0);
				setState(710);
				match(DOT);
				setState(711);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAmbiguousName(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(718);
			identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(720);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(721);
					match(DOT);
					setState(722);
					identifier();
					}
					} 
				}
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public OrdinaryCompilationContext ordinaryCompilation() {
			return getRuleContext(OrdinaryCompilationContext.class,0);
		}
		public ModularCompilationContext modularCompilation() {
			return getRuleContext(ModularCompilationContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JapyParser.NEWLINE, i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(728);
				match(NEWLINE);
				}
				}
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(734);
				ordinaryCompilation();
				}
				break;
			case 2:
				{
				setState(735);
				modularCompilation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrdinaryCompilationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JapyParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public OrdinaryCompilationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinaryCompilation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterOrdinaryCompilation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitOrdinaryCompilation(this);
		}
	}

	public final OrdinaryCompilationContext ordinaryCompilation() throws RecognitionException {
		OrdinaryCompilationContext _localctx = new OrdinaryCompilationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ordinaryCompilation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(738);
				packageDeclaration();
				}
				break;
			}
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(741);
				importDeclaration();
				}
				}
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(747);
				typeDeclaration();
				}
				}
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(753);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModularCompilationContext extends ParserRuleContext {
		public ModuleDeclarationContext moduleDeclaration() {
			return getRuleContext(ModuleDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ModularCompilationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modularCompilation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterModularCompilation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitModularCompilation(this);
		}
	}

	public final ModularCompilationContext modularCompilation() throws RecognitionException {
		ModularCompilationContext _localctx = new ModularCompilationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_modularCompilation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(755);
				importDeclaration();
				}
				}
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(761);
			moduleDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JapyParser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JapyParser.SEMI, 0); }
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(763);
				packageModifier();
				}
				}
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(769);
			match(PACKAGE);
			setState(770);
			packageName(0);
			setState(771);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPackageModifier(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_importDeclaration);
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(775);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(777);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(778);
				staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JapyParser.IMPORT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JapyParser.SEMI, 0); }
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSingleTypeImportDeclaration(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(IMPORT);
			setState(782);
			typeName();
			setState(783);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JapyParser.IMPORT, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(JapyParser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(JapyParser.SEMI, 0); }
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTypeImportOnDemandDeclaration(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(IMPORT);
			setState(786);
			packageOrTypeName(0);
			setState(787);
			match(DOT);
			setState(788);
			match(MUL);
			setState(789);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JapyParser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(JapyParser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JapyParser.SEMI, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSingleStaticImportDeclaration(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(IMPORT);
			setState(792);
			match(STATIC);
			setState(793);
			typeName();
			setState(794);
			match(DOT);
			setState(795);
			identifier();
			setState(796);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JapyParser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(JapyParser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(JapyParser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(JapyParser.SEMI, 0); }
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitStaticImportOnDemandDeclaration(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(IMPORT);
			setState(799);
			match(STATIC);
			setState(800);
			typeName();
			setState(801);
			match(DOT);
			setState(802);
			match(MUL);
			setState(803);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JapyParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeDeclaration);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(807);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDeclarationContext extends ParserRuleContext {
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JapyParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JapyParser.RBRACE, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModuleDirectiveContext> moduleDirective() {
			return getRuleContexts(ModuleDirectiveContext.class);
		}
		public ModuleDirectiveContext moduleDirective(int i) {
			return getRuleContext(ModuleDirectiveContext.class,i);
		}
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitModuleDeclaration(this);
		}
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_moduleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(810);
				annotation();
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(816);
				match(T__1);
				}
			}

			setState(819);
			match(T__2);
			setState(820);
			moduleName(0);
			setState(821);
			match(LBRACE);
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				{
				setState(822);
				moduleDirective();
				}
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(828);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDirectiveContext extends ParserRuleContext {
		public List<ModuleNameContext> moduleName() {
			return getRuleContexts(ModuleNameContext.class);
		}
		public ModuleNameContext moduleName(int i) {
			return getRuleContext(ModuleNameContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JapyParser.SEMI, 0); }
		public List<RequiresModifierContext> requiresModifier() {
			return getRuleContexts(RequiresModifierContext.class);
		}
		public RequiresModifierContext requiresModifier(int i) {
			return getRuleContext(RequiresModifierContext.class,i);
		}
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public ModuleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterModuleDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitModuleDirective(this);
		}
	}

	public final ModuleDirectiveContext moduleDirective() throws RecognitionException {
		ModuleDirectiveContext _localctx = new ModuleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_moduleDirective);
		int _la;
		try {
			setState(887);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				match(T__3);
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10 || _la==STATIC) {
					{
					{
					setState(831);
					requiresModifier();
					}
					}
					setState(836);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(837);
				moduleName(0);
				setState(838);
				match(SEMI);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				match(T__4);
				setState(841);
				packageName(0);
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(842);
					match(T__5);
					setState(843);
					moduleName(0);
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(844);
						match(COMMA);
						setState(845);
						moduleName(0);
						}
						}
						setState(850);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(853);
				match(SEMI);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(855);
				match(T__6);
				setState(856);
				packageName(0);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(857);
					match(T__5);
					setState(858);
					moduleName(0);
					setState(863);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(859);
						match(COMMA);
						setState(860);
						moduleName(0);
						}
						}
						setState(865);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(868);
				match(SEMI);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(870);
				match(T__7);
				setState(871);
				typeName();
				setState(872);
				match(SEMI);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(874);
				match(T__8);
				setState(875);
				typeName();
				setState(876);
				match(T__9);
				setState(877);
				typeName();
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(878);
					match(COMMA);
					setState(879);
					typeName();
					}
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(885);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiresModifierContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(JapyParser.STATIC, 0); }
		public RequiresModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiresModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterRequiresModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitRequiresModifier(this);
		}
	}

	public final RequiresModifierContext requiresModifier() throws RecognitionException {
		RequiresModifierContext _localctx = new RequiresModifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_requiresModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==STATIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classDeclaration);
		try {
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JapyParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(895);
				classModifier();
				}
				}
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(901);
			match(CLASS);
			setState(902);
			identifier();
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(903);
				typeParameters();
				}
			}

			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GT) {
				{
				setState(906);
				superclass();
				}
			}

			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(909);
				superinterfaces();
				}
			}

			setState(912);
			match(COLON);
			setState(913);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JapyParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JapyParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JapyParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(JapyParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(JapyParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JapyParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JapyParser.STRICTFP, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_classModifier);
		try {
			setState(923);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(918);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(919);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(920);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(921);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(922);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JapyParser.LT, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode GT() { return getToken(JapyParser.GT, 0); }
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(LT);
			setState(926);
			typeParameterList();
			setState(927);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTypeParameterList(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			typeParameter();
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(930);
				match(COMMA);
				setState(931);
				typeParameter();
				}
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(JapyParser.GT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSuperclass(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(GT);
			setState(938);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(JapyParser.SUB, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSuperinterfaces(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(SUB);
			setState(941);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitInterfaceTypeList(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			interfaceType();
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(944);
				match(COMMA);
				setState(945);
				interfaceType();
				}
				}
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(JapyParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JapyParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JapyParser.NEWLINE, i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(951);
				match(NEWLINE);
				}
				}
				setState(954); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(956);
			match(INDENT);
			setState(958); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(957);
				classBodyDeclaration();
				}
				}
				setState(960); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << NEW) | (1L << PASS) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (SEMI - 64)) | (1L << (AT - 64)) | (1L << (LT - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)))) != 0) );
			setState(962);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_classBodyDeclaration);
		try {
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JapyParser.SEMI, 0); }
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_classMemberDeclaration);
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(972);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(973);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(974);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (FINAL - 28)) | (1L << (PRIVATE - 28)) | (1L << (PROTECTED - 28)) | (1L << (PUBLIC - 28)) | (1L << (STATIC - 28)) | (1L << (TRANSIENT - 28)) | (1L << (VOLATILE - 28)) | (1L << (AT - 28)))) != 0)) {
				{
				{
				setState(977);
				fieldModifier();
				}
				}
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(983);
			unannType();
			setState(984);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JapyParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JapyParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JapyParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JapyParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JapyParser.FINAL, 0); }
		public TerminalNode TRANSIENT() { return getToken(JapyParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JapyParser.VOLATILE, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fieldModifier);
		try {
			setState(994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(987);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(988);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(989);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(990);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(991);
				match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(992);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(993);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitVariableDeclaratorList(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			variableDeclarator();
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(997);
				match(COMMA);
				setState(998);
				variableDeclarator();
				}
				}
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JapyParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			variableDeclaratorId();
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1005);
				match(ASSIGN);
				setState(1006);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			identifier();
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(1010);
				dims();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_variableInitializer);
		try {
			setState(1015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case AT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnannType(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannType);
		try {
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				unannReferenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(JapyParser.BOOLEAN, 0); }
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnannPrimitiveType(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannPrimitiveType);
		try {
			setState(1023);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1021);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnannReferenceType(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannReferenceType);
		try {
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1025);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1027);
				unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnannClassOrInterfaceType(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(1030);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(1031);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(1038);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1036);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(1034);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(1035);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(1040);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnannClassType(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannClassType);
		int _la;
		try {
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041);
				identifier();
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1042);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				unannClassOrInterfaceType();
				setState(1046);
				match(DOT);
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1047);
					annotation();
					}
					}
					setState(1052);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1053);
				identifier();
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1054);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(DOT);
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1060);
				annotation();
				}
				}
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1066);
			identifier();
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1067);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			identifier();
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1071);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnannInterfaceType(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnannTypeVariable(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnannArrayType(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_unannArrayType);
		try {
			setState(1091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				unannPrimitiveType();
				setState(1083);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				unannClassOrInterfaceType();
				setState(1086);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1088);
				unannTypeVariable();
				setState(1089);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(1093);
				methodModifier();
				}
				}
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1099);
			methodHeader();
			setState(1100);
			match(COLON);
			setState(1101);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JapyParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JapyParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JapyParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(JapyParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(JapyParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JapyParser.FINAL, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JapyParser.SYNCHRONIZED, 0); }
		public TerminalNode NATIVE() { return getToken(JapyParser.NATIVE, 0); }
		public TerminalNode STRICTFP() { return getToken(JapyParser.STRICTFP, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMethodModifier(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_methodModifier);
		try {
			setState(1113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1105);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1106);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1107);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1108);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1109);
				match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1110);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1111);
				match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1112);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_methodHeader);
		int _la;
		try {
			setState(1132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				result();
				setState(1116);
				methodDeclarator();
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1117);
					throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1120);
				typeParameters();
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1121);
					annotation();
					}
					}
					setState(1126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1127);
				result();
				setState(1128);
				methodDeclarator();
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1129);
					throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JapyParser.VOID, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_result);
		try {
			setState(1136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1135);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			identifier();
			setState(1139);
			match(LPAREN);
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==Identifier) {
				{
				setState(1140);
				formalParameterList();
				}
			}

			setState(1143);
			match(RPAREN);
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1144);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JapyParser.COMMA, 0); }
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_formalParameterList);
		try {
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				formalParameters();
				setState(1148);
				match(COMMA);
				setState(1149);
				lastFormalParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1152);
				receiverParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_formalParameters);
		try {
			int _alt;
			setState(1171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				formalParameter();
				setState(1160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1156);
						match(COMMA);
						setState(1157);
						formalParameter();
						}
						} 
					}
					setState(1162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1163);
				receiverParameter();
				setState(1168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1164);
						match(COMMA);
						setState(1165);
						formalParameter();
						}
						} 
					}
					setState(1170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1173);
				variableModifier();
				}
				}
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1179);
			unannType();
			setState(1180);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(JapyParser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_variableModifier);
		try {
			setState(1184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1183);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JapyParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1186);
					variableModifier();
					}
					}
					setState(1191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1192);
				unannType();
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1193);
					annotation();
					}
					}
					setState(1198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1199);
				match(ELLIPSIS);
				setState(1200);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1202);
				formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JapyParser.THIS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1205);
				annotation();
				}
				}
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1211);
			unannType();
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==Identifier) {
				{
				setState(1212);
				identifier();
				setState(1213);
				match(DOT);
				}
			}

			setState(1217);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(JapyParser.THROWS, 0); }
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitThrows_(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 172, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(THROWS);
			setState(1220);
			exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitExceptionTypeList(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			exceptionType();
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1223);
				match(COMMA);
				setState(1224);
				exceptionType();
				}
				}
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitExceptionType(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_exceptionType);
		try {
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1230);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
				typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(JapyParser.INDENT, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(JapyParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JapyParser.NEWLINE, i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_methodBody);
		int _la;
		try {
			setState(1244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case ASSERT:
			case BOOLEAN:
			case BREAK:
			case BYTE:
			case CHAR:
			case CONTINUE:
			case DO:
			case DOUBLE:
			case FLOAT:
			case FOR:
			case IF:
			case INT:
			case LONG:
			case NEW:
			case PASS:
			case RETURN:
			case SHORT:
			case SUPER:
			case SWITCH:
			case SYNCHRONIZED:
			case THIS:
			case THROW:
			case TRY:
			case VOID:
			case WHILE:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case AT:
			case INC:
			case DEC:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				statement();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1235);
					match(NEWLINE);
					}
					}
					setState(1238); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(1240);
				match(INDENT);
				setState(1241);
				blockStatements();
				setState(1242);
				match(DEDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitInstanceInitializer(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(JapyParser.STATIC, 0); }
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitStaticInitializer(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			match(STATIC);
			setState(1249);
			match(COLON);
			setState(1250);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (PRIVATE - 44)) | (1L << (PROTECTED - 44)) | (1L << (PUBLIC - 44)) | (1L << (AT - 44)))) != 0)) {
				{
				{
				setState(1252);
				constructorModifier();
				}
				}
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1258);
			constructorDeclarator();
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1259);
				throws_();
				}
			}

			setState(1262);
			match(COLON);
			setState(1263);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JapyParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JapyParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JapyParser.PRIVATE, 0); }
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitConstructorModifier(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_constructorModifier);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1265);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1266);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1267);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1268);
				match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitConstructorDeclarator(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1271);
				typeParameters();
				}
			}

			setState(1274);
			simpleTypeName();
			setState(1275);
			match(LPAREN);
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==Identifier) {
				{
				setState(1276);
				formalParameterList();
				}
			}

			setState(1279);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSimpleTypeName(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(JapyParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JapyParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JapyParser.NEWLINE, i);
		}
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_constructorBody);
		int _la;
		try {
			setState(1297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case ASSERT:
			case BOOLEAN:
			case BREAK:
			case BYTE:
			case CHAR:
			case CONTINUE:
			case DO:
			case DOUBLE:
			case FLOAT:
			case FOR:
			case IF:
			case INT:
			case LONG:
			case NEW:
			case PASS:
			case RETURN:
			case SHORT:
			case SUPER:
			case SWITCH:
			case SYNCHRONIZED:
			case THIS:
			case THROW:
			case TRY:
			case VOID:
			case WHILE:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case AT:
			case INC:
			case DEC:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1283);
				statement();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1284);
					match(NEWLINE);
					}
					}
					setState(1287); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(1289);
				match(INDENT);
				setState(1291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1290);
					explicitConstructorInvocation();
					}
					break;
				}
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PASS) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1293);
					blockStatements();
					}
				}

				setState(1296);
				match(DEDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(JapyParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JapyParser.SEMI, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JapyParser.SUPER, 0); }
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1299);
					typeArguments();
					}
				}

				setState(1302);
				match(THIS);
				setState(1303);
				match(LPAREN);
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1304);
					argumentList();
					}
				}

				setState(1307);
				match(RPAREN);
				setState(1308);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1309);
					typeArguments();
					}
				}

				setState(1312);
				match(SUPER);
				setState(1313);
				match(LPAREN);
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1314);
					argumentList();
					}
				}

				setState(1317);
				match(RPAREN);
				setState(1318);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1319);
				expressionName();
				setState(1320);
				match(DOT);
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1321);
					typeArguments();
					}
				}

				setState(1324);
				match(SUPER);
				setState(1325);
				match(LPAREN);
				setState(1327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1326);
					argumentList();
					}
				}

				setState(1329);
				match(RPAREN);
				setState(1330);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1332);
				primary();
				setState(1333);
				match(DOT);
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1334);
					typeArguments();
					}
				}

				setState(1337);
				match(SUPER);
				setState(1338);
				match(LPAREN);
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1339);
					argumentList();
					}
				}

				setState(1342);
				match(RPAREN);
				setState(1343);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JapyParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1347);
				classModifier();
				}
				}
				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1353);
			match(ENUM);
			setState(1354);
			identifier();
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(1355);
				superinterfaces();
				}
			}

			setState(1358);
			match(COLON);
			setState(1359);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(JapyParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JapyParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JapyParser.NEWLINE, i);
		}
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JapyParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1361);
				match(NEWLINE);
				}
				}
				setState(1364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(1366);
			match(INDENT);
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==AT || _la==Identifier) {
				{
				setState(1367);
				enumConstantList();
				}
			}

			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1370);
				match(COMMA);
				}
			}

			setState(1374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1373);
				enumBodyDeclarations();
				}
			}

			setState(1376);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitEnumConstantList(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			enumConstant();
			setState(1383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1379);
					match(COMMA);
					setState(1380);
					enumConstant();
					}
					} 
				}
				setState(1385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1386);
				enumConstantModifier();
				}
				}
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1392);
			identifier();
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1393);
				match(LPAREN);
				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1394);
					argumentList();
					}
				}

				setState(1397);
				match(RPAREN);
				}
			}

			setState(1400);
			match(COLON);
			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1401);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitEnumConstantModifier(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JapyParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			match(SEMI);
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << NEW) | (1L << PASS) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (SEMI - 64)) | (1L << (AT - 64)) | (1L << (LT - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(1407);
				classBodyDeclaration();
				}
				}
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceDeclaration);
		try {
			setState(1415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1413);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414);
				annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JapyParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1417);
				interfaceModifier();
				}
				}
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1423);
			match(INTERFACE);
			setState(1424);
			identifier();
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1425);
				typeParameters();
				}
			}

			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GT) {
				{
				setState(1428);
				extendsInterfaces();
				}
			}

			setState(1431);
			match(COLON);
			setState(1432);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JapyParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JapyParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JapyParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(JapyParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(JapyParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(JapyParser.STRICTFP, 0); }
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitInterfaceModifier(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_interfaceModifier);
		try {
			setState(1441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1434);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1435);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1436);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1437);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1438);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1439);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1440);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(JapyParser.GT, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitExtendsInterfaces(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			match(GT);
			setState(1444);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(JapyParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JapyParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JapyParser.NEWLINE, i);
		}
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1446);
				match(NEWLINE);
				}
				}
				setState(1449); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(1451);
			match(INDENT);
			setState(1455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AT - 80)) | (1L << (LT - 80)) | (1L << (Identifier - 80)))) != 0)) {
				{
				{
				setState(1452);
				interfaceMemberDeclaration();
				}
				}
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1458);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_interfaceMemberDeclaration);
		try {
			setState(1464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1460);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1461);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1462);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1463);
				interfaceDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (FINAL - 28)) | (1L << (PUBLIC - 28)) | (1L << (STATIC - 28)) | (1L << (AT - 28)))) != 0)) {
				{
				{
				setState(1466);
				constantModifier();
				}
				}
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1472);
			unannType();
			setState(1473);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JapyParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(JapyParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JapyParser.FINAL, 0); }
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitConstantModifier(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_constantModifier);
		try {
			setState(1479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1475);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1476);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1477);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1478);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1481);
				interfaceMethodModifier();
				}
				}
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1487);
			methodHeader();
			setState(1488);
			match(COLON);
			setState(1489);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JapyParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(JapyParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(JapyParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(JapyParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(JapyParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(JapyParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_interfaceMethodModifier);
		try {
			setState(1498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1491);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1492);
				match(PUBLIC);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1493);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1494);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1495);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1496);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1497);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JapyParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(JapyParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1500);
					interfaceModifier();
					}
					} 
				}
				setState(1505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			setState(1506);
			match(AT);
			setState(1507);
			match(INTERFACE);
			setState(1508);
			identifier();
			setState(1509);
			match(COLON);
			setState(1510);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(JapyParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JapyParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JapyParser.NEWLINE, i);
		}
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1512);
				match(NEWLINE);
				}
				}
				setState(1515); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(1517);
			match(INDENT);
			setState(1521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT || _la==Identifier) {
				{
				{
				setState(1518);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1524);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1526);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1527);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1528);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1529);
				interfaceDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1532);
				annotationTypeElementModifier();
				}
				}
				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1538);
			unannType();
			setState(1539);
			identifier();
			setState(1540);
			match(LPAREN);
			setState(1541);
			match(RPAREN);
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1542);
				dims();
				}
				break;
			}
			setState(1546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1545);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JapyParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JapyParser.ABSTRACT, 0); }
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAnnotationTypeElementModifier(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_annotationTypeElementModifier);
		try {
			setState(1551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1548);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1549);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1550);
				match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JapyParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			match(DEFAULT);
			setState(1554);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_annotation);
		try {
			setState(1559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1556);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1557);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1558);
				singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JapyParser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitNormalAnnotation(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			match(AT);
			setState(1562);
			typeName();
			setState(1563);
			match(LPAREN);
			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==Identifier) {
				{
				setState(1564);
				elementValuePairList();
				}
			}

			setState(1567);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitElementValuePairList(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			elementValuePair();
			setState(1574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1570);
				match(COMMA);
				setState(1571);
				elementValuePair();
				}
				}
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JapyParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			identifier();
			setState(1578);
			match(ASSIGN);
			setState(1579);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_elementValue);
		try {
			setState(1584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1581);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1582);
				elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1583);
				annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JapyParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JapyParser.RBRACE, 0); }
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JapyParser.COMMA, 0); }
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(LBRACE);
			setState(1588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1587);
				elementValueList();
				}
			}

			setState(1591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1590);
				match(COMMA);
				}
			}

			setState(1593);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitElementValueList(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			elementValue();
			setState(1600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1596);
					match(COMMA);
					setState(1597);
					elementValue();
					}
					} 
				}
				setState(1602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JapyParser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMarkerAnnotation(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			match(AT);
			setState(1604);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JapyParser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSingleElementAnnotation(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			match(AT);
			setState(1607);
			typeName();
			setState(1608);
			match(LPAREN);
			setState(1609);
			elementValue();
			setState(1610);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JapyParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JapyParser.RBRACE, 0); }
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JapyParser.COMMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			match(LBRACE);
			setState(1614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1613);
				variableInitializerList();
				}
			}

			setState(1617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1616);
				match(COMMA);
				}
			}

			setState(1619);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitVariableInitializerList(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			variableInitializer();
			setState(1626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1622);
					match(COMMA);
					setState(1623);
					variableInitializer();
					}
					} 
				}
				setState(1628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_blockStatements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1630); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1629);
					blockStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1632); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_blockStatement);
		try {
			setState(1637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1635);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1636);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			localVariableDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1641);
				variableModifier();
				}
				}
				setState(1646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1647);
			unannType();
			setState(1648);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuiteContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(JapyParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JapyParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JapyParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSuite(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case ASSERT:
			case BOOLEAN:
			case BREAK:
			case BYTE:
			case CHAR:
			case CONTINUE:
			case DO:
			case DOUBLE:
			case FLOAT:
			case FOR:
			case IF:
			case INT:
			case LONG:
			case NEW:
			case PASS:
			case RETURN:
			case SHORT:
			case SUPER:
			case SYNCHRONIZED:
			case THIS:
			case THROW:
			case TRY:
			case VOID:
			case WHILE:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case AT:
			case INC:
			case DEC:
			case Identifier:
				{
				setState(1650);
				simpleStatement();
				}
				break;
			case NEWLINE:
				{
				setState(1652); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1651);
					match(NEWLINE);
					}
					}
					setState(1654); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(1656);
				match(INDENT);
				setState(1658); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1657);
					statement();
					}
					}
					setState(1660); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PASS) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)))) != 0) );
				setState(1662);
				match(DEDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public List<SmallStatementContext> smallStatement() {
			return getRuleContexts(SmallStatementContext.class);
		}
		public SmallStatementContext smallStatement(int i) {
			return getRuleContext(SmallStatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JapyParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JapyParser.SEMI, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JapyParser.NEWLINE, i);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_simpleStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			smallStatement();
			setState(1671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1667);
					match(SEMI);
					setState(1668);
					smallStatement();
					}
					} 
				}
				setState(1673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			setState(1675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1674);
				match(SEMI);
				}
			}

			setState(1678); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1677);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1680); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SmallStatementContext extends ParserRuleContext {
		public PassStatementContext passStatement() {
			return getRuleContext(PassStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public SmallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSmallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSmallStatement(this);
		}
	}

	public final SmallStatementContext smallStatement() throws RecognitionException {
		SmallStatementContext _localctx = new SmallStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_smallStatement);
		try {
			setState(1695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1682);
				passStatement();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case AT:
			case INC:
			case DEC:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1683);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1684);
				assertStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(1685);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1686);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1687);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(1688);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1689);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 9);
				{
				setState(1690);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 10);
				{
				setState(1691);
				tryStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 11);
				{
				setState(1692);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1693);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 13);
				{
				setState(1694);
				forStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public PassStatementContext passStatement() {
			return getRuleContext(PassStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_statement);
		try {
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1697);
				passStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1698);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1699);
				assertStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1700);
				doStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1701);
				breakStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1702);
				continueStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1703);
				returnStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1704);
				synchronizedStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1705);
				throwStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1706);
				tryStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1707);
				ifStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1708);
				whileStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1709);
				forStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1710);
				switchStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1711);
				labeledStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PassStatementContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(JapyParser.PASS, 0); }
		public PassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPassStatement(this);
		}
	}

	public final PassStatementContext passStatement() throws RecognitionException {
		PassStatementContext _localctx = new PassStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_passStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			match(PASS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			identifier();
			setState(1717);
			match(COLON);
			setState(1718);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			statementExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_statementExpression);
		try {
			setState(1729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1722);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1723);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1724);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1725);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1726);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1727);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1728);
				classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(JapyParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_assertStatement);
		try {
			setState(1738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1731);
				match(ASSERT);
				setState(1732);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1733);
				match(ASSERT);
				setState(1734);
				expression();
				setState(1735);
				match(COLON);
				setState(1736);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JapyParser.SWITCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			match(SWITCH);
			setState(1741);
			expression();
			setState(1742);
			match(COLON);
			setState(1743);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(JapyParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JapyParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JapyParser.NEWLINE, i);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1746); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1745);
				match(NEWLINE);
				}
				}
				setState(1748); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(1750);
			match(INDENT);
			setState(1754);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1751);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			setState(1760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1757);
				switchLabel();
				}
				}
				setState(1762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1763);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(JapyParser.INDENT, 0); }
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(JapyParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JapyParser.NEWLINE, i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1765);
				match(NEWLINE);
				}
				}
				setState(1768); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(1770);
			match(INDENT);
			setState(1771);
			switchLabels();
			setState(1772);
			blockStatements();
			setState(1773);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1775);
				switchLabel();
				}
				}
				setState(1778); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JapyParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JapyParser.NEWLINE, i);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JapyParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_switchLabel);
		int _la;
		try {
			setState(1805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1781); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1780);
					match(NEWLINE);
					}
					}
					setState(1783); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(1785);
				match(CASE);
				setState(1786);
				constantExpression();
				setState(1787);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1790); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1789);
					match(NEWLINE);
					}
					}
					setState(1792); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(1794);
				match(CASE);
				setState(1795);
				enumConstantName();
				setState(1796);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1799); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1798);
					match(NEWLINE);
					}
					}
					setState(1801); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(1803);
				match(DEFAULT);
				setState(1804);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(JapyParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(JapyParser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(JapyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JapyParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(JapyParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(JapyParser.ELSE, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			match(IF);
			setState(1810);
			expression();
			setState(1811);
			match(COLON);
			setState(1812);
			suite();
			setState(1821);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1813);
					match(ELSE);
					setState(1814);
					match(IF);
					setState(1815);
					expression();
					setState(1816);
					match(COLON);
					setState(1817);
					suite();
					}
					} 
				}
				setState(1823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			}
			setState(1827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1824);
				match(ELSE);
				setState(1825);
				match(COLON);
				setState(1826);
				suite();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JapyParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			match(WHILE);
			setState(1830);
			expression();
			setState(1831);
			match(COLON);
			setState(1832);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(JapyParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(JapyParser.WHILE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			match(DO);
			setState(1835);
			match(WHILE);
			setState(1836);
			expression();
			setState(1837);
			expression();
			setState(1838);
			match(COLON);
			setState(1839);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_forStatement);
		try {
			setState(1843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1841);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1842);
				enhancedForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JapyParser.FOR, 0); }
		public List<TerminalNode> SEMI() { return getTokens(JapyParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JapyParser.SEMI, i);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitBasicForStatement(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			match(FOR);
			setState(1847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1846);
				forInit();
				}
			}

			setState(1849);
			match(SEMI);
			setState(1851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1850);
				expression();
				}
			}

			setState(1853);
			match(SEMI);
			setState(1855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1854);
				forUpdate();
				}
			}

			setState(1857);
			match(COLON);
			setState(1858);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_forInit);
		try {
			setState(1862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1860);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1861);
				localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitStatementExpressionList(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			statementExpression();
			setState(1871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1867);
				match(COMMA);
				setState(1868);
				statementExpression();
				}
				}
				setState(1873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JapyParser.FOR, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode IN() { return getToken(JapyParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitEnhancedForStatement(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1874);
			match(FOR);
			setState(1878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1875);
				variableModifier();
				}
				}
				setState(1880);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1881);
			unannType();
			setState(1882);
			variableDeclaratorId();
			setState(1883);
			match(IN);
			setState(1884);
			expression();
			setState(1885);
			match(COLON);
			setState(1886);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(JapyParser.BREAK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			match(BREAK);
			setState(1890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1889);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(JapyParser.CONTINUE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892);
			match(CONTINUE);
			setState(1894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1893);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JapyParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			match(RETURN);
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1897);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(JapyParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			match(THROW);
			setState(1901);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(JapyParser.SYNCHRONIZED, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitSynchronizedStatement(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			match(SYNCHRONIZED);
			setState(1904);
			expression();
			setState(1905);
			match(COLON);
			setState(1906);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(JapyParser.TRY, 0); }
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_tryStatement);
		int _la;
		try {
			setState(1922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1908);
				match(TRY);
				setState(1909);
				match(COLON);
				setState(1910);
				suite();
				setState(1911);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1913);
				match(TRY);
				setState(1914);
				match(COLON);
				setState(1915);
				suite();
				setState(1917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1916);
					catches();
					}
				}

				setState(1919);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1921);
				tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1924);
				catchClause();
				}
				}
				setState(1927); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CATCH );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(JapyParser.CATCH, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			match(CATCH);
			setState(1930);
			catchFormalParameter();
			setState(1931);
			match(COLON);
			setState(1932);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitCatchFormalParameter(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1934);
				variableModifier();
				}
				}
				setState(1939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1940);
			catchType();
			setState(1941);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<TerminalNode> BITOR() { return getTokens(JapyParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JapyParser.BITOR, i);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			unannClassType();
			setState(1948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1944);
				match(BITOR);
				setState(1945);
				classType();
				}
				}
				setState(1950);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JapyParser.FINALLY, 0); }
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitFinally_(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 338, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
			match(FINALLY);
			setState(1952);
			match(COLON);
			setState(1953);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(JapyParser.TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTryWithResourcesStatement(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			match(TRY);
			setState(1956);
			resourceSpecification();
			setState(1957);
			match(COLON);
			setState(1958);
			suite();
			setState(1960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1959);
				catches();
				}
			}

			setState(1963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1962);
				finally_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JapyParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			match(LPAREN);
			setState(1966);
			resourceList();
			setState(1968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1967);
				match(SEMI);
				}
			}

			setState(1970);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JapyParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JapyParser.SEMI, i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitResourceList(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			resource();
			setState(1977);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1973);
					match(SEMI);
					setState(1974);
					resource();
					}
					} 
				}
				setState(1979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JapyParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_resource);
		int _la;
		try {
			setState(1992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1980);
					variableModifier();
					}
					}
					setState(1985);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1986);
				unannType();
				setState(1987);
				variableDeclaratorId();
				setState(1988);
				match(ASSIGN);
				setState(1989);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1991);
				variableAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public VariableAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterVariableAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitVariableAccess(this);
		}
	}

	public final VariableAccessContext variableAccess() throws RecognitionException {
		VariableAccessContext _localctx = new VariableAccessContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_variableAccess);
		try {
			setState(1996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1994);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1995);
				fieldAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1998);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1999);
				arrayCreationExpression();
				}
				break;
			}
			setState(2005);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2002);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(2007);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ClassLiteralContext classLiteral() {
			return getRuleContext(ClassLiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JapyParser.THIS, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPrimaryNoNewArray(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_primaryNoNewArray);
		try {
			setState(2024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2008);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2009);
				classLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2010);
				match(THIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2011);
				typeName();
				setState(2012);
				match(DOT);
				setState(2013);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2015);
				match(LPAREN);
				setState(2016);
				expression();
				setState(2017);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2019);
				classInstanceCreationExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2020);
				fieldAccess();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2021);
				arrayAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2022);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2023);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JapyParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JapyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JapyParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JapyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JapyParser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(JapyParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(JapyParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(2056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2028);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2029);
				typeName();
				setState(2034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2030);
					match(LBRACK);
					setState(2031);
					match(RBRACK);
					}
					}
					setState(2036);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2037);
				match(DOT);
				setState(2038);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2040);
				match(VOID);
				setState(2041);
				match(DOT);
				setState(2042);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2043);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2044);
				typeName();
				setState(2045);
				match(DOT);
				setState(2046);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2048);
				match(LPAREN);
				setState(2049);
				expression();
				setState(2050);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2052);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2053);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2054);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2055);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(2063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2058);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2059);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2060);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2061);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2062);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(2071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2067);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2068);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2069);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2070);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JapyParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JapyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JapyParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JapyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JapyParser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JapyParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(JapyParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2073);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2074);
				typeName();
				setState(2079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2075);
					match(LBRACK);
					setState(2076);
					match(RBRACK);
					}
					}
					setState(2081);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2082);
				match(DOT);
				setState(2083);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2085);
				unannPrimitiveType();
				setState(2090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2086);
					match(LBRACK);
					setState(2087);
					match(RBRACK);
					}
					}
					setState(2092);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2093);
				match(DOT);
				setState(2094);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2096);
				match(VOID);
				setState(2097);
				match(DOT);
				setState(2098);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2099);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2100);
				typeName();
				setState(2101);
				match(DOT);
				setState(2102);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2104);
				match(LPAREN);
				setState(2105);
				expression();
				setState(2106);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2108);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2109);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2110);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2111);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2112);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JapyParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JapyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JapyParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JapyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JapyParser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JapyParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(JapyParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2117);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2118);
				typeName();
				setState(2123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2119);
					match(LBRACK);
					setState(2120);
					match(RBRACK);
					}
					}
					setState(2125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2126);
				match(DOT);
				setState(2127);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2129);
				unannPrimitiveType();
				setState(2134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2130);
					match(LBRACK);
					setState(2131);
					match(RBRACK);
					}
					}
					setState(2136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2137);
				match(DOT);
				setState(2138);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2140);
				match(VOID);
				setState(2141);
				match(DOT);
				setState(2142);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2143);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2144);
				typeName();
				setState(2145);
				match(DOT);
				setState(2146);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2148);
				match(LPAREN);
				setState(2149);
				expression();
				setState(2150);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2152);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2153);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2154);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2155);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassLiteralContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JapyParser.CLASS, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(JapyParser.BOOLEAN, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JapyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JapyParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JapyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JapyParser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(JapyParser.VOID, 0); }
		public ClassLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterClassLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitClassLiteral(this);
		}
	}

	public final ClassLiteralContext classLiteral() throws RecognitionException {
		ClassLiteralContext _localctx = new ClassLiteralContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_classLiteral);
		int _la;
		try {
			setState(2175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2161);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case Identifier:
					{
					setState(2158);
					typeName();
					}
					break;
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
					{
					setState(2159);
					numericType();
					}
					break;
				case BOOLEAN:
					{
					setState(2160);
					match(BOOLEAN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2163);
					match(LBRACK);
					setState(2164);
					match(RBRACK);
					}
					}
					setState(2169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2170);
				match(DOT);
				setState(2171);
				match(CLASS);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2172);
				match(VOID);
				setState(2173);
				match(DOT);
				setState(2174);
				match(CLASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(JapyParser.NEW, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JapyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JapyParser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitClassInstanceCreationExpression(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2177);
				match(NEW);
				setState(2179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2178);
					typeArguments();
					}
				}

				setState(2184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2181);
					annotation();
					}
					}
					setState(2186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2187);
				identifier();
				setState(2198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2188);
					match(DOT);
					setState(2192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2189);
						annotation();
						}
						}
						setState(2194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2195);
					identifier();
					}
					}
					setState(2200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2201);
					typeArgumentsOrDiamond();
					}
				}

				setState(2204);
				match(LPAREN);
				setState(2206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2205);
					argumentList();
					}
				}

				setState(2208);
				match(RPAREN);
				setState(2209);
				match(COLON);
				setState(2211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2210);
					classBody();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2213);
				expressionName();
				setState(2214);
				match(DOT);
				setState(2215);
				match(NEW);
				setState(2217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2216);
					typeArguments();
					}
				}

				setState(2222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2219);
					annotation();
					}
					}
					setState(2224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2225);
				identifier();
				setState(2227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2226);
					typeArgumentsOrDiamond();
					}
				}

				setState(2229);
				match(LPAREN);
				setState(2231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2230);
					argumentList();
					}
				}

				setState(2233);
				match(RPAREN);
				setState(2234);
				match(COLON);
				setState(2236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(2235);
					classBody();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2238);
				primary();
				setState(2239);
				match(DOT);
				setState(2240);
				match(NEW);
				setState(2242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2241);
					typeArguments();
					}
				}

				setState(2247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2244);
					annotation();
					}
					}
					setState(2249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2250);
				identifier();
				setState(2252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2251);
					typeArgumentsOrDiamond();
					}
				}

				setState(2254);
				match(LPAREN);
				setState(2256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2255);
					argumentList();
					}
				}

				setState(2258);
				match(RPAREN);
				setState(2259);
				match(COLON);
				setState(2261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(2260);
					classBody();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public TerminalNode NEW() { return getToken(JapyParser.NEW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2265);
			match(DOT);
			setState(2266);
			match(NEW);
			setState(2268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2267);
				typeArguments();
				}
			}

			setState(2273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2270);
				annotation();
				}
				}
				setState(2275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2276);
			identifier();
			setState(2278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2277);
				typeArgumentsOrDiamond();
				}
			}

			setState(2280);
			match(LPAREN);
			setState(2282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(2281);
				argumentList();
				}
			}

			setState(2284);
			match(RPAREN);
			setState(2285);
			match(COLON);
			setState(2287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2286);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(JapyParser.NEW, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JapyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JapyParser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2289);
				match(NEW);
				setState(2291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2290);
					typeArguments();
					}
				}

				setState(2296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2293);
					annotation();
					}
					}
					setState(2298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2299);
				identifier();
				setState(2310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2300);
					match(DOT);
					setState(2304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2301);
						annotation();
						}
						}
						setState(2306);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2307);
					identifier();
					}
					}
					setState(2312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2313);
					typeArgumentsOrDiamond();
					}
				}

				setState(2316);
				match(LPAREN);
				setState(2318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2317);
					argumentList();
					}
				}

				setState(2320);
				match(RPAREN);
				setState(2321);
				match(COLON);
				setState(2323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2322);
					classBody();
					}
					break;
				}
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2325);
				expressionName();
				setState(2326);
				match(DOT);
				setState(2327);
				match(NEW);
				setState(2329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2328);
					typeArguments();
					}
				}

				setState(2334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2331);
					annotation();
					}
					}
					setState(2336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2337);
				identifier();
				setState(2339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2338);
					typeArgumentsOrDiamond();
					}
				}

				setState(2341);
				match(LPAREN);
				setState(2343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2342);
					argumentList();
					}
				}

				setState(2345);
				match(RPAREN);
				setState(2346);
				match(COLON);
				setState(2348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(2347);
					classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode LT() { return getToken(JapyParser.LT, 0); }
		public TerminalNode GT() { return getToken(JapyParser.GT, 0); }
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_typeArgumentsOrDiamond);
		try {
			setState(2355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2352);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2353);
				match(LT);
				setState(2354);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(JapyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JapyParser.DOT, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JapyParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitFieldAccess(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_fieldAccess);
		try {
			setState(2370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2357);
				primary();
				setState(2358);
				match(DOT);
				setState(2359);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2361);
				match(SUPER);
				setState(2362);
				match(DOT);
				setState(2363);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2364);
				typeName();
				setState(2365);
				match(DOT);
				setState(2366);
				match(SUPER);
				setState(2367);
				match(DOT);
				setState(2368);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitFieldAccess_lf_primary(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2372);
			match(DOT);
			setState(2373);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(JapyParser.SUPER, 0); }
		public List<TerminalNode> DOT() { return getTokens(JapyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JapyParser.DOT, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitFieldAccess_lfno_primary(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_fieldAccess_lfno_primary);
		try {
			setState(2384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2375);
				match(SUPER);
				setState(2376);
				match(DOT);
				setState(2377);
				identifier();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2378);
				typeName();
				setState(2379);
				match(DOT);
				setState(2380);
				match(SUPER);
				setState(2381);
				match(DOT);
				setState(2382);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JapyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JapyParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JapyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JapyParser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(2386);
				expressionName();
				setState(2387);
				match(LBRACK);
				setState(2388);
				expression();
				setState(2389);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2391);
				primaryNoNewArray_lfno_arrayAccess();
				setState(2392);
				match(LBRACK);
				setState(2393);
				expression();
				setState(2394);
				match(RBRACK);
				}
				break;
			}
			setState(2405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2398);
				primaryNoNewArray_lf_arrayAccess();
				setState(2399);
				match(LBRACK);
				setState(2400);
				expression();
				setState(2401);
				match(RBRACK);
				}
				}
				setState(2407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JapyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JapyParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JapyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JapyParser.RBRACK, i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitArrayAccess_lf_primary(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2408);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2409);
			match(LBRACK);
			setState(2410);
			expression();
			setState(2411);
			match(RBRACK);
			}
			setState(2420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2413);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2414);
					match(LBRACK);
					setState(2415);
					expression();
					setState(2416);
					match(RBRACK);
					}
					} 
				}
				setState(2422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JapyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JapyParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JapyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JapyParser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitArrayAccess_lfno_primary(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(2423);
				expressionName();
				setState(2424);
				match(LBRACK);
				setState(2425);
				expression();
				setState(2426);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2428);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2429);
				match(LBRACK);
				setState(2430);
				expression();
				setState(2431);
				match(RBRACK);
				}
				break;
			}
			setState(2442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2435);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2436);
					match(LBRACK);
					setState(2437);
					expression();
					setState(2438);
					match(RBRACK);
					}
					} 
				}
				setState(2444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(JapyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JapyParser.DOT, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JapyParser.SUPER, 0); }
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_methodInvocation);
		int _la;
		try {
			setState(2514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2445);
				methodName();
				setState(2446);
				match(LPAREN);
				setState(2448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2447);
					argumentList();
					}
				}

				setState(2450);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2452);
				typeName();
				setState(2453);
				match(DOT);
				setState(2455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2454);
					typeArguments();
					}
				}

				setState(2457);
				identifier();
				setState(2458);
				match(LPAREN);
				setState(2460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2459);
					argumentList();
					}
				}

				setState(2462);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2464);
				expressionName();
				setState(2465);
				match(DOT);
				setState(2467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2466);
					typeArguments();
					}
				}

				setState(2469);
				identifier();
				setState(2470);
				match(LPAREN);
				setState(2472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2471);
					argumentList();
					}
				}

				setState(2474);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2476);
				primary();
				setState(2477);
				match(DOT);
				setState(2479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2478);
					typeArguments();
					}
				}

				setState(2481);
				identifier();
				setState(2482);
				match(LPAREN);
				setState(2484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2483);
					argumentList();
					}
				}

				setState(2486);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2488);
				match(SUPER);
				setState(2489);
				match(DOT);
				setState(2491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2490);
					typeArguments();
					}
				}

				setState(2493);
				identifier();
				setState(2494);
				match(LPAREN);
				setState(2496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2495);
					argumentList();
					}
				}

				setState(2498);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2500);
				typeName();
				setState(2501);
				match(DOT);
				setState(2502);
				match(SUPER);
				setState(2503);
				match(DOT);
				setState(2505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2504);
					typeArguments();
					}
				}

				setState(2507);
				identifier();
				setState(2508);
				match(LPAREN);
				setState(2510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2509);
					argumentList();
					}
				}

				setState(2512);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMethodInvocation_lf_primary(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2516);
			match(DOT);
			setState(2518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2517);
				typeArguments();
				}
			}

			setState(2520);
			identifier();
			setState(2521);
			match(LPAREN);
			setState(2523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(2522);
				argumentList();
				}
			}

			setState(2525);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(JapyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JapyParser.DOT, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JapyParser.SUPER, 0); }
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMethodInvocation_lfno_primary(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2527);
				methodName();
				setState(2528);
				match(LPAREN);
				setState(2530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2529);
					argumentList();
					}
				}

				setState(2532);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2534);
				typeName();
				setState(2535);
				match(DOT);
				setState(2537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2536);
					typeArguments();
					}
				}

				setState(2539);
				identifier();
				setState(2540);
				match(LPAREN);
				setState(2542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2541);
					argumentList();
					}
				}

				setState(2544);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2546);
				expressionName();
				setState(2547);
				match(DOT);
				setState(2549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2548);
					typeArguments();
					}
				}

				setState(2551);
				identifier();
				setState(2552);
				match(LPAREN);
				setState(2554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2553);
					argumentList();
					}
				}

				setState(2556);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2558);
				match(SUPER);
				setState(2559);
				match(DOT);
				setState(2561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2560);
					typeArguments();
					}
				}

				setState(2563);
				identifier();
				setState(2564);
				match(LPAREN);
				setState(2566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2565);
					argumentList();
					}
				}

				setState(2568);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2570);
				typeName();
				setState(2571);
				match(DOT);
				setState(2572);
				match(SUPER);
				setState(2573);
				match(DOT);
				setState(2575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2574);
					typeArguments();
					}
				}

				setState(2577);
				identifier();
				setState(2578);
				match(LPAREN);
				setState(2580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2579);
					argumentList();
					}
				}

				setState(2582);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2586);
			expression();
			setState(2591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2587);
				match(COMMA);
				setState(2588);
				expression();
				}
				}
				setState(2593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(JapyParser.COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JapyParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JapyParser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMethodReference(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_methodReference);
		int _la;
		try {
			setState(2641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2594);
				expressionName();
				setState(2595);
				match(COLONCOLON);
				setState(2597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2596);
					typeArguments();
					}
				}

				setState(2599);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2601);
				referenceType();
				setState(2602);
				match(COLONCOLON);
				setState(2604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2603);
					typeArguments();
					}
				}

				setState(2606);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2608);
				primary();
				setState(2609);
				match(COLONCOLON);
				setState(2611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2610);
					typeArguments();
					}
				}

				setState(2613);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2615);
				match(SUPER);
				setState(2616);
				match(COLONCOLON);
				setState(2618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2617);
					typeArguments();
					}
				}

				setState(2620);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2621);
				typeName();
				setState(2622);
				match(DOT);
				setState(2623);
				match(SUPER);
				setState(2624);
				match(COLONCOLON);
				setState(2626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2625);
					typeArguments();
					}
				}

				setState(2628);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2630);
				classType();
				setState(2631);
				match(COLONCOLON);
				setState(2633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2632);
					typeArguments();
					}
				}

				setState(2635);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2637);
				arrayType();
				setState(2638);
				match(COLONCOLON);
				setState(2639);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(JapyParser.COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMethodReference_lf_primary(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2643);
			match(COLONCOLON);
			setState(2645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2644);
				typeArguments();
				}
			}

			setState(2647);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(JapyParser.COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JapyParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JapyParser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JapyParser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMethodReference_lfno_primary(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2649);
				expressionName();
				setState(2650);
				match(COLONCOLON);
				setState(2652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2651);
					typeArguments();
					}
				}

				setState(2654);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2656);
				referenceType();
				setState(2657);
				match(COLONCOLON);
				setState(2659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2658);
					typeArguments();
					}
				}

				setState(2661);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2663);
				match(SUPER);
				setState(2664);
				match(COLONCOLON);
				setState(2666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2665);
					typeArguments();
					}
				}

				setState(2668);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2669);
				typeName();
				setState(2670);
				match(DOT);
				setState(2671);
				match(SUPER);
				setState(2672);
				match(COLONCOLON);
				setState(2674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2673);
					typeArguments();
					}
				}

				setState(2676);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2678);
				classType();
				setState(2679);
				match(COLONCOLON);
				setState(2681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2680);
					typeArguments();
					}
				}

				setState(2683);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2685);
				arrayType();
				setState(2686);
				match(COLONCOLON);
				setState(2687);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(JapyParser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitArrayCreationExpression(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_arrayCreationExpression);
		try {
			setState(2713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2691);
				match(NEW);
				setState(2692);
				primitiveType();
				setState(2693);
				dimExprs();
				setState(2695);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2694);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2697);
				match(NEW);
				setState(2698);
				classOrInterfaceType();
				setState(2699);
				dimExprs();
				setState(2701);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
				case 1:
					{
					setState(2700);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2703);
				match(NEW);
				setState(2704);
				primitiveType();
				setState(2705);
				dims();
				setState(2706);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2708);
				match(NEW);
				setState(2709);
				classOrInterfaceType();
				setState(2710);
				dims();
				setState(2711);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitDimExprs(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2716); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2715);
					dimExpr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2718); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(JapyParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JapyParser.RBRACK, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitDimExpr(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2720);
				annotation();
				}
				}
				setState(2725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2726);
			match(LBRACK);
			setState(2727);
			expression();
			setState(2728);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2730);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_expression);
		try {
			setState(2734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2732);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2733);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JapyParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2736);
			lambdaParameters();
			setState(2737);
			match(ARROW);
			setState(2738);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_lambdaParameters);
		int _la;
		try {
			setState(2750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2740);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2741);
				match(LPAREN);
				setState(2743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==Identifier) {
					{
					setState(2742);
					formalParameterList();
					}
				}

				setState(2745);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2746);
				match(LPAREN);
				setState(2747);
				inferredFormalParameterList();
				setState(2748);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JapyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JapyParser.COMMA, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitInferredFormalParameterList(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2752);
			identifier();
			setState(2757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2753);
				match(COMMA);
				setState(2754);
				identifier();
				}
				}
				setState(2759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JapyParser.LBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JapyParser.RBRACE, 0); }
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_lambdaBody);
		try {
			setState(2765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case AT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2760);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2761);
				match(LBRACE);
				setState(2762);
				blockStatements();
				setState(2763);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_assignmentExpression);
		try {
			setState(2769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2767);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2768);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2771);
			leftHandSide();
			setState(2772);
			assignmentOperator();
			setState(2773);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitLeftHandSide(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_leftHandSide);
		try {
			setState(2778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2775);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2776);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2777);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(JapyParser.ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JapyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JapyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JapyParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(JapyParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JapyParser.SUB_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(JapyParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(JapyParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(JapyParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(JapyParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(JapyParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(JapyParser.OR_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2780);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ASSIGN - 82)) | (1L << (ADD_ASSIGN - 82)) | (1L << (SUB_ASSIGN - 82)) | (1L << (MUL_ASSIGN - 82)) | (1L << (DIV_ASSIGN - 82)) | (1L << (AND_ASSIGN - 82)) | (1L << (OR_ASSIGN - 82)) | (1L << (XOR_ASSIGN - 82)) | (1L << (MOD_ASSIGN - 82)) | (1L << (LSHIFT_ASSIGN - 82)) | (1L << (RSHIFT_ASSIGN - 82)) | (1L << (URSHIFT_ASSIGN - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JapyParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JapyParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_conditionalExpression);
		try {
			setState(2791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2782);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2783);
				conditionalOrExpression(0);
				setState(2784);
				match(QUESTION);
				setState(2785);
				expression();
				setState(2786);
				match(COLON);
				setState(2789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2787);
					conditionalExpression();
					}
					break;
				case 2:
					{
					setState(2788);
					lambdaExpression();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(JapyParser.OR, 0); }
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 434;
		enterRecursionRule(_localctx, 434, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2794);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2801);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2796);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2797);
					match(OR);
					setState(2798);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2803);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(JapyParser.AND, 0); }
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2805);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2812);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2807);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2808);
					match(AND);
					setState(2809);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(2814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode BITOR() { return getToken(JapyParser.BITOR, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2816);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2818);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2819);
					match(BITOR);
					setState(2820);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(JapyParser.CARET, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2827);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2834);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2829);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2830);
					match(CARET);
					setState(2831);
					andExpression(0);
					}
					} 
				}
				setState(2836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(JapyParser.BITAND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2838);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2845);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2840);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2841);
					match(BITAND);
					setState(2842);
					equalityExpression(0);
					}
					} 
				}
				setState(2847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(JapyParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JapyParser.NOTEQUAL, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2849);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2859);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2857);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2851);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2852);
						match(EQUAL);
						setState(2853);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2854);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2855);
						match(NOTEQUAL);
						setState(2856);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2861);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(JapyParser.LT, 0); }
		public TerminalNode GT() { return getToken(JapyParser.GT, 0); }
		public TerminalNode LE() { return getToken(JapyParser.LE, 0); }
		public TerminalNode GE() { return getToken(JapyParser.GE, 0); }
		public TerminalNode INSTANCEOF() { return getToken(JapyParser.INSTANCEOF, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2863);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2882);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2880);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2865);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2866);
						match(LT);
						setState(2867);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2868);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2869);
						match(GT);
						setState(2870);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2871);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2872);
						match(LE);
						setState(2873);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2874);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2875);
						match(GE);
						setState(2876);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2877);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2878);
						match(INSTANCEOF);
						setState(2879);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public List<TerminalNode> LT() { return getTokens(JapyParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JapyParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JapyParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JapyParser.GT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2886);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2903);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2901);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2888);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2889);
						match(LT);
						setState(2890);
						match(LT);
						setState(2891);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2892);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2893);
						match(GT);
						setState(2894);
						match(GT);
						setState(2895);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2896);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2897);
						match(GT);
						setState(2898);
						match(GT);
						setState(2899);
						match(GT);
						setState(2900);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2905);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(JapyParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JapyParser.SUB, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2907);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2917);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2915);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2909);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2910);
						match(ADD);
						setState(2911);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2912);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2913);
						match(SUB);
						setState(2914);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(JapyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JapyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JapyParser.MOD, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2921);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2934);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2932);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2923);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2924);
						match(MUL);
						setState(2925);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2926);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2927);
						match(DIV);
						setState(2928);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2929);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2930);
						match(MOD);
						setState(2931);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2936);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(JapyParser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(JapyParser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_unaryExpression);
		try {
			setState(2944);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2937);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2938);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2939);
				match(ADD);
				setState(2940);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2941);
				match(SUB);
				setState(2942);
				unaryExpression();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case AT:
			case BANG:
			case TILDE:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(2943);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(JapyParser.INC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPreIncrementExpression(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2946);
			match(INC);
			setState(2947);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(JapyParser.DEC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPreDecrementExpression(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2949);
			match(DEC);
			setState(2950);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(JapyParser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(JapyParser.BANG, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2952);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2953);
				match(TILDE);
				setState(2954);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2955);
				match(BANG);
				setState(2956);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2957);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
			case 1:
				{
				setState(2960);
				primary();
				}
				break;
			case 2:
				{
				setState(2961);
				expressionName();
				}
				break;
			}
			setState(2968);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2966);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2964);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2965);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2970);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(JapyParser.INC, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPostIncrementExpression(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2971);
			postfixExpression();
			setState(2972);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(JapyParser.INC, 0); }
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2974);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(JapyParser.DEC, 0); }
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPostDecrementExpression(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2976);
			postfixExpression();
			setState(2977);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(JapyParser.DEC, 0); }
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2979);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JapyParser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JapyParser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_castExpression);
		int _la;
		try {
			setState(3008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2981);
				match(LPAREN);
				setState(2982);
				primitiveType();
				setState(2983);
				match(RPAREN);
				setState(2984);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2986);
				match(LPAREN);
				setState(2987);
				referenceType();
				setState(2991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2988);
					additionalBound();
					}
					}
					setState(2993);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2994);
				match(RPAREN);
				setState(2995);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2997);
				match(LPAREN);
				setState(2998);
				referenceType();
				setState(3002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2999);
					additionalBound();
					}
					}
					setState(3004);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3005);
				match(RPAREN);
				setState(3006);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JapyParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapyListener ) ((JapyListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3010);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return moduleName_sempred((ModuleNameContext)_localctx, predIndex);
		case 26:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 28:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 31:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 217:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 218:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 219:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 220:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 221:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 222:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 223:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 224:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 225:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 226:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean moduleName_sempred(ModuleNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 3);
		case 22:
			return precpred(_ctx, 2);
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3|\u0bc7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\3\2\3\2\3\3\7\3\u01e2"+
		"\n\3\f\3\16\3\u01e5\13\3\3\3\3\3\7\3\u01e9\n\3\f\3\16\3\u01ec\13\3\3\3"+
		"\5\3\u01ef\n\3\3\4\3\4\5\4\u01f3\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7\u01fc"+
		"\n\7\3\b\3\b\5\b\u0200\n\b\3\b\3\b\7\b\u0204\n\b\f\b\16\b\u0207\13\b\3"+
		"\t\7\t\u020a\n\t\f\t\16\t\u020d\13\t\3\t\3\t\5\t\u0211\n\t\3\t\3\t\3\t"+
		"\7\t\u0216\n\t\f\t\16\t\u0219\13\t\3\t\3\t\5\t\u021d\n\t\5\t\u021f\n\t"+
		"\3\n\3\n\7\n\u0223\n\n\f\n\16\n\u0226\13\n\3\n\3\n\5\n\u022a\n\n\3\13"+
		"\7\13\u022d\n\13\f\13\16\13\u0230\13\13\3\13\3\13\5\13\u0234\n\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\7\17\u023d\n\17\f\17\16\17\u0240\13\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u024d\n\20\3\21"+
		"\7\21\u0250\n\21\f\21\16\21\u0253\13\21\3\21\3\21\3\21\7\21\u0258\n\21"+
		"\f\21\16\21\u025b\13\21\3\21\3\21\7\21\u025f\n\21\f\21\16\21\u0262\13"+
		"\21\3\22\7\22\u0265\n\22\f\22\16\22\u0268\13\22\3\22\3\22\5\22\u026c\n"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0275\n\24\f\24\16\24\u0278"+
		"\13\24\5\24\u027a\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\7\27\u0286\n\27\f\27\16\27\u0289\13\27\3\30\3\30\5\30\u028d\n\30\3"+
		"\31\7\31\u0290\n\31\f\31\16\31\u0293\13\31\3\31\3\31\5\31\u0297\n\31\3"+
		"\32\3\32\3\32\3\32\5\32\u029d\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u02a5\n\33\f\33\16\33\u02a8\13\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u02b0\n\34\f\34\16\34\u02b3\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u02ba"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02c2\n\36\f\36\16\36\u02c5\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\5\37\u02cc\n\37\3 \3 \3!\3!\3!\3!\3!\3!\7"+
		"!\u02d6\n!\f!\16!\u02d9\13!\3\"\7\"\u02dc\n\"\f\"\16\"\u02df\13\"\3\""+
		"\3\"\5\"\u02e3\n\"\3#\5#\u02e6\n#\3#\7#\u02e9\n#\f#\16#\u02ec\13#\3#\7"+
		"#\u02ef\n#\f#\16#\u02f2\13#\3#\3#\3$\7$\u02f7\n$\f$\16$\u02fa\13$\3$\3"+
		"$\3%\7%\u02ff\n%\f%\16%\u0302\13%\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\5"+
		"\'\u030e\n\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\3+\3+\3,\3,\3,\5,\u032b\n,\3-\7-\u032e\n-\f-\16-\u0331\13-\3"+
		"-\5-\u0334\n-\3-\3-\3-\3-\7-\u033a\n-\f-\16-\u033d\13-\3-\3-\3.\3.\7."+
		"\u0343\n.\f.\16.\u0346\13.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0351\n.\f.\16"+
		".\u0354\13.\5.\u0356\n.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0360\n.\f.\16.\u0363"+
		"\13.\5.\u0365\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0373\n.\f.\16"+
		".\u0376\13.\3.\3.\5.\u037a\n.\3/\3/\3\60\3\60\5\60\u0380\n\60\3\61\7\61"+
		"\u0383\n\61\f\61\16\61\u0386\13\61\3\61\3\61\3\61\5\61\u038b\n\61\3\61"+
		"\5\61\u038e\n\61\3\61\5\61\u0391\n\61\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\5\62\u039e\n\62\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\7\64\u03a7\n\64\f\64\16\64\u03aa\13\64\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\7\67\u03b5\n\67\f\67\16\67\u03b8\13\67\38\68\u03bb"+
		"\n8\r8\168\u03bc\38\38\68\u03c1\n8\r8\168\u03c2\38\38\39\39\39\39\59\u03cb"+
		"\n9\3:\3:\3:\3:\3:\5:\u03d2\n:\3;\7;\u03d5\n;\f;\16;\u03d8\13;\3;\3;\3"+
		";\3<\3<\3<\3<\3<\3<\3<\3<\5<\u03e5\n<\3=\3=\3=\7=\u03ea\n=\f=\16=\u03ed"+
		"\13=\3>\3>\3>\5>\u03f2\n>\3?\3?\5?\u03f6\n?\3@\3@\5@\u03fa\n@\3A\3A\5"+
		"A\u03fe\nA\3B\3B\5B\u0402\nB\3C\3C\3C\5C\u0407\nC\3D\3D\5D\u040b\nD\3"+
		"D\3D\7D\u040f\nD\fD\16D\u0412\13D\3E\3E\5E\u0416\nE\3E\3E\3E\7E\u041b"+
		"\nE\fE\16E\u041e\13E\3E\3E\5E\u0422\nE\5E\u0424\nE\3F\3F\7F\u0428\nF\f"+
		"F\16F\u042b\13F\3F\3F\5F\u042f\nF\3G\3G\5G\u0433\nG\3H\3H\3I\3I\3J\3J"+
		"\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0446\nL\3M\7M\u0449\nM\fM\16M\u044c"+
		"\13M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u045c\nN\3O\3O\3O\5"+
		"O\u0461\nO\3O\3O\7O\u0465\nO\fO\16O\u0468\13O\3O\3O\3O\5O\u046d\nO\5O"+
		"\u046f\nO\3P\3P\5P\u0473\nP\3Q\3Q\3Q\5Q\u0478\nQ\3Q\3Q\5Q\u047c\nQ\3R"+
		"\3R\3R\3R\3R\3R\5R\u0484\nR\3S\3S\3S\7S\u0489\nS\fS\16S\u048c\13S\3S\3"+
		"S\3S\7S\u0491\nS\fS\16S\u0494\13S\5S\u0496\nS\3T\7T\u0499\nT\fT\16T\u049c"+
		"\13T\3T\3T\3T\3U\3U\5U\u04a3\nU\3V\7V\u04a6\nV\fV\16V\u04a9\13V\3V\3V"+
		"\7V\u04ad\nV\fV\16V\u04b0\13V\3V\3V\3V\3V\5V\u04b6\nV\3W\7W\u04b9\nW\f"+
		"W\16W\u04bc\13W\3W\3W\3W\3W\5W\u04c2\nW\3W\3W\3X\3X\3X\3Y\3Y\3Y\7Y\u04cc"+
		"\nY\fY\16Y\u04cf\13Y\3Z\3Z\5Z\u04d3\nZ\3[\3[\6[\u04d7\n[\r[\16[\u04d8"+
		"\3[\3[\3[\3[\5[\u04df\n[\3\\\3\\\3]\3]\3]\3]\3^\7^\u04e8\n^\f^\16^\u04eb"+
		"\13^\3^\3^\5^\u04ef\n^\3^\3^\3^\3_\3_\3_\3_\5_\u04f8\n_\3`\5`\u04fb\n"+
		"`\3`\3`\3`\5`\u0500\n`\3`\3`\3a\3a\3b\3b\6b\u0508\nb\rb\16b\u0509\3b\3"+
		"b\5b\u050e\nb\3b\5b\u0511\nb\3b\5b\u0514\nb\3c\5c\u0517\nc\3c\3c\3c\5"+
		"c\u051c\nc\3c\3c\3c\5c\u0521\nc\3c\3c\3c\5c\u0526\nc\3c\3c\3c\3c\3c\5"+
		"c\u052d\nc\3c\3c\3c\5c\u0532\nc\3c\3c\3c\3c\3c\3c\5c\u053a\nc\3c\3c\3"+
		"c\5c\u053f\nc\3c\3c\3c\5c\u0544\nc\3d\7d\u0547\nd\fd\16d\u054a\13d\3d"+
		"\3d\3d\5d\u054f\nd\3d\3d\3d\3e\6e\u0555\ne\re\16e\u0556\3e\3e\5e\u055b"+
		"\ne\3e\5e\u055e\ne\3e\5e\u0561\ne\3e\3e\3f\3f\3f\7f\u0568\nf\ff\16f\u056b"+
		"\13f\3g\7g\u056e\ng\fg\16g\u0571\13g\3g\3g\3g\5g\u0576\ng\3g\5g\u0579"+
		"\ng\3g\3g\5g\u057d\ng\3h\3h\3i\3i\7i\u0583\ni\fi\16i\u0586\13i\3j\3j\5"+
		"j\u058a\nj\3k\7k\u058d\nk\fk\16k\u0590\13k\3k\3k\3k\5k\u0595\nk\3k\5k"+
		"\u0598\nk\3k\3k\3k\3l\3l\3l\3l\3l\3l\3l\5l\u05a4\nl\3m\3m\3m\3n\6n\u05aa"+
		"\nn\rn\16n\u05ab\3n\3n\7n\u05b0\nn\fn\16n\u05b3\13n\3n\3n\3o\3o\3o\3o"+
		"\5o\u05bb\no\3p\7p\u05be\np\fp\16p\u05c1\13p\3p\3p\3p\3q\3q\3q\3q\5q\u05ca"+
		"\nq\3r\7r\u05cd\nr\fr\16r\u05d0\13r\3r\3r\3r\3r\3s\3s\3s\3s\3s\3s\3s\5"+
		"s\u05dd\ns\3t\7t\u05e0\nt\ft\16t\u05e3\13t\3t\3t\3t\3t\3t\3t\3u\6u\u05ec"+
		"\nu\ru\16u\u05ed\3u\3u\7u\u05f2\nu\fu\16u\u05f5\13u\3u\3u\3v\3v\3v\3v"+
		"\5v\u05fd\nv\3w\7w\u0600\nw\fw\16w\u0603\13w\3w\3w\3w\3w\3w\5w\u060a\n"+
		"w\3w\5w\u060d\nw\3x\3x\3x\5x\u0612\nx\3y\3y\3y\3z\3z\3z\5z\u061a\nz\3"+
		"{\3{\3{\3{\5{\u0620\n{\3{\3{\3|\3|\3|\7|\u0627\n|\f|\16|\u062a\13|\3}"+
		"\3}\3}\3}\3~\3~\3~\5~\u0633\n~\3\177\3\177\5\177\u0637\n\177\3\177\5\177"+
		"\u063a\n\177\3\177\3\177\3\u0080\3\u0080\3\u0080\7\u0080\u0641\n\u0080"+
		"\f\u0080\16\u0080\u0644\13\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\5\u0083\u0651\n\u0083"+
		"\3\u0083\5\u0083\u0654\n\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084"+
		"\7\u0084\u065b\n\u0084\f\u0084\16\u0084\u065e\13\u0084\3\u0085\6\u0085"+
		"\u0661\n\u0085\r\u0085\16\u0085\u0662\3\u0086\3\u0086\3\u0086\5\u0086"+
		"\u0668\n\u0086\3\u0087\3\u0087\3\u0088\7\u0088\u066d\n\u0088\f\u0088\16"+
		"\u0088\u0670\13\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\6\u0089"+
		"\u0677\n\u0089\r\u0089\16\u0089\u0678\3\u0089\3\u0089\6\u0089\u067d\n"+
		"\u0089\r\u0089\16\u0089\u067e\3\u0089\3\u0089\5\u0089\u0683\n\u0089\3"+
		"\u008a\3\u008a\3\u008a\7\u008a\u0688\n\u008a\f\u008a\16\u008a\u068b\13"+
		"\u008a\3\u008a\5\u008a\u068e\n\u008a\3\u008a\6\u008a\u0691\n\u008a\r\u008a"+
		"\16\u008a\u0692\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u06a2\n\u008b"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u06b3\n\u008c"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u06c4\n\u0090"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u06cd"+
		"\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\6\u0093\u06d5"+
		"\n\u0093\r\u0093\16\u0093\u06d6\3\u0093\3\u0093\7\u0093\u06db\n\u0093"+
		"\f\u0093\16\u0093\u06de\13\u0093\3\u0093\7\u0093\u06e1\n\u0093\f\u0093"+
		"\16\u0093\u06e4\13\u0093\3\u0093\3\u0093\3\u0094\6\u0094\u06e9\n\u0094"+
		"\r\u0094\16\u0094\u06ea\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095"+
		"\6\u0095\u06f3\n\u0095\r\u0095\16\u0095\u06f4\3\u0096\6\u0096\u06f8\n"+
		"\u0096\r\u0096\16\u0096\u06f9\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\6\u0096\u0701\n\u0096\r\u0096\16\u0096\u0702\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\6\u0096\u070a\n\u0096\r\u0096\16\u0096\u070b\3\u0096"+
		"\3\u0096\5\u0096\u0710\n\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\7\u0098\u071e"+
		"\n\u0098\f\u0098\16\u0098\u0721\13\u0098\3\u0098\3\u0098\3\u0098\5\u0098"+
		"\u0726\n\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b\5\u009b\u0736"+
		"\n\u009b\3\u009c\3\u009c\5\u009c\u073a\n\u009c\3\u009c\3\u009c\5\u009c"+
		"\u073e\n\u009c\3\u009c\3\u009c\5\u009c\u0742\n\u009c\3\u009c\3\u009c\3"+
		"\u009c\3\u009d\3\u009d\5\u009d\u0749\n\u009d\3\u009e\3\u009e\3\u009f\3"+
		"\u009f\3\u009f\7\u009f\u0750\n\u009f\f\u009f\16\u009f\u0753\13\u009f\3"+
		"\u00a0\3\u00a0\7\u00a0\u0757\n\u00a0\f\u00a0\16\u00a0\u075a\13\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\5\u00a1\u0765\n\u00a1\3\u00a2\3\u00a2\5\u00a2\u0769\n\u00a2\3\u00a3\3"+
		"\u00a3\5\u00a3\u076d\n\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u0780\n\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\5\u00a6\u0785\n\u00a6\3\u00a7\6\u00a7\u0788\n\u00a7\r\u00a7\16\u00a7"+
		"\u0789\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\7\u00a9\u0792\n"+
		"\u00a9\f\u00a9\16\u00a9\u0795\13\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00aa"+
		"\3\u00aa\3\u00aa\7\u00aa\u079d\n\u00aa\f\u00aa\16\u00aa\u07a0\13\u00aa"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\5\u00ac\u07ab\n\u00ac\3\u00ac\5\u00ac\u07ae\n\u00ac\3\u00ad\3\u00ad\3"+
		"\u00ad\5\u00ad\u07b3\n\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\7"+
		"\u00ae\u07ba\n\u00ae\f\u00ae\16\u00ae\u07bd\13\u00ae\3\u00af\7\u00af\u07c0"+
		"\n\u00af\f\u00af\16\u00af\u07c3\13\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\5\u00af\u07cb\n\u00af\3\u00b0\3\u00b0\5\u00b0\u07cf\n"+
		"\u00b0\3\u00b1\3\u00b1\5\u00b1\u07d3\n\u00b1\3\u00b1\7\u00b1\u07d6\n\u00b1"+
		"\f\u00b1\16\u00b1\u07d9\13\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\5\u00b2\u07eb\n\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\7\u00b4\u07f3\n\u00b4\f\u00b4\16\u00b4\u07f6\13\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\5\u00b4\u080b\n\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\5\u00b5\u0812\n\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\5\u00b7\u081a\n\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u0820\n"+
		"\u00b8\f\u00b8\16\u00b8\u0823\13\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\7\u00b8\u082b\n\u00b8\f\u00b8\16\u00b8\u082e\13\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\5\u00b8\u0844\n\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\7\u00ba\u084c\n\u00ba\f\u00ba\16\u00ba\u084f\13\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u0857\n\u00ba"+
		"\f\u00ba\16\u00ba\u085a\13\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u086f\n\u00ba\3\u00bb"+
		"\3\u00bb\3\u00bb\5\u00bb\u0874\n\u00bb\3\u00bb\3\u00bb\7\u00bb\u0878\n"+
		"\u00bb\f\u00bb\16\u00bb\u087b\13\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\5\u00bb\u0882\n\u00bb\3\u00bc\3\u00bc\5\u00bc\u0886\n\u00bc\3"+
		"\u00bc\7\u00bc\u0889\n\u00bc\f\u00bc\16\u00bc\u088c\13\u00bc\3\u00bc\3"+
		"\u00bc\3\u00bc\7\u00bc\u0891\n\u00bc\f\u00bc\16\u00bc\u0894\13\u00bc\3"+
		"\u00bc\7\u00bc\u0897\n\u00bc\f\u00bc\16\u00bc\u089a\13\u00bc\3\u00bc\5"+
		"\u00bc\u089d\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u08a1\n\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\5\u00bc\u08a6\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc"+
		"\u08ac\n\u00bc\3\u00bc\7\u00bc\u08af\n\u00bc\f\u00bc\16\u00bc\u08b2\13"+
		"\u00bc\3\u00bc\3\u00bc\5\u00bc\u08b6\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u08ba"+
		"\n\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u08bf\n\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\5\u00bc\u08c5\n\u00bc\3\u00bc\7\u00bc\u08c8\n\u00bc\f"+
		"\u00bc\16\u00bc\u08cb\13\u00bc\3\u00bc\3\u00bc\5\u00bc\u08cf\n\u00bc\3"+
		"\u00bc\3\u00bc\5\u00bc\u08d3\n\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u08d8"+
		"\n\u00bc\5\u00bc\u08da\n\u00bc\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u08df\n"+
		"\u00bd\3\u00bd\7\u00bd\u08e2\n\u00bd\f\u00bd\16\u00bd\u08e5\13\u00bd\3"+
		"\u00bd\3\u00bd\5\u00bd\u08e9\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u08ed\n\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u08f2\n\u00bd\3\u00be\3\u00be\5\u00be"+
		"\u08f6\n\u00be\3\u00be\7\u00be\u08f9\n\u00be\f\u00be\16\u00be\u08fc\13"+
		"\u00be\3\u00be\3\u00be\3\u00be\7\u00be\u0901\n\u00be\f\u00be\16\u00be"+
		"\u0904\13\u00be\3\u00be\7\u00be\u0907\n\u00be\f\u00be\16\u00be\u090a\13"+
		"\u00be\3\u00be\5\u00be\u090d\n\u00be\3\u00be\3\u00be\5\u00be\u0911\n\u00be"+
		"\3\u00be\3\u00be\3\u00be\5\u00be\u0916\n\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\5\u00be\u091c\n\u00be\3\u00be\7\u00be\u091f\n\u00be\f\u00be\16"+
		"\u00be\u0922\13\u00be\3\u00be\3\u00be\5\u00be\u0926\n\u00be\3\u00be\3"+
		"\u00be\5\u00be\u092a\n\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u092f\n\u00be"+
		"\5\u00be\u0931\n\u00be\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0936\n\u00bf\3"+
		"\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0945\n\u00c0\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\5\u00c2\u0953\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u095f\n\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u0966\n\u00c3\f\u00c3\16\u00c3"+
		"\u0969\13\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u0975\n\u00c4\f\u00c4\16\u00c4\u0978"+
		"\13\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\5\u00c5\u0984\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\7\u00c5\u098b\n\u00c5\f\u00c5\16\u00c5\u098e\13\u00c5\3\u00c6"+
		"\3\u00c6\3\u00c6\5\u00c6\u0993\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\5\u00c6\u099a\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u099f\n"+
		"\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09a6\n\u00c6\3"+
		"\u00c6\3\u00c6\3\u00c6\5\u00c6\u09ab\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\5\u00c6\u09b2\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09b7"+
		"\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09be\n\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09c3\n\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09cc\n\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\5\u00c6\u09d1\n\u00c6\3\u00c6\3\u00c6\5\u00c6\u09d5\n\u00c6\3"+
		"\u00c7\3\u00c7\5\u00c7\u09d9\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u09de"+
		"\n\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u09e5\n\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u09ec\n\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\5\u00c8\u09f1\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\5\u00c8\u09f8\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u09fd\n"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0a04\n\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\5\u00c8\u0a09\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0a12\n\u00c8\3\u00c8\3\u00c8\3"+
		"\u00c8\5\u00c8\u0a17\n\u00c8\3\u00c8\3\u00c8\5\u00c8\u0a1b\n\u00c8\3\u00c9"+
		"\3\u00c9\3\u00c9\7\u00c9\u0a20\n\u00c9\f\u00c9\16\u00c9\u0a23\13\u00c9"+
		"\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0a28\n\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\5\u00ca\u0a2f\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\5\u00ca\u0a36\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\5\u00ca\u0a3d\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\5\u00ca\u0a45\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca"+
		"\u0a4c\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca"+
		"\u0a54\n\u00ca\3\u00cb\3\u00cb\5\u00cb\u0a58\n\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cc\3\u00cc\3\u00cc\5\u00cc\u0a5f\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\5\u00cc\u0a66\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\5\u00cc\u0a6d\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\5\u00cc\u0a75\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5"+
		"\u00cc\u0a7c\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5"+
		"\u00cc\u0a84\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a8a\n\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a90\n\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd"+
		"\u0a9c\n\u00cd\3\u00ce\6\u00ce\u0a9f\n\u00ce\r\u00ce\16\u00ce\u0aa0\3"+
		"\u00cf\7\u00cf\u0aa4\n\u00cf\f\u00cf\16\u00cf\u0aa7\13\u00cf\3\u00cf\3"+
		"\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d1\3\u00d1\5\u00d1\u0ab1\n"+
		"\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\5\u00d3"+
		"\u0aba\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0ac1\n"+
		"\u00d3\3\u00d4\3\u00d4\3\u00d4\7\u00d4\u0ac6\n\u00d4\f\u00d4\16\u00d4"+
		"\u0ac9\13\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0ad0"+
		"\n\u00d5\3\u00d6\3\u00d6\5\u00d6\u0ad4\n\u00d6\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0add\n\u00d8\3\u00d9\3\u00d9"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0ae8"+
		"\n\u00da\5\u00da\u0aea\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\7\u00db\u0af2\n\u00db\f\u00db\16\u00db\u0af5\13\u00db\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc\u0afd\n\u00dc\f\u00dc"+
		"\16\u00dc\u0b00\13\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\7\u00dd\u0b08\n\u00dd\f\u00dd\16\u00dd\u0b0b\13\u00dd\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0b13\n\u00de\f\u00de\16\u00de"+
		"\u0b16\13\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\7\u00df"+
		"\u0b1e\n\u00df\f\u00df\16\u00df\u0b21\13\u00df\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0b2c\n\u00e0"+
		"\f\u00e0\16\u00e0\u0b2f\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0b43\n\u00e1\f\u00e1\16\u00e1"+
		"\u0b46\13\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\7\u00e2\u0b58\n\u00e2\f\u00e2\16\u00e2\u0b5b\13\u00e2\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\7\u00e3\u0b66"+
		"\n\u00e3\f\u00e3\16\u00e3\u0b69\13\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\7\u00e4"+
		"\u0b77\n\u00e4\f\u00e4\16\u00e4\u0b7a\13\u00e4\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0b83\n\u00e5\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\5\u00e8\u0b91\n\u00e8\3\u00e9\3\u00e9\5\u00e9\u0b95\n\u00e9\3"+
		"\u00e9\3\u00e9\7\u00e9\u0b99\n\u00e9\f\u00e9\16\u00e9\u0b9c\13\u00e9\3"+
		"\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ed"+
		"\3\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\7\u00ee\u0bb0\n\u00ee\f\u00ee\16\u00ee\u0bb3\13\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0bbb\n\u00ee\f\u00ee\16\u00ee"+
		"\u0bbe\13\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0bc3\n\u00ee\3\u00ef"+
		"\3\u00ef\3\u00ef\2\20\64\66:@\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0"+
		"\u01c2\u01c4\u01c6\u00f0\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4"+
		"\u01d6\u01d8\u01da\u01dc\2\b\3\2BG\7\2\22\22\25\25\'\'))\62\62\4\2\33"+
		"\33  \4\2\r\r\63\63\4\2TTlv\4\2\4\fww\2\u0cdf\2\u01de\3\2\2\2\4\u01ee"+
		"\3\2\2\2\6\u01f2\3\2\2\2\b\u01f4\3\2\2\2\n\u01f6\3\2\2\2\f\u01fb\3\2\2"+
		"\2\16\u01ff\3\2\2\2\20\u021e\3\2\2\2\22\u0220\3\2\2\2\24\u022e\3\2\2\2"+
		"\26\u0235\3\2\2\2\30\u0237\3\2\2\2\32\u0239\3\2\2\2\34\u023e\3\2\2\2\36"+
		"\u024c\3\2\2\2 \u0251\3\2\2\2\"\u0266\3\2\2\2$\u026d\3\2\2\2&\u0279\3"+
		"\2\2\2(\u027b\3\2\2\2*\u027e\3\2\2\2,\u0282\3\2\2\2.\u028c\3\2\2\2\60"+
		"\u0291\3\2\2\2\62\u029c\3\2\2\2\64\u029e\3\2\2\2\66\u02a9\3\2\2\28\u02b9"+
		"\3\2\2\2:\u02bb\3\2\2\2<\u02cb\3\2\2\2>\u02cd\3\2\2\2@\u02cf\3\2\2\2B"+
		"\u02dd\3\2\2\2D\u02e5\3\2\2\2F\u02f8\3\2\2\2H\u0300\3\2\2\2J\u0307\3\2"+
		"\2\2L\u030d\3\2\2\2N\u030f\3\2\2\2P\u0313\3\2\2\2R\u0319\3\2\2\2T\u0320"+
		"\3\2\2\2V\u032a\3\2\2\2X\u032f\3\2\2\2Z\u0379\3\2\2\2\\\u037b\3\2\2\2"+
		"^\u037f\3\2\2\2`\u0384\3\2\2\2b\u039d\3\2\2\2d\u039f\3\2\2\2f\u03a3\3"+
		"\2\2\2h\u03ab\3\2\2\2j\u03ae\3\2\2\2l\u03b1\3\2\2\2n\u03ba\3\2\2\2p\u03ca"+
		"\3\2\2\2r\u03d1\3\2\2\2t\u03d6\3\2\2\2v\u03e4\3\2\2\2x\u03e6\3\2\2\2z"+
		"\u03ee\3\2\2\2|\u03f3\3\2\2\2~\u03f9\3\2\2\2\u0080\u03fd\3\2\2\2\u0082"+
		"\u0401\3\2\2\2\u0084\u0406\3\2\2\2\u0086\u040a\3\2\2\2\u0088\u0423\3\2"+
		"\2\2\u008a\u0425\3\2\2\2\u008c\u0430\3\2\2\2\u008e\u0434\3\2\2\2\u0090"+
		"\u0436\3\2\2\2\u0092\u0438\3\2\2\2\u0094\u043a\3\2\2\2\u0096\u0445\3\2"+
		"\2\2\u0098\u044a\3\2\2\2\u009a\u045b\3\2\2\2\u009c\u046e\3\2\2\2\u009e"+
		"\u0472\3\2\2\2\u00a0\u0474\3\2\2\2\u00a2\u0483\3\2\2\2\u00a4\u0495\3\2"+
		"\2\2\u00a6\u049a\3\2\2\2\u00a8\u04a2\3\2\2\2\u00aa\u04b5\3\2\2\2\u00ac"+
		"\u04ba\3\2\2\2\u00ae\u04c5\3\2\2\2\u00b0\u04c8\3\2\2\2\u00b2\u04d2\3\2"+
		"\2\2\u00b4\u04de\3\2\2\2\u00b6\u04e0\3\2\2\2\u00b8\u04e2\3\2\2\2\u00ba"+
		"\u04e9\3\2\2\2\u00bc\u04f7\3\2\2\2\u00be\u04fa\3\2\2\2\u00c0\u0503\3\2"+
		"\2\2\u00c2\u0513\3\2\2\2\u00c4\u0543\3\2\2\2\u00c6\u0548\3\2\2\2\u00c8"+
		"\u0554\3\2\2\2\u00ca\u0564\3\2\2\2\u00cc\u056f\3\2\2\2\u00ce\u057e\3\2"+
		"\2\2\u00d0\u0580\3\2\2\2\u00d2\u0589\3\2\2\2\u00d4\u058e\3\2\2\2\u00d6"+
		"\u05a3\3\2\2\2\u00d8\u05a5\3\2\2\2\u00da\u05a9\3\2\2\2\u00dc\u05ba\3\2"+
		"\2\2\u00de\u05bf\3\2\2\2\u00e0\u05c9\3\2\2\2\u00e2\u05ce\3\2\2\2\u00e4"+
		"\u05dc\3\2\2\2\u00e6\u05e1\3\2\2\2\u00e8\u05eb\3\2\2\2\u00ea\u05fc\3\2"+
		"\2\2\u00ec\u0601\3\2\2\2\u00ee\u0611\3\2\2\2\u00f0\u0613\3\2\2\2\u00f2"+
		"\u0619\3\2\2\2\u00f4\u061b\3\2\2\2\u00f6\u0623\3\2\2\2\u00f8\u062b\3\2"+
		"\2\2\u00fa\u0632\3\2\2\2\u00fc\u0634\3\2\2\2\u00fe\u063d\3\2\2\2\u0100"+
		"\u0645\3\2\2\2\u0102\u0648\3\2\2\2\u0104\u064e\3\2\2\2\u0106\u0657\3\2"+
		"\2\2\u0108\u0660\3\2\2\2\u010a\u0667\3\2\2\2\u010c\u0669\3\2\2\2\u010e"+
		"\u066e\3\2\2\2\u0110\u0682\3\2\2\2\u0112\u0684\3\2\2\2\u0114\u06a1\3\2"+
		"\2\2\u0116\u06b2\3\2\2\2\u0118\u06b4\3\2\2\2\u011a\u06b6\3\2\2\2\u011c"+
		"\u06ba\3\2\2\2\u011e\u06c3\3\2\2\2\u0120\u06cc\3\2\2\2\u0122\u06ce\3\2"+
		"\2\2\u0124\u06d4\3\2\2\2\u0126\u06e8\3\2\2\2\u0128\u06f2\3\2\2\2\u012a"+
		"\u070f\3\2\2\2\u012c\u0711\3\2\2\2\u012e\u0713\3\2\2\2\u0130\u0727\3\2"+
		"\2\2\u0132\u072c\3\2\2\2\u0134\u0735\3\2\2\2\u0136\u0737\3\2\2\2\u0138"+
		"\u0748\3\2\2\2\u013a\u074a\3\2\2\2\u013c\u074c\3\2\2\2\u013e\u0754\3\2"+
		"\2\2\u0140\u0762\3\2\2\2\u0142\u0766\3\2\2\2\u0144\u076a\3\2\2\2\u0146"+
		"\u076e\3\2\2\2\u0148\u0771\3\2\2\2\u014a\u0784\3\2\2\2\u014c\u0787\3\2"+
		"\2\2\u014e\u078b\3\2\2\2\u0150\u0793\3\2\2\2\u0152\u0799\3\2\2\2\u0154"+
		"\u07a1\3\2\2\2\u0156\u07a5\3\2\2\2\u0158\u07af\3\2\2\2\u015a\u07b6\3\2"+
		"\2\2\u015c\u07ca\3\2\2\2\u015e\u07ce\3\2\2\2\u0160\u07d2\3\2\2\2\u0162"+
		"\u07ea\3\2\2\2\u0164\u07ec\3\2\2\2\u0166\u080a\3\2\2\2\u0168\u0811\3\2"+
		"\2\2\u016a\u0813\3\2\2\2\u016c\u0819\3\2\2\2\u016e\u0843\3\2\2\2\u0170"+
		"\u0845\3\2\2\2\u0172\u086e\3\2\2\2\u0174\u0881\3\2\2\2\u0176\u08d9\3\2"+
		"\2\2\u0178\u08db\3\2\2\2\u017a\u0930\3\2\2\2\u017c\u0935\3\2\2\2\u017e"+
		"\u0944\3\2\2\2\u0180\u0946\3\2\2\2\u0182\u0952\3\2\2\2\u0184\u095e\3\2"+
		"\2\2\u0186\u096a\3\2\2\2\u0188\u0983\3\2\2\2\u018a\u09d4\3\2\2\2\u018c"+
		"\u09d6\3\2\2\2\u018e\u0a1a\3\2\2\2\u0190\u0a1c\3\2\2\2\u0192\u0a53\3\2"+
		"\2\2\u0194\u0a55\3\2\2\2\u0196\u0a83\3\2\2\2\u0198\u0a9b\3\2\2\2\u019a"+
		"\u0a9e\3\2\2\2\u019c\u0aa5\3\2\2\2\u019e\u0aac\3\2\2\2\u01a0\u0ab0\3\2"+
		"\2\2\u01a2\u0ab2\3\2\2\2\u01a4\u0ac0\3\2\2\2\u01a6\u0ac2\3\2\2\2\u01a8"+
		"\u0acf\3\2\2\2\u01aa\u0ad3\3\2\2\2\u01ac\u0ad5\3\2\2\2\u01ae\u0adc\3\2"+
		"\2\2\u01b0\u0ade\3\2\2\2\u01b2\u0ae9\3\2\2\2\u01b4\u0aeb\3\2\2\2\u01b6"+
		"\u0af6\3\2\2\2\u01b8\u0b01\3\2\2\2\u01ba\u0b0c\3\2\2\2\u01bc\u0b17\3\2"+
		"\2\2\u01be\u0b22\3\2\2\2\u01c0\u0b30\3\2\2\2\u01c2\u0b47\3\2\2\2\u01c4"+
		"\u0b5c\3\2\2\2\u01c6\u0b6a\3\2\2\2\u01c8\u0b82\3\2\2\2\u01ca\u0b84\3\2"+
		"\2\2\u01cc\u0b87\3\2\2\2\u01ce\u0b90\3\2\2\2\u01d0\u0b94\3\2\2\2\u01d2"+
		"\u0b9d\3\2\2\2\u01d4\u0ba0\3\2\2\2\u01d6\u0ba2\3\2\2\2\u01d8\u0ba5\3\2"+
		"\2\2\u01da\u0bc2\3\2\2\2\u01dc\u0bc4\3\2\2\2\u01de\u01df\t\2\2\2\u01df"+
		"\3\3\2\2\2\u01e0\u01e2\5\u00f2z\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2"+
		"\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e6\u01ef\5\6\4\2\u01e7\u01e9\5\u00f2z\2\u01e8\u01e7"+
		"\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ef\7\20\2\2\u01ee\u01e3\3"+
		"\2\2\2\u01ee\u01ea\3\2\2\2\u01ef\5\3\2\2\2\u01f0\u01f3\5\b\5\2\u01f1\u01f3"+
		"\5\n\6\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\7\3\2\2\2\u01f4"+
		"\u01f5\t\3\2\2\u01f5\t\3\2\2\2\u01f6\u01f7\t\4\2\2\u01f7\13\3\2\2\2\u01f8"+
		"\u01fc\5\16\b\2\u01f9\u01fc\5\34\17\2\u01fa\u01fc\5\36\20\2\u01fb\u01f8"+
		"\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\r\3\2\2\2\u01fd"+
		"\u0200\5\24\13\2\u01fe\u0200\5\32\16\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe"+
		"\3\2\2\2\u0200\u0205\3\2\2\2\u0201\u0204\5\22\n\2\u0202\u0204\5\30\r\2"+
		"\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203"+
		"\3\2\2\2\u0205\u0206\3\2\2\2\u0206\17\3\2\2\2\u0207\u0205\3\2\2\2\u0208"+
		"\u020a\5\u00f2z\2\u0209\u0208\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209"+
		"\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e"+
		"\u0210\5\u01dc\u00ef\2\u020f\u0211\5*\26\2\u0210\u020f\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211\u021f\3\2\2\2\u0212\u0213\5\16\b\2\u0213\u0217\7P\2\2\u0214"+
		"\u0216\5\u00f2z\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a"+
		"\u021c\5\u01dc\u00ef\2\u021b\u021d\5*\26\2\u021c\u021b\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u020b\3\2\2\2\u021e\u0212\3\2\2\2\u021f"+
		"\21\3\2\2\2\u0220\u0224\7P\2\2\u0221\u0223\5\u00f2z\2\u0222\u0221\3\2"+
		"\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0229\5\u01dc\u00ef\2\u0228\u022a"+
		"\5*\26\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\23\3\2\2\2\u022b"+
		"\u022d\5\u00f2z\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2\2\2\u0231"+
		"\u0233\5\u01dc\u00ef\2\u0232\u0234\5*\26\2\u0233\u0232\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\25\3\2\2\2\u0235\u0236\5\20\t\2\u0236\27\3\2\2\2\u0237"+
		"\u0238\5\22\n\2\u0238\31\3\2\2\2\u0239\u023a\5\24\13\2\u023a\33\3\2\2"+
		"\2\u023b\u023d\5\u00f2z\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2\2\u023e"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023e\3\2"+
		"\2\2\u0241\u0242\5\u01dc\u00ef\2\u0242\35\3\2\2\2\u0243\u0244\5\4\3\2"+
		"\u0244\u0245\5 \21\2\u0245\u024d\3\2\2\2\u0246\u0247\5\16\b\2\u0247\u0248"+
		"\5 \21\2\u0248\u024d\3\2\2\2\u0249\u024a\5\34\17\2\u024a\u024b\5 \21\2"+
		"\u024b\u024d\3\2\2\2\u024c\u0243\3\2\2\2\u024c\u0246\3\2\2\2\u024c\u0249"+
		"\3\2\2\2\u024d\37\3\2\2\2\u024e\u0250\5\u00f2z\2\u024f\u024e\3\2\2\2\u0250"+
		"\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0254\u0255\7L\2\2\u0255\u0260\7M\2\2\u0256\u0258"+
		"\5\u00f2z\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2"+
		"\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d"+
		"\7L\2\2\u025d\u025f\7M\2\2\u025e\u0259\3\2\2\2\u025f\u0262\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261!\3\2\2\2\u0262\u0260\3\2\2\2"+
		"\u0263\u0265\5$\23\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u0266\3\2\2\2\u0269"+
		"\u026b\5\u01dc\u00ef\2\u026a\u026c\5&\24\2\u026b\u026a\3\2\2\2\u026b\u026c"+
		"\3\2\2\2\u026c#\3\2\2\2\u026d\u026e\5\u00f2z\2\u026e%\3\2\2\2\u026f\u0270"+
		"\7\3\2\2\u0270\u027a\5\34\17\2\u0271\u0272\7\3\2\2\u0272\u0276\5\16\b"+
		"\2\u0273\u0275\5(\25\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274"+
		"\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0279"+
		"\u026f\3\2\2\2\u0279\u0271\3\2\2\2\u027a\'\3\2\2\2\u027b\u027c\7h\2\2"+
		"\u027c\u027d\5\26\f\2\u027d)\3\2\2\2\u027e\u027f\7V\2\2\u027f\u0280\5"+
		",\27\2\u0280\u0281\7U\2\2\u0281+\3\2\2\2\u0282\u0287\5.\30\2\u0283\u0284"+
		"\7O\2\2\u0284\u0286\5.\30\2\u0285\u0283\3\2\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288-\3\2\2\2\u0289\u0287\3\2\2\2"+
		"\u028a\u028d\5\f\7\2\u028b\u028d\5\60\31\2\u028c\u028a\3\2\2\2\u028c\u028b"+
		"\3\2\2\2\u028d/\3\2\2\2\u028e\u0290\5\u00f2z\2\u028f\u028e\3\2\2\2\u0290"+
		"\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0294\u0296\7Y\2\2\u0295\u0297\5\62\32\2\u0296"+
		"\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\61\3\2\2\2\u0298\u0299\7\3\2"+
		"\2\u0299\u029d\5\f\7\2\u029a\u029b\7\65\2\2\u029b\u029d\5\f\7\2\u029c"+
		"\u0298\3\2\2\2\u029c\u029a\3\2\2\2\u029d\63\3\2\2\2\u029e\u029f\b\33\1"+
		"\2\u029f\u02a0\5\u01dc\u00ef\2\u02a0\u02a6\3\2\2\2\u02a1\u02a2\f\3\2\2"+
		"\u02a2\u02a3\7P\2\2\u02a3\u02a5\5\u01dc\u00ef\2\u02a4\u02a1\3\2\2\2\u02a5"+
		"\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\65\3\2\2"+
		"\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\b\34\1\2\u02aa\u02ab\5\u01dc\u00ef"+
		"\2\u02ab\u02b1\3\2\2\2\u02ac\u02ad\f\3\2\2\u02ad\u02ae\7P\2\2\u02ae\u02b0"+
		"\5\u01dc\u00ef\2\u02af\u02ac\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3"+
		"\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\67\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4"+
		"\u02ba\5\u01dc\u00ef\2\u02b5\u02b6\5:\36\2\u02b6\u02b7\7P\2\2\u02b7\u02b8"+
		"\5\u01dc\u00ef\2\u02b8\u02ba\3\2\2\2\u02b9\u02b4\3\2\2\2\u02b9\u02b5\3"+
		"\2\2\2\u02ba9\3\2\2\2\u02bb\u02bc\b\36\1\2\u02bc\u02bd\5\u01dc\u00ef\2"+
		"\u02bd\u02c3\3\2\2\2\u02be\u02bf\f\3\2\2\u02bf\u02c0\7P\2\2\u02c0\u02c2"+
		"\5\u01dc\u00ef\2\u02c1\u02be\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3"+
		"\2\2\2\u02c3\u02c4\3\2\2\2\u02c4;\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02cc"+
		"\5\u01dc\u00ef\2\u02c7\u02c8\5@!\2\u02c8\u02c9\7P\2\2\u02c9\u02ca\5\u01dc"+
		"\u00ef\2\u02ca\u02cc\3\2\2\2\u02cb\u02c6\3\2\2\2\u02cb\u02c7\3\2\2\2\u02cc"+
		"=\3\2\2\2\u02cd\u02ce\5\u01dc\u00ef\2\u02ce?\3\2\2\2\u02cf\u02d0\b!\1"+
		"\2\u02d0\u02d1\5\u01dc\u00ef\2\u02d1\u02d7\3\2\2\2\u02d2\u02d3\f\3\2\2"+
		"\u02d3\u02d4\7P\2\2\u02d4\u02d6\5\u01dc\u00ef\2\u02d5\u02d2\3\2\2\2\u02d6"+
		"\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8A\3\2\2\2"+
		"\u02d9\u02d7\3\2\2\2\u02da\u02dc\7A\2\2\u02db\u02da\3\2\2\2\u02dc\u02df"+
		"\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e2\3\2\2\2\u02df"+
		"\u02dd\3\2\2\2\u02e0\u02e3\5D#\2\u02e1\u02e3\5F$\2\u02e2\u02e0\3\2\2\2"+
		"\u02e2\u02e1\3\2\2\2\u02e3C\3\2\2\2\u02e4\u02e6\5H%\2\u02e5\u02e4\3\2"+
		"\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02ea\3\2\2\2\u02e7\u02e9\5L\'\2\u02e8"+
		"\u02e7\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u02f0\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ef\5V,\2\u02ee\u02ed"+
		"\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u02f3\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f4\7\2\2\3\u02f4E\3\2\2\2"+
		"\u02f5\u02f7\5L\'\2\u02f6\u02f5\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6"+
		"\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb"+
		"\u02fc\5X-\2\u02fcG\3\2\2\2\u02fd\u02ff\5J&\2\u02fe\u02fd\3\2\2\2\u02ff"+
		"\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303\3\2"+
		"\2\2\u0302\u0300\3\2\2\2\u0303\u0304\7,\2\2\u0304\u0305\5\66\34\2\u0305"+
		"\u0306\7N\2\2\u0306I\3\2\2\2\u0307\u0308\5\u00f2z\2\u0308K\3\2\2\2\u0309"+
		"\u030e\5N(\2\u030a\u030e\5P)\2\u030b\u030e\5R*\2\u030c\u030e\5T+\2\u030d"+
		"\u0309\3\2\2\2\u030d\u030a\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030c\3\2"+
		"\2\2\u030eM\3\2\2\2\u030f\u0310\7$\2\2\u0310\u0311\58\35\2\u0311\u0312"+
		"\7N\2\2\u0312O\3\2\2\2\u0313\u0314\7$\2\2\u0314\u0315\5:\36\2\u0315\u0316"+
		"\7P\2\2\u0316\u0317\7f\2\2\u0317\u0318\7N\2\2\u0318Q\3\2\2\2\u0319\u031a"+
		"\7$\2\2\u031a\u031b\7\63\2\2\u031b\u031c\58\35\2\u031c\u031d\7P\2\2\u031d"+
		"\u031e\5\u01dc\u00ef\2\u031e\u031f\7N\2\2\u031fS\3\2\2\2\u0320\u0321\7"+
		"$\2\2\u0321\u0322\7\63\2\2\u0322\u0323\58\35\2\u0323\u0324\7P\2\2\u0324"+
		"\u0325\7f\2\2\u0325\u0326\7N\2\2\u0326U\3\2\2\2\u0327\u032b\5^\60\2\u0328"+
		"\u032b\5\u00d2j\2\u0329\u032b\7N\2\2\u032a\u0327\3\2\2\2\u032a\u0328\3"+
		"\2\2\2\u032a\u0329\3\2\2\2\u032bW\3\2\2\2\u032c\u032e\5\u00f2z\2\u032d"+
		"\u032c\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0334\7\4\2\2\u0333"+
		"\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\7\5"+
		"\2\2\u0336\u0337\5\64\33\2\u0337\u033b\7J\2\2\u0338\u033a\5Z.\2\u0339"+
		"\u0338\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2"+
		"\2\2\u033c\u033e\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u033f\7K\2\2\u033f"+
		"Y\3\2\2\2\u0340\u0344\7\6\2\2\u0341\u0343\5\\/\2\u0342\u0341\3\2\2\2\u0343"+
		"\u0346\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0347\3\2"+
		"\2\2\u0346\u0344\3\2\2\2\u0347\u0348\5\64\33\2\u0348\u0349\7N\2\2\u0349"+
		"\u037a\3\2\2\2\u034a\u034b\7\7\2\2\u034b\u0355\5\66\34\2\u034c\u034d\7"+
		"\b\2\2\u034d\u0352\5\64\33\2\u034e\u034f\7O\2\2\u034f\u0351\5\64\33\2"+
		"\u0350\u034e\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u034c\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\7N\2\2\u0358\u037a\3\2"+
		"\2\2\u0359\u035a\7\t\2\2\u035a\u0364\5\66\34\2\u035b\u035c\7\b\2\2\u035c"+
		"\u0361\5\64\33\2\u035d\u035e\7O\2\2\u035e\u0360\5\64\33\2\u035f\u035d"+
		"\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362"+
		"\u0365\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u035b\3\2\2\2\u0364\u0365\3\2"+
		"\2\2\u0365\u0366\3\2\2\2\u0366\u0367\7N\2\2\u0367\u037a\3\2\2\2\u0368"+
		"\u0369\7\n\2\2\u0369\u036a\58\35\2\u036a\u036b\7N\2\2\u036b\u037a\3\2"+
		"\2\2\u036c\u036d\7\13\2\2\u036d\u036e\58\35\2\u036e\u036f\7\f\2\2\u036f"+
		"\u0374\58\35\2\u0370\u0371\7O\2\2\u0371\u0373\58\35\2\u0372\u0370\3\2"+
		"\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375"+
		"\u0377\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u0378\7N\2\2\u0378\u037a\3\2"+
		"\2\2\u0379\u0340\3\2\2\2\u0379\u034a\3\2\2\2\u0379\u0359\3\2\2\2\u0379"+
		"\u0368\3\2\2\2\u0379\u036c\3\2\2\2\u037a[\3\2\2\2\u037b\u037c\t\5\2\2"+
		"\u037c]\3\2\2\2\u037d\u0380\5`\61\2\u037e\u0380\5\u00c6d\2\u037f\u037d"+
		"\3\2\2\2\u037f\u037e\3\2\2\2\u0380_\3\2\2\2\u0381\u0383\5b\62\2\u0382"+
		"\u0381\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2"+
		"\2\2\u0385\u0387\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u0388\7\26\2\2\u0388"+
		"\u038a\5\u01dc\u00ef\2\u0389\u038b\5d\63\2\u038a\u0389\3\2\2\2\u038a\u038b"+
		"\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u038e\5h\65\2\u038d\u038c\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u0391\5j\66\2\u0390\u038f\3\2"+
		"\2\2\u0390\u0391\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\7Z\2\2\u0393"+
		"\u0394\5n8\2\u0394a\3\2\2\2\u0395\u039e\5\u00f2z\2\u0396\u039e\7\60\2"+
		"\2\u0397\u039e\7/\2\2\u0398\u039e\7.\2\2\u0399\u039e\7\16\2\2\u039a\u039e"+
		"\7\63\2\2\u039b\u039e\7\36\2\2\u039c\u039e\7\64\2\2\u039d\u0395\3\2\2"+
		"\2\u039d\u0396\3\2\2\2\u039d\u0397\3\2\2\2\u039d\u0398\3\2\2\2\u039d\u0399"+
		"\3\2\2\2\u039d\u039a\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039c\3\2\2\2\u039e"+
		"c\3\2\2\2\u039f\u03a0\7V\2\2\u03a0\u03a1\5f\64\2\u03a1\u03a2\7U\2\2\u03a2"+
		"e\3\2\2\2\u03a3\u03a8\5\"\22\2\u03a4\u03a5\7O\2\2\u03a5\u03a7\5\"\22\2"+
		"\u03a6\u03a4\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9"+
		"\3\2\2\2\u03a9g\3\2\2\2\u03aa\u03a8\3\2\2\2\u03ab\u03ac\7U\2\2\u03ac\u03ad"+
		"\5\20\t\2\u03adi\3\2\2\2\u03ae\u03af\7e\2\2\u03af\u03b0\5l\67\2\u03b0"+
		"k\3\2\2\2\u03b1\u03b6\5\26\f\2\u03b2\u03b3\7O\2\2\u03b3\u03b5\5\26\f\2"+
		"\u03b4\u03b2\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7"+
		"\3\2\2\2\u03b7m\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03bb\7A\2\2\u03ba\u03b9"+
		"\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be\u03c0\7{\2\2\u03bf\u03c1\5p9\2\u03c0\u03bf\3\2\2"+
		"\2\u03c1\u03c2\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4"+
		"\3\2\2\2\u03c4\u03c5\7|\2\2\u03c5o\3\2\2\2\u03c6\u03cb\5r:\2\u03c7\u03cb"+
		"\5\u00b6\\\2\u03c8\u03cb\5\u00b8]\2\u03c9\u03cb\5\u00ba^\2\u03ca\u03c6"+
		"\3\2\2\2\u03ca\u03c7\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03c9\3\2\2\2\u03cb"+
		"q\3\2\2\2\u03cc\u03d2\5t;\2\u03cd\u03d2\5\u0098M\2\u03ce\u03d2\5^\60\2"+
		"\u03cf\u03d2\5\u00d2j\2\u03d0\u03d2\7N\2\2\u03d1\u03cc\3\2\2\2\u03d1\u03cd"+
		"\3\2\2\2\u03d1\u03ce\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d0\3\2\2\2\u03d2"+
		"s\3\2\2\2\u03d3\u03d5\5v<\2\u03d4\u03d3\3\2\2\2\u03d5\u03d8\3\2\2\2\u03d6"+
		"\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9\3\2\2\2\u03d8\u03d6\3\2"+
		"\2\2\u03d9\u03da\5\u0080A\2\u03da\u03db\5x=\2\u03dbu\3\2\2\2\u03dc\u03e5"+
		"\5\u00f2z\2\u03dd\u03e5\7\60\2\2\u03de\u03e5\7/\2\2\u03df\u03e5\7.\2\2"+
		"\u03e0\u03e5\7\63\2\2\u03e1\u03e5\7\36\2\2\u03e2\u03e5\7;\2\2\u03e3\u03e5"+
		"\7>\2\2\u03e4\u03dc\3\2\2\2\u03e4\u03dd\3\2\2\2\u03e4\u03de\3\2\2\2\u03e4"+
		"\u03df\3\2\2\2\u03e4\u03e0\3\2\2\2\u03e4\u03e1\3\2\2\2\u03e4\u03e2\3\2"+
		"\2\2\u03e4\u03e3\3\2\2\2\u03e5w\3\2\2\2\u03e6\u03eb\5z>\2\u03e7\u03e8"+
		"\7O\2\2\u03e8\u03ea\5z>\2\u03e9\u03e7\3\2\2\2\u03ea\u03ed\3\2\2\2\u03eb"+
		"\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ecy\3\2\2\2\u03ed\u03eb\3\2\2\2"+
		"\u03ee\u03f1\5|?\2\u03ef\u03f0\7T\2\2\u03f0\u03f2\5~@\2\u03f1\u03ef\3"+
		"\2\2\2\u03f1\u03f2\3\2\2\2\u03f2{\3\2\2\2\u03f3\u03f5\5\u01dc\u00ef\2"+
		"\u03f4\u03f6\5 \21\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6}\3"+
		"\2\2\2\u03f7\u03fa\5\u01a0\u00d1\2\u03f8\u03fa\5\u0104\u0083\2\u03f9\u03f7"+
		"\3\2\2\2\u03f9\u03f8\3\2\2\2\u03fa\177\3\2\2\2\u03fb\u03fe\5\u0082B\2"+
		"\u03fc\u03fe\5\u0084C\2\u03fd\u03fb\3\2\2\2\u03fd\u03fc\3\2\2\2\u03fe"+
		"\u0081\3\2\2\2\u03ff\u0402\5\6\4\2\u0400\u0402\7\20\2\2\u0401\u03ff\3"+
		"\2\2\2\u0401\u0400\3\2\2\2\u0402\u0083\3\2\2\2\u0403\u0407\5\u0086D\2"+
		"\u0404\u0407\5\u0094K\2\u0405\u0407\5\u0096L\2\u0406\u0403\3\2\2\2\u0406"+
		"\u0404\3\2\2\2\u0406\u0405\3\2\2\2\u0407\u0085\3\2\2\2\u0408\u040b\5\u008c"+
		"G\2\u0409\u040b\5\u0092J\2\u040a\u0408\3\2\2\2\u040a\u0409\3\2\2\2\u040b"+
		"\u0410\3\2\2\2\u040c\u040f\5\u008aF\2\u040d\u040f\5\u0090I\2\u040e\u040c"+
		"\3\2\2\2\u040e\u040d\3\2\2\2\u040f\u0412\3\2\2\2\u0410\u040e\3\2\2\2\u0410"+
		"\u0411\3\2\2\2\u0411\u0087\3\2\2\2\u0412\u0410\3\2\2\2\u0413\u0415\5\u01dc"+
		"\u00ef\2\u0414\u0416\5*\26\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416"+
		"\u0424\3\2\2\2\u0417\u0418\5\u0086D\2\u0418\u041c\7P\2\2\u0419\u041b\5"+
		"\u00f2z\2\u041a\u0419\3\2\2\2\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2\2"+
		"\u041c\u041d\3\2\2\2\u041d\u041f\3\2\2\2\u041e\u041c\3\2\2\2\u041f\u0421"+
		"\5\u01dc\u00ef\2\u0420\u0422\5*\26\2\u0421\u0420\3\2\2\2\u0421\u0422\3"+
		"\2\2\2\u0422\u0424\3\2\2\2\u0423\u0413\3\2\2\2\u0423\u0417\3\2\2\2\u0424"+
		"\u0089\3\2\2\2\u0425\u0429\7P\2\2\u0426\u0428\5\u00f2z\2\u0427\u0426\3"+
		"\2\2\2\u0428\u042b\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a"+
		"\u042c\3\2\2\2\u042b\u0429\3\2\2\2\u042c\u042e\5\u01dc\u00ef\2\u042d\u042f"+
		"\5*\26\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u008b\3\2\2\2\u0430"+
		"\u0432\5\u01dc\u00ef\2\u0431\u0433\5*\26\2\u0432\u0431\3\2\2\2\u0432\u0433"+
		"\3\2\2\2\u0433\u008d\3\2\2\2\u0434\u0435\5\u0088E\2\u0435\u008f\3\2\2"+
		"\2\u0436\u0437\5\u008aF\2\u0437\u0091\3\2\2\2\u0438\u0439\5\u008cG\2\u0439"+
		"\u0093\3\2\2\2\u043a\u043b\5\u01dc\u00ef\2\u043b\u0095\3\2\2\2\u043c\u043d"+
		"\5\u0082B\2\u043d\u043e\5 \21\2\u043e\u0446\3\2\2\2\u043f\u0440\5\u0086"+
		"D\2\u0440\u0441\5 \21\2\u0441\u0446\3\2\2\2\u0442\u0443\5\u0094K\2\u0443"+
		"\u0444\5 \21\2\u0444\u0446\3\2\2\2\u0445\u043c\3\2\2\2\u0445\u043f\3\2"+
		"\2\2\u0445\u0442\3\2\2\2\u0446\u0097\3\2\2\2\u0447\u0449\5\u009aN\2\u0448"+
		"\u0447\3\2\2\2\u0449\u044c\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2"+
		"\2\2\u044b\u044d\3\2\2\2\u044c\u044a\3\2\2\2\u044d\u044e\5\u009cO\2\u044e"+
		"\u044f\7Z\2\2\u044f\u0450\5\u00b4[\2\u0450\u0099\3\2\2\2\u0451\u045c\5"+
		"\u00f2z\2\u0452\u045c\7\60\2\2\u0453\u045c\7/\2\2\u0454\u045c\7.\2\2\u0455"+
		"\u045c\7\16\2\2\u0456\u045c\7\63\2\2\u0457\u045c\7\36\2\2\u0458\u045c"+
		"\7\67\2\2\u0459\u045c\7*\2\2\u045a\u045c\7\64\2\2\u045b\u0451\3\2\2\2"+
		"\u045b\u0452\3\2\2\2\u045b\u0453\3\2\2\2\u045b\u0454\3\2\2\2\u045b\u0455"+
		"\3\2\2\2\u045b\u0456\3\2\2\2\u045b\u0457\3\2\2\2\u045b\u0458\3\2\2\2\u045b"+
		"\u0459\3\2\2\2\u045b\u045a\3\2\2\2\u045c\u009b\3\2\2\2\u045d\u045e\5\u009e"+
		"P\2\u045e\u0460\5\u00a0Q\2\u045f\u0461\5\u00aeX\2\u0460\u045f\3\2\2\2"+
		"\u0460\u0461\3\2\2\2\u0461\u046f\3\2\2\2\u0462\u0466\5d\63\2\u0463\u0465"+
		"\5\u00f2z\2\u0464\u0463\3\2\2\2\u0465\u0468\3\2\2\2\u0466\u0464\3\2\2"+
		"\2\u0466\u0467\3\2\2\2\u0467\u0469\3\2\2\2\u0468\u0466\3\2\2\2\u0469\u046a"+
		"\5\u009eP\2\u046a\u046c\5\u00a0Q\2\u046b\u046d\5\u00aeX\2\u046c\u046b"+
		"\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046f\3\2\2\2\u046e\u045d\3\2\2\2\u046e"+
		"\u0462\3\2\2\2\u046f\u009d\3\2\2\2\u0470\u0473\5\u0080A\2\u0471\u0473"+
		"\7=\2\2\u0472\u0470\3\2\2\2\u0472\u0471\3\2\2\2\u0473\u009f\3\2\2\2\u0474"+
		"\u0475\5\u01dc\u00ef\2\u0475\u0477\7H\2\2\u0476\u0478\5\u00a2R\2\u0477"+
		"\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\7I"+
		"\2\2\u047a\u047c\5 \21\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047c"+
		"\u00a1\3\2\2\2\u047d\u047e\5\u00a4S\2\u047e\u047f\7O\2\2\u047f\u0480\5"+
		"\u00aaV\2\u0480\u0484\3\2\2\2\u0481\u0484\5\u00aaV\2\u0482\u0484\5\u00ac"+
		"W\2\u0483\u047d\3\2\2\2\u0483\u0481\3\2\2\2\u0483\u0482\3\2\2\2\u0484"+
		"\u00a3\3\2\2\2\u0485\u048a\5\u00a6T\2\u0486\u0487\7O\2\2\u0487\u0489\5"+
		"\u00a6T\2\u0488\u0486\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488\3\2\2\2"+
		"\u048a\u048b\3\2\2\2\u048b\u0496\3\2\2\2\u048c\u048a\3\2\2\2\u048d\u0492"+
		"\5\u00acW\2\u048e\u048f\7O\2\2\u048f\u0491\5\u00a6T\2\u0490\u048e\3\2"+
		"\2\2\u0491\u0494\3\2\2\2\u0492\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493"+
		"\u0496\3\2\2\2\u0494\u0492\3\2\2\2\u0495\u0485\3\2\2\2\u0495\u048d\3\2"+
		"\2\2\u0496\u00a5\3\2\2\2\u0497\u0499\5\u00a8U\2\u0498\u0497\3\2\2\2\u0499"+
		"\u049c\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049d\3\2"+
		"\2\2\u049c\u049a\3\2\2\2\u049d\u049e\5\u0080A\2\u049e\u049f\5|?\2\u049f"+
		"\u00a7\3\2\2\2\u04a0\u04a3\5\u00f2z\2\u04a1\u04a3\7\36\2\2\u04a2\u04a0"+
		"\3\2\2\2\u04a2\u04a1\3\2\2\2\u04a3\u00a9\3\2\2\2\u04a4\u04a6\5\u00a8U"+
		"\2\u04a5\u04a4\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a7\u04a8"+
		"\3\2\2\2\u04a8\u04aa\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04ae\5\u0080A"+
		"\2\u04ab\u04ad\5\u00f2z\2\u04ac\u04ab\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae"+
		"\u04ac\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b1\3\2\2\2\u04b0\u04ae\3\2"+
		"\2\2\u04b1\u04b2\7Q\2\2\u04b2\u04b3\5|?\2\u04b3\u04b6\3\2\2\2\u04b4\u04b6"+
		"\5\u00a6T\2\u04b5\u04a7\3\2\2\2\u04b5\u04b4\3\2\2\2\u04b6\u00ab\3\2\2"+
		"\2\u04b7\u04b9\5\u00f2z\2\u04b8\u04b7\3\2\2\2\u04b9\u04bc\3\2\2\2\u04ba"+
		"\u04b8\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bd\3\2\2\2\u04bc\u04ba\3\2"+
		"\2\2\u04bd\u04c1\5\u0080A\2\u04be\u04bf\5\u01dc\u00ef\2\u04bf\u04c0\7"+
		"P\2\2\u04c0\u04c2\3\2\2\2\u04c1\u04be\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2"+
		"\u04c3\3\2\2\2\u04c3\u04c4\78\2\2\u04c4\u00ad\3\2\2\2\u04c5\u04c6\7:\2"+
		"\2\u04c6\u04c7\5\u00b0Y\2\u04c7\u00af\3\2\2\2\u04c8\u04cd\5\u00b2Z\2\u04c9"+
		"\u04ca\7O\2\2\u04ca\u04cc\5\u00b2Z\2\u04cb\u04c9\3\2\2\2\u04cc\u04cf\3"+
		"\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u00b1\3\2\2\2\u04cf"+
		"\u04cd\3\2\2\2\u04d0\u04d3\5\20\t\2\u04d1\u04d3\5\34\17\2\u04d2\u04d0"+
		"\3\2\2\2\u04d2\u04d1\3\2\2\2\u04d3\u00b3\3\2\2\2\u04d4\u04df\5\u0116\u008c"+
		"\2\u04d5\u04d7\7A\2\2\u04d6\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d6"+
		"\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\7{\2\2\u04db"+
		"\u04dc\5\u0108\u0085\2\u04dc\u04dd\7|\2\2\u04dd\u04df\3\2\2\2\u04de\u04d4"+
		"\3\2\2\2\u04de\u04d6\3\2\2\2\u04df\u00b5\3\2\2\2\u04e0\u04e1\5\u0108\u0085"+
		"\2\u04e1\u00b7\3\2\2\2\u04e2\u04e3\7\63\2\2\u04e3\u04e4\7Z\2\2\u04e4\u04e5"+
		"\5\u0110\u0089\2\u04e5\u00b9\3\2\2\2\u04e6\u04e8\5\u00bc_\2\u04e7\u04e6"+
		"\3\2\2\2\u04e8\u04eb\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea"+
		"\u04ec\3\2\2\2\u04eb\u04e9\3\2\2\2\u04ec\u04ee\5\u00be`\2\u04ed\u04ef"+
		"\5\u00aeX\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2"+
		"\2\u04f0\u04f1\7Z\2\2\u04f1\u04f2\5\u00c2b\2\u04f2\u00bb\3\2\2\2\u04f3"+
		"\u04f8\5\u00f2z\2\u04f4\u04f8\7\60\2\2\u04f5\u04f8\7/\2\2\u04f6\u04f8"+
		"\7.\2\2\u04f7\u04f3\3\2\2\2\u04f7\u04f4\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7"+
		"\u04f6\3\2\2\2\u04f8\u00bd\3\2\2\2\u04f9\u04fb\5d\63\2\u04fa\u04f9\3\2"+
		"\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\5\u00c0a\2\u04fd"+
		"\u04ff\7H\2\2\u04fe\u0500\5\u00a2R\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3"+
		"\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\7I\2\2\u0502\u00bf\3\2\2\2\u0503"+
		"\u0504\5\u01dc\u00ef\2\u0504\u00c1\3\2\2\2\u0505\u0514\5\u0116\u008c\2"+
		"\u0506\u0508\7A\2\2\u0507\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u0507"+
		"\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050d\7{\2\2\u050c"+
		"\u050e\5\u00c4c\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0510"+
		"\3\2\2\2\u050f\u0511\5\u0108\u0085\2\u0510\u050f\3\2\2\2\u0510\u0511\3"+
		"\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\7|\2\2\u0513\u0505\3\2\2\2\u0513"+
		"\u0507\3\2\2\2\u0514\u00c3\3\2\2\2\u0515\u0517\5*\26\2\u0516\u0515\3\2"+
		"\2\2\u0516\u0517\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\78\2\2\u0519"+
		"\u051b\7H\2\2\u051a\u051c\5\u0190\u00c9\2\u051b\u051a\3\2\2\2\u051b\u051c"+
		"\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e\7I\2\2\u051e\u0544\7N\2\2\u051f"+
		"\u0521\5*\26\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522\3\2"+
		"\2\2\u0522\u0523\7\65\2\2\u0523\u0525\7H\2\2\u0524\u0526\5\u0190\u00c9"+
		"\2\u0525\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528"+
		"\7I\2\2\u0528\u0544\7N\2\2\u0529\u052a\5<\37\2\u052a\u052c\7P\2\2\u052b"+
		"\u052d\5*\26\2\u052c\u052b\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e\3\2"+
		"\2\2\u052e\u052f\7\65\2\2\u052f\u0531\7H\2\2\u0530\u0532\5\u0190\u00c9"+
		"\2\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534"+
		"\7I\2\2\u0534\u0535\7N\2\2\u0535\u0544\3\2\2\2\u0536\u0537\5\u0160\u00b1"+
		"\2\u0537\u0539\7P\2\2\u0538\u053a\5*\26\2\u0539\u0538\3\2\2\2\u0539\u053a"+
		"\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\7\65\2\2\u053c\u053e\7H\2\2\u053d"+
		"\u053f\5\u0190\u00c9\2\u053e\u053d\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540"+
		"\3\2\2\2\u0540\u0541\7I\2\2\u0541\u0542\7N\2\2\u0542\u0544\3\2\2\2\u0543"+
		"\u0516\3\2\2\2\u0543\u0520\3\2\2\2\u0543\u0529\3\2\2\2\u0543\u0536\3\2"+
		"\2\2\u0544\u00c5\3\2\2\2\u0545\u0547\5b\62\2\u0546\u0545\3\2\2\2\u0547"+
		"\u054a\3\2\2\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054b\3\2"+
		"\2\2\u054a\u0548\3\2\2\2\u054b\u054c\7\35\2\2\u054c\u054e\5\u01dc\u00ef"+
		"\2\u054d\u054f\5j\66\2\u054e\u054d\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550"+
		"\3\2\2\2\u0550\u0551\7Z\2\2\u0551\u0552\5\u00c8e\2\u0552\u00c7\3\2\2\2"+
		"\u0553\u0555\7A\2\2\u0554\u0553\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0554"+
		"\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055a\7{\2\2\u0559"+
		"\u055b\5\u00caf\2\u055a\u0559\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055d"+
		"\3\2\2\2\u055c\u055e\7O\2\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e"+
		"\u0560\3\2\2\2\u055f\u0561\5\u00d0i\2\u0560\u055f\3\2\2\2\u0560\u0561"+
		"\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\7|\2\2\u0563\u00c9\3\2\2\2\u0564"+
		"\u0569\5\u00ccg\2\u0565\u0566\7O\2\2\u0566\u0568\5\u00ccg\2\u0567\u0565"+
		"\3\2\2\2\u0568\u056b\3\2\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a"+
		"\u00cb\3\2\2\2\u056b\u0569\3\2\2\2\u056c\u056e\5\u00ceh\2\u056d\u056c"+
		"\3\2\2\2\u056e\u0571\3\2\2\2\u056f\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570"+
		"\u0572\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0578\5\u01dc\u00ef\2\u0573\u0575"+
		"\7H\2\2\u0574\u0576\5\u0190\u00c9\2\u0575\u0574\3\2\2\2\u0575\u0576\3"+
		"\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579\7I\2\2\u0578\u0573\3\2\2\2\u0578"+
		"\u0579\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057c\7Z\2\2\u057b\u057d\5n8"+
		"\2\u057c\u057b\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u00cd\3\2\2\2\u057e\u057f"+
		"\5\u00f2z\2\u057f\u00cf\3\2\2\2\u0580\u0584\7N\2\2\u0581\u0583\5p9\2\u0582"+
		"\u0581\3\2\2\2\u0583\u0586\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2"+
		"\2\2\u0585\u00d1\3\2\2\2\u0586\u0584\3\2\2\2\u0587\u058a\5\u00d4k\2\u0588"+
		"\u058a\5\u00e6t\2\u0589\u0587\3\2\2\2\u0589\u0588\3\2\2\2\u058a\u00d3"+
		"\3\2\2\2\u058b\u058d\5\u00d6l\2\u058c\u058b\3\2\2\2\u058d\u0590\3\2\2"+
		"\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0591\3\2\2\2\u0590\u058e"+
		"\3\2\2\2\u0591\u0592\7(\2\2\u0592\u0594\5\u01dc\u00ef\2\u0593\u0595\5"+
		"d\63\2\u0594\u0593\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0597\3\2\2\2\u0596"+
		"\u0598\5\u00d8m\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599"+
		"\3\2\2\2\u0599\u059a\7Z\2\2\u059a\u059b\5\u00dan\2\u059b\u00d5\3\2\2\2"+
		"\u059c\u05a4\5\u00f2z\2\u059d\u05a4\7\60\2\2\u059e\u05a4\7/\2\2\u059f"+
		"\u05a4\7.\2\2\u05a0\u05a4\7\16\2\2\u05a1\u05a4\7\63\2\2\u05a2\u05a4\7"+
		"\64\2\2\u05a3\u059c\3\2\2\2\u05a3\u059d\3\2\2\2\u05a3\u059e\3\2\2\2\u05a3"+
		"\u059f\3\2\2\2\u05a3\u05a0\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3\u05a2\3\2"+
		"\2\2\u05a4\u00d7\3\2\2\2\u05a5\u05a6\7U\2\2\u05a6\u05a7\5l\67\2\u05a7"+
		"\u00d9\3\2\2\2\u05a8\u05aa\7A\2\2\u05a9\u05a8\3\2\2\2\u05aa\u05ab\3\2"+
		"\2\2\u05ab\u05a9\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad"+
		"\u05b1\7{\2\2\u05ae\u05b0\5\u00dco\2\u05af\u05ae\3\2\2\2\u05b0\u05b3\3"+
		"\2\2\2\u05b1\u05af\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b4\3\2\2\2\u05b3"+
		"\u05b1\3\2\2\2\u05b4\u05b5\7|\2\2\u05b5\u00db\3\2\2\2\u05b6\u05bb\5\u00de"+
		"p\2\u05b7\u05bb\5\u00e2r\2\u05b8\u05bb\5^\60\2\u05b9\u05bb\5\u00d2j\2"+
		"\u05ba\u05b6\3\2\2\2\u05ba\u05b7\3\2\2\2\u05ba\u05b8\3\2\2\2\u05ba\u05b9"+
		"\3\2\2\2\u05bb\u00dd\3\2\2\2\u05bc\u05be\5\u00e0q\2\u05bd\u05bc\3\2\2"+
		"\2\u05be\u05c1\3\2\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c2"+
		"\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c2\u05c3\5\u0080A\2\u05c3\u05c4\5x=\2"+
		"\u05c4\u00df\3\2\2\2\u05c5\u05ca\5\u00f2z\2\u05c6\u05ca\7\60\2\2\u05c7"+
		"\u05ca\7\63\2\2\u05c8\u05ca\7\36\2\2\u05c9\u05c5\3\2\2\2\u05c9\u05c6\3"+
		"\2\2\2\u05c9\u05c7\3\2\2\2\u05c9\u05c8\3\2\2\2\u05ca\u00e1\3\2\2\2\u05cb"+
		"\u05cd\5\u00e4s\2\u05cc\u05cb\3\2\2\2\u05cd\u05d0\3\2\2\2\u05ce\u05cc"+
		"\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d1\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d1"+
		"\u05d2\5\u009cO\2\u05d2\u05d3\7Z\2\2\u05d3\u05d4\5\u00b4[\2\u05d4\u00e3"+
		"\3\2\2\2\u05d5\u05dd\5\u00f2z\2\u05d6\u05dd\7\60\2\2\u05d7\u05dd\7.\2"+
		"\2\u05d8\u05dd\7\16\2\2\u05d9\u05dd\7\31\2\2\u05da\u05dd\7\63\2\2\u05db"+
		"\u05dd\7\64\2\2\u05dc\u05d5\3\2\2\2\u05dc\u05d6\3\2\2\2\u05dc\u05d7\3"+
		"\2\2\2\u05dc\u05d8\3\2\2\2\u05dc\u05d9\3\2\2\2\u05dc\u05da\3\2\2\2\u05dc"+
		"\u05db\3\2\2\2\u05dd\u00e5\3\2\2\2\u05de\u05e0\5\u00d6l\2\u05df\u05de"+
		"\3\2\2\2\u05e0\u05e3\3\2\2\2\u05e1\u05df\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2"+
		"\u05e4\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e4\u05e5\7R\2\2\u05e5\u05e6\7(\2"+
		"\2\u05e6\u05e7\5\u01dc\u00ef\2\u05e7\u05e8\7Z\2\2\u05e8\u05e9\5\u00e8"+
		"u\2\u05e9\u00e7\3\2\2\2\u05ea\u05ec\7A\2\2\u05eb\u05ea\3\2\2\2\u05ec\u05ed"+
		"\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef"+
		"\u05f3\7{\2\2\u05f0\u05f2\5\u00eav\2\u05f1\u05f0\3\2\2\2\u05f2\u05f5\3"+
		"\2\2\2\u05f3\u05f1\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f6\3\2\2\2\u05f5"+
		"\u05f3\3\2\2\2\u05f6\u05f7\7|\2\2\u05f7\u00e9\3\2\2\2\u05f8\u05fd\5\u00ec"+
		"w\2\u05f9\u05fd\5\u00dep\2\u05fa\u05fd\5^\60\2\u05fb\u05fd\5\u00d2j\2"+
		"\u05fc\u05f8\3\2\2\2\u05fc\u05f9\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fb"+
		"\3\2\2\2\u05fd\u00eb\3\2\2\2\u05fe\u0600\5\u00eex\2\u05ff\u05fe\3\2\2"+
		"\2\u0600\u0603\3\2\2\2\u0601\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0604"+
		"\3\2\2\2\u0603\u0601\3\2\2\2\u0604\u0605\5\u0080A\2\u0605\u0606\5\u01dc"+
		"\u00ef\2\u0606\u0607\7H\2\2\u0607\u0609\7I\2\2\u0608\u060a\5 \21\2\u0609"+
		"\u0608\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060c\3\2\2\2\u060b\u060d\5\u00f0"+
		"y\2\u060c\u060b\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u00ed\3\2\2\2\u060e"+
		"\u0612\5\u00f2z\2\u060f\u0612\7\60\2\2\u0610\u0612\7\16\2\2\u0611\u060e"+
		"\3\2\2\2\u0611\u060f\3\2\2\2\u0611\u0610\3\2\2\2\u0612\u00ef\3\2\2\2\u0613"+
		"\u0614\7\31\2\2\u0614\u0615\5\u00fa~\2\u0615\u00f1\3\2\2\2\u0616\u061a"+
		"\5\u00f4{\2\u0617\u061a\5\u0100\u0081\2\u0618\u061a\5\u0102\u0082\2\u0619"+
		"\u0616\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u0618\3\2\2\2\u061a\u00f3\3\2"+
		"\2\2\u061b\u061c\7R\2\2\u061c\u061d\58\35\2\u061d\u061f\7H\2\2\u061e\u0620"+
		"\5\u00f6|\2\u061f\u061e\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2\2"+
		"\2\u0621\u0622\7I\2\2\u0622\u00f5\3\2\2\2\u0623\u0628\5\u00f8}\2\u0624"+
		"\u0625\7O\2\2\u0625\u0627\5\u00f8}\2\u0626\u0624\3\2\2\2\u0627\u062a\3"+
		"\2\2\2\u0628\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u00f7\3\2\2\2\u062a"+
		"\u0628\3\2\2\2\u062b\u062c\5\u01dc\u00ef\2\u062c\u062d\7T\2\2\u062d\u062e"+
		"\5\u00fa~\2\u062e\u00f9\3\2\2\2\u062f\u0633\5\u01b2\u00da\2\u0630\u0633"+
		"\5\u00fc\177\2\u0631\u0633\5\u00f2z\2\u0632\u062f\3\2\2\2\u0632\u0630"+
		"\3\2\2\2\u0632\u0631\3\2\2\2\u0633\u00fb\3\2\2\2\u0634\u0636\7J\2\2\u0635"+
		"\u0637\5\u00fe\u0080\2\u0636\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0639"+
		"\3\2\2\2\u0638\u063a\7O\2\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a"+
		"\u063b\3\2\2\2\u063b\u063c\7K\2\2\u063c\u00fd\3\2\2\2\u063d\u0642\5\u00fa"+
		"~\2\u063e\u063f\7O\2\2\u063f\u0641\5\u00fa~\2\u0640\u063e\3\2\2\2\u0641"+
		"\u0644\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u00ff\3\2"+
		"\2\2\u0644\u0642\3\2\2\2\u0645\u0646\7R\2\2\u0646\u0647\58\35\2\u0647"+
		"\u0101\3\2\2\2\u0648\u0649\7R\2\2\u0649\u064a\58\35\2\u064a\u064b\7H\2"+
		"\2\u064b\u064c\5\u00fa~\2\u064c\u064d\7I\2\2\u064d\u0103\3\2\2\2\u064e"+
		"\u0650\7J\2\2\u064f\u0651\5\u0106\u0084\2\u0650\u064f\3\2\2\2\u0650\u0651"+
		"\3\2\2\2\u0651\u0653\3\2\2\2\u0652\u0654\7O\2\2\u0653\u0652\3\2\2\2\u0653"+
		"\u0654\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0656\7K\2\2\u0656\u0105\3\2"+
		"\2\2\u0657\u065c\5~@\2\u0658\u0659\7O\2\2\u0659\u065b\5~@\2\u065a\u0658"+
		"\3\2\2\2\u065b\u065e\3\2\2\2\u065c\u065a\3\2\2\2\u065c\u065d\3\2\2\2\u065d"+
		"\u0107\3\2\2\2\u065e\u065c\3\2\2\2\u065f\u0661\5\u010a\u0086\2\u0660\u065f"+
		"\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663"+
		"\u0109\3\2\2\2\u0664\u0668\5\u010c\u0087\2\u0665\u0668\5^\60\2\u0666\u0668"+
		"\5\u0116\u008c\2\u0667\u0664\3\2\2\2\u0667\u0665\3\2\2\2\u0667\u0666\3"+
		"\2\2\2\u0668\u010b\3\2\2\2\u0669\u066a\5\u010e\u0088\2\u066a\u010d\3\2"+
		"\2\2\u066b\u066d\5\u00a8U\2\u066c\u066b\3\2\2\2\u066d\u0670\3\2\2\2\u066e"+
		"\u066c\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0671\3\2\2\2\u0670\u066e\3\2"+
		"\2\2\u0671\u0672\5\u0080A\2\u0672\u0673\5x=\2\u0673\u010f\3\2\2\2\u0674"+
		"\u0683\5\u0112\u008a\2\u0675\u0677\7A\2\2\u0676\u0675\3\2\2\2\u0677\u0678"+
		"\3\2\2\2\u0678\u0676\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067a\3\2\2\2\u067a"+
		"\u067c\7{\2\2\u067b\u067d\5\u0116\u008c\2\u067c\u067b\3\2\2\2\u067d\u067e"+
		"\3\2\2\2\u067e\u067c\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680\3\2\2\2\u0680"+
		"\u0681\7|\2\2\u0681\u0683\3\2\2\2\u0682\u0674\3\2\2\2\u0682\u0676\3\2"+
		"\2\2\u0683\u0111\3\2\2\2\u0684\u0689\5\u0114\u008b\2\u0685\u0686\7N\2"+
		"\2\u0686\u0688\5\u0114\u008b\2\u0687\u0685\3\2\2\2\u0688\u068b\3\2\2\2"+
		"\u0689\u0687\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068d\3\2\2\2\u068b\u0689"+
		"\3\2\2\2\u068c\u068e\7N\2\2\u068d\u068c\3\2\2\2\u068d\u068e\3\2\2\2\u068e"+
		"\u0690\3\2\2\2\u068f\u0691\7A\2\2\u0690\u068f\3\2\2\2\u0691\u0692\3\2"+
		"\2\2\u0692\u0690\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0113\3\2\2\2\u0694"+
		"\u06a2\5\u0118\u008d\2\u0695\u06a2\5\u011c\u008f\2\u0696\u06a2\5\u0120"+
		"\u0091\2\u0697\u06a2\5\u0132\u009a\2\u0698\u06a2\5\u0140\u00a1\2\u0699"+
		"\u06a2\5\u0142\u00a2\2\u069a\u06a2\5\u0144\u00a3\2\u069b\u06a2\5\u0148"+
		"\u00a5\2\u069c\u06a2\5\u0146\u00a4\2\u069d\u06a2\5\u014a\u00a6\2\u069e"+
		"\u06a2\5\u012e\u0098\2\u069f\u06a2\5\u0130\u0099\2\u06a0\u06a2\5\u0134"+
		"\u009b\2\u06a1\u0694\3\2\2\2\u06a1\u0695\3\2\2\2\u06a1\u0696\3\2\2\2\u06a1"+
		"\u0697\3\2\2\2\u06a1\u0698\3\2\2\2\u06a1\u0699\3\2\2\2\u06a1\u069a\3\2"+
		"\2\2\u06a1\u069b\3\2\2\2\u06a1\u069c\3\2\2\2\u06a1\u069d\3\2\2\2\u06a1"+
		"\u069e\3\2\2\2\u06a1\u069f\3\2\2\2\u06a1\u06a0\3\2\2\2\u06a2\u0115\3\2"+
		"\2\2\u06a3\u06b3\5\u0118\u008d\2\u06a4\u06b3\5\u011c\u008f\2\u06a5\u06b3"+
		"\5\u0120\u0091\2\u06a6\u06b3\5\u0132\u009a\2\u06a7\u06b3\5\u0140\u00a1"+
		"\2\u06a8\u06b3\5\u0142\u00a2\2\u06a9\u06b3\5\u0144\u00a3\2\u06aa\u06b3"+
		"\5\u0148\u00a5\2\u06ab\u06b3\5\u0146\u00a4\2\u06ac\u06b3\5\u014a\u00a6"+
		"\2\u06ad\u06b3\5\u012e\u0098\2\u06ae\u06b3\5\u0130\u0099\2\u06af\u06b3"+
		"\5\u0134\u009b\2\u06b0\u06b3\5\u0122\u0092\2\u06b1\u06b3\5\u011a\u008e"+
		"\2\u06b2\u06a3\3\2\2\2\u06b2\u06a4\3\2\2\2\u06b2\u06a5\3\2\2\2\u06b2\u06a6"+
		"\3\2\2\2\u06b2\u06a7\3\2\2\2\u06b2\u06a8\3\2\2\2\u06b2\u06a9\3\2\2\2\u06b2"+
		"\u06aa\3\2\2\2\u06b2\u06ab\3\2\2\2\u06b2\u06ac\3\2\2\2\u06b2\u06ad\3\2"+
		"\2\2\u06b2\u06ae\3\2\2\2\u06b2\u06af\3\2\2\2\u06b2\u06b0\3\2\2\2\u06b2"+
		"\u06b1\3\2\2\2\u06b3\u0117\3\2\2\2\u06b4\u06b5\7-\2\2\u06b5\u0119\3\2"+
		"\2\2\u06b6\u06b7\5\u01dc\u00ef\2\u06b7\u06b8\7Z\2\2\u06b8\u06b9\5\u0116"+
		"\u008c\2\u06b9\u011b\3\2\2\2\u06ba\u06bb\5\u011e\u0090\2\u06bb\u011d\3"+
		"\2\2\2\u06bc\u06c4\5\u01ac\u00d7\2\u06bd\u06c4\5\u01ca\u00e6\2\u06be\u06c4"+
		"\5\u01cc\u00e7\2\u06bf\u06c4\5\u01d2\u00ea\2\u06c0\u06c4\5\u01d6\u00ec"+
		"\2\u06c1\u06c4\5\u018a\u00c6\2\u06c2\u06c4\5\u0176\u00bc\2\u06c3\u06bc"+
		"\3\2\2\2\u06c3\u06bd\3\2\2\2\u06c3\u06be\3\2\2\2\u06c3\u06bf\3\2\2\2\u06c3"+
		"\u06c0\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c3\u06c2\3\2\2\2\u06c4\u011f\3\2"+
		"\2\2\u06c5\u06c6\7\17\2\2\u06c6\u06cd\5\u01a0\u00d1\2\u06c7\u06c8\7\17"+
		"\2\2\u06c8\u06c9\5\u01a0\u00d1\2\u06c9\u06ca\7Z\2\2\u06ca\u06cb\5\u01a0"+
		"\u00d1\2\u06cb\u06cd\3\2\2\2\u06cc\u06c5\3\2\2\2\u06cc\u06c7\3\2\2\2\u06cd"+
		"\u0121\3\2\2\2\u06ce\u06cf\7\66\2\2\u06cf\u06d0\5\u01a0\u00d1\2\u06d0"+
		"\u06d1\7Z\2\2\u06d1\u06d2\5\u0124\u0093\2\u06d2\u0123\3\2\2\2\u06d3\u06d5"+
		"\7A\2\2\u06d4\u06d3\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d4\3\2\2\2\u06d6"+
		"\u06d7\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06dc\7{\2\2\u06d9\u06db\5\u0126"+
		"\u0094\2\u06da\u06d9\3\2\2\2\u06db\u06de\3\2\2\2\u06dc\u06da\3\2\2\2\u06dc"+
		"\u06dd\3\2\2\2\u06dd\u06e2\3\2\2\2\u06de\u06dc\3\2\2\2\u06df\u06e1\5\u012a"+
		"\u0096\2\u06e0\u06df\3\2\2\2\u06e1\u06e4\3\2\2\2\u06e2\u06e0\3\2\2\2\u06e2"+
		"\u06e3\3\2\2\2\u06e3\u06e5\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e5\u06e6\7|"+
		"\2\2\u06e6\u0125\3\2\2\2\u06e7\u06e9\7A\2\2\u06e8\u06e7\3\2\2\2\u06e9"+
		"\u06ea\3\2\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ec\3\2"+
		"\2\2\u06ec\u06ed\7{\2\2\u06ed\u06ee\5\u0128\u0095\2\u06ee\u06ef\5\u0108"+
		"\u0085\2\u06ef\u06f0\7|\2\2\u06f0\u0127\3\2\2\2\u06f1\u06f3\5\u012a\u0096"+
		"\2\u06f2\u06f1\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f4\u06f5"+
		"\3\2\2\2\u06f5\u0129\3\2\2\2\u06f6\u06f8\7A\2\2\u06f7\u06f6\3\2\2\2\u06f8"+
		"\u06f9\3\2\2\2\u06f9\u06f7\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fb\3\2"+
		"\2\2\u06fb\u06fc\7\23\2\2\u06fc\u06fd\5\u019e\u00d0\2\u06fd\u06fe\7Z\2"+
		"\2\u06fe\u0710\3\2\2\2\u06ff\u0701\7A\2\2\u0700\u06ff\3\2\2\2\u0701\u0702"+
		"\3\2\2\2\u0702\u0700\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0704\3\2\2\2\u0704"+
		"\u0705\7\23\2\2\u0705\u0706\5\u012c\u0097\2\u0706\u0707\7Z\2\2\u0707\u0710"+
		"\3\2\2\2\u0708\u070a\7A\2\2\u0709\u0708\3\2\2\2\u070a\u070b\3\2\2\2\u070b"+
		"\u0709\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070e\7\31"+
		"\2\2\u070e\u0710\7Z\2\2\u070f\u06f7\3\2\2\2\u070f\u0700\3\2\2\2\u070f"+
		"\u0709\3\2\2\2\u0710\u012b\3\2\2\2\u0711\u0712\5\u01dc\u00ef\2\u0712\u012d"+
		"\3\2\2\2\u0713\u0714\7\"\2\2\u0714\u0715\5\u01a0\u00d1\2\u0715\u0716\7"+
		"Z\2\2\u0716\u071f\5\u0110\u0089\2\u0717\u0718\7\34\2\2\u0718\u0719\7\""+
		"\2\2\u0719\u071a\5\u01a0\u00d1\2\u071a\u071b\7Z\2\2\u071b\u071c\5\u0110"+
		"\u0089\2\u071c\u071e\3\2\2\2\u071d\u0717\3\2\2\2\u071e\u0721\3\2\2\2\u071f"+
		"\u071d\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0725\3\2\2\2\u0721\u071f\3\2"+
		"\2\2\u0722\u0723\7\34\2\2\u0723\u0724\7Z\2\2\u0724\u0726\5\u0110\u0089"+
		"\2\u0725\u0722\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u012f\3\2\2\2\u0727\u0728"+
		"\7?\2\2\u0728\u0729\5\u01a0\u00d1\2\u0729\u072a\7Z\2\2\u072a\u072b\5\u0110"+
		"\u0089\2\u072b\u0131\3\2\2\2\u072c\u072d\7\32\2\2\u072d\u072e\7?\2\2\u072e"+
		"\u072f\5\u01a0\u00d1\2\u072f\u0730\5\u01a0\u00d1\2\u0730\u0731\7Z\2\2"+
		"\u0731\u0732\5\u0110\u0089\2\u0732\u0133\3\2\2\2\u0733\u0736\5\u0136\u009c"+
		"\2\u0734\u0736\5\u013e\u00a0\2\u0735\u0733\3\2\2\2\u0735\u0734\3\2\2\2"+
		"\u0736\u0135\3\2\2\2\u0737\u0739\7!\2\2\u0738\u073a\5\u0138\u009d\2\u0739"+
		"\u0738\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073d\7N"+
		"\2\2\u073c\u073e\5\u01a0\u00d1\2\u073d\u073c\3\2\2\2\u073d\u073e\3\2\2"+
		"\2\u073e\u073f\3\2\2\2\u073f\u0741\7N\2\2\u0740\u0742\5\u013a\u009e\2"+
		"\u0741\u0740\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0744"+
		"\7Z\2\2\u0744\u0745\5\u0110\u0089\2\u0745\u0137\3\2\2\2\u0746\u0749\5"+
		"\u013c\u009f\2\u0747\u0749\5\u010e\u0088\2\u0748\u0746\3\2\2\2\u0748\u0747"+
		"\3\2\2\2\u0749\u0139\3\2\2\2\u074a\u074b\5\u013c\u009f\2\u074b\u013b\3"+
		"\2\2\2\u074c\u0751\5\u011e\u0090\2\u074d\u074e\7O\2\2\u074e\u0750\5\u011e"+
		"\u0090\2\u074f\u074d\3\2\2\2\u0750\u0753\3\2\2\2\u0751\u074f\3\2\2\2\u0751"+
		"\u0752\3\2\2\2\u0752\u013d\3\2\2\2\u0753\u0751\3\2\2\2\u0754\u0758\7!"+
		"\2\2\u0755\u0757\5\u00a8U\2\u0756\u0755\3\2\2\2\u0757\u075a\3\2\2\2\u0758"+
		"\u0756\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075b\3\2\2\2\u075a\u0758\3\2"+
		"\2\2\u075b\u075c\5\u0080A\2\u075c\u075d\5|?\2\u075d\u075e\7&\2\2\u075e"+
		"\u075f\5\u01a0\u00d1\2\u075f\u0760\7Z\2\2\u0760\u0761\5\u0110\u0089\2"+
		"\u0761\u013f\3\2\2\2\u0762\u0764\7\21\2\2\u0763\u0765\5\u01dc\u00ef\2"+
		"\u0764\u0763\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0141\3\2\2\2\u0766\u0768"+
		"\7\30\2\2\u0767\u0769\5\u01dc\u00ef\2\u0768\u0767\3\2\2\2\u0768\u0769"+
		"\3\2\2\2\u0769\u0143\3\2\2\2\u076a\u076c\7\61\2\2\u076b\u076d\5\u01a0"+
		"\u00d1\2\u076c\u076b\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u0145\3\2\2\2\u076e"+
		"\u076f\79\2\2\u076f\u0770\5\u01a0\u00d1\2\u0770\u0147\3\2\2\2\u0771\u0772"+
		"\7\67\2\2\u0772\u0773\5\u01a0\u00d1\2\u0773\u0774\7Z\2\2\u0774\u0775\5"+
		"\u0110\u0089\2\u0775\u0149\3\2\2\2\u0776\u0777\7<\2\2\u0777\u0778\7Z\2"+
		"\2\u0778\u0779\5\u0110\u0089\2\u0779\u077a\5\u014c\u00a7\2\u077a\u0785"+
		"\3\2\2\2\u077b\u077c\7<\2\2\u077c\u077d\7Z\2\2\u077d\u077f\5\u0110\u0089"+
		"\2\u077e\u0780\5\u014c\u00a7\2\u077f\u077e\3\2\2\2\u077f\u0780\3\2\2\2"+
		"\u0780\u0781\3\2\2\2\u0781\u0782\5\u0154\u00ab\2\u0782\u0785\3\2\2\2\u0783"+
		"\u0785\5\u0156\u00ac\2\u0784\u0776\3\2\2\2\u0784\u077b\3\2\2\2\u0784\u0783"+
		"\3\2\2\2\u0785\u014b\3\2\2\2\u0786\u0788\5\u014e\u00a8\2\u0787\u0786\3"+
		"\2\2\2\u0788\u0789\3\2\2\2\u0789\u0787\3\2\2\2\u0789\u078a\3\2\2\2\u078a"+
		"\u014d\3\2\2\2\u078b\u078c\7\24\2\2\u078c\u078d\5\u0150\u00a9\2\u078d"+
		"\u078e\7Z\2\2\u078e\u078f\5\u0110\u0089\2\u078f\u014f\3\2\2\2\u0790\u0792"+
		"\5\u00a8U\2\u0791\u0790\3\2\2\2\u0792\u0795\3\2\2\2\u0793\u0791\3\2\2"+
		"\2\u0793\u0794\3\2\2\2\u0794\u0796\3\2\2\2\u0795\u0793\3\2\2\2\u0796\u0797"+
		"\5\u0152\u00aa\2\u0797\u0798\5|?\2\u0798\u0151\3\2\2\2\u0799\u079e\5\u0088"+
		"E\2\u079a\u079b\7i\2\2\u079b\u079d\5\20\t\2\u079c\u079a\3\2\2\2\u079d"+
		"\u07a0\3\2\2\2\u079e\u079c\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u0153\3\2"+
		"\2\2\u07a0\u079e\3\2\2\2\u07a1\u07a2\7\37\2\2\u07a2\u07a3\7Z\2\2\u07a3"+
		"\u07a4\5\u0110\u0089\2\u07a4\u0155\3\2\2\2\u07a5\u07a6\7<\2\2\u07a6\u07a7"+
		"\5\u0158\u00ad\2\u07a7\u07a8\7Z\2\2\u07a8\u07aa\5\u0110\u0089\2\u07a9"+
		"\u07ab\5\u014c\u00a7\2\u07aa\u07a9\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ad"+
		"\3\2\2\2\u07ac\u07ae\5\u0154\u00ab\2\u07ad\u07ac\3\2\2\2\u07ad\u07ae\3"+
		"\2\2\2\u07ae\u0157\3\2\2\2\u07af\u07b0\7H\2\2\u07b0\u07b2\5\u015a\u00ae"+
		"\2\u07b1\u07b3\7N\2\2\u07b2\u07b1\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b4"+
		"\3\2\2\2\u07b4\u07b5\7I\2\2\u07b5\u0159\3\2\2\2\u07b6\u07bb\5\u015c\u00af"+
		"\2\u07b7\u07b8\7N\2\2\u07b8\u07ba\5\u015c\u00af\2\u07b9\u07b7\3\2\2\2"+
		"\u07ba\u07bd\3\2\2\2\u07bb\u07b9\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u015b"+
		"\3\2\2\2\u07bd\u07bb\3\2\2\2\u07be\u07c0\5\u00a8U\2\u07bf\u07be\3\2\2"+
		"\2\u07c0\u07c3\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c4"+
		"\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c4\u07c5\5\u0080A\2\u07c5\u07c6\5|?\2"+
		"\u07c6\u07c7\7T\2\2\u07c7\u07c8\5\u01a0\u00d1\2\u07c8\u07cb\3\2\2\2\u07c9"+
		"\u07cb\5\u015e\u00b0\2\u07ca\u07c1\3\2\2\2\u07ca\u07c9\3\2\2\2\u07cb\u015d"+
		"\3\2\2\2\u07cc\u07cf\5<\37\2\u07cd\u07cf\5\u017e\u00c0\2\u07ce\u07cc\3"+
		"\2\2\2\u07ce\u07cd\3\2\2\2\u07cf\u015f\3\2\2\2\u07d0\u07d3\5\u016e\u00b8"+
		"\2\u07d1\u07d3\5\u0198\u00cd\2\u07d2\u07d0\3\2\2\2\u07d2\u07d1\3\2\2\2"+
		"\u07d3\u07d7\3\2\2\2\u07d4\u07d6\5\u0168\u00b5\2\u07d5\u07d4\3\2\2\2\u07d6"+
		"\u07d9\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u0161\3\2"+
		"\2\2\u07d9\u07d7\3\2\2\2\u07da\u07eb\5\2\2\2\u07db\u07eb\5\u0174\u00bb"+
		"\2\u07dc\u07eb\78\2\2\u07dd\u07de\58\35\2\u07de\u07df\7P\2\2\u07df\u07e0"+
		"\78\2\2\u07e0\u07eb\3\2\2\2\u07e1\u07e2\7H\2\2\u07e2\u07e3\5\u01a0\u00d1"+
		"\2\u07e3\u07e4\7I\2\2\u07e4\u07eb\3\2\2\2\u07e5\u07eb\5\u0176\u00bc\2"+
		"\u07e6\u07eb\5\u017e\u00c0\2\u07e7\u07eb\5\u0184\u00c3\2\u07e8\u07eb\5"+
		"\u018a\u00c6\2\u07e9\u07eb\5\u0192\u00ca\2\u07ea\u07da\3\2\2\2\u07ea\u07db"+
		"\3\2\2\2\u07ea\u07dc\3\2\2\2\u07ea\u07dd\3\2\2\2\u07ea\u07e1\3\2\2\2\u07ea"+
		"\u07e5\3\2\2\2\u07ea\u07e6\3\2\2\2\u07ea\u07e7\3\2\2\2\u07ea\u07e8\3\2"+
		"\2\2\u07ea\u07e9\3\2\2\2\u07eb\u0163\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed"+
		"\u0165\3\2\2\2\u07ee\u080b\5\2\2\2\u07ef\u07f4\58\35\2\u07f0\u07f1\7L"+
		"\2\2\u07f1\u07f3\7M\2\2\u07f2\u07f0\3\2\2\2\u07f3\u07f6\3\2\2\2\u07f4"+
		"\u07f2\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f7\3\2\2\2\u07f6\u07f4\3\2"+
		"\2\2\u07f7\u07f8\7P\2\2\u07f8\u07f9\7\26\2\2\u07f9\u080b\3\2\2\2\u07fa"+
		"\u07fb\7=\2\2\u07fb\u07fc\7P\2\2\u07fc\u080b\7\26\2\2\u07fd\u080b\78\2"+
		"\2\u07fe\u07ff\58\35\2\u07ff\u0800\7P\2\2\u0800\u0801\78\2\2\u0801\u080b"+
		"\3\2\2\2\u0802\u0803\7H\2\2\u0803\u0804\5\u01a0\u00d1\2\u0804\u0805\7"+
		"I\2\2\u0805\u080b\3\2\2\2\u0806\u080b\5\u0176\u00bc\2\u0807\u080b\5\u017e"+
		"\u00c0\2\u0808\u080b\5\u018a\u00c6\2\u0809\u080b\5\u0192\u00ca\2\u080a"+
		"\u07ee\3\2\2\2\u080a\u07ef\3\2\2\2\u080a\u07fa\3\2\2\2\u080a\u07fd\3\2"+
		"\2\2\u080a\u07fe\3\2\2\2\u080a\u0802\3\2\2\2\u080a\u0806\3\2\2\2\u080a"+
		"\u0807\3\2\2\2\u080a\u0808\3\2\2\2\u080a\u0809\3\2\2\2\u080b\u0167\3\2"+
		"\2\2\u080c\u0812\5\u0178\u00bd\2\u080d\u0812\5\u0180\u00c1\2\u080e\u0812"+
		"\5\u0186\u00c4\2\u080f\u0812\5\u018c\u00c7\2\u0810\u0812\5\u0194\u00cb"+
		"\2\u0811\u080c\3\2\2\2\u0811\u080d\3\2\2\2\u0811\u080e\3\2\2\2\u0811\u080f"+
		"\3\2\2\2\u0811\u0810\3\2\2\2\u0812\u0169\3\2\2\2\u0813\u0814\3\2\2\2\u0814"+
		"\u016b\3\2\2\2\u0815\u081a\5\u0178\u00bd\2\u0816\u081a\5\u0180\u00c1\2"+
		"\u0817\u081a\5\u018c\u00c7\2\u0818\u081a\5\u0194\u00cb\2\u0819\u0815\3"+
		"\2\2\2\u0819\u0816\3\2\2\2\u0819\u0817\3\2\2\2\u0819\u0818\3\2\2\2\u081a"+
		"\u016d\3\2\2\2\u081b\u0844\5\2\2\2\u081c\u0821\58\35\2\u081d\u081e\7L"+
		"\2\2\u081e\u0820\7M\2\2\u081f\u081d\3\2\2\2\u0820\u0823\3\2\2\2\u0821"+
		"\u081f\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0824\3\2\2\2\u0823\u0821\3\2"+
		"\2\2\u0824\u0825\7P\2\2\u0825\u0826\7\26\2\2\u0826\u0844\3\2\2\2\u0827"+
		"\u082c\5\u0082B\2\u0828\u0829\7L\2\2\u0829\u082b\7M\2\2\u082a\u0828\3"+
		"\2\2\2\u082b\u082e\3\2\2\2\u082c\u082a\3\2\2\2\u082c\u082d\3\2\2\2\u082d"+
		"\u082f\3\2\2\2\u082e\u082c\3\2\2\2\u082f\u0830\7P\2\2\u0830\u0831\7\26"+
		"\2\2\u0831\u0844\3\2\2\2\u0832\u0833\7=\2\2\u0833\u0834\7P\2\2\u0834\u0844"+
		"\7\26\2\2\u0835\u0844\78\2\2\u0836\u0837\58\35\2\u0837\u0838\7P\2\2\u0838"+
		"\u0839\78\2\2\u0839\u0844\3\2\2\2\u083a\u083b\7H\2\2\u083b\u083c\5\u01a0"+
		"\u00d1\2\u083c\u083d\7I\2\2\u083d\u0844\3\2\2\2\u083e\u0844\5\u017a\u00be"+
		"\2\u083f\u0844\5\u0182\u00c2\2\u0840\u0844\5\u0188\u00c5\2\u0841\u0844"+
		"\5\u018e\u00c8\2\u0842\u0844\5\u0196\u00cc\2\u0843\u081b\3\2\2\2\u0843"+
		"\u081c\3\2\2\2\u0843\u0827\3\2\2\2\u0843\u0832\3\2\2\2\u0843\u0835\3\2"+
		"\2\2\u0843\u0836\3\2\2\2\u0843\u083a\3\2\2\2\u0843\u083e\3\2\2\2\u0843"+
		"\u083f\3\2\2\2\u0843\u0840\3\2\2\2\u0843\u0841\3\2\2\2\u0843\u0842\3\2"+
		"\2\2\u0844\u016f\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u0171\3\2\2\2\u0847"+
		"\u086f\5\2\2\2\u0848\u084d\58\35\2\u0849\u084a\7L\2\2\u084a\u084c\7M\2"+
		"\2\u084b\u0849\3\2\2\2\u084c\u084f\3\2\2\2\u084d\u084b\3\2\2\2\u084d\u084e"+
		"\3\2\2\2\u084e\u0850\3\2\2\2\u084f\u084d\3\2\2\2\u0850\u0851\7P\2\2\u0851"+
		"\u0852\7\26\2\2\u0852\u086f\3\2\2\2\u0853\u0858\5\u0082B\2\u0854\u0855"+
		"\7L\2\2\u0855\u0857\7M\2\2\u0856\u0854\3\2\2\2\u0857\u085a\3\2\2\2\u0858"+
		"\u0856\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085b\3\2\2\2\u085a\u0858\3\2"+
		"\2\2\u085b\u085c\7P\2\2\u085c\u085d\7\26\2\2\u085d\u086f\3\2\2\2\u085e"+
		"\u085f\7=\2\2\u085f\u0860\7P\2\2\u0860\u086f\7\26\2\2\u0861\u086f\78\2"+
		"\2\u0862\u0863\58\35\2\u0863\u0864\7P\2\2\u0864\u0865\78\2\2\u0865\u086f"+
		"\3\2\2\2\u0866\u0867\7H\2\2\u0867\u0868\5\u01a0\u00d1\2\u0868\u0869\7"+
		"I\2\2\u0869\u086f\3\2\2\2\u086a\u086f\5\u017a\u00be\2\u086b\u086f\5\u0182"+
		"\u00c2\2\u086c\u086f\5\u018e\u00c8\2\u086d\u086f\5\u0196\u00cc\2\u086e"+
		"\u0847\3\2\2\2\u086e\u0848\3\2\2\2\u086e\u0853\3\2\2\2\u086e\u085e\3\2"+
		"\2\2\u086e\u0861\3\2\2\2\u086e\u0862\3\2\2\2\u086e\u0866\3\2\2\2\u086e"+
		"\u086a\3\2\2\2\u086e\u086b\3\2\2\2\u086e\u086c\3\2\2\2\u086e\u086d\3\2"+
		"\2\2\u086f\u0173\3\2\2\2\u0870\u0874\58\35\2\u0871\u0874\5\6\4\2\u0872"+
		"\u0874\7\20\2\2\u0873\u0870\3\2\2\2\u0873\u0871\3\2\2\2\u0873\u0872\3"+
		"\2\2\2\u0874\u0879\3\2\2\2\u0875\u0876\7L\2\2\u0876\u0878\7M\2\2\u0877"+
		"\u0875\3\2\2\2\u0878\u087b\3\2\2\2\u0879\u0877\3\2\2\2\u0879\u087a\3\2"+
		"\2\2\u087a\u087c\3\2\2\2\u087b\u0879\3\2\2\2\u087c\u087d\7P\2\2\u087d"+
		"\u0882\7\26\2\2\u087e\u087f\7=\2\2\u087f\u0880\7P\2\2\u0880\u0882\7\26"+
		"\2\2\u0881\u0873\3\2\2\2\u0881\u087e\3\2\2\2\u0882\u0175\3\2\2\2\u0883"+
		"\u0885\7+\2\2\u0884\u0886\5*\26\2\u0885\u0884\3\2\2\2\u0885\u0886\3\2"+
		"\2\2\u0886\u088a\3\2\2\2\u0887\u0889\5\u00f2z\2\u0888\u0887\3\2\2\2\u0889"+
		"\u088c\3\2\2\2\u088a\u0888\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088d\3\2"+
		"\2\2\u088c\u088a\3\2\2\2\u088d\u0898\5\u01dc\u00ef\2\u088e\u0892\7P\2"+
		"\2\u088f\u0891\5\u00f2z\2\u0890\u088f\3\2\2\2\u0891\u0894\3\2\2\2\u0892"+
		"\u0890\3\2\2\2\u0892\u0893\3\2\2\2\u0893\u0895\3\2\2\2\u0894\u0892\3\2"+
		"\2\2\u0895\u0897\5\u01dc\u00ef\2\u0896\u088e\3\2\2\2\u0897\u089a\3\2\2"+
		"\2\u0898\u0896\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089c\3\2\2\2\u089a\u0898"+
		"\3\2\2\2\u089b\u089d\5\u017c\u00bf\2\u089c\u089b\3\2\2\2\u089c\u089d\3"+
		"\2\2\2\u089d\u089e\3\2\2\2\u089e\u08a0\7H\2\2\u089f\u08a1\5\u0190\u00c9"+
		"\2\u08a0\u089f\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u08a3"+
		"\7I\2\2\u08a3\u08a5\7Z\2\2\u08a4\u08a6\5n8\2\u08a5\u08a4\3\2\2\2\u08a5"+
		"\u08a6\3\2\2\2\u08a6\u08da\3\2\2\2\u08a7\u08a8\5<\37\2\u08a8\u08a9\7P"+
		"\2\2\u08a9\u08ab\7+\2\2\u08aa\u08ac\5*\26\2\u08ab\u08aa\3\2\2\2\u08ab"+
		"\u08ac\3\2\2\2\u08ac\u08b0\3\2\2\2\u08ad\u08af\5\u00f2z\2\u08ae\u08ad"+
		"\3\2\2\2\u08af\u08b2\3\2\2\2\u08b0\u08ae\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1"+
		"\u08b3\3\2\2\2\u08b2\u08b0\3\2\2\2\u08b3\u08b5\5\u01dc\u00ef\2\u08b4\u08b6"+
		"\5\u017c\u00bf\2\u08b5\u08b4\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u08b7\3"+
		"\2\2\2\u08b7\u08b9\7H\2\2\u08b8\u08ba\5\u0190\u00c9\2\u08b9\u08b8\3\2"+
		"\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u08bc\7I\2\2\u08bc"+
		"\u08be\7Z\2\2\u08bd\u08bf\5n8\2\u08be\u08bd\3\2\2\2\u08be\u08bf\3\2\2"+
		"\2\u08bf\u08da\3\2\2\2\u08c0\u08c1\5\u0160\u00b1\2\u08c1\u08c2\7P\2\2"+
		"\u08c2\u08c4\7+\2\2\u08c3\u08c5\5*\26\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5"+
		"\3\2\2\2\u08c5\u08c9\3\2\2\2\u08c6\u08c8\5\u00f2z\2\u08c7\u08c6\3\2\2"+
		"\2\u08c8\u08cb\3\2\2\2\u08c9\u08c7\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cc"+
		"\3\2\2\2\u08cb\u08c9\3\2\2\2\u08cc\u08ce\5\u01dc\u00ef\2\u08cd\u08cf\5"+
		"\u017c\u00bf\2\u08ce\u08cd\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d0\3\2"+
		"\2\2\u08d0\u08d2\7H\2\2\u08d1\u08d3\5\u0190\u00c9\2\u08d2\u08d1\3\2\2"+
		"\2\u08d2\u08d3\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d5\7I\2\2\u08d5\u08d7"+
		"\7Z\2\2\u08d6\u08d8\5n8\2\u08d7\u08d6\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8"+
		"\u08da\3\2\2\2\u08d9\u0883\3\2\2\2\u08d9\u08a7\3\2\2\2\u08d9\u08c0\3\2"+
		"\2\2\u08da\u0177\3\2\2\2\u08db\u08dc\7P\2\2\u08dc\u08de\7+\2\2\u08dd\u08df"+
		"\5*\26\2\u08de\u08dd\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e3\3\2\2\2\u08e0"+
		"\u08e2\5\u00f2z\2\u08e1\u08e0\3\2\2\2\u08e2\u08e5\3\2\2\2\u08e3\u08e1"+
		"\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e6\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e6"+
		"\u08e8\5\u01dc\u00ef\2\u08e7\u08e9\5\u017c\u00bf\2\u08e8\u08e7\3\2\2\2"+
		"\u08e8\u08e9\3\2\2\2\u08e9\u08ea\3\2\2\2\u08ea\u08ec\7H\2\2\u08eb\u08ed"+
		"\5\u0190\u00c9\2\u08ec\u08eb\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08ee\3"+
		"\2\2\2\u08ee\u08ef\7I\2\2\u08ef\u08f1\7Z\2\2\u08f0\u08f2\5n8\2\u08f1\u08f0"+
		"\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2\u0179\3\2\2\2\u08f3\u08f5\7+\2\2\u08f4"+
		"\u08f6\5*\26\2\u08f5\u08f4\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08fa\3\2"+
		"\2\2\u08f7\u08f9\5\u00f2z\2\u08f8\u08f7\3\2\2\2\u08f9\u08fc\3\2\2\2\u08fa"+
		"\u08f8\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fd\3\2\2\2\u08fc\u08fa\3\2"+
		"\2\2\u08fd\u0908\5\u01dc\u00ef\2\u08fe\u0902\7P\2\2\u08ff\u0901\5\u00f2"+
		"z\2\u0900\u08ff\3\2\2\2\u0901\u0904\3\2\2\2\u0902\u0900\3\2\2\2\u0902"+
		"\u0903\3\2\2\2\u0903\u0905\3\2\2\2\u0904\u0902\3\2\2\2\u0905\u0907\5\u01dc"+
		"\u00ef\2\u0906\u08fe\3\2\2\2\u0907\u090a\3\2\2\2\u0908\u0906\3\2\2\2\u0908"+
		"\u0909\3\2\2\2\u0909\u090c\3\2\2\2\u090a\u0908\3\2\2\2\u090b\u090d\5\u017c"+
		"\u00bf\2\u090c\u090b\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090e\3\2\2\2\u090e"+
		"\u0910\7H\2\2\u090f\u0911\5\u0190\u00c9\2\u0910\u090f\3\2\2\2\u0910\u0911"+
		"\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u0913\7I\2\2\u0913\u0915\7Z\2\2\u0914"+
		"\u0916\5n8\2\u0915\u0914\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0931\3\2\2"+
		"\2\u0917\u0918\5<\37\2\u0918\u0919\7P\2\2\u0919\u091b\7+\2\2\u091a\u091c"+
		"\5*\26\2\u091b\u091a\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u0920\3\2\2\2\u091d"+
		"\u091f\5\u00f2z\2\u091e\u091d\3\2\2\2\u091f\u0922\3\2\2\2\u0920\u091e"+
		"\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0923\3\2\2\2\u0922\u0920\3\2\2\2\u0923"+
		"\u0925\5\u01dc\u00ef\2\u0924\u0926\5\u017c\u00bf\2\u0925\u0924\3\2\2\2"+
		"\u0925\u0926\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u0929\7H\2\2\u0928\u092a"+
		"\5\u0190\u00c9\2\u0929\u0928\3\2";
	private static final String _serializedATNSegment1 =
		"\2\2\u0929\u092a\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092c\7I\2\2\u092c"+
		"\u092e\7Z\2\2\u092d\u092f\5n8\2\u092e\u092d\3\2\2\2\u092e\u092f\3\2\2"+
		"\2\u092f\u0931\3\2\2\2\u0930\u08f3\3\2\2\2\u0930\u0917\3\2\2\2\u0931\u017b"+
		"\3\2\2\2\u0932\u0936\5*\26\2\u0933\u0934\7V\2\2\u0934\u0936\7U\2\2\u0935"+
		"\u0932\3\2\2\2\u0935\u0933\3\2\2\2\u0936\u017d\3\2\2\2\u0937\u0938\5\u0160"+
		"\u00b1\2\u0938\u0939\7P\2\2\u0939\u093a\5\u01dc\u00ef\2\u093a\u0945\3"+
		"\2\2\2\u093b\u093c\7\65\2\2\u093c\u093d\7P\2\2\u093d\u0945\5\u01dc\u00ef"+
		"\2\u093e\u093f\58\35\2\u093f\u0940\7P\2\2\u0940\u0941\7\65\2\2\u0941\u0942"+
		"\7P\2\2\u0942\u0943\5\u01dc\u00ef\2\u0943\u0945\3\2\2\2\u0944\u0937\3"+
		"\2\2\2\u0944\u093b\3\2\2\2\u0944\u093e\3\2\2\2\u0945\u017f\3\2\2\2\u0946"+
		"\u0947\7P\2\2\u0947\u0948\5\u01dc\u00ef\2\u0948\u0181\3\2\2\2\u0949\u094a"+
		"\7\65\2\2\u094a\u094b\7P\2\2\u094b\u0953\5\u01dc\u00ef\2\u094c\u094d\5"+
		"8\35\2\u094d\u094e\7P\2\2\u094e\u094f\7\65\2\2\u094f\u0950\7P\2\2\u0950"+
		"\u0951\5\u01dc\u00ef\2\u0951\u0953\3\2\2\2\u0952\u0949\3\2\2\2\u0952\u094c"+
		"\3\2\2\2\u0953\u0183\3\2\2\2\u0954\u0955\5<\37\2\u0955\u0956\7L\2\2\u0956"+
		"\u0957\5\u01a0\u00d1\2\u0957\u0958\7M\2\2\u0958\u095f\3\2\2\2\u0959\u095a"+
		"\5\u0166\u00b4\2\u095a\u095b\7L\2\2\u095b\u095c\5\u01a0\u00d1\2\u095c"+
		"\u095d\7M\2\2\u095d\u095f\3\2\2\2\u095e\u0954\3\2\2\2\u095e\u0959\3\2"+
		"\2\2\u095f\u0967\3\2\2\2\u0960\u0961\5\u0164\u00b3\2\u0961\u0962\7L\2"+
		"\2\u0962\u0963\5\u01a0\u00d1\2\u0963\u0964\7M\2\2\u0964\u0966\3\2\2\2"+
		"\u0965\u0960\3\2\2\2\u0966\u0969\3\2\2\2\u0967\u0965\3\2\2\2\u0967\u0968"+
		"\3\2\2\2\u0968\u0185\3\2\2\2\u0969\u0967\3\2\2\2\u096a\u096b\5\u016c\u00b7"+
		"\2\u096b\u096c\7L\2\2\u096c\u096d\5\u01a0\u00d1\2\u096d\u096e\7M\2\2\u096e"+
		"\u0976\3\2\2\2\u096f\u0970\5\u016a\u00b6\2\u0970\u0971\7L\2\2\u0971\u0972"+
		"\5\u01a0\u00d1\2\u0972\u0973\7M\2\2\u0973\u0975\3\2\2\2\u0974\u096f\3"+
		"\2\2\2\u0975\u0978\3\2\2\2\u0976\u0974\3\2\2\2\u0976\u0977\3\2\2\2\u0977"+
		"\u0187\3\2\2\2\u0978\u0976\3\2\2\2\u0979\u097a\5<\37\2\u097a\u097b\7L"+
		"\2\2\u097b\u097c\5\u01a0\u00d1\2\u097c\u097d\7M\2\2\u097d\u0984\3\2\2"+
		"\2\u097e\u097f\5\u0172\u00ba\2\u097f\u0980\7L\2\2\u0980\u0981\5\u01a0"+
		"\u00d1\2\u0981\u0982\7M\2\2\u0982\u0984\3\2\2\2\u0983\u0979\3\2\2\2\u0983"+
		"\u097e\3\2\2\2\u0984\u098c\3\2\2\2\u0985\u0986\5\u0170\u00b9\2\u0986\u0987"+
		"\7L\2\2\u0987\u0988\5\u01a0\u00d1\2\u0988\u0989\7M\2\2\u0989\u098b\3\2"+
		"\2\2\u098a\u0985\3\2\2\2\u098b\u098e\3\2\2\2\u098c\u098a\3\2\2\2\u098c"+
		"\u098d\3\2\2\2\u098d\u0189\3\2\2\2\u098e\u098c\3\2\2\2\u098f\u0990\5>"+
		" \2\u0990\u0992\7H\2\2\u0991\u0993\5\u0190\u00c9\2\u0992\u0991\3\2\2\2"+
		"\u0992\u0993\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0995\7I\2\2\u0995\u09d5"+
		"\3\2\2\2\u0996\u0997\58\35\2\u0997\u0999\7P\2\2\u0998\u099a\5*\26\2\u0999"+
		"\u0998\3\2\2\2\u0999\u099a\3\2\2\2\u099a\u099b\3\2\2\2\u099b\u099c\5\u01dc"+
		"\u00ef\2\u099c\u099e\7H\2\2\u099d\u099f\5\u0190\u00c9\2\u099e\u099d\3"+
		"\2\2\2\u099e\u099f\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0\u09a1\7I\2\2\u09a1"+
		"\u09d5\3\2\2\2\u09a2\u09a3\5<\37\2\u09a3\u09a5\7P\2\2\u09a4\u09a6\5*\26"+
		"\2\u09a5\u09a4\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u09a7\3\2\2\2\u09a7\u09a8"+
		"\5\u01dc\u00ef\2\u09a8\u09aa\7H\2\2\u09a9\u09ab\5\u0190\u00c9\2\u09aa"+
		"\u09a9\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09ad\7I"+
		"\2\2\u09ad\u09d5\3\2\2\2\u09ae\u09af\5\u0160\u00b1\2\u09af\u09b1\7P\2"+
		"\2\u09b0\u09b2\5*\26\2\u09b1\u09b0\3\2\2\2\u09b1\u09b2\3\2\2\2\u09b2\u09b3"+
		"\3\2\2\2\u09b3\u09b4\5\u01dc\u00ef\2\u09b4\u09b6\7H\2\2\u09b5\u09b7\5"+
		"\u0190\u00c9\2\u09b6\u09b5\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u09b8\3\2"+
		"\2\2\u09b8\u09b9\7I\2\2\u09b9\u09d5\3\2\2\2\u09ba\u09bb\7\65\2\2\u09bb"+
		"\u09bd\7P\2\2\u09bc\u09be\5*\26\2\u09bd\u09bc\3\2\2\2\u09bd\u09be\3\2"+
		"\2\2\u09be\u09bf\3\2\2\2\u09bf\u09c0\5\u01dc\u00ef\2\u09c0\u09c2\7H\2"+
		"\2\u09c1\u09c3\5\u0190\u00c9\2\u09c2\u09c1\3\2\2\2\u09c2\u09c3\3\2\2\2"+
		"\u09c3\u09c4\3\2\2\2\u09c4\u09c5\7I\2\2\u09c5\u09d5\3\2\2\2\u09c6\u09c7"+
		"\58\35\2\u09c7\u09c8\7P\2\2\u09c8\u09c9\7\65\2\2\u09c9\u09cb\7P\2\2\u09ca"+
		"\u09cc\5*\26\2\u09cb\u09ca\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd\3\2"+
		"\2\2\u09cd\u09ce\5\u01dc\u00ef\2\u09ce\u09d0\7H\2\2\u09cf\u09d1\5\u0190"+
		"\u00c9\2\u09d0\u09cf\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09d2\3\2\2\2\u09d2"+
		"\u09d3\7I\2\2\u09d3\u09d5\3\2\2\2\u09d4\u098f\3\2\2\2\u09d4\u0996\3\2"+
		"\2\2\u09d4\u09a2\3\2\2\2\u09d4\u09ae\3\2\2\2\u09d4\u09ba\3\2\2\2\u09d4"+
		"\u09c6\3\2\2\2\u09d5\u018b\3\2\2\2\u09d6\u09d8\7P\2\2\u09d7\u09d9\5*\26"+
		"\2\u09d8\u09d7\3\2\2\2\u09d8\u09d9\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db"+
		"\5\u01dc\u00ef\2\u09db\u09dd\7H\2\2\u09dc\u09de\5\u0190\u00c9\2\u09dd"+
		"\u09dc\3\2\2\2\u09dd\u09de\3\2\2\2\u09de\u09df\3\2\2\2\u09df\u09e0\7I"+
		"\2\2\u09e0\u018d\3\2\2\2\u09e1\u09e2\5> \2\u09e2\u09e4\7H\2\2\u09e3\u09e5"+
		"\5\u0190\u00c9\2\u09e4\u09e3\3\2\2\2\u09e4\u09e5\3\2\2\2\u09e5\u09e6\3"+
		"\2\2\2\u09e6\u09e7\7I\2\2\u09e7\u0a1b\3\2\2\2\u09e8\u09e9\58\35\2\u09e9"+
		"\u09eb\7P\2\2\u09ea\u09ec\5*\26\2\u09eb\u09ea\3\2\2\2\u09eb\u09ec\3\2"+
		"\2\2\u09ec\u09ed\3\2\2\2\u09ed\u09ee\5\u01dc\u00ef\2\u09ee\u09f0\7H\2"+
		"\2\u09ef\u09f1\5\u0190\u00c9\2\u09f0\u09ef\3\2\2\2\u09f0\u09f1\3\2\2\2"+
		"\u09f1\u09f2\3\2\2\2\u09f2\u09f3\7I\2\2\u09f3\u0a1b\3\2\2\2\u09f4\u09f5"+
		"\5<\37\2\u09f5\u09f7\7P\2\2\u09f6\u09f8\5*\26\2\u09f7\u09f6\3\2\2\2\u09f7"+
		"\u09f8\3\2\2\2\u09f8\u09f9\3\2\2\2\u09f9\u09fa\5\u01dc\u00ef\2\u09fa\u09fc"+
		"\7H\2\2\u09fb\u09fd\5\u0190\u00c9\2\u09fc\u09fb\3\2\2\2\u09fc\u09fd\3"+
		"\2\2\2\u09fd\u09fe\3\2\2\2\u09fe\u09ff\7I\2\2\u09ff\u0a1b\3\2\2\2\u0a00"+
		"\u0a01\7\65\2\2\u0a01\u0a03\7P\2\2\u0a02\u0a04\5*\26\2\u0a03\u0a02\3\2"+
		"\2\2\u0a03\u0a04\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a06\5\u01dc\u00ef"+
		"\2\u0a06\u0a08\7H\2\2\u0a07\u0a09\5\u0190\u00c9\2\u0a08\u0a07\3\2\2\2"+
		"\u0a08\u0a09\3\2\2\2\u0a09\u0a0a\3\2\2\2\u0a0a\u0a0b\7I\2\2\u0a0b\u0a1b"+
		"\3\2\2\2\u0a0c\u0a0d\58\35\2\u0a0d\u0a0e\7P\2\2\u0a0e\u0a0f\7\65\2\2\u0a0f"+
		"\u0a11\7P\2\2\u0a10\u0a12\5*\26\2\u0a11\u0a10\3\2\2\2\u0a11\u0a12\3\2"+
		"\2\2\u0a12\u0a13\3\2\2\2\u0a13\u0a14\5\u01dc\u00ef\2\u0a14\u0a16\7H\2"+
		"\2\u0a15\u0a17\5\u0190\u00c9\2\u0a16\u0a15\3\2\2\2\u0a16\u0a17\3\2\2\2"+
		"\u0a17\u0a18\3\2\2\2\u0a18\u0a19\7I\2\2\u0a19\u0a1b\3\2\2\2\u0a1a\u09e1"+
		"\3\2\2\2\u0a1a\u09e8\3\2\2\2\u0a1a\u09f4\3\2\2\2\u0a1a\u0a00\3\2\2\2\u0a1a"+
		"\u0a0c\3\2\2\2\u0a1b\u018f\3\2\2\2\u0a1c\u0a21\5\u01a0\u00d1\2\u0a1d\u0a1e"+
		"\7O\2\2\u0a1e\u0a20\5\u01a0\u00d1\2\u0a1f\u0a1d\3\2\2\2\u0a20\u0a23\3"+
		"\2\2\2\u0a21\u0a1f\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u0191\3\2\2\2\u0a23"+
		"\u0a21\3\2\2\2\u0a24\u0a25\5<\37\2\u0a25\u0a27\7S\2\2\u0a26\u0a28\5*\26"+
		"\2\u0a27\u0a26\3\2\2\2\u0a27\u0a28\3\2\2\2\u0a28\u0a29\3\2\2\2\u0a29\u0a2a"+
		"\5\u01dc\u00ef\2\u0a2a\u0a54\3\2\2\2\u0a2b\u0a2c\5\f\7\2\u0a2c\u0a2e\7"+
		"S\2\2\u0a2d\u0a2f\5*\26\2\u0a2e\u0a2d\3\2\2\2\u0a2e\u0a2f\3\2\2\2\u0a2f"+
		"\u0a30\3\2\2\2\u0a30\u0a31\5\u01dc\u00ef\2\u0a31\u0a54\3\2\2\2\u0a32\u0a33"+
		"\5\u0160\u00b1\2\u0a33\u0a35\7S\2\2\u0a34\u0a36\5*\26\2\u0a35\u0a34\3"+
		"\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u0a37\3\2\2\2\u0a37\u0a38\5\u01dc\u00ef"+
		"\2\u0a38\u0a54\3\2\2\2\u0a39\u0a3a\7\65\2\2\u0a3a\u0a3c\7S\2\2\u0a3b\u0a3d"+
		"\5*\26\2\u0a3c\u0a3b\3\2\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d\u0a3e\3\2\2\2\u0a3e"+
		"\u0a54\5\u01dc\u00ef\2\u0a3f\u0a40\58\35\2\u0a40\u0a41\7P\2\2\u0a41\u0a42"+
		"\7\65\2\2\u0a42\u0a44\7S\2\2\u0a43\u0a45\5*\26\2\u0a44\u0a43\3\2\2\2\u0a44"+
		"\u0a45\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46\u0a47\5\u01dc\u00ef\2\u0a47\u0a54"+
		"\3\2\2\2\u0a48\u0a49\5\20\t\2\u0a49\u0a4b\7S\2\2\u0a4a\u0a4c\5*\26\2\u0a4b"+
		"\u0a4a\3\2\2\2\u0a4b\u0a4c\3\2\2\2\u0a4c\u0a4d\3\2\2\2\u0a4d\u0a4e\7+"+
		"\2\2\u0a4e\u0a54\3\2\2\2\u0a4f\u0a50\5\36\20\2\u0a50\u0a51\7S\2\2\u0a51"+
		"\u0a52\7+\2\2\u0a52\u0a54\3\2\2\2\u0a53\u0a24\3\2\2\2\u0a53\u0a2b\3\2"+
		"\2\2\u0a53\u0a32\3\2\2\2\u0a53\u0a39\3\2\2\2\u0a53\u0a3f\3\2\2\2\u0a53"+
		"\u0a48\3\2\2\2\u0a53\u0a4f\3\2\2\2\u0a54\u0193\3\2\2\2\u0a55\u0a57\7S"+
		"\2\2\u0a56\u0a58\5*\26\2\u0a57\u0a56\3\2\2\2\u0a57\u0a58\3\2\2\2\u0a58"+
		"\u0a59\3\2\2\2\u0a59\u0a5a\5\u01dc\u00ef\2\u0a5a\u0195\3\2\2\2\u0a5b\u0a5c"+
		"\5<\37\2\u0a5c\u0a5e\7S\2\2\u0a5d\u0a5f\5*\26\2\u0a5e\u0a5d\3\2\2\2\u0a5e"+
		"\u0a5f\3\2\2\2\u0a5f\u0a60\3\2\2\2\u0a60\u0a61\5\u01dc\u00ef\2\u0a61\u0a84"+
		"\3\2\2\2\u0a62\u0a63\5\f\7\2\u0a63\u0a65\7S\2\2\u0a64\u0a66\5*\26\2\u0a65"+
		"\u0a64\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66\u0a67\3\2\2\2\u0a67\u0a68\5\u01dc"+
		"\u00ef\2\u0a68\u0a84\3\2\2\2\u0a69\u0a6a\7\65\2\2\u0a6a\u0a6c\7S\2\2\u0a6b"+
		"\u0a6d\5*\26\2\u0a6c\u0a6b\3\2\2\2\u0a6c\u0a6d\3\2\2\2\u0a6d\u0a6e\3\2"+
		"\2\2\u0a6e\u0a84\5\u01dc\u00ef\2\u0a6f\u0a70\58\35\2\u0a70\u0a71\7P\2"+
		"\2\u0a71\u0a72\7\65\2\2\u0a72\u0a74\7S\2\2\u0a73\u0a75\5*\26\2\u0a74\u0a73"+
		"\3\2\2\2\u0a74\u0a75\3\2\2\2\u0a75\u0a76\3\2\2\2\u0a76\u0a77\5\u01dc\u00ef"+
		"\2\u0a77\u0a84\3\2\2\2\u0a78\u0a79\5\20\t\2\u0a79\u0a7b\7S\2\2\u0a7a\u0a7c"+
		"\5*\26\2\u0a7b\u0a7a\3\2\2\2\u0a7b\u0a7c\3\2\2\2\u0a7c\u0a7d\3\2\2\2\u0a7d"+
		"\u0a7e\7+\2\2\u0a7e\u0a84\3\2\2\2\u0a7f\u0a80\5\36\20\2\u0a80\u0a81\7"+
		"S\2\2\u0a81\u0a82\7+\2\2\u0a82\u0a84\3\2\2\2\u0a83\u0a5b\3\2\2\2\u0a83"+
		"\u0a62\3\2\2\2\u0a83\u0a69\3\2\2\2\u0a83\u0a6f\3\2\2\2\u0a83\u0a78\3\2"+
		"\2\2\u0a83\u0a7f\3\2\2\2\u0a84\u0197\3\2\2\2\u0a85\u0a86\7+\2\2\u0a86"+
		"\u0a87\5\4\3\2\u0a87\u0a89\5\u019a\u00ce\2\u0a88\u0a8a\5 \21\2\u0a89\u0a88"+
		"\3\2\2\2\u0a89\u0a8a\3\2\2\2\u0a8a\u0a9c\3\2\2\2\u0a8b\u0a8c\7+\2\2\u0a8c"+
		"\u0a8d\5\16\b\2\u0a8d\u0a8f\5\u019a\u00ce\2\u0a8e\u0a90\5 \21\2\u0a8f"+
		"\u0a8e\3\2\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a9c\3\2\2\2\u0a91\u0a92\7+"+
		"\2\2\u0a92\u0a93\5\4\3\2\u0a93\u0a94\5 \21\2\u0a94\u0a95\5\u0104\u0083"+
		"\2\u0a95\u0a9c\3\2\2\2\u0a96\u0a97\7+\2\2\u0a97\u0a98\5\16\b\2\u0a98\u0a99"+
		"\5 \21\2\u0a99\u0a9a\5\u0104\u0083\2\u0a9a\u0a9c\3\2\2\2\u0a9b\u0a85\3"+
		"\2\2\2\u0a9b\u0a8b\3\2\2\2\u0a9b\u0a91\3\2\2\2\u0a9b\u0a96\3\2\2\2\u0a9c"+
		"\u0199\3\2\2\2\u0a9d\u0a9f\5\u019c\u00cf\2\u0a9e\u0a9d\3\2\2\2\u0a9f\u0aa0"+
		"\3\2\2\2\u0aa0\u0a9e\3\2\2\2\u0aa0\u0aa1\3\2\2\2\u0aa1\u019b\3\2\2\2\u0aa2"+
		"\u0aa4\5\u00f2z\2\u0aa3\u0aa2\3\2\2\2\u0aa4\u0aa7\3\2\2\2\u0aa5\u0aa3"+
		"\3\2\2\2\u0aa5\u0aa6\3\2\2\2\u0aa6\u0aa8\3\2\2\2\u0aa7\u0aa5\3\2\2\2\u0aa8"+
		"\u0aa9\7L\2\2\u0aa9\u0aaa\5\u01a0\u00d1\2\u0aaa\u0aab\7M\2\2\u0aab\u019d"+
		"\3\2\2\2\u0aac\u0aad\5\u01a0\u00d1\2\u0aad\u019f\3\2\2\2\u0aae\u0ab1\5"+
		"\u01a2\u00d2\2\u0aaf\u0ab1\5\u01aa\u00d6\2\u0ab0\u0aae\3\2\2\2\u0ab0\u0aaf"+
		"\3\2\2\2\u0ab1\u01a1\3\2\2\2\u0ab2\u0ab3\5\u01a4\u00d3\2\u0ab3\u0ab4\7"+
		"[\2\2\u0ab4\u0ab5\5\u01a8\u00d5\2\u0ab5\u01a3\3\2\2\2\u0ab6\u0ac1\5\u01dc"+
		"\u00ef\2\u0ab7\u0ab9\7H\2\2\u0ab8\u0aba\5\u00a2R\2\u0ab9\u0ab8\3\2\2\2"+
		"\u0ab9\u0aba\3\2\2\2\u0aba\u0abb\3\2\2\2\u0abb\u0ac1\7I\2\2\u0abc\u0abd"+
		"\7H\2\2\u0abd\u0abe\5\u01a6\u00d4\2\u0abe\u0abf\7I\2\2\u0abf\u0ac1\3\2"+
		"\2\2\u0ac0\u0ab6\3\2\2\2\u0ac0\u0ab7\3\2\2\2\u0ac0\u0abc\3\2\2\2\u0ac1"+
		"\u01a5\3\2\2\2\u0ac2\u0ac7\5\u01dc\u00ef\2\u0ac3\u0ac4\7O\2\2\u0ac4\u0ac6"+
		"\5\u01dc\u00ef\2\u0ac5\u0ac3\3\2\2\2\u0ac6\u0ac9\3\2\2\2\u0ac7\u0ac5\3"+
		"\2\2\2\u0ac7\u0ac8\3\2\2\2\u0ac8\u01a7\3\2\2\2\u0ac9\u0ac7\3\2\2\2\u0aca"+
		"\u0ad0\5\u01a0\u00d1\2\u0acb\u0acc\7J\2\2\u0acc\u0acd\5\u0108\u0085\2"+
		"\u0acd\u0ace\7K\2\2\u0ace\u0ad0\3\2\2\2\u0acf\u0aca\3\2\2\2\u0acf\u0acb"+
		"\3\2\2\2\u0ad0\u01a9\3\2\2\2\u0ad1\u0ad4\5\u01b2\u00da\2\u0ad2\u0ad4\5"+
		"\u01ac\u00d7\2\u0ad3\u0ad1\3\2\2\2\u0ad3\u0ad2\3\2\2\2\u0ad4\u01ab\3\2"+
		"\2\2\u0ad5\u0ad6\5\u01ae\u00d8\2\u0ad6\u0ad7\5\u01b0\u00d9\2\u0ad7\u0ad8"+
		"\5\u01a0\u00d1\2\u0ad8\u01ad\3\2\2\2\u0ad9\u0add\5<\37\2\u0ada\u0add\5"+
		"\u017e\u00c0\2\u0adb\u0add\5\u0184\u00c3\2\u0adc\u0ad9\3\2\2\2\u0adc\u0ada"+
		"\3\2\2\2\u0adc\u0adb\3\2\2\2\u0add\u01af\3\2\2\2\u0ade\u0adf\t\6\2\2\u0adf"+
		"\u01b1\3\2\2\2\u0ae0\u0aea\5\u01b4\u00db\2\u0ae1\u0ae2\5\u01b4\u00db\2"+
		"\u0ae2\u0ae3\7Y\2\2\u0ae3\u0ae4\5\u01a0\u00d1\2\u0ae4\u0ae7\7Z\2\2\u0ae5"+
		"\u0ae8\5\u01b2\u00da\2\u0ae6\u0ae8\5\u01a2\u00d2\2\u0ae7\u0ae5\3\2\2\2"+
		"\u0ae7\u0ae6\3\2\2\2\u0ae8\u0aea\3\2\2\2\u0ae9\u0ae0\3\2\2\2\u0ae9\u0ae1"+
		"\3\2\2\2\u0aea\u01b3\3\2\2\2\u0aeb\u0aec\b\u00db\1\2\u0aec\u0aed\5\u01b6"+
		"\u00dc\2\u0aed\u0af3\3\2\2\2\u0aee\u0aef\f\3\2\2\u0aef\u0af0\7a\2\2\u0af0"+
		"\u0af2\5\u01b6\u00dc\2\u0af1\u0aee\3\2\2\2\u0af2\u0af5\3\2\2\2\u0af3\u0af1"+
		"\3\2\2\2\u0af3\u0af4\3\2\2\2\u0af4\u01b5\3\2\2\2\u0af5\u0af3\3\2\2\2\u0af6"+
		"\u0af7\b\u00dc\1\2\u0af7\u0af8\5\u01b8\u00dd\2\u0af8\u0afe\3\2\2\2\u0af9"+
		"\u0afa\f\3\2\2\u0afa\u0afb\7`\2\2\u0afb\u0afd\5\u01b8\u00dd\2\u0afc\u0af9"+
		"\3\2\2\2\u0afd\u0b00\3\2\2\2\u0afe\u0afc\3\2\2\2\u0afe\u0aff\3\2\2\2\u0aff"+
		"\u01b7\3\2\2\2\u0b00\u0afe\3\2\2\2\u0b01\u0b02\b\u00dd\1\2\u0b02\u0b03"+
		"\5\u01ba\u00de\2\u0b03\u0b09\3\2\2\2\u0b04\u0b05\f\3\2\2\u0b05\u0b06\7"+
		"i\2\2\u0b06\u0b08\5\u01ba\u00de\2\u0b07\u0b04\3\2\2\2\u0b08\u0b0b\3\2"+
		"\2\2\u0b09\u0b07\3\2\2\2\u0b09\u0b0a\3\2\2\2\u0b0a\u01b9\3\2\2\2\u0b0b"+
		"\u0b09\3\2\2\2\u0b0c\u0b0d\b\u00de\1\2\u0b0d\u0b0e\5\u01bc\u00df\2\u0b0e"+
		"\u0b14\3\2\2\2\u0b0f\u0b10\f\3\2\2\u0b10\u0b11\7j\2\2\u0b11\u0b13\5\u01bc"+
		"\u00df\2\u0b12\u0b0f\3\2\2\2\u0b13\u0b16\3\2\2\2\u0b14\u0b12\3\2\2\2\u0b14"+
		"\u0b15\3\2\2\2\u0b15\u01bb\3\2\2\2\u0b16\u0b14\3\2\2\2\u0b17\u0b18\b\u00df"+
		"\1\2\u0b18\u0b19\5\u01be\u00e0\2\u0b19\u0b1f\3\2\2\2\u0b1a\u0b1b\f\3\2"+
		"\2\u0b1b\u0b1c\7h\2\2\u0b1c\u0b1e\5\u01be\u00e0\2\u0b1d\u0b1a\3\2\2\2"+
		"\u0b1e\u0b21\3\2\2\2\u0b1f\u0b1d\3\2\2\2\u0b1f\u0b20\3\2\2\2\u0b20\u01bd"+
		"\3\2\2\2\u0b21\u0b1f\3\2\2\2\u0b22\u0b23\b\u00e0\1\2\u0b23\u0b24\5\u01c0"+
		"\u00e1\2\u0b24\u0b2d\3\2\2\2\u0b25\u0b26\f\4\2\2\u0b26\u0b27\7\\\2\2\u0b27"+
		"\u0b2c\5\u01c0\u00e1\2\u0b28\u0b29\f\3\2\2\u0b29\u0b2a\7_\2\2\u0b2a\u0b2c"+
		"\5\u01c0\u00e1\2\u0b2b\u0b25\3\2\2\2\u0b2b\u0b28\3\2\2\2\u0b2c\u0b2f\3"+
		"\2\2\2\u0b2d\u0b2b\3\2\2\2\u0b2d\u0b2e\3\2\2\2\u0b2e\u01bf\3\2\2\2\u0b2f"+
		"\u0b2d\3\2\2\2\u0b30\u0b31\b\u00e1\1\2\u0b31\u0b32\5\u01c2\u00e2\2\u0b32"+
		"\u0b44\3\2\2\2\u0b33\u0b34\f\7\2\2\u0b34\u0b35\7V\2\2\u0b35\u0b43\5\u01c2"+
		"\u00e2\2\u0b36\u0b37\f\6\2\2\u0b37\u0b38\7U\2\2\u0b38\u0b43\5\u01c2\u00e2"+
		"\2\u0b39\u0b3a\f\5\2\2\u0b3a\u0b3b\7]\2\2\u0b3b\u0b43\5\u01c2\u00e2\2"+
		"\u0b3c\u0b3d\f\4\2\2\u0b3d\u0b3e\7^\2\2\u0b3e\u0b43\5\u01c2\u00e2\2\u0b3f"+
		"\u0b40\f\3\2\2\u0b40\u0b41\7%\2\2\u0b41\u0b43\5\f\7\2\u0b42\u0b33\3\2"+
		"\2\2\u0b42\u0b36\3\2\2\2\u0b42\u0b39\3\2\2\2\u0b42\u0b3c\3\2\2\2\u0b42"+
		"\u0b3f\3\2\2\2\u0b43\u0b46\3\2\2\2\u0b44\u0b42\3\2\2\2\u0b44\u0b45\3\2"+
		"\2\2\u0b45\u01c1\3\2\2\2\u0b46\u0b44\3\2\2\2\u0b47\u0b48\b\u00e2\1\2\u0b48"+
		"\u0b49\5\u01c4\u00e3\2\u0b49\u0b59\3\2\2\2\u0b4a\u0b4b\f\5\2\2\u0b4b\u0b4c"+
		"\7V\2\2\u0b4c\u0b4d\7V\2\2\u0b4d\u0b58\5\u01c4\u00e3\2\u0b4e\u0b4f\f\4"+
		"\2\2\u0b4f\u0b50\7U\2\2\u0b50\u0b51\7U\2\2\u0b51\u0b58\5\u01c4\u00e3\2"+
		"\u0b52\u0b53\f\3\2\2\u0b53\u0b54\7U\2\2\u0b54\u0b55\7U\2\2\u0b55\u0b56"+
		"\7U\2\2\u0b56\u0b58\5\u01c4\u00e3\2\u0b57\u0b4a\3\2\2\2\u0b57\u0b4e\3"+
		"\2\2\2\u0b57\u0b52\3\2\2\2\u0b58\u0b5b\3\2\2\2\u0b59\u0b57\3\2\2\2\u0b59"+
		"\u0b5a\3\2\2\2\u0b5a\u01c3\3\2\2\2\u0b5b\u0b59\3\2\2\2\u0b5c\u0b5d\b\u00e3"+
		"\1\2\u0b5d\u0b5e\5\u01c6\u00e4\2\u0b5e\u0b67\3\2\2\2\u0b5f\u0b60\f\4\2"+
		"\2\u0b60\u0b61\7d\2\2\u0b61\u0b66\5\u01c6\u00e4\2\u0b62\u0b63\f\3\2\2"+
		"\u0b63\u0b64\7e\2\2\u0b64\u0b66\5\u01c6\u00e4\2\u0b65\u0b5f\3\2\2\2\u0b65"+
		"\u0b62\3\2\2\2\u0b66\u0b69\3\2\2\2\u0b67\u0b65\3\2\2\2\u0b67\u0b68\3\2"+
		"\2\2\u0b68\u01c5\3\2\2\2\u0b69\u0b67\3\2\2\2\u0b6a\u0b6b\b\u00e4\1\2\u0b6b"+
		"\u0b6c\5\u01c8\u00e5\2\u0b6c\u0b78\3\2\2\2\u0b6d\u0b6e\f\5\2\2\u0b6e\u0b6f"+
		"\7f\2\2\u0b6f\u0b77\5\u01c8\u00e5\2\u0b70\u0b71\f\4\2\2\u0b71\u0b72\7"+
		"g\2\2\u0b72\u0b77\5\u01c8\u00e5\2\u0b73\u0b74\f\3\2\2\u0b74\u0b75\7k\2"+
		"\2\u0b75\u0b77\5\u01c8\u00e5\2\u0b76\u0b6d\3\2\2\2\u0b76\u0b70\3\2\2\2"+
		"\u0b76\u0b73\3\2\2\2\u0b77\u0b7a\3\2\2\2\u0b78\u0b76\3\2\2\2\u0b78\u0b79"+
		"\3\2\2\2\u0b79\u01c7\3\2\2\2\u0b7a\u0b78\3\2\2\2\u0b7b\u0b83\5\u01ca\u00e6"+
		"\2\u0b7c\u0b83\5\u01cc\u00e7\2\u0b7d\u0b7e\7d\2\2\u0b7e\u0b83\5\u01c8"+
		"\u00e5\2\u0b7f\u0b80\7e\2\2\u0b80\u0b83\5\u01c8\u00e5\2\u0b81\u0b83\5"+
		"\u01ce\u00e8\2\u0b82\u0b7b\3\2\2\2\u0b82\u0b7c\3\2\2\2\u0b82\u0b7d\3\2"+
		"\2\2\u0b82\u0b7f\3\2\2\2\u0b82\u0b81\3\2\2\2\u0b83\u01c9\3\2\2\2\u0b84"+
		"\u0b85\7b\2\2\u0b85\u0b86\5\u01c8\u00e5\2\u0b86\u01cb\3\2\2\2\u0b87\u0b88"+
		"\7c\2\2\u0b88\u0b89\5\u01c8\u00e5\2\u0b89\u01cd\3\2\2\2\u0b8a\u0b91\5"+
		"\u01d0\u00e9\2\u0b8b\u0b8c\7X\2\2\u0b8c\u0b91\5\u01c8\u00e5\2\u0b8d\u0b8e"+
		"\7W\2\2\u0b8e\u0b91\5\u01c8\u00e5\2\u0b8f\u0b91\5\u01da\u00ee\2\u0b90"+
		"\u0b8a\3\2\2\2\u0b90\u0b8b\3\2\2\2\u0b90\u0b8d\3\2\2\2\u0b90\u0b8f\3\2"+
		"\2\2\u0b91\u01cf\3\2\2\2\u0b92\u0b95\5\u0160\u00b1\2\u0b93\u0b95\5<\37"+
		"\2\u0b94\u0b92\3\2\2\2\u0b94\u0b93\3\2\2\2\u0b95\u0b9a\3\2\2\2\u0b96\u0b99"+
		"\5\u01d4\u00eb\2\u0b97\u0b99\5\u01d8\u00ed\2\u0b98\u0b96\3\2\2\2\u0b98"+
		"\u0b97\3\2\2\2\u0b99\u0b9c\3\2\2\2\u0b9a\u0b98\3\2\2\2\u0b9a\u0b9b\3\2"+
		"\2\2\u0b9b\u01d1\3\2\2\2\u0b9c\u0b9a\3\2\2\2\u0b9d\u0b9e\5\u01d0\u00e9"+
		"\2\u0b9e\u0b9f\7b\2\2\u0b9f\u01d3\3\2\2\2\u0ba0\u0ba1\7b\2\2\u0ba1\u01d5"+
		"\3\2\2\2\u0ba2\u0ba3\5\u01d0\u00e9\2\u0ba3\u0ba4\7c\2\2\u0ba4\u01d7\3"+
		"\2\2\2\u0ba5\u0ba6\7c\2\2\u0ba6\u01d9\3\2\2\2\u0ba7\u0ba8\7H\2\2\u0ba8"+
		"\u0ba9\5\4\3\2\u0ba9\u0baa\7I\2\2\u0baa\u0bab\5\u01c8\u00e5\2\u0bab\u0bc3"+
		"\3\2\2\2\u0bac\u0bad\7H\2\2\u0bad\u0bb1\5\f\7\2\u0bae\u0bb0\5(\25\2\u0baf"+
		"\u0bae\3\2\2\2\u0bb0\u0bb3\3\2\2\2\u0bb1\u0baf\3\2\2\2\u0bb1\u0bb2\3\2"+
		"\2\2\u0bb2\u0bb4\3\2\2\2\u0bb3\u0bb1\3\2\2\2\u0bb4\u0bb5\7I\2\2\u0bb5"+
		"\u0bb6\5\u01ce\u00e8\2\u0bb6\u0bc3\3\2\2\2\u0bb7\u0bb8\7H\2\2\u0bb8\u0bbc"+
		"\5\f\7\2\u0bb9\u0bbb\5(\25\2\u0bba\u0bb9\3\2\2\2\u0bbb\u0bbe\3\2\2\2\u0bbc"+
		"\u0bba\3\2\2\2\u0bbc\u0bbd\3\2\2\2\u0bbd\u0bbf\3\2\2\2\u0bbe\u0bbc\3\2"+
		"\2\2\u0bbf\u0bc0\7I\2\2\u0bc0\u0bc1\5\u01a2\u00d2\2\u0bc1\u0bc3\3\2\2"+
		"\2\u0bc2\u0ba7\3\2\2\2\u0bc2\u0bac\3\2\2\2\u0bc2\u0bb7\3\2\2\2\u0bc3\u01db"+
		"\3\2\2\2\u0bc4\u0bc5\t\7\2\2\u0bc5\u01dd\3\2\2\2\u0164\u01e3\u01ea\u01ee"+
		"\u01f2\u01fb\u01ff\u0203\u0205\u020b\u0210\u0217\u021c\u021e\u0224\u0229"+
		"\u022e\u0233\u023e\u024c\u0251\u0259\u0260\u0266\u026b\u0276\u0279\u0287"+
		"\u028c\u0291\u0296\u029c\u02a6\u02b1\u02b9\u02c3\u02cb\u02d7\u02dd\u02e2"+
		"\u02e5\u02ea\u02f0\u02f8\u0300\u030d\u032a\u032f\u0333\u033b\u0344\u0352"+
		"\u0355\u0361\u0364\u0374\u0379\u037f\u0384\u038a\u038d\u0390\u039d\u03a8"+
		"\u03b6\u03bc\u03c2\u03ca\u03d1\u03d6\u03e4\u03eb\u03f1\u03f5\u03f9\u03fd"+
		"\u0401\u0406\u040a\u040e\u0410\u0415\u041c\u0421\u0423\u0429\u042e\u0432"+
		"\u0445\u044a\u045b\u0460\u0466\u046c\u046e\u0472\u0477\u047b\u0483\u048a"+
		"\u0492\u0495\u049a\u04a2\u04a7\u04ae\u04b5\u04ba\u04c1\u04cd\u04d2\u04d8"+
		"\u04de\u04e9\u04ee\u04f7\u04fa\u04ff\u0509\u050d\u0510\u0513\u0516\u051b"+
		"\u0520\u0525\u052c\u0531\u0539\u053e\u0543\u0548\u054e\u0556\u055a\u055d"+
		"\u0560\u0569\u056f\u0575\u0578\u057c\u0584\u0589\u058e\u0594\u0597\u05a3"+
		"\u05ab\u05b1\u05ba\u05bf\u05c9\u05ce\u05dc\u05e1\u05ed\u05f3\u05fc\u0601"+
		"\u0609\u060c\u0611\u0619\u061f\u0628\u0632\u0636\u0639\u0642\u0650\u0653"+
		"\u065c\u0662\u0667\u066e\u0678\u067e\u0682\u0689\u068d\u0692\u06a1\u06b2"+
		"\u06c3\u06cc\u06d6\u06dc\u06e2\u06ea\u06f4\u06f9\u0702\u070b\u070f\u071f"+
		"\u0725\u0735\u0739\u073d\u0741\u0748\u0751\u0758\u0764\u0768\u076c\u077f"+
		"\u0784\u0789\u0793\u079e\u07aa\u07ad\u07b2\u07bb\u07c1\u07ca\u07ce\u07d2"+
		"\u07d7\u07ea\u07f4\u080a\u0811\u0819\u0821\u082c\u0843\u084d\u0858\u086e"+
		"\u0873\u0879\u0881\u0885\u088a\u0892\u0898\u089c\u08a0\u08a5\u08ab\u08b0"+
		"\u08b5\u08b9\u08be\u08c4\u08c9\u08ce\u08d2\u08d7\u08d9\u08de\u08e3\u08e8"+
		"\u08ec\u08f1\u08f5\u08fa\u0902\u0908\u090c\u0910\u0915\u091b\u0920\u0925"+
		"\u0929\u092e\u0930\u0935\u0944\u0952\u095e\u0967\u0976\u0983\u098c\u0992"+
		"\u0999\u099e\u09a5\u09aa\u09b1\u09b6\u09bd\u09c2\u09cb\u09d0\u09d4\u09d8"+
		"\u09dd\u09e4\u09eb\u09f0\u09f7\u09fc\u0a03\u0a08\u0a11\u0a16\u0a1a\u0a21"+
		"\u0a27\u0a2e\u0a35\u0a3c\u0a44\u0a4b\u0a53\u0a57\u0a5e\u0a65\u0a6c\u0a74"+
		"\u0a7b\u0a83\u0a89\u0a8f\u0a9b\u0aa0\u0aa5\u0ab0\u0ab9\u0ac0\u0ac7\u0acf"+
		"\u0ad3\u0adc\u0ae7\u0ae9\u0af3\u0afe\u0b09\u0b14\u0b1f\u0b2b\u0b2d\u0b42"+
		"\u0b44\u0b57\u0b59\u0b65\u0b67\u0b76\u0b78\u0b82\u0b90\u0b94\u0b98\u0b9a"+
		"\u0bb1\u0bbc\u0bc2";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}