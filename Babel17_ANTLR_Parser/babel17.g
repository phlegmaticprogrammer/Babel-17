/*

babel17.g

(C) Copyright 2009 Steven Obua

This file is part of Babel-17.

Babel-17 is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License version 3
as published by the Free Software Foundation.

Babel-17 is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Babel-17.  If not, see <http://www.gnu.org/licenses/>.

*/

grammar babel17;

options { 
language=Java; 
output=AST;
ASTLabelType=CommonTree;
} 

tokens {
PROG;
NIL_TOKEN;
ANY;
LAMBDA;
SQUARE_LIST;
ROUND_LIST;
LIST_CONS;
COMPARE;
APPLY;
IF;
MAP_OR_SET_OR_OBJ;
EMPTY_MAP;
EXCEPTION;
MATCH;
TRY;
CASES;
OBJ;
FOR_EXPR;
WHILE_DO;
MESSAGE_SEND;
UMINUS;
POW;

PARENTS_PLUS;
PARENTS_MUL;

BLOCK;
BEGIN;
WITH;
VAL;
OBJELEM_ASSIGN;
ASSIGN;
ARROW;
DEF;
YIELD;
PRIVATE;
TYPEDEF;
TYPEDEF_CLAUSE;
GETTYPE;


MEMOIZE;
MEMOID_STRONG;
MEMOID_WEAK;

PRIVATEID;

IF_PATTERN;
TYPE_PATTERN;
INNERVALUE_PATTERN;
TYPEID;
TYPEVAL;
MODULEID;
TYPE_EXPR;
TYPEOF;
CONVERSION;
CONVERT;
RELATE;
INTERVAL;

IMPORT_PREFIX;
IMPORT_ALL;
IMPORT_SET;
IMPORT_PLUS;
IMPORT_MINUS;
}

@lexer::header {
package com.babel17.antlr;
}

@parser::header {
package com.babel17.antlr;
}

@parser::members { 

public boolean errorDuringParsing = false;
public ArrayList<RecognitionException> parsingErrors = new ArrayList<RecognitionException>();


@Override
public void reportError(RecognitionException e) {
  errorDuringParsing = true;
  parsingErrors.add(e);
}

} 

@lexer::members {

public boolean errorDuringLexing = false;
public ArrayList<RecognitionException> lexingErrors = new ArrayList<RecognitionException>();

@Override
public void reportError(RecognitionException e) {
  errorDuringLexing = true;
  lexingErrors.add(e);
}
}

prog 	:	block EOF -> ^(PROG block);

fragment
Newline	:	('\u000A' | '\u000D' | '\u0085' | '\u000C' | '\u2028' | '\u2029'); 
 	
fragment	
NotNewline
	:	~('\u000A' | '\u000D' | '\u0085' | '\u000C' | '\u2028' | '\u2029');

COMMENT:	'#(' ((options {greedy=false;} : .)* ')#') {$channel=HIDDEN;};

LINECOMMENT
	:	'##' NotNewline* {$channel=HIDDEN;};


fragment
SmallLetter 	
	:	'a' .. 'z' | '\u00E4' | '\u00FC' | '\u00F6' | '\u00DF' ;

fragment
BigLetter
	:	'A' .. 'Z' | '\u00C4' | '\u00DC' | '\u00D6';

fragment	
Letter	:	SmallLetter | BigLetter;
	

fragment
Digit 	:	'0' .. '9';

fragment
Hex 	:	 Digit | 'A' .. 'F' | 'a' .. 'f';

/* Reserved literals that are actually used: */ 
L_begin	:	'begin';
L_end 	:	'end';

L_obj 	:	'object';
L_with	:	'with';

L_if 	: 	'if';
L_then 	:	'then';
L_else	:	'else';
L_elseif	
	:	'elseif';

