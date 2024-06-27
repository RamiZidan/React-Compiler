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
		JsxComment=1, HashBangLine=2, MultiLineComment=3, SingleLineComment=4, 
		RegularExpressionLiteral=5, OpenBracket=6, CloseBracket=7, OpenParen=8, 
		CloseParen=9, OpenBrace=10, TemplateCloseBrace=11, CloseBrace=12, SemiColon=13, 
		Comma=14, Assign=15, QuestionMark=16, QuestionMarkDot=17, Colon=18, Ellipsis=19, 
		Dot=20, PlusPlus=21, MinusMinus=22, Plus=23, Minus=24, BitNot=25, Not=26, 
		Multiply=27, Divide=28, Modulus=29, Power=30, NullCoalesce=31, Hashtag=32, 
		RightShiftArithmetic=33, LeftShiftArithmetic=34, RightShiftLogical=35, 
		LessThan=36, MoreThan=37, LessThanEquals=38, GreaterThanEquals=39, Equals_=40, 
		NotEquals=41, IdentityEquals=42, IdentityNotEquals=43, BitAnd=44, BitXOr=45, 
		BitOr=46, And=47, Or=48, MultiplyAssign=49, DivideAssign=50, ModulusAssign=51, 
		PlusAssign=52, MinusAssign=53, LeftShiftArithmeticAssign=54, RightShiftArithmeticAssign=55, 
		RightShiftLogicalAssign=56, BitAndAssign=57, BitXorAssign=58, BitOrAssign=59, 
		PowerAssign=60, NullishCoalescingAssign=61, ARROW=62, NullLiteral=63, 
		BooleanLiteral=64, DecimalLiteral=65, HexIntegerLiteral=66, OctalIntegerLiteral=67, 
		OctalIntegerLiteral2=68, BinaryIntegerLiteral=69, BigHexIntegerLiteral=70, 
		BigOctalIntegerLiteral=71, BigBinaryIntegerLiteral=72, BigDecimalIntegerLiteral=73, 
		Break=74, Do=75, Instanceof=76, Typeof=77, Case=78, Else=79, New=80, Var=81, 
		Catch=82, Finally=83, Return=84, Void=85, Continue=86, For=87, Switch=88, 
		While=89, Debugger=90, Function_=91, This=92, With=93, Default=94, If=95, 
		Throw=96, Delete=97, In=98, Try=99, As=100, From=101, Of=102, Yield=103, 
		YieldStar=104, Class=105, Enum=106, Extends=107, Super=108, Const=109, 
		Export=110, Import=111, Async=112, Await=113, Implements=114, StrictLet=115, 
		NonStrictLet=116, Private=117, Public=118, Interface=119, Package=120, 
		Protected=121, Static=122, Identifier=123, StringLiteral=124, BackTick=125, 
		WhiteSpaces=126, LineTerminator=127, HtmlComment=128, CDataComment=129, 
		TemplateStringStartExpression=130, TemplateStringAtom=131, JsxOpeningElementBegin=132, 
		JsxOpeningElementEnd=133, JsxOpeningElementSlashEnd=134, JsxAssign=135, 
		JsxOpeningElementOpenBrace=136, JsxOpeningElementId=137, JsxOpeningElementWhiteSpaces=138, 
		JsxOpeningElementLineTerminator=139, JsxOpeningElementMultiLineComment=140, 
		JsxOpeningElementSingleLineComment=141, JsxAttributeValue=142, HtmlChardata=143, 
		JsxChildrenOpeningElementBegin=144, JsxChildrenClosingElementSlashBegin=145, 
		JsxChildrenOpenBrace=146, JsxClosingElementEnd=147, JsxClosingElementId=148, 
		JsxClosingElementLineTerminator=149, JsxClosingElementWhiteSpaces=150, 
		GreaterThan=151, JsxElementBegin=152;
	public static final int
		RULE_program = 0, RULE_sourceElement = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_statementList = 4, RULE_importStatement = 5, RULE_importFromBlock = 6, 
		RULE_importModuleItems = 7, RULE_importAliasName = 8, RULE_moduleExportName = 9, 
		RULE_importedBinding = 10, RULE_importDefault = 11, RULE_importNamespace = 12, 
		RULE_importFrom = 13, RULE_aliasName = 14, RULE_exportStatement = 15, 
		RULE_exportFromBlock = 16, RULE_exportModuleItems = 17, RULE_exportAliasName = 18, 
		RULE_declaration = 19, RULE_variableStatement = 20, RULE_variableDeclarationList = 21, 
		RULE_variableDeclaration = 22, RULE_emptyStatement_ = 23, RULE_expressionStatement = 24, 
		RULE_ifStatement = 25, RULE_iterationStatement = 26, RULE_varModifier = 27, 
		RULE_continueStatement = 28, RULE_breakStatement = 29, RULE_returnStatement = 30, 
		RULE_yieldStatement = 31, RULE_withStatement = 32, RULE_switchStatement = 33, 
		RULE_caseBlock = 34, RULE_caseClauses = 35, RULE_caseClause = 36, RULE_defaultClause = 37, 
		RULE_labelledStatement = 38, RULE_throwStatement = 39, RULE_tryStatement = 40, 
		RULE_catchProduction = 41, RULE_finallyProduction = 42, RULE_debuggerStatement = 43, 
		RULE_functionDeclaration = 44, RULE_classDeclaration = 45, RULE_classTail = 46, 
		RULE_classElement = 47, RULE_methodDefinition = 48, RULE_fieldDefinition = 49, 
		RULE_classElementName = 50, RULE_privateIdentifier = 51, RULE_formalParameterList = 52, 
		RULE_formalParameterArg = 53, RULE_lastFormalParameterArg = 54, RULE_functionBody = 55, 
		RULE_sourceElements = 56, RULE_arrayLiteral = 57, RULE_elementList = 58, 
		RULE_arrayElement = 59, RULE_propertyAssignment = 60, RULE_propertyName = 61, 
		RULE_arguments = 62, RULE_argument = 63, RULE_expressionSequence = 64, 
		RULE_singleExpression = 65, RULE_initializer = 66, RULE_assignable = 67, 
		RULE_objectLiteral = 68, RULE_anonymousFunction = 69, RULE_arrowFunctionParameters = 70, 
		RULE_arrowFunctionBody = 71, RULE_assignmentOperator = 72, RULE_literal = 73, 
		RULE_templateStringLiteral = 74, RULE_templateStringAtom = 75, RULE_numericLiteral = 76, 
		RULE_bigintLiteral = 77, RULE_getter = 78, RULE_setter = 79, RULE_identifierName = 80, 
		RULE_identifier = 81, RULE_reservedWord = 82, RULE_keyword = 83, RULE_let_ = 84, 
		RULE_eos = 85, RULE_jsxElements = 86, RULE_jsxElementBegin = 87, RULE_jsxElement = 88, 
		RULE_jsxSelfClosingElement = 89, RULE_jsxOpeningElement = 90, RULE_jsxClosingElement = 91, 
		RULE_jsxChildren = 92, RULE_jsxSelfClosingElementName = 93, RULE_jsxOpeningElementName = 94, 
		RULE_jsxClosingElementName = 95, RULE_jsxAttributes = 96, RULE_jsxSpreadAttribute = 97, 
		RULE_jsxAttribute = 98, RULE_jsxAttributeName = 99, RULE_jsxAttributeValue = 100, 
		RULE_openBrace = 101, RULE_objectExpressionSequence = 102, RULE_anoymousFunction = 103;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElement", "statement", "block", "statementList", "importStatement", 
			"importFromBlock", "importModuleItems", "importAliasName", "moduleExportName", 
			"importedBinding", "importDefault", "importNamespace", "importFrom", 
			"aliasName", "exportStatement", "exportFromBlock", "exportModuleItems", 
			"exportAliasName", "declaration", "variableStatement", "variableDeclarationList", 
			"variableDeclaration", "emptyStatement_", "expressionStatement", "ifStatement", 
			"iterationStatement", "varModifier", "continueStatement", "breakStatement", 
			"returnStatement", "yieldStatement", "withStatement", "switchStatement", 
			"caseBlock", "caseClauses", "caseClause", "defaultClause", "labelledStatement", 
			"throwStatement", "tryStatement", "catchProduction", "finallyProduction", 
			"debuggerStatement", "functionDeclaration", "classDeclaration", "classTail", 
			"classElement", "methodDefinition", "fieldDefinition", "classElementName", 
			"privateIdentifier", "formalParameterList", "formalParameterArg", "lastFormalParameterArg", 
			"functionBody", "sourceElements", "arrayLiteral", "elementList", "arrayElement", 
			"propertyAssignment", "propertyName", "arguments", "argument", "expressionSequence", 
			"singleExpression", "initializer", "assignable", "objectLiteral", "anonymousFunction", 
			"arrowFunctionParameters", "arrowFunctionBody", "assignmentOperator", 
			"literal", "templateStringLiteral", "templateStringAtom", "numericLiteral", 
			"bigintLiteral", "getter", "setter", "identifierName", "identifier", 
			"reservedWord", "keyword", "let_", "eos", "jsxElements", "jsxElementBegin", 
			"jsxElement", "jsxSelfClosingElement", "jsxOpeningElement", "jsxClosingElement", 
			"jsxChildren", "jsxSelfClosingElementName", "jsxOpeningElementName", 
			"jsxClosingElementName", "jsxAttributes", "jsxSpreadAttribute", "jsxAttribute", 
			"jsxAttributeName", "jsxAttributeValue", "openBrace", "objectExpressionSequence", 
			"anoymousFunction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'['", "']'", "'('", "')'", "'{'", 
			null, "'}'", "';'", "','", null, "'?'", "'?.'", "':'", "'...'", "'.'", 
			"'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'**'", 
			"'??'", "'#'", "'>>'", "'<<'", "'>>>'", null, null, "'<='", "'>='", "'=='", 
			"'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", 
			"'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", 
			"'|='", "'**='", "'??='", "'=>'", "'null'", null, null, null, null, null, 
			null, null, null, null, null, "'break'", "'do'", "'instanceof'", "'typeof'", 
			"'case'", "'else'", "'new'", "'var'", "'catch'", "'finally'", "'return'", 
			"'void'", "'continue'", "'for'", "'switch'", "'while'", "'debugger'", 
			"'function'", "'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", 
			"'in'", "'try'", "'as'", "'from'", "'of'", "'yield'", "'yield*'", "'class'", 
			"'enum'", "'extends'", "'super'", "'const'", "'export'", "'import'", 
			"'async'", "'await'", "'implements'", null, null, "'private'", "'public'", 
			"'interface'", "'package'", "'protected'", "'static'", null, null, null, 
			null, null, null, null, "'${'", null, null, null, "'/>'", null, null, 
			null, null, null, null, null, null, null, null, "'</'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "JsxComment", "HashBangLine", "MultiLineComment", "SingleLineComment", 
			"RegularExpressionLiteral", "OpenBracket", "CloseBracket", "OpenParen", 
			"CloseParen", "OpenBrace", "TemplateCloseBrace", "CloseBrace", "SemiColon", 
			"Comma", "Assign", "QuestionMark", "QuestionMarkDot", "Colon", "Ellipsis", 
			"Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", 
			"Divide", "Modulus", "Power", "NullCoalesce", "Hashtag", "RightShiftArithmetic", 
			"LeftShiftArithmetic", "RightShiftLogical", "LessThan", "MoreThan", "LessThanEquals", 
			"GreaterThanEquals", "Equals_", "NotEquals", "IdentityEquals", "IdentityNotEquals", 
			"BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", 
			"ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", 
			"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign", 
			"BitXorAssign", "BitOrAssign", "PowerAssign", "NullishCoalescingAssign", 
			"ARROW", "NullLiteral", "BooleanLiteral", "DecimalLiteral", "HexIntegerLiteral", 
			"OctalIntegerLiteral", "OctalIntegerLiteral2", "BinaryIntegerLiteral", 
			"BigHexIntegerLiteral", "BigOctalIntegerLiteral", "BigBinaryIntegerLiteral", 
			"BigDecimalIntegerLiteral", "Break", "Do", "Instanceof", "Typeof", "Case", 
			"Else", "New", "Var", "Catch", "Finally", "Return", "Void", "Continue", 
			"For", "Switch", "While", "Debugger", "Function_", "This", "With", "Default", 
			"If", "Throw", "Delete", "In", "Try", "As", "From", "Of", "Yield", "YieldStar", 
			"Class", "Enum", "Extends", "Super", "Const", "Export", "Import", "Async", 
			"Await", "Implements", "StrictLet", "NonStrictLet", "Private", "Public", 
			"Interface", "Package", "Protected", "Static", "Identifier", "StringLiteral", 
			"BackTick", "WhiteSpaces", "LineTerminator", "HtmlComment", "CDataComment", 
			"TemplateStringStartExpression", "TemplateStringAtom", "JsxOpeningElementBegin", 
			"JsxOpeningElementEnd", "JsxOpeningElementSlashEnd", "JsxAssign", "JsxOpeningElementOpenBrace", 
			"JsxOpeningElementId", "JsxOpeningElementWhiteSpaces", "JsxOpeningElementLineTerminator", 
			"JsxOpeningElementMultiLineComment", "JsxOpeningElementSingleLineComment", 
			"JsxAttributeValue", "HtmlChardata", "JsxChildrenOpeningElementBegin", 
			"JsxChildrenClosingElementSlashBegin", "JsxChildrenOpenBrace", "JsxClosingElementEnd", 
			"JsxClosingElementId", "JsxClosingElementLineTerminator", "JsxClosingElementWhiteSpaces", 
			"GreaterThan", "JsxElementBegin"
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
		public TerminalNode HashBangLine() { return getToken(ReactParser.HashBangLine, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(208);
				match(HashBangLine);
				}
				break;
			}
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(211);
				sourceElements();
				}
				break;
			}
			setState(214);
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
	public static class SourceElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSourceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSourceElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSourceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			statement();
			}
		}
		catch (RecognitionException re) {
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
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public YieldStatementContext yieldStatement() {
			return getRuleContext(YieldStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public LabelledStatementContext labelledStatement() {
			return getRuleContext(LabelledStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DebuggerStatementContext debuggerStatement() {
			return getRuleContext(DebuggerStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				importStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				exportStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				emptyStatement_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(223);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(224);
				functionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(225);
				expressionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(226);
				ifStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(227);
				iterationStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(228);
				continueStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(229);
				breakStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(230);
				returnStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(231);
				yieldStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(232);
				withStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(233);
				labelledStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(234);
				switchStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(235);
				throwStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(236);
				tryStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(237);
				debuggerStatement();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(OpenBrace);
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(241);
				statementList();
				}
				break;
			}
			setState(244);
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
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(246);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(249); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(ReactParser.Import, 0); }
		public ImportFromBlockContext importFromBlock() {
			return getRuleContext(ImportFromBlockContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(Import);
			setState(252);
			importFromBlock();
			}
		}
		catch (RecognitionException re) {
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
	public static class ImportFromBlockContext extends ParserRuleContext {
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public ImportModuleItemsContext importModuleItems() {
			return getRuleContext(ImportModuleItemsContext.class,0);
		}
		public ImportDefaultContext importDefault() {
			return getRuleContext(ImportDefaultContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importFromBlock);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
			case Multiply:
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Of:
			case Yield:
			case YieldStar:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case StrictLet:
			case NonStrictLet:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(254);
					importDefault();
					}
					break;
				}
				setState(259);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiply:
				case NullLiteral:
				case BooleanLiteral:
				case Break:
				case Do:
				case Instanceof:
				case Typeof:
				case Case:
				case Else:
				case New:
				case Var:
				case Catch:
				case Finally:
				case Return:
				case Void:
				case Continue:
				case For:
				case Switch:
				case While:
				case Debugger:
				case Function_:
				case This:
				case With:
				case Default:
				case If:
				case Throw:
				case Delete:
				case In:
				case Try:
				case As:
				case From:
				case Of:
				case Yield:
				case YieldStar:
				case Class:
				case Enum:
				case Extends:
				case Super:
				case Const:
				case Export:
				case Import:
				case Async:
				case Await:
				case Implements:
				case StrictLet:
				case NonStrictLet:
				case Private:
				case Public:
				case Interface:
				case Package:
				case Protected:
				case Static:
				case Identifier:
					{
					setState(257);
					importNamespace();
					}
					break;
				case OpenBrace:
					{
					setState(258);
					importModuleItems();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(261);
				importFrom();
				setState(262);
				eos();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(StringLiteral);
				setState(265);
				eos();
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
	public static class ImportModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<ImportAliasNameContext> importAliasName() {
			return getRuleContexts(ImportAliasNameContext.class);
		}
		public ImportAliasNameContext importAliasName(int i) {
			return getRuleContext(ImportAliasNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ImportModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importModuleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportModuleItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportModuleItemsContext importModuleItems() throws RecognitionException {
		ImportModuleItemsContext _localctx = new ImportModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importModuleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(OpenBrace);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					importAliasName();
					setState(270);
					match(Comma);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 4611686018427385859L) != 0)) {
				{
				setState(277);
				importAliasName();
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(278);
					match(Comma);
					}
				}

				}
			}

			setState(283);
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
	public static class ImportAliasNameContext extends ParserRuleContext {
		public ModuleExportNameContext moduleExportName() {
			return getRuleContext(ModuleExportNameContext.class,0);
		}
		public TerminalNode As() { return getToken(ReactParser.As, 0); }
		public ImportedBindingContext importedBinding() {
			return getRuleContext(ImportedBindingContext.class,0);
		}
		public ImportAliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportAliasNameContext importAliasName() throws RecognitionException {
		ImportAliasNameContext _localctx = new ImportAliasNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importAliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			moduleExportName();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(286);
				match(As);
				setState(287);
				importedBinding();
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
	public static class ModuleExportNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public ModuleExportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleExportName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterModuleExportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitModuleExportName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitModuleExportName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleExportNameContext moduleExportName() throws RecognitionException {
		ModuleExportNameContext _localctx = new ModuleExportNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_moduleExportName);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Of:
			case Yield:
			case YieldStar:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case StrictLet:
			case NonStrictLet:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(StringLiteral);
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
	public static class ImportedBindingContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode Yield() { return getToken(ReactParser.Yield, 0); }
		public TerminalNode Await() { return getToken(ReactParser.Await, 0); }
		public ImportedBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importedBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportedBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportedBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportedBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportedBindingContext importedBinding() throws RecognitionException {
		ImportedBindingContext _localctx = new ImportedBindingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_importedBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 1049601L) != 0)) ) {
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
	public static class ImportDefaultContext extends ParserRuleContext {
		public AliasNameContext aliasName() {
			return getRuleContext(AliasNameContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ReactParser.Comma, 0); }
		public ImportDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefaultContext importDefault() throws RecognitionException {
		ImportDefaultContext _localctx = new ImportDefaultContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_importDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			aliasName();
			setState(297);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
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
	public static class ImportNamespaceContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public TerminalNode As() { return getToken(ReactParser.As, 0); }
		public ImportNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamespaceContext importNamespace() throws RecognitionException {
		ImportNamespaceContext _localctx = new ImportNamespaceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_importNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
				{
				setState(299);
				match(Multiply);
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Of:
			case Yield:
			case YieldStar:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case StrictLet:
			case NonStrictLet:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Identifier:
				{
				setState(300);
				identifierName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(303);
				match(As);
				setState(304);
				identifierName();
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
	public static class ImportFromContext extends ParserRuleContext {
		public TerminalNode From() { return getToken(ReactParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public ImportFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromContext importFrom() throws RecognitionException {
		ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_importFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(From);
			setState(308);
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
	public static class AliasNameContext extends ParserRuleContext {
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public TerminalNode As() { return getToken(ReactParser.As, 0); }
		public AliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasNameContext aliasName() throws RecognitionException {
		AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			identifierName();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(311);
				match(As);
				setState(312);
				identifierName();
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
	public static class ExportStatementContext extends ParserRuleContext {
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
	 
		public ExportStatementContext() { }
		public void copyFrom(ExportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportDefaultDeclarationContext extends ExportStatementContext {
		public TerminalNode Export() { return getToken(ReactParser.Export, 0); }
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportDefaultDeclarationContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportDefaultDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportDefaultDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportDefaultDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportDeclarationContext extends ExportStatementContext {
		public TerminalNode Export() { return getToken(ReactParser.Export, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportFromBlockContext exportFromBlock() {
			return getRuleContext(ExportFromBlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public ExportDeclarationContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exportStatement);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ExportDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(Export);
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(316);
					match(Default);
					}
					break;
				}
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(319);
					exportFromBlock();
					}
					break;
				case 2:
					{
					setState(320);
					declaration();
					}
					break;
				}
				setState(323);
				eos();
				}
				break;
			case 2:
				_localctx = new ExportDefaultDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(Export);
				setState(326);
				match(Default);
				setState(327);
				singleExpression(0);
				setState(328);
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
	public static class ExportFromBlockContext extends ParserRuleContext {
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportModuleItemsContext exportModuleItems() {
			return getRuleContext(ExportModuleItemsContext.class,0);
		}
		public ExportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportFromBlockContext exportFromBlock() throws RecognitionException {
		ExportFromBlockContext _localctx = new ExportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exportFromBlock);
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Of:
			case Yield:
			case YieldStar:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case StrictLet:
			case NonStrictLet:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				importNamespace();
				setState(333);
				importFrom();
				setState(334);
				eos();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				exportModuleItems();
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(337);
					importFrom();
					}
					break;
				}
				setState(340);
				eos();
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
	public static class ExportModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<ExportAliasNameContext> exportAliasName() {
			return getRuleContexts(ExportAliasNameContext.class);
		}
		public ExportAliasNameContext exportAliasName(int i) {
			return getRuleContext(ExportAliasNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ExportModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportModuleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportModuleItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportModuleItemsContext exportModuleItems() throws RecognitionException {
		ExportModuleItemsContext _localctx = new ExportModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exportModuleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(OpenBrace);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(345);
					exportAliasName();
					setState(346);
					match(Comma);
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 4611686018427385859L) != 0)) {
				{
				setState(353);
				exportAliasName();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(354);
					match(Comma);
					}
				}

				}
			}

			setState(359);
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
	public static class ExportAliasNameContext extends ParserRuleContext {
		public List<ModuleExportNameContext> moduleExportName() {
			return getRuleContexts(ModuleExportNameContext.class);
		}
		public ModuleExportNameContext moduleExportName(int i) {
			return getRuleContext(ModuleExportNameContext.class,i);
		}
		public TerminalNode As() { return getToken(ReactParser.As, 0); }
		public ExportAliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportAliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportAliasNameContext exportAliasName() throws RecognitionException {
		ExportAliasNameContext _localctx = new ExportAliasNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exportAliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			moduleExportName();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(362);
				match(As);
				setState(363);
				moduleExportName();
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
	public static class DeclarationContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaration);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Const:
			case StrictLet:
			case NonStrictLet:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				variableStatement();
				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				classDeclaration();
				}
				break;
			case Function_:
			case Async:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				functionDeclaration();
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
	public static class VariableStatementContext extends ParserRuleContext {
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			variableDeclarationList();
			setState(372);
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
	public static class VariableDeclarationListContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			varModifier();
			setState(375);
			variableDeclaration();
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(376);
					match(Comma);
					setState(377);
					variableDeclaration();
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			assignable();
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(384);
				match(Assign);
				setState(385);
				singleExpression(0);
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
	public static class EmptyStatement_Context extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEmptyStatement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEmptyStatement_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEmptyStatement_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			if (!(this.notOpenBraceAndNotFunction())) throw new FailedPredicateException(this, "this.notOpenBraceAndNotFunction()");
			setState(391);
			expressionSequence();
			setState(392);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ReactParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(ReactParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(If);
			setState(395);
			match(OpenParen);
			setState(396);
			expressionSequence();
			setState(397);
			match(CloseParen);
			setState(398);
			statement();
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(399);
				match(Else);
				setState(400);
				statement();
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
	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(ReactParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(ReactParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(ReactParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ReactParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(ReactParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ReactParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ReactParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode In() { return getToken(ReactParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForOfStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ReactParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode Of() { return getToken(ReactParser.Of, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public TerminalNode Await() { return getToken(ReactParser.Await, 0); }
		public ForOfStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForOfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForOfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_iterationStatement);
		int _la;
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(Do);
				setState(404);
				statement();
				setState(405);
				match(While);
				setState(406);
				match(OpenParen);
				setState(407);
				expressionSequence();
				setState(408);
				match(CloseParen);
				setState(409);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(While);
				setState(412);
				match(OpenParen);
				setState(413);
				expressionSequence();
				setState(414);
				match(CloseParen);
				setState(415);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				match(For);
				setState(418);
				match(OpenParen);
				setState(421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(419);
					expressionSequence();
					}
					break;
				case 2:
					{
					setState(420);
					variableDeclarationList();
					}
					break;
				}
				setState(423);
				match(SemiColon);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036722653856L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0)) {
					{
					setState(424);
					expressionSequence();
					}
				}

				setState(427);
				match(SemiColon);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036722653856L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0)) {
					{
					setState(428);
					expressionSequence();
					}
				}

				setState(431);
				match(CloseParen);
				setState(432);
				statement();
				}
				break;
			case 4:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				match(For);
				setState(434);
				match(OpenParen);
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(435);
					singleExpression(0);
					}
					break;
				case 2:
					{
					setState(436);
					variableDeclarationList();
					}
					break;
				}
				setState(439);
				match(In);
				setState(440);
				expressionSequence();
				setState(441);
				match(CloseParen);
				setState(442);
				statement();
				}
				break;
			case 5:
				_localctx = new ForOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(444);
				match(For);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Await) {
					{
					setState(445);
					match(Await);
					}
				}

				setState(448);
				match(OpenParen);
				setState(451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(449);
					singleExpression(0);
					}
					break;
				case 2:
					{
					setState(450);
					variableDeclarationList();
					}
					break;
				}
				setState(453);
				match(Of);
				setState(454);
				expressionSequence();
				setState(455);
				match(CloseParen);
				setState(456);
				statement();
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
	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(ReactParser.Var, 0); }
		public Let_Context let_() {
			return getRuleContext(Let_Context.class,0);
		}
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
		enterRule(_localctx, 54, RULE_varModifier);
		try {
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(Var);
				}
				break;
			case StrictLet:
			case NonStrictLet:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				let_();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				match(Const);
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
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(ReactParser.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(Continue);
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(466);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(467);
				identifier();
				}
				break;
			}
			setState(470);
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
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ReactParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(Break);
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(473);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(474);
				identifier();
				}
				break;
			}
			setState(477);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(Return);
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(480);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(481);
				expressionSequence();
				}
				break;
			}
			setState(484);
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
	public static class YieldStatementContext extends ParserRuleContext {
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Yield() { return getToken(ReactParser.Yield, 0); }
		public TerminalNode YieldStar() { return getToken(ReactParser.YieldStar, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public YieldStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterYieldStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitYieldStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitYieldStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldStatementContext yieldStatement() throws RecognitionException {
		YieldStatementContext _localctx = new YieldStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_yieldStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if ( !(_la==Yield || _la==YieldStar) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(487);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(488);
				expressionSequence();
				}
				break;
			}
			setState(491);
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
	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(ReactParser.With, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWithStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWithStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(With);
			setState(494);
			match(OpenParen);
			setState(495);
			expressionSequence();
			setState(496);
			match(CloseParen);
			setState(497);
			statement();
			}
		}
		catch (RecognitionException re) {
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
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(ReactParser.Switch, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(Switch);
			setState(500);
			match(OpenParen);
			setState(501);
			expressionSequence();
			setState(502);
			match(CloseParen);
			setState(503);
			caseBlock();
			}
		}
		catch (RecognitionException re) {
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
	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(OpenBrace);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(506);
				caseClauses();
				}
			}

			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(509);
				defaultClause();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(510);
					caseClauses();
					}
				}

				}
			}

			setState(515);
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
	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCaseClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCaseClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(517);
				caseClause();
				}
				}
				setState(520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
			}
		}
		catch (RecognitionException re) {
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
	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(ReactParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_caseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(Case);
			setState(523);
			expressionSequence();
			setState(524);
			match(Colon);
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(525);
				statementList();
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
	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDefaultClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDefaultClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_defaultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(Default);
			setState(529);
			match(Colon);
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(530);
				statementList();
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
	public static class LabelledStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabelledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabelledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelledStatementContext labelledStatement() throws RecognitionException {
		LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			identifier();
			setState(534);
			match(Colon);
			setState(535);
			statement();
			}
		}
		catch (RecognitionException re) {
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
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(ReactParser.Throw, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(Throw);
			setState(538);
			if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
			setState(539);
			expressionSequence();
			setState(540);
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
	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(ReactParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(Try);
			setState(543);
			block();
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Catch:
				{
				setState(544);
				catchProduction();
				setState(546);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(545);
					finallyProduction();
					}
					break;
				}
				}
				break;
			case Finally:
				{
				setState(548);
				finallyProduction();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class CatchProductionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(ReactParser.Catch, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCatchProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCatchProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCatchProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_catchProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(Catch);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(552);
				match(OpenParen);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket || _la==OpenBrace || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 1125899906842623L) != 0)) {
					{
					setState(553);
					assignable();
					}
				}

				setState(556);
				match(CloseParen);
				}
			}

			setState(559);
			block();
			}
		}
		catch (RecognitionException re) {
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
	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(ReactParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFinallyProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFinallyProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFinallyProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(Finally);
			setState(562);
			block();
			}
		}
		catch (RecognitionException re) {
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
	public static class DebuggerStatementContext extends ParserRuleContext {
		public TerminalNode Debugger() { return getToken(ReactParser.Debugger, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDebuggerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDebuggerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDebuggerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebuggerStatementContext debuggerStatement() throws RecognitionException {
		DebuggerStatementContext _localctx = new DebuggerStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_debuggerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(Debugger);
			setState(565);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(ReactParser.Function_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(567);
				match(Async);
				}
			}

			setState(570);
			match(Function_);
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Multiply) {
				{
				setState(571);
				match(Multiply);
				}
			}

			setState(574);
			identifier();
			setState(575);
			match(OpenParen);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 525376L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 1125899906842623L) != 0)) {
				{
				setState(576);
				formalParameterList();
				}
			}

			setState(579);
			match(CloseParen);
			setState(580);
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(ReactParser.Class, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(Class);
			setState(583);
			identifier();
			setState(584);
			classTail();
			}
		}
		catch (RecognitionException re) {
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
	public static class ClassTailContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode Extends() { return getToken(ReactParser.Extends, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public List<ClassElementContext> classElement() {
			return getRuleContexts(ClassElementContext.class);
		}
		public ClassElementContext classElement(int i) {
			return getRuleContext(ClassElementContext.class,i);
		}
		public ClassTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterClassTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitClassTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitClassTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTailContext classTail() throws RecognitionException {
		ClassTailContext _localctx = new ClassTailContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classTail);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(586);
				match(Extends);
				setState(587);
				singleExpression(0);
				}
			}

			setState(590);
			match(OpenBrace);
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(591);
					classElement();
					}
					} 
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(597);
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
	public static class ClassElementContext extends ParserRuleContext {
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public TerminalNode Static() { return getToken(ReactParser.Static, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FieldDefinitionContext fieldDefinition() {
			return getRuleContext(FieldDefinitionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public ClassElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterClassElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitClassElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitClassElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_classElement);
		try {
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(599);
					match(Static);
					}
					break;
				case 2:
					{
					setState(600);
					if (!(this.n("static"))) throw new FailedPredicateException(this, "this.n(\"static\")");
					setState(601);
					identifier();
					}
					break;
				}
				setState(604);
				methodDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(605);
					match(Static);
					}
					break;
				case 2:
					{
					setState(606);
					if (!(this.n("static"))) throw new FailedPredicateException(this, "this.n(\"static\")");
					setState(607);
					identifier();
					}
					break;
				}
				setState(610);
				fieldDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(611);
					match(Static);
					}
					break;
				case 2:
					{
					setState(612);
					if (!(this.n("static"))) throw new FailedPredicateException(this, "this.n(\"static\")");
					setState(613);
					identifier();
					}
					break;
				}
				setState(616);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(617);
				emptyStatement_();
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
	public static class MethodDefinitionContext extends ParserRuleContext {
		public ClassElementNameContext classElementName() {
			return getRuleContext(ClassElementNameContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodDefinition);
		int _la;
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(620);
					match(Async);
					setState(621);
					if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
					}
					break;
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(624);
					match(Multiply);
					}
				}

				setState(627);
				classElementName();
				setState(628);
				match(OpenParen);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 525376L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 1125899906842623L) != 0)) {
					{
					setState(629);
					formalParameterList();
					}
				}

				setState(632);
				match(CloseParen);
				setState(633);
				functionBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(635);
					match(Multiply);
					}
					break;
				}
				setState(638);
				getter();
				setState(639);
				match(OpenParen);
				setState(640);
				match(CloseParen);
				setState(641);
				functionBody();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(643);
					match(Multiply);
					}
					break;
				}
				setState(646);
				setter();
				setState(647);
				match(OpenParen);
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 525376L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 1125899906842623L) != 0)) {
					{
					setState(648);
					formalParameterList();
					}
				}

				setState(651);
				match(CloseParen);
				setState(652);
				functionBody();
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
	public static class FieldDefinitionContext extends ParserRuleContext {
		public ClassElementNameContext classElementName() {
			return getRuleContext(ClassElementNameContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public FieldDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFieldDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFieldDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFieldDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDefinitionContext fieldDefinition() throws RecognitionException {
		FieldDefinitionContext _localctx = new FieldDefinitionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fieldDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			classElementName();
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(657);
				initializer();
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
	public static class ClassElementNameContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public PrivateIdentifierContext privateIdentifier() {
			return getRuleContext(PrivateIdentifierContext.class,0);
		}
		public ClassElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterClassElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitClassElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitClassElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassElementNameContext classElementName() throws RecognitionException {
		ClassElementNameContext _localctx = new ClassElementNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classElementName);
		try {
			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Of:
			case Yield:
			case YieldStar:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case StrictLet:
			case NonStrictLet:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				propertyName();
				}
				break;
			case Hashtag:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				privateIdentifier();
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
	public static class PrivateIdentifierContext extends ParserRuleContext {
		public TerminalNode Hashtag() { return getToken(ReactParser.Hashtag, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public PrivateIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPrivateIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPrivateIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPrivateIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivateIdentifierContext privateIdentifier() throws RecognitionException {
		PrivateIdentifierContext _localctx = new PrivateIdentifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_privateIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(Hashtag);
			setState(665);
			identifierName();
			}
		}
		catch (RecognitionException re) {
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
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterArgContext> formalParameterArg() {
			return getRuleContexts(FormalParameterArgContext.class);
		}
		public FormalParameterArgContext formalParameterArg(int i) {
			return getRuleContext(FormalParameterArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public LastFormalParameterArgContext lastFormalParameterArg() {
			return getRuleContext(LastFormalParameterArgContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case OpenBrace:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Of:
			case Yield:
			case YieldStar:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case StrictLet:
			case NonStrictLet:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				formalParameterArg();
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(668);
						match(Comma);
						setState(669);
						formalParameterArg();
						}
						} 
					}
					setState(674);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(675);
					match(Comma);
					setState(676);
					lastFormalParameterArg();
					}
				}

				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				lastFormalParameterArg();
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
	public static class FormalParameterArgContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFormalParameterArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFormalParameterArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			assignable();
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(683);
				match(Assign);
				setState(684);
				singleExpression(0);
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
	public static class LastFormalParameterArgContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(ReactParser.Ellipsis, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public LastFormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLastFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLastFormalParameterArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLastFormalParameterArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterArgContext lastFormalParameterArg() throws RecognitionException {
		LastFormalParameterArgContext _localctx = new LastFormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_lastFormalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(Ellipsis);
			setState(688);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
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
		enterRule(_localctx, 110, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(OpenBrace);
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(691);
				sourceElements();
				}
				break;
			}
			setState(694);
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
	public static class SourceElementsContext extends ParserRuleContext {
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSourceElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSourceElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_sourceElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(697); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(696);
					sourceElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(699); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(701);
			match(OpenBracket);
			setState(702);
			elementList();
			setState(703);
			match(CloseBracket);
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
	public static class ElementListContext extends ParserRuleContext {
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(705);
					match(Comma);
					}
					} 
				}
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036722129568L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0)) {
				{
				setState(711);
				arrayElement();
				}
			}

			setState(722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(715); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(714);
						match(Comma);
						}
						}
						setState(717); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(719);
					arrayElement();
					}
					} 
				}
				setState(724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(725);
				match(Comma);
				}
				}
				setState(730);
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
	public static class ArrayElementContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(ReactParser.Ellipsis, 0); }
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arrayElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(731);
				match(Ellipsis);
				}
			}

			setState(734);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
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
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPropertyExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPropertyExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComputedPropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public ComputedPropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComputedPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComputedPropertyExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComputedPropertyExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyShorthandContext extends PropertyAssignmentContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(ReactParser.Ellipsis, 0); }
		public PropertyShorthandContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPropertyShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPropertyShorthand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPropertyShorthand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertySetterContext extends PropertyAssignmentContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public FormalParameterArgContext formalParameterArg() {
			return getRuleContext(FormalParameterArgContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public PropertySetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPropertySetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPropertySetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPropertySetter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyGetterContext extends PropertyAssignmentContext {
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public PropertyGetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPropertyGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPropertyGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPropertyGetter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionPropertyContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionPropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_propertyAssignment);
		int _la;
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				propertyName();
				setState(737);
				match(Colon);
				setState(738);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				match(OpenBracket);
				setState(741);
				singleExpression(0);
				setState(742);
				match(CloseBracket);
				setState(743);
				match(Colon);
				setState(744);
				singleExpression(0);
				}
				break;
			case 3:
				_localctx = new FunctionPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(746);
					match(Async);
					}
					break;
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(749);
					match(Multiply);
					}
				}

				setState(752);
				propertyName();
				setState(753);
				match(OpenParen);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 525376L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 1125899906842623L) != 0)) {
					{
					setState(754);
					formalParameterList();
					}
				}

				setState(757);
				match(CloseParen);
				setState(758);
				functionBody();
				}
				break;
			case 4:
				_localctx = new PropertyGetterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(760);
				getter();
				setState(761);
				match(OpenParen);
				setState(762);
				match(CloseParen);
				setState(763);
				functionBody();
				}
				break;
			case 5:
				_localctx = new PropertySetterContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(765);
				setter();
				setState(766);
				match(OpenParen);
				setState(767);
				formalParameterArg();
				setState(768);
				match(CloseParen);
				setState(769);
				functionBody();
				}
				break;
			case 6:
				_localctx = new PropertyShorthandContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(771);
					match(Ellipsis);
					}
				}

				setState(774);
				singleExpression(0);
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
	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_propertyName);
		try {
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Of:
			case Yield:
			case YieldStar:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case StrictLet:
			case NonStrictLet:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(779);
				numericLiteral();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(780);
				match(OpenBracket);
				setState(781);
				singleExpression(0);
				setState(782);
				match(CloseBracket);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(OpenParen);
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036722129568L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0)) {
				{
				setState(787);
				argument();
				setState(792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(788);
						match(Comma);
						setState(789);
						argument();
						}
						} 
					}
					setState(794);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(795);
					match(Comma);
					}
				}

				}
			}

			setState(800);
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
	public static class ArgumentContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(ReactParser.Ellipsis, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(802);
				match(Ellipsis);
				}
			}

			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(805);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(806);
				identifier();
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
		enterRule(_localctx, 128, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			singleExpression(0);
			setState(814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(810);
					match(Comma);
					setState(811);
					singleExpression(0);
					}
					} 
				}
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStringExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TemplateStringLiteralContext templateStringLiteral() {
			return getRuleContext(TemplateStringLiteralContext.class,0);
		}
		public TemplateStringExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTemplateStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTemplateStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTemplateStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(ReactParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(ReactParser.And, 0); }
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Power() { return getToken(ReactParser.Power, 0); }
		public PowerExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreIncrementExpressionContext extends SingleExpressionContext {
		public TerminalNode PlusPlus() { return getToken(ReactParser.PlusPlus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObjectLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitObjectLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetaExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(ReactParser.New, 0); }
		public TerminalNode Dot() { return getToken(ReactParser.Dot, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MetaExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMetaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMetaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMetaExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(ReactParser.In, 0); }
		public InExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(ReactParser.Or, 0); }
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionalChainExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode QuestionMarkDot() { return getToken(ReactParser.QuestionMarkDot, 0); }
		public OptionalChainExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOptionalChainExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOptionalChainExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOptionalChainExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends SingleExpressionContext {
		public TerminalNode Not() { return getToken(ReactParser.Not, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public TerminalNode MinusMinus() { return getToken(ReactParser.MinusMinus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPreDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPreDecreaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPreDecreaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArgumentsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArgumentsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArgumentsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AwaitExpressionContext extends SingleExpressionContext {
		public TerminalNode Await() { return getToken(ReactParser.Await, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public AwaitExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAwaitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAwaitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAwaitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(ReactParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public TerminalNode Minus() { return getToken(ReactParser.Minus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(ReactParser.MinusMinus, 0); }
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPostDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPostDecreaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPostDecreaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeofExpressionContext extends SingleExpressionContext {
		public TerminalNode Typeof() { return getToken(ReactParser.Typeof, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTypeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTypeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstanceofExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Instanceof() { return getToken(ReactParser.Instanceof, 0); }
		public InstanceofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterInstanceofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitInstanceofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitInstanceofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public TerminalNode Plus() { return getToken(ReactParser.Plus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUnaryPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUnaryPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeleteExpressionContext extends SingleExpressionContext {
		public TerminalNode Delete() { return getToken(ReactParser.Delete, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public DeleteExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDeleteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDeleteExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportExpressionContext extends SingleExpressionContext {
		public TerminalNode Import() { return getToken(ReactParser.Import, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public ImportExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Equals_() { return getToken(ReactParser.Equals_, 0); }
		public TerminalNode NotEquals() { return getToken(ReactParser.NotEquals, 0); }
		public TerminalNode IdentityEquals() { return getToken(ReactParser.IdentityEquals, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(ReactParser.IdentityNotEquals, 0); }
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitXOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitXOr() { return getToken(ReactParser.BitXOr, 0); }
		public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBitXOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBitXOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBitXOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuperExpressionContext extends SingleExpressionContext {
		public TerminalNode Super() { return getToken(ReactParser.Super, 0); }
		public SuperExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSuperExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSuperExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSuperExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(ReactParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(ReactParser.Modulus, 0); }
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitShiftExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode LeftShiftArithmetic() { return getToken(ReactParser.LeftShiftArithmetic, 0); }
		public TerminalNode RightShiftArithmetic() { return getToken(ReactParser.RightShiftArithmetic, 0); }
		public TerminalNode RightShiftLogical() { return getToken(ReactParser.RightShiftLogical, 0); }
		public BitShiftExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBitShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(ReactParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(ReactParser.Minus, 0); }
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(ReactParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(ReactParser.GreaterThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(ReactParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ReactParser.GreaterThanEquals, 0); }
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(ReactParser.PlusPlus, 0); }
		public PostIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldExpressionContext extends SingleExpressionContext {
		public YieldStatementContext yieldStatement() {
			return getRuleContext(YieldStatementContext.class,0);
		}
		public YieldExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterYieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitYieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitYieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitNotExpressionContext extends SingleExpressionContext {
		public TerminalNode BitNot() { return getToken(ReactParser.BitNot, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public BitNotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBitNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(ReactParser.New, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NewExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(ReactParser.Dot, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(ReactParser.QuestionMark, 0); }
		public TerminalNode Hashtag() { return getToken(ReactParser.Hashtag, 0); }
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMemberDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMemberDotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassExpressionContext extends SingleExpressionContext {
		public TerminalNode Class() { return getToken(ReactParser.Class, 0); }
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterClassExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitClassExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitClassExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public TerminalNode QuestionMarkDot() { return getToken(ReactParser.QuestionMarkDot, 0); }
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMemberIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMemberIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitAnd() { return getToken(ReactParser.BitAnd, 0); }
		public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBitAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitOr() { return getToken(ReactParser.BitOr, 0); }
		public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBitOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAssignmentOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAssignmentOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAssignmentOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidExpressionContext extends SingleExpressionContext {
		public TerminalNode Void() { return getToken(ReactParser.Void, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VoidExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVoidExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVoidExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVoidExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CoalesceExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode NullCoalesce() { return getToken(ReactParser.NullCoalesce, 0); }
		public CoalesceExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCoalesceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCoalesceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCoalesceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(818);
				anonymousFunction();
				}
				break;
			case 2:
				{
				_localctx = new ClassExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(819);
				match(Class);
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 8458255L) != 0)) {
					{
					setState(820);
					identifier();
					}
				}

				setState(823);
				classTail();
				}
				break;
			case 3:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(824);
				match(New);
				setState(825);
				identifier();
				setState(826);
				arguments();
				}
				break;
			case 4:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(828);
				match(New);
				setState(829);
				singleExpression(0);
				setState(830);
				arguments();
				}
				break;
			case 5:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(832);
				match(New);
				setState(833);
				singleExpression(42);
				}
				break;
			case 6:
				{
				_localctx = new MetaExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(834);
				match(New);
				setState(835);
				match(Dot);
				setState(836);
				identifier();
				}
				break;
			case 7:
				{
				_localctx = new DeleteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(837);
				match(Delete);
				setState(838);
				singleExpression(37);
				}
				break;
			case 8:
				{
				_localctx = new VoidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(839);
				match(Void);
				setState(840);
				singleExpression(36);
				}
				break;
			case 9:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(841);
				match(Typeof);
				setState(842);
				singleExpression(35);
				}
				break;
			case 10:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(843);
				match(PlusPlus);
				setState(844);
				singleExpression(34);
				}
				break;
			case 11:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(845);
				match(MinusMinus);
				setState(846);
				singleExpression(33);
				}
				break;
			case 12:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(847);
				match(Plus);
				setState(848);
				singleExpression(32);
				}
				break;
			case 13:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(849);
				match(Minus);
				setState(850);
				singleExpression(31);
				}
				break;
			case 14:
				{
				_localctx = new BitNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(851);
				match(BitNot);
				setState(852);
				singleExpression(30);
				}
				break;
			case 15:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(853);
				match(Not);
				setState(854);
				singleExpression(29);
				}
				break;
			case 16:
				{
				_localctx = new AwaitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(855);
				match(Await);
				setState(856);
				singleExpression(28);
				}
				break;
			case 17:
				{
				_localctx = new ImportExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(857);
				match(Import);
				setState(858);
				match(OpenParen);
				setState(859);
				singleExpression(0);
				setState(860);
				match(CloseParen);
				}
				break;
			case 18:
				{
				_localctx = new YieldExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(862);
				yieldStatement();
				}
				break;
			case 19:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(863);
				match(This);
				}
				break;
			case 20:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(864);
				identifier();
				}
				break;
			case 21:
				{
				_localctx = new SuperExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(865);
				match(Super);
				}
				break;
			case 22:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(866);
				literal();
				}
				break;
			case 23:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(867);
				arrayLiteral();
				}
				break;
			case 24:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(868);
				objectLiteral();
				}
				break;
			case 25:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(869);
				match(OpenParen);
				setState(870);
				expressionSequence();
				setState(871);
				match(CloseParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(962);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(960);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						_localctx = new OptionalChainExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(875);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(876);
						match(QuestionMarkDot);
						setState(877);
						singleExpression(48);
						}
						break;
					case 2:
						{
						_localctx = new PowerExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(878);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(879);
						match(Power);
						setState(880);
						singleExpression(27);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(881);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(882);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(883);
						singleExpression(27);
						}
						break;
					case 4:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(884);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(885);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(886);
						singleExpression(26);
						}
						break;
					case 5:
						{
						_localctx = new CoalesceExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(887);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(888);
						match(NullCoalesce);
						setState(889);
						singleExpression(25);
						}
						break;
					case 6:
						{
						_localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(890);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(891);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(892);
						singleExpression(24);
						}
						break;
					case 7:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(893);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(894);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 893353197568L) != 0) || _la==GreaterThan) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(895);
						singleExpression(23);
						}
						break;
					case 8:
						{
						_localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(896);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(897);
						match(Instanceof);
						setState(898);
						singleExpression(22);
						}
						break;
					case 9:
						{
						_localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(899);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(900);
						match(In);
						setState(901);
						singleExpression(21);
						}
						break;
					case 10:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(902);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(903);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674416640L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(904);
						singleExpression(20);
						}
						break;
					case 11:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(905);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(906);
						match(BitAnd);
						setState(907);
						singleExpression(19);
						}
						break;
					case 12:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(908);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(909);
						match(BitXOr);
						setState(910);
						singleExpression(18);
						}
						break;
					case 13:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(911);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(912);
						match(BitOr);
						setState(913);
						singleExpression(17);
						}
						break;
					case 14:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(914);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(915);
						match(And);
						setState(916);
						singleExpression(16);
						}
						break;
					case 15:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(917);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(918);
						match(Or);
						setState(919);
						singleExpression(15);
						}
						break;
					case 16:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(920);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(921);
						match(QuestionMark);
						setState(922);
						singleExpression(0);
						setState(923);
						match(Colon);
						setState(924);
						singleExpression(14);
						}
						break;
					case 17:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(926);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(927);
						match(Assign);
						setState(928);
						singleExpression(12);
						}
						break;
					case 18:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(929);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(930);
						assignmentOperator();
						setState(931);
						singleExpression(11);
						}
						break;
					case 19:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(933);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(935);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMarkDot) {
							{
							setState(934);
							match(QuestionMarkDot);
							}
						}

						setState(937);
						match(OpenBracket);
						setState(938);
						expressionSequence();
						setState(939);
						match(CloseBracket);
						}
						break;
					case 20:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(941);
						if (!(precpred(_ctx, 45))) throw new FailedPredicateException(this, "precpred(_ctx, 45)");
						setState(943);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMark) {
							{
							setState(942);
							match(QuestionMark);
							}
						}

						setState(945);
						match(Dot);
						setState(947);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Hashtag) {
							{
							setState(946);
							match(Hashtag);
							}
						}

						setState(949);
						identifierName();
						}
						break;
					case 21:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(950);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(951);
						arguments();
						}
						break;
					case 22:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(952);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(953);
						if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
						setState(954);
						match(PlusPlus);
						}
						break;
					case 23:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(955);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(956);
						if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
						setState(957);
						match(MinusMinus);
						}
						break;
					case 24:
						{
						_localctx = new TemplateStringExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(958);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(959);
						templateStringLiteral();
						}
						break;
					}
					} 
				}
				setState(964);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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
	public static class InitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(Assign);
			setState(966);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
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
	public static class AssignableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAssignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assignable);
		try {
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(970);
				arrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(971);
				objectLiteral();
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
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(OpenBrace);
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(975);
				propertyAssignment();
				setState(980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(976);
						match(Comma);
						setState(977);
						propertyAssignment();
						}
						} 
					}
					setState(982);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(983);
					match(Comma);
					}
				}

				}
				break;
			}
			setState(988);
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
	public static class AnonymousFunctionContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode Function_() { return getToken(ReactParser.Function_, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ArrowFunctionParametersContext arrowFunctionParameters() {
			return getRuleContext(ArrowFunctionParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public ArrowFunctionBodyContext arrowFunctionBody() {
			return getRuleContext(ArrowFunctionBodyContext.class,0);
		}
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAnonymousFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAnonymousFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAnonymousFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_anonymousFunction);
		int _la;
		try {
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Async) {
					{
					setState(991);
					match(Async);
					}
				}

				setState(994);
				match(Function_);
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(995);
					match(Multiply);
					}
				}

				setState(998);
				match(OpenParen);
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 525376L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 1125899906842623L) != 0)) {
					{
					setState(999);
					formalParameterList();
					}
				}

				setState(1002);
				match(CloseParen);
				setState(1003);
				functionBody();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1005);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1004);
					match(Async);
					}
					break;
				}
				setState(1007);
				arrowFunctionParameters();
				setState(1008);
				match(ARROW);
				setState(1009);
				arrowFunctionBody();
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
	public static class ArrowFunctionParametersContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ArrowFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrowFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrowFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrowFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionParametersContext arrowFunctionParameters() throws RecognitionException {
		ArrowFunctionParametersContext _localctx = new ArrowFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_arrowFunctionParameters);
		int _la;
		try {
			setState(1019);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Of:
			case Yield:
			case YieldStar:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case StrictLet:
			case NonStrictLet:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013);
				propertyName();
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(OpenParen);
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 525376L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 1125899906842623L) != 0)) {
					{
					setState(1015);
					formalParameterList();
					}
				}

				setState(1018);
				match(CloseParen);
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
	public static class ArrowFunctionBodyContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ArrowFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrowFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrowFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrowFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionBodyContext arrowFunctionBody() throws RecognitionException {
		ArrowFunctionBodyContext _localctx = new ArrowFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_arrowFunctionBody);
		try {
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1021);
				singleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				functionBody();
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
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode MultiplyAssign() { return getToken(ReactParser.MultiplyAssign, 0); }
		public TerminalNode DivideAssign() { return getToken(ReactParser.DivideAssign, 0); }
		public TerminalNode ModulusAssign() { return getToken(ReactParser.ModulusAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(ReactParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(ReactParser.MinusAssign, 0); }
		public TerminalNode LeftShiftArithmeticAssign() { return getToken(ReactParser.LeftShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftArithmeticAssign() { return getToken(ReactParser.RightShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftLogicalAssign() { return getToken(ReactParser.RightShiftLogicalAssign, 0); }
		public TerminalNode BitAndAssign() { return getToken(ReactParser.BitAndAssign, 0); }
		public TerminalNode BitXorAssign() { return getToken(ReactParser.BitXorAssign, 0); }
		public TerminalNode BitOrAssign() { return getToken(ReactParser.BitOrAssign, 0); }
		public TerminalNode PowerAssign() { return getToken(ReactParser.PowerAssign, 0); }
		public TerminalNode NullishCoalescingAssign() { return getToken(ReactParser.NullishCoalescingAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611123068473966592L) != 0)) ) {
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(ReactParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ReactParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public TemplateStringLiteralContext templateStringLiteral() {
			return getRuleContext(TemplateStringLiteralContext.class,0);
		}
		public TerminalNode RegularExpressionLiteral() { return getToken(ReactParser.RegularExpressionLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BigintLiteralContext bigintLiteral() {
			return getRuleContext(BigintLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_literal);
		try {
			setState(1034);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1028);
				match(BooleanLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1029);
				match(StringLiteral);
				}
				break;
			case BackTick:
				enterOuterAlt(_localctx, 4);
				{
				setState(1030);
				templateStringLiteral();
				}
				break;
			case RegularExpressionLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1031);
				match(RegularExpressionLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(1032);
				numericLiteral();
				}
				break;
			case BigHexIntegerLiteral:
			case BigOctalIntegerLiteral:
			case BigBinaryIntegerLiteral:
			case BigDecimalIntegerLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(1033);
				bigintLiteral();
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
	public static class TemplateStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> BackTick() { return getTokens(ReactParser.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(ReactParser.BackTick, i);
		}
		public List<TemplateStringAtomContext> templateStringAtom() {
			return getRuleContexts(TemplateStringAtomContext.class);
		}
		public TemplateStringAtomContext templateStringAtom(int i) {
			return getRuleContext(TemplateStringAtomContext.class,i);
		}
		public TemplateStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTemplateStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTemplateStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTemplateStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStringLiteralContext templateStringLiteral() throws RecognitionException {
		TemplateStringLiteralContext _localctx = new TemplateStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_templateStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(BackTick);
			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TemplateStringStartExpression || _la==TemplateStringAtom) {
				{
				{
				setState(1037);
				templateStringAtom();
				}
				}
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1043);
			match(BackTick);
			}
		}
		catch (RecognitionException re) {
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
	public static class TemplateStringAtomContext extends ParserRuleContext {
		public TerminalNode TemplateStringAtom() { return getToken(ReactParser.TemplateStringAtom, 0); }
		public TerminalNode TemplateStringStartExpression() { return getToken(ReactParser.TemplateStringStartExpression, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode TemplateCloseBrace() { return getToken(ReactParser.TemplateCloseBrace, 0); }
		public TemplateStringAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStringAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTemplateStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTemplateStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTemplateStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStringAtomContext templateStringAtom() throws RecognitionException {
		TemplateStringAtomContext _localctx = new TemplateStringAtomContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_templateStringAtom);
		try {
			setState(1050);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TemplateStringAtom:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045);
				match(TemplateStringAtom);
				}
				break;
			case TemplateStringStartExpression:
				enterOuterAlt(_localctx, 2);
				{
				setState(1046);
				match(TemplateStringStartExpression);
				setState(1047);
				singleExpression(0);
				setState(1048);
				match(TemplateCloseBrace);
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
	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(ReactParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(ReactParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(ReactParser.OctalIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral2() { return getToken(ReactParser.OctalIntegerLiteral2, 0); }
		public TerminalNode BinaryIntegerLiteral() { return getToken(ReactParser.BinaryIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 31L) != 0)) ) {
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
	public static class BigintLiteralContext extends ParserRuleContext {
		public TerminalNode BigDecimalIntegerLiteral() { return getToken(ReactParser.BigDecimalIntegerLiteral, 0); }
		public TerminalNode BigHexIntegerLiteral() { return getToken(ReactParser.BigHexIntegerLiteral, 0); }
		public TerminalNode BigOctalIntegerLiteral() { return getToken(ReactParser.BigOctalIntegerLiteral, 0); }
		public TerminalNode BigBinaryIntegerLiteral() { return getToken(ReactParser.BigBinaryIntegerLiteral, 0); }
		public BigintLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bigintLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBigintLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBigintLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBigintLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BigintLiteralContext bigintLiteral() throws RecognitionException {
		BigintLiteralContext _localctx = new BigintLiteralContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_bigintLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 15L) != 0)) ) {
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
	public static class GetterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassElementNameContext classElementName() {
			return getRuleContext(ClassElementNameContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			if (!(this.n("get"))) throw new FailedPredicateException(this, "this.n(\"get\")");
			setState(1057);
			identifier();
			setState(1058);
			classElementName();
			}
		}
		catch (RecognitionException re) {
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
	public static class SetterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassElementNameContext classElementName() {
			return getRuleContext(ClassElementNameContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			if (!(this.n("set"))) throw new FailedPredicateException(this, "this.n(\"set\")");
			setState(1061);
			identifier();
			setState(1062);
			classElementName();
			}
		}
		catch (RecognitionException re) {
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
	public static class IdentifierNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIdentifierName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIdentifierName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_identifierName);
		try {
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
				reservedWord();
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode NonStrictLet() { return getToken(ReactParser.NonStrictLet, 0); }
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public TerminalNode As() { return getToken(ReactParser.As, 0); }
		public TerminalNode From() { return getToken(ReactParser.From, 0); }
		public TerminalNode Yield() { return getToken(ReactParser.Yield, 0); }
		public TerminalNode Of() { return getToken(ReactParser.Of, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 8458255L) != 0)) ) {
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
	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(ReactParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ReactParser.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_reservedWord);
		try {
			setState(1073);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Of:
			case Yield:
			case YieldStar:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case StrictLet:
			case NonStrictLet:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				keyword();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1072);
				match(BooleanLiteral);
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
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ReactParser.Break, 0); }
		public TerminalNode Do() { return getToken(ReactParser.Do, 0); }
		public TerminalNode Instanceof() { return getToken(ReactParser.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(ReactParser.Typeof, 0); }
		public TerminalNode Case() { return getToken(ReactParser.Case, 0); }
		public TerminalNode Else() { return getToken(ReactParser.Else, 0); }
		public TerminalNode New() { return getToken(ReactParser.New, 0); }
		public TerminalNode Var() { return getToken(ReactParser.Var, 0); }
		public TerminalNode Catch() { return getToken(ReactParser.Catch, 0); }
		public TerminalNode Finally() { return getToken(ReactParser.Finally, 0); }
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public TerminalNode Void() { return getToken(ReactParser.Void, 0); }
		public TerminalNode Continue() { return getToken(ReactParser.Continue, 0); }
		public TerminalNode For() { return getToken(ReactParser.For, 0); }
		public TerminalNode Switch() { return getToken(ReactParser.Switch, 0); }
		public TerminalNode While() { return getToken(ReactParser.While, 0); }
		public TerminalNode Debugger() { return getToken(ReactParser.Debugger, 0); }
		public TerminalNode Function_() { return getToken(ReactParser.Function_, 0); }
		public TerminalNode This() { return getToken(ReactParser.This, 0); }
		public TerminalNode With() { return getToken(ReactParser.With, 0); }
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public TerminalNode If() { return getToken(ReactParser.If, 0); }
		public TerminalNode Throw() { return getToken(ReactParser.Throw, 0); }
		public TerminalNode Delete() { return getToken(ReactParser.Delete, 0); }
		public TerminalNode In() { return getToken(ReactParser.In, 0); }
		public TerminalNode Try() { return getToken(ReactParser.Try, 0); }
		public TerminalNode Class() { return getToken(ReactParser.Class, 0); }
		public TerminalNode Enum() { return getToken(ReactParser.Enum, 0); }
		public TerminalNode Extends() { return getToken(ReactParser.Extends, 0); }
		public TerminalNode Super() { return getToken(ReactParser.Super, 0); }
		public TerminalNode Const() { return getToken(ReactParser.Const, 0); }
		public TerminalNode Export() { return getToken(ReactParser.Export, 0); }
		public TerminalNode Import() { return getToken(ReactParser.Import, 0); }
		public TerminalNode Implements() { return getToken(ReactParser.Implements, 0); }
		public Let_Context let_() {
			return getRuleContext(Let_Context.class,0);
		}
		public TerminalNode Private() { return getToken(ReactParser.Private, 0); }
		public TerminalNode Public() { return getToken(ReactParser.Public, 0); }
		public TerminalNode Interface() { return getToken(ReactParser.Interface, 0); }
		public TerminalNode Package() { return getToken(ReactParser.Package, 0); }
		public TerminalNode Protected() { return getToken(ReactParser.Protected, 0); }
		public TerminalNode Static() { return getToken(ReactParser.Static, 0); }
		public TerminalNode Yield() { return getToken(ReactParser.Yield, 0); }
		public TerminalNode YieldStar() { return getToken(ReactParser.YieldStar, 0); }
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public TerminalNode Await() { return getToken(ReactParser.Await, 0); }
		public TerminalNode From() { return getToken(ReactParser.From, 0); }
		public TerminalNode As() { return getToken(ReactParser.As, 0); }
		public TerminalNode Of() { return getToken(ReactParser.Of, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_keyword);
		try {
			setState(1123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				enterOuterAlt(_localctx, 1);
				{
				setState(1075);
				match(Break);
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
				match(Do);
				}
				break;
			case Instanceof:
				enterOuterAlt(_localctx, 3);
				{
				setState(1077);
				match(Instanceof);
				}
				break;
			case Typeof:
				enterOuterAlt(_localctx, 4);
				{
				setState(1078);
				match(Typeof);
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 5);
				{
				setState(1079);
				match(Case);
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 6);
				{
				setState(1080);
				match(Else);
				}
				break;
			case New:
				enterOuterAlt(_localctx, 7);
				{
				setState(1081);
				match(New);
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 8);
				{
				setState(1082);
				match(Var);
				}
				break;
			case Catch:
				enterOuterAlt(_localctx, 9);
				{
				setState(1083);
				match(Catch);
				}
				break;
			case Finally:
				enterOuterAlt(_localctx, 10);
				{
				setState(1084);
				match(Finally);
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 11);
				{
				setState(1085);
				match(Return);
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 12);
				{
				setState(1086);
				match(Void);
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 13);
				{
				setState(1087);
				match(Continue);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 14);
				{
				setState(1088);
				match(For);
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 15);
				{
				setState(1089);
				match(Switch);
				}
				break;
			case While:
				enterOuterAlt(_localctx, 16);
				{
				setState(1090);
				match(While);
				}
				break;
			case Debugger:
				enterOuterAlt(_localctx, 17);
				{
				setState(1091);
				match(Debugger);
				}
				break;
			case Function_:
				enterOuterAlt(_localctx, 18);
				{
				setState(1092);
				match(Function_);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 19);
				{
				setState(1093);
				match(This);
				}
				break;
			case With:
				enterOuterAlt(_localctx, 20);
				{
				setState(1094);
				match(With);
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 21);
				{
				setState(1095);
				match(Default);
				}
				break;
			case If:
				enterOuterAlt(_localctx, 22);
				{
				setState(1096);
				match(If);
				}
				break;
			case Throw:
				enterOuterAlt(_localctx, 23);
				{
				setState(1097);
				match(Throw);
				}
				break;
			case Delete:
				enterOuterAlt(_localctx, 24);
				{
				setState(1098);
				match(Delete);
				}
				break;
			case In:
				enterOuterAlt(_localctx, 25);
				{
				setState(1099);
				match(In);
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 26);
				{
				setState(1100);
				match(Try);
				}
				break;
			case Class:
				enterOuterAlt(_localctx, 27);
				{
				setState(1101);
				match(Class);
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 28);
				{
				setState(1102);
				match(Enum);
				}
				break;
			case Extends:
				enterOuterAlt(_localctx, 29);
				{
				setState(1103);
				match(Extends);
				}
				break;
			case Super:
				enterOuterAlt(_localctx, 30);
				{
				setState(1104);
				match(Super);
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 31);
				{
				setState(1105);
				match(Const);
				}
				break;
			case Export:
				enterOuterAlt(_localctx, 32);
				{
				setState(1106);
				match(Export);
				}
				break;
			case Import:
				enterOuterAlt(_localctx, 33);
				{
				setState(1107);
				match(Import);
				}
				break;
			case Implements:
				enterOuterAlt(_localctx, 34);
				{
				setState(1108);
				match(Implements);
				}
				break;
			case StrictLet:
			case NonStrictLet:
				enterOuterAlt(_localctx, 35);
				{
				setState(1109);
				let_();
				}
				break;
			case Private:
				enterOuterAlt(_localctx, 36);
				{
				setState(1110);
				match(Private);
				}
				break;
			case Public:
				enterOuterAlt(_localctx, 37);
				{
				setState(1111);
				match(Public);
				}
				break;
			case Interface:
				enterOuterAlt(_localctx, 38);
				{
				setState(1112);
				match(Interface);
				}
				break;
			case Package:
				enterOuterAlt(_localctx, 39);
				{
				setState(1113);
				match(Package);
				}
				break;
			case Protected:
				enterOuterAlt(_localctx, 40);
				{
				setState(1114);
				match(Protected);
				}
				break;
			case Static:
				enterOuterAlt(_localctx, 41);
				{
				setState(1115);
				match(Static);
				}
				break;
			case Yield:
				enterOuterAlt(_localctx, 42);
				{
				setState(1116);
				match(Yield);
				}
				break;
			case YieldStar:
				enterOuterAlt(_localctx, 43);
				{
				setState(1117);
				match(YieldStar);
				}
				break;
			case Async:
				enterOuterAlt(_localctx, 44);
				{
				setState(1118);
				match(Async);
				}
				break;
			case Await:
				enterOuterAlt(_localctx, 45);
				{
				setState(1119);
				match(Await);
				}
				break;
			case From:
				enterOuterAlt(_localctx, 46);
				{
				setState(1120);
				match(From);
				}
				break;
			case As:
				enterOuterAlt(_localctx, 47);
				{
				setState(1121);
				match(As);
				}
				break;
			case Of:
				enterOuterAlt(_localctx, 48);
				{
				setState(1122);
				match(Of);
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
	public static class Let_Context extends ParserRuleContext {
		public TerminalNode NonStrictLet() { return getToken(ReactParser.NonStrictLet, 0); }
		public TerminalNode StrictLet() { return getToken(ReactParser.StrictLet, 0); }
		public Let_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLet_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLet_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLet_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_Context let_() throws RecognitionException {
		Let_Context _localctx = new Let_Context(_ctx, getState());
		enterRule(_localctx, 168, RULE_let_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			_la = _input.LA(1);
			if ( !(_la==StrictLet || _la==NonStrictLet) ) {
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
		public TerminalNode EOF() { return getToken(ReactParser.EOF, 0); }
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
		enterRule(_localctx, 170, RULE_eos);
		try {
			setState(1131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1127);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1128);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1129);
				if (!(this.lineTerminatorAhead())) throw new FailedPredicateException(this, "this.lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1130);
				if (!(this.closeBrace())) throw new FailedPredicateException(this, "this.closeBrace()");
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
		enterRule(_localctx, 172, RULE_jsxElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1133);
				jsxElement();
				}
				}
				setState(1136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 1052673L) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 174, RULE_jsxElementBegin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			_la = _input.LA(1);
			if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 1052673L) != 0)) ) {
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
		enterRule(_localctx, 176, RULE_jsxElement);
		try {
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				jsxSelfClosingElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				jsxOpeningElement();
				setState(1142);
				jsxChildren();
				setState(1143);
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
		enterRule(_localctx, 178, RULE_jsxSelfClosingElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			jsxElementBegin();
			setState(1148);
			jsxSelfClosingElementName();
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
				{
				setState(1149);
				jsxAttributes();
				}
			}

			setState(1152);
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
		enterRule(_localctx, 180, RULE_jsxOpeningElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			jsxElementBegin();
			setState(1155);
			jsxOpeningElementName();
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
				{
				setState(1156);
				jsxAttributes();
				}
			}

			setState(1159);
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
		enterRule(_localctx, 182, RULE_jsxClosingElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(JsxChildrenClosingElementSlashBegin);
			setState(1162);
			jsxClosingElementName();
			setState(1163);
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
		enterRule(_localctx, 184, RULE_jsxChildren);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HtmlChardata) {
				{
				setState(1165);
				match(HtmlChardata);
				}
			}

			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenBrace || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 1069073L) != 0)) {
				{
				{
				setState(1170);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JsxOpeningElementBegin:
				case JsxChildrenOpeningElementBegin:
				case JsxElementBegin:
					{
					setState(1168);
					jsxElement();
					}
					break;
				case OpenBrace:
				case JsxOpeningElementOpenBrace:
				case JsxChildrenOpenBrace:
					{
					setState(1169);
					objectExpressionSequence();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HtmlChardata) {
					{
					setState(1172);
					match(HtmlChardata);
					}
				}

				}
				}
				setState(1179);
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
		enterRule(_localctx, 186, RULE_jsxSelfClosingElementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
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
		enterRule(_localctx, 188, RULE_jsxOpeningElementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
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
		enterRule(_localctx, 190, RULE_jsxClosingElementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			((JsxClosingElementNameContext)_localctx).JsxClosingElementId = match(JsxClosingElementId);
			setState(1186);
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
		enterRule(_localctx, 192, RULE_jsxAttributes);
		int _la;
		try {
			setState(1196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JsxOpeningElementOpenBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(1188);
				jsxSpreadAttribute();
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
					{
					setState(1189);
					jsxAttributes();
					}
				}

				}
				break;
			case JsxOpeningElementId:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				jsxAttribute();
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
					{
					setState(1193);
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
		enterRule(_localctx, 194, RULE_jsxSpreadAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			match(JsxOpeningElementOpenBrace);
			setState(1199);
			match(Ellipsis);
			setState(1200);
			singleExpression(0);
			setState(1201);
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
		enterRule(_localctx, 196, RULE_jsxAttribute);
		try {
			setState(1208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				jsxAttributeName();
				setState(1204);
				match(JsxAssign);
				setState(1205);
				jsxAttributeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
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
		enterRule(_localctx, 198, RULE_jsxAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
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
		enterRule(_localctx, 200, RULE_jsxAttributeValue);
		try {
			setState(1215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JsxAttributeValue:
				enterOuterAlt(_localctx, 1);
				{
				setState(1212);
				match(JsxAttributeValue);
				}
				break;
			case JsxOpeningElementBegin:
			case JsxChildrenOpeningElementBegin:
			case JsxElementBegin:
				enterOuterAlt(_localctx, 2);
				{
				setState(1213);
				jsxElement();
				}
				break;
			case OpenBrace:
			case JsxOpeningElementOpenBrace:
			case JsxChildrenOpenBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1214);
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
		enterRule(_localctx, 202, RULE_openBrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
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
		enterRule(_localctx, 204, RULE_objectExpressionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			openBrace();
			setState(1220);
			expressionSequence();
			setState(1221);
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
	public static class AnoymousFunctionContext extends ParserRuleContext {
		public AnoymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anoymousFunction; }
	 
		public AnoymousFunctionContext() { }
		public void copyFrom(AnoymousFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnoymousFunctionDeclContext extends AnoymousFunctionContext {
		public TerminalNode Function_() { return getToken(ReactParser.Function_, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public AnoymousFunctionDeclContext(AnoymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAnoymousFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAnoymousFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAnoymousFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends AnoymousFunctionContext {
		public ArrowFunctionParametersContext arrowFunctionParameters() {
			return getRuleContext(ArrowFunctionParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public ArrowFunctionBodyContext arrowFunctionBody() {
			return getRuleContext(ArrowFunctionBodyContext.class,0);
		}
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public ArrowFunctionContext(AnoymousFunctionContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends AnoymousFunctionContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionDeclContext(AnoymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnoymousFunctionContext anoymousFunction() throws RecognitionException {
		AnoymousFunctionContext _localctx = new AnoymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_anoymousFunction);
		int _la;
		try {
			setState(1247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				_localctx = new FunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1223);
				functionDeclaration();
				}
				break;
			case 2:
				_localctx = new AnoymousFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Async) {
					{
					setState(1224);
					match(Async);
					}
				}

				setState(1227);
				match(Function_);
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(1228);
					match(Multiply);
					}
				}

				setState(1231);
				match(OpenParen);
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 525376L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 1125899906842623L) != 0)) {
					{
					setState(1232);
					formalParameterList();
					}
				}

				setState(1235);
				match(CloseParen);
				setState(1236);
				match(OpenBrace);
				setState(1237);
				functionBody();
				setState(1238);
				match(CloseBrace);
				}
				break;
			case 3:
				_localctx = new ArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1240);
					match(Async);
					}
					break;
				}
				setState(1243);
				arrowFunctionParameters();
				setState(1244);
				match(ARROW);
				setState(1245);
				arrowFunctionBody();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return expressionStatement_sempred((ExpressionStatementContext)_localctx, predIndex);
		case 28:
			return continueStatement_sempred((ContinueStatementContext)_localctx, predIndex);
		case 29:
			return breakStatement_sempred((BreakStatementContext)_localctx, predIndex);
		case 30:
			return returnStatement_sempred((ReturnStatementContext)_localctx, predIndex);
		case 31:
			return yieldStatement_sempred((YieldStatementContext)_localctx, predIndex);
		case 39:
			return throwStatement_sempred((ThrowStatementContext)_localctx, predIndex);
		case 47:
			return classElement_sempred((ClassElementContext)_localctx, predIndex);
		case 48:
			return methodDefinition_sempred((MethodDefinitionContext)_localctx, predIndex);
		case 65:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 78:
			return getter_sempred((GetterContext)_localctx, predIndex);
		case 79:
			return setter_sempred((SetterContext)_localctx, predIndex);
		case 85:
			return eos_sempred((EosContext)_localctx, predIndex);
		case 95:
			return jsxClosingElementName_sempred((JsxClosingElementNameContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionStatement_sempred(ExpressionStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return this.notOpenBraceAndNotFunction();
		}
		return true;
	}
	private boolean continueStatement_sempred(ContinueStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean breakStatement_sempred(BreakStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean returnStatement_sempred(ReturnStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean yieldStatement_sempred(YieldStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean throwStatement_sempred(ThrowStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean classElement_sempred(ClassElementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return this.n("static");
		case 7:
			return this.n("static");
		case 8:
			return this.n("static");
		}
		return true;
	}
	private boolean methodDefinition_sempred(MethodDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 47);
		case 11:
			return precpred(_ctx, 27);
		case 12:
			return precpred(_ctx, 26);
		case 13:
			return precpred(_ctx, 25);
		case 14:
			return precpred(_ctx, 24);
		case 15:
			return precpred(_ctx, 23);
		case 16:
			return precpred(_ctx, 22);
		case 17:
			return precpred(_ctx, 21);
		case 18:
			return precpred(_ctx, 20);
		case 19:
			return precpred(_ctx, 19);
		case 20:
			return precpred(_ctx, 18);
		case 21:
			return precpred(_ctx, 17);
		case 22:
			return precpred(_ctx, 16);
		case 23:
			return precpred(_ctx, 15);
		case 24:
			return precpred(_ctx, 14);
		case 25:
			return precpred(_ctx, 13);
		case 26:
			return precpred(_ctx, 12);
		case 27:
			return precpred(_ctx, 11);
		case 28:
			return precpred(_ctx, 46);
		case 29:
			return precpred(_ctx, 45);
		case 30:
			return precpred(_ctx, 41);
		case 31:
			return precpred(_ctx, 39);
		case 32:
			return this.notLineTerminator();
		case 33:
			return precpred(_ctx, 38);
		case 34:
			return this.notLineTerminator();
		case 35:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean getter_sempred(GetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return this.n("get");
		}
		return true;
	}
	private boolean setter_sempred(SetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return this.n("set");
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return this.lineTerminatorAhead();
		case 39:
			return this.closeBrace();
		}
		return true;
	}
	private boolean jsxClosingElementName_sempred(JsxClosingElementNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return this.popHtmlTagName((((JsxClosingElementNameContext)_localctx).JsxClosingElementId!=null?((JsxClosingElementNameContext)_localctx).JsxClosingElementId.getText():null));
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0098\u04e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0001\u0000"+
		"\u0003\u0000\u00d2\b\u0000\u0001\u0000\u0003\u0000\u00d5\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u00ef\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00f3\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004\u00f8\b\u0004\u000b\u0004"+
		"\f\u0004\u00f9\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006"+
		"\u0100\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0104\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u010b"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0111"+
		"\b\u0007\n\u0007\f\u0007\u0114\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0118\b\u0007\u0003\u0007\u011a\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0121\b\b\u0001\t\u0001\t\u0003\t\u0125\b\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003"+
		"\f\u012e\b\f\u0001\f\u0001\f\u0003\f\u0132\b\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u013a\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u013e\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0142\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u014b\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0153\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0157\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u015d\b\u0011\n\u0011\f\u0011\u0160"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0164\b\u0011\u0003\u0011"+
		"\u0166\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u016d\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0172\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u017b\b\u0015\n\u0015\f\u0015\u017e"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0183\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0192\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01a6\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01aa\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u01ae\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01b6\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01bf\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01c4\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01cb\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01d0\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u01d5\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01dc\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01e3\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u01ea\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0003"+
		"\"\u01fc\b\"\u0001\"\u0001\"\u0003\"\u0200\b\"\u0003\"\u0202\b\"\u0001"+
		"\"\u0001\"\u0001#\u0004#\u0207\b#\u000b#\f#\u0208\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u020f\b$\u0001%\u0001%\u0001%\u0003%\u0214\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001("+
		"\u0001(\u0001(\u0003(\u0223\b(\u0001(\u0003(\u0226\b(\u0001)\u0001)\u0001"+
		")\u0003)\u022b\b)\u0001)\u0003)\u022e\b)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001,\u0003,\u0239\b,\u0001,\u0001,\u0003,\u023d"+
		"\b,\u0001,\u0001,\u0001,\u0003,\u0242\b,\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0003.\u024d\b.\u0001.\u0001.\u0005.\u0251"+
		"\b.\n.\f.\u0254\t.\u0001.\u0001.\u0001/\u0001/\u0001/\u0003/\u025b\b/"+
		"\u0001/\u0001/\u0001/\u0001/\u0003/\u0261\b/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u0267\b/\u0001/\u0001/\u0003/\u026b\b/\u00010\u00010\u00030\u026f"+
		"\b0\u00010\u00030\u0272\b0\u00010\u00010\u00010\u00030\u0277\b0\u0001"+
		"0\u00010\u00010\u00010\u00030\u027d\b0\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00030\u0285\b0\u00010\u00010\u00010\u00030\u028a\b0\u00010\u0001"+
		"0\u00010\u00030\u028f\b0\u00011\u00011\u00031\u0293\b1\u00012\u00012\u0003"+
		"2\u0297\b2\u00013\u00013\u00013\u00014\u00014\u00014\u00054\u029f\b4\n"+
		"4\f4\u02a2\t4\u00014\u00014\u00034\u02a6\b4\u00014\u00034\u02a9\b4\u0001"+
		"5\u00015\u00015\u00035\u02ae\b5\u00016\u00016\u00016\u00017\u00017\u0003"+
		"7\u02b5\b7\u00017\u00017\u00018\u00048\u02ba\b8\u000b8\f8\u02bb\u0001"+
		"9\u00019\u00019\u00019\u0001:\u0005:\u02c3\b:\n:\f:\u02c6\t:\u0001:\u0003"+
		":\u02c9\b:\u0001:\u0004:\u02cc\b:\u000b:\f:\u02cd\u0001:\u0005:\u02d1"+
		"\b:\n:\f:\u02d4\t:\u0001:\u0005:\u02d7\b:\n:\f:\u02da\t:\u0001;\u0003"+
		";\u02dd\b;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0003<\u02ec\b<\u0001<\u0003<\u02ef\b<\u0001"+
		"<\u0001<\u0001<\u0003<\u02f4\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003"+
		"<\u0305\b<\u0001<\u0003<\u0308\b<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0003=\u0311\b=\u0001>\u0001>\u0001>\u0001>\u0005>\u0317\b>\n"+
		">\f>\u031a\t>\u0001>\u0003>\u031d\b>\u0003>\u031f\b>\u0001>\u0001>\u0001"+
		"?\u0003?\u0324\b?\u0001?\u0001?\u0003?\u0328\b?\u0001@\u0001@\u0001@\u0005"+
		"@\u032d\b@\n@\f@\u0330\t@\u0001A\u0001A\u0001A\u0001A\u0003A\u0336\bA"+
		"\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u036a\bA\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0003A\u03a8\bA\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u03b0\bA\u0001A\u0001A\u0003A\u03b4\bA\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0005A\u03c1\bA\nA"+
		"\fA\u03c4\tA\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0003C\u03cd"+
		"\bC\u0001D\u0001D\u0001D\u0001D\u0005D\u03d3\bD\nD\fD\u03d6\tD\u0001D"+
		"\u0003D\u03d9\bD\u0003D\u03db\bD\u0001D\u0001D\u0001E\u0001E\u0003E\u03e1"+
		"\bE\u0001E\u0001E\u0003E\u03e5\bE\u0001E\u0001E\u0003E\u03e9\bE\u0001"+
		"E\u0001E\u0001E\u0003E\u03ee\bE\u0001E\u0001E\u0001E\u0001E\u0003E\u03f4"+
		"\bE\u0001F\u0001F\u0001F\u0003F\u03f9\bF\u0001F\u0003F\u03fc\bF\u0001"+
		"G\u0001G\u0003G\u0400\bG\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0003I\u040b\bI\u0001J\u0001J\u0005J\u040f\bJ\nJ\fJ\u0412"+
		"\tJ\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u041b\bK\u0001"+
		"L\u0001L\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001O\u0001O\u0001"+
		"O\u0001O\u0001P\u0001P\u0003P\u042b\bP\u0001Q\u0001Q\u0001R\u0001R\u0001"+
		"R\u0003R\u0432\bR\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0003S\u0464\bS\u0001T\u0001T\u0001U\u0001U\u0001U\u0001U\u0003U\u046c"+
		"\bU\u0001V\u0004V\u046f\bV\u000bV\fV\u0470\u0001W\u0001W\u0001X\u0001"+
		"X\u0001X\u0001X\u0001X\u0003X\u047a\bX\u0001Y\u0001Y\u0001Y\u0003Y\u047f"+
		"\bY\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0003Z\u0486\bZ\u0001Z\u0001Z\u0001"+
		"[\u0001[\u0001[\u0001[\u0001\\\u0003\\\u048f\b\\\u0001\\\u0001\\\u0003"+
		"\\\u0493\b\\\u0001\\\u0003\\\u0496\b\\\u0005\\\u0498\b\\\n\\\f\\\u049b"+
		"\t\\\u0001]\u0001]\u0001^\u0001^\u0001^\u0001_\u0001_\u0001_\u0001`\u0001"+
		"`\u0003`\u04a7\b`\u0001`\u0001`\u0003`\u04ab\b`\u0003`\u04ad\b`\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001b\u0001b\u0001b\u0001b\u0001b\u0003"+
		"b\u04b9\bb\u0001c\u0001c\u0001d\u0001d\u0001d\u0003d\u04c0\bd\u0001e\u0001"+
		"e\u0001f\u0001f\u0001f\u0001f\u0001g\u0001g\u0003g\u04ca\bg\u0001g\u0001"+
		"g\u0003g\u04ce\bg\u0001g\u0001g\u0003g\u04d2\bg\u0001g\u0001g\u0001g\u0001"+
		"g\u0001g\u0001g\u0003g\u04da\bg\u0001g\u0001g\u0001g\u0001g\u0003g\u04e0"+
		"\bg\u0001g\u0000\u0001\u0082h\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u0000\u000e\u0003\u0000"+
		"ggqq{{\u0001\u0000gh\u0001\u0000\u001b\u001d\u0001\u0000\u0017\u0018\u0001"+
		"\u0000!#\u0003\u0000$$&\'\u0097\u0097\u0001\u0000(+\u0001\u00001=\u0001"+
		"\u0000AE\u0001\u0000FI\u0004\u0000dgpptt{{\u0001\u0000st\u0003\u0000\u0084"+
		"\u0084\u0090\u0090\u0098\u0098\u0003\u0000\n\n\u0088\u0088\u0092\u0092"+
		"\u058d\u0000\u00d1\u0001\u0000\u0000\u0000\u0002\u00d8\u0001\u0000\u0000"+
		"\u0000\u0004\u00ee\u0001\u0000\u0000\u0000\u0006\u00f0\u0001\u0000\u0000"+
		"\u0000\b\u00f7\u0001\u0000\u0000\u0000\n\u00fb\u0001\u0000\u0000\u0000"+
		"\f\u010a\u0001\u0000\u0000\u0000\u000e\u010c\u0001\u0000\u0000\u0000\u0010"+
		"\u011d\u0001\u0000\u0000\u0000\u0012\u0124\u0001\u0000\u0000\u0000\u0014"+
		"\u0126\u0001\u0000\u0000\u0000\u0016\u0128\u0001\u0000\u0000\u0000\u0018"+
		"\u012d\u0001\u0000\u0000\u0000\u001a\u0133\u0001\u0000\u0000\u0000\u001c"+
		"\u0136\u0001\u0000\u0000\u0000\u001e\u014a\u0001\u0000\u0000\u0000 \u0156"+
		"\u0001\u0000\u0000\u0000\"\u0158\u0001\u0000\u0000\u0000$\u0169\u0001"+
		"\u0000\u0000\u0000&\u0171\u0001\u0000\u0000\u0000(\u0173\u0001\u0000\u0000"+
		"\u0000*\u0176\u0001\u0000\u0000\u0000,\u017f\u0001\u0000\u0000\u0000."+
		"\u0184\u0001\u0000\u0000\u00000\u0186\u0001\u0000\u0000\u00002\u018a\u0001"+
		"\u0000\u0000\u00004\u01ca\u0001\u0000\u0000\u00006\u01cf\u0001\u0000\u0000"+
		"\u00008\u01d1\u0001\u0000\u0000\u0000:\u01d8\u0001\u0000\u0000\u0000<"+
		"\u01df\u0001\u0000\u0000\u0000>\u01e6\u0001\u0000\u0000\u0000@\u01ed\u0001"+
		"\u0000\u0000\u0000B\u01f3\u0001\u0000\u0000\u0000D\u01f9\u0001\u0000\u0000"+
		"\u0000F\u0206\u0001\u0000\u0000\u0000H\u020a\u0001\u0000\u0000\u0000J"+
		"\u0210\u0001\u0000\u0000\u0000L\u0215\u0001\u0000\u0000\u0000N\u0219\u0001"+
		"\u0000\u0000\u0000P\u021e\u0001\u0000\u0000\u0000R\u0227\u0001\u0000\u0000"+
		"\u0000T\u0231\u0001\u0000\u0000\u0000V\u0234\u0001\u0000\u0000\u0000X"+
		"\u0238\u0001\u0000\u0000\u0000Z\u0246\u0001\u0000\u0000\u0000\\\u024c"+
		"\u0001\u0000\u0000\u0000^\u026a\u0001\u0000\u0000\u0000`\u028e\u0001\u0000"+
		"\u0000\u0000b\u0290\u0001\u0000\u0000\u0000d\u0296\u0001\u0000\u0000\u0000"+
		"f\u0298\u0001\u0000\u0000\u0000h\u02a8\u0001\u0000\u0000\u0000j\u02aa"+
		"\u0001\u0000\u0000\u0000l\u02af\u0001\u0000\u0000\u0000n\u02b2\u0001\u0000"+
		"\u0000\u0000p\u02b9\u0001\u0000\u0000\u0000r\u02bd\u0001\u0000\u0000\u0000"+
		"t\u02c4\u0001\u0000\u0000\u0000v\u02dc\u0001\u0000\u0000\u0000x\u0307"+
		"\u0001\u0000\u0000\u0000z\u0310\u0001\u0000\u0000\u0000|\u0312\u0001\u0000"+
		"\u0000\u0000~\u0323\u0001\u0000\u0000\u0000\u0080\u0329\u0001\u0000\u0000"+
		"\u0000\u0082\u0369\u0001\u0000\u0000\u0000\u0084\u03c5\u0001\u0000\u0000"+
		"\u0000\u0086\u03cc\u0001\u0000\u0000\u0000\u0088\u03ce\u0001\u0000\u0000"+
		"\u0000\u008a\u03f3\u0001\u0000\u0000\u0000\u008c\u03fb\u0001\u0000\u0000"+
		"\u0000\u008e\u03ff\u0001\u0000\u0000\u0000\u0090\u0401\u0001\u0000\u0000"+
		"\u0000\u0092\u040a\u0001\u0000\u0000\u0000\u0094\u040c\u0001\u0000\u0000"+
		"\u0000\u0096\u041a\u0001\u0000\u0000\u0000\u0098\u041c\u0001\u0000\u0000"+
		"\u0000\u009a\u041e\u0001\u0000\u0000\u0000\u009c\u0420\u0001\u0000\u0000"+
		"\u0000\u009e\u0424\u0001\u0000\u0000\u0000\u00a0\u042a\u0001\u0000\u0000"+
		"\u0000\u00a2\u042c\u0001\u0000\u0000\u0000\u00a4\u0431\u0001\u0000\u0000"+
		"\u0000\u00a6\u0463\u0001\u0000\u0000\u0000\u00a8\u0465\u0001\u0000\u0000"+
		"\u0000\u00aa\u046b\u0001\u0000\u0000\u0000\u00ac\u046e\u0001\u0000\u0000"+
		"\u0000\u00ae\u0472\u0001\u0000\u0000\u0000\u00b0\u0479\u0001\u0000\u0000"+
		"\u0000\u00b2\u047b\u0001\u0000\u0000\u0000\u00b4\u0482\u0001\u0000\u0000"+
		"\u0000\u00b6\u0489\u0001\u0000\u0000\u0000\u00b8\u048e\u0001\u0000\u0000"+
		"\u0000\u00ba\u049c\u0001\u0000\u0000\u0000\u00bc\u049e\u0001\u0000\u0000"+
		"\u0000\u00be\u04a1\u0001\u0000\u0000\u0000\u00c0\u04ac\u0001\u0000\u0000"+
		"\u0000\u00c2\u04ae\u0001\u0000\u0000\u0000\u00c4\u04b8\u0001\u0000\u0000"+
		"\u0000\u00c6\u04ba\u0001\u0000\u0000\u0000\u00c8\u04bf\u0001\u0000\u0000"+
		"\u0000\u00ca\u04c1\u0001\u0000\u0000\u0000\u00cc\u04c3\u0001\u0000\u0000"+
		"\u0000\u00ce\u04df\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005\u0002\u0000"+
		"\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d5\u0003p8\u0000\u00d4"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0000\u0000\u0001\u00d7"+
		"\u0001\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003\u0004\u0002\u0000\u00d9"+
		"\u0003\u0001\u0000\u0000\u0000\u00da\u00ef\u0003\u0006\u0003\u0000\u00db"+
		"\u00ef\u0003(\u0014\u0000\u00dc\u00ef\u0003\n\u0005\u0000\u00dd\u00ef"+
		"\u0003\u001e\u000f\u0000\u00de\u00ef\u0003.\u0017\u0000\u00df\u00ef\u0003"+
		"Z-\u0000\u00e0\u00ef\u0003X,\u0000\u00e1\u00ef\u00030\u0018\u0000\u00e2"+
		"\u00ef\u00032\u0019\u0000\u00e3\u00ef\u00034\u001a\u0000\u00e4\u00ef\u0003"+
		"8\u001c\u0000\u00e5\u00ef\u0003:\u001d\u0000\u00e6\u00ef\u0003<\u001e"+
		"\u0000\u00e7\u00ef\u0003>\u001f\u0000\u00e8\u00ef\u0003@ \u0000\u00e9"+
		"\u00ef\u0003L&\u0000\u00ea\u00ef\u0003B!\u0000\u00eb\u00ef\u0003N\'\u0000"+
		"\u00ec\u00ef\u0003P(\u0000\u00ed\u00ef\u0003V+\u0000\u00ee\u00da\u0001"+
		"\u0000\u0000\u0000\u00ee\u00db\u0001\u0000\u0000\u0000\u00ee\u00dc\u0001"+
		"\u0000\u0000\u0000\u00ee\u00dd\u0001\u0000\u0000\u0000\u00ee\u00de\u0001"+
		"\u0000\u0000\u0000\u00ee\u00df\u0001\u0000\u0000\u0000\u00ee\u00e0\u0001"+
		"\u0000\u0000\u0000\u00ee\u00e1\u0001\u0000\u0000\u0000\u00ee\u00e2\u0001"+
		"\u0000\u0000\u0000\u00ee\u00e3\u0001\u0000\u0000\u0000\u00ee\u00e4\u0001"+
		"\u0000\u0000\u0000\u00ee\u00e5\u0001\u0000\u0000\u0000\u00ee\u00e6\u0001"+
		"\u0000\u0000\u0000\u00ee\u00e7\u0001\u0000\u0000\u0000\u00ee\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u0005\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f2\u0005\n\u0000\u0000\u00f1\u00f3\u0003\b"+
		"\u0004\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\f\u0000"+
		"\u0000\u00f5\u0007\u0001\u0000\u0000\u0000\u00f6\u00f8\u0003\u0004\u0002"+
		"\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fa\t\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005o\u0000\u0000"+
		"\u00fc\u00fd\u0003\f\u0006\u0000\u00fd\u000b\u0001\u0000\u0000\u0000\u00fe"+
		"\u0100\u0003\u0016\u000b\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101"+
		"\u0104\u0003\u0018\f\u0000\u0102\u0104\u0003\u000e\u0007\u0000\u0103\u0101"+
		"\u0001\u0000\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0003\u001a\r\u0000\u0106\u0107\u0003"+
		"\u00aaU\u0000\u0107\u010b\u0001\u0000\u0000\u0000\u0108\u0109\u0005|\u0000"+
		"\u0000\u0109\u010b\u0003\u00aaU\u0000\u010a\u00ff\u0001\u0000\u0000\u0000"+
		"\u010a\u0108\u0001\u0000\u0000\u0000\u010b\r\u0001\u0000\u0000\u0000\u010c"+
		"\u0112\u0005\n\u0000\u0000\u010d\u010e\u0003\u0010\b\u0000\u010e\u010f"+
		"\u0005\u000e\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010d"+
		"\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0119"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0117"+
		"\u0003\u0010\b\u0000\u0116\u0118\u0005\u000e\u0000\u0000\u0117\u0116\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001"+
		"\u0000\u0000\u0000\u0119\u0115\u0001\u0000\u0000\u0000\u0119\u011a\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0005"+
		"\f\u0000\u0000\u011c\u000f\u0001\u0000\u0000\u0000\u011d\u0120\u0003\u0012"+
		"\t\u0000\u011e\u011f\u0005d\u0000\u0000\u011f\u0121\u0003\u0014\n\u0000"+
		"\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000"+
		"\u0121\u0011\u0001\u0000\u0000\u0000\u0122\u0125\u0003\u00a0P\u0000\u0123"+
		"\u0125\u0005|\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0123"+
		"\u0001\u0000\u0000\u0000\u0125\u0013\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0007\u0000\u0000\u0000\u0127\u0015\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0003\u001c\u000e\u0000\u0129\u012a\u0005\u000e\u0000\u0000\u012a\u0017"+
		"\u0001\u0000\u0000\u0000\u012b\u012e\u0005\u001b\u0000\u0000\u012c\u012e"+
		"\u0003\u00a0P\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012c\u0001"+
		"\u0000\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"d\u0000\u0000\u0130\u0132\u0003\u00a0P\u0000\u0131\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0019\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0005e\u0000\u0000\u0134\u0135\u0005|\u0000\u0000\u0135"+
		"\u001b\u0001\u0000\u0000\u0000\u0136\u0139\u0003\u00a0P\u0000\u0137\u0138"+
		"\u0005d\u0000\u0000\u0138\u013a\u0003\u00a0P\u0000\u0139\u0137\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u001d\u0001\u0000"+
		"\u0000\u0000\u013b\u013d\u0005n\u0000\u0000\u013c\u013e\u0005^\u0000\u0000"+
		"\u013d\u013c\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000"+
		"\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u0142\u0003 \u0010\u0000\u0140"+
		"\u0142\u0003&\u0013\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0140"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0003\u00aaU\u0000\u0144\u014b\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"n\u0000\u0000\u0146\u0147\u0005^\u0000\u0000\u0147\u0148\u0003\u0082A"+
		"\u0000\u0148\u0149\u0003\u00aaU\u0000\u0149\u014b\u0001\u0000\u0000\u0000"+
		"\u014a\u013b\u0001\u0000\u0000\u0000\u014a\u0145\u0001\u0000\u0000\u0000"+
		"\u014b\u001f\u0001\u0000\u0000\u0000\u014c\u014d\u0003\u0018\f\u0000\u014d"+
		"\u014e\u0003\u001a\r\u0000\u014e\u014f\u0003\u00aaU\u0000\u014f\u0157"+
		"\u0001\u0000\u0000\u0000\u0150\u0152\u0003\"\u0011\u0000\u0151\u0153\u0003"+
		"\u001a\r\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155\u0003\u00aa"+
		"U\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u014c\u0001\u0000\u0000"+
		"\u0000\u0156\u0150\u0001\u0000\u0000\u0000\u0157!\u0001\u0000\u0000\u0000"+
		"\u0158\u015e\u0005\n\u0000\u0000\u0159\u015a\u0003$\u0012\u0000\u015a"+
		"\u015b\u0005\u000e\u0000\u0000\u015b\u015d\u0001\u0000\u0000\u0000\u015c"+
		"\u0159\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e"+
		"\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f"+
		"\u0165\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161"+
		"\u0163\u0003$\u0012\u0000\u0162\u0164\u0005\u000e\u0000\u0000\u0163\u0162"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0166"+
		"\u0001\u0000\u0000\u0000\u0165\u0161\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0005\f\u0000\u0000\u0168#\u0001\u0000\u0000\u0000\u0169\u016c\u0003"+
		"\u0012\t\u0000\u016a\u016b\u0005d\u0000\u0000\u016b\u016d\u0003\u0012"+
		"\t\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000"+
		"\u0000\u016d%\u0001\u0000\u0000\u0000\u016e\u0172\u0003(\u0014\u0000\u016f"+
		"\u0172\u0003Z-\u0000\u0170\u0172\u0003X,\u0000\u0171\u016e\u0001\u0000"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0170\u0001\u0000"+
		"\u0000\u0000\u0172\'\u0001\u0000\u0000\u0000\u0173\u0174\u0003*\u0015"+
		"\u0000\u0174\u0175\u0003\u00aaU\u0000\u0175)\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u00036\u001b\u0000\u0177\u017c\u0003,\u0016\u0000\u0178\u0179\u0005"+
		"\u000e\u0000\u0000\u0179\u017b\u0003,\u0016\u0000\u017a\u0178\u0001\u0000"+
		"\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d+\u0001\u0000\u0000"+
		"\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0182\u0003\u0086C\u0000"+
		"\u0180\u0181\u0005\u000f\u0000\u0000\u0181\u0183\u0003\u0082A\u0000\u0182"+
		"\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183"+
		"-\u0001\u0000\u0000\u0000\u0184\u0185\u0005\r\u0000\u0000\u0185/\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0004\u0018\u0000\u0000\u0187\u0188\u0003"+
		"\u0080@\u0000\u0188\u0189\u0003\u00aaU\u0000\u01891\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0005_\u0000\u0000\u018b\u018c\u0005\b\u0000\u0000"+
		"\u018c\u018d\u0003\u0080@\u0000\u018d\u018e\u0005\t\u0000\u0000\u018e"+
		"\u0191\u0003\u0004\u0002\u0000\u018f\u0190\u0005O\u0000\u0000\u0190\u0192"+
		"\u0003\u0004\u0002\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192"+
		"\u0001\u0000\u0000\u0000\u01923\u0001\u0000\u0000\u0000\u0193\u0194\u0005"+
		"K\u0000\u0000\u0194\u0195\u0003\u0004\u0002\u0000\u0195\u0196\u0005Y\u0000"+
		"\u0000\u0196\u0197\u0005\b\u0000\u0000\u0197\u0198\u0003\u0080@\u0000"+
		"\u0198\u0199\u0005\t\u0000\u0000\u0199\u019a\u0003\u00aaU\u0000\u019a"+
		"\u01cb\u0001\u0000\u0000\u0000\u019b\u019c\u0005Y\u0000\u0000\u019c\u019d"+
		"\u0005\b\u0000\u0000\u019d\u019e\u0003\u0080@\u0000\u019e\u019f\u0005"+
		"\t\u0000\u0000\u019f\u01a0\u0003\u0004\u0002\u0000\u01a0\u01cb\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0005W\u0000\u0000\u01a2\u01a5\u0005\b\u0000"+
		"\u0000\u01a3\u01a6\u0003\u0080@\u0000\u01a4\u01a6\u0003*\u0015\u0000\u01a5"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a9\u0005\r\u0000\u0000\u01a8\u01aa\u0003\u0080@\u0000\u01a9\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ad\u0005\r\u0000\u0000\u01ac\u01ae\u0003"+
		"\u0080@\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b0\u0005\t\u0000"+
		"\u0000\u01b0\u01cb\u0003\u0004\u0002\u0000\u01b1\u01b2\u0005W\u0000\u0000"+
		"\u01b2\u01b5\u0005\b\u0000\u0000\u01b3\u01b6\u0003\u0082A\u0000\u01b4"+
		"\u01b6\u0003*\u0015\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0005b\u0000\u0000\u01b8\u01b9\u0003\u0080@\u0000\u01b9\u01ba\u0005\t"+
		"\u0000\u0000\u01ba\u01bb\u0003\u0004\u0002\u0000\u01bb\u01cb\u0001\u0000"+
		"\u0000\u0000\u01bc\u01be\u0005W\u0000\u0000\u01bd\u01bf\u0005q\u0000\u0000"+
		"\u01be\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c3\u0005\b\u0000\u0000\u01c1"+
		"\u01c4\u0003\u0082A\u0000\u01c2\u01c4\u0003*\u0015\u0000\u01c3\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0005f\u0000\u0000\u01c6\u01c7\u0003\u0080"+
		"@\u0000\u01c7\u01c8\u0005\t\u0000\u0000\u01c8\u01c9\u0003\u0004\u0002"+
		"\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u0193\u0001\u0000\u0000"+
		"\u0000\u01ca\u019b\u0001\u0000\u0000\u0000\u01ca\u01a1\u0001\u0000\u0000"+
		"\u0000\u01ca\u01b1\u0001\u0000\u0000\u0000\u01ca\u01bc\u0001\u0000\u0000"+
		"\u0000\u01cb5\u0001\u0000\u0000\u0000\u01cc\u01d0\u0005Q\u0000\u0000\u01cd"+
		"\u01d0\u0003\u00a8T\u0000\u01ce\u01d0\u0005m\u0000\u0000\u01cf\u01cc\u0001"+
		"\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01ce\u0001"+
		"\u0000\u0000\u0000\u01d07\u0001\u0000\u0000\u0000\u01d1\u01d4\u0005V\u0000"+
		"\u0000\u01d2\u01d3\u0004\u001c\u0001\u0000\u01d3\u01d5\u0003\u00a2Q\u0000"+
		"\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7\u0003\u00aaU\u0000\u01d7"+
		"9\u0001\u0000\u0000\u0000\u01d8\u01db\u0005J\u0000\u0000\u01d9\u01da\u0004"+
		"\u001d\u0002\u0000\u01da\u01dc\u0003\u00a2Q\u0000\u01db\u01d9\u0001\u0000"+
		"\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0003\u00aaU\u0000\u01de;\u0001\u0000\u0000\u0000"+
		"\u01df\u01e2\u0005T\u0000\u0000\u01e0\u01e1\u0004\u001e\u0003\u0000\u01e1"+
		"\u01e3\u0003\u0080@\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0003\u00aaU\u0000\u01e5=\u0001\u0000\u0000\u0000\u01e6\u01e9\u0007\u0001"+
		"\u0000\u0000\u01e7\u01e8\u0004\u001f\u0004\u0000\u01e8\u01ea\u0003\u0080"+
		"@\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ec\u0003\u00aaU\u0000"+
		"\u01ec?\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005]\u0000\u0000\u01ee\u01ef"+
		"\u0005\b\u0000\u0000\u01ef\u01f0\u0003\u0080@\u0000\u01f0\u01f1\u0005"+
		"\t\u0000\u0000\u01f1\u01f2\u0003\u0004\u0002\u0000\u01f2A\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0005X\u0000\u0000\u01f4\u01f5\u0005\b\u0000"+
		"\u0000\u01f5\u01f6\u0003\u0080@\u0000\u01f6\u01f7\u0005\t\u0000\u0000"+
		"\u01f7\u01f8\u0003D\"\u0000\u01f8C\u0001\u0000\u0000\u0000\u01f9\u01fb"+
		"\u0005\n\u0000\u0000\u01fa\u01fc\u0003F#\u0000\u01fb\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u0201\u0001\u0000"+
		"\u0000\u0000\u01fd\u01ff\u0003J%\u0000\u01fe\u0200\u0003F#\u0000\u01ff"+
		"\u01fe\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200"+
		"\u0202\u0001\u0000\u0000\u0000\u0201\u01fd\u0001\u0000\u0000\u0000\u0201"+
		"\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203"+
		"\u0204\u0005\f\u0000\u0000\u0204E\u0001\u0000\u0000\u0000\u0205\u0207"+
		"\u0003H$\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000"+
		"\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000"+
		"\u0000\u0000\u0209G\u0001\u0000\u0000\u0000\u020a\u020b\u0005N\u0000\u0000"+
		"\u020b\u020c\u0003\u0080@\u0000\u020c\u020e\u0005\u0012\u0000\u0000\u020d"+
		"\u020f\u0003\b\u0004\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020e\u020f"+
		"\u0001\u0000\u0000\u0000\u020fI\u0001\u0000\u0000\u0000\u0210\u0211\u0005"+
		"^\u0000\u0000\u0211\u0213\u0005\u0012\u0000\u0000\u0212\u0214\u0003\b"+
		"\u0004\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000"+
		"\u0000\u0000\u0214K\u0001\u0000\u0000\u0000\u0215\u0216\u0003\u00a2Q\u0000"+
		"\u0216\u0217\u0005\u0012\u0000\u0000\u0217\u0218\u0003\u0004\u0002\u0000"+
		"\u0218M\u0001\u0000\u0000\u0000\u0219\u021a\u0005`\u0000\u0000\u021a\u021b"+
		"\u0004\'\u0005\u0000\u021b\u021c\u0003\u0080@\u0000\u021c\u021d\u0003"+
		"\u00aaU\u0000\u021dO\u0001\u0000\u0000\u0000\u021e\u021f\u0005c\u0000"+
		"\u0000\u021f\u0225\u0003\u0006\u0003\u0000\u0220\u0222\u0003R)\u0000\u0221"+
		"\u0223\u0003T*\u0000\u0222\u0221\u0001\u0000\u0000\u0000\u0222\u0223\u0001"+
		"\u0000\u0000\u0000\u0223\u0226\u0001\u0000\u0000\u0000\u0224\u0226\u0003"+
		"T*\u0000\u0225\u0220\u0001\u0000\u0000\u0000\u0225\u0224\u0001\u0000\u0000"+
		"\u0000\u0226Q\u0001\u0000\u0000\u0000\u0227\u022d\u0005R\u0000\u0000\u0228"+
		"\u022a\u0005\b\u0000\u0000\u0229\u022b\u0003\u0086C\u0000\u022a\u0229"+
		"\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c"+
		"\u0001\u0000\u0000\u0000\u022c\u022e\u0005\t\u0000\u0000\u022d\u0228\u0001"+
		"\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0001"+
		"\u0000\u0000\u0000\u022f\u0230\u0003\u0006\u0003\u0000\u0230S\u0001\u0000"+
		"\u0000\u0000\u0231\u0232\u0005S\u0000\u0000\u0232\u0233\u0003\u0006\u0003"+
		"\u0000\u0233U\u0001\u0000\u0000\u0000\u0234\u0235\u0005Z\u0000\u0000\u0235"+
		"\u0236\u0003\u00aaU\u0000\u0236W\u0001\u0000\u0000\u0000\u0237\u0239\u0005"+
		"p\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000"+
		"\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023c\u0005[\u0000"+
		"\u0000\u023b\u023d\u0005\u001b\u0000\u0000\u023c\u023b\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000"+
		"\u0000\u023e\u023f\u0003\u00a2Q\u0000\u023f\u0241\u0005\b\u0000\u0000"+
		"\u0240\u0242\u0003h4\u0000\u0241\u0240\u0001\u0000\u0000\u0000\u0241\u0242"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244"+
		"\u0005\t\u0000\u0000\u0244\u0245\u0003n7\u0000\u0245Y\u0001\u0000\u0000"+
		"\u0000\u0246\u0247\u0005i\u0000\u0000\u0247\u0248\u0003\u00a2Q\u0000\u0248"+
		"\u0249\u0003\\.\u0000\u0249[\u0001\u0000\u0000\u0000\u024a\u024b\u0005"+
		"k\u0000\u0000\u024b\u024d\u0003\u0082A\u0000\u024c\u024a\u0001\u0000\u0000"+
		"\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000"+
		"\u0000\u024e\u0252\u0005\n\u0000\u0000\u024f\u0251\u0003^/\u0000\u0250"+
		"\u024f\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252"+
		"\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253"+
		"\u0255\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255"+
		"\u0256\u0005\f\u0000\u0000\u0256]\u0001\u0000\u0000\u0000\u0257\u025b"+
		"\u0005z\u0000\u0000\u0258\u0259\u0004/\u0006\u0000\u0259\u025b\u0003\u00a2"+
		"Q\u0000\u025a\u0257\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000"+
		"\u0000\u025c\u026b\u0003`0\u0000\u025d\u0261\u0005z\u0000\u0000\u025e"+
		"\u025f\u0004/\u0007\u0000\u025f\u0261\u0003\u00a2Q\u0000\u0260\u025d\u0001"+
		"\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u026b\u0003"+
		"b1\u0000\u0263\u0267\u0005z\u0000\u0000\u0264\u0265\u0004/\b\u0000\u0265"+
		"\u0267\u0003\u00a2Q\u0000\u0266\u0263\u0001\u0000\u0000\u0000\u0266\u0264"+
		"\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u026b"+
		"\u0003\u0006\u0003\u0000\u0269\u026b\u0003.\u0017\u0000\u026a\u025a\u0001"+
		"\u0000\u0000\u0000\u026a\u0260\u0001\u0000\u0000\u0000\u026a\u0266\u0001"+
		"\u0000\u0000\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026b_\u0001\u0000"+
		"\u0000\u0000\u026c\u026d\u0005p\u0000\u0000\u026d\u026f\u00040\t\u0000"+
		"\u026e\u026c\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000"+
		"\u026f\u0271\u0001\u0000\u0000\u0000\u0270\u0272\u0005\u001b\u0000\u0000"+
		"\u0271\u0270\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000"+
		"\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u0274\u0003d2\u0000\u0274\u0276"+
		"\u0005\b\u0000\u0000\u0275\u0277\u0003h4\u0000\u0276\u0275\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000"+
		"\u0000\u0000\u0278\u0279\u0005\t\u0000\u0000\u0279\u027a\u0003n7\u0000"+
		"\u027a\u028f\u0001\u0000\u0000\u0000\u027b\u027d\u0005\u001b\u0000\u0000"+
		"\u027c\u027b\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000"+
		"\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u027f\u0003\u009cN\u0000\u027f"+
		"\u0280\u0005\b\u0000\u0000\u0280\u0281\u0005\t\u0000\u0000\u0281\u0282"+
		"\u0003n7\u0000\u0282\u028f\u0001\u0000\u0000\u0000\u0283\u0285\u0005\u001b"+
		"\u0000\u0000\u0284\u0283\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000"+
		"\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0003\u009e"+
		"O\u0000\u0287\u0289\u0005\b\u0000\u0000\u0288\u028a\u0003h4\u0000\u0289"+
		"\u0288\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a"+
		"\u028b\u0001\u0000\u0000\u0000\u028b\u028c\u0005\t\u0000\u0000\u028c\u028d"+
		"\u0003n7\u0000\u028d\u028f\u0001\u0000\u0000\u0000\u028e\u026e\u0001\u0000"+
		"\u0000\u0000\u028e\u027c\u0001\u0000\u0000\u0000\u028e\u0284\u0001\u0000"+
		"\u0000\u0000\u028fa\u0001\u0000\u0000\u0000\u0290\u0292\u0003d2\u0000"+
		"\u0291\u0293\u0003\u0084B\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0292"+
		"\u0293\u0001\u0000\u0000\u0000\u0293c\u0001\u0000\u0000\u0000\u0294\u0297"+
		"\u0003z=\u0000\u0295\u0297\u0003f3\u0000\u0296\u0294\u0001\u0000\u0000"+
		"\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0297e\u0001\u0000\u0000\u0000"+
		"\u0298\u0299\u0005 \u0000\u0000\u0299\u029a\u0003\u00a0P\u0000\u029ag"+
		"\u0001\u0000\u0000\u0000\u029b\u02a0\u0003j5\u0000\u029c\u029d\u0005\u000e"+
		"\u0000\u0000\u029d\u029f\u0003j5\u0000\u029e\u029c\u0001\u0000\u0000\u0000"+
		"\u029f\u02a2\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000"+
		"\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a5\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005\u000e\u0000\u0000"+
		"\u02a4\u02a6\u0003l6\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a6"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a9\u0001\u0000\u0000\u0000\u02a7\u02a9"+
		"\u0003l6\u0000\u02a8\u029b\u0001\u0000\u0000\u0000\u02a8\u02a7\u0001\u0000"+
		"\u0000\u0000\u02a9i\u0001\u0000\u0000\u0000\u02aa\u02ad\u0003\u0086C\u0000"+
		"\u02ab\u02ac\u0005\u000f\u0000\u0000\u02ac\u02ae\u0003\u0082A\u0000\u02ad"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae"+
		"k\u0001\u0000\u0000\u0000\u02af\u02b0\u0005\u0013\u0000\u0000\u02b0\u02b1"+
		"\u0003\u0082A\u0000\u02b1m\u0001\u0000\u0000\u0000\u02b2\u02b4\u0005\n"+
		"\u0000\u0000\u02b3\u02b5\u0003p8\u0000\u02b4\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000"+
		"\u02b6\u02b7\u0005\f\u0000\u0000\u02b7o\u0001\u0000\u0000\u0000\u02b8"+
		"\u02ba\u0003\u0002\u0001\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bb\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bb"+
		"\u02bc\u0001\u0000\u0000\u0000\u02bcq\u0001\u0000\u0000\u0000\u02bd\u02be"+
		"\u0005\u0006\u0000\u0000\u02be\u02bf\u0003t:\u0000\u02bf\u02c0\u0005\u0007"+
		"\u0000\u0000\u02c0s\u0001\u0000\u0000\u0000\u02c1\u02c3\u0005\u000e\u0000"+
		"\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c6\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c5\u02c8\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c9\u0003v;\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c9\u0001\u0000\u0000\u0000\u02c9\u02d2\u0001\u0000\u0000\u0000\u02ca"+
		"\u02cc\u0005\u000e\u0000\u0000\u02cb\u02ca\u0001\u0000\u0000\u0000\u02cc"+
		"\u02cd\u0001\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd"+
		"\u02ce\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf"+
		"\u02d1\u0003v;\u0000\u02d0\u02cb\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d8\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d7\u0005\u000e\u0000\u0000\u02d6\u02d5\u0001"+
		"\u0000\u0000\u0000\u02d7\u02da\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9u\u0001\u0000"+
		"\u0000\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02db\u02dd\u0005\u0013"+
		"\u0000\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000"+
		"\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02df\u0003\u0082"+
		"A\u0000\u02dfw\u0001\u0000\u0000\u0000\u02e0\u02e1\u0003z=\u0000\u02e1"+
		"\u02e2\u0005\u0012\u0000\u0000\u02e2\u02e3\u0003\u0082A\u0000\u02e3\u0308"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e5\u0005\u0006\u0000\u0000\u02e5\u02e6"+
		"\u0003\u0082A\u0000\u02e6\u02e7\u0005\u0007\u0000\u0000\u02e7\u02e8\u0005"+
		"\u0012\u0000\u0000\u02e8\u02e9\u0003\u0082A\u0000\u02e9\u0308\u0001\u0000"+
		"\u0000\u0000\u02ea\u02ec\u0005p\u0000\u0000\u02eb\u02ea\u0001\u0000\u0000"+
		"\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ee\u0001\u0000\u0000"+
		"\u0000\u02ed\u02ef\u0005\u001b\u0000\u0000\u02ee\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f0\u02f1\u0003z=\u0000\u02f1\u02f3\u0005\b\u0000\u0000\u02f2"+
		"\u02f4\u0003h4\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005"+
		"\t\u0000\u0000\u02f6\u02f7\u0003n7\u0000\u02f7\u0308\u0001\u0000\u0000"+
		"\u0000\u02f8\u02f9\u0003\u009cN\u0000\u02f9\u02fa\u0005\b\u0000\u0000"+
		"\u02fa\u02fb\u0005\t\u0000\u0000\u02fb\u02fc\u0003n7\u0000\u02fc\u0308"+
		"\u0001\u0000\u0000\u0000\u02fd\u02fe\u0003\u009eO\u0000\u02fe\u02ff\u0005"+
		"\b\u0000\u0000\u02ff\u0300\u0003j5\u0000\u0300\u0301\u0005\t\u0000\u0000"+
		"\u0301\u0302\u0003n7\u0000\u0302\u0308\u0001\u0000\u0000\u0000\u0303\u0305"+
		"\u0005\u0013\u0000\u0000\u0304\u0303\u0001\u0000\u0000\u0000\u0304\u0305"+
		"\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0308"+
		"\u0003\u0082A\u0000\u0307\u02e0\u0001\u0000\u0000\u0000\u0307\u02e4\u0001"+
		"\u0000\u0000\u0000\u0307\u02eb\u0001\u0000\u0000\u0000\u0307\u02f8\u0001"+
		"\u0000\u0000\u0000\u0307\u02fd\u0001\u0000\u0000\u0000\u0307\u0304\u0001"+
		"\u0000\u0000\u0000\u0308y\u0001\u0000\u0000\u0000\u0309\u0311\u0003\u00a0"+
		"P\u0000\u030a\u0311\u0005|\u0000\u0000\u030b\u0311\u0003\u0098L\u0000"+
		"\u030c\u030d\u0005\u0006\u0000\u0000\u030d\u030e\u0003\u0082A\u0000\u030e"+
		"\u030f\u0005\u0007\u0000\u0000\u030f\u0311\u0001\u0000\u0000\u0000\u0310"+
		"\u0309\u0001\u0000\u0000\u0000\u0310\u030a\u0001\u0000\u0000\u0000\u0310"+
		"\u030b\u0001\u0000\u0000\u0000\u0310\u030c\u0001\u0000\u0000\u0000\u0311"+
		"{\u0001\u0000\u0000\u0000\u0312\u031e\u0005\b\u0000\u0000\u0313\u0318"+
		"\u0003~?\u0000\u0314\u0315\u0005\u000e\u0000\u0000\u0315\u0317\u0003~"+
		"?\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0317\u031a\u0001\u0000\u0000"+
		"\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000"+
		"\u0000\u0319\u031c\u0001\u0000\u0000\u0000\u031a\u0318\u0001\u0000\u0000"+
		"\u0000\u031b\u031d\u0005\u000e\u0000\u0000\u031c\u031b\u0001\u0000\u0000"+
		"\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031f\u0001\u0000\u0000"+
		"\u0000\u031e\u0313\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000\u0000"+
		"\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320\u0321\u0005\t\u0000\u0000"+
		"\u0321}\u0001\u0000\u0000\u0000\u0322\u0324\u0005\u0013\u0000\u0000\u0323"+
		"\u0322\u0001\u0000\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324"+
		"\u0327\u0001\u0000\u0000\u0000\u0325\u0328\u0003\u0082A\u0000\u0326\u0328"+
		"\u0003\u00a2Q\u0000\u0327\u0325\u0001\u0000\u0000\u0000\u0327\u0326\u0001"+
		"\u0000\u0000\u0000\u0328\u007f\u0001\u0000\u0000\u0000\u0329\u032e\u0003"+
		"\u0082A\u0000\u032a\u032b\u0005\u000e\u0000\u0000\u032b\u032d\u0003\u0082"+
		"A\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032d\u0330\u0001\u0000\u0000"+
		"\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000"+
		"\u0000\u032f\u0081\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000"+
		"\u0000\u0331\u0332\u0006A\uffff\uffff\u0000\u0332\u036a\u0003\u008aE\u0000"+
		"\u0333\u0335\u0005i\u0000\u0000\u0334\u0336\u0003\u00a2Q\u0000\u0335\u0334"+
		"\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0337"+
		"\u0001\u0000\u0000\u0000\u0337\u036a\u0003\\.\u0000\u0338\u0339\u0005"+
		"P\u0000\u0000\u0339\u033a\u0003\u00a2Q\u0000\u033a\u033b\u0003|>\u0000"+
		"\u033b\u036a\u0001\u0000\u0000\u0000\u033c\u033d\u0005P\u0000\u0000\u033d"+
		"\u033e\u0003\u0082A\u0000\u033e\u033f\u0003|>\u0000\u033f\u036a\u0001"+
		"\u0000\u0000\u0000\u0340\u0341\u0005P\u0000\u0000\u0341\u036a\u0003\u0082"+
		"A*\u0342\u0343\u0005P\u0000\u0000\u0343\u0344\u0005\u0014\u0000\u0000"+
		"\u0344\u036a\u0003\u00a2Q\u0000\u0345\u0346\u0005a\u0000\u0000\u0346\u036a"+
		"\u0003\u0082A%\u0347\u0348\u0005U\u0000\u0000\u0348\u036a\u0003\u0082"+
		"A$\u0349\u034a\u0005M\u0000\u0000\u034a\u036a\u0003\u0082A#\u034b\u034c"+
		"\u0005\u0015\u0000\u0000\u034c\u036a\u0003\u0082A\"\u034d\u034e\u0005"+
		"\u0016\u0000\u0000\u034e\u036a\u0003\u0082A!\u034f\u0350\u0005\u0017\u0000"+
		"\u0000\u0350\u036a\u0003\u0082A \u0351\u0352\u0005\u0018\u0000\u0000\u0352"+
		"\u036a\u0003\u0082A\u001f\u0353\u0354\u0005\u0019\u0000\u0000\u0354\u036a"+
		"\u0003\u0082A\u001e\u0355\u0356\u0005\u001a\u0000\u0000\u0356\u036a\u0003"+
		"\u0082A\u001d\u0357\u0358\u0005q\u0000\u0000\u0358\u036a\u0003\u0082A"+
		"\u001c\u0359\u035a\u0005o\u0000\u0000\u035a\u035b\u0005\b\u0000\u0000"+
		"\u035b\u035c\u0003\u0082A\u0000\u035c\u035d\u0005\t\u0000\u0000\u035d"+
		"\u036a\u0001\u0000\u0000\u0000\u035e\u036a\u0003>\u001f\u0000\u035f\u036a"+
		"\u0005\\\u0000\u0000\u0360\u036a\u0003\u00a2Q\u0000\u0361\u036a\u0005"+
		"l\u0000\u0000\u0362\u036a\u0003\u0092I\u0000\u0363\u036a\u0003r9\u0000"+
		"\u0364\u036a\u0003\u0088D\u0000\u0365\u0366\u0005\b\u0000\u0000\u0366"+
		"\u0367\u0003\u0080@\u0000\u0367\u0368\u0005\t\u0000\u0000\u0368\u036a"+
		"\u0001\u0000\u0000\u0000\u0369\u0331\u0001\u0000\u0000\u0000\u0369\u0333"+
		"\u0001\u0000\u0000\u0000\u0369\u0338\u0001\u0000\u0000\u0000\u0369\u033c"+
		"\u0001\u0000\u0000\u0000\u0369\u0340\u0001\u0000\u0000\u0000\u0369\u0342"+
		"\u0001\u0000\u0000\u0000\u0369\u0345\u0001\u0000\u0000\u0000\u0369\u0347"+
		"\u0001\u0000\u0000\u0000\u0369\u0349\u0001\u0000\u0000\u0000\u0369\u034b"+
		"\u0001\u0000\u0000\u0000\u0369\u034d\u0001\u0000\u0000\u0000\u0369\u034f"+
		"\u0001\u0000\u0000\u0000\u0369\u0351\u0001\u0000\u0000\u0000\u0369\u0353"+
		"\u0001\u0000\u0000\u0000\u0369\u0355\u0001\u0000\u0000\u0000\u0369\u0357"+
		"\u0001\u0000\u0000\u0000\u0369\u0359\u0001\u0000\u0000\u0000\u0369\u035e"+
		"\u0001\u0000\u0000\u0000\u0369\u035f\u0001\u0000\u0000\u0000\u0369\u0360"+
		"\u0001\u0000\u0000\u0000\u0369\u0361\u0001\u0000\u0000\u0000\u0369\u0362"+
		"\u0001\u0000\u0000\u0000\u0369\u0363\u0001\u0000\u0000\u0000\u0369\u0364"+
		"\u0001\u0000\u0000\u0000\u0369\u0365\u0001\u0000\u0000\u0000\u036a\u03c2"+
		"\u0001\u0000\u0000\u0000\u036b\u036c\n/\u0000\u0000\u036c\u036d\u0005"+
		"\u0011\u0000\u0000\u036d\u03c1\u0003\u0082A0\u036e\u036f\n\u001b\u0000"+
		"\u0000\u036f\u0370\u0005\u001e\u0000\u0000\u0370\u03c1\u0003\u0082A\u001b"+
		"\u0371\u0372\n\u001a\u0000\u0000\u0372\u0373\u0007\u0002\u0000\u0000\u0373"+
		"\u03c1\u0003\u0082A\u001b\u0374\u0375\n\u0019\u0000\u0000\u0375\u0376"+
		"\u0007\u0003\u0000\u0000\u0376\u03c1\u0003\u0082A\u001a\u0377\u0378\n"+
		"\u0018\u0000\u0000\u0378\u0379\u0005\u001f\u0000\u0000\u0379\u03c1\u0003"+
		"\u0082A\u0019\u037a\u037b\n\u0017\u0000\u0000\u037b\u037c\u0007\u0004"+
		"\u0000\u0000\u037c\u03c1\u0003\u0082A\u0018\u037d\u037e\n\u0016\u0000"+
		"\u0000\u037e\u037f\u0007\u0005\u0000\u0000\u037f\u03c1\u0003\u0082A\u0017"+
		"\u0380\u0381\n\u0015\u0000\u0000\u0381\u0382\u0005L\u0000\u0000\u0382"+
		"\u03c1\u0003\u0082A\u0016\u0383\u0384\n\u0014\u0000\u0000\u0384\u0385"+
		"\u0005b\u0000\u0000\u0385\u03c1\u0003\u0082A\u0015\u0386\u0387\n\u0013"+
		"\u0000\u0000\u0387\u0388\u0007\u0006\u0000\u0000\u0388\u03c1\u0003\u0082"+
		"A\u0014\u0389\u038a\n\u0012\u0000\u0000\u038a\u038b\u0005,\u0000\u0000"+
		"\u038b\u03c1\u0003\u0082A\u0013\u038c\u038d\n\u0011\u0000\u0000\u038d"+
		"\u038e\u0005-\u0000\u0000\u038e\u03c1\u0003\u0082A\u0012\u038f\u0390\n"+
		"\u0010\u0000\u0000\u0390\u0391\u0005.\u0000\u0000\u0391\u03c1\u0003\u0082"+
		"A\u0011\u0392\u0393\n\u000f\u0000\u0000\u0393\u0394\u0005/\u0000\u0000"+
		"\u0394\u03c1\u0003\u0082A\u0010\u0395\u0396\n\u000e\u0000\u0000\u0396"+
		"\u0397\u00050\u0000\u0000\u0397\u03c1\u0003\u0082A\u000f\u0398\u0399\n"+
		"\r\u0000\u0000\u0399\u039a\u0005\u0010\u0000\u0000\u039a\u039b\u0003\u0082"+
		"A\u0000\u039b\u039c\u0005\u0012\u0000\u0000\u039c\u039d\u0003\u0082A\u000e"+
		"\u039d\u03c1\u0001\u0000\u0000\u0000\u039e\u039f\n\f\u0000\u0000\u039f"+
		"\u03a0\u0005\u000f\u0000\u0000\u03a0\u03c1\u0003\u0082A\f\u03a1\u03a2"+
		"\n\u000b\u0000\u0000\u03a2\u03a3\u0003\u0090H\u0000\u03a3\u03a4\u0003"+
		"\u0082A\u000b\u03a4\u03c1\u0001\u0000\u0000\u0000\u03a5\u03a7\n.\u0000"+
		"\u0000\u03a6\u03a8\u0005\u0011\u0000\u0000\u03a7\u03a6\u0001\u0000\u0000"+
		"\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000"+
		"\u0000\u03a9\u03aa\u0005\u0006\u0000\u0000\u03aa\u03ab\u0003\u0080@\u0000"+
		"\u03ab\u03ac\u0005\u0007\u0000\u0000\u03ac\u03c1\u0001\u0000\u0000\u0000"+
		"\u03ad\u03af\n-\u0000\u0000\u03ae\u03b0\u0005\u0010\u0000\u0000\u03af"+
		"\u03ae\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000\u03b0"+
		"\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b3\u0005\u0014\u0000\u0000\u03b2"+
		"\u03b4\u0005 \u0000\u0000\u03b3\u03b2\u0001\u0000\u0000\u0000\u03b3\u03b4"+
		"\u0001\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u03c1"+
		"\u0003\u00a0P\u0000\u03b6\u03b7\n)\u0000\u0000\u03b7\u03c1\u0003|>\u0000"+
		"\u03b8\u03b9\n\'\u0000\u0000\u03b9\u03ba\u0004A \u0000\u03ba\u03c1\u0005"+
		"\u0015\u0000\u0000\u03bb\u03bc\n&\u0000\u0000\u03bc\u03bd\u0004A\"\u0000"+
		"\u03bd\u03c1\u0005\u0016\u0000\u0000\u03be\u03bf\n\t\u0000\u0000\u03bf"+
		"\u03c1\u0003\u0094J\u0000\u03c0\u036b\u0001\u0000\u0000\u0000\u03c0\u036e"+
		"\u0001\u0000\u0000\u0000\u03c0\u0371\u0001\u0000\u0000\u0000\u03c0\u0374"+
		"\u0001\u0000\u0000\u0000\u03c0\u0377\u0001\u0000\u0000\u0000\u03c0\u037a"+
		"\u0001\u0000\u0000\u0000\u03c0\u037d\u0001\u0000\u0000\u0000\u03c0\u0380"+
		"\u0001\u0000\u0000\u0000\u03c0\u0383\u0001\u0000\u0000\u0000\u03c0\u0386"+
		"\u0001\u0000\u0000\u0000\u03c0\u0389\u0001\u0000\u0000\u0000\u03c0\u038c"+
		"\u0001\u0000\u0000\u0000\u03c0\u038f\u0001\u0000\u0000\u0000\u03c0\u0392"+
		"\u0001\u0000\u0000\u0000\u03c0\u0395\u0001\u0000\u0000\u0000\u03c0\u0398"+
		"\u0001\u0000\u0000\u0000\u03c0\u039e\u0001\u0000\u0000\u0000\u03c0\u03a1"+
		"\u0001\u0000\u0000\u0000\u03c0\u03a5\u0001\u0000\u0000\u0000\u03c0\u03ad"+
		"\u0001\u0000\u0000\u0000\u03c0\u03b6\u0001\u0000\u0000\u0000\u03c0\u03b8"+
		"\u0001\u0000\u0000\u0000\u03c0\u03bb\u0001\u0000\u0000\u0000\u03c0\u03be"+
		"\u0001\u0000\u0000\u0000\u03c1\u03c4\u0001\u0000\u0000\u0000\u03c2\u03c0"+
		"\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000\u0000\u03c3\u0083"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c5\u03c6"+
		"\u0005\u000f\u0000\u0000\u03c6\u03c7\u0003\u0082A\u0000\u03c7\u0085\u0001"+
		"\u0000\u0000\u0000\u03c8\u03cd\u0003\u00a2Q\u0000\u03c9\u03cd\u0003\u00a6"+
		"S\u0000\u03ca\u03cd\u0003r9\u0000\u03cb\u03cd\u0003\u0088D\u0000\u03cc"+
		"\u03c8\u0001\u0000\u0000\u0000\u03cc\u03c9\u0001\u0000\u0000\u0000\u03cc"+
		"\u03ca\u0001\u0000\u0000\u0000\u03cc\u03cb\u0001\u0000\u0000\u0000\u03cd"+
		"\u0087\u0001\u0000\u0000\u0000\u03ce\u03da\u0005\n\u0000\u0000\u03cf\u03d4"+
		"\u0003x<\u0000\u03d0\u03d1\u0005\u000e\u0000\u0000\u03d1\u03d3\u0003x"+
		"<\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d3\u03d6\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000"+
		"\u0000\u03d5\u03d8\u0001\u0000\u0000\u0000\u03d6\u03d4\u0001\u0000\u0000"+
		"\u0000\u03d7\u03d9\u0005\u000e\u0000\u0000\u03d8\u03d7\u0001\u0000\u0000"+
		"\u0000\u03d8\u03d9\u0001\u0000\u0000\u0000\u03d9\u03db\u0001\u0000\u0000"+
		"\u0000\u03da\u03cf\u0001\u0000\u0000\u0000\u03da\u03db\u0001\u0000\u0000"+
		"\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03dd\u0005\f\u0000\u0000"+
		"\u03dd\u0089\u0001\u0000\u0000\u0000\u03de\u03f4\u0003X,\u0000\u03df\u03e1"+
		"\u0005p\u0000\u0000\u03e0\u03df\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001"+
		"\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2\u03e4\u0005"+
		"[\u0000\u0000\u03e3\u03e5\u0005\u001b\u0000\u0000\u03e4\u03e3\u0001\u0000"+
		"\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000"+
		"\u0000\u0000\u03e6\u03e8\u0005\b\u0000\u0000\u03e7\u03e9\u0003h4\u0000"+
		"\u03e8\u03e7\u0001\u0000\u0000\u0000\u03e8\u03e9\u0001\u0000\u0000\u0000"+
		"\u03e9\u03ea\u0001\u0000\u0000\u0000\u03ea\u03eb\u0005\t\u0000\u0000\u03eb"+
		"\u03f4\u0003n7\u0000\u03ec\u03ee\u0005p\u0000\u0000\u03ed\u03ec\u0001"+
		"\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001"+
		"\u0000\u0000\u0000\u03ef\u03f0\u0003\u008cF\u0000\u03f0\u03f1\u0005>\u0000"+
		"\u0000\u03f1\u03f2\u0003\u008eG\u0000\u03f2\u03f4\u0001\u0000\u0000\u0000"+
		"\u03f3\u03de\u0001\u0000\u0000\u0000\u03f3\u03e0\u0001\u0000\u0000\u0000"+
		"\u03f3\u03ed\u0001\u0000\u0000\u0000\u03f4\u008b\u0001\u0000\u0000\u0000"+
		"\u03f5\u03fc\u0003z=\u0000\u03f6\u03f8\u0005\b\u0000\u0000\u03f7\u03f9"+
		"\u0003h4\u0000\u03f8\u03f7\u0001\u0000\u0000\u0000\u03f8\u03f9\u0001\u0000"+
		"\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa\u03fc\u0005\t\u0000"+
		"\u0000\u03fb\u03f5\u0001\u0000\u0000\u0000\u03fb\u03f6\u0001\u0000\u0000"+
		"\u0000\u03fc\u008d\u0001\u0000\u0000\u0000\u03fd\u0400\u0003\u0082A\u0000"+
		"\u03fe\u0400\u0003n7\u0000\u03ff\u03fd\u0001\u0000\u0000\u0000\u03ff\u03fe"+
		"\u0001\u0000\u0000\u0000\u0400\u008f\u0001\u0000\u0000\u0000\u0401\u0402"+
		"\u0007\u0007\u0000\u0000\u0402\u0091\u0001\u0000\u0000\u0000\u0403\u040b"+
		"\u0005?\u0000\u0000\u0404\u040b\u0005@\u0000\u0000\u0405\u040b\u0005|"+
		"\u0000\u0000\u0406\u040b\u0003\u0094J\u0000\u0407\u040b\u0005\u0005\u0000"+
		"\u0000\u0408\u040b\u0003\u0098L\u0000\u0409\u040b\u0003\u009aM\u0000\u040a"+
		"\u0403\u0001\u0000\u0000\u0000\u040a\u0404\u0001\u0000\u0000\u0000\u040a"+
		"\u0405\u0001\u0000\u0000\u0000\u040a\u0406\u0001\u0000\u0000\u0000\u040a"+
		"\u0407\u0001\u0000\u0000\u0000\u040a\u0408\u0001\u0000\u0000\u0000\u040a"+
		"\u0409\u0001\u0000\u0000\u0000\u040b\u0093\u0001\u0000\u0000\u0000\u040c"+
		"\u0410\u0005}\u0000\u0000\u040d\u040f\u0003\u0096K\u0000\u040e\u040d\u0001"+
		"\u0000\u0000\u0000\u040f\u0412\u0001\u0000\u0000\u0000\u0410\u040e\u0001"+
		"\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000\u0000\u0411\u0413\u0001"+
		"\u0000\u0000\u0000\u0412\u0410\u0001\u0000\u0000\u0000\u0413\u0414\u0005"+
		"}\u0000\u0000\u0414\u0095\u0001\u0000\u0000\u0000\u0415\u041b\u0005\u0083"+
		"\u0000\u0000\u0416\u0417\u0005\u0082\u0000\u0000\u0417\u0418\u0003\u0082"+
		"A\u0000\u0418\u0419\u0005\u000b\u0000\u0000\u0419\u041b\u0001\u0000\u0000"+
		"\u0000\u041a\u0415\u0001\u0000\u0000\u0000\u041a\u0416\u0001\u0000\u0000"+
		"\u0000\u041b\u0097\u0001\u0000\u0000\u0000\u041c\u041d\u0007\b\u0000\u0000"+
		"\u041d\u0099\u0001\u0000\u0000\u0000\u041e\u041f\u0007\t\u0000\u0000\u041f"+
		"\u009b\u0001\u0000\u0000\u0000\u0420\u0421\u0004N$\u0000\u0421\u0422\u0003"+
		"\u00a2Q\u0000\u0422\u0423\u0003d2\u0000\u0423\u009d\u0001\u0000\u0000"+
		"\u0000\u0424\u0425\u0004O%\u0000\u0425\u0426\u0003\u00a2Q\u0000\u0426"+
		"\u0427\u0003d2\u0000\u0427\u009f\u0001\u0000\u0000\u0000\u0428\u042b\u0003"+
		"\u00a2Q\u0000\u0429\u042b\u0003\u00a4R\u0000\u042a\u0428\u0001\u0000\u0000"+
		"\u0000\u042a\u0429\u0001\u0000\u0000\u0000\u042b\u00a1\u0001\u0000\u0000"+
		"\u0000\u042c\u042d\u0007\n\u0000\u0000\u042d\u00a3\u0001\u0000\u0000\u0000"+
		"\u042e\u0432\u0003\u00a6S\u0000\u042f\u0432\u0005?\u0000\u0000\u0430\u0432"+
		"\u0005@\u0000\u0000\u0431\u042e\u0001\u0000\u0000\u0000\u0431\u042f\u0001"+
		"\u0000\u0000\u0000\u0431\u0430\u0001\u0000\u0000\u0000\u0432\u00a5\u0001"+
		"\u0000\u0000\u0000\u0433\u0464\u0005J\u0000\u0000\u0434\u0464\u0005K\u0000"+
		"\u0000\u0435\u0464\u0005L\u0000\u0000\u0436\u0464\u0005M\u0000\u0000\u0437"+
		"\u0464\u0005N\u0000\u0000\u0438\u0464\u0005O\u0000\u0000\u0439\u0464\u0005"+
		"P\u0000\u0000\u043a\u0464\u0005Q\u0000\u0000\u043b\u0464\u0005R\u0000"+
		"\u0000\u043c\u0464\u0005S\u0000\u0000\u043d\u0464\u0005T\u0000\u0000\u043e"+
		"\u0464\u0005U\u0000\u0000\u043f\u0464\u0005V\u0000\u0000\u0440\u0464\u0005"+
		"W\u0000\u0000\u0441\u0464\u0005X\u0000\u0000\u0442\u0464\u0005Y\u0000"+
		"\u0000\u0443\u0464\u0005Z\u0000\u0000\u0444\u0464\u0005[\u0000\u0000\u0445"+
		"\u0464\u0005\\\u0000\u0000\u0446\u0464\u0005]\u0000\u0000\u0447\u0464"+
		"\u0005^\u0000\u0000\u0448\u0464\u0005_\u0000\u0000\u0449\u0464\u0005`"+
		"\u0000\u0000\u044a\u0464\u0005a\u0000\u0000\u044b\u0464\u0005b\u0000\u0000"+
		"\u044c\u0464\u0005c\u0000\u0000\u044d\u0464\u0005i\u0000\u0000\u044e\u0464"+
		"\u0005j\u0000\u0000\u044f\u0464\u0005k\u0000\u0000\u0450\u0464\u0005l"+
		"\u0000\u0000\u0451\u0464\u0005m\u0000\u0000\u0452\u0464\u0005n\u0000\u0000"+
		"\u0453\u0464\u0005o\u0000\u0000\u0454\u0464\u0005r\u0000\u0000\u0455\u0464"+
		"\u0003\u00a8T\u0000\u0456\u0464\u0005u\u0000\u0000\u0457\u0464\u0005v"+
		"\u0000\u0000\u0458\u0464\u0005w\u0000\u0000\u0459\u0464\u0005x\u0000\u0000"+
		"\u045a\u0464\u0005y\u0000\u0000\u045b\u0464\u0005z\u0000\u0000\u045c\u0464"+
		"\u0005g\u0000\u0000\u045d\u0464\u0005h\u0000\u0000\u045e\u0464\u0005p"+
		"\u0000\u0000\u045f\u0464\u0005q\u0000\u0000\u0460\u0464\u0005e\u0000\u0000"+
		"\u0461\u0464\u0005d\u0000\u0000\u0462\u0464\u0005f\u0000\u0000\u0463\u0433"+
		"\u0001\u0000\u0000\u0000\u0463\u0434\u0001\u0000\u0000\u0000\u0463\u0435"+
		"\u0001\u0000\u0000\u0000\u0463\u0436\u0001\u0000\u0000\u0000\u0463\u0437"+
		"\u0001\u0000\u0000\u0000\u0463\u0438\u0001\u0000\u0000\u0000\u0463\u0439"+
		"\u0001\u0000\u0000\u0000\u0463\u043a\u0001\u0000\u0000\u0000\u0463\u043b"+
		"\u0001\u0000\u0000\u0000\u0463\u043c\u0001\u0000\u0000\u0000\u0463\u043d"+
		"\u0001\u0000\u0000\u0000\u0463\u043e\u0001\u0000\u0000\u0000\u0463\u043f"+
		"\u0001\u0000\u0000\u0000\u0463\u0440\u0001\u0000\u0000\u0000\u0463\u0441"+
		"\u0001\u0000\u0000\u0000\u0463\u0442\u0001\u0000\u0000\u0000\u0463\u0443"+
		"\u0001\u0000\u0000\u0000\u0463\u0444\u0001\u0000\u0000\u0000\u0463\u0445"+
		"\u0001\u0000\u0000\u0000\u0463\u0446\u0001\u0000\u0000\u0000\u0463\u0447"+
		"\u0001\u0000\u0000\u0000\u0463\u0448\u0001\u0000\u0000\u0000\u0463\u0449"+
		"\u0001\u0000\u0000\u0000\u0463\u044a\u0001\u0000\u0000\u0000\u0463\u044b"+
		"\u0001\u0000\u0000\u0000\u0463\u044c\u0001\u0000\u0000\u0000\u0463\u044d"+
		"\u0001\u0000\u0000\u0000\u0463\u044e\u0001\u0000\u0000\u0000\u0463\u044f"+
		"\u0001\u0000\u0000\u0000\u0463\u0450\u0001\u0000\u0000\u0000\u0463\u0451"+
		"\u0001\u0000\u0000\u0000\u0463\u0452\u0001\u0000\u0000\u0000\u0463\u0453"+
		"\u0001\u0000\u0000\u0000\u0463\u0454\u0001\u0000\u0000\u0000\u0463\u0455"+
		"\u0001\u0000\u0000\u0000\u0463\u0456\u0001\u0000\u0000\u0000\u0463\u0457"+
		"\u0001\u0000\u0000\u0000\u0463\u0458\u0001\u0000\u0000\u0000\u0463\u0459"+
		"\u0001\u0000\u0000\u0000\u0463\u045a\u0001\u0000\u0000\u0000\u0463\u045b"+
		"\u0001\u0000\u0000\u0000\u0463\u045c\u0001\u0000\u0000\u0000\u0463\u045d"+
		"\u0001\u0000\u0000\u0000\u0463\u045e\u0001\u0000\u0000\u0000\u0463\u045f"+
		"\u0001\u0000\u0000\u0000\u0463\u0460\u0001\u0000\u0000\u0000\u0463\u0461"+
		"\u0001\u0000\u0000\u0000\u0463\u0462\u0001\u0000\u0000\u0000\u0464\u00a7"+
		"\u0001\u0000\u0000\u0000\u0465\u0466\u0007\u000b\u0000\u0000\u0466\u00a9"+
		"\u0001\u0000\u0000\u0000\u0467\u046c\u0005\r\u0000\u0000\u0468\u046c\u0005"+
		"\u0000\u0000\u0001\u0469\u046c\u0004U&\u0000\u046a\u046c\u0004U\'\u0000"+
		"\u046b\u0467\u0001\u0000\u0000\u0000\u046b\u0468\u0001\u0000\u0000\u0000"+
		"\u046b\u0469\u0001\u0000\u0000\u0000\u046b\u046a\u0001\u0000\u0000\u0000"+
		"\u046c\u00ab\u0001\u0000\u0000\u0000\u046d\u046f\u0003\u00b0X\u0000\u046e"+
		"\u046d\u0001\u0000\u0000\u0000\u046f\u0470\u0001\u0000\u0000\u0000\u0470"+
		"\u046e\u0001\u0000\u0000\u0000\u0470\u0471\u0001\u0000\u0000\u0000\u0471"+
		"\u00ad\u0001\u0000\u0000\u0000\u0472\u0473\u0007\f\u0000\u0000\u0473\u00af"+
		"\u0001\u0000\u0000\u0000\u0474\u047a\u0003\u00b2Y\u0000\u0475\u0476\u0003"+
		"\u00b4Z\u0000\u0476\u0477\u0003\u00b8\\\u0000\u0477\u0478\u0003\u00b6"+
		"[\u0000\u0478\u047a\u0001\u0000\u0000\u0000\u0479\u0474\u0001\u0000\u0000"+
		"\u0000\u0479\u0475\u0001\u0000\u0000\u0000\u047a\u00b1\u0001\u0000\u0000"+
		"\u0000\u047b\u047c\u0003\u00aeW\u0000\u047c\u047e\u0003\u00ba]\u0000\u047d"+
		"\u047f\u0003\u00c0`\u0000\u047e\u047d\u0001\u0000\u0000\u0000\u047e\u047f"+
		"\u0001\u0000\u0000\u0000\u047f\u0480\u0001\u0000\u0000\u0000\u0480\u0481"+
		"\u0005\u0086\u0000\u0000\u0481\u00b3\u0001\u0000\u0000\u0000\u0482\u0483"+
		"\u0003\u00aeW\u0000\u0483\u0485\u0003\u00bc^\u0000\u0484\u0486\u0003\u00c0"+
		"`\u0000\u0485\u0484\u0001\u0000\u0000\u0000\u0485\u0486\u0001\u0000\u0000"+
		"\u0000\u0486\u0487\u0001\u0000\u0000\u0000\u0487\u0488\u0005\u0085\u0000"+
		"\u0000\u0488\u00b5\u0001\u0000\u0000\u0000\u0489\u048a\u0005\u0091\u0000"+
		"\u0000\u048a\u048b\u0003\u00be_\u0000\u048b\u048c\u0005\u0093\u0000\u0000"+
		"\u048c\u00b7\u0001\u0000\u0000\u0000\u048d\u048f\u0005\u008f\u0000\u0000"+
		"\u048e\u048d\u0001\u0000\u0000\u0000\u048e\u048f\u0001\u0000\u0000\u0000"+
		"\u048f\u0499\u0001\u0000\u0000\u0000\u0490\u0493\u0003\u00b0X\u0000\u0491"+
		"\u0493\u0003\u00ccf\u0000\u0492\u0490\u0001\u0000\u0000\u0000\u0492\u0491"+
		"\u0001\u0000\u0000\u0000\u0493\u0495\u0001\u0000\u0000\u0000\u0494\u0496"+
		"\u0005\u008f\u0000\u0000\u0495\u0494\u0001\u0000\u0000\u0000\u0495\u0496"+
		"\u0001\u0000\u0000\u0000\u0496\u0498\u0001\u0000\u0000\u0000\u0497\u0492"+
		"\u0001\u0000\u0000\u0000\u0498\u049b\u0001\u0000\u0000\u0000\u0499\u0497"+
		"\u0001\u0000\u0000\u0000\u0499\u049a\u0001\u0000\u0000\u0000\u049a\u00b9"+
		"\u0001\u0000\u0000\u0000\u049b\u0499\u0001\u0000\u0000\u0000\u049c\u049d"+
		"\u0005\u0089\u0000\u0000\u049d\u00bb\u0001\u0000\u0000\u0000\u049e\u049f"+
		"\u0005\u0089\u0000\u0000\u049f\u04a0\u0006^\uffff\uffff\u0000\u04a0\u00bd"+
		"\u0001\u0000\u0000\u0000\u04a1\u04a2\u0005\u0094\u0000\u0000\u04a2\u04a3"+
		"\u0004_(\u0001\u04a3\u00bf\u0001\u0000\u0000\u0000\u04a4\u04a6\u0003\u00c2"+
		"a\u0000\u04a5\u04a7\u0003\u00c0`\u0000\u04a6\u04a5\u0001\u0000\u0000\u0000"+
		"\u04a6\u04a7\u0001\u0000\u0000\u0000\u04a7\u04ad\u0001\u0000\u0000\u0000"+
		"\u04a8\u04aa\u0003\u00c4b\u0000\u04a9\u04ab\u0003\u00c0`\u0000\u04aa\u04a9"+
		"\u0001\u0000\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000\u04ab\u04ad"+
		"\u0001\u0000\u0000\u0000\u04ac\u04a4\u0001\u0000\u0000\u0000\u04ac\u04a8"+
		"\u0001\u0000\u0000\u0000\u04ad\u00c1\u0001\u0000\u0000\u0000\u04ae\u04af"+
		"\u0005\u0088\u0000\u0000\u04af\u04b0\u0005\u0013\u0000\u0000\u04b0\u04b1"+
		"\u0003\u0082A\u0000\u04b1\u04b2\u0005\f\u0000\u0000\u04b2\u00c3\u0001"+
		"\u0000\u0000\u0000\u04b3\u04b4\u0003\u00c6c\u0000\u04b4\u04b5\u0005\u0087"+
		"\u0000\u0000\u04b5\u04b6\u0003\u00c8d\u0000\u04b6\u04b9\u0001\u0000\u0000"+
		"\u0000\u04b7\u04b9\u0003\u00c6c\u0000\u04b8\u04b3\u0001\u0000\u0000\u0000"+
		"\u04b8\u04b7\u0001\u0000\u0000\u0000\u04b9\u00c5\u0001\u0000\u0000\u0000"+
		"\u04ba\u04bb\u0005\u0089\u0000\u0000\u04bb\u00c7\u0001\u0000\u0000\u0000"+
		"\u04bc\u04c0\u0005\u008e\u0000\u0000\u04bd\u04c0\u0003\u00b0X\u0000\u04be"+
		"\u04c0\u0003\u00ccf\u0000\u04bf\u04bc\u0001\u0000\u0000\u0000\u04bf\u04bd"+
		"\u0001\u0000\u0000\u0000\u04bf\u04be\u0001\u0000\u0000\u0000\u04c0\u00c9"+
		"\u0001\u0000\u0000\u0000\u04c1\u04c2\u0007\r\u0000\u0000\u04c2\u00cb\u0001"+
		"\u0000\u0000\u0000\u04c3\u04c4\u0003\u00cae\u0000\u04c4\u04c5\u0003\u0080"+
		"@\u0000\u04c5\u04c6\u0005\f\u0000\u0000\u04c6\u00cd\u0001\u0000\u0000"+
		"\u0000\u04c7\u04e0\u0003X,\u0000\u04c8\u04ca\u0005p\u0000\u0000\u04c9"+
		"\u04c8\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000\u0000\u04ca"+
		"\u04cb\u0001\u0000\u0000\u0000\u04cb\u04cd\u0005[\u0000\u0000\u04cc\u04ce"+
		"\u0005\u001b\u0000\u0000\u04cd\u04cc\u0001\u0000\u0000\u0000\u04cd\u04ce"+
		"\u0001\u0000\u0000\u0000\u04ce\u04cf\u0001\u0000\u0000\u0000\u04cf\u04d1"+
		"\u0005\b\u0000\u0000\u04d0\u04d2\u0003h4\u0000\u04d1\u04d0\u0001\u0000"+
		"\u0000\u0000\u04d1\u04d2\u0001\u0000\u0000\u0000\u04d2\u04d3\u0001\u0000"+
		"\u0000\u0000\u04d3\u04d4\u0005\t\u0000\u0000\u04d4\u04d5\u0005\n\u0000"+
		"\u0000\u04d5\u04d6\u0003n7\u0000\u04d6\u04d7\u0005\f\u0000\u0000\u04d7"+
		"\u04e0\u0001\u0000\u0000\u0000\u04d8\u04da\u0005p\u0000\u0000\u04d9\u04d8"+
		"\u0001\u0000\u0000\u0000\u04d9\u04da\u0001\u0000\u0000\u0000\u04da\u04db"+
		"\u0001\u0000\u0000\u0000\u04db\u04dc\u0003\u008cF\u0000\u04dc\u04dd\u0005"+
		">\u0000\u0000\u04dd\u04de\u0003\u008eG\u0000\u04de\u04e0\u0001\u0000\u0000"+
		"\u0000\u04df\u04c7\u0001\u0000\u0000\u0000\u04df\u04c9\u0001\u0000\u0000"+
		"\u0000\u04df\u04d9\u0001\u0000\u0000\u0000\u04e0\u00cf\u0001\u0000\u0000"+
		"\u0000\u0089\u00d1\u00d4\u00ee\u00f2\u00f9\u00ff\u0103\u010a\u0112\u0117"+
		"\u0119\u0120\u0124\u012d\u0131\u0139\u013d\u0141\u014a\u0152\u0156\u015e"+
		"\u0163\u0165\u016c\u0171\u017c\u0182\u0191\u01a5\u01a9\u01ad\u01b5\u01be"+
		"\u01c3\u01ca\u01cf\u01d4\u01db\u01e2\u01e9\u01fb\u01ff\u0201\u0208\u020e"+
		"\u0213\u0222\u0225\u022a\u022d\u0238\u023c\u0241\u024c\u0252\u025a\u0260"+
		"\u0266\u026a\u026e\u0271\u0276\u027c\u0284\u0289\u028e\u0292\u0296\u02a0"+
		"\u02a5\u02a8\u02ad\u02b4\u02bb\u02c4\u02c8\u02cd\u02d2\u02d8\u02dc\u02eb"+
		"\u02ee\u02f3\u0304\u0307\u0310\u0318\u031c\u031e\u0323\u0327\u032e\u0335"+
		"\u0369\u03a7\u03af\u03b3\u03c0\u03c2\u03cc\u03d4\u03d8\u03da\u03e0\u03e4"+
		"\u03e8\u03ed\u03f3\u03f8\u03fb\u03ff\u040a\u0410\u041a\u042a\u0431\u0463"+
		"\u046b\u0470\u0479\u047e\u0485\u048e\u0492\u0495\u0499\u04a6\u04aa\u04ac"+
		"\u04b8\u04bf\u04c9\u04cd\u04d1\u04d9\u04df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}