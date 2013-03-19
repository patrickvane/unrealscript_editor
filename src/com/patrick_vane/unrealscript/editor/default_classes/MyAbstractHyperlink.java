package com.patrick_vane.unrealscript.editor.default_classes;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import com.patrick_vane.unrealscript.editor.parser.CodeWord;


public abstract class MyAbstractHyperlink implements IHyperlink
{
	private final CodeWord word;
	
	
	public MyAbstractHyperlink( CodeWord word )
	{
		this.word = word;
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
				return word.getFirstCharacterPosition();
			}
			
			@Override
			public int getLength()
			{
				return word.getLastCharacterPosition() - word.getFirstCharacterPosition();
			}
		};
	}
}
