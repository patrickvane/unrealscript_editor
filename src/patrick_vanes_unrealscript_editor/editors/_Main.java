package patrick_vanes_unrealscript_editor.editors;

import java.util.ArrayList;
import patrick_vanes_unrealscript_editor.editors.parser.Code;
import patrick_vanes_unrealscript_editor.editors.parser.CodeBlock;
import patrick_vanes_unrealscript_editor.editors.parser.CodeBlockCode;
import patrick_vanes_unrealscript_editor.editors.parser.Parser;


public class _Main
{
	public static void main( String[] args ) throws Exception
	{
		read();
	}
	
	
	public static void read() throws Exception
	{
		CodeBlock data = Parser.read
		( 
			"function test()" +"\n"+
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
			"function test2(){ return test3; }" +"\n"
		);
		
		readpart( data );
	}
	
	public static void readpart( Code data ) throws Exception
	{
		if( data instanceof CodeBlockCode )
		{
			CodeBlockCode code = (CodeBlockCode) data;
			
			for( int i=0; i<code.getDepth(); i++ )
			{
				System.out.print( "\t" );
			}
			System.out.println( ">>>>>>>>>>>>>" );
			
			for( ArrayList<String> line : code.getLines() )
			{
				for( int i=0; i<code.getDepth(); i++ )
				{
					System.out.print( "\t" );
				}
				boolean first = true;
				for( String word : line )
				{
					if( !first )
						System.out.print( "___" );
					else
						first = false;
					System.out.print( word );
				}
				System.out.println();
			}
			
			for( int i=0; i<code.getDepth(); i++ )
			{
				System.out.print( "\t" );
			}
			System.out.println( "<<<<<<<<<<<<<" );
		}
		else if( data instanceof CodeBlock )
		{
			CodeBlock block = (CodeBlock) data;
			for( Code child : block.getChilds() )
			{
				readpart( child );
			}
		}
	}
}
