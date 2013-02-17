package com.patrick_vane.unrealscript.editor.default_classes;

import org.eclipse.jface.text.TextAttribute;


public class TagAndTextAttribute
{
	private TextAttribute textAttribute;
	private String tag;
	
	
	public TagAndTextAttribute( String tag, TextAttribute textAttribute )
	{
		this.tag = tag;
		this.textAttribute = textAttribute;
	}
	
	
	public String getTag()
	{
		return tag;
	}
	
	public TextAttribute getTextAttribute()
	{
		return textAttribute;
	}
}
