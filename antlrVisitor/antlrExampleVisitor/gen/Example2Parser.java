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
		EQUAL=1, MUL=2, DIV=3, ADD=4, SUB=5, POW=6, FACT=7, DOT=8, COMMA=9, SEMICOLON=10, 
		COLON=11, OPAR=12, CPAR=13, OPEN_CURLY_BRACKET=14, CLOSE_CURLY_BRACKET=15, 
		OPEN_SQUARE_BRACKET=16, CLOSE_SQUARE_BRACKET=17, QUESTION_MARK=18, AND=19, 
		OR=20, NOT=21, INTEGER=22, CHAR=23, RECORD=24, EQUAL_INCREMENT=25, EQUAL_DECREMENT=26, 
		INCREMENT=27, DECREMENT=28, GREATER_OR_EQUAL=29, SMALLER_OR_EQUAL=30, 
		GREATHER_THAN=31, SMALLER_THAN=32, IS_EQUAL=33, NOT_EQUAL=34, DO=35, WHILE=36, 
		FOR=37, REPEAT=38, UNTIL=39, BREAK=40, CONTINUE=41, PRINT=42, IF=43, ELSE=44, 
		SWITCH=45, DEFAULT=46, CASE=47, INT=48, STRING=49, BOOL=50, ID=51, COMMENT=52, 
		WS=53;
	public static final int
		RULE_start2 = 0, RULE_statement = 1, RULE_for_statement = 2, RULE_for_block = 3, 
		RULE_code_block = 4, RULE_while_statement = 5, RULE_repeat_until_statement = 6, 
		RULE_do_while_statement = 7, RULE_if_statement = 8, RULE_switch_statement = 9, 
		RULE_case_expression = 10, RULE_default_expression = 11, RULE_condition_block = 12, 
		RULE_print_statement = 13, RULE_expression = 14, RULE_variables = 15, 
		RULE_integer = 16, RULE_char = 17, RULE_recordsTypes = 18, RULE_records = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start2", "statement", "for_statement", "for_block", "code_block", "while_statement", 
			"repeat_until_statement", "do_while_statement", "if_statement", "switch_statement", 
			"case_expression", "default_expression", "condition_block", "print_statement", 
			"expression", "variables", "integer", "char", "recordsTypes", "records"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'/'", "'+'", "'-'", "'^'", "'!'", "'.'", "','", 
			"';'", "':'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'?'", "'and'", 
			"'or'", "'not'", "'integer'", "'char'", "'record'", "'+='", "'-='", "'++'", 
			"'--'", "'>='", "'<='", "'>'", "'<'", "'=='", "'!='", "'do'", "'while'", 
			"'for'", "'repeat'", "'until'", "'break'", "'continue'", "'print'", "'if'", 
			"'else'", "'switch'", "'default'", "'case'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL", "MUL", "DIV", "ADD", "SUB", "POW", "FACT", "DOT", "COMMA", 
			"SEMICOLON", "COLON", "OPAR", "CPAR", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", 
			"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "QUESTION_MARK", "AND", 
			"OR", "NOT", "INTEGER", "CHAR", "RECORD", "EQUAL_INCREMENT", "EQUAL_DECREMENT", 
			"INCREMENT", "DECREMENT", "GREATER_OR_EQUAL", "SMALLER_OR_EQUAL", "GREATHER_THAN", 
			"SMALLER_THAN", "IS_EQUAL", "NOT_EQUAL", "DO", "WHILE", "FOR", "REPEAT", 
			"UNTIL", "BREAK", "CONTINUE", "PRINT", "IF", "ELSE", "SWITCH", "DEFAULT", 
			"CASE", "INT", "STRING", "BOOL", "ID", "COMMENT", "WS"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << NOT) | (1L << INTEGER) | (1L << CHAR) | (1L << RECORD) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << REPEAT) | (1L << BREAK) | (1L << CONTINUE) | (1L << PRINT) | (1L << IF) | (1L << SWITCH) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
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
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public Repeat_until_statementContext repeat_until_statement() {
			return getRuleContext(Repeat_until_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(Example2Parser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(Example2Parser.CONTINUE, 0); }
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
			setState(62);
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
				variables();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				for_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				do_while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				while_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				print_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				repeat_until_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(56);
				switch_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(57);
				match(BREAK);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(58);
				match(CONTINUE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(59);
				records();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(60);
				integer();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(61);
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
		enterRule(_localctx, 4, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(FOR);
			setState(65);
			for_block();
			setState(66);
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
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
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
		enterRule(_localctx, 6, RULE_for_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(OPAR);
			setState(69);
			variables();
			setState(70);
			match(SEMICOLON);
			setState(71);
			expression(0);
			setState(72);
			match(SEMICOLON);
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(73);
				expression(0);
				}
				break;
			case 2:
				{
				setState(74);
				variables();
				}
				break;
			}
			setState(77);
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
		enterRule(_localctx, 8, RULE_code_block);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(OPEN_CURLY_BRACKET);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << NOT) | (1L << INTEGER) | (1L << CHAR) | (1L << RECORD) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << REPEAT) | (1L << BREAK) | (1L << CONTINUE) | (1L << PRINT) | (1L << IF) | (1L << SWITCH) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(80);
					statement();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(CLOSE_CURLY_BRACKET);
				}
				break;
			case OPAR:
			case NOT:
			case INTEGER:
			case CHAR:
			case RECORD:
			case DO:
			case WHILE:
			case FOR:
			case REPEAT:
			case BREAK:
			case CONTINUE:
			case PRINT:
			case IF:
			case SWITCH:
			case INT:
			case STRING:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
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
		enterRule(_localctx, 10, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(WHILE);
			setState(91);
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

	public static class Repeat_until_statementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(Example2Parser.REPEAT, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(Example2Parser.UNTIL, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public Repeat_until_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_until_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitRepeat_until_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_until_statementContext repeat_until_statement() throws RecognitionException {
		Repeat_until_statementContext _localctx = new Repeat_until_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repeat_until_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(REPEAT);
			setState(94);
			code_block();
			setState(95);
			match(UNTIL);
			setState(96);
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

	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(Example2Parser.DO, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Example2Parser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(DO);
			setState(99);
			code_block();
			setState(100);
			match(WHILE);
			setState(101);
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
		enterRule(_localctx, 16, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IF);
			setState(104);
			condition_block();
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(105);
				match(ELSE);
				setState(106);
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

	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(Example2Parser.SWITCH, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(Example2Parser.OPEN_CURLY_BRACKET, 0); }
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(Example2Parser.CLOSE_CURLY_BRACKET, 0); }
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(SWITCH);
			setState(110);
			condition_block();
			setState(111);
			match(OPEN_CURLY_BRACKET);
			setState(112);
			case_expression();
			setState(113);
			match(CLOSE_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_expressionContext extends ParserRuleContext {
		public Default_expressionContext default_expression() {
			return getRuleContext(Default_expressionContext.class,0);
		}
		public List<TerminalNode> CASE() { return getTokens(Example2Parser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(Example2Parser.CASE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(Example2Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Example2Parser.COLON, i);
		}
		public List<TerminalNode> BREAK() { return getTokens(Example2Parser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(Example2Parser.BREAK, i);
		}
		public Case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitCase_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_expressionContext case_expression() throws RecognitionException {
		Case_expressionContext _localctx = new Case_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_case_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(115);
				match(CASE);
				setState(116);
				expression(0);
				setState(117);
				match(COLON);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << NOT) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(118);
					expression(0);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(BREAK);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			default_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_expressionContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(Example2Parser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(Example2Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDefault_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_expressionContext default_expression() throws RecognitionException {
		Default_expressionContext _localctx = new Default_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_default_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(DEFAULT);
			setState(134);
			match(COLON);
			setState(135);
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
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
		enterRule(_localctx, 24, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(OPAR);
			setState(138);
			expression(0);
			setState(139);
			match(CPAR);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(140);
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
		enterRule(_localctx, 26, RULE_print_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(PRINT);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					expression(0);
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(150);
				match(COMMA);
				setState(151);
				expression(0);
				}
				}
				setState(156);
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
	public static class IncrementExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(Example2Parser.INCREMENT, 0); }
		public IncrementExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIncrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorielContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FACT() { return getToken(Example2Parser.FACT, 0); }
		public FactorielContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFactoriel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(Example2Parser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitNotExpression(this);
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
		public TerminalNode EQUAL_INCREMENT() { return getToken(Example2Parser.EQUAL_INCREMENT, 0); }
		public EqualDecrementExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitEqualDecrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExpressionContext {
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstractingContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(Example2Parser.SUB, 0); }
		public SubstractingContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitSubstracting(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(Example2Parser.DIV, 0); }
		public DivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDivision(this);
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
	public static class DecrementExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(Example2Parser.DECREMENT, 0); }
		public DecrementExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDecrementExpr(this);
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
	public static class AddingContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Example2Parser.ADD, 0); }
		public AddingContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAdding(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitVariable(this);
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
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(Example2Parser.NOT_EQUAL, 0); }
		public ComparisonsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitComparisons(this);
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
	public static class BooleanValueContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(Example2Parser.BOOL, 0); }
		public BooleanValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(Example2Parser.MUL, 0); }
		public MultiplicationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(Example2Parser.POW, 0); }
		public PowerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPower(this);
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
		public TerminalNode EQUAL_DECREMENT() { return getToken(Example2Parser.EQUAL_DECREMENT, 0); }
		public EqualIncrementExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitEqualIncrementExpr(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(158);
				match(NOT);
				setState(159);
				expression(12);
				}
				break;
			case OPAR:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(OPAR);
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					expression(0);
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << NOT) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0) );
				setState(166);
				match(CPAR);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new IntegerValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(INT);
				}
				break;
			case STRING:
				{
				_localctx = new StringValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(STRING);
				}
				break;
			case BOOL:
				{
				_localctx = new BooleanValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new AddingContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(175);
						match(ADD);
						setState(176);
						expression(21);
						}
						break;
					case 2:
						{
						_localctx = new SubstractingContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(178);
						match(SUB);
						setState(179);
						expression(20);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(181);
						match(MUL);
						setState(182);
						expression(19);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(184);
						match(DIV);
						setState(185);
						expression(18);
						}
						break;
					case 5:
						{
						_localctx = new PowerContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(187);
						match(POW);
						setState(188);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(190);
						match(AND);
						setState(191);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(193);
						match(OR);
						setState(194);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new ComparisonsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(202);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case GREATER_OR_EQUAL:
							{
							setState(196);
							match(GREATER_OR_EQUAL);
							}
							break;
						case SMALLER_OR_EQUAL:
							{
							setState(197);
							match(SMALLER_OR_EQUAL);
							}
							break;
						case GREATHER_THAN:
							{
							setState(198);
							match(GREATHER_THAN);
							}
							break;
						case SMALLER_THAN:
							{
							setState(199);
							match(SMALLER_THAN);
							}
							break;
						case IS_EQUAL:
							{
							setState(200);
							match(IS_EQUAL);
							setState(201);
							match(NOT_EQUAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(204);
						expression(12);
						}
						break;
					case 9:
						{
						_localctx = new EqualIncrementExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(206);
						match(EQUAL_DECREMENT);
						setState(207);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new EqualDecrementExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(209);
						match(EQUAL_INCREMENT);
						setState(210);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ConditionVariableContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(212);
						match(QUESTION_MARK);
						setState(213);
						expression(0);
						setState(214);
						match(COLON);
						setState(215);
						expression(2);
						}
						break;
					case 12:
						{
						_localctx = new FactorielContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(218);
						match(FACT);
						}
						break;
					case 13:
						{
						_localctx = new IncrementExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(220);
						match(INCREMENT);
						}
						break;
					case 14:
						{
						_localctx = new DecrementExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(222);
						match(DECREMENT);
						}
						break;
					}
					} 
				}
				setState(227);
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

	public static class VariablesContext extends ParserRuleContext {
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	 
		public VariablesContext() { }
		public void copyFrom(VariablesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignVariablesContext extends VariablesContext {
		public TerminalNode EQUAL() { return getToken(Example2Parser.EQUAL, 0); }
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
		public AssignVariablesContext(VariablesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAssignVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variables);
		int _la;
		try {
			_localctx = new AssignVariablesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(228);
			match(ID);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229);
				match(COMMA);
				setState(230);
				match(ID);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(236);
			match(EQUAL);
			{
			setState(237);
			expression(0);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238);
				match(COMMA);
				setState(239);
				expression(0);
				}
				}
				setState(244);
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
		enterRule(_localctx, 32, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(INTEGER);
			setState(246);
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
		enterRule(_localctx, 34, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(CHAR);
			setState(249);
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
		enterRule(_localctx, 36, RULE_recordsTypes);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				integer();
				setState(252);
				match(SEMICOLON);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				char_();
				setState(255);
				match(SEMICOLON);
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				records();
				setState(258);
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
		public RecordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_records; }
	 
		public RecordsContext() { }
		public void copyFrom(RecordsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RecordAssignContext extends RecordsContext {
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
		public RecordAssignContext(RecordsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitRecordAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordsContext records() throws RecognitionException {
		RecordsContext _localctx = new RecordsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_records);
		int _la;
		try {
			_localctx = new RecordAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(RECORD);
			setState(263);
			match(OPEN_SQUARE_BRACKET);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << CHAR) | (1L << RECORD))) != 0)) {
				{
				{
				setState(264);
				recordsTypes();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(CLOSE_SQUARE_BRACKET);
			setState(271);
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
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 1);
		case 11:
			return precpred(_ctx, 16);
		case 12:
			return precpred(_ctx, 10);
		case 13:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u0112\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"?\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003L\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0005\u0004R\b\u0004\n\u0004\f\u0004U\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004Y\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bl\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\nx\b\n\n\n\f\n{\t\n\u0001\n\u0001\n\u0005\n\u007f"+
		"\b\n\n\n\f\n\u0082\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u008e\b\f\u0001\r"+
		"\u0001\r\u0005\r\u0092\b\r\n\r\f\r\u0095\t\r\u0001\r\u0001\r\u0005\r\u0099"+
		"\b\r\n\r\f\r\u009c\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u00a3\b\u000e\u000b\u000e\f\u000e\u00a4\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00ad\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00cb\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00e0\b\u000e\n\u000e\f\u000e"+
		"\u00e3\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e8\b"+
		"\u000f\n\u000f\f\u000f\u00eb\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00f1\b\u000f\n\u000f\f\u000f\u00f4\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0105\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u010a\b\u0013\n\u0013\f\u0013\u010d\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0001\u001c\u0014"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&\u0000\u0000\u0131\u0000+\u0001\u0000\u0000\u0000\u0002"+
		">\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006D\u0001"+
		"\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\nZ\u0001\u0000\u0000\u0000"+
		"\f]\u0001\u0000\u0000\u0000\u000eb\u0001\u0000\u0000\u0000\u0010g\u0001"+
		"\u0000\u0000\u0000\u0012m\u0001\u0000\u0000\u0000\u0014\u0080\u0001\u0000"+
		"\u0000\u0000\u0016\u0085\u0001\u0000\u0000\u0000\u0018\u0089\u0001\u0000"+
		"\u0000\u0000\u001a\u008f\u0001\u0000\u0000\u0000\u001c\u00ac\u0001\u0000"+
		"\u0000\u0000\u001e\u00e4\u0001\u0000\u0000\u0000 \u00f5\u0001\u0000\u0000"+
		"\u0000\"\u00f8\u0001\u0000\u0000\u0000$\u0104\u0001\u0000\u0000\u0000"+
		"&\u0106\u0001\u0000\u0000\u0000(*\u0003\u0002\u0001\u0000)(\u0001\u0000"+
		"\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"./\u0005\u0000\u0000\u0001/\u0001\u0001\u0000\u0000\u00000?\u0003\u001c"+
		"\u000e\u00001?\u0003\u001e\u000f\u00002?\u0003\u0004\u0002\u00003?\u0003"+
		"\u000e\u0007\u00004?\u0003\n\u0005\u00005?\u0003\u0010\b\u00006?\u0003"+
		"\u001a\r\u00007?\u0003\f\u0006\u00008?\u0003\u0012\t\u00009?\u0005(\u0000"+
		"\u0000:?\u0005)\u0000\u0000;?\u0003&\u0013\u0000<?\u0003 \u0010\u0000"+
		"=?\u0003\"\u0011\u0000>0\u0001\u0000\u0000\u0000>1\u0001\u0000\u0000\u0000"+
		">2\u0001\u0000\u0000\u0000>3\u0001\u0000\u0000\u0000>4\u0001\u0000\u0000"+
		"\u0000>5\u0001\u0000\u0000\u0000>6\u0001\u0000\u0000\u0000>7\u0001\u0000"+
		"\u0000\u0000>8\u0001\u0000\u0000\u0000>9\u0001\u0000\u0000\u0000>:\u0001"+
		"\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">=\u0001\u0000\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@A\u0005%\u0000"+
		"\u0000AB\u0003\u0006\u0003\u0000BC\u0003\b\u0004\u0000C\u0005\u0001\u0000"+
		"\u0000\u0000DE\u0005\f\u0000\u0000EF\u0003\u001e\u000f\u0000FG\u0005\n"+
		"\u0000\u0000GH\u0003\u001c\u000e\u0000HK\u0005\n\u0000\u0000IL\u0003\u001c"+
		"\u000e\u0000JL\u0003\u001e\u000f\u0000KI\u0001\u0000\u0000\u0000KJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0005\r\u0000\u0000N\u0007"+
		"\u0001\u0000\u0000\u0000OS\u0005\u000e\u0000\u0000PR\u0003\u0002\u0001"+
		"\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VY\u0005\u000f\u0000\u0000WY\u0003\u0002\u0001\u0000"+
		"XO\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\t\u0001\u0000\u0000"+
		"\u0000Z[\u0005$\u0000\u0000[\\\u0003\u0018\f\u0000\\\u000b\u0001\u0000"+
		"\u0000\u0000]^\u0005&\u0000\u0000^_\u0003\b\u0004\u0000_`\u0005\'\u0000"+
		"\u0000`a\u0003\u0018\f\u0000a\r\u0001\u0000\u0000\u0000bc\u0005#\u0000"+
		"\u0000cd\u0003\b\u0004\u0000de\u0005$\u0000\u0000ef\u0003\u0018\f\u0000"+
		"f\u000f\u0001\u0000\u0000\u0000gh\u0005+\u0000\u0000hk\u0003\u0018\f\u0000"+
		"ij\u0005,\u0000\u0000jl\u0003\b\u0004\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000l\u0011\u0001\u0000\u0000\u0000mn\u0005-\u0000"+
		"\u0000no\u0003\u0018\f\u0000op\u0005\u000e\u0000\u0000pq\u0003\u0014\n"+
		"\u0000qr\u0005\u000f\u0000\u0000r\u0013\u0001\u0000\u0000\u0000st\u0005"+
		"/\u0000\u0000tu\u0003\u001c\u000e\u0000uy\u0005\u000b\u0000\u0000vx\u0003"+
		"\u001c\u000e\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000|}\u0005(\u0000\u0000}\u007f\u0001\u0000"+
		"\u0000\u0000~s\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0003\u0016\u000b\u0000\u0084\u0015\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005.\u0000\u0000\u0086\u0087\u0005\u000b\u0000\u0000\u0087\u0088"+
		"\u0003\u001c\u000e\u0000\u0088\u0017\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\f\u0000\u0000\u008a\u008b\u0003\u001c\u000e\u0000\u008b\u008d\u0005"+
		"\r\u0000\u0000\u008c\u008e\u0003\b\u0004\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0019\u0001\u0000"+
		"\u0000\u0000\u008f\u0093\u0005*\u0000\u0000\u0090\u0092\u0003\u001c\u000e"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u009a\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\t\u0000\u0000\u0097\u0099\u0003\u001c\u000e\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u001b\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0006\u000e\uffff\uffff\u0000\u009e\u009f\u0005\u0015\u0000"+
		"\u0000\u009f\u00ad\u0003\u001c\u000e\f\u00a0\u00a2\u0005\f\u0000\u0000"+
		"\u00a1\u00a3\u0003\u001c\u000e\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0005\r\u0000\u0000\u00a7\u00ad\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ad\u00053\u0000\u0000\u00a9\u00ad\u00050\u0000\u0000\u00aa\u00ad\u0005"+
		"1\u0000\u0000\u00ab\u00ad\u00052\u0000\u0000\u00ac\u009d\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a0\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00e1\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\n\u0014\u0000\u0000\u00af\u00b0\u0005\u0004\u0000\u0000"+
		"\u00b0\u00e0\u0003\u001c\u000e\u0015\u00b1\u00b2\n\u0013\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0005\u0000\u0000\u00b3\u00e0\u0003\u001c\u000e\u0014\u00b4"+
		"\u00b5\n\u0012\u0000\u0000\u00b5\u00b6\u0005\u0002\u0000\u0000\u00b6\u00e0"+
		"\u0003\u001c\u000e\u0013\u00b7\u00b8\n\u0011\u0000\u0000\u00b8\u00b9\u0005"+
		"\u0003\u0000\u0000\u00b9\u00e0\u0003\u001c\u000e\u0012\u00ba\u00bb\n\u000f"+
		"\u0000\u0000\u00bb\u00bc\u0005\u0006\u0000\u0000\u00bc\u00e0\u0003\u001c"+
		"\u000e\u0010\u00bd\u00be\n\u000e\u0000\u0000\u00be\u00bf\u0005\u0013\u0000"+
		"\u0000\u00bf\u00e0\u0003\u001c\u000e\u000f\u00c0\u00c1\n\r\u0000\u0000"+
		"\u00c1\u00c2\u0005\u0014\u0000\u0000\u00c2\u00e0\u0003\u001c\u000e\u000e"+
		"\u00c3\u00ca\n\u000b\u0000\u0000\u00c4\u00cb\u0005\u001d\u0000\u0000\u00c5"+
		"\u00cb\u0005\u001e\u0000\u0000\u00c6\u00cb\u0005\u001f\u0000\u0000\u00c7"+
		"\u00cb\u0005 \u0000\u0000\u00c8\u00c9\u0005!\u0000\u0000\u00c9\u00cb\u0005"+
		"\"\u0000\u0000\u00ca\u00c4\u0001\u0000\u0000\u0000\u00ca\u00c5\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c6\u0001\u0000\u0000\u0000\u00ca\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00e0\u0003\u001c\u000e\f\u00cd\u00ce\n\b\u0000\u0000"+
		"\u00ce\u00cf\u0005\u001a\u0000\u0000\u00cf\u00e0\u0003\u001c\u000e\t\u00d0"+
		"\u00d1\n\u0007\u0000\u0000\u00d1\u00d2\u0005\u0019\u0000\u0000\u00d2\u00e0"+
		"\u0003\u001c\u000e\b\u00d3\u00d4\n\u0001\u0000\u0000\u00d4\u00d5\u0005"+
		"\u0012\u0000\u0000\u00d5\u00d6\u0003\u001c\u000e\u0000\u00d6\u00d7\u0005"+
		"\u000b\u0000\u0000\u00d7\u00d8\u0003\u001c\u000e\u0002\u00d8\u00e0\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\n\u0010\u0000\u0000\u00da\u00e0\u0005\u0007"+
		"\u0000\u0000\u00db\u00dc\n\n\u0000\u0000\u00dc\u00e0\u0005\u001b\u0000"+
		"\u0000\u00dd\u00de\n\t\u0000\u0000\u00de\u00e0\u0005\u001c\u0000\u0000"+
		"\u00df\u00ae\u0001\u0000\u0000\u0000\u00df\u00b1\u0001\u0000\u0000\u0000"+
		"\u00df\u00b4\u0001\u0000\u0000\u0000\u00df\u00b7\u0001\u0000\u0000\u0000"+
		"\u00df\u00ba\u0001\u0000\u0000\u0000\u00df\u00bd\u0001\u0000\u0000\u0000"+
		"\u00df\u00c0\u0001\u0000\u0000\u0000\u00df\u00c3\u0001\u0000\u0000\u0000"+
		"\u00df\u00cd\u0001\u0000\u0000\u0000\u00df\u00d0\u0001\u0000\u0000\u0000"+
		"\u00df\u00d3\u0001\u0000\u0000\u0000\u00df\u00d9\u0001\u0000\u0000\u0000"+
		"\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u001d\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e9\u00053\u0000\u0000\u00e5"+
		"\u00e6\u0005\t\u0000\u0000\u00e6\u00e8\u00053\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0005\u0001\u0000\u0000\u00ed\u00f2\u0003\u001c\u000e\u0000\u00ee\u00ef"+
		"\u0005\t\u0000\u0000\u00ef\u00f1\u0003\u001c\u000e\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u001f\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"\u0016\u0000\u0000\u00f6\u00f7\u00053\u0000\u0000\u00f7!\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005\u0017\u0000\u0000\u00f9\u00fa\u00053\u0000\u0000"+
		"\u00fa#\u0001\u0000\u0000\u0000\u00fb\u00fc\u0003 \u0010\u0000\u00fc\u00fd"+
		"\u0005\n\u0000\u0000\u00fd\u0105\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003"+
		"\"\u0011\u0000\u00ff\u0100\u0005\n\u0000\u0000\u0100\u0105\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0003&\u0013\u0000\u0102\u0103\u0005\n\u0000"+
		"\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u00fb\u0001\u0000\u0000"+
		"\u0000\u0104\u00fe\u0001\u0000\u0000\u0000\u0104\u0101\u0001\u0000\u0000"+
		"\u0000\u0105%\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0018\u0000\u0000"+
		"\u0107\u010b\u0005\u0010\u0000\u0000\u0108\u010a\u0003$\u0012\u0000\u0109"+
		"\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0005\u0011\u0000\u0000\u010f\u0110\u00053\u0000\u0000\u0110\'"+
		"\u0001\u0000\u0000\u0000\u0014+>KSXky\u0080\u008d\u0093\u009a\u00a4\u00ac"+
		"\u00ca\u00df\u00e1\u00e9\u00f2\u0104\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}