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
	 * Visit a parse tree produced by {@link ReactParser#componentReturnStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentReturnStatment(ReactParser.ComponentReturnStatmentContext ctx);
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
	 * Visit a parse tree produced by {@link ReactParser#objectExpressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpressionSequence(ReactParser.ObjectExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#openBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenBrace(ReactParser.OpenBraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#expressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSequence(ReactParser.ExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(ReactParser.SingleExpressionContext ctx);
}