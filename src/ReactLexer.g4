lexer grammar ReactLexer;


JsxComment        : '{/*' .*? '*/}'           -> channel(HIDDEN);

MultiLineComment  : '/*' .*? '*/'             -> channel(HIDDEN);
SingleLineComment : '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);

OpenBracket                : '[';
CloseBracket               : ']';
OpenParen                  : '(';
CloseParen                 : ')';
OpenBrace                  : '{';
CloseBrace                 : '}';
SemiColon                  : ';';
Comma                      : ',';
Assign                     : '=';
QuestionMark               : '?';
QuestionMarkDot            : '?.';
Colon                      : ':';
Ellipsis                   : '...';
Dot                        : '.';
PlusPlus                   : '++';
MinusMinus                 : '--';
Plus                       : '+';
Minus                      : '-';
BitNot                     : '~';
Not                        : '!';
Multiply                   : '*';
Divide                     : '/';
Modulus                    : '%';
Power                      : '**';
NullCoalesce               : '??';
Hashtag                    : '#';
RightShiftArithmetic       : '>>';
LeftShiftArithmetic        : '<<';
RightShiftLogical          : '>>>';
LessThan                   : '<';
GreaterThan                : '>';
LessThanEquals             : '<=';
GreaterThanEquals          : '>=';
Equals_                    : '==';
NotEquals                  : '!=';
IdentityEquals             : '===';
IdentityNotEquals          : '!==';
BitAnd                     : '&';
BitXOr                     : '^';
BitOr                      : '|';
And                        : '&&';
Or                         : '||';
MultiplyAssign             : '*=';
DivideAssign               : '/=';
ModulusAssign              : '%=';
PlusAssign                 : '+=';
MinusAssign                : '-=';
LeftShiftArithmeticAssign  : '<<=';
RightShiftArithmeticAssign : '>>=';
RightShiftLogicalAssign    : '>>>=';
BitAndAssign               : '&=';
BitXorAssign               : '^=';
BitOrAssign                : '|=';
PowerAssign                : '**=';
NullishCoalescingAssign    : '??=';
Arrow                      : '=>';
Render: 'render';
/// Null Literals

NullLiteral: 'null';

/// Boolean Literals

BooleanLiteral: 'true' | 'false';

/// Numeric Literals

DecimalLiteral:
    DecimalIntegerLiteral '.' [0-9] [0-9_]* ExponentPart?
    | '.' [0-9] [0-9_]* ExponentPart?
    | DecimalIntegerLiteral ExponentPart?
;


/// Keywords
UseEffect  : 'useEffect';
UseState   : 'useState' ;
UseRef     : 'useRef' ;
Break      : 'break';
Do         : 'do';
Instanceof : 'instanceof';
Typeof     : 'typeof';
Case       : 'case';
Else       : 'else';
New        : 'new';
Var        : 'var';
Catch      : 'catch';
Finally    : 'finally';
Return     : 'return';
Void       : 'void';
Continue   : 'continue';
For        : 'for';
Switch     : 'switch';
While      : 'while';
Debugger   : 'debugger';
Function_  : 'function';
This       : 'this';
With       : 'with';
Default    : 'default';
If         : 'if';
Throw      : 'throw';
Delete     : 'delete';
In         : 'in';
Try        : 'try';
As         : 'as';
From       : 'from';
Of         : 'of';
Yield      : 'yield';
YieldStar  : 'yield*';
SingleQuote: '\'' ;
DoubleQuote: '"' ;
/// Future Reserved Words

Class   : 'class';
Enum    : 'enum';
Extends : 'extends';
Super   : 'super';
Const   : 'const';
Export  : 'export';
Import  : 'import';

Async : 'async';
Await : 'await';

/// The following tokens are also considered to be FutureReservedWords
/// when parsing strict mode

Implements   : 'implements' ;
Let          : 'let'        ;
Private      : 'private'    ;
Public       : 'public'     ;
Interface    : 'interface'  ;
Package      : 'package'    ;
Protected    : 'protected'  ;
Static       : 'static'     ;
MapFunction          : 'map'        ;

Identifier: [a-zA-Z_][a-zA-Z_0-9_.]*;
React_Component:'React.Component';



/// Identifier Names and Identifiers

