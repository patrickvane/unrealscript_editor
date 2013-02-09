package patrick_vanes_unrealscript_editor.editors.parser;

import java.util.ArrayList;


public class CodeBlockCode implements Code
{
	protected CodeBlock parent;
	protected int firstLineNumber;
	protected int lastLineNumber;
	
	protected ArrayList<ArrayList<String>> lines = new ArrayList<ArrayList<String>>();
	protected ArrayList<String> words = new ArrayList<String>();
	protected StringBuilder characters = new StringBuilder();
	
	
	protected CodeBlockCode( CodeBlock parent, int firstLineNumber )
	{
		this.parent = parent;
		this.firstLineNumber = firstLineNumber;
	}
	
	
	@Override
	public void addCharacter( char character )
	{
		characters.append( character );
	}
	@Override
	public void newWord()
	{
		if( characters.length() > 0 )
		{
			words.add( characters.toString().toLowerCase() ); // lowercase everything
			characters = new StringBuilder();
		}
	}
	@Override
	public void newLine()
	{
		newWord();
		if( !words.isEmpty() )
		{
			lines.add( words );
			words = new ArrayList<String>();
		}
	}
	
	@Override
	public void close( int lastLineNumber )
	{
		this.lastLineNumber = lastLineNumber;
		newLine();
		
		characters = null;
		words = null;
	}
	
	
	@Override
	public int getFirstLineNumber()
	{
		return firstLineNumber;
	}
	@Override
	public int getLastLineNumber()
	{
		return lastLineNumber;
	}
	
	@Override
	public CodeBlock getParent()
	{
		return parent;
	}
	
	public ArrayList<ArrayList<String>> getLines()
	{
		return lines;
	}
	@Override
	public ArrayList<String> getLastLine()
	{
		if( words.size() > 0 )
			return words;
		if( lines.size() > 0 )
			return lines.get( lines.size() - 1 );
		return new ArrayList<String>();
	}
	
	@Override
	public int getDepth()
	{
		return parent.getDepth();
	}
}
