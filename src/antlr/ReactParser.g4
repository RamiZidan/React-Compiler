parser grammar ReactParser;

// Insert here @header for C++ parser.

options {
    tokenVocab = ReactLexer;
}

program :
     statment*  EOF
    ;

importStatment : // done 1 ,
    namedImportStatment
    | defaultImportStatment
    ;

namedImportStatment: // done 1 ,
    Import listOfIdentifiers  From StringLiteral  eos
    ;

defaultImportStatment: // done 1 ,
    Import OpenBrace listOfIdentifiers CloseBrace From StringLiteral eos
    ;

listOfIdentifiers: // done 1 ,
     ((Identifier | hook ) Comma? )* (Identifier | hook)?  |
    ;

hook: // done 1 ,
    UseState
   |UseRef
   |UseEffect
   ;
exportStatment: // done 1 ,
      Export Default? Identifier eos
    | Export OpenBrace (Identifier Comma?)* Identifier? CloseBrace eos
   ;

component:
     functionalComponent
    | classComponent
    ;

classComponent:
    Class Identifier Extends React_Component OpenBrace Render OpenParen params CloseParen componentBody CloseBrace
    ;
functionalComponent:
        regularFunctionStart componentBody
       |arrowFunctionStart componentBody
    ;
componentBody:
    OpenBrace statment* jsxReturnStatment CloseBrace eos
    ;
jsxReturnStatment:
     Return OpenParen jsxElement CloseParen eos
    |Return LessThan GreaterThan jsxElement LessThan Divide GreaterThan eos
    | Return jsxElement eos
    ;

regularFunctionStart: // done 1 ,
    Function_ Identifier OpenParen params CloseParen
    ;

arrowFunctionStart: // done 1 ,
    varModifier Identifier Assign OpenParen params CloseParen Arrow
    ;
params: // done 1 ,
    (variable Comma?)*
    ;

statment:
        varDeclarationStatment // done 1 , 2
      | hookDeclarationStatment // done 1 , 2
      | assignStatment // done 1 , 2
      | ifStatment // done 1 , 2
      | whileStatment // done 1 , 2
      | functionStatment // done 1 , 2
      | component
      | importStatment // done 1 , 2
      | exportStatment // done 1 , 2
    ;
functionStatment: // done 1 ,
     regularFunction
    |arrowFunction
    ;
regularFunction: // done 1 ,
    regularFunctionStart functionBody
    ;
arrowFunction: // done 1 ,
    arrowFunctionStart functionBody
    ;
functionBody: // done 1 ,
     OpenBrace statment* variableReturnStatment CloseBrace eos
    ;
variableReturnStatment: // done 1 ,
    Return variable eos
    ;


ifStatment: // done 1 ,
    If OpenParen conditionsList CloseParen OpenBrace statment* CloseBrace
    ;
whileStatment: // done 1 ,
    While OpenParen conditionsList CloseParen OpenBrace statment* CloseBrace
    ;
conditionsList: // done 1 ,
     (condition (And | Or))* condition
    ;

condition: // done 1 ,
     OpenParen? variable compare variable CloseParen?
    | variable
    ;
compare: // done 1 ,
      GreaterThan
    | LessThan
    | GreaterThanEquals
    | LessThanEquals
    | Equals_
    | NotEquals
    | IdentityEquals
    | IdentityNotEquals
    ;

hookDeclarationStatment: // done 1 , 2
     useEffect
    |useState
    |useRef
    ;
assignStatment: // done 1 ,
    Identifier Assign variable eos
    ;

equation:
     equation operation equation
    | number
    ;
operation:
    Plus
    | Minus
    | Divide
    | Multiply
    ;
useEffect: // done 1 , 2
    UseEffect OpenParen OpenParen params CloseParen Arrow OpenBrace statment* CloseBrace Comma dependancyList CloseParen eos
    ;
dependancyList: // done 1 , 2
    array
    ;
useState: // done 1 , 2
    varModifier OpenBracket Identifier Comma Identifier CloseBracket Assign UseState OpenParen variable? CloseParen eos
    ;
useRef: // done 1 , 2
    varModifier Identifier Assign UseRef OpenParen variable? CloseParen eos
    ;
varDeclarationStatment: // done 1 ,
    varModifier Identifier Assign variable eos
    ;
variable: // done 1 ,
      array
    | object
    | equation
    | string
    | Identifier
    ;
