package patrick_vanes_unrealscript_editor.editors.parser;

import java.util.ArrayList;
import patrick_vanes_unrealscript_editor.editors.default_classes.WhitespaceDetector;


public class Parser
{
	public static CodeError checkForErrors( String data )
	{
		return checkBlockForErrors( read(data) );
	}
	
	public static CodeError checkBlockForErrors( Code data )
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
				CodeError error = checkBlockForErrors( child );
				if( error != null )
					return error;
			}
		}
		return null;
	}
	
	
	public static CodeBlock read( String data )
	{
		CodeBlock root = new CodeBlock( null, 0 );
		CodeBlock block = root;
		
		int lineNumber = 0;
		
		boolean inString = false;
		boolean inChar = false;
		char previousChar = ' ';
		char character = ' ';
		for( int i=0; i<data.length(); i++ )
		{
			previousChar = character;
			character = data.charAt( i );
			if( (character == '\n') | (character == '\r') )
			{
				lineNumber++;
			}
			if( !inString && !inChar )
			{
				if( WhitespaceDetector.getSharedInstance().isWhitespace(character) )
				{
					block.newWord();
					continue;
				}
				if( character == ';' )
				{
					block.newLine();
					continue;
				}
				if( character == '{' )
				{
					block = new CodeBlock( block, lineNumber );
					continue;
				}
				if( character == '}' )
				{
					block.close( lineNumber );
					block = block.getParent();
					continue;
				}
			}
			if( previousChar != '\\' )
			{
				if( character == '"' )
				{
					if( inString )
						block.addCharacter( character );
					
					block.newWord();
					
					if( !inString )
						block.addCharacter( character );
					
					inString = !inString;
					continue;
				}
				if( character == '\'' )
				{
					if( inChar )
						block.addCharacter( character );
					
					block.newWord();
					
					if( !inChar )
						block.addCharacter( character );
					
					inChar = !inChar;
					continue;
				}
			}
			block.addCharacter( character );
			continue;
		}
		
		block.close( lineNumber );
		return root;
	}
}
