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
		boolean inLineComment = false;
		boolean inBlockComment = false;
		boolean inDocs = false;
		char previousChar = ' ';
		char character = ' ';
		char nextChar = ' ';
		char nextNextChar = ' ';
		int skip = 0;
		for( int i=0; i<data.length(); i++ )
		{
			if( skip > 0 )
			{
				skip--;
				continue;
			}
			
			previousChar = character;
			character = data.charAt( i );
			nextChar = ' ';
			nextNextChar = ' ';
			if( i+1 < data.length() )
				nextChar = data.charAt( i+1 );
			if( i+2 < data.length() )
				nextNextChar = data.charAt( i+2 );
			
			if( (character == '\n') | (character == '\r') )
			{
				lineNumber++;
				inLineComment = false;
			}
			if( !inString && !inChar )
			{
				if( !inLineComment && !inBlockComment && !inDocs )
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
					if( (character == '/') && (nextChar == '/') )
					{
						inLineComment = true;
						continue;
					}
					if( (character == '/') && (nextChar == '*') )
					{
						if( nextNextChar == '*' )
							inDocs = true;
						else 
							inBlockComment = true;
						continue;
					}
				}
				if( inDocs || inBlockComment )
				{
					if( (character == '*') && (nextChar == '/') )
					{
						inDocs = false;
						inBlockComment = false;
						skip = 1;
						continue;
					}
				}
			}
			if( !inLineComment && !inBlockComment && !inDocs )
			{
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
		}
		
		block.close( lineNumber );
		return root;
	}
}
