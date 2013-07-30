package com.patrick_vane.unrealscript.editor.extra;

import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;


public class CodeCompleter implements  IContentAssistProcessor
{
	@Override
	public ICompletionProposal[] computeCompletionProposals( ITextViewer viewer, int offset )
	{
		return new ICompletionProposal[0];
	}
	
	
	@Override
	public IContextInformation[] computeContextInformation( ITextViewer viewer, int offset )
	{
		return null;
	}
	
	@Override
	public char[] getCompletionProposalAutoActivationCharacters()
	{
		return null;
	}
	@Override
	public char[] getContextInformationAutoActivationCharacters()
	{
		return null;
	}
	
	@Override
	public String getErrorMessage()
	{
		return null;
	}
	@Override
	public IContextInformationValidator getContextInformationValidator()
	{
		return null;
	}
}
