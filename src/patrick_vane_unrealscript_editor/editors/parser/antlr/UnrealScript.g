/* UnrealScript grammar by Ori Hanegby.
   Roughly based on the grammar outline supplied on http://wiki.beyondunreal.com/Legacy:UnrealScript_Grammar
   updates to support the new UnrealScript Syntax. */

grammar UnrealScript;

options
{
	backtrack	= true;
	memoize		= true;
}

@lexer::header
{
	package patrick_vane_unrealscript_editor.editors.parser.antlr;
}

@parser::header
{
	package patrick_vane_unrealscript_editor.editors.parser.antlr;
}

@members
{
	public static class AntlrUCVarDecl
	{
		public String varName;
		public String varType;
		public String arrayInner;
		public boolean isBrackArray;
		public Token startToken;
		
		public AntlrUCVarDecl( String varName, String varType, String arrayInner, boolean isBrackArray, Token startToken )
		{
			this.varName = varName;
			this.varType = varType;
			this.arrayInner = arrayInner;
			this.isBrackArray = isBrackArray;
			this.startToken = startToken;
		}
	}
	
	public static class AntlrUCFuncDecl
	{
		public String funcName;
		public String funcParams;
		public int startPos;
		public int endPos;
		public Token startToken;
		public Token endToken;
		public Token declStartToken;
		public String funcReturnType;
		public List<AntlrUCVarDecl> params = new ArrayList<AntlrUCVarDecl>();
		public List<AntlrUCVarDecl> localVars = new ArrayList<AntlrUCVarDecl>();
	}
	
	public static class AntlrUCStructDecl
	{
		public String structName;
		public List<AntlrUCVarDecl> variables = new ArrayList<AntlrUCVarDecl>();
		public Token declStartToken;
	}
	
	public Token declStartToken;
	public List<AntlrUCFuncDecl> functions = new ArrayList<AntlrUCFuncDecl>();
	public List<AntlrUCVarDecl> variables = new ArrayList<AntlrUCVarDecl>();
	public Map<String, List<String>> enumsMap = new HashMap<String, List<String>>();
	public String className;
	public List<String> superClasses = new ArrayList<String>();
	public List<AntlrUCStructDecl> structs = new ArrayList<AntlrUCStructDecl>();
	public List<String> consts = new ArrayList<String>();
}


prog
	:
	classdecl ( declerations )* ( replicationblock )? ( body )* ( defaultpropertiesblock )?
	;

// default properties


defaultpropertiesblock
	:
	'defaultproperties' LCBRACK ~( RCBRACK  )* RCBRACK SEMICOLON?
	;

//--------------- Terminals


structdefaultpropertiesblock
	:
	'structdefaultproperties' LCBRACK ~( RCBRACK  )* RCBRACK SEMICOLON?
	;

// yes, 'interface' as an the identifier name is ugly, but it's declared in interface.uc


classdecl
	:
	(
		'class'
		| 'interface'
	)
	( idName = fixedidentifier ) ( ( 'extends' ) superClass = packageidentifier 
                                                                             {
                                                                              superClasses.add($superClass.text);
                                                                             } )? ( COMMA superClass = packageidentifier 
                                                                                                                         {
                                                                                                                          superClasses.add($superClass.text);
                                                                                                                         } )* ( classparams )* SEMICOLON 
                                                                                                                                                         {
                                                                                                                                                          className = $fixedidentifier.text;
                                                                                                                                                          declStartToken = $fixedidentifier.start;
                                                                                                                                                         }
	;


classparams
	:
	constclassparams
	(
		LBRACK
		(
			~(
				LBRACK
				| RBRACK
			 )
		)*
		RBRACK
	)?
	| 'within' packageidentifier 
                              {
                               superClasses.add($packageidentifier.text);
                              }
	| 'dependson' LBRACK
	(
		~(
			LBRACK
			| RBRACK
		 )
	)*
	RBRACK
	| 'config'
	(
		LBRACK
		(
			~(
				LBRACK
				| RBRACK
			 )
		)*
		RBRACK
	)?
	| 'hidecategories' LBRACK
	(
		~(
			LBRACK
			| RBRACK
		 )
	)*
	RBRACK
	| 'showcategories' LBRACK
	(
		~(
			LBRACK
			| RBRACK
		 )
	)*
	RBRACK
	| fixedidentifier
	(
		LBRACK
		(
			~(
				LBRACK
				| RBRACK
			 )
		)*
		RBRACK
	)?
	;


