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
		DO=1, WHILE=2, REPEAT=3, UNTIL=4, IF=5, ELSE=6, IS_EQUAL=7, MUL=8, DIV=9, 
		ADD=10, SUB=11, POW=12, FACT=13, DOT=14, COMMA=15, SEMICOLON=16, COLON=17, 
		OPAR=18, CPAR=19, FOR=20, OPEN_CURLY_BRACKET=21, CLOSE_CURLY_BRACKET=22, 
		OPEN_SQUARE_BRACKET=23, CLOSE_SQUARE_BRACKET=24, QUESTION_MARK=25, AND=26, 
		OR=27, NOT=28, INTEGER=29, CHAR=30, RECORD=31, GREATER_OR_EQUAL=32, SMALLER_OR_EQUAL=33, 
		GREATHER_THAN=34, SMALLER_THAN=35, EQUAL=36, NOT_EQUAL=37, PRINT=38, INT=39, 
		STRING=40, BOOL=41, ID=42, COMMENT=43, WS=44, EQUAL_INCREMENT=45, EQUAL_DECREMENT=46, 
		INCREMENT=47, DECREMENT=48;
	public static final int
		RULE_start2 = 0, RULE_statement = 1, RULE_print_statement = 2, RULE_repeat_until_statement = 3, 
		RULE_do_while_statement = 4, RULE_while_statement = 5, RULE_for_statement = 6, 
		RULE_for_block = 7, RULE_if_statement = 8, RULE_code_block = 9, RULE_expression = 10, 
		RULE_assign_variables = 11, RULE_integer = 12, RULE_char = 13, RULE_records = 14, 
		RULE_recordsBlock = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start2", "statement", "print_statement", "repeat_until_statement", "do_while_statement", 
			"while_statement", "for_statement", "for_block", "if_statement", "code_block", 
			"expression", "assign_variables", "integer", "char", "records", "recordsBlock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'do'", "'while'", "'repeat'", "'until'", "'if'", "'else'", "'='", 
			"'*'", "'/'", "'+'", "'-'", "'^'", "'!'", "'.'", "','", "';'", "':'", 
			"'('", "')'", "'for'", "'{'", "'}'", "'['", "']'", "'?'", "'and'", "'or'", 
			"'not'", "'integer'", "'char'", "'record'", "'>='", "'<='", "'>'", "'<'", 
			"'=='", "'!='", "'print'", null, null, null, null, null, null, "'+='", 
			"'-='", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DO", "WHILE", "REPEAT", "UNTIL", "IF", "ELSE", "IS_EQUAL", "MUL", 
			"DIV", "ADD", "SUB", "POW", "FACT", "DOT", "COMMA", "SEMICOLON", "COLON", 
			"OPAR", "CPAR", "FOR", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "OPEN_SQUARE_BRACKET", 
			"CLOSE_SQUARE_BRACKET", "QUESTION_MARK", "AND", "OR", "NOT", "INTEGER", 
			"CHAR", "RECORD", "GREATER_OR_EQUAL", "SMALLER_OR_EQUAL", "GREATHER_THAN", 
			"SMALLER_THAN", "EQUAL", "NOT_EQUAL", "PRINT", "INT", "STRING", "BOOL", 
			"ID", "COMMENT", "WS", "EQUAL_INCREMENT", "EQUAL_DECREMENT", "INCREMENT", 
			"DECREMENT"
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DO) | (1L << WHILE) | (1L << REPEAT) | (1L << IF) | (1L << OPAR) | (1L << FOR) | (1L << NOT) | (1L << INTEGER) | (1L << CHAR) | (1L << RECORD) | (1L << PRINT) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(32);
				statement();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Repeat_until_statementContext repeat_until_statement() {
			return getRuleContext(Repeat_until_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
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
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				assign_variables();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				for_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				print_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				repeat_until_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				do_while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(48);
				records();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(49);
				integer();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(50);
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
			setState(53);
			match(PRINT);
			setState(54);
			expression(0);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(55);
				match(COMMA);
				setState(56);
				expression(0);
				}
				}
				setState(61);
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

	public static class Repeat_until_statementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(Example2Parser.REPEAT, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(Example2Parser.UNTIL, 0); }
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
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
		enterRule(_localctx, 6, RULE_repeat_until_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(REPEAT);
			setState(63);
			code_block();
			setState(64);
			match(UNTIL);
			setState(65);
			match(OPAR);
			setState(66);
			expression(0);
			setState(67);
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

	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(Example2Parser.DO, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Example2Parser.WHILE, 0); }
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
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
		enterRule(_localctx, 8, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(DO);
			setState(70);
			code_block();
			setState(71);
			match(WHILE);
			setState(72);
			match(OPAR);
			setState(73);
			expression(0);
			setState(74);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Example2Parser.WHILE, 0); }
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
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
			setState(76);
			match(WHILE);
			setState(77);
			match(OPAR);
			setState(78);
			expression(0);
			setState(79);
			match(CPAR);
			setState(80);
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
		enterRule(_localctx, 12, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(FOR);
			setState(83);
			for_block();
			setState(84);
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
		public Assign_variablesContext assign_variables() {
			return getRuleContext(Assign_variablesContext.class,0);
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
		enterRule(_localctx, 14, RULE_for_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(OPAR);
			setState(87);
			assign_variables();
			setState(88);
			match(SEMICOLON);
			setState(89);
			expression(0);
			setState(90);
			match(SEMICOLON);
			setState(91);
			expression(0);
			setState(92);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Example2Parser.IF, 0); }
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Example2Parser.ELSE, 0); }
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
			setState(94);
			match(IF);
			setState(95);
			match(OPAR);
			setState(96);
			expression(0);
			setState(97);
			match(CPAR);
			setState(98);
			code_block();
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(99);
				match(ELSE);
				setState(100);
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
		enterRule(_localctx, 18, RULE_code_block);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(OPEN_CURLY_BRACKET);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DO) | (1L << WHILE) | (1L << REPEAT) | (1L << IF) | (1L << OPAR) | (1L << FOR) | (1L << NOT) | (1L << INTEGER) | (1L << CHAR) | (1L << RECORD) | (1L << PRINT) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(104);
					statement();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(CLOSE_CURLY_BRACKET);
				}
				break;
			case DO:
			case WHILE:
			case REPEAT:
			case IF:
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
				setState(111);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(115);
				match(NOT);
				setState(116);
				expression(12);
				}
				break;
			case 2:
				{
				_localctx = new IncrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(ID);
				setState(118);
				match(INCREMENT);
				}
				break;
			case 3:
				{
				_localctx = new DecrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(ID);
				setState(120);
				match(DECREMENT);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(OPAR);
				setState(122);
				expression(0);
				setState(123);
				match(CPAR);
				}
				break;
			case 5:
				{
				_localctx = new VariableValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntegerValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new StringValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new BooleanValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(132);
						match(ADD);
						setState(133);
						expression(20);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(135);
						match(SUB);
						setState(136);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(138);
						match(MUL);
						setState(139);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(141);
						match(DIV);
						setState(142);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new PowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(143);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(144);
						match(POW);
						setState(145);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(147);
						match(AND);
						setState(148);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(150);
						match(OR);
						setState(151);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new EqualIncrementExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(153);
						match(EQUAL_INCREMENT);
						setState(154);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new EqualDecrementExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(156);
						match(EQUAL_DECREMENT);
						setState(157);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new ComparisonsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(165);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case GREATER_OR_EQUAL:
							{
							setState(159);
							match(GREATER_OR_EQUAL);
							}
							break;
						case SMALLER_OR_EQUAL:
							{
							setState(160);
							match(SMALLER_OR_EQUAL);
							}
							break;
						case GREATHER_THAN:
							{
							setState(161);
							match(GREATHER_THAN);
							}
							break;
						case SMALLER_THAN:
							{
							setState(162);
							match(SMALLER_THAN);
							}
							break;
						case EQUAL:
							{
							setState(163);
							match(EQUAL);
							setState(164);
							match(NOT_EQUAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(167);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ConditionVariableContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(169);
						match(QUESTION_MARK);
						setState(170);
						expression(0);
						setState(171);
						match(COLON);
						setState(172);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(178);
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
		enterRule(_localctx, 22, RULE_assign_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(179);
			match(ID);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(180);
				match(COMMA);
				setState(181);
				match(ID);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(187);
			match(IS_EQUAL);
			{
			setState(188);
			expression(0);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(189);
				match(COMMA);
				setState(190);
				expression(0);
				}
				}
				setState(195);
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
		enterRule(_localctx, 24, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(INTEGER);
			setState(197);
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
		enterRule(_localctx, 26, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(CHAR);
			setState(200);
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

	public static class RecordsContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(Example2Parser.RECORD, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Example2Parser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Example2Parser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public List<RecordsBlockContext> recordsBlock() {
			return getRuleContexts(RecordsBlockContext.class);
		}
		public RecordsBlockContext recordsBlock(int i) {
			return getRuleContext(RecordsBlockContext.class,i);
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
		enterRule(_localctx, 28, RULE_records);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(RECORD);
			setState(203);
			match(OPEN_SQUARE_BRACKET);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << CHAR) | (1L << RECORD))) != 0)) {
				{
				{
				setState(204);
				recordsBlock();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(CLOSE_SQUARE_BRACKET);
			setState(211);
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

	public static class RecordsBlockContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(Example2Parser.SEMICOLON, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public CharContext char_() {
			return getRuleContext(CharContext.class,0);
		}
		public RecordsContext records() {
			return getRuleContext(RecordsContext.class,0);
		}
		public RecordsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordsBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitRecordsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordsBlockContext recordsBlock() throws RecognitionException {
		RecordsBlockContext _localctx = new RecordsBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_recordsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(213);
				integer();
				}
				break;
			case CHAR:
				{
				setState(214);
				char_();
				}
				break;
			case RECORD:
				{
				setState(215);
				records();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(218);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
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
		"\u0004\u00010\u00dd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00014\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bf\b\b"+
		"\u0001\t\u0001\t\u0005\tj\b\t\n\t\f\tm\t\t\u0001\t\u0001\t\u0003\tq\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0082\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a6\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00af\b\n\n"+
		"\n\f\n\u00b2\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00b7"+
		"\b\u000b\n\u000b\f\u000b\u00ba\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00c0\b\u000b\n\u000b\f\u000b\u00c3\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00ce\b\u000e\n\u000e\f\u000e\u00d1\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00d9\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0001\u0014\u0010"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e\u0000\u0000\u00f6\u0000#\u0001\u0000\u0000\u0000\u00023\u0001"+
		"\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000"+
		"\u0000\bE\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000\u0000\fR\u0001"+
		"\u0000\u0000\u0000\u000eV\u0001\u0000\u0000\u0000\u0010^\u0001\u0000\u0000"+
		"\u0000\u0012p\u0001\u0000\u0000\u0000\u0014\u0081\u0001\u0000\u0000\u0000"+
		"\u0016\u00b3\u0001\u0000\u0000\u0000\u0018\u00c4\u0001\u0000\u0000\u0000"+
		"\u001a\u00c7\u0001\u0000\u0000\u0000\u001c\u00ca\u0001\u0000\u0000\u0000"+
		"\u001e\u00d8\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001"+
		"\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000&\'\u0005\u0000\u0000\u0001\'\u0001\u0001\u0000\u0000\u0000(4\u0003"+
		"\u0014\n\u0000)4\u0003\u0016\u000b\u0000*4\u0003\f\u0006\u0000+4\u0003"+
		"\u0004\u0002\u0000,4\u0003\u0010\b\u0000-4\u0003\n\u0005\u0000.4\u0003"+
		"\u0006\u0003\u0000/4\u0003\b\u0004\u000004\u0003\u001c\u000e\u000014\u0003"+
		"\u0018\f\u000024\u0003\u001a\r\u00003(\u0001\u0000\u0000\u00003)\u0001"+
		"\u0000\u0000\u00003*\u0001\u0000\u0000\u00003+\u0001\u0000\u0000\u0000"+
		"3,\u0001\u0000\u0000\u00003-\u0001\u0000\u0000\u00003.\u0001\u0000\u0000"+
		"\u00003/\u0001\u0000\u0000\u000030\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000032\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u0000"+
		"56\u0005&\u0000\u00006;\u0003\u0014\n\u000078\u0005\u000f\u0000\u0000"+
		"8:\u0003\u0014\n\u000097\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0005\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0005\u0003\u0000\u0000?@\u0003"+
		"\u0012\t\u0000@A\u0005\u0004\u0000\u0000AB\u0005\u0012\u0000\u0000BC\u0003"+
		"\u0014\n\u0000CD\u0005\u0013\u0000\u0000D\u0007\u0001\u0000\u0000\u0000"+
		"EF\u0005\u0001\u0000\u0000FG\u0003\u0012\t\u0000GH\u0005\u0002\u0000\u0000"+
		"HI\u0005\u0012\u0000\u0000IJ\u0003\u0014\n\u0000JK\u0005\u0013\u0000\u0000"+
		"K\t\u0001\u0000\u0000\u0000LM\u0005\u0002\u0000\u0000MN\u0005\u0012\u0000"+
		"\u0000NO\u0003\u0014\n\u0000OP\u0005\u0013\u0000\u0000PQ\u0003\u0012\t"+
		"\u0000Q\u000b\u0001\u0000\u0000\u0000RS\u0005\u0014\u0000\u0000ST\u0003"+
		"\u000e\u0007\u0000TU\u0003\u0012\t\u0000U\r\u0001\u0000\u0000\u0000VW"+
		"\u0005\u0012\u0000\u0000WX\u0003\u0016\u000b\u0000XY\u0005\u0010\u0000"+
		"\u0000YZ\u0003\u0014\n\u0000Z[\u0005\u0010\u0000\u0000[\\\u0003\u0014"+
		"\n\u0000\\]\u0005\u0013\u0000\u0000]\u000f\u0001\u0000\u0000\u0000^_\u0005"+
		"\u0005\u0000\u0000_`\u0005\u0012\u0000\u0000`a\u0003\u0014\n\u0000ab\u0005"+
		"\u0013\u0000\u0000be\u0003\u0012\t\u0000cd\u0005\u0006\u0000\u0000df\u0003"+
		"\u0012\t\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0011"+
		"\u0001\u0000\u0000\u0000gk\u0005\u0015\u0000\u0000hj\u0003\u0002\u0001"+
		"\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000nq\u0005\u0016\u0000\u0000oq\u0003\u0002\u0001\u0000"+
		"pg\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u0013\u0001\u0000"+
		"\u0000\u0000rs\u0006\n\uffff\uffff\u0000st\u0005\u001c\u0000\u0000t\u0082"+
		"\u0003\u0014\n\fuv\u0005*\u0000\u0000v\u0082\u0005/\u0000\u0000wx\u0005"+
		"*\u0000\u0000x\u0082\u00050\u0000\u0000yz\u0005\u0012\u0000\u0000z{\u0003"+
		"\u0014\n\u0000{|\u0005\u0013\u0000\u0000|\u0082\u0001\u0000\u0000\u0000"+
		"}\u0082\u0005*\u0000\u0000~\u0082\u0005\'\u0000\u0000\u007f\u0082\u0005"+
		"(\u0000\u0000\u0080\u0082\u0005)\u0000\u0000\u0081r\u0001\u0000\u0000"+
		"\u0000\u0081u\u0001\u0000\u0000\u0000\u0081w\u0001\u0000\u0000\u0000\u0081"+
		"y\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000\u0000\u0081~\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u00b0\u0001\u0000\u0000\u0000\u0083\u0084\n\u0013"+
		"\u0000\u0000\u0084\u0085\u0005\n\u0000\u0000\u0085\u00af\u0003\u0014\n"+
		"\u0014\u0086\u0087\n\u0012\u0000\u0000\u0087\u0088\u0005\u000b\u0000\u0000"+
		"\u0088\u00af\u0003\u0014\n\u0013\u0089\u008a\n\u0011\u0000\u0000\u008a"+
		"\u008b\u0005\b\u0000\u0000\u008b\u00af\u0003\u0014\n\u0012\u008c\u008d"+
		"\n\u0010\u0000\u0000\u008d\u008e\u0005\t\u0000\u0000\u008e\u00af\u0003"+
		"\u0014\n\u0011\u008f\u0090\n\u000f\u0000\u0000\u0090\u0091\u0005\f\u0000"+
		"\u0000\u0091\u00af\u0003\u0014\n\u0010\u0092\u0093\n\u000e\u0000\u0000"+
		"\u0093\u0094\u0005\u001a\u0000\u0000\u0094\u00af\u0003\u0014\n\u000f\u0095"+
		"\u0096\n\r\u0000\u0000\u0096\u0097\u0005\u001b\u0000\u0000\u0097\u00af"+
		"\u0003\u0014\n\u000e\u0098\u0099\n\t\u0000\u0000\u0099\u009a\u0005-\u0000"+
		"\u0000\u009a\u00af\u0003\u0014\n\n\u009b\u009c\n\b\u0000\u0000\u009c\u009d"+
		"\u0005.\u0000\u0000\u009d\u00af\u0003\u0014\n\t\u009e\u00a5\n\u0007\u0000"+
		"\u0000\u009f\u00a6\u0005 \u0000\u0000\u00a0\u00a6\u0005!\u0000\u0000\u00a1"+
		"\u00a6\u0005\"\u0000\u0000\u00a2\u00a6\u0005#\u0000\u0000\u00a3\u00a4"+
		"\u0005$\u0000\u0000\u00a4\u00a6\u0005%\u0000\u0000\u00a5\u009f\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a0\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00af\u0003\u0014"+
		"\n\b\u00a8\u00a9\n\u0001\u0000\u0000\u00a9\u00aa\u0005\u0019\u0000\u0000"+
		"\u00aa\u00ab\u0003\u0014\n\u0000\u00ab\u00ac\u0005\u0011\u0000\u0000\u00ac"+
		"\u00ad\u0003\u0014\n\u0002\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u0083"+
		"\u0001\u0000\u0000\u0000\u00ae\u0086\u0001\u0000\u0000\u0000\u00ae\u0089"+
		"\u0001\u0000\u0000\u0000\u00ae\u008c\u0001\u0000\u0000\u0000\u00ae\u008f"+
		"\u0001\u0000\u0000\u0000\u00ae\u0092\u0001\u0000\u0000\u0000\u00ae\u0095"+
		"\u0001\u0000\u0000\u0000\u00ae\u0098\u0001\u0000\u0000\u0000\u00ae\u009b"+
		"\u0001\u0000\u0000\u0000\u00ae\u009e\u0001\u0000\u0000\u0000\u00ae\u00a8"+
		"\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u0015"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b8"+
		"\u0005*\u0000\u0000\u00b4\u00b5\u0005\u000f\u0000\u0000\u00b5\u00b7\u0005"+
		"*\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005\u0007\u0000\u0000\u00bc\u00c1\u0003\u0014"+
		"\n\u0000\u00bd\u00be\u0005\u000f\u0000\u0000\u00be\u00c0\u0003\u0014\n"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u0017\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005\u001d\u0000\u0000\u00c5\u00c6\u0005*\u0000\u0000"+
		"\u00c6\u0019\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u001e\u0000\u0000"+
		"\u00c8\u00c9\u0005*\u0000\u0000\u00c9\u001b\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u001f\u0000\u0000\u00cb\u00cf\u0005\u0017\u0000\u0000\u00cc"+
		"\u00ce\u0003\u001e\u000f\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0018\u0000\u0000\u00d3"+
		"\u00d4\u0005*\u0000\u0000\u00d4\u001d\u0001\u0000\u0000\u0000\u00d5\u00d9"+
		"\u0003\u0018\f\u0000\u00d6\u00d9\u0003\u001a\r\u0000\u00d7\u00d9\u0003"+
		"\u001c\u000e\u0000\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005\u0010\u0000\u0000\u00db\u001f\u0001"+
		"\u0000\u0000\u0000\u000e#3;ekp\u0081\u00a5\u00ae\u00b0\u00b8\u00c1\u00cf"+
		"\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}