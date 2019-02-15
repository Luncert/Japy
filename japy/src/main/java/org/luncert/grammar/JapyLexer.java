package org.luncert.grammar;
// Generated from Japy.g4 by ANTLR 4.7.2

	import java.util.List;
	import java.util.ArrayList;
	import java.util.stream.Collectors;
	import org.antlr.v4.runtime.Token;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JapyLexer extends Lexer {
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
		URSHIFT_ASSIGN=116, Identifier=117, WS=118, COMMENT=119, LINE_COMMENT=120;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
			"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
			"ELSE", "ENUM", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPORT", 
			"INSTANCEOF", "IN", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
			"PASS", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", 
			"STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", 
			"TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "UNDER_SCORE", "NEWLINE", 
			"IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
			"BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
			"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
			"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
			"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", 
			"OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral", 
			"BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
			"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
			"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
			"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
			"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
			"StringCharacter", "EscapeSequence", "OctalEscape", "ZeroToThree", "UnicodeEscape", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ELLIPSIS", "AT", "COLONCOLON", "ASSIGN", "GT", 
			"LT", "BANG", "TILDE", "QUESTION", "COLON", "ARROW", "EQUAL", "LE", "GE", 
			"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
			"BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "JavaLetter", "JavaLetterOrDigit", 
			"WS", "COMMENT", "LINE_COMMENT"
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
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
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
				emit(commonToken(JapyParser.NEWLINE, "\n"));

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



	public JapyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Japy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 62:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:


					if (this._text == null) {
						// System.out.println("pass " + _tokenStartLine + ":" + _tokenStartCharIndex);
						return;
					}

					String newLine = this._text.replaceAll("[^\n]+", "");
					String spaces = this._text.replace("[\n]+", "");
					int next = this._input.LA(1);

					if (this.opened > 0 || next == 10 /* '\n' */) {
						// If we're inside a list or on a blank line, ignore all indents,
						// dedents and line breaks.
						this.skip();
					} else {
						this.emit(this.commonToken(JapyParser.NEWLINE, newLine));

						int indent = this.getIndentationCount(spaces);
						int previous = !this.indents.isEmpty() ?
										this.indents.get(this.indents.size() - 1) : 0;

						if (indent == previous) {
							// skip indents of the same size as the present indent-size
							this.skip();
						} else if (indent > previous) {
							// emit Indent
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
				
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 161:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 162:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2z\u04b2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%"+
		"\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\39"+
		"\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3@\3@\7@\u02e8\n@\f@\16@\u02eb"+
		"\13@\3@\3@\3A\3A\3A\3A\5A\u02f3\nA\3B\3B\5B\u02f7\nB\3C\3C\5C\u02fb\n"+
		"C\3D\3D\5D\u02ff\nD\3E\3E\5E\u0303\nE\3F\3F\3G\3G\3G\5G\u030a\nG\3G\3"+
		"G\3G\5G\u030f\nG\5G\u0311\nG\3H\3H\5H\u0315\nH\3H\5H\u0318\nH\3I\3I\5"+
		"I\u031c\nI\3J\3J\3K\6K\u0321\nK\rK\16K\u0322\3L\3L\5L\u0327\nL\3M\6M\u032a"+
		"\nM\rM\16M\u032b\3N\3N\3N\3N\3O\3O\5O\u0334\nO\3O\5O\u0337\nO\3P\3P\3"+
		"Q\6Q\u033c\nQ\rQ\16Q\u033d\3R\3R\5R\u0342\nR\3S\3S\5S\u0346\nS\3S\3S\3"+
		"T\3T\5T\u034c\nT\3T\5T\u034f\nT\3U\3U\3V\6V\u0354\nV\rV\16V\u0355\3W\3"+
		"W\5W\u035a\nW\3X\3X\3X\3X\3Y\3Y\5Y\u0362\nY\3Y\5Y\u0365\nY\3Z\3Z\3[\6"+
		"[\u036a\n[\r[\16[\u036b\3\\\3\\\5\\\u0370\n\\\3]\3]\5]\u0374\n]\3^\3^"+
		"\3^\5^\u0379\n^\3^\5^\u037c\n^\3^\5^\u037f\n^\3^\3^\3^\5^\u0384\n^\3^"+
		"\5^\u0387\n^\3^\3^\3^\5^\u038c\n^\3^\3^\3^\5^\u0391\n^\3_\3_\3_\3`\3`"+
		"\3a\5a\u0399\na\3a\3a\3b\3b\3c\3c\3d\3d\3d\5d\u03a4\nd\3e\3e\5e\u03a8"+
		"\ne\3e\3e\3e\5e\u03ad\ne\3e\3e\5e\u03b1\ne\3f\3f\3f\3g\3g\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\5h\u03c1\nh\3i\3i\3i\3i\3i\3i\3i\3i\5i\u03cb\ni\3j\3j"+
		"\3k\3k\5k\u03d1\nk\3k\3k\3l\6l\u03d6\nl\rl\16l\u03d7\3m\3m\5m\u03dc\n"+
		"m\3n\3n\3n\3n\5n\u03e2\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u03ef\n"+
		"o\3p\3p\3q\3q\6q\u03f5\nq\rq\16q\u03f6\3q\3q\3q\3q\3q\3r\3r\3r\3r\3r\3"+
		"s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3|\3|\3}\3"+
		"}\3~\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094"+
		"\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098"+
		"\3\u0098\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b"+
		"\3\u009b\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\7\u00a2\u047e"+
		"\n\u00a2\f\u00a2\16\u00a2\u0481\13\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\5\u00a3\u0489\n\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\5\u00a4\u0491\n\u00a4\3\u00a5\6\u00a5\u0494\n\u00a5\r"+
		"\u00a5\16\u00a5\u0495\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\7\u00a6\u049e\n\u00a6\f\u00a6\16\u00a6\u04a1\13\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u04ac"+
		"\n\u00a7\f\u00a7\16\u00a7\u04af\13\u00a7\3\u00a7\3\u00a7\3\u049f\2\u00a8"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d"+
		"\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f"+
		"\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1"+
		"\2\u00b3\2\u00b5\2\u00b7\2\u00b9C\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3"+
		"\2\u00c5\2\u00c7\2\u00c9\2\u00cb\2\u00cd\2\u00cfD\u00d1E\u00d3\2\u00d5"+
		"F\u00d7\2\u00d9\2\u00db\2\u00dd\2\u00df\2\u00e1\2\u00e3G\u00e5H\u00e7"+
		"I\u00e9J\u00ebK\u00edL\u00efM\u00f1N\u00f3O\u00f5P\u00f7Q\u00f9R\u00fb"+
		"S\u00fdT\u00ffU\u0101V\u0103W\u0105X\u0107Y\u0109Z\u010b[\u010d\\\u010f"+
		"]\u0111^\u0113_\u0115`\u0117a\u0119b\u011bc\u011dd\u011fe\u0121f\u0123"+
		"g\u0125h\u0127i\u0129j\u012bk\u012dl\u012fm\u0131n\u0133o\u0135p\u0137"+
		"q\u0139r\u013bs\u013dt\u013fu\u0141v\u0143w\u0145\2\u0147\2\u0149x\u014b"+
		"y\u014dz\3\2\31\4\2\13\13\"\"\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2"+
		"\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\6\2\f\f\17"+
		"\17))^^\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4"+
		"\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aa"+
		"c|\4\2\16\17\"\"\4\2\f\f\17\17\2\u04c2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u00b9\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d5"+
		"\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2"+
		"\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3"+
		"\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2"+
		"\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105"+
		"\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2"+
		"\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117"+
		"\3\2\2\2\2\u0119\3\2\2\2\2\u011b\3\2\2\2\2\u011d\3\2\2\2\2\u011f\3\2\2"+
		"\2\2\u0121\3\2\2\2\2\u0123\3\2\2\2\2\u0125\3\2\2\2\2\u0127\3\2\2\2\2\u0129"+
		"\3\2\2\2\2\u012b\3\2\2\2\2\u012d\3\2\2\2\2\u012f\3\2\2\2\2\u0131\3\2\2"+
		"\2\2\u0133\3\2\2\2\2\u0135\3\2\2\2\2\u0137\3\2\2\2\2\u0139\3\2\2\2\2\u013b"+
		"\3\2\2\2\2\u013d\3\2\2\2\2\u013f\3\2\2\2\2\u0141\3\2\2\2\2\u0143\3\2\2"+
		"\2\2\u0149\3\2\2\2\2\u014b\3\2\2\2\2\u014d\3\2\2\2\3\u014f\3\2\2\2\5\u0157"+
		"\3\2\2\2\7\u015c\3\2\2\2\t\u0163\3\2\2\2\13\u016c\3\2\2\2\r\u0174\3\2"+
		"\2\2\17\u0177\3\2\2\2\21\u017d\3\2\2\2\23\u0182\3\2\2\2\25\u018b\3\2\2"+
		"\2\27\u0190\3\2\2\2\31\u019b\3\2\2\2\33\u01a4\3\2\2\2\35\u01ab\3\2\2\2"+
		"\37\u01b3\3\2\2\2!\u01b9\3\2\2\2#\u01be\3\2\2\2%\u01c3\3\2\2\2\'\u01c9"+
		"\3\2\2\2)\u01ce\3\2\2\2+\u01d4\3\2\2\2-\u01da\3\2\2\2/\u01e3\3\2\2\2\61"+
		"\u01eb\3\2\2\2\63\u01ee\3\2\2\2\65\u01f5\3\2\2\2\67\u01fa\3\2\2\29\u01ff"+
		"\3\2\2\2;\u0205\3\2\2\2=\u020d\3\2\2\2?\u0213\3\2\2\2A\u0217\3\2\2\2C"+
		"\u021a\3\2\2\2E\u021f\3\2\2\2G\u0226\3\2\2\2I\u0231\3\2\2\2K\u0234\3\2"+
		"\2\2M\u0238\3\2\2\2O\u0242\3\2\2\2Q\u0247\3\2\2\2S\u024e\3\2\2\2U\u0252"+
		"\3\2\2\2W\u025a\3\2\2\2Y\u025f\3\2\2\2[\u0267\3\2\2\2]\u0271\3\2\2\2_"+
		"\u0278\3\2\2\2a\u027f\3\2\2\2c\u0285\3\2\2\2e\u028c\3\2\2\2g\u0295\3\2"+
		"\2\2i\u029b\3\2\2\2k\u02a2\3\2\2\2m\u02af\3\2\2\2o\u02b4\3\2\2\2q\u02ba"+
		"\3\2\2\2s\u02c1\3\2\2\2u\u02cb\3\2\2\2w\u02cf\3\2\2\2y\u02d4\3\2\2\2{"+
		"\u02dd\3\2\2\2}\u02e3\3\2\2\2\177\u02e5\3\2\2\2\u0081\u02f2\3\2\2\2\u0083"+
		"\u02f4\3\2\2\2\u0085\u02f8\3\2\2\2\u0087\u02fc\3\2\2\2\u0089\u0300\3\2"+
		"\2\2\u008b\u0304\3\2\2\2\u008d\u0310\3\2\2\2\u008f\u0312\3\2\2\2\u0091"+
		"\u031b\3\2\2\2\u0093\u031d\3\2\2\2\u0095\u0320\3\2\2\2\u0097\u0326\3\2"+
		"\2\2\u0099\u0329\3\2\2\2\u009b\u032d\3\2\2\2\u009d\u0331\3\2\2\2\u009f"+
		"\u0338\3\2\2\2\u00a1\u033b\3\2\2\2\u00a3\u0341\3\2\2\2\u00a5\u0343\3\2"+
		"\2\2\u00a7\u0349\3\2\2\2\u00a9\u0350\3\2\2\2\u00ab\u0353\3\2\2\2\u00ad"+
		"\u0359\3\2\2\2\u00af\u035b\3\2\2\2\u00b1\u035f\3\2\2\2\u00b3\u0366\3\2"+
		"\2\2\u00b5\u0369\3\2\2\2\u00b7\u036f\3\2\2\2\u00b9\u0373\3\2\2\2\u00bb"+
		"\u0390\3\2\2\2\u00bd\u0392\3\2\2\2\u00bf\u0395\3\2\2\2\u00c1\u0398\3\2"+
		"\2\2\u00c3\u039c\3\2\2\2\u00c5\u039e\3\2\2\2\u00c7\u03a0\3\2\2\2\u00c9"+
		"\u03b0\3\2\2\2\u00cb\u03b2\3\2\2\2\u00cd\u03b5\3\2\2\2\u00cf\u03c0\3\2"+
		"\2\2\u00d1\u03ca\3\2\2\2\u00d3\u03cc\3\2\2\2\u00d5\u03ce\3\2\2\2\u00d7"+
		"\u03d5\3\2\2\2\u00d9\u03db\3\2\2\2\u00db\u03e1\3\2\2\2\u00dd\u03ee\3\2"+
		"\2\2\u00df\u03f0\3\2\2\2\u00e1\u03f2\3\2\2\2\u00e3\u03fd\3\2\2\2\u00e5"+
		"\u0402\3\2\2\2\u00e7\u0404\3\2\2\2\u00e9\u0406\3\2\2\2\u00eb\u0408\3\2"+
		"\2\2\u00ed\u040a\3\2\2\2\u00ef\u040c\3\2\2\2\u00f1\u040e\3\2\2\2\u00f3"+
		"\u0410\3\2\2\2\u00f5\u0412\3\2\2\2\u00f7\u0414\3\2\2\2\u00f9\u0418\3\2"+
		"\2\2\u00fb\u041a\3\2\2\2\u00fd\u041d\3\2\2\2\u00ff\u041f\3\2\2\2\u0101"+
		"\u0421\3\2\2\2\u0103\u0423\3\2\2\2\u0105\u0425\3\2\2\2\u0107\u0427\3\2"+
		"\2\2\u0109\u0429\3\2\2\2\u010b\u042b\3\2\2\2\u010d\u042e\3\2\2\2\u010f"+
		"\u0431\3\2\2\2\u0111\u0434\3\2\2\2\u0113\u0437\3\2\2\2\u0115\u043a\3\2"+
		"\2\2\u0117\u043d\3\2\2\2\u0119\u0440\3\2\2\2\u011b\u0443\3\2\2\2\u011d"+
		"\u0446\3\2\2\2\u011f\u0448\3\2\2\2\u0121\u044a\3\2\2\2\u0123\u044c\3\2"+
		"\2\2\u0125\u044e\3\2\2\2\u0127\u0450\3\2\2\2\u0129\u0452\3\2\2\2\u012b"+
		"\u0454\3\2\2\2\u012d\u0456\3\2\2\2\u012f\u0459\3\2\2\2\u0131\u045c\3\2"+
		"\2\2\u0133\u045f\3\2\2\2\u0135\u0462\3\2\2\2\u0137\u0465\3\2\2\2\u0139"+
		"\u0468\3\2\2\2\u013b\u046b\3\2\2\2\u013d\u046e\3\2\2\2\u013f\u0472\3\2"+
		"\2\2\u0141\u0476\3\2\2\2\u0143\u047b\3\2\2\2\u0145\u0488\3\2\2\2\u0147"+
		"\u0490\3\2\2\2\u0149\u0493\3\2\2\2\u014b\u0499\3\2\2\2\u014d\u04a7\3\2"+
		"\2\2\u014f\u0150\7g\2\2\u0150\u0151\7z\2\2\u0151\u0152\7v\2\2\u0152\u0153"+
		"\7g\2\2\u0153\u0154\7p\2\2\u0154\u0155\7f\2\2\u0155\u0156\7u\2\2\u0156"+
		"\4\3\2\2\2\u0157\u0158\7q\2\2\u0158\u0159\7r\2\2\u0159\u015a\7g\2\2\u015a"+
		"\u015b\7p\2\2\u015b\6\3\2\2\2\u015c\u015d\7o\2\2\u015d\u015e\7q\2\2\u015e"+
		"\u015f\7f\2\2\u015f\u0160\7w\2\2\u0160\u0161\7n\2\2\u0161\u0162\7g\2\2"+
		"\u0162\b\3\2\2\2\u0163\u0164\7t\2\2\u0164\u0165\7g\2\2\u0165\u0166\7s"+
		"\2\2\u0166\u0167\7w\2\2\u0167\u0168\7k\2\2\u0168\u0169\7t\2\2\u0169\u016a"+
		"\7g\2\2\u016a\u016b\7u\2\2\u016b\n\3\2\2\2\u016c\u016d\7g\2\2\u016d\u016e"+
		"\7z\2\2\u016e\u016f\7r\2\2\u016f\u0170\7q\2\2\u0170\u0171\7t\2\2\u0171"+
		"\u0172\7v\2\2\u0172\u0173\7u\2\2\u0173\f\3\2\2\2\u0174\u0175\7v\2\2\u0175"+
		"\u0176\7q\2\2\u0176\16\3\2\2\2\u0177\u0178\7q\2\2\u0178\u0179\7r\2\2\u0179"+
		"\u017a\7g\2\2\u017a\u017b\7p\2\2\u017b\u017c\7u\2\2\u017c\20\3\2\2\2\u017d"+
		"\u017e\7w\2\2\u017e\u017f\7u\2\2\u017f\u0180\7g\2\2\u0180\u0181\7u\2\2"+
		"\u0181\22\3\2\2\2\u0182\u0183\7r\2\2\u0183\u0184\7t\2\2\u0184\u0185\7"+
		"q\2\2\u0185\u0186\7x\2\2\u0186\u0187\7k\2\2\u0187\u0188\7f\2\2\u0188\u0189"+
		"\7g\2\2\u0189\u018a\7u\2\2\u018a\24\3\2\2\2\u018b\u018c\7y\2\2\u018c\u018d"+
		"\7k\2\2\u018d\u018e\7v\2\2\u018e\u018f\7j\2\2\u018f\26\3\2\2\2\u0190\u0191"+
		"\7v\2\2\u0191\u0192\7t\2\2\u0192\u0193\7c\2\2\u0193\u0194\7p\2\2\u0194"+
		"\u0195\7u\2\2\u0195\u0196\7k\2\2\u0196\u0197\7v\2\2\u0197\u0198\7k\2\2"+
		"\u0198\u0199\7x\2\2\u0199\u019a\7g\2\2\u019a\30\3\2\2\2\u019b\u019c\7"+
		"c\2\2\u019c\u019d\7d\2\2\u019d\u019e\7u\2\2\u019e\u019f\7v\2\2\u019f\u01a0"+
		"\7t\2\2\u01a0\u01a1\7c\2\2\u01a1\u01a2\7e\2\2\u01a2\u01a3\7v\2\2\u01a3"+
		"\32\3\2\2\2\u01a4\u01a5\7c\2\2\u01a5\u01a6\7u\2\2\u01a6\u01a7\7u\2\2\u01a7"+
		"\u01a8\7g\2\2\u01a8\u01a9\7t\2\2\u01a9\u01aa\7v\2\2\u01aa\34\3\2\2\2\u01ab"+
		"\u01ac\7d\2\2\u01ac\u01ad\7q\2\2\u01ad\u01ae\7q\2\2\u01ae\u01af\7n\2\2"+
		"\u01af\u01b0\7g\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7p\2\2\u01b2\36\3\2"+
		"\2\2\u01b3\u01b4\7d\2\2\u01b4\u01b5\7t\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b7"+
		"\7c\2\2\u01b7\u01b8\7m\2\2\u01b8 \3\2\2\2\u01b9\u01ba\7d\2\2\u01ba\u01bb"+
		"\7{\2\2\u01bb\u01bc\7v\2\2\u01bc\u01bd\7g\2\2\u01bd\"\3\2\2\2\u01be\u01bf"+
		"\7e\2\2\u01bf\u01c0\7c\2\2\u01c0\u01c1\7u\2\2\u01c1\u01c2\7g\2\2\u01c2"+
		"$\3\2\2\2\u01c3\u01c4\7e\2\2\u01c4\u01c5\7c\2\2\u01c5\u01c6\7v\2\2\u01c6"+
		"\u01c7\7e\2\2\u01c7\u01c8\7j\2\2\u01c8&\3\2\2\2\u01c9\u01ca\7e\2\2\u01ca"+
		"\u01cb\7j\2\2\u01cb\u01cc\7c\2\2\u01cc\u01cd\7t\2\2\u01cd(\3\2\2\2\u01ce"+
		"\u01cf\7e\2\2\u01cf\u01d0\7n\2\2\u01d0\u01d1\7c\2\2\u01d1\u01d2\7u\2\2"+
		"\u01d2\u01d3\7u\2\2\u01d3*\3\2\2\2\u01d4\u01d5\7e\2\2\u01d5\u01d6\7q\2"+
		"\2\u01d6\u01d7\7p\2\2\u01d7\u01d8\7u\2\2\u01d8\u01d9\7v\2\2\u01d9,\3\2"+
		"\2\2\u01da\u01db\7e\2\2\u01db\u01dc\7q\2\2\u01dc\u01dd\7p\2\2\u01dd\u01de"+
		"\7v\2\2\u01de\u01df\7k\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1\7w\2\2\u01e1"+
		"\u01e2\7g\2\2\u01e2.\3\2\2\2\u01e3\u01e4\7f\2\2\u01e4\u01e5\7g\2\2\u01e5"+
		"\u01e6\7h\2\2\u01e6\u01e7\7c\2\2\u01e7\u01e8\7w\2\2\u01e8\u01e9\7n\2\2"+
		"\u01e9\u01ea\7v\2\2\u01ea\60\3\2\2\2\u01eb\u01ec\7f\2\2\u01ec\u01ed\7"+
		"q\2\2\u01ed\62\3\2\2\2\u01ee\u01ef\7f\2\2\u01ef\u01f0\7q\2\2\u01f0\u01f1"+
		"\7w\2\2\u01f1\u01f2\7d\2\2\u01f2\u01f3\7n\2\2\u01f3\u01f4\7g\2\2\u01f4"+
		"\64\3\2\2\2\u01f5\u01f6\7g\2\2\u01f6\u01f7\7n\2\2\u01f7\u01f8\7u\2\2\u01f8"+
		"\u01f9\7g\2\2\u01f9\66\3\2\2\2\u01fa\u01fb\7g\2\2\u01fb\u01fc\7p\2\2\u01fc"+
		"\u01fd\7w\2\2\u01fd\u01fe\7o\2\2\u01fe8\3\2\2\2\u01ff\u0200\7h\2\2\u0200"+
		"\u0201\7k\2\2\u0201\u0202\7p\2\2\u0202\u0203\7c\2\2\u0203\u0204\7n\2\2"+
		"\u0204:\3\2\2\2\u0205\u0206\7h\2\2\u0206\u0207\7k\2\2\u0207\u0208\7p\2"+
		"\2\u0208\u0209\7c\2\2\u0209\u020a\7n\2\2\u020a\u020b\7n\2\2\u020b\u020c"+
		"\7{\2\2\u020c<\3\2\2\2\u020d\u020e\7h\2\2\u020e\u020f\7n\2\2\u020f\u0210"+
		"\7q\2\2\u0210\u0211\7c\2\2\u0211\u0212\7v\2\2\u0212>\3\2\2\2\u0213\u0214"+
		"\7h\2\2\u0214\u0215\7q\2\2\u0215\u0216\7t\2\2\u0216@\3\2\2\2\u0217\u0218"+
		"\7k\2\2\u0218\u0219\7h\2\2\u0219B\3\2\2\2\u021a\u021b\7i\2\2\u021b\u021c"+
		"\7q\2\2\u021c\u021d\7v\2\2\u021d\u021e\7q\2\2\u021eD\3\2\2\2\u021f\u0220"+
		"\7k\2\2\u0220\u0221\7o\2\2\u0221\u0222\7r\2\2\u0222\u0223\7q\2\2\u0223"+
		"\u0224\7t\2\2\u0224\u0225\7v\2\2\u0225F\3\2\2\2\u0226\u0227\7k\2\2\u0227"+
		"\u0228\7p\2\2\u0228\u0229\7u\2\2\u0229\u022a\7v\2\2\u022a\u022b\7c\2\2"+
		"\u022b\u022c\7p\2\2\u022c\u022d\7e\2\2\u022d\u022e\7g\2\2\u022e\u022f"+
		"\7q\2\2\u022f\u0230\7h\2\2\u0230H\3\2\2\2\u0231\u0232\7k\2\2\u0232\u0233"+
		"\7p\2\2\u0233J\3\2\2\2\u0234\u0235\7k\2\2\u0235\u0236\7p\2\2\u0236\u0237"+
		"\7v\2\2\u0237L\3\2\2\2\u0238\u0239\7k\2\2\u0239\u023a\7p\2\2\u023a\u023b"+
		"\7v\2\2\u023b\u023c\7g\2\2\u023c\u023d\7t\2\2\u023d\u023e\7h\2\2\u023e"+
		"\u023f\7c\2\2\u023f\u0240\7e\2\2\u0240\u0241\7g\2\2\u0241N\3\2\2\2\u0242"+
		"\u0243\7n\2\2\u0243\u0244\7q\2\2\u0244\u0245\7p\2\2\u0245\u0246\7i\2\2"+
		"\u0246P\3\2\2\2\u0247\u0248\7p\2\2\u0248\u0249\7c\2\2\u0249\u024a\7v\2"+
		"\2\u024a\u024b\7k\2\2\u024b\u024c\7x\2\2\u024c\u024d\7g\2\2\u024dR\3\2"+
		"\2\2\u024e\u024f\7p\2\2\u024f\u0250\7g\2\2\u0250\u0251\7y\2\2\u0251T\3"+
		"\2\2\2\u0252\u0253\7r\2\2\u0253\u0254\7c\2\2\u0254\u0255\7e\2\2\u0255"+
		"\u0256\7m\2\2\u0256\u0257\7c\2\2\u0257\u0258\7i\2\2\u0258\u0259\7g\2\2"+
		"\u0259V\3\2\2\2\u025a\u025b\7r\2\2\u025b\u025c\7c\2\2\u025c\u025d\7u\2"+
		"\2\u025d\u025e\7u\2\2\u025eX\3\2\2\2\u025f\u0260\7r\2\2\u0260\u0261\7"+
		"t\2\2\u0261\u0262\7k\2\2\u0262\u0263\7x\2\2\u0263\u0264\7c\2\2\u0264\u0265"+
		"\7v\2\2\u0265\u0266\7g\2\2\u0266Z\3\2\2\2\u0267\u0268\7r\2\2\u0268\u0269"+
		"\7t\2\2\u0269\u026a\7q\2\2\u026a\u026b\7v\2\2\u026b\u026c\7g\2\2\u026c"+
		"\u026d\7e\2\2\u026d\u026e\7v\2\2\u026e\u026f\7g\2\2\u026f\u0270\7f\2\2"+
		"\u0270\\\3\2\2\2\u0271\u0272\7r\2\2\u0272\u0273\7w\2\2\u0273\u0274\7d"+
		"\2\2\u0274\u0275\7n\2\2\u0275\u0276\7k\2\2\u0276\u0277\7e\2\2\u0277^\3"+
		"\2\2\2\u0278\u0279\7t\2\2\u0279\u027a\7g\2\2\u027a\u027b\7v\2\2\u027b"+
		"\u027c\7w\2\2\u027c\u027d\7t\2\2\u027d\u027e\7p\2\2\u027e`\3\2\2\2\u027f"+
		"\u0280\7u\2\2\u0280\u0281\7j\2\2\u0281\u0282\7q\2\2\u0282\u0283\7t\2\2"+
		"\u0283\u0284\7v\2\2\u0284b\3\2\2\2\u0285\u0286\7u\2\2\u0286\u0287\7v\2"+
		"\2\u0287\u0288\7c\2\2\u0288\u0289\7v\2\2\u0289\u028a\7k\2\2\u028a\u028b"+
		"\7e\2\2\u028bd\3\2\2\2\u028c\u028d\7u\2\2\u028d\u028e\7v\2\2\u028e\u028f"+
		"\7t\2\2\u028f\u0290\7k\2\2\u0290\u0291\7e\2\2\u0291\u0292\7v\2\2\u0292"+
		"\u0293\7h\2\2\u0293\u0294\7r\2\2\u0294f\3\2\2\2\u0295\u0296\7u\2\2\u0296"+
		"\u0297\7w\2\2\u0297\u0298\7r\2\2\u0298\u0299\7g\2\2\u0299\u029a\7t\2\2"+
		"\u029ah\3\2\2\2\u029b\u029c\7u\2\2\u029c\u029d\7y\2\2\u029d\u029e\7k\2"+
		"\2\u029e\u029f\7v\2\2\u029f\u02a0\7e\2\2\u02a0\u02a1\7j\2\2\u02a1j\3\2"+
		"\2\2\u02a2\u02a3\7u\2\2\u02a3\u02a4\7{\2\2\u02a4\u02a5\7p\2\2\u02a5\u02a6"+
		"\7e\2\2\u02a6\u02a7\7j\2\2\u02a7\u02a8\7t\2\2\u02a8\u02a9\7q\2\2\u02a9"+
		"\u02aa\7p\2\2\u02aa\u02ab\7k\2\2\u02ab\u02ac\7|\2\2\u02ac\u02ad\7g\2\2"+
		"\u02ad\u02ae\7f\2\2\u02ael\3\2\2\2\u02af\u02b0\7v\2\2\u02b0\u02b1\7j\2"+
		"\2\u02b1\u02b2\7k\2\2\u02b2\u02b3\7u\2\2\u02b3n\3\2\2\2\u02b4\u02b5\7"+
		"v\2\2\u02b5\u02b6\7j\2\2\u02b6\u02b7\7t\2\2\u02b7\u02b8\7q\2\2\u02b8\u02b9"+
		"\7y\2\2\u02b9p\3\2\2\2\u02ba\u02bb\7v\2\2\u02bb\u02bc\7j\2\2\u02bc\u02bd"+
		"\7t\2\2\u02bd\u02be\7q\2\2\u02be\u02bf\7y\2\2\u02bf\u02c0\7u\2\2\u02c0"+
		"r\3\2\2\2\u02c1\u02c2\7v\2\2\u02c2\u02c3\7t\2\2\u02c3\u02c4\7c\2\2\u02c4"+
		"\u02c5\7p\2\2\u02c5\u02c6\7u\2\2\u02c6\u02c7\7k\2\2\u02c7\u02c8\7g\2\2"+
		"\u02c8\u02c9\7p\2\2\u02c9\u02ca\7v\2\2\u02cat\3\2\2\2\u02cb\u02cc\7v\2"+
		"\2\u02cc\u02cd\7t\2\2\u02cd\u02ce\7{\2\2\u02cev\3\2\2\2\u02cf\u02d0\7"+
		"x\2\2\u02d0\u02d1\7q\2\2\u02d1\u02d2\7k\2\2\u02d2\u02d3\7f\2\2\u02d3x"+
		"\3\2\2\2\u02d4\u02d5\7x\2\2\u02d5\u02d6\7q\2\2\u02d6\u02d7\7n\2\2\u02d7"+
		"\u02d8\7c\2\2\u02d8\u02d9\7v\2\2\u02d9\u02da\7k\2\2\u02da\u02db\7n\2\2"+
		"\u02db\u02dc\7g\2\2\u02dcz\3\2\2\2\u02dd\u02de\7y\2\2\u02de\u02df\7j\2"+
		"\2\u02df\u02e0\7k\2\2\u02e0\u02e1\7n\2\2\u02e1\u02e2\7g\2\2\u02e2|\3\2"+
		"\2\2\u02e3\u02e4\7a\2\2\u02e4~\3\2\2\2\u02e5\u02e9\7\f\2\2\u02e6\u02e8"+
		"\t\2\2\2\u02e7\u02e6\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\b@"+
		"\2\2\u02ed\u0080\3\2\2\2\u02ee\u02f3\5\u0083B\2\u02ef\u02f3\5\u0085C\2"+
		"\u02f0\u02f3\5\u0087D\2\u02f1\u02f3\5\u0089E\2\u02f2\u02ee\3\2\2\2\u02f2"+
		"\u02ef\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f1\3\2\2\2\u02f3\u0082\3\2"+
		"\2\2\u02f4\u02f6\5\u008dG\2\u02f5\u02f7\5\u008bF\2\u02f6\u02f5\3\2\2\2"+
		"\u02f6\u02f7\3\2\2\2\u02f7\u0084\3\2\2\2\u02f8\u02fa\5\u009bN\2\u02f9"+
		"\u02fb\5\u008bF\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u0086"+
		"\3\2\2\2\u02fc\u02fe\5\u00a5S\2\u02fd\u02ff\5\u008bF\2\u02fe\u02fd\3\2"+
		"\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0088\3\2\2\2\u0300\u0302\5\u00afX\2\u0301"+
		"\u0303\5\u008bF\2\u0302\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u008a"+
		"\3\2\2\2\u0304\u0305\t\3\2\2\u0305\u008c\3\2\2\2\u0306\u0311\7\62\2\2"+
		"\u0307\u030e\5\u0093J\2\u0308\u030a\5\u008fH\2\u0309\u0308\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030a\u030f\3\2\2\2\u030b\u030c\5\u0099M\2\u030c\u030d"+
		"\5\u008fH\2\u030d\u030f\3\2\2\2\u030e\u0309\3\2\2\2\u030e\u030b\3\2\2"+
		"\2\u030f\u0311\3\2\2\2\u0310\u0306\3\2\2\2\u0310\u0307\3\2\2\2\u0311\u008e"+
		"\3\2\2\2\u0312\u0317\5\u0091I\2\u0313\u0315\5\u0095K\2\u0314\u0313\3\2"+
		"\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0318\5\u0091I\2\u0317"+
		"\u0314\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0090\3\2\2\2\u0319\u031c\7\62"+
		"\2\2\u031a\u031c\5\u0093J\2\u031b\u0319\3\2\2\2\u031b\u031a\3\2\2\2\u031c"+
		"\u0092\3\2\2\2\u031d\u031e\t\4\2\2\u031e\u0094\3\2\2\2\u031f\u0321\5\u0097"+
		"L\2\u0320\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0320\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u0096\3\2\2\2\u0324\u0327\5\u0091I\2\u0325\u0327"+
		"\7a\2\2\u0326\u0324\3\2\2\2\u0326\u0325\3\2\2\2\u0327\u0098\3\2\2\2\u0328"+
		"\u032a\7a\2\2\u0329\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u0329\3\2"+
		"\2\2\u032b\u032c\3\2\2\2\u032c\u009a\3\2\2\2\u032d\u032e\7\62\2\2\u032e"+
		"\u032f\t\5\2\2\u032f\u0330\5\u009dO\2\u0330\u009c\3\2\2\2\u0331\u0336"+
		"\5\u009fP\2\u0332\u0334\5\u00a1Q\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2"+
		"\2\2\u0334\u0335\3\2\2\2\u0335\u0337\5\u009fP\2\u0336\u0333\3\2\2\2\u0336"+
		"\u0337\3\2\2\2\u0337\u009e\3\2\2\2\u0338\u0339\t\6\2\2\u0339\u00a0\3\2"+
		"\2\2\u033a\u033c\5\u00a3R\2\u033b\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d"+
		"\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u00a2\3\2\2\2\u033f\u0342\5\u009f"+
		"P\2\u0340\u0342\7a\2\2\u0341\u033f\3\2\2\2\u0341\u0340\3\2\2\2\u0342\u00a4"+
		"\3\2\2\2\u0343\u0345\7\62\2\2\u0344\u0346\5\u0099M\2\u0345\u0344\3\2\2"+
		"\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\5\u00a7T\2\u0348"+
		"\u00a6\3\2\2\2\u0349\u034e\5\u00a9U\2\u034a\u034c\5\u00abV\2\u034b\u034a"+
		"\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\5\u00a9U"+
		"\2\u034e\u034b\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u00a8\3\2\2\2\u0350\u0351"+
		"\t\7\2\2\u0351\u00aa\3\2\2\2\u0352\u0354\5\u00adW\2\u0353\u0352\3\2\2"+
		"\2\u0354\u0355\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u00ac"+
		"\3\2\2\2\u0357\u035a\5\u00a9U\2\u0358\u035a\7a\2\2\u0359\u0357\3\2\2\2"+
		"\u0359\u0358\3\2\2\2\u035a\u00ae\3\2\2\2\u035b\u035c\7\62\2\2\u035c\u035d"+
		"\t\b\2\2\u035d\u035e\5\u00b1Y\2\u035e\u00b0\3\2\2\2\u035f\u0364\5\u00b3"+
		"Z\2\u0360\u0362\5\u00b5[\2\u0361\u0360\3\2\2\2\u0361\u0362\3\2\2\2\u0362"+
		"\u0363\3\2\2\2\u0363\u0365\5\u00b3Z\2\u0364\u0361\3\2\2\2\u0364\u0365"+
		"\3\2\2\2\u0365\u00b2\3\2\2\2\u0366\u0367\t\t\2\2\u0367\u00b4\3\2\2\2\u0368"+
		"\u036a\5\u00b7\\\2\u0369\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u0369"+
		"\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u00b6\3\2\2\2\u036d\u0370\5\u00b3Z"+
		"\2\u036e\u0370\7a\2\2\u036f\u036d\3\2\2\2\u036f\u036e\3\2\2\2\u0370\u00b8"+
		"\3\2\2\2\u0371\u0374\5\u00bb^\2\u0372\u0374\5\u00c7d\2\u0373\u0371\3\2"+
		"\2\2\u0373\u0372\3\2\2\2\u0374\u00ba\3\2\2\2\u0375\u0376\5\u008fH\2\u0376"+
		"\u0378\7\60\2\2\u0377\u0379\5\u008fH\2\u0378\u0377\3\2\2\2\u0378\u0379"+
		"\3\2\2\2\u0379\u037b\3\2\2\2\u037a\u037c\5\u00bd_\2\u037b\u037a\3\2\2"+
		"\2\u037b\u037c\3\2\2\2\u037c\u037e\3\2\2\2\u037d\u037f\5\u00c5c\2\u037e"+
		"\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0391\3\2\2\2\u0380\u0381\7\60"+
		"\2\2\u0381\u0383\5\u008fH\2\u0382\u0384\5\u00bd_\2\u0383\u0382\3\2\2\2"+
		"\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u0387\5\u00c5c\2\u0386"+
		"\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0391\3\2\2\2\u0388\u0389\5\u008f"+
		"H\2\u0389\u038b\5\u00bd_\2\u038a\u038c\5\u00c5c\2\u038b\u038a\3\2\2\2"+
		"\u038b\u038c\3\2\2\2\u038c\u0391\3\2\2\2\u038d\u038e\5\u008fH\2\u038e"+
		"\u038f\5\u00c5c\2\u038f\u0391\3\2\2\2\u0390\u0375\3\2\2\2\u0390\u0380"+
		"\3\2\2\2\u0390\u0388\3\2\2\2\u0390\u038d\3\2\2\2\u0391\u00bc\3\2\2\2\u0392"+
		"\u0393\5\u00bf`\2\u0393\u0394\5\u00c1a\2\u0394\u00be\3\2\2\2\u0395\u0396"+
		"\t\n\2\2\u0396\u00c0\3\2\2\2\u0397\u0399\5\u00c3b\2\u0398\u0397\3\2\2"+
		"\2\u0398\u0399\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\5\u008fH\2\u039b"+
		"\u00c2\3\2\2\2\u039c\u039d\t\13\2\2\u039d\u00c4\3\2\2\2\u039e\u039f\t"+
		"\f\2\2\u039f\u00c6\3\2\2\2\u03a0\u03a1\5\u00c9e\2\u03a1\u03a3\5\u00cb"+
		"f\2\u03a2\u03a4\5\u00c5c\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4"+
		"\u00c8\3\2\2\2\u03a5\u03a7\5\u009bN\2\u03a6\u03a8\7\60\2\2\u03a7\u03a6"+
		"\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03b1\3\2\2\2\u03a9\u03aa\7\62\2\2"+
		"\u03aa\u03ac\t\5\2\2\u03ab\u03ad\5\u009dO\2\u03ac\u03ab\3\2\2\2\u03ac"+
		"\u03ad\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\7\60\2\2\u03af\u03b1\5"+
		"\u009dO\2\u03b0\u03a5\3\2\2\2\u03b0\u03a9\3\2\2\2\u03b1\u00ca\3\2\2\2"+
		"\u03b2\u03b3\5\u00cdg\2\u03b3\u03b4\5\u00c1a\2\u03b4\u00cc\3\2\2\2\u03b5"+
		"\u03b6\t\r\2\2\u03b6\u00ce\3\2\2\2\u03b7\u03b8\7v\2\2\u03b8\u03b9\7t\2"+
		"\2\u03b9\u03ba\7w\2\2\u03ba\u03c1\7g\2\2\u03bb\u03bc\7h\2\2\u03bc\u03bd"+
		"\7c\2\2\u03bd\u03be\7n\2\2\u03be\u03bf\7u\2\2\u03bf\u03c1\7g\2\2\u03c0"+
		"\u03b7\3\2\2\2\u03c0\u03bb\3\2\2\2\u03c1\u00d0\3\2\2\2\u03c2\u03c3\7)"+
		"\2\2\u03c3\u03c4\5\u00d3j\2\u03c4\u03c5\7)\2\2\u03c5\u03cb\3\2\2\2\u03c6"+
		"\u03c7\7)\2\2\u03c7\u03c8\5\u00dbn\2\u03c8\u03c9\7)\2\2\u03c9\u03cb\3"+
		"\2\2\2\u03ca\u03c2\3\2\2\2\u03ca\u03c6\3\2\2\2\u03cb\u00d2\3\2\2\2\u03cc"+
		"\u03cd\n\16\2\2\u03cd\u00d4\3\2\2\2\u03ce\u03d0\7$\2\2\u03cf\u03d1\5\u00d7"+
		"l\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2"+
		"\u03d3\7$\2\2\u03d3\u00d6\3\2\2\2\u03d4\u03d6\5\u00d9m\2\u03d5\u03d4\3"+
		"\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u00d8\3\2\2\2\u03d9\u03dc\n\17\2\2\u03da\u03dc\5\u00dbn\2\u03db\u03d9"+
		"\3\2\2\2\u03db\u03da\3\2\2\2\u03dc\u00da\3\2\2\2\u03dd\u03de\7^\2\2\u03de"+
		"\u03e2\t\20\2\2\u03df\u03e2\5\u00ddo\2\u03e0\u03e2\5\u00e1q\2\u03e1\u03dd"+
		"\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e0\3\2\2\2\u03e2\u00dc\3\2\2\2\u03e3"+
		"\u03e4\7^\2\2\u03e4\u03ef\5\u00a9U\2\u03e5\u03e6\7^\2\2\u03e6\u03e7\5"+
		"\u00a9U\2\u03e7\u03e8\5\u00a9U\2\u03e8\u03ef\3\2\2\2\u03e9\u03ea\7^\2"+
		"\2\u03ea\u03eb\5\u00dfp\2\u03eb\u03ec\5\u00a9U\2\u03ec\u03ed\5\u00a9U"+
		"\2\u03ed\u03ef\3\2\2\2\u03ee\u03e3\3\2\2\2\u03ee\u03e5\3\2\2\2\u03ee\u03e9"+
		"\3\2\2\2\u03ef\u00de\3\2\2\2\u03f0\u03f1\t\21\2\2\u03f1\u00e0\3\2\2\2"+
		"\u03f2\u03f4\7^\2\2\u03f3\u03f5\7w\2\2\u03f4\u03f3\3\2\2\2\u03f5\u03f6"+
		"\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8"+
		"\u03f9\5\u009fP\2\u03f9\u03fa\5\u009fP\2\u03fa\u03fb\5\u009fP\2\u03fb"+
		"\u03fc\5\u009fP\2\u03fc\u00e2\3\2\2\2\u03fd\u03fe\7p\2\2\u03fe\u03ff\7"+
		"w\2\2\u03ff\u0400\7n\2\2\u0400\u0401\7n\2\2\u0401\u00e4\3\2\2\2\u0402"+
		"\u0403\7*\2\2\u0403\u00e6\3\2\2\2\u0404\u0405\7+\2\2\u0405\u00e8\3\2\2"+
		"\2\u0406\u0407\7}\2\2\u0407\u00ea\3\2\2\2\u0408\u0409\7\177\2\2\u0409"+
		"\u00ec\3\2\2\2\u040a\u040b\7]\2\2\u040b\u00ee\3\2\2\2\u040c\u040d\7_\2"+
		"\2\u040d\u00f0\3\2\2\2\u040e\u040f\7=\2\2\u040f\u00f2\3\2\2\2\u0410\u0411"+
		"\7.\2\2\u0411\u00f4\3\2\2\2\u0412\u0413\7\60\2\2\u0413\u00f6\3\2\2\2\u0414"+
		"\u0415\7\60\2\2\u0415\u0416\7\60\2\2\u0416\u0417\7\60\2\2\u0417\u00f8"+
		"\3\2\2\2\u0418\u0419\7B\2\2\u0419\u00fa\3\2\2\2\u041a\u041b\7<\2\2\u041b"+
		"\u041c\7<\2\2\u041c\u00fc\3\2\2\2\u041d\u041e\7?\2\2\u041e\u00fe\3\2\2"+
		"\2\u041f\u0420\7@\2\2\u0420\u0100\3\2\2\2\u0421\u0422\7>\2\2\u0422\u0102"+
		"\3\2\2\2\u0423\u0424\7#\2\2\u0424\u0104\3\2\2\2\u0425\u0426\7\u0080\2"+
		"\2\u0426\u0106\3\2\2\2\u0427\u0428\7A\2\2\u0428\u0108\3\2\2\2\u0429\u042a"+
		"\7<\2\2\u042a\u010a\3\2\2\2\u042b\u042c\7/\2\2\u042c\u042d\7@\2\2\u042d"+
		"\u010c\3\2\2\2\u042e\u042f\7?\2\2\u042f\u0430\7?\2\2\u0430\u010e\3\2\2"+
		"\2\u0431\u0432\7>\2\2\u0432\u0433\7?\2\2\u0433\u0110\3\2\2\2\u0434\u0435"+
		"\7@\2\2\u0435\u0436\7?\2\2\u0436\u0112\3\2\2\2\u0437\u0438\7#\2\2\u0438"+
		"\u0439\7?\2\2\u0439\u0114\3\2\2\2\u043a\u043b\7(\2\2\u043b\u043c\7(\2"+
		"\2\u043c\u0116\3\2\2\2\u043d\u043e\7~\2\2\u043e\u043f\7~\2\2\u043f\u0118"+
		"\3\2\2\2\u0440\u0441\7-\2\2\u0441\u0442\7-\2\2\u0442\u011a\3\2\2\2\u0443"+
		"\u0444\7/\2\2\u0444\u0445\7/\2\2\u0445\u011c\3\2\2\2\u0446\u0447\7-\2"+
		"\2\u0447\u011e\3\2\2\2\u0448\u0449\7/\2\2\u0449\u0120\3\2\2\2\u044a\u044b"+
		"\7,\2\2\u044b\u0122\3\2\2\2\u044c\u044d\7\61\2\2\u044d\u0124\3\2\2\2\u044e"+
		"\u044f\7(\2\2\u044f\u0126\3\2\2\2\u0450\u0451\7~\2\2\u0451\u0128\3\2\2"+
		"\2\u0452\u0453\7`\2\2\u0453\u012a\3\2\2\2\u0454\u0455\7\'\2\2\u0455\u012c"+
		"\3\2\2\2\u0456\u0457\7-\2\2\u0457\u0458\7?\2\2\u0458\u012e\3\2\2\2\u0459"+
		"\u045a\7/\2\2\u045a\u045b\7?\2\2\u045b\u0130\3\2\2\2\u045c\u045d\7,\2"+
		"\2\u045d\u045e\7?\2\2\u045e\u0132\3\2\2\2\u045f\u0460\7\61\2\2\u0460\u0461"+
		"\7?\2\2\u0461\u0134\3\2\2\2\u0462\u0463\7(\2\2\u0463\u0464\7?\2\2\u0464"+
		"\u0136\3\2\2\2\u0465\u0466\7~\2\2\u0466\u0467\7?\2\2\u0467\u0138\3\2\2"+
		"\2\u0468\u0469\7`\2\2\u0469\u046a\7?\2\2\u046a\u013a\3\2\2\2\u046b\u046c"+
		"\7\'\2\2\u046c\u046d\7?\2\2\u046d\u013c\3\2\2\2\u046e\u046f\7>\2\2\u046f"+
		"\u0470\7>\2\2\u0470\u0471\7?\2\2\u0471\u013e\3\2\2\2\u0472\u0473\7@\2"+
		"\2\u0473\u0474\7@\2\2\u0474\u0475\7?\2\2\u0475\u0140\3\2\2\2\u0476\u0477"+
		"\7@\2\2\u0477\u0478\7@\2\2\u0478\u0479\7@\2\2\u0479\u047a\7?\2\2\u047a"+
		"\u0142\3\2\2\2\u047b\u047f\5\u0145\u00a3\2\u047c\u047e\5\u0147\u00a4\2"+
		"\u047d\u047c\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f\u0480"+
		"\3\2\2\2\u0480\u0144\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0489\t\22\2\2"+
		"\u0483\u0484\n\23\2\2\u0484\u0489\6\u00a3\2\2\u0485\u0486\t\24\2\2\u0486"+
		"\u0487\t\25\2\2\u0487\u0489\6\u00a3\3\2\u0488\u0482\3\2\2\2\u0488\u0483"+
		"\3\2\2\2\u0488\u0485\3\2\2\2\u0489\u0146\3\2\2\2\u048a\u0491\t\26\2\2"+
		"\u048b\u048c\n\23\2\2\u048c\u0491\6\u00a4\4\2\u048d\u048e\t\24\2\2\u048e"+
		"\u048f\t\25\2\2\u048f\u0491\6\u00a4\5\2\u0490\u048a\3\2\2\2\u0490\u048b"+
		"\3\2\2\2\u0490\u048d\3\2\2\2\u0491\u0148\3\2\2\2\u0492\u0494\t\27\2\2"+
		"\u0493\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0493\3\2\2\2\u0495\u0496"+
		"\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\b\u00a5\3\2\u0498\u014a\3\2\2"+
		"\2\u0499\u049a\7\61\2\2\u049a\u049b\7,\2\2\u049b\u049f\3\2\2\2\u049c\u049e"+
		"\13\2\2\2\u049d\u049c\3\2\2\2\u049e\u04a1\3\2\2\2\u049f\u04a0\3\2\2\2"+
		"\u049f\u049d\3\2\2\2\u04a0\u04a2\3\2\2\2\u04a1\u049f\3\2\2\2\u04a2\u04a3"+
		"\7,\2\2\u04a3\u04a4\7\61\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\b\u00a6\4"+
		"\2\u04a6\u014c\3\2\2\2\u04a7\u04a8\7\61\2\2\u04a8\u04a9\7\61\2\2\u04a9"+
		"\u04ad\3\2\2\2\u04aa\u04ac\n\30\2\2\u04ab\u04aa\3\2\2\2\u04ac\u04af\3"+
		"\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af"+
		"\u04ad\3\2\2\2\u04b0\u04b1\b\u00a7\4\2\u04b1\u014e\3\2\2\2:\2\u02e9\u02f2"+
		"\u02f6\u02fa\u02fe\u0302\u0309\u030e\u0310\u0314\u0317\u031b\u0322\u0326"+
		"\u032b\u0333\u0336\u033d\u0341\u0345\u034b\u034e\u0355\u0359\u0361\u0364"+
		"\u036b\u036f\u0373\u0378\u037b\u037e\u0383\u0386\u038b\u0390\u0398\u03a3"+
		"\u03a7\u03ac\u03b0\u03c0\u03ca\u03d0\u03d7\u03db\u03e1\u03ee\u03f6\u047f"+
		"\u0488\u0490\u0495\u049f\u04ad\5\3@\2\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}