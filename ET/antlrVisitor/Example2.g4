grammar Example2;

start2		: statement* EOF;

statement:   expression
         |   print_func
         |   while_statement
         |   if_statement
         |   function_definition
         |   function_call
         |   return_statement
         |   array
         |   for_statement
         |   variable
         ;

function_definition
        :   DEF ID PARANL arguments PARANR code_block
        ;

function_call
        :   ID PARANL arguments PARANR
        ;

arguments
        :   (expression (COMMA expression)*)?
        |   ((IntType| BoolType | StringType) ID (COMMA (IntType| BoolType | StringType) ID)*)?
        ;

return_statement
        :   RETURN expression
        ;

array:
      IntType ARRAYPL ARRAYPR ID IS_EQUAL ARRAYPL ( INT ( COMMA INT )* )? ARRAYPR             #declareIntArray
      | updateArray mathExpression                                                            #assignIntArray
      | StringType ARRAYPL ARRAYPR ID IS_EQUAL ARRAYPL ( STRING ( COMMA STRING )* )? ARRAYPR  #declareStringArray
      | updateArray STRING                                                                    #assignStringArray
      | BoolType ARRAYPL ARRAYPR ID IS_EQUAL ARRAYPL ( BOOLEAN ( COMMA BOOLEAN )* )? ARRAYPR  #declareBooleanArray
      | updateArray BOOLEAN                                                                   #assignBooleanArray
      ;

updateArray: ID ARRAYPL INT ARRAYPR IS_EQUAL;

for_statement: FOR PARANL int_variable SEMICOLON expression SEMICOLON int_variable PARANR code_block ;

print_func:   Print PARANL op=(INT| BOOLEAN |ID |STRING) PARANR        #printVar
          |   Print PARANL mathExpression PARANR                       #printExpr
          |   Print PARANL STRING COMMA mathExpression PARANR          #printExprWithString
          ;

variable : int_variable
         | bool_variable
         | string_variable
         ;


if_statement
        :   IF condition_block (ELSE code_block)?
        ;

while_statement: WHILE condition_block;

condition_block: PARANL expression PARANR code_block;

code_block:   OPEN_CURLY_BRACKET statement* CLOSE_CURLY_BRACKET
          |   statement
          ;

string_variable : StringType ID (IS_EQUAL STRING)? # stringAssign
                | ID IS_EQUAL STRING  # stringAssignValue
                ;

bool_variable : BoolType ID (IS_EQUAL BOOLEAN)?  # boolAssign
              | ID IS_EQUAL BOOLEAN  # boolAssignValue
              ;

int_variable :  IntType ID (IS_EQUAL mathExpression)?        # intAssign
             |  ID IS_EQUAL mathExpression                   # intAssignValue
             |  ID (ADD_INCREMENT| SUB_INCREMENT | INCREMENT | DECREMENT) mathExpression?  # incrementAndDecrementInt
             ;

expression:
           function_call  # FunctionCall
          | mathExpression #MathExp
          |   BOOLEAN        #ValueBoolean
          |   STRING         #ValueString
          |   expression (GREATER_OR_EQUAL | SMALLER_OR_EQUAL | GREATHER_THAN | SMALLER_THAN | EQUAL | NOT_EQUAL) expression	# ComparisonExpression
          |   expression AND expression									# AndExpression
          |   expression OR expression									# OrExpression
          ;

mathExpression:  mathExpression op=MUL mathExpression #  Mul
             |   mathExpression op=DIV mathExpression #  Div
             |   mathExpression op=ADD mathExpression #  Add
             |   mathExpression op=SUB mathExpression #  Sub
             |   mathExpression op=POW mathExpression #  Pow
             |   mathExpression op=FACT  #  Fact
             |   PARANL mathExpression PARANR  # parens
             |   INT #ValueNumber
             |   ID    #ValueVariable
             |   function_call  # FunctionCallInt
             ;


// tokens
IS_EQUAL: '=';
MUL:    '*';
DIV:    '/';
ADD:    '+';
SUB:    '-';
POW:    '^';
FACT:   '!';
PARANL: '(';
PARANR: ')';
DOT : '.';
ARRAYPL:  '[';
ARRAYPR:  ']';

ADD_INCREMENT : '+=';
SUB_INCREMENT : '-=';
INCREMENT : '++';
DECREMENT : '--';

OPEN_CURLY_BRACKET : '{';
CLOSE_CURLY_BRACKET : '}';

AND : 'and';
OR : 'or';

GREATER_OR_EQUAL : '>=';
SMALLER_OR_EQUAL : '<=';
GREATHER_THAN : '>';
SMALLER_THAN : '<';
EQUAL : '==';
NOT_EQUAL : '!=';


IntType: 'int';
BoolType: 'bool';
StringType: 'string';

WHILE : 'while';
COMMA: ',';
SEMICOLON: ';';
DEF:  'def';

IF : 'if';
ELSE : 'else';
FOR : 'for';

RETURN: 'return';
Print: 'print';

INT     : SUB?[0-9]+(DOT[0-9]+)? ;
BOOLEAN: 'True'|'False';
ID: [_A-Za-z][A-Za-z_!0-9.]* ;
STRING : '"' ~('\r' | '\n' | '"')* '"';

COMMENT : '//' .+? ('\n'|EOF) -> skip;
WS  : [ \t\r\n]+ -> skip;