/*
 * Business rule grammar
 */

grammar BusinessRule;
@header{
package com.expr.brule.core;
}

parse: expr EOF
	;

expr	
 : expr binop expr  				#logicalExpression
 | lhs=VARIABLE compop rhs=VARIABLE #variableExpression
 | lhs=VARIABLE compop rhs=STRING 	#stringExpression
 | lhs=VARIABLE compop rhs=NUMBER 	#numberExpression
 | function							#functionExpression
 | TRUE         					#booleanTrue
 | FALSE        					#booleanFalse
 | VARIABLE     					#booleanVariable
 | LEFTPAREN expr RIGHTPAREN 		#enclosedExpression
 ;

binop : AND | OR 
 ;

compop: EQUAL | LT | GT | LTE | GTE | NE
      ;
  

function:
 VARIABLE LEFTPAREN args? RIGHTPAREN
;

args: 
STRING (',' STRING)*
;
        
TRUE:       'true' | 'TRUE'  ;
FALSE:      'false' | 'FALSE';
STRING:     QUOTE   ~([\t\n\r]| '"')* QUOTE
     ;
     
QUOTE: '"' ;
LEFTPAREN:	'(';   
RIGHTPAREN:	')';  
EQUAL     : '=' | 'EQ';
LT        : '<' | 'LT';
GT        : '>' | 'GT';
LTE       : '<=' | 'LE';
GTE       : '>=' | 'GE';
NE        : '!=' | 'NE';
AND       : 'AND' | '&' | 'and';
OR        : 'OR' | 'or' | '|';
VARIABLE  : [a-zA-Z]+[a-zA-Z0-9_.-]*;
NUMBER	: [0-9]+ ('.'[0-9]+)?;
SPACE     : [ \t\r\n] -> skip;