identifierlist
	:
	fixedidentifier ( COMMA fixedidentifier )*
	;


packageidentifier
	:
	fixedidentifier ( DOT fixedidentifier )*
	| 'property'
	;


vardecl[List<AntlrUCVarDecl> varContainer]
	:
	'var' ( configgroup )? ( varparams ( LCBRACK varparams RCBRACK )? )* vartype var_id = varidentifier 
                                                                                                     {
                                                                                                      varContainer.add(new AntlrUCVarDecl($var_id.varName, $vartype.typename,
                                                                                                      		$vartype.arrayInner, $var_id.isArray, $var_id.startToken));
                                                                                                     }
	( COMMA var_id = varidentifier 
                                {
                                 varContainer.add(new AntlrUCVarDecl($var_id.varName, $vartype.typename,
                                 		$vartype.arrayInner, $var_id.isArray, $var_id.startToken));
                                } )* SEMICOLON
	;


vartype returns [String typename,String arrayInner]
@init
{
$arrayInner = null;
}
	:
	classtype 
           {
            $typename = $classtype.text;
           }
	| packageidentifier
	(
		LCBRACK
		(
			~(
				LCBRACK
				| RCBRACK
			 )
		)*
		RCBRACK
	)?
	
  {
   $typename = $packageidentifier.text;
  }
	| enumdecl 
            {
             $typename = $enumdecl.typename;
            }
	| structdecl 
              {
               $typename = $structdecl.text;
              }
	| arraydecl 
             {
              $typename = "array";
              $arrayInner = $arraydecl.arrayInner;
             }
	| basictype 
             {
              $typename = $basictype.text;
             }
	| delegatedecl 
                {
                 $typename = $delegatedecl.text;
                }
	;


varidentifier returns [String varName, boolean isArray, Token startToken]
@init
{
$isArray = false;
}
	:
	varId = fixedidentifier
	(
		LSBRACK
		(
			INTVAL
			| qualifiedidentifier
		)
		RSBRACK 
          {
           $isArray = true;
          }
	)?
	(
		LCBRACK
		(
			~(
				LCBRACK
				| RCBRACK
			 )
		)*
		RCBRACK
	)?
	(
		LABRACK
		(
			~(
				LABRACK
				| RABRACK
			 )
		)*
		RABRACK
	)?
	
  {
   $varName = $varId.text;
   $startToken = $varId.start;
  }
	| ( varFixed = varfixid ) 
                           {
                            $varName = $varFixed.text;
                            $startToken = $varFixed.start;
                           }
	;


varfixid
	:
	'name'
	| 'class'
	| 'bool'
	;


configgroup
	:
	LBRACK ( fixedidentifier ( COMMA fixedidentifier )* )? RBRACK
	;


declerations
	:
	vardecl[variables]
	|
	(
		constdecl
		| enumdecl
		| structdecl
	)
	SEMICOLON
	;


constdecl
	:
	'const' fixedidentifier EQUALS constvalue 
                                           {
                                            consts.add($fixedidentifier.text);
                                           }
	;


constvalue
	:
	(
		'-'? FLOATVAL
		| stringval
		| '-'? INTVAL
		| boolval
		| nameval
	)
	;


enumdecl returns [String typename]
	:
	'enum' fixedidentifier LCBRACK enumoptions[$fixedidentifier.text] RCBRACK 
                                                                           {
                                                                            $typename = $fixedidentifier.text;
                                                                           }
	;


