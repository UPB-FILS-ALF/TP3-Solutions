grammar alf;

main: ((TEXT | NUMBER) NEWLINE?)*;
TEXT: ([a-zA-Z' ]+);
NUMBER: ([0-9]+);
NEWLINE: '\n';


