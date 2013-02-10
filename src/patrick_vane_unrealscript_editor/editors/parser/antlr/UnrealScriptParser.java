// $ANTLR 3.5 C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g 2013-02-10 06:35:19

	package patrick_vane_unrealscript_editor.editors.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class UnrealScriptParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHA", "COLON", "COMMA", "COMMENT", 
		"CPPTEXT", "DIGIT", "DOT", "DQUOTE", "EQUALS", "ESC_SEQ", "FLOATVAL", 
		"HEX_LITERAL", "HexDigit", "IDENTIFIER", "INNERBLOCKTEXT", "INTVAL", "LABRACK", 
		"LBRACK", "LCBRACK", "LSBRACK", "RABRACK", "RBRACK", "RCBRACK", "RSBRACK", 
		"SEMICOLON", "SQUOTE", "STRINGVAL", "STRUCTCPPTEXT", "UNDERSCORE", "WS", 
		"WS1", "'!'", "'!='", "'#'", "'$'", "'$='", "'%'", "'&&'", "'&'", "'*'", 
		"'**'", "'*='", "'+'", "'++'", "'+='", "'-'", "'--'", "'-='", "'/'", "'/='", 
		"'<<'", "'<='", "'=='", "'>='", "'>>'", "'>>>'", "'?'", "'?-'", "'@'", 
		"'@='", "'\\\\'", "'^'", "'^^'", "'`'", "'abstract'", "'allowabstract'", 
		"'array'", "'atomic'", "'atomicwhencooked'", "'auto'", "'bool'", "'break'", 
		"'byte'", "'case'", "'class'", "'classgroup'", "'client'", "'coerce'", 
		"'collapsecategories'", "'config'", "'const'", "'continue'", "'crosslevelpassive'", 
		"'databinding'", "'default'", "'defaultproperties'", "'delegate'", "'dependson'", 
		"'deprecated'", "'do'", "'dontcollapsecategories'", "'duplicatetransient'", 
		"'edfindable'", "'editconst'", "'editfixedsize'", "'edithide'", "'editinline'", 
		"'editinlinenew'", "'editinlineuse'", "'editoronly'", "'edittextbox'", 
		"'else'", "'enum'", "'event'", "'exec'", "'export'", "'exportstructs'", 
		"'extends'", "'false'", "'final'", "'float'", "'for'", "'foreach'", "'function'", 
		"'globalconfig'", "'hidecategories'", "'if'", "'ignores'", "'immutable'", 
		"'immutablewhencooked'", "'implements'", "'inherits'", "'init'", "'input'", 
		"'instanced'", "'int'", "'interface'", "'interp'", "'iterator'", "'k2call'", 
		"'k2overrride'", "'k2pure'", "'latent'", "'local'", "'localized'", "'name'", 
		"'native'", "'nativereplication'", "'new'", "'noclear'", "'noexport'", 
		"'noexportheader'", "'noimport'", "'nontransactional'", "'nontransient'", 
		"'noteditinlinenew'", "'notforconsole'", "'notplaceable'", "'operator'", 
		"'optional'", "'out'", "'perobjectconfig'", "'placeable'", "'pointer'", 
		"'postoperator'", "'preoperator'", "'private'", "'property'", "'protected'", 
		"'protectedwrite'", "'public'", "'reliable'", "'replication'", "'repnotify'", 
		"'repretry'", "'return'", "'safereplace'", "'serializetext'", "'server'", 
		"'showcategories'", "'simulated'", "'singular'", "'skip'", "'state'", 
		"'static'", "'strictconfig'", "'string'", "'struct'", "'structdefaultproperties'", 
		"'switch'", "'transient'", "'travel'", "'true'", "'unreliable'", "'until'", 
		"'var'", "'virtual'", "'while'", "'within'", "'|'", "'||'", "'~'", "'~='"
	};
	public static final int EOF=-1;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int T__125=125;
	public static final int T__126=126;
	public static final int T__127=127;
	public static final int T__128=128;
	public static final int T__129=129;
	public static final int T__130=130;
	public static final int T__131=131;
	public static final int T__132=132;
	public static final int T__133=133;
	public static final int T__134=134;
	public static final int T__135=135;
	public static final int T__136=136;
	public static final int T__137=137;
	public static final int T__138=138;
	public static final int T__139=139;
	public static final int T__140=140;
	public static final int T__141=141;
	public static final int T__142=142;
	public static final int T__143=143;
	public static final int T__144=144;
	public static final int T__145=145;
	public static final int T__146=146;
	public static final int T__147=147;
	public static final int T__148=148;
	public static final int T__149=149;
	public static final int T__150=150;
	public static final int T__151=151;
	public static final int T__152=152;
	public static final int T__153=153;
	public static final int T__154=154;
	public static final int T__155=155;
	public static final int T__156=156;
	public static final int T__157=157;
	public static final int T__158=158;
	public static final int T__159=159;
	public static final int T__160=160;
	public static final int T__161=161;
	public static final int T__162=162;
	public static final int T__163=163;
	public static final int T__164=164;
	public static final int T__165=165;
	public static final int T__166=166;
	public static final int T__167=167;
	public static final int T__168=168;
	public static final int T__169=169;
	public static final int T__170=170;
	public static final int T__171=171;
	public static final int T__172=172;
	public static final int T__173=173;
	public static final int T__174=174;
	public static final int T__175=175;
	public static final int T__176=176;
	public static final int T__177=177;
	public static final int T__178=178;
	public static final int T__179=179;
	public static final int T__180=180;
	public static final int T__181=181;
	public static final int T__182=182;
	public static final int T__183=183;
	public static final int T__184=184;
	public static final int T__185=185;
	public static final int T__186=186;
	public static final int T__187=187;
	public static final int T__188=188;
	public static final int T__189=189;
	public static final int T__190=190;
	public static final int T__191=191;
	public static final int T__192=192;
	public static final int T__193=193;
	public static final int T__194=194;
	public static final int T__195=195;
	public static final int T__196=196;
	public static final int ALPHA=4;
	public static final int COLON=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int CPPTEXT=8;
	public static final int DIGIT=9;
	public static final int DOT=10;
	public static final int DQUOTE=11;
	public static final int EQUALS=12;
	public static final int ESC_SEQ=13;
	public static final int FLOATVAL=14;
	public static final int HEX_LITERAL=15;
	public static final int HexDigit=16;
	public static final int IDENTIFIER=17;
	public static final int INNERBLOCKTEXT=18;
	public static final int INTVAL=19;
	public static final int LABRACK=20;
	public static final int LBRACK=21;
	public static final int LCBRACK=22;
	public static final int LSBRACK=23;
	public static final int RABRACK=24;
	public static final int RBRACK=25;
	public static final int RCBRACK=26;
	public static final int RSBRACK=27;
	public static final int SEMICOLON=28;
	public static final int SQUOTE=29;
	public static final int STRINGVAL=30;
	public static final int STRUCTCPPTEXT=31;
	public static final int UNDERSCORE=32;
	public static final int WS=33;
	public static final int WS1=34;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public UnrealScriptParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public UnrealScriptParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[456+1];


	}

	@Override public String[] getTokenNames() { return UnrealScriptParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g"; }


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



	// $ANTLR start "prog"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:75:1: prog : classdecl ( declerations )* ( replicationblock )? ( body )* ( defaultpropertiesblock )? ;
	public final void prog() throws RecognitionException {
		int prog_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:76:2: ( classdecl ( declerations )* ( replicationblock )? ( body )* ( defaultpropertiesblock )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:77:2: classdecl ( declerations )* ( replicationblock )? ( body )* ( defaultpropertiesblock )?
			{
			pushFollow(FOLLOW_classdecl_in_prog62);
			classdecl();
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:77:12: ( declerations )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==84||LA1_0==106||LA1_0==181||LA1_0==189) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:77:14: declerations
					{
					pushFollow(FOLLOW_declerations_in_prog66);
					declerations();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:77:30: ( replicationblock )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==166) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:77:32: replicationblock
					{
					pushFollow(FOLLOW_replicationblock_in_prog73);
					replicationblock();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:77:52: ( body )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==73||(LA3_0 >= 80 && LA3_0 <= 81)||LA3_0==90||(LA3_0 >= 107 && LA3_0 <= 108)||LA3_0==113||LA3_0==117||(LA3_0 >= 132 && LA3_0 <= 136)||LA3_0==140||(LA3_0 >= 144 && LA3_0 <= 145)||LA3_0==152||(LA3_0 >= 158 && LA3_0 <= 160)||LA3_0==162||(LA3_0 >= 164 && LA3_0 <= 165)||LA3_0==172||(LA3_0 >= 174 && LA3_0 <= 175)||(LA3_0 >= 177 && LA3_0 <= 178)||LA3_0==184||LA3_0==187||LA3_0==190) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:77:54: body
					{
					pushFollow(FOLLOW_body_in_prog80);
					body();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:77:62: ( defaultpropertiesblock )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==89) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:77:64: defaultpropertiesblock
					{
					pushFollow(FOLLOW_defaultpropertiesblock_in_prog87);
					defaultpropertiesblock();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }

		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "defaultpropertiesblock"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:83:1: defaultpropertiesblock : 'defaultproperties' LCBRACK (~ ( RCBRACK ) )* RCBRACK ( SEMICOLON )? ;
	public final void defaultpropertiesblock() throws RecognitionException {
		int defaultpropertiesblock_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:84:2: ( 'defaultproperties' LCBRACK (~ ( RCBRACK ) )* RCBRACK ( SEMICOLON )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:85:2: 'defaultproperties' LCBRACK (~ ( RCBRACK ) )* RCBRACK ( SEMICOLON )?
			{
			match(input,89,FOLLOW_89_in_defaultpropertiesblock105); if (state.failed) return;
			match(input,LCBRACK,FOLLOW_LCBRACK_in_defaultpropertiesblock107); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:85:30: (~ ( RCBRACK ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= ALPHA && LA5_0 <= RBRACK)||(LA5_0 >= RSBRACK && LA5_0 <= 196)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
					{
					if ( (input.LA(1) >= ALPHA && input.LA(1) <= RBRACK)||(input.LA(1) >= RSBRACK && input.LA(1) <= 196) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,RCBRACK,FOLLOW_RCBRACK_in_defaultpropertiesblock118); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:85:53: ( SEMICOLON )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==SEMICOLON) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:85:53: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_defaultpropertiesblock120); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, defaultpropertiesblock_StartIndex); }

		}
	}
	// $ANTLR end "defaultpropertiesblock"



	// $ANTLR start "structdefaultpropertiesblock"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:91:1: structdefaultpropertiesblock : 'structdefaultproperties' LCBRACK (~ ( RCBRACK ) )* RCBRACK ( SEMICOLON )? ;
	public final void structdefaultpropertiesblock() throws RecognitionException {
		int structdefaultpropertiesblock_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:92:2: ( 'structdefaultproperties' LCBRACK (~ ( RCBRACK ) )* RCBRACK ( SEMICOLON )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:93:2: 'structdefaultproperties' LCBRACK (~ ( RCBRACK ) )* RCBRACK ( SEMICOLON )?
			{
			match(input,182,FOLLOW_182_in_structdefaultpropertiesblock136); if (state.failed) return;
			match(input,LCBRACK,FOLLOW_LCBRACK_in_structdefaultpropertiesblock138); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:93:36: (~ ( RCBRACK ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= ALPHA && LA7_0 <= RBRACK)||(LA7_0 >= RSBRACK && LA7_0 <= 196)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
					{
					if ( (input.LA(1) >= ALPHA && input.LA(1) <= RBRACK)||(input.LA(1) >= RSBRACK && input.LA(1) <= 196) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			match(input,RCBRACK,FOLLOW_RCBRACK_in_structdefaultpropertiesblock149); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:93:59: ( SEMICOLON )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==SEMICOLON) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:93:59: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_structdefaultpropertiesblock151); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, structdefaultpropertiesblock_StartIndex); }

		}
	}
	// $ANTLR end "structdefaultpropertiesblock"



	// $ANTLR start "classdecl"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:99:1: classdecl : ( 'class' | 'interface' ) (idName= fixedidentifier ) ( ( 'extends' ) superClass= packageidentifier )? ( COMMA superClass= packageidentifier )* ( classparams )* SEMICOLON ;
	public final void classdecl() throws RecognitionException {
		int classdecl_StartIndex = input.index();

		ParserRuleReturnScope idName =null;
		ParserRuleReturnScope superClass =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:100:2: ( ( 'class' | 'interface' ) (idName= fixedidentifier ) ( ( 'extends' ) superClass= packageidentifier )? ( COMMA superClass= packageidentifier )* ( classparams )* SEMICOLON )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:101:2: ( 'class' | 'interface' ) (idName= fixedidentifier ) ( ( 'extends' ) superClass= packageidentifier )? ( COMMA superClass= packageidentifier )* ( classparams )* SEMICOLON
			{
			if ( input.LA(1)==78||input.LA(1)==130 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:105:2: (idName= fixedidentifier )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:105:4: idName= fixedidentifier
			{
			pushFollow(FOLLOW_fixedidentifier_in_classdecl189);
			idName=fixedidentifier();
			state._fsp--;
			if (state.failed) return;
			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:105:31: ( ( 'extends' ) superClass= packageidentifier )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==111) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:105:33: ( 'extends' ) superClass= packageidentifier
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:105:33: ( 'extends' )
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:105:35: 'extends'
					{
					match(input,111,FOLLOW_111_in_classdecl197); if (state.failed) return;
					}

					pushFollow(FOLLOW_packageidentifier_in_classdecl205);
					superClass=packageidentifier();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					                                                                              superClasses.add((superClass!=null?input.toString(superClass.start,superClass.stop):null));
					                                                                             }
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:108:83: ( COMMA superClass= packageidentifier )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:108:85: COMMA superClass= packageidentifier
					{
					match(input,COMMA,FOLLOW_COMMA_in_classdecl292); if (state.failed) return;
					pushFollow(FOLLOW_packageidentifier_in_classdecl298);
					superClass=packageidentifier();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					                                                                                                                          superClasses.add((superClass!=null?input.toString(superClass.start,superClass.stop):null));
					                                                                                                                         }
					}
					break;

				default :
					break loop10;
				}
			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:111:127: ( classparams )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==IDENTIFIER||(LA11_0 >= 68 && LA11_0 <= 69)||(LA11_0 >= 73 && LA11_0 <= 74)||LA11_0==76||(LA11_0 >= 78 && LA11_0 <= 84)||(LA11_0 >= 86 && LA11_0 <= 88)||(LA11_0 >= 90 && LA11_0 <= 92)||(LA11_0 >= 94 && LA11_0 <= 104)||LA11_0==107||(LA11_0 >= 109 && LA11_0 <= 110)||LA11_0==114||(LA11_0 >= 117 && LA11_0 <= 119)||(LA11_0 >= 124 && LA11_0 <= 131)||(LA11_0 >= 138 && LA11_0 <= 141)||(LA11_0 >= 143 && LA11_0 <= 144)||(LA11_0 >= 146 && LA11_0 <= 151)||(LA11_0 >= 153 && LA11_0 <= 157)||LA11_0==160||(LA11_0 >= 162 && LA11_0 <= 165)||(LA11_0 >= 167 && LA11_0 <= 168)||(LA11_0 >= 170 && LA11_0 <= 171)||LA11_0==173||(LA11_0 >= 176 && LA11_0 <= 178)||LA11_0==180||(LA11_0 >= 183 && LA11_0 <= 185)||LA11_0==192) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:111:129: classparams
					{
					pushFollow(FOLLOW_classparams_in_classdecl429);
					classparams();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop11;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_classdecl434); if (state.failed) return;
			if ( state.backtracking==0 ) {
			                                                                                                                                                          className = (idName!=null?input.toString(idName.start,idName.stop):null);
			                                                                                                                                                          declStartToken = (idName!=null?(idName.start):null);
			                                                                                                                                                         }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, classdecl_StartIndex); }

		}
	}
	// $ANTLR end "classdecl"



	// $ANTLR start "classparams"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:119:1: classparams : ( constclassparams ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )? | 'within' packageidentifier | 'dependson' LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK | 'config' ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )? | 'hidecategories' LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK | 'showcategories' LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK | fixedidentifier ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )? );
	public final void classparams() throws RecognitionException {
		int classparams_StartIndex = input.index();

		ParserRuleReturnScope packageidentifier1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:120:2: ( constclassparams ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )? | 'within' packageidentifier | 'dependson' LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK | 'config' ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )? | 'hidecategories' LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK | 'showcategories' LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK | fixedidentifier ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )? )
			int alt21=7;
			switch ( input.LA(1) ) {
			case 140:
			case 144:
			case 184:
				{
				int LA21_1 = input.LA(2);
				if ( (synpred18_UnrealScript()) ) {
					alt21=1;
				}
				else if ( (true) ) {
					alt21=7;
				}

				}
				break;
			case 192:
				{
				alt21=2;
				}
				break;
			case 91:
				{
				alt21=3;
				}
				break;
			case 83:
				{
				int LA21_4 = input.LA(2);
				if ( (synpred26_UnrealScript()) ) {
					alt21=4;
				}
				else if ( (true) ) {
					alt21=7;
				}

				}
				break;
			case 119:
				{
				alt21=5;
				}
				break;
			case 173:
				{
				alt21=6;
				}
				break;
			case IDENTIFIER:
			case 69:
			case 73:
			case 74:
			case 76:
			case 78:
			case 80:
			case 81:
			case 84:
			case 86:
			case 87:
			case 88:
			case 90:
			case 92:
			case 95:
			case 96:
			case 97:
			case 98:
			case 99:
			case 100:
			case 102:
			case 103:
			case 104:
			case 107:
			case 109:
			case 114:
			case 117:
			case 118:
			case 126:
			case 127:
			case 128:
			case 129:
			case 130:
			case 131:
			case 138:
			case 139:
			case 143:
			case 146:
			case 147:
			case 150:
			case 153:
			case 154:
			case 157:
			case 160:
			case 162:
			case 163:
			case 164:
			case 165:
			case 167:
			case 168:
			case 171:
			case 176:
			case 177:
			case 178:
			case 180:
			case 183:
			case 185:
				{
				alt21=7;
				}
				break;
			case 68:
			case 79:
			case 82:
			case 94:
			case 101:
			case 110:
			case 124:
			case 125:
			case 141:
			case 148:
			case 149:
			case 151:
			case 155:
			case 156:
			case 170:
				{
				alt21=1;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:121:2: constclassparams ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )?
					{
					pushFollow(FOLLOW_constclassparams_in_classparams603);
					constclassparams();
					state._fsp--;
					if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:122:2: ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==LBRACK) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:123:3: LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_classparams610); if (state.failed) return;
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:124:3: (~ ( LBRACK | RBRACK ) )*
							loop12:
							while (true) {
								int alt12=2;
								int LA12_0 = input.LA(1);
								if ( ((LA12_0 >= ALPHA && LA12_0 <= LABRACK)||(LA12_0 >= LCBRACK && LA12_0 <= RABRACK)||(LA12_0 >= RCBRACK && LA12_0 <= 196)) ) {
									alt12=1;
								}

								switch (alt12) {
								case 1 :
									// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
									{
									if ( (input.LA(1) >= ALPHA && input.LA(1) <= LABRACK)||(input.LA(1) >= LCBRACK && input.LA(1) <= RABRACK)||(input.LA(1) >= RCBRACK && input.LA(1) <= 196) ) {
										input.consume();
										state.errorRecovery=false;
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									}
									break;

								default :
									break loop12;
								}
							}

							match(input,RBRACK,FOLLOW_RBRACK_in_classparams649); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:132:4: 'within' packageidentifier
					{
					match(input,192,FOLLOW_192_in_classparams658); if (state.failed) return;
					pushFollow(FOLLOW_packageidentifier_in_classparams660);
					packageidentifier1=packageidentifier();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					                               superClasses.add((packageidentifier1!=null?input.toString(packageidentifier1.start,packageidentifier1.stop):null));
					                              }
					}
					break;
				case 3 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:136:4: 'dependson' LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK
					{
					match(input,91,FOLLOW_91_in_classparams698); if (state.failed) return;
					match(input,LBRACK,FOLLOW_LBRACK_in_classparams700); if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:137:2: (~ ( LBRACK | RBRACK ) )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= ALPHA && LA14_0 <= LABRACK)||(LA14_0 >= LCBRACK && LA14_0 <= RABRACK)||(LA14_0 >= RCBRACK && LA14_0 <= 196)) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
							{
							if ( (input.LA(1) >= ALPHA && input.LA(1) <= LABRACK)||(input.LA(1) >= LCBRACK && input.LA(1) <= RABRACK)||(input.LA(1) >= RCBRACK && input.LA(1) <= 196) ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

						default :
							break loop14;
						}
					}

					match(input,RBRACK,FOLLOW_RBRACK_in_classparams732); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:144:4: 'config' ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )?
					{
					match(input,83,FOLLOW_83_in_classparams737); if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:145:2: ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==LBRACK) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:146:3: LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_classparams744); if (state.failed) return;
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:147:3: (~ ( LBRACK | RBRACK ) )*
							loop15:
							while (true) {
								int alt15=2;
								int LA15_0 = input.LA(1);
								if ( ((LA15_0 >= ALPHA && LA15_0 <= LABRACK)||(LA15_0 >= LCBRACK && LA15_0 <= RABRACK)||(LA15_0 >= RCBRACK && LA15_0 <= 196)) ) {
									alt15=1;
								}

								switch (alt15) {
								case 1 :
									// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
									{
									if ( (input.LA(1) >= ALPHA && input.LA(1) <= LABRACK)||(input.LA(1) >= LCBRACK && input.LA(1) <= RABRACK)||(input.LA(1) >= RCBRACK && input.LA(1) <= 196) ) {
										input.consume();
										state.errorRecovery=false;
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									}
									break;

								default :
									break loop15;
								}
							}

							match(input,RBRACK,FOLLOW_RBRACK_in_classparams783); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:155:4: 'hidecategories' LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK
					{
					match(input,119,FOLLOW_119_in_classparams792); if (state.failed) return;
					match(input,LBRACK,FOLLOW_LBRACK_in_classparams794); if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:156:2: (~ ( LBRACK | RBRACK ) )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( ((LA17_0 >= ALPHA && LA17_0 <= LABRACK)||(LA17_0 >= LCBRACK && LA17_0 <= RABRACK)||(LA17_0 >= RCBRACK && LA17_0 <= 196)) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
							{
							if ( (input.LA(1) >= ALPHA && input.LA(1) <= LABRACK)||(input.LA(1) >= LCBRACK && input.LA(1) <= RABRACK)||(input.LA(1) >= RCBRACK && input.LA(1) <= 196) ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

						default :
							break loop17;
						}
					}

					match(input,RBRACK,FOLLOW_RBRACK_in_classparams826); if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:163:4: 'showcategories' LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK
					{
					match(input,173,FOLLOW_173_in_classparams831); if (state.failed) return;
					match(input,LBRACK,FOLLOW_LBRACK_in_classparams833); if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:164:2: (~ ( LBRACK | RBRACK ) )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= ALPHA && LA18_0 <= LABRACK)||(LA18_0 >= LCBRACK && LA18_0 <= RABRACK)||(LA18_0 >= RCBRACK && LA18_0 <= 196)) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
							{
							if ( (input.LA(1) >= ALPHA && input.LA(1) <= LABRACK)||(input.LA(1) >= LCBRACK && input.LA(1) <= RABRACK)||(input.LA(1) >= RCBRACK && input.LA(1) <= 196) ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

						default :
							break loop18;
						}
					}

					match(input,RBRACK,FOLLOW_RBRACK_in_classparams865); if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:171:4: fixedidentifier ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )?
					{
					pushFollow(FOLLOW_fixedidentifier_in_classparams870);
					fixedidentifier();
					state._fsp--;
					if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:172:2: ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LBRACK) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:173:3: LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_classparams877); if (state.failed) return;
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:174:3: (~ ( LBRACK | RBRACK ) )*
							loop19:
							while (true) {
								int alt19=2;
								int LA19_0 = input.LA(1);
								if ( ((LA19_0 >= ALPHA && LA19_0 <= LABRACK)||(LA19_0 >= LCBRACK && LA19_0 <= RABRACK)||(LA19_0 >= RCBRACK && LA19_0 <= 196)) ) {
									alt19=1;
								}

								switch (alt19) {
								case 1 :
									// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
									{
									if ( (input.LA(1) >= ALPHA && input.LA(1) <= LABRACK)||(input.LA(1) >= LCBRACK && input.LA(1) <= RABRACK)||(input.LA(1) >= RCBRACK && input.LA(1) <= 196) ) {
										input.consume();
										state.errorRecovery=false;
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									}
									break;

								default :
									break loop19;
								}
							}

							match(input,RBRACK,FOLLOW_RBRACK_in_classparams916); if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, classparams_StartIndex); }

		}
	}
	// $ANTLR end "classparams"



	// $ANTLR start "identifierlist"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:185:1: identifierlist : fixedidentifier ( COMMA fixedidentifier )* ;
	public final void identifierlist() throws RecognitionException {
		int identifierlist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:186:2: ( fixedidentifier ( COMMA fixedidentifier )* )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:187:2: fixedidentifier ( COMMA fixedidentifier )*
			{
			pushFollow(FOLLOW_fixedidentifier_in_identifierlist933);
			fixedidentifier();
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:187:18: ( COMMA fixedidentifier )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMMA) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:187:20: COMMA fixedidentifier
					{
					match(input,COMMA,FOLLOW_COMMA_in_identifierlist937); if (state.failed) return;
					pushFollow(FOLLOW_fixedidentifier_in_identifierlist939);
					fixedidentifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, identifierlist_StartIndex); }

		}
	}
	// $ANTLR end "identifierlist"


	public static class packageidentifier_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "packageidentifier"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:191:1: packageidentifier : ( fixedidentifier ( DOT fixedidentifier )* | 'property' );
	public final UnrealScriptParser.packageidentifier_return packageidentifier() throws RecognitionException {
		UnrealScriptParser.packageidentifier_return retval = new UnrealScriptParser.packageidentifier_return();
		retval.start = input.LT(1);
		int packageidentifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:192:2: ( fixedidentifier ( DOT fixedidentifier )* | 'property' )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==IDENTIFIER||LA24_0==69||(LA24_0 >= 73 && LA24_0 <= 74)||LA24_0==76||LA24_0==78||(LA24_0 >= 80 && LA24_0 <= 81)||(LA24_0 >= 83 && LA24_0 <= 84)||(LA24_0 >= 86 && LA24_0 <= 88)||LA24_0==90||LA24_0==92||(LA24_0 >= 95 && LA24_0 <= 100)||(LA24_0 >= 102 && LA24_0 <= 104)||LA24_0==107||LA24_0==109||LA24_0==114||(LA24_0 >= 117 && LA24_0 <= 118)||(LA24_0 >= 126 && LA24_0 <= 131)||(LA24_0 >= 138 && LA24_0 <= 140)||(LA24_0 >= 143 && LA24_0 <= 144)||(LA24_0 >= 146 && LA24_0 <= 147)||LA24_0==150||(LA24_0 >= 153 && LA24_0 <= 154)||LA24_0==157||LA24_0==160||(LA24_0 >= 162 && LA24_0 <= 165)||(LA24_0 >= 167 && LA24_0 <= 168)||LA24_0==171||(LA24_0 >= 176 && LA24_0 <= 178)||LA24_0==180||(LA24_0 >= 183 && LA24_0 <= 185)) ) {
				alt24=1;
			}
			else if ( (LA24_0==161) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:193:2: fixedidentifier ( DOT fixedidentifier )*
					{
					pushFollow(FOLLOW_fixedidentifier_in_packageidentifier955);
					fixedidentifier();
					state._fsp--;
					if (state.failed) return retval;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:193:18: ( DOT fixedidentifier )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==DOT) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:193:20: DOT fixedidentifier
							{
							match(input,DOT,FOLLOW_DOT_in_packageidentifier959); if (state.failed) return retval;
							pushFollow(FOLLOW_fixedidentifier_in_packageidentifier961);
							fixedidentifier();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop23;
						}
					}

					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:194:4: 'property'
					{
					match(input,161,FOLLOW_161_in_packageidentifier969); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, packageidentifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "packageidentifier"



	// $ANTLR start "vardecl"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:198:1: vardecl[List<AntlrUCVarDecl> varContainer] : 'var' ( configgroup )? ( varparams ( LCBRACK varparams RCBRACK )? )* vartype var_id= varidentifier ( COMMA var_id= varidentifier )* SEMICOLON ;
	public final void vardecl(List<AntlrUCVarDecl> varContainer) throws RecognitionException {
		int vardecl_StartIndex = input.index();

		ParserRuleReturnScope var_id =null;
		ParserRuleReturnScope vartype2 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:199:2: ( 'var' ( configgroup )? ( varparams ( LCBRACK varparams RCBRACK )? )* vartype var_id= varidentifier ( COMMA var_id= varidentifier )* SEMICOLON )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:200:2: 'var' ( configgroup )? ( varparams ( LCBRACK varparams RCBRACK )? )* vartype var_id= varidentifier ( COMMA var_id= varidentifier )* SEMICOLON
			{
			match(input,189,FOLLOW_189_in_vardecl983); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:200:8: ( configgroup )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==LBRACK) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:200:10: configgroup
					{
					pushFollow(FOLLOW_configgroup_in_vardecl987);
					configgroup();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:200:25: ( varparams ( LCBRACK varparams RCBRACK )? )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==127) ) {
					int LA27_5 = input.LA(2);
					if ( (synpred41_UnrealScript()) ) {
						alt27=1;
					}

				}
				else if ( (LA27_0==69||LA27_0==81||(LA27_0 >= 83 && LA27_0 <= 84)||(LA27_0 >= 86 && LA27_0 <= 87)||LA27_0==92||(LA27_0 >= 95 && LA27_0 <= 100)||(LA27_0 >= 102 && LA27_0 <= 104)||LA27_0==109||LA27_0==118||LA27_0==126||LA27_0==128||LA27_0==131||LA27_0==138||LA27_0==140||(LA27_0 >= 143 && LA27_0 <= 144)||(LA27_0 >= 146 && LA27_0 <= 147)||LA27_0==150||(LA27_0 >= 153 && LA27_0 <= 154)||LA27_0==160||(LA27_0 >= 162 && LA27_0 <= 165)||(LA27_0 >= 167 && LA27_0 <= 168)||LA27_0==171||LA27_0==176||(LA27_0 >= 184 && LA27_0 <= 185)) ) {
					int LA27_13 = input.LA(2);
					if ( (synpred41_UnrealScript()) ) {
						alt27=1;
					}

				}

				switch (alt27) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:200:27: varparams ( LCBRACK varparams RCBRACK )?
					{
					pushFollow(FOLLOW_varparams_in_vardecl994);
					varparams();
					state._fsp--;
					if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:200:37: ( LCBRACK varparams RCBRACK )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==LCBRACK) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:200:39: LCBRACK varparams RCBRACK
							{
							match(input,LCBRACK,FOLLOW_LCBRACK_in_vardecl998); if (state.failed) return;
							pushFollow(FOLLOW_varparams_in_vardecl1000);
							varparams();
							state._fsp--;
							if (state.failed) return;
							match(input,RCBRACK,FOLLOW_RCBRACK_in_vardecl1002); if (state.failed) return;
							}
							break;

					}

					}
					break;

				default :
					break loop27;
				}
			}

			pushFollow(FOLLOW_vartype_in_vardecl1010);
			vartype2=vartype();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_varidentifier_in_vardecl1016);
			var_id=varidentifier();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			                                                                                                      varContainer.add(new AntlrUCVarDecl((var_id!=null?((UnrealScriptParser.varidentifier_return)var_id).varName:null), (vartype2!=null?((UnrealScriptParser.vartype_return)vartype2).typename:null),
			                                                                                                      		(vartype2!=null?((UnrealScriptParser.vartype_return)vartype2).arrayInner:null), (var_id!=null?((UnrealScriptParser.varidentifier_return)var_id).isArray:false), (var_id!=null?((UnrealScriptParser.varidentifier_return)var_id).startToken:null)));
			                                                                                                     }
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:205:2: ( COMMA var_id= varidentifier )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==COMMA) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:205:4: COMMA var_id= varidentifier
					{
					match(input,COMMA,FOLLOW_COMMA_in_vardecl1125); if (state.failed) return;
					pushFollow(FOLLOW_varidentifier_in_vardecl1131);
					var_id=varidentifier();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					                                 varContainer.add(new AntlrUCVarDecl((var_id!=null?((UnrealScriptParser.varidentifier_return)var_id).varName:null), (vartype2!=null?((UnrealScriptParser.vartype_return)vartype2).typename:null),
					                                 		(vartype2!=null?((UnrealScriptParser.vartype_return)vartype2).arrayInner:null), (var_id!=null?((UnrealScriptParser.varidentifier_return)var_id).isArray:false), (var_id!=null?((UnrealScriptParser.varidentifier_return)var_id).startToken:null)));
					                                }
					}
					break;

				default :
					break loop28;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_vardecl1171); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, vardecl_StartIndex); }

		}
	}
	// $ANTLR end "vardecl"


	public static class vartype_return extends ParserRuleReturnScope {
		public String typename;
		public String arrayInner;
	};


	// $ANTLR start "vartype"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:213:1: vartype returns [String typename,String arrayInner] : ( classtype | packageidentifier ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )? | enumdecl | structdecl | arraydecl | basictype | delegatedecl );
	public final UnrealScriptParser.vartype_return vartype() throws RecognitionException {
		UnrealScriptParser.vartype_return retval = new UnrealScriptParser.vartype_return();
		retval.start = input.LT(1);
		int vartype_StartIndex = input.index();

		ParserRuleReturnScope classtype3 =null;
		ParserRuleReturnScope packageidentifier4 =null;
		String enumdecl5 =null;
		ParserRuleReturnScope structdecl6 =null;
		String arraydecl7 =null;
		ParserRuleReturnScope basictype8 =null;
		ParserRuleReturnScope delegatedecl9 =null;


		retval.arrayInner = null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:218:2: ( classtype | packageidentifier ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )? | enumdecl | structdecl | arraydecl | basictype | delegatedecl )
			int alt31=7;
			switch ( input.LA(1) ) {
			case 78:
				{
				int LA31_1 = input.LA(2);
				if ( (LA31_1==LABRACK) ) {
					alt31=1;
				}
				else if ( (synpred47_UnrealScript()) ) {
					alt31=2;
				}
				else if ( (synpred51_UnrealScript()) ) {
					alt31=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IDENTIFIER:
			case 69:
			case 73:
			case 80:
			case 81:
			case 83:
			case 84:
			case 86:
			case 87:
			case 88:
			case 92:
			case 95:
			case 96:
			case 97:
			case 98:
			case 99:
			case 100:
			case 102:
			case 103:
			case 104:
			case 107:
			case 109:
			case 117:
			case 118:
			case 126:
			case 127:
			case 128:
			case 131:
			case 138:
			case 140:
			case 143:
			case 144:
			case 146:
			case 147:
			case 150:
			case 153:
			case 154:
			case 160:
			case 161:
			case 162:
			case 163:
			case 164:
			case 165:
			case 167:
			case 168:
			case 171:
			case 176:
			case 177:
			case 178:
			case 183:
			case 184:
			case 185:
				{
				alt31=2;
				}
				break;
			case 130:
				{
				int LA31_3 = input.LA(2);
				if ( (synpred47_UnrealScript()) ) {
					alt31=2;
				}
				else if ( (synpred51_UnrealScript()) ) {
					alt31=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 90:
				{
				int LA31_4 = input.LA(2);
				if ( (LA31_4==LABRACK) ) {
					int LA31_11 = input.LA(3);
					if ( (LA31_11==IDENTIFIER||(LA31_11 >= 69 && LA31_11 <= 70)||(LA31_11 >= 73 && LA31_11 <= 74)||LA31_11==76||LA31_11==78||(LA31_11 >= 80 && LA31_11 <= 81)||(LA31_11 >= 83 && LA31_11 <= 84)||(LA31_11 >= 86 && LA31_11 <= 88)||LA31_11==90||LA31_11==92||(LA31_11 >= 95 && LA31_11 <= 100)||(LA31_11 >= 102 && LA31_11 <= 104)||(LA31_11 >= 106 && LA31_11 <= 107)||LA31_11==109||LA31_11==114||(LA31_11 >= 117 && LA31_11 <= 118)||(LA31_11 >= 126 && LA31_11 <= 131)||(LA31_11 >= 138 && LA31_11 <= 140)||(LA31_11 >= 143 && LA31_11 <= 144)||(LA31_11 >= 146 && LA31_11 <= 147)||LA31_11==150||(LA31_11 >= 153 && LA31_11 <= 154)||LA31_11==157||(LA31_11 >= 160 && LA31_11 <= 165)||(LA31_11 >= 167 && LA31_11 <= 168)||LA31_11==171||(LA31_11 >= 176 && LA31_11 <= 178)||(LA31_11 >= 180 && LA31_11 <= 181)||(LA31_11 >= 183 && LA31_11 <= 185)) ) {
						alt31=7;
					}
					else if ( (LA31_11==LBRACK) ) {
						alt31=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA31_4==EOF||LA31_4==COLON||LA31_4==DOT||LA31_4==EQUALS||LA31_4==IDENTIFIER||(LA31_4 >= LBRACK && LA31_4 <= LCBRACK)||LA31_4==RABRACK||(LA31_4 >= 35 && LA31_4 <= 66)||LA31_4==69||(LA31_4 >= 73 && LA31_4 <= 74)||LA31_4==76||LA31_4==78||(LA31_4 >= 80 && LA31_4 <= 81)||(LA31_4 >= 83 && LA31_4 <= 84)||(LA31_4 >= 86 && LA31_4 <= 88)||LA31_4==90||LA31_4==92||(LA31_4 >= 95 && LA31_4 <= 100)||(LA31_4 >= 102 && LA31_4 <= 104)||LA31_4==107||LA31_4==109||LA31_4==114||(LA31_4 >= 117 && LA31_4 <= 118)||(LA31_4 >= 126 && LA31_4 <= 131)||(LA31_4 >= 138 && LA31_4 <= 140)||(LA31_4 >= 143 && LA31_4 <= 144)||(LA31_4 >= 146 && LA31_4 <= 147)||LA31_4==150||(LA31_4 >= 153 && LA31_4 <= 154)||LA31_4==157||LA31_4==160||(LA31_4 >= 162 && LA31_4 <= 165)||(LA31_4 >= 167 && LA31_4 <= 168)||LA31_4==171||(LA31_4 >= 176 && LA31_4 <= 178)||LA31_4==180||(LA31_4 >= 183 && LA31_4 <= 185)||(LA31_4 >= 193 && LA31_4 <= 196)) ) {
					alt31=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 74:
			case 76:
			case 114:
			case 129:
			case 139:
			case 157:
			case 180:
				{
				int LA31_5 = input.LA(2);
				if ( (synpred47_UnrealScript()) ) {
					alt31=2;
				}
				else if ( (synpred51_UnrealScript()) ) {
					alt31=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 106:
				{
				alt31=3;
				}
				break;
			case 181:
				{
				alt31=4;
				}
				break;
			case 70:
				{
				alt31=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:219:2: classtype
					{
					pushFollow(FOLLOW_classtype_in_vartype1193);
					classtype3=classtype();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					            retval.typename = (classtype3!=null?input.toString(classtype3.start,classtype3.stop):null);
					           }
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:223:4: packageidentifier ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )?
					{
					pushFollow(FOLLOW_packageidentifier_in_vartype1212);
					packageidentifier4=packageidentifier();
					state._fsp--;
					if (state.failed) return retval;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:224:2: ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==LCBRACK) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:225:3: LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK
							{
							match(input,LCBRACK,FOLLOW_LCBRACK_in_vartype1219); if (state.failed) return retval;
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:226:3: (~ ( LCBRACK | RCBRACK ) )*
							loop29:
							while (true) {
								int alt29=2;
								int LA29_0 = input.LA(1);
								if ( ((LA29_0 >= ALPHA && LA29_0 <= LBRACK)||(LA29_0 >= LSBRACK && LA29_0 <= RBRACK)||(LA29_0 >= RSBRACK && LA29_0 <= 196)) ) {
									alt29=1;
								}

								switch (alt29) {
								case 1 :
									// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
									{
									if ( (input.LA(1) >= ALPHA && input.LA(1) <= LBRACK)||(input.LA(1) >= LSBRACK && input.LA(1) <= RBRACK)||(input.LA(1) >= RSBRACK && input.LA(1) <= 196) ) {
										input.consume();
										state.errorRecovery=false;
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									}
									break;

								default :
									break loop29;
								}
							}

							match(input,RCBRACK,FOLLOW_RCBRACK_in_vartype1258); if (state.failed) return retval;
							}
							break;

					}

					if ( state.backtracking==0 ) {
					   retval.typename = (packageidentifier4!=null?input.toString(packageidentifier4.start,packageidentifier4.stop):null);
					  }
					}
					break;
				case 3 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:238:4: enumdecl
					{
					pushFollow(FOLLOW_enumdecl_in_vartype1273);
					enumdecl5=enumdecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					             retval.typename = enumdecl5;
					            }
					}
					break;
				case 4 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:242:4: structdecl
					{
					pushFollow(FOLLOW_structdecl_in_vartype1293);
					structdecl6=structdecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					               retval.typename = (structdecl6!=null?input.toString(structdecl6.start,structdecl6.stop):null);
					              }
					}
					break;
				case 5 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:246:4: arraydecl
					{
					pushFollow(FOLLOW_arraydecl_in_vartype1315);
					arraydecl7=arraydecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					              retval.typename = "array";
					              retval.arrayInner = arraydecl7;
					             }
					}
					break;
				case 6 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:251:4: basictype
					{
					pushFollow(FOLLOW_basictype_in_vartype1336);
					basictype8=basictype();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					              retval.typename = (basictype8!=null?input.toString(basictype8.start,basictype8.stop):null);
					             }
					}
					break;
				case 7 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:255:4: delegatedecl
					{
					pushFollow(FOLLOW_delegatedecl_in_vartype1357);
					delegatedecl9=delegatedecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                 retval.typename = (delegatedecl9!=null?input.toString(delegatedecl9.start,delegatedecl9.stop):null);
					                }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, vartype_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "vartype"


	public static class varidentifier_return extends ParserRuleReturnScope {
		public String varName;
		public boolean isArray;
		public Token startToken;
	};


	// $ANTLR start "varidentifier"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:262:1: varidentifier returns [String varName, boolean isArray, Token startToken] : (varId= fixedidentifier ( LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK )? ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )? ( LABRACK (~ ( LABRACK | RABRACK ) )* RABRACK )? | (varFixed= varfixid ) );
	public final UnrealScriptParser.varidentifier_return varidentifier() throws RecognitionException {
		UnrealScriptParser.varidentifier_return retval = new UnrealScriptParser.varidentifier_return();
		retval.start = input.LT(1);
		int varidentifier_StartIndex = input.index();

		ParserRuleReturnScope varId =null;
		ParserRuleReturnScope varFixed =null;


		retval.isArray = false;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:267:2: (varId= fixedidentifier ( LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK )? ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )? ( LABRACK (~ ( LABRACK | RABRACK ) )* RABRACK )? | (varFixed= varfixid ) )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==IDENTIFIER||LA38_0==69||LA38_0==73||LA38_0==76||(LA38_0 >= 80 && LA38_0 <= 81)||(LA38_0 >= 83 && LA38_0 <= 84)||(LA38_0 >= 86 && LA38_0 <= 88)||LA38_0==90||LA38_0==92||(LA38_0 >= 95 && LA38_0 <= 100)||(LA38_0 >= 102 && LA38_0 <= 104)||LA38_0==107||LA38_0==109||LA38_0==114||(LA38_0 >= 117 && LA38_0 <= 118)||(LA38_0 >= 126 && LA38_0 <= 131)||LA38_0==138||LA38_0==140||(LA38_0 >= 143 && LA38_0 <= 144)||(LA38_0 >= 146 && LA38_0 <= 147)||LA38_0==150||(LA38_0 >= 153 && LA38_0 <= 154)||LA38_0==157||LA38_0==160||(LA38_0 >= 162 && LA38_0 <= 165)||(LA38_0 >= 167 && LA38_0 <= 168)||LA38_0==171||(LA38_0 >= 176 && LA38_0 <= 178)||LA38_0==180||(LA38_0 >= 183 && LA38_0 <= 185)) ) {
				alt38=1;
			}
			else if ( (LA38_0==74||LA38_0==78||LA38_0==139) ) {
				int LA38_2 = input.LA(2);
				if ( (synpred60_UnrealScript()) ) {
					alt38=1;
				}
				else if ( (true) ) {
					alt38=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:268:2: varId= fixedidentifier ( LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK )? ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )? ( LABRACK (~ ( LABRACK | RABRACK ) )* RABRACK )?
					{
					pushFollow(FOLLOW_fixedidentifier_in_varidentifier1402);
					varId=fixedidentifier();
					state._fsp--;
					if (state.failed) return retval;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:269:2: ( LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==LSBRACK) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:270:3: LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK
							{
							match(input,LSBRACK,FOLLOW_LSBRACK_in_varidentifier1409); if (state.failed) return retval;
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:271:3: ( INTVAL | qualifiedidentifier )
							int alt32=2;
							int LA32_0 = input.LA(1);
							if ( (LA32_0==INTVAL) ) {
								alt32=1;
							}
							else if ( (LA32_0==IDENTIFIER||LA32_0==69||(LA32_0 >= 73 && LA32_0 <= 74)||LA32_0==76||LA32_0==78||(LA32_0 >= 80 && LA32_0 <= 81)||(LA32_0 >= 83 && LA32_0 <= 84)||(LA32_0 >= 86 && LA32_0 <= 88)||LA32_0==90||LA32_0==92||(LA32_0 >= 95 && LA32_0 <= 100)||(LA32_0 >= 102 && LA32_0 <= 104)||(LA32_0 >= 106 && LA32_0 <= 107)||LA32_0==109||LA32_0==114||(LA32_0 >= 117 && LA32_0 <= 118)||(LA32_0 >= 126 && LA32_0 <= 131)||(LA32_0 >= 138 && LA32_0 <= 140)||(LA32_0 >= 143 && LA32_0 <= 144)||(LA32_0 >= 146 && LA32_0 <= 147)||LA32_0==150||(LA32_0 >= 153 && LA32_0 <= 154)||LA32_0==157||(LA32_0 >= 160 && LA32_0 <= 165)||(LA32_0 >= 167 && LA32_0 <= 168)||LA32_0==171||(LA32_0 >= 176 && LA32_0 <= 178)||LA32_0==180||(LA32_0 >= 183 && LA32_0 <= 185)) ) {
								alt32=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 32, 0, input);
								throw nvae;
							}

							switch (alt32) {
								case 1 :
									// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:272:4: INTVAL
									{
									match(input,INTVAL,FOLLOW_INTVAL_in_varidentifier1418); if (state.failed) return retval;
									}
									break;
								case 2 :
									// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:273:6: qualifiedidentifier
									{
									pushFollow(FOLLOW_qualifiedidentifier_in_varidentifier1425);
									qualifiedidentifier();
									state._fsp--;
									if (state.failed) return retval;
									}
									break;

							}

							match(input,RSBRACK,FOLLOW_RSBRACK_in_varidentifier1433); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							           retval.isArray = true;
							          }
							}
							break;

					}

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:280:2: ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==LCBRACK) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:281:3: LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK
							{
							match(input,LCBRACK,FOLLOW_LCBRACK_in_varidentifier1457); if (state.failed) return retval;
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:282:3: (~ ( LCBRACK | RCBRACK ) )*
							loop34:
							while (true) {
								int alt34=2;
								int LA34_0 = input.LA(1);
								if ( ((LA34_0 >= ALPHA && LA34_0 <= LBRACK)||(LA34_0 >= LSBRACK && LA34_0 <= RBRACK)||(LA34_0 >= RSBRACK && LA34_0 <= 196)) ) {
									alt34=1;
								}

								switch (alt34) {
								case 1 :
									// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
									{
									if ( (input.LA(1) >= ALPHA && input.LA(1) <= LBRACK)||(input.LA(1) >= LSBRACK && input.LA(1) <= RBRACK)||(input.LA(1) >= RSBRACK && input.LA(1) <= 196) ) {
										input.consume();
										state.errorRecovery=false;
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									}
									break;

								default :
									break loop34;
								}
							}

							match(input,RCBRACK,FOLLOW_RCBRACK_in_varidentifier1496); if (state.failed) return retval;
							}
							break;

					}

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:290:2: ( LABRACK (~ ( LABRACK | RABRACK ) )* RABRACK )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==LABRACK) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:291:3: LABRACK (~ ( LABRACK | RABRACK ) )* RABRACK
							{
							match(input,LABRACK,FOLLOW_LABRACK_in_varidentifier1507); if (state.failed) return retval;
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:292:3: (~ ( LABRACK | RABRACK ) )*
							loop36:
							while (true) {
								int alt36=2;
								int LA36_0 = input.LA(1);
								if ( ((LA36_0 >= ALPHA && LA36_0 <= INTVAL)||(LA36_0 >= LBRACK && LA36_0 <= LSBRACK)||(LA36_0 >= RBRACK && LA36_0 <= 196)) ) {
									alt36=1;
								}

								switch (alt36) {
								case 1 :
									// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
									{
									if ( (input.LA(1) >= ALPHA && input.LA(1) <= INTVAL)||(input.LA(1) >= LBRACK && input.LA(1) <= LSBRACK)||(input.LA(1) >= RBRACK && input.LA(1) <= 196) ) {
										input.consume();
										state.errorRecovery=false;
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									}
									break;

								default :
									break loop36;
								}
							}

							match(input,RABRACK,FOLLOW_RABRACK_in_varidentifier1546); if (state.failed) return retval;
							}
							break;

					}

					if ( state.backtracking==0 ) {
					   retval.varName = (varId!=null?input.toString(varId.start,varId.stop):null);
					   retval.startToken = (varId!=null?(varId.start):null);
					  }
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:305:4: (varFixed= varfixid )
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:305:4: (varFixed= varfixid )
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:305:6: varFixed= varfixid
					{
					pushFollow(FOLLOW_varfixid_in_varidentifier1567);
					varFixed=varfixid();
					state._fsp--;
					if (state.failed) return retval;
					}

					if ( state.backtracking==0 ) {
					                            retval.varName = (varFixed!=null?input.toString(varFixed.start,varFixed.stop):null);
					                            retval.startToken = (varFixed!=null?(varFixed.start):null);
					                           }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, varidentifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "varidentifier"


	public static class varfixid_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "varfixid"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:313:1: varfixid : ( 'name' | 'class' | 'bool' );
	public final UnrealScriptParser.varfixid_return varfixid() throws RecognitionException {
		UnrealScriptParser.varfixid_return retval = new UnrealScriptParser.varfixid_return();
		retval.start = input.LT(1);
		int varfixid_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:314:2: ( 'name' | 'class' | 'bool' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( input.LA(1)==74||input.LA(1)==78||input.LA(1)==139 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, varfixid_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "varfixid"



	// $ANTLR start "configgroup"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:321:1: configgroup : LBRACK ( fixedidentifier ( COMMA fixedidentifier )* )? RBRACK ;
	public final void configgroup() throws RecognitionException {
		int configgroup_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:322:2: ( LBRACK ( fixedidentifier ( COMMA fixedidentifier )* )? RBRACK )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:323:2: LBRACK ( fixedidentifier ( COMMA fixedidentifier )* )? RBRACK
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_configgroup1635); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:323:9: ( fixedidentifier ( COMMA fixedidentifier )* )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==IDENTIFIER||LA40_0==69||(LA40_0 >= 73 && LA40_0 <= 74)||LA40_0==76||LA40_0==78||(LA40_0 >= 80 && LA40_0 <= 81)||(LA40_0 >= 83 && LA40_0 <= 84)||(LA40_0 >= 86 && LA40_0 <= 88)||LA40_0==90||LA40_0==92||(LA40_0 >= 95 && LA40_0 <= 100)||(LA40_0 >= 102 && LA40_0 <= 104)||LA40_0==107||LA40_0==109||LA40_0==114||(LA40_0 >= 117 && LA40_0 <= 118)||(LA40_0 >= 126 && LA40_0 <= 131)||(LA40_0 >= 138 && LA40_0 <= 140)||(LA40_0 >= 143 && LA40_0 <= 144)||(LA40_0 >= 146 && LA40_0 <= 147)||LA40_0==150||(LA40_0 >= 153 && LA40_0 <= 154)||LA40_0==157||LA40_0==160||(LA40_0 >= 162 && LA40_0 <= 165)||(LA40_0 >= 167 && LA40_0 <= 168)||LA40_0==171||(LA40_0 >= 176 && LA40_0 <= 178)||LA40_0==180||(LA40_0 >= 183 && LA40_0 <= 185)) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:323:11: fixedidentifier ( COMMA fixedidentifier )*
					{
					pushFollow(FOLLOW_fixedidentifier_in_configgroup1639);
					fixedidentifier();
					state._fsp--;
					if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:323:27: ( COMMA fixedidentifier )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==COMMA) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:323:29: COMMA fixedidentifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_configgroup1643); if (state.failed) return;
							pushFollow(FOLLOW_fixedidentifier_in_configgroup1645);
							fixedidentifier();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop39;
						}
					}

					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_configgroup1653); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, configgroup_StartIndex); }

		}
	}
	// $ANTLR end "configgroup"



	// $ANTLR start "declerations"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:327:1: declerations : ( vardecl[variables] | ( constdecl | enumdecl | structdecl ) SEMICOLON );
	public final void declerations() throws RecognitionException {
		int declerations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:328:2: ( vardecl[variables] | ( constdecl | enumdecl | structdecl ) SEMICOLON )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==189) ) {
				alt42=1;
			}
			else if ( (LA42_0==84||LA42_0==106||LA42_0==181) ) {
				alt42=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:329:2: vardecl[variables]
					{
					pushFollow(FOLLOW_vardecl_in_declerations1666);
					vardecl(variables);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:331:2: ( constdecl | enumdecl | structdecl ) SEMICOLON
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:331:2: ( constdecl | enumdecl | structdecl )
					int alt41=3;
					switch ( input.LA(1) ) {
					case 84:
						{
						alt41=1;
						}
						break;
					case 106:
						{
						alt41=2;
						}
						break;
					case 181:
						{
						alt41=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 41, 0, input);
						throw nvae;
					}
					switch (alt41) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:332:3: constdecl
							{
							pushFollow(FOLLOW_constdecl_in_declerations1677);
							constdecl();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:333:5: enumdecl
							{
							pushFollow(FOLLOW_enumdecl_in_declerations1683);
							enumdecl();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 3 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:334:5: structdecl
							{
							pushFollow(FOLLOW_structdecl_in_declerations1689);
							structdecl();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declerations1695); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, declerations_StartIndex); }

		}
	}
	// $ANTLR end "declerations"



	// $ANTLR start "constdecl"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:340:1: constdecl : 'const' fixedidentifier EQUALS constvalue ;
	public final void constdecl() throws RecognitionException {
		int constdecl_StartIndex = input.index();

		ParserRuleReturnScope fixedidentifier10 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:341:2: ( 'const' fixedidentifier EQUALS constvalue )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:342:2: 'const' fixedidentifier EQUALS constvalue
			{
			match(input,84,FOLLOW_84_in_constdecl1708); if (state.failed) return;
			pushFollow(FOLLOW_fixedidentifier_in_constdecl1710);
			fixedidentifier10=fixedidentifier();
			state._fsp--;
			if (state.failed) return;
			match(input,EQUALS,FOLLOW_EQUALS_in_constdecl1712); if (state.failed) return;
			pushFollow(FOLLOW_constvalue_in_constdecl1714);
			constvalue();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			                                            consts.add((fixedidentifier10!=null?input.toString(fixedidentifier10.start,fixedidentifier10.stop):null));
			                                           }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, constdecl_StartIndex); }

		}
	}
	// $ANTLR end "constdecl"



	// $ANTLR start "constvalue"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:349:1: constvalue : ( ( '-' )? FLOATVAL | stringval | ( '-' )? INTVAL | boolval | nameval ) ;
	public final void constvalue() throws RecognitionException {
		int constvalue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:350:2: ( ( ( '-' )? FLOATVAL | stringval | ( '-' )? INTVAL | boolval | nameval ) )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:351:2: ( ( '-' )? FLOATVAL | stringval | ( '-' )? INTVAL | boolval | nameval )
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:351:2: ( ( '-' )? FLOATVAL | stringval | ( '-' )? INTVAL | boolval | nameval )
			int alt45=5;
			switch ( input.LA(1) ) {
			case 49:
				{
				int LA45_1 = input.LA(2);
				if ( (LA45_1==FLOATVAL) ) {
					alt45=1;
				}
				else if ( (LA45_1==INTVAL) ) {
					alt45=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOATVAL:
				{
				alt45=1;
				}
				break;
			case STRINGVAL:
				{
				alt45=2;
				}
				break;
			case SQUOTE:
				{
				switch ( input.LA(2) ) {
				case IDENTIFIER:
					{
					int LA45_7 = input.LA(3);
					if ( (LA45_7==SQUOTE) ) {
						int LA45_22 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_7 >= ALPHA && LA45_7 <= SEMICOLON)||(LA45_7 >= STRINGVAL && LA45_7 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case SQUOTE:
					{
					int LA45_8 = input.LA(3);
					if ( (synpred70_UnrealScript()) ) {
						alt45=2;
					}
					else if ( (true) ) {
						alt45=5;
					}

					}
					break;
				case 183:
					{
					int LA45_9 = input.LA(3);
					if ( (LA45_9==SQUOTE) ) {
						int LA45_24 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_9 >= ALPHA && LA45_9 <= SEMICOLON)||(LA45_9 >= STRINGVAL && LA45_9 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 73:
					{
					int LA45_10 = input.LA(3);
					if ( (LA45_10==SQUOTE) ) {
						int LA45_25 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_10 >= ALPHA && LA45_10 <= SEMICOLON)||(LA45_10 >= STRINGVAL && LA45_10 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 127:
					{
					int LA45_11 = input.LA(3);
					if ( (LA45_11==SQUOTE) ) {
						int LA45_26 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_11 >= ALPHA && LA45_11 <= SEMICOLON)||(LA45_11 >= STRINGVAL && LA45_11 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 130:
					{
					int LA45_12 = input.LA(3);
					if ( (LA45_12==SQUOTE) ) {
						int LA45_27 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_12 >= ALPHA && LA45_12 <= SEMICOLON)||(LA45_12 >= STRINGVAL && LA45_12 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 178:
					{
					int LA45_13 = input.LA(3);
					if ( (LA45_13==SQUOTE) ) {
						int LA45_28 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_13 >= ALPHA && LA45_13 <= SEMICOLON)||(LA45_13 >= STRINGVAL && LA45_13 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 88:
					{
					int LA45_14 = input.LA(3);
					if ( (LA45_14==SQUOTE) ) {
						int LA45_29 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_14 >= ALPHA && LA45_14 <= SEMICOLON)||(LA45_14 >= STRINGVAL && LA45_14 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 107:
					{
					int LA45_15 = input.LA(3);
					if ( (LA45_15==SQUOTE) ) {
						int LA45_30 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_15 >= ALPHA && LA45_15 <= SEMICOLON)||(LA45_15 >= STRINGVAL && LA45_15 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 177:
					{
					int LA45_16 = input.LA(3);
					if ( (LA45_16==SQUOTE) ) {
						int LA45_31 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_16 >= ALPHA && LA45_16 <= SEMICOLON)||(LA45_16 >= STRINGVAL && LA45_16 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 117:
					{
					int LA45_17 = input.LA(3);
					if ( (LA45_17==SQUOTE) ) {
						int LA45_32 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_17 >= ALPHA && LA45_17 <= SEMICOLON)||(LA45_17 >= STRINGVAL && LA45_17 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 90:
					{
					int LA45_18 = input.LA(3);
					if ( (LA45_18==SQUOTE) ) {
						int LA45_33 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_18 >= ALPHA && LA45_18 <= SEMICOLON)||(LA45_18 >= STRINGVAL && LA45_18 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 80:
					{
					int LA45_19 = input.LA(3);
					if ( (LA45_19==SQUOTE) ) {
						int LA45_34 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_19 >= ALPHA && LA45_19 <= SEMICOLON)||(LA45_19 >= STRINGVAL && LA45_19 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 19, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 69:
				case 81:
				case 83:
				case 84:
				case 86:
				case 87:
				case 92:
				case 95:
				case 96:
				case 97:
				case 98:
				case 99:
				case 100:
				case 102:
				case 103:
				case 104:
				case 109:
				case 118:
				case 126:
				case 128:
				case 131:
				case 138:
				case 140:
				case 143:
				case 144:
				case 146:
				case 147:
				case 150:
				case 153:
				case 154:
				case 160:
				case 162:
				case 163:
				case 164:
				case 165:
				case 167:
				case 168:
				case 171:
				case 176:
				case 184:
				case 185:
					{
					int LA45_20 = input.LA(3);
					if ( (LA45_20==SQUOTE) ) {
						int LA45_35 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_20 >= ALPHA && LA45_20 <= SEMICOLON)||(LA45_20 >= STRINGVAL && LA45_20 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 20, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 74:
				case 76:
				case 78:
				case 114:
				case 129:
				case 139:
				case 157:
				case 180:
					{
					int LA45_21 = input.LA(3);
					if ( (LA45_21==SQUOTE) ) {
						int LA45_36 = input.LA(4);
						if ( (synpred70_UnrealScript()) ) {
							alt45=2;
						}
						else if ( (true) ) {
							alt45=5;
						}

					}
					else if ( ((LA45_21 >= ALPHA && LA45_21 <= SEMICOLON)||(LA45_21 >= STRINGVAL && LA45_21 <= 196)) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 21, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case ALPHA:
				case COLON:
				case COMMA:
				case COMMENT:
				case CPPTEXT:
				case DIGIT:
				case DOT:
				case DQUOTE:
				case EQUALS:
				case ESC_SEQ:
				case FLOATVAL:
				case HEX_LITERAL:
				case HexDigit:
				case INNERBLOCKTEXT:
				case INTVAL:
				case LABRACK:
				case LBRACK:
				case LCBRACK:
				case LSBRACK:
				case RABRACK:
				case RBRACK:
				case RCBRACK:
				case RSBRACK:
				case SEMICOLON:
				case STRINGVAL:
				case STRUCTCPPTEXT:
				case UNDERSCORE:
				case WS:
				case WS1:
				case 35:
				case 36:
				case 37:
				case 38:
				case 39:
				case 40:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 46:
				case 47:
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 67:
				case 68:
				case 70:
				case 71:
				case 72:
				case 75:
				case 77:
				case 79:
				case 82:
				case 85:
				case 89:
				case 91:
				case 93:
				case 94:
				case 101:
				case 105:
				case 106:
				case 108:
				case 110:
				case 111:
				case 112:
				case 113:
				case 115:
				case 116:
				case 119:
				case 120:
				case 121:
				case 122:
				case 123:
				case 124:
				case 125:
				case 132:
				case 133:
				case 134:
				case 135:
				case 136:
				case 137:
				case 141:
				case 142:
				case 145:
				case 148:
				case 149:
				case 151:
				case 152:
				case 155:
				case 156:
				case 158:
				case 159:
				case 161:
				case 166:
				case 169:
				case 170:
				case 172:
				case 173:
				case 174:
				case 175:
				case 179:
				case 181:
				case 182:
				case 186:
				case 187:
				case 188:
				case 189:
				case 190:
				case 191:
				case 192:
				case 193:
				case 194:
				case 195:
				case 196:
					{
					alt45=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case INTVAL:
				{
				alt45=3;
				}
				break;
			case 112:
			case 186:
				{
				alt45=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:352:3: ( '-' )? FLOATVAL
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:352:3: ( '-' )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==49) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:352:3: '-'
							{
							match(input,49,FOLLOW_49_in_constvalue1777); if (state.failed) return;
							}
							break;

					}

					match(input,FLOATVAL,FOLLOW_FLOATVAL_in_constvalue1780); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:353:5: stringval
					{
					pushFollow(FOLLOW_stringval_in_constvalue1786);
					stringval();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:354:5: ( '-' )? INTVAL
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:354:5: ( '-' )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==49) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:354:5: '-'
							{
							match(input,49,FOLLOW_49_in_constvalue1792); if (state.failed) return;
							}
							break;

					}

					match(input,INTVAL,FOLLOW_INTVAL_in_constvalue1795); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:355:5: boolval
					{
					pushFollow(FOLLOW_boolval_in_constvalue1801);
					boolval();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:356:5: nameval
					{
					pushFollow(FOLLOW_nameval_in_constvalue1807);
					nameval();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, constvalue_StartIndex); }

		}
	}
	// $ANTLR end "constvalue"



	// $ANTLR start "enumdecl"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:361:1: enumdecl returns [String typename] : 'enum' fixedidentifier LCBRACK enumoptions[$fixedidentifier.text] RCBRACK ;
	public final String enumdecl() throws RecognitionException {
		String typename = null;

		int enumdecl_StartIndex = input.index();

		ParserRuleReturnScope fixedidentifier11 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return typename; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:362:2: ( 'enum' fixedidentifier LCBRACK enumoptions[$fixedidentifier.text] RCBRACK )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:363:2: 'enum' fixedidentifier LCBRACK enumoptions[$fixedidentifier.text] RCBRACK
			{
			match(input,106,FOLLOW_106_in_enumdecl1827); if (state.failed) return typename;
			pushFollow(FOLLOW_fixedidentifier_in_enumdecl1829);
			fixedidentifier11=fixedidentifier();
			state._fsp--;
			if (state.failed) return typename;
			match(input,LCBRACK,FOLLOW_LCBRACK_in_enumdecl1831); if (state.failed) return typename;
			pushFollow(FOLLOW_enumoptions_in_enumdecl1833);
			enumoptions((fixedidentifier11!=null?input.toString(fixedidentifier11.start,fixedidentifier11.stop):null));
			state._fsp--;
			if (state.failed) return typename;
			match(input,RCBRACK,FOLLOW_RCBRACK_in_enumdecl1836); if (state.failed) return typename;
			if ( state.backtracking==0 ) {
			                                                                            typename = (fixedidentifier11!=null?input.toString(fixedidentifier11.start,fixedidentifier11.stop):null);
			                                                                           }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, enumdecl_StartIndex); }

		}
		return typename;
	}
	// $ANTLR end "enumdecl"


	public static class structdecl_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "structdecl"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:370:1: structdecl : 'struct' ( structparams )* ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )? fixedidentifier ( 'extends' packageidentifier )? LCBRACK ( structbody[newStruct] )? RCBRACK ;
	public final UnrealScriptParser.structdecl_return structdecl() throws RecognitionException {
		UnrealScriptParser.structdecl_return retval = new UnrealScriptParser.structdecl_return();
		retval.start = input.LT(1);
		int structdecl_StartIndex = input.index();

		ParserRuleReturnScope fixedidentifier12 =null;


		AntlrUCStructDecl newStruct = new AntlrUCStructDecl();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:375:2: ( 'struct' ( structparams )* ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )? fixedidentifier ( 'extends' packageidentifier )? LCBRACK ( structbody[newStruct] )? RCBRACK )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:376:2: 'struct' ( structparams )* ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )? fixedidentifier ( 'extends' packageidentifier )? LCBRACK ( structbody[newStruct] )? RCBRACK
			{
			match(input,181,FOLLOW_181_in_structdecl1932); if (state.failed) return retval;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:376:11: ( structparams )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==109||LA46_0==140||LA46_0==184) ) {
					int LA46_13 = input.LA(2);
					if ( (synpred74_UnrealScript()) ) {
						alt46=1;
					}

				}
				else if ( ((LA46_0 >= 71 && LA46_0 <= 72)||(LA46_0 >= 122 && LA46_0 <= 123)||LA46_0==179) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:376:13: structparams
					{
					pushFollow(FOLLOW_structparams_in_structdecl1936);
					structparams();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop46;
				}
			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:377:2: ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==LCBRACK) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:378:3: LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK
					{
					match(input,LCBRACK,FOLLOW_LCBRACK_in_structdecl1946); if (state.failed) return retval;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:379:3: (~ ( LCBRACK | RCBRACK ) )*
					loop47:
					while (true) {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( ((LA47_0 >= ALPHA && LA47_0 <= LBRACK)||(LA47_0 >= LSBRACK && LA47_0 <= RBRACK)||(LA47_0 >= RSBRACK && LA47_0 <= 196)) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
							{
							if ( (input.LA(1) >= ALPHA && input.LA(1) <= LBRACK)||(input.LA(1) >= LSBRACK && input.LA(1) <= RBRACK)||(input.LA(1) >= RSBRACK && input.LA(1) <= 196) ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

						default :
							break loop47;
						}
					}

					match(input,RCBRACK,FOLLOW_RCBRACK_in_structdecl1985); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_fixedidentifier_in_structdecl1992);
			fixedidentifier12=fixedidentifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                  newStruct.structName = (fixedidentifier12!=null?input.toString(fixedidentifier12.start,fixedidentifier12.stop):null);
			                  newStruct.declStartToken = (fixedidentifier12!=null?(fixedidentifier12.start):null);
			                 }
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:392:2: ( 'extends' packageidentifier )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==111) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:392:4: 'extends' packageidentifier
					{
					match(input,111,FOLLOW_111_in_structdecl2017); if (state.failed) return retval;
					pushFollow(FOLLOW_packageidentifier_in_structdecl2019);
					packageidentifier();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input,LCBRACK,FOLLOW_LCBRACK_in_structdecl2024); if (state.failed) return retval;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:392:43: ( structbody[newStruct] )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==189) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:392:43: structbody[newStruct]
					{
					pushFollow(FOLLOW_structbody_in_structdecl2026);
					structbody(newStruct);
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input,RCBRACK,FOLLOW_RCBRACK_in_structdecl2030); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                                                                          structs.add(newStruct);
			                                                                         }
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, structdecl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "structdecl"



	// $ANTLR start "enumoptions"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:399:1: enumoptions[String enumName] : id= fixedidentifier ( displayoption )? ( COMMA id= fixedidentifier ( displayoption )? )* ( COMMA )? ;
	public final void enumoptions(String enumName) throws RecognitionException {
		int enumoptions_StartIndex = input.index();

		ParserRuleReturnScope id =null;


		List<String> lst = new ArrayList<String>();
		enumsMap.put(enumName, lst);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:405:2: (id= fixedidentifier ( displayoption )? ( COMMA id= fixedidentifier ( displayoption )? )* ( COMMA )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:406:2: id= fixedidentifier ( displayoption )? ( COMMA id= fixedidentifier ( displayoption )? )* ( COMMA )?
			{
			pushFollow(FOLLOW_fixedidentifier_in_enumoptions2129);
			id=fixedidentifier();
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:406:23: ( displayoption )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==LABRACK) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:406:23: displayoption
					{
					pushFollow(FOLLOW_displayoption_in_enumoptions2131);
					displayoption();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			                                      lst.add((id!=null?input.toString(id.start,id.stop):null));
			                                     }
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:410:2: ( COMMA id= fixedidentifier ( displayoption )? )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==COMMA) ) {
					int LA53_1 = input.LA(2);
					if ( (LA53_1==IDENTIFIER||LA53_1==69||(LA53_1 >= 73 && LA53_1 <= 74)||LA53_1==76||LA53_1==78||(LA53_1 >= 80 && LA53_1 <= 81)||(LA53_1 >= 83 && LA53_1 <= 84)||(LA53_1 >= 86 && LA53_1 <= 88)||LA53_1==90||LA53_1==92||(LA53_1 >= 95 && LA53_1 <= 100)||(LA53_1 >= 102 && LA53_1 <= 104)||LA53_1==107||LA53_1==109||LA53_1==114||(LA53_1 >= 117 && LA53_1 <= 118)||(LA53_1 >= 126 && LA53_1 <= 131)||(LA53_1 >= 138 && LA53_1 <= 140)||(LA53_1 >= 143 && LA53_1 <= 144)||(LA53_1 >= 146 && LA53_1 <= 147)||LA53_1==150||(LA53_1 >= 153 && LA53_1 <= 154)||LA53_1==157||LA53_1==160||(LA53_1 >= 162 && LA53_1 <= 165)||(LA53_1 >= 167 && LA53_1 <= 168)||LA53_1==171||(LA53_1 >= 176 && LA53_1 <= 178)||LA53_1==180||(LA53_1 >= 183 && LA53_1 <= 185)) ) {
						alt53=1;
					}

				}

				switch (alt53) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:410:4: COMMA id= fixedidentifier ( displayoption )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_enumoptions2177); if (state.failed) return;
					pushFollow(FOLLOW_fixedidentifier_in_enumoptions2183);
					id=fixedidentifier();
					state._fsp--;
					if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:410:31: ( displayoption )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==LABRACK) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:410:31: displayoption
							{
							pushFollow(FOLLOW_displayoption_in_enumoptions2185);
							displayoption();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					if ( state.backtracking==0 ) {
					                                              lst.add((id!=null?input.toString(id.start,id.stop):null));
					                                             }
					}
					break;

				default :
					break loop53;
				}
			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:413:51: ( COMMA )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==COMMA) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:413:51: COMMA
					{
					match(input,COMMA,FOLLOW_COMMA_in_enumoptions2239); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, enumoptions_StartIndex); }

		}
	}
	// $ANTLR end "enumoptions"



	// $ANTLR start "displayoption"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:417:1: displayoption : LABRACK (~ ( LABRACK | RABRACK ) )* RABRACK ;
	public final void displayoption() throws RecognitionException {
		int displayoption_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:418:2: ( LABRACK (~ ( LABRACK | RABRACK ) )* RABRACK )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:419:2: LABRACK (~ ( LABRACK | RABRACK ) )* RABRACK
			{
			match(input,LABRACK,FOLLOW_LABRACK_in_displayoption2253); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:420:2: (~ ( LABRACK | RABRACK ) )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( ((LA55_0 >= ALPHA && LA55_0 <= INTVAL)||(LA55_0 >= LBRACK && LA55_0 <= LSBRACK)||(LA55_0 >= RBRACK && LA55_0 <= 196)) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
					{
					if ( (input.LA(1) >= ALPHA && input.LA(1) <= INTVAL)||(input.LA(1) >= LBRACK && input.LA(1) <= LSBRACK)||(input.LA(1) >= RBRACK && input.LA(1) <= 196) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop55;
				}
			}

			match(input,RABRACK,FOLLOW_RABRACK_in_displayoption2285); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, displayoption_StartIndex); }

		}
	}
	// $ANTLR end "displayoption"



	// $ANTLR start "structparams"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:430:1: structparams : ( 'native' | 'export' | 'atomic' | 'immutable' | 'atomicwhencooked' | 'immutablewhencooked' | 'strictconfig' | 'transient' );
	public final void structparams() throws RecognitionException {
		int structparams_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:431:2: ( 'native' | 'export' | 'atomic' | 'immutable' | 'atomicwhencooked' | 'immutablewhencooked' | 'strictconfig' | 'transient' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( (input.LA(1) >= 71 && input.LA(1) <= 72)||input.LA(1)==109||(input.LA(1) >= 122 && input.LA(1) <= 123)||input.LA(1)==140||input.LA(1)==179||input.LA(1)==184 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, structparams_StartIndex); }

		}
	}
	// $ANTLR end "structparams"



	// $ANTLR start "structbody"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:443:1: structbody[AntlrUCStructDecl strct] : ( vardecl[strct.variables] )+ ( structdefaultpropertiesblock )? ;
	public final void structbody(AntlrUCStructDecl strct) throws RecognitionException {
		int structbody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:444:2: ( ( vardecl[strct.variables] )+ ( structdefaultpropertiesblock )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:445:2: ( vardecl[strct.variables] )+ ( structdefaultpropertiesblock )?
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:445:2: ( vardecl[strct.variables] )+
			int cnt56=0;
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==189) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:445:4: vardecl[strct.variables]
					{
					pushFollow(FOLLOW_vardecl_in_structbody2349);
					vardecl(strct.variables);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt56 >= 1 ) break loop56;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(56, input);
					throw eee;
				}
				cnt56++;
			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:445:32: ( structdefaultpropertiesblock )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==182) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:445:32: structdefaultpropertiesblock
					{
					pushFollow(FOLLOW_structdefaultpropertiesblock_in_structbody2355);
					structdefaultpropertiesblock();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, structbody_StartIndex); }

		}
	}
	// $ANTLR end "structbody"



	// $ANTLR start "arraydecl"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:449:1: arraydecl returns [String arrayInner] : 'array' LABRACK ( ( varparams )* vartype ) RABRACK ;
	public final String arraydecl() throws RecognitionException {
		String arrayInner = null;

		int arraydecl_StartIndex = input.index();

		ParserRuleReturnScope vartype13 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return arrayInner; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:450:2: ( 'array' LABRACK ( ( varparams )* vartype ) RABRACK )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:451:2: 'array' LABRACK ( ( varparams )* vartype ) RABRACK
			{
			match(input,70,FOLLOW_70_in_arraydecl2373); if (state.failed) return arrayInner;
			match(input,LABRACK,FOLLOW_LABRACK_in_arraydecl2375); if (state.failed) return arrayInner;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:451:18: ( ( varparams )* vartype )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:451:20: ( varparams )* vartype
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:451:20: ( varparams )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==127) ) {
					int LA58_2 = input.LA(2);
					if ( (LA58_2==IDENTIFIER||(LA58_2 >= 69 && LA58_2 <= 70)||(LA58_2 >= 73 && LA58_2 <= 74)||LA58_2==76||LA58_2==78||(LA58_2 >= 80 && LA58_2 <= 81)||(LA58_2 >= 83 && LA58_2 <= 84)||(LA58_2 >= 86 && LA58_2 <= 88)||LA58_2==90||LA58_2==92||(LA58_2 >= 95 && LA58_2 <= 100)||(LA58_2 >= 102 && LA58_2 <= 104)||(LA58_2 >= 106 && LA58_2 <= 107)||LA58_2==109||LA58_2==114||(LA58_2 >= 117 && LA58_2 <= 118)||(LA58_2 >= 126 && LA58_2 <= 131)||(LA58_2 >= 138 && LA58_2 <= 140)||(LA58_2 >= 143 && LA58_2 <= 144)||(LA58_2 >= 146 && LA58_2 <= 147)||LA58_2==150||(LA58_2 >= 153 && LA58_2 <= 154)||LA58_2==157||(LA58_2 >= 160 && LA58_2 <= 165)||(LA58_2 >= 167 && LA58_2 <= 168)||LA58_2==171||(LA58_2 >= 176 && LA58_2 <= 178)||(LA58_2 >= 180 && LA58_2 <= 181)||(LA58_2 >= 183 && LA58_2 <= 185)) ) {
						alt58=1;
					}

				}
				else if ( (LA58_0==69||LA58_0==81||(LA58_0 >= 83 && LA58_0 <= 84)||(LA58_0 >= 86 && LA58_0 <= 87)||LA58_0==92||(LA58_0 >= 95 && LA58_0 <= 100)||(LA58_0 >= 102 && LA58_0 <= 104)||LA58_0==109||LA58_0==118||LA58_0==126||LA58_0==128||LA58_0==131||LA58_0==138||LA58_0==140||(LA58_0 >= 143 && LA58_0 <= 144)||(LA58_0 >= 146 && LA58_0 <= 147)||LA58_0==150||(LA58_0 >= 153 && LA58_0 <= 154)||LA58_0==160||(LA58_0 >= 162 && LA58_0 <= 165)||(LA58_0 >= 167 && LA58_0 <= 168)||LA58_0==171||LA58_0==176||(LA58_0 >= 184 && LA58_0 <= 185)) ) {
					int LA58_3 = input.LA(2);
					if ( (LA58_3==IDENTIFIER||(LA58_3 >= 69 && LA58_3 <= 70)||(LA58_3 >= 73 && LA58_3 <= 74)||LA58_3==76||LA58_3==78||(LA58_3 >= 80 && LA58_3 <= 81)||(LA58_3 >= 83 && LA58_3 <= 84)||(LA58_3 >= 86 && LA58_3 <= 88)||LA58_3==90||LA58_3==92||(LA58_3 >= 95 && LA58_3 <= 100)||(LA58_3 >= 102 && LA58_3 <= 104)||(LA58_3 >= 106 && LA58_3 <= 107)||LA58_3==109||LA58_3==114||(LA58_3 >= 117 && LA58_3 <= 118)||(LA58_3 >= 126 && LA58_3 <= 131)||(LA58_3 >= 138 && LA58_3 <= 140)||(LA58_3 >= 143 && LA58_3 <= 144)||(LA58_3 >= 146 && LA58_3 <= 147)||LA58_3==150||(LA58_3 >= 153 && LA58_3 <= 154)||LA58_3==157||(LA58_3 >= 160 && LA58_3 <= 165)||(LA58_3 >= 167 && LA58_3 <= 168)||LA58_3==171||(LA58_3 >= 176 && LA58_3 <= 178)||(LA58_3 >= 180 && LA58_3 <= 181)||(LA58_3 >= 183 && LA58_3 <= 185)) ) {
						alt58=1;
					}

				}

				switch (alt58) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:451:20: varparams
					{
					pushFollow(FOLLOW_varparams_in_arraydecl2379);
					varparams();
					state._fsp--;
					if (state.failed) return arrayInner;
					}
					break;

				default :
					break loop58;
				}
			}

			pushFollow(FOLLOW_vartype_in_arraydecl2382);
			vartype13=vartype();
			state._fsp--;
			if (state.failed) return arrayInner;
			}

			match(input,RABRACK,FOLLOW_RABRACK_in_arraydecl2386); if (state.failed) return arrayInner;
			if ( state.backtracking==0 ) {
			                                                 arrayInner = (vartype13!=null?input.toString(vartype13.start,vartype13.stop):null);
			                                                }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, arraydecl_StartIndex); }

		}
		return arrayInner;
	}
	// $ANTLR end "arraydecl"


	public static class delegatedecl_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "delegatedecl"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:458:1: delegatedecl : 'delegate' LABRACK ( ( varparams )* vartype ) RABRACK ;
	public final UnrealScriptParser.delegatedecl_return delegatedecl() throws RecognitionException {
		UnrealScriptParser.delegatedecl_return retval = new UnrealScriptParser.delegatedecl_return();
		retval.start = input.LT(1);
		int delegatedecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:459:2: ( 'delegate' LABRACK ( ( varparams )* vartype ) RABRACK )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:460:2: 'delegate' LABRACK ( ( varparams )* vartype ) RABRACK
			{
			match(input,90,FOLLOW_90_in_delegatedecl2450); if (state.failed) return retval;
			match(input,LABRACK,FOLLOW_LABRACK_in_delegatedecl2452); if (state.failed) return retval;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:460:21: ( ( varparams )* vartype )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:460:23: ( varparams )* vartype
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:460:23: ( varparams )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==127) ) {
					int LA59_2 = input.LA(2);
					if ( (LA59_2==IDENTIFIER||(LA59_2 >= 69 && LA59_2 <= 70)||(LA59_2 >= 73 && LA59_2 <= 74)||LA59_2==76||LA59_2==78||(LA59_2 >= 80 && LA59_2 <= 81)||(LA59_2 >= 83 && LA59_2 <= 84)||(LA59_2 >= 86 && LA59_2 <= 88)||LA59_2==90||LA59_2==92||(LA59_2 >= 95 && LA59_2 <= 100)||(LA59_2 >= 102 && LA59_2 <= 104)||(LA59_2 >= 106 && LA59_2 <= 107)||LA59_2==109||LA59_2==114||(LA59_2 >= 117 && LA59_2 <= 118)||(LA59_2 >= 126 && LA59_2 <= 131)||(LA59_2 >= 138 && LA59_2 <= 140)||(LA59_2 >= 143 && LA59_2 <= 144)||(LA59_2 >= 146 && LA59_2 <= 147)||LA59_2==150||(LA59_2 >= 153 && LA59_2 <= 154)||LA59_2==157||(LA59_2 >= 160 && LA59_2 <= 165)||(LA59_2 >= 167 && LA59_2 <= 168)||LA59_2==171||(LA59_2 >= 176 && LA59_2 <= 178)||(LA59_2 >= 180 && LA59_2 <= 181)||(LA59_2 >= 183 && LA59_2 <= 185)) ) {
						alt59=1;
					}

				}
				else if ( (LA59_0==69||LA59_0==81||(LA59_0 >= 83 && LA59_0 <= 84)||(LA59_0 >= 86 && LA59_0 <= 87)||LA59_0==92||(LA59_0 >= 95 && LA59_0 <= 100)||(LA59_0 >= 102 && LA59_0 <= 104)||LA59_0==109||LA59_0==118||LA59_0==126||LA59_0==128||LA59_0==131||LA59_0==138||LA59_0==140||(LA59_0 >= 143 && LA59_0 <= 144)||(LA59_0 >= 146 && LA59_0 <= 147)||LA59_0==150||(LA59_0 >= 153 && LA59_0 <= 154)||LA59_0==160||(LA59_0 >= 162 && LA59_0 <= 165)||(LA59_0 >= 167 && LA59_0 <= 168)||LA59_0==171||LA59_0==176||(LA59_0 >= 184 && LA59_0 <= 185)) ) {
					int LA59_3 = input.LA(2);
					if ( (LA59_3==IDENTIFIER||(LA59_3 >= 69 && LA59_3 <= 70)||(LA59_3 >= 73 && LA59_3 <= 74)||LA59_3==76||LA59_3==78||(LA59_3 >= 80 && LA59_3 <= 81)||(LA59_3 >= 83 && LA59_3 <= 84)||(LA59_3 >= 86 && LA59_3 <= 88)||LA59_3==90||LA59_3==92||(LA59_3 >= 95 && LA59_3 <= 100)||(LA59_3 >= 102 && LA59_3 <= 104)||(LA59_3 >= 106 && LA59_3 <= 107)||LA59_3==109||LA59_3==114||(LA59_3 >= 117 && LA59_3 <= 118)||(LA59_3 >= 126 && LA59_3 <= 131)||(LA59_3 >= 138 && LA59_3 <= 140)||(LA59_3 >= 143 && LA59_3 <= 144)||(LA59_3 >= 146 && LA59_3 <= 147)||LA59_3==150||(LA59_3 >= 153 && LA59_3 <= 154)||LA59_3==157||(LA59_3 >= 160 && LA59_3 <= 165)||(LA59_3 >= 167 && LA59_3 <= 168)||LA59_3==171||(LA59_3 >= 176 && LA59_3 <= 178)||(LA59_3 >= 180 && LA59_3 <= 181)||(LA59_3 >= 183 && LA59_3 <= 185)) ) {
						alt59=1;
					}

				}

				switch (alt59) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:460:23: varparams
					{
					pushFollow(FOLLOW_varparams_in_delegatedecl2456);
					varparams();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop59;
				}
			}

			pushFollow(FOLLOW_vartype_in_delegatedecl2459);
			vartype();
			state._fsp--;
			if (state.failed) return retval;
			}

			match(input,RABRACK,FOLLOW_RABRACK_in_delegatedecl2463); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, delegatedecl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "delegatedecl"


	public static class classtype_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "classtype"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:464:1: classtype : 'class' LABRACK ( ( varparams )* vartype ) RABRACK ;
	public final UnrealScriptParser.classtype_return classtype() throws RecognitionException {
		UnrealScriptParser.classtype_return retval = new UnrealScriptParser.classtype_return();
		retval.start = input.LT(1);
		int classtype_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:465:2: ( 'class' LABRACK ( ( varparams )* vartype ) RABRACK )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:466:2: 'class' LABRACK ( ( varparams )* vartype ) RABRACK
			{
			match(input,78,FOLLOW_78_in_classtype2476); if (state.failed) return retval;
			match(input,LABRACK,FOLLOW_LABRACK_in_classtype2478); if (state.failed) return retval;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:466:18: ( ( varparams )* vartype )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:466:20: ( varparams )* vartype
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:466:20: ( varparams )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==127) ) {
					int LA60_2 = input.LA(2);
					if ( (LA60_2==IDENTIFIER||(LA60_2 >= 69 && LA60_2 <= 70)||(LA60_2 >= 73 && LA60_2 <= 74)||LA60_2==76||LA60_2==78||(LA60_2 >= 80 && LA60_2 <= 81)||(LA60_2 >= 83 && LA60_2 <= 84)||(LA60_2 >= 86 && LA60_2 <= 88)||LA60_2==90||LA60_2==92||(LA60_2 >= 95 && LA60_2 <= 100)||(LA60_2 >= 102 && LA60_2 <= 104)||(LA60_2 >= 106 && LA60_2 <= 107)||LA60_2==109||LA60_2==114||(LA60_2 >= 117 && LA60_2 <= 118)||(LA60_2 >= 126 && LA60_2 <= 131)||(LA60_2 >= 138 && LA60_2 <= 140)||(LA60_2 >= 143 && LA60_2 <= 144)||(LA60_2 >= 146 && LA60_2 <= 147)||LA60_2==150||(LA60_2 >= 153 && LA60_2 <= 154)||LA60_2==157||(LA60_2 >= 160 && LA60_2 <= 165)||(LA60_2 >= 167 && LA60_2 <= 168)||LA60_2==171||(LA60_2 >= 176 && LA60_2 <= 178)||(LA60_2 >= 180 && LA60_2 <= 181)||(LA60_2 >= 183 && LA60_2 <= 185)) ) {
						alt60=1;
					}

				}
				else if ( (LA60_0==69||LA60_0==81||(LA60_0 >= 83 && LA60_0 <= 84)||(LA60_0 >= 86 && LA60_0 <= 87)||LA60_0==92||(LA60_0 >= 95 && LA60_0 <= 100)||(LA60_0 >= 102 && LA60_0 <= 104)||LA60_0==109||LA60_0==118||LA60_0==126||LA60_0==128||LA60_0==131||LA60_0==138||LA60_0==140||(LA60_0 >= 143 && LA60_0 <= 144)||(LA60_0 >= 146 && LA60_0 <= 147)||LA60_0==150||(LA60_0 >= 153 && LA60_0 <= 154)||LA60_0==160||(LA60_0 >= 162 && LA60_0 <= 165)||(LA60_0 >= 167 && LA60_0 <= 168)||LA60_0==171||LA60_0==176||(LA60_0 >= 184 && LA60_0 <= 185)) ) {
					int LA60_3 = input.LA(2);
					if ( (LA60_3==IDENTIFIER||(LA60_3 >= 69 && LA60_3 <= 70)||(LA60_3 >= 73 && LA60_3 <= 74)||LA60_3==76||LA60_3==78||(LA60_3 >= 80 && LA60_3 <= 81)||(LA60_3 >= 83 && LA60_3 <= 84)||(LA60_3 >= 86 && LA60_3 <= 88)||LA60_3==90||LA60_3==92||(LA60_3 >= 95 && LA60_3 <= 100)||(LA60_3 >= 102 && LA60_3 <= 104)||(LA60_3 >= 106 && LA60_3 <= 107)||LA60_3==109||LA60_3==114||(LA60_3 >= 117 && LA60_3 <= 118)||(LA60_3 >= 126 && LA60_3 <= 131)||(LA60_3 >= 138 && LA60_3 <= 140)||(LA60_3 >= 143 && LA60_3 <= 144)||(LA60_3 >= 146 && LA60_3 <= 147)||LA60_3==150||(LA60_3 >= 153 && LA60_3 <= 154)||LA60_3==157||(LA60_3 >= 160 && LA60_3 <= 165)||(LA60_3 >= 167 && LA60_3 <= 168)||LA60_3==171||(LA60_3 >= 176 && LA60_3 <= 178)||(LA60_3 >= 180 && LA60_3 <= 181)||(LA60_3 >= 183 && LA60_3 <= 185)) ) {
						alt60=1;
					}

				}

				switch (alt60) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:466:20: varparams
					{
					pushFollow(FOLLOW_varparams_in_classtype2482);
					varparams();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop60;
				}
			}

			pushFollow(FOLLOW_vartype_in_classtype2485);
			vartype();
			state._fsp--;
			if (state.failed) return retval;
			}

			match(input,RABRACK,FOLLOW_RABRACK_in_classtype2489); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, classtype_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classtype"



	// $ANTLR start "qualifiedidentifier"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:474:1: qualifiedidentifier : qualifierident_1 ( DOT qualifierident_1 )* ;
	public final void qualifiedidentifier() throws RecognitionException {
		int qualifiedidentifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:475:2: ( qualifierident_1 ( DOT qualifierident_1 )* )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:476:2: qualifierident_1 ( DOT qualifierident_1 )*
			{
			pushFollow(FOLLOW_qualifierident_1_in_qualifiedidentifier2506);
			qualifierident_1();
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:476:19: ( DOT qualifierident_1 )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==DOT) ) {
					int LA61_2 = input.LA(2);
					if ( (synpred98_UnrealScript()) ) {
						alt61=1;
					}

				}

				switch (alt61) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:476:21: DOT qualifierident_1
					{
					match(input,DOT,FOLLOW_DOT_in_qualifiedidentifier2510); if (state.failed) return;
					pushFollow(FOLLOW_qualifierident_1_in_qualifiedidentifier2512);
					qualifierident_1();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop61;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, qualifiedidentifier_StartIndex); }

		}
	}
	// $ANTLR end "qualifiedidentifier"



	// $ANTLR start "qualifierident_1"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:480:1: qualifierident_1 : ( ( ( 'class' | 'property' | 'enum' | IDENTIFIER ) SQUOTE packageidentifier SQUOTE ) | fixedidentifier | defaultidentifier | 'class' | 'property' ) ( LSBRACK expr RSBRACK )? ;
	public final void qualifierident_1() throws RecognitionException {
		int qualifierident_1_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:481:2: ( ( ( ( 'class' | 'property' | 'enum' | IDENTIFIER ) SQUOTE packageidentifier SQUOTE ) | fixedidentifier | defaultidentifier | 'class' | 'property' ) ( LSBRACK expr RSBRACK )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:482:2: ( ( ( 'class' | 'property' | 'enum' | IDENTIFIER ) SQUOTE packageidentifier SQUOTE ) | fixedidentifier | defaultidentifier | 'class' | 'property' ) ( LSBRACK expr RSBRACK )?
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:482:2: ( ( ( 'class' | 'property' | 'enum' | IDENTIFIER ) SQUOTE packageidentifier SQUOTE ) | fixedidentifier | defaultidentifier | 'class' | 'property' )
			int alt62=5;
			alt62 = dfa62.predict(input);
			switch (alt62) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:483:3: ( ( 'class' | 'property' | 'enum' | IDENTIFIER ) SQUOTE packageidentifier SQUOTE )
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:483:3: ( ( 'class' | 'property' | 'enum' | IDENTIFIER ) SQUOTE packageidentifier SQUOTE )
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:484:4: ( 'class' | 'property' | 'enum' | IDENTIFIER ) SQUOTE packageidentifier SQUOTE
					{
					if ( input.LA(1)==IDENTIFIER||input.LA(1)==78||input.LA(1)==106||input.LA(1)==161 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,SQUOTE,FOLLOW_SQUOTE_in_qualifierident_12577); if (state.failed) return;
					pushFollow(FOLLOW_packageidentifier_in_qualifierident_12579);
					packageidentifier();
					state._fsp--;
					if (state.failed) return;
					match(input,SQUOTE,FOLLOW_SQUOTE_in_qualifierident_12581); if (state.failed) return;
					}

					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:493:3: fixedidentifier
					{
					pushFollow(FOLLOW_fixedidentifier_in_qualifierident_12597);
					fixedidentifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:494:5: defaultidentifier
					{
					pushFollow(FOLLOW_defaultidentifier_in_qualifierident_12605);
					defaultidentifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:495:5: 'class'
					{
					match(input,78,FOLLOW_78_in_qualifierident_12611); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:496:5: 'property'
					{
					match(input,161,FOLLOW_161_in_qualifierident_12617); if (state.failed) return;
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:498:2: ( LSBRACK expr RSBRACK )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==LSBRACK) ) {
				int LA63_1 = input.LA(2);
				if ( (synpred106_UnrealScript()) ) {
					alt63=1;
				}
			}
			switch (alt63) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:498:4: LSBRACK expr RSBRACK
					{
					match(input,LSBRACK,FOLLOW_LSBRACK_in_qualifierident_12625); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_qualifierident_12627);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,RSBRACK,FOLLOW_RSBRACK_in_qualifierident_12629); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, qualifierident_1_StartIndex); }

		}
	}
	// $ANTLR end "qualifierident_1"



	// $ANTLR start "defaultidentifier"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:502:1: defaultidentifier : 'default' DOT qualifiedidentifier ;
	public final void defaultidentifier() throws RecognitionException {
		int defaultidentifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:503:2: ( 'default' DOT qualifiedidentifier )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:504:2: 'default' DOT qualifiedidentifier
			{
			match(input,88,FOLLOW_88_in_defaultidentifier2645); if (state.failed) return;
			match(input,DOT,FOLLOW_DOT_in_defaultidentifier2647); if (state.failed) return;
			pushFollow(FOLLOW_qualifiedidentifier_in_defaultidentifier2649);
			qualifiedidentifier();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, defaultidentifier_StartIndex); }

		}
	}
	// $ANTLR end "defaultidentifier"



	// $ANTLR start "replicationblock"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:508:1: replicationblock : 'replication' LCBRACK ( replicationbody )* RCBRACK ( SEMICOLON )? ;
	public final void replicationblock() throws RecognitionException {
		int replicationblock_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:509:2: ( 'replication' LCBRACK ( replicationbody )* RCBRACK ( SEMICOLON )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:510:2: 'replication' LCBRACK ( replicationbody )* RCBRACK ( SEMICOLON )?
			{
			match(input,166,FOLLOW_166_in_replicationblock2662); if (state.failed) return;
			match(input,LCBRACK,FOLLOW_LCBRACK_in_replicationblock2664); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:510:24: ( replicationbody )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==120||LA64_0==165||LA64_0==187) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:510:26: replicationbody
					{
					pushFollow(FOLLOW_replicationbody_in_replicationblock2668);
					replicationbody();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop64;
				}
			}

			match(input,RCBRACK,FOLLOW_RCBRACK_in_replicationblock2673); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:510:53: ( SEMICOLON )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==SEMICOLON) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:510:53: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_replicationblock2675); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, replicationblock_StartIndex); }

		}
	}
	// $ANTLR end "replicationblock"



	// $ANTLR start "replicationbody"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:514:1: replicationbody : ( 'reliable' | 'unreliable' )? 'if' LBRACK expr RBRACK fixedidentifier ( COMMA fixedidentifier )* SEMICOLON ;
	public final void replicationbody() throws RecognitionException {
		int replicationbody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:515:2: ( ( 'reliable' | 'unreliable' )? 'if' LBRACK expr RBRACK fixedidentifier ( COMMA fixedidentifier )* SEMICOLON )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:516:2: ( 'reliable' | 'unreliable' )? 'if' LBRACK expr RBRACK fixedidentifier ( COMMA fixedidentifier )* SEMICOLON
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:516:2: ( 'reliable' | 'unreliable' )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==165||LA66_0==187) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
					{
					if ( input.LA(1)==165||input.LA(1)==187 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			match(input,120,FOLLOW_120_in_replicationbody2706); if (state.failed) return;
			match(input,LBRACK,FOLLOW_LBRACK_in_replicationbody2708); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_replicationbody2710);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,RBRACK,FOLLOW_RBRACK_in_replicationbody2712); if (state.failed) return;
			pushFollow(FOLLOW_fixedidentifier_in_replicationbody2714);
			fixedidentifier();
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:520:42: ( COMMA fixedidentifier )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==COMMA) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:520:44: COMMA fixedidentifier
					{
					match(input,COMMA,FOLLOW_COMMA_in_replicationbody2718); if (state.failed) return;
					pushFollow(FOLLOW_fixedidentifier_in_replicationbody2720);
					fixedidentifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop67;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_replicationbody2725); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, replicationbody_StartIndex); }

		}
	}
	// $ANTLR end "replicationbody"



	// $ANTLR start "functinoargs"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:524:1: functinoargs : ( 'optional' | 'out' | 'coerce' )? 'name' fixedidentifier ;
	public final void functinoargs() throws RecognitionException {
		int functinoargs_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:525:2: ( ( 'optional' | 'out' | 'coerce' )? 'name' fixedidentifier )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:526:2: ( 'optional' | 'out' | 'coerce' )? 'name' fixedidentifier
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:526:2: ( 'optional' | 'out' | 'coerce' )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==81||(LA68_0 >= 153 && LA68_0 <= 154)) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
					{
					if ( input.LA(1)==81||(input.LA(1) >= 153 && input.LA(1) <= 154) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			match(input,139,FOLLOW_139_in_functinoargs2761); if (state.failed) return;
			pushFollow(FOLLOW_fixedidentifier_in_functinoargs2763);
			fixedidentifier();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, functinoargs_StartIndex); }

		}
	}
	// $ANTLR end "functinoargs"



	// $ANTLR start "codeline"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:535:1: codeline : ( codelabel | codelinenolabel );
	public final void codeline() throws RecognitionException {
		int codeline_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:536:2: ( codelabel | codelinenolabel )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==IDENTIFIER) ) {
				int LA69_1 = input.LA(2);
				if ( (LA69_1==COLON) ) {
					alt69=1;
				}
				else if ( (LA69_1==DOT||LA69_1==EQUALS||(LA69_1 >= LBRACK && LA69_1 <= LSBRACK)||LA69_1==SQUOTE||LA69_1==39||LA69_1==45||(LA69_1 >= 47 && LA69_1 <= 48)||(LA69_1 >= 50 && LA69_1 <= 51)||LA69_1==53||LA69_1==63||LA69_1==196) ) {
					alt69=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 69, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA69_0==FLOATVAL||LA69_0==INTVAL||LA69_0==LBRACK||(LA69_0 >= SQUOTE && LA69_0 <= STRINGVAL)||LA69_0==47||(LA69_0 >= 49 && LA69_0 <= 50)||LA69_0==67||(LA69_0 >= 69 && LA69_0 <= 70)||(LA69_0 >= 73 && LA69_0 <= 76)||LA69_0==78||(LA69_0 >= 80 && LA69_0 <= 81)||(LA69_0 >= 83 && LA69_0 <= 88)||LA69_0==90||(LA69_0 >= 92 && LA69_0 <= 93)||(LA69_0 >= 95 && LA69_0 <= 100)||(LA69_0 >= 102 && LA69_0 <= 104)||(LA69_0 >= 106 && LA69_0 <= 107)||LA69_0==109||LA69_0==112||(LA69_0 >= 114 && LA69_0 <= 118)||LA69_0==120||(LA69_0 >= 126 && LA69_0 <= 131)||(LA69_0 >= 138 && LA69_0 <= 140)||(LA69_0 >= 142 && LA69_0 <= 144)||(LA69_0 >= 146 && LA69_0 <= 147)||LA69_0==150||(LA69_0 >= 153 && LA69_0 <= 154)||LA69_0==157||(LA69_0 >= 160 && LA69_0 <= 165)||(LA69_0 >= 167 && LA69_0 <= 169)||LA69_0==171||(LA69_0 >= 176 && LA69_0 <= 178)||(LA69_0 >= 180 && LA69_0 <= 181)||(LA69_0 >= 183 && LA69_0 <= 186)||LA69_0==191) ) {
				alt69=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:537:2: codelabel
					{
					pushFollow(FOLLOW_codelabel_in_codeline2776);
					codelabel();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:538:4: codelinenolabel
					{
					pushFollow(FOLLOW_codelinenolabel_in_codeline2781);
					codelinenolabel();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, codeline_StartIndex); }

		}
	}
	// $ANTLR end "codeline"



	// $ANTLR start "codelinenolabel"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:542:1: codelinenolabel : ( statement | assignment | ( unaryexpr SEMICOLON ) | ifthenelse | whileloop | doloop | switchcase | returnfunc | foreachloop | forloop | breakfunc | continuefunc ) ( SEMICOLON )* ;
	public final void codelinenolabel() throws RecognitionException {
		int codelinenolabel_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:543:2: ( ( statement | assignment | ( unaryexpr SEMICOLON ) | ifthenelse | whileloop | doloop | switchcase | returnfunc | foreachloop | forloop | breakfunc | continuefunc ) ( SEMICOLON )* )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:544:2: ( statement | assignment | ( unaryexpr SEMICOLON ) | ifthenelse | whileloop | doloop | switchcase | returnfunc | foreachloop | forloop | breakfunc | continuefunc ) ( SEMICOLON )*
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:544:2: ( statement | assignment | ( unaryexpr SEMICOLON ) | ifthenelse | whileloop | doloop | switchcase | returnfunc | foreachloop | forloop | breakfunc | continuefunc )
			int alt70=12;
			switch ( input.LA(1) ) {
			case 78:
				{
				int LA70_1 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IDENTIFIER:
				{
				int LA70_2 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 67:
				{
				int LA70_3 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 161:
				{
				int LA70_4 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 183:
				{
				int LA70_5 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}
				else if ( (synpred122_UnrealScript()) ) {
					alt70=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 73:
				{
				int LA70_6 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 127:
				{
				int LA70_7 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 130:
				{
				int LA70_8 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 178:
				{
				int LA70_9 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 88:
				{
				int LA70_10 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 107:
				{
				int LA70_11 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 177:
				{
				int LA70_12 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 117:
				{
				int LA70_13 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 90:
				{
				int LA70_14 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 69:
			case 81:
			case 83:
			case 84:
			case 86:
			case 87:
			case 92:
			case 95:
			case 96:
			case 97:
			case 98:
			case 99:
			case 100:
			case 102:
			case 103:
			case 104:
			case 109:
			case 118:
			case 126:
			case 128:
			case 131:
			case 138:
			case 140:
			case 143:
			case 144:
			case 146:
			case 147:
			case 150:
			case 153:
			case 154:
			case 160:
			case 162:
			case 163:
			case 164:
			case 165:
			case 167:
			case 168:
			case 171:
			case 176:
			case 184:
			case 185:
				{
				int LA70_15 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 74:
			case 76:
			case 114:
			case 129:
			case 139:
			case 157:
			case 180:
				{
				int LA70_16 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 80:
				{
				int LA70_17 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 106:
				{
				int LA70_18 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 181:
				{
				int LA70_19 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 70:
				{
				int LA70_20 = input.LA(2);
				if ( (synpred116_UnrealScript()) ) {
					alt70=1;
				}
				else if ( (synpred117_UnrealScript()) ) {
					alt70=2;
				}
				else if ( (synpred118_UnrealScript()) ) {
					alt70=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOATVAL:
			case INTVAL:
			case LBRACK:
			case SQUOTE:
			case STRINGVAL:
			case 47:
			case 49:
			case 50:
			case 112:
			case 142:
			case 186:
				{
				alt70=3;
				}
				break;
			case 120:
				{
				alt70=4;
				}
				break;
			case 191:
				{
				alt70=5;
				}
				break;
			case 93:
				{
				alt70=6;
				}
				break;
			case 169:
				{
				alt70=8;
				}
				break;
			case 116:
				{
				alt70=9;
				}
				break;
			case 115:
				{
				alt70=10;
				}
				break;
			case 75:
				{
				alt70=11;
				}
				break;
			case 85:
				{
				alt70=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}
			switch (alt70) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:545:3: statement
					{
					pushFollow(FOLLOW_statement_in_codelinenolabel2798);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:546:5: assignment
					{
					pushFollow(FOLLOW_assignment_in_codelinenolabel2804);
					assignment();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:547:5: ( unaryexpr SEMICOLON )
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:547:5: ( unaryexpr SEMICOLON )
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:547:7: unaryexpr SEMICOLON
					{
					pushFollow(FOLLOW_unaryexpr_in_codelinenolabel2812);
					unaryexpr();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_codelinenolabel2814); if (state.failed) return;
					}

					}
					break;
				case 4 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:548:5: ifthenelse
					{
					pushFollow(FOLLOW_ifthenelse_in_codelinenolabel2822);
					ifthenelse();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:549:5: whileloop
					{
					pushFollow(FOLLOW_whileloop_in_codelinenolabel2828);
					whileloop();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:550:5: doloop
					{
					pushFollow(FOLLOW_doloop_in_codelinenolabel2834);
					doloop();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:551:5: switchcase
					{
					pushFollow(FOLLOW_switchcase_in_codelinenolabel2840);
					switchcase();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:552:5: returnfunc
					{
					pushFollow(FOLLOW_returnfunc_in_codelinenolabel2846);
					returnfunc();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:553:5: foreachloop
					{
					pushFollow(FOLLOW_foreachloop_in_codelinenolabel2852);
					foreachloop();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:554:5: forloop
					{
					pushFollow(FOLLOW_forloop_in_codelinenolabel2858);
					forloop();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:555:5: breakfunc
					{
					pushFollow(FOLLOW_breakfunc_in_codelinenolabel2864);
					breakfunc();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:556:5: continuefunc
					{
					pushFollow(FOLLOW_continuefunc_in_codelinenolabel2870);
					continuefunc();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:558:2: ( SEMICOLON )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==SEMICOLON) ) {
					int LA71_2 = input.LA(2);
					if ( (synpred127_UnrealScript()) ) {
						alt71=1;
					}

				}

				switch (alt71) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:558:2: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_codelinenolabel2876); if (state.failed) return;
					}
					break;

				default :
					break loop71;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, codelinenolabel_StartIndex); }

		}
	}
	// $ANTLR end "codelinenolabel"



	// $ANTLR start "body"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:564:1: body : ( statedecl | functiondecl );
	public final void body() throws RecognitionException {
		int body_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:565:2: ( statedecl | functiondecl )
			int alt72=2;
			alt72 = dfa72.predict(input);
			switch (alt72) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:566:2: statedecl
					{
					pushFollow(FOLLOW_statedecl_in_body2892);
					statedecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:567:4: functiondecl
					{
					pushFollow(FOLLOW_functiondecl_in_body2897);
					functiondecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, body_StartIndex); }

		}
	}
	// $ANTLR end "body"



	// $ANTLR start "statedecl"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:574:1: statedecl : ( stateparams )* 'state' fixedidentifier ( 'extends' fixedidentifier )? statebody ;
	public final void statedecl() throws RecognitionException {
		int statedecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:575:2: ( ( stateparams )* 'state' fixedidentifier ( 'extends' fixedidentifier )? statebody )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:576:2: ( stateparams )* 'state' fixedidentifier ( 'extends' fixedidentifier )? statebody
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:576:2: ( stateparams )*
			loop73:
			while (true) {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==73||LA73_0==174) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:576:4: stateparams
					{
					pushFollow(FOLLOW_stateparams_in_statedecl2915);
					stateparams();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop73;
				}
			}

			match(input,177,FOLLOW_177_in_statedecl2920); if (state.failed) return;
			pushFollow(FOLLOW_fixedidentifier_in_statedecl2922);
			fixedidentifier();
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:576:43: ( 'extends' fixedidentifier )?
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==111) ) {
				alt74=1;
			}
			switch (alt74) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:576:45: 'extends' fixedidentifier
					{
					match(input,111,FOLLOW_111_in_statedecl2926); if (state.failed) return;
					pushFollow(FOLLOW_fixedidentifier_in_statedecl2928);
					fixedidentifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_statebody_in_statedecl2933);
			statebody();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, statedecl_StartIndex); }

		}
	}
	// $ANTLR end "statedecl"



	// $ANTLR start "statebody"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:580:1: statebody : LCBRACK ( stateignore )? ( functiondecl )* statelabels RCBRACK ( SEMICOLON )? ;
	public final void statebody() throws RecognitionException {
		int statebody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:581:2: ( LCBRACK ( stateignore )? ( functiondecl )* statelabels RCBRACK ( SEMICOLON )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:582:2: LCBRACK ( stateignore )? ( functiondecl )* statelabels RCBRACK ( SEMICOLON )?
			{
			match(input,LCBRACK,FOLLOW_LCBRACK_in_statebody2946); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:582:10: ( stateignore )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==121) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:582:12: stateignore
					{
					pushFollow(FOLLOW_stateignore_in_statebody2950);
					stateignore();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:582:27: ( functiondecl )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( ((LA76_0 >= 80 && LA76_0 <= 81)||LA76_0==90||(LA76_0 >= 107 && LA76_0 <= 108)||LA76_0==113||LA76_0==117||(LA76_0 >= 132 && LA76_0 <= 136)||LA76_0==140||(LA76_0 >= 144 && LA76_0 <= 145)||LA76_0==152||(LA76_0 >= 158 && LA76_0 <= 160)||LA76_0==162||(LA76_0 >= 164 && LA76_0 <= 165)||LA76_0==172||(LA76_0 >= 174 && LA76_0 <= 175)||LA76_0==178||LA76_0==184||LA76_0==187||LA76_0==190) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:582:29: functiondecl
					{
					pushFollow(FOLLOW_functiondecl_in_statebody2957);
					functiondecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop76;
				}
			}

			pushFollow(FOLLOW_statelabels_in_statebody2962);
			statelabels();
			state._fsp--;
			if (state.failed) return;
			match(input,RCBRACK,FOLLOW_RCBRACK_in_statebody2964); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:582:65: ( SEMICOLON )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==SEMICOLON) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:582:65: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statebody2966); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, statebody_StartIndex); }

		}
	}
	// $ANTLR end "statebody"



	// $ANTLR start "stateignore"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:586:1: stateignore : 'ignores' fixedidentifier ( COMMA fixedidentifier )* SEMICOLON ;
	public final void stateignore() throws RecognitionException {
		int stateignore_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:587:2: ( 'ignores' fixedidentifier ( COMMA fixedidentifier )* SEMICOLON )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:588:2: 'ignores' fixedidentifier ( COMMA fixedidentifier )* SEMICOLON
			{
			match(input,121,FOLLOW_121_in_stateignore2980); if (state.failed) return;
			pushFollow(FOLLOW_fixedidentifier_in_stateignore2982);
			fixedidentifier();
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:588:28: ( COMMA fixedidentifier )*
			loop78:
			while (true) {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==COMMA) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:588:30: COMMA fixedidentifier
					{
					match(input,COMMA,FOLLOW_COMMA_in_stateignore2986); if (state.failed) return;
					pushFollow(FOLLOW_fixedidentifier_in_stateignore2988);
					fixedidentifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop78;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stateignore2993); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, stateignore_StartIndex); }

		}
	}
	// $ANTLR end "stateignore"



	// $ANTLR start "statelabels"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:592:1: statelabels : ( codelabel ( codelinenolabel )* )* ;
	public final void statelabels() throws RecognitionException {
		int statelabels_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:593:2: ( ( codelabel ( codelinenolabel )* )* )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:594:2: ( codelabel ( codelinenolabel )* )*
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:594:2: ( codelabel ( codelinenolabel )* )*
			loop80:
			while (true) {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==IDENTIFIER) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:594:4: codelabel ( codelinenolabel )*
					{
					pushFollow(FOLLOW_codelabel_in_statelabels3008);
					codelabel();
					state._fsp--;
					if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:594:14: ( codelinenolabel )*
					loop79:
					while (true) {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==IDENTIFIER) ) {
							int LA79_2 = input.LA(2);
							if ( (LA79_2==DOT||LA79_2==EQUALS||(LA79_2 >= LBRACK && LA79_2 <= LSBRACK)||LA79_2==SQUOTE||LA79_2==39||LA79_2==45||(LA79_2 >= 47 && LA79_2 <= 48)||(LA79_2 >= 50 && LA79_2 <= 51)||LA79_2==53||LA79_2==63||LA79_2==196) ) {
								alt79=1;
							}

						}
						else if ( (LA79_0==FLOATVAL||LA79_0==INTVAL||LA79_0==LBRACK||(LA79_0 >= SQUOTE && LA79_0 <= STRINGVAL)||LA79_0==47||(LA79_0 >= 49 && LA79_0 <= 50)||LA79_0==67||(LA79_0 >= 69 && LA79_0 <= 70)||(LA79_0 >= 73 && LA79_0 <= 76)||LA79_0==78||(LA79_0 >= 80 && LA79_0 <= 81)||(LA79_0 >= 83 && LA79_0 <= 88)||LA79_0==90||(LA79_0 >= 92 && LA79_0 <= 93)||(LA79_0 >= 95 && LA79_0 <= 100)||(LA79_0 >= 102 && LA79_0 <= 104)||(LA79_0 >= 106 && LA79_0 <= 107)||LA79_0==109||LA79_0==112||(LA79_0 >= 114 && LA79_0 <= 118)||LA79_0==120||(LA79_0 >= 126 && LA79_0 <= 131)||(LA79_0 >= 138 && LA79_0 <= 140)||(LA79_0 >= 142 && LA79_0 <= 144)||(LA79_0 >= 146 && LA79_0 <= 147)||LA79_0==150||(LA79_0 >= 153 && LA79_0 <= 154)||LA79_0==157||(LA79_0 >= 160 && LA79_0 <= 165)||(LA79_0 >= 167 && LA79_0 <= 169)||LA79_0==171||(LA79_0 >= 176 && LA79_0 <= 178)||(LA79_0 >= 180 && LA79_0 <= 181)||(LA79_0 >= 183 && LA79_0 <= 186)||LA79_0==191) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:594:16: codelinenolabel
							{
							pushFollow(FOLLOW_codelinenolabel_in_statelabels3012);
							codelinenolabel();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop79;
						}
					}

					}
					break;

				default :
					break loop80;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, statelabels_StartIndex); }

		}
	}
	// $ANTLR end "statelabels"



	// $ANTLR start "functiondecl"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:602:1: functiondecl : ( normalfunc | operatorfunc ) ;
	public final void functiondecl() throws RecognitionException {
		int functiondecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:603:2: ( ( normalfunc | operatorfunc ) )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:604:2: ( normalfunc | operatorfunc )
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:604:2: ( normalfunc | operatorfunc )
			int alt81=2;
			alt81 = dfa81.predict(input);
			switch (alt81) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:605:3: normalfunc
					{
					pushFollow(FOLLOW_normalfunc_in_functiondecl3039);
					normalfunc();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:606:5: operatorfunc
					{
					pushFollow(FOLLOW_operatorfunc_in_functiondecl3045);
					operatorfunc();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, functiondecl_StartIndex); }

		}
	}
	// $ANTLR end "functiondecl"



	// $ANTLR start "normalfunc"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:611:1: normalfunc : ( functionparams )* functiontype ( functionparams )* ( vartype )? name= fixedidentifier params= funcargsblock[func] ( 'const' )? (startBrack= LCBRACK functionbody[func] endBrack= RCBRACK )? ( SEMICOLON )? ;
	public final void normalfunc() throws RecognitionException {
		int normalfunc_StartIndex = input.index();

		Token startBrack=null;
		Token endBrack=null;
		ParserRuleReturnScope name =null;
		ParserRuleReturnScope params =null;
		ParserRuleReturnScope vartype14 =null;


		AntlrUCFuncDecl func = new AntlrUCFuncDecl();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:616:2: ( ( functionparams )* functiontype ( functionparams )* ( vartype )? name= fixedidentifier params= funcargsblock[func] ( 'const' )? (startBrack= LCBRACK functionbody[func] endBrack= RCBRACK )? ( SEMICOLON )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:617:2: ( functionparams )* functiontype ( functionparams )* ( vartype )? name= fixedidentifier params= funcargsblock[func] ( 'const' )? (startBrack= LCBRACK functionbody[func] endBrack= RCBRACK )? ( SEMICOLON )?
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:617:2: ( functionparams )*
			loop82:
			while (true) {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( ((LA82_0 >= 80 && LA82_0 <= 81)||LA82_0==108||LA82_0==113||(LA82_0 >= 132 && LA82_0 <= 136)||LA82_0==140||(LA82_0 >= 144 && LA82_0 <= 145)||LA82_0==160||LA82_0==162||(LA82_0 >= 164 && LA82_0 <= 165)||LA82_0==172||(LA82_0 >= 174 && LA82_0 <= 175)||LA82_0==178||LA82_0==184||LA82_0==187||LA82_0==190) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:617:4: functionparams
					{
					pushFollow(FOLLOW_functionparams_in_normalfunc3068);
					functionparams();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop82;
				}
			}

			pushFollow(FOLLOW_functiontype_in_normalfunc3073);
			functiontype();
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:617:35: ( functionparams )*
			loop83:
			while (true) {
				int alt83=2;
				switch ( input.LA(1) ) {
				case 178:
					{
					int LA83_2 = input.LA(2);
					if ( (synpred139_UnrealScript()) ) {
						alt83=1;
					}

					}
					break;
				case 81:
				case 144:
				case 160:
				case 162:
				case 164:
				case 165:
				case 184:
					{
					int LA83_3 = input.LA(2);
					if ( (synpred139_UnrealScript()) ) {
						alt83=1;
					}

					}
					break;
				case 80:
					{
					int LA83_4 = input.LA(2);
					if ( (synpred139_UnrealScript()) ) {
						alt83=1;
					}

					}
					break;
				case 140:
					{
					int LA83_5 = input.LA(2);
					if ( (synpred139_UnrealScript()) ) {
						alt83=1;
					}

					}
					break;
				case 108:
				case 113:
				case 132:
				case 133:
				case 134:
				case 135:
				case 136:
				case 145:
				case 172:
				case 174:
				case 175:
				case 187:
				case 190:
					{
					alt83=1;
					}
					break;
				}
				switch (alt83) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:617:37: functionparams
					{
					pushFollow(FOLLOW_functionparams_in_normalfunc3077);
					functionparams();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop83;
				}
			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:617:55: ( vartype )?
			int alt84=2;
			switch ( input.LA(1) ) {
				case 78:
					{
					int LA84_1 = input.LA(2);
					if ( (LA84_1==DOT||LA84_1==IDENTIFIER||LA84_1==LABRACK||LA84_1==LCBRACK||LA84_1==69||(LA84_1 >= 73 && LA84_1 <= 74)||LA84_1==76||LA84_1==78||(LA84_1 >= 80 && LA84_1 <= 81)||(LA84_1 >= 83 && LA84_1 <= 84)||(LA84_1 >= 86 && LA84_1 <= 88)||LA84_1==90||LA84_1==92||(LA84_1 >= 95 && LA84_1 <= 100)||(LA84_1 >= 102 && LA84_1 <= 104)||LA84_1==107||LA84_1==109||LA84_1==114||(LA84_1 >= 117 && LA84_1 <= 118)||(LA84_1 >= 126 && LA84_1 <= 131)||(LA84_1 >= 138 && LA84_1 <= 140)||(LA84_1 >= 143 && LA84_1 <= 144)||(LA84_1 >= 146 && LA84_1 <= 147)||LA84_1==150||(LA84_1 >= 153 && LA84_1 <= 154)||LA84_1==157||LA84_1==160||(LA84_1 >= 162 && LA84_1 <= 165)||(LA84_1 >= 167 && LA84_1 <= 168)||LA84_1==171||(LA84_1 >= 176 && LA84_1 <= 178)||LA84_1==180||(LA84_1 >= 183 && LA84_1 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case IDENTIFIER:
					{
					int LA84_2 = input.LA(2);
					if ( (LA84_2==DOT||LA84_2==IDENTIFIER||LA84_2==LCBRACK||LA84_2==69||(LA84_2 >= 73 && LA84_2 <= 74)||LA84_2==76||LA84_2==78||(LA84_2 >= 80 && LA84_2 <= 81)||(LA84_2 >= 83 && LA84_2 <= 84)||(LA84_2 >= 86 && LA84_2 <= 88)||LA84_2==90||LA84_2==92||(LA84_2 >= 95 && LA84_2 <= 100)||(LA84_2 >= 102 && LA84_2 <= 104)||LA84_2==107||LA84_2==109||LA84_2==114||(LA84_2 >= 117 && LA84_2 <= 118)||(LA84_2 >= 126 && LA84_2 <= 131)||(LA84_2 >= 138 && LA84_2 <= 140)||(LA84_2 >= 143 && LA84_2 <= 144)||(LA84_2 >= 146 && LA84_2 <= 147)||LA84_2==150||(LA84_2 >= 153 && LA84_2 <= 154)||LA84_2==157||LA84_2==160||(LA84_2 >= 162 && LA84_2 <= 165)||(LA84_2 >= 167 && LA84_2 <= 168)||LA84_2==171||(LA84_2 >= 176 && LA84_2 <= 178)||LA84_2==180||(LA84_2 >= 183 && LA84_2 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 183:
					{
					int LA84_3 = input.LA(2);
					if ( (LA84_3==DOT||LA84_3==IDENTIFIER||LA84_3==LCBRACK||LA84_3==69||(LA84_3 >= 73 && LA84_3 <= 74)||LA84_3==76||LA84_3==78||(LA84_3 >= 80 && LA84_3 <= 81)||(LA84_3 >= 83 && LA84_3 <= 84)||(LA84_3 >= 86 && LA84_3 <= 88)||LA84_3==90||LA84_3==92||(LA84_3 >= 95 && LA84_3 <= 100)||(LA84_3 >= 102 && LA84_3 <= 104)||LA84_3==107||LA84_3==109||LA84_3==114||(LA84_3 >= 117 && LA84_3 <= 118)||(LA84_3 >= 126 && LA84_3 <= 131)||(LA84_3 >= 138 && LA84_3 <= 140)||(LA84_3 >= 143 && LA84_3 <= 144)||(LA84_3 >= 146 && LA84_3 <= 147)||LA84_3==150||(LA84_3 >= 153 && LA84_3 <= 154)||LA84_3==157||LA84_3==160||(LA84_3 >= 162 && LA84_3 <= 165)||(LA84_3 >= 167 && LA84_3 <= 168)||LA84_3==171||(LA84_3 >= 176 && LA84_3 <= 178)||LA84_3==180||(LA84_3 >= 183 && LA84_3 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 73:
					{
					int LA84_4 = input.LA(2);
					if ( (LA84_4==DOT||LA84_4==IDENTIFIER||LA84_4==LCBRACK||LA84_4==69||(LA84_4 >= 73 && LA84_4 <= 74)||LA84_4==76||LA84_4==78||(LA84_4 >= 80 && LA84_4 <= 81)||(LA84_4 >= 83 && LA84_4 <= 84)||(LA84_4 >= 86 && LA84_4 <= 88)||LA84_4==90||LA84_4==92||(LA84_4 >= 95 && LA84_4 <= 100)||(LA84_4 >= 102 && LA84_4 <= 104)||LA84_4==107||LA84_4==109||LA84_4==114||(LA84_4 >= 117 && LA84_4 <= 118)||(LA84_4 >= 126 && LA84_4 <= 131)||(LA84_4 >= 138 && LA84_4 <= 140)||(LA84_4 >= 143 && LA84_4 <= 144)||(LA84_4 >= 146 && LA84_4 <= 147)||LA84_4==150||(LA84_4 >= 153 && LA84_4 <= 154)||LA84_4==157||LA84_4==160||(LA84_4 >= 162 && LA84_4 <= 165)||(LA84_4 >= 167 && LA84_4 <= 168)||LA84_4==171||(LA84_4 >= 176 && LA84_4 <= 178)||LA84_4==180||(LA84_4 >= 183 && LA84_4 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 127:
					{
					int LA84_5 = input.LA(2);
					if ( (LA84_5==DOT||LA84_5==IDENTIFIER||LA84_5==LCBRACK||LA84_5==69||(LA84_5 >= 73 && LA84_5 <= 74)||LA84_5==76||LA84_5==78||(LA84_5 >= 80 && LA84_5 <= 81)||(LA84_5 >= 83 && LA84_5 <= 84)||(LA84_5 >= 86 && LA84_5 <= 88)||LA84_5==90||LA84_5==92||(LA84_5 >= 95 && LA84_5 <= 100)||(LA84_5 >= 102 && LA84_5 <= 104)||LA84_5==107||LA84_5==109||LA84_5==114||(LA84_5 >= 117 && LA84_5 <= 118)||(LA84_5 >= 126 && LA84_5 <= 131)||(LA84_5 >= 138 && LA84_5 <= 140)||(LA84_5 >= 143 && LA84_5 <= 144)||(LA84_5 >= 146 && LA84_5 <= 147)||LA84_5==150||(LA84_5 >= 153 && LA84_5 <= 154)||LA84_5==157||LA84_5==160||(LA84_5 >= 162 && LA84_5 <= 165)||(LA84_5 >= 167 && LA84_5 <= 168)||LA84_5==171||(LA84_5 >= 176 && LA84_5 <= 178)||LA84_5==180||(LA84_5 >= 183 && LA84_5 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 130:
					{
					int LA84_6 = input.LA(2);
					if ( (LA84_6==DOT||LA84_6==IDENTIFIER||LA84_6==LCBRACK||LA84_6==69||(LA84_6 >= 73 && LA84_6 <= 74)||LA84_6==76||LA84_6==78||(LA84_6 >= 80 && LA84_6 <= 81)||(LA84_6 >= 83 && LA84_6 <= 84)||(LA84_6 >= 86 && LA84_6 <= 88)||LA84_6==90||LA84_6==92||(LA84_6 >= 95 && LA84_6 <= 100)||(LA84_6 >= 102 && LA84_6 <= 104)||LA84_6==107||LA84_6==109||LA84_6==114||(LA84_6 >= 117 && LA84_6 <= 118)||(LA84_6 >= 126 && LA84_6 <= 131)||(LA84_6 >= 138 && LA84_6 <= 140)||(LA84_6 >= 143 && LA84_6 <= 144)||(LA84_6 >= 146 && LA84_6 <= 147)||LA84_6==150||(LA84_6 >= 153 && LA84_6 <= 154)||LA84_6==157||LA84_6==160||(LA84_6 >= 162 && LA84_6 <= 165)||(LA84_6 >= 167 && LA84_6 <= 168)||LA84_6==171||(LA84_6 >= 176 && LA84_6 <= 178)||LA84_6==180||(LA84_6 >= 183 && LA84_6 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 178:
					{
					int LA84_7 = input.LA(2);
					if ( (LA84_7==DOT||LA84_7==IDENTIFIER||LA84_7==LCBRACK||LA84_7==69||(LA84_7 >= 73 && LA84_7 <= 74)||LA84_7==76||LA84_7==78||(LA84_7 >= 80 && LA84_7 <= 81)||(LA84_7 >= 83 && LA84_7 <= 84)||(LA84_7 >= 86 && LA84_7 <= 88)||LA84_7==90||LA84_7==92||(LA84_7 >= 95 && LA84_7 <= 100)||(LA84_7 >= 102 && LA84_7 <= 104)||LA84_7==107||LA84_7==109||LA84_7==114||(LA84_7 >= 117 && LA84_7 <= 118)||(LA84_7 >= 126 && LA84_7 <= 131)||(LA84_7 >= 138 && LA84_7 <= 140)||(LA84_7 >= 143 && LA84_7 <= 144)||(LA84_7 >= 146 && LA84_7 <= 147)||LA84_7==150||(LA84_7 >= 153 && LA84_7 <= 154)||LA84_7==157||LA84_7==160||(LA84_7 >= 162 && LA84_7 <= 165)||(LA84_7 >= 167 && LA84_7 <= 168)||LA84_7==171||(LA84_7 >= 176 && LA84_7 <= 178)||LA84_7==180||(LA84_7 >= 183 && LA84_7 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 88:
					{
					int LA84_8 = input.LA(2);
					if ( (LA84_8==DOT||LA84_8==IDENTIFIER||LA84_8==LCBRACK||LA84_8==69||(LA84_8 >= 73 && LA84_8 <= 74)||LA84_8==76||LA84_8==78||(LA84_8 >= 80 && LA84_8 <= 81)||(LA84_8 >= 83 && LA84_8 <= 84)||(LA84_8 >= 86 && LA84_8 <= 88)||LA84_8==90||LA84_8==92||(LA84_8 >= 95 && LA84_8 <= 100)||(LA84_8 >= 102 && LA84_8 <= 104)||LA84_8==107||LA84_8==109||LA84_8==114||(LA84_8 >= 117 && LA84_8 <= 118)||(LA84_8 >= 126 && LA84_8 <= 131)||(LA84_8 >= 138 && LA84_8 <= 140)||(LA84_8 >= 143 && LA84_8 <= 144)||(LA84_8 >= 146 && LA84_8 <= 147)||LA84_8==150||(LA84_8 >= 153 && LA84_8 <= 154)||LA84_8==157||LA84_8==160||(LA84_8 >= 162 && LA84_8 <= 165)||(LA84_8 >= 167 && LA84_8 <= 168)||LA84_8==171||(LA84_8 >= 176 && LA84_8 <= 178)||LA84_8==180||(LA84_8 >= 183 && LA84_8 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 107:
					{
					int LA84_9 = input.LA(2);
					if ( (LA84_9==DOT||LA84_9==IDENTIFIER||LA84_9==LCBRACK||LA84_9==69||(LA84_9 >= 73 && LA84_9 <= 74)||LA84_9==76||LA84_9==78||(LA84_9 >= 80 && LA84_9 <= 81)||(LA84_9 >= 83 && LA84_9 <= 84)||(LA84_9 >= 86 && LA84_9 <= 88)||LA84_9==90||LA84_9==92||(LA84_9 >= 95 && LA84_9 <= 100)||(LA84_9 >= 102 && LA84_9 <= 104)||LA84_9==107||LA84_9==109||LA84_9==114||(LA84_9 >= 117 && LA84_9 <= 118)||(LA84_9 >= 126 && LA84_9 <= 131)||(LA84_9 >= 138 && LA84_9 <= 140)||(LA84_9 >= 143 && LA84_9 <= 144)||(LA84_9 >= 146 && LA84_9 <= 147)||LA84_9==150||(LA84_9 >= 153 && LA84_9 <= 154)||LA84_9==157||LA84_9==160||(LA84_9 >= 162 && LA84_9 <= 165)||(LA84_9 >= 167 && LA84_9 <= 168)||LA84_9==171||(LA84_9 >= 176 && LA84_9 <= 178)||LA84_9==180||(LA84_9 >= 183 && LA84_9 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 177:
					{
					int LA84_10 = input.LA(2);
					if ( (LA84_10==DOT||LA84_10==IDENTIFIER||LA84_10==LCBRACK||LA84_10==69||(LA84_10 >= 73 && LA84_10 <= 74)||LA84_10==76||LA84_10==78||(LA84_10 >= 80 && LA84_10 <= 81)||(LA84_10 >= 83 && LA84_10 <= 84)||(LA84_10 >= 86 && LA84_10 <= 88)||LA84_10==90||LA84_10==92||(LA84_10 >= 95 && LA84_10 <= 100)||(LA84_10 >= 102 && LA84_10 <= 104)||LA84_10==107||LA84_10==109||LA84_10==114||(LA84_10 >= 117 && LA84_10 <= 118)||(LA84_10 >= 126 && LA84_10 <= 131)||(LA84_10 >= 138 && LA84_10 <= 140)||(LA84_10 >= 143 && LA84_10 <= 144)||(LA84_10 >= 146 && LA84_10 <= 147)||LA84_10==150||(LA84_10 >= 153 && LA84_10 <= 154)||LA84_10==157||LA84_10==160||(LA84_10 >= 162 && LA84_10 <= 165)||(LA84_10 >= 167 && LA84_10 <= 168)||LA84_10==171||(LA84_10 >= 176 && LA84_10 <= 178)||LA84_10==180||(LA84_10 >= 183 && LA84_10 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 117:
					{
					int LA84_11 = input.LA(2);
					if ( (LA84_11==DOT||LA84_11==IDENTIFIER||LA84_11==LCBRACK||LA84_11==69||(LA84_11 >= 73 && LA84_11 <= 74)||LA84_11==76||LA84_11==78||(LA84_11 >= 80 && LA84_11 <= 81)||(LA84_11 >= 83 && LA84_11 <= 84)||(LA84_11 >= 86 && LA84_11 <= 88)||LA84_11==90||LA84_11==92||(LA84_11 >= 95 && LA84_11 <= 100)||(LA84_11 >= 102 && LA84_11 <= 104)||LA84_11==107||LA84_11==109||LA84_11==114||(LA84_11 >= 117 && LA84_11 <= 118)||(LA84_11 >= 126 && LA84_11 <= 131)||(LA84_11 >= 138 && LA84_11 <= 140)||(LA84_11 >= 143 && LA84_11 <= 144)||(LA84_11 >= 146 && LA84_11 <= 147)||LA84_11==150||(LA84_11 >= 153 && LA84_11 <= 154)||LA84_11==157||LA84_11==160||(LA84_11 >= 162 && LA84_11 <= 165)||(LA84_11 >= 167 && LA84_11 <= 168)||LA84_11==171||(LA84_11 >= 176 && LA84_11 <= 178)||LA84_11==180||(LA84_11 >= 183 && LA84_11 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 90:
					{
					int LA84_12 = input.LA(2);
					if ( (LA84_12==DOT||LA84_12==IDENTIFIER||LA84_12==LABRACK||LA84_12==LCBRACK||LA84_12==69||(LA84_12 >= 73 && LA84_12 <= 74)||LA84_12==76||LA84_12==78||(LA84_12 >= 80 && LA84_12 <= 81)||(LA84_12 >= 83 && LA84_12 <= 84)||(LA84_12 >= 86 && LA84_12 <= 88)||LA84_12==90||LA84_12==92||(LA84_12 >= 95 && LA84_12 <= 100)||(LA84_12 >= 102 && LA84_12 <= 104)||LA84_12==107||LA84_12==109||LA84_12==114||(LA84_12 >= 117 && LA84_12 <= 118)||(LA84_12 >= 126 && LA84_12 <= 131)||(LA84_12 >= 138 && LA84_12 <= 140)||(LA84_12 >= 143 && LA84_12 <= 144)||(LA84_12 >= 146 && LA84_12 <= 147)||LA84_12==150||(LA84_12 >= 153 && LA84_12 <= 154)||LA84_12==157||LA84_12==160||(LA84_12 >= 162 && LA84_12 <= 165)||(LA84_12 >= 167 && LA84_12 <= 168)||LA84_12==171||(LA84_12 >= 176 && LA84_12 <= 178)||LA84_12==180||(LA84_12 >= 183 && LA84_12 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 69:
				case 81:
				case 83:
				case 84:
				case 86:
				case 87:
				case 92:
				case 95:
				case 96:
				case 97:
				case 98:
				case 99:
				case 100:
				case 102:
				case 103:
				case 104:
				case 109:
				case 118:
				case 126:
				case 128:
				case 131:
				case 138:
				case 140:
				case 143:
				case 144:
				case 146:
				case 147:
				case 150:
				case 153:
				case 154:
				case 160:
				case 162:
				case 163:
				case 164:
				case 165:
				case 167:
				case 168:
				case 171:
				case 176:
				case 184:
				case 185:
					{
					int LA84_13 = input.LA(2);
					if ( (LA84_13==DOT||LA84_13==IDENTIFIER||LA84_13==LCBRACK||LA84_13==69||(LA84_13 >= 73 && LA84_13 <= 74)||LA84_13==76||LA84_13==78||(LA84_13 >= 80 && LA84_13 <= 81)||(LA84_13 >= 83 && LA84_13 <= 84)||(LA84_13 >= 86 && LA84_13 <= 88)||LA84_13==90||LA84_13==92||(LA84_13 >= 95 && LA84_13 <= 100)||(LA84_13 >= 102 && LA84_13 <= 104)||LA84_13==107||LA84_13==109||LA84_13==114||(LA84_13 >= 117 && LA84_13 <= 118)||(LA84_13 >= 126 && LA84_13 <= 131)||(LA84_13 >= 138 && LA84_13 <= 140)||(LA84_13 >= 143 && LA84_13 <= 144)||(LA84_13 >= 146 && LA84_13 <= 147)||LA84_13==150||(LA84_13 >= 153 && LA84_13 <= 154)||LA84_13==157||LA84_13==160||(LA84_13 >= 162 && LA84_13 <= 165)||(LA84_13 >= 167 && LA84_13 <= 168)||LA84_13==171||(LA84_13 >= 176 && LA84_13 <= 178)||LA84_13==180||(LA84_13 >= 183 && LA84_13 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 74:
				case 76:
				case 114:
				case 129:
				case 139:
				case 157:
				case 180:
					{
					int LA84_14 = input.LA(2);
					if ( (LA84_14==DOT||LA84_14==IDENTIFIER||LA84_14==LCBRACK||LA84_14==69||(LA84_14 >= 73 && LA84_14 <= 74)||LA84_14==76||LA84_14==78||(LA84_14 >= 80 && LA84_14 <= 81)||(LA84_14 >= 83 && LA84_14 <= 84)||(LA84_14 >= 86 && LA84_14 <= 88)||LA84_14==90||LA84_14==92||(LA84_14 >= 95 && LA84_14 <= 100)||(LA84_14 >= 102 && LA84_14 <= 104)||LA84_14==107||LA84_14==109||LA84_14==114||(LA84_14 >= 117 && LA84_14 <= 118)||(LA84_14 >= 126 && LA84_14 <= 131)||(LA84_14 >= 138 && LA84_14 <= 140)||(LA84_14 >= 143 && LA84_14 <= 144)||(LA84_14 >= 146 && LA84_14 <= 147)||LA84_14==150||(LA84_14 >= 153 && LA84_14 <= 154)||LA84_14==157||LA84_14==160||(LA84_14 >= 162 && LA84_14 <= 165)||(LA84_14 >= 167 && LA84_14 <= 168)||LA84_14==171||(LA84_14 >= 176 && LA84_14 <= 178)||LA84_14==180||(LA84_14 >= 183 && LA84_14 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 80:
					{
					int LA84_15 = input.LA(2);
					if ( (LA84_15==DOT||LA84_15==IDENTIFIER||LA84_15==LCBRACK||LA84_15==69||(LA84_15 >= 73 && LA84_15 <= 74)||LA84_15==76||LA84_15==78||(LA84_15 >= 80 && LA84_15 <= 81)||(LA84_15 >= 83 && LA84_15 <= 84)||(LA84_15 >= 86 && LA84_15 <= 88)||LA84_15==90||LA84_15==92||(LA84_15 >= 95 && LA84_15 <= 100)||(LA84_15 >= 102 && LA84_15 <= 104)||LA84_15==107||LA84_15==109||LA84_15==114||(LA84_15 >= 117 && LA84_15 <= 118)||(LA84_15 >= 126 && LA84_15 <= 131)||(LA84_15 >= 138 && LA84_15 <= 140)||(LA84_15 >= 143 && LA84_15 <= 144)||(LA84_15 >= 146 && LA84_15 <= 147)||LA84_15==150||(LA84_15 >= 153 && LA84_15 <= 154)||LA84_15==157||LA84_15==160||(LA84_15 >= 162 && LA84_15 <= 165)||(LA84_15 >= 167 && LA84_15 <= 168)||LA84_15==171||(LA84_15 >= 176 && LA84_15 <= 178)||LA84_15==180||(LA84_15 >= 183 && LA84_15 <= 185)) ) {
						alt84=1;
					}
					}
					break;
				case 70:
				case 106:
				case 161:
				case 181:
					{
					alt84=1;
					}
					break;
			}
			switch (alt84) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:617:57: vartype
					{
					pushFollow(FOLLOW_vartype_in_normalfunc3084);
					vartype14=vartype();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					                                                                 func.funcReturnType = (vartype14!=null?((UnrealScriptParser.vartype_return)vartype14).typename:null);
					                                                                }
					}
					break;

			}

			pushFollow(FOLLOW_fixedidentifier_in_normalfunc3160);
			name=fixedidentifier();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_funcargsblock_in_normalfunc3166);
			params=funcargsblock(func);
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:620:122: ( 'const' )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==84) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:620:122: 'const'
					{
					match(input,84,FOLLOW_84_in_normalfunc3169); if (state.failed) return;
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:620:131: (startBrack= LCBRACK functionbody[func] endBrack= RCBRACK )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==LCBRACK) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:620:133: startBrack= LCBRACK functionbody[func] endBrack= RCBRACK
					{
					startBrack=(Token)match(input,LCBRACK,FOLLOW_LCBRACK_in_normalfunc3178); if (state.failed) return;
					pushFollow(FOLLOW_functionbody_in_normalfunc3180);
					functionbody(func);
					state._fsp--;
					if (state.failed) return;
					endBrack=(Token)match(input,RCBRACK,FOLLOW_RCBRACK_in_normalfunc3187); if (state.failed) return;
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:620:195: ( SEMICOLON )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==SEMICOLON) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:620:195: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_normalfunc3192); if (state.failed) return;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			                                                                                                                                                                                                              func.funcName = (name!=null?input.toString(name.start,name.stop):null);
			                                                                                                                                                                                                              func.funcParams = (params!=null?input.toString(params.start,params.stop):null);
			                                                                                                                                                                                                              func.startToken = startBrack;
			                                                                                                                                                                                                              func.endToken = endBrack;
			                                                                                                                                                                                                              func.declStartToken = (name!=null?(name.start):null);
			                                                                                                                                                                                                              functions.add(func);
			                                                                                                                                                                                                             }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, normalfunc_StartIndex); }

		}
	}
	// $ANTLR end "normalfunc"


	public static class funcargsblock_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "funcargsblock"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:632:1: funcargsblock[AntlrUCFuncDecl funcDecl] : LBRACK ( functionargs[funcDecl] ( COMMA functionargs[funcDecl] )* )? RBRACK ;
	public final UnrealScriptParser.funcargsblock_return funcargsblock(AntlrUCFuncDecl funcDecl) throws RecognitionException {
		UnrealScriptParser.funcargsblock_return retval = new UnrealScriptParser.funcargsblock_return();
		retval.start = input.LT(1);
		int funcargsblock_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:633:2: ( LBRACK ( functionargs[funcDecl] ( COMMA functionargs[funcDecl] )* )? RBRACK )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:634:2: LBRACK ( functionargs[funcDecl] ( COMMA functionargs[funcDecl] )* )? RBRACK
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_funcargsblock3415); if (state.failed) return retval;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:634:9: ( functionargs[funcDecl] ( COMMA functionargs[funcDecl] )* )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==IDENTIFIER||(LA89_0 >= 69 && LA89_0 <= 70)||(LA89_0 >= 73 && LA89_0 <= 74)||LA89_0==76||LA89_0==78||(LA89_0 >= 80 && LA89_0 <= 81)||(LA89_0 >= 83 && LA89_0 <= 84)||(LA89_0 >= 86 && LA89_0 <= 88)||LA89_0==90||LA89_0==92||(LA89_0 >= 95 && LA89_0 <= 100)||(LA89_0 >= 102 && LA89_0 <= 104)||(LA89_0 >= 106 && LA89_0 <= 107)||LA89_0==109||LA89_0==114||(LA89_0 >= 117 && LA89_0 <= 118)||(LA89_0 >= 126 && LA89_0 <= 131)||(LA89_0 >= 138 && LA89_0 <= 140)||(LA89_0 >= 143 && LA89_0 <= 144)||(LA89_0 >= 146 && LA89_0 <= 147)||LA89_0==150||(LA89_0 >= 153 && LA89_0 <= 154)||LA89_0==157||(LA89_0 >= 160 && LA89_0 <= 165)||(LA89_0 >= 167 && LA89_0 <= 168)||LA89_0==171||(LA89_0 >= 176 && LA89_0 <= 178)||(LA89_0 >= 180 && LA89_0 <= 181)||(LA89_0 >= 183 && LA89_0 <= 185)) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:634:11: functionargs[funcDecl] ( COMMA functionargs[funcDecl] )*
					{
					pushFollow(FOLLOW_functionargs_in_funcargsblock3419);
					functionargs(funcDecl);
					state._fsp--;
					if (state.failed) return retval;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:634:34: ( COMMA functionargs[funcDecl] )*
					loop88:
					while (true) {
						int alt88=2;
						int LA88_0 = input.LA(1);
						if ( (LA88_0==COMMA) ) {
							alt88=1;
						}

						switch (alt88) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:634:36: COMMA functionargs[funcDecl]
							{
							match(input,COMMA,FOLLOW_COMMA_in_funcargsblock3424); if (state.failed) return retval;
							pushFollow(FOLLOW_functionargs_in_funcargsblock3426);
							functionargs(funcDecl);
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop88;
						}
					}

					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_funcargsblock3435); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, funcargsblock_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "funcargsblock"



	// $ANTLR start "functionparams"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:638:1: functionparams : ( constfunctparams | 'native' ( LBRACK INTVAL RBRACK )? );
	public final void functionparams() throws RecognitionException {
		int functionparams_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:639:2: ( constfunctparams | 'native' ( LBRACK INTVAL RBRACK )? )
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( ((LA91_0 >= 80 && LA91_0 <= 81)||LA91_0==108||LA91_0==113||(LA91_0 >= 132 && LA91_0 <= 136)||(LA91_0 >= 144 && LA91_0 <= 145)||LA91_0==160||LA91_0==162||(LA91_0 >= 164 && LA91_0 <= 165)||LA91_0==172||(LA91_0 >= 174 && LA91_0 <= 175)||LA91_0==178||LA91_0==184||LA91_0==187||LA91_0==190) ) {
				alt91=1;
			}
			else if ( (LA91_0==140) ) {
				alt91=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}

			switch (alt91) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:640:2: constfunctparams
					{
					pushFollow(FOLLOW_constfunctparams_in_functionparams3448);
					constfunctparams();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:641:4: 'native' ( LBRACK INTVAL RBRACK )?
					{
					match(input,140,FOLLOW_140_in_functionparams3453); if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:641:13: ( LBRACK INTVAL RBRACK )?
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==LBRACK) ) {
						alt90=1;
					}
					switch (alt90) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:641:15: LBRACK INTVAL RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_functionparams3457); if (state.failed) return;
							match(input,INTVAL,FOLLOW_INTVAL_in_functionparams3459); if (state.failed) return;
							match(input,RBRACK,FOLLOW_RBRACK_in_functionparams3461); if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, functionparams_StartIndex); }

		}
	}
	// $ANTLR end "functionparams"



	// $ANTLR start "operatorfunc"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:645:1: operatorfunc : ( functionparams )* operatortype[func] ( LCBRACK functionbody[func] RCBRACK )? ( SEMICOLON )? ;
	public final void operatorfunc() throws RecognitionException {
		int operatorfunc_StartIndex = input.index();


		AntlrUCFuncDecl func = new AntlrUCFuncDecl();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:650:2: ( ( functionparams )* operatortype[func] ( LCBRACK functionbody[func] RCBRACK )? ( SEMICOLON )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:651:2: ( functionparams )* operatortype[func] ( LCBRACK functionbody[func] RCBRACK )? ( SEMICOLON )?
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:651:2: ( functionparams )*
			loop92:
			while (true) {
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( ((LA92_0 >= 80 && LA92_0 <= 81)||LA92_0==108||LA92_0==113||(LA92_0 >= 132 && LA92_0 <= 136)||LA92_0==140||(LA92_0 >= 144 && LA92_0 <= 145)||LA92_0==160||LA92_0==162||(LA92_0 >= 164 && LA92_0 <= 165)||LA92_0==172||(LA92_0 >= 174 && LA92_0 <= 175)||LA92_0==178||LA92_0==184||LA92_0==187||LA92_0==190) ) {
					alt92=1;
				}

				switch (alt92) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:651:4: functionparams
					{
					pushFollow(FOLLOW_functionparams_in_operatorfunc3484);
					functionparams();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop92;
				}
			}

			pushFollow(FOLLOW_operatortype_in_operatorfunc3489);
			operatortype(func);
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:651:41: ( LCBRACK functionbody[func] RCBRACK )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==LCBRACK) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:651:43: LCBRACK functionbody[func] RCBRACK
					{
					match(input,LCBRACK,FOLLOW_LCBRACK_in_operatorfunc3494); if (state.failed) return;
					pushFollow(FOLLOW_functionbody_in_operatorfunc3496);
					functionbody(func);
					state._fsp--;
					if (state.failed) return;
					match(input,RCBRACK,FOLLOW_RCBRACK_in_operatorfunc3499); if (state.failed) return;
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:651:81: ( SEMICOLON )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==SEMICOLON) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:651:81: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_operatorfunc3504); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, operatorfunc_StartIndex); }

		}
	}
	// $ANTLR end "operatorfunc"



	// $ANTLR start "operatortype"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:655:1: operatortype[AntlrUCFuncDecl func] : ( binaryoperator[func] | unaryoperator[func] ) ;
	public final void operatortype(AntlrUCFuncDecl func) throws RecognitionException {
		int operatortype_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:656:2: ( ( binaryoperator[func] | unaryoperator[func] ) )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:657:2: ( binaryoperator[func] | unaryoperator[func] )
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:657:2: ( binaryoperator[func] | unaryoperator[func] )
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==152) ) {
				alt95=1;
			}
			else if ( ((LA95_0 >= 158 && LA95_0 <= 159)) ) {
				alt95=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}

			switch (alt95) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:658:3: binaryoperator[func]
					{
					pushFollow(FOLLOW_binaryoperator_in_operatortype3523);
					binaryoperator(func);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:659:5: unaryoperator[func]
					{
					pushFollow(FOLLOW_unaryoperator_in_operatortype3530);
					unaryoperator(func);
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, operatortype_StartIndex); }

		}
	}
	// $ANTLR end "operatortype"



	// $ANTLR start "binaryoperator"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:665:1: binaryoperator[AntlrUCFuncDecl func] : 'operator' LBRACK INTVAL RBRACK vartype opidentifier LBRACK functionargs[func] COMMA functionargs[func] RBRACK ;
	public final void binaryoperator(AntlrUCFuncDecl func) throws RecognitionException {
		int binaryoperator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:666:2: ( 'operator' LBRACK INTVAL RBRACK vartype opidentifier LBRACK functionargs[func] COMMA functionargs[func] RBRACK )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:667:2: 'operator' LBRACK INTVAL RBRACK vartype opidentifier LBRACK functionargs[func] COMMA functionargs[func] RBRACK
			{
			match(input,152,FOLLOW_152_in_binaryoperator3549); if (state.failed) return;
			match(input,LBRACK,FOLLOW_LBRACK_in_binaryoperator3551); if (state.failed) return;
			match(input,INTVAL,FOLLOW_INTVAL_in_binaryoperator3553); if (state.failed) return;
			match(input,RBRACK,FOLLOW_RBRACK_in_binaryoperator3555); if (state.failed) return;
			pushFollow(FOLLOW_vartype_in_binaryoperator3557);
			vartype();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_opidentifier_in_binaryoperator3559);
			opidentifier();
			state._fsp--;
			if (state.failed) return;
			match(input,LBRACK,FOLLOW_LBRACK_in_binaryoperator3561); if (state.failed) return;
			pushFollow(FOLLOW_functionargs_in_binaryoperator3563);
			functionargs(func);
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_binaryoperator3566); if (state.failed) return;
			pushFollow(FOLLOW_functionargs_in_binaryoperator3568);
			functionargs(func);
			state._fsp--;
			if (state.failed) return;
			match(input,RBRACK,FOLLOW_RBRACK_in_binaryoperator3571); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, binaryoperator_StartIndex); }

		}
	}
	// $ANTLR end "binaryoperator"



	// $ANTLR start "unaryoperator"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:672:1: unaryoperator[AntlrUCFuncDecl func] : ( 'preoperator' | 'postoperator' ) vartype opidentifier LBRACK functionargs[func] RBRACK ;
	public final void unaryoperator(AntlrUCFuncDecl func) throws RecognitionException {
		int unaryoperator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:673:2: ( ( 'preoperator' | 'postoperator' ) vartype opidentifier LBRACK functionargs[func] RBRACK )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:674:2: ( 'preoperator' | 'postoperator' ) vartype opidentifier LBRACK functionargs[func] RBRACK
			{
			if ( (input.LA(1) >= 158 && input.LA(1) <= 159) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_vartype_in_unaryoperator3602);
			vartype();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_opidentifier_in_unaryoperator3604);
			opidentifier();
			state._fsp--;
			if (state.failed) return;
			match(input,LBRACK,FOLLOW_LBRACK_in_unaryoperator3606); if (state.failed) return;
			pushFollow(FOLLOW_functionargs_in_unaryoperator3608);
			functionargs(func);
			state._fsp--;
			if (state.failed) return;
			match(input,RBRACK,FOLLOW_RBRACK_in_unaryoperator3611); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, unaryoperator_StartIndex); }

		}
	}
	// $ANTLR end "unaryoperator"



	// $ANTLR start "opidentifier"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:682:1: opidentifier : ( fixedidentifier | operatornames );
	public final void opidentifier() throws RecognitionException {
		int opidentifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:683:2: ( fixedidentifier | operatornames )
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==IDENTIFIER||LA96_0==69||(LA96_0 >= 73 && LA96_0 <= 74)||LA96_0==76||LA96_0==78||(LA96_0 >= 80 && LA96_0 <= 81)||(LA96_0 >= 83 && LA96_0 <= 84)||(LA96_0 >= 86 && LA96_0 <= 88)||LA96_0==90||LA96_0==92||(LA96_0 >= 95 && LA96_0 <= 100)||(LA96_0 >= 102 && LA96_0 <= 104)||LA96_0==107||LA96_0==109||LA96_0==114||(LA96_0 >= 117 && LA96_0 <= 118)||(LA96_0 >= 126 && LA96_0 <= 131)||(LA96_0 >= 138 && LA96_0 <= 140)||(LA96_0 >= 143 && LA96_0 <= 144)||(LA96_0 >= 146 && LA96_0 <= 147)||LA96_0==150||(LA96_0 >= 153 && LA96_0 <= 154)||LA96_0==157||LA96_0==160||(LA96_0 >= 162 && LA96_0 <= 165)||(LA96_0 >= 167 && LA96_0 <= 168)||LA96_0==171||(LA96_0 >= 176 && LA96_0 <= 178)||LA96_0==180||(LA96_0 >= 183 && LA96_0 <= 185)) ) {
				alt96=1;
			}
			else if ( (LA96_0==COLON||LA96_0==EQUALS||LA96_0==LABRACK||LA96_0==RABRACK||(LA96_0 >= 35 && LA96_0 <= 66)||(LA96_0 >= 193 && LA96_0 <= 196)) ) {
				alt96=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}

			switch (alt96) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:684:2: fixedidentifier
					{
					pushFollow(FOLLOW_fixedidentifier_in_opidentifier3624);
					fixedidentifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:685:4: operatornames
					{
					pushFollow(FOLLOW_operatornames_in_opidentifier3629);
					operatornames();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, opidentifier_StartIndex); }

		}
	}
	// $ANTLR end "opidentifier"



	// $ANTLR start "functionargs"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:689:1: functionargs[AntlrUCFuncDecl funcDecl] : ( 'optional' | 'out' | 'coerce' | 'const' | 'skip' | 'init' )* vartype fixedidentifier ( LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK )? ( EQUALS expr )? ;
	public final void functionargs(AntlrUCFuncDecl funcDecl) throws RecognitionException {
		int functionargs_StartIndex = input.index();

		ParserRuleReturnScope fixedidentifier15 =null;
		ParserRuleReturnScope vartype16 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:690:2: ( ( 'optional' | 'out' | 'coerce' | 'const' | 'skip' | 'init' )* vartype fixedidentifier ( LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK )? ( EQUALS expr )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:691:2: ( 'optional' | 'out' | 'coerce' | 'const' | 'skip' | 'init' )* vartype fixedidentifier ( LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK )? ( EQUALS expr )?
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:691:2: ( 'optional' | 'out' | 'coerce' | 'const' | 'skip' | 'init' )*
			loop97:
			while (true) {
				int alt97=2;
				int LA97_0 = input.LA(1);
				if ( (LA97_0==81||LA97_0==84||LA97_0==126||(LA97_0 >= 153 && LA97_0 <= 154)||LA97_0==176) ) {
					switch ( input.LA(2) ) {
					case IDENTIFIER:
						{
						int LA97_3 = input.LA(3);
						if ( (LA97_3==DOT||LA97_3==IDENTIFIER||LA97_3==LCBRACK||LA97_3==69||(LA97_3 >= 73 && LA97_3 <= 74)||LA97_3==76||LA97_3==78||(LA97_3 >= 80 && LA97_3 <= 81)||(LA97_3 >= 83 && LA97_3 <= 84)||(LA97_3 >= 86 && LA97_3 <= 88)||LA97_3==90||LA97_3==92||(LA97_3 >= 95 && LA97_3 <= 100)||(LA97_3 >= 102 && LA97_3 <= 104)||LA97_3==107||LA97_3==109||LA97_3==114||(LA97_3 >= 117 && LA97_3 <= 118)||(LA97_3 >= 126 && LA97_3 <= 131)||(LA97_3 >= 138 && LA97_3 <= 140)||(LA97_3 >= 143 && LA97_3 <= 144)||(LA97_3 >= 146 && LA97_3 <= 147)||LA97_3==150||(LA97_3 >= 153 && LA97_3 <= 154)||LA97_3==157||LA97_3==160||(LA97_3 >= 162 && LA97_3 <= 165)||(LA97_3 >= 167 && LA97_3 <= 168)||LA97_3==171||(LA97_3 >= 176 && LA97_3 <= 178)||LA97_3==180||(LA97_3 >= 183 && LA97_3 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 183:
						{
						int LA97_4 = input.LA(3);
						if ( (LA97_4==DOT||LA97_4==IDENTIFIER||LA97_4==LCBRACK||LA97_4==69||(LA97_4 >= 73 && LA97_4 <= 74)||LA97_4==76||LA97_4==78||(LA97_4 >= 80 && LA97_4 <= 81)||(LA97_4 >= 83 && LA97_4 <= 84)||(LA97_4 >= 86 && LA97_4 <= 88)||LA97_4==90||LA97_4==92||(LA97_4 >= 95 && LA97_4 <= 100)||(LA97_4 >= 102 && LA97_4 <= 104)||LA97_4==107||LA97_4==109||LA97_4==114||(LA97_4 >= 117 && LA97_4 <= 118)||(LA97_4 >= 126 && LA97_4 <= 131)||(LA97_4 >= 138 && LA97_4 <= 140)||(LA97_4 >= 143 && LA97_4 <= 144)||(LA97_4 >= 146 && LA97_4 <= 147)||LA97_4==150||(LA97_4 >= 153 && LA97_4 <= 154)||LA97_4==157||LA97_4==160||(LA97_4 >= 162 && LA97_4 <= 165)||(LA97_4 >= 167 && LA97_4 <= 168)||LA97_4==171||(LA97_4 >= 176 && LA97_4 <= 178)||LA97_4==180||(LA97_4 >= 183 && LA97_4 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 73:
						{
						int LA97_5 = input.LA(3);
						if ( (LA97_5==DOT||LA97_5==IDENTIFIER||LA97_5==LCBRACK||LA97_5==69||(LA97_5 >= 73 && LA97_5 <= 74)||LA97_5==76||LA97_5==78||(LA97_5 >= 80 && LA97_5 <= 81)||(LA97_5 >= 83 && LA97_5 <= 84)||(LA97_5 >= 86 && LA97_5 <= 88)||LA97_5==90||LA97_5==92||(LA97_5 >= 95 && LA97_5 <= 100)||(LA97_5 >= 102 && LA97_5 <= 104)||LA97_5==107||LA97_5==109||LA97_5==114||(LA97_5 >= 117 && LA97_5 <= 118)||(LA97_5 >= 126 && LA97_5 <= 131)||(LA97_5 >= 138 && LA97_5 <= 140)||(LA97_5 >= 143 && LA97_5 <= 144)||(LA97_5 >= 146 && LA97_5 <= 147)||LA97_5==150||(LA97_5 >= 153 && LA97_5 <= 154)||LA97_5==157||LA97_5==160||(LA97_5 >= 162 && LA97_5 <= 165)||(LA97_5 >= 167 && LA97_5 <= 168)||LA97_5==171||(LA97_5 >= 176 && LA97_5 <= 178)||LA97_5==180||(LA97_5 >= 183 && LA97_5 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 127:
						{
						int LA97_6 = input.LA(3);
						if ( (LA97_6==DOT||LA97_6==IDENTIFIER||LA97_6==LCBRACK||LA97_6==69||(LA97_6 >= 73 && LA97_6 <= 74)||LA97_6==76||LA97_6==78||(LA97_6 >= 80 && LA97_6 <= 81)||(LA97_6 >= 83 && LA97_6 <= 84)||(LA97_6 >= 86 && LA97_6 <= 88)||LA97_6==90||LA97_6==92||(LA97_6 >= 95 && LA97_6 <= 100)||(LA97_6 >= 102 && LA97_6 <= 104)||LA97_6==107||LA97_6==109||LA97_6==114||(LA97_6 >= 117 && LA97_6 <= 118)||(LA97_6 >= 126 && LA97_6 <= 131)||(LA97_6 >= 138 && LA97_6 <= 140)||(LA97_6 >= 143 && LA97_6 <= 144)||(LA97_6 >= 146 && LA97_6 <= 147)||LA97_6==150||(LA97_6 >= 153 && LA97_6 <= 154)||LA97_6==157||LA97_6==160||(LA97_6 >= 162 && LA97_6 <= 165)||(LA97_6 >= 167 && LA97_6 <= 168)||LA97_6==171||(LA97_6 >= 176 && LA97_6 <= 178)||LA97_6==180||(LA97_6 >= 183 && LA97_6 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 130:
						{
						int LA97_7 = input.LA(3);
						if ( (LA97_7==DOT||LA97_7==IDENTIFIER||LA97_7==LCBRACK||LA97_7==69||(LA97_7 >= 73 && LA97_7 <= 74)||LA97_7==76||LA97_7==78||(LA97_7 >= 80 && LA97_7 <= 81)||(LA97_7 >= 83 && LA97_7 <= 84)||(LA97_7 >= 86 && LA97_7 <= 88)||LA97_7==90||LA97_7==92||(LA97_7 >= 95 && LA97_7 <= 100)||(LA97_7 >= 102 && LA97_7 <= 104)||LA97_7==107||LA97_7==109||LA97_7==114||(LA97_7 >= 117 && LA97_7 <= 118)||(LA97_7 >= 126 && LA97_7 <= 131)||(LA97_7 >= 138 && LA97_7 <= 140)||(LA97_7 >= 143 && LA97_7 <= 144)||(LA97_7 >= 146 && LA97_7 <= 147)||LA97_7==150||(LA97_7 >= 153 && LA97_7 <= 154)||LA97_7==157||LA97_7==160||(LA97_7 >= 162 && LA97_7 <= 165)||(LA97_7 >= 167 && LA97_7 <= 168)||LA97_7==171||(LA97_7 >= 176 && LA97_7 <= 178)||LA97_7==180||(LA97_7 >= 183 && LA97_7 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 178:
						{
						int LA97_8 = input.LA(3);
						if ( (LA97_8==DOT||LA97_8==IDENTIFIER||LA97_8==LCBRACK||LA97_8==69||(LA97_8 >= 73 && LA97_8 <= 74)||LA97_8==76||LA97_8==78||(LA97_8 >= 80 && LA97_8 <= 81)||(LA97_8 >= 83 && LA97_8 <= 84)||(LA97_8 >= 86 && LA97_8 <= 88)||LA97_8==90||LA97_8==92||(LA97_8 >= 95 && LA97_8 <= 100)||(LA97_8 >= 102 && LA97_8 <= 104)||LA97_8==107||LA97_8==109||LA97_8==114||(LA97_8 >= 117 && LA97_8 <= 118)||(LA97_8 >= 126 && LA97_8 <= 131)||(LA97_8 >= 138 && LA97_8 <= 140)||(LA97_8 >= 143 && LA97_8 <= 144)||(LA97_8 >= 146 && LA97_8 <= 147)||LA97_8==150||(LA97_8 >= 153 && LA97_8 <= 154)||LA97_8==157||LA97_8==160||(LA97_8 >= 162 && LA97_8 <= 165)||(LA97_8 >= 167 && LA97_8 <= 168)||LA97_8==171||(LA97_8 >= 176 && LA97_8 <= 178)||LA97_8==180||(LA97_8 >= 183 && LA97_8 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 88:
						{
						int LA97_9 = input.LA(3);
						if ( (LA97_9==DOT||LA97_9==IDENTIFIER||LA97_9==LCBRACK||LA97_9==69||(LA97_9 >= 73 && LA97_9 <= 74)||LA97_9==76||LA97_9==78||(LA97_9 >= 80 && LA97_9 <= 81)||(LA97_9 >= 83 && LA97_9 <= 84)||(LA97_9 >= 86 && LA97_9 <= 88)||LA97_9==90||LA97_9==92||(LA97_9 >= 95 && LA97_9 <= 100)||(LA97_9 >= 102 && LA97_9 <= 104)||LA97_9==107||LA97_9==109||LA97_9==114||(LA97_9 >= 117 && LA97_9 <= 118)||(LA97_9 >= 126 && LA97_9 <= 131)||(LA97_9 >= 138 && LA97_9 <= 140)||(LA97_9 >= 143 && LA97_9 <= 144)||(LA97_9 >= 146 && LA97_9 <= 147)||LA97_9==150||(LA97_9 >= 153 && LA97_9 <= 154)||LA97_9==157||LA97_9==160||(LA97_9 >= 162 && LA97_9 <= 165)||(LA97_9 >= 167 && LA97_9 <= 168)||LA97_9==171||(LA97_9 >= 176 && LA97_9 <= 178)||LA97_9==180||(LA97_9 >= 183 && LA97_9 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 107:
						{
						int LA97_10 = input.LA(3);
						if ( (LA97_10==DOT||LA97_10==IDENTIFIER||LA97_10==LCBRACK||LA97_10==69||(LA97_10 >= 73 && LA97_10 <= 74)||LA97_10==76||LA97_10==78||(LA97_10 >= 80 && LA97_10 <= 81)||(LA97_10 >= 83 && LA97_10 <= 84)||(LA97_10 >= 86 && LA97_10 <= 88)||LA97_10==90||LA97_10==92||(LA97_10 >= 95 && LA97_10 <= 100)||(LA97_10 >= 102 && LA97_10 <= 104)||LA97_10==107||LA97_10==109||LA97_10==114||(LA97_10 >= 117 && LA97_10 <= 118)||(LA97_10 >= 126 && LA97_10 <= 131)||(LA97_10 >= 138 && LA97_10 <= 140)||(LA97_10 >= 143 && LA97_10 <= 144)||(LA97_10 >= 146 && LA97_10 <= 147)||LA97_10==150||(LA97_10 >= 153 && LA97_10 <= 154)||LA97_10==157||LA97_10==160||(LA97_10 >= 162 && LA97_10 <= 165)||(LA97_10 >= 167 && LA97_10 <= 168)||LA97_10==171||(LA97_10 >= 176 && LA97_10 <= 178)||LA97_10==180||(LA97_10 >= 183 && LA97_10 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 177:
						{
						int LA97_11 = input.LA(3);
						if ( (LA97_11==DOT||LA97_11==IDENTIFIER||LA97_11==LCBRACK||LA97_11==69||(LA97_11 >= 73 && LA97_11 <= 74)||LA97_11==76||LA97_11==78||(LA97_11 >= 80 && LA97_11 <= 81)||(LA97_11 >= 83 && LA97_11 <= 84)||(LA97_11 >= 86 && LA97_11 <= 88)||LA97_11==90||LA97_11==92||(LA97_11 >= 95 && LA97_11 <= 100)||(LA97_11 >= 102 && LA97_11 <= 104)||LA97_11==107||LA97_11==109||LA97_11==114||(LA97_11 >= 117 && LA97_11 <= 118)||(LA97_11 >= 126 && LA97_11 <= 131)||(LA97_11 >= 138 && LA97_11 <= 140)||(LA97_11 >= 143 && LA97_11 <= 144)||(LA97_11 >= 146 && LA97_11 <= 147)||LA97_11==150||(LA97_11 >= 153 && LA97_11 <= 154)||LA97_11==157||LA97_11==160||(LA97_11 >= 162 && LA97_11 <= 165)||(LA97_11 >= 167 && LA97_11 <= 168)||LA97_11==171||(LA97_11 >= 176 && LA97_11 <= 178)||LA97_11==180||(LA97_11 >= 183 && LA97_11 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 117:
						{
						int LA97_12 = input.LA(3);
						if ( (LA97_12==DOT||LA97_12==IDENTIFIER||LA97_12==LCBRACK||LA97_12==69||(LA97_12 >= 73 && LA97_12 <= 74)||LA97_12==76||LA97_12==78||(LA97_12 >= 80 && LA97_12 <= 81)||(LA97_12 >= 83 && LA97_12 <= 84)||(LA97_12 >= 86 && LA97_12 <= 88)||LA97_12==90||LA97_12==92||(LA97_12 >= 95 && LA97_12 <= 100)||(LA97_12 >= 102 && LA97_12 <= 104)||LA97_12==107||LA97_12==109||LA97_12==114||(LA97_12 >= 117 && LA97_12 <= 118)||(LA97_12 >= 126 && LA97_12 <= 131)||(LA97_12 >= 138 && LA97_12 <= 140)||(LA97_12 >= 143 && LA97_12 <= 144)||(LA97_12 >= 146 && LA97_12 <= 147)||LA97_12==150||(LA97_12 >= 153 && LA97_12 <= 154)||LA97_12==157||LA97_12==160||(LA97_12 >= 162 && LA97_12 <= 165)||(LA97_12 >= 167 && LA97_12 <= 168)||LA97_12==171||(LA97_12 >= 176 && LA97_12 <= 178)||LA97_12==180||(LA97_12 >= 183 && LA97_12 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 90:
						{
						int LA97_13 = input.LA(3);
						if ( (LA97_13==DOT||LA97_13==IDENTIFIER||LA97_13==LABRACK||LA97_13==LCBRACK||LA97_13==69||(LA97_13 >= 73 && LA97_13 <= 74)||LA97_13==76||LA97_13==78||(LA97_13 >= 80 && LA97_13 <= 81)||(LA97_13 >= 83 && LA97_13 <= 84)||(LA97_13 >= 86 && LA97_13 <= 88)||LA97_13==90||LA97_13==92||(LA97_13 >= 95 && LA97_13 <= 100)||(LA97_13 >= 102 && LA97_13 <= 104)||LA97_13==107||LA97_13==109||LA97_13==114||(LA97_13 >= 117 && LA97_13 <= 118)||(LA97_13 >= 126 && LA97_13 <= 131)||(LA97_13 >= 138 && LA97_13 <= 140)||(LA97_13 >= 143 && LA97_13 <= 144)||(LA97_13 >= 146 && LA97_13 <= 147)||LA97_13==150||(LA97_13 >= 153 && LA97_13 <= 154)||LA97_13==157||LA97_13==160||(LA97_13 >= 162 && LA97_13 <= 165)||(LA97_13 >= 167 && LA97_13 <= 168)||LA97_13==171||(LA97_13 >= 176 && LA97_13 <= 178)||LA97_13==180||(LA97_13 >= 183 && LA97_13 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 81:
					case 84:
					case 126:
					case 153:
					case 154:
					case 176:
						{
						int LA97_14 = input.LA(3);
						if ( (LA97_14==DOT||LA97_14==IDENTIFIER||LA97_14==LCBRACK||(LA97_14 >= 69 && LA97_14 <= 70)||(LA97_14 >= 73 && LA97_14 <= 74)||LA97_14==76||LA97_14==78||(LA97_14 >= 80 && LA97_14 <= 81)||(LA97_14 >= 83 && LA97_14 <= 84)||(LA97_14 >= 86 && LA97_14 <= 88)||LA97_14==90||LA97_14==92||(LA97_14 >= 95 && LA97_14 <= 100)||(LA97_14 >= 102 && LA97_14 <= 104)||(LA97_14 >= 106 && LA97_14 <= 107)||LA97_14==109||LA97_14==114||(LA97_14 >= 117 && LA97_14 <= 118)||(LA97_14 >= 126 && LA97_14 <= 131)||(LA97_14 >= 138 && LA97_14 <= 140)||(LA97_14 >= 143 && LA97_14 <= 144)||(LA97_14 >= 146 && LA97_14 <= 147)||LA97_14==150||(LA97_14 >= 153 && LA97_14 <= 154)||LA97_14==157||(LA97_14 >= 160 && LA97_14 <= 165)||(LA97_14 >= 167 && LA97_14 <= 168)||LA97_14==171||(LA97_14 >= 176 && LA97_14 <= 178)||(LA97_14 >= 180 && LA97_14 <= 181)||(LA97_14 >= 183 && LA97_14 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 78:
						{
						int LA97_15 = input.LA(3);
						if ( (LA97_15==DOT||LA97_15==IDENTIFIER||LA97_15==LABRACK||LA97_15==LCBRACK||LA97_15==69||(LA97_15 >= 73 && LA97_15 <= 74)||LA97_15==76||LA97_15==78||(LA97_15 >= 80 && LA97_15 <= 81)||(LA97_15 >= 83 && LA97_15 <= 84)||(LA97_15 >= 86 && LA97_15 <= 88)||LA97_15==90||LA97_15==92||(LA97_15 >= 95 && LA97_15 <= 100)||(LA97_15 >= 102 && LA97_15 <= 104)||LA97_15==107||LA97_15==109||LA97_15==114||(LA97_15 >= 117 && LA97_15 <= 118)||(LA97_15 >= 126 && LA97_15 <= 131)||(LA97_15 >= 138 && LA97_15 <= 140)||(LA97_15 >= 143 && LA97_15 <= 144)||(LA97_15 >= 146 && LA97_15 <= 147)||LA97_15==150||(LA97_15 >= 153 && LA97_15 <= 154)||LA97_15==157||LA97_15==160||(LA97_15 >= 162 && LA97_15 <= 165)||(LA97_15 >= 167 && LA97_15 <= 168)||LA97_15==171||(LA97_15 >= 176 && LA97_15 <= 178)||LA97_15==180||(LA97_15 >= 183 && LA97_15 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 80:
						{
						int LA97_16 = input.LA(3);
						if ( (LA97_16==DOT||LA97_16==IDENTIFIER||LA97_16==LCBRACK||LA97_16==69||(LA97_16 >= 73 && LA97_16 <= 74)||LA97_16==76||LA97_16==78||(LA97_16 >= 80 && LA97_16 <= 81)||(LA97_16 >= 83 && LA97_16 <= 84)||(LA97_16 >= 86 && LA97_16 <= 88)||LA97_16==90||LA97_16==92||(LA97_16 >= 95 && LA97_16 <= 100)||(LA97_16 >= 102 && LA97_16 <= 104)||LA97_16==107||LA97_16==109||LA97_16==114||(LA97_16 >= 117 && LA97_16 <= 118)||(LA97_16 >= 126 && LA97_16 <= 131)||(LA97_16 >= 138 && LA97_16 <= 140)||(LA97_16 >= 143 && LA97_16 <= 144)||(LA97_16 >= 146 && LA97_16 <= 147)||LA97_16==150||(LA97_16 >= 153 && LA97_16 <= 154)||LA97_16==157||LA97_16==160||(LA97_16 >= 162 && LA97_16 <= 165)||(LA97_16 >= 167 && LA97_16 <= 168)||LA97_16==171||(LA97_16 >= 176 && LA97_16 <= 178)||LA97_16==180||(LA97_16 >= 183 && LA97_16 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 74:
					case 76:
					case 114:
					case 129:
					case 139:
					case 157:
					case 180:
						{
						int LA97_17 = input.LA(3);
						if ( (LA97_17==DOT||LA97_17==IDENTIFIER||LA97_17==LCBRACK||LA97_17==69||(LA97_17 >= 73 && LA97_17 <= 74)||LA97_17==76||LA97_17==78||(LA97_17 >= 80 && LA97_17 <= 81)||(LA97_17 >= 83 && LA97_17 <= 84)||(LA97_17 >= 86 && LA97_17 <= 88)||LA97_17==90||LA97_17==92||(LA97_17 >= 95 && LA97_17 <= 100)||(LA97_17 >= 102 && LA97_17 <= 104)||LA97_17==107||LA97_17==109||LA97_17==114||(LA97_17 >= 117 && LA97_17 <= 118)||(LA97_17 >= 126 && LA97_17 <= 131)||(LA97_17 >= 138 && LA97_17 <= 140)||(LA97_17 >= 143 && LA97_17 <= 144)||(LA97_17 >= 146 && LA97_17 <= 147)||LA97_17==150||(LA97_17 >= 153 && LA97_17 <= 154)||LA97_17==157||LA97_17==160||(LA97_17 >= 162 && LA97_17 <= 165)||(LA97_17 >= 167 && LA97_17 <= 168)||LA97_17==171||(LA97_17 >= 176 && LA97_17 <= 178)||LA97_17==180||(LA97_17 >= 183 && LA97_17 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					case 70:
					case 106:
					case 161:
					case 181:
						{
						alt97=1;
						}
						break;
					case 69:
					case 83:
					case 86:
					case 87:
					case 92:
					case 95:
					case 96:
					case 97:
					case 98:
					case 99:
					case 100:
					case 102:
					case 103:
					case 104:
					case 109:
					case 118:
					case 128:
					case 131:
					case 138:
					case 140:
					case 143:
					case 144:
					case 146:
					case 147:
					case 150:
					case 160:
					case 162:
					case 163:
					case 164:
					case 165:
					case 167:
					case 168:
					case 171:
					case 184:
					case 185:
						{
						int LA97_19 = input.LA(3);
						if ( (LA97_19==DOT||LA97_19==IDENTIFIER||LA97_19==LCBRACK||LA97_19==69||(LA97_19 >= 73 && LA97_19 <= 74)||LA97_19==76||LA97_19==78||(LA97_19 >= 80 && LA97_19 <= 81)||(LA97_19 >= 83 && LA97_19 <= 84)||(LA97_19 >= 86 && LA97_19 <= 88)||LA97_19==90||LA97_19==92||(LA97_19 >= 95 && LA97_19 <= 100)||(LA97_19 >= 102 && LA97_19 <= 104)||LA97_19==107||LA97_19==109||LA97_19==114||(LA97_19 >= 117 && LA97_19 <= 118)||(LA97_19 >= 126 && LA97_19 <= 131)||(LA97_19 >= 138 && LA97_19 <= 140)||(LA97_19 >= 143 && LA97_19 <= 144)||(LA97_19 >= 146 && LA97_19 <= 147)||LA97_19==150||(LA97_19 >= 153 && LA97_19 <= 154)||LA97_19==157||LA97_19==160||(LA97_19 >= 162 && LA97_19 <= 165)||(LA97_19 >= 167 && LA97_19 <= 168)||LA97_19==171||(LA97_19 >= 176 && LA97_19 <= 178)||LA97_19==180||(LA97_19 >= 183 && LA97_19 <= 185)) ) {
							alt97=1;
						}

						}
						break;
					}
				}

				switch (alt97) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
					{
					if ( input.LA(1)==81||input.LA(1)==84||input.LA(1)==126||(input.LA(1) >= 153 && input.LA(1) <= 154)||input.LA(1)==176 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop97;
				}
			}

			pushFollow(FOLLOW_vartype_in_functionargs3684);
			vartype16=vartype();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_fixedidentifier_in_functionargs3686);
			fixedidentifier15=fixedidentifier();
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:700:2: ( LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==LSBRACK) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:701:3: LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK
					{
					match(input,LSBRACK,FOLLOW_LSBRACK_in_functionargs3693); if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:702:3: ( INTVAL | qualifiedidentifier )
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==INTVAL) ) {
						alt98=1;
					}
					else if ( (LA98_0==IDENTIFIER||LA98_0==69||(LA98_0 >= 73 && LA98_0 <= 74)||LA98_0==76||LA98_0==78||(LA98_0 >= 80 && LA98_0 <= 81)||(LA98_0 >= 83 && LA98_0 <= 84)||(LA98_0 >= 86 && LA98_0 <= 88)||LA98_0==90||LA98_0==92||(LA98_0 >= 95 && LA98_0 <= 100)||(LA98_0 >= 102 && LA98_0 <= 104)||(LA98_0 >= 106 && LA98_0 <= 107)||LA98_0==109||LA98_0==114||(LA98_0 >= 117 && LA98_0 <= 118)||(LA98_0 >= 126 && LA98_0 <= 131)||(LA98_0 >= 138 && LA98_0 <= 140)||(LA98_0 >= 143 && LA98_0 <= 144)||(LA98_0 >= 146 && LA98_0 <= 147)||LA98_0==150||(LA98_0 >= 153 && LA98_0 <= 154)||LA98_0==157||(LA98_0 >= 160 && LA98_0 <= 165)||(LA98_0 >= 167 && LA98_0 <= 168)||LA98_0==171||(LA98_0 >= 176 && LA98_0 <= 178)||LA98_0==180||(LA98_0 >= 183 && LA98_0 <= 185)) ) {
						alt98=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 98, 0, input);
						throw nvae;
					}

					switch (alt98) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:703:4: INTVAL
							{
							match(input,INTVAL,FOLLOW_INTVAL_in_functionargs3702); if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:704:6: qualifiedidentifier
							{
							pushFollow(FOLLOW_qualifiedidentifier_in_functionargs3709);
							qualifiedidentifier();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,RSBRACK,FOLLOW_RSBRACK_in_functionargs3717); if (state.failed) return;
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:708:2: ( EQUALS expr )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==EQUALS) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:708:4: EQUALS expr
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_functionargs3726); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_functionargs3728);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			                   funcDecl.params.add(new AntlrUCVarDecl((fixedidentifier15!=null?input.toString(fixedidentifier15.start,fixedidentifier15.stop):null),
			                   		(vartype16!=null?((UnrealScriptParser.vartype_return)vartype16).typename:null), (vartype16!=null?((UnrealScriptParser.vartype_return)vartype16).arrayInner:null), false, (fixedidentifier15!=null?(fixedidentifier15.start):null)));
			                  }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, functionargs_StartIndex); }

		}
	}
	// $ANTLR end "functionargs"



	// $ANTLR start "functionbody"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:716:1: functionbody[AntlrUCFuncDecl funcDecl] : ( localdecl[funcDecl] )* ( codeline )* ;
	public final void functionbody(AntlrUCFuncDecl funcDecl) throws RecognitionException {
		int functionbody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:717:2: ( ( localdecl[funcDecl] )* ( codeline )* )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:718:2: ( localdecl[funcDecl] )* ( codeline )*
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:718:2: ( localdecl[funcDecl] )*
			loop101:
			while (true) {
				int alt101=2;
				int LA101_0 = input.LA(1);
				if ( (LA101_0==137) ) {
					alt101=1;
				}

				switch (alt101) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:718:4: localdecl[funcDecl]
					{
					pushFollow(FOLLOW_localdecl_in_functionbody3768);
					localdecl(funcDecl);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop101;
				}
			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:718:27: ( codeline )*
			loop102:
			while (true) {
				int alt102=2;
				int LA102_0 = input.LA(1);
				if ( (LA102_0==FLOATVAL||LA102_0==IDENTIFIER||LA102_0==INTVAL||LA102_0==LBRACK||(LA102_0 >= SQUOTE && LA102_0 <= STRINGVAL)||LA102_0==47||(LA102_0 >= 49 && LA102_0 <= 50)||LA102_0==67||(LA102_0 >= 69 && LA102_0 <= 70)||(LA102_0 >= 73 && LA102_0 <= 76)||LA102_0==78||(LA102_0 >= 80 && LA102_0 <= 81)||(LA102_0 >= 83 && LA102_0 <= 88)||LA102_0==90||(LA102_0 >= 92 && LA102_0 <= 93)||(LA102_0 >= 95 && LA102_0 <= 100)||(LA102_0 >= 102 && LA102_0 <= 104)||(LA102_0 >= 106 && LA102_0 <= 107)||LA102_0==109||LA102_0==112||(LA102_0 >= 114 && LA102_0 <= 118)||LA102_0==120||(LA102_0 >= 126 && LA102_0 <= 131)||(LA102_0 >= 138 && LA102_0 <= 140)||(LA102_0 >= 142 && LA102_0 <= 144)||(LA102_0 >= 146 && LA102_0 <= 147)||LA102_0==150||(LA102_0 >= 153 && LA102_0 <= 154)||LA102_0==157||(LA102_0 >= 160 && LA102_0 <= 165)||(LA102_0 >= 167 && LA102_0 <= 169)||LA102_0==171||(LA102_0 >= 176 && LA102_0 <= 178)||(LA102_0 >= 180 && LA102_0 <= 181)||(LA102_0 >= 183 && LA102_0 <= 186)||LA102_0==191) ) {
					alt102=1;
				}

				switch (alt102) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:718:29: codeline
					{
					pushFollow(FOLLOW_codeline_in_functionbody3776);
					codeline();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop102;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, functionbody_StartIndex); }

		}
	}
	// $ANTLR end "functionbody"



	// $ANTLR start "localdecl"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:724:1: localdecl[AntlrUCFuncDecl funcDecl] : 'local' vartype id= varidentifier ( COMMA id= varidentifier )* ( SEMICOLON )* ;
	public final void localdecl(AntlrUCFuncDecl funcDecl) throws RecognitionException {
		int localdecl_StartIndex = input.index();

		ParserRuleReturnScope id =null;
		ParserRuleReturnScope vartype17 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:725:2: ( 'local' vartype id= varidentifier ( COMMA id= varidentifier )* ( SEMICOLON )* )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:726:2: 'local' vartype id= varidentifier ( COMMA id= varidentifier )* ( SEMICOLON )*
			{
			match(input,137,FOLLOW_137_in_localdecl3795); if (state.failed) return;
			pushFollow(FOLLOW_vartype_in_localdecl3797);
			vartype17=vartype();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_varidentifier_in_localdecl3803);
			id=varidentifier();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			                                     funcDecl.localVars.add(new AntlrUCVarDecl((id!=null?input.toString(id.start,id.stop):null), (vartype17!=null?((UnrealScriptParser.vartype_return)vartype17).typename:null),
			                                     		(vartype17!=null?((UnrealScriptParser.vartype_return)vartype17).arrayInner:null), (id!=null?((UnrealScriptParser.varidentifier_return)id).isArray:false), (id!=null?((UnrealScriptParser.varidentifier_return)id).startToken:null)));
			                                    }
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:731:2: ( COMMA id= varidentifier )*
			loop103:
			while (true) {
				int alt103=2;
				int LA103_0 = input.LA(1);
				if ( (LA103_0==COMMA) ) {
					alt103=1;
				}

				switch (alt103) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:731:4: COMMA id= varidentifier
					{
					match(input,COMMA,FOLLOW_COMMA_in_localdecl3847); if (state.failed) return;
					pushFollow(FOLLOW_varidentifier_in_localdecl3853);
					id=varidentifier();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					                             funcDecl.localVars.add(new AntlrUCVarDecl((id!=null?input.toString(id.start,id.stop):null), (vartype17!=null?((UnrealScriptParser.vartype_return)vartype17).typename:null),
					                             		(vartype17!=null?((UnrealScriptParser.vartype_return)vartype17).arrayInner:null), (id!=null?((UnrealScriptParser.varidentifier_return)id).isArray:false), (id!=null?((UnrealScriptParser.varidentifier_return)id).startToken:null)));
					                            }
					}
					break;

				default :
					break loop103;
				}
			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:735:34: ( SEMICOLON )*
			loop104:
			while (true) {
				int alt104=2;
				int LA104_0 = input.LA(1);
				if ( (LA104_0==SEMICOLON) ) {
					alt104=1;
				}

				switch (alt104) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:735:34: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_localdecl3889); if (state.failed) return;
					}
					break;

				default :
					break loop104;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, localdecl_StartIndex); }

		}
	}
	// $ANTLR end "localdecl"



	// $ANTLR start "localtype"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:739:1: localtype : vartype ;
	public final void localtype() throws RecognitionException {
		int localtype_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:740:2: ( vartype )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:741:2: vartype
			{
			pushFollow(FOLLOW_vartype_in_localtype3903);
			vartype();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, localtype_StartIndex); }

		}
	}
	// $ANTLR end "localtype"



	// $ANTLR start "codeblock"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:748:1: codeblock : ( codeline | ( LCBRACK ( codeline )* RCBRACK ( SEMICOLON )? ) ) ;
	public final void codeblock() throws RecognitionException {
		int codeblock_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:749:2: ( ( codeline | ( LCBRACK ( codeline )* RCBRACK ( SEMICOLON )? ) ) )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:750:2: ( codeline | ( LCBRACK ( codeline )* RCBRACK ( SEMICOLON )? ) )
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:750:2: ( codeline | ( LCBRACK ( codeline )* RCBRACK ( SEMICOLON )? ) )
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==FLOATVAL||LA107_0==IDENTIFIER||LA107_0==INTVAL||LA107_0==LBRACK||(LA107_0 >= SQUOTE && LA107_0 <= STRINGVAL)||LA107_0==47||(LA107_0 >= 49 && LA107_0 <= 50)||LA107_0==67||(LA107_0 >= 69 && LA107_0 <= 70)||(LA107_0 >= 73 && LA107_0 <= 76)||LA107_0==78||(LA107_0 >= 80 && LA107_0 <= 81)||(LA107_0 >= 83 && LA107_0 <= 88)||LA107_0==90||(LA107_0 >= 92 && LA107_0 <= 93)||(LA107_0 >= 95 && LA107_0 <= 100)||(LA107_0 >= 102 && LA107_0 <= 104)||(LA107_0 >= 106 && LA107_0 <= 107)||LA107_0==109||LA107_0==112||(LA107_0 >= 114 && LA107_0 <= 118)||LA107_0==120||(LA107_0 >= 126 && LA107_0 <= 131)||(LA107_0 >= 138 && LA107_0 <= 140)||(LA107_0 >= 142 && LA107_0 <= 144)||(LA107_0 >= 146 && LA107_0 <= 147)||LA107_0==150||(LA107_0 >= 153 && LA107_0 <= 154)||LA107_0==157||(LA107_0 >= 160 && LA107_0 <= 165)||(LA107_0 >= 167 && LA107_0 <= 169)||LA107_0==171||(LA107_0 >= 176 && LA107_0 <= 178)||(LA107_0 >= 180 && LA107_0 <= 181)||(LA107_0 >= 183 && LA107_0 <= 186)||LA107_0==191) ) {
				alt107=1;
			}
			else if ( (LA107_0==LCBRACK) ) {
				alt107=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}

			switch (alt107) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:751:3: codeline
					{
					pushFollow(FOLLOW_codeline_in_codeblock3923);
					codeline();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:752:5: ( LCBRACK ( codeline )* RCBRACK ( SEMICOLON )? )
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:752:5: ( LCBRACK ( codeline )* RCBRACK ( SEMICOLON )? )
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:752:7: LCBRACK ( codeline )* RCBRACK ( SEMICOLON )?
					{
					match(input,LCBRACK,FOLLOW_LCBRACK_in_codeblock3931); if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:752:15: ( codeline )*
					loop105:
					while (true) {
						int alt105=2;
						int LA105_0 = input.LA(1);
						if ( (LA105_0==FLOATVAL||LA105_0==IDENTIFIER||LA105_0==INTVAL||LA105_0==LBRACK||(LA105_0 >= SQUOTE && LA105_0 <= STRINGVAL)||LA105_0==47||(LA105_0 >= 49 && LA105_0 <= 50)||LA105_0==67||(LA105_0 >= 69 && LA105_0 <= 70)||(LA105_0 >= 73 && LA105_0 <= 76)||LA105_0==78||(LA105_0 >= 80 && LA105_0 <= 81)||(LA105_0 >= 83 && LA105_0 <= 88)||LA105_0==90||(LA105_0 >= 92 && LA105_0 <= 93)||(LA105_0 >= 95 && LA105_0 <= 100)||(LA105_0 >= 102 && LA105_0 <= 104)||(LA105_0 >= 106 && LA105_0 <= 107)||LA105_0==109||LA105_0==112||(LA105_0 >= 114 && LA105_0 <= 118)||LA105_0==120||(LA105_0 >= 126 && LA105_0 <= 131)||(LA105_0 >= 138 && LA105_0 <= 140)||(LA105_0 >= 142 && LA105_0 <= 144)||(LA105_0 >= 146 && LA105_0 <= 147)||LA105_0==150||(LA105_0 >= 153 && LA105_0 <= 154)||LA105_0==157||(LA105_0 >= 160 && LA105_0 <= 165)||(LA105_0 >= 167 && LA105_0 <= 169)||LA105_0==171||(LA105_0 >= 176 && LA105_0 <= 178)||(LA105_0 >= 180 && LA105_0 <= 181)||(LA105_0 >= 183 && LA105_0 <= 186)||LA105_0==191) ) {
							alt105=1;
						}

						switch (alt105) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:752:17: codeline
							{
							pushFollow(FOLLOW_codeline_in_codeblock3935);
							codeline();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop105;
						}
					}

					match(input,RCBRACK,FOLLOW_RCBRACK_in_codeblock3940); if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:752:37: ( SEMICOLON )?
					int alt106=2;
					int LA106_0 = input.LA(1);
					if ( (LA106_0==SEMICOLON) ) {
						int LA106_1 = input.LA(2);
						if ( (synpred169_UnrealScript()) ) {
							alt106=1;
						}
					}
					switch (alt106) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:752:37: SEMICOLON
							{
							match(input,SEMICOLON,FOLLOW_SEMICOLON_in_codeblock3942); if (state.failed) return;
							}
							break;

					}

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, codeblock_StartIndex); }

		}
	}
	// $ANTLR end "codeblock"



	// $ANTLR start "statement"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:757:1: statement : funcoperand SEMICOLON ;
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:758:2: ( funcoperand SEMICOLON )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:759:2: funcoperand SEMICOLON
			{
			pushFollow(FOLLOW_funcoperand_in_statement3963);
			funcoperand();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement3965); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, statement_StartIndex); }

		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "assignment"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:763:1: assignment : ( funccall | qualifiedidentifier ) ( DOT ( funccall | qualifiedidentifier ) )* ( EQUALS | assignop ) expr SEMICOLON ;
	public final void assignment() throws RecognitionException {
		int assignment_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:764:2: ( ( funccall | qualifiedidentifier ) ( DOT ( funccall | qualifiedidentifier ) )* ( EQUALS | assignop ) expr SEMICOLON )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:765:2: ( funccall | qualifiedidentifier ) ( DOT ( funccall | qualifiedidentifier ) )* ( EQUALS | assignop ) expr SEMICOLON
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:765:2: ( funccall | qualifiedidentifier )
			int alt108=2;
			switch ( input.LA(1) ) {
			case 78:
				{
				int LA108_1 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case IDENTIFIER:
				{
				int LA108_2 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 67:
			case 70:
			case 181:
				{
				alt108=1;
				}
				break;
			case 161:
				{
				int LA108_4 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 183:
				{
				int LA108_5 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 73:
				{
				int LA108_6 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 127:
				{
				int LA108_7 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 130:
				{
				int LA108_8 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 178:
				{
				int LA108_9 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 88:
				{
				int LA108_10 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 107:
				{
				int LA108_11 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 177:
				{
				int LA108_12 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 117:
				{
				int LA108_13 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 90:
				{
				int LA108_14 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 69:
			case 81:
			case 83:
			case 84:
			case 86:
			case 87:
			case 92:
			case 95:
			case 96:
			case 97:
			case 98:
			case 99:
			case 100:
			case 102:
			case 103:
			case 104:
			case 109:
			case 118:
			case 126:
			case 128:
			case 131:
			case 138:
			case 140:
			case 143:
			case 144:
			case 146:
			case 147:
			case 150:
			case 153:
			case 154:
			case 160:
			case 162:
			case 163:
			case 164:
			case 165:
			case 167:
			case 168:
			case 171:
			case 176:
			case 184:
			case 185:
				{
				int LA108_15 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 74:
			case 76:
			case 114:
			case 129:
			case 139:
			case 157:
			case 180:
				{
				int LA108_16 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 80:
				{
				int LA108_17 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			case 106:
				{
				int LA108_18 = input.LA(2);
				if ( (synpred170_UnrealScript()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 108, 0, input);
				throw nvae;
			}
			switch (alt108) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:766:3: funccall
					{
					pushFollow(FOLLOW_funccall_in_assignment3982);
					funccall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:767:5: qualifiedidentifier
					{
					pushFollow(FOLLOW_qualifiedidentifier_in_assignment3988);
					qualifiedidentifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:769:2: ( DOT ( funccall | qualifiedidentifier ) )*
			loop110:
			while (true) {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==DOT) ) {
					alt110=1;
				}

				switch (alt110) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:770:3: DOT ( funccall | qualifiedidentifier )
					{
					match(input,DOT,FOLLOW_DOT_in_assignment3998); if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:771:3: ( funccall | qualifiedidentifier )
					int alt109=2;
					switch ( input.LA(1) ) {
					case 78:
						{
						int LA109_1 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case IDENTIFIER:
						{
						int LA109_2 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 67:
					case 70:
					case 181:
						{
						alt109=1;
						}
						break;
					case 161:
						{
						int LA109_4 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 183:
						{
						int LA109_5 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 73:
						{
						int LA109_6 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 127:
						{
						int LA109_7 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 130:
						{
						int LA109_8 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 178:
						{
						int LA109_9 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 88:
						{
						int LA109_10 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 107:
						{
						int LA109_11 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 177:
						{
						int LA109_12 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 117:
						{
						int LA109_13 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 90:
						{
						int LA109_14 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 69:
					case 81:
					case 83:
					case 84:
					case 86:
					case 87:
					case 92:
					case 95:
					case 96:
					case 97:
					case 98:
					case 99:
					case 100:
					case 102:
					case 103:
					case 104:
					case 109:
					case 118:
					case 126:
					case 128:
					case 131:
					case 138:
					case 140:
					case 143:
					case 144:
					case 146:
					case 147:
					case 150:
					case 153:
					case 154:
					case 160:
					case 162:
					case 163:
					case 164:
					case 165:
					case 167:
					case 168:
					case 171:
					case 176:
					case 184:
					case 185:
						{
						int LA109_15 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 74:
					case 76:
					case 114:
					case 129:
					case 139:
					case 157:
					case 180:
						{
						int LA109_16 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 80:
						{
						int LA109_17 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					case 106:
						{
						int LA109_18 = input.LA(2);
						if ( (synpred171_UnrealScript()) ) {
							alt109=1;
						}
						else if ( (true) ) {
							alt109=2;
						}

						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 109, 0, input);
						throw nvae;
					}
					switch (alt109) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:772:4: funccall
							{
							pushFollow(FOLLOW_funccall_in_assignment4007);
							funccall();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:773:6: qualifiedidentifier
							{
							pushFollow(FOLLOW_qualifiedidentifier_in_assignment4014);
							qualifiedidentifier();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

				default :
					break loop110;
				}
			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:776:2: ( EQUALS | assignop )
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==EQUALS) ) {
				alt111=1;
			}
			else if ( (LA111_0==39||LA111_0==45||LA111_0==48||LA111_0==51||LA111_0==53||LA111_0==63||LA111_0==196) ) {
				alt111=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}

			switch (alt111) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:777:3: EQUALS
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_assignment4029); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:778:5: assignop
					{
					pushFollow(FOLLOW_assignop_in_assignment4035);
					assignop();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_expr_in_assignment4041);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignment4043); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, assignment_StartIndex); }

		}
	}
	// $ANTLR end "assignment"



	// $ANTLR start "unaryexpr"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:784:1: unaryexpr : ( operand unaryop | unaryop operand );
	public final void unaryexpr() throws RecognitionException {
		int unaryexpr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:785:2: ( operand unaryop | unaryop operand )
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==FLOATVAL||LA112_0==IDENTIFIER||LA112_0==INTVAL||LA112_0==LBRACK||(LA112_0 >= SQUOTE && LA112_0 <= STRINGVAL)||LA112_0==49||LA112_0==67||(LA112_0 >= 69 && LA112_0 <= 70)||(LA112_0 >= 73 && LA112_0 <= 74)||LA112_0==76||LA112_0==78||(LA112_0 >= 80 && LA112_0 <= 81)||(LA112_0 >= 83 && LA112_0 <= 84)||(LA112_0 >= 86 && LA112_0 <= 88)||LA112_0==90||LA112_0==92||(LA112_0 >= 95 && LA112_0 <= 100)||(LA112_0 >= 102 && LA112_0 <= 104)||(LA112_0 >= 106 && LA112_0 <= 107)||LA112_0==109||LA112_0==112||LA112_0==114||(LA112_0 >= 117 && LA112_0 <= 118)||(LA112_0 >= 126 && LA112_0 <= 131)||(LA112_0 >= 138 && LA112_0 <= 140)||(LA112_0 >= 142 && LA112_0 <= 144)||(LA112_0 >= 146 && LA112_0 <= 147)||LA112_0==150||(LA112_0 >= 153 && LA112_0 <= 154)||LA112_0==157||(LA112_0 >= 160 && LA112_0 <= 165)||(LA112_0 >= 167 && LA112_0 <= 168)||LA112_0==171||(LA112_0 >= 176 && LA112_0 <= 178)||(LA112_0 >= 180 && LA112_0 <= 181)||(LA112_0 >= 183 && LA112_0 <= 186)) ) {
				alt112=1;
			}
			else if ( (LA112_0==47||LA112_0==50) ) {
				alt112=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 112, 0, input);
				throw nvae;
			}

			switch (alt112) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:786:2: operand unaryop
					{
					pushFollow(FOLLOW_operand_in_unaryexpr4056);
					operand();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_unaryop_in_unaryexpr4058);
					unaryop();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:787:4: unaryop operand
					{
					pushFollow(FOLLOW_unaryop_in_unaryexpr4063);
					unaryop();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_operand_in_unaryexpr4065);
					operand();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, unaryexpr_StartIndex); }

		}
	}
	// $ANTLR end "unaryexpr"



	// $ANTLR start "ifthenelse"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:791:1: ifthenelse : 'if' LBRACK expr RBRACK codeblock ( 'else' codeblock )? ;
	public final void ifthenelse() throws RecognitionException {
		int ifthenelse_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:792:2: ( 'if' LBRACK expr RBRACK codeblock ( 'else' codeblock )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:793:2: 'if' LBRACK expr RBRACK codeblock ( 'else' codeblock )?
			{
			match(input,120,FOLLOW_120_in_ifthenelse4078); if (state.failed) return;
			match(input,LBRACK,FOLLOW_LBRACK_in_ifthenelse4080); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_ifthenelse4082);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,RBRACK,FOLLOW_RBRACK_in_ifthenelse4084); if (state.failed) return;
			pushFollow(FOLLOW_codeblock_in_ifthenelse4086);
			codeblock();
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:793:36: ( 'else' codeblock )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==105) ) {
				int LA113_1 = input.LA(2);
				if ( (synpred175_UnrealScript()) ) {
					alt113=1;
				}
			}
			switch (alt113) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:793:38: 'else' codeblock
					{
					match(input,105,FOLLOW_105_in_ifthenelse4090); if (state.failed) return;
					pushFollow(FOLLOW_codeblock_in_ifthenelse4092);
					codeblock();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, ifthenelse_StartIndex); }

		}
	}
	// $ANTLR end "ifthenelse"



	// $ANTLR start "whileloop"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:797:1: whileloop : 'while' LBRACK expr RBRACK codeblock ;
	public final void whileloop() throws RecognitionException {
		int whileloop_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:798:2: ( 'while' LBRACK expr RBRACK codeblock )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:799:2: 'while' LBRACK expr RBRACK codeblock
			{
			match(input,191,FOLLOW_191_in_whileloop4108); if (state.failed) return;
			match(input,LBRACK,FOLLOW_LBRACK_in_whileloop4110); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_whileloop4112);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,RBRACK,FOLLOW_RBRACK_in_whileloop4114); if (state.failed) return;
			pushFollow(FOLLOW_codeblock_in_whileloop4116);
			codeblock();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, whileloop_StartIndex); }

		}
	}
	// $ANTLR end "whileloop"



	// $ANTLR start "doloop"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:803:1: doloop : 'do' codeblock 'until' LBRACK expr RBRACK SEMICOLON ;
	public final void doloop() throws RecognitionException {
		int doloop_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:804:2: ( 'do' codeblock 'until' LBRACK expr RBRACK SEMICOLON )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:805:2: 'do' codeblock 'until' LBRACK expr RBRACK SEMICOLON
			{
			match(input,93,FOLLOW_93_in_doloop4129); if (state.failed) return;
			pushFollow(FOLLOW_codeblock_in_doloop4131);
			codeblock();
			state._fsp--;
			if (state.failed) return;
			match(input,188,FOLLOW_188_in_doloop4133); if (state.failed) return;
			match(input,LBRACK,FOLLOW_LBRACK_in_doloop4135); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_doloop4137);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,RBRACK,FOLLOW_RBRACK_in_doloop4139); if (state.failed) return;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_doloop4141); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, doloop_StartIndex); }

		}
	}
	// $ANTLR end "doloop"



	// $ANTLR start "switchcase"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:809:1: switchcase : 'switch' LBRACK expr RBRACK LCBRACK ( caserule )+ ( defaultrule )? RCBRACK ( SEMICOLON )? ;
	public final void switchcase() throws RecognitionException {
		int switchcase_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:810:2: ( 'switch' LBRACK expr RBRACK LCBRACK ( caserule )+ ( defaultrule )? RCBRACK ( SEMICOLON )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:811:2: 'switch' LBRACK expr RBRACK LCBRACK ( caserule )+ ( defaultrule )? RCBRACK ( SEMICOLON )?
			{
			match(input,183,FOLLOW_183_in_switchcase4154); if (state.failed) return;
			match(input,LBRACK,FOLLOW_LBRACK_in_switchcase4156); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_switchcase4158);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,RBRACK,FOLLOW_RBRACK_in_switchcase4160); if (state.failed) return;
			match(input,LCBRACK,FOLLOW_LCBRACK_in_switchcase4162); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:811:38: ( caserule )+
			int cnt114=0;
			loop114:
			while (true) {
				int alt114=2;
				int LA114_0 = input.LA(1);
				if ( (LA114_0==77) ) {
					alt114=1;
				}

				switch (alt114) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:811:40: caserule
					{
					pushFollow(FOLLOW_caserule_in_switchcase4166);
					caserule();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt114 >= 1 ) break loop114;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(114, input);
					throw eee;
				}
				cnt114++;
			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:811:52: ( defaultrule )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==88) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:811:54: defaultrule
					{
					pushFollow(FOLLOW_defaultrule_in_switchcase4173);
					defaultrule();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,RCBRACK,FOLLOW_RCBRACK_in_switchcase4178); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:811:77: ( SEMICOLON )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==SEMICOLON) ) {
				int LA116_1 = input.LA(2);
				if ( (synpred178_UnrealScript()) ) {
					alt116=1;
				}
			}
			switch (alt116) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:811:77: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_switchcase4180); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, switchcase_StartIndex); }

		}
	}
	// $ANTLR end "switchcase"



	// $ANTLR start "caserule"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:815:1: caserule : 'case' ( operand )+ COLON ( LCBRACK codelinenolabel RCBRACK | codelinenolabel )* ;
	public final void caserule() throws RecognitionException {
		int caserule_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:816:2: ( 'case' ( operand )+ COLON ( LCBRACK codelinenolabel RCBRACK | codelinenolabel )* )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:817:2: 'case' ( operand )+ COLON ( LCBRACK codelinenolabel RCBRACK | codelinenolabel )*
			{
			match(input,77,FOLLOW_77_in_caserule4194); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:817:9: ( operand )+
			int cnt117=0;
			loop117:
			while (true) {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==FLOATVAL||LA117_0==IDENTIFIER||LA117_0==INTVAL||LA117_0==LBRACK||(LA117_0 >= SQUOTE && LA117_0 <= STRINGVAL)||LA117_0==49||LA117_0==67||(LA117_0 >= 69 && LA117_0 <= 70)||(LA117_0 >= 73 && LA117_0 <= 74)||LA117_0==76||LA117_0==78||(LA117_0 >= 80 && LA117_0 <= 81)||(LA117_0 >= 83 && LA117_0 <= 84)||(LA117_0 >= 86 && LA117_0 <= 88)||LA117_0==90||LA117_0==92||(LA117_0 >= 95 && LA117_0 <= 100)||(LA117_0 >= 102 && LA117_0 <= 104)||(LA117_0 >= 106 && LA117_0 <= 107)||LA117_0==109||LA117_0==112||LA117_0==114||(LA117_0 >= 117 && LA117_0 <= 118)||(LA117_0 >= 126 && LA117_0 <= 131)||(LA117_0 >= 138 && LA117_0 <= 140)||(LA117_0 >= 142 && LA117_0 <= 144)||(LA117_0 >= 146 && LA117_0 <= 147)||LA117_0==150||(LA117_0 >= 153 && LA117_0 <= 154)||LA117_0==157||(LA117_0 >= 160 && LA117_0 <= 165)||(LA117_0 >= 167 && LA117_0 <= 168)||LA117_0==171||(LA117_0 >= 176 && LA117_0 <= 178)||(LA117_0 >= 180 && LA117_0 <= 181)||(LA117_0 >= 183 && LA117_0 <= 186)) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:817:9: operand
					{
					pushFollow(FOLLOW_operand_in_caserule4196);
					operand();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt117 >= 1 ) break loop117;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(117, input);
					throw eee;
				}
				cnt117++;
			}

			match(input,COLON,FOLLOW_COLON_in_caserule4199); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:818:2: ( LCBRACK codelinenolabel RCBRACK | codelinenolabel )*
			loop118:
			while (true) {
				int alt118=3;
				switch ( input.LA(1) ) {
				case 88:
					{
					int LA118_1 = input.LA(2);
					if ( (LA118_1==DOT||LA118_1==EQUALS||(LA118_1 >= LBRACK && LA118_1 <= LSBRACK)||LA118_1==39||LA118_1==45||(LA118_1 >= 47 && LA118_1 <= 48)||(LA118_1 >= 50 && LA118_1 <= 51)||LA118_1==53||LA118_1==63||LA118_1==196) ) {
						alt118=2;
					}

					}
					break;
				case LCBRACK:
					{
					alt118=1;
					}
					break;
				case FLOATVAL:
				case IDENTIFIER:
				case INTVAL:
				case LBRACK:
				case SQUOTE:
				case STRINGVAL:
				case 47:
				case 49:
				case 50:
				case 67:
				case 69:
				case 70:
				case 73:
				case 74:
				case 75:
				case 76:
				case 78:
				case 80:
				case 81:
				case 83:
				case 84:
				case 85:
				case 86:
				case 87:
				case 90:
				case 92:
				case 93:
				case 95:
				case 96:
				case 97:
				case 98:
				case 99:
				case 100:
				case 102:
				case 103:
				case 104:
				case 106:
				case 107:
				case 109:
				case 112:
				case 114:
				case 115:
				case 116:
				case 117:
				case 118:
				case 120:
				case 126:
				case 127:
				case 128:
				case 129:
				case 130:
				case 131:
				case 138:
				case 139:
				case 140:
				case 142:
				case 143:
				case 144:
				case 146:
				case 147:
				case 150:
				case 153:
				case 154:
				case 157:
				case 160:
				case 161:
				case 162:
				case 163:
				case 164:
				case 165:
				case 167:
				case 168:
				case 169:
				case 171:
				case 176:
				case 177:
				case 178:
				case 180:
				case 181:
				case 183:
				case 184:
				case 185:
				case 186:
				case 191:
					{
					alt118=2;
					}
					break;
				}
				switch (alt118) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:819:3: LCBRACK codelinenolabel RCBRACK
					{
					match(input,LCBRACK,FOLLOW_LCBRACK_in_caserule4206); if (state.failed) return;
					pushFollow(FOLLOW_codelinenolabel_in_caserule4208);
					codelinenolabel();
					state._fsp--;
					if (state.failed) return;
					match(input,RCBRACK,FOLLOW_RCBRACK_in_caserule4210); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:820:5: codelinenolabel
					{
					pushFollow(FOLLOW_codelinenolabel_in_caserule4216);
					codelinenolabel();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop118;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, caserule_StartIndex); }

		}
	}
	// $ANTLR end "caserule"



	// $ANTLR start "defaultrule"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:825:1: defaultrule : 'default' COLON ( LCBRACK codelinenolabel RCBRACK | codelinenolabel )* ;
	public final void defaultrule() throws RecognitionException {
		int defaultrule_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:826:2: ( 'default' COLON ( LCBRACK codelinenolabel RCBRACK | codelinenolabel )* )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:827:2: 'default' COLON ( LCBRACK codelinenolabel RCBRACK | codelinenolabel )*
			{
			match(input,88,FOLLOW_88_in_defaultrule4233); if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_defaultrule4235); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:828:2: ( LCBRACK codelinenolabel RCBRACK | codelinenolabel )*
			loop119:
			while (true) {
				int alt119=3;
				int LA119_0 = input.LA(1);
				if ( (LA119_0==LCBRACK) ) {
					alt119=1;
				}
				else if ( (LA119_0==FLOATVAL||LA119_0==IDENTIFIER||LA119_0==INTVAL||LA119_0==LBRACK||(LA119_0 >= SQUOTE && LA119_0 <= STRINGVAL)||LA119_0==47||(LA119_0 >= 49 && LA119_0 <= 50)||LA119_0==67||(LA119_0 >= 69 && LA119_0 <= 70)||(LA119_0 >= 73 && LA119_0 <= 76)||LA119_0==78||(LA119_0 >= 80 && LA119_0 <= 81)||(LA119_0 >= 83 && LA119_0 <= 88)||LA119_0==90||(LA119_0 >= 92 && LA119_0 <= 93)||(LA119_0 >= 95 && LA119_0 <= 100)||(LA119_0 >= 102 && LA119_0 <= 104)||(LA119_0 >= 106 && LA119_0 <= 107)||LA119_0==109||LA119_0==112||(LA119_0 >= 114 && LA119_0 <= 118)||LA119_0==120||(LA119_0 >= 126 && LA119_0 <= 131)||(LA119_0 >= 138 && LA119_0 <= 140)||(LA119_0 >= 142 && LA119_0 <= 144)||(LA119_0 >= 146 && LA119_0 <= 147)||LA119_0==150||(LA119_0 >= 153 && LA119_0 <= 154)||LA119_0==157||(LA119_0 >= 160 && LA119_0 <= 165)||(LA119_0 >= 167 && LA119_0 <= 169)||LA119_0==171||(LA119_0 >= 176 && LA119_0 <= 178)||(LA119_0 >= 180 && LA119_0 <= 181)||(LA119_0 >= 183 && LA119_0 <= 186)||LA119_0==191) ) {
					alt119=2;
				}

				switch (alt119) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:829:3: LCBRACK codelinenolabel RCBRACK
					{
					match(input,LCBRACK,FOLLOW_LCBRACK_in_defaultrule4242); if (state.failed) return;
					pushFollow(FOLLOW_codelinenolabel_in_defaultrule4244);
					codelinenolabel();
					state._fsp--;
					if (state.failed) return;
					match(input,RCBRACK,FOLLOW_RCBRACK_in_defaultrule4246); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:830:5: codelinenolabel
					{
					pushFollow(FOLLOW_codelinenolabel_in_defaultrule4252);
					codelinenolabel();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop119;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, defaultrule_StartIndex); }

		}
	}
	// $ANTLR end "defaultrule"



	// $ANTLR start "newoperator"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:835:1: newoperator : 'new' ( LBRACK expr ( COMMA expr )* RBRACK )? operand ;
	public final void newoperator() throws RecognitionException {
		int newoperator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:836:2: ( 'new' ( LBRACK expr ( COMMA expr )* RBRACK )? operand )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:837:2: 'new' ( LBRACK expr ( COMMA expr )* RBRACK )? operand
			{
			match(input,142,FOLLOW_142_in_newoperator4269); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:837:8: ( LBRACK expr ( COMMA expr )* RBRACK )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==LBRACK) ) {
				int LA121_1 = input.LA(2);
				if ( (synpred185_UnrealScript()) ) {
					alt121=1;
				}
			}
			switch (alt121) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:837:10: LBRACK expr ( COMMA expr )* RBRACK
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_newoperator4273); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_newoperator4275);
					expr();
					state._fsp--;
					if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:837:22: ( COMMA expr )*
					loop120:
					while (true) {
						int alt120=2;
						int LA120_0 = input.LA(1);
						if ( (LA120_0==COMMA) ) {
							alt120=1;
						}

						switch (alt120) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:837:24: COMMA expr
							{
							match(input,COMMA,FOLLOW_COMMA_in_newoperator4279); if (state.failed) return;
							pushFollow(FOLLOW_expr_in_newoperator4281);
							expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop120;
						}
					}

					match(input,RBRACK,FOLLOW_RBRACK_in_newoperator4286); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_operand_in_newoperator4291);
			operand();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, newoperator_StartIndex); }

		}
	}
	// $ANTLR end "newoperator"



	// $ANTLR start "returnfunc"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:841:1: returnfunc : 'return' ( expr )? SEMICOLON ;
	public final void returnfunc() throws RecognitionException {
		int returnfunc_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:842:2: ( 'return' ( expr )? SEMICOLON )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:843:2: 'return' ( expr )? SEMICOLON
			{
			match(input,169,FOLLOW_169_in_returnfunc4305); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:843:11: ( expr )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==FLOATVAL||LA122_0==IDENTIFIER||LA122_0==INTVAL||LA122_0==LBRACK||(LA122_0 >= SQUOTE && LA122_0 <= STRINGVAL)||LA122_0==35||(LA122_0 >= 46 && LA122_0 <= 47)||(LA122_0 >= 49 && LA122_0 <= 50)||LA122_0==67||(LA122_0 >= 69 && LA122_0 <= 70)||(LA122_0 >= 73 && LA122_0 <= 74)||LA122_0==76||LA122_0==78||(LA122_0 >= 80 && LA122_0 <= 81)||(LA122_0 >= 83 && LA122_0 <= 84)||(LA122_0 >= 86 && LA122_0 <= 88)||LA122_0==90||LA122_0==92||(LA122_0 >= 95 && LA122_0 <= 100)||(LA122_0 >= 102 && LA122_0 <= 104)||(LA122_0 >= 106 && LA122_0 <= 107)||LA122_0==109||LA122_0==112||LA122_0==114||(LA122_0 >= 117 && LA122_0 <= 118)||(LA122_0 >= 126 && LA122_0 <= 131)||(LA122_0 >= 138 && LA122_0 <= 140)||(LA122_0 >= 142 && LA122_0 <= 144)||(LA122_0 >= 146 && LA122_0 <= 147)||LA122_0==150||(LA122_0 >= 153 && LA122_0 <= 154)||LA122_0==157||(LA122_0 >= 160 && LA122_0 <= 165)||(LA122_0 >= 167 && LA122_0 <= 168)||LA122_0==171||(LA122_0 >= 176 && LA122_0 <= 178)||(LA122_0 >= 180 && LA122_0 <= 181)||(LA122_0 >= 183 && LA122_0 <= 186)||LA122_0==195) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:843:13: expr
					{
					pushFollow(FOLLOW_expr_in_returnfunc4309);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnfunc4314); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, returnfunc_StartIndex); }

		}
	}
	// $ANTLR end "returnfunc"



	// $ANTLR start "breakfunc"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:847:1: breakfunc : 'break' SEMICOLON ;
	public final void breakfunc() throws RecognitionException {
		int breakfunc_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:848:2: ( 'break' SEMICOLON )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:849:2: 'break' SEMICOLON
			{
			match(input,75,FOLLOW_75_in_breakfunc4327); if (state.failed) return;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_breakfunc4329); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, breakfunc_StartIndex); }

		}
	}
	// $ANTLR end "breakfunc"



	// $ANTLR start "continuefunc"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:853:1: continuefunc : 'continue' SEMICOLON ;
	public final void continuefunc() throws RecognitionException {
		int continuefunc_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:854:2: ( 'continue' SEMICOLON )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:855:2: 'continue' SEMICOLON
			{
			match(input,85,FOLLOW_85_in_continuefunc4342); if (state.failed) return;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_continuefunc4344); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, continuefunc_StartIndex); }

		}
	}
	// $ANTLR end "continuefunc"



	// $ANTLR start "foreachloop"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:859:1: foreachloop : 'foreach' funcoperand codeblock ;
	public final void foreachloop() throws RecognitionException {
		int foreachloop_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:860:2: ( 'foreach' funcoperand codeblock )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:861:2: 'foreach' funcoperand codeblock
			{
			match(input,116,FOLLOW_116_in_foreachloop4357); if (state.failed) return;
			pushFollow(FOLLOW_funcoperand_in_foreachloop4359);
			funcoperand();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_codeblock_in_foreachloop4361);
			codeblock();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, foreachloop_StartIndex); }

		}
	}
	// $ANTLR end "foreachloop"



	// $ANTLR start "forloop"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:865:1: forloop : 'for' LBRACK expr SEMICOLON expr SEMICOLON expr RBRACK codeblock ;
	public final void forloop() throws RecognitionException {
		int forloop_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:866:2: ( 'for' LBRACK expr SEMICOLON expr SEMICOLON expr RBRACK codeblock )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:867:2: 'for' LBRACK expr SEMICOLON expr SEMICOLON expr RBRACK codeblock
			{
			match(input,115,FOLLOW_115_in_forloop4374); if (state.failed) return;
			match(input,LBRACK,FOLLOW_LBRACK_in_forloop4376); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_forloop4378);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forloop4380); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_forloop4382);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forloop4384); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_forloop4386);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,RBRACK,FOLLOW_RBRACK_in_forloop4388); if (state.failed) return;
			pushFollow(FOLLOW_codeblock_in_forloop4390);
			codeblock();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, forloop_StartIndex); }

		}
	}
	// $ANTLR end "forloop"



	// $ANTLR start "funccall"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:871:1: funccall : ( ( 'class' SQUOTE packageidentifier SQUOTE DOT 'static' DOT ) | ( ( IDENTIFIER DOT )+ ) )? ( funcnamecall | funccastcall ) ;
	public final void funccall() throws RecognitionException {
		int funccall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:872:2: ( ( ( 'class' SQUOTE packageidentifier SQUOTE DOT 'static' DOT ) | ( ( IDENTIFIER DOT )+ ) )? ( funcnamecall | funccastcall ) )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:873:2: ( ( 'class' SQUOTE packageidentifier SQUOTE DOT 'static' DOT ) | ( ( IDENTIFIER DOT )+ ) )? ( funcnamecall | funccastcall )
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:873:2: ( ( 'class' SQUOTE packageidentifier SQUOTE DOT 'static' DOT ) | ( ( IDENTIFIER DOT )+ ) )?
			int alt124=3;
			alt124 = dfa124.predict(input);
			switch (alt124) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:874:3: ( 'class' SQUOTE packageidentifier SQUOTE DOT 'static' DOT )
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:874:3: ( 'class' SQUOTE packageidentifier SQUOTE DOT 'static' DOT )
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:874:5: 'class' SQUOTE packageidentifier SQUOTE DOT 'static' DOT
					{
					match(input,78,FOLLOW_78_in_funccall4409); if (state.failed) return;
					match(input,SQUOTE,FOLLOW_SQUOTE_in_funccall4411); if (state.failed) return;
					pushFollow(FOLLOW_packageidentifier_in_funccall4413);
					packageidentifier();
					state._fsp--;
					if (state.failed) return;
					match(input,SQUOTE,FOLLOW_SQUOTE_in_funccall4415); if (state.failed) return;
					match(input,DOT,FOLLOW_DOT_in_funccall4417); if (state.failed) return;
					match(input,178,FOLLOW_178_in_funccall4419); if (state.failed) return;
					match(input,DOT,FOLLOW_DOT_in_funccall4421); if (state.failed) return;
					}

					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:875:5: ( ( IDENTIFIER DOT )+ )
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:875:5: ( ( IDENTIFIER DOT )+ )
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:875:7: ( IDENTIFIER DOT )+
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:875:7: ( IDENTIFIER DOT )+
					int cnt123=0;
					loop123:
					while (true) {
						int alt123=2;
						alt123 = dfa123.predict(input);
						switch (alt123) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:875:9: IDENTIFIER DOT
							{
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funccall4433); if (state.failed) return;
							match(input,DOT,FOLLOW_DOT_in_funccall4435); if (state.failed) return;
							}
							break;

						default :
							if ( cnt123 >= 1 ) break loop123;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(123, input);
							throw eee;
						}
						cnt123++;
					}

					}

					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:878:2: ( funcnamecall | funccastcall )
			int alt125=2;
			switch ( input.LA(1) ) {
			case 67:
				{
				alt125=1;
				}
				break;
			case IDENTIFIER:
				{
				int LA125_2 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 78:
				{
				int LA125_3 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 183:
				{
				int LA125_4 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 73:
				{
				int LA125_5 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 127:
				{
				int LA125_6 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 161:
				{
				int LA125_7 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 130:
				{
				int LA125_8 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 178:
				{
				int LA125_9 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 88:
				{
				int LA125_10 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 107:
				{
				int LA125_11 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 177:
				{
				int LA125_12 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 117:
				{
				int LA125_13 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 90:
				{
				int LA125_14 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 69:
			case 81:
			case 83:
			case 84:
			case 86:
			case 87:
			case 92:
			case 95:
			case 96:
			case 97:
			case 98:
			case 99:
			case 100:
			case 102:
			case 103:
			case 104:
			case 109:
			case 118:
			case 126:
			case 128:
			case 131:
			case 138:
			case 140:
			case 143:
			case 144:
			case 146:
			case 147:
			case 150:
			case 153:
			case 154:
			case 160:
			case 162:
			case 163:
			case 164:
			case 165:
			case 167:
			case 168:
			case 171:
			case 176:
			case 184:
			case 185:
				{
				int LA125_15 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 74:
			case 76:
			case 114:
			case 129:
			case 139:
			case 157:
			case 180:
				{
				int LA125_16 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 80:
				{
				int LA125_17 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 106:
				{
				int LA125_18 = input.LA(2);
				if ( (synpred190_UnrealScript()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 70:
			case 181:
				{
				alt125=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}
			switch (alt125) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:879:3: funcnamecall
					{
					pushFollow(FOLLOW_funcnamecall_in_funccall4453);
					funcnamecall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:880:5: funccastcall
					{
					pushFollow(FOLLOW_funccastcall_in_funccall4459);
					funccastcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, funccall_StartIndex); }

		}
	}
	// $ANTLR end "funccall"



	// $ANTLR start "funcnamecall"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:887:1: funcnamecall : ( '`' )? qualifiedidentifier ( DOT qualifiedidentifier )* LBRACK ( ( expr )? ( COMMA ( expr )? )* )? RBRACK ;
	public final void funcnamecall() throws RecognitionException {
		int funcnamecall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:888:2: ( ( '`' )? qualifiedidentifier ( DOT qualifiedidentifier )* LBRACK ( ( expr )? ( COMMA ( expr )? )* )? RBRACK )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:2: ( '`' )? qualifiedidentifier ( DOT qualifiedidentifier )* LBRACK ( ( expr )? ( COMMA ( expr )? )* )? RBRACK
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:2: ( '`' )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==67) ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:2: '`'
					{
					match(input,67,FOLLOW_67_in_funcnamecall4477); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_qualifiedidentifier_in_funcnamecall4480);
			qualifiedidentifier();
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:27: ( DOT qualifiedidentifier )*
			loop127:
			while (true) {
				int alt127=2;
				int LA127_0 = input.LA(1);
				if ( (LA127_0==DOT) ) {
					alt127=1;
				}

				switch (alt127) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:29: DOT qualifiedidentifier
					{
					match(input,DOT,FOLLOW_DOT_in_funcnamecall4484); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedidentifier_in_funcnamecall4486);
					qualifiedidentifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop127;
				}
			}

			match(input,LBRACK,FOLLOW_LBRACK_in_funcnamecall4491); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:63: ( ( expr )? ( COMMA ( expr )? )* )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==COMMA||LA131_0==FLOATVAL||LA131_0==IDENTIFIER||LA131_0==INTVAL||LA131_0==LBRACK||(LA131_0 >= SQUOTE && LA131_0 <= STRINGVAL)||LA131_0==35||(LA131_0 >= 46 && LA131_0 <= 47)||(LA131_0 >= 49 && LA131_0 <= 50)||LA131_0==67||(LA131_0 >= 69 && LA131_0 <= 70)||(LA131_0 >= 73 && LA131_0 <= 74)||LA131_0==76||LA131_0==78||(LA131_0 >= 80 && LA131_0 <= 81)||(LA131_0 >= 83 && LA131_0 <= 84)||(LA131_0 >= 86 && LA131_0 <= 88)||LA131_0==90||LA131_0==92||(LA131_0 >= 95 && LA131_0 <= 100)||(LA131_0 >= 102 && LA131_0 <= 104)||(LA131_0 >= 106 && LA131_0 <= 107)||LA131_0==109||LA131_0==112||LA131_0==114||(LA131_0 >= 117 && LA131_0 <= 118)||(LA131_0 >= 126 && LA131_0 <= 131)||(LA131_0 >= 138 && LA131_0 <= 140)||(LA131_0 >= 142 && LA131_0 <= 144)||(LA131_0 >= 146 && LA131_0 <= 147)||LA131_0==150||(LA131_0 >= 153 && LA131_0 <= 154)||LA131_0==157||(LA131_0 >= 160 && LA131_0 <= 165)||(LA131_0 >= 167 && LA131_0 <= 168)||LA131_0==171||(LA131_0 >= 176 && LA131_0 <= 178)||(LA131_0 >= 180 && LA131_0 <= 181)||(LA131_0 >= 183 && LA131_0 <= 186)||LA131_0==195) ) {
				alt131=1;
			}
			else if ( (LA131_0==RBRACK) ) {
				int LA131_2 = input.LA(2);
				if ( (synpred196_UnrealScript()) ) {
					alt131=1;
				}
			}
			switch (alt131) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:65: ( expr )? ( COMMA ( expr )? )*
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:65: ( expr )?
					int alt128=2;
					int LA128_0 = input.LA(1);
					if ( (LA128_0==FLOATVAL||LA128_0==IDENTIFIER||LA128_0==INTVAL||LA128_0==LBRACK||(LA128_0 >= SQUOTE && LA128_0 <= STRINGVAL)||LA128_0==35||(LA128_0 >= 46 && LA128_0 <= 47)||(LA128_0 >= 49 && LA128_0 <= 50)||LA128_0==67||(LA128_0 >= 69 && LA128_0 <= 70)||(LA128_0 >= 73 && LA128_0 <= 74)||LA128_0==76||LA128_0==78||(LA128_0 >= 80 && LA128_0 <= 81)||(LA128_0 >= 83 && LA128_0 <= 84)||(LA128_0 >= 86 && LA128_0 <= 88)||LA128_0==90||LA128_0==92||(LA128_0 >= 95 && LA128_0 <= 100)||(LA128_0 >= 102 && LA128_0 <= 104)||(LA128_0 >= 106 && LA128_0 <= 107)||LA128_0==109||LA128_0==112||LA128_0==114||(LA128_0 >= 117 && LA128_0 <= 118)||(LA128_0 >= 126 && LA128_0 <= 131)||(LA128_0 >= 138 && LA128_0 <= 140)||(LA128_0 >= 142 && LA128_0 <= 144)||(LA128_0 >= 146 && LA128_0 <= 147)||LA128_0==150||(LA128_0 >= 153 && LA128_0 <= 154)||LA128_0==157||(LA128_0 >= 160 && LA128_0 <= 165)||(LA128_0 >= 167 && LA128_0 <= 168)||LA128_0==171||(LA128_0 >= 176 && LA128_0 <= 178)||(LA128_0 >= 180 && LA128_0 <= 181)||(LA128_0 >= 183 && LA128_0 <= 186)||LA128_0==195) ) {
						alt128=1;
					}
					switch (alt128) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:65: expr
							{
							pushFollow(FOLLOW_expr_in_funcnamecall4495);
							expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:71: ( COMMA ( expr )? )*
					loop130:
					while (true) {
						int alt130=2;
						int LA130_0 = input.LA(1);
						if ( (LA130_0==COMMA) ) {
							alt130=1;
						}

						switch (alt130) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:73: COMMA ( expr )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_funcnamecall4500); if (state.failed) return;
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:79: ( expr )?
							int alt129=2;
							int LA129_0 = input.LA(1);
							if ( (LA129_0==FLOATVAL||LA129_0==IDENTIFIER||LA129_0==INTVAL||LA129_0==LBRACK||(LA129_0 >= SQUOTE && LA129_0 <= STRINGVAL)||LA129_0==35||(LA129_0 >= 46 && LA129_0 <= 47)||(LA129_0 >= 49 && LA129_0 <= 50)||LA129_0==67||(LA129_0 >= 69 && LA129_0 <= 70)||(LA129_0 >= 73 && LA129_0 <= 74)||LA129_0==76||LA129_0==78||(LA129_0 >= 80 && LA129_0 <= 81)||(LA129_0 >= 83 && LA129_0 <= 84)||(LA129_0 >= 86 && LA129_0 <= 88)||LA129_0==90||LA129_0==92||(LA129_0 >= 95 && LA129_0 <= 100)||(LA129_0 >= 102 && LA129_0 <= 104)||(LA129_0 >= 106 && LA129_0 <= 107)||LA129_0==109||LA129_0==112||LA129_0==114||(LA129_0 >= 117 && LA129_0 <= 118)||(LA129_0 >= 126 && LA129_0 <= 131)||(LA129_0 >= 138 && LA129_0 <= 140)||(LA129_0 >= 142 && LA129_0 <= 144)||(LA129_0 >= 146 && LA129_0 <= 147)||LA129_0==150||(LA129_0 >= 153 && LA129_0 <= 154)||LA129_0==157||(LA129_0 >= 160 && LA129_0 <= 165)||(LA129_0 >= 167 && LA129_0 <= 168)||LA129_0==171||(LA129_0 >= 176 && LA129_0 <= 178)||(LA129_0 >= 180 && LA129_0 <= 181)||(LA129_0 >= 183 && LA129_0 <= 186)||LA129_0==195) ) {
								alt129=1;
							}
							switch (alt129) {
								case 1 :
									// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:79: expr
									{
									pushFollow(FOLLOW_expr_in_funcnamecall4502);
									expr();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							}
							break;

						default :
							break loop130;
						}
					}

					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_funcnamecall4511); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, funcnamecall_StartIndex); }

		}
	}
	// $ANTLR end "funcnamecall"



	// $ANTLR start "funccastcall"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:893:1: funccastcall : vartype LBRACK ( expr ( COMMA expr )* )? RBRACK ;
	public final void funccastcall() throws RecognitionException {
		int funccastcall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:894:2: ( vartype LBRACK ( expr ( COMMA expr )* )? RBRACK )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:895:2: vartype LBRACK ( expr ( COMMA expr )* )? RBRACK
			{
			pushFollow(FOLLOW_vartype_in_funccastcall4526);
			vartype();
			state._fsp--;
			if (state.failed) return;
			match(input,LBRACK,FOLLOW_LBRACK_in_funccastcall4528); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:895:17: ( expr ( COMMA expr )* )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==FLOATVAL||LA133_0==IDENTIFIER||LA133_0==INTVAL||LA133_0==LBRACK||(LA133_0 >= SQUOTE && LA133_0 <= STRINGVAL)||LA133_0==35||(LA133_0 >= 46 && LA133_0 <= 47)||(LA133_0 >= 49 && LA133_0 <= 50)||LA133_0==67||(LA133_0 >= 69 && LA133_0 <= 70)||(LA133_0 >= 73 && LA133_0 <= 74)||LA133_0==76||LA133_0==78||(LA133_0 >= 80 && LA133_0 <= 81)||(LA133_0 >= 83 && LA133_0 <= 84)||(LA133_0 >= 86 && LA133_0 <= 88)||LA133_0==90||LA133_0==92||(LA133_0 >= 95 && LA133_0 <= 100)||(LA133_0 >= 102 && LA133_0 <= 104)||(LA133_0 >= 106 && LA133_0 <= 107)||LA133_0==109||LA133_0==112||LA133_0==114||(LA133_0 >= 117 && LA133_0 <= 118)||(LA133_0 >= 126 && LA133_0 <= 131)||(LA133_0 >= 138 && LA133_0 <= 140)||(LA133_0 >= 142 && LA133_0 <= 144)||(LA133_0 >= 146 && LA133_0 <= 147)||LA133_0==150||(LA133_0 >= 153 && LA133_0 <= 154)||LA133_0==157||(LA133_0 >= 160 && LA133_0 <= 165)||(LA133_0 >= 167 && LA133_0 <= 168)||LA133_0==171||(LA133_0 >= 176 && LA133_0 <= 178)||(LA133_0 >= 180 && LA133_0 <= 181)||(LA133_0 >= 183 && LA133_0 <= 186)||LA133_0==195) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:895:19: expr ( COMMA expr )*
					{
					pushFollow(FOLLOW_expr_in_funccastcall4532);
					expr();
					state._fsp--;
					if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:895:24: ( COMMA expr )*
					loop132:
					while (true) {
						int alt132=2;
						int LA132_0 = input.LA(1);
						if ( (LA132_0==COMMA) ) {
							alt132=1;
						}

						switch (alt132) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:895:26: COMMA expr
							{
							match(input,COMMA,FOLLOW_COMMA_in_funccastcall4536); if (state.failed) return;
							pushFollow(FOLLOW_expr_in_funccastcall4538);
							expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop132;
						}
					}

					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_funccastcall4546); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, funccastcall_StartIndex); }

		}
	}
	// $ANTLR end "funccastcall"



	// $ANTLR start "funcoperand"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:899:1: funcoperand : funccall ( DOT ( funccall | qualifiedidentifier ) )* ;
	public final void funcoperand() throws RecognitionException {
		int funcoperand_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:900:2: ( funccall ( DOT ( funccall | qualifiedidentifier ) )* )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:901:2: funccall ( DOT ( funccall | qualifiedidentifier ) )*
			{
			pushFollow(FOLLOW_funccall_in_funcoperand4561);
			funccall();
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:902:2: ( DOT ( funccall | qualifiedidentifier ) )*
			loop135:
			while (true) {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==DOT) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:903:3: DOT ( funccall | qualifiedidentifier )
					{
					match(input,DOT,FOLLOW_DOT_in_funcoperand4568); if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:904:3: ( funccall | qualifiedidentifier )
					int alt134=2;
					switch ( input.LA(1) ) {
					case 78:
						{
						int LA134_1 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case IDENTIFIER:
						{
						int LA134_2 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 67:
					case 70:
					case 181:
						{
						alt134=1;
						}
						break;
					case 161:
						{
						int LA134_4 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 183:
						{
						int LA134_5 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 73:
						{
						int LA134_6 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 127:
						{
						int LA134_7 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 130:
						{
						int LA134_8 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 178:
						{
						int LA134_9 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 88:
						{
						int LA134_10 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 107:
						{
						int LA134_11 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 177:
						{
						int LA134_12 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 117:
						{
						int LA134_13 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 90:
						{
						int LA134_14 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 69:
					case 81:
					case 83:
					case 84:
					case 86:
					case 87:
					case 92:
					case 95:
					case 96:
					case 97:
					case 98:
					case 99:
					case 100:
					case 102:
					case 103:
					case 104:
					case 109:
					case 118:
					case 126:
					case 128:
					case 131:
					case 138:
					case 140:
					case 143:
					case 144:
					case 146:
					case 147:
					case 150:
					case 153:
					case 154:
					case 160:
					case 162:
					case 163:
					case 164:
					case 165:
					case 167:
					case 168:
					case 171:
					case 176:
					case 184:
					case 185:
						{
						int LA134_15 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 74:
					case 76:
					case 114:
					case 129:
					case 139:
					case 157:
					case 180:
						{
						int LA134_16 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 80:
						{
						int LA134_17 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					case 106:
						{
						int LA134_18 = input.LA(2);
						if ( (synpred199_UnrealScript()) ) {
							alt134=1;
						}
						else if ( (true) ) {
							alt134=2;
						}

						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 134, 0, input);
						throw nvae;
					}
					switch (alt134) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:905:4: funccall
							{
							pushFollow(FOLLOW_funccall_in_funcoperand4577);
							funccall();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:906:6: qualifiedidentifier
							{
							pushFollow(FOLLOW_qualifiedidentifier_in_funcoperand4584);
							qualifiedidentifier();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

				default :
					break loop135;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, funcoperand_StartIndex); }

		}
	}
	// $ANTLR end "funcoperand"



	// $ANTLR start "operand"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:912:1: operand : ( LBRACK operandinner RBRACK | operandinner );
	public final void operand() throws RecognitionException {
		int operand_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:913:2: ( LBRACK operandinner RBRACK | operandinner )
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==LBRACK) ) {
				alt136=1;
			}
			else if ( (LA136_0==FLOATVAL||LA136_0==IDENTIFIER||LA136_0==INTVAL||(LA136_0 >= SQUOTE && LA136_0 <= STRINGVAL)||LA136_0==49||LA136_0==67||(LA136_0 >= 69 && LA136_0 <= 70)||(LA136_0 >= 73 && LA136_0 <= 74)||LA136_0==76||LA136_0==78||(LA136_0 >= 80 && LA136_0 <= 81)||(LA136_0 >= 83 && LA136_0 <= 84)||(LA136_0 >= 86 && LA136_0 <= 88)||LA136_0==90||LA136_0==92||(LA136_0 >= 95 && LA136_0 <= 100)||(LA136_0 >= 102 && LA136_0 <= 104)||(LA136_0 >= 106 && LA136_0 <= 107)||LA136_0==109||LA136_0==112||LA136_0==114||(LA136_0 >= 117 && LA136_0 <= 118)||(LA136_0 >= 126 && LA136_0 <= 131)||(LA136_0 >= 138 && LA136_0 <= 140)||(LA136_0 >= 142 && LA136_0 <= 144)||(LA136_0 >= 146 && LA136_0 <= 147)||LA136_0==150||(LA136_0 >= 153 && LA136_0 <= 154)||LA136_0==157||(LA136_0 >= 160 && LA136_0 <= 165)||(LA136_0 >= 167 && LA136_0 <= 168)||LA136_0==171||(LA136_0 >= 176 && LA136_0 <= 178)||(LA136_0 >= 180 && LA136_0 <= 181)||(LA136_0 >= 183 && LA136_0 <= 186)) ) {
				alt136=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 136, 0, input);
				throw nvae;
			}

			switch (alt136) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:914:2: LBRACK operandinner RBRACK
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_operand4605); if (state.failed) return;
					pushFollow(FOLLOW_operandinner_in_operand4607);
					operandinner();
					state._fsp--;
					if (state.failed) return;
					match(input,RBRACK,FOLLOW_RBRACK_in_operand4609); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:915:4: operandinner
					{
					pushFollow(FOLLOW_operandinner_in_operand4614);
					operandinner();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 71, operand_StartIndex); }

		}
	}
	// $ANTLR end "operand"



	// $ANTLR start "operandinner"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:919:1: operandinner : ( funcoperand | constvalue | ( qualifiedidentifier ( DOT qualifiedidentifier )* ) | newoperator );
	public final void operandinner() throws RecognitionException {
		int operandinner_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:920:2: ( funcoperand | constvalue | ( qualifiedidentifier ( DOT qualifiedidentifier )* ) | newoperator )
			int alt138=4;
			switch ( input.LA(1) ) {
			case 78:
				{
				int LA138_1 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IDENTIFIER:
				{
				int LA138_2 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 67:
			case 70:
			case 181:
				{
				alt138=1;
				}
				break;
			case 161:
				{
				int LA138_4 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 183:
				{
				int LA138_5 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 73:
				{
				int LA138_6 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 127:
				{
				int LA138_7 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 130:
				{
				int LA138_8 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 178:
				{
				int LA138_9 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 88:
				{
				int LA138_10 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 107:
				{
				int LA138_11 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 177:
				{
				int LA138_12 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 117:
				{
				int LA138_13 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 90:
				{
				int LA138_14 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 69:
			case 81:
			case 83:
			case 84:
			case 86:
			case 87:
			case 92:
			case 95:
			case 96:
			case 97:
			case 98:
			case 99:
			case 100:
			case 102:
			case 103:
			case 104:
			case 109:
			case 118:
			case 126:
			case 128:
			case 131:
			case 138:
			case 140:
			case 143:
			case 144:
			case 146:
			case 147:
			case 150:
			case 153:
			case 154:
			case 160:
			case 162:
			case 163:
			case 164:
			case 165:
			case 167:
			case 168:
			case 171:
			case 176:
			case 184:
			case 185:
				{
				int LA138_15 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 74:
			case 76:
			case 114:
			case 129:
			case 139:
			case 157:
			case 180:
				{
				int LA138_16 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 80:
				{
				int LA138_17 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 106:
				{
				int LA138_18 = input.LA(2);
				if ( (synpred202_UnrealScript()) ) {
					alt138=1;
				}
				else if ( (synpred205_UnrealScript()) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOATVAL:
			case INTVAL:
			case SQUOTE:
			case STRINGVAL:
			case 49:
			case 112:
			case 186:
				{
				alt138=2;
				}
				break;
			case 142:
				{
				alt138=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 138, 0, input);
				throw nvae;
			}
			switch (alt138) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:921:2: funcoperand
					{
					pushFollow(FOLLOW_funcoperand_in_operandinner4627);
					funcoperand();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:922:4: constvalue
					{
					pushFollow(FOLLOW_constvalue_in_operandinner4632);
					constvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:923:4: ( qualifiedidentifier ( DOT qualifiedidentifier )* )
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:923:4: ( qualifiedidentifier ( DOT qualifiedidentifier )* )
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:923:6: qualifiedidentifier ( DOT qualifiedidentifier )*
					{
					pushFollow(FOLLOW_qualifiedidentifier_in_operandinner4639);
					qualifiedidentifier();
					state._fsp--;
					if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:923:26: ( DOT qualifiedidentifier )*
					loop137:
					while (true) {
						int alt137=2;
						int LA137_0 = input.LA(1);
						if ( (LA137_0==DOT) ) {
							alt137=1;
						}

						switch (alt137) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:923:28: DOT qualifiedidentifier
							{
							match(input,DOT,FOLLOW_DOT_in_operandinner4643); if (state.failed) return;
							pushFollow(FOLLOW_qualifiedidentifier_in_operandinner4645);
							qualifiedidentifier();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop137;
						}
					}

					}

					}
					break;
				case 4 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:924:4: newoperator
					{
					pushFollow(FOLLOW_newoperator_in_operandinner4655);
					newoperator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 72, operandinner_StartIndex); }

		}
	}
	// $ANTLR end "operandinner"



	// $ANTLR start "expr"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:928:1: expr : ( logicpre | unaryop | '+' | '-' )? ( bareexpr | brackexpr ) ( unaryop )? ;
	public final void expr() throws RecognitionException {
		int expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:929:2: ( ( logicpre | unaryop | '+' | '-' )? ( bareexpr | brackexpr ) ( unaryop )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:930:2: ( logicpre | unaryop | '+' | '-' )? ( bareexpr | brackexpr ) ( unaryop )?
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:930:2: ( logicpre | unaryop | '+' | '-' )?
			int alt139=5;
			switch ( input.LA(1) ) {
				case 35:
				case 195:
					{
					alt139=1;
					}
					break;
				case 47:
				case 50:
					{
					alt139=2;
					}
					break;
				case 46:
					{
					alt139=3;
					}
					break;
				case 49:
					{
					int LA139_4 = input.LA(2);
					if ( (synpred209_UnrealScript()) ) {
						alt139=4;
					}
					}
					break;
			}
			switch (alt139) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:931:3: logicpre
					{
					pushFollow(FOLLOW_logicpre_in_expr4672);
					logicpre();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:932:5: unaryop
					{
					pushFollow(FOLLOW_unaryop_in_expr4678);
					unaryop();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:933:5: '+'
					{
					match(input,46,FOLLOW_46_in_expr4684); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:934:5: '-'
					{
					match(input,49,FOLLOW_49_in_expr4690); if (state.failed) return;
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:936:2: ( bareexpr | brackexpr )
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==LBRACK) ) {
				int LA140_1 = input.LA(2);
				if ( (synpred210_UnrealScript()) ) {
					alt140=1;
				}
				else if ( (true) ) {
					alt140=2;
				}

			}
			else if ( (LA140_0==FLOATVAL||LA140_0==IDENTIFIER||LA140_0==INTVAL||(LA140_0 >= SQUOTE && LA140_0 <= STRINGVAL)||LA140_0==49||LA140_0==67||(LA140_0 >= 69 && LA140_0 <= 70)||(LA140_0 >= 73 && LA140_0 <= 74)||LA140_0==76||LA140_0==78||(LA140_0 >= 80 && LA140_0 <= 81)||(LA140_0 >= 83 && LA140_0 <= 84)||(LA140_0 >= 86 && LA140_0 <= 88)||LA140_0==90||LA140_0==92||(LA140_0 >= 95 && LA140_0 <= 100)||(LA140_0 >= 102 && LA140_0 <= 104)||(LA140_0 >= 106 && LA140_0 <= 107)||LA140_0==109||LA140_0==112||LA140_0==114||(LA140_0 >= 117 && LA140_0 <= 118)||(LA140_0 >= 126 && LA140_0 <= 131)||(LA140_0 >= 138 && LA140_0 <= 140)||(LA140_0 >= 142 && LA140_0 <= 144)||(LA140_0 >= 146 && LA140_0 <= 147)||LA140_0==150||(LA140_0 >= 153 && LA140_0 <= 154)||LA140_0==157||(LA140_0 >= 160 && LA140_0 <= 165)||(LA140_0 >= 167 && LA140_0 <= 168)||LA140_0==171||(LA140_0 >= 176 && LA140_0 <= 178)||(LA140_0 >= 180 && LA140_0 <= 181)||(LA140_0 >= 183 && LA140_0 <= 186)) ) {
				alt140=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 140, 0, input);
				throw nvae;
			}

			switch (alt140) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:937:3: bareexpr
					{
					pushFollow(FOLLOW_bareexpr_in_expr4701);
					bareexpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:938:5: brackexpr
					{
					pushFollow(FOLLOW_brackexpr_in_expr4707);
					brackexpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:940:2: ( unaryop )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==47||LA141_0==50) ) {
				int LA141_1 = input.LA(2);
				if ( (synpred211_UnrealScript()) ) {
					alt141=1;
				}
			}
			switch (alt141) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:940:4: unaryop
					{
					pushFollow(FOLLOW_unaryop_in_expr4715);
					unaryop();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, expr_StartIndex); }

		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "bareexpr"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:944:1: bareexpr : operand ( unaryop )? ( opidentifier expr )? ;
	public final void bareexpr() throws RecognitionException {
		int bareexpr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:945:2: ( operand ( unaryop )? ( opidentifier expr )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:946:2: operand ( unaryop )? ( opidentifier expr )?
			{
			pushFollow(FOLLOW_operand_in_bareexpr4731);
			operand();
			state._fsp--;
			if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:946:10: ( unaryop )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==47||LA142_0==50) ) {
				int LA142_1 = input.LA(2);
				if ( (synpred212_UnrealScript()) ) {
					alt142=1;
				}
			}
			switch (alt142) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:946:12: unaryop
					{
					pushFollow(FOLLOW_unaryop_in_bareexpr4735);
					unaryop();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:946:23: ( opidentifier expr )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==COLON||LA143_0==EQUALS||LA143_0==IDENTIFIER||LA143_0==LABRACK||LA143_0==RABRACK||(LA143_0 >= 35 && LA143_0 <= 46)||(LA143_0 >= 48 && LA143_0 <= 49)||(LA143_0 >= 51 && LA143_0 <= 66)||LA143_0==69||(LA143_0 >= 73 && LA143_0 <= 74)||LA143_0==76||LA143_0==78||(LA143_0 >= 80 && LA143_0 <= 81)||(LA143_0 >= 83 && LA143_0 <= 84)||(LA143_0 >= 86 && LA143_0 <= 88)||LA143_0==90||LA143_0==92||(LA143_0 >= 95 && LA143_0 <= 100)||(LA143_0 >= 102 && LA143_0 <= 104)||LA143_0==107||LA143_0==109||LA143_0==114||(LA143_0 >= 117 && LA143_0 <= 118)||(LA143_0 >= 126 && LA143_0 <= 131)||(LA143_0 >= 138 && LA143_0 <= 140)||(LA143_0 >= 143 && LA143_0 <= 144)||(LA143_0 >= 146 && LA143_0 <= 147)||LA143_0==150||(LA143_0 >= 153 && LA143_0 <= 154)||LA143_0==157||LA143_0==160||(LA143_0 >= 162 && LA143_0 <= 165)||(LA143_0 >= 167 && LA143_0 <= 168)||LA143_0==171||(LA143_0 >= 176 && LA143_0 <= 178)||LA143_0==180||(LA143_0 >= 183 && LA143_0 <= 185)||(LA143_0 >= 193 && LA143_0 <= 196)) ) {
				alt143=1;
			}
			else if ( (LA143_0==47||LA143_0==50) ) {
				int LA143_2 = input.LA(2);
				if ( (LA143_2==FLOATVAL||LA143_2==IDENTIFIER||LA143_2==INTVAL||LA143_2==LBRACK||(LA143_2 >= SQUOTE && LA143_2 <= STRINGVAL)||LA143_2==35||LA143_2==46||LA143_2==49||LA143_2==67||(LA143_2 >= 69 && LA143_2 <= 70)||(LA143_2 >= 73 && LA143_2 <= 74)||LA143_2==76||LA143_2==78||(LA143_2 >= 80 && LA143_2 <= 81)||(LA143_2 >= 83 && LA143_2 <= 84)||(LA143_2 >= 86 && LA143_2 <= 88)||LA143_2==90||LA143_2==92||(LA143_2 >= 95 && LA143_2 <= 100)||(LA143_2 >= 102 && LA143_2 <= 104)||(LA143_2 >= 106 && LA143_2 <= 107)||LA143_2==109||LA143_2==112||LA143_2==114||(LA143_2 >= 117 && LA143_2 <= 118)||(LA143_2 >= 126 && LA143_2 <= 131)||(LA143_2 >= 138 && LA143_2 <= 140)||(LA143_2 >= 142 && LA143_2 <= 144)||(LA143_2 >= 146 && LA143_2 <= 147)||LA143_2==150||(LA143_2 >= 153 && LA143_2 <= 154)||LA143_2==157||(LA143_2 >= 160 && LA143_2 <= 165)||(LA143_2 >= 167 && LA143_2 <= 168)||LA143_2==171||(LA143_2 >= 176 && LA143_2 <= 178)||(LA143_2 >= 180 && LA143_2 <= 181)||(LA143_2 >= 183 && LA143_2 <= 186)||LA143_2==195) ) {
					alt143=1;
				}
				else if ( (LA143_2==47||LA143_2==50) ) {
					int LA143_4 = input.LA(3);
					if ( (LA143_4==FLOATVAL||LA143_4==IDENTIFIER||LA143_4==INTVAL||LA143_4==LBRACK||(LA143_4 >= SQUOTE && LA143_4 <= STRINGVAL)||LA143_4==49||LA143_4==67||(LA143_4 >= 69 && LA143_4 <= 70)||(LA143_4 >= 73 && LA143_4 <= 74)||LA143_4==76||LA143_4==78||(LA143_4 >= 80 && LA143_4 <= 81)||(LA143_4 >= 83 && LA143_4 <= 84)||(LA143_4 >= 86 && LA143_4 <= 88)||LA143_4==90||LA143_4==92||(LA143_4 >= 95 && LA143_4 <= 100)||(LA143_4 >= 102 && LA143_4 <= 104)||(LA143_4 >= 106 && LA143_4 <= 107)||LA143_4==109||LA143_4==112||LA143_4==114||(LA143_4 >= 117 && LA143_4 <= 118)||(LA143_4 >= 126 && LA143_4 <= 131)||(LA143_4 >= 138 && LA143_4 <= 140)||(LA143_4 >= 142 && LA143_4 <= 144)||(LA143_4 >= 146 && LA143_4 <= 147)||LA143_4==150||(LA143_4 >= 153 && LA143_4 <= 154)||LA143_4==157||(LA143_4 >= 160 && LA143_4 <= 165)||(LA143_4 >= 167 && LA143_4 <= 168)||LA143_4==171||(LA143_4 >= 176 && LA143_4 <= 178)||(LA143_4 >= 180 && LA143_4 <= 181)||(LA143_4 >= 183 && LA143_4 <= 186)) ) {
						alt143=1;
					}
				}
			}
			switch (alt143) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:946:25: opidentifier expr
					{
					pushFollow(FOLLOW_opidentifier_in_bareexpr4742);
					opidentifier();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_bareexpr4744);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, bareexpr_StartIndex); }

		}
	}
	// $ANTLR end "bareexpr"



	// $ANTLR start "brackexpr"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:950:1: brackexpr : LBRACK expr RBRACK ( opidentifier expr )? ;
	public final void brackexpr() throws RecognitionException {
		int brackexpr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:951:2: ( LBRACK expr RBRACK ( opidentifier expr )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:952:2: LBRACK expr RBRACK ( opidentifier expr )?
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_brackexpr4760); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_brackexpr4762);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,RBRACK,FOLLOW_RBRACK_in_brackexpr4764); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:952:21: ( opidentifier expr )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==COLON||LA144_0==EQUALS||LA144_0==IDENTIFIER||LA144_0==LABRACK||LA144_0==RABRACK||(LA144_0 >= 35 && LA144_0 <= 46)||(LA144_0 >= 48 && LA144_0 <= 49)||(LA144_0 >= 51 && LA144_0 <= 66)||LA144_0==69||(LA144_0 >= 73 && LA144_0 <= 74)||LA144_0==76||LA144_0==78||(LA144_0 >= 80 && LA144_0 <= 81)||(LA144_0 >= 83 && LA144_0 <= 84)||(LA144_0 >= 86 && LA144_0 <= 88)||LA144_0==90||LA144_0==92||(LA144_0 >= 95 && LA144_0 <= 100)||(LA144_0 >= 102 && LA144_0 <= 104)||LA144_0==107||LA144_0==109||LA144_0==114||(LA144_0 >= 117 && LA144_0 <= 118)||(LA144_0 >= 126 && LA144_0 <= 131)||(LA144_0 >= 138 && LA144_0 <= 140)||(LA144_0 >= 143 && LA144_0 <= 144)||(LA144_0 >= 146 && LA144_0 <= 147)||LA144_0==150||(LA144_0 >= 153 && LA144_0 <= 154)||LA144_0==157||LA144_0==160||(LA144_0 >= 162 && LA144_0 <= 165)||(LA144_0 >= 167 && LA144_0 <= 168)||LA144_0==171||(LA144_0 >= 176 && LA144_0 <= 178)||LA144_0==180||(LA144_0 >= 183 && LA144_0 <= 185)||(LA144_0 >= 193 && LA144_0 <= 196)) ) {
				alt144=1;
			}
			else if ( (LA144_0==47||LA144_0==50) ) {
				int LA144_2 = input.LA(2);
				if ( (LA144_2==FLOATVAL||LA144_2==IDENTIFIER||LA144_2==INTVAL||LA144_2==LBRACK||(LA144_2 >= SQUOTE && LA144_2 <= STRINGVAL)||LA144_2==35||LA144_2==46||LA144_2==49||LA144_2==67||(LA144_2 >= 69 && LA144_2 <= 70)||(LA144_2 >= 73 && LA144_2 <= 74)||LA144_2==76||LA144_2==78||(LA144_2 >= 80 && LA144_2 <= 81)||(LA144_2 >= 83 && LA144_2 <= 84)||(LA144_2 >= 86 && LA144_2 <= 88)||LA144_2==90||LA144_2==92||(LA144_2 >= 95 && LA144_2 <= 100)||(LA144_2 >= 102 && LA144_2 <= 104)||(LA144_2 >= 106 && LA144_2 <= 107)||LA144_2==109||LA144_2==112||LA144_2==114||(LA144_2 >= 117 && LA144_2 <= 118)||(LA144_2 >= 126 && LA144_2 <= 131)||(LA144_2 >= 138 && LA144_2 <= 140)||(LA144_2 >= 142 && LA144_2 <= 144)||(LA144_2 >= 146 && LA144_2 <= 147)||LA144_2==150||(LA144_2 >= 153 && LA144_2 <= 154)||LA144_2==157||(LA144_2 >= 160 && LA144_2 <= 165)||(LA144_2 >= 167 && LA144_2 <= 168)||LA144_2==171||(LA144_2 >= 176 && LA144_2 <= 178)||(LA144_2 >= 180 && LA144_2 <= 181)||(LA144_2 >= 183 && LA144_2 <= 186)||LA144_2==195) ) {
					alt144=1;
				}
				else if ( (LA144_2==47||LA144_2==50) ) {
					int LA144_4 = input.LA(3);
					if ( (LA144_4==FLOATVAL||LA144_4==IDENTIFIER||LA144_4==INTVAL||LA144_4==LBRACK||(LA144_4 >= SQUOTE && LA144_4 <= STRINGVAL)||LA144_4==49||LA144_4==67||(LA144_4 >= 69 && LA144_4 <= 70)||(LA144_4 >= 73 && LA144_4 <= 74)||LA144_4==76||LA144_4==78||(LA144_4 >= 80 && LA144_4 <= 81)||(LA144_4 >= 83 && LA144_4 <= 84)||(LA144_4 >= 86 && LA144_4 <= 88)||LA144_4==90||LA144_4==92||(LA144_4 >= 95 && LA144_4 <= 100)||(LA144_4 >= 102 && LA144_4 <= 104)||(LA144_4 >= 106 && LA144_4 <= 107)||LA144_4==109||LA144_4==112||LA144_4==114||(LA144_4 >= 117 && LA144_4 <= 118)||(LA144_4 >= 126 && LA144_4 <= 131)||(LA144_4 >= 138 && LA144_4 <= 140)||(LA144_4 >= 142 && LA144_4 <= 144)||(LA144_4 >= 146 && LA144_4 <= 147)||LA144_4==150||(LA144_4 >= 153 && LA144_4 <= 154)||LA144_4==157||(LA144_4 >= 160 && LA144_4 <= 165)||(LA144_4 >= 167 && LA144_4 <= 168)||LA144_4==171||(LA144_4 >= 176 && LA144_4 <= 178)||(LA144_4 >= 180 && LA144_4 <= 181)||(LA144_4 >= 183 && LA144_4 <= 186)) ) {
						alt144=1;
					}
				}
			}
			switch (alt144) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:952:23: opidentifier expr
					{
					pushFollow(FOLLOW_opidentifier_in_brackexpr4768);
					opidentifier();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_brackexpr4770);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, brackexpr_StartIndex); }

		}
	}
	// $ANTLR end "brackexpr"



	// $ANTLR start "logicpre"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:956:1: logicpre : ( '!' | '~' ) ;
	public final void logicpre() throws RecognitionException {
		int logicpre_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:957:2: ( ( '!' | '~' ) )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( input.LA(1)==35||input.LA(1)==195 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 76, logicpre_StartIndex); }

		}
	}
	// $ANTLR end "logicpre"



	// $ANTLR start "codelabel"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:965:1: codelabel : IDENTIFIER COLON ;
	public final void codelabel() throws RecognitionException {
		int codelabel_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:966:2: ( IDENTIFIER COLON )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:967:2: IDENTIFIER COLON
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codelabel4812); if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_codelabel4814); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 77, codelabel_StartIndex); }

		}
	}
	// $ANTLR end "codelabel"



	// $ANTLR start "stringval"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:971:1: stringval : ( STRINGVAL | '\\'' ( ESC_SEQ |~ ( '\\'' ) )* '\\'' );
	public final void stringval() throws RecognitionException {
		int stringval_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:972:2: ( STRINGVAL | '\\'' ( ESC_SEQ |~ ( '\\'' ) )* '\\'' )
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==STRINGVAL) ) {
				alt146=1;
			}
			else if ( (LA146_0==SQUOTE) ) {
				alt146=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 146, 0, input);
				throw nvae;
			}

			switch (alt146) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:973:2: STRINGVAL
					{
					match(input,STRINGVAL,FOLLOW_STRINGVAL_in_stringval4827); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:974:4: '\\'' ( ESC_SEQ |~ ( '\\'' ) )* '\\''
					{
					match(input,SQUOTE,FOLLOW_SQUOTE_in_stringval4832); if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:975:2: ( ESC_SEQ |~ ( '\\'' ) )*
					loop145:
					while (true) {
						int alt145=2;
						int LA145_0 = input.LA(1);
						if ( ((LA145_0 >= ALPHA && LA145_0 <= SEMICOLON)||(LA145_0 >= STRINGVAL && LA145_0 <= 196)) ) {
							alt145=1;
						}

						switch (alt145) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
							{
							if ( (input.LA(1) >= ALPHA && input.LA(1) <= SEMICOLON)||(input.LA(1) >= STRINGVAL && input.LA(1) <= 196) ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

						default :
							break loop145;
						}
					}

					match(input,SQUOTE,FOLLOW_SQUOTE_in_stringval4858); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 78, stringval_StartIndex); }

		}
	}
	// $ANTLR end "stringval"



	// $ANTLR start "constclassparams"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1109:1: constclassparams : ( 'classgroup' | 'abstract' | 'native' | 'nativereplication' | 'safereplace' | 'perobjectconfig' | 'transient' | 'noexport' | 'exportstructs' | 'collapsecategories' | 'dontcollapsecategories' | 'placeable' | 'notplaceable' | 'editinlinenew' | 'noteditinlinenew' | 'inherits' | 'implements' | 'nontransient' );
	public final void constclassparams() throws RecognitionException {
		int constclassparams_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1110:2: ( 'classgroup' | 'abstract' | 'native' | 'nativereplication' | 'safereplace' | 'perobjectconfig' | 'transient' | 'noexport' | 'exportstructs' | 'collapsecategories' | 'dontcollapsecategories' | 'placeable' | 'notplaceable' | 'editinlinenew' | 'noteditinlinenew' | 'inherits' | 'implements' | 'nontransient' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( input.LA(1)==68||input.LA(1)==79||input.LA(1)==82||input.LA(1)==94||input.LA(1)==101||input.LA(1)==110||(input.LA(1) >= 124 && input.LA(1) <= 125)||(input.LA(1) >= 140 && input.LA(1) <= 141)||input.LA(1)==144||(input.LA(1) >= 148 && input.LA(1) <= 149)||input.LA(1)==151||(input.LA(1) >= 155 && input.LA(1) <= 156)||input.LA(1)==170||input.LA(1)==184 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, constclassparams_StartIndex); }

		}
	}
	// $ANTLR end "constclassparams"



	// $ANTLR start "varparams"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1134:1: varparams : ( 'config' | 'const' | 'export' | 'globalconfig' | 'input' | 'localized' | 'native' | 'private' | 'protected' | 'public' | 'transient' | 'travel' | 'editinline' | 'deprecated' | 'edfindable' | 'editinlineuse' | 'editfixedsize' | 'repnotify' | 'instanced' | 'databinding' | 'editoronly' | 'notforconsole' | 'editconst' | 'noclear' | 'interp' | 'duplicatetransient' | 'noimport' | 'noexport' | 'nontransactional' | 'init' | 'repretry' | 'allowabstract' | 'optional' | 'out' | 'coerce' | 'skip' | 'protectedwrite' | 'serializetext' | 'crosslevelpassive' | 'edithide' | 'edittextbox' | 'reliable' );
	public final void varparams() throws RecognitionException {
		int varparams_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1135:2: ( 'config' | 'const' | 'export' | 'globalconfig' | 'input' | 'localized' | 'native' | 'private' | 'protected' | 'public' | 'transient' | 'travel' | 'editinline' | 'deprecated' | 'edfindable' | 'editinlineuse' | 'editfixedsize' | 'repnotify' | 'instanced' | 'databinding' | 'editoronly' | 'notforconsole' | 'editconst' | 'noclear' | 'interp' | 'duplicatetransient' | 'noimport' | 'noexport' | 'nontransactional' | 'init' | 'repretry' | 'allowabstract' | 'optional' | 'out' | 'coerce' | 'skip' | 'protectedwrite' | 'serializetext' | 'crosslevelpassive' | 'edithide' | 'edittextbox' | 'reliable' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( input.LA(1)==69||input.LA(1)==81||(input.LA(1) >= 83 && input.LA(1) <= 84)||(input.LA(1) >= 86 && input.LA(1) <= 87)||input.LA(1)==92||(input.LA(1) >= 95 && input.LA(1) <= 100)||(input.LA(1) >= 102 && input.LA(1) <= 104)||input.LA(1)==109||input.LA(1)==118||(input.LA(1) >= 126 && input.LA(1) <= 128)||input.LA(1)==131||input.LA(1)==138||input.LA(1)==140||(input.LA(1) >= 143 && input.LA(1) <= 144)||(input.LA(1) >= 146 && input.LA(1) <= 147)||input.LA(1)==150||(input.LA(1) >= 153 && input.LA(1) <= 154)||input.LA(1)==160||(input.LA(1) >= 162 && input.LA(1) <= 165)||(input.LA(1) >= 167 && input.LA(1) <= 168)||input.LA(1)==171||input.LA(1)==176||(input.LA(1) >= 184 && input.LA(1) <= 185) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 80, varparams_StartIndex); }

		}
	}
	// $ANTLR end "varparams"



	// $ANTLR start "stateparams"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1183:1: stateparams : ( 'auto' | 'simulated' );
	public final void stateparams() throws RecognitionException {
		int stateparams_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1184:2: ( 'auto' | 'simulated' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( input.LA(1)==73||input.LA(1)==174 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 81, stateparams_StartIndex); }

		}
	}
	// $ANTLR end "stateparams"



	// $ANTLR start "constfunctparams"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1190:1: constfunctparams : ( 'final' | 'iterator' | 'latent' | 'simulated' | 'singular' | 'static' | 'transient' | 'exec' | 'protected' | 'private' | 'public' | 'noexport' | 'k2call' | 'k2pure' | 'k2overrride' | 'coerce' | 'virtual' | 'noexportheader' | 'reliable' | 'client' | 'server' | 'unreliable' );
	public final void constfunctparams() throws RecognitionException {
		int constfunctparams_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1191:2: ( 'final' | 'iterator' | 'latent' | 'simulated' | 'singular' | 'static' | 'transient' | 'exec' | 'protected' | 'private' | 'public' | 'noexport' | 'k2call' | 'k2pure' | 'k2overrride' | 'coerce' | 'virtual' | 'noexportheader' | 'reliable' | 'client' | 'server' | 'unreliable' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( (input.LA(1) >= 80 && input.LA(1) <= 81)||input.LA(1)==108||input.LA(1)==113||(input.LA(1) >= 132 && input.LA(1) <= 136)||(input.LA(1) >= 144 && input.LA(1) <= 145)||input.LA(1)==160||input.LA(1)==162||(input.LA(1) >= 164 && input.LA(1) <= 165)||input.LA(1)==172||(input.LA(1) >= 174 && input.LA(1) <= 175)||input.LA(1)==178||input.LA(1)==184||input.LA(1)==187||input.LA(1)==190 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 82, constfunctparams_StartIndex); }

		}
	}
	// $ANTLR end "constfunctparams"


	public static class basictype_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "basictype"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1217:1: basictype : ( 'name' | 'byte' | 'int' | 'float' | 'string' | 'bool' | 'class' | 'interface' | 'pointer' );
	public final UnrealScriptParser.basictype_return basictype() throws RecognitionException {
		UnrealScriptParser.basictype_return retval = new UnrealScriptParser.basictype_return();
		retval.start = input.LT(1);
		int basictype_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1218:2: ( 'name' | 'byte' | 'int' | 'float' | 'string' | 'bool' | 'class' | 'interface' | 'pointer' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( input.LA(1)==74||input.LA(1)==76||input.LA(1)==78||input.LA(1)==114||(input.LA(1) >= 129 && input.LA(1) <= 130)||input.LA(1)==139||input.LA(1)==157||input.LA(1)==180 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 83, basictype_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "basictype"



	// $ANTLR start "functiontype"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1231:1: functiontype : ( 'function' | 'event' | 'delegate' );
	public final void functiontype() throws RecognitionException {
		int functiontype_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1232:2: ( 'function' | 'event' | 'delegate' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( input.LA(1)==90||input.LA(1)==107||input.LA(1)==117 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 84, functiontype_StartIndex); }

		}
	}
	// $ANTLR end "functiontype"



	// $ANTLR start "operatornames"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1239:1: operatornames : ( '~=' | '<<' | '>>' | '!=' | '<=' | '>=' | '?-' | '&&' | '||' | '^^' | '==' | '**' | '@=' | '>>>' | '$=' | '~' | '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '!' | '-' | '=' | '+' | '|' | '\\\\' | ':' | '<' | '>' | '/' | '?' | assignop | unaryop );
	public final void operatornames() throws RecognitionException {
		int operatornames_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1240:2: ( '~=' | '<<' | '>>' | '!=' | '<=' | '>=' | '?-' | '&&' | '||' | '^^' | '==' | '**' | '@=' | '>>>' | '$=' | '~' | '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '!' | '-' | '=' | '+' | '|' | '\\\\' | ':' | '<' | '>' | '/' | '?' | assignop | unaryop )
			int alt147=37;
			switch ( input.LA(1) ) {
			case 196:
				{
				int LA147_1 = input.LA(2);
				if ( (synpred309_UnrealScript()) ) {
					alt147=1;
				}
				else if ( (synpred344_UnrealScript()) ) {
					alt147=36;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 147, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 54:
				{
				alt147=2;
				}
				break;
			case 58:
				{
				alt147=3;
				}
				break;
			case 36:
				{
				alt147=4;
				}
				break;
			case 55:
				{
				alt147=5;
				}
				break;
			case 57:
				{
				alt147=6;
				}
				break;
			case 61:
				{
				alt147=7;
				}
				break;
			case 41:
				{
				alt147=8;
				}
				break;
			case 194:
				{
				alt147=9;
				}
				break;
			case 66:
				{
				alt147=10;
				}
				break;
			case 56:
				{
				alt147=11;
				}
				break;
			case 44:
				{
				alt147=12;
				}
				break;
			case 63:
				{
				int LA147_13 = input.LA(2);
				if ( (synpred321_UnrealScript()) ) {
					alt147=13;
				}
				else if ( (synpred344_UnrealScript()) ) {
					alt147=36;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 147, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 59:
				{
				alt147=14;
				}
				break;
			case 39:
				{
				int LA147_15 = input.LA(2);
				if ( (synpred323_UnrealScript()) ) {
					alt147=15;
				}
				else if ( (synpred344_UnrealScript()) ) {
					alt147=36;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 147, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 195:
				{
				alt147=16;
				}
				break;
			case 35:
				{
				int LA147_17 = input.LA(2);
				if ( (synpred325_UnrealScript()) ) {
					alt147=17;
				}
				else if ( (synpred333_UnrealScript()) ) {
					alt147=25;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 147, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 62:
				{
				alt147=18;
				}
				break;
			case 37:
				{
				alt147=19;
				}
				break;
			case 38:
				{
				alt147=20;
				}
				break;
			case 40:
				{
				alt147=21;
				}
				break;
			case 65:
				{
				alt147=22;
				}
				break;
			case 42:
				{
				alt147=23;
				}
				break;
			case 43:
				{
				alt147=24;
				}
				break;
			case 49:
				{
				alt147=26;
				}
				break;
			case EQUALS:
				{
				alt147=27;
				}
				break;
			case 46:
				{
				alt147=28;
				}
				break;
			case 193:
				{
				alt147=29;
				}
				break;
			case 64:
				{
				alt147=30;
				}
				break;
			case COLON:
				{
				alt147=31;
				}
				break;
			case LABRACK:
				{
				alt147=32;
				}
				break;
			case RABRACK:
				{
				alt147=33;
				}
				break;
			case 52:
				{
				alt147=34;
				}
				break;
			case 60:
				{
				alt147=35;
				}
				break;
			case 45:
			case 48:
			case 51:
			case 53:
				{
				alt147=36;
				}
				break;
			case 47:
			case 50:
				{
				alt147=37;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 147, 0, input);
				throw nvae;
			}
			switch (alt147) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1241:2: '~='
					{
					match(input,196,FOLLOW_196_in_operatornames5723); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1242:4: '<<'
					{
					match(input,54,FOLLOW_54_in_operatornames5728); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1243:4: '>>'
					{
					match(input,58,FOLLOW_58_in_operatornames5733); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1244:4: '!='
					{
					match(input,36,FOLLOW_36_in_operatornames5738); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1245:4: '<='
					{
					match(input,55,FOLLOW_55_in_operatornames5743); if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1246:4: '>='
					{
					match(input,57,FOLLOW_57_in_operatornames5748); if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1247:4: '?-'
					{
					match(input,61,FOLLOW_61_in_operatornames5753); if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1248:4: '&&'
					{
					match(input,41,FOLLOW_41_in_operatornames5758); if (state.failed) return;
					}
					break;
				case 9 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1249:4: '||'
					{
					match(input,194,FOLLOW_194_in_operatornames5763); if (state.failed) return;
					}
					break;
				case 10 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1250:4: '^^'
					{
					match(input,66,FOLLOW_66_in_operatornames5768); if (state.failed) return;
					}
					break;
				case 11 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1251:4: '=='
					{
					match(input,56,FOLLOW_56_in_operatornames5773); if (state.failed) return;
					}
					break;
				case 12 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1252:4: '**'
					{
					match(input,44,FOLLOW_44_in_operatornames5778); if (state.failed) return;
					}
					break;
				case 13 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1253:4: '@='
					{
					match(input,63,FOLLOW_63_in_operatornames5783); if (state.failed) return;
					}
					break;
				case 14 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1254:4: '>>>'
					{
					match(input,59,FOLLOW_59_in_operatornames5788); if (state.failed) return;
					}
					break;
				case 15 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1255:4: '$='
					{
					match(input,39,FOLLOW_39_in_operatornames5793); if (state.failed) return;
					}
					break;
				case 16 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1256:4: '~'
					{
					match(input,195,FOLLOW_195_in_operatornames5798); if (state.failed) return;
					}
					break;
				case 17 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1257:4: '!'
					{
					match(input,35,FOLLOW_35_in_operatornames5803); if (state.failed) return;
					}
					break;
				case 18 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1258:4: '@'
					{
					match(input,62,FOLLOW_62_in_operatornames5808); if (state.failed) return;
					}
					break;
				case 19 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1259:4: '#'
					{
					match(input,37,FOLLOW_37_in_operatornames5813); if (state.failed) return;
					}
					break;
				case 20 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1260:4: '$'
					{
					match(input,38,FOLLOW_38_in_operatornames5818); if (state.failed) return;
					}
					break;
				case 21 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1261:4: '%'
					{
					match(input,40,FOLLOW_40_in_operatornames5823); if (state.failed) return;
					}
					break;
				case 22 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1262:4: '^'
					{
					match(input,65,FOLLOW_65_in_operatornames5828); if (state.failed) return;
					}
					break;
				case 23 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1263:4: '&'
					{
					match(input,42,FOLLOW_42_in_operatornames5833); if (state.failed) return;
					}
					break;
				case 24 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1264:4: '*'
					{
					match(input,43,FOLLOW_43_in_operatornames5838); if (state.failed) return;
					}
					break;
				case 25 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1265:4: '!'
					{
					match(input,35,FOLLOW_35_in_operatornames5843); if (state.failed) return;
					}
					break;
				case 26 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1266:4: '-'
					{
					match(input,49,FOLLOW_49_in_operatornames5848); if (state.failed) return;
					}
					break;
				case 27 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1267:4: '='
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_operatornames5853); if (state.failed) return;
					}
					break;
				case 28 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1268:4: '+'
					{
					match(input,46,FOLLOW_46_in_operatornames5858); if (state.failed) return;
					}
					break;
				case 29 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1269:4: '|'
					{
					match(input,193,FOLLOW_193_in_operatornames5863); if (state.failed) return;
					}
					break;
				case 30 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1270:4: '\\\\'
					{
					match(input,64,FOLLOW_64_in_operatornames5868); if (state.failed) return;
					}
					break;
				case 31 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1271:4: ':'
					{
					match(input,COLON,FOLLOW_COLON_in_operatornames5873); if (state.failed) return;
					}
					break;
				case 32 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1272:4: '<'
					{
					match(input,LABRACK,FOLLOW_LABRACK_in_operatornames5878); if (state.failed) return;
					}
					break;
				case 33 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1273:4: '>'
					{
					match(input,RABRACK,FOLLOW_RABRACK_in_operatornames5883); if (state.failed) return;
					}
					break;
				case 34 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1274:4: '/'
					{
					match(input,52,FOLLOW_52_in_operatornames5888); if (state.failed) return;
					}
					break;
				case 35 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1275:4: '?'
					{
					match(input,60,FOLLOW_60_in_operatornames5893); if (state.failed) return;
					}
					break;
				case 36 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1276:4: assignop
					{
					pushFollow(FOLLOW_assignop_in_operatornames5898);
					assignop();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 37 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1277:4: unaryop
					{
					pushFollow(FOLLOW_unaryop_in_operatornames5903);
					unaryop();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 85, operatornames_StartIndex); }

		}
	}
	// $ANTLR end "operatornames"



	// $ANTLR start "assignop"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1281:1: assignop : ( '+=' | '-=' | '*=' | '/=' | '~=' | '@=' | '$=' );
	public final void assignop() throws RecognitionException {
		int assignop_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1282:2: ( '+=' | '-=' | '*=' | '/=' | '~=' | '@=' | '$=' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( input.LA(1)==39||input.LA(1)==45||input.LA(1)==48||input.LA(1)==51||input.LA(1)==53||input.LA(1)==63||input.LA(1)==196 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, assignop_StartIndex); }

		}
	}
	// $ANTLR end "assignop"



	// $ANTLR start "unaryop"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1293:1: unaryop : ( '++' | '--' );
	public final void unaryop() throws RecognitionException {
		int unaryop_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1294:2: ( '++' | '--' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( input.LA(1)==47||input.LA(1)==50 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, unaryop_StartIndex); }

		}
	}
	// $ANTLR end "unaryop"



	// $ANTLR start "boolval"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1315:1: boolval : ( 'true' | 'false' );
	public final void boolval() throws RecognitionException {
		int boolval_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1316:2: ( 'true' | 'false' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( input.LA(1)==112||input.LA(1)==186 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 88, boolval_StartIndex); }

		}
	}
	// $ANTLR end "boolval"



	// $ANTLR start "nameval"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1322:1: nameval : SQUOTE ( fixedidentifier )? SQUOTE ;
	public final void nameval() throws RecognitionException {
		int nameval_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1323:2: ( SQUOTE ( fixedidentifier )? SQUOTE )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1324:2: SQUOTE ( fixedidentifier )? SQUOTE
			{
			match(input,SQUOTE,FOLLOW_SQUOTE_in_nameval6052); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1324:9: ( fixedidentifier )?
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==IDENTIFIER||LA148_0==69||(LA148_0 >= 73 && LA148_0 <= 74)||LA148_0==76||LA148_0==78||(LA148_0 >= 80 && LA148_0 <= 81)||(LA148_0 >= 83 && LA148_0 <= 84)||(LA148_0 >= 86 && LA148_0 <= 88)||LA148_0==90||LA148_0==92||(LA148_0 >= 95 && LA148_0 <= 100)||(LA148_0 >= 102 && LA148_0 <= 104)||LA148_0==107||LA148_0==109||LA148_0==114||(LA148_0 >= 117 && LA148_0 <= 118)||(LA148_0 >= 126 && LA148_0 <= 131)||(LA148_0 >= 138 && LA148_0 <= 140)||(LA148_0 >= 143 && LA148_0 <= 144)||(LA148_0 >= 146 && LA148_0 <= 147)||LA148_0==150||(LA148_0 >= 153 && LA148_0 <= 154)||LA148_0==157||LA148_0==160||(LA148_0 >= 162 && LA148_0 <= 165)||(LA148_0 >= 167 && LA148_0 <= 168)||LA148_0==171||(LA148_0 >= 176 && LA148_0 <= 178)||LA148_0==180||(LA148_0 >= 183 && LA148_0 <= 185)) ) {
				alt148=1;
			}
			switch (alt148) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1324:11: fixedidentifier
					{
					pushFollow(FOLLOW_fixedidentifier_in_nameval6056);
					fixedidentifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SQUOTE,FOLLOW_SQUOTE_in_nameval6061); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 89, nameval_StartIndex); }

		}
	}
	// $ANTLR end "nameval"


	public static class fixedidentifier_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "fixedidentifier"
	// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1332:1: fixedidentifier : ( IDENTIFIER | 'switch' | 'auto' | varparams | basictype | 'static' | 'default' | 'event' | 'state' | 'function' | 'delegate' | 'input' | 'interface' | 'client' );
	public final UnrealScriptParser.fixedidentifier_return fixedidentifier() throws RecognitionException {
		UnrealScriptParser.fixedidentifier_return retval = new UnrealScriptParser.fixedidentifier_return();
		retval.start = input.LT(1);
		int fixedidentifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1333:2: ( IDENTIFIER | 'switch' | 'auto' | varparams | basictype | 'static' | 'default' | 'event' | 'state' | 'function' | 'delegate' | 'input' | 'interface' | 'client' )
			int alt149=14;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt149=1;
				}
				break;
			case 183:
				{
				alt149=2;
				}
				break;
			case 73:
				{
				alt149=3;
				}
				break;
			case 127:
				{
				int LA149_4 = input.LA(2);
				if ( (synpred357_UnrealScript()) ) {
					alt149=4;
				}
				else if ( (synpred365_UnrealScript()) ) {
					alt149=12;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 149, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 130:
				{
				int LA149_5 = input.LA(2);
				if ( (synpred358_UnrealScript()) ) {
					alt149=5;
				}
				else if ( (synpred366_UnrealScript()) ) {
					alt149=13;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 149, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 178:
				{
				alt149=6;
				}
				break;
			case 88:
				{
				alt149=7;
				}
				break;
			case 107:
				{
				alt149=8;
				}
				break;
			case 177:
				{
				alt149=9;
				}
				break;
			case 117:
				{
				alt149=10;
				}
				break;
			case 90:
				{
				alt149=11;
				}
				break;
			case 69:
			case 81:
			case 83:
			case 84:
			case 86:
			case 87:
			case 92:
			case 95:
			case 96:
			case 97:
			case 98:
			case 99:
			case 100:
			case 102:
			case 103:
			case 104:
			case 109:
			case 118:
			case 126:
			case 128:
			case 131:
			case 138:
			case 140:
			case 143:
			case 144:
			case 146:
			case 147:
			case 150:
			case 153:
			case 154:
			case 160:
			case 162:
			case 163:
			case 164:
			case 165:
			case 167:
			case 168:
			case 171:
			case 176:
			case 184:
			case 185:
				{
				alt149=4;
				}
				break;
			case 74:
			case 76:
			case 78:
			case 114:
			case 129:
			case 139:
			case 157:
			case 180:
				{
				alt149=5;
				}
				break;
			case 80:
				{
				alt149=14;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 149, 0, input);
				throw nvae;
			}
			switch (alt149) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1334:2: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fixedidentifier6078); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1335:4: 'switch'
					{
					match(input,183,FOLLOW_183_in_fixedidentifier6083); if (state.failed) return retval;
					}
					break;
				case 3 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1336:4: 'auto'
					{
					match(input,73,FOLLOW_73_in_fixedidentifier6088); if (state.failed) return retval;
					}
					break;
				case 4 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1337:4: varparams
					{
					pushFollow(FOLLOW_varparams_in_fixedidentifier6093);
					varparams();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 5 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1338:4: basictype
					{
					pushFollow(FOLLOW_basictype_in_fixedidentifier6098);
					basictype();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 6 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1339:4: 'static'
					{
					match(input,178,FOLLOW_178_in_fixedidentifier6103); if (state.failed) return retval;
					}
					break;
				case 7 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1340:4: 'default'
					{
					match(input,88,FOLLOW_88_in_fixedidentifier6108); if (state.failed) return retval;
					}
					break;
				case 8 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1341:4: 'event'
					{
					match(input,107,FOLLOW_107_in_fixedidentifier6113); if (state.failed) return retval;
					}
					break;
				case 9 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1342:4: 'state'
					{
					match(input,177,FOLLOW_177_in_fixedidentifier6118); if (state.failed) return retval;
					}
					break;
				case 10 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1343:4: 'function'
					{
					match(input,117,FOLLOW_117_in_fixedidentifier6123); if (state.failed) return retval;
					}
					break;
				case 11 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1344:4: 'delegate'
					{
					match(input,90,FOLLOW_90_in_fixedidentifier6128); if (state.failed) return retval;
					}
					break;
				case 12 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1345:4: 'input'
					{
					match(input,127,FOLLOW_127_in_fixedidentifier6133); if (state.failed) return retval;
					}
					break;
				case 13 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1346:4: 'interface'
					{
					match(input,130,FOLLOW_130_in_fixedidentifier6138); if (state.failed) return retval;
					}
					break;
				case 14 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1347:4: 'client'
					{
					match(input,80,FOLLOW_80_in_fixedidentifier6143); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 90, fixedidentifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "fixedidentifier"

	// $ANTLR start synpred18_UnrealScript
	public final void synpred18_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:121:2: ( constclassparams ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )? )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:121:2: constclassparams ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )?
		{
		pushFollow(FOLLOW_constclassparams_in_synpred18_UnrealScript603);
		constclassparams();
		state._fsp--;
		if (state.failed) return;
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:122:2: ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )?
		int alt152=2;
		int LA152_0 = input.LA(1);
		if ( (LA152_0==LBRACK) ) {
			alt152=1;
		}
		switch (alt152) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:123:3: LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK
				{
				match(input,LBRACK,FOLLOW_LBRACK_in_synpred18_UnrealScript610); if (state.failed) return;
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:124:3: (~ ( LBRACK | RBRACK ) )*
				loop151:
				while (true) {
					int alt151=2;
					int LA151_0 = input.LA(1);
					if ( ((LA151_0 >= ALPHA && LA151_0 <= LABRACK)||(LA151_0 >= LCBRACK && LA151_0 <= RABRACK)||(LA151_0 >= RCBRACK && LA151_0 <= 196)) ) {
						alt151=1;
					}

					switch (alt151) {
					case 1 :
						// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
						{
						if ( (input.LA(1) >= ALPHA && input.LA(1) <= LABRACK)||(input.LA(1) >= LCBRACK && input.LA(1) <= RABRACK)||(input.LA(1) >= RCBRACK && input.LA(1) <= 196) ) {
							input.consume();
							state.errorRecovery=false;
							state.failed=false;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return;}
							MismatchedSetException mse = new MismatchedSetException(null,input);
							throw mse;
						}
						}
						break;

					default :
						break loop151;
					}
				}

				match(input,RBRACK,FOLLOW_RBRACK_in_synpred18_UnrealScript649); if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred18_UnrealScript

	// $ANTLR start synpred26_UnrealScript
	public final void synpred26_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:144:4: ( 'config' ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )? )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:144:4: 'config' ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )?
		{
		match(input,83,FOLLOW_83_in_synpred26_UnrealScript737); if (state.failed) return;
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:145:2: ( LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK )?
		int alt156=2;
		int LA156_0 = input.LA(1);
		if ( (LA156_0==LBRACK) ) {
			alt156=1;
		}
		switch (alt156) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:146:3: LBRACK (~ ( LBRACK | RBRACK ) )* RBRACK
				{
				match(input,LBRACK,FOLLOW_LBRACK_in_synpred26_UnrealScript744); if (state.failed) return;
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:147:3: (~ ( LBRACK | RBRACK ) )*
				loop155:
				while (true) {
					int alt155=2;
					int LA155_0 = input.LA(1);
					if ( ((LA155_0 >= ALPHA && LA155_0 <= LABRACK)||(LA155_0 >= LCBRACK && LA155_0 <= RABRACK)||(LA155_0 >= RCBRACK && LA155_0 <= 196)) ) {
						alt155=1;
					}

					switch (alt155) {
					case 1 :
						// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
						{
						if ( (input.LA(1) >= ALPHA && input.LA(1) <= LABRACK)||(input.LA(1) >= LCBRACK && input.LA(1) <= RABRACK)||(input.LA(1) >= RCBRACK && input.LA(1) <= 196) ) {
							input.consume();
							state.errorRecovery=false;
							state.failed=false;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return;}
							MismatchedSetException mse = new MismatchedSetException(null,input);
							throw mse;
						}
						}
						break;

					default :
						break loop155;
					}
				}

				match(input,RBRACK,FOLLOW_RBRACK_in_synpred26_UnrealScript783); if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred26_UnrealScript

	// $ANTLR start synpred41_UnrealScript
	public final void synpred41_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:200:27: ( varparams ( LCBRACK varparams RCBRACK )? )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:200:27: varparams ( LCBRACK varparams RCBRACK )?
		{
		pushFollow(FOLLOW_varparams_in_synpred41_UnrealScript994);
		varparams();
		state._fsp--;
		if (state.failed) return;
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:200:37: ( LCBRACK varparams RCBRACK )?
		int alt161=2;
		int LA161_0 = input.LA(1);
		if ( (LA161_0==LCBRACK) ) {
			alt161=1;
		}
		switch (alt161) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:200:39: LCBRACK varparams RCBRACK
				{
				match(input,LCBRACK,FOLLOW_LCBRACK_in_synpred41_UnrealScript998); if (state.failed) return;
				pushFollow(FOLLOW_varparams_in_synpred41_UnrealScript1000);
				varparams();
				state._fsp--;
				if (state.failed) return;
				match(input,RCBRACK,FOLLOW_RCBRACK_in_synpred41_UnrealScript1002); if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred41_UnrealScript

	// $ANTLR start synpred47_UnrealScript
	public final void synpred47_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:223:4: ( packageidentifier ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )? )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:223:4: packageidentifier ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )?
		{
		pushFollow(FOLLOW_packageidentifier_in_synpred47_UnrealScript1212);
		packageidentifier();
		state._fsp--;
		if (state.failed) return;
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:224:2: ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )?
		int alt164=2;
		int LA164_0 = input.LA(1);
		if ( (LA164_0==LCBRACK) ) {
			alt164=1;
		}
		switch (alt164) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:225:3: LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK
				{
				match(input,LCBRACK,FOLLOW_LCBRACK_in_synpred47_UnrealScript1219); if (state.failed) return;
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:226:3: (~ ( LCBRACK | RCBRACK ) )*
				loop163:
				while (true) {
					int alt163=2;
					int LA163_0 = input.LA(1);
					if ( ((LA163_0 >= ALPHA && LA163_0 <= LBRACK)||(LA163_0 >= LSBRACK && LA163_0 <= RBRACK)||(LA163_0 >= RSBRACK && LA163_0 <= 196)) ) {
						alt163=1;
					}

					switch (alt163) {
					case 1 :
						// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
						{
						if ( (input.LA(1) >= ALPHA && input.LA(1) <= LBRACK)||(input.LA(1) >= LSBRACK && input.LA(1) <= RBRACK)||(input.LA(1) >= RSBRACK && input.LA(1) <= 196) ) {
							input.consume();
							state.errorRecovery=false;
							state.failed=false;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return;}
							MismatchedSetException mse = new MismatchedSetException(null,input);
							throw mse;
						}
						}
						break;

					default :
						break loop163;
					}
				}

				match(input,RCBRACK,FOLLOW_RCBRACK_in_synpred47_UnrealScript1258); if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred47_UnrealScript

	// $ANTLR start synpred51_UnrealScript
	public final void synpred51_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:251:4: ( basictype )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:251:4: basictype
		{
		pushFollow(FOLLOW_basictype_in_synpred51_UnrealScript1336);
		basictype();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred51_UnrealScript

	// $ANTLR start synpred60_UnrealScript
	public final void synpred60_UnrealScript_fragment() throws RecognitionException {
		ParserRuleReturnScope varId =null;

		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:268:2: (varId= fixedidentifier ( LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK )? ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )? ( LABRACK (~ ( LABRACK | RABRACK ) )* RABRACK )? )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:268:2: varId= fixedidentifier ( LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK )? ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )? ( LABRACK (~ ( LABRACK | RABRACK ) )* RABRACK )?
		{
		pushFollow(FOLLOW_fixedidentifier_in_synpred60_UnrealScript1402);
		varId=fixedidentifier();
		state._fsp--;
		if (state.failed) return;
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:269:2: ( LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK )?
		int alt169=2;
		int LA169_0 = input.LA(1);
		if ( (LA169_0==LSBRACK) ) {
			alt169=1;
		}
		switch (alt169) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:270:3: LSBRACK ( INTVAL | qualifiedidentifier ) RSBRACK
				{
				match(input,LSBRACK,FOLLOW_LSBRACK_in_synpred60_UnrealScript1409); if (state.failed) return;
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:271:3: ( INTVAL | qualifiedidentifier )
				int alt168=2;
				int LA168_0 = input.LA(1);
				if ( (LA168_0==INTVAL) ) {
					alt168=1;
				}
				else if ( (LA168_0==IDENTIFIER||LA168_0==69||(LA168_0 >= 73 && LA168_0 <= 74)||LA168_0==76||LA168_0==78||(LA168_0 >= 80 && LA168_0 <= 81)||(LA168_0 >= 83 && LA168_0 <= 84)||(LA168_0 >= 86 && LA168_0 <= 88)||LA168_0==90||LA168_0==92||(LA168_0 >= 95 && LA168_0 <= 100)||(LA168_0 >= 102 && LA168_0 <= 104)||(LA168_0 >= 106 && LA168_0 <= 107)||LA168_0==109||LA168_0==114||(LA168_0 >= 117 && LA168_0 <= 118)||(LA168_0 >= 126 && LA168_0 <= 131)||(LA168_0 >= 138 && LA168_0 <= 140)||(LA168_0 >= 143 && LA168_0 <= 144)||(LA168_0 >= 146 && LA168_0 <= 147)||LA168_0==150||(LA168_0 >= 153 && LA168_0 <= 154)||LA168_0==157||(LA168_0 >= 160 && LA168_0 <= 165)||(LA168_0 >= 167 && LA168_0 <= 168)||LA168_0==171||(LA168_0 >= 176 && LA168_0 <= 178)||LA168_0==180||(LA168_0 >= 183 && LA168_0 <= 185)) ) {
					alt168=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					NoViableAltException nvae =
						new NoViableAltException("", 168, 0, input);
					throw nvae;
				}

				switch (alt168) {
					case 1 :
						// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:272:4: INTVAL
						{
						match(input,INTVAL,FOLLOW_INTVAL_in_synpred60_UnrealScript1418); if (state.failed) return;
						}
						break;
					case 2 :
						// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:273:6: qualifiedidentifier
						{
						pushFollow(FOLLOW_qualifiedidentifier_in_synpred60_UnrealScript1425);
						qualifiedidentifier();
						state._fsp--;
						if (state.failed) return;
						}
						break;

				}

				match(input,RSBRACK,FOLLOW_RSBRACK_in_synpred60_UnrealScript1433); if (state.failed) return;
				}
				break;

		}

		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:280:2: ( LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK )?
		int alt171=2;
		int LA171_0 = input.LA(1);
		if ( (LA171_0==LCBRACK) ) {
			alt171=1;
		}
		switch (alt171) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:281:3: LCBRACK (~ ( LCBRACK | RCBRACK ) )* RCBRACK
				{
				match(input,LCBRACK,FOLLOW_LCBRACK_in_synpred60_UnrealScript1457); if (state.failed) return;
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:282:3: (~ ( LCBRACK | RCBRACK ) )*
				loop170:
				while (true) {
					int alt170=2;
					int LA170_0 = input.LA(1);
					if ( ((LA170_0 >= ALPHA && LA170_0 <= LBRACK)||(LA170_0 >= LSBRACK && LA170_0 <= RBRACK)||(LA170_0 >= RSBRACK && LA170_0 <= 196)) ) {
						alt170=1;
					}

					switch (alt170) {
					case 1 :
						// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
						{
						if ( (input.LA(1) >= ALPHA && input.LA(1) <= LBRACK)||(input.LA(1) >= LSBRACK && input.LA(1) <= RBRACK)||(input.LA(1) >= RSBRACK && input.LA(1) <= 196) ) {
							input.consume();
							state.errorRecovery=false;
							state.failed=false;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return;}
							MismatchedSetException mse = new MismatchedSetException(null,input);
							throw mse;
						}
						}
						break;

					default :
						break loop170;
					}
				}

				match(input,RCBRACK,FOLLOW_RCBRACK_in_synpred60_UnrealScript1496); if (state.failed) return;
				}
				break;

		}

		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:290:2: ( LABRACK (~ ( LABRACK | RABRACK ) )* RABRACK )?
		int alt173=2;
		int LA173_0 = input.LA(1);
		if ( (LA173_0==LABRACK) ) {
			alt173=1;
		}
		switch (alt173) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:291:3: LABRACK (~ ( LABRACK | RABRACK ) )* RABRACK
				{
				match(input,LABRACK,FOLLOW_LABRACK_in_synpred60_UnrealScript1507); if (state.failed) return;
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:292:3: (~ ( LABRACK | RABRACK ) )*
				loop172:
				while (true) {
					int alt172=2;
					int LA172_0 = input.LA(1);
					if ( ((LA172_0 >= ALPHA && LA172_0 <= INTVAL)||(LA172_0 >= LBRACK && LA172_0 <= LSBRACK)||(LA172_0 >= RBRACK && LA172_0 <= 196)) ) {
						alt172=1;
					}

					switch (alt172) {
					case 1 :
						// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
						{
						if ( (input.LA(1) >= ALPHA && input.LA(1) <= INTVAL)||(input.LA(1) >= LBRACK && input.LA(1) <= LSBRACK)||(input.LA(1) >= RBRACK && input.LA(1) <= 196) ) {
							input.consume();
							state.errorRecovery=false;
							state.failed=false;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return;}
							MismatchedSetException mse = new MismatchedSetException(null,input);
							throw mse;
						}
						}
						break;

					default :
						break loop172;
					}
				}

				match(input,RABRACK,FOLLOW_RABRACK_in_synpred60_UnrealScript1546); if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred60_UnrealScript

	// $ANTLR start synpred70_UnrealScript
	public final void synpred70_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:353:5: ( stringval )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:353:5: stringval
		{
		pushFollow(FOLLOW_stringval_in_synpred70_UnrealScript1786);
		stringval();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred70_UnrealScript

	// $ANTLR start synpred74_UnrealScript
	public final void synpred74_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:376:13: ( structparams )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:376:13: structparams
		{
		pushFollow(FOLLOW_structparams_in_synpred74_UnrealScript1936);
		structparams();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred74_UnrealScript

	// $ANTLR start synpred98_UnrealScript
	public final void synpred98_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:476:21: ( DOT qualifierident_1 )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:476:21: DOT qualifierident_1
		{
		match(input,DOT,FOLLOW_DOT_in_synpred98_UnrealScript2510); if (state.failed) return;
		pushFollow(FOLLOW_qualifierident_1_in_synpred98_UnrealScript2512);
		qualifierident_1();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred98_UnrealScript

	// $ANTLR start synpred102_UnrealScript
	public final void synpred102_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:483:3: ( ( ( 'class' | 'property' | 'enum' | IDENTIFIER ) SQUOTE packageidentifier SQUOTE ) )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:483:3: ( ( 'class' | 'property' | 'enum' | IDENTIFIER ) SQUOTE packageidentifier SQUOTE )
		{
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:483:3: ( ( 'class' | 'property' | 'enum' | IDENTIFIER ) SQUOTE packageidentifier SQUOTE )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:484:4: ( 'class' | 'property' | 'enum' | IDENTIFIER ) SQUOTE packageidentifier SQUOTE
		{
		if ( input.LA(1)==IDENTIFIER||input.LA(1)==78||input.LA(1)==106||input.LA(1)==161 ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,SQUOTE,FOLLOW_SQUOTE_in_synpred102_UnrealScript2577); if (state.failed) return;
		pushFollow(FOLLOW_packageidentifier_in_synpred102_UnrealScript2579);
		packageidentifier();
		state._fsp--;
		if (state.failed) return;
		match(input,SQUOTE,FOLLOW_SQUOTE_in_synpred102_UnrealScript2581); if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred102_UnrealScript

	// $ANTLR start synpred103_UnrealScript
	public final void synpred103_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:493:3: ( fixedidentifier )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:493:3: fixedidentifier
		{
		pushFollow(FOLLOW_fixedidentifier_in_synpred103_UnrealScript2597);
		fixedidentifier();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred103_UnrealScript

	// $ANTLR start synpred104_UnrealScript
	public final void synpred104_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:494:5: ( defaultidentifier )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:494:5: defaultidentifier
		{
		pushFollow(FOLLOW_defaultidentifier_in_synpred104_UnrealScript2605);
		defaultidentifier();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred104_UnrealScript

	// $ANTLR start synpred105_UnrealScript
	public final void synpred105_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:495:5: ( 'class' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:495:5: 'class'
		{
		match(input,78,FOLLOW_78_in_synpred105_UnrealScript2611); if (state.failed) return;
		}

	}
	// $ANTLR end synpred105_UnrealScript

	// $ANTLR start synpred106_UnrealScript
	public final void synpred106_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:498:4: ( LSBRACK expr RSBRACK )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:498:4: LSBRACK expr RSBRACK
		{
		match(input,LSBRACK,FOLLOW_LSBRACK_in_synpred106_UnrealScript2625); if (state.failed) return;
		pushFollow(FOLLOW_expr_in_synpred106_UnrealScript2627);
		expr();
		state._fsp--;
		if (state.failed) return;
		match(input,RSBRACK,FOLLOW_RSBRACK_in_synpred106_UnrealScript2629); if (state.failed) return;
		}

	}
	// $ANTLR end synpred106_UnrealScript

	// $ANTLR start synpred116_UnrealScript
	public final void synpred116_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:545:3: ( statement )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:545:3: statement
		{
		pushFollow(FOLLOW_statement_in_synpred116_UnrealScript2798);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred116_UnrealScript

	// $ANTLR start synpred117_UnrealScript
	public final void synpred117_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:546:5: ( assignment )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:546:5: assignment
		{
		pushFollow(FOLLOW_assignment_in_synpred117_UnrealScript2804);
		assignment();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred117_UnrealScript

	// $ANTLR start synpred118_UnrealScript
	public final void synpred118_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:547:5: ( ( unaryexpr SEMICOLON ) )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:547:5: ( unaryexpr SEMICOLON )
		{
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:547:5: ( unaryexpr SEMICOLON )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:547:7: unaryexpr SEMICOLON
		{
		pushFollow(FOLLOW_unaryexpr_in_synpred118_UnrealScript2812);
		unaryexpr();
		state._fsp--;
		if (state.failed) return;
		match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred118_UnrealScript2814); if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred118_UnrealScript

	// $ANTLR start synpred122_UnrealScript
	public final void synpred122_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:551:5: ( switchcase )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:551:5: switchcase
		{
		pushFollow(FOLLOW_switchcase_in_synpred122_UnrealScript2840);
		switchcase();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred122_UnrealScript

	// $ANTLR start synpred127_UnrealScript
	public final void synpred127_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:558:2: ( SEMICOLON )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:558:2: SEMICOLON
		{
		match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred127_UnrealScript2876); if (state.failed) return;
		}

	}
	// $ANTLR end synpred127_UnrealScript

	// $ANTLR start synpred139_UnrealScript
	public final void synpred139_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:617:37: ( functionparams )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:617:37: functionparams
		{
		pushFollow(FOLLOW_functionparams_in_synpred139_UnrealScript3077);
		functionparams();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred139_UnrealScript

	// $ANTLR start synpred169_UnrealScript
	public final void synpred169_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:752:37: ( SEMICOLON )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:752:37: SEMICOLON
		{
		match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred169_UnrealScript3942); if (state.failed) return;
		}

	}
	// $ANTLR end synpred169_UnrealScript

	// $ANTLR start synpred170_UnrealScript
	public final void synpred170_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:766:3: ( funccall )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:766:3: funccall
		{
		pushFollow(FOLLOW_funccall_in_synpred170_UnrealScript3982);
		funccall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred170_UnrealScript

	// $ANTLR start synpred171_UnrealScript
	public final void synpred171_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:772:4: ( funccall )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:772:4: funccall
		{
		pushFollow(FOLLOW_funccall_in_synpred171_UnrealScript4007);
		funccall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred171_UnrealScript

	// $ANTLR start synpred175_UnrealScript
	public final void synpred175_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:793:38: ( 'else' codeblock )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:793:38: 'else' codeblock
		{
		match(input,105,FOLLOW_105_in_synpred175_UnrealScript4090); if (state.failed) return;
		pushFollow(FOLLOW_codeblock_in_synpred175_UnrealScript4092);
		codeblock();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred175_UnrealScript

	// $ANTLR start synpred178_UnrealScript
	public final void synpred178_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:811:77: ( SEMICOLON )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:811:77: SEMICOLON
		{
		match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred178_UnrealScript4180); if (state.failed) return;
		}

	}
	// $ANTLR end synpred178_UnrealScript

	// $ANTLR start synpred185_UnrealScript
	public final void synpred185_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:837:10: ( LBRACK expr ( COMMA expr )* RBRACK )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:837:10: LBRACK expr ( COMMA expr )* RBRACK
		{
		match(input,LBRACK,FOLLOW_LBRACK_in_synpred185_UnrealScript4273); if (state.failed) return;
		pushFollow(FOLLOW_expr_in_synpred185_UnrealScript4275);
		expr();
		state._fsp--;
		if (state.failed) return;
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:837:22: ( COMMA expr )*
		loop183:
		while (true) {
			int alt183=2;
			int LA183_0 = input.LA(1);
			if ( (LA183_0==COMMA) ) {
				alt183=1;
			}

			switch (alt183) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:837:24: COMMA expr
				{
				match(input,COMMA,FOLLOW_COMMA_in_synpred185_UnrealScript4279); if (state.failed) return;
				pushFollow(FOLLOW_expr_in_synpred185_UnrealScript4281);
				expr();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop183;
			}
		}

		match(input,RBRACK,FOLLOW_RBRACK_in_synpred185_UnrealScript4286); if (state.failed) return;
		}

	}
	// $ANTLR end synpred185_UnrealScript

	// $ANTLR start synpred187_UnrealScript
	public final void synpred187_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:874:3: ( ( 'class' SQUOTE packageidentifier SQUOTE DOT 'static' DOT ) )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:874:3: ( 'class' SQUOTE packageidentifier SQUOTE DOT 'static' DOT )
		{
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:874:3: ( 'class' SQUOTE packageidentifier SQUOTE DOT 'static' DOT )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:874:5: 'class' SQUOTE packageidentifier SQUOTE DOT 'static' DOT
		{
		match(input,78,FOLLOW_78_in_synpred187_UnrealScript4409); if (state.failed) return;
		match(input,SQUOTE,FOLLOW_SQUOTE_in_synpred187_UnrealScript4411); if (state.failed) return;
		pushFollow(FOLLOW_packageidentifier_in_synpred187_UnrealScript4413);
		packageidentifier();
		state._fsp--;
		if (state.failed) return;
		match(input,SQUOTE,FOLLOW_SQUOTE_in_synpred187_UnrealScript4415); if (state.failed) return;
		match(input,DOT,FOLLOW_DOT_in_synpred187_UnrealScript4417); if (state.failed) return;
		match(input,178,FOLLOW_178_in_synpred187_UnrealScript4419); if (state.failed) return;
		match(input,DOT,FOLLOW_DOT_in_synpred187_UnrealScript4421); if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred187_UnrealScript

	// $ANTLR start synpred188_UnrealScript
	public final void synpred188_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:875:9: ( IDENTIFIER DOT )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:875:9: IDENTIFIER DOT
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred188_UnrealScript4433); if (state.failed) return;
		match(input,DOT,FOLLOW_DOT_in_synpred188_UnrealScript4435); if (state.failed) return;
		}

	}
	// $ANTLR end synpred188_UnrealScript

	// $ANTLR start synpred189_UnrealScript
	public final void synpred189_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:875:5: ( ( ( IDENTIFIER DOT )+ ) )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:875:5: ( ( IDENTIFIER DOT )+ )
		{
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:875:5: ( ( IDENTIFIER DOT )+ )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:875:7: ( IDENTIFIER DOT )+
		{
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:875:7: ( IDENTIFIER DOT )+
		int cnt184=0;
		loop184:
		while (true) {
			int alt184=2;
			int LA184_0 = input.LA(1);
			if ( (LA184_0==IDENTIFIER) ) {
				alt184=1;
			}

			switch (alt184) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:875:9: IDENTIFIER DOT
				{
				match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred189_UnrealScript4433); if (state.failed) return;
				match(input,DOT,FOLLOW_DOT_in_synpred189_UnrealScript4435); if (state.failed) return;
				}
				break;

			default :
				if ( cnt184 >= 1 ) break loop184;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(184, input);
				throw eee;
			}
			cnt184++;
		}

		}

		}

	}
	// $ANTLR end synpred189_UnrealScript

	// $ANTLR start synpred190_UnrealScript
	public final void synpred190_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:879:3: ( funcnamecall )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:879:3: funcnamecall
		{
		pushFollow(FOLLOW_funcnamecall_in_synpred190_UnrealScript4453);
		funcnamecall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred190_UnrealScript

	// $ANTLR start synpred196_UnrealScript
	public final void synpred196_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:65: ( ( expr )? ( COMMA ( expr )? )* )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:65: ( expr )? ( COMMA ( expr )? )*
		{
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:65: ( expr )?
		int alt186=2;
		int LA186_0 = input.LA(1);
		if ( (LA186_0==FLOATVAL||LA186_0==IDENTIFIER||LA186_0==INTVAL||LA186_0==LBRACK||(LA186_0 >= SQUOTE && LA186_0 <= STRINGVAL)||LA186_0==35||(LA186_0 >= 46 && LA186_0 <= 47)||(LA186_0 >= 49 && LA186_0 <= 50)||LA186_0==67||(LA186_0 >= 69 && LA186_0 <= 70)||(LA186_0 >= 73 && LA186_0 <= 74)||LA186_0==76||LA186_0==78||(LA186_0 >= 80 && LA186_0 <= 81)||(LA186_0 >= 83 && LA186_0 <= 84)||(LA186_0 >= 86 && LA186_0 <= 88)||LA186_0==90||LA186_0==92||(LA186_0 >= 95 && LA186_0 <= 100)||(LA186_0 >= 102 && LA186_0 <= 104)||(LA186_0 >= 106 && LA186_0 <= 107)||LA186_0==109||LA186_0==112||LA186_0==114||(LA186_0 >= 117 && LA186_0 <= 118)||(LA186_0 >= 126 && LA186_0 <= 131)||(LA186_0 >= 138 && LA186_0 <= 140)||(LA186_0 >= 142 && LA186_0 <= 144)||(LA186_0 >= 146 && LA186_0 <= 147)||LA186_0==150||(LA186_0 >= 153 && LA186_0 <= 154)||LA186_0==157||(LA186_0 >= 160 && LA186_0 <= 165)||(LA186_0 >= 167 && LA186_0 <= 168)||LA186_0==171||(LA186_0 >= 176 && LA186_0 <= 178)||(LA186_0 >= 180 && LA186_0 <= 181)||(LA186_0 >= 183 && LA186_0 <= 186)||LA186_0==195) ) {
			alt186=1;
		}
		switch (alt186) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:65: expr
				{
				pushFollow(FOLLOW_expr_in_synpred196_UnrealScript4495);
				expr();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:71: ( COMMA ( expr )? )*
		loop188:
		while (true) {
			int alt188=2;
			int LA188_0 = input.LA(1);
			if ( (LA188_0==COMMA) ) {
				alt188=1;
			}

			switch (alt188) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:73: COMMA ( expr )?
				{
				match(input,COMMA,FOLLOW_COMMA_in_synpred196_UnrealScript4500); if (state.failed) return;
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:79: ( expr )?
				int alt187=2;
				int LA187_0 = input.LA(1);
				if ( (LA187_0==FLOATVAL||LA187_0==IDENTIFIER||LA187_0==INTVAL||LA187_0==LBRACK||(LA187_0 >= SQUOTE && LA187_0 <= STRINGVAL)||LA187_0==35||(LA187_0 >= 46 && LA187_0 <= 47)||(LA187_0 >= 49 && LA187_0 <= 50)||LA187_0==67||(LA187_0 >= 69 && LA187_0 <= 70)||(LA187_0 >= 73 && LA187_0 <= 74)||LA187_0==76||LA187_0==78||(LA187_0 >= 80 && LA187_0 <= 81)||(LA187_0 >= 83 && LA187_0 <= 84)||(LA187_0 >= 86 && LA187_0 <= 88)||LA187_0==90||LA187_0==92||(LA187_0 >= 95 && LA187_0 <= 100)||(LA187_0 >= 102 && LA187_0 <= 104)||(LA187_0 >= 106 && LA187_0 <= 107)||LA187_0==109||LA187_0==112||LA187_0==114||(LA187_0 >= 117 && LA187_0 <= 118)||(LA187_0 >= 126 && LA187_0 <= 131)||(LA187_0 >= 138 && LA187_0 <= 140)||(LA187_0 >= 142 && LA187_0 <= 144)||(LA187_0 >= 146 && LA187_0 <= 147)||LA187_0==150||(LA187_0 >= 153 && LA187_0 <= 154)||LA187_0==157||(LA187_0 >= 160 && LA187_0 <= 165)||(LA187_0 >= 167 && LA187_0 <= 168)||LA187_0==171||(LA187_0 >= 176 && LA187_0 <= 178)||(LA187_0 >= 180 && LA187_0 <= 181)||(LA187_0 >= 183 && LA187_0 <= 186)||LA187_0==195) ) {
					alt187=1;
				}
				switch (alt187) {
					case 1 :
						// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:889:79: expr
						{
						pushFollow(FOLLOW_expr_in_synpred196_UnrealScript4502);
						expr();
						state._fsp--;
						if (state.failed) return;
						}
						break;

				}

				}
				break;

			default :
				break loop188;
			}
		}

		}

	}
	// $ANTLR end synpred196_UnrealScript

	// $ANTLR start synpred199_UnrealScript
	public final void synpred199_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:905:4: ( funccall )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:905:4: funccall
		{
		pushFollow(FOLLOW_funccall_in_synpred199_UnrealScript4577);
		funccall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred199_UnrealScript

	// $ANTLR start synpred202_UnrealScript
	public final void synpred202_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:921:2: ( funcoperand )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:921:2: funcoperand
		{
		pushFollow(FOLLOW_funcoperand_in_synpred202_UnrealScript4627);
		funcoperand();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred202_UnrealScript

	// $ANTLR start synpred205_UnrealScript
	public final void synpred205_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:923:4: ( ( qualifiedidentifier ( DOT qualifiedidentifier )* ) )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:923:4: ( qualifiedidentifier ( DOT qualifiedidentifier )* )
		{
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:923:4: ( qualifiedidentifier ( DOT qualifiedidentifier )* )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:923:6: qualifiedidentifier ( DOT qualifiedidentifier )*
		{
		pushFollow(FOLLOW_qualifiedidentifier_in_synpred205_UnrealScript4639);
		qualifiedidentifier();
		state._fsp--;
		if (state.failed) return;
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:923:26: ( DOT qualifiedidentifier )*
		loop191:
		while (true) {
			int alt191=2;
			int LA191_0 = input.LA(1);
			if ( (LA191_0==DOT) ) {
				alt191=1;
			}

			switch (alt191) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:923:28: DOT qualifiedidentifier
				{
				match(input,DOT,FOLLOW_DOT_in_synpred205_UnrealScript4643); if (state.failed) return;
				pushFollow(FOLLOW_qualifiedidentifier_in_synpred205_UnrealScript4645);
				qualifiedidentifier();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop191;
			}
		}

		}

		}

	}
	// $ANTLR end synpred205_UnrealScript

	// $ANTLR start synpred209_UnrealScript
	public final void synpred209_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:934:5: ( '-' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:934:5: '-'
		{
		match(input,49,FOLLOW_49_in_synpred209_UnrealScript4690); if (state.failed) return;
		}

	}
	// $ANTLR end synpred209_UnrealScript

	// $ANTLR start synpred210_UnrealScript
	public final void synpred210_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:937:3: ( bareexpr )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:937:3: bareexpr
		{
		pushFollow(FOLLOW_bareexpr_in_synpred210_UnrealScript4701);
		bareexpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred210_UnrealScript

	// $ANTLR start synpred211_UnrealScript
	public final void synpred211_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:940:4: ( unaryop )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:940:4: unaryop
		{
		pushFollow(FOLLOW_unaryop_in_synpred211_UnrealScript4715);
		unaryop();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred211_UnrealScript

	// $ANTLR start synpred212_UnrealScript
	public final void synpred212_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:946:12: ( unaryop )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:946:12: unaryop
		{
		pushFollow(FOLLOW_unaryop_in_synpred212_UnrealScript4735);
		unaryop();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred212_UnrealScript

	// $ANTLR start synpred309_UnrealScript
	public final void synpred309_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1241:2: ( '~=' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1241:2: '~='
		{
		match(input,196,FOLLOW_196_in_synpred309_UnrealScript5723); if (state.failed) return;
		}

	}
	// $ANTLR end synpred309_UnrealScript

	// $ANTLR start synpred321_UnrealScript
	public final void synpred321_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1253:4: ( '@=' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1253:4: '@='
		{
		match(input,63,FOLLOW_63_in_synpred321_UnrealScript5783); if (state.failed) return;
		}

	}
	// $ANTLR end synpred321_UnrealScript

	// $ANTLR start synpred323_UnrealScript
	public final void synpred323_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1255:4: ( '$=' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1255:4: '$='
		{
		match(input,39,FOLLOW_39_in_synpred323_UnrealScript5793); if (state.failed) return;
		}

	}
	// $ANTLR end synpred323_UnrealScript

	// $ANTLR start synpred325_UnrealScript
	public final void synpred325_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1257:4: ( '!' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1257:4: '!'
		{
		match(input,35,FOLLOW_35_in_synpred325_UnrealScript5803); if (state.failed) return;
		}

	}
	// $ANTLR end synpred325_UnrealScript

	// $ANTLR start synpred333_UnrealScript
	public final void synpred333_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1265:4: ( '!' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1265:4: '!'
		{
		match(input,35,FOLLOW_35_in_synpred333_UnrealScript5843); if (state.failed) return;
		}

	}
	// $ANTLR end synpred333_UnrealScript

	// $ANTLR start synpred344_UnrealScript
	public final void synpred344_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1276:4: ( assignop )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1276:4: assignop
		{
		pushFollow(FOLLOW_assignop_in_synpred344_UnrealScript5898);
		assignop();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred344_UnrealScript

	// $ANTLR start synpred357_UnrealScript
	public final void synpred357_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1337:4: ( varparams )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1337:4: varparams
		{
		pushFollow(FOLLOW_varparams_in_synpred357_UnrealScript6093);
		varparams();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred357_UnrealScript

	// $ANTLR start synpred358_UnrealScript
	public final void synpred358_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1338:4: ( basictype )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1338:4: basictype
		{
		pushFollow(FOLLOW_basictype_in_synpred358_UnrealScript6098);
		basictype();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred358_UnrealScript

	// $ANTLR start synpred365_UnrealScript
	public final void synpred365_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1345:4: ( 'input' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1345:4: 'input'
		{
		match(input,127,FOLLOW_127_in_synpred365_UnrealScript6133); if (state.failed) return;
		}

	}
	// $ANTLR end synpred365_UnrealScript

	// $ANTLR start synpred366_UnrealScript
	public final void synpred366_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1346:4: ( 'interface' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1346:4: 'interface'
		{
		match(input,130,FOLLOW_130_in_synpred366_UnrealScript6138); if (state.failed) return;
		}

	}
	// $ANTLR end synpred366_UnrealScript

	// Delegated rules

	public final boolean synpred333_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred333_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred169_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred169_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred323_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred323_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred212_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred212_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred190_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred190_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred41_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred41_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred187_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred187_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred103_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred103_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred196_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred196_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred357_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred357_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred178_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred178_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred104_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred104_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred210_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred210_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred199_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred199_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred188_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred188_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred106_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred106_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred189_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred189_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred171_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred171_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred205_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred205_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred170_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred170_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred47_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred47_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred325_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred325_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred309_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred309_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred98_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred98_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred26_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred26_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred122_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred122_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred209_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred209_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred117_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred117_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred127_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred127_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred139_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred139_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred51_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred51_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred358_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred358_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred365_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred365_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred74_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred74_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred70_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred70_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred321_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred321_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred116_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred116_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred105_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred105_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred202_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred202_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred185_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred185_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred118_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred118_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred344_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred344_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred366_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred366_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred102_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred102_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred211_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred211_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred60_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred60_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred175_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred175_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA62 dfa62 = new DFA62(this);
	protected DFA72 dfa72 = new DFA72(this);
	protected DFA81 dfa81 = new DFA81(this);
	protected DFA124 dfa124 = new DFA124(this);
	protected DFA123 dfa123 = new DFA123(this);
	static final String DFA62_eotS =
		"\u0099\uffff";
	static final String DFA62_eofS =
		"\1\uffff\1\3\2\uffff\1\12\1\3\u0093\uffff";
	static final String DFA62_minS =
		"\1\21\1\5\1\35\1\uffff\2\5\1\uffff\1\4\1\uffff\1\4\1\uffff\1\21\36\4\20"+
		"\0\1\21\1\4\2\0\1\4\17\0\1\uffff\1\21\34\4\16\12\1\35\16\0\1\21\1\0\16"+
		"\12";
	static final String DFA62_maxS =
		"\1\u00b9\1\u00c4\1\35\1\uffff\2\u00c4\1\uffff\1\u00c4\1\uffff\1\u00c4"+
		"\1\uffff\1\u00b9\36\u00c4\20\0\1\u00b9\1\u00c4\2\0\1\u00c4\17\0\1\uffff"+
		"\1\u00b9\34\u00c4\17\35\16\0\1\u00b9\1\0\16\35";
	static final String DFA62_acceptS =
		"\3\uffff\1\2\2\uffff\1\1\1\uffff\1\4\1\uffff\1\5\103\uffff\1\3\112\uffff";
	static final String DFA62_specialS =
		"\2\uffff\1\5\47\uffff\1\34\1\3\1\31\1\6\1\11\1\33\1\1\1\60\1\12\1\32\1"+
		"\10\1\0\1\57\1\36\1\55\1\35\2\uffff\1\4\1\7\1\uffff\1\13\1\14\1\15\1\16"+
		"\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\56\55\uffff\1\54"+
		"\1\53\1\52\1\51\1\50\1\47\1\46\1\45\1\44\1\43\1\42\1\41\1\40\1\37\1\uffff"+
		"\1\2\16\uffff}>";
	static final String[] DFA62_transitionS = {
			"\1\1\63\uffff\1\3\3\uffff\2\3\1\uffff\1\3\1\uffff\1\2\1\uffff\2\3\1\uffff"+
			"\2\3\1\uffff\2\3\1\5\1\uffff\1\3\1\uffff\1\3\2\uffff\6\3\1\uffff\3\3"+
			"\1\uffff\1\6\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\2\3\7\uffff\6\3\6\uffff"+
			"\3\3\2\uffff\2\3\1\uffff\2\3\2\uffff\1\3\2\uffff\2\3\2\uffff\1\3\2\uffff"+
			"\1\3\1\4\4\3\1\uffff\2\3\2\uffff\1\3\4\uffff\3\3\1\uffff\1\3\2\uffff"+
			"\3\3",
			"\2\3\3\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\7\3\1\uffff"+
			"\2\3\1\7\1\3\4\uffff\41\3\1\uffff\2\3\2\uffff\4\3\1\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\6\3\1\uffff\1\3\1\uffff\2\3\1\uffff\6\3\1\uffff\3\3\1\uffff"+
			"\2\3\1\uffff\1\3\2\uffff\1\3\1\uffff\5\3\1\uffff\1\3\5\uffff\6\3\6\uffff"+
			"\3\3\1\uffff\3\3\1\uffff\2\3\2\uffff\1\3\2\uffff\2\3\2\uffff\1\3\2\uffff"+
			"\6\3\1\uffff\3\3\1\uffff\1\3\4\uffff\3\3\1\uffff\2\3\1\uffff\4\3\4\uffff"+
			"\1\3\1\uffff\4\3",
			"\1\6",
			"",
			"\2\12\3\uffff\1\12\1\uffff\1\12\1\uffff\1\12\2\uffff\1\12\1\uffff\7"+
			"\12\1\uffff\2\12\1\11\1\12\4\uffff\41\12\1\uffff\2\12\2\uffff\4\12\1"+
			"\uffff\1\12\1\uffff\2\12\1\uffff\6\12\1\uffff\1\12\1\uffff\2\12\1\uffff"+
			"\6\12\1\uffff\3\12\1\uffff\2\12\1\uffff\1\12\2\uffff\1\12\1\uffff\5\12"+
			"\1\uffff\1\12\5\uffff\6\12\6\uffff\3\12\1\uffff\3\12\1\uffff\2\12\2\uffff"+
			"\1\12\2\uffff\2\12\2\uffff\1\12\2\uffff\6\12\1\uffff\3\12\1\uffff\1\12"+
			"\4\uffff\3\12\1\uffff\2\12\1\uffff\4\12\4\uffff\1\12\1\uffff\4\12",
			"\2\3\3\uffff\1\13\1\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\7\3\1"+
			"\uffff\4\3\4\uffff\41\3\1\uffff\2\3\2\uffff\4\3\1\uffff\1\3\1\uffff\2"+
			"\3\1\uffff\6\3\1\uffff\1\3\1\uffff\2\3\1\uffff\6\3\1\uffff\3\3\1\uffff"+
			"\2\3\1\uffff\1\3\2\uffff\1\3\1\uffff\5\3\1\uffff\1\3\5\uffff\6\3\6\uffff"+
			"\3\3\1\uffff\3\3\1\uffff\2\3\2\uffff\1\3\2\uffff\2\3\2\uffff\1\3\2\uffff"+
			"\6\3\1\uffff\3\3\1\uffff\1\3\4\uffff\3\3\1\uffff\2\3\1\uffff\4\3\4\uffff"+
			"\1\3\1\uffff\4\3",
			"",
			"\15\3\1\14\63\3\1\27\3\3\1\16\1\30\1\3\1\30\1\3\1\30\1\3\1\31\1\27\1"+
			"\3\2\27\1\3\2\27\1\22\1\3\1\26\1\3\1\27\2\3\6\27\1\3\3\27\2\3\1\23\1"+
			"\3\1\27\4\3\1\30\2\3\1\25\1\27\7\3\1\27\1\17\1\27\1\30\1\20\1\27\6\3"+
			"\1\27\1\30\1\27\2\3\2\27\1\3\2\27\2\3\1\27\2\3\2\27\2\3\1\30\2\3\1\27"+
			"\1\32\4\27\1\3\2\27\2\3\1\27\4\3\1\27\1\24\1\21\1\3\1\30\2\3\1\15\2\27"+
			"\13\3",
			"",
			"\15\12\1\33\63\12\1\46\3\12\1\35\1\47\1\12\1\47\1\12\1\47\1\12\1\50"+
			"\1\46\1\12\2\46\1\12\2\46\1\41\1\12\1\45\1\12\1\46\2\12\6\46\1\12\3\46"+
			"\2\12\1\42\1\12\1\46\4\12\1\47\2\12\1\44\1\46\7\12\1\46\1\36\1\46\1\47"+
			"\1\37\1\46\6\12\1\46\1\47\1\46\2\12\2\46\1\12\2\46\2\12\1\46\2\12\2\46"+
			"\2\12\1\47\2\12\1\46\1\51\4\46\1\12\2\46\2\12\1\46\4\12\1\46\1\43\1\40"+
			"\1\12\1\47\2\12\1\34\2\46\13\12",
			"",
			"\1\52\61\uffff\1\3\1\uffff\1\67\1\3\2\uffff\1\55\1\70\1\uffff\1\70\1"+
			"\uffff\1\53\1\uffff\1\71\1\67\1\uffff\2\67\1\uffff\2\67\1\62\1\uffff"+
			"\1\66\1\uffff\1\67\2\uffff\6\67\1\uffff\3\67\1\uffff\1\72\1\63\1\uffff"+
			"\1\67\4\uffff\1\70\2\uffff\1\65\1\67\7\uffff\1\67\1\56\1\67\1\70\1\60"+
			"\1\67\6\uffff\1\67\1\70\1\67\2\uffff\2\67\1\uffff\2\67\2\uffff\1\67\2"+
			"\uffff\2\67\2\uffff\1\70\2\uffff\1\67\1\57\4\67\1\uffff\2\67\2\uffff"+
			"\1\67\4\uffff\1\67\1\64\1\61\1\uffff\1\70\1\3\1\uffff\1\54\2\67",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\6\3\1\73\22\3\1\74\u00a7\3",
			"\31\3\1\75\u00a7\3",
			"\6\12\1\76\22\12\1\77\u00a7\12",
			"\6\12\1\76\22\12\1\100\u00a7\12",
			"\6\12\1\76\22\12\1\101\u00a7\12",
			"\6\12\1\76\22\12\1\102\u00a7\12",
			"\6\12\1\76\22\12\1\103\u00a7\12",
			"\6\12\1\76\22\12\1\104\u00a7\12",
			"\6\12\1\76\22\12\1\105\u00a7\12",
			"\6\12\1\76\22\12\1\106\u00a7\12",
			"\6\12\1\76\22\12\1\107\u00a7\12",
			"\6\12\1\76\22\12\1\110\u00a7\12",
			"\6\12\1\76\22\12\1\111\u00a7\12",
			"\6\12\1\76\22\12\1\112\u00a7\12",
			"\6\12\1\76\22\12\1\113\u00a7\12",
			"\6\12\1\76\22\12\1\114\u00a7\12",
			"\31\12\1\115\u00a7\12",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\3\13\uffff\1\117\47\uffff\1\3\3\uffff\2\3\1\uffff\1\3\1\uffff\1\3"+
			"\1\uffff\2\3\1\uffff\2\3\1\uffff\3\3\1\uffff\1\3\1\uffff\1\3\2\uffff"+
			"\6\3\1\uffff\3\3\2\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\2\3\7\uffff"+
			"\6\3\6\uffff\3\3\2\uffff\2\3\1\uffff\2\3\2\uffff\1\3\2\uffff\2\3\2\uffff"+
			"\1\3\2\uffff\1\3\1\uffff\4\3\1\uffff\2\3\2\uffff\1\3\4\uffff\3\3\1\uffff"+
			"\1\3\2\uffff\3\3",
			"\15\3\1\120\63\3\1\133\3\3\1\122\1\134\1\3\1\134\1\3\1\134\1\3\1\135"+
			"\1\133\1\3\2\133\1\3\2\133\1\126\1\3\1\132\1\3\1\133\2\3\6\133\1\3\3"+
			"\133\2\3\1\127\1\3\1\133\4\3\1\134\2\3\1\131\1\133\7\3\1\133\1\123\1"+
			"\133\1\134\1\124\1\133\6\3\1\133\1\134\1\133\2\3\2\133\1\3\2\133\2\3"+
			"\1\133\2\3\2\133\2\3\1\134\2\3\1\133\1\3\4\133\1\3\2\133\2\3\1\133\4"+
			"\3\1\133\1\130\1\125\1\3\1\134\2\3\1\121\2\133\13\3",
			"\1\uffff",
			"\1\uffff",
			"\15\12\1\136\63\12\1\151\3\12\1\140\1\152\1\12\1\152\1\12\1\152\1\12"+
			"\1\153\1\151\1\12\2\151\1\12\2\151\1\144\1\12\1\150\1\12\1\151\2\12\6"+
			"\151\1\12\3\151\2\12\1\145\1\12\1\151\4\12\1\152\2\12\1\147\1\151\7\12"+
			"\1\151\1\141\1\151\1\152\1\142\1\151\6\12\1\151\1\152\1\151\2\12\2\151"+
			"\1\12\2\151\2\12\1\151\2\12\2\151\2\12\1\152\2\12\1\151\1\12\4\151\1"+
			"\12\2\151\2\12\1\151\4\12\1\151\1\146\1\143\1\12\1\152\2\12\1\137\2\151"+
			"\13\12",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\154\63\uffff\1\167\3\uffff\1\156\1\170\1\uffff\1\170\1\uffff\1\170"+
			"\1\uffff\1\171\1\167\1\uffff\2\167\1\uffff\2\167\1\162\1\uffff\1\166"+
			"\1\uffff\1\167\2\uffff\6\167\1\uffff\3\167\2\uffff\1\163\1\uffff\1\167"+
			"\4\uffff\1\170\2\uffff\1\165\1\167\7\uffff\1\167\1\157\1\167\1\170\1"+
			"\160\1\167\6\uffff\1\167\1\170\1\167\2\uffff\2\167\1\uffff\2\167\2\uffff"+
			"\1\167\2\uffff\2\167\2\uffff\1\170\2\uffff\1\167\1\172\4\167\1\uffff"+
			"\2\167\2\uffff\1\167\4\uffff\1\167\1\164\1\161\1\uffff\1\170\2\uffff"+
			"\1\155\2\167",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\3\1\73\22\3\1\75\u00a7\3",
			"\6\12\1\76\22\12\1\173\u00a7\12",
			"\6\12\1\76\22\12\1\174\u00a7\12",
			"\6\12\1\76\22\12\1\175\u00a7\12",
			"\6\12\1\76\22\12\1\176\u00a7\12",
			"\6\12\1\76\22\12\1\177\u00a7\12",
			"\6\12\1\76\22\12\1\u0080\u00a7\12",
			"\6\12\1\76\22\12\1\u0081\u00a7\12",
			"\6\12\1\76\22\12\1\u0082\u00a7\12",
			"\6\12\1\76\22\12\1\u0083\u00a7\12",
			"\6\12\1\76\22\12\1\u0084\u00a7\12",
			"\6\12\1\76\22\12\1\u0085\u00a7\12",
			"\6\12\1\76\22\12\1\u0086\u00a7\12",
			"\6\12\1\76\22\12\1\u0087\u00a7\12",
			"\6\12\1\76\22\12\1\u0088\u00a7\12",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u008a",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u008b\63\uffff\1\u0096\3\uffff\1\u008d\1\u0097\1\uffff\1\u0097\1"+
			"\uffff\1\u0097\1\uffff\1\u0098\1\u0096\1\uffff\2\u0096\1\uffff\2\u0096"+
			"\1\u0091\1\uffff\1\u0095\1\uffff\1\u0096\2\uffff\6\u0096\1\uffff\3\u0096"+
			"\2\uffff\1\u0092\1\uffff\1\u0096\4\uffff\1\u0097\2\uffff\1\u0094\1\u0096"+
			"\7\uffff\1\u0096\1\u008e\1\u0096\1\u0097\1\u008f\1\u0096\6\uffff\1\u0096"+
			"\1\u0097\1\u0096\2\uffff\2\u0096\1\uffff\2\u0096\2\uffff\1\u0096\2\uffff"+
			"\2\u0096\2\uffff\1\u0097\2\uffff\1\u0096\1\uffff\4\u0096\1\uffff\2\u0096"+
			"\2\uffff\1\u0096\4\uffff\1\u0096\1\u0093\1\u0090\1\uffff\1\u0097\2\uffff"+
			"\1\u008c\2\u0096",
			"\1\uffff",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a",
			"\1\u0089\22\uffff\1\u008a"
	};

	static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
	static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
	static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
	static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
	static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
	static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
	static final short[][] DFA62_transition;

	static {
		int numStates = DFA62_transitionS.length;
		DFA62_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
		}
	}

	protected class DFA62 extends DFA {

		public DFA62(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 62;
			this.eot = DFA62_eot;
			this.eof = DFA62_eof;
			this.min = DFA62_min;
			this.max = DFA62_max;
			this.accept = DFA62_accept;
			this.special = DFA62_special;
			this.transition = DFA62_transition;
		}
		@Override
		public String getDescription() {
			return "482:2: ( ( ( 'class' | 'property' | 'enum' | IDENTIFIER ) SQUOTE packageidentifier SQUOTE ) | fixedidentifier | defaultidentifier | 'class' | 'property' )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA62_53 = input.LA(1);
						 
						int index62_53 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_53);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA62_48 = input.LA(1);
						 
						int index62_48 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_48);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA62_138 = input.LA(1);
						 
						int index62_138 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_138);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA62_43 = input.LA(1);
						 
						int index62_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_43);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA62_60 = input.LA(1);
						 
						int index62_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (synpred103_UnrealScript()) ) {s = 3;}
						 
						input.seek(index62_60);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA62_2 = input.LA(1);
						 
						int index62_2 = input.index();
						input.rewind();
						s = -1;
						if ( (LA62_2==SQUOTE) ) {s = 6;}
						else if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred105_UnrealScript()) ) {s = 8;}
						 
						input.seek(index62_2);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA62_45 = input.LA(1);
						 
						int index62_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_45);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA62_61 = input.LA(1);
						 
						int index62_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (synpred103_UnrealScript()) ) {s = 3;}
						 
						input.seek(index62_61);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA62_52 = input.LA(1);
						 
						int index62_52 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_52);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA62_46 = input.LA(1);
						 
						int index62_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_46);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA62_50 = input.LA(1);
						 
						int index62_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_50);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA62_63 = input.LA(1);
						 
						int index62_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_63);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA62_64 = input.LA(1);
						 
						int index62_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_64);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA62_65 = input.LA(1);
						 
						int index62_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_65);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA62_66 = input.LA(1);
						 
						int index62_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_66);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA62_67 = input.LA(1);
						 
						int index62_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_67);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA62_68 = input.LA(1);
						 
						int index62_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_68);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA62_69 = input.LA(1);
						 
						int index62_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_69);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA62_70 = input.LA(1);
						 
						int index62_70 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_70);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA62_71 = input.LA(1);
						 
						int index62_71 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_71);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA62_72 = input.LA(1);
						 
						int index62_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_72);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA62_73 = input.LA(1);
						 
						int index62_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_73);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA62_74 = input.LA(1);
						 
						int index62_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_74);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA62_75 = input.LA(1);
						 
						int index62_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_75);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA62_76 = input.LA(1);
						 
						int index62_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_76);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA62_44 = input.LA(1);
						 
						int index62_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_44);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA62_51 = input.LA(1);
						 
						int index62_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_51);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA62_47 = input.LA(1);
						 
						int index62_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_47);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA62_42 = input.LA(1);
						 
						int index62_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_42);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA62_57 = input.LA(1);
						 
						int index62_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_57);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA62_55 = input.LA(1);
						 
						int index62_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_55);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA62_136 = input.LA(1);
						 
						int index62_136 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_136);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA62_135 = input.LA(1);
						 
						int index62_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_135);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA62_134 = input.LA(1);
						 
						int index62_134 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_134);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA62_133 = input.LA(1);
						 
						int index62_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_133);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA62_132 = input.LA(1);
						 
						int index62_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_132);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA62_131 = input.LA(1);
						 
						int index62_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_131);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA62_130 = input.LA(1);
						 
						int index62_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_130);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA62_129 = input.LA(1);
						 
						int index62_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_129);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA62_128 = input.LA(1);
						 
						int index62_128 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_128);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA62_127 = input.LA(1);
						 
						int index62_127 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_127);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA62_126 = input.LA(1);
						 
						int index62_126 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_126);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA62_125 = input.LA(1);
						 
						int index62_125 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_125);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA62_124 = input.LA(1);
						 
						int index62_124 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_124);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA62_123 = input.LA(1);
						 
						int index62_123 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_123);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA62_56 = input.LA(1);
						 
						int index62_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_56);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA62_77 = input.LA(1);
						 
						int index62_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_UnrealScript()) ) {s = 6;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index62_77);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA62_54 = input.LA(1);
						 
						int index62_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_54);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA62_49 = input.LA(1);
						 
						int index62_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred103_UnrealScript()) ) {s = 3;}
						else if ( (synpred104_UnrealScript()) ) {s = 78;}
						 
						input.seek(index62_49);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 62, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA72_eotS =
		"\4\uffff";
	static final String DFA72_eofS =
		"\4\uffff";
	static final String DFA72_minS =
		"\2\111\2\uffff";
	static final String DFA72_maxS =
		"\2\u00be\2\uffff";
	static final String DFA72_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA72_specialS =
		"\4\uffff}>";
	static final String[] DFA72_transitionS = {
			"\1\2\6\uffff\2\3\10\uffff\1\3\20\uffff\2\3\4\uffff\1\3\3\uffff\1\3\16"+
			"\uffff\5\3\3\uffff\1\3\3\uffff\2\3\6\uffff\1\3\5\uffff\3\3\1\uffff\1"+
			"\3\1\uffff\2\3\6\uffff\1\3\1\uffff\1\1\1\3\1\uffff\1\2\1\3\5\uffff\1"+
			"\3\2\uffff\1\3\2\uffff\1\3",
			"\1\2\6\uffff\2\3\10\uffff\1\3\20\uffff\2\3\4\uffff\1\3\3\uffff\1\3\16"+
			"\uffff\5\3\3\uffff\1\3\3\uffff\2\3\6\uffff\1\3\5\uffff\3\3\1\uffff\1"+
			"\3\1\uffff\2\3\6\uffff\1\3\1\uffff\1\1\1\3\1\uffff\1\2\1\3\5\uffff\1"+
			"\3\2\uffff\1\3\2\uffff\1\3",
			"",
			""
	};

	static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
	static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
	static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
	static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
	static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
	static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
	static final short[][] DFA72_transition;

	static {
		int numStates = DFA72_transitionS.length;
		DFA72_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
		}
	}

	protected class DFA72 extends DFA {

		public DFA72(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 72;
			this.eot = DFA72_eot;
			this.eof = DFA72_eof;
			this.min = DFA72_min;
			this.max = DFA72_max;
			this.accept = DFA72_accept;
			this.special = DFA72_special;
			this.transition = DFA72_transition;
		}
		@Override
		public String getDescription() {
			return "564:1: body : ( statedecl | functiondecl );";
		}
	}

	static final String DFA81_eotS =
		"\10\uffff";
	static final String DFA81_eofS =
		"\10\uffff";
	static final String DFA81_minS =
		"\2\120\1\25\2\uffff\1\23\1\31\1\120";
	static final String DFA81_maxS =
		"\3\u00be\2\uffff\1\23\1\31\1\u00be";
	static final String DFA81_acceptS =
		"\3\uffff\1\1\1\2\3\uffff";
	static final String DFA81_specialS =
		"\10\uffff}>";
	static final String[] DFA81_transitionS = {
			"\2\1\10\uffff\1\3\20\uffff\1\3\1\1\4\uffff\1\1\3\uffff\1\3\16\uffff\5"+
			"\1\3\uffff\1\2\3\uffff\2\1\6\uffff\1\4\5\uffff\2\4\1\1\1\uffff\1\1\1"+
			"\uffff\2\1\6\uffff\1\1\1\uffff\2\1\2\uffff\1\1\5\uffff\1\1\2\uffff\1"+
			"\1\2\uffff\1\1",
			"\2\1\10\uffff\1\3\20\uffff\1\3\1\1\4\uffff\1\1\3\uffff\1\3\16\uffff"+
			"\5\1\3\uffff\1\2\3\uffff\2\1\6\uffff\1\4\5\uffff\2\4\1\1\1\uffff\1\1"+
			"\1\uffff\2\1\6\uffff\1\1\1\uffff\2\1\2\uffff\1\1\5\uffff\1\1\2\uffff"+
			"\1\1\2\uffff\1\1",
			"\1\5\72\uffff\2\1\10\uffff\1\3\20\uffff\1\3\1\1\4\uffff\1\1\3\uffff"+
			"\1\3\16\uffff\5\1\3\uffff\1\2\3\uffff\2\1\6\uffff\1\4\5\uffff\2\4\1\1"+
			"\1\uffff\1\1\1\uffff\2\1\6\uffff\1\1\1\uffff\2\1\2\uffff\1\1\5\uffff"+
			"\1\1\2\uffff\1\1\2\uffff\1\1",
			"",
			"",
			"\1\6",
			"\1\7",
			"\2\1\10\uffff\1\3\20\uffff\1\3\1\1\4\uffff\1\1\3\uffff\1\3\16\uffff"+
			"\5\1\3\uffff\1\2\3\uffff\2\1\6\uffff\1\4\5\uffff\2\4\1\1\1\uffff\1\1"+
			"\1\uffff\2\1\6\uffff\1\1\1\uffff\2\1\2\uffff\1\1\5\uffff\1\1\2\uffff"+
			"\1\1\2\uffff\1\1"
	};

	static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
	static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
	static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
	static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
	static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
	static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
	static final short[][] DFA81_transition;

	static {
		int numStates = DFA81_transitionS.length;
		DFA81_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
		}
	}

	protected class DFA81 extends DFA {

		public DFA81(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 81;
			this.eot = DFA81_eot;
			this.eof = DFA81_eof;
			this.min = DFA81_min;
			this.max = DFA81_max;
			this.accept = DFA81_accept;
			this.special = DFA81_special;
			this.transition = DFA81_transition;
		}
		@Override
		public String getDescription() {
			return "604:2: ( normalfunc | operatorfunc )";
		}
	}

	static final String DFA124_eotS =
		"\u00c4\uffff";
	static final String DFA124_eofS =
		"\u00c4\uffff";
	static final String DFA124_minS =
		"\1\21\2\12\1\uffff\2\21\16\12\1\35\1\uffff\20\0\2\21\1\12\1\21\16\12\1"+
		"\21\16\12\1\35\1\12\1\21\17\0\1\21\16\12\1\uffff\20\0\1\21\16\0\1\21\16"+
		"\12\1\35\1\21\17\0\16\12\16\0";
	static final String DFA124_maxS =
		"\1\u00b9\2\35\1\uffff\2\u00b9\17\35\1\uffff\20\0\2\u00b9\1\27\1\u00b9"+
		"\16\35\1\u00b9\17\35\1\27\1\u00b9\17\0\1\u00b9\16\35\1\uffff\20\0\1\u00b9"+
		"\16\0\1\u00b9\17\35\1\u00b9\17\0\16\35\16\0";
	static final String DFA124_acceptS =
		"\3\uffff\1\3\21\uffff\1\2\122\uffff\1\1\133\uffff";
	static final String DFA124_specialS =
		"\26\uffff\1\131\1\52\1\45\1\42\1\54\1\37\1\56\1\65\1\41\1\130\1\125\1"+
		"\57\1\36\1\55\1\51\1\64\44\uffff\1\17\1\16\1\15\1\14\1\13\1\12\1\11\1"+
		"\10\1\7\1\6\1\5\1\4\1\3\1\2\1\1\20\uffff\1\66\1\46\1\44\1\40\1\62\1\53"+
		"\1\61\1\0\1\47\1\126\1\127\1\67\1\43\1\60\1\50\1\63\1\uffff\1\20\1\21"+
		"\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\21\uffff"+
		"\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1"+
		"\110\1\111\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
		"\122\1\123\1\124\1\73\1\72\1\71\1\70}>";
	static final String[] DFA124_transitionS = {
			"\1\2\61\uffff\1\3\1\uffff\2\3\2\uffff\2\3\1\uffff\1\3\1\uffff\1\1\1\uffff"+
			"\2\3\1\uffff\2\3\1\uffff\3\3\1\uffff\1\3\1\uffff\1\3\2\uffff\6\3\1\uffff"+
			"\3\3\1\uffff\2\3\1\uffff\1\3\4\uffff\1\3\2\uffff\2\3\7\uffff\6\3\6\uffff"+
			"\3\3\2\uffff\2\3\1\uffff\2\3\2\uffff\1\3\2\uffff\2\3\2\uffff\1\3\2\uffff"+
			"\6\3\1\uffff\2\3\2\uffff\1\3\4\uffff\3\3\1\uffff\2\3\1\uffff\3\3",
			"\1\3\11\uffff\4\3\5\uffff\1\4",
			"\1\5\12\uffff\3\3\5\uffff\1\3",
			"",
			"\1\6\63\uffff\1\21\3\uffff\1\10\1\22\1\uffff\1\22\1\uffff\1\22\1\uffff"+
			"\1\23\1\21\1\uffff\2\21\1\uffff\2\21\1\14\1\uffff\1\20\1\uffff\1\21\2"+
			"\uffff\6\21\1\uffff\3\21\2\uffff\1\15\1\uffff\1\21\4\uffff\1\22\2\uffff"+
			"\1\17\1\21\7\uffff\1\21\1\11\1\21\1\22\1\12\1\21\6\uffff\1\21\1\22\1"+
			"\21\2\uffff\2\21\1\uffff\2\21\2\uffff\1\21\2\uffff\2\21\2\uffff\1\22"+
			"\2\uffff\1\21\1\24\4\21\1\uffff\2\21\2\uffff\1\21\4\uffff\1\21\1\16\1"+
			"\13\1\uffff\1\22\2\uffff\1\7\2\21",
			"\1\26\61\uffff\1\25\1\uffff\1\43\1\25\2\uffff\1\31\1\44\1\uffff\1\44"+
			"\1\uffff\1\27\1\uffff\1\45\1\43\1\uffff\2\43\1\uffff\2\43\1\36\1\uffff"+
			"\1\42\1\uffff\1\43\2\uffff\6\43\1\uffff\3\43\1\uffff\1\46\1\37\1\uffff"+
			"\1\43\4\uffff\1\44\2\uffff\1\41\1\43\7\uffff\1\43\1\32\1\43\1\44\1\34"+
			"\1\43\6\uffff\1\43\1\44\1\43\2\uffff\2\43\1\uffff\2\43\2\uffff\1\43\2"+
			"\uffff\2\43\2\uffff\1\44\2\uffff\1\43\1\33\4\43\1\uffff\2\43\2\uffff"+
			"\1\43\4\uffff\1\43\1\40\1\35\1\uffff\1\44\1\25\1\uffff\1\30\2\43",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\50",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\25\13\uffff\1\51\47\uffff\1\25\3\uffff\2\25\1\uffff\1\25\1\uffff"+
			"\1\25\1\uffff\2\25\1\uffff\2\25\1\uffff\3\25\1\uffff\1\25\1\uffff\1\25"+
			"\2\uffff\6\25\1\uffff\3\25\2\uffff\1\25\1\uffff\1\25\4\uffff\1\25\2\uffff"+
			"\2\25\7\uffff\6\25\6\uffff\3\25\2\uffff\2\25\1\uffff\2\25\2\uffff\1\25"+
			"\2\uffff\2\25\2\uffff\1\25\2\uffff\1\25\1\uffff\4\25\1\uffff\2\25\2\uffff"+
			"\1\25\4\uffff\3\25\1\uffff\1\25\2\uffff\3\25",
			"\1\52\63\uffff\1\65\3\uffff\1\54\1\66\1\uffff\1\66\1\uffff\1\66\1\uffff"+
			"\1\67\1\65\1\uffff\2\65\1\uffff\2\65\1\60\1\uffff\1\64\1\uffff\1\65\2"+
			"\uffff\6\65\1\uffff\3\65\2\uffff\1\61\1\uffff\1\65\4\uffff\1\66\2\uffff"+
			"\1\63\1\65\7\uffff\1\65\1\55\1\65\1\66\1\56\1\65\6\uffff\1\65\1\66\1"+
			"\65\2\uffff\2\65\1\uffff\2\65\2\uffff\1\65\2\uffff\2\65\2\uffff\1\66"+
			"\2\uffff\1\65\1\uffff\4\65\1\uffff\2\65\2\uffff\1\65\4\uffff\1\65\1\62"+
			"\1\57\1\uffff\1\66\2\uffff\1\53\2\65",
			"\1\70\12\uffff\1\3\1\uffff\1\3",
			"\1\71\63\uffff\1\104\3\uffff\1\73\1\105\1\uffff\1\105\1\uffff\1\105"+
			"\1\uffff\1\106\1\104\1\uffff\2\104\1\uffff\2\104\1\77\1\uffff\1\103\1"+
			"\uffff\1\104\2\uffff\6\104\1\uffff\3\104\2\uffff\1\100\1\uffff\1\104"+
			"\4\uffff\1\105\2\uffff\1\102\1\104\7\uffff\1\104\1\74\1\104\1\105\1\75"+
			"\1\104\6\uffff\1\104\1\105\1\104\2\uffff\2\104\1\uffff\2\104\2\uffff"+
			"\1\104\2\uffff\2\104\2\uffff\1\105\2\uffff\1\104\1\107\4\104\1\uffff"+
			"\2\104\2\uffff\1\104\4\uffff\1\104\1\101\1\76\1\uffff\1\105\2\uffff\1"+
			"\72\2\104",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\47\22\uffff\1\50",
			"\1\3\63\uffff\1\3\3\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\1"+
			"\uffff\2\3\1\uffff\3\3\1\uffff\1\3\1\uffff\1\3\2\uffff\6\3\1\uffff\3"+
			"\3\1\uffff\2\3\1\uffff\1\3\4\uffff\1\3\2\uffff\2\3\7\uffff\6\3\6\uffff"+
			"\3\3\2\uffff\2\3\1\uffff\2\3\2\uffff\1\3\2\uffff\2\3\2\uffff\1\3\2\uffff"+
			"\6\3\1\uffff\2\3\2\uffff\1\3\4\uffff\2\3\1\110\1\uffff\1\3\2\uffff\3"+
			"\3",
			"\1\111\22\uffff\1\112",
			"\1\111\22\uffff\1\113",
			"\1\111\22\uffff\1\114",
			"\1\111\22\uffff\1\115",
			"\1\111\22\uffff\1\116",
			"\1\111\22\uffff\1\117",
			"\1\111\22\uffff\1\120",
			"\1\111\22\uffff\1\121",
			"\1\111\22\uffff\1\122",
			"\1\111\22\uffff\1\123",
			"\1\111\22\uffff\1\124",
			"\1\111\22\uffff\1\125",
			"\1\111\22\uffff\1\126",
			"\1\111\22\uffff\1\127",
			"\1\130",
			"\1\131\12\uffff\1\3\1\uffff\1\3",
			"\1\132\63\uffff\1\145\3\uffff\1\134\1\146\1\uffff\1\146\1\uffff\1\146"+
			"\1\uffff\1\147\1\145\1\uffff\2\145\1\uffff\2\145\1\140\1\uffff\1\144"+
			"\1\uffff\1\145\2\uffff\6\145\1\uffff\3\145\2\uffff\1\141\1\uffff\1\145"+
			"\4\uffff\1\146\2\uffff\1\143\1\145\7\uffff\1\145\1\135\1\145\1\146\1"+
			"\136\1\145\6\uffff\1\145\1\146\1\145\2\uffff\2\145\1\uffff\2\145\2\uffff"+
			"\1\145\2\uffff\2\145\2\uffff\1\146\2\uffff\1\145\1\uffff\4\145\1\uffff"+
			"\2\145\2\uffff\1\145\4\uffff\1\145\1\142\1\137\1\uffff\1\146\2\uffff"+
			"\1\133\2\145",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\151\61\uffff\1\150\1\uffff\1\166\1\150\2\uffff\1\154\1\167\1\uffff"+
			"\1\167\1\uffff\1\152\1\uffff\1\170\1\166\1\uffff\2\166\1\uffff\2\166"+
			"\1\161\1\uffff\1\165\1\uffff\1\166\2\uffff\6\166\1\uffff\3\166\1\uffff"+
			"\1\171\1\162\1\uffff\1\166\4\uffff\1\167\2\uffff\1\164\1\166\7\uffff"+
			"\1\166\1\155\1\166\1\167\1\157\1\166\6\uffff\1\166\1\167\1\166\2\uffff"+
			"\2\166\1\uffff\2\166\2\uffff\1\166\2\uffff\2\166\2\uffff\1\167\2\uffff"+
			"\1\166\1\156\4\166\1\uffff\2\166\2\uffff\1\166\4\uffff\1\166\1\163\1"+
			"\160\1\uffff\1\167\1\150\1\uffff\1\153\2\166",
			"\1\111\22\uffff\1\172",
			"\1\111\22\uffff\1\173",
			"\1\111\22\uffff\1\174",
			"\1\111\22\uffff\1\175",
			"\1\111\22\uffff\1\176",
			"\1\111\22\uffff\1\177",
			"\1\111\22\uffff\1\u0080",
			"\1\111\22\uffff\1\u0081",
			"\1\111\22\uffff\1\u0082",
			"\1\111\22\uffff\1\u0083",
			"\1\111\22\uffff\1\u0084",
			"\1\111\22\uffff\1\u0085",
			"\1\111\22\uffff\1\u0086",
			"\1\111\22\uffff\1\u0087",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\150\13\uffff\1\u0088\47\uffff\1\150\3\uffff\2\150\1\uffff\1\150\1"+
			"\uffff\1\150\1\uffff\2\150\1\uffff\2\150\1\uffff\3\150\1\uffff\1\150"+
			"\1\uffff\1\150\2\uffff\6\150\1\uffff\3\150\2\uffff\1\150\1\uffff\1\150"+
			"\4\uffff\1\150\2\uffff\2\150\7\uffff\6\150\6\uffff\3\150\2\uffff\2\150"+
			"\1\uffff\2\150\2\uffff\1\150\2\uffff\2\150\2\uffff\1\150\2\uffff\1\150"+
			"\1\uffff\4\150\1\uffff\2\150\2\uffff\1\150\4\uffff\3\150\1\uffff\1\150"+
			"\2\uffff\3\150",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u0089\63\uffff\1\u0094\3\uffff\1\u008b\1\u0095\1\uffff\1\u0095\1"+
			"\uffff\1\u0095\1\uffff\1\u0096\1\u0094\1\uffff\2\u0094\1\uffff\2\u0094"+
			"\1\u008f\1\uffff\1\u0093\1\uffff\1\u0094\2\uffff\6\u0094\1\uffff\3\u0094"+
			"\2\uffff\1\u0090\1\uffff\1\u0094\4\uffff\1\u0095\2\uffff\1\u0092\1\u0094"+
			"\7\uffff\1\u0094\1\u008c\1\u0094\1\u0095\1\u008d\1\u0094\6\uffff\1\u0094"+
			"\1\u0095\1\u0094\2\uffff\2\u0094\1\uffff\2\u0094\2\uffff\1\u0094\2\uffff"+
			"\2\u0094\2\uffff\1\u0095\2\uffff\1\u0094\1\u0097\4\u0094\1\uffff\2\u0094"+
			"\2\uffff\1\u0094\4\uffff\1\u0094\1\u0091\1\u008e\1\uffff\1\u0095\2\uffff"+
			"\1\u008a\2\u0094",
			"\1\u0098\22\uffff\1\u0099",
			"\1\u0098\22\uffff\1\u009a",
			"\1\u0098\22\uffff\1\u009b",
			"\1\u0098\22\uffff\1\u009c",
			"\1\u0098\22\uffff\1\u009d",
			"\1\u0098\22\uffff\1\u009e",
			"\1\u0098\22\uffff\1\u009f",
			"\1\u0098\22\uffff\1\u00a0",
			"\1\u0098\22\uffff\1\u00a1",
			"\1\u0098\22\uffff\1\u00a2",
			"\1\u0098\22\uffff\1\u00a3",
			"\1\u0098\22\uffff\1\u00a4",
			"\1\u0098\22\uffff\1\u00a5",
			"\1\u0098\22\uffff\1\u00a6",
			"\1\u00a7",
			"\1\u00a8\63\uffff\1\u00b3\3\uffff\1\u00aa\1\u00b4\1\uffff\1\u00b4\1"+
			"\uffff\1\u00b4\1\uffff\1\u00b5\1\u00b3\1\uffff\2\u00b3\1\uffff\2\u00b3"+
			"\1\u00ae\1\uffff\1\u00b2\1\uffff\1\u00b3\2\uffff\6\u00b3\1\uffff\3\u00b3"+
			"\2\uffff\1\u00af\1\uffff\1\u00b3\4\uffff\1\u00b4\2\uffff\1\u00b1\1\u00b3"+
			"\7\uffff\1\u00b3\1\u00ab\1\u00b3\1\u00b4\1\u00ac\1\u00b3\6\uffff\1\u00b3"+
			"\1\u00b4\1\u00b3\2\uffff\2\u00b3\1\uffff\2\u00b3\2\uffff\1\u00b3\2\uffff"+
			"\2\u00b3\2\uffff\1\u00b4\2\uffff\1\u00b3\1\uffff\4\u00b3\1\uffff\2\u00b3"+
			"\2\uffff\1\u00b3\4\uffff\1\u00b3\1\u00b0\1\u00ad\1\uffff\1\u00b4\2\uffff"+
			"\1\u00a9\2\u00b3",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u0098\22\uffff\1\u00b6",
			"\1\u0098\22\uffff\1\u00b7",
			"\1\u0098\22\uffff\1\u00b8",
			"\1\u0098\22\uffff\1\u00b9",
			"\1\u0098\22\uffff\1\u00ba",
			"\1\u0098\22\uffff\1\u00bb",
			"\1\u0098\22\uffff\1\u00bc",
			"\1\u0098\22\uffff\1\u00bd",
			"\1\u0098\22\uffff\1\u00be",
			"\1\u0098\22\uffff\1\u00bf",
			"\1\u0098\22\uffff\1\u00c0",
			"\1\u0098\22\uffff\1\u00c1",
			"\1\u0098\22\uffff\1\u00c2",
			"\1\u0098\22\uffff\1\u00c3",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA124_eot = DFA.unpackEncodedString(DFA124_eotS);
	static final short[] DFA124_eof = DFA.unpackEncodedString(DFA124_eofS);
	static final char[] DFA124_min = DFA.unpackEncodedStringToUnsignedChars(DFA124_minS);
	static final char[] DFA124_max = DFA.unpackEncodedStringToUnsignedChars(DFA124_maxS);
	static final short[] DFA124_accept = DFA.unpackEncodedString(DFA124_acceptS);
	static final short[] DFA124_special = DFA.unpackEncodedString(DFA124_specialS);
	static final short[][] DFA124_transition;

	static {
		int numStates = DFA124_transitionS.length;
		DFA124_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA124_transition[i] = DFA.unpackEncodedString(DFA124_transitionS[i]);
		}
	}

	protected class DFA124 extends DFA {

		public DFA124(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 124;
			this.eot = DFA124_eot;
			this.eof = DFA124_eof;
			this.min = DFA124_min;
			this.max = DFA124_max;
			this.accept = DFA124_accept;
			this.special = DFA124_special;
			this.transition = DFA124_transition;
		}
		@Override
		public String getDescription() {
			return "873:2: ( ( 'class' SQUOTE packageidentifier SQUOTE DOT 'static' DOT ) | ( ( IDENTIFIER DOT )+ ) )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA124_112 = input.LA(1);
						 
						int index124_112 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_112);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA124_88 = input.LA(1);
						 
						int index124_88 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_88);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA124_87 = input.LA(1);
						 
						int index124_87 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_87);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA124_86 = input.LA(1);
						 
						int index124_86 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_86);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA124_85 = input.LA(1);
						 
						int index124_85 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_85);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA124_84 = input.LA(1);
						 
						int index124_84 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_84);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA124_83 = input.LA(1);
						 
						int index124_83 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_83);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA124_82 = input.LA(1);
						 
						int index124_82 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_82);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA124_81 = input.LA(1);
						 
						int index124_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_81);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA124_80 = input.LA(1);
						 
						int index124_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_80);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA124_79 = input.LA(1);
						 
						int index124_79 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_79);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA124_78 = input.LA(1);
						 
						int index124_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_78);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA124_77 = input.LA(1);
						 
						int index124_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_77);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA124_76 = input.LA(1);
						 
						int index124_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_76);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA124_75 = input.LA(1);
						 
						int index124_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_75);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA124_74 = input.LA(1);
						 
						int index124_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_74);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA124_122 = input.LA(1);
						 
						int index124_122 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_122);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA124_123 = input.LA(1);
						 
						int index124_123 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_123);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA124_124 = input.LA(1);
						 
						int index124_124 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_124);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA124_125 = input.LA(1);
						 
						int index124_125 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_125);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA124_126 = input.LA(1);
						 
						int index124_126 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_126);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA124_127 = input.LA(1);
						 
						int index124_127 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_127);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA124_128 = input.LA(1);
						 
						int index124_128 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_128);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA124_129 = input.LA(1);
						 
						int index124_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_129);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA124_130 = input.LA(1);
						 
						int index124_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_130);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA124_131 = input.LA(1);
						 
						int index124_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_131);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA124_132 = input.LA(1);
						 
						int index124_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_132);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA124_133 = input.LA(1);
						 
						int index124_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_133);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA124_134 = input.LA(1);
						 
						int index124_134 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_134);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA124_135 = input.LA(1);
						 
						int index124_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_135);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA124_34 = input.LA(1);
						 
						int index124_34 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_34);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA124_27 = input.LA(1);
						 
						int index124_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_27);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA124_108 = input.LA(1);
						 
						int index124_108 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_108);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA124_30 = input.LA(1);
						 
						int index124_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_30);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA124_25 = input.LA(1);
						 
						int index124_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_25);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA124_117 = input.LA(1);
						 
						int index124_117 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_117);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA124_107 = input.LA(1);
						 
						int index124_107 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_107);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA124_24 = input.LA(1);
						 
						int index124_24 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_24);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA124_106 = input.LA(1);
						 
						int index124_106 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_106);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA124_113 = input.LA(1);
						 
						int index124_113 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_113);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA124_119 = input.LA(1);
						 
						int index124_119 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_119);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA124_36 = input.LA(1);
						 
						int index124_36 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_36);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA124_23 = input.LA(1);
						 
						int index124_23 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_23);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA124_110 = input.LA(1);
						 
						int index124_110 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_110);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA124_26 = input.LA(1);
						 
						int index124_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_26);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA124_35 = input.LA(1);
						 
						int index124_35 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_35);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA124_28 = input.LA(1);
						 
						int index124_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_28);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA124_33 = input.LA(1);
						 
						int index124_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_33);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA124_118 = input.LA(1);
						 
						int index124_118 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_118);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA124_111 = input.LA(1);
						 
						int index124_111 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_111);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA124_109 = input.LA(1);
						 
						int index124_109 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_109);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA124_120 = input.LA(1);
						 
						int index124_120 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_120);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA124_37 = input.LA(1);
						 
						int index124_37 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_37);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA124_29 = input.LA(1);
						 
						int index124_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_29);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA124_105 = input.LA(1);
						 
						int index124_105 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_105);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA124_116 = input.LA(1);
						 
						int index124_116 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_116);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA124_195 = input.LA(1);
						 
						int index124_195 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_195);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA124_194 = input.LA(1);
						 
						int index124_194 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_194);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA124_193 = input.LA(1);
						 
						int index124_193 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_193);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA124_192 = input.LA(1);
						 
						int index124_192 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_192);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA124_153 = input.LA(1);
						 
						int index124_153 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_153);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA124_154 = input.LA(1);
						 
						int index124_154 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_154);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA124_155 = input.LA(1);
						 
						int index124_155 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_155);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA124_156 = input.LA(1);
						 
						int index124_156 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_156);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA124_157 = input.LA(1);
						 
						int index124_157 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_157);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA124_158 = input.LA(1);
						 
						int index124_158 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_158);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA124_159 = input.LA(1);
						 
						int index124_159 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_159);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA124_160 = input.LA(1);
						 
						int index124_160 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_160);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA124_161 = input.LA(1);
						 
						int index124_161 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_161);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA124_162 = input.LA(1);
						 
						int index124_162 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_162);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA124_163 = input.LA(1);
						 
						int index124_163 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_163);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA124_164 = input.LA(1);
						 
						int index124_164 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_164);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA124_165 = input.LA(1);
						 
						int index124_165 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_165);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA124_166 = input.LA(1);
						 
						int index124_166 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_166);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA124_167 = input.LA(1);
						 
						int index124_167 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_167);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA124_182 = input.LA(1);
						 
						int index124_182 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_182);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA124_183 = input.LA(1);
						 
						int index124_183 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_183);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA124_184 = input.LA(1);
						 
						int index124_184 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_184);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA124_185 = input.LA(1);
						 
						int index124_185 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_185);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA124_186 = input.LA(1);
						 
						int index124_186 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_186);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA124_187 = input.LA(1);
						 
						int index124_187 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_187);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA124_188 = input.LA(1);
						 
						int index124_188 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_188);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA124_189 = input.LA(1);
						 
						int index124_189 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_189);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA124_190 = input.LA(1);
						 
						int index124_190 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_190);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA124_191 = input.LA(1);
						 
						int index124_191 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_191);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA124_32 = input.LA(1);
						 
						int index124_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_32);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA124_114 = input.LA(1);
						 
						int index124_114 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_114);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA124_115 = input.LA(1);
						 
						int index124_115 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred187_UnrealScript()) ) {s = 104;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_115);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA124_31 = input.LA(1);
						 
						int index124_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_31);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA124_22 = input.LA(1);
						 
						int index124_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred189_UnrealScript()) ) {s = 21;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index124_22);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 124, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA123_eotS =
		"\122\uffff";
	static final String DFA123_eofS =
		"\122\uffff";
	static final String DFA123_minS =
		"\1\21\1\uffff\1\12\1\21\1\uffff\20\0\2\21\16\12\1\35\1\21\17\0\16\12\16"+
		"\0";
	static final String DFA123_maxS =
		"\1\u00b9\1\uffff\1\35\1\u00b9\1\uffff\20\0\2\u00b9\17\35\1\u00b9\17\0"+
		"\16\35\16\0";
	static final String DFA123_acceptS =
		"\1\uffff\1\2\2\uffff\1\1\115\uffff";
	static final String DFA123_specialS =
		"\5\uffff\1\0\1\10\1\12\1\5\1\54\1\3\1\7\1\52\1\53\1\50\1\11\1\4\1\6\1"+
		"\1\1\2\1\51\22\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\36"+
		"\1\35\1\34\1\33\1\32\1\31\16\uffff\1\30\1\27\1\26\1\25\1\24\1\23\1\22"+
		"\1\21\1\20\1\17\1\16\1\15\1\14\1\13}>";
	static final String[] DFA123_transitionS = {
			"\1\2\61\uffff\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\2\1\1\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\6\1\1\uffff"+
			"\3\1\1\uffff\2\1\1\uffff\1\1\4\uffff\1\1\2\uffff\2\1\7\uffff\6\1\6\uffff"+
			"\3\1\2\uffff\2\1\1\uffff\2\1\2\uffff\1\1\2\uffff\2\1\2\uffff\1\1\2\uffff"+
			"\6\1\1\uffff\2\1\2\uffff\1\1\4\uffff\3\1\1\uffff\2\1\1\uffff\3\1",
			"",
			"\1\3\12\uffff\3\1\5\uffff\1\1",
			"\1\5\61\uffff\1\4\1\uffff\1\22\1\4\2\uffff\1\10\1\23\1\uffff\1\23\1"+
			"\uffff\1\6\1\uffff\1\24\1\22\1\uffff\2\22\1\uffff\2\22\1\15\1\uffff\1"+
			"\21\1\uffff\1\22\2\uffff\6\22\1\uffff\3\22\1\uffff\1\25\1\16\1\uffff"+
			"\1\22\4\uffff\1\23\2\uffff\1\20\1\22\7\uffff\1\22\1\11\1\22\1\23\1\13"+
			"\1\22\6\uffff\1\22\1\23\1\22\2\uffff\2\22\1\uffff\2\22\2\uffff\1\22\2"+
			"\uffff\2\22\2\uffff\1\23\2\uffff\1\22\1\12\4\22\1\uffff\2\22\2\uffff"+
			"\1\22\4\uffff\1\22\1\17\1\14\1\uffff\1\23\1\4\1\uffff\1\7\2\22",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\4\13\uffff\1\26\47\uffff\1\4\3\uffff\2\4\1\uffff\1\4\1\uffff\1\4"+
			"\1\uffff\2\4\1\uffff\2\4\1\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\uffff"+
			"\6\4\1\uffff\3\4\2\uffff\1\4\1\uffff\1\4\4\uffff\1\4\2\uffff\2\4\7\uffff"+
			"\6\4\6\uffff\3\4\2\uffff\2\4\1\uffff\2\4\2\uffff\1\4\2\uffff\2\4\2\uffff"+
			"\1\4\2\uffff\1\4\1\uffff\4\4\1\uffff\2\4\2\uffff\1\4\4\uffff\3\4\1\uffff"+
			"\1\4\2\uffff\3\4",
			"\1\27\63\uffff\1\42\3\uffff\1\31\1\43\1\uffff\1\43\1\uffff\1\43\1\uffff"+
			"\1\44\1\42\1\uffff\2\42\1\uffff\2\42\1\35\1\uffff\1\41\1\uffff\1\42\2"+
			"\uffff\6\42\1\uffff\3\42\2\uffff\1\36\1\uffff\1\42\4\uffff\1\43\2\uffff"+
			"\1\40\1\42\7\uffff\1\42\1\32\1\42\1\43\1\33\1\42\6\uffff\1\42\1\43\1"+
			"\42\2\uffff\2\42\1\uffff\2\42\2\uffff\1\42\2\uffff\2\42\2\uffff\1\43"+
			"\2\uffff\1\42\1\45\4\42\1\uffff\2\42\2\uffff\1\42\4\uffff\1\42\1\37\1"+
			"\34\1\uffff\1\43\2\uffff\1\30\2\42",
			"\1\46\22\uffff\1\47",
			"\1\46\22\uffff\1\50",
			"\1\46\22\uffff\1\51",
			"\1\46\22\uffff\1\52",
			"\1\46\22\uffff\1\53",
			"\1\46\22\uffff\1\54",
			"\1\46\22\uffff\1\55",
			"\1\46\22\uffff\1\56",
			"\1\46\22\uffff\1\57",
			"\1\46\22\uffff\1\60",
			"\1\46\22\uffff\1\61",
			"\1\46\22\uffff\1\62",
			"\1\46\22\uffff\1\63",
			"\1\46\22\uffff\1\64",
			"\1\65",
			"\1\66\63\uffff\1\101\3\uffff\1\70\1\102\1\uffff\1\102\1\uffff\1\102"+
			"\1\uffff\1\103\1\101\1\uffff\2\101\1\uffff\2\101\1\74\1\uffff\1\100\1"+
			"\uffff\1\101\2\uffff\6\101\1\uffff\3\101\2\uffff\1\75\1\uffff\1\101\4"+
			"\uffff\1\102\2\uffff\1\77\1\101\7\uffff\1\101\1\71\1\101\1\102\1\72\1"+
			"\101\6\uffff\1\101\1\102\1\101\2\uffff\2\101\1\uffff\2\101\2\uffff\1"+
			"\101\2\uffff\2\101\2\uffff\1\102\2\uffff\1\101\1\uffff\4\101\1\uffff"+
			"\2\101\2\uffff\1\101\4\uffff\1\101\1\76\1\73\1\uffff\1\102\2\uffff\1"+
			"\67\2\101",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\46\22\uffff\1\104",
			"\1\46\22\uffff\1\105",
			"\1\46\22\uffff\1\106",
			"\1\46\22\uffff\1\107",
			"\1\46\22\uffff\1\110",
			"\1\46\22\uffff\1\111",
			"\1\46\22\uffff\1\112",
			"\1\46\22\uffff\1\113",
			"\1\46\22\uffff\1\114",
			"\1\46\22\uffff\1\115",
			"\1\46\22\uffff\1\116",
			"\1\46\22\uffff\1\117",
			"\1\46\22\uffff\1\120",
			"\1\46\22\uffff\1\121",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA123_eot = DFA.unpackEncodedString(DFA123_eotS);
	static final short[] DFA123_eof = DFA.unpackEncodedString(DFA123_eofS);
	static final char[] DFA123_min = DFA.unpackEncodedStringToUnsignedChars(DFA123_minS);
	static final char[] DFA123_max = DFA.unpackEncodedStringToUnsignedChars(DFA123_maxS);
	static final short[] DFA123_accept = DFA.unpackEncodedString(DFA123_acceptS);
	static final short[] DFA123_special = DFA.unpackEncodedString(DFA123_specialS);
	static final short[][] DFA123_transition;

	static {
		int numStates = DFA123_transitionS.length;
		DFA123_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA123_transition[i] = DFA.unpackEncodedString(DFA123_transitionS[i]);
		}
	}

	protected class DFA123 extends DFA {

		public DFA123(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 123;
			this.eot = DFA123_eot;
			this.eof = DFA123_eof;
			this.min = DFA123_min;
			this.max = DFA123_max;
			this.accept = DFA123_accept;
			this.special = DFA123_special;
			this.transition = DFA123_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 875:7: ( IDENTIFIER DOT )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA123_5 = input.LA(1);
						 
						int index123_5 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_5);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA123_18 = input.LA(1);
						 
						int index123_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_18);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA123_19 = input.LA(1);
						 
						int index123_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_19);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA123_10 = input.LA(1);
						 
						int index123_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_10);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA123_16 = input.LA(1);
						 
						int index123_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_16);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA123_8 = input.LA(1);
						 
						int index123_8 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_8);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA123_17 = input.LA(1);
						 
						int index123_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_17);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA123_11 = input.LA(1);
						 
						int index123_11 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_11);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA123_6 = input.LA(1);
						 
						int index123_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_6);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA123_15 = input.LA(1);
						 
						int index123_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_15);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA123_7 = input.LA(1);
						 
						int index123_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_7);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA123_81 = input.LA(1);
						 
						int index123_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_81);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA123_80 = input.LA(1);
						 
						int index123_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_80);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA123_79 = input.LA(1);
						 
						int index123_79 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_79);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA123_78 = input.LA(1);
						 
						int index123_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_78);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA123_77 = input.LA(1);
						 
						int index123_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_77);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA123_76 = input.LA(1);
						 
						int index123_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_76);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA123_75 = input.LA(1);
						 
						int index123_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_75);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA123_74 = input.LA(1);
						 
						int index123_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_74);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA123_73 = input.LA(1);
						 
						int index123_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_73);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA123_72 = input.LA(1);
						 
						int index123_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_72);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA123_71 = input.LA(1);
						 
						int index123_71 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_71);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA123_70 = input.LA(1);
						 
						int index123_70 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_70);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA123_69 = input.LA(1);
						 
						int index123_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_69);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA123_68 = input.LA(1);
						 
						int index123_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_68);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA123_53 = input.LA(1);
						 
						int index123_53 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_53);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA123_52 = input.LA(1);
						 
						int index123_52 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_52);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA123_51 = input.LA(1);
						 
						int index123_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_51);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA123_50 = input.LA(1);
						 
						int index123_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_50);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA123_49 = input.LA(1);
						 
						int index123_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_49);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA123_48 = input.LA(1);
						 
						int index123_48 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_48);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA123_39 = input.LA(1);
						 
						int index123_39 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_39);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA123_40 = input.LA(1);
						 
						int index123_40 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_40);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA123_41 = input.LA(1);
						 
						int index123_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_41);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA123_42 = input.LA(1);
						 
						int index123_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_42);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA123_43 = input.LA(1);
						 
						int index123_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_43);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA123_44 = input.LA(1);
						 
						int index123_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_44);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA123_45 = input.LA(1);
						 
						int index123_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_45);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA123_46 = input.LA(1);
						 
						int index123_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_46);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA123_47 = input.LA(1);
						 
						int index123_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_47);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA123_14 = input.LA(1);
						 
						int index123_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_14);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA123_20 = input.LA(1);
						 
						int index123_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_20);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA123_12 = input.LA(1);
						 
						int index123_12 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_12);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA123_13 = input.LA(1);
						 
						int index123_13 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_13);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA123_9 = input.LA(1);
						 
						int index123_9 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred188_UnrealScript()) ) {s = 4;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index123_9);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 123, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_classdecl_in_prog62 = new BitSet(new long[]{0x0000000000000002L,0x00221C0006130200L,0x6926D075C10311F0L});
	public static final BitSet FOLLOW_declerations_in_prog66 = new BitSet(new long[]{0x0000000000000002L,0x00221C0006130200L,0x6926D075C10311F0L});
	public static final BitSet FOLLOW_replicationblock_in_prog73 = new BitSet(new long[]{0x0000000000000002L,0x0022180006030200L,0x4906D035C10311F0L});
	public static final BitSet FOLLOW_body_in_prog80 = new BitSet(new long[]{0x0000000000000002L,0x0022180006030200L,0x4906D035C10311F0L});
	public static final BitSet FOLLOW_defaultpropertiesblock_in_prog87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_defaultpropertiesblock105 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LCBRACK_in_defaultpropertiesblock107 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RCBRACK_in_defaultpropertiesblock118 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_defaultpropertiesblock120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_182_in_structdefaultpropertiesblock136 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LCBRACK_in_structdefaultpropertiesblock138 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RCBRACK_in_structdefaultpropertiesblock149 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_structdefaultpropertiesblock151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_classdecl167 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_classdecl189 = new BitSet(new long[]{0x0000000010020040L,0xF0E4E9FFDDDFD630L,0x03972DBD3EFDBC0FL,0x0000000000000001L});
	public static final BitSet FOLLOW_111_in_classdecl197 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_packageidentifier_in_classdecl205 = new BitSet(new long[]{0x0000000010020040L,0xF0E469FFDDDFD630L,0x03972DBD3EFDBC0FL,0x0000000000000001L});
	public static final BitSet FOLLOW_COMMA_in_classdecl292 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_packageidentifier_in_classdecl298 = new BitSet(new long[]{0x0000000010020040L,0xF0E469FFDDDFD630L,0x03972DBD3EFDBC0FL,0x0000000000000001L});
	public static final BitSet FOLLOW_classparams_in_classdecl429 = new BitSet(new long[]{0x0000000010020000L,0xF0E469FFDDDFD630L,0x03972DBD3EFDBC0FL,0x0000000000000001L});
	public static final BitSet FOLLOW_SEMICOLON_in_classdecl434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constclassparams_in_classparams603 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_LBRACK_in_classparams610 = new BitSet(new long[]{0xFFFFFFFFFFDFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RBRACK_in_classparams649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_192_in_classparams658 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_packageidentifier_in_classparams660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_classparams698 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACK_in_classparams700 = new BitSet(new long[]{0xFFFFFFFFFFDFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RBRACK_in_classparams732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_classparams737 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_LBRACK_in_classparams744 = new BitSet(new long[]{0xFFFFFFFFFFDFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RBRACK_in_classparams783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_119_in_classparams792 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACK_in_classparams794 = new BitSet(new long[]{0xFFFFFFFFFFDFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RBRACK_in_classparams826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_173_in_classparams831 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACK_in_classparams833 = new BitSet(new long[]{0xFFFFFFFFFFDFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RBRACK_in_classparams865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fixedidentifier_in_classparams870 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_LBRACK_in_classparams877 = new BitSet(new long[]{0xFFFFFFFFFFDFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RBRACK_in_classparams916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fixedidentifier_in_identifierlist933 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_identifierlist937 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_identifierlist939 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_fixedidentifier_in_packageidentifier955 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_DOT_in_packageidentifier959 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_packageidentifier961 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_161_in_packageidentifier969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_189_in_vardecl983 = new BitSet(new long[]{0x0000000000220000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_configgroup_in_vardecl987 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_varparams_in_vardecl994 = new BitSet(new long[]{0x0000000000420000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_LCBRACK_in_vardecl998 = new BitSet(new long[]{0x0000000000000000L,0xC04021DF90DA0020L,0x030109BD064D9409L});
	public static final BitSet FOLLOW_varparams_in_vardecl1000 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCBRACK_in_vardecl1002 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_vartype_in_vardecl1010 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_varidentifier_in_vardecl1016 = new BitSet(new long[]{0x0000000010000040L});
	public static final BitSet FOLLOW_COMMA_in_vardecl1125 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_varidentifier_in_vardecl1131 = new BitSet(new long[]{0x0000000010000040L});
	public static final BitSet FOLLOW_SEMICOLON_in_vardecl1171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classtype_in_vartype1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_packageidentifier_in_vartype1212 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_LCBRACK_in_vartype1219 = new BitSet(new long[]{0xFFFFFFFFFFBFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RCBRACK_in_vartype1258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumdecl_in_vartype1273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_structdecl_in_vartype1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arraydecl_in_vartype1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basictype_in_vartype1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_delegatedecl_in_vartype1357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fixedidentifier_in_varidentifier1402 = new BitSet(new long[]{0x0000000000D00002L});
	public static final BitSet FOLLOW_LSBRACK_in_varidentifier1409 = new BitSet(new long[]{0x00000000000A0000L,0xC0642DDF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_INTVAL_in_varidentifier1418 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_varidentifier1425 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RSBRACK_in_varidentifier1433 = new BitSet(new long[]{0x0000000000500002L});
	public static final BitSet FOLLOW_LCBRACK_in_varidentifier1457 = new BitSet(new long[]{0xFFFFFFFFFFBFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RCBRACK_in_varidentifier1496 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_LABRACK_in_varidentifier1507 = new BitSet(new long[]{0xFFFFFFFFFFEFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RABRACK_in_varidentifier1546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varfixid_in_varidentifier1567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_configgroup1635 = new BitSet(new long[]{0x0000000002020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_configgroup1639 = new BitSet(new long[]{0x0000000002000040L});
	public static final BitSet FOLLOW_COMMA_in_configgroup1643 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_configgroup1645 = new BitSet(new long[]{0x0000000002000040L});
	public static final BitSet FOLLOW_RBRACK_in_configgroup1653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardecl_in_declerations1666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constdecl_in_declerations1677 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_enumdecl_in_declerations1683 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_structdecl_in_declerations1689 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declerations1695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_constdecl1708 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_constdecl1710 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_EQUALS_in_constdecl1712 = new BitSet(new long[]{0x0002000060084000L,0x0001000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_constvalue_in_constdecl1714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_constvalue1777 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_FLOATVAL_in_constvalue1780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringval_in_constvalue1786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_constvalue1792 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INTVAL_in_constvalue1795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolval_in_constvalue1801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nameval_in_constvalue1807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_enumdecl1827 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_enumdecl1829 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LCBRACK_in_enumdecl1831 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_enumoptions_in_enumdecl1833 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCBRACK_in_enumdecl1836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_181_in_structdecl1932 = new BitSet(new long[]{0x0000000000420000L,0xCC6429DF95DB57A0L,0x039F09BD264D9C0FL});
	public static final BitSet FOLLOW_structparams_in_structdecl1936 = new BitSet(new long[]{0x0000000000420000L,0xCC6429DF95DB57A0L,0x039F09BD264D9C0FL});
	public static final BitSet FOLLOW_LCBRACK_in_structdecl1946 = new BitSet(new long[]{0xFFFFFFFFFFBFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RCBRACK_in_structdecl1985 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_structdecl1992 = new BitSet(new long[]{0x0000000000400000L,0x0000800000000000L});
	public static final BitSet FOLLOW_111_in_structdecl2017 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_packageidentifier_in_structdecl2019 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LCBRACK_in_structdecl2024 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_structbody_in_structdecl2026 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCBRACK_in_structdecl2030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fixedidentifier_in_enumoptions2129 = new BitSet(new long[]{0x0000000000100042L});
	public static final BitSet FOLLOW_displayoption_in_enumoptions2131 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_enumoptions2177 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_enumoptions2183 = new BitSet(new long[]{0x0000000000100042L});
	public static final BitSet FOLLOW_displayoption_in_enumoptions2185 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_enumoptions2239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LABRACK_in_displayoption2253 = new BitSet(new long[]{0xFFFFFFFFFFEFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RABRACK_in_displayoption2285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardecl_in_structbody2349 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2040000000000000L});
	public static final BitSet FOLLOW_structdefaultpropertiesblock_in_structbody2355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_arraydecl2373 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LABRACK_in_arraydecl2375 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_varparams_in_arraydecl2379 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_vartype_in_arraydecl2382 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_RABRACK_in_arraydecl2386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_delegatedecl2450 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LABRACK_in_delegatedecl2452 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_varparams_in_delegatedecl2456 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_vartype_in_delegatedecl2459 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_RABRACK_in_delegatedecl2463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_classtype2476 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LABRACK_in_classtype2478 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_varparams_in_classtype2482 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_vartype_in_classtype2485 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_RABRACK_in_classtype2489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifierident_1_in_qualifiedidentifier2506 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_DOT_in_qualifiedidentifier2510 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_qualifierident_1_in_qualifiedidentifier2512 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_set_in_qualifierident_12537 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SQUOTE_in_qualifierident_12577 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_packageidentifier_in_qualifierident_12579 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SQUOTE_in_qualifierident_12581 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_fixedidentifier_in_qualifierident_12597 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_defaultidentifier_in_qualifierident_12605 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_78_in_qualifierident_12611 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_161_in_qualifierident_12617 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_LSBRACK_in_qualifierident_12625 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_qualifierident_12627 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RSBRACK_in_qualifierident_12629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_defaultidentifier2645 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DOT_in_defaultidentifier2647 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_qualifiedidentifier_in_defaultidentifier2649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_166_in_replicationblock2662 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LCBRACK_in_replicationblock2664 = new BitSet(new long[]{0x0000000004000000L,0x0100000000000000L,0x0800002000000000L});
	public static final BitSet FOLLOW_replicationbody_in_replicationblock2668 = new BitSet(new long[]{0x0000000004000000L,0x0100000000000000L,0x0800002000000000L});
	public static final BitSet FOLLOW_RCBRACK_in_replicationblock2673 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_replicationblock2675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_120_in_replicationbody2706 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACK_in_replicationbody2708 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_replicationbody2710 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACK_in_replicationbody2712 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_replicationbody2714 = new BitSet(new long[]{0x0000000010000040L});
	public static final BitSet FOLLOW_COMMA_in_replicationbody2718 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_replicationbody2720 = new BitSet(new long[]{0x0000000010000040L});
	public static final BitSet FOLLOW_SEMICOLON_in_replicationbody2725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_139_in_functinoargs2761 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_functinoargs2763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codelabel_in_codeline2776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codelinenolabel_in_codeline2781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_codelinenolabel2798 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_assignment_in_codelinenolabel2804 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_unaryexpr_in_codelinenolabel2812 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_codelinenolabel2814 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ifthenelse_in_codelinenolabel2822 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_whileloop_in_codelinenolabel2828 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_doloop_in_codelinenolabel2834 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_switchcase_in_codelinenolabel2840 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_returnfunc_in_codelinenolabel2846 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_foreachloop_in_codelinenolabel2852 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_forloop_in_codelinenolabel2858 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_breakfunc_in_codelinenolabel2864 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_continuefunc_in_codelinenolabel2870 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_codelinenolabel2876 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_statedecl_in_body2892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functiondecl_in_body2897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stateparams_in_statedecl2915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0002400000000000L});
	public static final BitSet FOLLOW_177_in_statedecl2920 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_statedecl2922 = new BitSet(new long[]{0x0000000000400000L,0x0000800000000000L});
	public static final BitSet FOLLOW_111_in_statedecl2926 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_statedecl2928 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_statebody_in_statedecl2933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCBRACK_in_statebody2946 = new BitSet(new long[]{0x0000000004020000L,0x0222180004030000L,0x4904D035C10311F0L});
	public static final BitSet FOLLOW_stateignore_in_statebody2950 = new BitSet(new long[]{0x0000000004020000L,0x0022180004030000L,0x4904D035C10311F0L});
	public static final BitSet FOLLOW_functiondecl_in_statebody2957 = new BitSet(new long[]{0x0000000004020000L,0x0022180004030000L,0x4904D035C10311F0L});
	public static final BitSet FOLLOW_statelabels_in_statebody2962 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCBRACK_in_statebody2964 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_statebody2966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_121_in_stateignore2980 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_stateignore2982 = new BitSet(new long[]{0x0000000010000040L});
	public static final BitSet FOLLOW_COMMA_in_stateignore2986 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_stateignore2988 = new BitSet(new long[]{0x0000000010000040L});
	public static final BitSet FOLLOW_SEMICOLON_in_stateignore2993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codelabel_in_statelabels3008 = new BitSet(new long[]{0x00068000602A4002L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_codelinenolabel_in_statelabels3012 = new BitSet(new long[]{0x00068000602A4002L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_normalfunc_in_functiondecl3039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operatorfunc_in_functiondecl3045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionparams_in_normalfunc3068 = new BitSet(new long[]{0x0000000000000000L,0x0022180004030000L,0x4904D035000311F0L});
	public static final BitSet FOLLOW_functiontype_in_normalfunc3073 = new BitSet(new long[]{0x0000000000020000L,0xC0663DDF95DB5660L,0x4BB7D9BF264F9DFFL});
	public static final BitSet FOLLOW_functionparams_in_normalfunc3077 = new BitSet(new long[]{0x0000000000020000L,0xC0663DDF95DB5660L,0x4BB7D9BF264F9DFFL});
	public static final BitSet FOLLOW_vartype_in_normalfunc3084 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_normalfunc3160 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_funcargsblock_in_normalfunc3166 = new BitSet(new long[]{0x0000000010400002L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_normalfunc3169 = new BitSet(new long[]{0x0000000010400002L});
	public static final BitSet FOLLOW_LCBRACK_in_normalfunc3178 = new BitSet(new long[]{0x00068000642A4000L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDE0FL});
	public static final BitSet FOLLOW_functionbody_in_normalfunc3180 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCBRACK_in_normalfunc3187 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_normalfunc3192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_funcargsblock3415 = new BitSet(new long[]{0x0000000002020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_functionargs_in_funcargsblock3419 = new BitSet(new long[]{0x0000000002000040L});
	public static final BitSet FOLLOW_COMMA_in_funcargsblock3424 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_functionargs_in_funcargsblock3426 = new BitSet(new long[]{0x0000000002000040L});
	public static final BitSet FOLLOW_RBRACK_in_funcargsblock3435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constfunctparams_in_functionparams3448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_140_in_functionparams3453 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_LBRACK_in_functionparams3457 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INTVAL_in_functionparams3459 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACK_in_functionparams3461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionparams_in_operatorfunc3484 = new BitSet(new long[]{0x0000000000000000L,0x0002100000030000L,0x4904D035C10311F0L});
	public static final BitSet FOLLOW_operatortype_in_operatorfunc3489 = new BitSet(new long[]{0x0000000010400002L});
	public static final BitSet FOLLOW_LCBRACK_in_operatorfunc3494 = new BitSet(new long[]{0x00068000642A4000L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDE0FL});
	public static final BitSet FOLLOW_functionbody_in_operatorfunc3496 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCBRACK_in_operatorfunc3499 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_operatorfunc3504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryoperator_in_operatortype3523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryoperator_in_operatortype3530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_152_in_binaryoperator3549 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACK_in_binaryoperator3551 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INTVAL_in_binaryoperator3553 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACK_in_binaryoperator3555 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_vartype_in_binaryoperator3557 = new BitSet(new long[]{0xFFFFFFF801121020L,0xC06429DF95DB5627L,0x039709BD264D9C0FL,0x000000000000001EL});
	public static final BitSet FOLLOW_opidentifier_in_binaryoperator3559 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACK_in_binaryoperator3561 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_functionargs_in_binaryoperator3563 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_binaryoperator3566 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_functionargs_in_binaryoperator3568 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACK_in_binaryoperator3571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_unaryoperator3586 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_vartype_in_unaryoperator3602 = new BitSet(new long[]{0xFFFFFFF801121020L,0xC06429DF95DB5627L,0x039709BD264D9C0FL,0x000000000000001EL});
	public static final BitSet FOLLOW_opidentifier_in_unaryoperator3604 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACK_in_unaryoperator3606 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_functionargs_in_unaryoperator3608 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACK_in_unaryoperator3611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fixedidentifier_in_opidentifier3624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operatornames_in_opidentifier3629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vartype_in_functionargs3684 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_functionargs3686 = new BitSet(new long[]{0x0000000000801002L});
	public static final BitSet FOLLOW_LSBRACK_in_functionargs3693 = new BitSet(new long[]{0x00000000000A0000L,0xC0642DDF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_INTVAL_in_functionargs3702 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_functionargs3709 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RSBRACK_in_functionargs3717 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_EQUALS_in_functionargs3726 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_functionargs3728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localdecl_in_functionbody3768 = new BitSet(new long[]{0x00068000602A4002L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDE0FL});
	public static final BitSet FOLLOW_codeline_in_functionbody3776 = new BitSet(new long[]{0x00068000602A4002L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_137_in_localdecl3795 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5660L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_vartype_in_localdecl3797 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_varidentifier_in_localdecl3803 = new BitSet(new long[]{0x0000000010000042L});
	public static final BitSet FOLLOW_COMMA_in_localdecl3847 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_varidentifier_in_localdecl3853 = new BitSet(new long[]{0x0000000010000042L});
	public static final BitSet FOLLOW_SEMICOLON_in_localdecl3889 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_vartype_in_localtype3903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeline_in_codeblock3923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCBRACK_in_codeblock3931 = new BitSet(new long[]{0x00068000642A4000L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_codeline_in_codeblock3935 = new BitSet(new long[]{0x00068000642A4000L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_RCBRACK_in_codeblock3940 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_codeblock3942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcoperand_in_statement3963 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement3965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_assignment3982 = new BitSet(new long[]{0x8029208000001400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_assignment3988 = new BitSet(new long[]{0x8029208000001400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_DOT_in_assignment3998 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5668L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_funccall_in_assignment4007 = new BitSet(new long[]{0x8029208000001400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_assignment4014 = new BitSet(new long[]{0x8029208000001400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_EQUALS_in_assignment4029 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_assignop_in_assignment4035 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_assignment4041 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_assignment4043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_unaryexpr4056 = new BitSet(new long[]{0x0004800000000000L});
	public static final BitSet FOLLOW_unaryop_in_unaryexpr4058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryop_in_unaryexpr4063 = new BitSet(new long[]{0x00020000602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL});
	public static final BitSet FOLLOW_operand_in_unaryexpr4065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_120_in_ifthenelse4078 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACK_in_ifthenelse4080 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_ifthenelse4082 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACK_in_ifthenelse4084 = new BitSet(new long[]{0x00068000606A4000L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_codeblock_in_ifthenelse4086 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_ifthenelse4090 = new BitSet(new long[]{0x00068000606A4000L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_codeblock_in_ifthenelse4092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_191_in_whileloop4108 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACK_in_whileloop4110 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_whileloop4112 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACK_in_whileloop4114 = new BitSet(new long[]{0x00068000606A4000L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_codeblock_in_whileloop4116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_doloop4129 = new BitSet(new long[]{0x00068000606A4000L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_codeblock_in_doloop4131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_doloop4133 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACK_in_doloop4135 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_doloop4137 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACK_in_doloop4139 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_doloop4141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_switchcase4154 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACK_in_switchcase4156 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_switchcase4158 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACK_in_switchcase4160 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LCBRACK_in_switchcase4162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_caserule_in_switchcase4166 = new BitSet(new long[]{0x0000000004000000L,0x0000000001002000L});
	public static final BitSet FOLLOW_defaultrule_in_switchcase4173 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCBRACK_in_switchcase4178 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_switchcase4180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_caserule4194 = new BitSet(new long[]{0x00020000602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL});
	public static final BitSet FOLLOW_operand_in_caserule4196 = new BitSet(new long[]{0x00020000602A4020L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL});
	public static final BitSet FOLLOW_COLON_in_caserule4199 = new BitSet(new long[]{0x00068000606A4002L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_LCBRACK_in_caserule4206 = new BitSet(new long[]{0x00068000602A4000L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_codelinenolabel_in_caserule4208 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCBRACK_in_caserule4210 = new BitSet(new long[]{0x00068000606A4002L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_codelinenolabel_in_caserule4216 = new BitSet(new long[]{0x00068000606A4002L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_88_in_defaultrule4233 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_defaultrule4235 = new BitSet(new long[]{0x00068000606A4002L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_LCBRACK_in_defaultrule4242 = new BitSet(new long[]{0x00068000602A4000L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_codelinenolabel_in_defaultrule4244 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCBRACK_in_defaultrule4246 = new BitSet(new long[]{0x00068000606A4002L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_codelinenolabel_in_defaultrule4252 = new BitSet(new long[]{0x00068000606A4002L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_142_in_newoperator4269 = new BitSet(new long[]{0x00020000602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL});
	public static final BitSet FOLLOW_LBRACK_in_newoperator4273 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_newoperator4275 = new BitSet(new long[]{0x0000000002000040L});
	public static final BitSet FOLLOW_COMMA_in_newoperator4279 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_newoperator4281 = new BitSet(new long[]{0x0000000002000040L});
	public static final BitSet FOLLOW_RBRACK_in_newoperator4286 = new BitSet(new long[]{0x00020000602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL});
	public static final BitSet FOLLOW_operand_in_newoperator4291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_169_in_returnfunc4305 = new BitSet(new long[]{0x0006C008702A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_returnfunc4309 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_returnfunc4314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_breakfunc4327 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_breakfunc4329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_continuefunc4342 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_continuefunc4344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_116_in_foreachloop4357 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5668L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_funcoperand_in_foreachloop4359 = new BitSet(new long[]{0x00068000606A4000L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_codeblock_in_foreachloop4361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_115_in_forloop4374 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACK_in_forloop4376 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_forloop4378 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_forloop4380 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_forloop4382 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_forloop4384 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_forloop4386 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACK_in_forloop4388 = new BitSet(new long[]{0x00068000606A4000L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_codeblock_in_forloop4390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_funccall4409 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SQUOTE_in_funccall4411 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_packageidentifier_in_funccall4413 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SQUOTE_in_funccall4415 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DOT_in_funccall4417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_funccall4419 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DOT_in_funccall4421 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5668L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_IDENTIFIER_in_funccall4433 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DOT_in_funccall4435 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5668L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_funcnamecall_in_funccall4453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccastcall_in_funccall4459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_funcnamecall4477 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_qualifiedidentifier_in_funcnamecall4480 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_DOT_in_funcnamecall4484 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_qualifiedidentifier_in_funcnamecall4486 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_LBRACK_in_funcnamecall4491 = new BitSet(new long[]{0x0006C008622A4040L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_funcnamecall4495 = new BitSet(new long[]{0x0000000002000040L});
	public static final BitSet FOLLOW_COMMA_in_funcnamecall4500 = new BitSet(new long[]{0x0006C008622A4040L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_funcnamecall4502 = new BitSet(new long[]{0x0000000002000040L});
	public static final BitSet FOLLOW_RBRACK_in_funcnamecall4511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vartype_in_funccastcall4526 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACK_in_funccastcall4528 = new BitSet(new long[]{0x0006C008622A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_funccastcall4532 = new BitSet(new long[]{0x0000000002000040L});
	public static final BitSet FOLLOW_COMMA_in_funccastcall4536 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_funccastcall4538 = new BitSet(new long[]{0x0000000002000040L});
	public static final BitSet FOLLOW_RBRACK_in_funccastcall4546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_funcoperand4561 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_DOT_in_funcoperand4568 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5668L,0x03B709BF264D9C0FL});
	public static final BitSet FOLLOW_funccall_in_funcoperand4577 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_funcoperand4584 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_LBRACK_in_operand4605 = new BitSet(new long[]{0x00020000600A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL});
	public static final BitSet FOLLOW_operandinner_in_operand4607 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACK_in_operand4609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operandinner_in_operand4614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcoperand_in_operandinner4627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constvalue_in_operandinner4632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_operandinner4639 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_DOT_in_operandinner4643 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_qualifiedidentifier_in_operandinner4645 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_newoperator_in_operandinner4655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicpre_in_expr4672 = new BitSet(new long[]{0x00020000602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL});
	public static final BitSet FOLLOW_unaryop_in_expr4678 = new BitSet(new long[]{0x00020000602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL});
	public static final BitSet FOLLOW_46_in_expr4684 = new BitSet(new long[]{0x00020000602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL});
	public static final BitSet FOLLOW_49_in_expr4690 = new BitSet(new long[]{0x00020000602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL});
	public static final BitSet FOLLOW_bareexpr_in_expr4701 = new BitSet(new long[]{0x0004800000000002L});
	public static final BitSet FOLLOW_brackexpr_in_expr4707 = new BitSet(new long[]{0x0004800000000002L});
	public static final BitSet FOLLOW_unaryop_in_expr4715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_bareexpr4731 = new BitSet(new long[]{0xFFFFFFF801121022L,0xC06429DF95DB5627L,0x039709BD264D9C0FL,0x000000000000001EL});
	public static final BitSet FOLLOW_unaryop_in_bareexpr4735 = new BitSet(new long[]{0xFFFFFFF801121022L,0xC06429DF95DB5627L,0x039709BD264D9C0FL,0x000000000000001EL});
	public static final BitSet FOLLOW_opidentifier_in_bareexpr4742 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_bareexpr4744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_brackexpr4760 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_brackexpr4762 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACK_in_brackexpr4764 = new BitSet(new long[]{0xFFFFFFF801121022L,0xC06429DF95DB5627L,0x039709BD264D9C0FL,0x000000000000001EL});
	public static final BitSet FOLLOW_opidentifier_in_brackexpr4768 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_brackexpr4770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_codelabel4812 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_codelabel4814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGVAL_in_stringval4827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQUOTE_in_stringval4832 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_SQUOTE_in_stringval4858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_196_in_operatornames5723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_operatornames5728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_operatornames5733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_operatornames5738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_operatornames5743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_operatornames5748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_operatornames5753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_operatornames5758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_194_in_operatornames5763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_operatornames5768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_operatornames5773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_operatornames5778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_operatornames5783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_operatornames5788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_operatornames5793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_195_in_operatornames5798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_operatornames5803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_operatornames5808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_operatornames5813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_operatornames5818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_operatornames5823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_operatornames5828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_operatornames5833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_operatornames5838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_operatornames5843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_operatornames5848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_operatornames5853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_operatornames5858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_193_in_operatornames5863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_operatornames5868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_operatornames5873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LABRACK_in_operatornames5878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RABRACK_in_operatornames5883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_operatornames5888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_operatornames5893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignop_in_operatornames5898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryop_in_operatornames5903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQUOTE_in_nameval6052 = new BitSet(new long[]{0x0000000020020000L,0xC06429DF95DB5620L,0x039709BD264D9C0FL});
	public static final BitSet FOLLOW_fixedidentifier_in_nameval6056 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SQUOTE_in_nameval6061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_fixedidentifier6078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_fixedidentifier6083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_fixedidentifier6088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varparams_in_fixedidentifier6093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basictype_in_fixedidentifier6098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_178_in_fixedidentifier6103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_fixedidentifier6108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_fixedidentifier6113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_fixedidentifier6118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_117_in_fixedidentifier6123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_fixedidentifier6128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_127_in_fixedidentifier6133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_130_in_fixedidentifier6138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_fixedidentifier6143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constclassparams_in_synpred18_UnrealScript603 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_LBRACK_in_synpred18_UnrealScript610 = new BitSet(new long[]{0xFFFFFFFFFFDFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RBRACK_in_synpred18_UnrealScript649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_synpred26_UnrealScript737 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_LBRACK_in_synpred26_UnrealScript744 = new BitSet(new long[]{0xFFFFFFFFFFDFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RBRACK_in_synpred26_UnrealScript783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varparams_in_synpred41_UnrealScript994 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_LCBRACK_in_synpred41_UnrealScript998 = new BitSet(new long[]{0x0000000000000000L,0xC04021DF90DA0020L,0x030109BD064D9409L});
	public static final BitSet FOLLOW_varparams_in_synpred41_UnrealScript1000 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCBRACK_in_synpred41_UnrealScript1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_packageidentifier_in_synpred47_UnrealScript1212 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_LCBRACK_in_synpred47_UnrealScript1219 = new BitSet(new long[]{0xFFFFFFFFFFBFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RCBRACK_in_synpred47_UnrealScript1258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basictype_in_synpred51_UnrealScript1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fixedidentifier_in_synpred60_UnrealScript1402 = new BitSet(new long[]{0x0000000000D00002L});
	public static final BitSet FOLLOW_LSBRACK_in_synpred60_UnrealScript1409 = new BitSet(new long[]{0x00000000000A0000L,0xC0642DDF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_INTVAL_in_synpred60_UnrealScript1418 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_synpred60_UnrealScript1425 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RSBRACK_in_synpred60_UnrealScript1433 = new BitSet(new long[]{0x0000000000500002L});
	public static final BitSet FOLLOW_LCBRACK_in_synpred60_UnrealScript1457 = new BitSet(new long[]{0xFFFFFFFFFFBFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RCBRACK_in_synpred60_UnrealScript1496 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_LABRACK_in_synpred60_UnrealScript1507 = new BitSet(new long[]{0xFFFFFFFFFFEFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000000000000001FL});
	public static final BitSet FOLLOW_RABRACK_in_synpred60_UnrealScript1546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringval_in_synpred70_UnrealScript1786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_structparams_in_synpred74_UnrealScript1936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred98_UnrealScript2510 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_qualifierident_1_in_synpred98_UnrealScript2512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred102_UnrealScript2537 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SQUOTE_in_synpred102_UnrealScript2577 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_packageidentifier_in_synpred102_UnrealScript2579 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SQUOTE_in_synpred102_UnrealScript2581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fixedidentifier_in_synpred103_UnrealScript2597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_defaultidentifier_in_synpred104_UnrealScript2605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_synpred105_UnrealScript2611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSBRACK_in_synpred106_UnrealScript2625 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_synpred106_UnrealScript2627 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RSBRACK_in_synpred106_UnrealScript2629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_synpred116_UnrealScript2798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_synpred117_UnrealScript2804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryexpr_in_synpred118_UnrealScript2812 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_synpred118_UnrealScript2814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchcase_in_synpred122_UnrealScript2840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_synpred127_UnrealScript2876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionparams_in_synpred139_UnrealScript3077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_synpred169_UnrealScript3942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_synpred170_UnrealScript3982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_synpred171_UnrealScript4007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_synpred175_UnrealScript4090 = new BitSet(new long[]{0x00068000606A4000L,0xC17D2DDFB5FB5E68L,0x87B70BBF264DDC0FL});
	public static final BitSet FOLLOW_codeblock_in_synpred175_UnrealScript4092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_synpred178_UnrealScript4180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_synpred185_UnrealScript4273 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_synpred185_UnrealScript4275 = new BitSet(new long[]{0x0000000002000040L});
	public static final BitSet FOLLOW_COMMA_in_synpred185_UnrealScript4279 = new BitSet(new long[]{0x0006C008602A4000L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_synpred185_UnrealScript4281 = new BitSet(new long[]{0x0000000002000040L});
	public static final BitSet FOLLOW_RBRACK_in_synpred185_UnrealScript4286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_synpred187_UnrealScript4409 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SQUOTE_in_synpred187_UnrealScript4411 = new BitSet(new long[]{0x0000000000020000L,0xC06429DF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_packageidentifier_in_synpred187_UnrealScript4413 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SQUOTE_in_synpred187_UnrealScript4415 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DOT_in_synpred187_UnrealScript4417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_synpred187_UnrealScript4419 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DOT_in_synpred187_UnrealScript4421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred188_UnrealScript4433 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DOT_in_synpred188_UnrealScript4435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred189_UnrealScript4433 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DOT_in_synpred189_UnrealScript4435 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_funcnamecall_in_synpred190_UnrealScript4453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_synpred196_UnrealScript4495 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_synpred196_UnrealScript4500 = new BitSet(new long[]{0x0006C008602A4042L,0xC0652DDF95DB5668L,0x07B709BF264DDC0FL,0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_synpred196_UnrealScript4502 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_funccall_in_synpred199_UnrealScript4577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcoperand_in_synpred202_UnrealScript4627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_synpred205_UnrealScript4639 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_DOT_in_synpred205_UnrealScript4643 = new BitSet(new long[]{0x0000000000020000L,0xC0642DDF95DB5620L,0x039709BF264D9C0FL});
	public static final BitSet FOLLOW_qualifiedidentifier_in_synpred205_UnrealScript4645 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_49_in_synpred209_UnrealScript4690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bareexpr_in_synpred210_UnrealScript4701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryop_in_synpred211_UnrealScript4715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryop_in_synpred212_UnrealScript4735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_196_in_synpred309_UnrealScript5723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_synpred321_UnrealScript5783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_synpred323_UnrealScript5793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_synpred325_UnrealScript5803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_synpred333_UnrealScript5843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignop_in_synpred344_UnrealScript5898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varparams_in_synpred357_UnrealScript6093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basictype_in_synpred358_UnrealScript6098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_127_in_synpred365_UnrealScript6133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_130_in_synpred366_UnrealScript6138 = new BitSet(new long[]{0x0000000000000002L});
}