structdecl
@init
{
AntlrUCStructDecl newStruct = new AntlrUCStructDecl();
}
	:
	'struct' ( structparams )*
	(
		LCBRACK
		(
			~(
				LCBRACK
				| RCBRACK
			 )
		)*
		RCBRACK
	)?
	fixedidentifier 
                 {
                  newStruct.structName = $fixedidentifier.text;
                  newStruct.declStartToken = $fixedidentifier.start;
                 }
	( 'extends' packageidentifier )? LCBRACK structbody[newStruct]? RCBRACK 
                                                                         {
                                                                          structs.add(newStruct);
                                                                         }
	;


enumoptions[String enumName]
@init
{
List<String> lst = new ArrayList<String>();
enumsMap.put($enumName, lst);
}
	:
	id = fixedidentifier displayoption? 
                                     {
                                      lst.add($id.text);
                                     }
	( COMMA id = fixedidentifier displayoption? 
                                             {
                                              lst.add($id.text);
                                             } )* COMMA?
	;


displayoption
	:
	LABRACK
	(
		~(
			LABRACK
			| RABRACK
		 )
	)*
	RABRACK
	;


structparams
	:
	'native'
	| 'export'
	| 'atomic'
	| 'immutable'
	| 'atomicwhencooked'
	| 'immutablewhencooked'
	| 'strictconfig'
	| 'transient'
	;


structbody[AntlrUCStructDecl strct]
	:
	( vardecl[strct.variables] )+ structdefaultpropertiesblock?
	;


arraydecl returns [String arrayInner]
	:
	'array' LABRACK ( varparams* vartype ) RABRACK 
                                                {
                                                 $arrayInner = $vartype.text;
                                                }
	;


delegatedecl
	:
	'delegate' LABRACK ( varparams* vartype ) RABRACK
	;


classtype
	:
	'class' LABRACK ( varparams* vartype ) RABRACK
	;
//qualifiedidentifier
//	:	 ( ( ('class' | 'property') SQUOTE packageidentifier SQUOTE /*((DOT 'static')? (DOT 'default')? DOT IDENTIFIER)?*/)
//                           |/* ( */ fixedidentifier /*(DOT fixedidentifier )*)*/ | defaultidentifier | 'class' | 'property'
//                           ) (LSBRACK expr RSBRACK)? (DOT qualifiedidentifier)?;


qualifiedidentifier
	:
	qualifierident_1 ( DOT qualifierident_1 )*
	;


qualifierident_1
	:
	(
		(
			(
				'class'
				| 'property'
				| 'enum'
				| IDENTIFIER
			)
			SQUOTE packageidentifier SQUOTE /*((DOT 'static')? (DOT 'default')? DOT IDENTIFIER)?*/
		)
		| /* ( */
  fixedidentifier /*(DOT fixedidentifier )*)*/
		| defaultidentifier
		| 'class'
		| 'property'
	)
	( LSBRACK expr RSBRACK )?
	;


defaultidentifier
	:
	'default' DOT qualifiedidentifier
	;


replicationblock
	:
	'replication' LCBRACK ( replicationbody )* RCBRACK SEMICOLON?
	;


replicationbody
	:
	(
		'reliable'
		| 'unreliable'
	)?
	'if' LBRACK expr RBRACK fixedidentifier ( COMMA fixedidentifier )* SEMICOLON
	;


functinoargs
	:
	(
		'optional'
		| 'out'
		| 'coerce'
	)?
	'name' fixedidentifier
	;


codeline
	:
	codelabel
	| codelinenolabel
	;


codelinenolabel
	:
	(
		statement
		| assignment
		| ( unaryexpr SEMICOLON )
		| ifthenelse
		| whileloop
		| doloop
		| switchcase
		| returnfunc
		| foreachloop
		| forloop
		| breakfunc
		| continuefunc
	)
	SEMICOLON*
	;

// body


body
	:
	statedecl
	| functiondecl
	;
//body	:	( functiondecl )*;

// ------------------------------------ state parts


statedecl
	:
	( stateparams )* 'state' fixedidentifier ( 'extends' fixedidentifier )? statebody
	;