array: // done 1 ,
    OpenBracket (variable Comma?)* CloseBracket
    ;
object: // done 1 ,
    OpenBrace ( Identifier Colon variable Comma?)* CloseBrace
    ;
number: // done 1 ,
    DecimalLiteral
    ;
string:// done 1 ,
    StringLiteral
    ;


varModifier: // done 1 ,
      Var
    | Let
    | Const
    ;
eos:
    SemiColon
    ;

// done 1 ,
jsxElement:LessThan jsxTagName jsxAtt* GreaterThan jsxEleContent* LessThan Divide jsxTagName GreaterThan // <tag att> content </tag>
          |LessThan jsxTagName jsxAtt* Divide GreaterThan                                             // <tag att />
;

jsxTagName: Identifier ;
//jsxAttName: Source | ClickAtt | ClassName | Ref | Height | Width;
jsxAttName: Identifier ;

jsxAttValue:      variable | OpenBrace variable? CloseBrace;             // " " Or {expr}
jsxAtt:                       jsxAttName Assign jsxAttValue;             // att=val
jsxEleContent:
    jsxElement
    | singleExpression* OpenBrace singleExpression CloseBrace singleExpression*
    | singleExpression
    ;             // <jsx/> Or {expr}
singleExpression :
      Identifier
      | arrayJsx
     ;
arrayJsx:
    Identifier Dot MapFunction OpenParen callbackFunction CloseParen
    ;

callbackFunction:
    OpenParen params CloseParen Arrow OpenBrace statment* jsxReturnStatment CloseBrace eos
    ;
//
//jsxElements
//    : jsxElement+
//    ;
//
//jsxElementBegin
//    : JsxElementBegin
//    | JsxOpeningElementBegin
//    | JsxChildrenOpeningElementBegin
//    ;
//
//jsxElement
//    : jsxSelfClosingElement
//    | jsxOpeningElement jsxChildren jsxClosingElement
//    ;
//
//jsxSelfClosingElement
//    : jsxElementBegin jsxSelfClosingElementName jsxAttributes? JsxOpeningElementSlashEnd
//    ;
//
//jsxOpeningElement
//    : jsxElementBegin jsxOpeningElementName jsxAttributes? JsxOpeningElementEnd
//    ;
//
//jsxClosingElement
//    : JsxChildrenClosingElementSlashBegin jsxClosingElementName JsxClosingElementEnd
//    ;
//
//jsxChildren
//    : HtmlChardata? ((jsxElement | objectExpressionSequence) HtmlChardata?)*
//    ;
//
//jsxSelfClosingElementName
//    : JsxOpeningElementId
//    ;
//
//jsxOpeningElementName
//    : JsxOpeningElementId {this.pushHtmlTagName($JsxOpeningElementId.text);}
//    ;
//
//jsxClosingElementName
//    : JsxClosingElementId {this.popHtmlTagName($JsxClosingElementId.text)}?
//    ;
//
//jsxAttributes
//    : jsxSpreadAttribute jsxAttributes?
//    | jsxAttribute jsxAttributes?
//    ;
//
//jsxSpreadAttribute
//    : JsxOpeningElementOpenBrace Ellipsis singleExpression CloseBrace
//    ;
//
//jsxAttribute
//    : jsxAttributeName JsxAssign jsxAttributeValue
//    | jsxAttributeName
//    ;
//
//jsxAttributeName
//    : JsxOpeningElementId
//    ;
//
//jsxAttributeValue
//    : JsxAttributeValue
//    | jsxElement
//    | objectExpressionSequence
//    ;
//
//objectExpressionSequence
//    : openBrace expressionSequence CloseBrace
//    ;
//openBrace
//    : OpenBrace
//    | JsxOpeningElementOpenBrace
//    | JsxChildrenOpenBrace
//    ;
//expressionSequence
//    : singleExpression (',' singleExpression)*
//    ;
//

// Split to try `new Date()` first, then `new Date`.
//    | singleExpression '?.'? '[' expressionSequence ']' # MemberIndexExpression
//    anonymousFunction                                 # FunctionExpression
//    | Class identifier? classTail                       # ClassExpression
//    | literal                                                              # LiteralExpression
//    | arrayLiteral                                                         # ArrayLiteralExpression
//    | yieldStatement                                                       # YieldExpression          // ECMAScript 6
//    | objectLiteral                                                        # ObjectLiteralExpression
//    | '(' expressionSequence ')'                                           # ParenthesizedExpression
//    | <assoc = right> singleExpression assignmentOperator singleExpression # AssignmentOperatorExpression


