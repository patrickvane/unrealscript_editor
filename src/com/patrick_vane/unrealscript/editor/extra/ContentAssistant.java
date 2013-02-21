package com.patrick_vane.unrealscript.editor.extra;

import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;


public class ContentAssistant implements IContentAssistant
{
	@Override
	public void install( ITextViewer textViewer )
	{
	}
	@Override
	public void uninstall()
	{
	}
	
	@Override
	public String showPossibleCompletions()
	{
		return null;
	}
	
	@Override
	public String showContextInformation()
	{
		return null;
	}
	
	@Override
	public IContentAssistProcessor getContentAssistProcessor( String contentType )
	{
		return null;
	}
}
