package patrick_vanes_unrealscript_editor.editors;

import patrick_vanes_unrealscript_editor.editors.parser.CodeErrorException;
import patrick_vanes_unrealscript_editor.editors.parser.Parser;


public class _Main
{
	public static void main( String[] args )
	{
		read();
	}
	
	
	public static void read()
	{
		try
		{
			String code = 
			(
				"function test ( var test, var test2 )" +"\n"+
				"{" +"\n"+ 
				"	var test = 5;\n" +"\n"+
				"}" +"\n"+
				"" +"\n"+
				"function test2()" +"\n"+
				"{" +"\n"+
				"	var test2 = \"test twee\";" +"\n"+
				"	var test3 = 5000;" +"\n"+
				"	{" +"\n"+
				"		var test10 = 5;" +"\n"+
				"	}" +"\n"+
				"	var test2 = \"test twee\";" +"\n"+
				"	var test3 = 5000;" +"\n"+
				"}" +"\n"+
				"function test2(){ return test3; }" +"\n"+
				"//test" +"\n"+
				"/* test" +"\n"+
				"test2 */" +"\n"+
				"/* /** */real text" +"\n"+
				"/** test2 " +"\n"+
				"//test2 */" +"\n"
			);
			
			Parser.checkForErrors( code );
		}
		catch( CodeErrorException e )
		{
			System.out.println( "[Error]" );
			System.out.println( e.getFirstLineNumber()+" - "+e.getLastLineNumber() );
			System.out.println( e.getMessage() );
		}
	}
}
