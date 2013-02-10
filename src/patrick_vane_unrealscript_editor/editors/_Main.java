package patrick_vane_unrealscript_editor.editors;

import patrick_vane_unrealscript_editor.editors.parser.CodeErrorException;
import patrick_vane_unrealscript_editor.editors.parser.MyParser;


public class _Main
{
	public static String code = 
	(
		/*  1 */ "class Test extends Actor placeable;\r\n" + 
		/*  2 */ "\r\n" + 
		/*  3 */ "\r\n" + 
		/*  4 */ "defaultproperties\r\n" + 
		/*  5 */ "{\r\n" + 
		/*  6 */ "    Begin Object Class=SpriteComponent Name=Sprite\r\n" + 
		/*  7 */ "        Sprite=Texture2D'EditorResources.S_NavP'\r\n" + 
		/*  8 */ "        //HiddenGame=true\r\n" + 
		/*  9 */ "    End Object\r\n" + 
		/* 10 */ "    components.add( Sprite )\r\n" + 
		/* 11 */ "}\r\n" + 
		/* 12 */ "\r\n" + 
		/* 13 */ "\r\n" + 
		/* 14 */ "function postBeginPlay()\r\n" + 
		/* 15 */ "{\r\n" + 
		/* 16 */ "    `log( \"##########################################################\" );\r\n" + 
		/* 17 */ "    \r\n" + 
		/* 18 */ "    setLocation( location + vect(0, 0, 128) );\r\n" + 
		/* 19 */ "    \r\n" + 
		/* 20 */ "    `log( \"##########################################################\" );\r\n" + 
		/* 21 */ "}"
	);
	
	
	public static void main( String[] args )
	{
		read1();
	}
	
	public static void read1()
	{
		try
		{
			MyParser.checkForErrors( code );
		}
		catch( CodeErrorException e )
		{
			System.out.println( "[Error]" );
			System.out.println( e.getFirstCharacterPosition()+" - "+e.getLastCharacterPosition() );
			System.out.println( e.getMessage() );
		}
	}
}
