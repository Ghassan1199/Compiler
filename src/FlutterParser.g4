parser grammar FlutterParser;

options { tokenVocab=FlutterLexer; }

program :function|class;

function:function_header function_body ;
function_header: function_access UNDERSCORE? IDENTIFIER OP function_parameters CP;
structure:(variable | decl| init| function | class) return* ;
function_body: OBC structure* CBC;
function_call: UNDERSCORE? IDENTIFIER OP (argument* | variable_call*) CP;
function_parameters:(DATA_TYPE QM? IDENTIFIER)? (C (DATA_TYPE QM? IDENTIFIER))* ;
return: RETURN_ (argument | variable_call | function_call)? SC;
argument:VALUES;
variable_call:IDENTIFIER;
variable: variable_access UNDERSCORE? IDENTIFIER EQ (argument | variable_call) SC;
decl: (DATA_TYPE QM? IDENTIFIER SC);
init: IDENTIFIER EQ (VALUES | IDENTIFIER) SC;
variable_access: ((STATIC_? C_AND_F? DATA_TYPE QM?) | C_AND_F);
function_access: ((STATIC_? (VOID | DATA_TYPE QM?)?));
class:class_header extends_class? class_body;
class_header:class_type UNDERSCORE? IDENTIFIER  ;
class_body:OBC (structure*) CBC;
class_type:ABSTRACT_? CLASS_;
extends_class: ((EXTENDS_ | IMPLEMENTS_) IDENTIFIER);