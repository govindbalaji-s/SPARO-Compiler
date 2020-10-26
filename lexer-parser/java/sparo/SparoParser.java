// Generated from SparoParser.g4 by ANTLR 4.7.1
package sparo;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparoParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_class_definition_list = 1, RULE_class_definition = 2, 
		RULE_class_head = 3, RULE_base_clause = 4, RULE_member_list = 5, RULE_member = 6, 
		RULE_destructor = 7, RULE_constructor = 8, RULE_method_definition = 9, 
		RULE_parameter_declaration_list = 10, RULE_parameter_declaration = 11, 
		RULE_statement = 12, RULE_declaration = 13, RULE_member_declaration = 14, 
		RULE_declaration_specifier = 15, RULE_type_specifier = 16, RULE_array_specifier = 17, 
		RULE_tensor_specifier = 18, RULE_integer_constant_list = 19, RULE_pointer_type = 20, 
		RULE_init_declarator = 21, RULE_expression_statement = 22, RULE_expression_list = 23, 
		RULE_expression = 24, RULE_slice_expression = 25, RULE_assignment_expression = 26, 
		RULE_logical_OR_expression = 27, RULE_logical_AND_expression = 28, RULE_equality_expression = 29, 
		RULE_relational_expression = 30, RULE_additive_expression = 31, RULE_multiplicative_expression = 32, 
		RULE_unary_expression = 33, RULE_unary_operator = 34, RULE_new_expression = 35, 
		RULE_new_keyword = 36, RULE_postfix_expression = 37, RULE_primary_expression = 38, 
		RULE_constant = 39, RULE_compound_statement = 40, RULE_statement_list = 41, 
		RULE_selection_statement = 42, RULE_iteration_statement = 43, RULE_for_initializer = 44, 
		RULE_jump_statement = 45;
	public static final String[] ruleNames = {
		"program", "class_definition_list", "class_definition", "class_head", 
		"base_clause", "member_list", "member", "destructor", "constructor", "method_definition", 
		"parameter_declaration_list", "parameter_declaration", "statement", "declaration", 
		"member_declaration", "declaration_specifier", "type_specifier", "array_specifier", 
		"tensor_specifier", "integer_constant_list", "pointer_type", "init_declarator", 
		"expression_statement", "expression_list", "expression", "slice_expression", 
		"assignment_expression", "logical_OR_expression", "logical_AND_expression", 
		"equality_expression", "relational_expression", "additive_expression", 
		"multiplicative_expression", "unary_expression", "unary_operator", "new_expression", 
		"new_keyword", "postfix_expression", "primary_expression", "constant", 
		"compound_statement", "statement_list", "selection_statement", "iteration_statement", 
		"for_initializer", "jump_statement"
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

	@Override
	public String getGrammarFileName() { return "SparoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SparoParser(TokenStream input) {
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
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(92);
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
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitClass_definition_list(this);
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
			setState(96);
			class_definition();
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
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
					setState(98);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(99);
					class_definition();
					}
					} 
				}
				setState(104);
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
		public TerminalNode LBRACE() { return getToken(SparoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SparoParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SparoParser.SEMICOLON, 0); }
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitClass_definition(this);
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
			setState(105);
			class_head();
			setState(106);
			match(LBRACE);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << ARRAY) | (1L << TENSOR) | (1L << UNIQUE) | (1L << SHARED) | (1L << WEAK) | (1L << CONSTRUCT) | (1L << DESTRUCT))) != 0)) {
				{
				setState(107);
				member_list(0);
				}
			}

			setState(110);
			match(RBRACE);
			setState(111);
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
		public TerminalNode CLASS() { return getToken(SparoParser.CLASS, 0); }
		public TerminalNode TYPEID() { return getToken(SparoParser.TYPEID, 0); }
		public Base_clauseContext base_clause() {
			return getRuleContext(Base_clauseContext.class,0);
		}
		public Class_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitClass_head(this);
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
			setState(113);
			match(CLASS);
			setState(114);
			match(TYPEID);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(115);
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
		public TerminalNode EXTENDS() { return getToken(SparoParser.EXTENDS, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Base_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitBase_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_clauseContext base_clause() throws RecognitionException {
		Base_clauseContext _localctx = new Base_clauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_base_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(EXTENDS);
			setState(119);
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
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitMember_list(this);
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
			setState(122);
			member();
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
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
					setState(124);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(125);
					member();
					}
					} 
				}
				setState(130);
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
		public Member_declarationContext member_declaration() {
			return getRuleContext(Member_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SparoParser.SEMICOLON, 0); }
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
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_member);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				member_declaration();
				setState(132);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				constructor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				destructor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
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
		public TerminalNode DESTRUCT() { return getToken(SparoParser.DESTRUCT, 0); }
		public TerminalNode LPAREN() { return getToken(SparoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SparoParser.RPAREN, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public DestructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitDestructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructorContext destructor() throws RecognitionException {
		DestructorContext _localctx = new DestructorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_destructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(DESTRUCT);
			setState(140);
			match(LPAREN);
			setState(141);
			match(RPAREN);
			setState(142);
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
		public TerminalNode CONSTRUCT() { return getToken(SparoParser.CONSTRUCT, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(SparoParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SparoParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SparoParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SparoParser.RPAREN, i);
		}
		public TerminalNode AFTER() { return getToken(SparoParser.AFTER, 0); }
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
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitConstructor(this);
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
			setState(144);
			match(CONSTRUCT);
			setState(145);
			match(LPAREN);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << ARRAY) | (1L << TENSOR) | (1L << UNIQUE) | (1L << SHARED) | (1L << WEAK))) != 0)) {
				{
				setState(146);
				parameter_declaration_list(0);
				}
			}

			setState(149);
			match(RPAREN);
			setState(150);
			match(AFTER);
			setState(151);
			match(LPAREN);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << STRING_CONST) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED))) != 0)) {
				{
				setState(152);
				expression_list(0);
				}
			}

			setState(155);
			match(RPAREN);
			setState(156);
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
		public TerminalNode OBJECTID() { return getToken(SparoParser.OBJECTID, 0); }
		public TerminalNode LPAREN() { return getToken(SparoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SparoParser.RPAREN, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public Method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitMethod_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_definitionContext method_definition() throws RecognitionException {
		Method_definitionContext _localctx = new Method_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			declaration_specifier();
			setState(159);
			match(OBJECTID);
			setState(160);
			match(LPAREN);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << ARRAY) | (1L << TENSOR) | (1L << UNIQUE) | (1L << SHARED) | (1L << WEAK))) != 0)) {
				{
				setState(161);
				parameter_declaration_list(0);
				}
			}

			setState(164);
			match(RPAREN);
			setState(165);
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
		public TerminalNode COMMA() { return getToken(SparoParser.COMMA, 0); }
		public Parameter_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitParameter_declaration_list(this);
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
			setState(168);
			parameter_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Parameter_declaration_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameter_declaration_list);
					setState(170);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(171);
					match(COMMA);
					setState(172);
					parameter_declaration();
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode OBJECTID() { return getToken(SparoParser.OBJECTID, 0); }
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitParameter_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			declaration_specifier();
			setState(179);
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
		public TerminalNode SEMICOLON() { return getToken(SparoParser.SEMICOLON, 0); }
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
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEID:
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case ARRAY:
			case TENSOR:
			case UNIQUE:
			case SHARED:
			case WEAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				declaration();
				setState(182);
				match(SEMICOLON);
				}
				break;
			case OBJECTID:
			case BOOL_CONST:
			case INT_CONST:
			case FLOAT_CONST:
			case STRING_CONST:
			case LPAREN:
			case COLON:
			case SEMICOLON:
			case MINUS:
			case THIS:
			case NULLPTR:
			case NOT:
			case NEW_UNIQUE:
			case NEW_SHARED:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				expression_statement();
				setState(185);
				match(SEMICOLON);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				compound_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				selection_statement();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				iteration_statement();
				}
				break;
			case BREAK:
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				jump_statement();
				setState(191);
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			declaration_specifier();
			setState(196);
			init_declarator();
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

	public static class Member_declarationContext extends ParserRuleContext {
		public Declaration_specifierContext declaration_specifier() {
			return getRuleContext(Declaration_specifierContext.class,0);
		}
		public TerminalNode OBJECTID() { return getToken(SparoParser.OBJECTID, 0); }
		public Member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitMember_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_declarationContext member_declaration() throws RecognitionException {
		Member_declarationContext _localctx = new Member_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_member_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			declaration_specifier();
			setState(199);
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

	public static class Declaration_specifierContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Pointer_typeContext pointer_type() {
			return getRuleContext(Pointer_typeContext.class,0);
		}
		public Declaration_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitDeclaration_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_specifierContext declaration_specifier() throws RecognitionException {
		Declaration_specifierContext _localctx = new Declaration_specifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIQUE) | (1L << SHARED) | (1L << WEAK))) != 0)) {
				{
				setState(201);
				pointer_type();
				}
			}

			setState(204);
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

	public static class Type_specifierContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SparoParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SparoParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(SparoParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(SparoParser.STRING, 0); }
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Tensor_specifierContext tensor_specifier() {
			return getRuleContext(Tensor_specifierContext.class,0);
		}
		public TerminalNode TYPEID() { return getToken(SparoParser.TYPEID, 0); }
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitType_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type_specifier);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(FLOAT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(STRING);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				array_specifier();
				}
				break;
			case TENSOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				tensor_specifier();
				}
				break;
			case TYPEID:
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
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
		public TerminalNode ARRAY() { return getToken(SparoParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(SparoParser.LT, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SparoParser.COMMA, 0); }
		public TerminalNode INT_CONST() { return getToken(SparoParser.INT_CONST, 0); }
		public TerminalNode GT() { return getToken(SparoParser.GT, 0); }
		public Array_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitArray_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_specifierContext array_specifier() throws RecognitionException {
		Array_specifierContext _localctx = new Array_specifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(ARRAY);
			setState(216);
			match(LT);
			setState(217);
			type_specifier();
			setState(218);
			match(COMMA);
			setState(219);
			match(INT_CONST);
			setState(220);
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
		public TerminalNode TENSOR() { return getToken(SparoParser.TENSOR, 0); }
		public TerminalNode LT() { return getToken(SparoParser.LT, 0); }
		public Integer_constant_listContext integer_constant_list() {
			return getRuleContext(Integer_constant_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(SparoParser.GT, 0); }
		public Tensor_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensor_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitTensor_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tensor_specifierContext tensor_specifier() throws RecognitionException {
		Tensor_specifierContext _localctx = new Tensor_specifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tensor_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(TENSOR);
			setState(223);
			match(LT);
			setState(224);
			integer_constant_list(0);
			setState(225);
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
		public TerminalNode INT_CONST() { return getToken(SparoParser.INT_CONST, 0); }
		public Integer_constant_listContext integer_constant_list() {
			return getRuleContext(Integer_constant_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SparoParser.COMMA, 0); }
		public Integer_constant_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_constant_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitInteger_constant_list(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_integer_constant_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(228);
			match(INT_CONST);
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Integer_constant_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_integer_constant_list);
					setState(230);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(231);
					match(COMMA);
					setState(232);
					match(INT_CONST);
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public TerminalNode UNIQUE() { return getToken(SparoParser.UNIQUE, 0); }
		public TerminalNode SHARED() { return getToken(SparoParser.SHARED, 0); }
		public TerminalNode WEAK() { return getToken(SparoParser.WEAK, 0); }
		public Pointer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitPointer_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_typeContext pointer_type() throws RecognitionException {
		Pointer_typeContext _localctx = new Pointer_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pointer_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		public TerminalNode OBJECTID() { return getToken(SparoParser.OBJECTID, 0); }
		public TerminalNode EQUALS() { return getToken(SparoParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitInit_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_init_declarator);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(OBJECTID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(OBJECTID);
				setState(242);
				match(EQUALS);
				setState(243);
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
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << STRING_CONST) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED))) != 0)) {
				{
				setState(246);
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
		public TerminalNode COMMA() { return getToken(SparoParser.COMMA, 0); }
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitExpression_list(this);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(250);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(252);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(253);
					match(COMMA);
					setState(254);
					expression();
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public Slice_expressionContext slice_expression() {
			return getRuleContext(Slice_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			slice_expression();
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

	public static class Slice_expressionContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(SparoParser.COLON, 0); }
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public Slice_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitSlice_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slice_expressionContext slice_expression() throws RecognitionException {
		Slice_expressionContext _localctx = new Slice_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_slice_expression);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << STRING_CONST) | (1L << LPAREN) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED))) != 0)) {
					{
					setState(262);
					assignment_expression();
					}
				}

				setState(265);
				match(COLON);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(266);
					assignment_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
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

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Logical_OR_expressionContext logical_OR_expression() {
			return getRuleContext(Logical_OR_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(SparoParser.EQUALS, 0); }
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitAssignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment_expression);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				logical_OR_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				unary_expression();
				setState(274);
				match(EQUALS);
				setState(275);
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
		public TerminalNode OR() { return getToken(SparoParser.OR, 0); }
		public Logical_OR_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_OR_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitLogical_OR_expression(this);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_logical_OR_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(280);
			logical_AND_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_OR_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_OR_expression);
					setState(282);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(283);
					match(OR);
					setState(284);
					logical_AND_expression(0);
					}
					} 
				}
				setState(289);
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

	public static class Logical_AND_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Logical_AND_expressionContext logical_AND_expression() {
			return getRuleContext(Logical_AND_expressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SparoParser.AND, 0); }
		public Logical_AND_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_AND_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitLogical_AND_expression(this);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_logical_AND_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(291);
			equality_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_AND_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_AND_expression);
					setState(293);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(294);
					match(AND);
					setState(295);
					equality_expression(0);
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public TerminalNode DOUBLE_EQUALS() { return getToken(SparoParser.DOUBLE_EQUALS, 0); }
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitEquality_expression(this);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_equality_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(302);
			relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Equality_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
					setState(304);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(305);
					match(DOUBLE_EQUALS);
					setState(306);
					relational_expression(0);
					}
					} 
				}
				setState(311);
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(SparoParser.LT, 0); }
		public TerminalNode GT() { return getToken(SparoParser.GT, 0); }
		public TerminalNode LTE() { return getToken(SparoParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(SparoParser.GTE, 0); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitRelational_expression(this);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_relational_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(313);
			additive_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(315);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(316);
						match(LT);
						setState(317);
						additive_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(318);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(319);
						match(GT);
						setState(320);
						additive_expression(0);
						}
						break;
					case 3:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(321);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(322);
						match(LTE);
						setState(323);
						additive_expression(0);
						}
						break;
					case 4:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(324);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(325);
						match(GTE);
						setState(326);
						additive_expression(0);
						}
						break;
					}
					} 
				}
				setState(331);
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SparoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparoParser.MINUS, 0); }
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitAdditive_expression(this);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_additive_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(333);
			multiplicative_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(341);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(335);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(336);
						match(PLUS);
						setState(337);
						multiplicative_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(338);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(339);
						match(MINUS);
						setState(340);
						multiplicative_expression(0);
						}
						break;
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public TerminalNode STAR() { return getToken(SparoParser.STAR, 0); }
		public TerminalNode AT() { return getToken(SparoParser.AT, 0); }
		public TerminalNode SLASH() { return getToken(SparoParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SparoParser.PERCENT, 0); }
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_multiplicative_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(347);
			unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(349);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(350);
						match(STAR);
						setState(351);
						unary_expression();
						}
						break;
					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(352);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(353);
						match(AT);
						setState(354);
						unary_expression();
						}
						break;
					case 3:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(355);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(356);
						match(SLASH);
						setState(357);
						unary_expression();
						}
						break;
					case 4:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(358);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(359);
						match(PERCENT);
						setState(360);
						unary_expression();
						}
						break;
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public New_expressionContext new_expression() {
			return getRuleContext(New_expressionContext.class,0);
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
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unary_expression);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECTID:
			case BOOL_CONST:
			case INT_CONST:
			case FLOAT_CONST:
			case STRING_CONST:
			case LPAREN:
			case THIS:
			case NULLPTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				postfix_expression(0);
				}
				break;
			case NEW_UNIQUE:
			case NEW_SHARED:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				new_expression();
				}
				break;
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				unary_operator();
				setState(369);
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
		public TerminalNode MINUS() { return getToken(SparoParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(SparoParser.NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==NOT) ) {
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

	public static class New_expressionContext extends ParserRuleContext {
		public New_keywordContext new_keyword() {
			return getRuleContext(New_keywordContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SparoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SparoParser.RPAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public New_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitNew_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_new_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			new_keyword();
			setState(376);
			type_specifier();
			setState(377);
			match(LPAREN);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << STRING_CONST) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED))) != 0)) {
				{
				setState(378);
				expression_list(0);
				}
			}

			setState(381);
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
		public TerminalNode NEW_UNIQUE() { return getToken(SparoParser.NEW_UNIQUE, 0); }
		public TerminalNode NEW_SHARED() { return getToken(SparoParser.NEW_SHARED, 0); }
		public New_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitNew_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_keywordContext new_keyword() throws RecognitionException {
		New_keywordContext _localctx = new New_keywordContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_new_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
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
		public TerminalNode LSQUARE() { return getToken(SparoParser.LSQUARE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(SparoParser.RSQUARE, 0); }
		public TerminalNode LPAREN() { return getToken(SparoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SparoParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(SparoParser.DOT, 0); }
		public TerminalNode OBJECTID() { return getToken(SparoParser.OBJECTID, 0); }
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitPostfix_expression(this);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(386);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(388);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(389);
						match(LSQUARE);
						setState(390);
						expression_list(0);
						setState(391);
						match(RSQUARE);
						}
						break;
					case 2:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(393);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(394);
						match(LPAREN);
						setState(396);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << STRING_CONST) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED))) != 0)) {
							{
							setState(395);
							expression_list(0);
							}
						}

						setState(398);
						match(RPAREN);
						}
						break;
					case 3:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(399);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(400);
						match(DOT);
						setState(401);
						match(OBJECTID);
						}
						break;
					}
					} 
				}
				setState(406);
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(SparoParser.THIS, 0); }
		public TerminalNode OBJECTID() { return getToken(SparoParser.OBJECTID, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SparoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SparoParser.RPAREN, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_primary_expression);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(THIS);
				}
				break;
			case OBJECTID:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(OBJECTID);
				}
				break;
			case BOOL_CONST:
			case INT_CONST:
			case FLOAT_CONST:
			case STRING_CONST:
			case NULLPTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				match(LPAREN);
				setState(411);
				expression();
				setState(412);
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
		public TerminalNode INT_CONST() { return getToken(SparoParser.INT_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(SparoParser.STRING_CONST, 0); }
		public TerminalNode FLOAT_CONST() { return getToken(SparoParser.FLOAT_CONST, 0); }
		public TerminalNode BOOL_CONST() { return getToken(SparoParser.BOOL_CONST, 0); }
		public TerminalNode NULLPTR() { return getToken(SparoParser.NULLPTR, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << STRING_CONST) | (1L << NULLPTR))) != 0)) ) {
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
		public TerminalNode LBRACE() { return getToken(SparoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SparoParser.RBRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(LBRACE);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEID) | (1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << STRING_CONST) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << ARRAY) | (1L << TENSOR) | (1L << LPAREN) | (1L << COLON) | (1L << SEMICOLON) | (1L << MINUS) | (1L << LBRACE) | (1L << IF) | (1L << UNIQUE) | (1L << SHARED) | (1L << WEAK) | (1L << THIS) | (1L << NULLPTR) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << RETURN))) != 0)) {
				{
				setState(419);
				statement_list(0);
				}
			}

			setState(422);
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
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitStatement_list(this);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(425);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Statement_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
					setState(427);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(428);
					statement();
					}
					} 
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		public TerminalNode IF() { return getToken(SparoParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(SparoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SparoParser.RPAREN, 0); }
		public List<Compound_statementContext> compound_statement() {
			return getRuleContexts(Compound_statementContext.class);
		}
		public Compound_statementContext compound_statement(int i) {
			return getRuleContext(Compound_statementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SparoParser.ELSE, 0); }
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitSelection_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_selection_statement);
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(IF);
				setState(435);
				match(LPAREN);
				setState(436);
				expression();
				setState(437);
				match(RPAREN);
				setState(438);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				match(IF);
				setState(441);
				match(LPAREN);
				setState(442);
				expression();
				setState(443);
				match(RPAREN);
				setState(444);
				compound_statement();
				setState(445);
				match(ELSE);
				setState(446);
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
		public TerminalNode WHILE() { return getToken(SparoParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(SparoParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SparoParser.RPAREN, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SparoParser.FOR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SparoParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SparoParser.SEMICOLON, i);
		}
		public For_initializerContext for_initializer() {
			return getRuleContext(For_initializerContext.class,0);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitIteration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_iteration_statement);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(WHILE);
				setState(451);
				match(LPAREN);
				setState(452);
				expression();
				setState(453);
				match(RPAREN);
				setState(454);
				compound_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				match(FOR);
				setState(457);
				match(LPAREN);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEID) | (1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << STRING_CONST) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << ARRAY) | (1L << TENSOR) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << UNIQUE) | (1L << SHARED) | (1L << WEAK) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED))) != 0)) {
					{
					setState(458);
					for_initializer();
					}
				}

				setState(461);
				match(SEMICOLON);
				setState(462);
				expression();
				setState(463);
				match(SEMICOLON);
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << STRING_CONST) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED))) != 0)) {
					{
					setState(464);
					expression();
					}
				}

				setState(467);
				match(RPAREN);
				setState(468);
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

	public static class For_initializerContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitFor_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initializerContext for_initializer() throws RecognitionException {
		For_initializerContext _localctx = new For_initializerContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_for_initializer);
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEID:
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case ARRAY:
			case TENSOR:
			case UNIQUE:
			case SHARED:
			case WEAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				declaration();
				}
				break;
			case OBJECTID:
			case BOOL_CONST:
			case INT_CONST:
			case FLOAT_CONST:
			case STRING_CONST:
			case LPAREN:
			case COLON:
			case MINUS:
			case THIS:
			case NULLPTR:
			case NOT:
			case NEW_UNIQUE:
			case NEW_SHARED:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				expression();
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
		public TerminalNode BREAK() { return getToken(SparoParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(SparoParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparoParserVisitor ) return ((SparoParserVisitor<? extends T>)visitor).visitJump_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_jump_statement);
		int _la;
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(BREAK);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				match(RETURN);
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << STRING_CONST) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED))) != 0)) {
					{
					setState(478);
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
		case 19:
			return integer_constant_list_sempred((Integer_constant_listContext)_localctx, predIndex);
		case 23:
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 27:
			return logical_OR_expression_sempred((Logical_OR_expressionContext)_localctx, predIndex);
		case 28:
			return logical_AND_expression_sempred((Logical_AND_expressionContext)_localctx, predIndex);
		case 29:
			return equality_expression_sempred((Equality_expressionContext)_localctx, predIndex);
		case 30:
			return relational_expression_sempred((Relational_expressionContext)_localctx, predIndex);
		case 31:
			return additive_expression_sempred((Additive_expressionContext)_localctx, predIndex);
		case 32:
			return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);
		case 37:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 41:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u01e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\5\2`\n\2\3\3\3\3\3\3\3\3\3\3\7\3g\n\3\f\3\16"+
		"\3j\13\3\3\4\3\4\3\4\5\4o\n\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5w\n\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\7\7\u0081\n\7\f\7\16\7\u0084\13\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u008c\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u0096\n"+
		"\n\3\n\3\n\3\n\3\n\5\n\u009c\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13"+
		"\u00a5\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b0\n\f\f\f\16"+
		"\f\u00b3\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00c4\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\5\21"+
		"\u00cd\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d8\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\7\25\u00ec\n\25\f\25\16\25\u00ef\13\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\5\27\u00f7\n\27\3\30\5\30\u00fa\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u0102\n\31\f\31\16\31\u0105\13\31\3\32\3\32"+
		"\3\33\5\33\u010a\n\33\3\33\3\33\5\33\u010e\n\33\3\33\5\33\u0111\n\33\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u0118\n\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u0120\n\35\f\35\16\35\u0123\13\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u012b\n\36\f\36\16\36\u012e\13\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u0136\n\37\f\37\16\37\u0139\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \7 \u014a\n \f \16 \u014d\13 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\7!\u0158\n!\f!\16!\u015b\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\7\"\u016c\n\"\f\"\16\"\u016f\13\"\3#\3#\3#\3#\3#"+
		"\5#\u0176\n#\3$\3$\3%\3%\3%\3%\5%\u017e\n%\3%\3%\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u018f\n\'\3\'\3\'\3\'\3\'\7\'\u0195\n"+
		"\'\f\'\16\'\u0198\13\'\3(\3(\3(\3(\3(\3(\3(\5(\u01a1\n(\3)\3)\3*\3*\5"+
		"*\u01a7\n*\3*\3*\3+\3+\3+\3+\3+\7+\u01b0\n+\f+\16+\u01b3\13+\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01c3\n,\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\5-\u01ce\n-\3-\3-\3-\3-\5-\u01d4\n-\3-\3-\3-\5-\u01d9\n-\3.\3.\5."+
		"\u01dd\n.\3/\3/\3/\5/\u01e2\n/\5/\u01e4\n/\3/\2\17\4\f\26(\608:<>@BLT"+
		"\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\\2\6\3\2+-\4\2\27\2788\3\29:\4\2\6\t\61\61\2\u01f7\2_\3"+
		"\2\2\2\4a\3\2\2\2\6k\3\2\2\2\bs\3\2\2\2\nx\3\2\2\2\f{\3\2\2\2\16\u008b"+
		"\3\2\2\2\20\u008d\3\2\2\2\22\u0092\3\2\2\2\24\u00a0\3\2\2\2\26\u00a9\3"+
		"\2\2\2\30\u00b4\3\2\2\2\32\u00c3\3\2\2\2\34\u00c5\3\2\2\2\36\u00c8\3\2"+
		"\2\2 \u00cc\3\2\2\2\"\u00d7\3\2\2\2$\u00d9\3\2\2\2&\u00e0\3\2\2\2(\u00e5"+
		"\3\2\2\2*\u00f0\3\2\2\2,\u00f6\3\2\2\2.\u00f9\3\2\2\2\60\u00fb\3\2\2\2"+
		"\62\u0106\3\2\2\2\64\u0110\3\2\2\2\66\u0117\3\2\2\28\u0119\3\2\2\2:\u0124"+
		"\3\2\2\2<\u012f\3\2\2\2>\u013a\3\2\2\2@\u014e\3\2\2\2B\u015c\3\2\2\2D"+
		"\u0175\3\2\2\2F\u0177\3\2\2\2H\u0179\3\2\2\2J\u0181\3\2\2\2L\u0183\3\2"+
		"\2\2N\u01a0\3\2\2\2P\u01a2\3\2\2\2R\u01a4\3\2\2\2T\u01aa\3\2\2\2V\u01c2"+
		"\3\2\2\2X\u01d8\3\2\2\2Z\u01dc\3\2\2\2\\\u01e3\3\2\2\2^`\5\4\3\2_^\3\2"+
		"\2\2_`\3\2\2\2`\3\3\2\2\2ab\b\3\1\2bc\5\6\4\2ch\3\2\2\2de\f\3\2\2eg\5"+
		"\6\4\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\5\3\2\2\2jh\3\2\2\2kl"+
		"\5\b\5\2ln\7\36\2\2mo\5\f\7\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\37\2\2"+
		"qr\7\24\2\2r\7\3\2\2\2st\7&\2\2tv\7\4\2\2uw\5\n\6\2vu\3\2\2\2vw\3\2\2"+
		"\2w\t\3\2\2\2xy\7)\2\2yz\5\"\22\2z\13\3\2\2\2{|\b\7\1\2|}\5\16\b\2}\u0082"+
		"\3\2\2\2~\177\f\3\2\2\177\u0081\5\16\b\2\u0080~\3\2\2\2\u0081\u0084\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\r\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0086\5\36\20\2\u0086\u0087\7\24\2\2\u0087\u008c\3\2\2"+
		"\2\u0088\u008c\5\22\n\2\u0089\u008c\5\20\t\2\u008a\u008c\5\24\13\2\u008b"+
		"\u0085\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2"+
		"\2\2\u008c\17\3\2\2\2\u008d\u008e\7/\2\2\u008e\u008f\7\20\2\2\u008f\u0090"+
		"\7\21\2\2\u0090\u0091\5R*\2\u0091\21\3\2\2\2\u0092\u0093\7.\2\2\u0093"+
		"\u0095\7\20\2\2\u0094\u0096\5\26\f\2\u0095\u0094\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\21\2\2\u0098\u0099\7*\2\2\u0099"+
		"\u009b\7\20\2\2\u009a\u009c\5\60\31\2\u009b\u009a\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\21\2\2\u009e\u009f\5R*\2\u009f"+
		"\23\3\2\2\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\7\5\2\2\u00a2\u00a4\7\20\2"+
		"\2\u00a3\u00a5\5\26\f\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\7\21\2\2\u00a7\u00a8\5R*\2\u00a8\25\3\2\2\2"+
		"\u00a9\u00aa\b\f\1\2\u00aa\u00ab\5\30\r\2\u00ab\u00b1\3\2\2\2\u00ac\u00ad"+
		"\f\3\2\2\u00ad\u00ae\7\25\2\2\u00ae\u00b0\5\30\r\2\u00af\u00ac\3\2\2\2"+
		"\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\27"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\5 \21\2\u00b5\u00b6\7\5\2\2\u00b6"+
		"\31\3\2\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00b9\7\24\2\2\u00b9\u00c4\3\2"+
		"\2\2\u00ba\u00bb\5.\30\2\u00bb\u00bc\7\24\2\2\u00bc\u00c4\3\2\2\2\u00bd"+
		"\u00c4\5R*\2\u00be\u00c4\5V,\2\u00bf\u00c4\5X-\2\u00c0\u00c1\5\\/\2\u00c1"+
		"\u00c2\7\24\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00ba\3"+
		"\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c4\33\3\2\2\2\u00c5\u00c6\5 \21\2\u00c6\u00c7\5,\27"+
		"\2\u00c7\35\3\2\2\2\u00c8\u00c9\5 \21\2\u00c9\u00ca\7\5\2\2\u00ca\37\3"+
		"\2\2\2\u00cb\u00cd\5*\26\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\5\"\22\2\u00cf!\3\2\2\2\u00d0\u00d8\7\n\2\2"+
		"\u00d1\u00d8\7\13\2\2\u00d2\u00d8\7\r\2\2\u00d3\u00d8\7\f\2\2\u00d4\u00d8"+
		"\5$\23\2\u00d5\u00d8\5&\24\2\u00d6\u00d8\7\4\2\2\u00d7\u00d0\3\2\2\2\u00d7"+
		"\u00d1\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8#\3\2\2\2\u00d9\u00da"+
		"\7\16\2\2\u00da\u00db\7\33\2\2\u00db\u00dc\5\"\22\2\u00dc\u00dd\7\25\2"+
		"\2\u00dd\u00de\7\7\2\2\u00de\u00df\7\34\2\2\u00df%\3\2\2\2\u00e0\u00e1"+
		"\7\17\2\2\u00e1\u00e2\7\33\2\2\u00e2\u00e3\5(\25\2\u00e3\u00e4\7\34\2"+
		"\2\u00e4\'\3\2\2\2\u00e5\u00e6\b\25\1\2\u00e6\u00e7\7\7\2\2\u00e7\u00ed"+
		"\3\2\2\2\u00e8\u00e9\f\3\2\2\u00e9\u00ea\7\25\2\2\u00ea\u00ec\7\7\2\2"+
		"\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee)\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\t\2\2\2\u00f1"+
		"+\3\2\2\2\u00f2\u00f7\7\5\2\2\u00f3\u00f4\7\5\2\2\u00f4\u00f5\7\35\2\2"+
		"\u00f5\u00f7\5\62\32\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7-"+
		"\3\2\2\2\u00f8\u00fa\5\62\32\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2"+
		"\u00fa/\3\2\2\2\u00fb\u00fc\b\31\1\2\u00fc\u00fd\5\62\32\2\u00fd\u0103"+
		"\3\2\2\2\u00fe\u00ff\f\3\2\2\u00ff\u0100\7\25\2\2\u0100\u0102\5\62\32"+
		"\2\u0101\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\61\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\5\64\33\2\u0107"+
		"\63\3\2\2\2\u0108\u010a\5\66\34\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010d\7\22\2\2\u010c\u010e\5\66\34\2\u010d"+
		"\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u0111\5\66"+
		"\34\2\u0110\u0109\3\2\2\2\u0110\u010f\3\2\2\2\u0111\65\3\2\2\2\u0112\u0118"+
		"\58\35\2\u0113\u0114\5D#\2\u0114\u0115\7\35\2\2\u0115\u0116\5\66\34\2"+
		"\u0116\u0118\3\2\2\2\u0117\u0112\3\2\2\2\u0117\u0113\3\2\2\2\u0118\67"+
		"\3\2\2\2\u0119\u011a\b\35\1\2\u011a\u011b\5:\36\2\u011b\u0121\3\2\2\2"+
		"\u011c\u011d\f\3\2\2\u011d\u011e\7\67\2\2\u011e\u0120\5:\36\2\u011f\u011c"+
		"\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"9\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\b\36\1\2\u0125\u0126\5<\37\2"+
		"\u0126\u012c\3\2\2\2\u0127\u0128\f\3\2\2\u0128\u0129\7\66\2\2\u0129\u012b"+
		"\5<\37\2\u012a\u0127\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d;\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\b\37\1\2"+
		"\u0130\u0131\5> \2\u0131\u0137\3\2\2\2\u0132\u0133\f\3\2\2\u0133\u0134"+
		"\7%\2\2\u0134\u0136\5> \2\u0135\u0132\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138=\3\2\2\2\u0139\u0137\3\2\2\2"+
		"\u013a\u013b\b \1\2\u013b\u013c\5@!\2\u013c\u014b\3\2\2\2\u013d\u013e"+
		"\f\6\2\2\u013e\u013f\7\33\2\2\u013f\u014a\5@!\2\u0140\u0141\f\5\2\2\u0141"+
		"\u0142\7\34\2\2\u0142\u014a\5@!\2\u0143\u0144\f\4\2\2\u0144\u0145\7#\2"+
		"\2\u0145\u014a\5@!\2\u0146\u0147\f\3\2\2\u0147\u0148\7$\2\2\u0148\u014a"+
		"\5@!\2\u0149\u013d\3\2\2\2\u0149\u0140\3\2\2\2\u0149\u0143\3\2\2\2\u0149"+
		"\u0146\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c?\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\b!\1\2\u014f\u0150"+
		"\5B\"\2\u0150\u0159\3\2\2\2\u0151\u0152\f\4\2\2\u0152\u0153\7\26\2\2\u0153"+
		"\u0158\5B\"\2\u0154\u0155\f\3\2\2\u0155\u0156\7\27\2\2\u0156\u0158\5B"+
		"\"\2\u0157\u0151\3\2\2\2\u0157\u0154\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015aA\3\2\2\2\u015b\u0159\3\2\2\2"+
		"\u015c\u015d\b\"\1\2\u015d\u015e\5D#\2\u015e\u016d\3\2\2\2\u015f\u0160"+
		"\f\6\2\2\u0160\u0161\7\30\2\2\u0161\u016c\5D#\2\u0162\u0163\f\5\2\2\u0163"+
		"\u0164\7\23\2\2\u0164\u016c\5D#\2\u0165\u0166\f\4\2\2\u0166\u0167\7\31"+
		"\2\2\u0167\u016c\5D#\2\u0168\u0169\f\3\2\2\u0169\u016a\7\32\2\2\u016a"+
		"\u016c\5D#\2\u016b\u015f\3\2\2\2\u016b\u0162\3\2\2\2\u016b\u0165\3\2\2"+
		"\2\u016b\u0168\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016eC\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0176\5L\'\2\u0171\u0176"+
		"\5H%\2\u0172\u0173\5F$\2\u0173\u0174\5D#\2\u0174\u0176\3\2\2\2\u0175\u0170"+
		"\3\2\2\2\u0175\u0171\3\2\2\2\u0175\u0172\3\2\2\2\u0176E\3\2\2\2\u0177"+
		"\u0178\t\3\2\2\u0178G\3\2\2\2\u0179\u017a\5J&\2\u017a\u017b\5\"\22\2\u017b"+
		"\u017d\7\20\2\2\u017c\u017e\5\60\31\2\u017d\u017c\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\7\21\2\2\u0180I\3\2\2\2\u0181"+
		"\u0182\t\4\2\2\u0182K\3\2\2\2\u0183\u0184\b\'\1\2\u0184\u0185\5N(\2\u0185"+
		"\u0196\3\2\2\2\u0186\u0187\f\5\2\2\u0187\u0188\7 \2\2\u0188\u0189\5\60"+
		"\31\2\u0189\u018a\7!\2\2\u018a\u0195\3\2\2\2\u018b\u018c\f\4\2\2\u018c"+
		"\u018e\7\20\2\2\u018d\u018f\5\60\31\2\u018e\u018d\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0195\7\21\2\2\u0191\u0192\f\3\2\2"+
		"\u0192\u0193\7\"\2\2\u0193\u0195\7\5\2\2\u0194\u0186\3\2\2\2\u0194\u018b"+
		"\3\2\2\2\u0194\u0191\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197M\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u01a1\7\60\2\2"+
		"\u019a\u01a1\7\5\2\2\u019b\u01a1\5P)\2\u019c\u019d\7\20\2\2\u019d\u019e"+
		"\5\62\32\2\u019e\u019f\7\21\2\2\u019f\u01a1\3\2\2\2\u01a0\u0199\3\2\2"+
		"\2\u01a0\u019a\3\2\2\2\u01a0\u019b\3\2\2\2\u01a0\u019c\3\2\2\2\u01a1O"+
		"\3\2\2\2\u01a2\u01a3\t\5\2\2\u01a3Q\3\2\2\2\u01a4\u01a6\7\36\2\2\u01a5"+
		"\u01a7\5T+\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2"+
		"\2\u01a8\u01a9\7\37\2\2\u01a9S\3\2\2\2\u01aa\u01ab\b+\1\2\u01ab\u01ac"+
		"\5\32\16\2\u01ac\u01b1\3\2\2\2\u01ad\u01ae\f\3\2\2\u01ae\u01b0\5\32\16"+
		"\2\u01af\u01ad\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2U\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\7(\2\2\u01b5\u01b6"+
		"\7\20\2\2\u01b6\u01b7\5\62\32\2\u01b7\u01b8\7\21\2\2\u01b8\u01b9\5R*\2"+
		"\u01b9\u01c3\3\2\2\2\u01ba\u01bb\7(\2\2\u01bb\u01bc\7\20\2\2\u01bc\u01bd"+
		"\5\62\32\2\u01bd\u01be\7\21\2\2\u01be\u01bf\5R*\2\u01bf\u01c0\7\'\2\2"+
		"\u01c0\u01c1\5R*\2\u01c1\u01c3\3\2\2\2\u01c2\u01b4\3\2\2\2\u01c2\u01ba"+
		"\3\2\2\2\u01c3W\3\2\2\2\u01c4\u01c5\7\62\2\2\u01c5\u01c6\7\20\2\2\u01c6"+
		"\u01c7\5\62\32\2\u01c7\u01c8\7\21\2\2\u01c8\u01c9\5R*\2\u01c9\u01d9\3"+
		"\2\2\2\u01ca\u01cb\7\63\2\2\u01cb\u01cd\7\20\2\2\u01cc\u01ce\5Z.\2\u01cd"+
		"\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\7\24"+
		"\2\2\u01d0\u01d1\5\62\32\2\u01d1\u01d3\7\24\2\2\u01d2\u01d4\5\62\32\2"+
		"\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6"+
		"\7\21\2\2\u01d6\u01d7\5R*\2\u01d7\u01d9\3\2\2\2\u01d8\u01c4\3\2\2\2\u01d8"+
		"\u01ca\3\2\2\2\u01d9Y\3\2\2\2\u01da\u01dd\5\34\17\2\u01db\u01dd\5\62\32"+
		"\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd[\3\2\2\2\u01de\u01e4"+
		"\7\64\2\2\u01df\u01e1\7<\2\2\u01e0\u01e2\5\62\32\2\u01e1\u01e0\3\2\2\2"+
		"\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01de\3\2\2\2\u01e3\u01df"+
		"\3\2\2\2\u01e4]\3\2\2\2/_hnv\u0082\u008b\u0095\u009b\u00a4\u00b1\u00c3"+
		"\u00cc\u00d7\u00ed\u00f6\u00f9\u0103\u0109\u010d\u0110\u0117\u0121\u012c"+
		"\u0137\u0149\u014b\u0157\u0159\u016b\u016d\u0175\u017d\u018e\u0194\u0196"+
		"\u01a0\u01a6\u01b1\u01c2\u01cd\u01d3\u01d8\u01dc\u01e1\u01e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}