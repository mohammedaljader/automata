grammar Example2;

// rules
start2      : statement* EOF;


statement    : expression
             | variables
             | for_statement
             | do_while_statement
             | while_statement
             | if_statement
             | print_statement
             | repeat_until_statement
             | switch_statement
             | BREAK
             | CONTINUE
             | records
             | integer
             | char
             ;



for_statement: FOR for_block code_block
;
for_block: OPAR variables SEMICOLON expression SEMICOLON (expression | variables) CPAR
;
code_block: OPEN_CURLY_BRACKET statement*  CLOSE_CURLY_BRACKET
          | statement
          ;

while_statement: WHILE condition_block
;

repeat_until_statement : REPEAT code_block UNTIL condition_block;

do_while_statement : DO code_block WHILE condition_block
;

if_statement: IF condition_block (ELSE code_block)?
;

switch_statement : SWITCH condition_block OPEN_CURLY_BRACKET case_expression CLOSE_CURLY_BRACKET;

case_expression : (CASE expression COLON expression* BREAK)* default_expression;

default_expression :  DEFAULT COLON expression;


condition_block: OPAR expression CPAR (code_block)?
               ;

print_statement:  PRINT expression* (COMMA expression)*
;

expression     : expression ADD expression #adding
               | expression SUB expression #substracting
               | expression MUL expression #multiplication
               | expression DIV expression #division
               | expression FACT #factoriel
               | expression POW expression #power
               | expression AND expression #andExpression
               | expression OR expression #orExpression
               | NOT expression #notExpression
               | expression (GREATER_OR_EQUAL |  SMALLER_OR_EQUAL |
                            GREATHER_THAN | SMALLER_THAN | IS_EQUAL
                            NOT_EQUAL) expression #comparisons
               | expression INCREMENT #incrementExpr
               | expression DECREMENT #decrementExpr
               | expression EQUAL_DECREMENT expression #equalIncrementExpr
               | expression EQUAL_INCREMENT expression #equalDecrementExpr
               | OPAR expression+ CPAR #parenthesis
               | ID #variable
               | INT #integerValue
               | STRING #stringValue
               | BOOL #booleanValue
               | expression QUESTION_MARK expression COLON expression #conditionVariable
               ;

variables : (ID (COMMA ID)*) EQUAL (expression (COMMA expression)*) #assignVariables;

integer: INTEGER ID;
char: CHAR ID;

recordsTypes:  integer SEMICOLON| char SEMICOLON| records SEMICOLON ;

records: RECORD OPEN_SQUARE_BRACKET recordsTypes* CLOSE_SQUARE_BRACKET ID #recordAssign;


// tokens
EQUAL: '=';
MUL:    '*';
DIV:    '/';
ADD:    '+';
SUB:    '-';
POW:    '^';
FACT:   '!';
DOT :   '.';
COMMA: ',';
SEMICOLON: ';';
COLON: ':';

OPAR: '(';
CPAR: ')';

OPEN_CURLY_BRACKET : '{';
CLOSE_CURLY_BRACKET : '}';

OPEN_SQUARE_BRACKET : '[';
CLOSE_SQUARE_BRACKET : ']';


QUESTION_MARK : '?';

AND : 'and';
OR : 'or';
NOT : 'not';

INTEGER: 'integer';
CHAR: 'char';
RECORD: 'record';

EQUAL_INCREMENT : '+=';
EQUAL_DECREMENT : '-=';
INCREMENT : '++';
DECREMENT : '--';

GREATER_OR_EQUAL : '>=';
SMALLER_OR_EQUAL : '<=';
GREATHER_THAN : '>';
SMALLER_THAN : '<';
IS_EQUAL : '==';
NOT_EQUAL : '!=';

DO: 'do';
WHILE : 'while';
FOR : 'for';
REPEAT: 'repeat';
UNTIL: 'until';
BREAK: 'break';
CONTINUE : 'continue';

PRINT: 'print';

IF : 'if';
ELSE : 'else';
SWITCH: 'switch';
DEFAULT: 'default';
CASE: 'case';



INT    : [0-9]+ ;
STRING : '"' ~('\r' | '\n' | '"')* '"';
BOOL   : 'true' | 'false';
ID     : [_A-Za-z][A-Za-z_!0-9.]* ;
COMMENT : '//' .+? ('\n'|EOF) -> skip;
WS     : [ \t\r\n]+ -> skip ;