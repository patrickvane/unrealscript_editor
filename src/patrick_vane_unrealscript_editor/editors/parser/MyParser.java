package patrick_vane_unrealscript_editor.editors.parser;

import java.util.ArrayList;
import patrick_vane_unrealscript_editor.editors.default_classes.WhitespaceDetector;


public class MyParser
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
			
			
			boolean isFunction = code.getParent().isFunction();
			boolean isInFunction = code.getParent().isInFunction();
			boolean isFirst = code.isFirstInFunction();
			
			if( isFunction && isInFunction )
				throw new CodeErrorException( code.getParent().getFirstLineNumber(), code.getParent().getLastLineNumber(), true, "Function inside a function" );
			
			
			for( int i=0; i<code.getDepth(); i++ )
			{
				System.out.print( "\t" );
			}
			System.out.println( ">>>>>>>>>>>>>" );
			
			boolean nonVariable = false;
			for( ArrayList<String> line : code.getLines() )
			{
				if( isFunction || isInFunction )
				{
					if( line.get(0).equals("var") )
						throw new CodeErrorException( code.getFirstLineNumber(), code.getLastLineNumber(), true, "You can't make a var in a function, make a local instead" );
					
					if( (nonVariable || !isFirst) && line.get(0).equals("local") )
						throw new CodeErrorException( code.getFirstLineNumber(), code.getLastLineNumber(), true, "You can only make locals at the beginning of the function" );
					
					if( !line.get(0).equals("local") )
						nonVariable = true;
				}
				
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
			
			if( (character == '\n') || (character == '\r') )
			{
				if( (character == '\n') && (nextChar == '\r') )
					skip = 1;
				else if( (character == '\r') && (nextChar == '\n') )
					skip = 1;
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
