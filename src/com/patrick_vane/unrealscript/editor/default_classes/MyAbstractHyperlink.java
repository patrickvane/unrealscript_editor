package com.patrick_vane.unrealscript.editor.default_classes;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import com.patrick_vane.unrealscript.editor.parser.CodeAttribute;
import com.patrick_vane.unrealscript.editor.parser.CodeWord;


public abstract class MyAbstractHyperlink implements IHyperlink
{
	private final CodeWord		word;
	private final CodeAttribute	attribute;
	
	
	public MyAbstractHyperlink( CodeWord word )
	{
		this.word = word;
		this.attribute = null;
	}
	public MyAbstractHyperlink( CodeAttribute attribute )
	{
		this.word = null;
		this.attribute = attribute;
	}
	
	
	@Override
	public String getTypeLabel()
	{
		return null;
	}
	
	@Override
	public String getHyperlinkText()
	{
		return null;
	}
	
	@Override
	public IRegion getHyperlinkRegion()
	{
		return new IRegion()
		{
			@Override
			public int getOffset()
			{
				if( word != null )
					return word.getFirstCharacterPosition();
				if( attribute != null )
					return attribute.getFirstCharacterPosition();
				return 0;
			}
			
			@Override
			public int getLength()
			{
				if( word != null )
					return word.getLastCharacterPosition() - word.getFirstCharacterPosition();
				if( attribute != null )
					return attribute.getLastCharacterPosition() - attribute.getFirstCharacterPosition();
				return 0;
			}
		};
	}
}