statebody
	:
	LCBRACK ( stateignore )? ( functiondecl )* statelabels RCBRACK SEMICOLON?
	;


stateignore
	:
	'ignores' fixedidentifier ( COMMA fixedidentifier )* SEMICOLON
	;


statelabels
	:
	( codelabel ( codelinenolabel )* )*
	;

// ------------------------------------ function parts

// operators require an set amouth of arguments


functiondecl
	:
	(
		normalfunc
		| operatorfunc
	)
	;


normalfunc
@init
{
AntlrUCFuncDecl func = new AntlrUCFuncDecl();
}
	:
	( functionparams )* functiontype ( functionparams )* ( vartype 
                                                                {
                                                                 func.funcReturnType = $vartype.typename;
                                                                } )? name = fixedidentifier params = funcargsblock[func] 'const'? ( startBrack = LCBRACK functionbody[func] endBrack = RCBRACK )? SEMICOLON? 
                                                                                                                                                                                                             {
                                                                                                                                                                                                              func.funcName = $name.text;
                                                                                                                                                                                                              func.funcParams = $params.text;
                                                                                                                                                                                                              func.startToken = $startBrack;
                                                                                                                                                                                                              func.endToken = $endBrack;
                                                                                                                                                                                                              func.declStartToken = $name.start;
                                                                                                                                                                                                              functions.add(func);
                                                                                                                                                                                                             }
	;


funcargsblock[AntlrUCFuncDecl funcDecl]
	:
	LBRACK ( functionargs[funcDecl] ( COMMA functionargs[funcDecl] )* )? RBRACK
	;


functionparams
	:
	constfunctparams
	| 'native' ( LBRACK INTVAL RBRACK )?
	;


operatorfunc
@init
{
AntlrUCFuncDecl func = new AntlrUCFuncDecl();
}
	:
	( functionparams )* operatortype[func] ( LCBRACK functionbody[func] RCBRACK )? SEMICOLON?
	;


operatortype[AntlrUCFuncDecl func]
	:
	(
		binaryoperator[func]
		| unaryoperator[func]
	)
	;
//requires two arguments


binaryoperator[AntlrUCFuncDecl func]
	:
	'operator' LBRACK INTVAL RBRACK vartype opidentifier LBRACK functionargs[func] COMMA functionargs[func] RBRACK
	;
// requires one argument


unaryoperator[AntlrUCFuncDecl func]
	:
	(
		'preoperator'
		| 'postoperator'
	)
	vartype opidentifier LBRACK functionargs[func] RBRACK
	;


opidentifier
	:
	fixedidentifier
	| operatornames
	;


functionargs[AntlrUCFuncDecl funcDecl]
	:
	(
		'optional'
		| 'out'
		| 'coerce'
		| 'const'
		| 'skip'
		| 'init'
	)*
	vartype fixedidentifier
	(
		LSBRACK
		(
			INTVAL
			| qualifiedidentifier
		)
		RSBRACK
	)?
	( EQUALS expr )? 
                  {
                   funcDecl.params.add(new AntlrUCVarDecl($fixedidentifier.text,
                   		$vartype.typename, $vartype.arrayInner, false, $fixedidentifier.start));
                  }
	;


functionbody[AntlrUCFuncDecl funcDecl]
	:
	( localdecl[funcDecl] )* ( codeline )*
	;
//	:    (('local')=>(localdecl) | (codeline))* ;
//	: ( ( ( localdecl )* ( codeline )* ) ( SEMICOLON )? );


localdecl[AntlrUCFuncDecl funcDecl]
	:
	'local' vartype id = varidentifier 
                                    {
                                     funcDecl.localVars.add(new AntlrUCVarDecl($id.text, $vartype.typename,
                                     		$vartype.arrayInner, $id.isArray, $id.startToken));
                                    }
	( COMMA id = varidentifier 
                            {
                             funcDecl.localVars.add(new AntlrUCVarDecl($id.text, $vartype.typename,
                             		$vartype.arrayInner, $id.isArray, $id.startToken));
                            } )* SEMICOLON*
	;


