package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public class CodeBlockCode implements Code
{
	protected CodeBlock							parent;
	
	protected ArrayList<ArrayList<CodeWord>>	lines					= new ArrayList<ArrayList<CodeWord>>();
	protected ArrayList<CodeWord>				words					= new ArrayList<CodeWord>();
	protected CodeWord							word;
	protected int								firstCharacterPosition	= -1;
	protected int								lastCharacterPosition	= -1;
	
	protected boolean							closed					= false;
	
	
	protected CodeBlockCode( CodeBlock parent )
	{
		this.parent = parent;
	}
	
	
	@Override
	public boolean isNewWordOpen()
	{
		return (word != null);
	}
	
	
	@Override
	public void addCharacter( int characterPosition, char character )
	{
		if( !isNewWordOpen() )
			newWord( characterPosition );
		
		word.addCharacter( character );
	}
	protected void newWord( int characterPosition )
	{
		if( firstCharacterPosition < 0 )
			firstCharacterPosition = characterPosition;
		else
			firstCharacterPosition = Math.min( characterPosition, firstCharacterPosition );
		
		word = new CodeWord( characterPosition );
		words.add( word );
	}
	@Override
	public void closeWord( int characterPosition )
	{
		if( lastCharacterPosition < 0 )
			lastCharacterPosition = characterPosition;
		else
			lastCharacterPosition = Math.max( characterPosition, lastCharacterPosition );
		
		if( word != null )
		{
			word.close( characterPosition );
			word = null;
		}
	}
	@Override
	public void newLine()
	{
		if( !words.isEmpty() )
		{
			lines.add( words );
			words = new ArrayList<CodeWord>();
		}
	}
	
	
	@Override
	public boolean isClosed()
	{
		return closed;
	}
	
	@Override
	public void close()
	{
		if( !closed )
		{
			closed = true;
			
			newLine();
			
			words = null;
		}
	}
	
	
	@Override
	public CodeBlock getParent()
	{
		return parent;
	}
	public ArrayList<ArrayList<CodeWord>> getLines()
	{
		return lines;
	}
	
	@Override
	public ArrayList<CodeWord> getLastLine()
	{
		if( (words != null) && (words.size() > 0) )
			return words;
		if( (lines != null) && (lines.size() > 0) )
			return lines.get( lines.size() - 1 );
		return new ArrayList<CodeWord>();
	}
	@Override
	public CodeWord getLastCompletedWord()
	{
		ArrayList<CodeWord> lastLine = getLastLine();
		if( (lastLine != null) && (lastLine.size() > 0) )
			return lastLine.get( lastLine.size() - 1 );
		return null;
	}
	
	@Override
	public int getFirstCharacterPosition()
	{
		return firstCharacterPosition;
	}
	@Override
	public int getLastCharacterPosition()
	{
		return lastCharacterPosition;
	}
	
	@Override
	public boolean isInFunction()
	{
		CodeBlock block = parent;
		while( block != null )
		{
			if( block.isFunction() )
				return true;
			block = block.getParent();
		}
		return false;
	}
	
	
	@Override
	public int getDepth()
	{
		return parent.getDepth();
	}
	
	@Override
	public boolean isChildOf( CodeBlock block )
	{
		return block.isParentOf( this );
	}
	
	@Override
	public int getBlockNumber()
	{
		return parent.getChildNumber( this );
	}
	
	public boolean isFirstInFunction()
	{
		CodeBlock block = parent;
		while( block != null )
		{
			if( block.isFunction() )
			{
				return (block.getChildNumber(this) == 1);
			}
			block = block.getParent();
		}
		return false;
	}
}
