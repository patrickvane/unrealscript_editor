package patrick_vane_unrealscript_editor.editors;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.AnnotationRulerColumn;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;
import patrick_vane_unrealscript_editor.editors.console.UnrealScriptCompilerConsole;
import patrick_vane_unrealscript_editor.editors.default_classes.ColorManager;
import patrick_vane_unrealscript_editor.editors.default_classes.DocumentProvider;
import patrick_vane_unrealscript_editor.editors.default_classes.MyRunnable;
import patrick_vane_unrealscript_editor.editors.default_classes.MyStream;
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
			PlatformUI.getWorkbench().showPerspective( UnrealScriptID.PERSPECTIVE, PlatformUI.getWorkbench().getActiveWorkbenchWindow() );
		}
		catch( Exception e )
		{
		}
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
		IWorkspaceRunnable runnable = new IWorkspaceRunnable()
		{
			@Override
			public void run( IProgressMonitor monitor ) throws CoreException
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
		};
		try
		{
			ResourcesPlugin.getWorkspace().run( runnable, new NullProgressMonitor() );
		}
		catch( CoreException e )
		{
		}
	}
	
	
	public IFile getFile()
	{
		if( getEditorInput() != null )
			return (IFile) getEditorInput().getAdapter( IFile.class );
		return null;
	}
	
	
	public static IWorkbenchWindow getActiveWorkbenchWindow()
	{
		MyRunnable runnable = new MyRunnable()
		{
			@Override
			public void run()
			{
				done( PlatformUI.getWorkbench().getActiveWorkbenchWindow() );
			}
		};
		Display.getDefault().syncExec( runnable );
		while( !runnable.isDone() )
		{
			try
			{
				Thread.sleep( 20 );
			}
			catch( Exception e )
			{
			}
		}
		if( runnable.getResult() != null )
			return (IWorkbenchWindow) runnable.getResult();
		return null;
	}
	public static IFile getActiveFile()
	{
		try
		{
			Object object = getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput().getAdapter( IFile.class );
			if( object instanceof IFile )
			{
				return (IFile) object;
			}
		}
		catch( Exception e )
		{
		}
		return null;
	}
	public static IProject getProject( String name )
	{
		try
		{
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			return myWorkspaceRoot.getProject( name );
		}
		catch( Exception e )
		{
		}
		return null;
	}
	public static IProject getActiveProject()
	{
		try
		{
			IFile file = getActiveFile();
			IContainer project = file.getProject();
			while( project.getParent().getParent() != null )
			{
				project = project.getParent();
			}
			return project.getProject();
		}
		catch( Exception e )
		{
		}
		return null;
	}
	public static File getActiveProjectFile()
	{
		try
		{
			return new File( UnrealScriptEditor.getActiveProject().getFolder("UnrealScript").getLocationURI() ).getParentFile().getParentFile();
		}
		catch( Exception e )
		{
			return null;
		}
	}
	public static IProject getSelectedProject() throws Exception
	{
		return getSelectedProject( getActiveWorkbenchWindow() );
	}
	public static IProject getSelectedProject( IWorkbenchWindow window ) throws Exception
	{
		if( window == null )
			window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if( window == null )
			return null;
		IProject project = null;
		ISelection selection = window.getSelectionService().getSelection( UnrealScriptID.VIEW_NAVIGATOR );
		if( (selection != null) && !selection.isEmpty() )
		{
			if( selection instanceof TreeSelection )
			{
				Object[] selectedObjects = ((TreeSelection) selection).toArray();
				ArrayList<IProject> projects = new ArrayList<IProject>();
				for( Object selectedObject : selectedObjects )
				{
					if( selectedObject instanceof IProject )
					{
						projects.add( (IProject) selectedObject );
					}
				}
				if( projects.size() > 1 )
				{
					throw new Exception( "You need to select one Project (in the Package Explorer), you've selected several Projects." );
				}
				if( projects.size() == 1 )
				{
					project = projects.get( 0 );
				}
			}
		}
		if( project == null )
		{
			throw new Exception( "You need to select a Project (in the Package Explorer)" );
		}
		return project;
	}
	
	
	/** 
	 * Returns the exit value:<br>
	 *  0 = ok<br>
	 * -1 = failed (inside java)<br>
	 *  1+ = process failed, number represents an error code<br>
	 */
	public static int runUDK( final boolean newWindow, PrintStream output, PrintStream error, final Collection<String> params )
	{
		return runUDK( newWindow, output, error, params.toArray(new String[0]) );
	}
	/** 
	 * Returns the exit value:<br>
	 *  0 = ok<br>
	 * -1 = failed (inside java)<br>
	 *  1+ = process failed, number represents an error code<br>
	 */
	public static int runUDK( final boolean newWindow, PrintStream output, PrintStream error, final String... params )
	{
		if( !PlatformUI.getWorkbench().saveAllEditors(true) )
			return -1;
		if( output == null )
			output = System.out;
		if( error == null )
		{
			if( output == System.out )
				error = System.err;
			else
				error = output;
		}
		
		
		boolean bit64;
		String root;
		try
		{
			bit64 = Boolean.parseBoolean( getActiveProject().getPersistentProperty(UnrealScriptID.PROPERTY_64BIT) );
			root = getActiveProjectFile().getAbsolutePath() + "/";
		}
		catch( Exception e )
		{
			bit64 = false;
			root = "C:/UDK/";
			e.printStackTrace( error );
		}
		String binFolder = root+"Binaries/"+(bit64?"Win64":"Win32")+"/";
		String executablePath = binFolder+"UDK."+(newWindow?"exe":"com");
		
		File bin = new File( binFolder );
		File executable = new File( executablePath );
		if( !executable.exists() )
		{
			error.println( "\""+executable.getAbsolutePath()+"\" doesn't exist" );
			return -1;
		}
		
		
		ArrayList<String> commandLine = new ArrayList<String>();
		commandLine.add( executable.getAbsolutePath() );
		for( String param : params )
		{
			commandLine.add( param );
		}
		//commandLine.add( "-forcelogflush" );
		
		StringBuilder command = new StringBuilder();
		for( String arg : commandLine )
		{
			command.append(" \""+arg+"\"");
		}
		
		
		try
		{
			Process process = Runtime.getRuntime().exec( command.toString(), null, bin );
			MyStream.copy( process.getInputStream(), output );
			MyStream.copy( process.getErrorStream(), error  );
			return process.waitFor();
		}
		catch( Exception e )
		{
			e.printStackTrace( error );
			return -1;
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