localtype
	:
	vartype
	;
//	: packageidentifier | arraydecl | classtype | basictype;

// ------------------------------------ code parts


codeblock
	:
	(
		codeline
		| ( LCBRACK ( codeline )* RCBRACK SEMICOLON? )
	)
	;


statement
	: /*((funccall | qualifiedidentifier) DOT)* funccall*/
	funcoperand SEMICOLON
	;


assignment
	:
	(
		funccall
		| qualifiedidentifier
	)
	(
		DOT
		(
			funccall
			| qualifiedidentifier
		)
	)*
	(
		EQUALS
		| assignop
	)
	expr SEMICOLON
	;


unaryexpr
	:
	operand unaryop
	| unaryop operand
	;


ifthenelse
	:
	'if' LBRACK expr RBRACK codeblock ( 'else' codeblock )?
	;


whileloop
	:
	'while' LBRACK expr RBRACK codeblock
	;


doloop
	:
	'do' codeblock 'until' LBRACK expr RBRACK SEMICOLON
	;


switchcase
	:
	'switch' LBRACK expr RBRACK LCBRACK ( caserule )+ ( defaultrule )? RCBRACK SEMICOLON?
	;


caserule
	:
	'case' operand+ COLON
	(
		LCBRACK codelinenolabel RCBRACK
		| codelinenolabel
	)*
	;


defaultrule
	:
	'default' COLON
	(
		LCBRACK codelinenolabel RCBRACK
		| codelinenolabel
	)*
	;


newoperator
	:
	'new' ( LBRACK expr ( COMMA expr )* RBRACK )? operand
	; //'class' SQUOTE packageidentifier SQUOTE (LBRACK expr* RBRACK)?;


returnfunc
	:
	'return' ( expr )? SEMICOLON
	;


breakfunc
	:
	'break' SEMICOLON
	;


continuefunc
	:
	'continue' SEMICOLON
	;


foreachloop
	:
	'foreach' funcoperand codeblock
	;


forloop
	:
	'for' LBRACK expr SEMICOLON expr SEMICOLON expr RBRACK codeblock
	;


funccall
	:
	(
		( 'class' SQUOTE packageidentifier SQUOTE DOT 'static' DOT )
		| ( ( IDENTIFIER DOT )+ )
	)?
 //		IDENTIFIER LBRACK ( expr ( COMMA expr )* )? RBRACK (DOT funccall)? ;
	(
		funcnamecall
		| funccastcall
	)
	;
//funccastcall;
//funcnamecall;


funcnamecall
	:
	'`'? qualifiedidentifier ( DOT qualifiedidentifier )* LBRACK ( expr? ( COMMA expr? )* )? RBRACK /*funcoperand? */
	;


funccastcall
	:
	vartype LBRACK ( expr ( COMMA expr )* )? RBRACK /*funcoperand?*/
	;


funcoperand
	:
	funccall
	(
		DOT
		(
			funccall
			| qualifiedidentifier
		)
	)*
	;


operand
	:
	LBRACK operandinner RBRACK
	| operandinner
	;


operandinner
	:
	funcoperand
	| constvalue
	| ( qualifiedidentifier ( DOT qualifiedidentifier )* )
	| newoperator
	;


expr
	:
	(
		logicpre
		| unaryop
		| '+'
		| '-'
	)?
	(
		bareexpr
		| brackexpr
	)
	( unaryop )?
	;


bareexpr
	:
	operand ( unaryop )? ( opidentifier expr )?
	;


brackexpr
	:
	LBRACK expr RBRACK ( opidentifier expr )?
	;


logicpre
	:
	(
		'!'
		| '~'
	)
	;


codelabel
	:
	IDENTIFIER COLON
	;


stringval
	:
	STRINGVAL
	| '\''
	(
		ESC_SEQ
		| ~( '\''  )
	)*
	'\''
	;


STRINGVAL
	:
	'"'
	(
		ESC_SEQ
		|
		~(
			'\\'
			| '"'
			| '\r'
			| '\n'
		 )
	)*
	'"'
	;


