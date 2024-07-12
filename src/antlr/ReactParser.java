// Generated from /home/social/IdeaProjects/React/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JsxComment=1, MultiLineComment=2, SingleLineComment=3, OpenBracket=4, 
		CloseBracket=5, OpenParen=6, CloseParen=7, OpenBrace=8, CloseBrace=9, 
		SemiColon=10, Comma=11, Assign=12, QuestionMark=13, QuestionMarkDot=14, 
		Colon=15, Ellipsis=16, Dot=17, PlusPlus=18, MinusMinus=19, Plus=20, Minus=21, 
		BitNot=22, Not=23, Multiply=24, Divide=25, Modulus=26, Power=27, NullCoalesce=28, 
		Hashtag=29, RightShiftArithmetic=30, LeftShiftArithmetic=31, RightShiftLogical=32, 
		LessThan=33, GreaterThan=34, LessThanEquals=35, GreaterThanEquals=36, 
		Equals_=37, NotEquals=38, IdentityEquals=39, IdentityNotEquals=40, BitAnd=41, 
		BitXOr=42, BitOr=43, And=44, Or=45, MultiplyAssign=46, DivideAssign=47, 
		ModulusAssign=48, PlusAssign=49, MinusAssign=50, LeftShiftArithmeticAssign=51, 
		RightShiftArithmeticAssign=52, RightShiftLogicalAssign=53, BitAndAssign=54, 
		BitXorAssign=55, BitOrAssign=56, PowerAssign=57, NullishCoalescingAssign=58, 
		Arrow=59, Render=60, NullLiteral=61, BooleanLiteral=62, DecimalLiteral=63, 
		UseEffect=64, UseState=65, UseRef=66, Break=67, Do=68, Instanceof=69, 
		Typeof=70, Case=71, Else=72, New=73, Var=74, Catch=75, Finally=76, Return=77, 
		Void=78, Continue=79, For=80, Switch=81, While=82, Debugger=83, Function_=84, 
		This=85, With=86, Default=87, If=88, Throw=89, Delete=90, In=91, Try=92, 
		As=93, From=94, Of=95, Yield=96, YieldStar=97, SingleQuote=98, DoubleQuote=99, 
		Class=100, Enum=101, Extends=102, Super=103, Const=104, Export=105, Import=106, 
		Async=107, Await=108, Implements=109, Let=110, Private=111, Public=112, 
		Interface=113, Package=114, Protected=115, Static=116, MapFunction=117, 
		Identifier=118, React_Component=119, StringLiteral=120, BackTick=121, 
		WhiteSpaces=122, LineTerminator=123, HtmlComment=124, CDataComment=125, 
		TemplateStringStartExpression=126, TemplateStringAtom=127, JsxOpeningElementBegin=128, 
		JsxOpeningElementEnd=129, JsxOpeningElementSlashEnd=130, JsxAssign=131, 
		JsxOpeningElementOpenBrace=132, JsxOpeningElementId=133, JsxOpeningElementWhiteSpaces=134, 
		JsxOpeningElementLineTerminator=135, JsxOpeningElementMultiLineComment=136, 
		JsxOpeningElementSingleLineComment=137, JsxAttributeValue=138, HtmlChardata=139, 
		JsxElementBegin=140, JsxChildrenOpeningElementBegin=141, JsxChildrenClosingElementSlashBegin=142, 
		JsxChildrenOpenBrace=143, JsxClosingElementEnd=144, JsxClosingElementId=145, 
		JsxClosingElementLineTerminator=146, JsxClosingElementWhiteSpaces=147;
	public static final int
		RULE_program = 0, RULE_importStatment = 1, RULE_namedImportStatment = 2, 
		RULE_defaultImportStatment = 3, RULE_listOfIdentifiers = 4, RULE_hook = 5, 
		RULE_exportStatment = 6, RULE_component = 7, RULE_classComponent = 8, 
		RULE_functionalComponent = 9, RULE_componentBody = 10, RULE_jsxReturnStatment = 11, 
		RULE_regularFunctionStart = 12, RULE_arrowFunctionStart = 13, RULE_params = 14, 
		RULE_statment = 15, RULE_functionStatment = 16, RULE_regularFunction = 17, 
		RULE_arrowFunction = 18, RULE_functionBody = 19, RULE_variableReturnStatment = 20, 
		RULE_ifStatment = 21, RULE_whileStatment = 22, RULE_conditionsList = 23, 
		RULE_condition = 24, RULE_compare = 25, RULE_hookDeclarationStatment = 26, 
		RULE_assignStatment = 27, RULE_equation = 28, RULE_operation = 29, RULE_useEffect = 30, 
		RULE_dependancyList = 31, RULE_useState = 32, RULE_useRef = 33, RULE_varDeclarationStatment = 34, 
		RULE_variable = 35, RULE_array = 36, RULE_object = 37, RULE_number = 38, 
		RULE_string = 39, RULE_varModifier = 40, RULE_eos = 41, RULE_jsxElement = 42, 
		RULE_jsxTagName = 43, RULE_jsxAttName = 44, RULE_jsxAttValue = 45, RULE_jsxAtt = 46, 
		RULE_jsxEleContent = 47, RULE_singleExpression = 48, RULE_arrayJsx = 49, 
		RULE_callbackFunction = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatment", "namedImportStatment", "defaultImportStatment", 
			"listOfIdentifiers", "hook", "exportStatment", "component", "classComponent", 
			"functionalComponent", "componentBody", "jsxReturnStatment", "regularFunctionStart", 
			"arrowFunctionStart", "params", "statment", "functionStatment", "regularFunction", 
			"arrowFunction", "functionBody", "variableReturnStatment", "ifStatment", 
			"whileStatment", "conditionsList", "condition", "compare", "hookDeclarationStatment", 
			"assignStatment", "equation", "operation", "useEffect", "dependancyList", 
			"useState", "useRef", "varDeclarationStatment", "variable", "array", 
			"object", "number", "string", "varModifier", "eos", "jsxElement", "jsxTagName", 
			"jsxAttName", "jsxAttValue", "jsxAtt", "jsxEleContent", "singleExpression", 
			"arrayJsx", "callbackFunction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'['", "']'", "'('", "')'", null, "'}'", "';'", 
			"','", null, "'?'", "'?.'", "':'", "'...'", "'.'", "'++'", "'--'", "'+'", 
			"'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'**'", "'??'", "'#'", "'>>'", 
			"'<<'", "'>>>'", null, null, "'<='", "'>='", "'=='", "'!='", "'==='", 
			"'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", "'%='", 
			"'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'**='", 
			"'??='", "'=>'", "'render'", "'null'", null, null, "'useEffect'", "'useState'", 
			"'useRef'", "'break'", "'do'", "'instanceof'", "'typeof'", "'case'", 
			"'else'", "'new'", "'var'", "'catch'", "'finally'", "'return'", "'void'", 
			"'continue'", "'for'", "'switch'", "'while'", "'debugger'", "'function'", 
			"'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", "'in'", 
			"'try'", "'as'", "'from'", "'of'", "'yield'", "'yield*'", "'''", "'\"'", 
			"'class'", "'enum'", "'extends'", "'super'", "'const'", "'export'", "'import'", 
			"'async'", "'await'", "'implements'", "'let'", "'private'", "'public'", 
			"'interface'", "'package'", "'protected'", "'static'", "'map'", null, 
			"'React.Component'", null, null, null, null, null, null, "'${'", null, 
			null, null, "'/>'", null, null, null, null, null, null, null, null, null, 
			null, null, "'</'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "JsxComment", "MultiLineComment", "SingleLineComment", "OpenBracket", 
			"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
			"SemiColon", "Comma", "Assign", "QuestionMark", "QuestionMarkDot", "Colon", 
			"Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", 
			"Not", "Multiply", "Divide", "Modulus", "Power", "NullCoalesce", "Hashtag", 
			"RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", "LessThan", 
			"GreaterThan", "LessThanEquals", "GreaterThanEquals", "Equals_", "NotEquals", 
			"IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", "BitOr", "And", 
			"Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", "PlusAssign", 
			"MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"PowerAssign", "NullishCoalescingAssign", "Arrow", "Render", "NullLiteral", 
			"BooleanLiteral", "DecimalLiteral", "UseEffect", "UseState", "UseRef", 
			"Break", "Do", "Instanceof", "Typeof", "Case", "Else", "New", "Var", 
			"Catch", "Finally", "Return", "Void", "Continue", "For", "Switch", "While", 
			"Debugger", "Function_", "This", "With", "Default", "If", "Throw", "Delete", 
			"In", "Try", "As", "From", "Of", "Yield", "YieldStar", "SingleQuote", 
			"DoubleQuote", "Class", "Enum", "Extends", "Super", "Const", "Export", 
			"Import", "Async", "Await", "Implements", "Let", "Private", "Public", 
			"Interface", "Package", "Protected", "Static", "MapFunction", "Identifier", 
			"React_Component", "StringLiteral", "BackTick", "WhiteSpaces", "LineTerminator", 
			"HtmlComment", "CDataComment", "TemplateStringStartExpression", "TemplateStringAtom", 
			"JsxOpeningElementBegin", "JsxOpeningElementEnd", "JsxOpeningElementSlashEnd", 
			"JsxAssign", "JsxOpeningElementOpenBrace", "JsxOpeningElementId", "JsxOpeningElementWhiteSpaces", 
			"JsxOpeningElementLineTerminator", "JsxOpeningElementMultiLineComment", 
			"JsxOpeningElementSingleLineComment", "JsxAttributeValue", "HtmlChardata", 
			"JsxElementBegin", "JsxChildrenOpeningElementBegin", "JsxChildrenClosingElementSlashBegin", 
			"JsxChildrenOpenBrace", "JsxClosingElementEnd", "JsxClosingElementId", 
			"JsxClosingElementLineTerminator", "JsxClosingElementWhiteSpaces"
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
	public String getGrammarFileName() { return "ReactParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReactParser.EOF, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 18092532572619777L) != 0)) {
				{
				{
				setState(102);
				statment();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatmentContext extends ParserRuleContext {
		public NamedImportStatmentContext namedImportStatment() {
			return getRuleContext(NamedImportStatmentContext.class,0);
		}
		public DefaultImportStatmentContext defaultImportStatment() {
			return getRuleContext(DefaultImportStatmentContext.class,0);
		}
		public ImportStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatmentContext importStatment() throws RecognitionException {
		ImportStatmentContext _localctx = new ImportStatmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatment);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				namedImportStatment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				defaultImportStatment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamedImportStatmentContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(ReactParser.Import, 0); }
		public ListOfIdentifiersContext listOfIdentifiers() {
			return getRuleContext(ListOfIdentifiersContext.class,0);
		}
		public TerminalNode From() { return getToken(ReactParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public NamedImportStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedImportStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterNamedImportStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitNamedImportStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitNamedImportStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedImportStatmentContext namedImportStatment() throws RecognitionException {
		NamedImportStatmentContext _localctx = new NamedImportStatmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_namedImportStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(Import);
			setState(115);
			listOfIdentifiers();
			setState(116);
			match(From);
			setState(117);
			match(StringLiteral);
			setState(118);
			eos();
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
	public static class DefaultImportStatmentContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(ReactParser.Import, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public ListOfIdentifiersContext listOfIdentifiers() {
			return getRuleContext(ListOfIdentifiersContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode From() { return getToken(ReactParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DefaultImportStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultImportStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDefaultImportStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDefaultImportStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDefaultImportStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultImportStatmentContext defaultImportStatment() throws RecognitionException {
		DefaultImportStatmentContext _localctx = new DefaultImportStatmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defaultImportStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(Import);
			setState(121);
			match(OpenBrace);
			setState(122);
			listOfIdentifiers();
			setState(123);
			match(CloseBrace);
			setState(124);
			match(From);
			setState(125);
			match(StringLiteral);
			setState(126);
			eos();
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
	public static class ListOfIdentifiersContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ReactParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactParser.Identifier, i);
		}
		public List<HookContext> hook() {
			return getRuleContexts(HookContext.class);
		}
		public HookContext hook(int i) {
			return getRuleContext(HookContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ListOfIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOfIdentifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterListOfIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitListOfIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitListOfIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOfIdentifiersContext listOfIdentifiers() throws RecognitionException {
		ListOfIdentifiersContext _localctx = new ListOfIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listOfIdentifiers);
		int _la;
		try {
			int _alt;
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(130);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Identifier:
							{
							setState(128);
							match(Identifier);
							}
							break;
						case UseEffect:
						case UseState:
						case UseRef:
							{
							setState(129);
							hook();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(133);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Comma) {
							{
							setState(132);
							match(Comma);
							}
						}

						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(142);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(140);
					match(Identifier);
					}
					break;
				case UseEffect:
				case UseState:
				case UseRef:
					{
					setState(141);
					hook();
					}
					break;
				case CloseBrace:
				case From:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class HookContext extends ParserRuleContext {
		public TerminalNode UseState() { return getToken(ReactParser.UseState, 0); }
		public TerminalNode UseRef() { return getToken(ReactParser.UseRef, 0); }
		public TerminalNode UseEffect() { return getToken(ReactParser.UseEffect, 0); }
		public HookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HookContext hook() throws RecognitionException {
		HookContext _localctx = new HookContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hook);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatmentContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(ReactParser.Export, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ReactParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactParser.Identifier, i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ExportStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatmentContext exportStatment() throws RecognitionException {
		ExportStatmentContext _localctx = new ExportStatmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exportStatment);
		int _la;
		try {
			int _alt;
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(Export);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Default) {
					{
					setState(150);
					match(Default);
					}
				}

				setState(153);
				match(Identifier);
				setState(154);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(Export);
				setState(156);
				match(OpenBrace);
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(157);
						match(Identifier);
						setState(159);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Comma) {
							{
							setState(158);
							match(Comma);
							}
						}

						}
						} 
					}
					setState(165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(166);
					match(Identifier);
					}
				}

				setState(169);
				match(CloseBrace);
				setState(170);
				eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public FunctionalComponentContext functionalComponent() {
			return getRuleContext(FunctionalComponentContext.class,0);
		}
		public ClassComponentContext classComponent() {
			return getRuleContext(ClassComponentContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_component);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Function_:
			case Const:
			case Let:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				functionalComponent();
				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				classComponent();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassComponentContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(ReactParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode Extends() { return getToken(ReactParser.Extends, 0); }
		public TerminalNode React_Component() { return getToken(ReactParser.React_Component, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode Render() { return getToken(ReactParser.Render, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public ClassComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterClassComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitClassComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitClassComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassComponentContext classComponent() throws RecognitionException {
		ClassComponentContext _localctx = new ClassComponentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(Class);
			setState(178);
			match(Identifier);
			setState(179);
			match(Extends);
			setState(180);
			match(React_Component);
			setState(181);
			match(OpenBrace);
			setState(182);
			match(Render);
			setState(183);
			match(OpenParen);
			setState(184);
			params();
			setState(185);
			match(CloseParen);
			setState(186);
			componentBody();
			setState(187);
			match(CloseBrace);
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
	public static class FunctionalComponentContext extends ParserRuleContext {
		public RegularFunctionStartContext regularFunctionStart() {
			return getRuleContext(RegularFunctionStartContext.class,0);
		}
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public ArrowFunctionStartContext arrowFunctionStart() {
			return getRuleContext(ArrowFunctionStartContext.class,0);
		}
		public FunctionalComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionalComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionalComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionalComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalComponentContext functionalComponent() throws RecognitionException {
		FunctionalComponentContext _localctx = new FunctionalComponentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionalComponent);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function_:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				regularFunctionStart();
				setState(190);
				componentBody();
				}
				break;
			case Var:
			case Const:
			case Let:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				arrowFunctionStart();
				setState(193);
				componentBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentBodyContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public JsxReturnStatmentContext jsxReturnStatment() {
			return getRuleContext(JsxReturnStatmentContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public ComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComponentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComponentBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComponentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyContext componentBody() throws RecognitionException {
		ComponentBodyContext _localctx = new ComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_componentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(OpenBrace);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 18092532572619777L) != 0)) {
				{
				{
				setState(198);
				statment();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			jsxReturnStatment();
			setState(205);
			match(CloseBrace);
			setState(206);
			eos();
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
	public static class JsxReturnStatmentContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<TerminalNode> LessThan() { return getTokens(ReactParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(ReactParser.LessThan, i);
		}
		public List<TerminalNode> GreaterThan() { return getTokens(ReactParser.GreaterThan); }
		public TerminalNode GreaterThan(int i) {
			return getToken(ReactParser.GreaterThan, i);
		}
		public TerminalNode Divide() { return getToken(ReactParser.Divide, 0); }
		public JsxReturnStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxReturnStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxReturnStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxReturnStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxReturnStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxReturnStatmentContext jsxReturnStatment() throws RecognitionException {
		JsxReturnStatmentContext _localctx = new JsxReturnStatmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jsxReturnStatment);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(Return);
				setState(209);
				match(OpenParen);
				setState(210);
				jsxElement();
				setState(211);
				match(CloseParen);
				setState(212);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(Return);
				setState(215);
				match(LessThan);
				setState(216);
				match(GreaterThan);
				setState(217);
				jsxElement();
				setState(218);
				match(LessThan);
				setState(219);
				match(Divide);
				setState(220);
				match(GreaterThan);
				setState(221);
				eos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(Return);
				setState(224);
				jsxElement();
				setState(225);
				eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RegularFunctionStartContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(ReactParser.Function_, 0); }
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public RegularFunctionStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterRegularFunctionStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitRegularFunctionStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitRegularFunctionStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionStartContext regularFunctionStart() throws RecognitionException {
		RegularFunctionStartContext _localctx = new RegularFunctionStartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_regularFunctionStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(Function_);
			setState(230);
			match(Identifier);
			setState(231);
			match(OpenParen);
			setState(232);
			params();
			setState(233);
			match(CloseParen);
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
	public static class ArrowFunctionStartContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode Arrow() { return getToken(ReactParser.Arrow, 0); }
		public ArrowFunctionStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrowFunctionStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrowFunctionStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrowFunctionStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionStartContext arrowFunctionStart() throws RecognitionException {
		ArrowFunctionStartContext _localctx = new ArrowFunctionStartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrowFunctionStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			varModifier();
			setState(236);
			match(Identifier);
			setState(237);
			match(Assign);
			setState(238);
			match(OpenParen);
			setState(239);
			params();
			setState(240);
			match(CloseParen);
			setState(241);
			match(Arrow);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036854775536L) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				{
				setState(243);
				variable();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(244);
					match(Comma);
					}
				}

				}
				}
				setState(251);
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
	public static class StatmentContext extends ParserRuleContext {
		public VarDeclarationStatmentContext varDeclarationStatment() {
			return getRuleContext(VarDeclarationStatmentContext.class,0);
		}
		public HookDeclarationStatmentContext hookDeclarationStatment() {
			return getRuleContext(HookDeclarationStatmentContext.class,0);
		}
		public AssignStatmentContext assignStatment() {
			return getRuleContext(AssignStatmentContext.class,0);
		}
		public IfStatmentContext ifStatment() {
			return getRuleContext(IfStatmentContext.class,0);
		}
		public WhileStatmentContext whileStatment() {
			return getRuleContext(WhileStatmentContext.class,0);
		}
		public FunctionStatmentContext functionStatment() {
			return getRuleContext(FunctionStatmentContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ImportStatmentContext importStatment() {
			return getRuleContext(ImportStatmentContext.class,0);
		}
		public ExportStatmentContext exportStatment() {
			return getRuleContext(ExportStatmentContext.class,0);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statment);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				varDeclarationStatment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				hookDeclarationStatment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				assignStatment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				ifStatment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				whileStatment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				functionStatment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				component();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
				importStatment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(260);
				exportStatment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatmentContext extends ParserRuleContext {
		public RegularFunctionContext regularFunction() {
			return getRuleContext(RegularFunctionContext.class,0);
		}
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public FunctionStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatmentContext functionStatment() throws RecognitionException {
		FunctionStatmentContext _localctx = new FunctionStatmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionStatment);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function_:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				regularFunction();
				}
				break;
			case Var:
			case Const:
			case Let:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				arrowFunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RegularFunctionContext extends ParserRuleContext {
		public RegularFunctionStartContext regularFunctionStart() {
			return getRuleContext(RegularFunctionStartContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public RegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterRegularFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitRegularFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionContext regularFunction() throws RecognitionException {
		RegularFunctionContext _localctx = new RegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_regularFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			regularFunctionStart();
			setState(268);
			functionBody();
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
	public static class ArrowFunctionContext extends ParserRuleContext {
		public ArrowFunctionStartContext arrowFunctionStart() {
			return getRuleContext(ArrowFunctionStartContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			arrowFunctionStart();
			setState(271);
			functionBody();
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
	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public VariableReturnStatmentContext variableReturnStatment() {
			return getRuleContext(VariableReturnStatmentContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(OpenBrace);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 18092532572619777L) != 0)) {
				{
				{
				setState(274);
				statment();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			variableReturnStatment();
			setState(281);
			match(CloseBrace);
			setState(282);
			eos();
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
	public static class VariableReturnStatmentContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VariableReturnStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReturnStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableReturnStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableReturnStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableReturnStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReturnStatmentContext variableReturnStatment() throws RecognitionException {
		VariableReturnStatmentContext _localctx = new VariableReturnStatmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableReturnStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(Return);
			setState(285);
			variable();
			setState(286);
			eos();
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
	public static class IfStatmentContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ReactParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ConditionsListContext conditionsList() {
			return getRuleContext(ConditionsListContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public IfStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIfStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIfStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIfStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatmentContext ifStatment() throws RecognitionException {
		IfStatmentContext _localctx = new IfStatmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(If);
			setState(289);
			match(OpenParen);
			setState(290);
			conditionsList();
			setState(291);
			match(CloseParen);
			setState(292);
			match(OpenBrace);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 18092532572619777L) != 0)) {
				{
				{
				setState(293);
				statment();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(CloseBrace);
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
	public static class WhileStatmentContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(ReactParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ConditionsListContext conditionsList() {
			return getRuleContext(ConditionsListContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public WhileStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWhileStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWhileStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWhileStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatmentContext whileStatment() throws RecognitionException {
		WhileStatmentContext _localctx = new WhileStatmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(While);
			setState(302);
			match(OpenParen);
			setState(303);
			conditionsList();
			setState(304);
			match(CloseParen);
			setState(305);
			match(OpenBrace);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 18092532572619777L) != 0)) {
				{
				{
				setState(306);
				statment();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			match(CloseBrace);
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
	public static class ConditionsListContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(ReactParser.And); }
		public TerminalNode And(int i) {
			return getToken(ReactParser.And, i);
		}
		public List<TerminalNode> Or() { return getTokens(ReactParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(ReactParser.Or, i);
		}
		public ConditionsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterConditionsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitConditionsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitConditionsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsListContext conditionsList() throws RecognitionException {
		ConditionsListContext _localctx = new ConditionsListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditionsList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(314);
					condition();
					setState(315);
					_la = _input.LA(1);
					if ( !(_la==And || _la==Or) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(322);
			condition();
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
	public static class ConditionContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condition);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenParen) {
					{
					setState(324);
					match(OpenParen);
					}
				}

				setState(327);
				variable();
				setState(328);
				compare();
				setState(329);
				variable();
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(330);
					match(CloseParen);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				variable();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends ParserRuleContext {
		public TerminalNode GreaterThan() { return getToken(ReactParser.GreaterThan, 0); }
		public TerminalNode LessThan() { return getToken(ReactParser.LessThan, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ReactParser.GreaterThanEquals, 0); }
		public TerminalNode LessThanEquals() { return getToken(ReactParser.LessThanEquals, 0); }
		public TerminalNode Equals_() { return getToken(ReactParser.Equals_, 0); }
		public TerminalNode NotEquals() { return getToken(ReactParser.NotEquals, 0); }
		public TerminalNode IdentityEquals() { return getToken(ReactParser.IdentityEquals, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(ReactParser.IdentityNotEquals, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2190433320960L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class HookDeclarationStatmentContext extends ParserRuleContext {
		public UseEffectContext useEffect() {
			return getRuleContext(UseEffectContext.class,0);
		}
		public UseStateContext useState() {
			return getRuleContext(UseStateContext.class,0);
		}
		public UseRefContext useRef() {
			return getRuleContext(UseRefContext.class,0);
		}
		public HookDeclarationStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hookDeclarationStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHookDeclarationStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHookDeclarationStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHookDeclarationStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HookDeclarationStatmentContext hookDeclarationStatment() throws RecognitionException {
		HookDeclarationStatmentContext _localctx = new HookDeclarationStatmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_hookDeclarationStatment);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				useEffect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				useState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				useRef();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public AssignStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAssignStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAssignStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAssignStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatmentContext assignStatment() throws RecognitionException {
		AssignStatmentContext _localctx = new AssignStatmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(Identifier);
			setState(344);
			match(Assign);
			setState(345);
			variable();
			setState(346);
			eos();
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
	public static class EquationContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		return equation(0);
	}

	private EquationContext equation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EquationContext _localctx = new EquationContext(_ctx, _parentState);
		EquationContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_equation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(349);
			number();
			}
			_ctx.stop = _input.LT(-1);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EquationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equation);
					setState(351);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(352);
					operation();
					setState(353);
					equation(3);
					}
					} 
				}
				setState(359);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(ReactParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(ReactParser.Minus, 0); }
		public TerminalNode Divide() { return getToken(ReactParser.Divide, 0); }
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 53477376L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseEffectContext extends ParserRuleContext {
		public TerminalNode UseEffect() { return getToken(ReactParser.UseEffect, 0); }
		public List<TerminalNode> OpenParen() { return getTokens(ReactParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(ReactParser.OpenParen, i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<TerminalNode> CloseParen() { return getTokens(ReactParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(ReactParser.CloseParen, i);
		}
		public TerminalNode Arrow() { return getToken(ReactParser.Arrow, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode Comma() { return getToken(ReactParser.Comma, 0); }
		public DependancyListContext dependancyList() {
			return getRuleContext(DependancyListContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public UseEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectContext useEffect() throws RecognitionException {
		UseEffectContext _localctx = new UseEffectContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_useEffect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(UseEffect);
			setState(363);
			match(OpenParen);
			setState(364);
			match(OpenParen);
			setState(365);
			params();
			setState(366);
			match(CloseParen);
			setState(367);
			match(Arrow);
			setState(368);
			match(OpenBrace);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 18092532572619777L) != 0)) {
				{
				{
				setState(369);
				statment();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			match(CloseBrace);
			setState(376);
			match(Comma);
			setState(377);
			dependancyList();
			setState(378);
			match(CloseParen);
			setState(379);
			eos();
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
	public static class DependancyListContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public DependancyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependancyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDependancyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDependancyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDependancyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependancyListContext dependancyList() throws RecognitionException {
		DependancyListContext _localctx = new DependancyListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dependancyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			array();
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
	public static class UseStateContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ReactParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactParser.Identifier, i);
		}
		public TerminalNode Comma() { return getToken(ReactParser.Comma, 0); }
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode UseState() { return getToken(ReactParser.UseState, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public UseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStateContext useState() throws RecognitionException {
		UseStateContext _localctx = new UseStateContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_useState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			varModifier();
			setState(384);
			match(OpenBracket);
			setState(385);
			match(Identifier);
			setState(386);
			match(Comma);
			setState(387);
			match(Identifier);
			setState(388);
			match(CloseBracket);
			setState(389);
			match(Assign);
			setState(390);
			match(UseState);
			setState(391);
			match(OpenParen);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036854775536L) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(392);
				variable();
				}
			}

			setState(395);
			match(CloseParen);
			setState(396);
			eos();
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
	public static class UseRefContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode UseRef() { return getToken(ReactParser.UseRef, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public UseRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseRefContext useRef() throws RecognitionException {
		UseRefContext _localctx = new UseRefContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_useRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			varModifier();
			setState(399);
			match(Identifier);
			setState(400);
			match(Assign);
			setState(401);
			match(UseRef);
			setState(402);
			match(OpenParen);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036854775536L) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(403);
				variable();
				}
			}

			setState(406);
			match(CloseParen);
			setState(407);
			eos();
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
	public static class VarDeclarationStatmentContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VarDeclarationStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarationStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVarDeclarationStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVarDeclarationStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVarDeclarationStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationStatmentContext varDeclarationStatment() throws RecognitionException {
		VarDeclarationStatmentContext _localctx = new VarDeclarationStatmentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_varDeclarationStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			varModifier();
			setState(410);
			match(Identifier);
			setState(411);
			match(Assign);
			setState(412);
			variable();
			setState(413);
			eos();
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
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variable);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				array();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				object();
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				equation(0);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				string();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(419);
				match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(OpenBracket);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036854775536L) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				{
				setState(423);
				variable();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(424);
					match(Comma);
					}
				}

				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			match(CloseBracket);
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
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ReactParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactParser.Identifier, i);
		}
		public List<TerminalNode> Colon() { return getTokens(ReactParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(ReactParser.Colon, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(OpenBrace);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(435);
				match(Identifier);
				setState(436);
				match(Colon);
				setState(437);
				variable();
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(438);
					match(Comma);
					}
				}

				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			match(CloseBrace);
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
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(ReactParser.DecimalLiteral, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(DecimalLiteral);
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
	public static class StringContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(StringLiteral);
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
	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(ReactParser.Var, 0); }
		public TerminalNode Let() { return getToken(ReactParser.Let, 0); }
		public TerminalNode Const() { return getToken(ReactParser.Const, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVarModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVarModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVarModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 69793218561L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(SemiColon);
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
	public static class JsxElementContext extends ParserRuleContext {
		public List<TerminalNode> LessThan() { return getTokens(ReactParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(ReactParser.LessThan, i);
		}
		public List<JsxTagNameContext> jsxTagName() {
			return getRuleContexts(JsxTagNameContext.class);
		}
		public JsxTagNameContext jsxTagName(int i) {
			return getRuleContext(JsxTagNameContext.class,i);
		}
		public List<TerminalNode> GreaterThan() { return getTokens(ReactParser.GreaterThan); }
		public TerminalNode GreaterThan(int i) {
			return getToken(ReactParser.GreaterThan, i);
		}
		public TerminalNode Divide() { return getToken(ReactParser.Divide, 0); }
		public List<JsxAttContext> jsxAtt() {
			return getRuleContexts(JsxAttContext.class);
		}
		public JsxAttContext jsxAtt(int i) {
			return getRuleContext(JsxAttContext.class,i);
		}
		public List<JsxEleContentContext> jsxEleContent() {
			return getRuleContexts(JsxEleContentContext.class);
		}
		public JsxEleContentContext jsxEleContent(int i) {
			return getRuleContext(JsxEleContentContext.class,i);
		}
		public JsxElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementContext jsxElement() throws RecognitionException {
		JsxElementContext _localctx = new JsxElementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_jsxElement);
		int _la;
		try {
			int _alt;
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				match(LessThan);
				setState(457);
				jsxTagName();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(458);
					jsxAtt();
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(464);
				match(GreaterThan);
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(465);
						jsxEleContent();
						}
						} 
					}
					setState(470);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(471);
				match(LessThan);
				setState(472);
				match(Divide);
				setState(473);
				jsxTagName();
				setState(474);
				match(GreaterThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(LessThan);
				setState(477);
				jsxTagName();
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(478);
					jsxAtt();
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(484);
				match(Divide);
				setState(485);
				match(GreaterThan);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxTagNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public JsxTagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxTagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxTagNameContext jsxTagName() throws RecognitionException {
		JsxTagNameContext _localctx = new JsxTagNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_jsxTagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(Identifier);
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
	public static class JsxAttNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public JsxAttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttNameContext jsxAttName() throws RecognitionException {
		JsxAttNameContext _localctx = new JsxAttNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_jsxAttName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(Identifier);
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
	public static class JsxAttValueContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public JsxAttValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxAttValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxAttValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxAttValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttValueContext jsxAttValue() throws RecognitionException {
		JsxAttValueContext _localctx = new JsxAttValueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_jsxAttValue);
		int _la;
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(OpenBrace);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036854775536L) != 0) || _la==Identifier || _la==StringLiteral) {
					{
					setState(495);
					variable();
					}
				}

				setState(498);
				match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttContext extends ParserRuleContext {
		public JsxAttNameContext jsxAttName() {
			return getRuleContext(JsxAttNameContext.class,0);
		}
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public JsxAttValueContext jsxAttValue() {
			return getRuleContext(JsxAttValueContext.class,0);
		}
		public JsxAttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAtt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxAtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxAtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttContext jsxAtt() throws RecognitionException {
		JsxAttContext _localctx = new JsxAttContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_jsxAtt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			jsxAttName();
			setState(502);
			match(Assign);
			setState(503);
			jsxAttValue();
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
	public static class JsxEleContentContext extends ParserRuleContext {
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public JsxEleContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxEleContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxEleContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxEleContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxEleContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxEleContentContext jsxEleContent() throws RecognitionException {
		JsxEleContentContext _localctx = new JsxEleContentContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_jsxEleContent);
		int _la;
		try {
			int _alt;
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				jsxElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(506);
					singleExpression();
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(512);
				match(OpenBrace);
				setState(513);
				singleExpression();
				setState(514);
				match(CloseBrace);
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(515);
						singleExpression();
						}
						} 
					}
					setState(520);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				singleExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SingleExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public ArrayJsxContext arrayJsx() {
			return getRuleContext(ArrayJsxContext.class,0);
		}
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_singleExpression);
		try {
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				arrayJsx();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayJsxContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode Dot() { return getToken(ReactParser.Dot, 0); }
		public TerminalNode MapFunction() { return getToken(ReactParser.MapFunction, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public CallbackFunctionContext callbackFunction() {
			return getRuleContext(CallbackFunctionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public ArrayJsxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayJsx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayJsx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayJsx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayJsx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayJsxContext arrayJsx() throws RecognitionException {
		ArrayJsxContext _localctx = new ArrayJsxContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arrayJsx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(Identifier);
			setState(529);
			match(Dot);
			setState(530);
			match(MapFunction);
			setState(531);
			match(OpenParen);
			setState(532);
			callbackFunction();
			setState(533);
			match(CloseParen);
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
	public static class CallbackFunctionContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode Arrow() { return getToken(ReactParser.Arrow, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public JsxReturnStatmentContext jsxReturnStatment() {
			return getRuleContext(JsxReturnStatmentContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public CallbackFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callbackFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCallbackFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCallbackFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCallbackFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallbackFunctionContext callbackFunction() throws RecognitionException {
		CallbackFunctionContext _localctx = new CallbackFunctionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_callbackFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(OpenParen);
			setState(536);
			params();
			setState(537);
			match(CloseParen);
			setState(538);
			match(Arrow);
			setState(539);
			match(OpenBrace);
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 18092532572619777L) != 0)) {
				{
				{
				setState(540);
				statment();
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(546);
			jsxReturnStatment();
			setState(547);
			match(CloseBrace);
			setState(548);
			eos();
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
		case 28:
			return equation_sempred((EquationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean equation_sempred(EquationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0093\u0227\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u0001\u0000\u0005\u0000h\b\u0000\n\u0000\f\u0000k\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001q\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u0083\b\u0004"+
		"\u0001\u0004\u0003\u0004\u0086\b\u0004\u0005\u0004\u0088\b\u0004\n\u0004"+
		"\f\u0004\u008b\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008f\b\u0004"+
		"\u0001\u0004\u0003\u0004\u0092\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0098\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a0\b\u0006\u0005\u0006"+
		"\u00a2\b\u0006\n\u0006\f\u0006\u00a5\t\u0006\u0001\u0006\u0003\u0006\u00a8"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ac\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00b0\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c4\b\t\u0001\n\u0001"+
		"\n\u0005\n\u00c8\b\n\n\n\f\n\u00cb\t\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00e4\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u00f6\b\u000e\u0005\u000e"+
		"\u00f8\b\u000e\n\u000e\f\u000e\u00fb\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0106\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u010a"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u0114\b\u0013\n\u0013\f\u0013"+
		"\u0117\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0127\b\u0015\n\u0015"+
		"\f\u0015\u012a\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0134\b\u0016"+
		"\n\u0016\f\u0016\u0137\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u013e\b\u0017\n\u0017\f\u0017\u0141\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0003\u0018\u0146\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u014c\b\u0018\u0001\u0018"+
		"\u0003\u0018\u014f\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0156\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0164\b\u001c\n\u001c"+
		"\f\u001c\u0167\t\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u0173\b\u001e\n\u001e\f\u001e\u0176\t\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0001 \u0003 \u018a\b \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u0195\b!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01a5"+
		"\b#\u0001$\u0001$\u0001$\u0003$\u01aa\b$\u0005$\u01ac\b$\n$\f$\u01af\t"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01b8\b%\u0005"+
		"%\u01ba\b%\n%\f%\u01bd\t%\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001*\u0005*\u01cc\b*\n*\f"+
		"*\u01cf\t*\u0001*\u0001*\u0005*\u01d3\b*\n*\f*\u01d6\t*\u0001*\u0001*"+
		"\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u01e0\b*\n*\f*\u01e3"+
		"\t*\u0001*\u0001*\u0001*\u0003*\u01e8\b*\u0001+\u0001+\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0003-\u01f1\b-\u0001-\u0003-\u01f4\b-\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0005/\u01fc\b/\n/\f/\u01ff\t/\u0001/\u0001/\u0001"+
		"/\u0001/\u0005/\u0205\b/\n/\f/\u0208\t/\u0001/\u0003/\u020b\b/\u00010"+
		"\u00010\u00030\u020f\b0\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00012\u00012\u00052\u021e\b2\n2\f2\u0221"+
		"\t2\u00012\u00012\u00012\u00012\u00012\u0000\u000183\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0005\u0001\u0000@B\u0001\u0000"+
		",-\u0001\u0000!(\u0002\u0000\u0014\u0015\u0018\u0019\u0003\u0000JJhhn"+
		"n\u0231\u0000i\u0001\u0000\u0000\u0000\u0002p\u0001\u0000\u0000\u0000"+
		"\u0004r\u0001\u0000\u0000\u0000\u0006x\u0001\u0000\u0000\u0000\b\u0091"+
		"\u0001\u0000\u0000\u0000\n\u0093\u0001\u0000\u0000\u0000\f\u00ab\u0001"+
		"\u0000\u0000\u0000\u000e\u00af\u0001\u0000\u0000\u0000\u0010\u00b1\u0001"+
		"\u0000\u0000\u0000\u0012\u00c3\u0001\u0000\u0000\u0000\u0014\u00c5\u0001"+
		"\u0000\u0000\u0000\u0016\u00e3\u0001\u0000\u0000\u0000\u0018\u00e5\u0001"+
		"\u0000\u0000\u0000\u001a\u00eb\u0001\u0000\u0000\u0000\u001c\u00f9\u0001"+
		"\u0000\u0000\u0000\u001e\u0105\u0001\u0000\u0000\u0000 \u0109\u0001\u0000"+
		"\u0000\u0000\"\u010b\u0001\u0000\u0000\u0000$\u010e\u0001\u0000\u0000"+
		"\u0000&\u0111\u0001\u0000\u0000\u0000(\u011c\u0001\u0000\u0000\u0000*"+
		"\u0120\u0001\u0000\u0000\u0000,\u012d\u0001\u0000\u0000\u0000.\u013f\u0001"+
		"\u0000\u0000\u00000\u014e\u0001\u0000\u0000\u00002\u0150\u0001\u0000\u0000"+
		"\u00004\u0155\u0001\u0000\u0000\u00006\u0157\u0001\u0000\u0000\u00008"+
		"\u015c\u0001\u0000\u0000\u0000:\u0168\u0001\u0000\u0000\u0000<\u016a\u0001"+
		"\u0000\u0000\u0000>\u017d\u0001\u0000\u0000\u0000@\u017f\u0001\u0000\u0000"+
		"\u0000B\u018e\u0001\u0000\u0000\u0000D\u0199\u0001\u0000\u0000\u0000F"+
		"\u01a4\u0001\u0000\u0000\u0000H\u01a6\u0001\u0000\u0000\u0000J\u01b2\u0001"+
		"\u0000\u0000\u0000L\u01c0\u0001\u0000\u0000\u0000N\u01c2\u0001\u0000\u0000"+
		"\u0000P\u01c4\u0001\u0000\u0000\u0000R\u01c6\u0001\u0000\u0000\u0000T"+
		"\u01e7\u0001\u0000\u0000\u0000V\u01e9\u0001\u0000\u0000\u0000X\u01eb\u0001"+
		"\u0000\u0000\u0000Z\u01f3\u0001\u0000\u0000\u0000\\\u01f5\u0001\u0000"+
		"\u0000\u0000^\u020a\u0001\u0000\u0000\u0000`\u020e\u0001\u0000\u0000\u0000"+
		"b\u0210\u0001\u0000\u0000\u0000d\u0217\u0001\u0000\u0000\u0000fh\u0003"+
		"\u001e\u000f\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000lm\u0005\u0000\u0000\u0001m\u0001\u0001"+
		"\u0000\u0000\u0000nq\u0003\u0004\u0002\u0000oq\u0003\u0006\u0003\u0000"+
		"pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u0003\u0001\u0000"+
		"\u0000\u0000rs\u0005j\u0000\u0000st\u0003\b\u0004\u0000tu\u0005^\u0000"+
		"\u0000uv\u0005x\u0000\u0000vw\u0003R)\u0000w\u0005\u0001\u0000\u0000\u0000"+
		"xy\u0005j\u0000\u0000yz\u0005\b\u0000\u0000z{\u0003\b\u0004\u0000{|\u0005"+
		"\t\u0000\u0000|}\u0005^\u0000\u0000}~\u0005x\u0000\u0000~\u007f\u0003"+
		"R)\u0000\u007f\u0007\u0001\u0000\u0000\u0000\u0080\u0083\u0005v\u0000"+
		"\u0000\u0081\u0083\u0003\n\u0005\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000"+
		"\u0084\u0086\u0005\u000b\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000"+
		"\u0087\u0082\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u008e\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0005v\u0000\u0000\u008d\u008f\u0003\n\u0005\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0001\u0000\u0000\u0000\u0091\u0089\u0001\u0000\u0000\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\t\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0007\u0000\u0000\u0000\u0094\u000b\u0001\u0000\u0000\u0000\u0095\u0097"+
		"\u0005i\u0000\u0000\u0096\u0098\u0005W\u0000\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005v\u0000\u0000\u009a\u00ac\u0003R)\u0000"+
		"\u009b\u009c\u0005i\u0000\u0000\u009c\u00a3\u0005\b\u0000\u0000\u009d"+
		"\u009f\u0005v\u0000\u0000\u009e\u00a0\u0005\u000b\u0000\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a2\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005v\u0000\u0000\u00a7\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0005\t\u0000\u0000\u00aa\u00ac\u0003R"+
		")\u0000\u00ab\u0095\u0001\u0000\u0000\u0000\u00ab\u009b\u0001\u0000\u0000"+
		"\u0000\u00ac\r\u0001\u0000\u0000\u0000\u00ad\u00b0\u0003\u0012\t\u0000"+
		"\u00ae\u00b0\u0003\u0010\b\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u000f\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0005d\u0000\u0000\u00b2\u00b3\u0005v\u0000\u0000\u00b3\u00b4\u0005"+
		"f\u0000\u0000\u00b4\u00b5\u0005w\u0000\u0000\u00b5\u00b6\u0005\b\u0000"+
		"\u0000\u00b6\u00b7\u0005<\u0000\u0000\u00b7\u00b8\u0005\u0006\u0000\u0000"+
		"\u00b8\u00b9\u0003\u001c\u000e\u0000\u00b9\u00ba\u0005\u0007\u0000\u0000"+
		"\u00ba\u00bb\u0003\u0014\n\u0000\u00bb\u00bc\u0005\t\u0000\u0000\u00bc"+
		"\u0011\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\u0018\f\u0000\u00be\u00bf"+
		"\u0003\u0014\n\u0000\u00bf\u00c4\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003"+
		"\u001a\r\u0000\u00c1\u00c2\u0003\u0014\n\u0000\u00c2\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c3\u00bd\u0001\u0000\u0000\u0000\u00c3\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c4\u0013\u0001\u0000\u0000\u0000\u00c5\u00c9\u0005\b\u0000"+
		"\u0000\u00c6\u00c8\u0003\u001e\u000f\u0000\u00c7\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0003\u0016\u000b"+
		"\u0000\u00cd\u00ce\u0005\t\u0000\u0000\u00ce\u00cf\u0003R)\u0000\u00cf"+
		"\u0015\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005M\u0000\u0000\u00d1\u00d2"+
		"\u0005\u0006\u0000\u0000\u00d2\u00d3\u0003T*\u0000\u00d3\u00d4\u0005\u0007"+
		"\u0000\u0000\u00d4\u00d5\u0003R)\u0000\u00d5\u00e4\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0005M\u0000\u0000\u00d7\u00d8\u0005!\u0000\u0000\u00d8\u00d9"+
		"\u0005\"\u0000\u0000\u00d9\u00da\u0003T*\u0000\u00da\u00db\u0005!\u0000"+
		"\u0000\u00db\u00dc\u0005\u0019\u0000\u0000\u00dc\u00dd\u0005\"\u0000\u0000"+
		"\u00dd\u00de\u0003R)\u0000\u00de\u00e4\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005M\u0000\u0000\u00e0\u00e1\u0003T*\u0000\u00e1\u00e2\u0003R)\u0000"+
		"\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00d0\u0001\u0000\u0000\u0000"+
		"\u00e3\u00d6\u0001\u0000\u0000\u0000\u00e3\u00df\u0001\u0000\u0000\u0000"+
		"\u00e4\u0017\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005T\u0000\u0000\u00e6"+
		"\u00e7\u0005v\u0000\u0000\u00e7\u00e8\u0005\u0006\u0000\u0000\u00e8\u00e9"+
		"\u0003\u001c\u000e\u0000\u00e9\u00ea\u0005\u0007\u0000\u0000\u00ea\u0019"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0003P(\u0000\u00ec\u00ed\u0005v"+
		"\u0000\u0000\u00ed\u00ee\u0005\f\u0000\u0000\u00ee\u00ef\u0005\u0006\u0000"+
		"\u0000\u00ef\u00f0\u0003\u001c\u000e\u0000\u00f0\u00f1\u0005\u0007\u0000"+
		"\u0000\u00f1\u00f2\u0005;\u0000\u0000\u00f2\u001b\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f5\u0003F#\u0000\u00f4\u00f6\u0005\u000b\u0000\u0000\u00f5\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001\u0000\u0000\u0000\u00f8\u00fb"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fa\u001d\u0001\u0000\u0000\u0000\u00fb\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fc\u0106\u0003D\"\u0000\u00fd\u0106\u0003"+
		"4\u001a\u0000\u00fe\u0106\u00036\u001b\u0000\u00ff\u0106\u0003*\u0015"+
		"\u0000\u0100\u0106\u0003,\u0016\u0000\u0101\u0106\u0003 \u0010\u0000\u0102"+
		"\u0106\u0003\u000e\u0007\u0000\u0103\u0106\u0003\u0002\u0001\u0000\u0104"+
		"\u0106\u0003\f\u0006\u0000\u0105\u00fc\u0001\u0000\u0000\u0000\u0105\u00fd"+
		"\u0001\u0000\u0000\u0000\u0105\u00fe\u0001\u0000\u0000\u0000\u0105\u00ff"+
		"\u0001\u0000\u0000\u0000\u0105\u0100\u0001\u0000\u0000\u0000\u0105\u0101"+
		"\u0001\u0000\u0000\u0000\u0105\u0102\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u001f"+
		"\u0001\u0000\u0000\u0000\u0107\u010a\u0003\"\u0011\u0000\u0108\u010a\u0003"+
		"$\u0012\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000"+
		"\u0000\u0000\u010a!\u0001\u0000\u0000\u0000\u010b\u010c\u0003\u0018\f"+
		"\u0000\u010c\u010d\u0003&\u0013\u0000\u010d#\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0003\u001a\r\u0000\u010f\u0110\u0003&\u0013\u0000\u0110%\u0001"+
		"\u0000\u0000\u0000\u0111\u0115\u0005\b\u0000\u0000\u0112\u0114\u0003\u001e"+
		"\u000f\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000"+
		"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0003(\u0014\u0000\u0119\u011a\u0005\t\u0000"+
		"\u0000\u011a\u011b\u0003R)\u0000\u011b\'\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005M\u0000\u0000\u011d\u011e\u0003F#\u0000\u011e\u011f\u0003"+
		"R)\u0000\u011f)\u0001\u0000\u0000\u0000\u0120\u0121\u0005X\u0000\u0000"+
		"\u0121\u0122\u0005\u0006\u0000\u0000\u0122\u0123\u0003.\u0017\u0000\u0123"+
		"\u0124\u0005\u0007\u0000\u0000\u0124\u0128\u0005\b\u0000\u0000\u0125\u0127"+
		"\u0003\u001e\u000f\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u012a"+
		"\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0001\u0000\u0000\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0128"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0005\t\u0000\u0000\u012c+\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0005R\u0000\u0000\u012e\u012f\u0005\u0006"+
		"\u0000\u0000\u012f\u0130\u0003.\u0017\u0000\u0130\u0131\u0005\u0007\u0000"+
		"\u0000\u0131\u0135\u0005\b\u0000\u0000\u0132\u0134\u0003\u001e\u000f\u0000"+
		"\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000"+
		"\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000"+
		"\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u0005\t\u0000\u0000\u0139-\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u00030\u0018\u0000\u013b\u013c\u0007\u0001\u0000\u0000\u013c\u013e"+
		"\u0001\u0000\u0000\u0000\u013d\u013a\u0001\u0000\u0000\u0000\u013e\u0141"+
		"\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0001\u0000\u0000\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u013f"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u00030\u0018\u0000\u0143/\u0001\u0000"+
		"\u0000\u0000\u0144\u0146\u0005\u0006\u0000\u0000\u0145\u0144\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0003F#\u0000\u0148\u0149\u00032\u0019\u0000"+
		"\u0149\u014b\u0003F#\u0000\u014a\u014c\u0005\u0007\u0000\u0000\u014b\u014a"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014f"+
		"\u0001\u0000\u0000\u0000\u014d\u014f\u0003F#\u0000\u014e\u0145\u0001\u0000"+
		"\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f1\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0007\u0002\u0000\u0000\u01513\u0001\u0000\u0000\u0000"+
		"\u0152\u0156\u0003<\u001e\u0000\u0153\u0156\u0003@ \u0000\u0154\u0156"+
		"\u0003B!\u0000\u0155\u0152\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u01565\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005v\u0000\u0000\u0158\u0159\u0005\f\u0000\u0000"+
		"\u0159\u015a\u0003F#\u0000\u015a\u015b\u0003R)\u0000\u015b7\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0006\u001c\uffff\uffff\u0000\u015d\u015e\u0003"+
		"L&\u0000\u015e\u0165\u0001\u0000\u0000\u0000\u015f\u0160\n\u0002\u0000"+
		"\u0000\u0160\u0161\u0003:\u001d\u0000\u0161\u0162\u00038\u001c\u0003\u0162"+
		"\u0164\u0001\u0000\u0000\u0000\u0163\u015f\u0001\u0000\u0000\u0000\u0164"+
		"\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u01669\u0001\u0000\u0000\u0000\u0167\u0165"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0007\u0003\u0000\u0000\u0169;\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0005@\u0000\u0000\u016b\u016c\u0005\u0006"+
		"\u0000\u0000\u016c\u016d\u0005\u0006\u0000\u0000\u016d\u016e\u0003\u001c"+
		"\u000e\u0000\u016e\u016f\u0005\u0007\u0000\u0000\u016f\u0170\u0005;\u0000"+
		"\u0000\u0170\u0174\u0005\b\u0000\u0000\u0171\u0173\u0003\u001e\u000f\u0000"+
		"\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000"+
		"\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000"+
		"\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0005\t\u0000\u0000\u0178\u0179\u0005\u000b\u0000\u0000\u0179"+
		"\u017a\u0003>\u001f\u0000\u017a\u017b\u0005\u0007\u0000\u0000\u017b\u017c"+
		"\u0003R)\u0000\u017c=\u0001\u0000\u0000\u0000\u017d\u017e\u0003H$\u0000"+
		"\u017e?\u0001\u0000\u0000\u0000\u017f\u0180\u0003P(\u0000\u0180\u0181"+
		"\u0005\u0004\u0000\u0000\u0181\u0182\u0005v\u0000\u0000\u0182\u0183\u0005"+
		"\u000b\u0000\u0000\u0183\u0184\u0005v\u0000\u0000\u0184\u0185\u0005\u0005"+
		"\u0000\u0000\u0185\u0186\u0005\f\u0000\u0000\u0186\u0187\u0005A\u0000"+
		"\u0000\u0187\u0189\u0005\u0006\u0000\u0000\u0188\u018a\u0003F#\u0000\u0189"+
		"\u0188\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u0007\u0000\u0000\u018c"+
		"\u018d\u0003R)\u0000\u018dA\u0001\u0000\u0000\u0000\u018e\u018f\u0003"+
		"P(\u0000\u018f\u0190\u0005v\u0000\u0000\u0190\u0191\u0005\f\u0000\u0000"+
		"\u0191\u0192\u0005B\u0000\u0000\u0192\u0194\u0005\u0006\u0000\u0000\u0193"+
		"\u0195\u0003F#\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0197\u0005"+
		"\u0007\u0000\u0000\u0197\u0198\u0003R)\u0000\u0198C\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0003P(\u0000\u019a\u019b\u0005v\u0000\u0000\u019b"+
		"\u019c\u0005\f\u0000\u0000\u019c\u019d\u0003F#\u0000\u019d\u019e\u0003"+
		"R)\u0000\u019eE\u0001\u0000\u0000\u0000\u019f\u01a5\u0003H$\u0000\u01a0"+
		"\u01a5\u0003J%\u0000\u01a1\u01a5\u00038\u001c\u0000\u01a2\u01a5\u0003"+
		"N\'\u0000\u01a3\u01a5\u0005v\u0000\u0000\u01a4\u019f\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a0\u0001\u0000\u0000\u0000\u01a4\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a5G\u0001\u0000\u0000\u0000\u01a6\u01ad\u0005\u0004\u0000\u0000"+
		"\u01a7\u01a9\u0003F#\u0000\u01a8\u01aa\u0005\u000b\u0000\u0000\u01a9\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ab\u01a7\u0001\u0000\u0000\u0000\u01ac\u01af"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005\u0005\u0000\u0000\u01b1I\u0001"+
		"\u0000\u0000\u0000\u01b2\u01bb\u0005\b\u0000\u0000\u01b3\u01b4\u0005v"+
		"\u0000\u0000\u01b4\u01b5\u0005\u000f\u0000\u0000\u01b5\u01b7\u0003F#\u0000"+
		"\u01b6\u01b8\u0005\u000b\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000"+
		"\u01b9\u01b3\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0005\t\u0000\u0000\u01bfK\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0005?\u0000\u0000\u01c1M\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005"+
		"x\u0000\u0000\u01c3O\u0001\u0000\u0000\u0000\u01c4\u01c5\u0007\u0004\u0000"+
		"\u0000\u01c5Q\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005\n\u0000\u0000"+
		"\u01c7S\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005!\u0000\u0000\u01c9\u01cd"+
		"\u0003V+\u0000\u01ca\u01cc\u0003\\.\u0000\u01cb\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000"+
		"\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d4\u0005\"\u0000\u0000"+
		"\u01d1\u01d3\u0003^/\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005!\u0000\u0000\u01d8\u01d9\u0005"+
		"\u0019\u0000\u0000\u01d9\u01da\u0003V+\u0000\u01da\u01db\u0005\"\u0000"+
		"\u0000\u01db\u01e8\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005!\u0000\u0000"+
		"\u01dd\u01e1\u0003V+\u0000\u01de\u01e0\u0003\\.\u0000\u01df\u01de\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005"+
		"\u0019\u0000\u0000\u01e5\u01e6\u0005\"\u0000\u0000\u01e6\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e7\u01c8\u0001\u0000\u0000\u0000\u01e7\u01dc\u0001\u0000"+
		"\u0000\u0000\u01e8U\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005v\u0000\u0000"+
		"\u01eaW\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005v\u0000\u0000\u01ecY"+
		"\u0001\u0000\u0000\u0000\u01ed\u01f4\u0003F#\u0000\u01ee\u01f0\u0005\b"+
		"\u0000\u0000\u01ef\u01f1\u0003F#\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f4\u0005\t\u0000\u0000\u01f3\u01ed\u0001\u0000\u0000\u0000\u01f3"+
		"\u01ee\u0001\u0000\u0000\u0000\u01f4[\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0003X,\u0000\u01f6\u01f7\u0005\f\u0000\u0000\u01f7\u01f8\u0003Z-\u0000"+
		"\u01f8]\u0001\u0000\u0000\u0000\u01f9\u020b\u0003T*\u0000\u01fa\u01fc"+
		"\u0003`0\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000"+
		"\u0000\u0000\u01fe\u0200\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0005\b\u0000\u0000\u0201\u0202\u0003`0\u0000"+
		"\u0202\u0206\u0005\t\u0000\u0000\u0203\u0205\u0003`0\u0000\u0204\u0203"+
		"\u0001\u0000\u0000\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204"+
		"\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u020b"+
		"\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020b"+
		"\u0003`0\u0000\u020a\u01f9\u0001\u0000\u0000\u0000\u020a\u01fd\u0001\u0000"+
		"\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020b_\u0001\u0000\u0000"+
		"\u0000\u020c\u020f\u0005v\u0000\u0000\u020d\u020f\u0003b1\u0000\u020e"+
		"\u020c\u0001\u0000\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020f"+
		"a\u0001\u0000\u0000\u0000\u0210\u0211\u0005v\u0000\u0000\u0211\u0212\u0005"+
		"\u0011\u0000\u0000\u0212\u0213\u0005u\u0000\u0000\u0213\u0214\u0005\u0006"+
		"\u0000\u0000\u0214\u0215\u0003d2\u0000\u0215\u0216\u0005\u0007\u0000\u0000"+
		"\u0216c\u0001\u0000\u0000\u0000\u0217\u0218\u0005\u0006\u0000\u0000\u0218"+
		"\u0219\u0003\u001c\u000e\u0000\u0219\u021a\u0005\u0007\u0000\u0000\u021a"+
		"\u021b\u0005;\u0000\u0000\u021b\u021f\u0005\b\u0000\u0000\u021c\u021e"+
		"\u0003\u001e\u000f\u0000\u021d\u021c\u0001\u0000\u0000\u0000\u021e\u0221"+
		"\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u0220"+
		"\u0001\u0000\u0000\u0000\u0220\u0222\u0001\u0000\u0000\u0000\u0221\u021f"+
		"\u0001\u0000\u0000\u0000\u0222\u0223\u0003\u0016\u000b\u0000\u0223\u0224"+
		"\u0005\t\u0000\u0000\u0224\u0225\u0003R)\u0000\u0225e\u0001\u0000\u0000"+
		"\u00000ip\u0082\u0085\u0089\u008e\u0091\u0097\u009f\u00a3\u00a7\u00ab"+
		"\u00af\u00c3\u00c9\u00e3\u00f5\u00f9\u0105\u0109\u0115\u0128\u0135\u013f"+
		"\u0145\u014b\u014e\u0155\u0165\u0174\u0189\u0194\u01a4\u01a9\u01ad\u01b7"+
		"\u01bb\u01cd\u01d4\u01e1\u01e7\u01f0\u01f3\u01fd\u0206\u020a\u020e\u021f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}