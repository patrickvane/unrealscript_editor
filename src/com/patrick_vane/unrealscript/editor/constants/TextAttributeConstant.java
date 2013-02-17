package com.patrick_vane.unrealscript.editor.constants;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.swt.SWT;
import com.patrick_vane.unrealscript.editor.default_classes.ColorManager;


public class TextAttributeConstant
{
	public static final TextAttribute createDefault()
	{
		return new TextAttribute( ColorManager.getColor(0, 0, 0), null, SWT.NONE );
	}
	public static final TextAttribute createKeyword()
	{
		return new TextAttribute( ColorManager.getColor(128, 0, 84), null, SWT.BOLD );
	}
	public static final TextAttribute createComment()
	{
		return new TextAttribute( ColorManager.getColor(64, 128, 96), null, SWT.NONE );
	}
	public static final TextAttribute createDocs()
	{
		return new TextAttribute( ColorManager.getColor(64, 64, 255), null, SWT.NONE );
	}
	public static final TextAttribute createString()
	{
		return new TextAttribute( ColorManager.getColor(0, 0, 255), null, SWT.NONE );
	}
}
