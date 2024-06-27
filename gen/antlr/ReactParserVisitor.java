// Generated from /home/social/IdeaProjects/React/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#sourceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElement(ReactParser.SourceElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ReactParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ReactParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(ReactParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(ReactParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromBlock(ReactParser.ImportFromBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importModuleItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportModuleItems(ReactParser.ImportModuleItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importAliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAliasName(ReactParser.ImportAliasNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#moduleExportName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleExportName(ReactParser.ModuleExportNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importedBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportedBinding(ReactParser.ImportedBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefault(ReactParser.ImportDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamespace(ReactParser.ImportNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFrom(ReactParser.ImportFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#aliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasName(ReactParser.AliasNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDeclaration(ReactParser.ExportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDefaultDeclaration(ReactParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#exportFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportFromBlock(ReactParser.ExportFromBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#exportModuleItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportModuleItems(ReactParser.ExportModuleItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#exportAliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportAliasName(ReactParser.ExportAliasNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ReactParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(ReactParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#emptyStatement_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement_(ReactParser.EmptyStatement_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(ReactParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ReactParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(ReactParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ReactParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ReactParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(ReactParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForOfStatement(ReactParser.ForOfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarModifier(ReactParser.VarModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(ReactParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(ReactParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ReactParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#yieldStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStatement(ReactParser.YieldStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#withStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(ReactParser.WithStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(ReactParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(ReactParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#caseClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClauses(ReactParser.CaseClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(ReactParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(ReactParser.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#labelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelledStatement(ReactParser.LabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(ReactParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(ReactParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#catchProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchProduction(ReactParser.CatchProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#finallyProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyProduction(ReactParser.FinallyProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#debuggerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebuggerStatement(ReactParser.DebuggerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ReactParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#classTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTail(ReactParser.ClassTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElement(ReactParser.ClassElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(ReactParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDefinition(ReactParser.FieldDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#classElementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElementName(ReactParser.ClassElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#privateIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateIdentifier(ReactParser.PrivateIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ReactParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#formalParameterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterArg(ReactParser.FormalParameterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameterArg(ReactParser.LastFormalParameterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(ReactParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#sourceElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElements(ReactParser.SourceElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(ReactParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(ReactParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyExpressionAssignment(ReactParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedPropertyExpressionAssignment(ReactParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionProperty(ReactParser.FunctionPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyGetter(ReactParser.PropertyGetterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySetter(ReactParser.PropertySetterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyShorthand(ReactParser.PropertyShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(ReactParser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ReactParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ReactParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#expressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSequence(ReactParser.ExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringExpression(ReactParser.TemplateStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(ReactParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(ReactParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(ReactParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(ReactParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(ReactParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MetaExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaExpression(ReactParser.MetaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(ReactParser.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(ReactParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionalChainExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalChainExpression(ReactParser.OptionalChainExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(ReactParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecreaseExpression(ReactParser.PreDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsExpression(ReactParser.ArgumentsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitExpression(ReactParser.AwaitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(ReactParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(ReactParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(ReactParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(ReactParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecreaseExpression(ReactParser.PostDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofExpression(ReactParser.TypeofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceofExpression(ReactParser.InstanceofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlusExpression(ReactParser.UnaryPlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteExpression(ReactParser.DeleteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportExpression(ReactParser.ImportExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ReactParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitXOrExpression(ReactParser.BitXOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpression(ReactParser.SuperExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ReactParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitShiftExpression(ReactParser.BitShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(ReactParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ReactParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ReactParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(ReactParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code YieldExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldExpression(ReactParser.YieldExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitNotExpression(ReactParser.BitNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(ReactParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(ReactParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpression(ReactParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDotExpression(ReactParser.MemberDotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExpression(ReactParser.ClassExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberIndexExpression(ReactParser.MemberIndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(ReactParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAndExpression(ReactParser.BitAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOrExpression(ReactParser.BitOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperatorExpression(ReactParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidExpression(ReactParser.VoidExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoalesceExpression(ReactParser.CoalesceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(ReactParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignable(ReactParser.AssignableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(ReactParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunction(ReactParser.AnonymousFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionParameters(ReactParser.ArrowFunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionBody(ReactParser.ArrowFunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(ReactParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ReactParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringLiteral(ReactParser.TemplateStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#templateStringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringAtom(ReactParser.TemplateStringAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(ReactParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#bigintLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigintLiteral(ReactParser.BigintLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(ReactParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(ReactParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#identifierName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierName(ReactParser.IdentifierNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ReactParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#reservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedWord(ReactParser.ReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(ReactParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#let_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_(ReactParser.Let_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(ReactParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElements(ReactParser.JsxElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxElementBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElementBegin(ReactParser.JsxElementBeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElement(ReactParser.JsxElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxSelfClosingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxSelfClosingElement(ReactParser.JsxSelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxOpeningElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxOpeningElement(ReactParser.JsxOpeningElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxClosingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxClosingElement(ReactParser.JsxClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxChildren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxChildren(ReactParser.JsxChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxSelfClosingElementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxSelfClosingElementName(ReactParser.JsxSelfClosingElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxOpeningElementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxOpeningElementName(ReactParser.JsxOpeningElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxClosingElementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxClosingElementName(ReactParser.JsxClosingElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttributes(ReactParser.JsxAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxSpreadAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxSpreadAttribute(ReactParser.JsxSpreadAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttribute(ReactParser.JsxAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxAttributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttributeName(ReactParser.JsxAttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttributeValue(ReactParser.JsxAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#openBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenBrace(ReactParser.OpenBraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#objectExpressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpressionSequence(ReactParser.ObjectExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(ReactParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnoymousFunctionDecl}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnoymousFunctionDecl(ReactParser.AnoymousFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(ReactParser.ArrowFunctionContext ctx);
}