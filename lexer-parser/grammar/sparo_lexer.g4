grammar sparo_lexer;

// List of tokens
tokens{
	ERROR,
	TYPEID,
	OBJECTID,
	BOOL_CONST,
	INT_CONST,
	FLOAT_CONST,
	STR_CONST,
	INT,
	FLOAT,
	STRING,
	BOOL,
	ARRAY,
	TENSOR,
	LPAREN,
	RPAREN,
	COLON,
	AT,
	SEMICOLON,
	COMMA,
	PLUS,
	MINUS,
	STAR,
	SLASH,
	PERCENT,
	TILDE,
	LT,
	GT,
	EQUALS,
	LBRACE,
	RBRACE,
	LSQUARE,
	RSQUARE,
	DOT,
	LTE,
	GTE,
	DOUBLE_EQUALS,
	CLASS,
	ELSE,
	IF,
	EXTENDS,
	AFTER,
	UNIQUE,
	SHARED,
	WEAK,
	CONSTRUCT,
	DESTRUCT,
	THIS,
	NULLPTR,
	WHILE,
	FOR,
	BREAK,
	NEW,
	AND,
	OR,
	NOT,
	NEW_UNIQUE,
	NEW_SHARED,
	VOID,
	ISVOID,
	RETURN
}

@members {

	// Function to report errors.
	public void reportError(String errorString){
		setText(errorString);
		setType(ERROR);
	}

	// Function to process strings
	public void processString() {
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();

		//write your code to test strings here

		if (text.charAt(0) == '\n')
		{
			reportError("Unterminated string constant");
			return;
		}

		String temp = "";
		for(int i = 0; i < text.length(); i++)
		{
			char c0 = text.charAt(i);
			if (c0 == '\\' && i < text.length() - 1)
			{
				char c1 = text.charAt(i+1);
				if (c1 == 'b')
					temp += '\b';
				else if (c1 == 't')
					temp += "\t";
				else if (c1 == 'f')
					temp += '\f';
				else if (c1 == 'n')
					temp += '\n';
				else if (c1 == '"')
					temp += '\"';
				else if (c1 == '\\')
					temp += '\\';
				else
					temp += c1;
				i++;
			}
			else
				temp += c0;
		}

		if (temp.length() > 1024)
		{
			reportError("String constant too long");
			return;
		}
		else
		{
			setText(temp);
			return;
		}
	}


	public void unk_token() {
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();

		reportError(text);
	}
}


/*
	LEXER RULES FOR CONSTANTS
*/

BOOL_CONST  	: 'true' | 'false';

INT_CONST	: ('-'?) [0-9]+;

FLOAT_CONST	: ('-'?) [0-9]+ '.' [0-9]*;

STR_CONST	: '"' (~[\nEOF"]|('\\''\n'))* '"' { processString(); };


/*
	LEXER RULES FOR STRING ERRORS
*/

STR_NULL	: '"' (~[\u0000]* ('\\u0000'))+ ~["\nEOF]* ["\nEOF] { reportError("String contains NULL character"); };
STR_ERR_UNT 	: '"' (~[(EOF)"])* '"' { reportError("Unterminated string constant"); };
STR_ERR_EOF	: '"' (~[(EOF)"])* (EOF) { reportError("EOF in string constant"); };


/*
	LEXER RULES FOR CHARACTERS
*/

LPAREN		: '(';
RPAREN		: ')';
COLON		: ':';
AT		: '@';
PERCENT		: '%';
SEMICOLON   	: ';';
COMMA		: ',';
PLUS		: '+';
MINUS		: '-';
STAR        	: '*';
SLASH		: '/';
TILDE		: '~';
LT          	: '<';
GT		: '>';
EQUALS		: '=';
LBRACE		: '{';
RBRACE		: '}';
LSQUARE		: '[';
RSQUARE		: ']';
DOT		: '.';
LTE          	: '<=';
GTE		: '>=';
DOUBLE_EQUALS	: '==';


/*
	LEXER RULES FOR KEYWORDS
*/

CLASS			: 'class';
ELSE			: 'else';
IF				: 'if';
EXTENDS		: 'extends';
AFTER		: 'after';
UNIQUE		: 'unique';
SHARED		: 'shared';
WEAK		: 'weak';
CONSTRUCT	: 'construct';
DESTRUCT	: 'destruct';
THIS		: 'this';
NULLPTR		: 'nullptr';
WHILE		: 'while';
FOR		: 'for';
BREAK		: 'break';
NEW		: 'new';
AND		: 'and';
OR		: 'or';
NOT		: 'not';
NEW_UNIQUE	: 'new_unique';
NEW_SHARED	: 'new_shared';
VOID		: 'void';
ISVOID		: 'isvoid';
RETURN		: 'return';


/*
	LEXER RULES FOR IDENTIFIERS
*/
INT		: 'Int';
FLOAT		: 'Float';
BOOL		: 'Bool';
STRING		: 'String';
ARRAY		: 'Array';
TENSOR		: 'Tensor';

OBJECTID	: [a-z][a-zA-Z0-9_]*;
TYPEID		: [A-Z][a-zA-Z0-9_]*;

WS 		: [ \t\r\n]+ -> skip;


/*
	LEXER RULES FOR COMMENTS
*/

SINGLE_COMMENT	: '##' .*? ('\n'|EOF) -> skip;

UNMATCH_COM	: '*#' EOF? { reportError("Unmatched *#"); };
EOF_COM		: '#*' (~['*#'|EOF])* (EOF) { reportError("EOF in comment"): };

MULTI_COMMENT	: '#*' (~['*#'|EOF])* '*#';


/*
	LEXER RULES FOR UNKNOWN CHARACTERS
*/

UNKNOWN 	: . { unk_token(); };
