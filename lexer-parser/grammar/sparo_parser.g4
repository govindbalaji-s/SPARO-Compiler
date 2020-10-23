grammar sparo_parser;

import sparo_lexer;

program:
class_definition_list? ;

class_definition_list:
  class_definition
| class_definition_list class_definition;

class_definition:
  class_head LBRACE member_list? RBRACE SEMICOLON;

class_head:
  CLASS TYPEID base_clause?;

base_clause:
  EXTENDS type_specifier;

member_list:
  member
| member_list member;

member:
  declaration
| constructor
| destructor
| method_definition;

destructor:
  DESTRUCT LPAREN RPAREN compound_statement;

constructor:
  CONSTRUCT LPAREN parameter_declaration_list? RPAREN AFTER LPAREN expression_list? RPAREN compound_statement;

method_definition:
  declaration_specifier OBJECTID LPAREN parameter_declaration_list RPAREN compound_statement;

parameter_declaration_list:
  parameter_declaration
| parameter_declaration_list COMMA parameter_declaration;

parameter_declaration:
  declaration_specifier OBJECTID;

statement :
  declaration SEMICOLON
| expression_statement SEMICOLON
| compound_statement
| selection_statement
| iteration_statement
| jump_statement SEMICOLON;

declaration :
  declaration_specifier init_declarator SEMICOLON;

declaration_specifier:
  pointer_type? type_specifier SEMICOLON;

type_specifier:
  INT
| FLOAT
| BOOL
| STRING
| array_specifier
| tensor_specifier 
| TYPEID;

array_specifier:
  ARRAY LT type_specifier COMMA INT_CONST GT;

tensor_specifier:
  TENSOR LT integer_constant_list GT;

integer_constant_list:
  INT_CONST
| integer_constant_list COMMA INT_CONST;

pointer_type: 
  UNIQUE
| SHARED
| WEAK;

init_declarator:
  OBJECTID
| OBJECTID EQUALS expression;

expression_statement:
  expression?;

expression_list:
  expression
| expression_list COMMA expression;

expression:
  assignment_expression;

assignment_expression:
  logical_OR_expression
| unary_expression EQUALS assignment_expression;

logical_OR_expression:
  logical_AND_expression
| logical_OR_expression OR logical_AND_expression;

logical_AND_expression:
  equality_expression
| logical_AND_expression AND equality_expression;

equality_expression:
  relational_expression
| equality_expression DOUBLE_EQUALS relational_expression;

relational_expression:
  additive_expression
| relational_expression LT additive_expression
| relational_expression GT additive_expression
| relational_expression LTE additive_expression
| relational_expression GTE additive_expression;


additive_expression:
  multiplicative_expression
| additive_expression PLUS multiplicative_expression
| additive_expression MINUS multiplicative_expression;

multiplicative_expression:
  unary_expression
| multiplicative_expression STAR unary_expression
| multiplicative_expression AT unary_expression
| multiplicative_expression SLASH unary_expression
| multiplicative_expression PERCENT unary_expression;


unary_expression:
  postfix_expression
| unary_operator unary_expression;

unary_operator:
  MINUS
| NOT
| new_expression;

new_expression:
  new_keyword type_specifier LPAREN expression_list? RPAREN;

new_keyword:
  NEW_UNIQUE
| NEW_SHARED;

postfix_expression:
  primary_expression
| postfix_expression LSQUARE expression_list RSQUARE
| postfix_expression LPAREN expression_list? RPAREN
| postfix_expression DOT OBJECTID;

primary_expression:
  THIS
| OBJECTID
| constant
| LPAREN expression RPAREN;

constant:
  INT_CONST
| STRING_CONST
| FLOAT_CONST
| BOOL_CONST
| NULLPTR;


compound_statement:
  LBRACE statement_list? RBRACE;

statement_list:
  statement
| statement_list statement;

selection_statement:
  IF LPAREN expression RPAREN compound_statement
| IF LPAREN expression RPAREN compound_statement ELSE compound_statement;

iteration_statement:
  WHILE LPAREN expression RPAREN compound_statement
| FOR LPAREN expression? SEMICOLON expression SEMICOLON expression? RPAREN compound_statement;

jump_statement:
  BREAK
| RETURN expression?;

