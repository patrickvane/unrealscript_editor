package patrick_vane_unrealscript_editor.editors;

import patrick_vane_unrealscript_editor.editors.parser.CodeErrorException;
import patrick_vane_unrealscript_editor.editors.parser.MyParser;


public class _Main
{
	public static void main( String[] args )
	{
		read1();
	}
	
	
	public static void read1()
	{
		try
		{
			String code = 
			(
				/*  1 */ "function test ( var test, var test2 )" +"\n"+
				/*  2 */ "{" +"\n"+ 
				/*  3 */ "	local test = 5;" +"\n"+
				/*  4 */ "}" +"\n"+
				/*  5 */ "" +"\n"+
				/*  6 */ "function test2()" +"\n"+
				/*  7 */ "{" +"\n"+
				/*  8 */ "	local test2 = \"test twee\";" +"\n"+
				/*  9 */ "	local test3 = 5000;" +"\n"+
				/* 10 */ "	" +"\n"+
				/* 11 */ "	" +"\n"+
				/* 12 */ "	" +"\n"+
				/* 13 */ "	local test2 = \"test twee\";" +"\n"+
				/* 14 */ "	local test3 = 5000;" +"\n"+
				/* 15 */ "}" +"\n"+
				/* 16 */ "function test2(){ return test3; }" +"\n"+
				/* 17 */ "//test" +"\n"+
				/* 18 */ "/* test" +"\n"+
				/* 19 */ "test2 */" +"\n"+
				/* 20 */ "/* /** */real text" +"\n"+
				/* 21 */ "/** test2 " +"\n"+
				/* 22 */ "//test2 */" +"\n"
			);
			
			MyParser.checkForErrors( code );
		}
		catch( CodeErrorException e )
		{
			System.out.println( "[Error]" );
			System.out.println( e.getFirstLineNumber()+" - "+e.getLastLineNumber() );
			System.out.println( e.getMessage() );
		}
	}
}
