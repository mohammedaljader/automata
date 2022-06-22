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
		IS_EQUAL=1, MUL=2, DIV=3, ADD=4, SUB=5, POW=6, FACT=7, DOT=8, COMMA=9, 
		SEMICOLON=10, COLON=11, OPAR=12, CPAR=13, FOR=14, OPEN_CURLY_BRACKET=15, 
		CLOSE_CURLY_BRACKET=16, OPEN_SQUARE_BRACKET=17, CLOSE_SQUARE_BRACKET=18, 
		QUESTION_MARK=19, AND=20, OR=21, NOT=22, INTEGER=23, CHAR=24, RECORD=25, 
		GREATER_OR_EQUAL=26, SMALLER_OR_EQUAL=27, GREATHER_THAN=28, SMALLER_THAN=29, 
		EQUAL=30, NOT_EQUAL=31, PRINT=32, INT=33, STRING=34, BOOL=35, ID=36, COMMENT=37, 
		WS=38, EQUAL_INCREMENT=39, EQUAL_DECREMENT=40, INCREMENT=41, DECREMENT=42;
	public static final int
		RULE_start2 = 0, RULE_statement = 1, RULE_print_statement = 2, RULE_for_statement = 3, 
		RULE_for_block = 4, RULE_code_block = 5, RULE_expression = 6, RULE_assign_variables = 7, 
		RULE_integer = 8, RULE_char = 9, RULE_recordsTypes = 10, RULE_records = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start2", "statement", "print_statement", "for_statement", "for_block", 
			"code_block", "expression", "assign_variables", "integer", "char", "recordsTypes", 
			"records"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'/'", "'+'", "'-'", "'^'", "'!'", "'.'", "','", 
			"';'", "':'", "'('", "')'", "'for'", "'{'", "'}'", "'['", "']'", "'?'", 
			"'and'", "'or'", "'not'", "'integer'", "'char'", "'record'", "'>='", 
			"'<='", "'>'", "'<'", "'=='", "'!='", "'print'", null, null, null, null, 
			null, null, "'+='", "'-='", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IS_EQUAL", "MUL", "DIV", "ADD", "SUB", "POW", "FACT", "DOT", "COMMA", 
			"SEMICOLON", "COLON", "OPAR", "CPAR", "FOR", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", 
			"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "QUESTION_MARK", "AND", 
			"OR", "NOT", "INTEGER", "CHAR", "RECORD", "GREATER_OR_EQUAL", "SMALLER_OR_EQUAL", 
			"GREATHER_THAN", "SMALLER_THAN", "EQUAL", "NOT_EQUAL", "PRINT", "INT", 
			"STRING", "BOOL", "ID", "COMMENT", "WS", "EQUAL_INCREMENT", "EQUAL_DECREMENT", 
			"INCREMENT", "DECREMENT"
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << FOR) | (1L << NOT) | (1L << INTEGER) | (1L << CHAR) | (1L << RECORD) | (1L << PRINT) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(24);
				statement();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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
		public Assign_variablesContext assign_variables() {
			return getRuleContext(Assign_variablesContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public RecordsContext records() {
			return getRuleContext(RecordsContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public CharContext char_() {
			return getRuleContext(CharContext.class,0);
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				assign_variables();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				for_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				print_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				records();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				integer();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(38);
				char_();
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

	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(Example2Parser.PRINT, 0); }
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
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(PRINT);
			setState(42);
			expression(0);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(43);
				match(COMMA);
				setState(44);
				expression(0);
				}
				}
				setState(49);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Example2Parser.FOR, 0); }
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(FOR);
			setState(51);
			for_block();
			setState(52);
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

	public static class For_blockContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public List<Assign_variablesContext> assign_variables() {
			return getRuleContexts(Assign_variablesContext.class);
		}
		public Assign_variablesContext assign_variables(int i) {
			return getRuleContext(Assign_variablesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Example2Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Example2Parser.SEMICOLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFor_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(OPAR);
			setState(55);
			assign_variables();
			setState(56);
			match(SEMICOLON);
			setState(57);
			expression(0);
			setState(58);
			match(SEMICOLON);
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(59);
				expression(0);
				}
				break;
			case 2:
				{
				setState(60);
				assign_variables();
				}
				break;
			}
			setState(63);
			match(CPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 10, RULE_code_block);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(OPEN_CURLY_BRACKET);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << FOR) | (1L << NOT) | (1L << INTEGER) | (1L << CHAR) | (1L << RECORD) | (1L << PRINT) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(66);
					statement();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(CLOSE_CURLY_BRACKET);
				}
				break;
			case OPAR:
			case FOR:
			case NOT:
			case INTEGER:
			case CHAR:
			case RECORD:
			case PRINT:
			case INT:
			case STRING:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
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
	public static class AddContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Example2Parser.ADD, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(Example2Parser.AND, 0); }
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode INCREMENT() { return getToken(Example2Parser.INCREMENT, 0); }
		public IncrementExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIncrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(Example2Parser.SUB, 0); }
		public SubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualIncrementExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL_INCREMENT() { return getToken(Example2Parser.EQUAL_INCREMENT, 0); }
		public EqualIncrementExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitEqualIncrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableValueContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public VariableValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitVariableValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(Example2Parser.MUL, 0); }
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerValueContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(Example2Parser.INT, 0); }
		public IntegerValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIntegerValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(Example2Parser.OR, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(Example2Parser.DIV, 0); }
		public DivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionVariableContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(Example2Parser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(Example2Parser.COLON, 0); }
		public ConditionVariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitConditionVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonsContext extends ExpressionContext {
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
		public ComparisonsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitComparisons(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanValueContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(Example2Parser.BOOL, 0); }
		public BooleanValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualDecrementExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL_DECREMENT() { return getToken(Example2Parser.EQUAL_DECREMENT, 0); }
		public EqualDecrementExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitEqualDecrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(Example2Parser.POW, 0); }
		public PowContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(Example2Parser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringValueContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public StringValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends ExpressionContext {
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
		public ParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode DECREMENT() { return getToken(Example2Parser.DECREMENT, 0); }
		public DecrementExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDecrementExpr(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				match(NOT);
				setState(78);
				expression(12);
				}
				break;
			case 2:
				{
				_localctx = new IncrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(ID);
				setState(80);
				match(INCREMENT);
				}
				break;
			case 3:
				{
				_localctx = new DecrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(ID);
				setState(82);
				match(DECREMENT);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(OPAR);
				setState(84);
				expression(0);
				setState(85);
				match(CPAR);
				}
				break;
			case 5:
				{
				_localctx = new VariableValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntegerValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new StringValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new BooleanValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(94);
						match(ADD);
						setState(95);
						expression(20);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(97);
						match(SUB);
						setState(98);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(100);
						match(MUL);
						setState(101);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(103);
						match(DIV);
						setState(104);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new PowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(106);
						match(POW);
						setState(107);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(109);
						match(AND);
						setState(110);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(112);
						match(OR);
						setState(113);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new EqualIncrementExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(115);
						match(EQUAL_INCREMENT);
						setState(116);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new EqualDecrementExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(118);
						match(EQUAL_DECREMENT);
						setState(119);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new ComparisonsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(127);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case GREATER_OR_EQUAL:
							{
							setState(121);
							match(GREATER_OR_EQUAL);
							}
							break;
						case SMALLER_OR_EQUAL:
							{
							setState(122);
							match(SMALLER_OR_EQUAL);
							}
							break;
						case GREATHER_THAN:
							{
							setState(123);
							match(GREATHER_THAN);
							}
							break;
						case SMALLER_THAN:
							{
							setState(124);
							match(SMALLER_THAN);
							}
							break;
						case EQUAL:
							{
							setState(125);
							match(EQUAL);
							setState(126);
							match(NOT_EQUAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(129);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ConditionVariableContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(131);
						match(QUESTION_MARK);
						setState(132);
						expression(0);
						setState(133);
						match(COLON);
						setState(134);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(140);
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

	public static class Assign_variablesContext extends ParserRuleContext {
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public List<TerminalNode> ID() { return getTokens(Example2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Example2Parser.ID, i);
		}
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
		public Assign_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_variables; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAssign_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_variablesContext assign_variables() throws RecognitionException {
		Assign_variablesContext _localctx = new Assign_variablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(141);
			match(ID);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				match(ID);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(149);
			match(IS_EQUAL);
			{
			setState(150);
			expression(0);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(151);
				match(COMMA);
				setState(152);
				expression(0);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(Example2Parser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(INTEGER);
			setState(159);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(Example2Parser.CHAR, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public CharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharContext char_() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(CHAR);
			setState(162);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordsTypesContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Example2Parser.SEMICOLON, 0); }
		public CharContext char_() {
			return getRuleContext(CharContext.class,0);
		}
		public RecordsContext records() {
			return getRuleContext(RecordsContext.class,0);
		}
		public RecordsTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordsTypes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitRecordsTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordsTypesContext recordsTypes() throws RecognitionException {
		RecordsTypesContext _localctx = new RecordsTypesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_recordsTypes);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				integer();
				setState(165);
				match(SEMICOLON);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				char_();
				setState(168);
				match(SEMICOLON);
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				records();
				setState(171);
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

	public static class RecordsContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(Example2Parser.RECORD, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Example2Parser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Example2Parser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public List<RecordsTypesContext> recordsTypes() {
			return getRuleContexts(RecordsTypesContext.class);
		}
		public RecordsTypesContext recordsTypes(int i) {
			return getRuleContext(RecordsTypesContext.class,i);
		}
		public RecordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_records; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitRecords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordsContext records() throws RecognitionException {
		RecordsContext _localctx = new RecordsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_records);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(RECORD);
			setState(176);
			match(OPEN_SQUARE_BRACKET);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << CHAR) | (1L << RECORD))) != 0)) {
				{
				{
				setState(177);
				recordsTypes();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(CLOSE_SQUARE_BRACKET);
			setState(184);
			match(ID);
			}
		}
		catch (RecognitionException re) {
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
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u00bb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002.\b\u0002\n\u0002\f\u00021\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		">\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"D\b\u0005\n\u0005\f\u0005G\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"K\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\\\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0080\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0089\b\u0006\n\u0006\f\u0006\u008c\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0091\b\u0007\n\u0007\f\u0007"+
		"\u0094\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u009a\b\u0007\n\u0007\f\u0007\u009d\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00ae\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00b3\b\u000b\n\u000b\f\u000b\u00b6\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0000\u0001\f\f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000\u00d4\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004)\u0001\u0000"+
		"\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000"+
		"\nJ\u0001\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000\u000e\u008d\u0001"+
		"\u0000\u0000\u0000\u0010\u009e\u0001\u0000\u0000\u0000\u0012\u00a1\u0001"+
		"\u0000\u0000\u0000\u0014\u00ad\u0001\u0000\u0000\u0000\u0016\u00af\u0001"+
		"\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0005"+
		"\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000\u0000 (\u0003\f\u0006"+
		"\u0000!(\u0003\u000e\u0007\u0000\"(\u0003\u0006\u0003\u0000#(\u0003\u0004"+
		"\u0002\u0000$(\u0003\u0016\u000b\u0000%(\u0003\u0010\b\u0000&(\u0003\u0012"+
		"\t\u0000\' \u0001\u0000\u0000\u0000\'!\u0001\u0000\u0000\u0000\'\"\u0001"+
		"\u0000\u0000\u0000\'#\u0001\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0003\u0001\u0000"+
		"\u0000\u0000)*\u0005 \u0000\u0000*/\u0003\f\u0006\u0000+,\u0005\t\u0000"+
		"\u0000,.\u0003\f\u0006\u0000-+\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\u0005\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005\u000e\u0000\u0000"+
		"34\u0003\b\u0004\u000045\u0003\n\u0005\u00005\u0007\u0001\u0000\u0000"+
		"\u000067\u0005\f\u0000\u000078\u0003\u000e\u0007\u000089\u0005\n\u0000"+
		"\u00009:\u0003\f\u0006\u0000:=\u0005\n\u0000\u0000;>\u0003\f\u0006\u0000"+
		"<>\u0003\u000e\u0007\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?@\u0005\r\u0000\u0000@\t\u0001\u0000"+
		"\u0000\u0000AE\u0005\u000f\u0000\u0000BD\u0003\u0002\u0001\u0000CB\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000HK\u0005\u0010\u0000\u0000IK\u0003\u0002\u0001\u0000JA\u0001\u0000"+
		"\u0000\u0000JI\u0001\u0000\u0000\u0000K\u000b\u0001\u0000\u0000\u0000"+
		"LM\u0006\u0006\uffff\uffff\u0000MN\u0005\u0016\u0000\u0000N\\\u0003\f"+
		"\u0006\fOP\u0005$\u0000\u0000P\\\u0005)\u0000\u0000QR\u0005$\u0000\u0000"+
		"R\\\u0005*\u0000\u0000ST\u0005\f\u0000\u0000TU\u0003\f\u0006\u0000UV\u0005"+
		"\r\u0000\u0000V\\\u0001\u0000\u0000\u0000W\\\u0005$\u0000\u0000X\\\u0005"+
		"!\u0000\u0000Y\\\u0005\"\u0000\u0000Z\\\u0005#\u0000\u0000[L\u0001\u0000"+
		"\u0000\u0000[O\u0001\u0000\u0000\u0000[Q\u0001\u0000\u0000\u0000[S\u0001"+
		"\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\u008a\u0001\u0000"+
		"\u0000\u0000]^\n\u0013\u0000\u0000^_\u0005\u0004\u0000\u0000_\u0089\u0003"+
		"\f\u0006\u0014`a\n\u0012\u0000\u0000ab\u0005\u0005\u0000\u0000b\u0089"+
		"\u0003\f\u0006\u0013cd\n\u0011\u0000\u0000de\u0005\u0002\u0000\u0000e"+
		"\u0089\u0003\f\u0006\u0012fg\n\u0010\u0000\u0000gh\u0005\u0003\u0000\u0000"+
		"h\u0089\u0003\f\u0006\u0011ij\n\u000f\u0000\u0000jk\u0005\u0006\u0000"+
		"\u0000k\u0089\u0003\f\u0006\u0010lm\n\u000e\u0000\u0000mn\u0005\u0014"+
		"\u0000\u0000n\u0089\u0003\f\u0006\u000fop\n\r\u0000\u0000pq\u0005\u0015"+
		"\u0000\u0000q\u0089\u0003\f\u0006\u000ers\n\t\u0000\u0000st\u0005\'\u0000"+
		"\u0000t\u0089\u0003\f\u0006\nuv\n\b\u0000\u0000vw\u0005(\u0000\u0000w"+
		"\u0089\u0003\f\u0006\tx\u007f\n\u0007\u0000\u0000y\u0080\u0005\u001a\u0000"+
		"\u0000z\u0080\u0005\u001b\u0000\u0000{\u0080\u0005\u001c\u0000\u0000|"+
		"\u0080\u0005\u001d\u0000\u0000}~\u0005\u001e\u0000\u0000~\u0080\u0005"+
		"\u001f\u0000\u0000\u007fy\u0001\u0000\u0000\u0000\u007fz\u0001\u0000\u0000"+
		"\u0000\u007f{\u0001\u0000\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0089"+
		"\u0003\f\u0006\b\u0082\u0083\n\u0001\u0000\u0000\u0083\u0084\u0005\u0013"+
		"\u0000\u0000\u0084\u0085\u0003\f\u0006\u0000\u0085\u0086\u0005\u000b\u0000"+
		"\u0000\u0086\u0087\u0003\f\u0006\u0002\u0087\u0089\u0001\u0000\u0000\u0000"+
		"\u0088]\u0001\u0000\u0000\u0000\u0088`\u0001\u0000\u0000\u0000\u0088c"+
		"\u0001\u0000\u0000\u0000\u0088f\u0001\u0000\u0000\u0000\u0088i\u0001\u0000"+
		"\u0000\u0000\u0088l\u0001\u0000\u0000\u0000\u0088o\u0001\u0000\u0000\u0000"+
		"\u0088r\u0001\u0000\u0000\u0000\u0088u\u0001\u0000\u0000\u0000\u0088x"+
		"\u0001\u0000\u0000\u0000\u0088\u0082\u0001\u0000\u0000\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008d\u0092\u0005$\u0000\u0000\u008e\u008f\u0005\t"+
		"\u0000\u0000\u008f\u0091\u0005$\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0001\u0000"+
		"\u0000\u0096\u009b\u0003\f\u0006\u0000\u0097\u0098\u0005\t\u0000\u0000"+
		"\u0098\u009a\u0003\f\u0006\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a"+
		"\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u000f\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0017\u0000\u0000\u009f"+
		"\u00a0\u0005$\u0000\u0000\u00a0\u0011\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0005\u0018\u0000\u0000\u00a2\u00a3\u0005$\u0000\u0000\u00a3\u0013\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0003\u0010\b\u0000\u00a5\u00a6\u0005\n"+
		"\u0000\u0000\u00a6\u00ae\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003\u0012"+
		"\t\u0000\u00a8\u00a9\u0005\n\u0000\u0000\u00a9\u00ae\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0003\u0016\u000b\u0000\u00ab\u00ac\u0005\n\u0000\u0000"+
		"\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a4\u0001\u0000\u0000\u0000"+
		"\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ae\u0015\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0019\u0000\u0000"+
		"\u00b0\u00b4\u0005\u0011\u0000\u0000\u00b1\u00b3\u0003\u0014\n\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0012\u0000\u0000\u00b8\u00b9\u0005$\u0000\u0000\u00b9\u0017"+
		"\u0001\u0000\u0000\u0000\u000e\u001b\'/=EJ[\u007f\u0088\u008a\u0092\u009b"+
		"\u00ad\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}