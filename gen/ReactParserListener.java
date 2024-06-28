// Generated from /home/social/IdeaProjects/React/src/ReactParser.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link ReactParser#importStatment}.
	 * @param ctx the parse tree
	 */
	void enterImportStatment(ReactParser.ImportStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importStatment}.
	 * @param ctx the parse tree
	 */
	void exitImportStatment(ReactParser.ImportStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#namedImportStatment}.
	 * @param ctx the parse tree
	 */
	void enterNamedImportStatment(ReactParser.NamedImportStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#namedImportStatment}.
	 * @param ctx the parse tree
	 */
	void exitNamedImportStatment(ReactParser.NamedImportStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#defaultImportStatment}.
	 * @param ctx the parse tree
	 */
	void enterDefaultImportStatment(ReactParser.DefaultImportStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#defaultImportStatment}.
	 * @param ctx the parse tree
	 */
	void exitDefaultImportStatment(ReactParser.DefaultImportStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#listOfIdentifiers}.
	 * @param ctx the parse tree
	 */
	void enterListOfIdentifiers(ReactParser.ListOfIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#listOfIdentifiers}.
	 * @param ctx the parse tree
	 */
	void exitListOfIdentifiers(ReactParser.ListOfIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#hook}.
	 * @param ctx the parse tree
	 */
	void enterHook(ReactParser.HookContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#hook}.
	 * @param ctx the parse tree
	 */
	void exitHook(ReactParser.HookContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#exportStatment}.
	 * @param ctx the parse tree
	 */
	void enterExportStatment(ReactParser.ExportStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#exportStatment}.
	 * @param ctx the parse tree
	 */
	void exitExportStatment(ReactParser.ExportStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(ReactParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(ReactParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#classComponent}.
	 * @param ctx the parse tree
	 */
	void enterClassComponent(ReactParser.ClassComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#classComponent}.
	 * @param ctx the parse tree
	 */
	void exitClassComponent(ReactParser.ClassComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionalComponent}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalComponent(ReactParser.FunctionalComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionalComponent}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalComponent(ReactParser.FunctionalComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentBody(ReactParser.ComponentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentBody(ReactParser.ComponentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxReturnStatment}.
	 * @param ctx the parse tree
	 */
	void enterJsxReturnStatment(ReactParser.JsxReturnStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxReturnStatment}.
	 * @param ctx the parse tree
	 */
	void exitJsxReturnStatment(ReactParser.JsxReturnStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#regularFunctionStart}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionStart(ReactParser.RegularFunctionStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#regularFunctionStart}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionStart(ReactParser.RegularFunctionStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrowFunctionStart}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionStart(ReactParser.ArrowFunctionStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrowFunctionStart}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionStart(ReactParser.ArrowFunctionStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ReactParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ReactParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(ReactParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(ReactParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionStatment}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatment(ReactParser.FunctionStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionStatment}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatment(ReactParser.FunctionStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(ReactParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(ReactParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(ReactParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(ReactParser.ArrowFunctionContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#variableReturnStatment}.
	 * @param ctx the parse tree
	 */
	void enterVariableReturnStatment(ReactParser.VariableReturnStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableReturnStatment}.
	 * @param ctx the parse tree
	 */
	void exitVariableReturnStatment(ReactParser.VariableReturnStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void enterIfStatment(ReactParser.IfStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void exitIfStatment(ReactParser.IfStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#whileStatment}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatment(ReactParser.WhileStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#whileStatment}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatment(ReactParser.WhileStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#conditionsList}.
	 * @param ctx the parse tree
	 */
	void enterConditionsList(ReactParser.ConditionsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#conditionsList}.
	 * @param ctx the parse tree
	 */
	void exitConditionsList(ReactParser.ConditionsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ReactParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ReactParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(ReactParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(ReactParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#hookDeclarationStatment}.
	 * @param ctx the parse tree
	 */
	void enterHookDeclarationStatment(ReactParser.HookDeclarationStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#hookDeclarationStatment}.
	 * @param ctx the parse tree
	 */
	void exitHookDeclarationStatment(ReactParser.HookDeclarationStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#assignStatment}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatment(ReactParser.AssignStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#assignStatment}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatment(ReactParser.AssignStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(ReactParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(ReactParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ReactParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ReactParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void enterUseEffect(ReactParser.UseEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void exitUseEffect(ReactParser.UseEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#dependancyList}.
	 * @param ctx the parse tree
	 */
	void enterDependancyList(ReactParser.DependancyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#dependancyList}.
	 * @param ctx the parse tree
	 */
	void exitDependancyList(ReactParser.DependancyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useState}.
	 * @param ctx the parse tree
	 */
	void enterUseState(ReactParser.UseStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useState}.
	 * @param ctx the parse tree
	 */
	void exitUseState(ReactParser.UseStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useRef}.
	 * @param ctx the parse tree
	 */
	void enterUseRef(ReactParser.UseRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useRef}.
	 * @param ctx the parse tree
	 */
	void exitUseRef(ReactParser.UseRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#varDeclarationStatment}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationStatment(ReactParser.VarDeclarationStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#varDeclarationStatment}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationStatment(ReactParser.VarDeclarationStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ReactParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ReactParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ReactParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ReactParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(ReactParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(ReactParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ReactParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ReactParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(ReactParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(ReactParser.StringContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#jsxTagName}.
	 * @param ctx the parse tree
	 */
	void enterJsxTagName(ReactParser.JsxTagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxTagName}.
	 * @param ctx the parse tree
	 */
	void exitJsxTagName(ReactParser.JsxTagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxAttName}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttName(ReactParser.JsxAttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxAttName}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttName(ReactParser.JsxAttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxAttValue}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttValue(ReactParser.JsxAttValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxAttValue}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttValue(ReactParser.JsxAttValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxAtt}.
	 * @param ctx the parse tree
	 */
	void enterJsxAtt(ReactParser.JsxAttContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxAtt}.
	 * @param ctx the parse tree
	 */
	void exitJsxAtt(ReactParser.JsxAttContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxEleContent}.
	 * @param ctx the parse tree
	 */
	void enterJsxEleContent(ReactParser.JsxEleContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxEleContent}.
	 * @param ctx the parse tree
	 */
	void exitJsxEleContent(ReactParser.JsxEleContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(ReactParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(ReactParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrayJsx}.
	 * @param ctx the parse tree
	 */
	void enterArrayJsx(ReactParser.ArrayJsxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrayJsx}.
	 * @param ctx the parse tree
	 */
	void exitArrayJsx(ReactParser.ArrayJsxContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#callbackFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallbackFunction(ReactParser.CallbackFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#callbackFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallbackFunction(ReactParser.CallbackFunctionContext ctx);
}