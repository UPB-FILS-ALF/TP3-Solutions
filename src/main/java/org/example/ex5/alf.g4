grammar alf;

main: HELLO EXCLAMATION_SIGN message;
message: TEXT NUMBER ' a ' NUMBER DOT;
HELLO: 'Bonjour';
EXCLAMATION_SIGN: '!';
DOT: '.';
TEXT: ([a-zA-Z' ]+);
NUMBER: ([0-9]+);


