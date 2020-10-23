// Generated from sparo_parser.g4 by ANTLR 4.7.1
package parser.sparo;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sparo_parserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL_CONST=1, INT_CONST=2, FLOAT_CONST=3, STR_CONST=4, STR_NULL=5, STR_ERR_UNT=6, 
		STR_ERR_EOF=7, LPAREN=8, RPAREN=9, COLON=10, AT=11, PERCENT=12, SEMICOLON=13, 
		COMMA=14, PLUS=15, MINUS=16, STAR=17, SLASH=18, LT=19, GT=20, EQUALS=21, 
		LBRACE=22, RBRACE=23, LSQUARE=24, RSQUARE=25, DOT=26, LTE=27, GTE=28, 
		DOUBLE_EQUALS=29, CLASS=30, ELSE=31, IF=32, EXTENDS=33, AFTER=34, UNIQUE=35, 
		SHARED=36, WEAK=37, CONSTRUCT=38, DESTRUCT=39, THIS=40, NULLPTR=41, WHILE=42, 
		FOR=43, BREAK=44, NEW=45, AND=46, OR=47, NOT=48, NEW_UNIQUE=49, NEW_SHARED=50, 
		VOID=51, RETURN=52, INT=53, FLOAT=54, BOOL=55, STRING=56, ARRAY=57, TENSOR=58, 
		OBJECTID=59, TYPEID=60, WS=61, SINGLE_COMMENT=62, UNMATCH_COM=63, EOF_COM=64, 
		MULTI_COMMENT=65, UNKNOWN=66, STRING_CONST=67;
	public static final int
		RULE_program = 0, RULE_class_definition_list = 1, RULE_class_definition = 2, 
		RULE_class_head = 3, RULE_base_clause = 4, RULE_member_list = 5, RULE_member = 6, 
		RULE_destructor = 7, RULE_constructor = 8, RULE_method_definition = 9, 
		RULE_parameter_declaration_list = 10, RULE_parameter_declaration = 11, 
		RULE_statement = 12, RULE_declaration = 13, RULE_declaration_specifier = 14, 
		RULE_type_specifier = 15, RULE_array_specifier = 16, RULE_tensor_specifier = 17, 
		RULE_integer_constant_list = 18, RULE_pointer_type = 19, RULE_init_declarator = 20, 
		RULE_expression_statement = 21, RULE_expression_list = 22, RULE_expression = 23, 
		RULE_assignment_expression = 24, RULE_logical_OR_expression = 25, RULE_logical_AND_expression = 26, 
		RULE_equality_expression = 27, RULE_relational_expression = 28, RULE_additive_expression = 29, 
		RULE_multiplicative_expression = 30, RULE_unary_expression = 31, RULE_unary_operator = 32, 
		RULE_new_expression = 33, RULE_new_keyword = 34, RULE_postfix_expression = 35, 
		RULE_primary_expression = 36, RULE_constant = 37, RULE_compound_statement = 38, 
		RULE_statement_list = 39, RULE_selection_statement = 40, RULE_iteration_statement = 41, 
		RULE_jump_statement = 42;
	public static final String[] ruleNames = {
		"program", "class_definition_list", "class_definition", "class_head", 
		"base_clause", "member_list", "member", "destructor", "constructor", "method_definition", 
		"parameter_declaration_list", "parameter_declaration", "statement", "declaration", 
		"declaration_specifier", "type_specifier", "array_specifier", "tensor_specifier", 
		"integer_constant_list", "pointer_type", "init_declarator", "expression_statement", 
		"expression_list", "expression", "assignment_expression", "logical_OR_expression", 
		"logical_AND_expression", "equality_expression", "relational_expression", 
		"additive_expression", "multiplicative_expression", "unary_expression", 
		"unary_operator", "new_expression", "new_keyword", "postfix_expression", 
		"primary_expression", "constant", "compound_statement", "statement_list", 
		"selection_statement", "iteration_statement", "jump_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
		"'%'", "';'", "','", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'='", 
		"'{'", "'}'", "'['", "']'", "'.'", "'<='", "'>='", "'=='", "'class'", 
		"'else'", "'if'", "'extends'", "'after'", "'unique'", "'shared'", "'weak'", 
		"'construct'", "'destruct'", "'this'", "'nullptr'", "'while'", "'for'", 
		"'break'", "'new'", "'and'", "'or'", "'not'", "'new_unique'", "'new_shared'", 
		"'void'", "'return'", "'Int'", "'Float'", "'Bool'", "'String'", "'Array'", 
		"'Tensor'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOL_CONST", "INT_CONST", "FLOAT_CONST", "STR_CONST", "STR_NULL", 
		"STR_ERR_UNT", "STR_ERR_EOF", "LPAREN", "RPAREN", "COLON", "AT", "PERCENT", 
		"SEMICOLON", "COMMA", "PLUS", "MINUS", "STAR", "SLASH", "LT", "GT", "EQUALS", 
		"LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "DOT", "LTE", "GTE", "DOUBLE_EQUALS", 
		"CLASS", "ELSE", "IF", "EXTENDS", "AFTER", "UNIQUE", "SHARED", "WEAK", 
		"CONSTRUCT", "DESTRUCT", "THIS", "NULLPTR", "WHILE", "FOR", "BREAK", "NEW", 
		"AND", "OR", "NOT", "NEW_UNIQUE", "NEW_SHARED", "VOID", "RETURN", "INT", 
		"FLOAT", "BOOL", "STRING", "ARRAY", "TENSOR", "OBJECTID", "TYPEID", "WS", 
		"SINGLE_COMMENT", "UNMATCH_COM", "EOF_COM", "MULTI_COMMENT", "UNKNOWN", 
		"STRING_CONST"
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

	@Override
	public String getGrammarFileName() { return "sparo_parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



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

	public sparo_parserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Class_definition_listContext class_definition_list() {
			return getRuleContext(Class_definition_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(86);
				class_definition_list(0);
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

	public static class Class_definition_listContext extends ParserRuleContext {
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Class_definition_listContext class_definition_list() {
			return getRuleContext(Class_definition_listContext.class,0);
		}
		public Class_definition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitClass_definition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_definition_listContext class_definition_list() throws RecognitionException {
		return class_definition_list(0);
	}

	private Class_definition_listContext class_definition_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Class_definition_listContext _localctx = new Class_definition_listContext(_ctx, _parentState);
		Class_definition_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_class_definition_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(90);
			class_definition();
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Class_definition_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_class_definition_list);
					setState(92);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(93);
					class_definition();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class Class_definitionContext extends ParserRuleContext {
		public Class_headContext class_head() {
			return getRuleContext(Class_headContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(sparo_parserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(sparo_parserParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(sparo_parserParser.SEMICOLON, 0); }
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitClass_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			class_head();
			setState(100);
			match(LBRACE);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIQUE) | (1L << SHARED) | (1L << WEAK) | (1L << CONSTRUCT) | (1L << DESTRUCT) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << ARRAY) | (1L << TENSOR) | (1L << TYPEID))) != 0)) {
				{
				setState(101);
				member_list(0);
				}
			}

			setState(104);
			match(RBRACE);
			setState(105);
			match(SEMICOLON);
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

	public static class Class_headContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(sparo_parserParser.CLASS, 0); }
		public TerminalNode TYPEID() { return getToken(sparo_parserParser.TYPEID, 0); }
		public Base_clauseContext base_clause() {
			return getRuleContext(Base_clauseContext.class,0);
		}
		public Class_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitClass_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_headContext class_head() throws RecognitionException {
		Class_headContext _localctx = new Class_headContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CLASS);
			setState(108);
			match(TYPEID);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(109);
				base_clause();
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

	public static class Base_clauseContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(sparo_parserParser.EXTENDS, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Base_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitBase_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_clauseContext base_clause() throws RecognitionException {
		Base_clauseContext _localctx = new Base_clauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_base_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(EXTENDS);
			setState(113);
			type_specifier();
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

	public static class Member_listContext extends ParserRuleContext {
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public Member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitMember_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_listContext member_list() throws RecognitionException {
		return member_list(0);
	}

	private Member_listContext member_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Member_listContext _localctx = new Member_listContext(_ctx, _parentState);
		Member_listContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_member_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(116);
			member();
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Member_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_member_list);
					setState(118);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(119);
					member();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class MemberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public DestructorContext destructor() {
			return getRuleContext(DestructorContext.class,0);
		}
		public Method_definitionContext method_definition() {
			return getRuleContext(Method_definitionContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_member);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				constructor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				destructor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				method_definition();
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

	public static class DestructorContext extends ParserRuleContext {
		public TerminalNode DESTRUCT() { return getToken(sparo_parserParser.DESTRUCT, 0); }
		public TerminalNode LPAREN() { return getToken(sparo_parserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(sparo_parserParser.RPAREN, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public DestructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitDestructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructorContext destructor() throws RecognitionException {
		DestructorContext _localctx = new DestructorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_destructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(DESTRUCT);
			setState(132);
			match(LPAREN);
			setState(133);
			match(RPAREN);
			setState(134);
			compound_statement();
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCT() { return getToken(sparo_parserParser.CONSTRUCT, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(sparo_parserParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(sparo_parserParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(sparo_parserParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(sparo_parserParser.RPAREN, i);
		}
		public TerminalNode AFTER() { return getToken(sparo_parserParser.AFTER, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(CONSTRUCT);
			setState(137);
			match(LPAREN);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIQUE) | (1L << SHARED) | (1L << WEAK) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << ARRAY) | (1L << TENSOR) | (1L << TYPEID))) != 0)) {
				{
				setState(138);
				parameter_declaration_list(0);
				}
			}

			setState(141);
			match(RPAREN);
			setState(142);
			match(AFTER);
			setState(143);
			match(LPAREN);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << OBJECTID))) != 0) || _la==STRING_CONST) {
				{
				setState(144);
				expression_list(0);
				}
			}

			setState(147);
			match(RPAREN);
			setState(148);
			compound_statement();
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

	public static class Method_definitionContext extends ParserRuleContext {
		public Declaration_specifierContext declaration_specifier() {
			return getRuleContext(Declaration_specifierContext.class,0);
		}
		public TerminalNode OBJECTID() { return getToken(sparo_parserParser.OBJECTID, 0); }
		public TerminalNode LPAREN() { return getToken(sparo_parserParser.LPAREN, 0); }
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sparo_parserParser.RPAREN, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitMethod_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_definitionContext method_definition() throws RecognitionException {
		Method_definitionContext _localctx = new Method_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			declaration_specifier();
			setState(151);
			match(OBJECTID);
			setState(152);
			match(LPAREN);
			setState(153);
			parameter_declaration_list(0);
			setState(154);
			match(RPAREN);
			setState(155);
			compound_statement();
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

	public static class Parameter_declaration_listContext extends ParserRuleContext {
		public Parameter_declarationContext parameter_declaration() {
			return getRuleContext(Parameter_declarationContext.class,0);
		}
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(sparo_parserParser.COMMA, 0); }
		public Parameter_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitParameter_declaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declaration_listContext parameter_declaration_list() throws RecognitionException {
		return parameter_declaration_list(0);
	}

	private Parameter_declaration_listContext parameter_declaration_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Parameter_declaration_listContext _localctx = new Parameter_declaration_listContext(_ctx, _parentState);
		Parameter_declaration_listContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_parameter_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(158);
			parameter_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Parameter_declaration_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameter_declaration_list);
					setState(160);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(161);
					match(COMMA);
					setState(162);
					parameter_declaration();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Parameter_declarationContext extends ParserRuleContext {
		public Declaration_specifierContext declaration_specifier() {
			return getRuleContext(Declaration_specifierContext.class,0);
		}
		public TerminalNode OBJECTID() { return getToken(sparo_parserParser.OBJECTID, 0); }
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitParameter_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			declaration_specifier();
			setState(169);
			match(OBJECTID);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(sparo_parserParser.SEMICOLON, 0); }
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
			case SHARED:
			case WEAK:
			case INT:
			case FLOAT:
			case BOOL:
			case STRING:
			case ARRAY:
			case TENSOR:
			case TYPEID:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				declaration();
				setState(172);
				match(SEMICOLON);
				}
				break;
			case BOOL_CONST:
			case INT_CONST:
			case FLOAT_CONST:
			case LPAREN:
			case SEMICOLON:
			case MINUS:
			case THIS:
			case NULLPTR:
			case NOT:
			case NEW_UNIQUE:
			case NEW_SHARED:
			case OBJECTID:
			case STRING_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				expression_statement();
				setState(175);
				match(SEMICOLON);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				compound_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				selection_statement();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				iteration_statement();
				}
				break;
			case BREAK:
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				jump_statement();
				setState(181);
				match(SEMICOLON);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Declaration_specifierContext declaration_specifier() {
			return getRuleContext(Declaration_specifierContext.class,0);
		}
		public Init_declaratorContext init_declarator() {
			return getRuleContext(Init_declaratorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(sparo_parserParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			declaration_specifier();
			setState(186);
			init_declarator();
			setState(187);
			match(SEMICOLON);
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

	public static class Declaration_specifierContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(sparo_parserParser.SEMICOLON, 0); }
		public Pointer_typeContext pointer_type() {
			return getRuleContext(Pointer_typeContext.class,0);
		}
		public Declaration_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitDeclaration_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_specifierContext declaration_specifier() throws RecognitionException {
		Declaration_specifierContext _localctx = new Declaration_specifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaration_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIQUE) | (1L << SHARED) | (1L << WEAK))) != 0)) {
				{
				setState(189);
				pointer_type();
				}
			}

			setState(192);
			type_specifier();
			setState(193);
			match(SEMICOLON);
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

	public static class Type_specifierContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(sparo_parserParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(sparo_parserParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(sparo_parserParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(sparo_parserParser.STRING, 0); }
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Tensor_specifierContext tensor_specifier() {
			return getRuleContext(Tensor_specifierContext.class,0);
		}
		public TerminalNode TYPEID() { return getToken(sparo_parserParser.TYPEID, 0); }
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitType_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type_specifier);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(FLOAT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(STRING);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				array_specifier();
				}
				break;
			case TENSOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				tensor_specifier();
				}
				break;
			case TYPEID:
				enterOuterAlt(_localctx, 7);
				{
				setState(201);
				match(TYPEID);
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

	public static class Array_specifierContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(sparo_parserParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(sparo_parserParser.LT, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(sparo_parserParser.COMMA, 0); }
		public TerminalNode INT_CONST() { return getToken(sparo_parserParser.INT_CONST, 0); }
		public TerminalNode GT() { return getToken(sparo_parserParser.GT, 0); }
		public Array_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitArray_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_specifierContext array_specifier() throws RecognitionException {
		Array_specifierContext _localctx = new Array_specifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ARRAY);
			setState(205);
			match(LT);
			setState(206);
			type_specifier();
			setState(207);
			match(COMMA);
			setState(208);
			match(INT_CONST);
			setState(209);
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

	public static class Tensor_specifierContext extends ParserRuleContext {
		public TerminalNode TENSOR() { return getToken(sparo_parserParser.TENSOR, 0); }
		public TerminalNode LT() { return getToken(sparo_parserParser.LT, 0); }
		public Integer_constant_listContext integer_constant_list() {
			return getRuleContext(Integer_constant_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(sparo_parserParser.GT, 0); }
		public Tensor_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensor_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitTensor_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tensor_specifierContext tensor_specifier() throws RecognitionException {
		Tensor_specifierContext _localctx = new Tensor_specifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tensor_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(TENSOR);
			setState(212);
			match(LT);
			setState(213);
			integer_constant_list(0);
			setState(214);
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

	public static class Integer_constant_listContext extends ParserRuleContext {
		public TerminalNode INT_CONST() { return getToken(sparo_parserParser.INT_CONST, 0); }
		public Integer_constant_listContext integer_constant_list() {
			return getRuleContext(Integer_constant_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(sparo_parserParser.COMMA, 0); }
		public Integer_constant_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_constant_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitInteger_constant_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_constant_listContext integer_constant_list() throws RecognitionException {
		return integer_constant_list(0);
	}

	private Integer_constant_listContext integer_constant_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Integer_constant_listContext _localctx = new Integer_constant_listContext(_ctx, _parentState);
		Integer_constant_listContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_integer_constant_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(217);
			match(INT_CONST);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Integer_constant_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_integer_constant_list);
					setState(219);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(220);
					match(COMMA);
					setState(221);
					match(INT_CONST);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Pointer_typeContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(sparo_parserParser.UNIQUE, 0); }
		public TerminalNode SHARED() { return getToken(sparo_parserParser.SHARED, 0); }
		public TerminalNode WEAK() { return getToken(sparo_parserParser.WEAK, 0); }
		public Pointer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitPointer_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_typeContext pointer_type() throws RecognitionException {
		Pointer_typeContext _localctx = new Pointer_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pointer_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIQUE) | (1L << SHARED) | (1L << WEAK))) != 0)) ) {
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(sparo_parserParser.OBJECTID, 0); }
		public TerminalNode EQUALS() { return getToken(sparo_parserParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitInit_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_init_declarator);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(OBJECTID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(OBJECTID);
				setState(231);
				match(EQUALS);
				setState(232);
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

	public static class Expression_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << OBJECTID))) != 0) || _la==STRING_CONST) {
				{
				setState(235);
				expression();
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

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(sparo_parserParser.COMMA, 0); }
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		return expression_list(0);
	}

	private Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState);
		Expression_listContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(239);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(241);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(242);
					match(COMMA);
					setState(243);
					expression();
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			assignment_expression();
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

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Logical_OR_expressionContext logical_OR_expression() {
			return getRuleContext(Logical_OR_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(sparo_parserParser.EQUALS, 0); }
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitAssignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignment_expression);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				logical_OR_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				unary_expression();
				setState(253);
				match(EQUALS);
				setState(254);
				assignment_expression();
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

	public static class Logical_OR_expressionContext extends ParserRuleContext {
		public Logical_AND_expressionContext logical_AND_expression() {
			return getRuleContext(Logical_AND_expressionContext.class,0);
		}
		public Logical_OR_expressionContext logical_OR_expression() {
			return getRuleContext(Logical_OR_expressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(sparo_parserParser.OR, 0); }
		public Logical_OR_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_OR_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitLogical_OR_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_OR_expressionContext logical_OR_expression() throws RecognitionException {
		return logical_OR_expression(0);
	}

	private Logical_OR_expressionContext logical_OR_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_OR_expressionContext _localctx = new Logical_OR_expressionContext(_ctx, _parentState);
		Logical_OR_expressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_logical_OR_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(259);
			logical_AND_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_OR_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_OR_expression);
					setState(261);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(262);
					match(OR);
					setState(263);
					logical_AND_expression(0);
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Logical_AND_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Logical_AND_expressionContext logical_AND_expression() {
			return getRuleContext(Logical_AND_expressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(sparo_parserParser.AND, 0); }
		public Logical_AND_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_AND_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitLogical_AND_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_AND_expressionContext logical_AND_expression() throws RecognitionException {
		return logical_AND_expression(0);
	}

	private Logical_AND_expressionContext logical_AND_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_AND_expressionContext _localctx = new Logical_AND_expressionContext(_ctx, _parentState);
		Logical_AND_expressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_logical_AND_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(270);
			equality_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_AND_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_AND_expression);
					setState(272);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(273);
					match(AND);
					setState(274);
					equality_expression(0);
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_EQUALS() { return getToken(sparo_parserParser.DOUBLE_EQUALS, 0); }
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		return equality_expression(0);
	}

	private Equality_expressionContext equality_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, _parentState);
		Equality_expressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_equality_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(281);
			relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Equality_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
					setState(283);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(284);
					match(DOUBLE_EQUALS);
					setState(285);
					relational_expression(0);
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(sparo_parserParser.LT, 0); }
		public TerminalNode GT() { return getToken(sparo_parserParser.GT, 0); }
		public TerminalNode LTE() { return getToken(sparo_parserParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(sparo_parserParser.GTE, 0); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		return relational_expression(0);
	}

	private Relational_expressionContext relational_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, _parentState);
		Relational_expressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_relational_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(292);
			additive_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(306);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(294);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(295);
						match(LT);
						setState(296);
						additive_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(297);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(298);
						match(GT);
						setState(299);
						additive_expression(0);
						}
						break;
					case 3:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(300);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(301);
						match(LTE);
						setState(302);
						additive_expression(0);
						}
						break;
					case 4:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(303);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(304);
						match(GTE);
						setState(305);
						additive_expression(0);
						}
						break;
					}
					} 
				}
				setState(310);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(sparo_parserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(sparo_parserParser.MINUS, 0); }
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		return additive_expression(0);
	}

	private Additive_expressionContext additive_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, _parentState);
		Additive_expressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_additive_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(312);
			multiplicative_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(320);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(314);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(315);
						match(PLUS);
						setState(316);
						multiplicative_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(317);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(318);
						match(MINUS);
						setState(319);
						multiplicative_expression(0);
						}
						break;
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public TerminalNode STAR() { return getToken(sparo_parserParser.STAR, 0); }
		public TerminalNode AT() { return getToken(sparo_parserParser.AT, 0); }
		public TerminalNode SLASH() { return getToken(sparo_parserParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(sparo_parserParser.PERCENT, 0); }
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		return multiplicative_expression(0);
	}

	private Multiplicative_expressionContext multiplicative_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, _parentState);
		Multiplicative_expressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_multiplicative_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(326);
			unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(328);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(329);
						match(STAR);
						setState(330);
						unary_expression();
						}
						break;
					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(331);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(332);
						match(AT);
						setState(333);
						unary_expression();
						}
						break;
					case 3:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(334);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(335);
						match(SLASH);
						setState(336);
						unary_expression();
						}
						break;
					case 4:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(337);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(338);
						match(PERCENT);
						setState(339);
						unary_expression();
						}
						break;
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unary_expression);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_CONST:
			case INT_CONST:
			case FLOAT_CONST:
			case LPAREN:
			case THIS:
			case NULLPTR:
			case OBJECTID:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				postfix_expression(0);
				}
				break;
			case MINUS:
			case NOT:
			case NEW_UNIQUE:
			case NEW_SHARED:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				unary_operator();
				setState(347);
				unary_expression();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(sparo_parserParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(sparo_parserParser.NOT, 0); }
		public New_expressionContext new_expression() {
			return getRuleContext(New_expressionContext.class,0);
		}
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unary_operator);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(MINUS);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(NOT);
				}
				break;
			case NEW_UNIQUE:
			case NEW_SHARED:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				new_expression();
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

	public static class New_expressionContext extends ParserRuleContext {
		public New_keywordContext new_keyword() {
			return getRuleContext(New_keywordContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(sparo_parserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(sparo_parserParser.RPAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public New_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitNew_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_new_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			new_keyword();
			setState(357);
			type_specifier();
			setState(358);
			match(LPAREN);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << OBJECTID))) != 0) || _la==STRING_CONST) {
				{
				setState(359);
				expression_list(0);
				}
			}

			setState(362);
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

	public static class New_keywordContext extends ParserRuleContext {
		public TerminalNode NEW_UNIQUE() { return getToken(sparo_parserParser.NEW_UNIQUE, 0); }
		public TerminalNode NEW_SHARED() { return getToken(sparo_parserParser.NEW_SHARED, 0); }
		public New_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitNew_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_keywordContext new_keyword() throws RecognitionException {
		New_keywordContext _localctx = new New_keywordContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_new_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(_la==NEW_UNIQUE || _la==NEW_SHARED) ) {
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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode LSQUARE() { return getToken(sparo_parserParser.LSQUARE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(sparo_parserParser.RSQUARE, 0); }
		public TerminalNode LPAREN() { return getToken(sparo_parserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(sparo_parserParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(sparo_parserParser.DOT, 0); }
		public TerminalNode OBJECTID() { return getToken(sparo_parserParser.OBJECTID, 0); }
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitPostfix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(367);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(383);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(369);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(370);
						match(LSQUARE);
						setState(371);
						expression_list(0);
						setState(372);
						match(RSQUARE);
						}
						break;
					case 2:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(374);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(375);
						match(LPAREN);
						setState(377);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << OBJECTID))) != 0) || _la==STRING_CONST) {
							{
							setState(376);
							expression_list(0);
							}
						}

						setState(379);
						match(RPAREN);
						}
						break;
					case 3:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(380);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(381);
						match(DOT);
						setState(382);
						match(OBJECTID);
						}
						break;
					}
					} 
				}
				setState(387);
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(sparo_parserParser.THIS, 0); }
		public TerminalNode OBJECTID() { return getToken(sparo_parserParser.OBJECTID, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(sparo_parserParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sparo_parserParser.RPAREN, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primary_expression);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(THIS);
				}
				break;
			case OBJECTID:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(OBJECTID);
				}
				break;
			case BOOL_CONST:
			case INT_CONST:
			case FLOAT_CONST:
			case NULLPTR:
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				match(LPAREN);
				setState(392);
				expression();
				setState(393);
				match(RPAREN);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INT_CONST() { return getToken(sparo_parserParser.INT_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(sparo_parserParser.STRING_CONST, 0); }
		public TerminalNode FLOAT_CONST() { return getToken(sparo_parserParser.FLOAT_CONST, 0); }
		public TerminalNode BOOL_CONST() { return getToken(sparo_parserParser.BOOL_CONST, 0); }
		public TerminalNode NULLPTR() { return getToken(sparo_parserParser.NULLPTR, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << NULLPTR))) != 0) || _la==STRING_CONST) ) {
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

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(sparo_parserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(sparo_parserParser.RBRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(LBRACE);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << SEMICOLON) | (1L << MINUS) | (1L << LBRACE) | (1L << IF) | (1L << UNIQUE) | (1L << SHARED) | (1L << WEAK) | (1L << THIS) | (1L << NULLPTR) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << RETURN) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << ARRAY) | (1L << TENSOR) | (1L << OBJECTID) | (1L << TYPEID))) != 0) || _la==STRING_CONST) {
				{
				setState(400);
				statement_list(0);
				}
			}

			setState(403);
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

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		return statement_list(0);
	}

	private Statement_listContext statement_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_listContext _localctx = new Statement_listContext(_ctx, _parentState);
		Statement_listContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(406);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Statement_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
					setState(408);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(409);
					statement();
					}
					} 
				}
				setState(414);
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

	public static class Selection_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(sparo_parserParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(sparo_parserParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sparo_parserParser.RPAREN, 0); }
		public List<Compound_statementContext> compound_statement() {
			return getRuleContexts(Compound_statementContext.class);
		}
		public Compound_statementContext compound_statement(int i) {
			return getRuleContext(Compound_statementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(sparo_parserParser.ELSE, 0); }
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitSelection_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_selection_statement);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(IF);
				setState(416);
				match(LPAREN);
				setState(417);
				expression();
				setState(418);
				match(RPAREN);
				setState(419);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(IF);
				setState(422);
				match(LPAREN);
				setState(423);
				expression();
				setState(424);
				match(RPAREN);
				setState(425);
				compound_statement();
				setState(426);
				match(ELSE);
				setState(427);
				compound_statement();
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

	public static class Iteration_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(sparo_parserParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(sparo_parserParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(sparo_parserParser.RPAREN, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public TerminalNode FOR() { return getToken(sparo_parserParser.FOR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(sparo_parserParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(sparo_parserParser.SEMICOLON, i);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitIteration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_iteration_statement);
		int _la;
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(WHILE);
				setState(432);
				match(LPAREN);
				setState(433);
				expression();
				setState(434);
				match(RPAREN);
				setState(435);
				compound_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(FOR);
				setState(438);
				match(LPAREN);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << OBJECTID))) != 0) || _la==STRING_CONST) {
					{
					setState(439);
					expression();
					}
				}

				setState(442);
				match(SEMICOLON);
				setState(443);
				expression();
				setState(444);
				match(SEMICOLON);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << OBJECTID))) != 0) || _la==STRING_CONST) {
					{
					setState(445);
					expression();
					}
				}

				setState(448);
				match(RPAREN);
				setState(449);
				compound_statement();
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

	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(sparo_parserParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(sparo_parserParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sparo_parserVisitor ) return ((sparo_parserVisitor<? extends T>)visitor).visitJump_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_jump_statement);
		int _la;
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(BREAK);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(RETURN);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << OBJECTID))) != 0) || _la==STRING_CONST) {
					{
					setState(455);
					expression();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return class_definition_list_sempred((Class_definition_listContext)_localctx, predIndex);
		case 5:
			return member_list_sempred((Member_listContext)_localctx, predIndex);
		case 10:
			return parameter_declaration_list_sempred((Parameter_declaration_listContext)_localctx, predIndex);
		case 18:
			return integer_constant_list_sempred((Integer_constant_listContext)_localctx, predIndex);
		case 22:
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 25:
			return logical_OR_expression_sempred((Logical_OR_expressionContext)_localctx, predIndex);
		case 26:
			return logical_AND_expression_sempred((Logical_AND_expressionContext)_localctx, predIndex);
		case 27:
			return equality_expression_sempred((Equality_expressionContext)_localctx, predIndex);
		case 28:
			return relational_expression_sempred((Relational_expressionContext)_localctx, predIndex);
		case 29:
			return additive_expression_sempred((Additive_expressionContext)_localctx, predIndex);
		case 30:
			return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);
		case 35:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 39:
			return statement_list_sempred((Statement_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean class_definition_list_sempred(Class_definition_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean member_list_sempred(Member_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameter_declaration_list_sempred(Parameter_declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean integer_constant_list_sempred(Integer_constant_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_OR_expression_sempred(Logical_OR_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_AND_expression_sempred(Logical_AND_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equality_expression_sempred(Equality_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relational_expression_sempred(Relational_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additive_expression_sempred(Additive_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicative_expression_sempred(Multiplicative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statement_list_sempred(Statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u01cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\5\2Z\n\2\3\3\3\3\3\3\3\3\3\3\7\3a\n\3\f\3\16\3d\13\3\3\4\3\4"+
		"\3\4\5\4i\n\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5q\n\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\b\3\b\3\b\3\b\5\b\u0084\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u008e\n\n\3\n\3\n\3\n\3\n\5\n\u0094\n\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00a6\n\f\f\f\16\f\u00a9\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ba\n\16\3\17\3\17\3\17\3\17"+
		"\3\20\5\20\u00c1\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00cd\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00e1\n\24\f\24\16\24\u00e4\13"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00ec\n\26\3\27\5\27\u00ef\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00f7\n\30\f\30\16\30\u00fa\13\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u0103\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\7\33\u010b\n\33\f\33\16\33\u010e\13\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u0116\n\34\f\34\16\34\u0119\13\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u0121\n\35\f\35\16\35\u0124\13\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0135\n\36"+
		"\f\36\16\36\u0138\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7"+
		"\37\u0143\n\37\f\37\16\37\u0146\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \7 \u0157\n \f \16 \u015a\13 \3!\3!\3!\3!\5!\u0160\n!\3\""+
		"\3\"\3\"\5\"\u0165\n\"\3#\3#\3#\3#\5#\u016b\n#\3#\3#\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\5%\u017c\n%\3%\3%\3%\3%\7%\u0182\n%\f%\16%\u0185"+
		"\13%\3&\3&\3&\3&\3&\3&\3&\5&\u018e\n&\3\'\3\'\3(\3(\5(\u0194\n(\3(\3("+
		"\3)\3)\3)\3)\3)\7)\u019d\n)\f)\16)\u01a0\13)\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\5*\u01b0\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01bb\n+\3"+
		"+\3+\3+\3+\5+\u01c1\n+\3+\3+\3+\5+\u01c6\n+\3,\3,\3,\5,\u01cb\n,\5,\u01cd"+
		"\n,\3,\2\17\4\f\26&.\64\668:<>HP-\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\5\3\2%\'\3\2\63\64\5\2\3\5"+
		"++EE\2\u01df\2Y\3\2\2\2\4[\3\2\2\2\6e\3\2\2\2\bm\3\2\2\2\nr\3\2\2\2\f"+
		"u\3\2\2\2\16\u0083\3\2\2\2\20\u0085\3\2\2\2\22\u008a\3\2\2\2\24\u0098"+
		"\3\2\2\2\26\u009f\3\2\2\2\30\u00aa\3\2\2\2\32\u00b9\3\2\2\2\34\u00bb\3"+
		"\2\2\2\36\u00c0\3\2\2\2 \u00cc\3\2\2\2\"\u00ce\3\2\2\2$\u00d5\3\2\2\2"+
		"&\u00da\3\2\2\2(\u00e5\3\2\2\2*\u00eb\3\2\2\2,\u00ee\3\2\2\2.\u00f0\3"+
		"\2\2\2\60\u00fb\3\2\2\2\62\u0102\3\2\2\2\64\u0104\3\2\2\2\66\u010f\3\2"+
		"\2\28\u011a\3\2\2\2:\u0125\3\2\2\2<\u0139\3\2\2\2>\u0147\3\2\2\2@\u015f"+
		"\3\2\2\2B\u0164\3\2\2\2D\u0166\3\2\2\2F\u016e\3\2\2\2H\u0170\3\2\2\2J"+
		"\u018d\3\2\2\2L\u018f\3\2\2\2N\u0191\3\2\2\2P\u0197\3\2\2\2R\u01af\3\2"+
		"\2\2T\u01c5\3\2\2\2V\u01cc\3\2\2\2XZ\5\4\3\2YX\3\2\2\2YZ\3\2\2\2Z\3\3"+
		"\2\2\2[\\\b\3\1\2\\]\5\6\4\2]b\3\2\2\2^_\f\3\2\2_a\5\6\4\2`^\3\2\2\2a"+
		"d\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\5\3\2\2\2db\3\2\2\2ef\5\b\5\2fh\7\30\2"+
		"\2gi\5\f\7\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\31\2\2kl\7\17\2\2l\7\3"+
		"\2\2\2mn\7 \2\2np\7>\2\2oq\5\n\6\2po\3\2\2\2pq\3\2\2\2q\t\3\2\2\2rs\7"+
		"#\2\2st\5 \21\2t\13\3\2\2\2uv\b\7\1\2vw\5\16\b\2w|\3\2\2\2xy\f\3\2\2y"+
		"{\5\16\b\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\r\3\2\2\2~|\3\2\2"+
		"\2\177\u0084\5\34\17\2\u0080\u0084\5\22\n\2\u0081\u0084\5\20\t\2\u0082"+
		"\u0084\5\24\13\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0082\3\2\2\2\u0084\17\3\2\2\2\u0085\u0086\7)\2\2\u0086\u0087"+
		"\7\n\2\2\u0087\u0088\7\13\2\2\u0088\u0089\5N(\2\u0089\21\3\2\2\2\u008a"+
		"\u008b\7(\2\2\u008b\u008d\7\n\2\2\u008c\u008e\5\26\f\2\u008d\u008c\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\13\2\2\u0090"+
		"\u0091\7$\2\2\u0091\u0093\7\n\2\2\u0092\u0094\5.\30\2\u0093\u0092\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\13\2\2\u0096"+
		"\u0097\5N(\2\u0097\23\3\2\2\2\u0098\u0099\5\36\20\2\u0099\u009a\7=\2\2"+
		"\u009a\u009b\7\n\2\2\u009b\u009c\5\26\f\2\u009c\u009d\7\13\2\2\u009d\u009e"+
		"\5N(\2\u009e\25\3\2\2\2\u009f\u00a0\b\f\1\2\u00a0\u00a1\5\30\r\2\u00a1"+
		"\u00a7\3\2\2\2\u00a2\u00a3\f\3\2\2\u00a3\u00a4\7\20\2\2\u00a4\u00a6\5"+
		"\30\r\2\u00a5\u00a2\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\5\36\20"+
		"\2\u00ab\u00ac\7=\2\2\u00ac\31\3\2\2\2\u00ad\u00ae\5\34\17\2\u00ae\u00af"+
		"\7\17\2\2\u00af\u00ba\3\2\2\2\u00b0\u00b1\5,\27\2\u00b1\u00b2\7\17\2\2"+
		"\u00b2\u00ba\3\2\2\2\u00b3\u00ba\5N(\2\u00b4\u00ba\5R*\2\u00b5\u00ba\5"+
		"T+\2\u00b6\u00b7\5V,\2\u00b7\u00b8\7\17\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00ad\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4\3\2"+
		"\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\33\3\2\2\2\u00bb\u00bc"+
		"\5\36\20\2\u00bc\u00bd\5*\26\2\u00bd\u00be\7\17\2\2\u00be\35\3\2\2\2\u00bf"+
		"\u00c1\5(\25\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\5 \21\2\u00c3\u00c4\7\17\2\2\u00c4\37\3\2\2\2\u00c5\u00cd"+
		"\7\67\2\2\u00c6\u00cd\78\2\2\u00c7\u00cd\79\2\2\u00c8\u00cd\7:\2\2\u00c9"+
		"\u00cd\5\"\22\2\u00ca\u00cd\5$\23\2\u00cb\u00cd\7>\2\2\u00cc\u00c5\3\2"+
		"\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc"+
		"\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd!\3\2\2\2"+
		"\u00ce\u00cf\7;\2\2\u00cf\u00d0\7\25\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d2"+
		"\7\20\2\2\u00d2\u00d3\7\4\2\2\u00d3\u00d4\7\26\2\2\u00d4#\3\2\2\2\u00d5"+
		"\u00d6\7<\2\2\u00d6\u00d7\7\25\2\2\u00d7\u00d8\5&\24\2\u00d8\u00d9\7\26"+
		"\2\2\u00d9%\3\2\2\2\u00da\u00db\b\24\1\2\u00db\u00dc\7\4\2\2\u00dc\u00e2"+
		"\3\2\2\2\u00dd\u00de\f\3\2\2\u00de\u00df\7\20\2\2\u00df\u00e1\7\4\2\2"+
		"\u00e0\u00dd\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\'\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\t\2\2\2\u00e6"+
		")\3\2\2\2\u00e7\u00ec\7=\2\2\u00e8\u00e9\7=\2\2\u00e9\u00ea\7\27\2\2\u00ea"+
		"\u00ec\5\60\31\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec+\3\2\2"+
		"\2\u00ed\u00ef\5\60\31\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"-\3\2\2\2\u00f0\u00f1\b\30\1\2\u00f1\u00f2\5\60\31\2\u00f2\u00f8\3\2\2"+
		"\2\u00f3\u00f4\f\3\2\2\u00f4\u00f5\7\20\2\2\u00f5\u00f7\5\60\31\2\u00f6"+
		"\u00f3\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9/\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\5\62\32\2\u00fc\61"+
		"\3\2\2\2\u00fd\u0103\5\64\33\2\u00fe\u00ff\5@!\2\u00ff\u0100\7\27\2\2"+
		"\u0100\u0101\5\62\32\2\u0101\u0103\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe"+
		"\3\2\2\2\u0103\63\3\2\2\2\u0104\u0105\b\33\1\2\u0105\u0106\5\66\34\2\u0106"+
		"\u010c\3\2\2\2\u0107\u0108\f\3\2\2\u0108\u0109\7\61\2\2\u0109\u010b\5"+
		"\66\34\2\u010a\u0107\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\65\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\b\34\1"+
		"\2\u0110\u0111\58\35\2\u0111\u0117\3\2\2\2\u0112\u0113\f\3\2\2\u0113\u0114"+
		"\7\60\2\2\u0114\u0116\58\35\2\u0115\u0112\3\2\2\2\u0116\u0119\3\2\2\2"+
		"\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\67\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u011a\u011b\b\35\1\2\u011b\u011c\5:\36\2\u011c\u0122\3\2\2\2"+
		"\u011d\u011e\f\3\2\2\u011e\u011f\7\37\2\2\u011f\u0121\5:\36\2\u0120\u011d"+
		"\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"9\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\b\36\1\2\u0126\u0127\5<\37\2"+
		"\u0127\u0136\3\2\2\2\u0128\u0129\f\6\2\2\u0129\u012a\7\25\2\2\u012a\u0135"+
		"\5<\37\2\u012b\u012c\f\5\2\2\u012c\u012d\7\26\2\2\u012d\u0135\5<\37\2"+
		"\u012e\u012f\f\4\2\2\u012f\u0130\7\35\2\2\u0130\u0135\5<\37\2\u0131\u0132"+
		"\f\3\2\2\u0132\u0133\7\36\2\2\u0133\u0135\5<\37\2\u0134\u0128\3\2\2\2"+
		"\u0134\u012b\3\2\2\2\u0134\u012e\3\2\2\2\u0134\u0131\3\2\2\2\u0135\u0138"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137;\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013a\b\37\1\2\u013a\u013b\5> \2\u013b\u0144\3\2"+
		"\2\2\u013c\u013d\f\4\2\2\u013d\u013e\7\21\2\2\u013e\u0143\5> \2\u013f"+
		"\u0140\f\3\2\2\u0140\u0141\7\22\2\2\u0141\u0143\5> \2\u0142\u013c\3\2"+
		"\2\2\u0142\u013f\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145=\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\b \1\2\u0148"+
		"\u0149\5@!\2\u0149\u0158\3\2\2\2\u014a\u014b\f\6\2\2\u014b\u014c\7\23"+
		"\2\2\u014c\u0157\5@!\2\u014d\u014e\f\5\2\2\u014e\u014f\7\r\2\2\u014f\u0157"+
		"\5@!\2\u0150\u0151\f\4\2\2\u0151\u0152\7\24\2\2\u0152\u0157\5@!\2\u0153"+
		"\u0154\f\3\2\2\u0154\u0155\7\16\2\2\u0155\u0157\5@!\2\u0156\u014a\3\2"+
		"\2\2\u0156\u014d\3\2\2\2\u0156\u0150\3\2\2\2\u0156\u0153\3\2\2\2\u0157"+
		"\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159?\3\2\2\2"+
		"\u015a\u0158\3\2\2\2\u015b\u0160\5H%\2\u015c\u015d\5B\"\2\u015d\u015e"+
		"\5@!\2\u015e\u0160\3\2\2\2\u015f\u015b\3\2\2\2\u015f\u015c\3\2\2\2\u0160"+
		"A\3\2\2\2\u0161\u0165\7\22\2\2\u0162\u0165\7\62\2\2\u0163\u0165\5D#\2"+
		"\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165C\3"+
		"\2\2\2\u0166\u0167\5F$\2\u0167\u0168\5 \21\2\u0168\u016a\7\n\2\2\u0169"+
		"\u016b\5.\30\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016d\7\13\2\2\u016dE\3\2\2\2\u016e\u016f\t\3\2\2\u016fG\3"+
		"\2\2\2\u0170\u0171\b%\1\2\u0171\u0172\5J&\2\u0172\u0183\3\2\2\2\u0173"+
		"\u0174\f\5\2\2\u0174\u0175\7\32\2\2\u0175\u0176\5.\30\2\u0176\u0177\7"+
		"\33\2\2\u0177\u0182\3\2\2\2\u0178\u0179\f\4\2\2\u0179\u017b\7\n\2\2\u017a"+
		"\u017c\5.\30\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u0182\7\13\2\2\u017e\u017f\f\3\2\2\u017f\u0180\7\34\2\2\u0180"+
		"\u0182\7=\2\2\u0181\u0173\3\2\2\2\u0181\u0178\3\2\2\2\u0181\u017e\3\2"+
		"\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"I\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u018e\7*\2\2\u0187\u018e\7=\2\2\u0188"+
		"\u018e\5L\'\2\u0189\u018a\7\n\2\2\u018a\u018b\5\60\31\2\u018b\u018c\7"+
		"\13\2\2\u018c\u018e\3\2\2\2\u018d\u0186\3\2\2\2\u018d\u0187\3\2\2\2\u018d"+
		"\u0188\3\2\2\2\u018d\u0189\3\2\2\2\u018eK\3\2\2\2\u018f\u0190\t\4\2\2"+
		"\u0190M\3\2\2\2\u0191\u0193\7\30\2\2\u0192\u0194\5P)\2\u0193\u0192\3\2"+
		"\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\7\31\2\2\u0196"+
		"O\3\2\2\2\u0197\u0198\b)\1\2\u0198\u0199\5\32\16\2\u0199\u019e\3\2\2\2"+
		"\u019a\u019b\f\3\2\2\u019b\u019d\5\32\16\2\u019c\u019a\3\2\2\2\u019d\u01a0"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019fQ\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a2\7\"\2\2\u01a2\u01a3\7\n\2\2\u01a3\u01a4\5\60"+
		"\31\2\u01a4\u01a5\7\13\2\2\u01a5\u01a6\5N(\2\u01a6\u01b0\3\2\2\2\u01a7"+
		"\u01a8\7\"\2\2\u01a8\u01a9\7\n\2\2\u01a9\u01aa\5\60\31\2\u01aa\u01ab\7"+
		"\13\2\2\u01ab\u01ac\5N(\2\u01ac\u01ad\7!\2\2\u01ad\u01ae\5N(\2\u01ae\u01b0"+
		"\3\2\2\2\u01af\u01a1\3\2\2\2\u01af\u01a7\3\2\2\2\u01b0S\3\2\2\2\u01b1"+
		"\u01b2\7,\2\2\u01b2\u01b3\7\n\2\2\u01b3\u01b4\5\60\31\2\u01b4\u01b5\7"+
		"\13\2\2\u01b5\u01b6\5N(\2\u01b6\u01c6\3\2\2\2\u01b7\u01b8\7-\2\2\u01b8"+
		"\u01ba\7\n\2\2\u01b9\u01bb\5\60\31\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3"+
		"\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\7\17\2\2\u01bd\u01be\5\60\31\2"+
		"\u01be\u01c0\7\17\2\2\u01bf\u01c1\5\60\31\2\u01c0\u01bf\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7\13\2\2\u01c3\u01c4\5"+
		"N(\2\u01c4\u01c6\3\2\2\2\u01c5\u01b1\3\2\2\2\u01c5\u01b7\3\2\2\2\u01c6"+
		"U\3\2\2\2\u01c7\u01cd\7.\2\2\u01c8\u01ca\7\66\2\2\u01c9\u01cb\5\60\31"+
		"\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01c7"+
		"\3\2\2\2\u01cc\u01c8\3\2\2\2\u01cdW\3\2\2\2+Ybhp|\u0083\u008d\u0093\u00a7"+
		"\u00b9\u00c0\u00cc\u00e2\u00eb\u00ee\u00f8\u0102\u010c\u0117\u0122\u0134"+
		"\u0136\u0142\u0144\u0156\u0158\u015f\u0164\u016a\u017b\u0181\u0183\u018d"+
		"\u0193\u019e\u01af\u01ba\u01c0\u01c5\u01ca\u01cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}