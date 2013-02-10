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
import org.eclipse.ui.editors.text.TextEditor;
import patrick_vane_unrealscript_editor.editors.default_classes.ColorManager;
import patrick_vane_unrealscript_editor.editors.default_classes.DocumentProvider;
import patrick_vane_unrealscript_editor.editors.parser.CodeErrorException;
import patrick_vane_unrealscript_editor.editors.parser.MyParser;


public class UnrealScriptEditor extends TextEditor
{
	private static final String ERROR_MARKER_ID = "org.eclipse.unrealscript.markers.error";
	
	
	public UnrealScriptEditor()
	{
		super();
		setSourceViewerConfiguration( new Configuration() );
		setDocumentProvider( new DocumentProvider() );
		
		initializeSourceViewer();
		thread.start();
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
					showErrors();
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
	
	
	private IMarker marker;
	public void addErrorMarker( IDocument document, int startCharacter, int endCharacter, String message )
	{
		clearErrorMarker();
		if( getEditorInput() != null )
		{
			IFile file = (IFile) getEditorInput().getAdapter( IFile.class );
			if( file != null )
			{
				createErrorMarker( file, document, startCharacter, endCharacter, message );
			}
		}
	}
	public void createErrorMarker( final IResource resource, final IDocument document, final int startCharacter, final int endCharacter, final String message )
	{
		getSite().getShell().getDisplay().syncExec
		(
			new Runnable()
			{
				@Override
				public void run()
				{
					try
					{
						clearErrorMarker();
						marker = resource.createMarker( ERROR_MARKER_ID );
						//marker.setAttribute( IMarker.LINE_NUMBER, document.getLineOfOffset(startCharacter) );
						marker.setAttribute( IMarker.CHAR_START, startCharacter );
						marker.setAttribute( IMarker.CHAR_END, endCharacter );
						marker.setAttribute( IMarker.LOCATION, "UnrealScript File" );
						marker.setAttribute( IMarker.SEVERITY, IMarker.SEVERITY_ERROR );
						marker.setAttribute( IMarker.MESSAGE, message );
					}
					catch( Exception e )
					{
					}
				}
			}
		);
	}
	public void clearErrorMarker()
	{
		if( marker != null )
		{
			try
			{
				marker.delete();
			}
			catch( CoreException e )
			{
				e.printStackTrace();
			}
			marker = null;
		}
	}
	
	
	public void showErrors()
	{
		try
		{
			if( getSourceViewer() != null )
				if( getSourceViewer().getDocument() != null )
					MyParser.checkForErrors( getSourceViewer().getDocument().get() );
			clearErrorMarker();
		}
		catch( CodeErrorException e )
		{
			addErrorMarker( getSourceViewer().getDocument() , e.getFirstCharacterPosition(), e.getLastCharacterPosition(), e.getMessage() );
		}
	}
	
	
	@Override
	public void dispose()
	{
		runThread = false;
		ColorManager.dispose();
		super.dispose();
	}
}
