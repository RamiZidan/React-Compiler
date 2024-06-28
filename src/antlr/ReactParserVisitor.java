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
	 * Visit a parse tree produced by {@link ReactParser#importStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatment(ReactParser.ImportStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#namedImportStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedImportStatment(ReactParser.NamedImportStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#defaultImportStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultImportStatment(ReactParser.DefaultImportStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#listOfIdentifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfIdentifiers(ReactParser.ListOfIdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#hook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHook(ReactParser.HookContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#exportStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatment(ReactParser.ExportStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(ReactParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#classComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassComponent(ReactParser.ClassComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionalComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalComponent(ReactParser.FunctionalComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBody(ReactParser.ComponentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxReturnStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxReturnStatment(ReactParser.JsxReturnStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#regularFunctionStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionStart(ReactParser.RegularFunctionStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrowFunctionStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionStart(ReactParser.ArrowFunctionStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(ReactParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#statments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatments(ReactParser.StatmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatment(ReactParser.FunctionStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(ReactParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(ReactParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(ReactParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableReturnStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReturnStatment(ReactParser.VariableReturnStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#ifStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatment(ReactParser.IfStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#whileStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatment(ReactParser.WhileStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#conditionsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionsList(ReactParser.ConditionsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ReactParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(ReactParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#hookDeclarationStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHookDeclarationStatment(ReactParser.HookDeclarationStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#assignStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatment(ReactParser.AssignStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(ReactParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ReactParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useEffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffect(ReactParser.UseEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#dependancyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependancyList(ReactParser.DependancyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseState(ReactParser.UseStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRef(ReactParser.UseRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#varDeclarationStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationStatment(ReactParser.VarDeclarationStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ReactParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ReactParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(ReactParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ReactParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ReactParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarModifier(ReactParser.VarModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(ReactParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElement(ReactParser.JsxElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxTagName(ReactParser.JsxTagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxAttName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttName(ReactParser.JsxAttNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxAttValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttValue(ReactParser.JsxAttValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxAtt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAtt(ReactParser.JsxAttContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxEleContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxEleContent(ReactParser.JsxEleContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(ReactParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayJsx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayJsx(ReactParser.ArrayJsxContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#callbackFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallbackFunction(ReactParser.CallbackFunctionContext ctx);
}