L_while	:	'while';
L_for	:	'for';
L_do	:	'do';
L_yield	:	'yield';
L_match	:	'match';
L_case	:	'case';
L_as	:	'as';
L_val	:	'val';
L_def	:	'def';
L_in	:	'in';
L_exception	
	:	'exception';
L_to 	:	 'to';
L_downto 	
	:	'downto';
L_try	:	'try';
L_catch	:	'catch';
	
/*A_infinity 
	:	'infinity';	
U_infinity
	:	'\u221E';	
token_infinity
	:	A_infinity | U_infinity;*/
	
L_concurrent
	:	'concurrent';
	
L_choose	
	:	'choose';
	
L_lazy	:	'lazy';

L_memoize
	:	'memoize';

L_true	:	'true';
L_false	:	'false';

L_this	:	'this';

L_random:	'random';

L_nil	:	'nil';

L_div 	:	 'div';

L_mod 	:	'mod';

/* New reserved words for Babel-17 v0.3 */
L_module:	'module';
L_typedef
	:	'typedef';
L_typeof	
	:	'typeof';
L_private
	:	'private';
L_import:	'import';

L_unittest
	:	'unittest';
	
L_and	:	'and';

L_not	:	'not';

L_or	:	'or';

L_root	:	'root';

L_native:	'native';

/* Symbolic Tokens */

A_EQUAL	:	'==';

U_EQUAL	:	'\u2261';

token_EQUAL
	:	A_EQUAL | U_EQUAL;

A_NOT_EQUAL
	:	'<>';
U_NOT_EQUAL
	:	'\u2262';
	
token_NOT_EQUAL
	:	A_NOT_EQUAL | U_NOT_EQUAL;	
	
LESS	:	'<';

A_LESS_EQ	
	:	'<=';
U_LESS_EQ
	:	'\u2264';
token_LESS_EQ
	:	A_LESS_EQ | U_LESS_EQ;


GREATER	:	'>';

A_GREATER_EQ
	:	'>=';
U_GREATER_EQ
	:	'\u2265';
token_GREATER_EQ
	:	A_GREATER_EQ | U_GREATER_EQ;
	
SC	:	';';

PLUS	:	'+';
MINUS	:	'-';
TIMES	:	'*';
QUOTIENT:	'/' ;
POW_tok	:	'^';

TOK_RELATE	
	:	'~';
TOK_CONVERT	
	:	':>';

token_OR:	L_or;
token_AND
	:	L_and;
token_NOT
	:	L_not;

A_DOUBLE_COLON
	:	'::';
U_DOUBLE_COLON
	:	'\u2237';
token_DOUBLE_COLON 
	:	A_DOUBLE_COLON | U_DOUBLE_COLON;	
	
TIMESTIMES
	:	'**';	
QUOTIENTQUOTIENT
	:	'//';
PLUSPLUS	
	:	'++';
	
MINUSMINUS	
	:	'--';

A_DOUBLE_ARROW
	:	'=>';
U_DOUBLE_ARROW
	:	'\u21D2';
token_DOUBLE_ARROW
	:	A_DOUBLE_ARROW | U_DOUBLE_ARROW;	
		
A_ARROW	:	'->';
U_ARROW	:	'\u2192';
token_ARROW
	:	A_ARROW | U_ARROW;	
	
A_ELLIPSIS:	'...';
U_ELLIPSIS
	:	'\u2026';
token_ELLIPSIS
	:	A_ELLIPSIS | U_ELLIPSIS;

COMMA	:	',';

PERIOD	:	'.';

QUESTION_MARK	
	:	'?';

EXCLAMATION_MARK
	:	'!';
	
L_force	:	'force';
	
fragment
WsChar 	:	'\u0020' | '\t'; 	  

WS      :	WsChar+ {$channel=HIDDEN;};

NL	:	Newline (WsChar | Newline)*;
	
Constr 	:	BigLetter (Letter | Digit | '_')*;

Id	: 	SmallLetter (Letter | Digit | '_')*;

