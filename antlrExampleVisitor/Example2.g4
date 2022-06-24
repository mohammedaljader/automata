grammar Example2;

// rules
start2      : statement* EOF;


statement    : expression
             | assign_variables
             | for_statement
             | print_statement
             | if_statement
             | while_statement
             | repeat_until_statement
             | do_while_statement
             | records
             | integer
             | char
             ;

print_statement:  PRINT expression (COMMA expression)*;

repeat_until_statement : REPEAT code_block UNTIL OPAR expression CPAR;

do_while_statement : DO code_block WHILE OPAR expression CPAR;

while_statement: WHILE OPAR expression CPAR code_block ;

for_statement: FOR for_block code_block;

for_block: OPAR assign_variables SEMICOLON expression SEMICOLON expression CPAR;

if_statement: IF OPAR expression CPAR code_block (ELSE code_block)?;

code_block: OPEN_CURLY_BRACKET statement*  CLOSE_CURLY_BRACKET
          | statement
          ;


expression     : expression ADD expression      #Add
               | expression SUB expression      #Sub
               | expression MUL expression      #Mul
               | expression DIV expression      #Div
               | expression POW expression      #Pow
               | expression AND expression      #AndExpr
               | expression OR expression       #OrExpr
               | NOT expression                 #NotExpr
               | ID INCREMENT #IncrementExpr
               | ID DECREMENT #DecrementExpr
               | expression EQUAL_INCREMENT expression #EqualIncrementExpr
               | expression EQUAL_DECREMENT expression #EqualDecrementExpr
               | expression (GREATER_OR_EQUAL
                            |SMALLER_OR_EQUAL
                            |GREATHER_THAN
                            |SMALLER_THAN
                            |EQUAL
                            NOT_EQUAL) expression #Comparisons
               | OPAR expression CPAR             #Parentheses
               | ID                               #VariableValue
               | INT                              #IntegerValue
               | STRING                           #StringValue
               | BOOL                             #BooleanValue
               | expression QUESTION_MARK expression COLON expression #ConditionVariable
               ;

assign_variables : (ID (COMMA ID)*) IS_EQUAL (expression (COMMA expression)*);

integer: INTEGER ID;

char: CHAR ID;

records: RECORD OPEN_SQUARE_BRACKET recordsBlock* CLOSE_SQUARE_BRACKET ID;

recordsBlock:  (integer | char | records) SEMICOLON;


// tokens
DO: 'do';
WHILE : 'while';
REPEAT: 'repeat';
UNTIL: 'until';
IF : 'if';
ELSE : 'else';
IS_EQUAL: '=';
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
FOR: 'for';
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
GREATER_OR_EQUAL : '>=';
SMALLER_OR_EQUAL : '<=';
GREATHER_THAN : '>';
SMALLER_THAN : '<';
EQUAL : '==';
NOT_EQUAL : '!=';
PRINT: 'print';
INT    : [0-9]+ ;
STRING : '"' ~('\r' | '\n' | '"')* '"';
BOOL   : 'true' | 'false';
ID     : [_A-Za-z][A-Za-z_!0-9.]* ;
COMMENT : '//' .+? ('\n'|EOF) -> skip;
WS     : [ \t\r\n]+ -> skip ;
EQUAL_INCREMENT : '+=';
EQUAL_DECREMENT : '-=';
INCREMENT : '++';
DECREMENT : '--';

