package com.patrick_vane.unrealscript.editor.extra;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;


public class AutoEditStrategy implements IAutoEditStrategy
{
	@Override
	public void customizeDocumentCommand( IDocument document, DocumentCommand command )
	{
		try
		{
			boolean leftBracket = command.text.equals( "{" );
			boolean rightBracket = command.text.equals( "}" );
			boolean newline = (command.text.equals("\n") || command.text.equals("\r\n") || command.text.equals("\n\r"));
			if( !leftBracket && !rightBracket && !newline )
				return;
			
			int currentLine = document.getLineOfOffset( command.offset );
			String indent = getIntend( document, currentLine );
			String line = getLine( document, currentLine );
			String lineTrimmed = line.trim();
			String linetextBeforeCommand = getLine( document, currentLine, command.offset );
			String openStringChar = getStringOpenChar( linetextBeforeCommand );
			boolean inOpenString = (openStringChar != null);
			
			if( leftBracket && !inOpenString )
			{
				command.text += System.lineSeparator();
				command.text += increaseIndend( indent );
				configureCaret( command );
			}
			else if( rightBracket && !inOpenString )
			{
				decreaseIndendInLine( document, command, currentLine, line, indent );
				command.text += System.lineSeparator();
				command.text += decreaseIndend( indent );
				configureCaret( command );
			}
			else if( newline )
			{
				if( inOpenString )
					command.text = openStringChar+";" + command.text;
				else if( lineTrimmed.endsWith("{") )
					indent = increaseIndend( indent );
				command.text += indent;
				configureCaret( command );
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
	
	private static String increaseIndend( String indent )
	{
		if( indent.startsWith("    ") )
			indent += "    ";
		else
			indent += "\t";
		return indent;
	}
	
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
			int end = document.getLineLength( currentLine )-1 + start;
			return document.get( start, end-start-1 );
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
}
