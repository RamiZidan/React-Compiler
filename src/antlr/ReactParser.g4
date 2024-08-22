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
    varModifier Identifier (Assign variable)? eos
    ;
variable: // done 1 ,
      array
    | object
    | number
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
equation:
     equation operation equation
    | number
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
    ;      // <jsx/> Or {expr}
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
