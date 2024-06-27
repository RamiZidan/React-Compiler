// Generated from /home/social/IdeaProjects/React/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactParser}.
 */
public interface ReactParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReactParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(ReactParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(ReactParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ReactParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ReactParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ReactParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ReactParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(ReactParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(ReactParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(ReactParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(ReactParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportFromBlock(ReactParser.ImportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportFromBlock(ReactParser.ImportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importModuleItems}.
	 * @param ctx the parse tree
	 */
	void enterImportModuleItems(ReactParser.ImportModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importModuleItems}.
	 * @param ctx the parse tree
	 */
	void exitImportModuleItems(ReactParser.ImportModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importAliasName}.
	 * @param ctx the parse tree
	 */
	void enterImportAliasName(ReactParser.ImportAliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importAliasName}.
	 * @param ctx the parse tree
	 */
	void exitImportAliasName(ReactParser.ImportAliasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#moduleExportName}.
	 * @param ctx the parse tree
	 */
	void enterModuleExportName(ReactParser.ModuleExportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#moduleExportName}.
	 * @param ctx the parse tree
	 */
	void exitModuleExportName(ReactParser.ModuleExportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importedBinding}.
	 * @param ctx the parse tree
	 */
	void enterImportedBinding(ReactParser.ImportedBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importedBinding}.
	 * @param ctx the parse tree
	 */
	void exitImportedBinding(ReactParser.ImportedBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void enterImportDefault(ReactParser.ImportDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void exitImportDefault(ReactParser.ImportDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespace(ReactParser.ImportNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespace(ReactParser.ImportNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void enterImportFrom(ReactParser.ImportFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void exitImportFrom(ReactParser.ImportFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(ReactParser.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(ReactParser.AliasNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDeclaration(ReactParser.ExportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDeclaration(ReactParser.ExportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDefaultDeclaration(ReactParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDefaultDeclaration(ReactParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterExportFromBlock(ReactParser.ExportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitExportFromBlock(ReactParser.ExportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#exportModuleItems}.
	 * @param ctx the parse tree
	 */
	void enterExportModuleItems(ReactParser.ExportModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#exportModuleItems}.
	 * @param ctx the parse tree
	 */
	void exitExportModuleItems(ReactParser.ExportModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#exportAliasName}.
	 * @param ctx the parse tree
	 */
	void enterExportAliasName(ReactParser.ExportAliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#exportAliasName}.
	 * @param ctx the parse tree
	 */
	void exitExportAliasName(ReactParser.ExportAliasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ReactParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ReactParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(ReactParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(ReactParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement_(ReactParser.EmptyStatement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement_(ReactParser.EmptyStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ReactParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ReactParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ReactParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ReactParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(ReactParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(ReactParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ReactParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ReactParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ReactParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ReactParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(ReactParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(ReactParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForOfStatement(ReactParser.ForOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForOfStatement(ReactParser.ForOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(ReactParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(ReactParser.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(ReactParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(ReactParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(ReactParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(ReactParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ReactParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ReactParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldStatement(ReactParser.YieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldStatement(ReactParser.YieldStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(ReactParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(ReactParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ReactParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ReactParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(ReactParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(ReactParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(ReactParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(ReactParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(ReactParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(ReactParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(ReactParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(ReactParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelledStatement(ReactParser.LabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelledStatement(ReactParser.LabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(ReactParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(ReactParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(ReactParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(ReactParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void enterCatchProduction(ReactParser.CatchProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void exitCatchProduction(ReactParser.CatchProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void enterFinallyProduction(ReactParser.FinallyProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void exitFinallyProduction(ReactParser.FinallyProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterDebuggerStatement(ReactParser.DebuggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitDebuggerStatement(ReactParser.DebuggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ReactParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ReactParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#classTail}.
	 * @param ctx the parse tree
	 */
	void enterClassTail(ReactParser.ClassTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#classTail}.
	 * @param ctx the parse tree
	 */
	void exitClassTail(ReactParser.ClassTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassElement(ReactParser.ClassElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassElement(ReactParser.ClassElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(ReactParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(ReactParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(ReactParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(ReactParser.FieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#classElementName}.
	 * @param ctx the parse tree
	 */
	void enterClassElementName(ReactParser.ClassElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#classElementName}.
	 * @param ctx the parse tree
	 */
	void exitClassElementName(ReactParser.ClassElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#privateIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterPrivateIdentifier(ReactParser.PrivateIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#privateIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitPrivateIdentifier(ReactParser.PrivateIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ReactParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ReactParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterArg(ReactParser.FormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterArg(ReactParser.FormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterArg(ReactParser.LastFormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterArg(ReactParser.LastFormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(ReactParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(ReactParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(ReactParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(ReactParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(ReactParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(ReactParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(ReactParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(ReactParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(ReactParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(ReactParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterComputedPropertyExpressionAssignment(ReactParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitComputedPropertyExpressionAssignment(ReactParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFunctionProperty(ReactParser.FunctionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFunctionProperty(ReactParser.FunctionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetter(ReactParser.PropertyGetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetter(ReactParser.PropertyGetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetter(ReactParser.PropertySetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetter(ReactParser.PropertySetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyShorthand(ReactParser.PropertyShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyShorthand(ReactParser.PropertyShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(ReactParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(ReactParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ReactParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ReactParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ReactParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ReactParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(ReactParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(ReactParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringExpression(ReactParser.TemplateStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringExpression(ReactParser.TemplateStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(ReactParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(ReactParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(ReactParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(ReactParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(ReactParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(ReactParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(ReactParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(ReactParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(ReactParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(ReactParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MetaExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMetaExpression(ReactParser.MetaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MetaExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMetaExpression(ReactParser.MetaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(ReactParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(ReactParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(ReactParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(ReactParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionalChainExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterOptionalChainExpression(ReactParser.OptionalChainExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionalChainExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitOptionalChainExpression(ReactParser.OptionalChainExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(ReactParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(ReactParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecreaseExpression(ReactParser.PreDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecreaseExpression(ReactParser.PreDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(ReactParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(ReactParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAwaitExpression(ReactParser.AwaitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAwaitExpression(ReactParser.AwaitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(ReactParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(ReactParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(ReactParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(ReactParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(ReactParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(ReactParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ReactParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ReactParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecreaseExpression(ReactParser.PostDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecreaseExpression(ReactParser.PostDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(ReactParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(ReactParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpression(ReactParser.InstanceofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpression(ReactParser.InstanceofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(ReactParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(ReactParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(ReactParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(ReactParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterImportExpression(ReactParser.ImportExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitImportExpression(ReactParser.ImportExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ReactParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ReactParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitXOrExpression(ReactParser.BitXOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitXOrExpression(ReactParser.BitXOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(ReactParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(ReactParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ReactParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ReactParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftExpression(ReactParser.BitShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftExpression(ReactParser.BitShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(ReactParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(ReactParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ReactParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ReactParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ReactParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ReactParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(ReactParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(ReactParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterYieldExpression(ReactParser.YieldExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitYieldExpression(ReactParser.YieldExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitNotExpression(ReactParser.BitNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitNotExpression(ReactParser.BitNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(ReactParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(ReactParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(ReactParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(ReactParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(ReactParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(ReactParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(ReactParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(ReactParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassExpression(ReactParser.ClassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassExpression(ReactParser.ClassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(ReactParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(ReactParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(ReactParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(ReactParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpression(ReactParser.BitAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpression(ReactParser.BitAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpression(ReactParser.BitOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpression(ReactParser.BitOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperatorExpression(ReactParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperatorExpression(ReactParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterVoidExpression(ReactParser.VoidExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitVoidExpression(ReactParser.VoidExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterCoalesceExpression(ReactParser.CoalesceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitCoalesceExpression(ReactParser.CoalesceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(ReactParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(ReactParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(ReactParser.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(ReactParser.AssignableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(ReactParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(ReactParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(ReactParser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(ReactParser.AnonymousFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionParameters(ReactParser.ArrowFunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionParameters(ReactParser.ArrowFunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionBody(ReactParser.ArrowFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionBody(ReactParser.ArrowFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ReactParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ReactParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ReactParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ReactParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringLiteral(ReactParser.TemplateStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringLiteral(ReactParser.TemplateStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringAtom(ReactParser.TemplateStringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringAtom(ReactParser.TemplateStringAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(ReactParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(ReactParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#bigintLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBigintLiteral(ReactParser.BigintLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#bigintLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBigintLiteral(ReactParser.BigintLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(ReactParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(ReactParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(ReactParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(ReactParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(ReactParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(ReactParser.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ReactParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ReactParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(ReactParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(ReactParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(ReactParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(ReactParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#let_}.
	 * @param ctx the parse tree
	 */
	void enterLet_(ReactParser.Let_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#let_}.
	 * @param ctx the parse tree
	 */
	void exitLet_(ReactParser.Let_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(ReactParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(ReactParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxElements}.
	 * @param ctx the parse tree
	 */
	void enterJsxElements(ReactParser.JsxElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxElements}.
	 * @param ctx the parse tree
	 */
	void exitJsxElements(ReactParser.JsxElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxElementBegin}.
	 * @param ctx the parse tree
	 */
	void enterJsxElementBegin(ReactParser.JsxElementBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxElementBegin}.
	 * @param ctx the parse tree
	 */
	void exitJsxElementBegin(ReactParser.JsxElementBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxElement(ReactParser.JsxElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxElement(ReactParser.JsxElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxSelfClosingElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxSelfClosingElement(ReactParser.JsxSelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxSelfClosingElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxSelfClosingElement(ReactParser.JsxSelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxOpeningElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxOpeningElement(ReactParser.JsxOpeningElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxOpeningElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxOpeningElement(ReactParser.JsxOpeningElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxClosingElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxClosingElement(ReactParser.JsxClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxClosingElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxClosingElement(ReactParser.JsxClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxChildren}.
	 * @param ctx the parse tree
	 */
	void enterJsxChildren(ReactParser.JsxChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxChildren}.
	 * @param ctx the parse tree
	 */
	void exitJsxChildren(ReactParser.JsxChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxSelfClosingElementName}.
	 * @param ctx the parse tree
	 */
	void enterJsxSelfClosingElementName(ReactParser.JsxSelfClosingElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxSelfClosingElementName}.
	 * @param ctx the parse tree
	 */
	void exitJsxSelfClosingElementName(ReactParser.JsxSelfClosingElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxOpeningElementName}.
	 * @param ctx the parse tree
	 */
	void enterJsxOpeningElementName(ReactParser.JsxOpeningElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxOpeningElementName}.
	 * @param ctx the parse tree
	 */
	void exitJsxOpeningElementName(ReactParser.JsxOpeningElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxClosingElementName}.
	 * @param ctx the parse tree
	 */
	void enterJsxClosingElementName(ReactParser.JsxClosingElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxClosingElementName}.
	 * @param ctx the parse tree
	 */
	void exitJsxClosingElementName(ReactParser.JsxClosingElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxAttributes}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttributes(ReactParser.JsxAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxAttributes}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttributes(ReactParser.JsxAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxSpreadAttribute}.
	 * @param ctx the parse tree
	 */
	void enterJsxSpreadAttribute(ReactParser.JsxSpreadAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxSpreadAttribute}.
	 * @param ctx the parse tree
	 */
	void exitJsxSpreadAttribute(ReactParser.JsxSpreadAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttribute(ReactParser.JsxAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttribute(ReactParser.JsxAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttributeName(ReactParser.JsxAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttributeName(ReactParser.JsxAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttributeValue(ReactParser.JsxAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttributeValue(ReactParser.JsxAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#openBrace}.
	 * @param ctx the parse tree
	 */
	void enterOpenBrace(ReactParser.OpenBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#openBrace}.
	 * @param ctx the parse tree
	 */
	void exitOpenBrace(ReactParser.OpenBraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#objectExpressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpressionSequence(ReactParser.ObjectExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#objectExpressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpressionSequence(ReactParser.ObjectExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(ReactParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(ReactParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnoymousFunctionDecl}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnoymousFunctionDecl(ReactParser.AnoymousFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnoymousFunctionDecl}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnoymousFunctionDecl(ReactParser.AnoymousFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(ReactParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(ReactParser.ArrowFunctionContext ctx);
}