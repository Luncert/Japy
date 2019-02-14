package org.luncert.grammar;
// Generated from Japy.g4 by ANTLR 4.7.1

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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ABSTRACT=12, ASSERT=13, BOOLEAN=14, BREAK=15, BYTE=16, 
		CASE=17, CATCH=18, CHAR=19, CLASS=20, CONST=21, CONTINUE=22, DEFAULT=23, 
		DO=24, DOUBLE=25, ELSE=26, ENUM=27, FINAL=28, FINALLY=29, FLOAT=30, FOR=31, 
		IF=32, GOTO=33, IMPORT=34, INSTANCEOF=35, INT=36, INTERFACE=37, LONG=38, 
		NATIVE=39, NEW=40, PACKAGE=41, PRIVATE=42, PROTECTED=43, PUBLIC=44, RETURN=45, 
		SHORT=46, STATIC=47, STRICTFP=48, SUPER=49, SWITCH=50, SYNCHRONIZED=51, 
		THIS=52, THROW=53, THROWS=54, TRANSIENT=55, TRY=56, VOID=57, VOLATILE=58, 
		WHILE=59, UNDER_SCORE=60, NEWLINE=61, IntegerLiteral=62, FloatingPointLiteral=63, 
		BooleanLiteral=64, CharacterLiteral=65, StringLiteral=66, NullLiteral=67, 
		LPAREN=68, RPAREN=69, LBRACE=70, RBRACE=71, LBRACK=72, RBRACK=73, SEMI=74, 
		COMMA=75, DOT=76, ELLIPSIS=77, AT=78, COLONCOLON=79, ASSIGN=80, GT=81, 
		LT=82, BANG=83, TILDE=84, QUESTION=85, COLON=86, ARROW=87, EQUAL=88, LE=89, 
		GE=90, NOTEQUAL=91, AND=92, OR=93, INC=94, DEC=95, ADD=96, SUB=97, MUL=98, 
		DIV=99, BITAND=100, BITOR=101, CARET=102, MOD=103, ADD_ASSIGN=104, SUB_ASSIGN=105, 
		MUL_ASSIGN=106, DIV_ASSIGN=107, AND_ASSIGN=108, OR_ASSIGN=109, XOR_ASSIGN=110, 
		MOD_ASSIGN=111, LSHIFT_ASSIGN=112, RSHIFT_ASSIGN=113, URSHIFT_ASSIGN=114, 
		Identifier=115, WS=116, COMMENT=117, LINE_COMMENT=118;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
		"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
		"ELSE", "ENUM", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPORT", 
		"INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "UNDER_SCORE", "NEWLINE", "SPACES", 
		"IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
		"BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
		"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
		"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
		"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitsAndUnderscores", 
		"OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits", "BinaryDigit", 
		"BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", "HexSignificand", 
		"BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", "CharacterLiteral", 
		"SingleCharacter", "StringLiteral", "StringCharacters", "StringCharacter", 
		"EscapeSequence", "OctalEscape", "ZeroToThree", "UnicodeEscape", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ELLIPSIS", "AT", "COLONCOLON", "ASSIGN", "GT", "LT", "BANG", "TILDE", 
		"QUESTION", "COLON", "ARROW", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"URSHIFT_ASSIGN", "Identifier", "JavaLetter", "JavaLetterOrDigit", "WS", 
		"COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'extends'", "'open'", "'module'", "'requires'", "'exports'", "'to'", 
		"'opens'", "'uses'", "'provides'", "'with'", "'transitive'", "'abstract'", 
		"'assert'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
		"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", 
		"'enum'", "'final'", "'finally'", "'float'", "'for'", "'if'", "'goto'", 
		"'import'", "'instanceof'", "'int'", "'interface'", "'long'", "'native'", 
		"'new'", "'package'", "'private'", "'protected'", "'public'", "'return'", 
		"'short'", "'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", 
		"'this'", "'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
		"'while'", "'_'", null, null, null, null, null, null, "'null'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'...'", "'@'", 
		"'::'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'->'", "'=='", 
		"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", 
		"'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
		"FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPORT", "INSTANCEOF", 
		"INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", 
		"PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", 
		"SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", 
		"VOLATILE", "WHILE", "UNDER_SCORE", "NEWLINE", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ELLIPSIS", "AT", "COLONCOLON", "ASSIGN", "GT", "LT", "BANG", "TILDE", 
		"QUESTION", "COLON", "ARROW", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"URSHIFT_ASSIGN", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
	};
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
				while (indents.size() > 0) {
					emit(createDedent());
					indents.remove(0);
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
			for (int i = 0; i < whitespace.length(); i++) {
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
		case 60:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

					if (this._text == null)
						return;

					String newLine = this._text.replaceAll("[^\r\n]+", "");
					String spaces = this._text.replace("[\r\n]+", "");
					int next = this._input.LA(1);

					if (this.opened > 0
						|| next == 13 /* '\r' */
						|| next == 10 /* '\n' */
						|| next == 35 /* '#' */)
					{
						// If we're inside a list or on a blank line, ignore all indents,
						// dedents and line breaks.
						this.skip();
					} else {
						this.emit(this.commonToken(JapyParser.NEWLINE, newLine));

						int indent = this.getIndentationCount(spaces);
						int previous = this.indents.size() > 0 ?
										this.indents.get(this.indents.size() - 1) : 0;

						if (indent == previous) {
							// skip indents of the same size as the present indent-size
							this.skip();
						} else if (indent > previous) {
							this.indents.add(indent);
							this.emit(this.commonToken(JapyParser.INDENT, spaces));
						} else {
							// Possibly emit more than 1 DEDENT token.
							while (this.indents.size() > 0 && this.indents.get(indents.size() - 1) > indent) {
								this.emit(this.createDedent());
								this.indents.remove(0);
							}
						}
					}
				
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 60:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		case 160:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 161:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return this.atStartOfInput();
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 2:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 4:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2x\u04b4\b\1\4\2\t"+
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
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/"+
		"\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\39\39\39\39\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3>\3"+
		">\3>\5>\u02df\n>\3>\3>\5>\u02e3\n>\3>\5>\u02e6\n>\5>\u02e8\n>\3>\3>\3"+
		"?\6?\u02ed\n?\r?\16?\u02ee\3@\3@\3@\3@\5@\u02f5\n@\3A\3A\5A\u02f9\nA\3"+
		"B\3B\5B\u02fd\nB\3C\3C\5C\u0301\nC\3D\3D\5D\u0305\nD\3E\3E\3F\3F\3F\5"+
		"F\u030c\nF\3F\3F\3F\5F\u0311\nF\5F\u0313\nF\3G\3G\5G\u0317\nG\3G\5G\u031a"+
		"\nG\3H\3H\5H\u031e\nH\3I\3I\3J\6J\u0323\nJ\rJ\16J\u0324\3K\3K\5K\u0329"+
		"\nK\3L\6L\u032c\nL\rL\16L\u032d\3M\3M\3M\3M\3N\3N\5N\u0336\nN\3N\5N\u0339"+
		"\nN\3O\3O\3P\6P\u033e\nP\rP\16P\u033f\3Q\3Q\5Q\u0344\nQ\3R\3R\5R\u0348"+
		"\nR\3R\3R\3S\3S\5S\u034e\nS\3S\5S\u0351\nS\3T\3T\3U\6U\u0356\nU\rU\16"+
		"U\u0357\3V\3V\5V\u035c\nV\3W\3W\3W\3W\3X\3X\5X\u0364\nX\3X\5X\u0367\n"+
		"X\3Y\3Y\3Z\6Z\u036c\nZ\rZ\16Z\u036d\3[\3[\5[\u0372\n[\3\\\3\\\5\\\u0376"+
		"\n\\\3]\3]\3]\5]\u037b\n]\3]\5]\u037e\n]\3]\5]\u0381\n]\3]\3]\3]\5]\u0386"+
		"\n]\3]\5]\u0389\n]\3]\3]\3]\5]\u038e\n]\3]\3]\3]\5]\u0393\n]\3^\3^\3^"+
		"\3_\3_\3`\5`\u039b\n`\3`\3`\3a\3a\3b\3b\3c\3c\3c\5c\u03a6\nc\3d\3d\5d"+
		"\u03aa\nd\3d\3d\3d\5d\u03af\nd\3d\3d\5d\u03b3\nd\3e\3e\3e\3f\3f\3g\3g"+
		"\3g\3g\3g\3g\3g\3g\3g\5g\u03c3\ng\3h\3h\3h\3h\3h\3h\3h\3h\5h\u03cd\nh"+
		"\3i\3i\3j\3j\5j\u03d3\nj\3j\3j\3k\6k\u03d8\nk\rk\16k\u03d9\3l\3l\5l\u03de"+
		"\nl\3m\3m\3m\3m\5m\u03e4\nm\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u03f1"+
		"\nn\3o\3o\3p\3p\6p\u03f7\np\rp\16p\u03f8\3p\3p\3p\3p\3p\3q\3q\3q\3q\3"+
		"q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3{\3{\3"+
		"|\3|\3}\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086"+
		"\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a"+
		"\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\7\u00a1\u0480\n\u00a1"+
		"\f\u00a1\16\u00a1\u0483\13\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\5\u00a2\u048b\n\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u0493\n\u00a3\3\u00a4\6\u00a4\u0496\n\u00a4\r\u00a4\16"+
		"\u00a4\u0497\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u04a0"+
		"\n\u00a5\f\u00a5\16\u00a5\u04a3\13\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u04ae\n\u00a6\f\u00a6"+
		"\16\u00a6\u04b1\13\u00a6\3\u00a6\3\u00a6\3\u04a1\2\u00a7\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}\2\177@\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f"+
		"\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1"+
		"\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3"+
		"\2\u00b5\2\u00b7A\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5"+
		"\2\u00c7\2\u00c9\2\u00cb\2\u00cdB\u00cfC\u00d1\2\u00d3D\u00d5\2\u00d7"+
		"\2\u00d9\2\u00db\2\u00dd\2\u00df\2\u00e1E\u00e3F\u00e5G\u00e7H\u00e9I"+
		"\u00ebJ\u00edK\u00efL\u00f1M\u00f3N\u00f5O\u00f7P\u00f9Q\u00fbR\u00fd"+
		"S\u00ffT\u0101U\u0103V\u0105W\u0107X\u0109Y\u010bZ\u010d[\u010f\\\u0111"+
		"]\u0113^\u0115_\u0117`\u0119a\u011bb\u011dc\u011fd\u0121e\u0123f\u0125"+
		"g\u0127h\u0129i\u012bj\u012dk\u012fl\u0131m\u0133n\u0135o\u0137p\u0139"+
		"q\u013br\u013ds\u013ft\u0141u\u0143\2\u0145\2\u0147v\u0149w\u014bx\3\2"+
		"\31\3\2\13\13\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2"+
		"\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\6\2\f\f\17\17))^^\6\2\f\f\17"+
		"\17$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01"+
		"\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\4\2\16\16\"\"\4\2\f"+
		"\f\17\17\2\u04c7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2\177\3\2\2\2\2\u00b7\3\2\2\2\2\u00cd\3\2\2"+
		"\2\2\u00cf\3\2\2\2\2\u00d3\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5"+
		"\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2"+
		"\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7"+
		"\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2"+
		"\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109"+
		"\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2"+
		"\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b"+
		"\3\2\2\2\2\u011d\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2"+
		"\2\2\u0125\3\2\2\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012b\3\2\2\2\2\u012d"+
		"\3\2\2\2\2\u012f\3\2\2\2\2\u0131\3\2\2\2\2\u0133\3\2\2\2\2\u0135\3\2\2"+
		"\2\2\u0137\3\2\2\2\2\u0139\3\2\2\2\2\u013b\3\2\2\2\2\u013d\3\2\2\2\2\u013f"+
		"\3\2\2\2\2\u0141\3\2\2\2\2\u0147\3\2\2\2\2\u0149\3\2\2\2\2\u014b\3\2\2"+
		"\2\3\u014d\3\2\2\2\5\u0155\3\2\2\2\7\u015a\3\2\2\2\t\u0161\3\2\2\2\13"+
		"\u016a\3\2\2\2\r\u0172\3\2\2\2\17\u0175\3\2\2\2\21\u017b\3\2\2\2\23\u0180"+
		"\3\2\2\2\25\u0189\3\2\2\2\27\u018e\3\2\2\2\31\u0199\3\2\2\2\33\u01a2\3"+
		"\2\2\2\35\u01a9\3\2\2\2\37\u01b1\3\2\2\2!\u01b7\3\2\2\2#\u01bc\3\2\2\2"+
		"%\u01c1\3\2\2\2\'\u01c7\3\2\2\2)\u01cc\3\2\2\2+\u01d2\3\2\2\2-\u01d8\3"+
		"\2\2\2/\u01e1\3\2\2\2\61\u01e9\3\2\2\2\63\u01ec\3\2\2\2\65\u01f3\3\2\2"+
		"\2\67\u01f8\3\2\2\29\u01fd\3\2\2\2;\u0203\3\2\2\2=\u020b\3\2\2\2?\u0211"+
		"\3\2\2\2A\u0215\3\2\2\2C\u0218\3\2\2\2E\u021d\3\2\2\2G\u0224\3\2\2\2I"+
		"\u022f\3\2\2\2K\u0233\3\2\2\2M\u023d\3\2\2\2O\u0242\3\2\2\2Q\u0249\3\2"+
		"\2\2S\u024d\3\2\2\2U\u0255\3\2\2\2W\u025d\3\2\2\2Y\u0267\3\2\2\2[\u026e"+
		"\3\2\2\2]\u0275\3\2\2\2_\u027b\3\2\2\2a\u0282\3\2\2\2c\u028b\3\2\2\2e"+
		"\u0291\3\2\2\2g\u0298\3\2\2\2i\u02a5\3\2\2\2k\u02aa\3\2\2\2m\u02b0\3\2"+
		"\2\2o\u02b7\3\2\2\2q\u02c1\3\2\2\2s\u02c5\3\2\2\2u\u02ca\3\2\2\2w\u02d3"+
		"\3\2\2\2y\u02d9\3\2\2\2{\u02e7\3\2\2\2}\u02ec\3\2\2\2\177\u02f4\3\2\2"+
		"\2\u0081\u02f6\3\2\2\2\u0083\u02fa\3\2\2\2\u0085\u02fe\3\2\2\2\u0087\u0302"+
		"\3\2\2\2\u0089\u0306\3\2\2\2\u008b\u0312\3\2\2\2\u008d\u0314\3\2\2\2\u008f"+
		"\u031d\3\2\2\2\u0091\u031f\3\2\2\2\u0093\u0322\3\2\2\2\u0095\u0328\3\2"+
		"\2\2\u0097\u032b\3\2\2\2\u0099\u032f\3\2\2\2\u009b\u0333\3\2\2\2\u009d"+
		"\u033a\3\2\2\2\u009f\u033d\3\2\2\2\u00a1\u0343\3\2\2\2\u00a3\u0345\3\2"+
		"\2\2\u00a5\u034b\3\2\2\2\u00a7\u0352\3\2\2\2\u00a9\u0355\3\2\2\2\u00ab"+
		"\u035b\3\2\2\2\u00ad\u035d\3\2\2\2\u00af\u0361\3\2\2\2\u00b1\u0368\3\2"+
		"\2\2\u00b3\u036b\3\2\2\2\u00b5\u0371\3\2\2\2\u00b7\u0375\3\2\2\2\u00b9"+
		"\u0392\3\2\2\2\u00bb\u0394\3\2\2\2\u00bd\u0397\3\2\2\2\u00bf\u039a\3\2"+
		"\2\2\u00c1\u039e\3\2\2\2\u00c3\u03a0\3\2\2\2\u00c5\u03a2\3\2\2\2\u00c7"+
		"\u03b2\3\2\2\2\u00c9\u03b4\3\2\2\2\u00cb\u03b7\3\2\2\2\u00cd\u03c2\3\2"+
		"\2\2\u00cf\u03cc\3\2\2\2\u00d1\u03ce\3\2\2\2\u00d3\u03d0\3\2\2\2\u00d5"+
		"\u03d7\3\2\2\2\u00d7\u03dd\3\2\2\2\u00d9\u03e3\3\2\2\2\u00db\u03f0\3\2"+
		"\2\2\u00dd\u03f2\3\2\2\2\u00df\u03f4\3\2\2\2\u00e1\u03ff\3\2\2\2\u00e3"+
		"\u0404\3\2\2\2\u00e5\u0406\3\2\2\2\u00e7\u0408\3\2\2\2\u00e9\u040a\3\2"+
		"\2\2\u00eb\u040c\3\2\2\2\u00ed\u040e\3\2\2\2\u00ef\u0410\3\2\2\2\u00f1"+
		"\u0412\3\2\2\2\u00f3\u0414\3\2\2\2\u00f5\u0416\3\2\2\2\u00f7\u041a\3\2"+
		"\2\2\u00f9\u041c\3\2\2\2\u00fb\u041f\3\2\2\2\u00fd\u0421\3\2\2\2\u00ff"+
		"\u0423\3\2\2\2\u0101\u0425\3\2\2\2\u0103\u0427\3\2\2\2\u0105\u0429\3\2"+
		"\2\2\u0107\u042b\3\2\2\2\u0109\u042d\3\2\2\2\u010b\u0430\3\2\2\2\u010d"+
		"\u0433\3\2\2\2\u010f\u0436\3\2\2\2\u0111\u0439\3\2\2\2\u0113\u043c\3\2"+
		"\2\2\u0115\u043f\3\2\2\2\u0117\u0442\3\2\2\2\u0119\u0445\3\2\2\2\u011b"+
		"\u0448\3\2\2\2\u011d\u044a\3\2\2\2\u011f\u044c\3\2\2\2\u0121\u044e\3\2"+
		"\2\2\u0123\u0450\3\2\2\2\u0125\u0452\3\2\2\2\u0127\u0454\3\2\2\2\u0129"+
		"\u0456\3\2\2\2\u012b\u0458\3\2\2\2\u012d\u045b\3\2\2\2\u012f\u045e\3\2"+
		"\2\2\u0131\u0461\3\2\2\2\u0133\u0464\3\2\2\2\u0135\u0467\3\2\2\2\u0137"+
		"\u046a\3\2\2\2\u0139\u046d\3\2\2\2\u013b\u0470\3\2\2\2\u013d\u0474\3\2"+
		"\2\2\u013f\u0478\3\2\2\2\u0141\u047d\3\2\2\2\u0143\u048a\3\2\2\2\u0145"+
		"\u0492\3\2\2\2\u0147\u0495\3\2\2\2\u0149\u049b\3\2\2\2\u014b\u04a9\3\2"+
		"\2\2\u014d\u014e\7g\2\2\u014e\u014f\7z\2\2\u014f\u0150\7v\2\2\u0150\u0151"+
		"\7g\2\2\u0151\u0152\7p\2\2\u0152\u0153\7f\2\2\u0153\u0154\7u\2\2\u0154"+
		"\4\3\2\2\2\u0155\u0156\7q\2\2\u0156\u0157\7r\2\2\u0157\u0158\7g\2\2\u0158"+
		"\u0159\7p\2\2\u0159\6\3\2\2\2\u015a\u015b\7o\2\2\u015b\u015c\7q\2\2\u015c"+
		"\u015d\7f\2\2\u015d\u015e\7w\2\2\u015e\u015f\7n\2\2\u015f\u0160\7g\2\2"+
		"\u0160\b\3\2\2\2\u0161\u0162\7t\2\2\u0162\u0163\7g\2\2\u0163\u0164\7s"+
		"\2\2\u0164\u0165\7w\2\2\u0165\u0166\7k\2\2\u0166\u0167\7t\2\2\u0167\u0168"+
		"\7g\2\2\u0168\u0169\7u\2\2\u0169\n\3\2\2\2\u016a\u016b\7g\2\2\u016b\u016c"+
		"\7z\2\2\u016c\u016d\7r\2\2\u016d\u016e\7q\2\2\u016e\u016f\7t\2\2\u016f"+
		"\u0170\7v\2\2\u0170\u0171\7u\2\2\u0171\f\3\2\2\2\u0172\u0173\7v\2\2\u0173"+
		"\u0174\7q\2\2\u0174\16\3\2\2\2\u0175\u0176\7q\2\2\u0176\u0177\7r\2\2\u0177"+
		"\u0178\7g\2\2\u0178\u0179\7p\2\2\u0179\u017a\7u\2\2\u017a\20\3\2\2\2\u017b"+
		"\u017c\7w\2\2\u017c\u017d\7u\2\2\u017d\u017e\7g\2\2\u017e\u017f\7u\2\2"+
		"\u017f\22\3\2\2\2\u0180\u0181\7r\2\2\u0181\u0182\7t\2\2\u0182\u0183\7"+
		"q\2\2\u0183\u0184\7x\2\2\u0184\u0185\7k\2\2\u0185\u0186\7f\2\2\u0186\u0187"+
		"\7g\2\2\u0187\u0188\7u\2\2\u0188\24\3\2\2\2\u0189\u018a\7y\2\2\u018a\u018b"+
		"\7k\2\2\u018b\u018c\7v\2\2\u018c\u018d\7j\2\2\u018d\26\3\2\2\2\u018e\u018f"+
		"\7v\2\2\u018f\u0190\7t\2\2\u0190\u0191\7c\2\2\u0191\u0192\7p\2\2\u0192"+
		"\u0193\7u\2\2\u0193\u0194\7k\2\2\u0194\u0195\7v\2\2\u0195\u0196\7k\2\2"+
		"\u0196\u0197\7x\2\2\u0197\u0198\7g\2\2\u0198\30\3\2\2\2\u0199\u019a\7"+
		"c\2\2\u019a\u019b\7d\2\2\u019b\u019c\7u\2\2\u019c\u019d\7v\2\2\u019d\u019e"+
		"\7t\2\2\u019e\u019f\7c\2\2\u019f\u01a0\7e\2\2\u01a0\u01a1\7v\2\2\u01a1"+
		"\32\3\2\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5\7u\2\2\u01a5"+
		"\u01a6\7g\2\2\u01a6\u01a7\7t\2\2\u01a7\u01a8\7v\2\2\u01a8\34\3\2\2\2\u01a9"+
		"\u01aa\7d\2\2\u01aa\u01ab\7q\2\2\u01ab\u01ac\7q\2\2\u01ac\u01ad\7n\2\2"+
		"\u01ad\u01ae\7g\2\2\u01ae\u01af\7c\2\2\u01af\u01b0\7p\2\2\u01b0\36\3\2"+
		"\2\2\u01b1\u01b2\7d\2\2\u01b2\u01b3\7t\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5"+
		"\7c\2\2\u01b5\u01b6\7m\2\2\u01b6 \3\2\2\2\u01b7\u01b8\7d\2\2\u01b8\u01b9"+
		"\7{\2\2\u01b9\u01ba\7v\2\2\u01ba\u01bb\7g\2\2\u01bb\"\3\2\2\2\u01bc\u01bd"+
		"\7e\2\2\u01bd\u01be\7c\2\2\u01be\u01bf\7u\2\2\u01bf\u01c0\7g\2\2\u01c0"+
		"$\3\2\2\2\u01c1\u01c2\7e\2\2\u01c2\u01c3\7c\2\2\u01c3\u01c4\7v\2\2\u01c4"+
		"\u01c5\7e\2\2\u01c5\u01c6\7j\2\2\u01c6&\3\2\2\2\u01c7\u01c8\7e\2\2\u01c8"+
		"\u01c9\7j\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7t\2\2\u01cb(\3\2\2\2\u01cc"+
		"\u01cd\7e\2\2\u01cd\u01ce\7n\2\2\u01ce\u01cf\7c\2\2\u01cf\u01d0\7u\2\2"+
		"\u01d0\u01d1\7u\2\2\u01d1*\3\2\2\2\u01d2\u01d3\7e\2\2\u01d3\u01d4\7q\2"+
		"\2\u01d4\u01d5\7p\2\2\u01d5\u01d6\7u\2\2\u01d6\u01d7\7v\2\2\u01d7,\3\2"+
		"\2\2\u01d8\u01d9\7e\2\2\u01d9\u01da\7q\2\2\u01da\u01db\7p\2\2\u01db\u01dc"+
		"\7v\2\2\u01dc\u01dd\7k\2\2\u01dd\u01de\7p\2\2\u01de\u01df\7w\2\2\u01df"+
		"\u01e0\7g\2\2\u01e0.\3\2\2\2\u01e1\u01e2\7f\2\2\u01e2\u01e3\7g\2\2\u01e3"+
		"\u01e4\7h\2\2\u01e4\u01e5\7c\2\2\u01e5\u01e6\7w\2\2\u01e6\u01e7\7n\2\2"+
		"\u01e7\u01e8\7v\2\2\u01e8\60\3\2\2\2\u01e9\u01ea\7f\2\2\u01ea\u01eb\7"+
		"q\2\2\u01eb\62\3\2\2\2\u01ec\u01ed\7f\2\2\u01ed\u01ee\7q\2\2\u01ee\u01ef"+
		"\7w\2\2\u01ef\u01f0\7d\2\2\u01f0\u01f1\7n\2\2\u01f1\u01f2\7g\2\2\u01f2"+
		"\64\3\2\2\2\u01f3\u01f4\7g\2\2\u01f4\u01f5\7n\2\2\u01f5\u01f6\7u\2\2\u01f6"+
		"\u01f7\7g\2\2\u01f7\66\3\2\2\2\u01f8\u01f9\7g\2\2\u01f9\u01fa\7p\2\2\u01fa"+
		"\u01fb\7w\2\2\u01fb\u01fc\7o\2\2\u01fc8\3\2\2\2\u01fd\u01fe\7h\2\2\u01fe"+
		"\u01ff\7k\2\2\u01ff\u0200\7p\2\2\u0200\u0201\7c\2\2\u0201\u0202\7n\2\2"+
		"\u0202:\3\2\2\2\u0203\u0204\7h\2\2\u0204\u0205\7k\2\2\u0205\u0206\7p\2"+
		"\2\u0206\u0207\7c\2\2\u0207\u0208\7n\2\2\u0208\u0209\7n\2\2\u0209\u020a"+
		"\7{\2\2\u020a<\3\2\2\2\u020b\u020c\7h\2\2\u020c\u020d\7n\2\2\u020d\u020e"+
		"\7q\2\2\u020e\u020f\7c\2\2\u020f\u0210\7v\2\2\u0210>\3\2\2\2\u0211\u0212"+
		"\7h\2\2\u0212\u0213\7q\2\2\u0213\u0214\7t\2\2\u0214@\3\2\2\2\u0215\u0216"+
		"\7k\2\2\u0216\u0217\7h\2\2\u0217B\3\2\2\2\u0218\u0219\7i\2\2\u0219\u021a"+
		"\7q\2\2\u021a\u021b\7v\2\2\u021b\u021c\7q\2\2\u021cD\3\2\2\2\u021d\u021e"+
		"\7k\2\2\u021e\u021f\7o\2\2\u021f\u0220\7r\2\2\u0220\u0221\7q\2\2\u0221"+
		"\u0222\7t\2\2\u0222\u0223\7v\2\2\u0223F\3\2\2\2\u0224\u0225\7k\2\2\u0225"+
		"\u0226\7p\2\2\u0226\u0227\7u\2\2\u0227\u0228\7v\2\2\u0228\u0229\7c\2\2"+
		"\u0229\u022a\7p\2\2\u022a\u022b\7e\2\2\u022b\u022c\7g\2\2\u022c\u022d"+
		"\7q\2\2\u022d\u022e\7h\2\2\u022eH\3\2\2\2\u022f\u0230\7k\2\2\u0230\u0231"+
		"\7p\2\2\u0231\u0232\7v\2\2\u0232J\3\2\2\2\u0233\u0234\7k\2\2\u0234\u0235"+
		"\7p\2\2\u0235\u0236\7v\2\2\u0236\u0237\7g\2\2\u0237\u0238\7t\2\2\u0238"+
		"\u0239\7h\2\2\u0239\u023a\7c\2\2\u023a\u023b\7e\2\2\u023b\u023c\7g\2\2"+
		"\u023cL\3\2\2\2\u023d\u023e\7n\2\2\u023e\u023f\7q\2\2\u023f\u0240\7p\2"+
		"\2\u0240\u0241\7i\2\2\u0241N\3\2\2\2\u0242\u0243\7p\2\2\u0243\u0244\7"+
		"c\2\2\u0244\u0245\7v\2\2\u0245\u0246\7k\2\2\u0246\u0247\7x\2\2\u0247\u0248"+
		"\7g\2\2\u0248P\3\2\2\2\u0249\u024a\7p\2\2\u024a\u024b\7g\2\2\u024b\u024c"+
		"\7y\2\2\u024cR\3\2\2\2\u024d\u024e\7r\2\2\u024e\u024f\7c\2\2\u024f\u0250"+
		"\7e\2\2\u0250\u0251\7m\2\2\u0251\u0252\7c\2\2\u0252\u0253\7i\2\2\u0253"+
		"\u0254\7g\2\2\u0254T\3\2\2\2\u0255\u0256\7r\2\2\u0256\u0257\7t\2\2\u0257"+
		"\u0258\7k\2\2\u0258\u0259\7x\2\2\u0259\u025a\7c\2\2\u025a\u025b\7v\2\2"+
		"\u025b\u025c\7g\2\2\u025cV\3\2\2\2\u025d\u025e\7r\2\2\u025e\u025f\7t\2"+
		"\2\u025f\u0260\7q\2\2\u0260\u0261\7v\2\2\u0261\u0262\7g\2\2\u0262\u0263"+
		"\7e\2\2\u0263\u0264\7v\2\2\u0264\u0265\7g\2\2\u0265\u0266\7f\2\2\u0266"+
		"X\3\2\2\2\u0267\u0268\7r\2\2\u0268\u0269\7w\2\2\u0269\u026a\7d\2\2\u026a"+
		"\u026b\7n\2\2\u026b\u026c\7k\2\2\u026c\u026d\7e\2\2\u026dZ\3\2\2\2\u026e"+
		"\u026f\7t\2\2\u026f\u0270\7g\2\2\u0270\u0271\7v\2\2\u0271\u0272\7w\2\2"+
		"\u0272\u0273\7t\2\2\u0273\u0274\7p\2\2\u0274\\\3\2\2\2\u0275\u0276\7u"+
		"\2\2\u0276\u0277\7j\2\2\u0277\u0278\7q\2\2\u0278\u0279\7t\2\2\u0279\u027a"+
		"\7v\2\2\u027a^\3\2\2\2\u027b\u027c\7u\2\2\u027c\u027d\7v\2\2\u027d\u027e"+
		"\7c\2\2\u027e\u027f\7v\2\2\u027f\u0280\7k\2\2\u0280\u0281\7e\2\2\u0281"+
		"`\3\2\2\2\u0282\u0283\7u\2\2\u0283\u0284\7v\2\2\u0284\u0285\7t\2\2\u0285"+
		"\u0286\7k\2\2\u0286\u0287\7e\2\2\u0287\u0288\7v\2\2\u0288\u0289\7h\2\2"+
		"\u0289\u028a\7r\2\2\u028ab\3\2\2\2\u028b\u028c\7u\2\2\u028c\u028d\7w\2"+
		"\2\u028d\u028e\7r\2\2\u028e\u028f\7g\2\2\u028f\u0290\7t\2\2\u0290d\3\2"+
		"\2\2\u0291\u0292\7u\2\2\u0292\u0293\7y\2\2\u0293\u0294\7k\2\2\u0294\u0295"+
		"\7v\2\2\u0295\u0296\7e\2\2\u0296\u0297\7j\2\2\u0297f\3\2\2\2\u0298\u0299"+
		"\7u\2\2\u0299\u029a\7{\2\2\u029a\u029b\7p\2\2\u029b\u029c\7e\2\2\u029c"+
		"\u029d\7j\2\2\u029d\u029e\7t\2\2\u029e\u029f\7q\2\2\u029f\u02a0\7p\2\2"+
		"\u02a0\u02a1\7k\2\2\u02a1\u02a2\7|\2\2\u02a2\u02a3\7g\2\2\u02a3\u02a4"+
		"\7f\2\2\u02a4h\3\2\2\2\u02a5\u02a6\7v\2\2\u02a6\u02a7\7j\2\2\u02a7\u02a8"+
		"\7k\2\2\u02a8\u02a9\7u\2\2\u02a9j\3\2\2\2\u02aa\u02ab\7v\2\2\u02ab\u02ac"+
		"\7j\2\2\u02ac\u02ad\7t\2\2\u02ad\u02ae\7q\2\2\u02ae\u02af\7y\2\2\u02af"+
		"l\3\2\2\2\u02b0\u02b1\7v\2\2\u02b1\u02b2\7j\2\2\u02b2\u02b3\7t\2\2\u02b3"+
		"\u02b4\7q\2\2\u02b4\u02b5\7y\2\2\u02b5\u02b6\7u\2\2\u02b6n\3\2\2\2\u02b7"+
		"\u02b8\7v\2\2\u02b8\u02b9\7t\2\2\u02b9\u02ba\7c\2\2\u02ba\u02bb\7p\2\2"+
		"\u02bb\u02bc\7u\2\2\u02bc\u02bd\7k\2\2\u02bd\u02be\7g\2\2\u02be\u02bf"+
		"\7p\2\2\u02bf\u02c0\7v\2\2\u02c0p\3\2\2\2\u02c1\u02c2\7v\2\2\u02c2\u02c3"+
		"\7t\2\2\u02c3\u02c4\7{\2\2\u02c4r\3\2\2\2\u02c5\u02c6\7x\2\2\u02c6\u02c7"+
		"\7q\2\2\u02c7\u02c8\7k\2\2\u02c8\u02c9\7f\2\2\u02c9t\3\2\2\2\u02ca\u02cb"+
		"\7x\2\2\u02cb\u02cc\7q\2\2\u02cc\u02cd\7n\2\2\u02cd\u02ce\7c\2\2\u02ce"+
		"\u02cf\7v\2\2\u02cf\u02d0\7k\2\2\u02d0\u02d1\7n\2\2\u02d1\u02d2\7g\2\2"+
		"\u02d2v\3\2\2\2\u02d3\u02d4\7y\2\2\u02d4\u02d5\7j\2\2\u02d5\u02d6\7k\2"+
		"\2\u02d6\u02d7\7n\2\2\u02d7\u02d8\7g\2\2\u02d8x\3\2\2\2\u02d9\u02da\7"+
		"a\2\2\u02daz\3\2\2\2\u02db\u02dc\6>\2\2\u02dc\u02e8\5}?\2\u02dd\u02df"+
		"\7\17\2\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2"+
		"\u02e0\u02e3\7\f\2\2\u02e1\u02e3\7\17\2\2\u02e2\u02de\3\2\2\2\u02e2\u02e1"+
		"\3\2\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02e6\5}?\2\u02e5\u02e4\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02db\3\2\2\2\u02e7\u02e2\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\b>\2\2\u02ea|\3\2\2\2\u02eb\u02ed"+
		"\t\2\2\2\u02ec\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef~\3\2\2\2\u02f0\u02f5\5\u0081A\2\u02f1\u02f5\5\u0083"+
		"B\2\u02f2\u02f5\5\u0085C\2\u02f3\u02f5\5\u0087D\2\u02f4\u02f0\3\2\2\2"+
		"\u02f4\u02f1\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5\u0080"+
		"\3\2\2\2\u02f6\u02f8\5\u008bF\2\u02f7\u02f9\5\u0089E\2\u02f8\u02f7\3\2"+
		"\2\2\u02f8\u02f9\3\2\2\2\u02f9\u0082\3\2\2\2\u02fa\u02fc\5\u0099M\2\u02fb"+
		"\u02fd\5\u0089E\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u0084"+
		"\3\2\2\2\u02fe\u0300\5\u00a3R\2\u02ff\u0301\5\u0089E\2\u0300\u02ff\3\2"+
		"\2\2\u0300\u0301\3\2\2\2\u0301\u0086\3\2\2\2\u0302\u0304\5\u00adW\2\u0303"+
		"\u0305\5\u0089E\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0088"+
		"\3\2\2\2\u0306\u0307\t\3\2\2\u0307\u008a\3\2\2\2\u0308\u0313\7\62\2\2"+
		"\u0309\u0310\5\u0091I\2\u030a\u030c\5\u008dG\2\u030b\u030a\3\2\2\2\u030b"+
		"\u030c\3\2\2\2\u030c\u0311\3\2\2\2\u030d\u030e\5\u0097L\2\u030e\u030f"+
		"\5\u008dG\2\u030f\u0311\3\2\2\2\u0310\u030b\3\2\2\2\u0310\u030d\3\2\2"+
		"\2\u0311\u0313\3\2\2\2\u0312\u0308\3\2\2\2\u0312\u0309\3\2\2\2\u0313\u008c"+
		"\3\2\2\2\u0314\u0319\5\u008fH\2\u0315\u0317\5\u0093J\2\u0316\u0315\3\2"+
		"\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a\5\u008fH\2\u0319"+
		"\u0316\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u008e\3\2\2\2\u031b\u031e\7\62"+
		"\2\2\u031c\u031e\5\u0091I\2\u031d\u031b\3\2\2\2\u031d\u031c\3\2\2\2\u031e"+
		"\u0090\3\2\2\2\u031f\u0320\t\4\2\2\u0320\u0092\3\2\2\2\u0321\u0323\5\u0095"+
		"K\2\u0322\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0322\3\2\2\2\u0324"+
		"\u0325\3\2\2\2\u0325\u0094\3\2\2\2\u0326\u0329\5\u008fH\2\u0327\u0329"+
		"\7a\2\2\u0328\u0326\3\2\2\2\u0328\u0327\3\2\2\2\u0329\u0096\3\2\2\2\u032a"+
		"\u032c\7a\2\2\u032b\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032b\3\2"+
		"\2\2\u032d\u032e\3\2\2\2\u032e\u0098\3\2\2\2\u032f\u0330\7\62\2\2\u0330"+
		"\u0331\t\5\2\2\u0331\u0332\5\u009bN\2\u0332\u009a\3\2\2\2\u0333\u0338"+
		"\5\u009dO\2\u0334\u0336\5\u009fP\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2"+
		"\2\2\u0336\u0337\3\2\2\2\u0337\u0339\5\u009dO\2\u0338\u0335\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u009c\3\2\2\2\u033a\u033b\t\6\2\2\u033b\u009e\3\2"+
		"\2\2\u033c\u033e\5\u00a1Q\2\u033d\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u00a0\3\2\2\2\u0341\u0344\5\u009d"+
		"O\2\u0342\u0344\7a\2\2\u0343\u0341\3\2\2\2\u0343\u0342\3\2\2\2\u0344\u00a2"+
		"\3\2\2\2\u0345\u0347\7\62\2\2\u0346\u0348\5\u0097L\2\u0347\u0346\3\2\2"+
		"\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\5\u00a5S\2\u034a"+
		"\u00a4\3\2\2\2\u034b\u0350\5\u00a7T\2\u034c\u034e\5\u00a9U\2\u034d\u034c"+
		"\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\5\u00a7T"+
		"\2\u0350\u034d\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u00a6\3\2\2\2\u0352\u0353"+
		"\t\7\2\2\u0353\u00a8\3\2\2\2\u0354\u0356\5\u00abV\2\u0355\u0354\3\2\2"+
		"\2\u0356\u0357\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u00aa"+
		"\3\2\2\2\u0359\u035c\5\u00a7T\2\u035a\u035c\7a\2\2\u035b\u0359\3\2\2\2"+
		"\u035b\u035a\3\2\2\2\u035c\u00ac\3\2\2\2\u035d\u035e\7\62\2\2\u035e\u035f"+
		"\t\b\2\2\u035f\u0360\5\u00afX\2\u0360\u00ae\3\2\2\2\u0361\u0366\5\u00b1"+
		"Y\2\u0362\u0364\5\u00b3Z\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364"+
		"\u0365\3\2\2\2\u0365\u0367\5\u00b1Y\2\u0366\u0363\3\2\2\2\u0366\u0367"+
		"\3\2\2\2\u0367\u00b0\3\2\2\2\u0368\u0369\t\t\2\2\u0369\u00b2\3\2\2\2\u036a"+
		"\u036c\5\u00b5[\2\u036b\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036b"+
		"\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u00b4\3\2\2\2\u036f\u0372\5\u00b1Y"+
		"\2\u0370\u0372\7a\2\2\u0371\u036f\3\2\2\2\u0371\u0370\3\2\2\2\u0372\u00b6"+
		"\3\2\2\2\u0373\u0376\5\u00b9]\2\u0374\u0376\5\u00c5c\2\u0375\u0373\3\2"+
		"\2\2\u0375\u0374\3\2\2\2\u0376\u00b8\3\2\2\2\u0377\u0378\5\u008dG\2\u0378"+
		"\u037a\7\60\2\2\u0379\u037b\5\u008dG\2\u037a\u0379\3\2\2\2\u037a\u037b"+
		"\3\2\2\2\u037b\u037d\3\2\2\2\u037c\u037e\5\u00bb^\2\u037d\u037c\3\2\2"+
		"\2\u037d\u037e\3\2\2\2\u037e\u0380\3\2\2\2\u037f\u0381\5\u00c3b\2\u0380"+
		"\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0393\3\2\2\2\u0382\u0383\7\60"+
		"\2\2\u0383\u0385\5\u008dG\2\u0384\u0386\5\u00bb^\2\u0385\u0384\3\2\2\2"+
		"\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0389\5\u00c3b\2\u0388"+
		"\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u0393\3\2\2\2\u038a\u038b\5\u008d"+
		"G\2\u038b\u038d\5\u00bb^\2\u038c\u038e\5\u00c3b\2\u038d\u038c\3\2\2\2"+
		"\u038d\u038e\3\2\2\2\u038e\u0393\3\2\2\2\u038f\u0390\5\u008dG\2\u0390"+
		"\u0391\5\u00c3b\2\u0391\u0393\3\2\2\2\u0392\u0377\3\2\2\2\u0392\u0382"+
		"\3\2\2\2\u0392\u038a\3\2\2\2\u0392\u038f\3\2\2\2\u0393\u00ba\3\2\2\2\u0394"+
		"\u0395\5\u00bd_\2\u0395\u0396\5\u00bf`\2\u0396\u00bc\3\2\2\2\u0397\u0398"+
		"\t\n\2\2\u0398\u00be\3\2\2\2\u0399\u039b\5\u00c1a\2\u039a\u0399\3\2\2"+
		"\2\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\5\u008dG\2\u039d"+
		"\u00c0\3\2\2\2\u039e\u039f\t\13\2\2\u039f\u00c2\3\2\2\2\u03a0\u03a1\t"+
		"\f\2\2\u03a1\u00c4\3\2\2\2\u03a2\u03a3\5\u00c7d\2\u03a3\u03a5\5\u00c9"+
		"e\2\u03a4\u03a6\5\u00c3b\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6"+
		"\u00c6\3\2\2\2\u03a7\u03a9\5\u0099M\2\u03a8\u03aa\7\60\2\2\u03a9\u03a8"+
		"\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03b3\3\2\2\2\u03ab\u03ac\7\62\2\2"+
		"\u03ac\u03ae\t\5\2\2\u03ad\u03af\5\u009bN\2\u03ae\u03ad\3\2\2\2\u03ae"+
		"\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\7\60\2\2\u03b1\u03b3\5"+
		"\u009bN\2\u03b2\u03a7\3\2\2\2\u03b2\u03ab\3\2\2\2\u03b3\u00c8\3\2\2\2"+
		"\u03b4\u03b5\5\u00cbf\2\u03b5\u03b6\5\u00bf`\2\u03b6\u00ca\3\2\2\2\u03b7"+
		"\u03b8\t\r\2\2\u03b8\u00cc\3\2\2\2\u03b9\u03ba\7v\2\2\u03ba\u03bb\7t\2"+
		"\2\u03bb\u03bc\7w\2\2\u03bc\u03c3\7g\2\2\u03bd\u03be\7h\2\2\u03be\u03bf"+
		"\7c\2\2\u03bf\u03c0\7n\2\2\u03c0\u03c1\7u\2\2\u03c1\u03c3\7g\2\2\u03c2"+
		"\u03b9\3\2\2\2\u03c2\u03bd\3\2\2\2\u03c3\u00ce\3\2\2\2\u03c4\u03c5\7)"+
		"\2\2\u03c5\u03c6\5\u00d1i\2\u03c6\u03c7\7)\2\2\u03c7\u03cd\3\2\2\2\u03c8"+
		"\u03c9\7)\2\2\u03c9\u03ca\5\u00d9m\2\u03ca\u03cb\7)\2\2\u03cb\u03cd\3"+
		"\2\2\2\u03cc\u03c4\3\2\2\2\u03cc\u03c8\3\2\2\2\u03cd\u00d0\3\2\2\2\u03ce"+
		"\u03cf\n\16\2\2\u03cf\u00d2\3\2\2\2\u03d0\u03d2\7$\2\2\u03d1\u03d3\5\u00d5"+
		"k\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4"+
		"\u03d5\7$\2\2\u03d5\u00d4\3\2\2\2\u03d6\u03d8\5\u00d7l\2\u03d7\u03d6\3"+
		"\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"\u00d6\3\2\2\2\u03db\u03de\n\17\2\2\u03dc\u03de\5\u00d9m\2\u03dd\u03db"+
		"\3\2\2\2\u03dd\u03dc\3\2\2\2\u03de\u00d8\3\2\2\2\u03df\u03e0\7^\2\2\u03e0"+
		"\u03e4\t\20\2\2\u03e1\u03e4\5\u00dbn\2\u03e2\u03e4\5\u00dfp\2\u03e3\u03df"+
		"\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e2\3\2\2\2\u03e4\u00da\3\2\2\2\u03e5"+
		"\u03e6\7^\2\2\u03e6\u03f1\5\u00a7T\2\u03e7\u03e8\7^\2\2\u03e8\u03e9\5"+
		"\u00a7T\2\u03e9\u03ea\5\u00a7T\2\u03ea\u03f1\3\2\2\2\u03eb\u03ec\7^\2"+
		"\2\u03ec\u03ed\5\u00ddo\2\u03ed\u03ee\5\u00a7T\2\u03ee\u03ef\5\u00a7T"+
		"\2\u03ef\u03f1\3\2\2\2\u03f0\u03e5\3\2\2\2\u03f0\u03e7\3\2\2\2\u03f0\u03eb"+
		"\3\2\2\2\u03f1\u00dc\3\2\2\2\u03f2\u03f3\t\21\2\2\u03f3\u00de\3\2\2\2"+
		"\u03f4\u03f6\7^\2\2\u03f5\u03f7\7w\2\2\u03f6\u03f5\3\2\2\2\u03f7\u03f8"+
		"\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa"+
		"\u03fb\5\u009dO\2\u03fb\u03fc\5\u009dO\2\u03fc\u03fd\5\u009dO\2\u03fd"+
		"\u03fe\5\u009dO\2\u03fe\u00e0\3\2\2\2\u03ff\u0400\7p\2\2\u0400\u0401\7"+
		"w\2\2\u0401\u0402\7n\2\2\u0402\u0403\7n\2\2\u0403\u00e2\3\2\2\2\u0404"+
		"\u0405\7*\2\2\u0405\u00e4\3\2\2\2\u0406\u0407\7+\2\2\u0407\u00e6\3\2\2"+
		"\2\u0408\u0409\7}\2\2\u0409\u00e8\3\2\2\2\u040a\u040b\7\177\2\2\u040b"+
		"\u00ea\3\2\2\2\u040c\u040d\7]\2\2\u040d\u00ec\3\2\2\2\u040e\u040f\7_\2"+
		"\2\u040f\u00ee\3\2\2\2\u0410\u0411\7=\2\2\u0411\u00f0\3\2\2\2\u0412\u0413"+
		"\7.\2\2\u0413\u00f2\3\2\2\2\u0414\u0415\7\60\2\2\u0415\u00f4\3\2\2\2\u0416"+
		"\u0417\7\60\2\2\u0417\u0418\7\60\2\2\u0418\u0419\7\60\2\2\u0419\u00f6"+
		"\3\2\2\2\u041a\u041b\7B\2\2\u041b\u00f8\3\2\2\2\u041c\u041d\7<\2\2\u041d"+
		"\u041e\7<\2\2\u041e\u00fa\3\2\2\2\u041f\u0420\7?\2\2\u0420\u00fc\3\2\2"+
		"\2\u0421\u0422\7@\2\2\u0422\u00fe\3\2\2\2\u0423\u0424\7>\2\2\u0424\u0100"+
		"\3\2\2\2\u0425\u0426\7#\2\2\u0426\u0102\3\2\2\2\u0427\u0428\7\u0080\2"+
		"\2\u0428\u0104\3\2\2\2\u0429\u042a\7A\2\2\u042a\u0106\3\2\2\2\u042b\u042c"+
		"\7<\2\2\u042c\u0108\3\2\2\2\u042d\u042e\7/\2\2\u042e\u042f\7@\2\2\u042f"+
		"\u010a\3\2\2\2\u0430\u0431\7?\2\2\u0431\u0432\7?\2\2\u0432\u010c\3\2\2"+
		"\2\u0433\u0434\7>\2\2\u0434\u0435\7?\2\2\u0435\u010e\3\2\2\2\u0436\u0437"+
		"\7@\2\2\u0437\u0438\7?\2\2\u0438\u0110\3\2\2\2\u0439\u043a\7#\2\2\u043a"+
		"\u043b\7?\2\2\u043b\u0112\3\2\2\2\u043c\u043d\7(\2\2\u043d\u043e\7(\2"+
		"\2\u043e\u0114\3\2\2\2\u043f\u0440\7~\2\2\u0440\u0441\7~\2\2\u0441\u0116"+
		"\3\2\2\2\u0442\u0443\7-\2\2\u0443\u0444\7-\2\2\u0444\u0118\3\2\2\2\u0445"+
		"\u0446\7/\2\2\u0446\u0447\7/\2\2\u0447\u011a\3\2\2\2\u0448\u0449\7-\2"+
		"\2\u0449\u011c\3\2\2\2\u044a\u044b\7/\2\2\u044b\u011e\3\2\2\2\u044c\u044d"+
		"\7,\2\2\u044d\u0120\3\2\2\2\u044e\u044f\7\61\2\2\u044f\u0122\3\2\2\2\u0450"+
		"\u0451\7(\2\2\u0451\u0124\3\2\2\2\u0452\u0453\7~\2\2\u0453\u0126\3\2\2"+
		"\2\u0454\u0455\7`\2\2\u0455\u0128\3\2\2\2\u0456\u0457\7\'\2\2\u0457\u012a"+
		"\3\2\2\2\u0458\u0459\7-\2\2\u0459\u045a\7?\2\2\u045a\u012c\3\2\2\2\u045b"+
		"\u045c\7/\2\2\u045c\u045d\7?\2\2\u045d\u012e\3\2\2\2\u045e\u045f\7,\2"+
		"\2\u045f\u0460\7?\2\2\u0460\u0130\3\2\2\2\u0461\u0462\7\61\2\2\u0462\u0463"+
		"\7?\2\2\u0463\u0132\3\2\2\2\u0464\u0465\7(\2\2\u0465\u0466\7?\2\2\u0466"+
		"\u0134\3\2\2\2\u0467\u0468\7~\2\2\u0468\u0469\7?\2\2\u0469\u0136\3\2\2"+
		"\2\u046a\u046b\7`\2\2\u046b\u046c\7?\2\2\u046c\u0138\3\2\2\2\u046d\u046e"+
		"\7\'\2\2\u046e\u046f\7?\2\2\u046f\u013a\3\2\2\2\u0470\u0471\7>\2\2\u0471"+
		"\u0472\7>\2\2\u0472\u0473\7?\2\2\u0473\u013c\3\2\2\2\u0474\u0475\7@\2"+
		"\2\u0475\u0476\7@\2\2\u0476\u0477\7?\2\2\u0477\u013e\3\2\2\2\u0478\u0479"+
		"\7@\2\2\u0479\u047a\7@\2\2\u047a\u047b\7@\2\2\u047b\u047c\7?\2\2\u047c"+
		"\u0140\3\2\2\2\u047d\u0481\5\u0143\u00a2\2\u047e\u0480\5\u0145\u00a3\2"+
		"\u047f\u047e\3\2\2\2\u0480\u0483\3\2\2\2\u0481\u047f\3\2\2\2\u0481\u0482"+
		"\3\2\2\2\u0482\u0142\3\2\2\2\u0483\u0481\3\2\2\2\u0484\u048b\t\22\2\2"+
		"\u0485\u0486\n\23\2\2\u0486\u048b\6\u00a2\3\2\u0487\u0488\t\24\2\2\u0488"+
		"\u0489\t\25\2\2\u0489\u048b\6\u00a2\4\2\u048a\u0484\3\2\2\2\u048a\u0485"+
		"\3\2\2\2\u048a\u0487\3\2\2\2\u048b\u0144\3\2\2\2\u048c\u0493\t\26\2\2"+
		"\u048d\u048e\n\23\2\2\u048e\u0493\6\u00a3\5\2\u048f\u0490\t\24\2\2\u0490"+
		"\u0491\t\25\2\2\u0491\u0493\6\u00a3\6\2\u0492\u048c\3\2\2\2\u0492\u048d"+
		"\3\2\2\2\u0492\u048f\3\2\2\2\u0493\u0146\3\2\2\2\u0494\u0496\t\27\2\2"+
		"\u0495\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0495\3\2\2\2\u0497\u0498"+
		"\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\b\u00a4\3\2\u049a\u0148\3\2\2"+
		"\2\u049b\u049c\7\61\2\2\u049c\u049d\7,\2\2\u049d\u04a1\3\2\2\2\u049e\u04a0"+
		"\13\2\2\2\u049f\u049e\3\2\2\2\u04a0\u04a3\3\2\2\2\u04a1\u04a2\3\2\2\2"+
		"\u04a1\u049f\3\2\2\2\u04a2\u04a4\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a4\u04a5"+
		"\7,\2\2\u04a5\u04a6\7\61\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\b\u00a5\4"+
		"\2\u04a8\u014a\3\2\2\2\u04a9\u04aa\7\61\2\2\u04aa\u04ab\7\61\2\2\u04ab"+
		"\u04af\3\2\2\2\u04ac\u04ae\n\30\2\2\u04ad\u04ac\3\2\2\2\u04ae\u04b1\3"+
		"\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b2\3\2\2\2\u04b1"+
		"\u04af\3\2\2\2\u04b2\u04b3\b\u00a6\4\2\u04b3\u014c\3\2\2\2>\2\u02de\u02e2"+
		"\u02e5\u02e7\u02ee\u02f4\u02f8\u02fc\u0300\u0304\u030b\u0310\u0312\u0316"+
		"\u0319\u031d\u0324\u0328\u032d\u0335\u0338\u033f\u0343\u0347\u034d\u0350"+
		"\u0357\u035b\u0363\u0366\u036d\u0371\u0375\u037a\u037d\u0380\u0385\u0388"+
		"\u038d\u0392\u039a\u03a5\u03a9\u03ae\u03b2\u03c2\u03cc\u03d2\u03d9\u03dd"+
		"\u03e3\u03f0\u03f8\u0481\u048a\u0492\u0497\u04a1\u04af\5\3>\2\b\2\2\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}