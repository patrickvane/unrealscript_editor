package com.patrick_vane.unrealscript.editor;

import java.io.File;
import java.util.HashMap;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.source.DefaultAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import com.patrick_vane.unrealscript.editor.constants.TagConstant;
import com.patrick_vane.unrealscript.editor.default_classes.DoubleClickStrategy;
import com.patrick_vane.unrealscript.editor.extra.AutoEditStrategy;
import com.patrick_vane.unrealscript.editor.extra.ContentAssistant;
import com.patrick_vane.unrealscript.editor.extra.TextHover;
import com.patrick_vane.unrealscript.editor.syntaxcolor.UnrealScriptSyntaxColor;


public class Configuration extends SourceViewerConfiguration
{
	private DoubleClickStrategy	doubleClickStrategy;
	
	private static HashMap<File,FileChangesListener> saveOnResourceChangesListeners = new HashMap<File,FileChangesListener>();
	
	
	public Configuration()
	{
		doubleClickStrategy = new DoubleClickStrategy();
		
		new Thread()
		{
			@Override
			public void run()
			{
				try
				{
					IProject project 				= UnrealScriptEditor.getActiveProject();
					IFolder scriptFolder 			= project.getFolder( "UnrealScript" );
					File rootFile 					= new File( scriptFolder.getLocationURI() );
					synchronized( saveOnResourceChangesListeners )
					{
						if( saveOnResourceChangesListeners.get(rootFile) == null )
						{
							FileChangesListener saveOnResourceChangesListener = new FileChangesListener( rootFile );
							saveOnResourceChangesListener.start();
							saveOnResourceChangesListeners.put( rootFile, saveOnResourceChangesListener );
						}
					}
				}
				catch( Exception e )
				{
					e.printStackTrace();
				}
			}
		}.start();
	}
	
	
	@Override
	public IPresentationReconciler getPresentationReconciler( ISourceViewer sourceViewer )
	{
		return UnrealScriptSyntaxColor.createPresentationReconciler( sourceViewer );
	}
	@Override
	public String[] getConfiguredContentTypes( ISourceViewer sourceViewer )
	{
		return TagConstant.TAGS;
	}
	@Override
	public ITextDoubleClickStrategy getDoubleClickStrategy( ISourceViewer sourceViewer, String contentType )
	{
		return doubleClickStrategy;
	}
	
	@Override
	public IAnnotationHover getAnnotationHover( ISourceViewer sourceViewer )
	{
		return new DefaultAnnotationHover();
	}
	@Override
	public IAutoEditStrategy[] getAutoEditStrategies( ISourceViewer sourceViewer, String contentType )
	{
		return new IAutoEditStrategy[]{ new AutoEditStrategy() };
	}
	@Override
	public IContentAssistant getContentAssistant( ISourceViewer sourceViewer )
	{
		return new ContentAssistant();
	}
	
	@Override
	public ITextHover getTextHover( ISourceViewer sourceViewer, String contentType )
	{
		return new TextHover();
	}
	@Override
	public ITextHover getTextHover( ISourceViewer sourceViewer, String contentType, int stateMask )
	{
		return new TextHover();
	}
}