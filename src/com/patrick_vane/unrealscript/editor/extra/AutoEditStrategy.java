package com.patrick_vane.unrealscript.editor.extra;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import com.patrick_vane.unrealscript.editor.default_classes.KeywordDetector;


public class AutoEditStrategy implements IAutoEditStrategy
{
	private final String[] INDENT_FUNCTIONS = new String[]{ "if", "for", "while", "else" };
	
	
	@Override
	public void customizeDocumentCommand( IDocument document, DocumentCommand command )
	{
		try
		{
			boolean rightSquareBracket 	= command.text.equals( "]" );
			boolean rightParenthese 	= command.text.equals( ")" );
			boolean leftBracket 		= command.text.equals( "{" );
			boolean rightBracket 		= command.text.equals( "}" );
			boolean newline 			= (command.text.equals("\n") || command.text.equals("\r\n") || command.text.equals("\n\r"));
			if( !rightSquareBracket && !rightParenthese && !leftBracket && !rightBracket && !newline )
				return;
			
			int caretOffset = 0;
			
			int currentLine = document.getLineOfOffset( command.offset );
			String indent = getIntend( document, currentLine );
			String line = getLine( document, currentLine );
			String lineTrimmed = line.trim();
			
			String linetextBeforeCommand = getLine( document, currentLine, command.offset );
			String openStringChar = getStringOpenChar( linetextBeforeCommand );
			boolean inOpenString = (openStringChar != null);
			
			if( !inOpenString )
			{
				if( leftBracket )
				{
					for( String string : INDENT_FUNCTIONS )
					{
						String testIndent = getIndentOfFirstLineContainingStringBeforeChars( document, command.offset, string, ';', '{', '}' );
						if( testIndent != null )
						{
							setIndendOfLine( document, command, currentLine, testIndent );
							configureCaret( command );
							return;
						}
					}
					return;
				}
				if( rightSquareBracket )
				{
					String foundIndent = getIndentOfFirstLineOpenChar( document, command.offset, '[', ']' );
					if( foundIndent != null )
					{
						setIndendOfLine( document, command, currentLine, foundIndent );
						configureCaret( command );
					}
					return;
				}
				if( rightParenthese )
				{
					String foundIndent = getIndentOfFirstLineOpenChar( document, command.offset, '(', ')' );
					if( foundIndent != null )
					{
						setIndendOfLine( document, command, currentLine, foundIndent );
						configureCaret( command );
					}
					return;
				}
				if( rightBracket )
				{
					String foundIndent = getIndentOfFirstLineOpenChar( document, command.offset, '{', '}' );
					if( foundIndent != null )
					{
						setIndendOfLine( document, command, currentLine, foundIndent );
						configureCaret( command );
					}
					return;
				}
			}
			if( newline )
			{
				if( inOpenString )
				{
					command.text = "\\n"+openStringChar+" $ \n" + indent+openStringChar;
					configureCaret( command );
					return;
				}
				else if( lineTrimmed.endsWith("[") )
					indent = increaseIndend( indent );
				else if( lineTrimmed.endsWith("(") )
					indent = increaseIndend( indent );
				else if( lineTrimmed.endsWith("<") )
					indent = increaseIndend( indent );
				else if( lineTrimmed.endsWith("{") )
				{
					if( countCharacters(document, '{') > countCharacters(document, '}') )
					{
						String increasedIndent = increaseIndend( indent );
						command.text = "\n" + increasedIndent + "\n" + indent + "}";
						indent = "";
						caretOffset -= (increasedIndent.length() + 1);
					}
					else
					{
						indent = increaseIndend( indent );
					}
				}
				else if( lineTrimmed.endsWith(";") )
				{
					for( String string : INDENT_FUNCTIONS )
					{
						String testIndent = getIndentOfFirstLineContainingStringBeforeChars( document, command.offset-2, string, ';', '{', '}' );
						if( testIndent != null )
						{
							indent = decreaseIndend( indent );
							break;
						}
					}
				}
				else
				{
					for( String string : INDENT_FUNCTIONS )
					{
						String testIndent = getIndentOfFirstLineContainingStringBeforeChars( document, command.offset, string, ';', '{', '}' );
						if( testIndent != null )
						{
							indent = increaseIndend( testIndent );
							break;
						}
					}
				}
				command.text += indent;
				configureCaret( command );
				command.caretOffset += caretOffset;
				return;
			}
		}
		catch( BadLocationException e )
		{
			e.printStackTrace();
		}
	}
	
	
	private static void configureCaret( DocumentCommand command )
	{
		configureCaret( command, command.text.length() );
	}
	private static void configureCaret( DocumentCommand command, int offset )
	{
		command.caretOffset = command.offset + offset;
		command.shiftsCaret = false;
	}
	
