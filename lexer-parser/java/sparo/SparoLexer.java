// Generated from SparoLexer.g4 by ANTLR 4.7.1
package sparo;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, FLOAT_CONST=6, 
		STRING_CONST=7, INT=8, FLOAT=9, STRING=10, BOOL=11, ARRAY=12, TENSOR=13, 
		LPAREN=14, RPAREN=15, COLON=16, AT=17, SEMICOLON=18, COMMA=19, PLUS=20, 
		MINUS=21, STAR=22, SLASH=23, PERCENT=24, LT=25, GT=26, EQUALS=27, LBRACE=28, 
		RBRACE=29, LSQUARE=30, RSQUARE=31, DOT=32, LTE=33, GTE=34, DOUBLE_EQUALS=35, 
		CLASS=36, ELSE=37, IF=38, EXTENDS=39, AFTER=40, UNIQUE=41, SHARED=42, 
		WEAK=43, CONSTRUCT=44, DESTRUCT=45, THIS=46, NULLPTR=47, WHILE=48, FOR=49, 
		BREAK=50, NEW=51, AND=52, OR=53, NOT=54, NEW_UNIQUE=55, NEW_SHARED=56, 
		VOID=57, RETURN=58, STR_ERR=59, WS=60, SINGLE_COMMENT=61, MULTI_COMMENT=62, 
		UNMATCH_COM=63, EOF_COM=64, UNKNOWN=65;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOL_CONST", "INT_CONST", "FLOAT_CONST", "STR_VALID", "NULLSTR", "STRING_CONST", 
		"STR_ERR", "LPAREN", "RPAREN", "COLON", "AT", "PERCENT", "SEMICOLON", 
		"COMMA", "PLUS", "MINUS", "STAR", "SLASH", "LT", "GT", "EQUALS", "LBRACE", 
		"RBRACE", "LSQUARE", "RSQUARE", "DOT", "LTE", "GTE", "DOUBLE_EQUALS", 
		"CLASS", "ELSE", "IF", "EXTENDS", "AFTER", "UNIQUE", "SHARED", "WEAK", 
		"CONSTRUCT", "DESTRUCT", "THIS", "NULLPTR", "WHILE", "FOR", "BREAK", "NEW", 
		"AND", "OR", "NOT", "NEW_UNIQUE", "NEW_SHARED", "VOID", "RETURN", "INT", 
		"FLOAT", "BOOL", "STRING", "ARRAY", "TENSOR", "OBJECTID", "TYPEID", "WS", 
		"SINGLE_COMMENT", "MULTI_COMMENT", "UNMATCH_COM", "EOF_COM", "UNKNOWN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'Int'", "'Float'", "'String'", 
		"'Bool'", "'Array'", "'Tensor'", "'('", "')'", "':'", "'@'", "';'", "','", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'='", "'{'", "'}'", 
		"'['", "']'", "'.'", "'<='", "'>='", "'=='", "'class'", "'else'", "'if'", 
		"'extends'", "'after'", "'unique'", "'shared'", "'weak'", "'construct'", 
		"'destruct'", "'this'", "'nullptr'", "'while'", "'for'", "'break'", "'new'", 
		"'and'", "'or'", "'not'", "'new_unique'", "'new_shared'", "'void'", "'return'", 
		null, null, null, null, "'*#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "FLOAT_CONST", 
		"STRING_CONST", "INT", "FLOAT", "STRING", "BOOL", "ARRAY", "TENSOR", "LPAREN", 
		"RPAREN", "COLON", "AT", "SEMICOLON", "COMMA", "PLUS", "MINUS", "STAR", 
		"SLASH", "PERCENT", "LT", "GT", "EQUALS", "LBRACE", "RBRACE", "LSQUARE", 
		"RSQUARE", "DOT", "LTE", "GTE", "DOUBLE_EQUALS", "CLASS", "ELSE", "IF", 
		"EXTENDS", "AFTER", "UNIQUE", "SHARED", "WEAK", "CONSTRUCT", "DESTRUCT", 
		"THIS", "NULLPTR", "WHILE", "FOR", "BREAK", "NEW", "AND", "OR", "NOT", 
		"NEW_UNIQUE", "NEW_SHARED", "VOID", "RETURN", "STR_ERR", "WS", "SINGLE_COMMENT", 
		"MULTI_COMMENT", "UNMATCH_COM", "EOF_COM", "UNKNOWN"
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



		// Function to report errors.
		public void reportError(String errorString){
			setText(errorString);
			setType(ERROR);
		}
	  

		// Function to process strings
		public void processString() {
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();

			//write your code to test strings here

			if (text.charAt(0) == '\n')
			{
				reportError("Unterminated string constant");
				return;
			}

			String temp = "";
			for(int i = 0; i < text.length(); i++)
			{
				char c0 = text.charAt(i);
				if (c0 == '\\' && i < text.length() - 1)
				{
					char c1 = text.charAt(i+1);
					if (c1 == 'b')
						temp += '\b';
					else if (c1 == 't')
						temp += "\t";
					else if (c1 == 'f')
						temp += '\f';
					else if (c1 == 'n')
						temp += '\n';
					else if (c1 == '"')
						temp += '\"';
					else if (c1 == '\\')
						temp += '\\';
					else
						temp += c1;
					i++;
				}
				else
					temp += c0;
			}

			if (temp.length() > 1024)
			{
				reportError("String constant too long");
				return;
			}
			else
			{
				setText(temp);
				return;
			}
		}

		public void unk_token() {
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();

			reportError(text);
		}


	public SparoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SparoLexer.g4"; }

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
		case 5:
			STRING_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			STR_ERR_action((RuleContext)_localctx, actionIndex);
			break;
		case 63:
			UNMATCH_COM_action((RuleContext)_localctx, actionIndex);
			break;
		case 64:
			EOF_COM_action((RuleContext)_localctx, actionIndex);
			break;
		case 65:
			UNKNOWN_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 processString(); 
			break;
		}
	}
	private void STR_ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			reportError("Unterminated string constant");
			break;
		case 2:
			reportError("String contains null character.");
			break;
		case 3:
			reportError("String contains escaped null character.");
			break;
		case 4:
			reportError("EOF in string constant");
			break;
		case 5:
			reportError("backslash at end of file");
			break;
		}
	}
	private void UNMATCH_COM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			reportError("Unmatched *#"); 
			break;
		}
	}
	private void EOF_COM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void UNKNOWN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			 unk_token(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u0218\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2\u0091\n\2\3\3\5\3\u0094\n\3\3\3\6\3\u0097\n\3\r\3\16\3\u0098\3"+
		"\4\5\4\u009c\n\4\3\4\6\4\u009f\n\4\r\4\16\4\u00a0\3\4\3\4\7\4\u00a5\n"+
		"\4\f\4\16\4\u00a8\13\4\3\5\3\5\3\5\7\5\u00ad\n\5\f\5\16\5\u00b0\13\5\3"+
		"\6\3\6\3\6\5\6\u00b5\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00c7\n\b\f\b\16\b\u00ca\13\b\3\b\3\b\5\b\u00ce"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00da\n\b\f\b\16\b\u00dd"+
		"\13\b\3\b\3\b\5\b\u00e1\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00f0\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3"+
		";\3;\3;\3;\3<\3<\7<\u01d6\n<\f<\16<\u01d9\13<\3=\3=\7=\u01dd\n=\f=\16"+
		"=\u01e0\13=\3>\6>\u01e3\n>\r>\16>\u01e4\3>\3>\3?\3?\3?\3?\7?\u01ed\n?"+
		"\f?\16?\u01f0\13?\3?\5?\u01f3\n?\3?\3?\3@\3@\3@\3@\7@\u01fb\n@\f@\16@"+
		"\u01fe\13@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\7B\u020e\nB\fB\16"+
		"B\u0211\13B\3B\3B\3B\3C\3C\3C\5\u01ee\u01fc\u020f\2D\3\6\5\7\7\b\t\2\13"+
		"\2\r\t\17=\21\20\23\21\25\22\27\23\31\32\33\24\35\25\37\26!\27#\30%\31"+
		"\'\33)\34+\35-\36/\37\61 \63!\65\"\67#9$;%=&?\'A(C)E*G+I,K-M.O/Q\60S\61"+
		"U\62W\63Y\64[\65]\66_\67a8c9e:g;i<k\nm\13o\rq\fs\16u\17w\5y\4{>}?\177"+
		"@\u0081A\u0083B\u0085C\3\2\13\3\2\62;\3\2\2\2\6\2\2\2\f\f$$^^\4\3\f\f"+
		"$$\3\2c|\6\2\62;C\\aac|\3\2C\\\5\2\13\f\17\17\"\"\3\3\f\f\2\u022a\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0090\3\2\2\2"+
		"\5\u0093\3\2\2\2\7\u009b\3\2\2\2\t\u00ae\3\2\2\2\13\u00b4\3\2\2\2\r\u00b6"+
		"\3\2\2\2\17\u00ef\3\2\2\2\21\u00f1\3\2\2\2\23\u00f3\3\2\2\2\25\u00f5\3"+
		"\2\2\2\27\u00f7\3\2\2\2\31\u00f9\3\2\2\2\33\u00fb\3\2\2\2\35\u00fd\3\2"+
		"\2\2\37\u00ff\3\2\2\2!\u0101\3\2\2\2#\u0103\3\2\2\2%\u0105\3\2\2\2\'\u0107"+
		"\3\2\2\2)\u0109\3\2\2\2+\u010b\3\2\2\2-\u010d\3\2\2\2/\u010f\3\2\2\2\61"+
		"\u0111\3\2\2\2\63\u0113\3\2\2\2\65\u0115\3\2\2\2\67\u0117\3\2\2\29\u011a"+
		"\3\2\2\2;\u011d\3\2\2\2=\u0120\3\2\2\2?\u0126\3\2\2\2A\u012b\3\2\2\2C"+
		"\u012e\3\2\2\2E\u0136\3\2\2\2G\u013c\3\2\2\2I\u0143\3\2\2\2K\u014a\3\2"+
		"\2\2M\u014f\3\2\2\2O\u0159\3\2\2\2Q\u0162\3\2\2\2S\u0167\3\2\2\2U\u016f"+
		"\3\2\2\2W\u0175\3\2\2\2Y\u0179\3\2\2\2[\u017f\3\2\2\2]\u0183\3\2\2\2_"+
		"\u0187\3\2\2\2a\u018a\3\2\2\2c\u018e\3\2\2\2e\u0199\3\2\2\2g\u01a4\3\2"+
		"\2\2i\u01a9\3\2\2\2k\u01b0\3\2\2\2m\u01b4\3\2\2\2o\u01ba\3\2\2\2q\u01bf"+
		"\3\2\2\2s\u01c6\3\2\2\2u\u01cc\3\2\2\2w\u01d3\3\2\2\2y\u01da\3\2\2\2{"+
		"\u01e2\3\2\2\2}\u01e8\3\2\2\2\177\u01f6\3\2\2\2\u0081\u0204\3\2\2\2\u0083"+
		"\u0209\3\2\2\2\u0085\u0215\3\2\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2"+
		"\2\u0089\u008a\7w\2\2\u008a\u0091\7g\2\2\u008b\u008c\7h\2\2\u008c\u008d"+
		"\7c\2\2\u008d\u008e\7n\2\2\u008e\u008f\7u\2\2\u008f\u0091\7g\2\2\u0090"+
		"\u0087\3\2\2\2\u0090\u008b\3\2\2\2\u0091\4\3\2\2\2\u0092\u0094\7/\2\2"+
		"\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097"+
		"\t\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\6\3\2\2\2\u009a\u009c\7/\2\2\u009b\u009a\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f\t\2\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a6\7\60\2\2\u00a3\u00a5\t\2\2\2\u00a4\u00a3\3"+
		"\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\b\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7^\2\2\u00aa\u00ad\n\3\2\2"+
		"\u00ab\u00ad\n\4\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\n\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b5\7\2\2\2\u00b2\u00b3\7^\2\2\u00b3\u00b5\7\2"+
		"\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\f\3\2\2\2\u00b6\u00b7"+
		"\7$\2\2\u00b7\u00b8\5\t\5\2\u00b8\u00b9\7$\2\2\u00b9\u00ba\b\7\2\2\u00ba"+
		"\16\3\2\2\2\u00bb\u00bc\7$\2\2\u00bc\u00bd\5\t\5\2\u00bd\u00be\7\f\2\2"+
		"\u00be\u00bf\b\b\3\2\u00bf\u00f0\3\2\2\2\u00c0\u00c1\7$\2\2\u00c1\u00c2"+
		"\5\t\5\2\u00c2\u00c8\7\2\2\2\u00c3\u00c4\5\t\5\2\u00c4\u00c5\5\13\6\2"+
		"\u00c5\u00c7\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cd\5\t\5\2\u00cc\u00ce\t\5\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\b\b\4\2\u00d0\u00f0\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2"+
		"\u00d3\5\t\5\2\u00d3\u00d4\7^\2\2\u00d4\u00d5\7\2\2\2\u00d5\u00db\3\2"+
		"\2\2\u00d6\u00d7\5\t\5\2\u00d7\u00d8\5\13\6\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d6\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\5\t\5\2\u00df"+
		"\u00e1\t\5\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b\b"+
		"\5\2\u00e3\u00f0\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5\u00e6\5\t\5\2\u00e6"+
		"\u00e7\7\2\2\3\u00e7\u00e8\b\b\6\2\u00e8\u00f0\3\2\2\2\u00e9\u00ea\7$"+
		"\2\2\u00ea\u00eb\5\t\5\2\u00eb\u00ec\7^\2\2\u00ec\u00ed\7\2\2\3\u00ed"+
		"\u00ee\b\b\7\2\u00ee\u00f0\3\2\2\2\u00ef\u00bb\3\2\2\2\u00ef\u00c0\3\2"+
		"\2\2\u00ef\u00d1\3\2\2\2\u00ef\u00e4\3\2\2\2\u00ef\u00e9\3\2\2\2\u00f0"+
		"\20\3\2\2\2\u00f1\u00f2\7*\2\2\u00f2\22\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4"+
		"\24\3\2\2\2\u00f5\u00f6\7<\2\2\u00f6\26\3\2\2\2\u00f7\u00f8\7B\2\2\u00f8"+
		"\30\3\2\2\2\u00f9\u00fa\7\'\2\2\u00fa\32\3\2\2\2\u00fb\u00fc\7=\2\2\u00fc"+
		"\34\3\2\2\2\u00fd\u00fe\7.\2\2\u00fe\36\3\2\2\2\u00ff\u0100\7-\2\2\u0100"+
		" \3\2\2\2\u0101\u0102\7/\2\2\u0102\"\3\2\2\2\u0103\u0104\7,\2\2\u0104"+
		"$\3\2\2\2\u0105\u0106\7\61\2\2\u0106&\3\2\2\2\u0107\u0108\7>\2\2\u0108"+
		"(\3\2\2\2\u0109\u010a\7@\2\2\u010a*\3\2\2\2\u010b\u010c\7?\2\2\u010c,"+
		"\3\2\2\2\u010d\u010e\7}\2\2\u010e.\3\2\2\2\u010f\u0110\7\177\2\2\u0110"+
		"\60\3\2\2\2\u0111\u0112\7]\2\2\u0112\62\3\2\2\2\u0113\u0114\7_\2\2\u0114"+
		"\64\3\2\2\2\u0115\u0116\7\60\2\2\u0116\66\3\2\2\2\u0117\u0118\7>\2\2\u0118"+
		"\u0119\7?\2\2\u01198\3\2\2\2\u011a\u011b\7@\2\2\u011b\u011c\7?\2\2\u011c"+
		":\3\2\2\2\u011d\u011e\7?\2\2\u011e\u011f\7?\2\2\u011f<\3\2\2\2\u0120\u0121"+
		"\7e\2\2\u0121\u0122\7n\2\2\u0122\u0123\7c\2\2\u0123\u0124\7u\2\2\u0124"+
		"\u0125\7u\2\2\u0125>\3\2\2\2\u0126\u0127\7g\2\2\u0127\u0128\7n\2\2\u0128"+
		"\u0129\7u\2\2\u0129\u012a\7g\2\2\u012a@\3\2\2\2\u012b\u012c\7k\2\2\u012c"+
		"\u012d\7h\2\2\u012dB\3\2\2\2\u012e\u012f\7g\2\2\u012f\u0130\7z\2\2\u0130"+
		"\u0131\7v\2\2\u0131\u0132\7g\2\2\u0132\u0133\7p\2\2\u0133\u0134\7f\2\2"+
		"\u0134\u0135\7u\2\2\u0135D\3\2\2\2\u0136\u0137\7c\2\2\u0137\u0138\7h\2"+
		"\2\u0138\u0139\7v\2\2\u0139\u013a\7g\2\2\u013a\u013b\7t\2\2\u013bF\3\2"+
		"\2\2\u013c\u013d\7w\2\2\u013d\u013e\7p\2\2\u013e\u013f\7k\2\2\u013f\u0140"+
		"\7s\2\2\u0140\u0141\7w\2\2\u0141\u0142\7g\2\2\u0142H\3\2\2\2\u0143\u0144"+
		"\7u\2\2\u0144\u0145\7j\2\2\u0145\u0146\7c\2\2\u0146\u0147\7t\2\2\u0147"+
		"\u0148\7g\2\2\u0148\u0149\7f\2\2\u0149J\3\2\2\2\u014a\u014b\7y\2\2\u014b"+
		"\u014c\7g\2\2\u014c\u014d\7c\2\2\u014d\u014e\7m\2\2\u014eL\3\2\2\2\u014f"+
		"\u0150\7e\2\2\u0150\u0151\7q\2\2\u0151\u0152\7p\2\2\u0152\u0153\7u\2\2"+
		"\u0153\u0154\7v\2\2\u0154\u0155\7t\2\2\u0155\u0156\7w\2\2\u0156\u0157"+
		"\7e\2\2\u0157\u0158\7v\2\2\u0158N\3\2\2\2\u0159\u015a\7f\2\2\u015a\u015b"+
		"\7g\2\2\u015b\u015c\7u\2\2\u015c\u015d\7v\2\2\u015d\u015e\7t\2\2\u015e"+
		"\u015f\7w\2\2\u015f\u0160\7e\2\2\u0160\u0161\7v\2\2\u0161P\3\2\2\2\u0162"+
		"\u0163\7v\2\2\u0163\u0164\7j\2\2\u0164\u0165\7k\2\2\u0165\u0166\7u\2\2"+
		"\u0166R\3\2\2\2\u0167\u0168\7p\2\2\u0168\u0169\7w\2\2\u0169\u016a\7n\2"+
		"\2\u016a\u016b\7n\2\2\u016b\u016c\7r\2\2\u016c\u016d\7v\2\2\u016d\u016e"+
		"\7t\2\2\u016eT\3\2\2\2\u016f\u0170\7y\2\2\u0170\u0171\7j\2\2\u0171\u0172"+
		"\7k\2\2\u0172\u0173\7n\2\2\u0173\u0174\7g\2\2\u0174V\3\2\2\2\u0175\u0176"+
		"\7h\2\2\u0176\u0177\7q\2\2\u0177\u0178\7t\2\2\u0178X\3\2\2\2\u0179\u017a"+
		"\7d\2\2\u017a\u017b\7t\2\2\u017b\u017c\7g\2\2\u017c\u017d\7c\2\2\u017d"+
		"\u017e\7m\2\2\u017eZ\3\2\2\2\u017f\u0180\7p\2\2\u0180\u0181\7g\2\2\u0181"+
		"\u0182\7y\2\2\u0182\\\3\2\2\2\u0183\u0184\7c\2\2\u0184\u0185\7p\2\2\u0185"+
		"\u0186\7f\2\2\u0186^\3\2\2\2\u0187\u0188\7q\2\2\u0188\u0189\7t\2\2\u0189"+
		"`\3\2\2\2\u018a\u018b\7p\2\2\u018b\u018c\7q\2\2\u018c\u018d\7v\2\2\u018d"+
		"b\3\2\2\2\u018e\u018f\7p\2\2\u018f\u0190\7g\2\2\u0190\u0191\7y\2\2\u0191"+
		"\u0192\7a\2\2\u0192\u0193\7w\2\2\u0193\u0194\7p\2\2\u0194\u0195\7k\2\2"+
		"\u0195\u0196\7s\2\2\u0196\u0197\7w\2\2\u0197\u0198\7g\2\2\u0198d\3\2\2"+
		"\2\u0199\u019a\7p\2\2\u019a\u019b\7g\2\2\u019b\u019c\7y\2\2\u019c\u019d"+
		"\7a\2\2\u019d\u019e\7u\2\2\u019e\u019f\7j\2\2\u019f\u01a0\7c\2\2\u01a0"+
		"\u01a1\7t\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a3\7f\2\2\u01a3f\3\2\2\2\u01a4"+
		"\u01a5\7x\2\2\u01a5\u01a6\7q\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7f\2\2"+
		"\u01a8h\3\2\2\2\u01a9\u01aa\7t\2\2\u01aa\u01ab\7g\2\2\u01ab\u01ac\7v\2"+
		"\2\u01ac\u01ad\7w\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af\7p\2\2\u01afj\3\2"+
		"\2\2\u01b0\u01b1\7K\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7v\2\2\u01b3l\3"+
		"\2\2\2\u01b4\u01b5\7H\2\2\u01b5\u01b6\7n\2\2\u01b6\u01b7\7q\2\2\u01b7"+
		"\u01b8\7c\2\2\u01b8\u01b9\7v\2\2\u01b9n\3\2\2\2\u01ba\u01bb\7D\2\2\u01bb"+
		"\u01bc\7q\2\2\u01bc\u01bd\7q\2\2\u01bd\u01be\7n\2\2\u01bep\3\2\2\2\u01bf"+
		"\u01c0\7U\2\2\u01c0\u01c1\7v\2\2\u01c1\u01c2\7t\2\2\u01c2\u01c3\7k\2\2"+
		"\u01c3\u01c4\7p\2\2\u01c4\u01c5\7i\2\2\u01c5r\3\2\2\2\u01c6\u01c7\7C\2"+
		"\2\u01c7\u01c8\7t\2\2\u01c8\u01c9\7t\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb"+
		"\7{\2\2\u01cbt\3\2\2\2\u01cc\u01cd\7V\2\2\u01cd\u01ce\7g\2\2\u01ce\u01cf"+
		"\7p\2\2\u01cf\u01d0\7u\2\2\u01d0\u01d1\7q\2\2\u01d1\u01d2\7t\2\2\u01d2"+
		"v\3\2\2\2\u01d3\u01d7\t\6\2\2\u01d4\u01d6\t\7\2\2\u01d5\u01d4\3\2\2\2"+
		"\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8x\3"+
		"\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01de\t\b\2\2\u01db\u01dd\t\7\2\2\u01dc"+
		"\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01dfz\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e3\t\t\2\2\u01e2\u01e1"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e7\b>\b\2\u01e7|\3\2\2\2\u01e8\u01e9\7%\2\2\u01e9"+
		"\u01ea\7%\2\2\u01ea\u01ee\3\2\2\2\u01eb\u01ed\13\2\2\2\u01ec\u01eb\3\2"+
		"\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3\t\n\2\2\u01f2\u01f1\3\2"+
		"\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\b?\b\2\u01f5~\3\2\2\2\u01f6\u01f7"+
		"\7%\2\2\u01f7\u01f8\7,\2\2\u01f8\u01fc\3\2\2\2\u01f9\u01fb\13\2\2\2\u01fa"+
		"\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fc\u01fa\3\2"+
		"\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7,\2\2\u0200"+
		"\u0201\7%\2\2\u0201\u0202\3\2\2\2\u0202\u0203\b@\b\2\u0203\u0080\3\2\2"+
		"\2\u0204\u0205\7,\2\2\u0205\u0206\7%\2\2\u0206\u0207\3\2\2\2\u0207\u0208"+
		"\bA\t\2\u0208\u0082\3\2\2\2\u0209\u020a\7%\2\2\u020a\u020b\7,\2\2\u020b"+
		"\u020f\3\2\2\2\u020c\u020e\13\2\2\2\u020d\u020c\3\2\2\2\u020e\u0211\3"+
		"\2\2\2\u020f\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0212\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0212\u0213\7\2\2\3\u0213\u0214\bB\n\2\u0214\u0084\3\2"+
		"\2\2\u0215\u0216\13\2\2\2\u0216\u0217\bC\13\2\u0217\u0086\3\2\2\2\30\2"+
		"\u0090\u0093\u0098\u009b\u00a0\u00a6\u00ac\u00ae\u00b4\u00c8\u00cd\u00db"+
		"\u00e0\u00ef\u01d7\u01de\u01e4\u01ee\u01f2\u01fc\u020f\f\3\7\2\3\b\3\3"+
		"\b\4\3\b\5\3\b\6\3\b\7\b\2\2\3A\b\3B\t\3C\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}