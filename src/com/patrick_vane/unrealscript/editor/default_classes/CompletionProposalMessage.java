package com.patrick_vane.unrealscript.editor.default_classes;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;


public class CompletionProposalMessage implements ICompletionProposal
{
	protected final String message;
	
	
	public CompletionProposalMessage( String message )
	{
		this.message = message;
	}
	
	
	@Override
	public void apply( IDocument document )
	{
	}
	@Override
	public Point getSelection( IDocument document )
	{
		return null;
	}
	@Override
	public String getAdditionalProposalInfo()
	{
		return null;
	}
	@Override
	public String getDisplayString()
	{
		return message;
	}
	@Override
	public Image getImage()
	{
		return null;
	}
	@Override
	public IContextInformation getContextInformation()
	{
		return null;
	}
}