	private static String getIntend( IDocument document, int currentLine ) throws BadLocationException
	{
		if( currentLine > -1 )
		{
			int start = document.getLineOffset( currentLine );
			int end = document.getLineLength( currentLine )-1 + start;
			int whiteSpaceEnd = getEndOfWhiteSpace( document, start, end );
			return document.get( start, whiteSpaceEnd - start );
		}
		return "";
	}
	
	private static String getIndendOfLine( String line )
	{
		return line.substring( 0, getEndOfWhiteSpace(line) );
	}
	
	private static void setIndendOfLine( IDocument document, DocumentCommand command, int line, String indent ) throws BadLocationException
	{
		int start  = document.getLineOffset( line );
		int length = getEndOfWhiteSpace( document, start, start+document.getLineLength(line) ) - start;
		document.replace( start, length, indent );
		command.offset -= length;
		command.offset += indent.length();
	}
	
	private static String increaseIndend( String indent )
	{
		if( indent.startsWith("    ") )
			indent += "    ";
		else
			indent += "\t";
		return indent;
	}
	
	@SuppressWarnings( "unused" )
	private static String decreaseIndend( String indent )
	{
		if( indent.contains("\t") )
		{
			indent = indent.replaceFirst( "\t", "" );
		}
		else if( indent.contains("    ") )
		{
			indent = indent.replaceFirst( "    ", "" );
		}
		return indent;
	}
	
	@SuppressWarnings( "unused" )
	private static void decreaseIndendInLine( IDocument document, DocumentCommand command, int currentLine, String line, String indent ) throws BadLocationException
	{
		if( line.startsWith("\t") )
		{
			document.replace( document.getLineOffset(currentLine), 1, "" );
			command.offset -= 1;
		}
		else if( line.startsWith("    ") )
		{
			document.replace( document.getLineOffset(currentLine), 4, "" );
			command.offset -= 4;
		}
	}
	
	private static String getLine( IDocument document, int currentLine ) throws BadLocationException
	{
		if( currentLine > -1 )
		{
			int start = document.getLineOffset( currentLine );
			return document.get( start, document.getLineLength(currentLine) );
		}
		return "";
	}
	
	private static String getLine( IDocument document, int currentLine, int tillOffset ) throws BadLocationException
	{
		if( currentLine > -1 )
		{
			int start = document.getLineOffset( currentLine );
			return document.get( start, tillOffset-start );
		}
		return "";
	}
	
	private static int getEndOfWhiteSpace( IDocument document, int start, int end ) throws BadLocationException
	{
		while( start < end )
		{
			char c = document.getChar( start );
			if( (c == ' ') || (c == '\t') )
			{
				start++;
				continue;
			}
			return start;
		}
		return end;
	}
	private static int getEndOfWhiteSpace( String line )
	{
		for( int i=0; i<line.length(); i++ )
		{
			char c = line.charAt( i );
			if( (c != ' ') && (c != '\t') )
				return i;
		}
		return line.length();
	}
	