fragment
Exponent:	('E' | 'e') ('+' | '-')? Digit+;

Float	:	(Digit+ '.' Digit+ Exponent?) | (Digit+ Exponent);

Num	:	Digit+ 
	|	'0x' Hex+
	|       '0b' ('0' | '1')+
	|       '0o' ('0' .. '7')+;
	
fragment 
Charcode:	'\\u'  Hex Hex Hex Hex
	|	'\\U'  Hex Hex Hex Hex Hex Hex Hex Hex;
	
	
String	:	'"'(~('"' | '\\' | Newline) | '\\\\' | '\\"' | '\\n' | '\\r' | Charcode)*'"';	

ROUND_BRACKET_OPEN
	:	'(';
	
ROUND_BRACKET_CLOSE
	:	')';
	
SQUARE_BRACKET_OPEN
	:	'[';
	
SQUARE_BRACKET_CLOSE
	:	']';
	
CURLY_BRACKET_OPEN
	:	'{';
	
CURLY_BRACKET_CLOSE
	:	'}';
	
ASSIGN	:	'=';

UNDERSCORE
	:	'_';	
	
COLON	:	':';
	
PRAGMA_LOG
	:	'#log';
	
PRAGMA_PRINT
	:	'#print';
	
PRAGMA_ASSERT
	:	'#assert';
	
PRAGMA_PROFILE
	:	'#profile';
	
typeid 	:	Id (NL? PERIOD NL? Id)* -> ^(TYPEID Id*);

typeannotation
	:	typeid
	|	'(' protected_expr ')' -> ^(TYPEVAL protected_expr);


pattern :	Constr (NL? pattern)? -> ^(Constr pattern?)
	|	primitive_pattern (NL? token_DOUBLE_COLON NL? primitive_pattern)* 
		-> ^(LIST_CONS primitive_pattern*)
	|	L_exception NL? pattern -> ^(L_exception pattern)
	|	token_ELLIPSIS;
	
defpattern
	:	primitive_pattern (NL? token_DOUBLE_COLON NL? primitive_pattern)*
		-> ^(LIST_CONS primitive_pattern*)
	|	Constr defpattern? -> ^(Constr defpattern?);

casepattern
	: 	(pattern NL? ':') => pattern NL? ':' NL? typeannotation -> ^(TYPE_PATTERN typeannotation pattern)
	|	pattern;

	
bracket_pattern
	:       (Id NL? L_as) => Id NL? L_as NL? pattern -> ^(L_as Id pattern)
	|	(protected_expr NL? QUESTION_MARK) => 
		protected_expr NL? QUESTION_MARK (NL? pattern)? -> ^(QUESTION_MARK protected_expr pattern?)
	|	(protected_expr NL? EXCLAMATION_MARK) => 
		protected_expr NL? EXCLAMATION_MARK (NL? pattern)? -> ^(EXCLAMATION_MARK protected_expr pattern?)
	|	(Id pattern) => Id pattern -> ^(INNERVALUE_PATTERN Id pattern)
	|	L_val NL? protected_expr_nc -> ^(L_val protected_expr_nc)
	|       L_for NL? (bracket_pattern ( NL? COMMA NL? bracket_pattern)*  NL?)? L_end -> ^(L_for bracket_pattern*)
	|	(pattern NL? L_if) => pattern NL? L_if NL? protected_expr_nc -> ^(IF_PATTERN pattern protected_expr_nc)
	|	(pattern NL? ':') => pattern NL? ':' NL? typeannotation -> ^(TYPE_PATTERN typeannotation pattern)
	|	pattern;
	
arrow_or_assign
	:	token_ARROW -> ^(ARROW)
	|	ASSIGN -> ^(ASSIGN);

mselem_pattern
	:	bracket_pattern (NL? arrow_or_assign NL? bracket_pattern)?
		-> ^(NIL_TOKEN ^(NIL_TOKEN bracket_pattern*) arrow_or_assign*);

