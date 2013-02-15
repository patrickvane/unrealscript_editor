package patrick_vane_unrealscript_editor.editors;

import java.io.File;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.text.DefaultTextHover;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.source.DefaultAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import patrick_vane_unrealscript_editor.editors.constants.TagConstant;
import patrick_vane_unrealscript_editor.editors.default_classes.DoubleClickStrategy;
import patrick_vane_unrealscript_editor.editors.executable.SaveOnResourceChangesListener;
import patrick_vane_unrealscript_editor.editors.syntaxcolor.UnrealScriptSyntaxColor;


public class Configuration extends SourceViewerConfiguration
{
	private DoubleClickStrategy				doubleClickStrategy;
	private SaveOnResourceChangesListener	saveOnResourceChangesListener;
	
	
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
					saveOnResourceChangesListener 	= new SaveOnResourceChangesListener( rootFile );
					saveOnResourceChangesListener.start();
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
	public ITextHover getTextHover( ISourceViewer sourceViewer, String contentType )
	{
		return new DefaultTextHover( sourceViewer );
	}
	@Override
	public ITextHover getTextHover( ISourceViewer sourceViewer, String contentType, int stateMask )
	{
		return new DefaultTextHover( sourceViewer );
	}
}