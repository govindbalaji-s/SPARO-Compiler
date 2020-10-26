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
		STR_CONST=7, INT=8, FLOAT=9, STRING=10, BOOL=11, ARRAY=12, TENSOR=13, 
		LPAREN=14, RPAREN=15, COLON=16, AT=17, SEMICOLON=18, COMMA=19, PLUS=20, 
		MINUS=21, STAR=22, SLASH=23, PERCENT=24, LT=25, GT=26, EQUALS=27, LBRACE=28, 
		RBRACE=29, LSQUARE=30, RSQUARE=31, DOT=32, LTE=33, GTE=34, DOUBLE_EQUALS=35, 
		CLASS=36, ELSE=37, IF=38, EXTENDS=39, AFTER=40, UNIQUE=41, SHARED=42, 
		WEAK=43, CONSTRUCT=44, DESTRUCT=45, THIS=46, NULLPTR=47, WHILE=48, FOR=49, 
		BREAK=50, NEW=51, AND=52, OR=53, NOT=54, NEW_UNIQUE=55, NEW_SHARED=56, 
		VOID=57, RETURN=58, STRING_CONST=59, STR_NULL=60, STR_ERR_UNT=61, STR_ERR_EOF=62, 
		WS=63, SINGLE_COMMENT=64, UNMATCH_COM=65, EOF_COM=66, MULTI_COMMENT=67, 
		UNKNOWN=68;
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
		RULE_selection_statement = 42, RULE_iteration_statement = 43, RULE_jump_statement = 44;
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
		"jump_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'Int'", "'Float'", "'String'", 
		"'Bool'", "'Array'", "'Tensor'", "'('", "')'", "':'", "'@'", "';'", "','", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'='", "'{'", "'}'", 
		"'['", "']'", "'.'", "'<='", "'>='", "'=='", "'class'", "'else'", "'if'", 
		"'extends'", "'after'", "'unique'", "'shared'", "'weak'", "'construct'", 
		"'destruct'", "'this'", "'nullptr'", "'while'", "'for'", "'break'", "'new'", 
		"'and'", "'or'", "'not'", "'new_unique'", "'new_shared'", "'void'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "FLOAT_CONST", 
		"STR_CONST", "INT", "FLOAT", "STRING", "BOOL", "ARRAY", "TENSOR", "LPAREN", 
		"RPAREN", "COLON", "AT", "SEMICOLON", "COMMA", "PLUS", "MINUS", "STAR", 
		"SLASH", "PERCENT", "LT", "GT", "EQUALS", "LBRACE", "RBRACE", "LSQUARE", 
		"RSQUARE", "DOT", "LTE", "GTE", "DOUBLE_EQUALS", "CLASS", "ELSE", "IF", 
		"EXTENDS", "AFTER", "UNIQUE", "SHARED", "WEAK", "CONSTRUCT", "DESTRUCT", 
		"THIS", "NULLPTR", "WHILE", "FOR", "BREAK", "NEW", "AND", "OR", "NOT", 
		"NEW_UNIQUE", "NEW_SHARED", "VOID", "RETURN", "STRING_CONST", "STR_NULL", 
		"STR_ERR_UNT", "STR_ERR_EOF", "WS", "SINGLE_COMMENT", "UNMATCH_COM", "EOF_COM", 
		"MULTI_COMMENT", "UNKNOWN"
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(90);
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
			setState(94);
			class_definition();
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
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
					setState(96);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(97);
					class_definition();
					}
					} 
				}
				setState(102);
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
			setState(103);
			class_head();
			setState(104);
			match(LBRACE);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << ARRAY) | (1L << TENSOR) | (1L << UNIQUE) | (1L << SHARED) | (1L << WEAK) | (1L << CONSTRUCT) | (1L << DESTRUCT))) != 0)) {
				{
				setState(105);
				member_list(0);
				}
			}

			setState(108);
			match(RBRACE);
			setState(109);
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
			setState(111);
			match(CLASS);
			setState(112);
			match(TYPEID);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(113);
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
			setState(116);
			match(EXTENDS);
			setState(117);
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
			setState(120);
			member();
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
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
					setState(122);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(123);
					member();
					}
					} 
				}
				setState(128);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				member_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				constructor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				destructor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
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
			setState(135);
			match(DESTRUCT);
			setState(136);
			match(LPAREN);
			setState(137);
			match(RPAREN);
			setState(138);
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
			setState(140);
			match(CONSTRUCT);
			setState(141);
			match(LPAREN);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << ARRAY) | (1L << TENSOR) | (1L << UNIQUE) | (1L << SHARED) | (1L << WEAK))) != 0)) {
				{
				setState(142);
				parameter_declaration_list(0);
				}
			}

			setState(145);
			match(RPAREN);
			setState(146);
			match(AFTER);
			setState(147);
			match(LPAREN);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << STRING_CONST))) != 0)) {
				{
				setState(148);
				expression_list(0);
				}
			}

			setState(151);
			match(RPAREN);
			setState(152);
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
			setState(154);
			declaration_specifier();
			setState(155);
			match(OBJECTID);
			setState(156);
			match(LPAREN);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << ARRAY) | (1L << TENSOR) | (1L << UNIQUE) | (1L << SHARED) | (1L << WEAK))) != 0)) {
				{
				setState(157);
				parameter_declaration_list(0);
				}
			}

			setState(160);
			match(RPAREN);
			setState(161);
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
			setState(164);
			parameter_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
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
					setState(166);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(167);
					match(COMMA);
					setState(168);
					parameter_declaration();
					}
					} 
				}
				setState(173);
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
			setState(174);
			declaration_specifier();
			setState(175);
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
			setState(189);
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
				setState(177);
				declaration();
				setState(178);
				match(SEMICOLON);
				}
				break;
			case OBJECTID:
			case BOOL_CONST:
			case INT_CONST:
			case FLOAT_CONST:
			case LPAREN:
			case COLON:
			case SEMICOLON:
			case MINUS:
			case THIS:
			case NULLPTR:
			case NOT:
			case NEW_UNIQUE:
			case NEW_SHARED:
			case STRING_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				expression_statement();
				setState(181);
				match(SEMICOLON);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				compound_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				selection_statement();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				iteration_statement();
				}
				break;
			case BREAK:
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				jump_statement();
				setState(187);
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
			setState(191);
			declaration_specifier();
			setState(192);
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
			setState(194);
			declaration_specifier();
			setState(195);
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
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIQUE) | (1L << SHARED) | (1L << WEAK))) != 0)) {
				{
				setState(197);
				pointer_type();
				}
			}

			setState(200);
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
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(FLOAT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(STRING);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				array_specifier();
				}
				break;
			case TENSOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				tensor_specifier();
				}
				break;
			case TYPEID:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
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
			setState(211);
			match(ARRAY);
			setState(212);
			match(LT);
			setState(213);
			type_specifier();
			setState(214);
			match(COMMA);
			setState(215);
			match(INT_CONST);
			setState(216);
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
			setState(218);
			match(TENSOR);
			setState(219);
			match(LT);
			setState(220);
			integer_constant_list(0);
			setState(221);
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
			setState(224);
			match(INT_CONST);
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
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
					setState(226);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(227);
					match(COMMA);
					setState(228);
					match(INT_CONST);
					}
					} 
				}
				setState(233);
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
			setState(234);
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(OBJECTID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(OBJECTID);
				setState(238);
				match(EQUALS);
				setState(239);
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
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << STRING_CONST))) != 0)) {
				{
				setState(242);
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
			setState(246);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
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
					setState(248);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(249);
					match(COMMA);
					setState(250);
					expression();
					}
					} 
				}
				setState(255);
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
			setState(256);
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << STRING_CONST))) != 0)) {
					{
					setState(258);
					assignment_expression();
					}
				}

				setState(261);
				match(COLON);
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(262);
					assignment_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				logical_OR_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				unary_expression();
				setState(270);
				match(EQUALS);
				setState(271);
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
			setState(276);
			logical_AND_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
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
					setState(278);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(279);
					match(OR);
					setState(280);
					logical_AND_expression(0);
					}
					} 
				}
				setState(285);
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
			setState(287);
			equality_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
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
					setState(289);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(290);
					match(AND);
					setState(291);
					equality_expression(0);
					}
					} 
				}
				setState(296);
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
			setState(298);
			relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
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
					setState(300);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(301);
					match(DOUBLE_EQUALS);
					setState(302);
					relational_expression(0);
					}
					} 
				}
				setState(307);
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
			setState(309);
			additive_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(311);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(312);
						match(LT);
						setState(313);
						additive_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(314);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(315);
						match(GT);
						setState(316);
						additive_expression(0);
						}
						break;
					case 3:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(317);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(318);
						match(LTE);
						setState(319);
						additive_expression(0);
						}
						break;
					case 4:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(320);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(321);
						match(GTE);
						setState(322);
						additive_expression(0);
						}
						break;
					}
					} 
				}
				setState(327);
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
			setState(329);
			multiplicative_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(337);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(331);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(332);
						match(PLUS);
						setState(333);
						multiplicative_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(334);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(335);
						match(MINUS);
						setState(336);
						multiplicative_expression(0);
						}
						break;
					}
					} 
				}
				setState(341);
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
			setState(343);
			unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(345);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(346);
						match(STAR);
						setState(347);
						unary_expression();
						}
						break;
					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(348);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(349);
						match(AT);
						setState(350);
						unary_expression();
						}
						break;
					case 3:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(351);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(352);
						match(SLASH);
						setState(353);
						unary_expression();
						}
						break;
					case 4:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(354);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(355);
						match(PERCENT);
						setState(356);
						unary_expression();
						}
						break;
					}
					} 
				}
				setState(361);
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
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECTID:
			case BOOL_CONST:
			case INT_CONST:
			case FLOAT_CONST:
			case LPAREN:
			case THIS:
			case NULLPTR:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				postfix_expression(0);
				}
				break;
			case MINUS:
			case NOT:
			case NEW_UNIQUE:
			case NEW_SHARED:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				unary_operator();
				setState(364);
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
		public New_expressionContext new_expression() {
			return getRuleContext(New_expressionContext.class,0);
		}
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
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(MINUS);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(NOT);
				}
				break;
			case NEW_UNIQUE:
			case NEW_SHARED:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
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
			setState(373);
			new_keyword();
			setState(374);
			type_specifier();
			setState(375);
			match(LPAREN);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << STRING_CONST))) != 0)) {
				{
				setState(376);
				expression_list(0);
				}
			}

			setState(379);
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
			setState(381);
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
			setState(384);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(386);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(387);
						match(LSQUARE);
						setState(388);
						expression_list(0);
						setState(389);
						match(RSQUARE);
						}
						break;
					case 2:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(391);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(392);
						match(LPAREN);
						setState(394);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << STRING_CONST))) != 0)) {
							{
							setState(393);
							expression_list(0);
							}
						}

						setState(396);
						match(RPAREN);
						}
						break;
					case 3:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(397);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(398);
						match(DOT);
						setState(399);
						match(OBJECTID);
						}
						break;
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(THIS);
				}
				break;
			case OBJECTID:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
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
				setState(407);
				constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				match(LPAREN);
				setState(409);
				expression();
				setState(410);
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
			setState(414);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << NULLPTR) | (1L << STRING_CONST))) != 0)) ) {
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
			setState(416);
			match(LBRACE);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEID) | (1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << ARRAY) | (1L << TENSOR) | (1L << LPAREN) | (1L << COLON) | (1L << SEMICOLON) | (1L << MINUS) | (1L << LBRACE) | (1L << IF) | (1L << UNIQUE) | (1L << SHARED) | (1L << WEAK) | (1L << THIS) | (1L << NULLPTR) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << RETURN) | (1L << STRING_CONST))) != 0)) {
				{
				setState(417);
				statement_list(0);
				}
			}

			setState(420);
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
			setState(423);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Statement_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
					setState(425);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(426);
					statement();
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(IF);
				setState(433);
				match(LPAREN);
				setState(434);
				expression();
				setState(435);
				match(RPAREN);
				setState(436);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(IF);
				setState(439);
				match(LPAREN);
				setState(440);
				expression();
				setState(441);
				match(RPAREN);
				setState(442);
				compound_statement();
				setState(443);
				match(ELSE);
				setState(444);
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
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(WHILE);
				setState(449);
				match(LPAREN);
				setState(450);
				expression();
				setState(451);
				match(RPAREN);
				setState(452);
				compound_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(FOR);
				setState(455);
				match(LPAREN);
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << STRING_CONST))) != 0)) {
					{
					setState(456);
					expression();
					}
				}

				setState(459);
				match(SEMICOLON);
				setState(460);
				expression();
				setState(461);
				match(SEMICOLON);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << STRING_CONST))) != 0)) {
					{
					setState(462);
					expression();
					}
				}

				setState(465);
				match(RPAREN);
				setState(466);
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
		enterRule(_localctx, 88, RULE_jump_statement);
		int _la;
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(BREAK);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(RETURN);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << LPAREN) | (1L << COLON) | (1L << MINUS) | (1L << THIS) | (1L << NULLPTR) | (1L << NOT) | (1L << NEW_UNIQUE) | (1L << NEW_SHARED) | (1L << STRING_CONST))) != 0)) {
					{
					setState(472);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u01e0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\5\2^\n\2\3\3\3\3\3\3\3\3\3\3\7\3e\n\3\f\3\16\3h\13"+
		"\3\3\4\3\4\3\4\5\4m\n\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5u\n\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082\13\7\3\b\3\b\3\b\3\b\5\b"+
		"\u0088\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u0092\n\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0098\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00a1\n\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ac\n\f\f\f\16\f\u00af\13\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00c0\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\5\21\u00c9\n\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d4\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u00e8\n\25\f\25\16\25\u00eb\13\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\5\27\u00f3\n\27\3\30\5\30\u00f6\n\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\7\31\u00fe\n\31\f\31\16\31\u0101\13\31\3\32\3\32\3\33\5\33\u0106"+
		"\n\33\3\33\3\33\5\33\u010a\n\33\3\33\5\33\u010d\n\33\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u0114\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u011c\n\35"+
		"\f\35\16\35\u011f\13\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0127\n\36"+
		"\f\36\16\36\u012a\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0132\n\37"+
		"\f\37\16\37\u0135\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7"+
		" \u0146\n \f \16 \u0149\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0154\n!\f!"+
		"\16!\u0157\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\7\"\u0168\n\"\f\"\16\"\u016b\13\"\3#\3#\3#\3#\5#\u0171\n#\3$\3$\3"+
		"$\5$\u0176\n$\3%\3%\3%\3%\5%\u017c\n%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u018d\n\'\3\'\3\'\3\'\3\'\7\'\u0193\n\'\f"+
		"\'\16\'\u0196\13\'\3(\3(\3(\3(\3(\3(\3(\5(\u019f\n(\3)\3)\3*\3*\5*\u01a5"+
		"\n*\3*\3*\3+\3+\3+\3+\3+\7+\u01ae\n+\f+\16+\u01b1\13+\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01c1\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01cc"+
		"\n-\3-\3-\3-\3-\5-\u01d2\n-\3-\3-\3-\5-\u01d7\n-\3.\3.\3.\5.\u01dc\n."+
		"\5.\u01de\n.\3.\2\17\4\f\26(\608:<>@BLT/\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\5\3\2+-\3\29:\5\2\6"+
		"\b\61\61==\2\u01f2\2]\3\2\2\2\4_\3\2\2\2\6i\3\2\2\2\bq\3\2\2\2\nv\3\2"+
		"\2\2\fy\3\2\2\2\16\u0087\3\2\2\2\20\u0089\3\2\2\2\22\u008e\3\2\2\2\24"+
		"\u009c\3\2\2\2\26\u00a5\3\2\2\2\30\u00b0\3\2\2\2\32\u00bf\3\2\2\2\34\u00c1"+
		"\3\2\2\2\36\u00c4\3\2\2\2 \u00c8\3\2\2\2\"\u00d3\3\2\2\2$\u00d5\3\2\2"+
		"\2&\u00dc\3\2\2\2(\u00e1\3\2\2\2*\u00ec\3\2\2\2,\u00f2\3\2\2\2.\u00f5"+
		"\3\2\2\2\60\u00f7\3\2\2\2\62\u0102\3\2\2\2\64\u010c\3\2\2\2\66\u0113\3"+
		"\2\2\28\u0115\3\2\2\2:\u0120\3\2\2\2<\u012b\3\2\2\2>\u0136\3\2\2\2@\u014a"+
		"\3\2\2\2B\u0158\3\2\2\2D\u0170\3\2\2\2F\u0175\3\2\2\2H\u0177\3\2\2\2J"+
		"\u017f\3\2\2\2L\u0181\3\2\2\2N\u019e\3\2\2\2P\u01a0\3\2\2\2R\u01a2\3\2"+
		"\2\2T\u01a8\3\2\2\2V\u01c0\3\2\2\2X\u01d6\3\2\2\2Z\u01dd\3\2\2\2\\^\5"+
		"\4\3\2]\\\3\2\2\2]^\3\2\2\2^\3\3\2\2\2_`\b\3\1\2`a\5\6\4\2af\3\2\2\2b"+
		"c\f\3\2\2ce\5\6\4\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\5\3\2\2\2"+
		"hf\3\2\2\2ij\5\b\5\2jl\7\36\2\2km\5\f\7\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2"+
		"\2no\7\37\2\2op\7\24\2\2p\7\3\2\2\2qr\7&\2\2rt\7\4\2\2su\5\n\6\2ts\3\2"+
		"\2\2tu\3\2\2\2u\t\3\2\2\2vw\7)\2\2wx\5\"\22\2x\13\3\2\2\2yz\b\7\1\2z{"+
		"\5\16\b\2{\u0080\3\2\2\2|}\f\3\2\2}\177\5\16\b\2~|\3\2\2\2\177\u0082\3"+
		"\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\r\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0088\5\36\20\2\u0084\u0088\5\22\n\2\u0085\u0088\5\20\t"+
		"\2\u0086\u0088\5\24\13\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\17\3\2\2\2\u0089\u008a\7/\2\2"+
		"\u008a\u008b\7\20\2\2\u008b\u008c\7\21\2\2\u008c\u008d\5R*\2\u008d\21"+
		"\3\2\2\2\u008e\u008f\7.\2\2\u008f\u0091\7\20\2\2\u0090\u0092\5\26\f\2"+
		"\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\7\21\2\2\u0094\u0095\7*\2\2\u0095\u0097\7\20\2\2\u0096\u0098\5\60\31"+
		"\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\7\21\2\2\u009a\u009b\5R*\2\u009b\23\3\2\2\2\u009c\u009d\5 \21\2\u009d"+
		"\u009e\7\5\2\2\u009e\u00a0\7\20\2\2\u009f\u00a1\5\26\f\2\u00a0\u009f\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\21\2\2\u00a3"+
		"\u00a4\5R*\2\u00a4\25\3\2\2\2\u00a5\u00a6\b\f\1\2\u00a6\u00a7\5\30\r\2"+
		"\u00a7\u00ad\3\2\2\2\u00a8\u00a9\f\3\2\2\u00a9\u00aa\7\25\2\2\u00aa\u00ac"+
		"\5\30\r\2\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ad\u00ae\3\2\2\2\u00ae\27\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1"+
		"\5 \21\2\u00b1\u00b2\7\5\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\5\34\17\2\u00b4"+
		"\u00b5\7\24\2\2\u00b5\u00c0\3\2\2\2\u00b6\u00b7\5.\30\2\u00b7\u00b8\7"+
		"\24\2\2\u00b8\u00c0\3\2\2\2\u00b9\u00c0\5R*\2\u00ba\u00c0\5V,\2\u00bb"+
		"\u00c0\5X-\2\u00bc\u00bd\5Z.\2\u00bd\u00be\7\24\2\2\u00be\u00c0\3\2\2"+
		"\2\u00bf\u00b3\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00ba"+
		"\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\33\3\2\2\2\u00c1"+
		"\u00c2\5 \21\2\u00c2\u00c3\5,\27\2\u00c3\35\3\2\2\2\u00c4\u00c5\5 \21"+
		"\2\u00c5\u00c6\7\5\2\2\u00c6\37\3\2\2\2\u00c7\u00c9\5*\26\2\u00c8\u00c7"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\5\"\22\2"+
		"\u00cb!\3\2\2\2\u00cc\u00d4\7\n\2\2\u00cd\u00d4\7\13\2\2\u00ce\u00d4\7"+
		"\r\2\2\u00cf\u00d4\7\f\2\2\u00d0\u00d4\5$\23\2\u00d1\u00d4\5&\24\2\u00d2"+
		"\u00d4\7\4\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00ce\3\2"+
		"\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4#\3\2\2\2\u00d5\u00d6\7\16\2\2\u00d6\u00d7\7\33\2"+
		"\2\u00d7\u00d8\5\"\22\2\u00d8\u00d9\7\25\2\2\u00d9\u00da\7\7\2\2\u00da"+
		"\u00db\7\34\2\2\u00db%\3\2\2\2\u00dc\u00dd\7\17\2\2\u00dd\u00de\7\33\2"+
		"\2\u00de\u00df\5(\25\2\u00df\u00e0\7\34\2\2\u00e0\'\3\2\2\2\u00e1\u00e2"+
		"\b\25\1\2\u00e2\u00e3\7\7\2\2\u00e3\u00e9\3\2\2\2\u00e4\u00e5\f\3\2\2"+
		"\u00e5\u00e6\7\25\2\2\u00e6\u00e8\7\7\2\2\u00e7\u00e4\3\2\2\2\u00e8\u00eb"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea)\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00ed\t\2\2\2\u00ed+\3\2\2\2\u00ee\u00f3\7\5\2\2"+
		"\u00ef\u00f0\7\5\2\2\u00f0\u00f1\7\35\2\2\u00f1\u00f3\5\62\32\2\u00f2"+
		"\u00ee\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3-\3\2\2\2\u00f4\u00f6\5\62\32"+
		"\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6/\3\2\2\2\u00f7\u00f8"+
		"\b\31\1\2\u00f8\u00f9\5\62\32\2\u00f9\u00ff\3\2\2\2\u00fa\u00fb\f\3\2"+
		"\2\u00fb\u00fc\7\25\2\2\u00fc\u00fe\5\62\32\2\u00fd\u00fa\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\61\3\2\2"+
		"\2\u0101\u00ff\3\2\2\2\u0102\u0103\5\64\33\2\u0103\63\3\2\2\2\u0104\u0106"+
		"\5\66\34\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u0109\7\22\2\2\u0108\u010a\5\66\34\2\u0109\u0108\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u010d\5\66\34\2\u010c\u0105\3"+
		"\2\2\2\u010c\u010b\3\2\2\2\u010d\65\3\2\2\2\u010e\u0114\58\35\2\u010f"+
		"\u0110\5D#\2\u0110\u0111\7\35\2\2\u0111\u0112\5\66\34\2\u0112\u0114\3"+
		"\2\2\2\u0113\u010e\3\2\2\2\u0113\u010f\3\2\2\2\u0114\67\3\2\2\2\u0115"+
		"\u0116\b\35\1\2\u0116\u0117\5:\36\2\u0117\u011d\3\2\2\2\u0118\u0119\f"+
		"\3\2\2\u0119\u011a\7\67\2\2\u011a\u011c\5:\36\2\u011b\u0118\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e9\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u0120\u0121\b\36\1\2\u0121\u0122\5<\37\2\u0122\u0128"+
		"\3\2\2\2\u0123\u0124\f\3\2\2\u0124\u0125\7\66\2\2\u0125\u0127\5<\37\2"+
		"\u0126\u0123\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129;\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\b\37\1\2\u012c"+
		"\u012d\5> \2\u012d\u0133\3\2\2\2\u012e\u012f\f\3\2\2\u012f\u0130\7%\2"+
		"\2\u0130\u0132\5> \2\u0131\u012e\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134=\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0137\b \1\2\u0137\u0138\5@!\2\u0138\u0147\3\2\2\2\u0139\u013a\f\6\2"+
		"\2\u013a\u013b\7\33\2\2\u013b\u0146\5@!\2\u013c\u013d\f\5\2\2\u013d\u013e"+
		"\7\34\2\2\u013e\u0146\5@!\2\u013f\u0140\f\4\2\2\u0140\u0141\7#\2\2\u0141"+
		"\u0146\5@!\2\u0142\u0143\f\3\2\2\u0143\u0144\7$\2\2\u0144\u0146\5@!\2"+
		"\u0145\u0139\3\2\2\2\u0145\u013c\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0142"+
		"\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"?\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\b!\1\2\u014b\u014c\5B\"\2\u014c"+
		"\u0155\3\2\2\2\u014d\u014e\f\4\2\2\u014e\u014f\7\26\2\2\u014f\u0154\5"+
		"B\"\2\u0150\u0151\f\3\2\2\u0151\u0152\7\27\2\2\u0152\u0154\5B\"\2\u0153"+
		"\u014d\3\2\2\2\u0153\u0150\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156A\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159"+
		"\b\"\1\2\u0159\u015a\5D#\2\u015a\u0169\3\2\2\2\u015b\u015c\f\6\2\2\u015c"+
		"\u015d\7\30\2\2\u015d\u0168\5D#\2\u015e\u015f\f\5\2\2\u015f\u0160\7\23"+
		"\2\2\u0160\u0168\5D#\2\u0161\u0162\f\4\2\2\u0162\u0163\7\31\2\2\u0163"+
		"\u0168\5D#\2\u0164\u0165\f\3\2\2\u0165\u0166\7\32\2\2\u0166\u0168\5D#"+
		"\2\u0167\u015b\3\2\2\2\u0167\u015e\3\2\2\2\u0167\u0161\3\2\2\2\u0167\u0164"+
		"\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"C\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0171\5L\'\2\u016d\u016e\5F$\2\u016e"+
		"\u016f\5D#\2\u016f\u0171\3\2\2\2\u0170\u016c\3\2\2\2\u0170\u016d\3\2\2"+
		"\2\u0171E\3\2\2\2\u0172\u0176\7\27\2\2\u0173\u0176\78\2\2\u0174\u0176"+
		"\5H%\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176"+
		"G\3\2\2\2\u0177\u0178\5J&\2\u0178\u0179\5\"\22\2\u0179\u017b\7\20\2\2"+
		"\u017a\u017c\5\60\31\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u017e\7\21\2\2\u017eI\3\2\2\2\u017f\u0180\t\3\2\2\u0180"+
		"K\3\2\2\2\u0181\u0182\b\'\1\2\u0182\u0183\5N(\2\u0183\u0194\3\2\2\2\u0184"+
		"\u0185\f\5\2\2\u0185\u0186\7 \2\2\u0186\u0187\5\60\31\2\u0187\u0188\7"+
		"!\2\2\u0188\u0193\3\2\2\2\u0189\u018a\f\4\2\2\u018a\u018c\7\20\2\2\u018b"+
		"\u018d\5\60\31\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3"+
		"\2\2\2\u018e\u0193\7\21\2\2\u018f\u0190\f\3\2\2\u0190\u0191\7\"\2\2\u0191"+
		"\u0193\7\5\2\2\u0192\u0184\3\2\2\2\u0192\u0189\3\2\2\2\u0192\u018f\3\2"+
		"\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"M\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u019f\7\60\2\2\u0198\u019f\7\5\2\2"+
		"\u0199\u019f\5P)\2\u019a\u019b\7\20\2\2\u019b\u019c\5\62\32\2\u019c\u019d"+
		"\7\21\2\2\u019d\u019f\3\2\2\2\u019e\u0197\3\2\2\2\u019e\u0198\3\2\2\2"+
		"\u019e\u0199\3\2\2\2\u019e\u019a\3\2\2\2\u019fO\3\2\2\2\u01a0\u01a1\t"+
		"\4\2\2\u01a1Q\3\2\2\2\u01a2\u01a4\7\36\2\2\u01a3\u01a5\5T+\2\u01a4\u01a3"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7\37\2\2"+
		"\u01a7S\3\2\2\2\u01a8\u01a9\b+\1\2\u01a9\u01aa\5\32\16\2\u01aa\u01af\3"+
		"\2\2\2\u01ab\u01ac\f\3\2\2\u01ac\u01ae\5\32\16\2\u01ad\u01ab\3\2\2\2\u01ae"+
		"\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0U\3\2\2\2"+
		"\u01b1\u01af\3\2\2\2\u01b2\u01b3\7(\2\2\u01b3\u01b4\7\20\2\2\u01b4\u01b5"+
		"\5\62\32\2\u01b5\u01b6\7\21\2\2\u01b6\u01b7\5R*\2\u01b7\u01c1\3\2\2\2"+
		"\u01b8\u01b9\7(\2\2\u01b9\u01ba\7\20\2\2\u01ba\u01bb\5\62\32\2\u01bb\u01bc"+
		"\7\21\2\2\u01bc\u01bd\5R*\2\u01bd\u01be\7\'\2\2\u01be\u01bf\5R*\2\u01bf"+
		"\u01c1\3\2\2\2\u01c0\u01b2\3\2\2\2\u01c0\u01b8\3\2\2\2\u01c1W\3\2\2\2"+
		"\u01c2\u01c3\7\62\2\2\u01c3\u01c4\7\20\2\2\u01c4\u01c5\5\62\32\2\u01c5"+
		"\u01c6\7\21\2\2\u01c6\u01c7\5R*\2\u01c7\u01d7\3\2\2\2\u01c8\u01c9\7\63"+
		"\2\2\u01c9\u01cb\7\20\2\2\u01ca\u01cc\5\62\32\2\u01cb\u01ca\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\7\24\2\2\u01ce\u01cf\5"+
		"\62\32\2\u01cf\u01d1\7\24\2\2\u01d0\u01d2\5\62\32\2\u01d1\u01d0\3\2\2"+
		"\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\7\21\2\2\u01d4"+
		"\u01d5\5R*\2\u01d5\u01d7\3\2\2\2\u01d6\u01c2\3\2\2\2\u01d6\u01c8\3\2\2"+
		"\2\u01d7Y\3\2\2\2\u01d8\u01de\7\64\2\2\u01d9\u01db\7<\2\2\u01da\u01dc"+
		"\5\62\32\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2"+
		"\u01dd\u01d8\3\2\2\2\u01dd\u01d9\3\2\2\2\u01de[\3\2\2\2/]flt\u0080\u0087"+
		"\u0091\u0097\u00a0\u00ad\u00bf\u00c8\u00d3\u00e9\u00f2\u00f5\u00ff\u0105"+
		"\u0109\u010c\u0113\u011d\u0128\u0133\u0145\u0147\u0153\u0155\u0167\u0169"+
		"\u0170\u0175\u017b\u018c\u0192\u0194\u019e\u01a4\u01af\u01c0\u01cb\u01d1"+
		"\u01d6\u01db\u01dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}