primitive_pattern
	:	Id
	|	'_' -> ANY
	|	String
	|	Num
	|	L_true
	|	L_false
	|	L_nil
	/*|	token_infinity
	|	'-' NL? token_infinity -> ^(UMINUS token_infinity)*/
	|	'-' NL? Num -> ^(UMINUS Num)
	|	'['  NL? (bracket_pattern NL? ( COMMA NL? bracket_pattern NL?)* )? ']' 
	 	  -> ^(SQUARE_LIST bracket_pattern*)
	|	'('  NL? (bracket_pattern NL? ( COMMA  NL? bracket_pattern NL?)* (COMMA NL?)?)? ')' 
		  -> ^(ROUND_LIST ^(NIL_TOKEN COMMA*) ^(NIL_TOKEN bracket_pattern*))		
	|	'{'  NL? (mselem_pattern NL? ( COMMA  NL? mselem_pattern NL?)* )? '}'
		  -> ^(MAP_OR_SET_OR_OBJ mselem_pattern*)
	|	'{' NL? token_ARROW NL? '}' -> ^(EMPTY_MAP);
	

sep	:	(NL | SC)+;

block 	:	sep? statement (sep statement)* sep? -> ^(BLOCK statement*) 
	|	sep? -> ^(BLOCK);
	
pure_block
	:	statement (sep statement)* -> ^(BLOCK statement*); 

statement
	:	st_typedef
	|       st_val
	|	st_def
	|	st_yield
	|	st_memoize
	|	st_private
	|	st_module
	|	st_import
	|	expr_or_assign
	| 	PRAGMA_PRINT expr -> ^(PRAGMA_PRINT expr)
	| 	PRAGMA_LOG expr -> ^(PRAGMA_LOG expr)
	| 	PRAGMA_PROFILE expr -> ^(PRAGMA_PROFILE expr)
	| 	PRAGMA_ASSERT expr -> ^(PRAGMA_ASSERT expr);
	
objelem_assign
	:	Id PERIOD Id -> ^(OBJELEM_ASSIGN Id Id);
	
st_val	:	L_val NL? (pattern | objelem_assign) NL? '=' NL? expr -> ^(VAL pattern* objelem_assign* expr);
		
st_def	:	L_def NL? Id NL? (defpattern NL?)? (':' NL? typeid NL?)? '=' NL? expr 
		  -> ^(DEF Id typeid? defpattern? expr)
	|	L_def NL? L_this NL? ':' NL? typeid NL? '=' NL? expr -> ^(CONVERSION typeid expr);
		  
st_typedef
	:	L_typedef NL? Id NL? typedef_clause (NL? COMMA NL? typedef_clause)* -> ^(TYPEDEF Id ^(NIL_TOKEN typedef_clause*));
	
typedef_clause
	:	(defpattern NL? '=') => defpattern NL? '=' NL? expr -> ^(TYPEDEF_CLAUSE defpattern expr)
	|	defpattern -> ^(TYPEDEF_CLAUSE defpattern);
		  
st_yield:	L_yield expr -> ^(YIELD expr);
		  
st_memoize
	:	L_memoize memo_id (NL? COMMA NL? memo_id)*
		  -> ^(MEMOIZE memo_id*);		  
		
memo_id	:	Id -> ^(MEMOID_STRONG Id)
	|	'(' Id ')' -> ^(MEMOID_WEAK Id);

st_private
	:	L_private private_id (NL? COMMA NL? private_id)*
		  -> ^(PRIVATE private_id*);	

private_id	
	:	Id -> ^(PRIVATEID Id);
	
testid	:	Id
	|	L_unittest;

moduleid 	
	:	Id (NL? PERIOD NL? testid)* -> ^(MODULEID Id? testid*);

st_module
	:	L_module NL? moduleid block (L_unittest block)? L_end -> ^(L_module moduleid block L_unittest? block?);
	
