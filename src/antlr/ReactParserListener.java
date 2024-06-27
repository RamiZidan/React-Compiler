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
	 * Enter a parse tree produced by {@link ReactParser#componentReturnStatment}.
	 * @param ctx the parse tree
	 */
	void enterComponentReturnStatment(ReactParser.ComponentReturnStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#componentReturnStatment}.
	 * @param ctx the parse tree
	 */
	void exitComponentReturnStatment(ReactParser.ComponentReturnStatmentContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#statments}.
	 * @param ctx the parse tree
	 */
	void enterStatments(ReactParser.StatmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#statments}.
	 * @param ctx the parse tree
	 */
	void exitStatments(ReactParser.StatmentsContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(ReactParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(ReactParser.SingleExpressionContext ctx);
}