// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FlutterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATA_TYPE=1, VOID=2, INT_=3, STRING_=4, FLOAT_=5, BOOLEAN_=6, DOUBLE_=7, 
		VALUES=8, C_AND_F=9, A=10, AA=11, AE=12, AT=13, C=14, CB=15, CBC=16, CIR=17, 
		CIRE=18, CO=19, CP=20, D=21, EE=22, EG=23, EQ=24, GT=25, LT=26, LTE=27, 
		ME=28, MINUS=29, MM=30, NE=31, NOT=32, OB=33, OBC=34, OP=35, P=36, PC=37, 
		PE=38, PL=39, PLE=40, PLPL=41, PO=42, POE=43, PP=44, SC=45, SE=46, SL=47, 
		ST=48, STE=49, ABSTRACT_=50, AS_=51, BREAK_=52, CASE_=53, CATCH_=54, CLASS_=55, 
		CONST_=56, CONTINUE_=57, DEFAULT_=58, DO_=59, DYNAMIC_=60, ELSE_=61, ENUM_=62, 
		EXTENDS_=63, FALSE_=64, FINAL_=65, FINALLY_=66, FOR_=67, IF_=68, IMPLEMENTS_=69, 
		IMPORT_=70, IN_=71, INTERFACE_=72, IS_=73, LET_=74, LIBRARY_=75, NEW_=76, 
		NULL_=77, OF_=78, ON_=79, REQUIRED_=80, RETHROW_=81, RETURN_=82, STATIC_=83, 
		SUPER_=84, SWITCH_=85, THIS_=86, THROW_=87, TRUE_=88, TRY_=89, VAR_=90, 
		WHILE_=91, UNDERSCORE=92, STRING=93, QUTE=94, QM=95, INT=96, FLOAT=97, 
		DOUBLE=98, BOOLEAN=99, HEX_NUMBER=100, SingleLineString=101, MultiLineString=102, 
		IDENTIFIER=103, WHITESPACE=104, SINGLE_LINE_COMMENT=105, MULTI_LINE_COMMENT=106;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_function_header = 2, RULE_structure = 3, 
		RULE_function_body = 4, RULE_function_call = 5, RULE_function_parameters = 6, 
		RULE_return = 7, RULE_argument = 8, RULE_variable_call = 9, RULE_variable = 10, 
		RULE_decl = 11, RULE_init = 12, RULE_variable_access = 13, RULE_function_access = 14, 
		RULE_class = 15, RULE_class_header = 16, RULE_class_body = 17, RULE_class_type = 18, 
		RULE_extends_class = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "function_header", "structure", "function_body", 
			"function_call", "function_parameters", "return", "argument", "variable_call", 
			"variable", "decl", "init", "variable_access", "function_access", "class", 
			"class_header", "class_body", "class_type", "extends_class"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'void'", "'int'", "'string'", "'float'", "'boolean'", "'double'", 
			null, null, "'&'", "'&&'", "'&='", "'@'", "','", "']'", "'}'", "'^'", 
			"'^='", "':'", "')'", "'.'", "'=='", "'=>'", "'='", "'>'", "'<'", "'<='", 
			"'-='", "'-'", "'--'", "'!='", "'!'", "'['", "'{'", "'('", "'|'", "'%'", 
			"'%='", "'+'", "'+='", "'++'", "'#'", "'|='", "'||'", "';'", "'/='", 
			"'/'", "'*'", "'*='", "'abstract'", "'as'", "'break'", "'case'", "'catch'", 
			"'class'", "'const'", "'continue'", "'default'", "'do'", "'dynamic'", 
			"'else'", "'enum'", "'extends'", "'false'", "'final'", "'finally'", "'for'", 
			"'if'", "'implements'", "'import'", "'in'", "'interface'", "'is'", "'let'", 
			"'library'", "'new'", "'null'", "'of'", "'on'", "'required'", "'rethrow'", 
			"'return'", "'static'", "'super'", "'switch'", "'this'", "'throw'", "'true'", 
			"'try'", "'var'", "'while'", "'_'", null, "'\"'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DATA_TYPE", "VOID", "INT_", "STRING_", "FLOAT_", "BOOLEAN_", "DOUBLE_", 
			"VALUES", "C_AND_F", "A", "AA", "AE", "AT", "C", "CB", "CBC", "CIR", 
			"CIRE", "CO", "CP", "D", "EE", "EG", "EQ", "GT", "LT", "LTE", "ME", "MINUS", 
			"MM", "NE", "NOT", "OB", "OBC", "OP", "P", "PC", "PE", "PL", "PLE", "PLPL", 
			"PO", "POE", "PP", "SC", "SE", "SL", "ST", "STE", "ABSTRACT_", "AS_", 
			"BREAK_", "CASE_", "CATCH_", "CLASS_", "CONST_", "CONTINUE_", "DEFAULT_", 
			"DO_", "DYNAMIC_", "ELSE_", "ENUM_", "EXTENDS_", "FALSE_", "FINAL_", 
			"FINALLY_", "FOR_", "IF_", "IMPLEMENTS_", "IMPORT_", "IN_", "INTERFACE_", 
			"IS_", "LET_", "LIBRARY_", "NEW_", "NULL_", "OF_", "ON_", "REQUIRED_", 
			"RETHROW_", "RETURN_", "STATIC_", "SUPER_", "SWITCH_", "THIS_", "THROW_", 
			"TRUE_", "TRY_", "VAR_", "WHILE_", "UNDERSCORE", "STRING", "QUTE", "QM", 
			"INT", "FLOAT", "DOUBLE", "BOOLEAN", "HEX_NUMBER", "SingleLineString", 
			"MultiLineString", "IDENTIFIER", "WHITESPACE", "SINGLE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlutterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			function();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			function_header();
			setState(43);
			function_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_headerContext extends ParserRuleContext {
		public Function_accessContext function_access() {
			return getRuleContext(Function_accessContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FlutterParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(FlutterParser.OP, 0); }
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public TerminalNode CP() { return getToken(FlutterParser.CP, 0); }
		public TerminalNode UNDERSCORE() { return getToken(FlutterParser.UNDERSCORE, 0); }
		public Function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFunction_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFunction_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFunction_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headerContext function_header() throws RecognitionException {
		Function_headerContext _localctx = new Function_headerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			function_access();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDERSCORE) {
				{
				setState(46);
				match(UNDERSCORE);
				}
			}

			setState(49);
			match(IDENTIFIER);
			setState(50);
			match(OP);
			setState(51);
			function_parameters();
			setState(52);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructureContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public List<ReturnContext> return_() {
			return getRuleContexts(ReturnContext.class);
		}
		public ReturnContext return_(int i) {
			return getRuleContext(ReturnContext.class,i);
		}
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(54);
				variable();
				}
				break;
			case 2:
				{
				setState(55);
				decl();
				}
				break;
			case 3:
				{
				setState(56);
				init();
				}
				break;
			case 4:
				{
				setState(57);
				function();
				}
				break;
			case 5:
				{
				setState(58);
				class_();
				}
				break;
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RETURN_) {
				{
				{
				setState(61);
				return_();
				}
				}
				setState(66);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode OBC() { return getToken(FlutterParser.OBC, 0); }
		public TerminalNode CBC() { return getToken(FlutterParser.CBC, 0); }
		public List<StructureContext> structure() {
			return getRuleContexts(StructureContext.class);
		}
		public StructureContext structure(int i) {
			return getRuleContext(StructureContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(OBC);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 37154696925807110L) != 0 || (((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 1049089L) != 0) {
				{
				{
				setState(68);
				structure();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(CBC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FlutterParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(FlutterParser.OP, 0); }
		public TerminalNode CP() { return getToken(FlutterParser.CP, 0); }
		public TerminalNode UNDERSCORE() { return getToken(FlutterParser.UNDERSCORE, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<Variable_callContext> variable_call() {
			return getRuleContexts(Variable_callContext.class);
		}
		public Variable_callContext variable_call(int i) {
			return getRuleContext(Variable_callContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDERSCORE) {
				{
				setState(76);
				match(UNDERSCORE);
				}
			}

			setState(79);
			match(IDENTIFIER);
			setState(80);
			match(OP);
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUES) {
					{
					{
					setState(81);
					argument();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(87);
					variable_call();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(95);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_parametersContext extends ParserRuleContext {
		public List<TerminalNode> DATA_TYPE() { return getTokens(FlutterParser.DATA_TYPE); }
		public TerminalNode DATA_TYPE(int i) {
			return getToken(FlutterParser.DATA_TYPE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(FlutterParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FlutterParser.IDENTIFIER, i);
		}
		public List<TerminalNode> C() { return getTokens(FlutterParser.C); }
		public TerminalNode C(int i) {
			return getToken(FlutterParser.C, i);
		}
		public List<TerminalNode> QM() { return getTokens(FlutterParser.QM); }
		public TerminalNode QM(int i) {
			return getToken(FlutterParser.QM, i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFunction_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFunction_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA_TYPE) {
				{
				setState(97);
				match(DATA_TYPE);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QM) {
					{
					setState(98);
					match(QM);
					}
				}

				setState(101);
				match(IDENTIFIER);
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==C) {
				{
				{
				setState(104);
				match(C);
				{
				setState(105);
				match(DATA_TYPE);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QM) {
					{
					setState(106);
					match(QM);
					}
				}

				setState(109);
				match(IDENTIFIER);
				}
				}
				}
				setState(114);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN_() { return getToken(FlutterParser.RETURN_, 0); }
		public TerminalNode SC() { return getToken(FlutterParser.SC, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public Variable_callContext variable_call() {
			return getRuleContext(Variable_callContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(RETURN_);
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(116);
				argument();
				}
				break;
			case 2:
				{
				setState(117);
				variable_call();
				}
				break;
			case 3:
				{
				setState(118);
				function_call();
				}
				break;
			}
			setState(121);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(FlutterParser.VALUES, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(VALUES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FlutterParser.IDENTIFIER, 0); }
		public Variable_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterVariable_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitVariable_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitVariable_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_callContext variable_call() throws RecognitionException {
		Variable_callContext _localctx = new Variable_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public Variable_accessContext variable_access() {
			return getRuleContext(Variable_accessContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FlutterParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(FlutterParser.EQ, 0); }
		public TerminalNode SC() { return getToken(FlutterParser.SC, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public Variable_callContext variable_call() {
			return getRuleContext(Variable_callContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(FlutterParser.UNDERSCORE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			variable_access();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDERSCORE) {
				{
				setState(128);
				match(UNDERSCORE);
				}
			}

			setState(131);
			match(IDENTIFIER);
			setState(132);
			match(EQ);
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				{
				setState(133);
				argument();
				}
				break;
			case IDENTIFIER:
				{
				setState(134);
				variable_call();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(137);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE() { return getToken(FlutterParser.DATA_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FlutterParser.IDENTIFIER, 0); }
		public TerminalNode SC() { return getToken(FlutterParser.SC, 0); }
		public TerminalNode QM() { return getToken(FlutterParser.QM, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(139);
			match(DATA_TYPE);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QM) {
				{
				setState(140);
				match(QM);
				}
			}

			setState(143);
			match(IDENTIFIER);
			setState(144);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(FlutterParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FlutterParser.IDENTIFIER, i);
		}
		public TerminalNode EQ() { return getToken(FlutterParser.EQ, 0); }
		public TerminalNode SC() { return getToken(FlutterParser.SC, 0); }
		public TerminalNode VALUES() { return getToken(FlutterParser.VALUES, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(IDENTIFIER);
			setState(147);
			match(EQ);
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(149);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_accessContext extends ParserRuleContext {
		public TerminalNode C_AND_F() { return getToken(FlutterParser.C_AND_F, 0); }
		public TerminalNode DATA_TYPE() { return getToken(FlutterParser.DATA_TYPE, 0); }
		public TerminalNode STATIC_() { return getToken(FlutterParser.STATIC_, 0); }
		public TerminalNode QM() { return getToken(FlutterParser.QM, 0); }
		public Variable_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterVariable_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitVariable_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitVariable_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_accessContext variable_access() throws RecognitionException {
		Variable_accessContext _localctx = new Variable_accessContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC_) {
					{
					setState(151);
					match(STATIC_);
					}
				}

				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==C_AND_F) {
					{
					setState(154);
					match(C_AND_F);
					}
				}

				setState(157);
				match(DATA_TYPE);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QM) {
					{
					setState(158);
					match(QM);
					}
				}

				}
				}
				break;
			case 2:
				{
				setState(161);
				match(C_AND_F);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_accessContext extends ParserRuleContext {
		public TerminalNode STATIC_() { return getToken(FlutterParser.STATIC_, 0); }
		public TerminalNode VOID() { return getToken(FlutterParser.VOID, 0); }
		public TerminalNode DATA_TYPE() { return getToken(FlutterParser.DATA_TYPE, 0); }
		public TerminalNode QM() { return getToken(FlutterParser.QM, 0); }
		public Function_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFunction_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFunction_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFunction_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_accessContext function_access() throws RecognitionException {
		Function_accessContext _localctx = new Function_accessContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC_) {
				{
				setState(164);
				match(STATIC_);
				}
			}

			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(167);
				match(VOID);
				}
				break;
			case DATA_TYPE:
				{
				setState(168);
				match(DATA_TYPE);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QM) {
					{
					setState(169);
					match(QM);
					}
				}

				}
				break;
			case UNDERSCORE:
			case IDENTIFIER:
				break;
			default:
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public Class_headerContext class_header() {
			return getRuleContext(Class_headerContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Extends_classContext extends_class() {
			return getRuleContext(Extends_classContext.class,0);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			class_header();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS_ || _la==IMPLEMENTS_) {
				{
				setState(175);
				extends_class();
				}
			}

			setState(178);
			class_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_headerContext extends ParserRuleContext {
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FlutterParser.IDENTIFIER, 0); }
		public TerminalNode UNDERSCORE() { return getToken(FlutterParser.UNDERSCORE, 0); }
		public Class_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterClass_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitClass_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitClass_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_headerContext class_header() throws RecognitionException {
		Class_headerContext _localctx = new Class_headerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_class_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			class_type();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDERSCORE) {
				{
				setState(181);
				match(UNDERSCORE);
				}
			}

			setState(184);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode OBC() { return getToken(FlutterParser.OBC, 0); }
		public TerminalNode CBC() { return getToken(FlutterParser.CBC, 0); }
		public List<StructureContext> structure() {
			return getRuleContexts(StructureContext.class);
		}
		public StructureContext structure(int i) {
			return getRuleContext(StructureContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(OBC);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 37154696925807110L) != 0 || (((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 1049089L) != 0) {
				{
				{
				setState(187);
				structure();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(193);
			match(CBC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_typeContext extends ParserRuleContext {
		public TerminalNode CLASS_() { return getToken(FlutterParser.CLASS_, 0); }
		public TerminalNode ABSTRACT_() { return getToken(FlutterParser.ABSTRACT_, 0); }
		public Class_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterClass_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitClass_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitClass_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_typeContext class_type() throws RecognitionException {
		Class_typeContext _localctx = new Class_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_class_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT_) {
				{
				setState(195);
				match(ABSTRACT_);
				}
			}

			setState(198);
			match(CLASS_);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Extends_classContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FlutterParser.IDENTIFIER, 0); }
		public TerminalNode EXTENDS_() { return getToken(FlutterParser.EXTENDS_, 0); }
		public TerminalNode IMPLEMENTS_() { return getToken(FlutterParser.IMPLEMENTS_, 0); }
		public Extends_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extends_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterExtends_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitExtends_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitExtends_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extends_classContext extends_class() throws RecognitionException {
		Extends_classContext _localctx = new Extends_classContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_extends_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(_la==EXTENDS_ || _la==IMPLEMENTS_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(201);
			match(IDENTIFIER);
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

	public static final String _serializedATN =
		"\u0004\u0001j\u00cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u00020\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003<\b\u0003\u0001\u0003"+
		"\u0005\u0003?\b\u0003\n\u0003\f\u0003B\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0005\u0004F\b\u0004\n\u0004\f\u0004I\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0003\u0005N\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005S\b\u0005\n\u0005\f\u0005V\t\u0005\u0001\u0005\u0005\u0005"+
		"Y\b\u0005\n\u0005\f\u0005\\\t\u0005\u0003\u0005^\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006d\b\u0006\u0001\u0006\u0003"+
		"\u0006g\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006l\b\u0006"+
		"\u0001\u0006\u0005\u0006o\b\u0006\n\u0006\f\u0006r\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007x\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u0082"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0088\b\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u008e\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0003\r\u0099"+
		"\b\r\u0001\r\u0003\r\u009c\b\r\u0001\r\u0001\r\u0003\r\u00a0\b\r\u0001"+
		"\r\u0003\r\u00a3\b\r\u0001\u000e\u0003\u000e\u00a6\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00ab\b\u000e\u0003\u000e\u00ad\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00b1\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00b7\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u00bd\b\u0011\n\u0011\f\u0011"+
		"\u00c0\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0003\u0012\u00c5\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0002\u0002\u0000\b\b"+
		"gg\u0002\u0000??EE\u00d8\u0000(\u0001\u0000\u0000\u0000\u0002*\u0001\u0000"+
		"\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000"+
		"\bC\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\ff\u0001\u0000"+
		"\u0000\u0000\u000es\u0001\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000"+
		"\u0012}\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016"+
		"\u008b\u0001\u0000\u0000\u0000\u0018\u0092\u0001\u0000\u0000\u0000\u001a"+
		"\u00a2\u0001\u0000\u0000\u0000\u001c\u00a5\u0001\u0000\u0000\u0000\u001e"+
		"\u00ae\u0001\u0000\u0000\u0000 \u00b4\u0001\u0000\u0000\u0000\"\u00ba"+
		"\u0001\u0000\u0000\u0000$\u00c4\u0001\u0000\u0000\u0000&\u00c8\u0001\u0000"+
		"\u0000\u0000()\u0003\u0002\u0001\u0000)\u0001\u0001\u0000\u0000\u0000"+
		"*+\u0003\u0004\u0002\u0000+,\u0003\b\u0004\u0000,\u0003\u0001\u0000\u0000"+
		"\u0000-/\u0003\u001c\u000e\u0000.0\u0005\\\u0000\u0000/.\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0005g\u0000"+
		"\u000023\u0005#\u0000\u000034\u0003\f\u0006\u000045\u0005\u0014\u0000"+
		"\u00005\u0005\u0001\u0000\u0000\u00006<\u0003\u0014\n\u00007<\u0003\u0016"+
		"\u000b\u00008<\u0003\u0018\f\u00009<\u0003\u0002\u0001\u0000:<\u0003\u001e"+
		"\u000f\u0000;6\u0001\u0000\u0000\u0000;7\u0001\u0000\u0000\u0000;8\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000"+
		"<@\u0001\u0000\u0000\u0000=?\u0003\u000e\u0007\u0000>=\u0001\u0000\u0000"+
		"\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000A\u0007\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"CG\u0005\"\u0000\u0000DF\u0003\u0006\u0003\u0000ED\u0001\u0000\u0000\u0000"+
		"FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005\u0010"+
		"\u0000\u0000K\t\u0001\u0000\u0000\u0000LN\u0005\\\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OP\u0005g\u0000\u0000P]\u0005#\u0000\u0000QS\u0003\u0010\b\u0000RQ\u0001"+
		"\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000U^\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000WY\u0003\u0012\t\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[^\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]T\u0001\u0000\u0000\u0000"+
		"]Z\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0005\u0014\u0000"+
		"\u0000`\u000b\u0001\u0000\u0000\u0000ac\u0005\u0001\u0000\u0000bd\u0005"+
		"_\u0000\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000eg\u0005g\u0000\u0000fa\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gp\u0001\u0000\u0000\u0000hi\u0005\u000e\u0000\u0000"+
		"ik\u0005\u0001\u0000\u0000jl\u0005_\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0005g\u0000\u0000"+
		"nh\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000q\r\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000sw\u0005R\u0000\u0000tx\u0003\u0010\b\u0000ux\u0003\u0012"+
		"\t\u0000vx\u0003\n\u0005\u0000wt\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000yz\u0005-\u0000\u0000z\u000f\u0001\u0000\u0000\u0000"+
		"{|\u0005\b\u0000\u0000|\u0011\u0001\u0000\u0000\u0000}~\u0005g\u0000\u0000"+
		"~\u0013\u0001\u0000\u0000\u0000\u007f\u0081\u0003\u001a\r\u0000\u0080"+
		"\u0082\u0005\\\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005g\u0000\u0000\u0084\u0087\u0005\u0018\u0000\u0000\u0085\u0088\u0003"+
		"\u0010\b\u0000\u0086\u0088\u0003\u0012\t\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005-\u0000\u0000\u008a\u0015\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0005\u0001\u0000\u0000\u008c\u008e\u0005_\u0000\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005g\u0000\u0000\u0090"+
		"\u0091\u0005-\u0000\u0000\u0091\u0017\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005g\u0000\u0000\u0093\u0094\u0005\u0018\u0000\u0000\u0094\u0095\u0007"+
		"\u0000\u0000\u0000\u0095\u0096\u0005-\u0000\u0000\u0096\u0019\u0001\u0000"+
		"\u0000\u0000\u0097\u0099\u0005S\u0000\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0005\t\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0005\u0001\u0000\u0000\u009e\u00a0\u0005_\u0000\u0000\u009f"+
		"\u009e\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a1\u00a3\u0005\t\u0000\u0000\u00a2\u0098"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u001b"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005S\u0000\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00ac\u0001"+
		"\u0000\u0000\u0000\u00a7\u00ad\u0005\u0002\u0000\u0000\u00a8\u00aa\u0005"+
		"\u0001\u0000\u0000\u00a9\u00ab\u0005_\u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u001d\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b0\u0003 \u0010\u0000\u00af\u00b1\u0003&\u0013\u0000"+
		"\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\"\u0011\u0000\u00b3"+
		"\u001f\u0001\u0000\u0000\u0000\u00b4\u00b6\u0003$\u0012\u0000\u00b5\u00b7"+
		"\u0005\\\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005"+
		"g\u0000\u0000\u00b9!\u0001\u0000\u0000\u0000\u00ba\u00be\u0005\"\u0000"+
		"\u0000\u00bb\u00bd\u0003\u0006\u0003\u0000\u00bc\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0010\u0000"+
		"\u0000\u00c2#\u0001\u0000\u0000\u0000\u00c3\u00c5\u00052\u0000\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u00057\u0000\u0000\u00c7%\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0007\u0001\u0000\u0000\u00c9\u00ca\u0005"+
		"g\u0000\u0000\u00ca\'\u0001\u0000\u0000\u0000\u001b/;@GMTZ]cfkpw\u0081"+
		"\u0087\u008d\u0098\u009b\u009f\u00a2\u00a5\u00aa\u00ac\u00b0\u00b6\u00be"+
		"\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}