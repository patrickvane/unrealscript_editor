package patrick_vane_unrealscript_editor.editors.parser;

import java.util.ArrayList;
import java.util.LinkedList;
import patrick_vane_unrealscript_editor.editors.default_classes.WhitespaceDetector;


public class MyParser
{
	public static CodeException[] findErrors( String data )
	{
		CodeBlock block;
		try
		{
			block = read( data );
		}
		catch( CodeException e )
		{
			return new CodeException[]{ e };
		}
		return findErrors( block );
	}
	protected static CodeException[] findErrors( CodeBlock data )
	{
		return findErrorsInBlock( data ).toArray( new CodeException[0] );
	}
	
	protected static LinkedList<CodeException> findErrorsInBlock( Code data )
	{
		LinkedList<CodeException> errors = new LinkedList<CodeException>();
		if( data instanceof CodeBlockCode )
		{
			CodeBlockCode code = (CodeBlockCode) data;
			
			boolean isFunction = code.getParent().isFunction();
			boolean isInFunction = code.getParent().isInFunction();
			boolean isFirstInFunction = code.isFirstInFunction();
			
			boolean noLocalsAnymore = false;
			for( ArrayList<CodeWord> line : code.getLines() )
			{
				CodeWord worddata = null;
				String word = null;
				if( line.size() > 0 )
				{
					if( line.get(0) != null )
					{
						worddata = line.get( 0 );
						word = worddata.getWord();
					}
				}
				
				if( (worddata != null) && (word != null) )
				{
					if( isFunction || isInFunction )
					{
						if( word.equals("var") )
							errors.add( new CodeException( worddata.getFirstCharacterPosition(), worddata.getLastCharacterPosition(), true, "You can't make a var in a function, make a local instead") );
						
						if( (noLocalsAnymore || !isFirstInFunction) && word.equals("local") )
							errors.add( new CodeException( worddata.getFirstCharacterPosition(), worddata.getLastCharacterPosition(), true, "You can only make locals at the beginning of the function") );
						
						if( !noLocalsAnymore && !word.equals("local") && !word.equals("var") )
							noLocalsAnymore = true;
					}
				}
			}
		}
		else if( data instanceof CodeBlock )
		{
			CodeBlock block = (CodeBlock) data;
			for( Code child : block.getChilds() )
			{
				errors.addAll( findErrorsInBlock(child) );
			}
		}
		return errors;
	}
	
	
	
	
	protected static CodeBlock read( String data ) throws CodeException
	{
		CodeBlock root = new CodeBlock( null );
		CodeBlock block = root;
		
		int characterPosition = -1;
		
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
			characterPosition++;
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
				inCommentLine = false;
			}
			if( !inString && !inChar )
			{
				if( !inCommentLine && !inCommentBlock && !inDocs )
				{
					if( WhitespaceDetector.getSharedInstance().isWhitespace(character) )
					{
						block.closeWord( characterPosition );
						continue;
					}
					if( character == ';' )
					{
						block.closeWord( characterPosition );
						block.newLine();
						bracketBlock.newLine( characterPosition );
						continue;
					}
					
					if( character == '{' )
					{
						bracketBlock = new BracketBlock( bracketBlock, '{', '}' );
						
						block.closeWord( characterPosition );
						block = new CodeBlock( block );
						continue;
					}
					if( character == '}' )
					{
						bracketBlock.close( characterPosition, '{', '}' );
						bracketBlock = bracketBlock.getParent();
						
						block.closeWord( characterPosition );
						block.close();
						block = block.getParent();
						continue;
					}
					
					if( character == '(' )
					{
						bracketBlock = new BracketBlock( bracketBlock, '(', ')' );
						
						block.closeWord( characterPosition );
						block.addCharacter( characterPosition, character );
						block.closeWord( characterPosition+1 );
						continue;
					}
					if( character == ')' )
					{
						bracketBlock.close( characterPosition, '(', ')' );
						bracketBlock = bracketBlock.getParent();
						
						block.closeWord( characterPosition );
						block.addCharacter( characterPosition, character );
						block.closeWord( characterPosition+1 );
						continue;
					}
					
					if( character == '<' )
					{
						bracketBlock = new BracketBlock( bracketBlock, '<', '>' );
						
						block.closeWord( characterPosition );
						block.addCharacter( characterPosition, character );
						block.closeWord( characterPosition+1 );
						continue;
					}
					if( character == '>' )
					{
						bracketBlock.close( characterPosition, '<', '>' );
						bracketBlock = bracketBlock.getParent();
						
						block.closeWord( characterPosition );
						block.addCharacter( characterPosition, character );
						block.closeWord( characterPosition+1 );
						continue;
					}
					
					if( character == '[' )
					{
						bracketBlock = new BracketBlock( bracketBlock, '[', ']' );
						
						block.closeWord( characterPosition );
						block.addCharacter( characterPosition, character );
						block.closeWord( characterPosition+1 );
						continue;
					}
					if( character == ']' )
					{
						bracketBlock.close( characterPosition, '[', ']' );
						bracketBlock = bracketBlock.getParent();
						
						block.closeWord( characterPosition );
						block.addCharacter( characterPosition, character );
						block.closeWord( characterPosition+1 );
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
						{
							block.addCharacter( characterPosition, character );
							block.closeWord( characterPosition+1 );
						}
						else
						{
							block.closeWord( characterPosition );
							block.addCharacter( characterPosition, character );
						}
						inString = !inString;
						continue;
					}
					if( character == '\'' )
					{
						if( inChar )
						{
							block.addCharacter( characterPosition, character );
							block.closeWord( characterPosition+1 );
						}
						else
						{
							block.closeWord( characterPosition );
							block.addCharacter( characterPosition, character );
						}
						inChar = !inChar;
						continue;
					}
				}
				block.addCharacter( characterPosition, character );
				continue;
			}
		}
		
		bracketBlock.close( characterPosition );
		block.closeWord( characterPosition );
		block.close();
		
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
		
		
		public void newLine( int characterPosition ) throws CodeException
		{
			if( (openBracketCharacter == '(') || (openBracketCharacter == '[') || (openBracketCharacter == '<') )
				throw new CodeException( characterPosition, characterPosition+1, true, "Unexpected: ;" );
		}
		
		
		public void close( int characterPosition ) throws CodeException
		{
			close( characterPosition, ROOT_CHAR, ROOT_CHAR );
		}
		
		public void close( int characterPosition, char openBracketCharacter, char closeBracketCharacter ) throws CodeException
		{
			if( this.closeBracketCharacter != closeBracketCharacter )
			{
				if( closeBracketCharacter == ROOT_CHAR )
					throw new CodeException( characterPosition, characterPosition + 1, true, "Missing: "+this.openBracketCharacter );
				else if( this.closeBracketCharacter == ROOT_CHAR )
					throw new CodeException( characterPosition, characterPosition + 1, true, "Missing: "+openBracketCharacter );
				else
					throw new CodeException( characterPosition, characterPosition + 1, true, "Unexpected: "+closeBracketCharacter+", was expecting: "+this.closeBracketCharacter );
			}
		}
		
		
		public BracketBlock getParent()
		{
			return parent;
		}
	}
}
