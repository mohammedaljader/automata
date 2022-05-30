
grammar Example2;

start2		: statement* EOF;
statement	: loop | print | expr | ifStat | url;
loop		: WHILE expr DO statement;
print		: PRINT expr ( COMMA expr )*;
ifStat		: IF expr THEN statement ( ELSE statement )? FI;
url			: numberA DOT numberB DOT numberC DOT numberD;
expr		: expr PLUS expr	# plusExpr
			| expr AND expr		# andExpr
			| NUMBER			# number	
			| ID				# id
			| TEXT				# text
			;
numberA		: NUMBER;
numberB		: NUMBER;
numberC		: NUMBER;
numberD		: NUMBER;

NUMBER		: [0-9]+ ; 
PLUS		: '+';
AND			: 'and';
COMMA		: ',';
PRINT		: 'print';
WHILE		: 'while';
IF			: 'if';
THEN		: 'then';
ELSE		: 'else';
FI			: 'fi';
DO			: 'do';
DOT			: '.';
TEXT		: '"' ~('\r' | '\n' | '"')* '"';
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ; 
WS 			: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
