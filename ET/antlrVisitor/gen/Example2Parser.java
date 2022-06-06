// Generated from Example2.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Example2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IS_EQUAL=1, MUL=2, DIV=3, ADD=4, SUB=5, POW=6, FACT=7, PARANL=8, PARANR=9, 
		DOT=10, ARRAYPL=11, ARRAYPR=12, ADD_INCREMENT=13, SUB_INCREMENT=14, INCREMENT=15, 
		DECREMENT=16, OPEN_CURLY_BRACKET=17, CLOSE_CURLY_BRACKET=18, AND=19, OR=20, 
		GREATER_OR_EQUAL=21, SMALLER_OR_EQUAL=22, GREATHER_THAN=23, SMALLER_THAN=24, 
		EQUAL=25, NOT_EQUAL=26, IntType=27, BoolType=28, StringType=29, WHILE=30, 
		COMMA=31, SEMICOLON=32, DEF=33, IF=34, ELSE=35, FOR=36, RETURN=37, Print=38, 
		INT=39, BOOLEAN=40, ID=41, STRING=42, COMMENT=43, WS=44;
	public static final int
		RULE_start2 = 0, RULE_statement = 1, RULE_function_definition = 2, RULE_function_call = 3, 
		RULE_arguments = 4, RULE_return_statement = 5, RULE_array = 6, RULE_updateArray = 7, 
		RULE_for_statement = 8, RULE_print_func = 9, RULE_variable = 10, RULE_if_statement = 11, 
		RULE_while_statement = 12, RULE_condition_block = 13, RULE_code_block = 14, 
		RULE_string_variable = 15, RULE_bool_variable = 16, RULE_int_variable = 17, 
		RULE_expression = 18, RULE_mathExpression = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start2", "statement", "function_definition", "function_call", "arguments", 
			"return_statement", "array", "updateArray", "for_statement", "print_func", 
			"variable", "if_statement", "while_statement", "condition_block", "code_block", 
			"string_variable", "bool_variable", "int_variable", "expression", "mathExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'/'", "'+'", "'-'", "'^'", "'!'", "'('", "')'", 
			"'.'", "'['", "']'", "'+='", "'-='", "'++'", "'--'", "'{'", "'}'", "'and'", 
			"'or'", "'>='", "'<='", "'>'", "'<'", "'=='", "'!='", "'int'", "'bool'", 
			"'string'", "'while'", "','", "';'", "'def'", "'if'", "'else'", "'for'", 
			"'return'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IS_EQUAL", "MUL", "DIV", "ADD", "SUB", "POW", "FACT", "PARANL", 
			"PARANR", "DOT", "ARRAYPL", "ARRAYPR", "ADD_INCREMENT", "SUB_INCREMENT", 
			"INCREMENT", "DECREMENT", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", 
			"AND", "OR", "GREATER_OR_EQUAL", "SMALLER_OR_EQUAL", "GREATHER_THAN", 
			"SMALLER_THAN", "EQUAL", "NOT_EQUAL", "IntType", "BoolType", "StringType", 
			"WHILE", "COMMA", "SEMICOLON", "DEF", "IF", "ELSE", "FOR", "RETURN", 
			"Print", "INT", "BOOLEAN", "ID", "STRING", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Example2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Example2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Start2Context extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Example2Parser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Start2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStart2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start2Context start2() throws RecognitionException {
		Start2Context _localctx = new Start2Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_start2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARANL) | (1L << IntType) | (1L << BoolType) | (1L << StringType) | (1L << WHILE) | (1L << DEF) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << Print) | (1L << INT) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_funcContext print_func() {
			return getRuleContext(Print_funcContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				print_func();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				function_definition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				function_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				return_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(56);
				for_statement();
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

	public static class Function_definitionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(Example2Parser.DEF, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(DEF);
			setState(60);
			match(ID);
			setState(61);
			match(PARANL);
			setState(62);
			arguments();
			setState(63);
			match(PARANR);
			setState(64);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
			setState(67);
			match(PARANL);
			setState(68);
			arguments();
			setState(69);
			match(PARANR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example2Parser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARANL) | (1L << IntType) | (1L << BoolType) | (1L << StringType) | (1L << INT) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(71);
				expression(0);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(72);
					match(COMMA);
					setState(73);
					expression(0);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Example2Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(RETURN);
			setState(82);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareStringArrayContext extends ArrayContext {
		public TerminalNode StringType() { return getToken(Example2Parser.StringType, 0); }
		public List<TerminalNode> ARRAYPL() { return getTokens(Example2Parser.ARRAYPL); }
		public TerminalNode ARRAYPL(int i) {
			return getToken(Example2Parser.ARRAYPL, i);
		}
		public List<TerminalNode> ARRAYPR() { return getTokens(Example2Parser.ARRAYPR); }
		public TerminalNode ARRAYPR(int i) {
			return getToken(Example2Parser.ARRAYPR, i);
		}
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public List<TerminalNode> STRING() { return getTokens(Example2Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Example2Parser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example2Parser.COMMA, i);
		}
		public DeclareStringArrayContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDeclareStringArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignBooleanArrayContext extends ArrayContext {
		public UpdateArrayContext updateArray() {
			return getRuleContext(UpdateArrayContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(Example2Parser.BOOLEAN, 0); }
		public AssignBooleanArrayContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAssignBooleanArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareBooleanArrayContext extends ArrayContext {
		public TerminalNode BoolType() { return getToken(Example2Parser.BoolType, 0); }
		public List<TerminalNode> ARRAYPL() { return getTokens(Example2Parser.ARRAYPL); }
		public TerminalNode ARRAYPL(int i) {
			return getToken(Example2Parser.ARRAYPL, i);
		}
		public List<TerminalNode> ARRAYPR() { return getTokens(Example2Parser.ARRAYPR); }
		public TerminalNode ARRAYPR(int i) {
			return getToken(Example2Parser.ARRAYPR, i);
		}
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public List<TerminalNode> BOOLEAN() { return getTokens(Example2Parser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(Example2Parser.BOOLEAN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example2Parser.COMMA, i);
		}
		public DeclareBooleanArrayContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDeclareBooleanArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareIntArrayContext extends ArrayContext {
		public TerminalNode IntType() { return getToken(Example2Parser.IntType, 0); }
		public List<TerminalNode> ARRAYPL() { return getTokens(Example2Parser.ARRAYPL); }
		public TerminalNode ARRAYPL(int i) {
			return getToken(Example2Parser.ARRAYPL, i);
		}
		public List<TerminalNode> ARRAYPR() { return getTokens(Example2Parser.ARRAYPR); }
		public TerminalNode ARRAYPR(int i) {
			return getToken(Example2Parser.ARRAYPR, i);
		}
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public List<TerminalNode> INT() { return getTokens(Example2Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(Example2Parser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example2Parser.COMMA, i);
		}
		public DeclareIntArrayContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDeclareIntArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignIntArrayContext extends ArrayContext {
		public UpdateArrayContext updateArray() {
			return getRuleContext(UpdateArrayContext.class,0);
		}
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public AssignIntArrayContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAssignIntArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStringArrayContext extends ArrayContext {
		public UpdateArrayContext updateArray() {
			return getRuleContext(UpdateArrayContext.class,0);
		}
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public AssignStringArrayContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAssignStringArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DeclareIntArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(IntType);
				setState(85);
				match(ARRAYPL);
				setState(86);
				match(ARRAYPR);
				setState(87);
				match(ID);
				setState(88);
				match(IS_EQUAL);
				setState(89);
				match(ARRAYPL);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(90);
					match(INT);
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(91);
						match(COMMA);
						setState(92);
						match(INT);
						}
						}
						setState(97);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(100);
				match(ARRAYPR);
				}
				break;
			case 2:
				_localctx = new AssignIntArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				updateArray();
				setState(102);
				mathExpression(0);
				}
				break;
			case 3:
				_localctx = new DeclareStringArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(StringType);
				setState(105);
				match(ARRAYPL);
				setState(106);
				match(ARRAYPR);
				setState(107);
				match(ID);
				setState(108);
				match(IS_EQUAL);
				setState(109);
				match(ARRAYPL);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(110);
					match(STRING);
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(111);
						match(COMMA);
						setState(112);
						match(STRING);
						}
						}
						setState(117);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(120);
				match(ARRAYPR);
				}
				break;
			case 4:
				_localctx = new AssignStringArrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				updateArray();
				setState(122);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new DeclareBooleanArrayContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				match(BoolType);
				setState(125);
				match(ARRAYPL);
				setState(126);
				match(ARRAYPR);
				setState(127);
				match(ID);
				setState(128);
				match(IS_EQUAL);
				setState(129);
				match(ARRAYPL);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BOOLEAN) {
					{
					setState(130);
					match(BOOLEAN);
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(131);
						match(COMMA);
						setState(132);
						match(BOOLEAN);
						}
						}
						setState(137);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(140);
				match(ARRAYPR);
				}
				break;
			case 6:
				_localctx = new AssignBooleanArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				updateArray();
				setState(142);
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

	public static class UpdateArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode ARRAYPL() { return getToken(Example2Parser.ARRAYPL, 0); }
		public TerminalNode INT() { return getToken(Example2Parser.INT, 0); }
		public TerminalNode ARRAYPR() { return getToken(Example2Parser.ARRAYPR, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public UpdateArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitUpdateArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateArrayContext updateArray() throws RecognitionException {
		UpdateArrayContext _localctx = new UpdateArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_updateArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ID);
			setState(147);
			match(ARRAYPL);
			setState(148);
			match(INT);
			setState(149);
			match(ARRAYPR);
			setState(150);
			match(IS_EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Example2Parser.FOR, 0); }
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public List<Int_variableContext> int_variable() {
			return getRuleContexts(Int_variableContext.class);
		}
		public Int_variableContext int_variable(int i) {
			return getRuleContext(Int_variableContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Example2Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Example2Parser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(FOR);
			setState(153);
			match(PARANL);
			setState(154);
			int_variable();
			setState(155);
			match(SEMICOLON);
			setState(156);
			expression(0);
			setState(157);
			match(SEMICOLON);
			setState(158);
			int_variable();
			setState(159);
			match(PARANR);
			setState(160);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_funcContext extends ParserRuleContext {
		public Print_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_func; }
	 
		public Print_funcContext() { }
		public void copyFrom(Print_funcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintVarContext extends Print_funcContext {
		public Token op;
		public TerminalNode Print() { return getToken(Example2Parser.Print, 0); }
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public TerminalNode INT() { return getToken(Example2Parser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(Example2Parser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public PrintVarContext(Print_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPrintVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprWithStringContext extends Print_funcContext {
		public TerminalNode Print() { return getToken(Example2Parser.Print, 0); }
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(Example2Parser.COMMA, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public PrintExprWithStringContext(Print_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPrintExprWithString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends Print_funcContext {
		public TerminalNode Print() { return getToken(Example2Parser.Print, 0); }
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public PrintExprContext(Print_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_funcContext print_func() throws RecognitionException {
		Print_funcContext _localctx = new Print_funcContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print_func);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new PrintVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(Print);
				setState(163);
				match(PARANL);
				setState(164);
				((PrintVarContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0)) ) {
					((PrintVarContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				match(PARANR);
				}
				break;
			case 2:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(Print);
				setState(167);
				match(PARANL);
				setState(168);
				mathExpression(0);
				setState(169);
				match(PARANR);
				}
				break;
			case 3:
				_localctx = new PrintExprWithStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(Print);
				setState(172);
				match(PARANL);
				setState(173);
				match(STRING);
				setState(174);
				match(COMMA);
				setState(175);
				mathExpression(0);
				setState(176);
				match(PARANR);
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

	public static class VariableContext extends ParserRuleContext {
		public Int_variableContext int_variable() {
			return getRuleContext(Int_variableContext.class,0);
		}
		public Bool_variableContext bool_variable() {
			return getRuleContext(Bool_variableContext.class,0);
		}
		public String_variableContext string_variable() {
			return getRuleContext(String_variableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				int_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				bool_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				string_variable();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Example2Parser.IF, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(Example2Parser.ELSE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(IF);
			setState(186);
			condition_block();
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(187);
				match(ELSE);
				setState(188);
				code_block();
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Example2Parser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(WHILE);
			setState(192);
			condition_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(PARANL);
			setState(195);
			expression(0);
			setState(196);
			match(PARANR);
			setState(197);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(Example2Parser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(Example2Parser.CLOSE_CURLY_BRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_code_block);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(OPEN_CURLY_BRACKET);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARANL) | (1L << IntType) | (1L << BoolType) | (1L << StringType) | (1L << WHILE) | (1L << DEF) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << Print) | (1L << INT) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(200);
					statement();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(CLOSE_CURLY_BRACKET);
				}
				break;
			case PARANL:
			case IntType:
			case BoolType:
			case StringType:
			case WHILE:
			case DEF:
			case IF:
			case FOR:
			case RETURN:
			case Print:
			case INT:
			case BOOLEAN:
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				statement();
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

	public static class String_variableContext extends ParserRuleContext {
		public String_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_variable; }
	 
		public String_variableContext() { }
		public void copyFrom(String_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringAssignValueContext extends String_variableContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public StringAssignValueContext(String_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStringAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAssignContext extends String_variableContext {
		public TerminalNode StringType() { return getToken(Example2Parser.StringType, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public StringAssignContext(String_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStringAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_variableContext string_variable() throws RecognitionException {
		String_variableContext _localctx = new String_variableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_string_variable);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringType:
				_localctx = new StringAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(StringType);
				setState(211);
				match(ID);
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(212);
					match(IS_EQUAL);
					setState(213);
					match(STRING);
					}
					break;
				}
				}
				break;
			case ID:
				_localctx = new StringAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(ID);
				setState(217);
				match(IS_EQUAL);
				setState(218);
				match(STRING);
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

	public static class Bool_variableContext extends ParserRuleContext {
		public Bool_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_variable; }
	 
		public Bool_variableContext() { }
		public void copyFrom(Bool_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolAssignContext extends Bool_variableContext {
		public TerminalNode BoolType() { return getToken(Example2Parser.BoolType, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(Example2Parser.BOOLEAN, 0); }
		public BoolAssignContext(Bool_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitBoolAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAssignValueContext extends Bool_variableContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(Example2Parser.BOOLEAN, 0); }
		public BoolAssignValueContext(Bool_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitBoolAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_variableContext bool_variable() throws RecognitionException {
		Bool_variableContext _localctx = new Bool_variableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool_variable);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolType:
				_localctx = new BoolAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(BoolType);
				setState(222);
				match(ID);
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(223);
					match(IS_EQUAL);
					setState(224);
					match(BOOLEAN);
					}
					break;
				}
				}
				break;
			case ID:
				_localctx = new BoolAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(ID);
				setState(228);
				match(IS_EQUAL);
				setState(229);
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

	public static class Int_variableContext extends ParserRuleContext {
		public Int_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_variable; }
	 
		public Int_variableContext() { }
		public void copyFrom(Int_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntAssignContext extends Int_variableContext {
		public TerminalNode IntType() { return getToken(Example2Parser.IntType, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public IntAssignContext(Int_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIntAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementAndDecrementIntContext extends Int_variableContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode ADD_INCREMENT() { return getToken(Example2Parser.ADD_INCREMENT, 0); }
		public TerminalNode SUB_INCREMENT() { return getToken(Example2Parser.SUB_INCREMENT, 0); }
		public TerminalNode INCREMENT() { return getToken(Example2Parser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(Example2Parser.DECREMENT, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public IncrementAndDecrementIntContext(Int_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIncrementAndDecrementInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntAssignValueContext extends Int_variableContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public IntAssignValueContext(Int_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIntAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_variableContext int_variable() throws RecognitionException {
		Int_variableContext _localctx = new Int_variableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_int_variable);
		int _la;
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new IntAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(IntType);
				setState(233);
				match(ID);
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(234);
					match(IS_EQUAL);
					setState(235);
					mathExpression(0);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new IntAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(ID);
				setState(239);
				match(IS_EQUAL);
				setState(240);
				mathExpression(0);
				}
				break;
			case 3:
				_localctx = new IncrementAndDecrementIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(ID);
				setState(242);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_INCREMENT) | (1L << SUB_INCREMENT) | (1L << INCREMENT) | (1L << DECREMENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(243);
					mathExpression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER_OR_EQUAL() { return getToken(Example2Parser.GREATER_OR_EQUAL, 0); }
		public TerminalNode SMALLER_OR_EQUAL() { return getToken(Example2Parser.SMALLER_OR_EQUAL, 0); }
		public TerminalNode GREATHER_THAN() { return getToken(Example2Parser.GREATHER_THAN, 0); }
		public TerminalNode SMALLER_THAN() { return getToken(Example2Parser.SMALLER_THAN, 0); }
		public TerminalNode EQUAL() { return getToken(Example2Parser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(Example2Parser.NOT_EQUAL, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(Example2Parser.AND, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueBooleanContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(Example2Parser.BOOLEAN, 0); }
		public ValueBooleanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitValueBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(Example2Parser.OR, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExpContext extends ExpressionContext {
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public MathExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitMathExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public ValueStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitValueString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(249);
				function_call();
				}
				break;
			case 2:
				{
				_localctx = new MathExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				mathExpression(0);
				}
				break;
			case 3:
				{
				_localctx = new ValueBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				_localctx = new ValueStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				variable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(265);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(257);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_OR_EQUAL) | (1L << SMALLER_OR_EQUAL) | (1L << GREATHER_THAN) | (1L << SMALLER_THAN) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(258);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(259);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(260);
						match(AND);
						setState(261);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(263);
						match(OR);
						setState(264);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(269);
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

	public static class MathExpressionContext extends ParserRuleContext {
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
	 
		public MathExpressionContext() { }
		public void copyFrom(MathExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(Example2Parser.DIV, 0); }
		public DivContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Example2Parser.ADD, 0); }
		public AddContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(Example2Parser.SUB, 0); }
		public SubContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends MathExpressionContext {
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public ParensContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueVariableContext extends MathExpressionContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public ValueVariableContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitValueVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(Example2Parser.MUL, 0); }
		public MulContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueNumberContext extends MathExpressionContext {
		public TerminalNode INT() { return getToken(Example2Parser.INT, 0); }
		public ValueNumberContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitValueNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(Example2Parser.POW, 0); }
		public PowContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactContext extends MathExpressionContext {
		public Token op;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode FACT() { return getToken(Example2Parser.FACT, 0); }
		public FactContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		return mathExpression(0);
	}

	private MathExpressionContext mathExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, _parentState);
		MathExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_mathExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARANL:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(271);
				match(PARANL);
				setState(272);
				mathExpression(0);
				setState(273);
				match(PARANR);
				}
				break;
			case INT:
				{
				_localctx = new ValueNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new ValueVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(279);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(280);
						((MulContext)_localctx).op = match(MUL);
						setState(281);
						mathExpression(10);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(282);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(283);
						((DivContext)_localctx).op = match(DIV);
						setState(284);
						mathExpression(9);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(285);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(286);
						((AddContext)_localctx).op = match(ADD);
						setState(287);
						mathExpression(8);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(288);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(289);
						((SubContext)_localctx).op = match(SUB);
						setState(290);
						mathExpression(7);
						}
						break;
					case 5:
						{
						_localctx = new PowContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(291);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(292);
						((PowContext)_localctx).op = match(POW);
						setState(293);
						mathExpression(6);
						}
						break;
					case 6:
						{
						_localctx = new FactContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(294);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(295);
						((FactContext)_localctx).op = match(FACT);
						}
						break;
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 19:
			return mathExpression_sempred((MathExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mathExpression_sempred(MathExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u012e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001:\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"K\b\u0004\n\u0004\f\u0004N\t\u0004\u0003\u0004P\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006^\b"+
		"\u0006\n\u0006\f\u0006a\t\u0006\u0003\u0006c\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006r\b\u0006\n\u0006\f\u0006u\t\u0006\u0003\u0006w\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0086\b\u0006\n\u0006\f\u0006\u0089\t\u0006\u0003\u0006\u008b"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0091"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00b3\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u00b8\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00be\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00ca\b\u000e\n\u000e\f\u000e\u00cd\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00d1\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00d7\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00dc\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00e2\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00e7\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00ed\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00f5\b\u0011\u0003\u0011\u00f7\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00ff\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u010a"+
		"\b\u0012\n\u0012\f\u0012\u010d\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0116\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u0129\b\u0013\n\u0013\f\u0013\u012c\t\u0013\u0001\u0013\u0000\u0002$"+
		"&\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&\u0000\u0003\u0001\u0000\'*\u0001\u0000\r\u0010"+
		"\u0001\u0000\u0015\u001a\u014d\u0000+\u0001\u0000\u0000\u0000\u00029\u0001"+
		"\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000"+
		"\u0000\bO\u0001\u0000\u0000\u0000\nQ\u0001\u0000\u0000\u0000\f\u0090\u0001"+
		"\u0000\u0000\u0000\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u0098\u0001"+
		"\u0000\u0000\u0000\u0012\u00b2\u0001\u0000\u0000\u0000\u0014\u00b7\u0001"+
		"\u0000\u0000\u0000\u0016\u00b9\u0001\u0000\u0000\u0000\u0018\u00bf\u0001"+
		"\u0000\u0000\u0000\u001a\u00c2\u0001\u0000\u0000\u0000\u001c\u00d0\u0001"+
		"\u0000\u0000\u0000\u001e\u00db\u0001\u0000\u0000\u0000 \u00e6\u0001\u0000"+
		"\u0000\u0000\"\u00f6\u0001\u0000\u0000\u0000$\u00fe\u0001\u0000\u0000"+
		"\u0000&\u0115\u0001\u0000\u0000\u0000(*\u0003\u0002\u0001\u0000)(\u0001"+
		"\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000./\u0005\u0000\u0000\u0001/\u0001\u0001\u0000\u0000\u00000:\u0003"+
		"$\u0012\u00001:\u0003\u0012\t\u00002:\u0003\u0018\f\u00003:\u0003\u0016"+
		"\u000b\u00004:\u0003\u0004\u0002\u00005:\u0003\u0006\u0003\u00006:\u0003"+
		"\n\u0005\u00007:\u0003\f\u0006\u00008:\u0003\u0010\b\u000090\u0001\u0000"+
		"\u0000\u000091\u0001\u0000\u0000\u000092\u0001\u0000\u0000\u000093\u0001"+
		"\u0000\u0000\u000094\u0001\u0000\u0000\u000095\u0001\u0000\u0000\u0000"+
		"96\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u000098\u0001\u0000\u0000"+
		"\u0000:\u0003\u0001\u0000\u0000\u0000;<\u0005!\u0000\u0000<=\u0005)\u0000"+
		"\u0000=>\u0005\b\u0000\u0000>?\u0003\b\u0004\u0000?@\u0005\t\u0000\u0000"+
		"@A\u0003\u001c\u000e\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0005)\u0000"+
		"\u0000CD\u0005\b\u0000\u0000DE\u0003\b\u0004\u0000EF\u0005\t\u0000\u0000"+
		"F\u0007\u0001\u0000\u0000\u0000GL\u0003$\u0012\u0000HI\u0005\u001f\u0000"+
		"\u0000IK\u0003$\u0012\u0000JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000OG\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000P\t\u0001\u0000\u0000\u0000QR\u0005%\u0000\u0000RS\u0003"+
		"$\u0012\u0000S\u000b\u0001\u0000\u0000\u0000TU\u0005\u001b\u0000\u0000"+
		"UV\u0005\u000b\u0000\u0000VW\u0005\f\u0000\u0000WX\u0005)\u0000\u0000"+
		"XY\u0005\u0001\u0000\u0000Yb\u0005\u000b\u0000\u0000Z_\u0005\'\u0000\u0000"+
		"[\\\u0005\u001f\u0000\u0000\\^\u0005\'\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bZ\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"d\u0091\u0005\f\u0000\u0000ef\u0003\u000e\u0007\u0000fg\u0003&\u0013\u0000"+
		"g\u0091\u0001\u0000\u0000\u0000hi\u0005\u001d\u0000\u0000ij\u0005\u000b"+
		"\u0000\u0000jk\u0005\f\u0000\u0000kl\u0005)\u0000\u0000lm\u0005\u0001"+
		"\u0000\u0000mv\u0005\u000b\u0000\u0000ns\u0005*\u0000\u0000op\u0005\u001f"+
		"\u0000\u0000pr\u0005*\u0000\u0000qo\u0001\u0000\u0000\u0000ru\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tw\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vn\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0091\u0005\f\u0000"+
		"\u0000yz\u0003\u000e\u0007\u0000z{\u0005*\u0000\u0000{\u0091\u0001\u0000"+
		"\u0000\u0000|}\u0005\u001c\u0000\u0000}~\u0005\u000b\u0000\u0000~\u007f"+
		"\u0005\f\u0000\u0000\u007f\u0080\u0005)\u0000\u0000\u0080\u0081\u0005"+
		"\u0001\u0000\u0000\u0081\u008a\u0005\u000b\u0000\u0000\u0082\u0087\u0005"+
		"(\u0000\u0000\u0083\u0084\u0005\u001f\u0000\u0000\u0084\u0086\u0005(\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0091\u0005\f\u0000\u0000"+
		"\u008d\u008e\u0003\u000e\u0007\u0000\u008e\u008f\u0005(\u0000\u0000\u008f"+
		"\u0091\u0001\u0000\u0000\u0000\u0090T\u0001\u0000\u0000\u0000\u0090e\u0001"+
		"\u0000\u0000\u0000\u0090h\u0001\u0000\u0000\u0000\u0090y\u0001\u0000\u0000"+
		"\u0000\u0090|\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000"+
		"\u0091\r\u0001\u0000\u0000\u0000\u0092\u0093\u0005)\u0000\u0000\u0093"+
		"\u0094\u0005\u000b\u0000\u0000\u0094\u0095\u0005\'\u0000\u0000\u0095\u0096"+
		"\u0005\f\u0000\u0000\u0096\u0097\u0005\u0001\u0000\u0000\u0097\u000f\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005$\u0000\u0000\u0099\u009a\u0005\b"+
		"\u0000\u0000\u009a\u009b\u0003\"\u0011\u0000\u009b\u009c\u0005 \u0000"+
		"\u0000\u009c\u009d\u0003$\u0012\u0000\u009d\u009e\u0005 \u0000\u0000\u009e"+
		"\u009f\u0003\"\u0011\u0000\u009f\u00a0\u0005\t\u0000\u0000\u00a0\u00a1"+
		"\u0003\u001c\u000e\u0000\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005&\u0000\u0000\u00a3\u00a4\u0005\b\u0000\u0000\u00a4\u00a5\u0007"+
		"\u0000\u0000\u0000\u00a5\u00b3\u0005\t\u0000\u0000\u00a6\u00a7\u0005&"+
		"\u0000\u0000\u00a7\u00a8\u0005\b\u0000\u0000\u00a8\u00a9\u0003&\u0013"+
		"\u0000\u00a9\u00aa\u0005\t\u0000\u0000\u00aa\u00b3\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0005&\u0000\u0000\u00ac\u00ad\u0005\b\u0000\u0000\u00ad"+
		"\u00ae\u0005*\u0000\u0000\u00ae\u00af\u0005\u001f\u0000\u0000\u00af\u00b0"+
		"\u0003&\u0013\u0000\u00b0\u00b1\u0005\t\u0000\u0000\u00b1\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b2\u00a2\u0001\u0000\u0000\u0000\u00b2\u00a6\u0001"+
		"\u0000\u0000\u0000\u00b2\u00ab\u0001\u0000\u0000\u0000\u00b3\u0013\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b8\u0003\"\u0011\u0000\u00b5\u00b8\u0003 "+
		"\u0010\u0000\u00b6\u00b8\u0003\u001e\u000f\u0000\u00b7\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u0015\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\"\u0000"+
		"\u0000\u00ba\u00bd\u0003\u001a\r\u0000\u00bb\u00bc\u0005#\u0000\u0000"+
		"\u00bc\u00be\u0003\u001c\u000e\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u0017\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005\u001e\u0000\u0000\u00c0\u00c1\u0003\u001a\r\u0000\u00c1"+
		"\u0019\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\b\u0000\u0000\u00c3\u00c4"+
		"\u0003$\u0012\u0000\u00c4\u00c5\u0005\t\u0000\u0000\u00c5\u00c6\u0003"+
		"\u001c\u000e\u0000\u00c6\u001b\u0001\u0000\u0000\u0000\u00c7\u00cb\u0005"+
		"\u0011\u0000\u0000\u00c8\u00ca\u0003\u0002\u0001\u0000\u00c9\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0005"+
		"\u0012\u0000\u0000\u00cf\u00d1\u0003\u0002\u0001\u0000\u00d0\u00c7\u0001"+
		"\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u001d\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\u001d\u0000\u0000\u00d3\u00d6\u0005"+
		")\u0000\u0000\u00d4\u00d5\u0005\u0001\u0000\u0000\u00d5\u00d7\u0005*\u0000"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00dc\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005)\u0000\u0000"+
		"\u00d9\u00da\u0005\u0001\u0000\u0000\u00da\u00dc\u0005*\u0000\u0000\u00db"+
		"\u00d2\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00dc"+
		"\u001f\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u001c\u0000\u0000\u00de"+
		"\u00e1\u0005)\u0000\u0000\u00df\u00e0\u0005\u0001\u0000\u0000\u00e0\u00e2"+
		"\u0005(\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e7\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005"+
		")\u0000\u0000\u00e4\u00e5\u0005\u0001\u0000\u0000\u00e5\u00e7\u0005(\u0000"+
		"\u0000\u00e6\u00dd\u0001\u0000\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e7!\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u001b\u0000\u0000"+
		"\u00e9\u00ec\u0005)\u0000\u0000\u00ea\u00eb\u0005\u0001\u0000\u0000\u00eb"+
		"\u00ed\u0003&\u0013\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ed\u00f7\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0005)\u0000\u0000\u00ef\u00f0\u0005\u0001\u0000\u0000\u00f0\u00f7\u0003"+
		"&\u0013\u0000\u00f1\u00f2\u0005)\u0000\u0000\u00f2\u00f4\u0007\u0001\u0000"+
		"\u0000\u00f3\u00f5\u0003&\u0013\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f6\u00e8\u0001\u0000\u0000\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f1\u0001\u0000\u0000\u0000\u00f7#\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0006\u0012\uffff\uffff\u0000\u00f9\u00ff\u0003\u0006\u0003\u0000"+
		"\u00fa\u00ff\u0003&\u0013\u0000\u00fb\u00ff\u0005(\u0000\u0000\u00fc\u00ff"+
		"\u0005*\u0000\u0000\u00fd\u00ff\u0003\u0014\n\u0000\u00fe\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00fe\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u010b\u0001\u0000\u0000\u0000\u0100\u0101\n\u0004"+
		"\u0000\u0000\u0101\u0102\u0007\u0002\u0000\u0000\u0102\u010a\u0003$\u0012"+
		"\u0005\u0103\u0104\n\u0003\u0000\u0000\u0104\u0105\u0005\u0013\u0000\u0000"+
		"\u0105\u010a\u0003$\u0012\u0004\u0106\u0107\n\u0002\u0000\u0000\u0107"+
		"\u0108\u0005\u0014\u0000\u0000\u0108\u010a\u0003$\u0012\u0003\u0109\u0100"+
		"\u0001\u0000\u0000\u0000\u0109\u0103\u0001\u0000\u0000\u0000\u0109\u0106"+
		"\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c%\u0001"+
		"\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0006"+
		"\u0013\uffff\uffff\u0000\u010f\u0110\u0005\b\u0000\u0000\u0110\u0111\u0003"+
		"&\u0013\u0000\u0111\u0112\u0005\t\u0000\u0000\u0112\u0116\u0001\u0000"+
		"\u0000\u0000\u0113\u0116\u0005\'\u0000\u0000\u0114\u0116\u0005)\u0000"+
		"\u0000\u0115\u010e\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000"+
		"\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u012a\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\n\t\u0000\u0000\u0118\u0119\u0005\u0002\u0000\u0000"+
		"\u0119\u0129\u0003&\u0013\n\u011a\u011b\n\b\u0000\u0000\u011b\u011c\u0005"+
		"\u0003\u0000\u0000\u011c\u0129\u0003&\u0013\t\u011d\u011e\n\u0007\u0000"+
		"\u0000\u011e\u011f\u0005\u0004\u0000\u0000\u011f\u0129\u0003&\u0013\b"+
		"\u0120\u0121\n\u0006\u0000\u0000\u0121\u0122\u0005\u0005\u0000\u0000\u0122"+
		"\u0129\u0003&\u0013\u0007\u0123\u0124\n\u0005\u0000\u0000\u0124\u0125"+
		"\u0005\u0006\u0000\u0000\u0125\u0129\u0003&\u0013\u0006\u0126\u0127\n"+
		"\u0004\u0000\u0000\u0127\u0129\u0005\u0007\u0000\u0000\u0128\u0117\u0001"+
		"\u0000\u0000\u0000\u0128\u011a\u0001\u0000\u0000\u0000\u0128\u011d\u0001"+
		"\u0000\u0000\u0000\u0128\u0120\u0001\u0000\u0000\u0000\u0128\u0123\u0001"+
		"\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012c\u0001"+
		"\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001"+
		"\u0000\u0000\u0000\u012b\'\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u001d+9LO_bsv\u0087\u008a\u0090\u00b2\u00b7\u00bd\u00cb\u00d0"+
		"\u00d6\u00db\u00e1\u00e6\u00ec\u00f4\u00f6\u00fe\u0109\u010b\u0115\u0128"+
		"\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}