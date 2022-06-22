grammar Example2;

// rules
start2      : statement* EOF;


statement    : expression
             | assign_variables
             | print_statement
             | records
             | integer
             | char
             ;

print_statement:  PRINT expression* (COMMA expression)*;

expression     : expression ADD expression      #Add
               | expression SUB expression      #Sub
               | expression MUL expression      #Mul
               | expression DIV expression      #Div
               | expression POW expression      #Pow
               | expression AND expression      #AndExpr
               | expression OR expression       #OrExpr
               | NOT expression                 #NotExpr
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

recordsTypes:  integer SEMICOLON| char SEMICOLON| records SEMICOLON;

records: RECORD OPEN_SQUARE_BRACKET recordsTypes* CLOSE_SQUARE_BRACKET ID;


// tokens
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