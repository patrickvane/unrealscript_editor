// $ANTLR 3.5 C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g 2013-02-10 06:35:21

	package patrick_vane_unrealscript_editor.editors.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class UnrealScriptLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public UnrealScriptLexer() {} 
	public UnrealScriptLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public UnrealScriptLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g"; }

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:6:7: ( '!' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:6:9: '!'
			{
			match('!'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:7:7: ( '!=' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:7:9: '!='
			{
			match("!="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:8:7: ( '#' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:8:9: '#'
			{
			match('#'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:9:7: ( '$' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:9:9: '$'
			{
			match('$'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:10:7: ( '$=' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:10:9: '$='
			{
			match("$="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:11:7: ( '%' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:11:9: '%'
			{
			match('%'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:12:7: ( '&&' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:12:9: '&&'
			{
			match("&&"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:13:7: ( '&' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:13:9: '&'
			{
			match('&'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:14:7: ( '*' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:14:9: '*'
			{
			match('*'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:15:7: ( '**' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:15:9: '**'
			{
			match("**"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:16:7: ( '*=' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:16:9: '*='
			{
			match("*="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:17:7: ( '+' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:17:9: '+'
			{
			match('+'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:18:7: ( '++' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:18:9: '++'
			{
			match("++"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:19:7: ( '+=' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:19:9: '+='
			{
			match("+="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:20:7: ( '-' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:20:9: '-'
			{
			match('-'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:21:7: ( '--' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:21:9: '--'
			{
			match("--"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:22:7: ( '-=' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:22:9: '-='
			{
			match("-="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:23:7: ( '/' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:23:9: '/'
			{
			match('/'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:24:7: ( '/=' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:24:9: '/='
			{
			match("/="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:25:7: ( '<<' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:25:9: '<<'
			{
			match("<<"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:26:7: ( '<=' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:26:9: '<='
			{
			match("<="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:27:7: ( '==' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:27:9: '=='
			{
			match("=="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:28:7: ( '>=' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:28:9: '>='
			{
			match(">="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:29:7: ( '>>' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:29:9: '>>'
			{
			match(">>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:30:7: ( '>>>' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:30:9: '>>>'
			{
			match(">>>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:31:7: ( '?' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:31:9: '?'
			{
			match('?'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:32:7: ( '?-' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:32:9: '?-'
			{
			match("?-"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:33:7: ( '@' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:33:9: '@'
			{
			match('@'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:34:7: ( '@=' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:34:9: '@='
			{
			match("@="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:35:7: ( '\\\\' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:35:9: '\\\\'
			{
			match('\\'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:36:7: ( '^' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:36:9: '^'
			{
			match('^'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:37:7: ( '^^' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:37:9: '^^'
			{
			match("^^"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:38:7: ( '`' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:38:9: '`'
			{
			match('`'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:39:7: ( 'abstract' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:39:9: 'abstract'
			{
			match("abstract"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:40:7: ( 'allowabstract' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:40:9: 'allowabstract'
			{
			match("allowabstract"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:41:7: ( 'array' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:41:9: 'array'
			{
			match("array"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:42:7: ( 'atomic' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:42:9: 'atomic'
			{
			match("atomic"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:43:7: ( 'atomicwhencooked' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:43:9: 'atomicwhencooked'
			{
			match("atomicwhencooked"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:44:7: ( 'auto' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:44:9: 'auto'
			{
			match("auto"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:45:7: ( 'bool' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:45:9: 'bool'
			{
			match("bool"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:46:7: ( 'break' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:46:9: 'break'
			{
			match("break"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:47:7: ( 'byte' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:47:9: 'byte'
			{
			match("byte"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:48:7: ( 'case' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:48:9: 'case'
			{
			match("case"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:49:7: ( 'class' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:49:9: 'class'
			{
			match("class"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:50:7: ( 'classgroup' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:50:9: 'classgroup'
			{
			match("classgroup"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:51:7: ( 'client' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:51:9: 'client'
			{
			match("client"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:52:7: ( 'coerce' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:52:9: 'coerce'
			{
			match("coerce"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:53:7: ( 'collapsecategories' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:53:9: 'collapsecategories'
			{
			match("collapsecategories"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:54:7: ( 'config' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:54:9: 'config'
			{
			match("config"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:55:7: ( 'const' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:55:9: 'const'
			{
			match("const"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:56:7: ( 'continue' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:56:9: 'continue'
			{
			match("continue"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:57:7: ( 'crosslevelpassive' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:57:9: 'crosslevelpassive'
			{
			match("crosslevelpassive"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:58:7: ( 'databinding' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:58:9: 'databinding'
			{
			match("databinding"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:59:7: ( 'default' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:59:9: 'default'
			{
			match("default"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:60:7: ( 'defaultproperties' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:60:9: 'defaultproperties'
			{
			match("defaultproperties"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:61:7: ( 'delegate' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:61:9: 'delegate'
			{
			match("delegate"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:62:7: ( 'dependson' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:62:9: 'dependson'
			{
			match("dependson"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:63:7: ( 'deprecated' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:63:9: 'deprecated'
			{
			match("deprecated"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:64:7: ( 'do' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:64:9: 'do'
			{
			match("do"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:65:7: ( 'dontcollapsecategories' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:65:9: 'dontcollapsecategories'
			{
			match("dontcollapsecategories"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:66:7: ( 'duplicatetransient' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:66:9: 'duplicatetransient'
			{
			match("duplicatetransient"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__95"

	// $ANTLR start "T__96"
	public final void mT__96() throws RecognitionException {
		try {
			int _type = T__96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:67:7: ( 'edfindable' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:67:9: 'edfindable'
			{
			match("edfindable"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__96"

	// $ANTLR start "T__97"
	public final void mT__97() throws RecognitionException {
		try {
			int _type = T__97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:68:7: ( 'editconst' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:68:9: 'editconst'
			{
			match("editconst"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__97"

	// $ANTLR start "T__98"
	public final void mT__98() throws RecognitionException {
		try {
			int _type = T__98;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:69:7: ( 'editfixedsize' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:69:9: 'editfixedsize'
			{
			match("editfixedsize"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__98"

	// $ANTLR start "T__99"
	public final void mT__99() throws RecognitionException {
		try {
			int _type = T__99;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:70:7: ( 'edithide' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:70:9: 'edithide'
			{
			match("edithide"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__99"

	// $ANTLR start "T__100"
	public final void mT__100() throws RecognitionException {
		try {
			int _type = T__100;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:71:8: ( 'editinline' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:71:10: 'editinline'
			{
			match("editinline"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__100"

	// $ANTLR start "T__101"
	public final void mT__101() throws RecognitionException {
		try {
			int _type = T__101;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:72:8: ( 'editinlinenew' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:72:10: 'editinlinenew'
			{
			match("editinlinenew"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__101"

	// $ANTLR start "T__102"
	public final void mT__102() throws RecognitionException {
		try {
			int _type = T__102;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:73:8: ( 'editinlineuse' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:73:10: 'editinlineuse'
			{
			match("editinlineuse"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__102"

	// $ANTLR start "T__103"
	public final void mT__103() throws RecognitionException {
		try {
			int _type = T__103;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:74:8: ( 'editoronly' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:74:10: 'editoronly'
			{
			match("editoronly"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__103"

	// $ANTLR start "T__104"
	public final void mT__104() throws RecognitionException {
		try {
			int _type = T__104;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:75:8: ( 'edittextbox' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:75:10: 'edittextbox'
			{
			match("edittextbox"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__104"

	// $ANTLR start "T__105"
	public final void mT__105() throws RecognitionException {
		try {
			int _type = T__105;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:76:8: ( 'else' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:76:10: 'else'
			{
			match("else"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__105"

	// $ANTLR start "T__106"
	public final void mT__106() throws RecognitionException {
		try {
			int _type = T__106;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:77:8: ( 'enum' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:77:10: 'enum'
			{
			match("enum"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__106"

	// $ANTLR start "T__107"
	public final void mT__107() throws RecognitionException {
		try {
			int _type = T__107;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:78:8: ( 'event' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:78:10: 'event'
			{
			match("event"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__107"

	// $ANTLR start "T__108"
	public final void mT__108() throws RecognitionException {
		try {
			int _type = T__108;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:79:8: ( 'exec' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:79:10: 'exec'
			{
			match("exec"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__108"

	// $ANTLR start "T__109"
	public final void mT__109() throws RecognitionException {
		try {
			int _type = T__109;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:80:8: ( 'export' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:80:10: 'export'
			{
			match("export"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__109"

	// $ANTLR start "T__110"
	public final void mT__110() throws RecognitionException {
		try {
			int _type = T__110;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:81:8: ( 'exportstructs' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:81:10: 'exportstructs'
			{
			match("exportstructs"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__110"

	// $ANTLR start "T__111"
	public final void mT__111() throws RecognitionException {
		try {
			int _type = T__111;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:82:8: ( 'extends' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:82:10: 'extends'
			{
			match("extends"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__111"

	// $ANTLR start "T__112"
	public final void mT__112() throws RecognitionException {
		try {
			int _type = T__112;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:83:8: ( 'false' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:83:10: 'false'
			{
			match("false"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__112"

	// $ANTLR start "T__113"
	public final void mT__113() throws RecognitionException {
		try {
			int _type = T__113;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:84:8: ( 'final' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:84:10: 'final'
			{
			match("final"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__113"

	// $ANTLR start "T__114"
	public final void mT__114() throws RecognitionException {
		try {
			int _type = T__114;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:85:8: ( 'float' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:85:10: 'float'
			{
			match("float"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__114"

	// $ANTLR start "T__115"
	public final void mT__115() throws RecognitionException {
		try {
			int _type = T__115;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:86:8: ( 'for' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:86:10: 'for'
			{
			match("for"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__115"

	// $ANTLR start "T__116"
	public final void mT__116() throws RecognitionException {
		try {
			int _type = T__116;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:87:8: ( 'foreach' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:87:10: 'foreach'
			{
			match("foreach"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__116"

	// $ANTLR start "T__117"
	public final void mT__117() throws RecognitionException {
		try {
			int _type = T__117;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:88:8: ( 'function' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:88:10: 'function'
			{
			match("function"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__117"

	// $ANTLR start "T__118"
	public final void mT__118() throws RecognitionException {
		try {
			int _type = T__118;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:89:8: ( 'globalconfig' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:89:10: 'globalconfig'
			{
			match("globalconfig"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__118"

	// $ANTLR start "T__119"
	public final void mT__119() throws RecognitionException {
		try {
			int _type = T__119;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:90:8: ( 'hidecategories' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:90:10: 'hidecategories'
			{
			match("hidecategories"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__119"

	// $ANTLR start "T__120"
	public final void mT__120() throws RecognitionException {
		try {
			int _type = T__120;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:91:8: ( 'if' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:91:10: 'if'
			{
			match("if"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__120"

	// $ANTLR start "T__121"
	public final void mT__121() throws RecognitionException {
		try {
			int _type = T__121;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:92:8: ( 'ignores' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:92:10: 'ignores'
			{
			match("ignores"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__121"

	// $ANTLR start "T__122"
	public final void mT__122() throws RecognitionException {
		try {
			int _type = T__122;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:93:8: ( 'immutable' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:93:10: 'immutable'
			{
			match("immutable"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__122"

	// $ANTLR start "T__123"
	public final void mT__123() throws RecognitionException {
		try {
			int _type = T__123;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:94:8: ( 'immutablewhencooked' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:94:10: 'immutablewhencooked'
			{
			match("immutablewhencooked"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__123"

	// $ANTLR start "T__124"
	public final void mT__124() throws RecognitionException {
		try {
			int _type = T__124;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:95:8: ( 'implements' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:95:10: 'implements'
			{
			match("implements"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__124"

	// $ANTLR start "T__125"
	public final void mT__125() throws RecognitionException {
		try {
			int _type = T__125;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:96:8: ( 'inherits' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:96:10: 'inherits'
			{
			match("inherits"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__125"

	// $ANTLR start "T__126"
	public final void mT__126() throws RecognitionException {
		try {
			int _type = T__126;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:97:8: ( 'init' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:97:10: 'init'
			{
			match("init"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__126"

	// $ANTLR start "T__127"
	public final void mT__127() throws RecognitionException {
		try {
			int _type = T__127;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:98:8: ( 'input' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:98:10: 'input'
			{
			match("input"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__127"

	// $ANTLR start "T__128"
	public final void mT__128() throws RecognitionException {
		try {
			int _type = T__128;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:99:8: ( 'instanced' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:99:10: 'instanced'
			{
			match("instanced"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__128"

	// $ANTLR start "T__129"
	public final void mT__129() throws RecognitionException {
		try {
			int _type = T__129;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:100:8: ( 'int' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:100:10: 'int'
			{
			match("int"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__129"

	// $ANTLR start "T__130"
	public final void mT__130() throws RecognitionException {
		try {
			int _type = T__130;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:101:8: ( 'interface' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:101:10: 'interface'
			{
			match("interface"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__130"

	// $ANTLR start "T__131"
	public final void mT__131() throws RecognitionException {
		try {
			int _type = T__131;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:102:8: ( 'interp' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:102:10: 'interp'
			{
			match("interp"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__131"

	// $ANTLR start "T__132"
	public final void mT__132() throws RecognitionException {
		try {
			int _type = T__132;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:103:8: ( 'iterator' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:103:10: 'iterator'
			{
			match("iterator"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__132"

	// $ANTLR start "T__133"
	public final void mT__133() throws RecognitionException {
		try {
			int _type = T__133;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:104:8: ( 'k2call' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:104:10: 'k2call'
			{
			match("k2call"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__133"

	// $ANTLR start "T__134"
	public final void mT__134() throws RecognitionException {
		try {
			int _type = T__134;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:105:8: ( 'k2overrride' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:105:10: 'k2overrride'
			{
			match("k2overrride"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__134"

	// $ANTLR start "T__135"
	public final void mT__135() throws RecognitionException {
		try {
			int _type = T__135;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:106:8: ( 'k2pure' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:106:10: 'k2pure'
			{
			match("k2pure"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__135"

	// $ANTLR start "T__136"
	public final void mT__136() throws RecognitionException {
		try {
			int _type = T__136;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:107:8: ( 'latent' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:107:10: 'latent'
			{
			match("latent"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__136"

	// $ANTLR start "T__137"
	public final void mT__137() throws RecognitionException {
		try {
			int _type = T__137;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:108:8: ( 'local' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:108:10: 'local'
			{
			match("local"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__137"

	// $ANTLR start "T__138"
	public final void mT__138() throws RecognitionException {
		try {
			int _type = T__138;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:109:8: ( 'localized' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:109:10: 'localized'
			{
			match("localized"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__138"

	// $ANTLR start "T__139"
	public final void mT__139() throws RecognitionException {
		try {
			int _type = T__139;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:110:8: ( 'name' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:110:10: 'name'
			{
			match("name"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__139"

	// $ANTLR start "T__140"
	public final void mT__140() throws RecognitionException {
		try {
			int _type = T__140;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:111:8: ( 'native' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:111:10: 'native'
			{
			match("native"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__140"

	// $ANTLR start "T__141"
	public final void mT__141() throws RecognitionException {
		try {
			int _type = T__141;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:112:8: ( 'nativereplication' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:112:10: 'nativereplication'
			{
			match("nativereplication"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__141"

	// $ANTLR start "T__142"
	public final void mT__142() throws RecognitionException {
		try {
			int _type = T__142;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:113:8: ( 'new' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:113:10: 'new'
			{
			match("new"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__142"

	// $ANTLR start "T__143"
	public final void mT__143() throws RecognitionException {
		try {
			int _type = T__143;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:114:8: ( 'noclear' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:114:10: 'noclear'
			{
			match("noclear"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__143"

	// $ANTLR start "T__144"
	public final void mT__144() throws RecognitionException {
		try {
			int _type = T__144;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:115:8: ( 'noexport' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:115:10: 'noexport'
			{
			match("noexport"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__144"

	// $ANTLR start "T__145"
	public final void mT__145() throws RecognitionException {
		try {
			int _type = T__145;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:116:8: ( 'noexportheader' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:116:10: 'noexportheader'
			{
			match("noexportheader"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__145"

	// $ANTLR start "T__146"
	public final void mT__146() throws RecognitionException {
		try {
			int _type = T__146;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:117:8: ( 'noimport' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:117:10: 'noimport'
			{
			match("noimport"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__146"

	// $ANTLR start "T__147"
	public final void mT__147() throws RecognitionException {
		try {
			int _type = T__147;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:118:8: ( 'nontransactional' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:118:10: 'nontransactional'
			{
			match("nontransactional"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__147"

	// $ANTLR start "T__148"
	public final void mT__148() throws RecognitionException {
		try {
			int _type = T__148;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:119:8: ( 'nontransient' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:119:10: 'nontransient'
			{
			match("nontransient"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__148"

	// $ANTLR start "T__149"
	public final void mT__149() throws RecognitionException {
		try {
			int _type = T__149;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:120:8: ( 'noteditinlinenew' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:120:10: 'noteditinlinenew'
			{
			match("noteditinlinenew"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__149"

	// $ANTLR start "T__150"
	public final void mT__150() throws RecognitionException {
		try {
			int _type = T__150;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:121:8: ( 'notforconsole' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:121:10: 'notforconsole'
			{
			match("notforconsole"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__150"

	// $ANTLR start "T__151"
	public final void mT__151() throws RecognitionException {
		try {
			int _type = T__151;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:122:8: ( 'notplaceable' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:122:10: 'notplaceable'
			{
			match("notplaceable"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__151"

	// $ANTLR start "T__152"
	public final void mT__152() throws RecognitionException {
		try {
			int _type = T__152;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:123:8: ( 'operator' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:123:10: 'operator'
			{
			match("operator"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__152"

	// $ANTLR start "T__153"
	public final void mT__153() throws RecognitionException {
		try {
			int _type = T__153;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:124:8: ( 'optional' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:124:10: 'optional'
			{
			match("optional"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__153"

	// $ANTLR start "T__154"
	public final void mT__154() throws RecognitionException {
		try {
			int _type = T__154;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:125:8: ( 'out' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:125:10: 'out'
			{
			match("out"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__154"

	// $ANTLR start "T__155"
	public final void mT__155() throws RecognitionException {
		try {
			int _type = T__155;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:126:8: ( 'perobjectconfig' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:126:10: 'perobjectconfig'
			{
			match("perobjectconfig"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__155"

	// $ANTLR start "T__156"
	public final void mT__156() throws RecognitionException {
		try {
			int _type = T__156;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:127:8: ( 'placeable' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:127:10: 'placeable'
			{
			match("placeable"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__156"

	// $ANTLR start "T__157"
	public final void mT__157() throws RecognitionException {
		try {
			int _type = T__157;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:128:8: ( 'pointer' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:128:10: 'pointer'
			{
			match("pointer"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__157"

	// $ANTLR start "T__158"
	public final void mT__158() throws RecognitionException {
		try {
			int _type = T__158;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:129:8: ( 'postoperator' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:129:10: 'postoperator'
			{
			match("postoperator"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__158"

	// $ANTLR start "T__159"
	public final void mT__159() throws RecognitionException {
		try {
			int _type = T__159;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:130:8: ( 'preoperator' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:130:10: 'preoperator'
			{
			match("preoperator"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__159"

	// $ANTLR start "T__160"
	public final void mT__160() throws RecognitionException {
		try {
			int _type = T__160;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:131:8: ( 'private' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:131:10: 'private'
			{
			match("private"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__160"

	// $ANTLR start "T__161"
	public final void mT__161() throws RecognitionException {
		try {
			int _type = T__161;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:132:8: ( 'property' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:132:10: 'property'
			{
			match("property"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__161"

	// $ANTLR start "T__162"
	public final void mT__162() throws RecognitionException {
		try {
			int _type = T__162;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:133:8: ( 'protected' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:133:10: 'protected'
			{
			match("protected"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__162"

	// $ANTLR start "T__163"
	public final void mT__163() throws RecognitionException {
		try {
			int _type = T__163;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:134:8: ( 'protectedwrite' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:134:10: 'protectedwrite'
			{
			match("protectedwrite"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__163"

	// $ANTLR start "T__164"
	public final void mT__164() throws RecognitionException {
		try {
			int _type = T__164;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:135:8: ( 'public' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:135:10: 'public'
			{
			match("public"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__164"

	// $ANTLR start "T__165"
	public final void mT__165() throws RecognitionException {
		try {
			int _type = T__165;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:136:8: ( 'reliable' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:136:10: 'reliable'
			{
			match("reliable"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__165"

	// $ANTLR start "T__166"
	public final void mT__166() throws RecognitionException {
		try {
			int _type = T__166;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:137:8: ( 'replication' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:137:10: 'replication'
			{
			match("replication"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__166"

	// $ANTLR start "T__167"
	public final void mT__167() throws RecognitionException {
		try {
			int _type = T__167;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:138:8: ( 'repnotify' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:138:10: 'repnotify'
			{
			match("repnotify"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__167"

	// $ANTLR start "T__168"
	public final void mT__168() throws RecognitionException {
		try {
			int _type = T__168;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:139:8: ( 'repretry' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:139:10: 'repretry'
			{
			match("repretry"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__168"

	// $ANTLR start "T__169"
	public final void mT__169() throws RecognitionException {
		try {
			int _type = T__169;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:140:8: ( 'return' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:140:10: 'return'
			{
			match("return"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__169"

	// $ANTLR start "T__170"
	public final void mT__170() throws RecognitionException {
		try {
			int _type = T__170;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:141:8: ( 'safereplace' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:141:10: 'safereplace'
			{
			match("safereplace"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__170"

	// $ANTLR start "T__171"
	public final void mT__171() throws RecognitionException {
		try {
			int _type = T__171;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:142:8: ( 'serializetext' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:142:10: 'serializetext'
			{
			match("serializetext"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__171"

	// $ANTLR start "T__172"
	public final void mT__172() throws RecognitionException {
		try {
			int _type = T__172;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:143:8: ( 'server' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:143:10: 'server'
			{
			match("server"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__172"

	// $ANTLR start "T__173"
	public final void mT__173() throws RecognitionException {
		try {
			int _type = T__173;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:144:8: ( 'showcategories' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:144:10: 'showcategories'
			{
			match("showcategories"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__173"

	// $ANTLR start "T__174"
	public final void mT__174() throws RecognitionException {
		try {
			int _type = T__174;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:145:8: ( 'simulated' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:145:10: 'simulated'
			{
			match("simulated"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__174"

	// $ANTLR start "T__175"
	public final void mT__175() throws RecognitionException {
		try {
			int _type = T__175;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:146:8: ( 'singular' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:146:10: 'singular'
			{
			match("singular"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__175"

	// $ANTLR start "T__176"
	public final void mT__176() throws RecognitionException {
		try {
			int _type = T__176;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:147:8: ( 'skip' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:147:10: 'skip'
			{
			match("skip"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__176"

	// $ANTLR start "T__177"
	public final void mT__177() throws RecognitionException {
		try {
			int _type = T__177;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:148:8: ( 'state' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:148:10: 'state'
			{
			match("state"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__177"

	// $ANTLR start "T__178"
	public final void mT__178() throws RecognitionException {
		try {
			int _type = T__178;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:149:8: ( 'static' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:149:10: 'static'
			{
			match("static"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__178"

	// $ANTLR start "T__179"
	public final void mT__179() throws RecognitionException {
		try {
			int _type = T__179;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:150:8: ( 'strictconfig' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:150:10: 'strictconfig'
			{
			match("strictconfig"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__179"

	// $ANTLR start "T__180"
	public final void mT__180() throws RecognitionException {
		try {
			int _type = T__180;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:151:8: ( 'string' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:151:10: 'string'
			{
			match("string"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__180"

	// $ANTLR start "T__181"
	public final void mT__181() throws RecognitionException {
		try {
			int _type = T__181;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:152:8: ( 'struct' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:152:10: 'struct'
			{
			match("struct"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__181"

	// $ANTLR start "T__182"
	public final void mT__182() throws RecognitionException {
		try {
			int _type = T__182;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:153:8: ( 'structdefaultproperties' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:153:10: 'structdefaultproperties'
			{
			match("structdefaultproperties"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__182"

	// $ANTLR start "T__183"
	public final void mT__183() throws RecognitionException {
		try {
			int _type = T__183;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:154:8: ( 'switch' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:154:10: 'switch'
			{
			match("switch"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__183"

	// $ANTLR start "T__184"
	public final void mT__184() throws RecognitionException {
		try {
			int _type = T__184;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:155:8: ( 'transient' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:155:10: 'transient'
			{
			match("transient"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__184"

	// $ANTLR start "T__185"
	public final void mT__185() throws RecognitionException {
		try {
			int _type = T__185;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:156:8: ( 'travel' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:156:10: 'travel'
			{
			match("travel"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__185"

	// $ANTLR start "T__186"
	public final void mT__186() throws RecognitionException {
		try {
			int _type = T__186;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:157:8: ( 'true' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:157:10: 'true'
			{
			match("true"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__186"

	// $ANTLR start "T__187"
	public final void mT__187() throws RecognitionException {
		try {
			int _type = T__187;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:158:8: ( 'unreliable' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:158:10: 'unreliable'
			{
			match("unreliable"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__187"

	// $ANTLR start "T__188"
	public final void mT__188() throws RecognitionException {
		try {
			int _type = T__188;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:159:8: ( 'until' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:159:10: 'until'
			{
			match("until"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__188"

	// $ANTLR start "T__189"
	public final void mT__189() throws RecognitionException {
		try {
			int _type = T__189;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:160:8: ( 'var' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:160:10: 'var'
			{
			match("var"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__189"

	// $ANTLR start "T__190"
	public final void mT__190() throws RecognitionException {
		try {
			int _type = T__190;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:161:8: ( 'virtual' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:161:10: 'virtual'
			{
			match("virtual"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__190"

	// $ANTLR start "T__191"
	public final void mT__191() throws RecognitionException {
		try {
			int _type = T__191;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:162:8: ( 'while' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:162:10: 'while'
			{
			match("while"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__191"

	// $ANTLR start "T__192"
	public final void mT__192() throws RecognitionException {
		try {
			int _type = T__192;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:163:8: ( 'within' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:163:10: 'within'
			{
			match("within"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__192"

	// $ANTLR start "T__193"
	public final void mT__193() throws RecognitionException {
		try {
			int _type = T__193;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:164:8: ( '|' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:164:10: '|'
			{
			match('|'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__193"

	// $ANTLR start "T__194"
	public final void mT__194() throws RecognitionException {
		try {
			int _type = T__194;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:165:8: ( '||' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:165:10: '||'
			{
			match("||"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__194"

	// $ANTLR start "T__195"
	public final void mT__195() throws RecognitionException {
		try {
			int _type = T__195;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:166:8: ( '~' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:166:10: '~'
			{
			match('~'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__195"

	// $ANTLR start "T__196"
	public final void mT__196() throws RecognitionException {
		try {
			int _type = T__196;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:167:8: ( '~=' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:167:10: '~='
			{
			match("~="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__196"

	// $ANTLR start "STRINGVAL"
	public final void mSTRINGVAL() throws RecognitionException {
		try {
			int _type = STRINGVAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:984:2: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:985:2: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
			{
			match('\"'); if (state.failed) return;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:986:2: ( ESC_SEQ |~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\\') ) {
					alt1=1;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '[')||(LA1_0 >= ']' && LA1_0 <= '\uFFFF')) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:987:3: ESC_SEQ
					{
					mESC_SEQ(); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:989:3: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			match('\"'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGVAL"

	// $ANTLR start "ALPHA"
	public final void mALPHA() throws RecognitionException {
		try {
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1001:2: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALPHA"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1008:2: ( '0' .. '9' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1014:2: ( ';' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1015:2: ';'
			{
			match(';'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1020:2: ( ':' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1021:2: ':'
			{
			match(':'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "UNDERSCORE"
	public final void mUNDERSCORE() throws RecognitionException {
		try {
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1026:2: ( '_' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1027:2: '_'
			{
			match('_'); if (state.failed) return;
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDERSCORE"

	// $ANTLR start "LBRACK"
	public final void mLBRACK() throws RecognitionException {
		try {
			int _type = LBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1032:2: ( '(' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1033:2: '('
			{
			match('('); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACK"

	// $ANTLR start "RBRACK"
	public final void mRBRACK() throws RecognitionException {
		try {
			int _type = RBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1038:2: ( ')' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1039:2: ')'
			{
			match(')'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACK"

	// $ANTLR start "LABRACK"
	public final void mLABRACK() throws RecognitionException {
		try {
			int _type = LABRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1044:2: ( '<' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1045:2: '<'
			{
			match('<'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LABRACK"

	// $ANTLR start "RABRACK"
	public final void mRABRACK() throws RecognitionException {
		try {
			int _type = RABRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1050:2: ( '>' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1051:2: '>'
			{
			match('>'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RABRACK"

	// $ANTLR start "LCBRACK"
	public final void mLCBRACK() throws RecognitionException {
		try {
			int _type = LCBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1056:2: ( '{' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1057:2: '{'
			{
			match('{'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCBRACK"

	// $ANTLR start "RCBRACK"
	public final void mRCBRACK() throws RecognitionException {
		try {
			int _type = RCBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1062:2: ( '}' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1063:2: '}'
			{
			match('}'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCBRACK"

	// $ANTLR start "LSBRACK"
	public final void mLSBRACK() throws RecognitionException {
		try {
			int _type = LSBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1068:2: ( '[' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1069:2: '['
			{
			match('['); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSBRACK"

	// $ANTLR start "RSBRACK"
	public final void mRSBRACK() throws RecognitionException {
		try {
			int _type = RSBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1074:2: ( ']' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1075:2: ']'
			{
			match(']'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSBRACK"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1080:2: ( '.' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1081:2: '.'
			{
			match('.'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1086:2: ( ',' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1087:2: ','
			{
			match(','); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SQUOTE"
	public final void mSQUOTE() throws RecognitionException {
		try {
			int _type = SQUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1092:2: ( '\\'' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1093:2: '\\''
			{
			match('\''); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQUOTE"

	// $ANTLR start "DQUOTE"
	public final void mDQUOTE() throws RecognitionException {
		try {
			int _type = DQUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1098:2: ( '\"' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1099:2: '\"'
			{
			match('\"'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DQUOTE"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1104:2: ( '=' )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1105:2: '='
			{
			match('='); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "INTVAL"
	public final void mINTVAL() throws RecognitionException {
		try {
			int _type = INTVAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1301:2: ( ( ( DIGIT )+ | HEX_LITERAL ) )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1302:2: ( ( DIGIT )+ | HEX_LITERAL )
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1302:2: ( ( DIGIT )+ | HEX_LITERAL )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='0') ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='X'||LA3_1=='x') ) {
					alt3=2;
				}

				else {
					alt3=1;
				}

			}
			else if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
				alt3=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1303:3: ( DIGIT )+
					{
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1303:3: ( DIGIT )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1304:5: HEX_LITERAL
					{
					mHEX_LITERAL(); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTVAL"

	// $ANTLR start "FLOATVAL"
	public final void mFLOATVAL() throws RecognitionException {
		try {
			int _type = FLOATVAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1310:2: ( ( DIGIT )+ DOT ( DIGIT )* ( 'f' )? )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1311:2: ( DIGIT )+ DOT ( DIGIT )* ( 'f' )?
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1311:2: ( DIGIT )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			mDOT(); if (state.failed) return;

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1311:17: ( DIGIT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1311:28: ( 'f' )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='f') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1311:28: 'f'
					{
					match('f'); if (state.failed) return;
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATVAL"

	// $ANTLR start "STRUCTCPPTEXT"
	public final void mSTRUCTCPPTEXT() throws RecognitionException {
		try {
			int _type = STRUCTCPPTEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1356:2: ( ( 'structcpptext' ( WS1 )* INNERBLOCKTEXT ) )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1357:2: ( 'structcpptext' ( WS1 )* INNERBLOCKTEXT )
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1357:2: ( 'structcpptext' ( WS1 )* INNERBLOCKTEXT )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1357:4: 'structcpptext' ( WS1 )* INNERBLOCKTEXT
			{
			match("structcpptext"); if (state.failed) return;

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1357:20: ( WS1 )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			mINNERBLOCKTEXT(); if (state.failed) return;

			}

			if ( state.backtracking==0 ) {
			                                          _channel = HIDDEN;
			                                         }
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRUCTCPPTEXT"

	// $ANTLR start "CPPTEXT"
	public final void mCPPTEXT() throws RecognitionException {
		try {
			int _type = CPPTEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1365:2: ( ( 'cpptext' ( WS1 )* INNERBLOCKTEXT ) )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1366:2: ( 'cpptext' ( WS1 )* INNERBLOCKTEXT )
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1366:2: ( 'cpptext' ( WS1 )* INNERBLOCKTEXT )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1366:4: 'cpptext' ( WS1 )* INNERBLOCKTEXT
			{
			match("cpptext"); if (state.failed) return;

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1366:14: ( WS1 )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			mINNERBLOCKTEXT(); if (state.failed) return;

			}

			if ( state.backtracking==0 ) {
			                                    _channel = HIDDEN;
			                                   }
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CPPTEXT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			int _type = ESC_SEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1374:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '`' ) )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1375:2: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '`' )
			{
			match('\\'); if (state.failed) return;
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='`'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1391:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1392:2: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( state.backtracking==0 ) {
			   _channel = HIDDEN;
			  }
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "WS1"
	public final void mWS1() throws RecognitionException {
		try {
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1406:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS1"

	// $ANTLR start "HEX_LITERAL"
	public final void mHEX_LITERAL() throws RecognitionException {
		try {
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1417:2: ( '0' ( 'x' | 'X' ) ( HexDigit )+ )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1418:2: '0' ( 'x' | 'X' ) ( HexDigit )+
			{
			match('0'); if (state.failed) return;
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1423:2: ( HexDigit )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'F')||(LA9_0 >= 'a' && LA9_0 <= 'f')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_LITERAL"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1428:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1438:2: ( ( '`' )? ( ALPHA | UNDERSCORE ) ( ALPHA | UNDERSCORE | DIGIT )* )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1439:2: ( '`' )? ( ALPHA | UNDERSCORE ) ( ALPHA | UNDERSCORE | DIGIT )*
			{
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1439:2: ( '`' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='`') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1439:2: '`'
					{
					match('`'); if (state.failed) return;
					}
					break;

			}

			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1444:2: ( ALPHA | UNDERSCORE | DIGIT )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')||(LA11_0 >= 'A' && LA11_0 <= 'Z')||LA11_0=='_'||(LA11_0 >= 'a' && LA11_0 <= 'z')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "INNERBLOCKTEXT"
	public final void mINNERBLOCKTEXT() throws RecognitionException {
		try {
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1453:2: ( LCBRACK (~ ( LCBRACK | RCBRACK ) | INNERBLOCKTEXT )* RCBRACK )
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1454:2: LCBRACK (~ ( LCBRACK | RCBRACK ) | INNERBLOCKTEXT )* RCBRACK
			{
			mLCBRACK(); if (state.failed) return;

			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1455:2: (~ ( LCBRACK | RCBRACK ) | INNERBLOCKTEXT )*
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\u0000' && LA12_0 <= 'z')||LA12_0=='|'||(LA12_0 >= '~' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}
				else if ( (LA12_0=='{') ) {
					alt12=2;
				}

				switch (alt12) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1456:3: ~ ( LCBRACK | RCBRACK )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= 'z')||input.LA(1)=='|'||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1460:5: INNERBLOCKTEXT
					{
					mINNERBLOCKTEXT(); if (state.failed) return;

					}
					break;

				default :
					break loop12;
				}
			}

			mRCBRACK(); if (state.failed) return;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INNERBLOCKTEXT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1471:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | ( '`if' )=> '`if' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | ( '`else' )=> '`else' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | ( '`endif' )=> '`endif' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | ( '`define' )=> '`define' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | ( '`debugstate' )=> '`debugstate' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | ( '`' ( WS1 )* INNERBLOCKTEXT )=> '`' ( WS1 )* INNERBLOCKTEXT | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt27=8;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='/') ) {
				int LA27_1 = input.LA(2);
				if ( (LA27_1=='/') ) {
					alt27=1;
				}
				else if ( (LA27_1=='*') ) {
					alt27=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA27_0=='`') ) {
				int LA27_2 = input.LA(2);
				if ( (LA27_2=='i') && (synpred1_UnrealScript())) {
					alt27=2;
				}
				else if ( (LA27_2=='e') ) {
					int LA27_6 = input.LA(3);
					if ( (LA27_6=='l') && (synpred2_UnrealScript())) {
						alt27=3;
					}
					else if ( (LA27_6=='n') && (synpred3_UnrealScript())) {
						alt27=4;
					}

				}
				else if ( (LA27_2=='d') ) {
					int LA27_7 = input.LA(3);
					if ( (LA27_7=='e') ) {
						int LA27_12 = input.LA(4);
						if ( (LA27_12=='f') && (synpred4_UnrealScript())) {
							alt27=5;
						}
						else if ( (LA27_12=='b') && (synpred5_UnrealScript())) {
							alt27=6;
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 27, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( ((LA27_2 >= '\t' && LA27_2 <= '\n')||LA27_2=='\r'||LA27_2==' ') && (synpred6_UnrealScript())) {
					alt27=7;
				}
				else if ( (LA27_2=='{') && (synpred6_UnrealScript())) {
					alt27=7;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1472:2: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); if (state.failed) return;

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1473:2: (~ ( '\\n' | '\\r' ) )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\t')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\uFFFF')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop13;
						}
					}

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1477:2: ( '\\r' )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0=='\r') ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1477:2: '\\r'
							{
							match('\r'); if (state.failed) return;
							}
							break;

					}

					match('\n'); if (state.failed) return;
					if ( state.backtracking==0 ) {
					             _channel = HIDDEN;
					            }
					}
					break;
				case 2 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1481:4: ( '`if' )=> '`if' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("`if"); if (state.failed) return;

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1482:2: (~ ( '\\n' | '\\r' ) )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\uFFFF')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop15;
						}
					}

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1486:2: ( '\\r' )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='\r') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1486:2: '\\r'
							{
							match('\r'); if (state.failed) return;
							}
							break;

					}

					match('\n'); if (state.failed) return;
					if ( state.backtracking==0 ) {
					             _channel = HIDDEN;
					            }
					}
					break;
				case 3 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1490:4: ( '`else' )=> '`else' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("`else"); if (state.failed) return;

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1491:2: (~ ( '\\n' | '\\r' ) )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\t')||(LA17_0 >= '\u000B' && LA17_0 <= '\f')||(LA17_0 >= '\u000E' && LA17_0 <= '\uFFFF')) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop17;
						}
					}

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1495:2: ( '\\r' )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0=='\r') ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1495:2: '\\r'
							{
							match('\r'); if (state.failed) return;
							}
							break;

					}

					match('\n'); if (state.failed) return;
					if ( state.backtracking==0 ) {
					             _channel = HIDDEN;
					            }
					}
					break;
				case 4 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1499:4: ( '`endif' )=> '`endif' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("`endif"); if (state.failed) return;

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1500:2: (~ ( '\\n' | '\\r' ) )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\t')||(LA19_0 >= '\u000B' && LA19_0 <= '\f')||(LA19_0 >= '\u000E' && LA19_0 <= '\uFFFF')) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop19;
						}
					}

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1504:2: ( '\\r' )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0=='\r') ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1504:2: '\\r'
							{
							match('\r'); if (state.failed) return;
							}
							break;

					}

					match('\n'); if (state.failed) return;
					if ( state.backtracking==0 ) {
					             _channel = HIDDEN;
					            }
					}
					break;
				case 5 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1508:4: ( '`define' )=> '`define' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("`define"); if (state.failed) return;

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1509:2: (~ ( '\\n' | '\\r' ) )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( ((LA21_0 >= '\u0000' && LA21_0 <= '\t')||(LA21_0 >= '\u000B' && LA21_0 <= '\f')||(LA21_0 >= '\u000E' && LA21_0 <= '\uFFFF')) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop21;
						}
					}

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1513:2: ( '\\r' )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0=='\r') ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1513:2: '\\r'
							{
							match('\r'); if (state.failed) return;
							}
							break;

					}

					match('\n'); if (state.failed) return;
					if ( state.backtracking==0 ) {
					             _channel = HIDDEN;
					            }
					}
					break;
				case 6 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1517:4: ( '`debugstate' )=> '`debugstate' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("`debugstate"); if (state.failed) return;

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1518:2: (~ ( '\\n' | '\\r' ) )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( ((LA23_0 >= '\u0000' && LA23_0 <= '\t')||(LA23_0 >= '\u000B' && LA23_0 <= '\f')||(LA23_0 >= '\u000E' && LA23_0 <= '\uFFFF')) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop23;
						}
					}

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1522:2: ( '\\r' )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0=='\r') ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1522:2: '\\r'
							{
							match('\r'); if (state.failed) return;
							}
							break;

					}

					match('\n'); if (state.failed) return;
					if ( state.backtracking==0 ) {
					             _channel = HIDDEN;
					            }
					}
					break;
				case 7 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1526:4: ( '`' ( WS1 )* INNERBLOCKTEXT )=> '`' ( WS1 )* INNERBLOCKTEXT
					{
					match('`'); if (state.failed) return;
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1526:39: ( WS1 )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( ((LA25_0 >= '\t' && LA25_0 <= '\n')||LA25_0=='\r'||LA25_0==' ') ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
							{
							if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop25;
						}
					}

					mINNERBLOCKTEXT(); if (state.failed) return;

					if ( state.backtracking==0 ) {
					                                                           _channel = HIDDEN;
					                                                          }
					}
					break;
				case 8 :
					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1530:4: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); if (state.failed) return;

					// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1530:9: ( options {greedy=false; } : . )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0=='*') ) {
							int LA26_1 = input.LA(2);
							if ( (LA26_1=='/') ) {
								alt26=2;
							}
							else if ( ((LA26_1 >= '\u0000' && LA26_1 <= '.')||(LA26_1 >= '0' && LA26_1 <= '\uFFFF')) ) {
								alt26=1;
							}

						}
						else if ( ((LA26_0 >= '\u0000' && LA26_0 <= ')')||(LA26_0 >= '+' && LA26_0 <= '\uFFFF')) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1530:36: .
							{
							matchAny(); if (state.failed) return;
							}
							break;

						default :
							break loop26;
						}
					}

					match("*/"); if (state.failed) return;

					if ( state.backtracking==0 ) {
					                                              _channel = HIDDEN;
					                                             }
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | STRINGVAL | SEMICOLON | COLON | LBRACK | RBRACK | LABRACK | RABRACK | LCBRACK | RCBRACK | LSBRACK | RSBRACK | DOT | COMMA | SQUOTE | DQUOTE | EQUALS | INTVAL | FLOATVAL | STRUCTCPPTEXT | CPPTEXT | ESC_SEQ | WS | IDENTIFIER | COMMENT )
		int alt28=186;
		alt28 = dfa28.predict(input);
		switch (alt28) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:10: T__35
				{
				mT__35(); if (state.failed) return;

				}
				break;
			case 2 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:16: T__36
				{
				mT__36(); if (state.failed) return;

				}
				break;
			case 3 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:22: T__37
				{
				mT__37(); if (state.failed) return;

				}
				break;
			case 4 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:28: T__38
				{
				mT__38(); if (state.failed) return;

				}
				break;
			case 5 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:34: T__39
				{
				mT__39(); if (state.failed) return;

				}
				break;
			case 6 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:40: T__40
				{
				mT__40(); if (state.failed) return;

				}
				break;
			case 7 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:46: T__41
				{
				mT__41(); if (state.failed) return;

				}
				break;
			case 8 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:52: T__42
				{
				mT__42(); if (state.failed) return;

				}
				break;
			case 9 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:58: T__43
				{
				mT__43(); if (state.failed) return;

				}
				break;
			case 10 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:64: T__44
				{
				mT__44(); if (state.failed) return;

				}
				break;
			case 11 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:70: T__45
				{
				mT__45(); if (state.failed) return;

				}
				break;
			case 12 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:76: T__46
				{
				mT__46(); if (state.failed) return;

				}
				break;
			case 13 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:82: T__47
				{
				mT__47(); if (state.failed) return;

				}
				break;
			case 14 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:88: T__48
				{
				mT__48(); if (state.failed) return;

				}
				break;
			case 15 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:94: T__49
				{
				mT__49(); if (state.failed) return;

				}
				break;
			case 16 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:100: T__50
				{
				mT__50(); if (state.failed) return;

				}
				break;
			case 17 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:106: T__51
				{
				mT__51(); if (state.failed) return;

				}
				break;
			case 18 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:112: T__52
				{
				mT__52(); if (state.failed) return;

				}
				break;
			case 19 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:118: T__53
				{
				mT__53(); if (state.failed) return;

				}
				break;
			case 20 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:124: T__54
				{
				mT__54(); if (state.failed) return;

				}
				break;
			case 21 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:130: T__55
				{
				mT__55(); if (state.failed) return;

				}
				break;
			case 22 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:136: T__56
				{
				mT__56(); if (state.failed) return;

				}
				break;
			case 23 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:142: T__57
				{
				mT__57(); if (state.failed) return;

				}
				break;
			case 24 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:148: T__58
				{
				mT__58(); if (state.failed) return;

				}
				break;
			case 25 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:154: T__59
				{
				mT__59(); if (state.failed) return;

				}
				break;
			case 26 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:160: T__60
				{
				mT__60(); if (state.failed) return;

				}
				break;
			case 27 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:166: T__61
				{
				mT__61(); if (state.failed) return;

				}
				break;
			case 28 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:172: T__62
				{
				mT__62(); if (state.failed) return;

				}
				break;
			case 29 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:178: T__63
				{
				mT__63(); if (state.failed) return;

				}
				break;
			case 30 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:184: T__64
				{
				mT__64(); if (state.failed) return;

				}
				break;
			case 31 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:190: T__65
				{
				mT__65(); if (state.failed) return;

				}
				break;
			case 32 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:196: T__66
				{
				mT__66(); if (state.failed) return;

				}
				break;
			case 33 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:202: T__67
				{
				mT__67(); if (state.failed) return;

				}
				break;
			case 34 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:208: T__68
				{
				mT__68(); if (state.failed) return;

				}
				break;
			case 35 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:214: T__69
				{
				mT__69(); if (state.failed) return;

				}
				break;
			case 36 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:220: T__70
				{
				mT__70(); if (state.failed) return;

				}
				break;
			case 37 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:226: T__71
				{
				mT__71(); if (state.failed) return;

				}
				break;
			case 38 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:232: T__72
				{
				mT__72(); if (state.failed) return;

				}
				break;
			case 39 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:238: T__73
				{
				mT__73(); if (state.failed) return;

				}
				break;
			case 40 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:244: T__74
				{
				mT__74(); if (state.failed) return;

				}
				break;
			case 41 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:250: T__75
				{
				mT__75(); if (state.failed) return;

				}
				break;
			case 42 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:256: T__76
				{
				mT__76(); if (state.failed) return;

				}
				break;
			case 43 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:262: T__77
				{
				mT__77(); if (state.failed) return;

				}
				break;
			case 44 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:268: T__78
				{
				mT__78(); if (state.failed) return;

				}
				break;
			case 45 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:274: T__79
				{
				mT__79(); if (state.failed) return;

				}
				break;
			case 46 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:280: T__80
				{
				mT__80(); if (state.failed) return;

				}
				break;
			case 47 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:286: T__81
				{
				mT__81(); if (state.failed) return;

				}
				break;
			case 48 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:292: T__82
				{
				mT__82(); if (state.failed) return;

				}
				break;
			case 49 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:298: T__83
				{
				mT__83(); if (state.failed) return;

				}
				break;
			case 50 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:304: T__84
				{
				mT__84(); if (state.failed) return;

				}
				break;
			case 51 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:310: T__85
				{
				mT__85(); if (state.failed) return;

				}
				break;
			case 52 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:316: T__86
				{
				mT__86(); if (state.failed) return;

				}
				break;
			case 53 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:322: T__87
				{
				mT__87(); if (state.failed) return;

				}
				break;
			case 54 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:328: T__88
				{
				mT__88(); if (state.failed) return;

				}
				break;
			case 55 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:334: T__89
				{
				mT__89(); if (state.failed) return;

				}
				break;
			case 56 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:340: T__90
				{
				mT__90(); if (state.failed) return;

				}
				break;
			case 57 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:346: T__91
				{
				mT__91(); if (state.failed) return;

				}
				break;
			case 58 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:352: T__92
				{
				mT__92(); if (state.failed) return;

				}
				break;
			case 59 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:358: T__93
				{
				mT__93(); if (state.failed) return;

				}
				break;
			case 60 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:364: T__94
				{
				mT__94(); if (state.failed) return;

				}
				break;
			case 61 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:370: T__95
				{
				mT__95(); if (state.failed) return;

				}
				break;
			case 62 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:376: T__96
				{
				mT__96(); if (state.failed) return;

				}
				break;
			case 63 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:382: T__97
				{
				mT__97(); if (state.failed) return;

				}
				break;
			case 64 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:388: T__98
				{
				mT__98(); if (state.failed) return;

				}
				break;
			case 65 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:394: T__99
				{
				mT__99(); if (state.failed) return;

				}
				break;
			case 66 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:400: T__100
				{
				mT__100(); if (state.failed) return;

				}
				break;
			case 67 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:407: T__101
				{
				mT__101(); if (state.failed) return;

				}
				break;
			case 68 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:414: T__102
				{
				mT__102(); if (state.failed) return;

				}
				break;
			case 69 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:421: T__103
				{
				mT__103(); if (state.failed) return;

				}
				break;
			case 70 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:428: T__104
				{
				mT__104(); if (state.failed) return;

				}
				break;
			case 71 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:435: T__105
				{
				mT__105(); if (state.failed) return;

				}
				break;
			case 72 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:442: T__106
				{
				mT__106(); if (state.failed) return;

				}
				break;
			case 73 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:449: T__107
				{
				mT__107(); if (state.failed) return;

				}
				break;
			case 74 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:456: T__108
				{
				mT__108(); if (state.failed) return;

				}
				break;
			case 75 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:463: T__109
				{
				mT__109(); if (state.failed) return;

				}
				break;
			case 76 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:470: T__110
				{
				mT__110(); if (state.failed) return;

				}
				break;
			case 77 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:477: T__111
				{
				mT__111(); if (state.failed) return;

				}
				break;
			case 78 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:484: T__112
				{
				mT__112(); if (state.failed) return;

				}
				break;
			case 79 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:491: T__113
				{
				mT__113(); if (state.failed) return;

				}
				break;
			case 80 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:498: T__114
				{
				mT__114(); if (state.failed) return;

				}
				break;
			case 81 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:505: T__115
				{
				mT__115(); if (state.failed) return;

				}
				break;
			case 82 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:512: T__116
				{
				mT__116(); if (state.failed) return;

				}
				break;
			case 83 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:519: T__117
				{
				mT__117(); if (state.failed) return;

				}
				break;
			case 84 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:526: T__118
				{
				mT__118(); if (state.failed) return;

				}
				break;
			case 85 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:533: T__119
				{
				mT__119(); if (state.failed) return;

				}
				break;
			case 86 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:540: T__120
				{
				mT__120(); if (state.failed) return;

				}
				break;
			case 87 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:547: T__121
				{
				mT__121(); if (state.failed) return;

				}
				break;
			case 88 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:554: T__122
				{
				mT__122(); if (state.failed) return;

				}
				break;
			case 89 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:561: T__123
				{
				mT__123(); if (state.failed) return;

				}
				break;
			case 90 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:568: T__124
				{
				mT__124(); if (state.failed) return;

				}
				break;
			case 91 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:575: T__125
				{
				mT__125(); if (state.failed) return;

				}
				break;
			case 92 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:582: T__126
				{
				mT__126(); if (state.failed) return;

				}
				break;
			case 93 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:589: T__127
				{
				mT__127(); if (state.failed) return;

				}
				break;
			case 94 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:596: T__128
				{
				mT__128(); if (state.failed) return;

				}
				break;
			case 95 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:603: T__129
				{
				mT__129(); if (state.failed) return;

				}
				break;
			case 96 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:610: T__130
				{
				mT__130(); if (state.failed) return;

				}
				break;
			case 97 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:617: T__131
				{
				mT__131(); if (state.failed) return;

				}
				break;
			case 98 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:624: T__132
				{
				mT__132(); if (state.failed) return;

				}
				break;
			case 99 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:631: T__133
				{
				mT__133(); if (state.failed) return;

				}
				break;
			case 100 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:638: T__134
				{
				mT__134(); if (state.failed) return;

				}
				break;
			case 101 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:645: T__135
				{
				mT__135(); if (state.failed) return;

				}
				break;
			case 102 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:652: T__136
				{
				mT__136(); if (state.failed) return;

				}
				break;
			case 103 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:659: T__137
				{
				mT__137(); if (state.failed) return;

				}
				break;
			case 104 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:666: T__138
				{
				mT__138(); if (state.failed) return;

				}
				break;
			case 105 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:673: T__139
				{
				mT__139(); if (state.failed) return;

				}
				break;
			case 106 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:680: T__140
				{
				mT__140(); if (state.failed) return;

				}
				break;
			case 107 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:687: T__141
				{
				mT__141(); if (state.failed) return;

				}
				break;
			case 108 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:694: T__142
				{
				mT__142(); if (state.failed) return;

				}
				break;
			case 109 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:701: T__143
				{
				mT__143(); if (state.failed) return;

				}
				break;
			case 110 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:708: T__144
				{
				mT__144(); if (state.failed) return;

				}
				break;
			case 111 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:715: T__145
				{
				mT__145(); if (state.failed) return;

				}
				break;
			case 112 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:722: T__146
				{
				mT__146(); if (state.failed) return;

				}
				break;
			case 113 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:729: T__147
				{
				mT__147(); if (state.failed) return;

				}
				break;
			case 114 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:736: T__148
				{
				mT__148(); if (state.failed) return;

				}
				break;
			case 115 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:743: T__149
				{
				mT__149(); if (state.failed) return;

				}
				break;
			case 116 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:750: T__150
				{
				mT__150(); if (state.failed) return;

				}
				break;
			case 117 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:757: T__151
				{
				mT__151(); if (state.failed) return;

				}
				break;
			case 118 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:764: T__152
				{
				mT__152(); if (state.failed) return;

				}
				break;
			case 119 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:771: T__153
				{
				mT__153(); if (state.failed) return;

				}
				break;
			case 120 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:778: T__154
				{
				mT__154(); if (state.failed) return;

				}
				break;
			case 121 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:785: T__155
				{
				mT__155(); if (state.failed) return;

				}
				break;
			case 122 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:792: T__156
				{
				mT__156(); if (state.failed) return;

				}
				break;
			case 123 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:799: T__157
				{
				mT__157(); if (state.failed) return;

				}
				break;
			case 124 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:806: T__158
				{
				mT__158(); if (state.failed) return;

				}
				break;
			case 125 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:813: T__159
				{
				mT__159(); if (state.failed) return;

				}
				break;
			case 126 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:820: T__160
				{
				mT__160(); if (state.failed) return;

				}
				break;
			case 127 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:827: T__161
				{
				mT__161(); if (state.failed) return;

				}
				break;
			case 128 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:834: T__162
				{
				mT__162(); if (state.failed) return;

				}
				break;
			case 129 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:841: T__163
				{
				mT__163(); if (state.failed) return;

				}
				break;
			case 130 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:848: T__164
				{
				mT__164(); if (state.failed) return;

				}
				break;
			case 131 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:855: T__165
				{
				mT__165(); if (state.failed) return;

				}
				break;
			case 132 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:862: T__166
				{
				mT__166(); if (state.failed) return;

				}
				break;
			case 133 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:869: T__167
				{
				mT__167(); if (state.failed) return;

				}
				break;
			case 134 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:876: T__168
				{
				mT__168(); if (state.failed) return;

				}
				break;
			case 135 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:883: T__169
				{
				mT__169(); if (state.failed) return;

				}
				break;
			case 136 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:890: T__170
				{
				mT__170(); if (state.failed) return;

				}
				break;
			case 137 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:897: T__171
				{
				mT__171(); if (state.failed) return;

				}
				break;
			case 138 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:904: T__172
				{
				mT__172(); if (state.failed) return;

				}
				break;
			case 139 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:911: T__173
				{
				mT__173(); if (state.failed) return;

				}
				break;
			case 140 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:918: T__174
				{
				mT__174(); if (state.failed) return;

				}
				break;
			case 141 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:925: T__175
				{
				mT__175(); if (state.failed) return;

				}
				break;
			case 142 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:932: T__176
				{
				mT__176(); if (state.failed) return;

				}
				break;
			case 143 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:939: T__177
				{
				mT__177(); if (state.failed) return;

				}
				break;
			case 144 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:946: T__178
				{
				mT__178(); if (state.failed) return;

				}
				break;
			case 145 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:953: T__179
				{
				mT__179(); if (state.failed) return;

				}
				break;
			case 146 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:960: T__180
				{
				mT__180(); if (state.failed) return;

				}
				break;
			case 147 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:967: T__181
				{
				mT__181(); if (state.failed) return;

				}
				break;
			case 148 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:974: T__182
				{
				mT__182(); if (state.failed) return;

				}
				break;
			case 149 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:981: T__183
				{
				mT__183(); if (state.failed) return;

				}
				break;
			case 150 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:988: T__184
				{
				mT__184(); if (state.failed) return;

				}
				break;
			case 151 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:995: T__185
				{
				mT__185(); if (state.failed) return;

				}
				break;
			case 152 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1002: T__186
				{
				mT__186(); if (state.failed) return;

				}
				break;
			case 153 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1009: T__187
				{
				mT__187(); if (state.failed) return;

				}
				break;
			case 154 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1016: T__188
				{
				mT__188(); if (state.failed) return;

				}
				break;
			case 155 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1023: T__189
				{
				mT__189(); if (state.failed) return;

				}
				break;
			case 156 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1030: T__190
				{
				mT__190(); if (state.failed) return;

				}
				break;
			case 157 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1037: T__191
				{
				mT__191(); if (state.failed) return;

				}
				break;
			case 158 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1044: T__192
				{
				mT__192(); if (state.failed) return;

				}
				break;
			case 159 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1051: T__193
				{
				mT__193(); if (state.failed) return;

				}
				break;
			case 160 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1058: T__194
				{
				mT__194(); if (state.failed) return;

				}
				break;
			case 161 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1065: T__195
				{
				mT__195(); if (state.failed) return;

				}
				break;
			case 162 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1072: T__196
				{
				mT__196(); if (state.failed) return;

				}
				break;
			case 163 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1079: STRINGVAL
				{
				mSTRINGVAL(); if (state.failed) return;

				}
				break;
			case 164 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1089: SEMICOLON
				{
				mSEMICOLON(); if (state.failed) return;

				}
				break;
			case 165 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1099: COLON
				{
				mCOLON(); if (state.failed) return;

				}
				break;
			case 166 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1105: LBRACK
				{
				mLBRACK(); if (state.failed) return;

				}
				break;
			case 167 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1112: RBRACK
				{
				mRBRACK(); if (state.failed) return;

				}
				break;
			case 168 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1119: LABRACK
				{
				mLABRACK(); if (state.failed) return;

				}
				break;
			case 169 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1127: RABRACK
				{
				mRABRACK(); if (state.failed) return;

				}
				break;
			case 170 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1135: LCBRACK
				{
				mLCBRACK(); if (state.failed) return;

				}
				break;
			case 171 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1143: RCBRACK
				{
				mRCBRACK(); if (state.failed) return;

				}
				break;
			case 172 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1151: LSBRACK
				{
				mLSBRACK(); if (state.failed) return;

				}
				break;
			case 173 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1159: RSBRACK
				{
				mRSBRACK(); if (state.failed) return;

				}
				break;
			case 174 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1167: DOT
				{
				mDOT(); if (state.failed) return;

				}
				break;
			case 175 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1171: COMMA
				{
				mCOMMA(); if (state.failed) return;

				}
				break;
			case 176 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1177: SQUOTE
				{
				mSQUOTE(); if (state.failed) return;

				}
				break;
			case 177 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1184: DQUOTE
				{
				mDQUOTE(); if (state.failed) return;

				}
				break;
			case 178 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1191: EQUALS
				{
				mEQUALS(); if (state.failed) return;

				}
				break;
			case 179 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1198: INTVAL
				{
				mINTVAL(); if (state.failed) return;

				}
				break;
			case 180 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1205: FLOATVAL
				{
				mFLOATVAL(); if (state.failed) return;

				}
				break;
			case 181 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1214: STRUCTCPPTEXT
				{
				mSTRUCTCPPTEXT(); if (state.failed) return;

				}
				break;
			case 182 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1228: CPPTEXT
				{
				mCPPTEXT(); if (state.failed) return;

				}
				break;
			case 183 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1236: ESC_SEQ
				{
				mESC_SEQ(); if (state.failed) return;

				}
				break;
			case 184 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1244: WS
				{
				mWS(); if (state.failed) return;

				}
				break;
			case 185 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1247: IDENTIFIER
				{
				mIDENTIFIER(); if (state.failed) return;

				}
				break;
			case 186 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1:1258: COMMENT
				{
				mCOMMENT(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_UnrealScript
	public final void synpred1_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1481:4: ( '`if' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1481:6: '`if'
		{
		match("`if"); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_UnrealScript

	// $ANTLR start synpred2_UnrealScript
	public final void synpred2_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1490:4: ( '`else' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1490:6: '`else'
		{
		match("`else"); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_UnrealScript

	// $ANTLR start synpred3_UnrealScript
	public final void synpred3_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1499:4: ( '`endif' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1499:6: '`endif'
		{
		match("`endif"); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_UnrealScript

	// $ANTLR start synpred4_UnrealScript
	public final void synpred4_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1508:4: ( '`define' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1508:6: '`define'
		{
		match("`define"); if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_UnrealScript

	// $ANTLR start synpred5_UnrealScript
	public final void synpred5_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1517:4: ( '`debugstate' )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1517:6: '`debugstate'
		{
		match("`debugstate"); if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_UnrealScript

	// $ANTLR start synpred6_UnrealScript
	public final void synpred6_UnrealScript_fragment() throws RecognitionException {
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1526:4: ( '`' ( WS1 )* INNERBLOCKTEXT )
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1526:6: '`' ( WS1 )* INNERBLOCKTEXT
		{
		match('`'); if (state.failed) return;
		// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:1526:10: ( WS1 )*
		loop29:
		while (true) {
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( ((LA29_0 >= '\t' && LA29_0 <= '\n')||LA29_0=='\r'||LA29_0==' ') ) {
				alt29=1;
			}

			switch (alt29) {
			case 1 :
				// C:\\Dropbox\\Programmeren\\Eclipse\\Projecten_van_Eclipse\\[Java] Zelf - UnrealScript Editor\\src\\patrick_vane_unrealscript_editor\\editors\\parser\\antlr\\UnrealScript.g:
				{
				if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
					input.consume();
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					recover(mse);
					throw mse;
				}
				}
				break;

			default :
				break loop29;
			}
		}

		mINNERBLOCKTEXT(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_UnrealScript

	public final boolean synpred6_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_UnrealScript() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_UnrealScript_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA28 dfa28 = new DFA28(this);
	static final String DFA28_eotS =
		"\1\uffff\1\71\1\uffff\1\73\1\uffff\1\75\1\100\1\103\1\106\1\111\1\114"+
		"\1\116\1\121\1\123\1\125\1\127\1\131\1\135\24\67\1\u009c\1\u009e\1\u00a0"+
		"\13\uffff\2\u00a1\32\uffff\1\u00a4\11\uffff\3\67\1\uffff\17\67\1\u00be"+
		"\15\67\1\u00cf\37\67\12\uffff\31\67\1\uffff\14\67\1\u012f\3\67\1\uffff"+
		"\7\67\1\u013b\10\67\1\u0144\7\67\1\u014e\30\67\1\u016d\14\67\1\u0179\1"+
		"\u017a\1\67\1\u017c\1\u017d\22\67\1\u0195\1\u0196\1\67\1\u0198\6\67\1"+
		"\uffff\7\67\1\u01a6\3\67\1\uffff\6\67\1\u01b0\1\67\1\uffff\11\67\1\uffff"+
		"\24\67\1\u01cf\6\67\1\u01d8\2\67\1\uffff\11\67\1\u01e4\1\67\2\uffff\1"+
		"\u01e6\2\uffff\1\u01e8\4\67\1\u01ed\21\67\2\uffff\1\u01ff\1\uffff\2\67"+
		"\1\u0202\1\u0203\1\u0204\10\67\1\uffff\1\u020d\7\67\1\u0217\1\uffff\36"+
		"\67\1\uffff\1\u0236\7\67\1\uffff\1\67\1\u023f\1\67\1\u0241\7\67\1\uffff"+
		"\1\u0249\1\uffff\1\67\1\uffff\1\u024b\1\u024c\1\67\1\u024e\1\uffff\21"+
		"\67\1\uffff\1\u0261\1\67\3\uffff\10\67\1\uffff\2\67\1\u026d\1\67\1\u026f"+
		"\1\67\1\u0271\1\u0272\1\67\1\uffff\1\u0275\21\67\1\u0287\4\67\1\u028c"+
		"\2\67\1\u028f\3\67\1\uffff\1\u0293\1\67\1\u0295\1\u0298\1\u0299\1\67\1"+
		"\u029b\1\67\1\uffff\1\67\1\uffff\1\u029e\6\67\1\uffff\1\67\2\uffff\1\67"+
		"\1\uffff\4\67\1\u02ab\15\67\1\uffff\1\u02b9\1\u02ba\3\67\1\u02be\5\67"+
		"\1\uffff\1\67\1\uffff\1\67\2\uffff\2\67\1\uffff\1\u02c8\12\67\1\u02d3"+
		"\2\67\1\u02d6\2\67\1\uffff\4\67\1\uffff\2\67\1\uffff\3\67\1\uffff\1\67"+
		"\1\uffff\2\67\2\uffff\1\67\1\uffff\1\67\1\u02e7\1\uffff\2\67\1\u02e9\4"+
		"\67\1\u02ee\1\67\1\uffff\2\67\1\uffff\1\u02f2\7\67\1\u02fa\4\67\2\uffff"+
		"\1\u02ff\2\67\1\uffff\2\67\1\u0304\2\67\1\u0307\3\67\1\uffff\1\u030c\1"+
		"\u030d\4\67\1\u0313\1\u0314\2\67\1\uffff\2\67\1\uffff\1\u0319\1\67\1\u031b"+
		"\2\67\1\u031e\4\67\1\u0323\5\67\1\uffff\1\67\1\uffff\4\67\1\uffff\3\67"+
		"\1\uffff\1\u0331\4\67\1\u0336\1\67\1\uffff\4\67\1\uffff\2\67\1\u033f\1"+
		"\67\1\uffff\1\u0341\1\u0342\1\uffff\1\67\1\u0344\2\67\2\uffff\5\67\2\uffff"+
		"\1\67\1\u034d\2\67\1\uffff\1\u0351\1\uffff\1\67\1\u0353\1\uffff\3\67\1"+
		"\u0357\1\uffff\3\67\1\u035b\4\67\1\u0360\4\67\1\uffff\1\u0365\2\67\1\u0368"+
		"\1\uffff\1\67\1\u036c\1\u036d\5\67\1\uffff\1\u0373\2\uffff\1\67\1\uffff"+
		"\10\67\1\uffff\3\67\1\uffff\1\67\1\uffff\3\67\1\uffff\3\67\1\uffff\1\u0387"+
		"\3\67\1\uffff\2\67\1\u038d\1\67\1\uffff\2\67\1\uffff\3\67\2\uffff\1\u0394"+
		"\4\67\1\uffff\1\u0399\11\67\1\u03a3\1\67\1\u03a5\1\u03a6\5\67\1\uffff"+
		"\5\67\1\uffff\6\67\1\uffff\1\67\1\u03b7\2\67\1\uffff\3\67\1\u03bd\2\67"+
		"\1\u03c0\1\67\1\u03c2\1\uffff\1\67\2\uffff\2\67\1\u03c6\2\67\1\u03c9\6"+
		"\67\1\u03d0\1\u03d1\1\u03d2\1\u03d3\1\uffff\5\67\1\uffff\1\67\1\u03da"+
		"\1\uffff\1\67\1\uffff\1\67\1\u03dd\1\67\1\uffff\2\67\1\uffff\6\67\4\uffff"+
		"\1\u03e7\2\67\1\u03ea\2\67\1\uffff\1\67\1\u03ee\1\uffff\1\u03ef\1\67\1"+
		"\uffff\6\67\1\uffff\2\67\1\uffff\2\67\1\u03fb\2\uffff\1\67\1\u03fd\7\67"+
		"\1\u0405\1\u0406\1\uffff\1\67\1\uffff\1\67\1\u0409\1\u040a\3\67\1\u040e"+
		"\2\uffff\1\67\1\u0410\2\uffff\1\67\1\u0412\1\67\1\uffff\1\67\1\uffff\1"+
		"\67\1\uffff\1\u0416\2\67\1\uffff\3\67\1\u041c\1\67\1\uffff\1\u041e\1\uffff";
	static final String DFA28_eofS =
		"\u041f\uffff";
	static final String DFA28_minS =
		"\1\11\1\75\1\uffff\1\75\1\uffff\1\46\1\52\1\53\1\55\1\52\1\74\2\75\1\55"+
		"\1\75\1\42\1\136\1\11\1\142\1\157\2\141\1\144\1\141\1\154\1\151\1\146"+
		"\1\62\2\141\1\160\2\145\1\141\1\162\1\156\1\141\1\150\1\174\1\75\1\0\13"+
		"\uffff\2\56\32\uffff\1\76\11\uffff\1\146\1\154\1\145\1\uffff\1\163\1\154"+
		"\1\162\1\157\1\164\1\157\1\145\1\164\1\163\1\141\1\145\1\157\1\160\1\164"+
		"\1\146\1\60\1\160\1\146\1\163\1\165\2\145\1\154\1\156\1\157\1\162\1\156"+
		"\1\157\1\144\1\60\1\156\1\155\1\150\1\145\1\143\1\164\1\143\1\155\1\167"+
		"\1\143\1\145\1\164\1\162\1\141\1\151\1\145\1\142\1\154\1\146\1\162\1\157"+
		"\1\155\1\151\1\141\1\151\1\141\3\162\1\151\1\164\12\uffff\1\0\1\163\1"+
		"\144\1\142\1\164\1\157\1\141\1\155\1\157\1\154\1\141\2\145\1\163\1\145"+
		"\1\162\1\154\1\146\1\163\1\164\2\141\2\145\1\164\1\uffff\1\154\1\151\1"+
		"\164\1\145\1\155\1\156\1\143\1\157\1\145\1\163\2\141\1\60\1\143\1\142"+
		"\1\145\1\uffff\1\157\1\165\1\154\1\145\1\164\1\165\1\164\1\60\1\162\1"+
		"\141\1\166\1\165\1\145\1\141\1\145\1\151\1\60\1\154\1\170\1\155\1\164"+
		"\1\145\1\162\1\151\1\60\1\157\1\143\1\156\1\164\1\157\1\166\1\160\1\154"+
		"\1\151\1\154\1\165\1\145\1\151\1\167\1\165\1\147\1\160\1\164\1\151\1\164"+
		"\1\156\2\145\1\151\1\60\1\164\1\154\1\150\1\0\1\145\2\151\1\165\1\162"+
		"\1\167\1\171\1\151\2\60\1\153\2\60\1\163\1\156\1\143\1\141\1\151\1\164"+
		"\1\151\1\163\1\145\1\142\1\165\1\147\1\156\1\145\1\143\1\151\1\156\1\143"+
		"\2\60\1\164\1\60\1\162\1\156\1\145\1\154\1\164\1\141\1\uffff\1\164\1\141"+
		"\1\143\1\162\1\164\1\145\1\162\1\60\1\164\1\141\1\162\1\uffff\1\141\1"+
		"\154\1\145\1\162\1\156\1\154\1\60\1\166\1\uffff\1\145\2\160\1\162\1\144"+
		"\1\157\1\154\1\141\1\157\1\uffff\1\142\1\145\1\164\1\157\1\160\1\141\2"+
		"\145\1\151\1\141\1\151\1\157\1\145\2\162\1\141\1\145\1\143\1\154\1\165"+
		"\1\60\1\145\3\143\1\163\1\145\1\60\2\154\1\uffff\1\165\1\145\1\151\1\0"+
		"\1\146\1\156\1\147\2\141\1\60\1\143\2\uffff\1\60\2\uffff\1\60\1\164\1"+
		"\145\1\160\1\147\1\60\1\156\1\154\1\170\1\151\1\154\1\141\1\144\1\143"+
		"\1\157\1\143\1\144\1\157\2\151\1\156\1\162\1\145\2\uffff\1\60\1\uffff"+
		"\1\164\1\144\3\60\1\143\1\151\1\154\1\141\1\145\1\141\1\155\1\151\1\uffff"+
		"\1\60\1\156\1\146\1\164\1\154\1\162\1\145\1\164\1\60\1\uffff\1\145\1\141"+
		"\2\157\1\141\1\151\1\162\1\141\1\164\1\156\1\152\1\141\1\145\1\160\1\145"+
		"\1\164\1\162\2\143\1\142\1\143\2\164\1\156\1\145\1\154\1\162\2\141\1\154"+
		"\1\uffff\1\60\1\143\1\164\1\147\1\164\1\150\1\151\1\154\1\uffff\1\151"+
		"\1\60\1\141\1\60\1\156\2\0\1\145\1\163\1\143\1\142\1\uffff\1\60\1\uffff"+
		"\1\162\1\uffff\2\60\1\163\1\60\1\uffff\1\165\1\145\1\164\1\156\2\164\1"+
		"\163\1\141\1\154\2\141\1\156\1\170\1\144\1\154\1\157\1\170\1\uffff\1\60"+
		"\1\163\3\uffff\1\150\1\157\1\143\1\164\1\163\1\142\1\145\1\164\1\uffff"+
		"\1\143\1\141\1\60\1\157\1\60\1\162\2\60\1\172\1\uffff\1\60\3\162\1\156"+
		"\1\164\2\143\1\157\1\141\1\145\1\142\1\162\1\145\1\162\1\145\2\164\1\60"+
		"\1\154\1\141\1\151\1\162\1\60\1\160\1\151\1\60\2\164\1\141\1\uffff\1\60"+
		"\1\143\3\60\1\145\1\60\1\141\1\uffff\1\154\1\uffff\1\60\2\0\2\164\1\163"+
		"\1\150\1\uffff\1\157\2\uffff\1\145\1\uffff\1\145\1\166\1\11\1\144\1\60"+
		"\1\145\1\157\1\164\1\154\1\164\1\142\1\163\2\145\1\151\1\156\2\164\1\uffff"+
		"\2\60\1\156\1\157\1\145\1\60\1\154\1\156\1\163\1\145\1\143\1\uffff\1\162"+
		"\1\uffff\1\162\2\uffff\2\145\1\uffff\1\60\2\164\1\163\1\151\1\157\1\145"+
		"\1\162\1\154\1\143\1\154\1\60\1\162\1\141\1\60\1\171\1\145\1\uffff\1\145"+
		"\1\164\1\146\1\171\1\uffff\1\154\1\172\1\uffff\2\145\1\162\1\uffff\1\157"+
		"\1\uffff\1\145\1\160\2\uffff\1\156\1\uffff\1\142\1\60\1\uffff\1\0\1\141"+
		"\1\60\1\164\1\145\1\165\1\143\1\60\1\145\1\uffff\1\151\1\162\1\uffff\1"+
		"\60\1\156\1\145\1\141\1\145\1\154\1\164\1\144\1\60\1\156\1\154\1\142\1"+
		"\162\2\uffff\1\60\1\156\1\147\1\uffff\1\145\1\164\1\60\1\144\1\145\1\60"+
		"\1\151\1\144\1\160\1\uffff\2\60\1\141\2\156\1\141\2\60\1\164\1\145\1\uffff"+
		"\1\141\1\164\1\uffff\1\60\1\144\1\60\1\151\1\171\1\60\1\141\1\145\1\147"+
		"\1\144\1\60\1\156\1\146\1\160\1\164\1\154\1\uffff\1\164\1\uffff\1\162"+
		"\1\156\1\160\1\141\1\uffff\1\154\1\156\1\157\1\uffff\1\60\1\144\1\160"+
		"\1\164\1\145\1\60\1\163\1\uffff\1\145\1\171\1\157\1\165\1\uffff\1\146"+
		"\1\157\1\60\1\163\1\uffff\2\60\1\uffff\1\144\1\60\1\154\1\145\2\uffff"+
		"\1\143\1\145\1\154\1\163\1\142\2\uffff\1\143\1\60\1\164\1\157\1\uffff"+
		"\1\60\1\uffff\1\157\1\60\1\uffff\1\143\1\164\1\157\1\60\1\uffff\1\146"+
		"\1\141\1\164\1\60\2\145\1\141\1\143\1\60\1\164\1\160\1\147\1\160\1\uffff"+
		"\1\60\1\163\1\162\1\60\1\uffff\1\151\2\60\1\170\1\143\1\151\1\162\1\150"+
		"\1\uffff\1\60\2\uffff\1\145\1\uffff\1\151\1\141\1\164\1\156\1\151\1\157"+
		"\1\154\1\157\1\uffff\1\157\2\162\1\uffff\1\156\1\uffff\2\145\1\162\1\uffff"+
		"\1\151\1\165\1\145\1\uffff\1\60\1\0\1\143\1\157\1\uffff\1\145\1\141\1"+
		"\60\1\145\1\uffff\1\145\1\141\1\uffff\1\172\1\145\1\163\2\uffff\1\60\1"+
		"\164\1\147\1\151\1\145\1\uffff\1\60\1\143\1\144\1\151\1\164\1\156\1\154"+
		"\1\145\1\156\1\162\1\60\1\151\2\60\1\170\1\151\1\147\1\154\1\170\1\uffff"+
		"\1\0\1\164\1\157\1\147\1\163\1\uffff\1\162\1\143\1\156\1\145\1\167\1\145"+
		"\1\uffff\1\163\1\60\1\145\1\156\1\uffff\1\141\1\145\1\157\1\60\2\145\1"+
		"\60\1\146\1\60\1\uffff\1\164\2\uffff\1\164\1\145\1\60\2\164\1\60\1\153"+
		"\1\157\1\163\1\164\1\141\1\163\4\60\1\uffff\1\163\1\143\1\164\1\162\1"+
		"\156\1\uffff\1\156\1\60\1\uffff\1\151\1\uffff\1\145\1\60\1\163\1\uffff"+
		"\1\160\1\11\1\uffff\1\145\1\162\2\151\1\164\1\151\4\uffff\1\60\1\157\1"+
		"\151\1\60\1\141\1\145\1\uffff\1\147\1\60\1\uffff\1\60\1\162\1\uffff\1"+
		"\144\1\151\1\166\3\145\1\uffff\2\157\1\uffff\1\154\1\167\1\60\2\uffff"+
		"\1\157\1\60\2\145\1\163\1\147\1\156\1\153\1\156\2\60\1\uffff\1\160\1\uffff"+
		"\1\163\2\60\1\157\1\164\1\145\1\60\2\uffff\1\145\1\60\2\uffff\1\162\1"+
		"\60\1\144\1\uffff\1\162\1\uffff\1\151\1\uffff\1\60\1\164\1\145\1\uffff"+
		"\1\151\1\163\1\145\1\60\1\163\1\uffff\1\60\1\uffff";
	static final String DFA28_maxS =
		"\1\176\1\75\1\uffff\1\75\1\uffff\1\46\6\75\1\76\1\55\1\75\1\164\1\136"+
		"\1\173\1\165\1\171\1\162\1\165\1\170\1\165\1\154\1\151\1\164\1\62\2\157"+
		"\2\165\1\145\1\167\1\162\1\156\2\151\1\174\1\75\1\uffff\13\uffff\2\71"+
		"\32\uffff\1\76\11\uffff\1\146\1\156\1\145\1\uffff\1\163\1\154\1\162\1"+
		"\157\1\164\1\157\1\145\1\164\1\163\1\151\1\156\1\157\1\160\1\164\1\160"+
		"\1\172\1\160\1\151\1\163\1\165\1\145\1\164\1\154\1\156\1\157\1\162\1\156"+
		"\1\157\1\144\1\172\1\156\1\160\1\164\1\145\1\160\1\164\1\143\1\164\1\167"+
		"\3\164\1\162\1\141\1\163\1\157\1\142\1\164\1\146\1\162\1\157\1\156\1\151"+
		"\1\162\1\151\1\165\1\164\2\162\1\151\1\164\12\uffff\1\uffff\1\163\1\144"+
		"\1\146\1\164\1\157\1\141\1\155\1\157\1\154\1\141\2\145\1\163\1\145\1\162"+
		"\1\154\1\164\1\163\1\164\2\141\1\145\1\162\1\164\1\uffff\1\154\1\151\1"+
		"\164\1\145\1\155\1\156\1\143\1\157\1\145\1\163\2\141\1\172\1\143\1\142"+
		"\1\145\1\uffff\1\157\1\165\1\154\1\145\1\164\1\165\1\164\1\172\1\162\1"+
		"\141\1\166\1\165\1\145\1\141\1\145\1\151\1\172\1\154\1\170\1\155\1\164"+
		"\1\160\1\162\1\151\1\172\1\157\1\143\1\156\1\164\1\157\1\166\1\164\1\154"+
		"\1\151\1\162\1\165\1\145\1\166\1\167\1\165\1\147\1\160\1\164\1\165\1\164"+
		"\1\166\2\145\1\151\1\172\1\164\1\154\1\150\1\uffff\1\145\2\151\1\165\1"+
		"\162\1\167\1\171\1\151\2\172\1\153\2\172\1\163\1\156\1\143\1\141\1\151"+
		"\1\164\1\151\1\163\1\145\1\142\1\165\1\147\1\156\1\145\1\143\1\151\1\156"+
		"\1\164\2\172\1\164\1\172\1\162\1\156\1\145\1\154\1\164\1\141\1\uffff\1"+
		"\164\1\141\1\143\1\162\1\164\1\145\1\162\1\172\1\164\1\141\1\162\1\uffff"+
		"\1\141\1\154\1\145\1\162\1\156\1\154\1\172\1\166\1\uffff\1\145\2\160\1"+
		"\162\1\144\1\157\1\154\1\141\1\157\1\uffff\1\142\1\145\1\164\1\157\1\160"+
		"\1\141\2\145\1\151\1\141\1\151\1\157\1\145\2\162\1\141\1\145\1\143\1\154"+
		"\1\165\1\172\1\151\1\156\2\143\1\163\1\145\1\172\2\154\1\uffff\1\165\1"+
		"\145\1\151\1\uffff\1\146\1\156\1\147\2\141\1\172\1\143\2\uffff\1\172\2"+
		"\uffff\1\172\1\164\1\145\1\160\1\147\1\172\1\156\1\154\1\170\1\151\1\154"+
		"\1\141\1\144\1\143\1\157\1\143\1\144\1\157\2\151\1\156\1\162\1\145\2\uffff"+
		"\1\172\1\uffff\1\164\1\144\3\172\1\143\1\151\1\154\1\141\1\145\1\141\1"+
		"\155\1\151\1\uffff\1\172\1\156\1\160\1\164\1\154\1\162\1\145\1\164\1\172"+
		"\1\uffff\1\145\1\141\2\157\1\141\1\151\1\162\1\141\1\164\1\156\1\152\1"+
		"\141\1\145\1\160\1\145\1\164\1\162\2\143\1\142\1\143\2\164\1\156\1\145"+
		"\1\154\1\162\2\141\1\154\1\uffff\1\172\1\143\1\164\1\147\1\164\1\150\1"+
		"\151\1\154\1\uffff\1\151\1\172\1\141\1\172\1\156\2\uffff\1\145\1\163\1"+
		"\143\1\142\1\uffff\1\172\1\uffff\1\162\1\uffff\2\172\1\163\1\172\1\uffff"+
		"\1\165\1\145\1\164\1\156\2\164\1\163\1\141\1\154\2\141\1\156\1\170\1\144"+
		"\1\154\1\157\1\170\1\uffff\1\172\1\163\3\uffff\1\150\1\157\1\143\1\164"+
		"\1\163\1\142\1\145\1\164\1\uffff\1\143\1\141\1\172\1\157\1\172\1\162\3"+
		"\172\1\uffff\1\172\3\162\1\156\1\164\2\143\1\157\1\141\1\145\1\142\1\162"+
		"\1\145\1\162\1\145\2\164\1\172\1\154\1\141\1\151\1\162\1\172\1\160\1\151"+
		"\1\172\2\164\1\141\1\uffff\1\172\1\143\3\172\1\145\1\172\1\141\1\uffff"+
		"\1\154\1\uffff\1\172\2\uffff\2\164\1\163\1\150\1\uffff\1\157\2\uffff\1"+
		"\145\1\uffff\1\145\1\166\1\173\1\144\1\172\1\145\1\157\1\164\1\154\1\164"+
		"\1\142\1\163\2\145\1\151\1\156\2\164\1\uffff\2\172\1\156\1\157\1\145\1"+
		"\172\1\154\1\156\1\163\1\145\1\143\1\uffff\1\162\1\uffff\1\162\2\uffff"+
		"\2\145\1\uffff\1\172\2\164\1\163\1\151\1\157\1\145\1\162\1\154\1\143\1"+
		"\154\1\172\1\162\1\141\1\172\1\171\1\145\1\uffff\1\145\1\164\1\146\1\171"+
		"\1\uffff\1\154\1\172\1\uffff\2\145\1\162\1\uffff\1\157\1\uffff\1\145\1"+
		"\160\2\uffff\1\156\1\uffff\1\142\1\172\1\uffff\1\uffff\1\141\1\172\1\164"+
		"\1\145\1\165\1\143\1\172\1\145\1\uffff\1\151\1\162\1\uffff\1\172\1\156"+
		"\1\145\1\141\1\145\1\154\1\164\1\144\1\172\1\156\1\154\1\142\1\162\2\uffff"+
		"\1\172\1\156\1\147\1\uffff\1\145\1\164\1\172\1\144\1\145\1\172\1\151\1"+
		"\144\1\160\1\uffff\2\172\1\151\2\156\1\141\2\172\1\164\1\145\1\uffff\1"+
		"\141\1\164\1\uffff\1\172\1\144\1\172\1\151\1\171\1\172\1\141\1\145\1\147"+
		"\1\144\1\172\1\156\1\146\1\160\1\164\1\154\1\uffff\1\164\1\uffff\1\162"+
		"\1\156\1\160\1\141\1\uffff\1\154\1\156\1\157\1\uffff\1\172\1\144\1\160"+
		"\1\164\1\145\1\172\1\163\1\uffff\1\145\1\171\1\157\1\165\1\uffff\1\146"+
		"\1\157\1\172\1\163\1\uffff\2\172\1\uffff\1\144\1\172\1\154\1\145\2\uffff"+
		"\1\143\1\145\1\154\1\163\1\142\2\uffff\1\143\1\172\1\164\1\157\1\uffff"+
		"\1\172\1\uffff\1\157\1\172\1\uffff\1\143\1\164\1\157\1\172\1\uffff\1\146"+
		"\1\141\1\164\1\172\2\145\1\141\1\143\1\172\1\164\1\160\1\147\1\160\1\uffff"+
		"\1\172\1\163\1\162\1\172\1\uffff\1\151\2\172\1\170\1\143\1\151\1\162\1"+
		"\150\1\uffff\1\172\2\uffff\1\145\1\uffff\1\151\1\141\1\164\1\156\1\151"+
		"\1\157\1\154\1\157\1\uffff\1\157\2\162\1\uffff\1\156\1\uffff\2\145\1\162"+
		"\1\uffff\1\151\1\165\1\145\1\uffff\1\172\1\uffff\1\143\1\157\1\uffff\1"+
		"\145\1\141\1\172\1\145\1\uffff\1\145\1\141\1\uffff\1\172\1\145\1\163\2"+
		"\uffff\1\172\1\164\1\147\1\151\1\145\1\uffff\1\172\1\143\1\144\1\151\1"+
		"\164\1\156\1\154\1\145\1\156\1\162\1\172\1\151\2\172\1\170\1\151\1\147"+
		"\1\154\1\170\1\uffff\1\uffff\1\164\1\157\1\147\1\163\1\uffff\1\162\1\143"+
		"\1\156\1\145\1\167\1\145\1\uffff\1\163\1\172\1\145\1\156\1\uffff\1\141"+
		"\1\145\1\157\1\172\2\145\1\172\1\146\1\172\1\uffff\1\164\2\uffff\1\164"+
		"\1\145\1\172\2\164\1\172\1\153\1\157\1\163\1\164\1\141\1\163\4\172\1\uffff"+
		"\1\163\1\143\1\164\1\162\1\156\1\uffff\1\156\1\172\1\uffff\1\151\1\uffff"+
		"\1\145\1\172\1\163\1\uffff\1\160\1\173\1\uffff\1\145\1\162\2\151\1\164"+
		"\1\151\4\uffff\1\172\1\157\1\151\1\172\1\141\1\145\1\uffff\1\147\1\172"+
		"\1\uffff\1\172\1\162\1\uffff\1\144\1\151\1\166\3\145\1\uffff\2\157\1\uffff"+
		"\1\154\1\167\1\172\2\uffff\1\157\1\172\2\145\1\163\1\147\1\156\1\153\1"+
		"\156\2\172\1\uffff\1\160\1\uffff\1\163\2\172\1\157\1\164\1\145\1\172\2"+
		"\uffff\1\145\1\172\2\uffff\1\162\1\172\1\144\1\uffff\1\162\1\uffff\1\151"+
		"\1\uffff\1\172\1\164\1\145\1\uffff\1\151\1\163\1\145\1\172\1\163\1\uffff"+
		"\1\172\1\uffff";
	static final String DFA28_acceptS =
		"\2\uffff\1\3\1\uffff\1\6\44\uffff\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00aa"+
		"\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\2\uffff\1\u00b8\1\u00b9"+
		"\1\2\1\1\1\5\1\4\1\7\1\10\1\12\1\13\1\11\1\15\1\16\1\14\1\20\1\21\1\17"+
		"\1\23\1\u00ba\1\22\1\24\1\25\1\u00a8\1\26\1\u00b2\1\27\1\uffff\1\u00a9"+
		"\1\33\1\32\1\35\1\34\1\u00b7\1\36\1\40\1\37\3\uffff\1\41\75\uffff\1\u00a0"+
		"\1\u009f\1\u00a2\1\u00a1\1\u00a3\1\u00b1\1\u00b3\1\u00b4\1\31\1\30\31"+
		"\uffff\1\73\20\uffff\1\126\137\uffff\1\121\13\uffff\1\137\10\uffff\1\154"+
		"\11\uffff\1\170\36\uffff\1\u009b\13\uffff\1\47\1\50\1\uffff\1\52\1\53"+
		"\27\uffff\1\107\1\110\1\uffff\1\112\15\uffff\1\134\11\uffff\1\151\36\uffff"+
		"\1\u008e\10\uffff\1\u0098\13\uffff\1\44\1\uffff\1\51\1\uffff\1\54\4\uffff"+
		"\1\62\21\uffff\1\111\2\uffff\1\116\1\117\1\120\10\uffff\1\135\11\uffff"+
		"\1\147\36\uffff\1\u008f\10\uffff\1\u009a\1\uffff\1\u009d\7\uffff\1\45"+
		"\1\uffff\1\56\1\57\1\uffff\1\61\22\uffff\1\113\13\uffff\1\141\1\uffff"+
		"\1\143\1\uffff\1\145\1\146\2\uffff\1\152\21\uffff\1\u0082\4\uffff\1\u0087"+
		"\2\uffff\1\u008a\3\uffff\1\u0090\1\uffff\1\u0092\2\uffff\1\u0093\1\u0095"+
		"\1\uffff\1\u0097\2\uffff\1\u009e\11\uffff\1\u00b6\2\uffff\1\66\15\uffff"+
		"\1\115\1\122\3\uffff\1\127\11\uffff\1\155\12\uffff\1\173\2\uffff\1\176"+
		"\20\uffff\1\u009c\1\uffff\1\42\4\uffff\1\63\3\uffff\1\70\7\uffff\1\101"+
		"\4\uffff\1\123\4\uffff\1\133\2\uffff\1\142\4\uffff\1\156\1\160\5\uffff"+
		"\1\166\1\167\4\uffff\1\177\1\uffff\1\u0083\2\uffff\1\u0086\4\uffff\1\u008d"+
		"\15\uffff\1\71\4\uffff\1\77\10\uffff\1\130\1\uffff\1\136\1\140\1\uffff"+
		"\1\150\10\uffff\1\172\3\uffff\1\u0080\1\uffff\1\u0085\3\uffff\1\u008c"+
		"\3\uffff\1\u0096\4\uffff\1\55\4\uffff\1\72\2\uffff\1\76\3\uffff\1\102"+
		"\1\105\5\uffff\1\132\23\uffff\1\u0099\5\uffff\1\65\6\uffff\1\106\4\uffff"+
		"\1\144\11\uffff\1\175\1\uffff\1\u0084\1\u0088\20\uffff\1\124\5\uffff\1"+
		"\162\2\uffff\1\165\1\uffff\1\174\3\uffff\1\u0091\2\uffff\1\43\6\uffff"+
		"\1\100\1\103\1\104\1\114\6\uffff\1\164\2\uffff\1\u0089\2\uffff\1\u00b5"+
		"\6\uffff\1\125\2\uffff\1\157\3\uffff\1\u0081\1\u008b\13\uffff\1\171\1"+
		"\uffff\1\46\7\uffff\1\161\1\163\2\uffff\1\64\1\67\3\uffff\1\153\1\uffff"+
		"\1\60\1\uffff\1\75\3\uffff\1\131\5\uffff\1\74\1\uffff\1\u0094";
	static final String DFA28_specialS =
		"\50\uffff\1\3\174\uffff\1\10\137\uffff\1\6\153\uffff\1\11\154\uffff\1"+
		"\5\1\0\143\uffff\1\12\1\1\132\uffff\1\7\u00bd\uffff\1\4\52\uffff\1\2\u0096"+
		"\uffff}>";
	static final String[] DFA28_transitionS = {
			"\2\66\2\uffff\1\66\22\uffff\1\66\1\1\1\50\1\2\1\3\1\4\1\5\1\63\1\53\1"+
			"\54\1\6\1\7\1\62\1\10\1\61\1\11\1\64\11\65\1\52\1\51\1\12\1\13\1\14\1"+
			"\15\1\16\32\67\1\57\1\17\1\60\1\20\1\67\1\21\1\22\1\23\1\24\1\25\1\26"+
			"\1\27\1\30\1\31\1\32\1\67\1\33\1\34\1\67\1\35\1\36\1\37\1\67\1\40\1\41"+
			"\1\42\1\43\1\44\1\45\3\67\1\55\1\46\1\56\1\47",
			"\1\70",
			"",
			"\1\72",
			"",
			"\1\74",
			"\1\76\22\uffff\1\77",
			"\1\101\21\uffff\1\102",
			"\1\104\17\uffff\1\105",
			"\1\110\4\uffff\1\110\15\uffff\1\107",
			"\1\112\1\113",
			"\1\115",
			"\1\117\1\120",
			"\1\122",
			"\1\124",
			"\1\126\4\uffff\1\126\64\uffff\1\126\3\uffff\1\126\1\uffff\1\126\3\uffff"+
			"\1\126\7\uffff\1\126\3\uffff\1\126\1\uffff\1\126",
			"\1\130",
			"\2\110\2\uffff\1\110\22\uffff\1\110\40\uffff\32\67\4\uffff\1\67\1\uffff"+
			"\3\67\1\134\1\133\3\67\1\132\21\67\1\110",
			"\1\136\11\uffff\1\137\5\uffff\1\140\1\uffff\1\141\1\142",
			"\1\143\2\uffff\1\144\6\uffff\1\145",
			"\1\146\12\uffff\1\147\2\uffff\1\150\1\152\1\uffff\1\151",
			"\1\153\3\uffff\1\154\11\uffff\1\155\5\uffff\1\156",
			"\1\157\7\uffff\1\160\1\uffff\1\161\7\uffff\1\162\1\uffff\1\163",
			"\1\164\7\uffff\1\165\2\uffff\1\166\2\uffff\1\167\5\uffff\1\170",
			"\1\171",
			"\1\172",
			"\1\173\1\174\5\uffff\1\175\1\176\5\uffff\1\177",
			"\1\u0080",
			"\1\u0081\15\uffff\1\u0082",
			"\1\u0083\3\uffff\1\u0084\11\uffff\1\u0085",
			"\1\u0086\4\uffff\1\u0087",
			"\1\u0088\6\uffff\1\u0089\2\uffff\1\u008a\2\uffff\1\u008b\2\uffff\1\u008c",
			"\1\u008d",
			"\1\u008e\3\uffff\1\u008f\2\uffff\1\u0090\1\u0091\1\uffff\1\u0092\10"+
			"\uffff\1\u0093\2\uffff\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097\7\uffff\1\u0098",
			"\1\u0099\1\u009a",
			"\1\u009b",
			"\1\u009d",
			"\12\u009f\1\uffff\2\u009f\1\uffff\ufff2\u009f",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00a2\1\uffff\12\65",
			"\1\u00a2\1\uffff\12\65",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00a3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00a5",
			"\1\u00a6\1\uffff\1\u00a7",
			"\1\u00a8",
			"",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2\7\uffff\1\u00b3",
			"\1\u00b4\6\uffff\1\u00b5\1\uffff\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba\5\uffff\1\u00bb\3\uffff\1\u00bc",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\15\67\1\u00bd\14\67",
			"\1\u00bf",
			"\1\u00c0\2\uffff\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5\12\uffff\1\u00c6\3\uffff\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u00d0",
			"\1\u00d1\2\uffff\1\u00d2",
			"\1\u00d3\1\u00d4\6\uffff\1\u00d5\2\uffff\1\u00d6\1\u00d7",
			"\1\u00d8",
			"\1\u00d9\13\uffff\1\u00da\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de\6\uffff\1\u00df",
			"\1\u00e0",
			"\1\u00e1\1\uffff\1\u00e2\3\uffff\1\u00e3\4\uffff\1\u00e4\5\uffff\1\u00e5",
			"\1\u00e6\16\uffff\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb\11\uffff\1\u00ec",
			"\1\u00ed\3\uffff\1\u00ee\5\uffff\1\u00ef",
			"\1\u00f0",
			"\1\u00f1\3\uffff\1\u00f2\3\uffff\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7\1\u00f8",
			"\1\u00f9",
			"\1\u00fa\20\uffff\1\u00fb",
			"\1\u00fc",
			"\1\u00fd\23\uffff\1\u00fe",
			"\1\u00ff\1\uffff\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\60\110\12\u0105\7\110\32\u0105\4\110\1\u0105\1\110\32\u0105\uff85\110",
			"\1\u0106",
			"\1\u0107",
			"\1\u0109\3\uffff\1\u0108",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"\1\u0117\14\uffff\1\u0118\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f\14\uffff\1\u0120",
			"\1\u0121",
			"",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u012e\25\67",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u013a\25\67",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149\1\u014a\11\uffff\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155\3\uffff\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159\1\uffff\1\u015a\3\uffff\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e\14\uffff\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165\13\uffff\1\u0166",
			"\1\u0167",
			"\1\u0168\7\uffff\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\60\110\12\u0105\7\110\32\u0105\4\110\1\u0105\1\110\32\u0105\uff85\110",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u017b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c",
			"\1\u018d",
			"\1\u018e",
			"\1\u018f\2\uffff\1\u0190\1\uffff\1\u0191\1\u0192\5\uffff\1\u0193\4\uffff"+
			"\1\u0194",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0197",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"",
			"\1\u019f",
			"\1\u01a0",
			"\1\u01a1",
			"\1\u01a2",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01b1",
			"",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b7",
			"\1\u01b8",
			"\1\u01b9",
			"\1\u01ba",
			"",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01bf",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01d0\3\uffff\1\u01d1",
			"\1\u01d2\12\uffff\1\u01d3",
			"\1\u01d4",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01d9",
			"\1\u01da",
			"",
			"\1\u01db",
			"\1\u01dc",
			"\1\u01dd",
			"\60\110\12\u01de\7\110\32\u01de\4\110\1\u01de\1\110\32\u01de\uff85\110",
			"\1\u01df",
			"\1\u01e0",
			"\1\u01e1",
			"\1\u01e2",
			"\1\u01e3",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01e5",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\6\67\1\u01e7\23\67",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb",
			"\1\u01ec",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01ee",
			"\1\u01ef",
			"\1\u01f0",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0200",
			"\1\u0201",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
			"\1\u020c",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u020e",
			"\1\u020f\11\uffff\1\u0210",
			"\1\u0211",
			"\1\u0212",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\10\67\1\u0216\21\67",
			"",
			"\1\u0218",
			"\1\u0219",
			"\1\u021a",
			"\1\u021b",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"\1\u0223",
			"\1\u0224",
			"\1\u0225",
			"\1\u0226",
			"\1\u0227",
			"\1\u0228",
			"\1\u0229",
			"\1\u022a",
			"\1\u022b",
			"\1\u022c",
			"\1\u022d",
			"\1\u022e",
			"\1\u022f",
			"\1\u0230",
			"\1\u0231",
			"\1\u0232",
			"\1\u0233",
			"\1\u0234",
			"\1\u0235",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0237",
			"\1\u0238",
			"\1\u0239",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"",
			"\1\u023e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0240",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0242",
			"\60\110\12\u01de\7\110\32\u01de\4\110\1\u01de\1\110\32\u01de\uff85\110",
			"\60\110\12\u0243\7\110\32\u0243\4\110\1\u0243\1\110\32\u0243\uff85\110",
			"\1\u0244",
			"\1\u0245",
			"\1\u0246",
			"\1\u0247",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\26\67\1\u0248\3\67",
			"",
			"\1\u024a",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u024d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u024f",
			"\1\u0250",
			"\1\u0251",
			"\1\u0252",
			"\1\u0253",
			"\1\u0254",
			"\1\u0255",
			"\1\u0256",
			"\1\u0257",
			"\1\u0258",
			"\1\u0259",
			"\1\u025a",
			"\1\u025b",
			"\1\u025c",
			"\1\u025d",
			"\1\u025e",
			"\1\u025f",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\22\67\1\u0260\7\67",
			"\1\u0262",
			"",
			"",
			"",
			"\1\u0263",
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\u0267",
			"\1\u0268",
			"\1\u0269",
			"\1\u026a",
			"",
			"\1\u026b",
			"\1\u026c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u026e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0270",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0273",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\21\67\1\u0274\10\67",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\1\u027d",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0288",
			"\1\u0289",
			"\1\u028a",
			"\1\u028b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u028d",
			"\1\u028e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0290",
			"\1\u0291",
			"\1\u0292",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0294",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\2\67\1\u0297\1\u0296\26\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u029a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u029c",
			"",
			"\1\u029d",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\60\110\12\u0243\7\110\32\u0243\4\110\1\u0243\1\110\32\u0243\uff85\110",
			"\60\110\12\u029f\7\110\32\u029f\4\110\1\u029f\1\110\32\u029f\uff85\110",
			"\1\u02a0",
			"\1\u02a1",
			"\1\u02a2",
			"\1\u02a3",
			"",
			"\1\u02a4",
			"",
			"",
			"\1\u02a5",
			"",
			"\1\u02a6",
			"\1\u02a7",
			"\2\u02a8\2\uffff\1\u02a8\22\uffff\1\u02a8\132\uffff\1\u02a8",
			"\1\u02a9",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\17\67\1\u02aa\12\67",
			"\1\u02ac",
			"\1\u02ad",
			"\1\u02ae",
			"\1\u02af",
			"\1\u02b0",
			"\1\u02b1",
			"\1\u02b2",
			"\1\u02b3",
			"\1\u02b4",
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\1\u02b8",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02bb",
			"\1\u02bc",
			"\1\u02bd",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02bf",
			"\1\u02c0",
			"\1\u02c1",
			"\1\u02c2",
			"\1\u02c3",
			"",
			"\1\u02c4",
			"",
			"\1\u02c5",
			"",
			"",
			"\1\u02c6",
			"\1\u02c7",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02c9",
			"\1\u02ca",
			"\1\u02cb",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"\1\u02d2",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02d4",
			"\1\u02d5",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02d7",
			"\1\u02d8",
			"",
			"\1\u02d9",
			"\1\u02da",
			"\1\u02db",
			"\1\u02dc",
			"",
			"\1\u02dd",
			"\1\u02de",
			"",
			"\1\u02df",
			"\1\u02e0",
			"\1\u02e1",
			"",
			"\1\u02e2",
			"",
			"\1\u02e3",
			"\1\u02e4",
			"",
			"",
			"\1\u02e5",
			"",
			"\1\u02e6",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\60\110\12\u029f\7\110\32\u029f\4\110\1\u029f\1\110\32\u029f\uff85\110",
			"\1\u02e8",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02ea",
			"\1\u02eb",
			"\1\u02ec",
			"\1\u02ed",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02ef",
			"",
			"\1\u02f0",
			"\1\u02f1",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02f3",
			"\1\u02f4",
			"\1\u02f5",
			"\1\u02f6",
			"\1\u02f7",
			"\1\u02f8",
			"\1\u02f9",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0300",
			"\1\u0301",
			"",
			"\1\u0302",
			"\1\u0303",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0305",
			"\1\u0306",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0308",
			"\1\u0309",
			"\1\u030a",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\7\67\1\u030b\22\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u030e\7\uffff\1\u030f",
			"\1\u0310",
			"\1\u0311",
			"\1\u0312",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0315",
			"\1\u0316",
			"",
			"\1\u0317",
			"\1\u0318",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u031a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u031c",
			"\1\u031d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0324",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327",
			"\1\u0328",
			"",
			"\1\u0329",
			"",
			"\1\u032a",
			"\1\u032b",
			"\1\u032c",
			"\1\u032d",
			"",
			"\1\u032e",
			"\1\u032f",
			"\1\u0330",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334",
			"\1\u0335",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0337",
			"",
			"\1\u0338",
			"\1\u0339",
			"\1\u033a",
			"\1\u033b",
			"",
			"\1\u033c",
			"\1\u033d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\26\67\1\u033e\3\67",
			"\1\u0340",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0343",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0345",
			"\1\u0346",
			"",
			"",
			"\1\u0347",
			"\1\u0348",
			"\1\u0349",
			"\1\u034a",
			"\1\u034b",
			"",
			"",
			"\1\u034c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u034e",
			"\1\u034f",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\26\67\1\u0350\3\67",
			"",
			"\1\u0352",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0354",
			"\1\u0355",
			"\1\u0356",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0358",
			"\1\u0359",
			"\1\u035a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u035c",
			"\1\u035d",
			"\1\u035e",
			"\1\u035f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0361",
			"\1\u0362",
			"\1\u0363",
			"\1\u0364",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0366",
			"\1\u0367",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0369",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\15\67\1\u036a\6\67\1\u036b"+
			"\5\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u036e",
			"\1\u036f",
			"\1\u0370",
			"\1\u0371",
			"\1\u0372",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u0374",
			"",
			"\1\u0375",
			"\1\u0376",
			"\1\u0377",
			"\1\u0378",
			"\1\u0379",
			"\1\u037a",
			"\1\u037b",
			"\1\u037c",
			"",
			"\1\u037d",
			"\1\u037e",
			"\1\u037f",
			"",
			"\1\u0380",
			"",
			"\1\u0381",
			"\1\u0382",
			"\1\u0383",
			"",
			"\1\u0384",
			"\1\u0385",
			"\1\u0386",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\60\110\12\u0388\7\110\32\u0388\4\110\1\u0388\1\110\32\u0388\uff85\110",
			"\1\u0389",
			"\1\u038a",
			"",
			"\1\u038b",
			"\1\u038c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u038e",
			"",
			"\1\u038f",
			"\1\u0390",
			"",
			"\1\u0391",
			"\1\u0392",
			"\1\u0393",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0395",
			"\1\u0396",
			"\1\u0397",
			"\1\u0398",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u039a",
			"\1\u039b",
			"\1\u039c",
			"\1\u039d",
			"\1\u039e",
			"\1\u039f",
			"\1\u03a0",
			"\1\u03a1",
			"\1\u03a2",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03a4",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03a7",
			"\1\u03a8",
			"\1\u03a9",
			"\1\u03aa",
			"\1\u03ab",
			"",
			"\60\110\12\u0388\7\110\32\u0388\4\110\1\u0388\1\110\32\u0388\uff85\110",
			"\1\u03ac",
			"\1\u03ad",
			"\1\u03ae",
			"\1\u03af",
			"",
			"\1\u03b0",
			"\1\u03b1",
			"\1\u03b2",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"",
			"\1\u03b6",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03b8",
			"\1\u03b9",
			"",
			"\1\u03ba",
			"\1\u03bb",
			"\1\u03bc",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03be",
			"\1\u03bf",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03c1",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u03c3",
			"",
			"",
			"\1\u03c4",
			"\1\u03c5",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03c7",
			"\1\u03c8",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03ca",
			"\1\u03cb",
			"\1\u03cc",
			"\1\u03cd",
			"\1\u03ce",
			"\1\u03cf",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u03d4",
			"\1\u03d5",
			"\1\u03d6",
			"\1\u03d7",
			"\1\u03d8",
			"",
			"\1\u03d9",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u03db",
			"",
			"\1\u03dc",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03de",
			"",
			"\1\u03df",
			"\2\u03e0\2\uffff\1\u03e0\22\uffff\1\u03e0\132\uffff\1\u03e0",
			"",
			"\1\u03e1",
			"\1\u03e2",
			"\1\u03e3",
			"\1\u03e4",
			"\1\u03e5",
			"\1\u03e6",
			"",
			"",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03e8",
			"\1\u03e9",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03eb",
			"\1\u03ec",
			"",
			"\1\u03ed",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03f0",
			"",
			"\1\u03f1",
			"\1\u03f2",
			"\1\u03f3",
			"\1\u03f4",
			"\1\u03f5",
			"\1\u03f6",
			"",
			"\1\u03f7",
			"\1\u03f8",
			"",
			"\1\u03f9",
			"\1\u03fa",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u03fc",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03fe",
			"\1\u03ff",
			"\1\u0400",
			"\1\u0401",
			"\1\u0402",
			"\1\u0403",
			"\1\u0404",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0407",
			"",
			"\1\u0408",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u040b",
			"\1\u040c",
			"\1\u040d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u040f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u0411",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0413",
			"",
			"\1\u0414",
			"",
			"\1\u0415",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0417",
			"\1\u0418",
			"",
			"\1\u0419",
			"\1\u041a",
			"\1\u041b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u041d",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			""
	};

	static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
	static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
	static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
	static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
	static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
	static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
	static final short[][] DFA28_transition;

	static {
		int numStates = DFA28_transitionS.length;
		DFA28_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
		}
	}

	protected class DFA28 extends DFA {

		public DFA28(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 28;
			this.eot = DFA28_eot;
			this.eof = DFA28_eof;
			this.min = DFA28_min;
			this.max = DFA28_max;
			this.accept = DFA28_accept;
			this.special = DFA28_special;
			this.transition = DFA28_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | STRINGVAL | SEMICOLON | COLON | LBRACK | RBRACK | LABRACK | RABRACK | LCBRACK | RCBRACK | LSBRACK | RSBRACK | DOT | COMMA | SQUOTE | DQUOTE | EQUALS | INTVAL | FLOATVAL | STRUCTCPPTEXT | CPPTEXT | ESC_SEQ | WS | IDENTIFIER | COMMENT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA28_479 = input.LA(1);
						s = -1;
						if ( ((LA28_479 >= '0' && LA28_479 <= '9')||(LA28_479 >= 'A' && LA28_479 <= 'Z')||LA28_479=='_'||(LA28_479 >= 'a' && LA28_479 <= 'z')) ) {s = 579;}
						else if ( ((LA28_479 >= '\u0000' && LA28_479 <= '/')||(LA28_479 >= ':' && LA28_479 <= '@')||(LA28_479 >= '[' && LA28_479 <= '^')||LA28_479=='`'||(LA28_479 >= '{' && LA28_479 <= '\uFFFF')) ) {s = 72;}
						else s = 55;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA28_580 = input.LA(1);
						s = -1;
						if ( ((LA28_580 >= '0' && LA28_580 <= '9')||(LA28_580 >= 'A' && LA28_580 <= 'Z')||LA28_580=='_'||(LA28_580 >= 'a' && LA28_580 <= 'z')) ) {s = 671;}
						else if ( ((LA28_580 >= '\u0000' && LA28_580 <= '/')||(LA28_580 >= ':' && LA28_580 <= '@')||(LA28_580 >= '[' && LA28_580 <= '^')||LA28_580=='`'||(LA28_580 >= '{' && LA28_580 <= '\uFFFF')) ) {s = 72;}
						else s = 55;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA28_904 = input.LA(1);
						s = -1;
						if ( ((LA28_904 >= '\u0000' && LA28_904 <= '/')||(LA28_904 >= ':' && LA28_904 <= '@')||(LA28_904 >= '[' && LA28_904 <= '^')||LA28_904=='`'||(LA28_904 >= '{' && LA28_904 <= '\uFFFF')) ) {s = 72;}
						else if ( ((LA28_904 >= '0' && LA28_904 <= '9')||(LA28_904 >= 'A' && LA28_904 <= 'Z')||LA28_904=='_'||(LA28_904 >= 'a' && LA28_904 <= 'z')) ) {s = 904;}
						else s = 55;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA28_40 = input.LA(1);
						s = -1;
						if ( ((LA28_40 >= '\u0000' && LA28_40 <= '\t')||(LA28_40 >= '\u000B' && LA28_40 <= '\f')||(LA28_40 >= '\u000E' && LA28_40 <= '\uFFFF')) ) {s = 159;}
						else s = 160;
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA28_861 = input.LA(1);
						s = -1;
						if ( ((LA28_861 >= '0' && LA28_861 <= '9')||(LA28_861 >= 'A' && LA28_861 <= 'Z')||LA28_861=='_'||(LA28_861 >= 'a' && LA28_861 <= 'z')) ) {s = 904;}
						else if ( ((LA28_861 >= '\u0000' && LA28_861 <= '/')||(LA28_861 >= ':' && LA28_861 <= '@')||(LA28_861 >= '[' && LA28_861 <= '^')||LA28_861=='`'||(LA28_861 >= '{' && LA28_861 <= '\uFFFF')) ) {s = 72;}
						else s = 55;
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA28_478 = input.LA(1);
						s = -1;
						if ( ((LA28_478 >= '\u0000' && LA28_478 <= '/')||(LA28_478 >= ':' && LA28_478 <= '@')||(LA28_478 >= '[' && LA28_478 <= '^')||LA28_478=='`'||(LA28_478 >= '{' && LA28_478 <= '\uFFFF')) ) {s = 72;}
						else if ( ((LA28_478 >= '0' && LA28_478 <= '9')||(LA28_478 >= 'A' && LA28_478 <= 'Z')||LA28_478=='_'||(LA28_478 >= 'a' && LA28_478 <= 'z')) ) {s = 478;}
						else s = 55;
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA28_261 = input.LA(1);
						s = -1;
						if ( ((LA28_261 >= '\u0000' && LA28_261 <= '/')||(LA28_261 >= ':' && LA28_261 <= '@')||(LA28_261 >= '[' && LA28_261 <= '^')||LA28_261=='`'||(LA28_261 >= '{' && LA28_261 <= '\uFFFF')) ) {s = 72;}
						else if ( ((LA28_261 >= '0' && LA28_261 <= '9')||(LA28_261 >= 'A' && LA28_261 <= 'Z')||LA28_261=='_'||(LA28_261 >= 'a' && LA28_261 <= 'z')) ) {s = 261;}
						else s = 55;
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA28_671 = input.LA(1);
						s = -1;
						if ( ((LA28_671 >= '\u0000' && LA28_671 <= '/')||(LA28_671 >= ':' && LA28_671 <= '@')||(LA28_671 >= '[' && LA28_671 <= '^')||LA28_671=='`'||(LA28_671 >= '{' && LA28_671 <= '\uFFFF')) ) {s = 72;}
						else if ( ((LA28_671 >= '0' && LA28_671 <= '9')||(LA28_671 >= 'A' && LA28_671 <= 'Z')||LA28_671=='_'||(LA28_671 >= 'a' && LA28_671 <= 'z')) ) {s = 671;}
						else s = 55;
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA28_165 = input.LA(1);
						s = -1;
						if ( ((LA28_165 >= '0' && LA28_165 <= '9')||(LA28_165 >= 'A' && LA28_165 <= 'Z')||LA28_165=='_'||(LA28_165 >= 'a' && LA28_165 <= 'z')) ) {s = 261;}
						else if ( ((LA28_165 >= '\u0000' && LA28_165 <= '/')||(LA28_165 >= ':' && LA28_165 <= '@')||(LA28_165 >= '[' && LA28_165 <= '^')||LA28_165=='`'||(LA28_165 >= '{' && LA28_165 <= '\uFFFF')) ) {s = 72;}
						else s = 55;
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA28_369 = input.LA(1);
						s = -1;
						if ( ((LA28_369 >= '0' && LA28_369 <= '9')||(LA28_369 >= 'A' && LA28_369 <= 'Z')||LA28_369=='_'||(LA28_369 >= 'a' && LA28_369 <= 'z')) ) {s = 478;}
						else if ( ((LA28_369 >= '\u0000' && LA28_369 <= '/')||(LA28_369 >= ':' && LA28_369 <= '@')||(LA28_369 >= '[' && LA28_369 <= '^')||LA28_369=='`'||(LA28_369 >= '{' && LA28_369 <= '\uFFFF')) ) {s = 72;}
						else s = 55;
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA28_579 = input.LA(1);
						s = -1;
						if ( ((LA28_579 >= '\u0000' && LA28_579 <= '/')||(LA28_579 >= ':' && LA28_579 <= '@')||(LA28_579 >= '[' && LA28_579 <= '^')||LA28_579=='`'||(LA28_579 >= '{' && LA28_579 <= '\uFFFF')) ) {s = 72;}
						else if ( ((LA28_579 >= '0' && LA28_579 <= '9')||(LA28_579 >= 'A' && LA28_579 <= 'Z')||LA28_579=='_'||(LA28_579 >= 'a' && LA28_579 <= 'z')) ) {s = 579;}
						else s = 55;
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 28, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
