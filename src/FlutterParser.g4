parser grammar FlutterParser;

options { tokenVocab=FlutterLexer; }

program :function|class EOF;

function:function_header function_body ;
function_header: function_access UNDERSCORE? IDENTIFIER OP function_parameters CP;
structure:(variable | decl| init| function | class | list |
variable_call| list_assignement| for_loop | for_each | while | do_while | if | try_catch
|function_call| list_value_call) | return ;
function_body: one_return | OBC structure* CBC;
function_call: UNDERSCORE? IDENTIFIER OP (argument* | variable_call* | expr* | exp*) CP SC;
function_parameters:(DATA_TYPE QM? IDENTIFIER)? (C (DATA_TYPE QM? IDENTIFIER))* ;
return: RETURN_ (argument | variable_call | function_call| expr | exp )? SC;
one_return: EG (argument | variable_call | function_call | expr | exp ) SC;
argument:VALUES | NUMBERS | BOOLEAN;
variable_call:IDENTIFIER;
variable: variable_access? UNDERSCORE? IDENTIFIER EQ (argument | variable_call | new_list | OB (list_values) CB | expr   ) SC;
decl: LATE? (DATA_TYPE QM? IDENTIFIER SC);
init: IDENTIFIER EQ (VALUES | BOOLEAN | NUMBERS | IDENTIFIER | expr | exp) SC;
variable_access: ((STATIC_? C_AND_F? DATA_TYPE QM?) | C_AND_F);
function_access: ((STATIC_? (VOID | DATA_TYPE QM?)?));
class:class_header extends_class? class_body;
class_header:class_type UNDERSCORE? IDENTIFIER  ;
class_body:OBC (structure*) CBC;
class_type:ABSTRACT_? CLASS_;
extends_class: ((EXTENDS_ | IMPLEMENTS_) IDENTIFIER);
class_instance :  NEW_? IDENTIFIER OP argument* CP;
list: list_decl | LIST IDENTIFIER (LT DATA_TYPE GT)? EQ OB (list_values) CB SC;
list_decl: LATE? LIST IDENTIFIER SC;
new_list :  NEW_? LIST OP CP;
list_values:(argument)? (C (argument))* ;
list_assignement: IDENTIFIER OB INT CB EQ (INT | VALUES | BOOLEAN | NUMBERS | expr | exp) SC;
list_value_call: IDENTIFIER OB INT CB SC;



expr :
     expr ST expr
     | expr PL expr
     | expr MINUS expr
     | IDENTIFIER
     | NUMBERS
     | INT;

  exp :
      exp PLPL
     | exp MM
     | IDENTIFIER
     | NUMBERS
     | INT;
comparison_operations :
       expr EG expr
     | expr LTE expr
     | expr GT expr
     | expr LT expr
     | expr EE expr
     | expr NE expr
     | IDENTIFIER
     | NUMBERS
     | INT;
for_loop:for_header for_body ;
for_header:  FOR_ OP (for_var_decl | for_var_init) SC comparison_operations  SC for_var CP  ;
for_body: OBC  for_structure * CBC;
for_var_decl: DATA_TYPE IDENTIFIER EQ (NUMBERS | variable_call | expr | exp );
for_var_init:  IDENTIFIER (EQ (NUMBERS | variable_call | expr | exp ) );
for_var:  IDENTIFIER (EQ (NUMBERS | variable_call | expr ) )| exp;
for_structure:(variable | decl| init| for_loop | for_each |while | do_while
| if | try_catch |function | list | variable_call| list_assignement
 |function_call| list_value_call | BREAK_ | CONTINUE_) | return ;

for_each:for_each_header for_body;
for_each_header: FOR_ OP DATA_TYPE IDENTIFIER IN_ IDENTIFIER CP;

while: while_header for_body;
while_header:WHILE_ OP (comparison_operations | BOOLEAN) CP;

do_while: DO_ for_body while_header SC;
if:if_header for_body else_if* else*;
if_header: IF_ OP (comparison_operations | BOOLEAN) CP ;
else_if: ELSE_ if_header for_body;
else: ELSE_ for_body;

try_catch: try catche+ finaly?;

try:TRY_ for_body;
catche: CATCH_ OP IDENTIFIER CP for_body;
finaly: FINALLY_ for_body;


