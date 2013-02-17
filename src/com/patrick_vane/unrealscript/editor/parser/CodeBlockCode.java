package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public class CodeBlockCode implements Code
{
	protected CodeBlock parent;
	protected int firstCharacterPosition;
	protected int lastCharacterPosition;
	
	protected ArrayList<ArrayList<CodeWord>> lines = new ArrayList<ArrayList<CodeWord>>();
	protected ArrayList<CodeWord> words = new ArrayList<CodeWord>();
	protected CodeWord word;
	
	protected boolean closed = false;
	
	
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
		word = new CodeWord( characterPosition );
		words.add( word );
	}
	@Override
	public void closeWord( int characterPosition )
	{
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
		if( words.size() > 0 )
			return words;
		if( lines.size() > 0 )
			return lines.get( lines.size() - 1 );
		return new ArrayList<CodeWord>();
	}
	
	@Override
	public int getDepth()
	{
		return parent.getDepth();
	}
	
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
