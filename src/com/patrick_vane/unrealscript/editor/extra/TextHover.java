package com.patrick_vane.unrealscript.editor.extra;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;


public class TextHover implements ITextHover
{
    @Override
    public String getHoverInfo( ITextViewer textviewer, IRegion region )
    {
		return null;
    }
    
	@Override
	public IRegion getHoverRegion( ITextViewer textViewer, int offset )
	{
		return null;
	}
}