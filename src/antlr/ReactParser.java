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
		ARROW=59, Render=60, NullLiteral=61, BooleanLiteral=62, DecimalLiteral=63, 
		Break=64, Do=65, Instanceof=66, Typeof=67, Case=68, Else=69, New=70, Var=71, 
		Catch=72, Finally=73, Return=74, Void=75, Continue=76, For=77, Switch=78, 
		While=79, Debugger=80, Function_=81, This=82, With=83, Default=84, If=85, 
		Throw=86, Delete=87, In=88, Try=89, As=90, From=91, Of=92, Yield=93, YieldStar=94, 
		Class=95, Enum=96, Extends=97, Super=98, Const=99, Export=100, Import=101, 
		Async=102, Await=103, Implements=104, Let=105, Private=106, Public=107, 
		Interface=108, Package=109, Protected=110, Static=111, Identifier=112, 
		React_Component=113, StringLiteral=114, BackTick=115, WhiteSpaces=116, 
		LineTerminator=117, HtmlComment=118, CDataComment=119, TemplateStringStartExpression=120, 
		TemplateStringAtom=121, JsxOpeningElementBegin=122, JsxOpeningElementEnd=123, 
		JsxOpeningElementSlashEnd=124, JsxAssign=125, JsxOpeningElementOpenBrace=126, 
		JsxOpeningElementId=127, JsxOpeningElementWhiteSpaces=128, JsxOpeningElementLineTerminator=129, 
		JsxOpeningElementMultiLineComment=130, JsxOpeningElementSingleLineComment=131, 
		JsxAttributeValue=132, HtmlChardata=133, JsxElementBegin=134, JsxChildrenOpeningElementBegin=135, 
		JsxChildrenClosingElementSlashBegin=136, JsxChildrenOpenBrace=137, JsxClosingElementEnd=138, 
		JsxClosingElementId=139, JsxClosingElementLineTerminator=140, JsxClosingElementWhiteSpaces=141;
	public static final int
		RULE_program = 0, RULE_importStatment = 1, RULE_namedImportStatment = 2, 
		RULE_defaultImportStatment = 3, RULE_listOfIdentifiers = 4, RULE_exportStatment = 5, 
		RULE_component = 6, RULE_classComponent = 7, RULE_functionalComponent = 8, 
		RULE_componentBody = 9, RULE_componentReturnStatment = 10, RULE_regularFunctionStart = 11, 
		RULE_arrowFunctionStart = 12, RULE_params = 13, RULE_statments = 14, RULE_varModifier = 15, 
		RULE_eos = 16, RULE_jsxElements = 17, RULE_jsxElementBegin = 18, RULE_jsxElement = 19, 
		RULE_jsxSelfClosingElement = 20, RULE_jsxOpeningElement = 21, RULE_jsxClosingElement = 22, 
		RULE_jsxChildren = 23, RULE_jsxSelfClosingElementName = 24, RULE_jsxOpeningElementName = 25, 
		RULE_jsxClosingElementName = 26, RULE_jsxAttributes = 27, RULE_jsxSpreadAttribute = 28, 
		RULE_jsxAttribute = 29, RULE_jsxAttributeName = 30, RULE_jsxAttributeValue = 31, 
		RULE_objectExpressionSequence = 32, RULE_openBrace = 33, RULE_expressionSequence = 34, 
		RULE_singleExpression = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatment", "namedImportStatment", "defaultImportStatment", 
			"listOfIdentifiers", "exportStatment", "component", "classComponent", 
			"functionalComponent", "componentBody", "componentReturnStatment", "regularFunctionStart", 
			"arrowFunctionStart", "params", "statments", "varModifier", "eos", "jsxElements", 
			"jsxElementBegin", "jsxElement", "jsxSelfClosingElement", "jsxOpeningElement", 
			"jsxClosingElement", "jsxChildren", "jsxSelfClosingElementName", "jsxOpeningElementName", 
			"jsxClosingElementName", "jsxAttributes", "jsxSpreadAttribute", "jsxAttribute", 
			"jsxAttributeName", "jsxAttributeValue", "objectExpressionSequence", 
			"openBrace", "expressionSequence", "singleExpression"
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
			"'??='", "'=>'", "'render'", "'null'", null, null, "'break'", "'do'", 
			"'instanceof'", "'typeof'", "'case'", "'else'", "'new'", "'var'", "'catch'", 
			"'finally'", "'return'", "'void'", "'continue'", "'for'", "'switch'", 
			"'while'", "'debugger'", "'function'", "'this'", "'with'", "'default'", 
			"'if'", "'throw'", "'delete'", "'in'", "'try'", "'as'", "'from'", "'of'", 
			"'yield'", "'yield*'", "'class'", "'enum'", "'extends'", "'super'", "'const'", 
			"'export'", "'import'", "'async'", "'await'", "'implements'", "'let'", 
			"'private'", "'public'", "'interface'", "'package'", "'protected'", "'static'", 
			null, "'React.Component'", null, null, null, null, null, null, "'${'", 
			null, null, null, "'/>'", null, null, null, null, null, null, null, null, 
			null, null, null, "'</'"
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
			"PowerAssign", "NullishCoalescingAssign", "ARROW", "Render", "NullLiteral", 
			"BooleanLiteral", "DecimalLiteral", "Break", "Do", "Instanceof", "Typeof", 
			"Case", "Else", "New", "Var", "Catch", "Finally", "Return", "Void", "Continue", 
			"For", "Switch", "While", "Debugger", "Function_", "This", "With", "Default", 
			"If", "Throw", "Delete", "In", "Try", "As", "From", "Of", "Yield", "YieldStar", 
			"Class", "Enum", "Extends", "Super", "Const", "Export", "Import", "Async", 
			"Await", "Implements", "Let", "Private", "Public", "Interface", "Package", 
			"Protected", "Static", "Identifier", "React_Component", "StringLiteral", 
			"BackTick", "WhiteSpaces", "LineTerminator", "HtmlComment", "CDataComment", 
			"TemplateStringStartExpression", "TemplateStringAtom", "JsxOpeningElementBegin", 
			"JsxOpeningElementEnd", "JsxOpeningElementSlashEnd", "JsxAssign", "JsxOpeningElementOpenBrace", 
			"JsxOpeningElementId", "JsxOpeningElementWhiteSpaces", "JsxOpeningElementLineTerminator", 
			"JsxOpeningElementMultiLineComment", "JsxOpeningElementSingleLineComment", 
			"JsxAttributeValue", "HtmlChardata", "JsxElementBegin", "JsxChildrenOpeningElementBegin", 
			"JsxChildrenClosingElementSlashBegin", "JsxChildrenOpenBrace", "JsxClosingElementEnd", 
			"JsxClosingElementId", "JsxClosingElementLineTerminator", "JsxClosingElementWhiteSpaces"
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
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ExportStatmentContext exportStatment() {
			return getRuleContext(ExportStatmentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ReactParser.EOF, 0); }
		public List<ImportStatmentContext> importStatment() {
			return getRuleContexts(ImportStatmentContext.class);
		}
		public ImportStatmentContext importStatment(int i) {
			return getRuleContext(ImportStatmentContext.class,i);
		}
		public List<StatmentsContext> statments() {
			return getRuleContexts(StatmentsContext.class);
		}
		public StatmentsContext statments(int i) {
			return getRuleContext(StatmentsContext.class,i);
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(72);
				importStatment();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(78);
				statments();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			component();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(85);
				statments();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			exportStatment();
			setState(92);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				namedImportStatment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
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
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
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
			setState(98);
			match(Import);
			setState(99);
			listOfIdentifiers();
			setState(100);
			match(From);
			setState(101);
			match(Identifier);
			setState(102);
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
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
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
			setState(104);
			match(Import);
			setState(105);
			match(OpenBrace);
			setState(106);
			listOfIdentifiers();
			setState(107);
			match(CloseBrace);
			setState(108);
			match(From);
			setState(109);
			match(Identifier);
			setState(110);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(112);
						match(Identifier);
						setState(113);
						match(Comma);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(116); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				{
				setState(118);
				match(Identifier);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(119);
					match(Comma);
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(122);
				match(Identifier);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(123);
					match(Comma);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatmentContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(ReactParser.Export, 0); }
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
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
		enterRule(_localctx, 10, RULE_exportStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(Export);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(129);
				match(Default);
				}
			}

			setState(132);
			match(Identifier);
			setState(133);
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
		enterRule(_localctx, 12, RULE_component);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Function_:
			case Const:
			case Let:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				functionalComponent();
				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
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
		enterRule(_localctx, 14, RULE_classComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(Class);
			setState(140);
			match(Identifier);
			setState(141);
			match(Extends);
			setState(142);
			match(React_Component);
			setState(143);
			match(OpenBrace);
			setState(144);
			match(Render);
			setState(145);
			match(OpenParen);
			setState(146);
			params();
			setState(147);
			match(CloseParen);
			setState(148);
			componentBody();
			setState(149);
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
		enterRule(_localctx, 16, RULE_functionalComponent);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function_:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				regularFunctionStart();
				setState(152);
				componentBody();
				}
				break;
			case Var:
			case Const:
			case Let:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				arrowFunctionStart();
				setState(155);
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
		public ComponentReturnStatmentContext componentReturnStatment() {
			return getRuleContext(ComponentReturnStatmentContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<StatmentsContext> statments() {
			return getRuleContexts(StatmentsContext.class);
		}
		public StatmentsContext statments(int i) {
			return getRuleContext(StatmentsContext.class,i);
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
		enterRule(_localctx, 18, RULE_componentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(OpenBrace);
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				statments();
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(165);
			componentReturnStatment();
			setState(166);
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
	public static class ComponentReturnStatmentContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public ComponentReturnStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentReturnStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComponentReturnStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComponentReturnStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComponentReturnStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentReturnStatmentContext componentReturnStatment() throws RecognitionException {
		ComponentReturnStatmentContext _localctx = new ComponentReturnStatmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_componentReturnStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(Return);
			setState(169);
			jsxElement();
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
		enterRule(_localctx, 22, RULE_regularFunctionStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(Function_);
			setState(172);
			match(Identifier);
			setState(173);
			match(OpenParen);
			setState(174);
			params();
			setState(175);
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
		public List<TerminalNode> Assign() { return getTokens(ReactParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(ReactParser.Assign, i);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
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
		enterRule(_localctx, 24, RULE_arrowFunctionStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			varModifier();
			setState(178);
			match(Identifier);
			setState(179);
			match(Assign);
			setState(180);
			match(OpenParen);
			setState(181);
			params();
			setState(182);
			match(CloseParen);
			setState(183);
			match(Assign);
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
		public List<TerminalNode> Identifier() { return getTokens(ReactParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactParser.Identifier, i);
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
		enterRule(_localctx, 26, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(185);
				match(Identifier);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(186);
					match(Comma);
					}
				}

				}
				}
				setState(193);
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
	public static class StatmentsContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public StatmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStatments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentsContext statments() throws RecognitionException {
		StatmentsContext _localctx = new StatmentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			singleExpression();
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
		enterRule(_localctx, 30, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 17448304641L) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
	public static class JsxElementsContext extends ParserRuleContext {
		public List<JsxElementContext> jsxElement() {
			return getRuleContexts(JsxElementContext.class);
		}
		public JsxElementContext jsxElement(int i) {
			return getRuleContext(JsxElementContext.class,i);
		}
		public JsxElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementsContext jsxElements() throws RecognitionException {
		JsxElementsContext _localctx = new JsxElementsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jsxElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				jsxElement();
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 12289L) != 0) );
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
	public static class JsxElementBeginContext extends ParserRuleContext {
		public TerminalNode JsxElementBegin() { return getToken(ReactParser.JsxElementBegin, 0); }
		public TerminalNode JsxOpeningElementBegin() { return getToken(ReactParser.JsxOpeningElementBegin, 0); }
		public TerminalNode JsxChildrenOpeningElementBegin() { return getToken(ReactParser.JsxChildrenOpeningElementBegin, 0); }
		public JsxElementBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElementBegin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElementBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElementBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElementBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementBeginContext jsxElementBegin() throws RecognitionException {
		JsxElementBeginContext _localctx = new JsxElementBeginContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jsxElementBegin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 12289L) != 0)) ) {
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
	public static class JsxElementContext extends ParserRuleContext {
		public JsxSelfClosingElementContext jsxSelfClosingElement() {
			return getRuleContext(JsxSelfClosingElementContext.class,0);
		}
		public JsxOpeningElementContext jsxOpeningElement() {
			return getRuleContext(JsxOpeningElementContext.class,0);
		}
		public JsxChildrenContext jsxChildren() {
			return getRuleContext(JsxChildrenContext.class,0);
		}
		public JsxClosingElementContext jsxClosingElement() {
			return getRuleContext(JsxClosingElementContext.class,0);
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
		enterRule(_localctx, 38, RULE_jsxElement);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				jsxSelfClosingElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				jsxOpeningElement();
				setState(209);
				jsxChildren();
				setState(210);
				jsxClosingElement();
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
	public static class JsxSelfClosingElementContext extends ParserRuleContext {
		public JsxElementBeginContext jsxElementBegin() {
			return getRuleContext(JsxElementBeginContext.class,0);
		}
		public JsxSelfClosingElementNameContext jsxSelfClosingElementName() {
			return getRuleContext(JsxSelfClosingElementNameContext.class,0);
		}
		public TerminalNode JsxOpeningElementSlashEnd() { return getToken(ReactParser.JsxOpeningElementSlashEnd, 0); }
		public JsxAttributesContext jsxAttributes() {
			return getRuleContext(JsxAttributesContext.class,0);
		}
		public JsxSelfClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxSelfClosingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxSelfClosingElementContext jsxSelfClosingElement() throws RecognitionException {
		JsxSelfClosingElementContext _localctx = new JsxSelfClosingElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jsxSelfClosingElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			jsxElementBegin();
			setState(215);
			jsxSelfClosingElementName();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
				{
				setState(216);
				jsxAttributes();
				}
			}

			setState(219);
			match(JsxOpeningElementSlashEnd);
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
	public static class JsxOpeningElementContext extends ParserRuleContext {
		public JsxElementBeginContext jsxElementBegin() {
			return getRuleContext(JsxElementBeginContext.class,0);
		}
		public JsxOpeningElementNameContext jsxOpeningElementName() {
			return getRuleContext(JsxOpeningElementNameContext.class,0);
		}
		public TerminalNode JsxOpeningElementEnd() { return getToken(ReactParser.JsxOpeningElementEnd, 0); }
		public JsxAttributesContext jsxAttributes() {
			return getRuleContext(JsxAttributesContext.class,0);
		}
		public JsxOpeningElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxOpeningElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxOpeningElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxOpeningElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxOpeningElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxOpeningElementContext jsxOpeningElement() throws RecognitionException {
		JsxOpeningElementContext _localctx = new JsxOpeningElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jsxOpeningElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			jsxElementBegin();
			setState(222);
			jsxOpeningElementName();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
				{
				setState(223);
				jsxAttributes();
				}
			}

			setState(226);
			match(JsxOpeningElementEnd);
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
	public static class JsxClosingElementContext extends ParserRuleContext {
		public TerminalNode JsxChildrenClosingElementSlashBegin() { return getToken(ReactParser.JsxChildrenClosingElementSlashBegin, 0); }
		public JsxClosingElementNameContext jsxClosingElementName() {
			return getRuleContext(JsxClosingElementNameContext.class,0);
		}
		public TerminalNode JsxClosingElementEnd() { return getToken(ReactParser.JsxClosingElementEnd, 0); }
		public JsxClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxClosingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxClosingElementContext jsxClosingElement() throws RecognitionException {
		JsxClosingElementContext _localctx = new JsxClosingElementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jsxClosingElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(JsxChildrenClosingElementSlashBegin);
			setState(229);
			jsxClosingElementName();
			setState(230);
			match(JsxClosingElementEnd);
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
	public static class JsxChildrenContext extends ParserRuleContext {
		public List<TerminalNode> HtmlChardata() { return getTokens(ReactParser.HtmlChardata); }
		public TerminalNode HtmlChardata(int i) {
			return getToken(ReactParser.HtmlChardata, i);
		}
		public List<JsxElementContext> jsxElement() {
			return getRuleContexts(JsxElementContext.class);
		}
		public JsxElementContext jsxElement(int i) {
			return getRuleContext(JsxElementContext.class,i);
		}
		public List<ObjectExpressionSequenceContext> objectExpressionSequence() {
			return getRuleContexts(ObjectExpressionSequenceContext.class);
		}
		public ObjectExpressionSequenceContext objectExpressionSequence(int i) {
			return getRuleContext(ObjectExpressionSequenceContext.class,i);
		}
		public JsxChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxChildren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxChildren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxChildrenContext jsxChildren() throws RecognitionException {
		JsxChildrenContext _localctx = new JsxChildrenContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jsxChildren);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HtmlChardata) {
				{
				setState(232);
				match(HtmlChardata);
				}
			}

			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenBrace || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 45073L) != 0)) {
				{
				{
				setState(237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JsxOpeningElementBegin:
				case JsxElementBegin:
				case JsxChildrenOpeningElementBegin:
					{
					setState(235);
					jsxElement();
					}
					break;
				case OpenBrace:
				case JsxOpeningElementOpenBrace:
				case JsxChildrenOpenBrace:
					{
					setState(236);
					objectExpressionSequence();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HtmlChardata) {
					{
					setState(239);
					match(HtmlChardata);
					}
				}

				}
				}
				setState(246);
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
	public static class JsxSelfClosingElementNameContext extends ParserRuleContext {
		public TerminalNode JsxOpeningElementId() { return getToken(ReactParser.JsxOpeningElementId, 0); }
		public JsxSelfClosingElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxSelfClosingElementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxSelfClosingElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxSelfClosingElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxSelfClosingElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxSelfClosingElementNameContext jsxSelfClosingElementName() throws RecognitionException {
		JsxSelfClosingElementNameContext _localctx = new JsxSelfClosingElementNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_jsxSelfClosingElementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(JsxOpeningElementId);
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
	public static class JsxOpeningElementNameContext extends ParserRuleContext {
		public Token JsxOpeningElementId;
		public TerminalNode JsxOpeningElementId() { return getToken(ReactParser.JsxOpeningElementId, 0); }
		public JsxOpeningElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxOpeningElementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxOpeningElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxOpeningElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxOpeningElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxOpeningElementNameContext jsxOpeningElementName() throws RecognitionException {
		JsxOpeningElementNameContext _localctx = new JsxOpeningElementNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jsxOpeningElementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			((JsxOpeningElementNameContext)_localctx).JsxOpeningElementId = match(JsxOpeningElementId);
			this.pushHtmlTagName((((JsxOpeningElementNameContext)_localctx).JsxOpeningElementId!=null?((JsxOpeningElementNameContext)_localctx).JsxOpeningElementId.getText():null));
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
	public static class JsxClosingElementNameContext extends ParserRuleContext {
		public Token JsxClosingElementId;
		public TerminalNode JsxClosingElementId() { return getToken(ReactParser.JsxClosingElementId, 0); }
		public JsxClosingElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxClosingElementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxClosingElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxClosingElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxClosingElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxClosingElementNameContext jsxClosingElementName() throws RecognitionException {
		JsxClosingElementNameContext _localctx = new JsxClosingElementNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jsxClosingElementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			((JsxClosingElementNameContext)_localctx).JsxClosingElementId = match(JsxClosingElementId);
			setState(253);
			if (!(this.popHtmlTagName((((JsxClosingElementNameContext)_localctx).JsxClosingElementId!=null?((JsxClosingElementNameContext)_localctx).JsxClosingElementId.getText():null)))) throw new FailedPredicateException(this, "this.popHtmlTagName($JsxClosingElementId.text)");
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
	public static class JsxAttributesContext extends ParserRuleContext {
		public JsxSpreadAttributeContext jsxSpreadAttribute() {
			return getRuleContext(JsxSpreadAttributeContext.class,0);
		}
		public JsxAttributesContext jsxAttributes() {
			return getRuleContext(JsxAttributesContext.class,0);
		}
		public JsxAttributeContext jsxAttribute() {
			return getRuleContext(JsxAttributeContext.class,0);
		}
		public JsxAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributesContext jsxAttributes() throws RecognitionException {
		JsxAttributesContext _localctx = new JsxAttributesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_jsxAttributes);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JsxOpeningElementOpenBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				jsxSpreadAttribute();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
					{
					setState(256);
					jsxAttributes();
					}
				}

				}
				break;
			case JsxOpeningElementId:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				jsxAttribute();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
					{
					setState(260);
					jsxAttributes();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxSpreadAttributeContext extends ParserRuleContext {
		public TerminalNode JsxOpeningElementOpenBrace() { return getToken(ReactParser.JsxOpeningElementOpenBrace, 0); }
		public TerminalNode Ellipsis() { return getToken(ReactParser.Ellipsis, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public JsxSpreadAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxSpreadAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxSpreadAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxSpreadAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxSpreadAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxSpreadAttributeContext jsxSpreadAttribute() throws RecognitionException {
		JsxSpreadAttributeContext _localctx = new JsxSpreadAttributeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_jsxSpreadAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(JsxOpeningElementOpenBrace);
			setState(266);
			match(Ellipsis);
			setState(267);
			singleExpression();
			setState(268);
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
	public static class JsxAttributeContext extends ParserRuleContext {
		public JsxAttributeNameContext jsxAttributeName() {
			return getRuleContext(JsxAttributeNameContext.class,0);
		}
		public TerminalNode JsxAssign() { return getToken(ReactParser.JsxAssign, 0); }
		public JsxAttributeValueContext jsxAttributeValue() {
			return getRuleContext(JsxAttributeValueContext.class,0);
		}
		public JsxAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributeContext jsxAttribute() throws RecognitionException {
		JsxAttributeContext _localctx = new JsxAttributeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_jsxAttribute);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				jsxAttributeName();
				setState(271);
				match(JsxAssign);
				setState(272);
				jsxAttributeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				jsxAttributeName();
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
	public static class JsxAttributeNameContext extends ParserRuleContext {
		public TerminalNode JsxOpeningElementId() { return getToken(ReactParser.JsxOpeningElementId, 0); }
		public JsxAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributeNameContext jsxAttributeName() throws RecognitionException {
		JsxAttributeNameContext _localctx = new JsxAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_jsxAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(JsxOpeningElementId);
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
	public static class JsxAttributeValueContext extends ParserRuleContext {
		public TerminalNode JsxAttributeValue() { return getToken(ReactParser.JsxAttributeValue, 0); }
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public ObjectExpressionSequenceContext objectExpressionSequence() {
			return getRuleContext(ObjectExpressionSequenceContext.class,0);
		}
		public JsxAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributeValueContext jsxAttributeValue() throws RecognitionException {
		JsxAttributeValueContext _localctx = new JsxAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_jsxAttributeValue);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JsxAttributeValue:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(JsxAttributeValue);
				}
				break;
			case JsxOpeningElementBegin:
			case JsxElementBegin:
			case JsxChildrenOpeningElementBegin:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				jsxElement();
				}
				break;
			case OpenBrace:
			case JsxOpeningElementOpenBrace:
			case JsxChildrenOpenBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				objectExpressionSequence();
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
	public static class ObjectExpressionSequenceContext extends ParserRuleContext {
		public OpenBraceContext openBrace() {
			return getRuleContext(OpenBraceContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public ObjectExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObjectExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObjectExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitObjectExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionSequenceContext objectExpressionSequence() throws RecognitionException {
		ObjectExpressionSequenceContext _localctx = new ObjectExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_objectExpressionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			openBrace();
			setState(285);
			expressionSequence();
			setState(286);
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
	public static class OpenBraceContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode JsxOpeningElementOpenBrace() { return getToken(ReactParser.JsxOpeningElementOpenBrace, 0); }
		public TerminalNode JsxChildrenOpenBrace() { return getToken(ReactParser.JsxChildrenOpenBrace, 0); }
		public OpenBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOpenBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOpenBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOpenBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenBraceContext openBrace() throws RecognitionException {
		OpenBraceContext _localctx = new OpenBraceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_openBrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==JsxOpeningElementOpenBrace || _la==JsxChildrenOpenBrace) ) {
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
	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			singleExpression();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(291);
				match(Comma);
				setState(292);
				singleExpression();
				}
				}
				setState(297);
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
	public static class SingleExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
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
		enterRule(_localctx, 70, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return jsxClosingElementName_sempred((JsxClosingElementNameContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean jsxClosingElementName_sempred(JsxClosingElementNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return this.popHtmlTagName((((JsxClosingElementNameContext)_localctx).JsxClosingElementId!=null?((JsxClosingElementNameContext)_localctx).JsxClosingElementId.getText():null));
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u008d\u012d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\"\u0002#\u0007#\u0001\u0000\u0005\u0000J\b\u0000\n\u0000\f\u0000M\t\u0000"+
		"\u0001\u0000\u0005\u0000P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000W\b\u0000\n\u0000\f\u0000Z\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001a\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0004\u0004s\b\u0004"+
		"\u000b\u0004\f\u0004t\u0001\u0004\u0001\u0004\u0003\u0004y\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004}\b\u0004\u0003\u0004\u007f\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0083\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u008a\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009e\b\b\u0001\t\u0001\t\u0004"+
		"\t\u00a2\b\t\u000b\t\f\t\u00a3\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0003\r\u00bc\b\r\u0005\r\u00be\b\r\n\r\f\r\u00c1\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0004\u0011\u00ca\b\u0011\u000b\u0011\f\u0011\u00cb\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00d5\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00da\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00e1\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0003\u0017\u00ea\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u00ee\b\u0017\u0001\u0017\u0003\u0017\u00f1"+
		"\b\u0017\u0005\u0017\u00f3\b\u0017\n\u0017\f\u0017\u00f6\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0102\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0106\b\u001b\u0003\u001b\u0108\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0114\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u011b\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u0126\b\"\n\"\f\"\u0129\t\"\u0001#\u0001#\u0001#\u0000"+
		"\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0003\u0003\u0000GGccii"+
		"\u0002\u0000zz\u0086\u0087\u0003\u0000\b\b~~\u0089\u0089\u0125\u0000K"+
		"\u0001\u0000\u0000\u0000\u0002`\u0001\u0000\u0000\u0000\u0004b\u0001\u0000"+
		"\u0000\u0000\u0006h\u0001\u0000\u0000\u0000\b~\u0001\u0000\u0000\u0000"+
		"\n\u0080\u0001\u0000\u0000\u0000\f\u0089\u0001\u0000\u0000\u0000\u000e"+
		"\u008b\u0001\u0000\u0000\u0000\u0010\u009d\u0001\u0000\u0000\u0000\u0012"+
		"\u009f\u0001\u0000\u0000\u0000\u0014\u00a8\u0001\u0000\u0000\u0000\u0016"+
		"\u00ab\u0001\u0000\u0000\u0000\u0018\u00b1\u0001\u0000\u0000\u0000\u001a"+
		"\u00bf\u0001\u0000\u0000\u0000\u001c\u00c2\u0001\u0000\u0000\u0000\u001e"+
		"\u00c4\u0001\u0000\u0000\u0000 \u00c6\u0001\u0000\u0000\u0000\"\u00c9"+
		"\u0001\u0000\u0000\u0000$\u00cd\u0001\u0000\u0000\u0000&\u00d4\u0001\u0000"+
		"\u0000\u0000(\u00d6\u0001\u0000\u0000\u0000*\u00dd\u0001\u0000\u0000\u0000"+
		",\u00e4\u0001\u0000\u0000\u0000.\u00e9\u0001\u0000\u0000\u00000\u00f7"+
		"\u0001\u0000\u0000\u00002\u00f9\u0001\u0000\u0000\u00004\u00fc\u0001\u0000"+
		"\u0000\u00006\u0107\u0001\u0000\u0000\u00008\u0109\u0001\u0000\u0000\u0000"+
		":\u0113\u0001\u0000\u0000\u0000<\u0115\u0001\u0000\u0000\u0000>\u011a"+
		"\u0001\u0000\u0000\u0000@\u011c\u0001\u0000\u0000\u0000B\u0120\u0001\u0000"+
		"\u0000\u0000D\u0122\u0001\u0000\u0000\u0000F\u012a\u0001\u0000\u0000\u0000"+
		"HJ\u0003\u0002\u0001\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LQ\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000NP\u0003\u001c\u000e\u0000ON\u0001"+
		"\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000TX\u0003\f\u0006\u0000UW\u0003\u001c\u000e\u0000VU\u0001\u0000\u0000"+
		"\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0003"+
		"\n\u0005\u0000\\]\u0005\u0000\u0000\u0001]\u0001\u0001\u0000\u0000\u0000"+
		"^a\u0003\u0004\u0002\u0000_a\u0003\u0006\u0003\u0000`^\u0001\u0000\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000a\u0003\u0001\u0000\u0000\u0000bc\u0005"+
		"e\u0000\u0000cd\u0003\b\u0004\u0000de\u0005[\u0000\u0000ef\u0005p\u0000"+
		"\u0000fg\u0003 \u0010\u0000g\u0005\u0001\u0000\u0000\u0000hi\u0005e\u0000"+
		"\u0000ij\u0005\b\u0000\u0000jk\u0003\b\u0004\u0000kl\u0005\t\u0000\u0000"+
		"lm\u0005[\u0000\u0000mn\u0005p\u0000\u0000no\u0003 \u0010\u0000o\u0007"+
		"\u0001\u0000\u0000\u0000pq\u0005p\u0000\u0000qs\u0005\u000b\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0005p\u0000"+
		"\u0000wy\u0005\u000b\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y\u007f\u0001\u0000\u0000\u0000z|\u0005p\u0000\u0000{}\u0005"+
		"\u000b\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u007f\u0001\u0000\u0000\u0000~r\u0001\u0000\u0000\u0000~z\u0001\u0000"+
		"\u0000\u0000\u007f\t\u0001\u0000\u0000\u0000\u0080\u0082\u0005d\u0000"+
		"\u0000\u0081\u0083\u0005T\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005p\u0000\u0000\u0085\u0086\u0003 \u0010\u0000\u0086\u000b"+
		"\u0001\u0000\u0000\u0000\u0087\u008a\u0003\u0010\b\u0000\u0088\u008a\u0003"+
		"\u000e\u0007\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\r\u0001\u0000\u0000\u0000\u008b\u008c\u0005_"+
		"\u0000\u0000\u008c\u008d\u0005p\u0000\u0000\u008d\u008e\u0005a\u0000\u0000"+
		"\u008e\u008f\u0005q\u0000\u0000\u008f\u0090\u0005\b\u0000\u0000\u0090"+
		"\u0091\u0005<\u0000\u0000\u0091\u0092\u0005\u0006\u0000\u0000\u0092\u0093"+
		"\u0003\u001a\r\u0000\u0093\u0094\u0005\u0007\u0000\u0000\u0094\u0095\u0003"+
		"\u0012\t\u0000\u0095\u0096\u0005\t\u0000\u0000\u0096\u000f\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0003\u0016\u000b\u0000\u0098\u0099\u0003\u0012"+
		"\t\u0000\u0099\u009e\u0001\u0000\u0000\u0000\u009a\u009b\u0003\u0018\f"+
		"\u0000\u009b\u009c\u0003\u0012\t\u0000\u009c\u009e\u0001\u0000\u0000\u0000"+
		"\u009d\u0097\u0001\u0000\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000"+
		"\u009e\u0011\u0001\u0000\u0000\u0000\u009f\u00a1\u0005\b\u0000\u0000\u00a0"+
		"\u00a2\u0003\u001c\u000e\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0003\u0014\n\u0000\u00a6\u00a7\u0005\t\u0000\u0000\u00a7\u0013"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005J\u0000\u0000\u00a9\u00aa\u0003"+
		"&\u0013\u0000\u00aa\u0015\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005Q\u0000"+
		"\u0000\u00ac\u00ad\u0005p\u0000\u0000\u00ad\u00ae\u0005\u0006\u0000\u0000"+
		"\u00ae\u00af\u0003\u001a\r\u0000\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0"+
		"\u0017\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003\u001e\u000f\u0000\u00b2"+
		"\u00b3\u0005p\u0000\u0000\u00b3\u00b4\u0005\f\u0000\u0000\u00b4\u00b5"+
		"\u0005\u0006\u0000\u0000\u00b5\u00b6\u0003\u001a\r\u0000\u00b6\u00b7\u0005"+
		"\u0007\u0000\u0000\u00b7\u00b8\u0005\f\u0000\u0000\u00b8\u0019\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bb\u0005p\u0000\u0000\u00ba\u00bc\u0005\u000b\u0000"+
		"\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000\u0000"+
		"\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u001b\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003F#\u0000\u00c3"+
		"\u001d\u0001\u0000\u0000\u0000\u00c4\u00c5\u0007\u0000\u0000\u0000\u00c5"+
		"\u001f\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\n\u0000\u0000\u00c7!"+
		"\u0001\u0000\u0000\u0000\u00c8\u00ca\u0003&\u0013\u0000\u00c9\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc#\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0007\u0001\u0000\u0000\u00ce%\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d5\u0003(\u0014\u0000\u00d0\u00d1\u0003*\u0015\u0000\u00d1"+
		"\u00d2\u0003.\u0017\u0000\u00d2\u00d3\u0003,\u0016\u0000\u00d3\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d5\'\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003$"+
		"\u0012\u0000\u00d7\u00d9\u00030\u0018\u0000\u00d8\u00da\u00036\u001b\u0000"+
		"\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0005|\u0000\u0000\u00dc"+
		")\u0001\u0000\u0000\u0000\u00dd\u00de\u0003$\u0012\u0000\u00de\u00e0\u0003"+
		"2\u0019\u0000\u00df\u00e1\u00036\u001b\u0000\u00e0\u00df\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0005{\u0000\u0000\u00e3+\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005\u0088\u0000\u0000\u00e5\u00e6\u00034\u001a\u0000\u00e6\u00e7"+
		"\u0005\u008a\u0000\u0000\u00e7-\u0001\u0000\u0000\u0000\u00e8\u00ea\u0005"+
		"\u0085\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ea\u00f4\u0001\u0000\u0000\u0000\u00eb\u00ee\u0003"+
		"&\u0013\u0000\u00ec\u00ee\u0003@ \u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f1\u0005\u0085\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f2\u00ed\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f5/\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0005\u007f\u0000\u0000\u00f81\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0005\u007f\u0000\u0000\u00fa\u00fb\u0006\u0019\uffff\uffff\u0000"+
		"\u00fb3\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u008b\u0000\u0000\u00fd"+
		"\u00fe\u0004\u001a\u0000\u0001\u00fe5\u0001\u0000\u0000\u0000\u00ff\u0101"+
		"\u00038\u001c\u0000\u0100\u0102\u00036\u001b\u0000\u0101\u0100\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0108\u0001\u0000"+
		"\u0000\u0000\u0103\u0105\u0003:\u001d\u0000\u0104\u0106\u00036\u001b\u0000"+
		"\u0105\u0104\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u00ff\u0001\u0000\u0000\u0000"+
		"\u0107\u0103\u0001\u0000\u0000\u0000\u01087\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0005~\u0000\u0000\u010a\u010b\u0005\u0010\u0000\u0000\u010b\u010c"+
		"\u0003F#\u0000\u010c\u010d\u0005\t\u0000\u0000\u010d9\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0003<\u001e\u0000\u010f\u0110\u0005}\u0000\u0000\u0110"+
		"\u0111\u0003>\u001f\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0114"+
		"\u0003<\u001e\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0113\u0112\u0001"+
		"\u0000\u0000\u0000\u0114;\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u007f"+
		"\u0000\u0000\u0116=\u0001\u0000\u0000\u0000\u0117\u011b\u0005\u0084\u0000"+
		"\u0000\u0118\u011b\u0003&\u0013\u0000\u0119\u011b\u0003@ \u0000\u011a"+
		"\u0117\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a"+
		"\u0119\u0001\u0000\u0000\u0000\u011b?\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0003B!\u0000\u011d\u011e\u0003D\"\u0000\u011e\u011f\u0005\t\u0000\u0000"+
		"\u011fA\u0001\u0000\u0000\u0000\u0120\u0121\u0007\u0002\u0000\u0000\u0121"+
		"C\u0001\u0000\u0000\u0000\u0122\u0127\u0003F#\u0000\u0123\u0124\u0005"+
		"\u000b\u0000\u0000\u0124\u0126\u0003F#\u0000\u0125\u0123\u0001\u0000\u0000"+
		"\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128E\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0005p\u0000\u0000\u012b"+
		"G\u0001\u0000\u0000\u0000\u001cKQX`tx|~\u0082\u0089\u009d\u00a3\u00bb"+
		"\u00bf\u00cb\u00d4\u00d9\u00e0\u00e9\u00ed\u00f0\u00f4\u0101\u0105\u0107"+
		"\u0113\u011a\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}