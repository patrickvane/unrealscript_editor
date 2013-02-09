package patrick_vanes_unrealscript_editor.editors.parser;

import java.util.ArrayList;
import patrick_vanes_unrealscript_editor.editors.default_classes.WhitespaceDetector;


public class Parser
{
	public static void checkForErrors( String data ) throws CodeErrorException
	{
		checkBlockForErrors( read(data) );
	}
	public static void checkForErrors( CodeBlock data ) throws CodeErrorException
	{
		checkBlockForErrors( data );
	}
	
	public static CodeErrorException checkBlockForErrors( Code data ) throws CodeErrorException
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
				CodeErrorException error = checkBlockForErrors( child );
				if( error != null )
					return error;
			}
		}
		return null;
	}
	
	
	
	
	public static CodeBlock read( String data ) throws CodeErrorException
	{
		CodeBlock root = new CodeBlock( null, 0 );
		CodeBlock block = root;
		
		int lineNumber = 1;
		
		boolean inString = false;
		boolean inChar = false;
		boolean inCommentLine = false;
		boolean inCommentBlock = false;
		boolean inDocs = false;
		BracketBlock bracketBlock = new BracketBlock();
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
				inCommentLine = false;
			}
			if( !inString && !inChar )
			{
				if( !inCommentLine && !inCommentBlock && !inDocs )
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
						bracketBlock = new BracketBlock( bracketBlock, '{', '}' );
						
						block = new CodeBlock( block, lineNumber );
						continue;
					}
					if( character == '}' )
					{
						bracketBlock.close( lineNumber, '{', '}' );
						bracketBlock = bracketBlock.getParent();
						
						block.close( lineNumber );
						block = block.getParent();
						continue;
					}
					
					if( character == '(' )
					{
						bracketBlock = new BracketBlock( bracketBlock, '(', ')' );
						
						block.newWord();
						block.addCharacter( character );
						block.newWord();
						continue;
					}
					if( character == ')' )
					{
						bracketBlock.close( lineNumber, '(', ')' );
						bracketBlock = bracketBlock.getParent();
						
						block.newWord();
						block.addCharacter( character );
						block.newWord();
						continue;
					}
					
					if( character == '<' )
					{
						bracketBlock = new BracketBlock( bracketBlock, '<', '>' );
						
						block.newWord();
						block.addCharacter( character );
						block.newWord();
						continue;
					}
					if( character == '>' )
					{
						bracketBlock.close( lineNumber, '<', '>' );
						bracketBlock = bracketBlock.getParent();
						
						block.newWord();
						block.addCharacter( character );
						block.newWord();
						continue;
					}
					
					if( character == '[' )
					{
						bracketBlock = new BracketBlock( bracketBlock, '[', ']' );
						
						block.newWord();
						block.addCharacter( character );
						block.newWord();
						continue;
					}
					if( character == ']' )
					{
						bracketBlock.close( lineNumber, '[', ']' );
						bracketBlock = bracketBlock.getParent();
						
						block.newWord();
						block.addCharacter( character );
						block.newWord();
						continue;
					}
					
					if( (character == '/') && (nextChar == '/') )
					{
						inCommentLine = true;
						continue;
					}
					if( (character == '/') && (nextChar == '*') )
					{
						if( nextNextChar == '*' )
							inDocs = true;
						else 
							inCommentBlock = true;
						continue;
					}
				}
				if( inDocs || inCommentBlock )
				{
					if( (character == '*') && (nextChar == '/') )
					{
						inDocs = false;
						inCommentBlock = false;
						skip = 1;
						continue;
					}
				}
			}
			if( !inCommentLine && !inCommentBlock && !inDocs )
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
		
		bracketBlock.close( lineNumber );
		block.close( lineNumber );
		
		return root;
	}
	
	
	private static class BracketBlock
	{
		private static final char ROOT_CHAR = ' ';
		
		private BracketBlock parent;
		private char closeBracketCharacter;
		
		@SuppressWarnings( "unused" )
		private char openBracketCharacter;
		
		
		public BracketBlock()
		{
			this.parent = null;
			this.openBracketCharacter = ROOT_CHAR;
			this.closeBracketCharacter = ROOT_CHAR;
		}
		
		public BracketBlock( BracketBlock parent, char openBracketCharacter, char closeBracketCharacter )
		{
			this.parent = parent;
			this.openBracketCharacter = openBracketCharacter;
			this.closeBracketCharacter = closeBracketCharacter;
		}
		
		
		public void close( int lineNumber ) throws CodeErrorException
		{
			close( lineNumber, ROOT_CHAR, ROOT_CHAR );
		}
		
		public void close( int lineNumber, char openBracketCharacter, char closeBracketCharacter ) throws CodeErrorException
		{
			if( this.closeBracketCharacter != closeBracketCharacter )
			{
				lineNumber--;
				if( this.closeBracketCharacter != ROOT_CHAR )
					throw new CodeErrorException( lineNumber, lineNumber, true, "Missing: "+this.closeBracketCharacter );
				else
					throw new CodeErrorException( lineNumber, lineNumber, true, "Missing: "+openBracketCharacter );
			}
		}
		
		
		public BracketBlock getParent()
		{
			return parent;
		}
	}
}
