package com.patrick_vane.unrealscript.editor.extra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.default_classes.CompletionProposalMessage;
import com.patrick_vane.unrealscript.editor.default_classes.KeywordDetector;
import com.patrick_vane.unrealscript.editor.parser.CodeAttribute;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeFunction;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeLocalVariable;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeVariable;
import com.patrick_vane.unrealscript.editor.parser.CodeWord.CodeWordData;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAdvancedParser;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAdvancedParser.ClassOrAttribute;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAttributes;


public class CodeCompleter implements IContentAssistProcessor
{
	private static final Image	localVariableImage		= UnrealScriptEditor.getImage( "icons/outline/var_public.gif" );
	private static final Image	variableImage			= UnrealScriptEditor.getImage( "icons/outline/var_private.gif" );
	private static final Image	functionImage			= UnrealScriptEditor.getImage( "icons/outline/function.gif" );
	private static final Image	functionOverriddenImage	= UnrealScriptEditor.getImage( "icons/outline/function_overridden.gif" );
	private static final Image	classImage				= UnrealScriptEditor.getImage( "icons/outline/class.gif" );
	
	
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
				ClassOrAttribute parentClassOrAttribute = UnrealScriptAdvancedParser.getClassOrAttributeAt( parent );
				if( parentClassOrAttribute != null )
				{
					if( parentClassOrAttribute.isAttribute() )
					{
						parentClass = UnrealScriptAdvancedParser.getClass( parentClassOrAttribute.attribute.getType() );
						canBeClass = false;
					}
					else if( parentClassOrAttribute.isClass() )
					{
						parentClass = parentClassOrAttribute.unrealscriptClass;
						canBeClass = false;
					}
				}
			}
			if( parentClass == null )
			{
				parentClass = UnrealScriptEditor.getActiveUnrealScriptClass();
				if( parentClass == null )
					return null;
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
			HashMap<String,CodeAttributeLocalVariable> localVariables = new HashMap<String,CodeAttributeLocalVariable>();
			UnrealScriptAttributes attributesOfClass = UnrealScriptAdvancedParser.getAttributesOfThisClassOnly( parentClass.getName() );
			UnrealScriptAttributes attributes = new UnrealScriptAttributes();
			HashMap<String,UnrealScriptClass> classes = new HashMap<String,UnrealScriptClass>();
			if( parentClass.getParent() != null )
			{
				attributes = UnrealScriptAdvancedParser.getAttributes( parentClass.getParent().getName() );
			}
			if( canBeClass )
			{
				localVariables = UnrealScriptAdvancedParser.getLocalVariables( parentClass.getName(), offset );
				classes = UnrealScriptAdvancedParser.getClasses();
			}
			HashSet<String> attributesAdded = new HashSet<String>();
			HashSet<String> functionsAdded = new HashSet<String>();
			
			
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
				
				if( (cwordWord.length() > 0) && !KeywordDetector.getSharedInstance().isWordStart(cwordWord.charAt(0)) )
					cwordWord = "";
				
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
				for( CodeAttributeLocalVariable attribute : Sorter.sortAttributeLocalVariables(localVariables.values()) )
				{
					String name = attribute.getName();
					if( name != null )
					{
						if( name.toLowerCase().startsWith(cwordWordLow) )
						{
							String addString = addedString + name.substring( cwordLength );
							String showString = cwordWordStart + name.substring( cwordStartLength ) + " : " + attribute.getType();
							
							completions.add( getCompletionProposal(attribute, addString, wordOffset+cwordLength, wordLength-cwordLength, addString.length(), localVariableImage, showString) );
						}
					}
				}
			}
			
			for( CodeAttributeVariable attribute : Sorter.sortAttributeVariables(attributesOfClass.getAttributeVariables()) )
			{
				String name = attribute.getName();
				if( name != null )
				{
					String nameLow = name.toLowerCase();
					if( isDot || nameLow.startsWith(cwordWordLow) )
					{
						attributesAdded.add( nameLow );
						
						String addString = addedString + name.substring( cwordLength );
						String showString = cwordWordStart + name.substring( cwordStartLength ) + " : " + attribute.getType();
						
						completions.add( getCompletionProposal(attribute, addString, wordOffset+cwordLength, wordLength-cwordLength, addString.length(), variableImage, "> "+showString) );
					}
				}
			}
			
			for( CodeAttributeVariable attribute : Sorter.sortAttributeVariables(attributes.getAttributeVariablesChildOverrides().values()) )
			{
				String name = attribute.getName();
				if( name != null )
				{
					String nameLow = name.toLowerCase();
					if( isDot || nameLow.startsWith(cwordWordLow) )
					{
						if( !attributesAdded.contains(nameLow) )
						{
							String addString = addedString + name.substring( cwordLength );
							String showString = cwordWordStart + name.substring( cwordStartLength ) + " : " + attribute.getType();
							
							completions.add( getCompletionProposal(attribute, addString, wordOffset+cwordLength, wordLength-cwordLength, addString.length(), variableImage, showString) );
						}
					}
				}
			}
			
			for( CodeAttributeFunction attribute : Sorter.sortAttributeFunctions(attributesOfClass.getAttributeFunctions()) )
			{
				String name = attribute.getName();
				if( name != null )
				{
					String nameLow = name.toLowerCase();
					if( isDot || nameLow.startsWith(cwordWordLow) )
					{
						functionsAdded.add( nameLow );
						
						String parameters = attribute.getParametersAsString( true );
						
						String addString = addedString + name.substring( cwordLength );
						String showString = cwordWordStart + name.substring( cwordStartLength ) + parameters + " : " + attribute.getType();
						if( !hasParentheses )
							addString += parameters;
						
						boolean overridden = (attributes.getAttributeFunction(name) != null);
						
						completions.add( getCompletionProposal(attribute, addString, wordOffset+cwordLength, wordLength-cwordLength, addString.length(), (overridden ? functionOverriddenImage : functionImage), "> "+showString) );
					}
				}
			}
			
			for( CodeAttributeFunction attribute : Sorter.sortAttributeFunctions(attributes.getAttributeFunctionsChildOverrides().values()) )
			{
				String name = attribute.getName();
				if( name != null )
				{
					String nameLow = name.toLowerCase();
					if( isDot || nameLow.startsWith(cwordWordLow) )
					{
						if( !functionsAdded.contains(nameLow) )
						{
							String parameters = attribute.getParametersAsString( true );
							
							String addString = addedString + name.substring( cwordLength );
							String showString = cwordWordStart + name.substring( cwordStartLength ) + parameters + " : " + attribute.getType();
							if( !hasParentheses )
								addString += parameters;
							
							completions.add( getCompletionProposal(attribute, addString, wordOffset+cwordLength, wordLength-cwordLength, addString.length(), functionImage, showString) );
						}
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
							completions.add( getCompletionProposal(ucClass, name, wordOffset, wordLength, name.length(), classImage, name) );
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
	
	
	private static ICompletionProposal getCompletionProposal( final UnrealScriptClass attribute, final String replacementString, final int replacementOffset, final int replacementLength, final int cursorPosition, final Image image, final String displayString )
	{
		return new ICompletionProposal()
		{
			@Override
			public Point getSelection( IDocument document )
			{
				return new Point( replacementOffset + cursorPosition, 0 );
			}
			
			@Override
			public Image getImage()
			{
				return image;
			}
			
			@Override
			public String getDisplayString()
			{
				if( displayString != null )
					return displayString;
				return replacementString;
			}
			
			@Override
			public IContextInformation getContextInformation()
			{
				return null;
			}
			
			@Override
			public String getAdditionalProposalInfo()
			{
				return TextHover.getTextOfAttribute( attribute );
			}
			
			@Override
			public void apply( IDocument document )
			{
				try
				{
					document.replace( replacementOffset, replacementLength, replacementString );
				}
				catch( Exception x )
				{
				}
			}
		};
	}
	
	private static ICompletionProposal getCompletionProposal( final CodeAttribute attribute, final String replacementString, final int replacementOffset, final int replacementLength, final int cursorPosition, final Image image, final String displayString )
	{
		return new ICompletionProposal()
		{
			@Override
			public Point getSelection( IDocument document )
			{
				return new Point( replacementOffset + cursorPosition, 0 );
			}
			
			@Override
			public Image getImage()
			{
				return image;
			}
			
			@Override
			public String getDisplayString()
			{
				if( displayString != null )
					return displayString;
				return replacementString;
			}
			
			@Override
			public IContextInformation getContextInformation()
			{
				return null;
			}
			
			@Override
			public String getAdditionalProposalInfo()
			{
				return TextHover.getTextOfAttribute( attribute );
			}
			
			@Override
			public void apply( IDocument document )
			{
				try
				{
					document.replace( replacementOffset, replacementLength, replacementString );
				}
				catch( Exception x )
				{
				}
			}
		};
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