	private static String getCode( String code )
	{
		StringBuilder builder = new StringBuilder();
		boolean stringOpen = false;
		boolean charOpen   = false;
		int docsOpen = 0;
		boolean previousWasSlash = false;
		boolean previousWasStar  = false;
		boolean skipTillNewline  = false;
		for( int i=0; i<code.length(); i++ )
		{
			char c = code.charAt( i );
			
			if( skipTillNewline )
			{
				if( (c != '\n') && (c != '\r') )
					continue;
				skipTillNewline = false;
			}
			
			if( stringOpen )
			{
				if( c == '"' )
					stringOpen = false;
			}
			else if( charOpen )
			{
				if( c == '\'' )
					charOpen = false;
			}
			else
			{
				if( docsOpen <= 0 )
				{
					if( c == '"' )
						stringOpen = true;
					else if( c == '\'' )
						charOpen = true;
					builder.append( c );
				}
				
				if( c == '/' )
				{
					if( previousWasStar )
					{
						docsOpen--;
						previousWasSlash = false;
						previousWasStar  = false;
						continue;
					}
					if( previousWasSlash )
					{
						skipTillNewline  = true;
						builder.append( '\n' );
						previousWasSlash = false;
						previousWasStar  = false;
						continue;
					}
				}
				else if( c == '*' )
				{
					if( previousWasSlash )
					{
						docsOpen++;
						previousWasSlash = false;
						previousWasStar  = false;
						continue;
					}
				}
				
				previousWasSlash = (c == '/');
				previousWasStar  = (c == '*');
			}
		}
		return builder.toString();
	}
	private static String getCodeLine( String code, int offset )
	{
		while( offset > 0 )
		{
			char character = code.charAt( offset );
			if( (character == '\n') || (character == '\r') )
			{
				offset++;
				break;
			}
			offset--;
		}
		
		StringBuffer buffer = new StringBuffer();
		while( offset < code.length() )
		{
			char character = code.charAt( offset );
			if( (character == '\n') || (character == '\r') )
			{
				break;
			}
			buffer.append( character );
			offset++;
		}
		
		return buffer.toString();
	}
	
	private static int countCharacters( IDocument document, char character )
	{
		int count = 0;
		String content = getCode( document.get() );
		for( int i=0; i<content.length(); i++ )
		{
			if( content.charAt(i) == character )
				count++;
		}
		return count;
	}
	
	private static String getStringOpenChar( String line )
	{
		boolean string 		= false;
		boolean charString 	= false;
		for( int i=0; i<line.length(); i++ )
		{
			char character = line.charAt( i );
			if( !charString && (character == '"') )
				string = !string;
			else if( !string && (character == '\'') )
				charString = !charString;
		}
		if( string )
			return "\"";
		if( charString )
			return "'";
		return null;
	}
	
	
	private static String getIndentOfFirstLineOpenChar( IDocument document, int from, char open, char close ) throws BadLocationException
	{
		String content 		= getCode( document.get(0, from) );
		int numOpen 		= 0;
		int bracket 		= 0;
		int squareBracket 	= 0;
		int parenthese 		= 0;
		for( int i=content.length()-1; i>=0; i-- )
		{
			char c = content.charAt( i );
			
			if( c == open )
				numOpen++;
			else if( c == close )
				numOpen--;
			else if( c == '{' )
				bracket++;
			else if( c == '}' )
				bracket--;
			else if( c == '[' )
				squareBracket++;
			else if( c == ']' )
				squareBracket--;
			else if( c == '(' )
				parenthese++;
			else if( c == ')' )
				parenthese--;
			
			if( numOpen >= 1 )
				return getIndendOfLine( getCodeLine(content, i) );
			else if( bracket >= 1 )
				return null;
			else if( squareBracket >= 1 )
				return null;
			else if( parenthese >= 1 )
				return null;
		}
		return "";
	}
	
	private static String getIndentOfFirstLineContainingStringBeforeChars( IDocument document, int from, String lookFor, char... beforeChars ) throws BadLocationException
	{
		int lookForLength = lookFor.length();
		while( from > lookForLength )
		{
			char c = document.getChar( from );
			String string = document.get( from-lookForLength, lookForLength );
			
			for( char beforeChar : beforeChars )
			{
				if( c == beforeChar )
				{
					return null;
				}
			}
			
			if( string.equalsIgnoreCase(lookFor) )
			{
				boolean beforeOk = false;
				boolean afterOk  = false;
				
				try
				{
					beforeOk = !KeywordDetector.getSharedInstance().isWordPart( document.getChar(from-lookForLength-1) );
				}
				catch( Exception e )
				{
				}
				
				try
				{
					afterOk = !KeywordDetector.getSharedInstance().isWordPart( document.getChar(from) );
				}
				catch( Exception e )
				{
				}
				
				if( beforeOk && afterOk )
				{
					return getIntend( document, document.getLineOfOffset(from) );
				}
			}
			
			from--;
		}
		return null;
	}
}