importprefix
	:	(L_root | testid) (NL? PERIOD NL? testid)* -> ^(IMPORT_PREFIX L_root? testid*);	
	
importall
	:	UNDERSCORE -> ^(IMPORT_ALL);
	
importsetclause
	:	testid (NL? token_DOUBLE_ARROW (NL? Id)?)? -> ^(IMPORT_PLUS testid Id?)
	|	'-' NL? testid -> ^(IMPORT_MINUS testid)
	|	importall;
	
importset
	:	'{' NL? importsetclause (NL? ',' NL? importsetclause)* NL? '}' -> ^(IMPORT_SET importsetclause*);

st_import
	:	L_import NL? importprefix (NL? (PERIOD NL? importall | PERIOD NL? importset | token_DOUBLE_ARROW NL? Id))? -> ^(L_import importprefix importall? importset? Id?);
	
expr_or_assign
	:	((pattern | objelem_assign) NL? '=') => (pattern | objelem_assign) NL? '=' NL? expr -> ^(ASSIGN pattern* objelem_assign* expr)
	|	expr;
	
expr	
	:	lop_expr
	|	obj_expr;
	
control_expr
	:	if_expr
	|	while_do_expr
	|	match_expr
	|	for_expr
	| 	try_expr
	|	begin_end;
	
with_control_expr
	:	control_expr
	|	L_with NL? protected_expr NL? L_do block L_end -> ^(WITH protected_expr ^(BEGIN block));

	
protected_expr
	:	p_lop_expr
	|	obj_expr;
	
protected_expr_nc // protected expr, no commas allowed
	:	protected_expr;
	
begin_end
	:	L_begin block L_end -> ^(BEGIN block);	


parents	:	'+' primitive_expr -> ^(PARENTS_PLUS primitive_expr)
	|	'*' primitive_expr -> ^(PARENTS_MUL primitive_expr);
	

obj_expr:	(L_obj NL? parents) => L_obj NL? parents block L_end -> ^(OBJ block parents)
        |       L_obj block L_end -> ^(OBJ block);
				
lop_expr	
	:	(lambda_expr) => lambda_expr
	|	(lambda_expr_nobrackets) => lambda_expr_nobrackets
	|	op_expr;

p_lop_expr	
	:	(lambda_expr) => lambda_expr
	|	(lambda_expr_nobrackets) => lambda_expr_nobrackets
	|	p_op_expr;		

if_expr	:	L_if NL? protected_expr NL? L_then block 
		(L_elseif NL? protected_expr NL? L_then block)* 
		(L_else block)? L_end  -> ^(IF protected_expr* block*);
		
while_do_expr
	:	L_while NL? protected_expr NL? L_do block L_end 
		  -> ^(WHILE_DO protected_expr block);
					
cases 
	:	full_cases
	|	pattern NL? token_DOUBLE_ARROW block -> ^(CASES ^(NIL_TOKEN pattern block));

full_cases
	:	case_expr+ -> ^(CASES case_expr+);	

case_expr
	:	(L_case NL? casepattern NL? token_DOUBLE_ARROW block) -> ^(NIL_TOKEN casepattern block);
	
match_expr
	:	L_match NL? p_op_expr NL? full_cases L_end 
		  -> ^(MATCH p_op_expr full_cases);
		  
try_expr:	L_try NL? pure_block NL? L_catch NL? full_cases L_end
		  -> ^(TRY pure_block full_cases);

lambda_expr 
	:	'(' NL? lambda_cases NL? ')' -> ^(LAMBDA lambda_cases);
	
lambda_expr_nobrackets 
	:	lambda_cases_nobrackets -> ^(LAMBDA lambda_cases_nobrackets);

lambda_cases_nobrackets 
	:	pattern NL? token_DOUBLE_ARROW NL? lop_expr -> ^(CASES ^(NIL_TOKEN pattern ^(BLOCK lop_expr)));

