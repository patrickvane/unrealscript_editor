package patrick_vanes_unrealscript_editor.editors.parser;

import java.util.ArrayList;


public class CodeBlock implements Code
{
	protected CodeBlock parent;
	protected ArrayList<Code> childs = new ArrayList<Code>();
	protected boolean function;
	
	protected CodeBlockCode currentCode;
	protected boolean closed = false;
	
	
	protected CodeBlock( CodeBlock parent, int firstLineNumber )
	{
		currentCode = new CodeBlockCode( this, firstLineNumber );
		childs.add( currentCode );
		
		if( parent == null )
			function = false;
		else
			function = parent.getLastLine().contains( "function" );
		
		this.parent = parent;
		if( parent != null )
			parent.addChild( this );
	}
	
	
	@Override
	public void addCharacter( char character )
	{
		if( currentCode != null )
			currentCode.addCharacter( character );
	}
	@Override
	public void newWord()
	{
		if( currentCode != null )
			currentCode.newWord();
	}
	@Override
	public void newLine()
	{
		if( currentCode != null )
			currentCode.newLine();
	}
	
	
	private void addChild( CodeBlock child )
	{
		if( currentCode != null )
		{
			currentCode.close( child.getFirstLineNumber() );
			currentCode = null;
		}
		childs.add( child );
	}
	
	private void closedChild( CodeBlock child )
	{
		if( currentCode != null )
		{
			currentCode.close( child.getFirstLineNumber() );
			currentCode = null;
		}
		currentCode = new CodeBlockCode( this, child.getLastLineNumber() );
		childs.add( currentCode );
	}
	
	
	@Override
	public boolean isClosed()
	{
		return closed;
	}
	
	@Override
	public void close( int lastLineNumber )
	{
		if( !closed )
		{
			closed = true;
			
			if( currentCode != null )
			{
				currentCode.close( lastLineNumber );
				currentCode = null;
			}
			
			if( parent != null )
			{
				parent.closedChild( this );
			}
		}
	}
	
	
	@Override
	public int getFirstLineNumber()
	{
		return childs.get( 0 ).getFirstLineNumber();
	}
	@Override
	public int getLastLineNumber()
	{
		return childs.get( childs.size()-1 ).getLastLineNumber();
	}
	
	@Override
	public ArrayList<String> getLastLine()
	{
		ArrayList<String> line = new ArrayList<String>();
		int i = 1;
		while( (line.size() <= 0) && (childs.size() >= i) )
		{
			line = childs.get( childs.size()-i ).getLastLine();
			i++;
		}
		return line;
	}
	
	/** Is this block a function? */
	public boolean isFunction()
	{
		return function;
	}
	@Override
	public CodeBlock getParent()
	{
		return parent;
	}
	public ArrayList<Code> getChilds()
	{
		return childs;
	}
	
	/** Is this block inside a function? (is a parent block of this block a function?) */
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
		int depth = 0;
		CodeBlock block = parent;
		while( block != null )
		{
			depth++;
			block = block.getParent();
		}
		return depth;
	}
	
	public boolean isParentOf( Code block )
	{
		return childs.contains( block );
	}
	public boolean isChildOf( CodeBlock block )
	{
		return block.isParentOf( this );
	}
	
	/** Starts with 1, returns -1 if it is not a child of this block. */
	public int getChildNumber( Code block )
	{
		for( int i=0; i<childs.size(); i++ )
		{
			if( childs.get(i) == block )
			{
				return i+1;
			}
		}
		return -1;
	}
}