//Identifier: IdentifierStart IdentifierPart*;
/// String Literals
StringLiteral:
    ('"' (~["\\\r\n] | '\\' EscapeSequence | LineContinuation)* '"' | '\'' SingleStringCharacter* '\'')
;

BackTick: '`'  -> pushMode(TEMPLATE);

WhiteSpaces: [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN);

LineTerminator: [\r\n\u2028\u2029] -> channel(HIDDEN);

/// Comments

HtmlComment         : '<!--' .*? '-->'      -> channel(HIDDEN);
CDataComment        : '<![CDATA[' .*? ']]>' -> channel(HIDDEN);

// UnexpectedCharacter : .                     -> channel(ERROR);

mode TEMPLATE;

BackTickInside                : '`'  -> type(BackTick), popMode;
TemplateStringStartExpression : '${' -> pushMode(DEFAULT_MODE);
TemplateStringAtom            : ~[`];

// Fragment rules

fragment DoubleStringCharacter: ;

fragment SingleStringCharacter: ~['\\\r\n] | '\\' EscapeSequence | LineContinuation;

fragment EscapeSequence:
    CharacterEscapeSequence
    | HexEscapeSequence
    | UnicodeEscapeSequence
    | ExtendedUnicodeEscapeSequence
;

fragment CharacterEscapeSequence: SingleEscapeCharacter | NonEscapeCharacter;

fragment HexEscapeSequence: 'x' HexDigit HexDigit;

fragment UnicodeEscapeSequence:
    'u' HexDigit HexDigit HexDigit HexDigit
    | 'u' '{' HexDigit HexDigit+ '}'
;

fragment ExtendedUnicodeEscapeSequence: 'u' '{' HexDigit+ '}';

fragment SingleEscapeCharacter: ['"\\bfnrtv];

fragment NonEscapeCharacter: ~['"\\bfnrtv0-9xu\r\n];

fragment EscapeCharacter: SingleEscapeCharacter | [0-9] | [xu];

fragment LineContinuation: '\\' [\r\n\u2028\u2029]+;

fragment HexDigit: [_0-9a-fA-F];

fragment DecimalIntegerLiteral: '0' | [1-9] [0-9_]*;

fragment ExponentPart: [eE] [+-]? [0-9_]+;

fragment IdentifierPart: IdentifierStart | [\p{Mn}] | [\p{Nd}] | [\p{Pc}] | '\u200C' | '\u200D';

fragment IdentifierStart: [\p{L}] | [$_] | '\\' UnicodeEscapeSequence;

fragment RegularExpressionFirstChar:
    ~[*\r\n\u2028\u2029\\/[]
    | RegularExpressionBackslashSequence
    | '[' RegularExpressionClassChar* ']'
;

fragment RegularExpressionChar:
    ~[\r\n\u2028\u2029\\/[]
    | RegularExpressionBackslashSequence
    | '[' RegularExpressionClassChar* ']'
;

fragment RegularExpressionClassChar: ~[\r\n\u2028\u2029\]\\] | RegularExpressionBackslashSequence;

fragment RegularExpressionBackslashSequence: '\\' ~[\r\n\u2028\u2029];
mode JSX_OPENING_ELEMENT;

JsxOpeningElementBegin  : '<' -> pushMode(JSX_OPENING_ELEMENT);
JsxOpeningElementEnd : '>' -> popMode, pushMode(JSX_CHILDREN);
JsxOpeningElementSlashEnd: '/>' -> popMode;
JsxAssign : '=';
JsxOpeningElementOpenBrace: '{'  -> pushMode(DEFAULT_MODE);
JsxOpeningElementId: TagNameStartChar TagNameChar*;
JsxOpeningElementWhiteSpaces: [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN);
JsxOpeningElementLineTerminator: [\r\n\u2028\u2029] -> channel(HIDDEN);
JsxOpeningElementMultiLineComment  : '/*' .*? '*/'             -> channel(HIDDEN);
JsxOpeningElementSingleLineComment : '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);
JsxAttributeValue: DoubleQuoteString | SingleQuoteString | AttributeChar | HexChars | DecChars;
fragment DoubleQuoteString : '"' ~["]* '"';
fragment SingleQuoteString : '\'' ~[']* '\'';

fragment AttributeChar:
    '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
;
fragment AttributeChars: AttributeChar+ ' '?;

fragment HexChars: '#' [0-9a-fA-F]+;

fragment DecChars: [0-9]+ '%'?;

// Lexer mode for JSX child elements, e.g.
// <DropDownMenu>
//     <child elements>
// </DropDownMenu>
mode JSX_CHILDREN;

HtmlChardata
    : ~('<' | '{')+
    ;
JsxElementBegin  : '<'  -> pushMode(JSX_OPENING_ELEMENT);

JsxChildrenOpeningElementBegin  : '<' -> pushMode(JSX_OPENING_ELEMENT);
JsxChildrenClosingElementSlashBegin: '</' -> popMode, pushMode(JSX_CLOSING_ELEMENT);
JsxChildrenOpenBrace            : '{' -> pushMode(DEFAULT_MODE);

// Lexer mode for JSX closing elements, e.g. </DropDownMenu>
mode JSX_CLOSING_ELEMENT;

JsxClosingElementEnd: '>' -> popMode;
JsxClosingElementId: TagNameStartChar TagNameChar*;
JsxClosingElementLineTerminator: [\r\n\u2028\u2029] -> channel(HIDDEN);
JsxClosingElementWhiteSpaces: [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN);

fragment TagNameStartChar:
    [:a-zA-Z]
    | '\u2070' ..'\u218F'
    | '\u2C00' ..'\u2FEF'
    | '\u3001' ..'\uD7FF'
    | '\uF900' ..'\uFDCF'
    | '\uFDF0' ..'\uFFFD'
;
fragment Digit: [0-9];
fragment TagNameChar:
    TagNameStartChar
    | '-'
    | '_'
    | '.'
    | Digit
    | '\u00B7'
    | '\u0300' ..'\u036F'
    | '\u203F' ..'\u2040'
;