lambda_case_expr
	:	(L_case NL? casepattern NL? token_DOUBLE_ARROW NL? pure_block) -> ^(NIL_TOKEN casepattern pure_block);

lambda_cases 
	:	pattern NL? token_DOUBLE_ARROW NL? pure_block -> ^(CASES ^(NIL_TOKEN pattern pure_block))
	|	lambda_case_expr (NL? lambda_case_expr)* -> ^(CASES lambda_case_expr+);

for_expr:	L_for NL? pattern NL? L_in NL? protected_expr NL? L_do block L_end
		  -> ^(FOR_EXPR pattern protected_expr block);	

	
op_expr	
	:	builtin_primitive^ op_expr
	|	bool_expr;
	
p_op_expr
	:	builtin_primitive^ NL!? p_op_expr
	|	p_bool_expr;

builtin_primitive
	:	L_exception | L_lazy | L_concurrent | L_force;

bool_expr 
	:	bool_or_expr;

p_bool_expr 
	:	p_bool_or_expr;

bool_or_expr
	:	bool_and_expr (NL!? token_OR^ NL!? bool_and_expr)*; 

p_bool_or_expr
	:	p_bool_and_expr (NL!? token_OR^ NL!? p_bool_and_expr)*; 

bool_and_expr
	:	bool_not_expr (NL!? token_AND^ NL!? bool_not_expr)*;
	
p_bool_and_expr
	:	p_bool_not_expr (NL!? token_AND^ NL!? p_bool_not_expr)*;


bool_not_expr
	:	token_NOT^ NL!? bool_not_expr
	|	rel_expr;
		
p_bool_not_expr
	:	token_NOT^ NL!? p_bool_not_expr
	|	p_rel_expr;


rel_expr
	:	relate_expr (NL? rel_op NL? relate_expr)* -> ^(COMPARE relate_expr (rel_op relate_expr)*);
	
p_rel_expr
	:	p_relate_expr (NL? rel_op NL? p_relate_expr)* -> ^(COMPARE p_relate_expr (rel_op p_relate_expr)*);


rel_op	:	token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ;
	 
relate_expr:	convert_expr (NL? TOK_RELATE NL? convert_expr)? -> ^(RELATE convert_expr*);	

p_relate_expr:	p_convert_expr (NL? TOK_RELATE NL? p_convert_expr)? -> ^(RELATE p_convert_expr*);	

convert_expr
	:	term_expr (NL? TOK_CONVERT NL? typeannotation)? -> ^(CONVERT term_expr typeannotation?);

p_convert_expr
	:	p_term_expr (NL? TOK_CONVERT NL? typeannotation)? -> ^(CONVERT p_term_expr typeannotation?);

term_expr	
	:	builtin_fun^ term_expr
	|	arith_expr;
	
p_term_expr
	:	builtin_fun^ NL!? p_term_expr
	|	p_arith_expr;

builtin_fun
	:	L_random | L_choose | L_typeof | L_native;

arith_expr
	:	plusplus_expr;

p_arith_expr
	:	p_plusplus_expr;
	
plusplus_expr
	:	timestimes_expr (NL!? (PLUSPLUS^|MINUSMINUS^) NL!? timestimes_expr)*;
	
p_plusplus_expr
	:	p_timestimes_expr (NL!? (PLUSPLUS^|MINUSMINUS^) NL!? p_timestimes_expr)*;


timestimes_expr
	:	simple_expr (NL!? (TIMESTIMES^|QUOTIENTQUOTIENT^) NL!? simple_expr)*;
		
p_timestimes_expr
	:	p_simple_expr (NL!? (TIMESTIMES^|QUOTIENTQUOTIENT^) NL!? p_simple_expr)*;

simple_expr
	:	cons_expr;

p_simple_expr
	:	p_cons_expr;

cons_expr
	:	to_expr (NL? token_DOUBLE_COLON NL? to_expr)* -> ^(LIST_CONS to_expr*);