//program
//    : (importStatement)* ( classDeclaration | functionDeclaration )+ exportStatement EOF
//    ;
//
//importStatement
//    : Import importFromBlock
//    ;
//
//importFromBlock
//    : importDefault? (importNamespace | importModuleItems) importFrom eos
//    | StringLiteral eos
//    ;
//
//importModuleItems
//    : '{' (importAliasName ',')* (importAliasName ','?)? '}'
//    ;
//
//importAliasName
//    : moduleExportName (As importedBinding)?
//    ;
//
//moduleExportName
//    : identifierName
//    | StringLiteral
//    ;
//
//importDefault
//    : aliasName ','
//    ;
//
//aliasName
//    : identifierName (As identifierName)?
//    ;
//

/*
//
//functionDeclaration
//    : Async? Function_ '*'? identifier '(' formalParameterList? ')' functionBody
//    ;
//methodDefinition
//    : (Async {this.notLineTerminator()}?)? '*'? classElementName '(' formalParameterList? ')' functionBody
//    | '*'? getter '(' ')' functionBody
//    | '*'? setter '(' formalParameterList? ')' functionBody
//    ;
//functionBody
//    : '{' sourceElements '}'
//    ;
//
//
//statement
//    : block
//    | variableStatement
//    | exportStatement
//    | emptyStatement_
//    | classDeclaration
//    | functionDeclaration
//    | expressionStatement
//    | ifStatement
//    | iterationStatement
//    | continueStatement
//    | breakStatement
//    | returnStatement
//    | yieldStatement
//    | withStatement
//    | labelledStatement
//    | switchStatement
//    | throwStatement
//    | tryStatement
//    | debuggerStatement
//
//    ;
//
//block
//    : '{' statementList? '}'
//    ;
//
//statementList
//    : statement+
//    ;
//
//importStatement
//    : Import importFromBlock
//    ;
//
//importFromBlock
//    : importDefault? (importNamespace | importModuleItems) importFrom eos
//    | StringLiteral eos
//    ;
//
//importModuleItems
//    : '{' (importAliasName ',')* (importAliasName ','?)? '}'
//    ;
//
//importAliasName
//    : moduleExportName (As importedBinding)?
//    ;
//
//moduleExportName
//    : identifierName
//    | StringLiteral
//    ;
//
//// yield and await are permitted as BindingIdentifier in the grammar
//importedBinding
//    : Identifier
//    | Yield
//    | Await
//    ;
//
//importDefault
//    : aliasName ','
//    ;
//
//importNamespace
//    : ('*' | identifierName) (As identifierName)?
//    ;
//
//importFrom
//    : From StringLiteral
//    ;
//
//aliasName
//    : identifierName (As identifierName)?
//    ;
//
//exportStatement
//    : Export Default? (exportFromBlock | declaration) eos # ExportDeclaration
//    | Export Default singleExpression eos                 # ExportDefaultDeclaration
//    ;
//
//exportFromBlock
//    : importNamespace importFrom eos
//    | exportModuleItems importFrom? eos
//    ;
//
//exportModuleItems
//    : '{' (exportAliasName ',')* (exportAliasName ','?)? '}'
//    ;
//
//exportAliasName
//    : moduleExportName (As moduleExportName)?
//    ;
//
//declaration
//    : variableStatement
//    | classDeclaration
//    | functionDeclaration
//    ;
//
//variableStatement
//    : variableDeclarationList eos
//    ;
//
//variableDeclarationList
//    : varModifier variableDeclaration (',' variableDeclaration)*
//    ;
//
//variableDeclaration
//    : assignable (Assign singleExpression)? // ECMAScript 6: Array & Object Matching
//    ;
//
//emptyStatement_
//    : SemiColon
//    ;
//
//expressionStatement
//    : {this.notOpenBraceAndNotFunction()}? expressionSequence eos
//    ;
//
//ifStatement
//    : If '(' expressionSequence ')' statement (Else statement)?
//    ;
//
//iterationStatement
//    : Do statement While '(' expressionSequence ')' eos                                                                     # DoStatement
//    | While '(' expressionSequence ')' statement                                                                            # WhileStatement
//    | For '(' (expressionSequence | variableDeclarationList)? ';' expressionSequence? ';' expressionSequence? ')' statement # ForStatement
//    | For '(' (singleExpression | variableDeclarationList) In expressionSequence ')' statement                              # ForInStatement
//    | For Await? '(' (singleExpression | variableDeclarationList) Of expressionSequence ')' statement                       # ForOfStatement
//    ;
//
//varModifier // let, const - ECMAScript 6
//    : Var
//    | let_
//    | Const
//    ;
//
//continueStatement
//    : Continue ({this.notLineTerminator()}? identifier)? eos
//    ;
//
//breakStatement
//    : Break ({this.notLineTerminator()}? identifier)? eos
//    ;
//
//returnStatement
//    : Return ({this.notLineTerminator()}? expressionSequence)? eos
//    ;
//
//yieldStatement
//    : (Yield | YieldStar) ({this.notLineTerminator()}? expressionSequence)? eos
//    ;
//
//withStatement
//    : With '(' expressionSequence ')' statement
//    ;
//
//switchStatement
//    : Switch '(' expressionSequence ')' caseBlock
//    ;
//
//caseBlock
//    : '{' caseClauses? (defaultClause caseClauses?)? '}'
//    ;
//
//caseClauses
//    : caseClause+
//    ;
//
//caseClause
//    : Case expressionSequence ':' statementList?
//    ;
//
//defaultClause
//    : Default ':' statementList?
//    ;
//
//labelledStatement
//    : identifier ':' statement
//    ;
//
//throwStatement
//    : Throw {this.notLineTerminator()}? expressionSequence eos
//    ;
//
//tryStatement
//    : Try block (catchProduction finallyProduction? | finallyProduction)
//    ;
//
//catchProduction
//    : Catch ('(' assignable? ')')? block
//    ;
//
//finallyProduction
//    : Finally block
//    ;
//
//debuggerStatement
//    : Debugger eos
//    ;
//
//
//
//classDeclaration
//    : Class identifier classTail
//    ;
//
//classTail
//    : (Extends singleExpression)? '{' classElement* '}'
//    ;
//
//classElement
//    : (Static | {this.n("static")}? identifier)? methodDefinition
//    | (Static | {this.n("static")}? identifier)? fieldDefinition
//    | (Static | {this.n("static")}? identifier) block
//    | emptyStatement_
//    ;
//
//
//fieldDefinition
//    : classElementName initializer?
//    ;
//
//classElementName
//    : propertyName
//    | privateIdentifier
//    ;
//
//privateIdentifier
//    : '#' identifierName
//    ;
//
//formalParameterList
//    : formalParameterArg (',' formalParameterArg)* (',' lastFormalParameterArg)?
//    | lastFormalParameterArg
//    ;
//
//formalParameterArg
//    : assignable (Assign singleExpression)? // ECMAScript 6: Initialization
//    ;
//
//lastFormalParameterArg // ECMAScript 6: Rest Parameter
//    : Ellipsis singleExpression
//    ;
//
//
//sourceElements
//    : statement+ Return jsxElements
//    ;
//
//arrayLiteral
//    : ('[' elementList ']')
//    ;
//
//// JavaScript supports arrasys like [,,1,2,,].
//elementList
//    : ','* arrayElement? (','+ arrayElement) * ','* // Yes, everything is optional
//    ;
//
//arrayElement
//    : Ellipsis? singleExpression
//    ;
//
//propertyAssignment
//    : propertyName ':' singleExpression                                  # PropertyExpressionAssignment
//    | '[' singleExpression ']' ':' singleExpression                      # ComputedPropertyExpressionAssignment
//    | Async? '*'? propertyName '(' formalParameterList? ')' functionBody # FunctionProperty
//    | getter '(' ')' functionBody                                        # PropertyGetter
//    | setter '(' formalParameterArg ')' functionBody                     # PropertySetter
//    | Ellipsis? singleExpression                                         # PropertyShorthand
//    ;
//
//propertyName
//    : identifierName
//    | StringLiteral
//    | numericLiteral
//    | '[' singleExpression ']'
//    ;
//
//arguments
//    : '(' (argument (',' argument)* ','?)? ')'
//    ;
//
//argument
//    : Ellipsis? (singleExpression | identifier)
//    ;
//
//expressionSequence
//    : singleExpression (',' singleExpression)*
//    ;
//
//singleExpression
//    : anonymousFunction                                 # FunctionExpression
//    | Class identifier? classTail                       # ClassExpression
//    | singleExpression '?.' singleExpression            # OptionalChainExpression
//    | singleExpression '?.'? '[' expressionSequence ']' # MemberIndexExpression
//    | singleExpression '?'? '.' '#'? identifierName     # MemberDotExpression
//    // Split to try `new Date()` first, then `new Date`.
//    | New identifier arguments                                             # NewExpression
//    | New singleExpression arguments                                       # NewExpression
//    | New singleExpression                                                 # NewExpression
//    | singleExpression arguments                                           # ArgumentsExpression
//    | New '.' identifier                                                   # MetaExpression // new.target
//    | singleExpression {this.notLineTerminator()}? '++'                    # PostIncrementExpression
//    | singleExpression {this.notLineTerminator()}? '--'                    # PostDecreaseExpression
//    | Delete singleExpression                                              # DeleteExpression
//    | Void singleExpression                                                # VoidExpression
//    | Typeof singleExpression                                              # TypeofExpression
//    | '++' singleExpression                                                # PreIncrementExpression
//    | '--' singleExpression                                                # PreDecreaseExpression
//    | '+' singleExpression                                                 # UnaryPlusExpression
//    | '-' singleExpression                                                 # UnaryMinusExpression
//    | '~' singleExpression                                                 # BitNotExpression
//    | '!' singleExpression                                                 # NotExpression
//    | Await singleExpression                                               # AwaitExpression
//    | <assoc = right> singleExpression Power singleExpression               # PowerExpression
//    | singleExpression ('*' | '/' | '%') singleExpression                  # MultiplicativeExpression
//    | singleExpression ('+' | '-') singleExpression                        # AdditiveExpression
//    | singleExpression '??' singleExpression                               # CoalesceExpression
//    | singleExpression ('<<' | '>>' | '>>>') singleExpression              # BitShiftExpression
//    | singleExpression (LessThan | GreaterThan | LessThanEquals | GreaterThanEquals) singleExpression          # RelationalExpression
//    | singleExpression Instanceof singleExpression                         # InstanceofExpression
//    | singleExpression In singleExpression                                 # InExpression
//    | singleExpression ('==' | '!=' | '===' | '!==') singleExpression      # EqualityExpression
//    | singleExpression '&' singleExpression                                # BitAndExpression
//    | singleExpression '^' singleExpression                                # BitXOrExpression
//    | singleExpression '|' singleExpression                                # BitOrExpression
//    | singleExpression '&&' singleExpression                               # LogicalAndExpression
//    | singleExpression '||' singleExpression                               # LogicalOrExpression
//    | singleExpression '?' singleExpression ':' singleExpression           # TernaryExpression
//    | <assoc = right> singleExpression Assign singleExpression                # AssignmentExpression
//    | <assoc = right> singleExpression assignmentOperator singleExpression # AssignmentOperatorExpression
//    | Import '(' singleExpression ')'                                      # ImportExpression
//    | yieldStatement                                                       # YieldExpression          // ECMAScript 6
//    | This                                                                 # ThisExpression
//    | identifier                                                           # IdentifierExpression
//    | Super                                                                # SuperExpression
//    | literal                                                              # LiteralExpression
//    | arrayLiteral                                                         # ArrayLiteralExpression
//    | objectLiteral                                                        # ObjectLiteralExpression
//    | '(' expressionSequence ')'                                           # ParenthesizedExpression
//    ;
//
//initializer
//    : Assign singleExpression
//    ;
//
//assignable
//    : identifier
//    | keyword
//    | arrayLiteral
//    | objectLiteral
//    ;
//
//objectLiteral
//    : '{' (propertyAssignment (',' propertyAssignment)* ','?)? '}'
//    ;
//
//anonymousFunction
//    : functionDeclaration
//    | Async? Function_ '*'? '(' formalParameterList? ')' functionBody
//    | Async? arrowFunctionParameters '=>' arrowFunctionBody
//    ;
//
//arrowFunctionParameters
//    : propertyName
//    | '(' formalParameterList? ')'
//    ;
//
//arrowFunctionBody
//    : singleExpression
//    | functionBody
//    ;
//
//assignmentOperator
//    : '*='
//    | '/='
//    | '%='
//    | '+='
//    | '-='
//    | '<<='
//    | '>>='
//    | '>>>='
//    | '&='
//    | '^='
//    | '|='
//    | '**='
//    | '??='
//    ;
//
//literal
//    : NullLiteral
//    | BooleanLiteral
//    | StringLiteral
//    | numericLiteral
//    ;
//
//
//numericLiteral
//    : DecimalLiteral
//    ;
//
//
//
//getter
//    : {this.n("get")}? identifier classElementName
//    ;
//
//setter
//    : {this.n("set")}? identifier classElementName
//    ;
//
//identifierName
//    : identifier
//    | reservedWord
//    ;
//
//identifier
//    : Identifier
//    | Async
//    | As
//    | From
//    | Yield
//    | Of
//    ;
//
//reservedWord
//    : keyword
//    | NullLiteral
//    | BooleanLiteral
//    ;
//
//keyword
//    : Break
//    | Do
//    | Instanceof
//    | Typeof
//    | Case
//    | Else
//    | New
//    | Var
//    | Catch
//    | Finally
//    | Return
//    | Void
//    | Continue
//    | For
//    | Switch
//    | While
//    | Debugger
//    | Function_
//    | This
//    | With
//    | Default
//    | If
//    | Throw
//    | Delete
//    | In
//    | Try
//    | Class
//    | Enum
//    | Extends
//    | Super
//    | Const
//    | Export
//    | Import
//    | Implements
//    | let_
//    | Private
//    | Public
//    | Interface
//    | Package
//    | Protected
//    | Static
//    | Yield
//    | YieldStar
//    | Async
//    | Await
//    | From
//    | As
//    | Of
//    ;
//
//let_
//    : Let
//    ;
//
//eos
//    : SemiColon
//    ;
//
//
//jsxElements
//    : jsxElement+
//    ;
//
//jsxElementBegin
//    : JsxElementBegin
//    | JsxOpeningElementBegin
//    | JsxChildrenOpeningElementBegin
//    ;
//
//jsxElement
//    : jsxSelfClosingElement
//    | jsxOpeningElement jsxChildren jsxClosingElement
//    ;
//
//jsxSelfClosingElement
//    : jsxElementBegin jsxSelfClosingElementName jsxAttributes? JsxOpeningElementSlashEnd
//    ;
//
//jsxOpeningElement
//    : jsxElementBegin jsxOpeningElementName jsxAttributes? JsxOpeningElementEnd
//    ;
//
//jsxClosingElement
//    : JsxChildrenClosingElementSlashBegin jsxClosingElementName JsxClosingElementEnd
//    ;
//
//jsxChildren
//    : HtmlChardata? ((jsxElement | objectExpressionSequence) HtmlChardata?)*
//    ;
//
//jsxSelfClosingElementName
//    : JsxOpeningElementId
//    ;
//
//jsxOpeningElementName
//    : JsxOpeningElementId {this.pushHtmlTagName($JsxOpeningElementId.text);}
//    ;
//
//jsxClosingElementName
//    : JsxClosingElementId {this.popHtmlTagName($JsxClosingElementId.text)}?
//    ;
//
//jsxAttributes
//    : jsxSpreadAttribute jsxAttributes?
//    | jsxAttribute jsxAttributes?
//    ;
//
//jsxSpreadAttribute
//    : JsxOpeningElementOpenBrace Ellipsis singleExpression CloseBrace
//    ;
//
//jsxAttribute
//    : jsxAttributeName JsxAssign jsxAttributeValue
//    | jsxAttributeName
//    ;
//
//jsxAttributeName
//    : JsxOpeningElementId
//    ;
//
//jsxAttributeValue
//    : JsxAttributeValue
//    | jsxElement
//    | objectExpressionSequence
//    ;
//
//
//openBrace
//    : OpenBrace
//    | JsxOpeningElementOpenBrace
//    | JsxChildrenOpenBrace
//    ;
//
//objectExpressionSequence
//    : openBrace expressionSequence CloseBrace
//    ;
//
//anoymousFunction
//    : functionDeclaration                                                     # FunctionDecl
//    | Async? Function_ '*'? '(' formalParameterList? ')' OpenBrace functionBody CloseBrace # AnoymousFunctionDecl
//    | Async? arrowFunctionParameters '=>' arrowFunctionBody                   # ArrowFunction
//    ;
//
*/
