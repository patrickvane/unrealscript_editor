package com.patrick_vane.unrealscript.editor.extra;

import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.default_classes.CompletionProposalMessage;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeFunction;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeVariable;
import com.patrick_vane.unrealscript.editor.parser.CodeWord.CodeWordData;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAdvancedParser;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAdvancedParser.ClassOrAttribute;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAttributes;


public class CodeCompleter implements  IContentAssistProcessor
{
	private static final Image	localVariableImage	= UnrealScriptEditor.getImage( "icons/outline/var_public.gif" );
	private static final Image	variableImage		= UnrealScriptEditor.getImage( "icons/outline/var_private.gif" );
	private static final Image	functionImage		= UnrealScriptEditor.getImage( "icons/outline/function.gif" );
	private static final Image	classImage			= UnrealScriptEditor.getImage( "icons/outline/class.gif" );
	
	
	@Override
	public ICompletionProposal[] computeCompletionProposals( ITextViewer viewer, int offset )
	{
		ArrayList<ICompletionProposal> completions = new ArrayList<ICompletionProposal>();
		
		CodeWordData word = UnrealScriptAdvancedParser.getWordAt( viewer.getDocument(), offset );
		CodeWordData wordCutoff = UnrealScriptAdvancedParser.getWordAt( viewer.getDocument(), offset, true );
		UnrealScriptClass parentClass = null;
		boolean canBeClass = true;
		boolean hasParentheses = true;
		
		
		if( word != null )
		{
			CodeWordData parent = word.getParentWord();
			if( parent != null )
			{
				canBeClass = false;
				ClassOrAttribute parentClassOrAttribute = UnrealScriptAdvancedParser.getClassOrAttributeAt( parent );
				if( parentClassOrAttribute != null )
				{
					if( parentClassOrAttribute.isAttribute() )
					{
						parentClass = UnrealScriptAdvancedParser.getClass( parentClassOrAttribute.attribute.getType() );
					}
					else if( parentClassOrAttribute.isClass() )
					{
						parentClass = parentClassOrAttribute.unrealscriptClass;
					}
				}
			}
			if( parentClass == null )
			{
				canBeClass = true;
				parentClass = UnrealScriptEditor.getActiveUnrealScriptClass();
			}
		}
		
		
		if( word != null )
		{
			if( word.line != null )
			{
				if( word.inLineArrayPos+1 < word.line.length )
				{
					hasParentheses = "(".equals( word.line[word.inLineArrayPos+1].getWord() );
				}
			}
		}
		
		
		if( (word != null) && (wordCutoff != null) && (parentClass != null) )
		{
			HashMap<String,CodeAttributeVariable> localVariables = new HashMap<String,CodeAttributeVariable>();
			UnrealScriptAttributes attributes = UnrealScriptAdvancedParser.getAttributes( parentClass.getName() );
			HashMap<String,UnrealScriptClass> classes = new HashMap<String,UnrealScriptClass>();
			if( canBeClass )
			{
				localVariables = UnrealScriptAdvancedParser.getLocalVariables( parentClass.getName(), offset );
				classes = UnrealScriptAdvancedParser.getClasses();
			}
			
			
			int wordOffset = word.word.getFirstCharacterPosition();
			
			String wordWord = word.word.getWord();
			int wordLength = wordWord.length();
			
			boolean isDot = ".".equals( wordCutoff.word.getWord() );
			String cwordWord = "";
			String cwordWordLow = "";
			String addedString = "";
			if( !isDot )
			{
				cwordWord = wordCutoff.word.getWord();
				cwordWordLow = cwordWord.toLowerCase();
			}
			else
			{
				addedString = ".";
			}
			String cwordWordStart = ((cwordWord.length() > 0) ? cwordWord.charAt(0)+"" : "");
			int cwordLength = cwordWord.length();
			int cwordStartLength = cwordWordStart.length();
			
			
			if( !isDot )
			{
				for( CodeAttributeVariable attribute : Sorter.sortAttributeVariables(localVariables.values()) )
				{
					String name = attribute.getName();
					if( name != null )
					{
						if( name.toLowerCase().startsWith(cwordWordLow) )
						{
							String addString = addedString + name.substring( cwordLength );
							String showString = cwordWordStart + name.substring( cwordStartLength ) + " : " + attribute.getType();
							
							completions.add( new CompletionProposal(addString, wordOffset+cwordLength, wordLength-cwordLength, addString.length(), localVariableImage, showString, null, null) );
						}
					}
				}
			}
			
			for( CodeAttributeVariable attribute : Sorter.sortAttributeVariables(attributes.getAttributeVariablesChildOverrides().values()) )
			{
				String name = attribute.getName();
				if( name != null )
				{
					if( isDot || name.toLowerCase().startsWith(cwordWordLow) )
					{
						String addString = addedString + name.substring( cwordLength );
						String showString = cwordWordStart + name.substring( cwordStartLength ) + " : " + attribute.getType();
						
						completions.add( new CompletionProposal(addString, wordOffset+cwordLength, wordLength-cwordLength, addString.length(), variableImage, showString, null, null) );
					}
				}
			}
			
			for( CodeAttributeFunction attribute : Sorter.sortAttributeFunctions(attributes.getAttributeFunctionsChildOverrides().values()) )
			{
				String name = attribute.getName();
				if( name != null )
				{
					if( isDot || name.toLowerCase().startsWith(cwordWordLow) )
					{
						String parameters = attribute.getParametersAsString( true );
						
						String addString = addedString + name.substring( cwordLength );
						String showString = cwordWordStart + name.substring( cwordStartLength ) + parameters + " : " + attribute.getType();
						if( !hasParentheses )
							addString += parameters;
						
						completions.add( new CompletionProposal(addString, wordOffset+cwordLength, wordLength-cwordLength, addString.length(), functionImage, showString, null, null) );
					}
				}
			}
			
			if( !isDot )
			{
				for( UnrealScriptClass ucClass : Sorter.sortClasses(classes.values()) )
				{
					String name = ucClass.getName();
					if( name != null )
					{
						if( name.toLowerCase().startsWith(cwordWordLow) )
						{
							completions.add( new CompletionProposal(name, wordOffset, wordLength, name.length(), classImage, name, null, null) );
						}
					}
				}
			}
		}
		
		
		if( completions.isEmpty() )
		{
			completions.add( new CompletionProposalMessage("No Default Proposals") );
		}
		
		return completions.toArray( new ICompletionProposal[0] );
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