p_cons_expr
	:	p_to_expr (NL? token_DOUBLE_COLON NL? p_to_expr)* -> ^(LIST_CONS p_to_expr*);


to_expr	:	arith_plus_expr (NL!? (L_to^| L_downto^) NL!? arith_plus_expr)?;
	
p_to_expr	
	:	p_arith_plus_expr (NL!? (L_to^| L_downto^) NL!? p_arith_plus_expr)?;
	
arith_plus_expr
	:	arith_uminus_expr ((NL!? PLUS^ | MINUS^) NL!? arith_uminus_expr)*;

p_arith_plus_expr
	:	p_arith_uminus_expr (NL!? (PLUS | MINUS)^ NL!? p_arith_uminus_expr)*;
		
arith_uminus_expr
	:	MINUS NL? arith_mult_expr -> ^(UMINUS arith_mult_expr)
	|	arith_mult_expr;
		
p_arith_uminus_expr
	:	MINUS NL? p_arith_mult_expr -> ^(UMINUS p_arith_mult_expr)
	|	p_arith_mult_expr;

arith_mult_expr
	:	arith_pow_expr (NL!? (TIMES | QUOTIENT | L_div | L_mod)^ NL!? arith_pow_expr)*;
	
p_arith_mult_expr
	:	p_arith_pow_expr (NL!? (TIMES | QUOTIENT | L_div | L_mod)^ NL!? p_arith_pow_expr)*;

arith_pow_expr
	:	apply_expr (NL? POW_tok NL? apply_expr)* -> ^(POW apply_expr*);	

p_arith_pow_expr
	:	p_apply_expr (NL? POW_tok NL? p_apply_expr)* -> ^(POW p_apply_expr*);	

apply_expr
	:	basic_expr+ -> ^(APPLY basic_expr*);
p_apply_expr
	:	p_basic_expr (NL? p_basic_expr)* -> ^(APPLY p_basic_expr*);

basic_expr
	:	message_send_expr;

p_basic_expr
	:	message_send_expr;

message_send_expr
	:	primitive_expr (NL? PERIOD NL? Id)* -> ^(MESSAGE_SEND primitive_expr Id*);
	
list_expr 
	:	('[' NL? protected_expr_nc NL? ';') => '[' NL? protected_expr_nc NL? ';' NL? protected_expr_nc NL? ']' -> ^(INTERVAL protected_expr_nc*)
	|	'[' NL? (protected_expr_nc (NL? COMMA NL? protected_expr_nc)* NL?)? ']' -> ^(SQUARE_LIST protected_expr_nc*)
	|	'(' NL? (protected_expr_nc (NL? COMMA NL? protected_expr_nc)* NL? (COMMA NL?)?)? ')' -> ^(ROUND_LIST ^(NIL_TOKEN COMMA*) ^(NIL_TOKEN protected_expr_nc*));

map_or_set_expr
	:	'{' NL? (map_or_set_elem_expr NL? (COMMA NL? map_or_set_elem_expr NL?)*)? '}' -> ^(MAP_OR_SET_OR_OBJ map_or_set_elem_expr*)
	|       '{' NL? token_ARROW NL? '}' -> ^(EMPTY_MAP);
		
map_or_set_elem_expr
	:	protected_expr_nc (NL? arrow_or_assign NL? protected_expr_nc)? -> ^(NIL_TOKEN ^(NIL_TOKEN protected_expr_nc*) arrow_or_assign*);

type_expr
	:	'(' NL? ':' NL? typeid NL? ')' -> ^(TYPE_EXPR typeid);
	
primitive_expr
	:	Num
	|	Float
	|	String
	|	Id
	|	Constr
	|	L_true
	|	L_false
	|	L_this	
	|	L_nil
	|	L_root
	|	type_expr
	| 	list_expr
	|	with_control_expr
	|	map_or_set_expr;