fragment ALPHA
	:
	'a'..'z'
	| 'A'..'Z'
	;


fragment DIGIT
	:
	'0'..'9'
	;


SEMICOLON
	:
	';'
	;


COLON
	:
	':'
	;


fragment UNDERSCORE
	:
	'_'
	;


LBRACK
	:
	'('
	;


RBRACK
	:
	')'
	;


LABRACK
	:
	'<'
	;


RABRACK
	:
	'>'
	;


LCBRACK
	:
	'{'
	;


RCBRACK
	:
	'}'
	;


LSBRACK
	:
	'['
	;


RSBRACK
	:
	']'
	;


DOT
	:
	'.'
	;


COMMA
	:
	','
	;


SQUOTE
	:
	'\''
	;


DQUOTE
	:
	'"'
	;


EQUALS
	:
	'='
	;


constclassparams
	:
	'classgroup'
	| 'abstract'
	| 'native'
	| 'nativereplication'
	| 'safereplace'
	| 'perobjectconfig'
	| 'transient'
	| 'noexport'
	| 'exportstructs'
	|
 // available from warfare and up:
 'collapsecategories'
	| 'dontcollapsecategories'
	| 'placeable'
	| 'notplaceable'
	| 'editinlinenew'
	| 'noteditinlinenew'
	| 'inherits'
	| 'implements'
	| 'nontransient'
	;


varparams
	:
	'config'
	| 'const'
	| 'export'
	| 'globalconfig'
	| 'input'
	| 'localized'
	| 'native'
	| 'private'
	| 'protected'
	| 'public'
	| 'transient'
	| 'travel'
	|
 // available from warfare and up:
 'editinline'
	| 'deprecated'
	| 'edfindable'
	| 'editinlineuse'
	| 'editfixedsize'
	| 'repnotify'
	| 'instanced'
	| 'databinding'
	| 'editoronly'
	| 'notforconsole'
	| 'editconst'
	| 'noclear'
	| 'interp'
	| 'duplicatetransient'
	| 'noimport'
	| 'noexport'
	| 'nontransactional'
	| 'init'
	| 'repretry'
	| 'allowabstract'
	| 'optional'
	| 'out'
	| 'coerce'
	| 'skip'
	| 'protectedwrite'
	| 'serializetext'
	| 'crosslevelpassive'
	| 'edithide'
	| 'edittextbox'
	| 'reliable'
	;


stateparams
	:
	'auto'
	| 'simulated'
	;


constfunctparams
	:
	'final'
	| 'iterator'
	| 'latent'
	| 'simulated'
	| 'singular'
	| 'static'
	| 'transient'
	| 'exec'
	| 'protected'
	| 'private'
	| 'public'
	| 'noexport'
	| 'k2call'
	| 'k2pure'
	| 'k2overrride'
	| 'coerce'
	| 'virtual'
	| 'noexportheader'
	| 'reliable'
	| 'client'
	| 'server'
	| 'unreliable'
	;


basictype
	:
	'name'
	| 'byte'
	| 'int'
	| 'float'
	| 'string'
	| 'bool'
	| 'class'
	| 'interface'
	| 'pointer'
	;


functiontype
	:
	'function'
	| 'event'
	| 'delegate'
	;


operatornames
	:
	'~='
	| '<<'
	| '>>'
	| '!='
	| '<='
	| '>='
	| '?-'
	| '&&'
	| '||'
	| '^^'
	| '=='
	| '**'
	| '@='
	| '>>>'
	| '$='
	| '~'
	| '!'
	| '@'
	| '#'
	| '$'
	| '%'
	| '^'
	| '&'
	| '*'
	| '!'
	| '-'
	| '='
	| '+'
	| '|'
	| '\\'
	| ':'
	| '<'
	| '>'
	| '/'
	| '?'
	| assignop
	| unaryop
	;


assignop
	:
	'+='
	| '-='
	| '*='
	| '/='
	| '~='
	| '@='
	| '$='
	;


