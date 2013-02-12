package patrick_vane_unrealscript_editor.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.AnnotationRulerColumn;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;
import patrick_vane_unrealscript_editor.editors.console.UnrealScriptCompilerConsole;
import patrick_vane_unrealscript_editor.editors.default_classes.ColorManager;
import patrick_vane_unrealscript_editor.editors.default_classes.DocumentProvider;
import patrick_vane_unrealscript_editor.editors.parser.CodeException;
import patrick_vane_unrealscript_editor.editors.parser.UnrealScriptParser;


public class UnrealScriptEditor extends TextEditor
{
	public UnrealScriptEditor()
	{
		super();
		
		UnrealScriptCompilerConsole.init();
		
		setSourceViewerConfiguration( new Configuration() );
		setDocumentProvider( new DocumentProvider() );
		
		initializeSourceViewer();
		thread.start();
		
		try
		{
			PlatformUI.getWorkbench().showPerspective( UnrealScriptID.VIEW_PERSPECTIVE, PlatformUI.getWorkbench().getActiveWorkbenchWindow() );
		}
		catch( Exception e )
		{
		}
		
		//if( !PlatformUI.getWorkbench().saveAllEditors(true) )
		//	return;
		//PlatformUI.getWorkbench().getProgressService().run( fork, cancelable, runnable )
		
		//UDKCompilerSettingsPopup popup = new UDKCompilerSettingsPopup();
		//popup.setLocationRelativeTo( null );
		//popup.setVisible( true );
	}
	
	
	private boolean runThread = true;
	private Thread thread = new Thread()
	{
		@Override
		public void run()
		{
			while( runThread )
			{
				try
				{
					Thread.sleep( 2000 );
					updateMarkers();
				}
				catch( Exception e )
				{
				}
			}
		}
	};
	
	
	protected void initializeSourceViewer()
	{
		IAnnotationModel model = getDocumentProvider().getAnnotationModel( getEditorInput() );
		IDocument document = getDocumentProvider().getDocument( getEditorInput() );
		
		if( document != null )
		{
			getSourceViewer().setDocument( document, model );
			createVerticalRuler().setModel( model );
		}
	}
	@Override
	protected IVerticalRuler createVerticalRuler()
	{
		CompositeRuler ruler = new CompositeRuler();
		ruler.addDecorator( 0, new AnnotationRulerColumn(VERTICAL_RULER_WIDTH) );
		return ruler;
	}
	
	
	public void addErrorMarker( final int startCharacter, final int endCharacter, final String message )
	{
		final IFile file = getFile();
		try
		{
			if( file != null )
			{
				IMarker marker = file.createMarker( UnrealScriptID.MARKER_ERROR );
				marker.setAttribute( IMarker.CHAR_START, startCharacter );
				marker.setAttribute( IMarker.CHAR_END, endCharacter );
				marker.setAttribute( IMarker.LOCATION, "UnrealScript File" );
				marker.setAttribute( IMarker.SEVERITY, IMarker.SEVERITY_ERROR );
				marker.setAttribute( IMarker.MESSAGE, message );
			}
		}
		catch( CoreException e )
		{
		}
	}
	public void clearMarkers()
	{
		final IFile file = getFile();
		if( file != null )
		{
			try
			{
				file.deleteMarkers( UnrealScriptID.MARKER_ERROR, true, IResource.DEPTH_INFINITE );
			}
			catch( CoreException e )
			{
				e.printStackTrace();
			}
		}
	}
	
	
	public void updateMarkers()
	{
		CodeException[] exceptions = null;
		if( getSourceViewer() != null )
		{
			if( getSourceViewer().getDocument() != null )
			{
				exceptions = UnrealScriptParser.findErrors( getSourceViewer().getDocument().get() );
			}
		}
		
		final CodeException[] EXCEPTIONS = exceptions;
		getSourceViewer().getTextWidget().getDisplay().syncExec
		( 
			new Runnable()
			{
				@Override
				public void run()
				{
					clearMarkers();
					if( EXCEPTIONS != null )
					{
						for( CodeException e : EXCEPTIONS )
						{
							if( e.isError() )
							{
								addErrorMarker( e.getFirstCharacterPosition(), e.getLastCharacterPosition(), e.getMessage() );
							}
						}
					}
				}
			}
		);
	}
	
	
	public IFile getFile()
	{
		if( getEditorInput() != null )
			return (IFile) getEditorInput().getAdapter( IFile.class );
		return null;
	}
	
	
	@Override
	public void dispose()
	{
		runThread = false;
		ColorManager.dispose();
		super.dispose();
	}
}
