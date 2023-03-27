grammar alf;

main: (assign NEWLINE | if_condition NEWLINE | print)*;
assign: VARIABLE_NAME EQUALS (VALUE | operation);
if_condition: IF operation COLON NEWLINE SPACE instructions NEWLINE else_condition;
instructions: print;
print: PRINT PARENTHESIS_L ARGUMENT PARENTHESIS_R;
else_condition: ELSE COLON NEWLINE SPACE instructions;
operation: VARIABLE_NAME SIGN VARIABLE_NAME;
VALUE: ([0-9]+);
PARENTHESIS_L: '(';
PARENTHESIS_R: ')';
SIGN: (' '[+-/*><]' ');
PRINT: 'print';
EQUALS: '=';
COLON: ':';
IF: 'if ';
ELSE: 'else';
SPACE: ' ';
VARIABLE_NAME: ('_'?[a-zA-Z0-9]+);
ARGUMENT: ('"'[ a-zA-Z0-9]+'"');
NEWLINE: '\n';

