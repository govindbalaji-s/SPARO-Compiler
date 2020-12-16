lexer grammar SparoLexer;

// List of tokens
tokens{
  ERROR,
  TYPEID,
  OBJECTID,
  BOOL_CONST,
  INT_CONST,
  FLOAT_CONST,
  STRING_CONST,
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
        else
          temp += c1;
        i++;
      }
      else
        temp += c0;
    }

    setText(temp);
    return;
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

BOOL_CONST    : 'true' | 'false';

INT_CONST     : ('-'?) [0-9]+;

FLOAT_CONST   : ('-'?) [0-9]+ '.' [0-9]+;

fragment 
  STR_VALID   : ('\\'~'\u0000' | ~["\n\u0000\\])*;
fragment
  NULLSTR     : '\u0000' | '\\\u0000';
STRING_CONST  : '"' STR_VALID '"' { processString(); };


/*
LEXER RULES FOR STRING ERRORS
*/
STR_ERR       : '"' STR_VALID '\n'
                {reportError("Unterminated string constant");}

              | '"' STR_VALID '\u0000' (STR_VALID NULLSTR)* STR_VALID (["\n] | EOF)
                {reportError("String contains null character.");}
              
              | '"' STR_VALID '\\\u0000' (STR_VALID NULLSTR)* STR_VALID (["\n] | EOF) 
                {reportError("String contains escaped null character.");}

              | '"' STR_VALID EOF
                {reportError("EOF in string constant");}

              | '"' STR_VALID '\\' EOF
                {reportError("backslash at end of file");};


/*
LEXER RULES FOR CHARACTERS
*/

LPAREN        : '(';
RPAREN        : ')';
COLON         : ':';
AT            : '@';
PERCENT       : '%';
SEMICOLON     : ';';
COMMA         : ',';
PLUS          : '+';
MINUS         : '-';
STAR          : '*';
SLASH         : '/';
LT            : '<';
GT            : '>';
EQUALS        : '=';
LBRACE        : '{';
RBRACE        : '}';
LSQUARE       : '[';
RSQUARE       : ']';
DOT           : '.';
LTE           : '<=';
GTE           : '>=';
DOUBLE_EQUALS : '==';


/*
	LEXER RULES FOR KEYWORDS
*/

CLASS         : 'class';
ELSE          : 'else';
IF            : 'if';
EXTENDS       : 'extends';
AFTER         : 'after';
UNIQUE        : 'unique';
SHARED        : 'shared';
WEAK          : 'weak';
CONSTRUCT     : 'construct';
DESTRUCT      : 'destruct';
THIS          : 'this';
NULLPTR       : 'nullptr';
WHILE         : 'while';
FOR           : 'for';
BREAK         : 'break';
NEW           : 'new';
AND           : 'and';
OR            : 'or';
NOT           : 'not';
NEW_UNIQUE    : 'new_unique';
NEW_SHARED    : 'new_shared';
VOID          : 'void';
RETURN        : 'return';


/*
	LEXER RULES FOR IDENTIFIERS
*/
INT           : 'Int';
FLOAT         : 'Float';
BOOL          : 'Bool';
STRING        : 'String';
ARRAY         : 'Array';
TENSOR        : 'Tensor';

OBJECTID      : [a-z][a-zA-Z0-9_]*;
TYPEID        : [A-Z][a-zA-Z0-9_]*;

WS            : [ \t\r\n\f\u000b]+ -> skip;


/*
	LEXER RULES FOR COMMENTS
*/

SINGLE_COMMENT: '##' .*? ('\n'|EOF) -> skip;
MULTI_COMMENT : '#*' .*? '*#' -> skip;

UNMATCH_COM   : '*#' {reportError("Unmatched *#"); };
EOF_COM       : '#*' (~'*'|'*'~'#')* EOF {reportError("EOF in comments"); };
//EOF_COM       : '#*' .*? EOF { reportError("EOF in comment"); };

/*
	LEXER RULES FOR UNKNOWN CHARACTERS
*/

UNKNOWN       : . { unk_token(); };
