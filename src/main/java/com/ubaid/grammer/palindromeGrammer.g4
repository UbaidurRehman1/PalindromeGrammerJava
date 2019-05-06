grammar PalindromeGrammer;

prog: p+;

p   : 'a' p* 'a' EOF
	| 'b' p* 'b' EOF
	| 'a'
	| 'b'
	;
	

	