unaryop
	:
	'++'
	| '--'
	;


INTVAL
	:
	(
		DIGIT+
		| HEX_LITERAL
	)
	;


FLOATVAL
	:
	( DIGIT )+ DOT ( DIGIT )* 'f'?
	;


boolval
	:
	'true'
	| 'false'
	;


nameval
	:
	SQUOTE ( fixedidentifier )? SQUOTE
	;

// ugly work around-
// in unrealscript from some reasons "reserved words" are not being respected.
// so we need to be able to support identifiers with reserved words which confuses the parser without redeclaring them as valid identifiers.


fixedidentifier
	:
	IDENTIFIER
	| 'switch'
	| 'auto'
	| varparams
	| basictype
	| 'static'
	| 'default'
	| 'event'
	| 'state'
	| 'function'
	| 'delegate'
	| 'input'
	| 'interface'
	| 'client'
	;
/*PROPLITERAL
	:	.+ '\n'
    ;*/



STRUCTCPPTEXT
	:
	( 'structcpptext' WS1* INNERBLOCKTEXT ) 
                                         {
                                          $channel = HIDDEN;
                                         }
	;


CPPTEXT
	:
	( 'cpptext' WS1* INNERBLOCKTEXT ) 
                                   {
                                    $channel = HIDDEN;
                                   }
	;


ESC_SEQ
	:
	'\\'
	(
		'b'
		| 't'
		| 'n'
		| 'f'
		| 'r'
		| '"'
		| '\''
		| '\\'
		| '`'
	)
	;


WS
	:
	(
		' '
		| '\t'
		| '\r'
		| '\n'
	)
	
  {
   $channel = HIDDEN;
  }
	;


fragment WS1
	:
	(
		' '
		| '\t'
		| '\r'
		| '\n'
	)
	;


fragment HEX_LITERAL
	:
	'0'
	(
		'x'
		| 'X'
	)
	HexDigit+
	;


fragment HexDigit
	:
	(
		'0'..'9'
		| 'a'..'f'
		| 'A'..'F'
	)
	;


IDENTIFIER
	:
	'`'?
	(
		ALPHA
		| UNDERSCORE
	)
	(
		ALPHA
		| UNDERSCORE
		| DIGIT
	)*
	;


fragment INNERBLOCKTEXT
	:
	LCBRACK
	(
		~(
			LCBRACK
			| RCBRACK
		 )
		| INNERBLOCKTEXT
	)*
	RCBRACK
	;

//fragment
//INNERBLOCKTEXT
//	:  LCBRACK  ~(LCBRACK | RCBRACK)* RCBRACK ;


COMMENT
	:
	'//'
	~(
		'\n'
		| '\r'
	 )*
	'\r'? '\n' 
            {
             $channel = HIDDEN;
            }
	| ( '`if' ) => '`if'
	~(
		'\n'
		| '\r'
	 )*
	'\r'? '\n' 
            {
             $channel = HIDDEN;
            }
	| ( '`else' ) => '`else'
	~(
		'\n'
		| '\r'
	 )*
	'\r'? '\n' 
            {
             $channel = HIDDEN;
            }
	| ( '`endif' ) => '`endif'
	~(
		'\n'
		| '\r'
	 )*
	'\r'? '\n' 
            {
             $channel = HIDDEN;
            }
	| ( '`define' ) => '`define'
	~(
		'\n'
		| '\r'
	 )*
	'\r'? '\n' 
            {
             $channel = HIDDEN;
            }
	| ( '`debugstate' ) => '`debugstate'
	~(
		'\n'
		| '\r'
	 )*
	'\r'? '\n' 
            {
             $channel = HIDDEN;
            }
	| ( '`' WS1* INNERBLOCKTEXT ) => '`' WS1* INNERBLOCKTEXT 
                                                          {
                                                           $channel = HIDDEN;
                                                          }
	| '/*' (options {	greedy=false;}: . )* '*/' 
                                             {
                                              $channel = HIDDEN;
                                             }
	;
