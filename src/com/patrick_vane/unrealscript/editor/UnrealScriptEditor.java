package com.patrick_vane.unrealscript.editor;

import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
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
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.IDocumentProvider;
import com.patrick_vane.unrealscript.editor.class_hierarchy.TypeHierarchyView;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClassHierarchyParser;
import com.patrick_vane.unrealscript.editor.constants.ProjectConstant;
import com.patrick_vane.unrealscript.editor.default_classes.DocumentProvider;
import com.patrick_vane.unrealscript.editor.default_classes.MyRunnable;
import com.patrick_vane.unrealscript.editor.default_classes.MyStream;
import com.patrick_vane.unrealscript.editor.parser.CodeException;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptParser;


public class UnrealScriptEditor extends TextEditor
{
	public UnrealScriptEditor()
	{
		super();
		
		setSourceViewerConfiguration( new Configuration() );
		setDocumentProvider( new DocumentProvider() );
		
		initializeSourceViewer();
		updateMarkersThread.start();
		TypeHierarchyView.fileChanged();
		
		try
		{
			PlatformUI.getWorkbench().showPerspective( UnrealScriptID.PERSPECTIVE, getActiveWorkbenchWindow() );
		}
		catch( Exception e )
		{
		}
	}
	
	
	private int markers = -1;
	private boolean updateMarkersThreadRunning = true;
	private Thread updateMarkersThread = new Thread()
	{
		@Override
		public void run()
		{
			while( updateMarkersThreadRunning )
			{
				try
				{
					Thread.sleep( 1000 );
				}
				catch( Exception e )
				{
				}
				
				try
				{
					updateIsDirty();
				}
				catch( Exception e )
				{
				}
				
				try
				{
					updateMarkers();
				}
				catch( Exception e )
				{
				}
				
				//TODO: create outline view
				// remove vvvvv
				/*try
				{
					String data = getSourceViewer().getDocument().get();
					String className = getClassName( data );
					
					if( TypeHierarchyView.isRootFromThisProject() )
					{
						UnrealScriptClass thisClass = TypeHierarchyView.getRoot().getClass( className );
						if( thisClass != null )
						{
							CodeBlock thisCode = UnrealScriptParser.parse( thisClass.getFile() );
							ArrayList<CodeAttribute> thisAttributes = UnrealScriptParser.getAttributes( thisCode );
							for( CodeAttribute attribute : thisAttributes )
								System.out.println( attribute );
							
							UnrealScriptClass parentClass = thisClass.getParent();
							while( parentClass.getParent() != null )
							{
								CodeBlock parentCode = UnrealScriptParser.parse( parentClass.getFile() );
								ArrayList<CodeAttribute> parentAttributes = UnrealScriptParser.getAttributes( parentCode );
								for( CodeAttribute attribute : parentAttributes )
									System.out.println( attribute );
								parentClass = parentClass.getParent();
							}
						}
					}
				}
				catch( Exception e )
				{
				}*/
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
	
	
	// markers >>
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
			
			if( (markers != 0) || ((exceptions != null) && (exceptions.length != 0)) )
			{
				if( exceptions != null )
					markers = exceptions.length;
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
									addErrorMarker( e.getFirstCharacterPosition(), e.getLastCharacterPosition(), e.getMessage() );
								else
									addWarningMarker( e.getFirstCharacterPosition(), e.getLastCharacterPosition(), e.getMessage() );
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
		}
		
		public void addErrorMarker( final int startCharacter, final int endCharacter, final String message )
		{
			final IFile file = getFile();
			try
			{
				if( file != null )
				{
					IMarker marker = file.createMarker( UnrealScriptID.MARKER_PROBLEM );
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
		public void addWarningMarker( final int startCharacter, final int endCharacter, final String message )
		{
			final IFile file = getFile();
			try
			{
				if( file != null )
				{
					IMarker marker = file.createMarker( UnrealScriptID.MARKER_PROBLEM );
					marker.setAttribute( IMarker.CHAR_START, startCharacter );
					marker.setAttribute( IMarker.CHAR_END, endCharacter );
					marker.setAttribute( IMarker.LOCATION, "UnrealScript File" );
					marker.setAttribute( IMarker.SEVERITY, IMarker.SEVERITY_WARNING );
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
					file.deleteMarkers( UnrealScriptID.MARKER_PROBLEM, true, IResource.DEPTH_INFINITE );
				}
				catch( CoreException e )
				{
					e.printStackTrace();
				}
			}
		}
	// markers <<
	
	
	// this class methods >>
		public IFile getFile()
		{
			if( getEditorInput() != null )
				return (IFile) getEditorInput().getAdapter( IFile.class );
			return null;
		}
		
		@Override
		public boolean isDirty()
		{
			return calculateIsDirty();
		}
		public boolean calculateIsDirty()
		{
			String currentContent = getActiveEditorContent();
			if( currentContent == null )
				return false;
			String savedContent = getFileContent( getFile() );
			if( savedContent == null )
				return false;
			return !savedContent.equals( currentContent );
		}
		public void updateIsDirty()
		{
			Display.getDefault().syncExec
			( 
				new Runnable()
				{
					@Override
					public void run()
					{
						firePropertyChange( PROP_DIRTY );
					}
				}
			);
		}
	// this class methods <<
	
	
	// static methods >>
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
		public static UnrealScriptEditor getActiveEditor()
		{
			IWorkbenchWindow window = getActiveWorkbenchWindow();
			if( window == null )
				return null;
			IWorkbenchPage page = getActiveWorkbenchWindow().getActivePage();
			if( page == null )
				return null;
			IEditorPart activeEditor = page.getActiveEditor();
			if( activeEditor instanceof UnrealScriptEditor )
				return (UnrealScriptEditor) activeEditor;
			return null;
		}
		public static IDocument getActiveEditorDocument()
		{
			UnrealScriptEditor activeEditor = getActiveEditor();
			if( activeEditor == null )
				return null;
			IEditorInput input = activeEditor.getEditorInput();
			IDocumentProvider provider = activeEditor.getDocumentProvider();
			if( (input == null) || (provider == null) )
				return null;
			return provider.getDocument( input );
		}
		public static String getActiveEditorContent()
		{
			IDocument doc = getActiveEditorDocument();
			if( doc == null )
				return null;
			return doc.get();
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
		public static File getProjectFile( IProject project )
		{
			try
			{
				return new File( project.getFolder("UnrealScript").getLocationURI() ).getParentFile().getParentFile();
			}
			catch( Exception e )
			{
				return null;
			}
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
				return getProjectFile( getActiveProject() );
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
				window = getActiveWorkbenchWindow();
			if( window == null )
				throw new Exception( "No workbench window available" );
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
		public static IFile getSelectedFile() throws Exception
		{
			return getSelectedFile( getActiveWorkbenchWindow() );
		}
		public static IFile getSelectedFile( IWorkbenchWindow window ) throws Exception
		{
			if( window == null )
				window = getActiveWorkbenchWindow();
			if( window == null )
				throw new Exception( "No workbench window available" );
			IFile file = null;
			ISelection selection = window.getSelectionService().getSelection( UnrealScriptID.VIEW_NAVIGATOR );
			if( (selection != null) && !selection.isEmpty() )
			{
				if( selection instanceof TreeSelection )
				{
					Object[] selectedObjects = ((TreeSelection) selection).toArray();
					ArrayList<IFile> files = new ArrayList<IFile>();
					for( Object selectedObject : selectedObjects )
					{
						if( selectedObject instanceof IFile )
						{
							files.add( (IFile) selectedObject );
						}
					}
					if( files.size() > 1 )
					{
						throw new Exception( "You need to select one File (in the Package Explorer), you've selected several Files." );
					}
					if( files.size() == 1 )
					{
						file = files.get( 0 );
					}
				}
			}
			if( file == null )
			{
				throw new Exception( "You need to select a File (in the Package Explorer)" );
			}
			return file;
		}
		public static IFolder getSelectedFolder() throws Exception
		{
			return getSelectedFolder( getActiveWorkbenchWindow() );
		}
		public static IFolder getSelectedFolder( IWorkbenchWindow window ) throws Exception
		{
			if( window == null )
				window = getActiveWorkbenchWindow();
			if( window == null )
				throw new Exception( "No workbench window available" );
			IFolder folder = null;
			ISelection selection = window.getSelectionService().getSelection( UnrealScriptID.VIEW_NAVIGATOR );
			if( (selection != null) && !selection.isEmpty() )
			{
				if( selection instanceof TreeSelection )
				{
					Object[] selectedObjects = ((TreeSelection) selection).toArray();
					ArrayList<IFolder> folders = new ArrayList<IFolder>();
					for( Object selectedObject : selectedObjects )
					{
						if( selectedObject instanceof IFolder )
						{
							folders.add( (IFolder) selectedObject );
						}
					}
					if( folders.size() > 1 )
					{
						throw new Exception( "You need to select one Folder (in the Package Explorer), you've selected several Folders." );
					}
					if( folders.size() == 1 )
					{
						folder = folders.get( 0 );
					}
				}
			}
			if( folder == null )
			{
				throw new Exception( "You need to select a Folder (in the Package Explorer)" );
			}
			return folder;
		}
		
		public static IProject getSelectedOrActiveProject() throws Exception
		{
			return getSelectedOrActiveProject( getActiveWorkbenchWindow() );
		}
		public static IProject getSelectedOrActiveProject( IWorkbenchWindow window ) throws Exception
		{
			if( window == null )
				window = getActiveWorkbenchWindow();
			if( window == null )
				throw new Exception( "No workbench window available" );
			
			try
			{
				IProject project = getSelectedProject( window );
				if( project != null )
					return project;
			}
			catch( Exception e )
			{
			}
			
			try
			{
				IFile file = getSelectedFile( window );
				IProject project = file.getProject();
				if( project != null )
					return project;
			}
			catch( Exception e )
			{
			}
			
			try
			{
				IFolder folder = getSelectedFolder( window );
				IProject project = folder.getProject();
				if( project != null )
					return project;
			}
			catch( Exception e )
			{
			}
			
			try
			{
				IProject project = getActiveProject( );
				if( project != null )
					return project;
			}
			catch( Exception e )
			{
			}
			
			throw new Exception( "You need to select a Project or a File from a Project (in the Package Explorer), or you need to have a File from a Project currently open" );
		}
		
		public static IProject getSelectedOrActiveUDKProject() throws Exception
		{
			return getSelectedOrActiveUDKProject( getActiveWorkbenchWindow() );
		}
		public static IProject getSelectedOrActiveUDKProject( IWorkbenchWindow window ) throws Exception
		{
			if( window == null )
				window = getActiveWorkbenchWindow();
			if( window == null )
				throw new Exception( "No workbench window available" );
			
			try
			{
				IProject project = getSelectedProject( window );
				if( isProjectUDK(project) )
					return project;
			}
			catch( Exception e )
			{
			}
			
			try
			{
				IFile file = getSelectedFile( window );
				IProject project = file.getProject();
				if( isProjectUDK(project) )
					return project;
			}
			catch( Exception e )
			{
			}
			
			try
			{
				IFolder folder = getSelectedFolder( window );
				IProject project = folder.getProject();
				if( isProjectUDK(project) )
					return project;
			}
			catch( Exception e )
			{
			}
			
			try
			{
				IProject project = getActiveProject( );
				if( isProjectUDK(project) )
					return project;
			}
			catch( Exception e )
			{
			}
			
			throw new Exception( "You need to select a Project or a File from a Project (in the Package Explorer), or you need to have a File from a Project currently open" );
		}
		
		public static boolean isProjectUDK( IProject project )
		{
			if( project == null )
				return false;
			try
			{
				String udkImport = project.getPersistentProperty( UnrealScriptID.PROPERTY_IS_UDK_IMPORT );
				if( (udkImport == null) || !udkImport.equalsIgnoreCase("true") )
					return false;
				return true;
			}
			catch( Exception e )
			{
				return false;
			}
		}
		
		
		/** 
		 * Returns the exit value:<br>
		 *  0 = ok<br>
		 * -1 = failed (inside java)<br>
		 *  1+ = process failed, number represents an error code<br>
		 */
		public static int runUDK( final IProject project, PrintStream output, PrintStream error, final String... params )
		{
			ArrayList<String> collection = new ArrayList<String>();
			for( String param : params )
				collection.add( param );
			return runUDK( project, output, error, collection );
		}
		/** 
		 * Returns the exit value:<br>
		 *  0 = ok<br>
		 * -1 = failed (inside java)<br>
		 *  1+ = process failed, number represents an error code<br>
		 */
		public static int runUDK( final IProject project, PrintStream output, PrintStream error, final Collection<String> params )
		{
			ArrayList<String> collection = new ArrayList<String>();
			for( String param : params )
				collection.add( param );
			return runUDK( project, output, error, collection );
		}
		/** 
		 * Returns the exit value:<br>
		 *  0 = ok<br>
		 * -1 = failed (inside java)<br>
		 *  1+ = process failed, number represents an error code<br>
		 */
		public static int runUDK( final IProject project, PrintStream output, PrintStream error, final ArrayList<String> params )
		{
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
				bit64 = Boolean.parseBoolean( project.getPersistentProperty(UnrealScriptID.PROPERTY_64BIT) );
				root = getProjectFile(project).getAbsolutePath() + "/";
			}
			catch( Exception e )
			{
				bit64 = false;
				root = "C:/UDK/";
				e.printStackTrace( error );
			}
			String binFolder = root+"Binaries/"+(bit64?"Win64":"Win32")+"/";
			String executablePath = binFolder+"UDK.com";
			
			File bin = new File( binFolder );
			File executable = new File( executablePath );
			if( !executable.exists() )
			{
				error.println( "\""+executable.getAbsolutePath()+"\" doesn't exist" );
				return -1;
			}
			params.add( 0, executable.getAbsolutePath() );
			
			try
			{
				output.println( "Running: "+params.toString() );
				Process process = Runtime.getRuntime().exec( params.toArray(new String[0]), null, bin );
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
		
		
		public static String[] getMapNames( IProject project )
		{
			String[] maps = null;
			
			try
			{
				ArrayList<String> names = new ArrayList<String>();
				getMapNamesRecursive( names, new File(getProjectFile(project), ProjectConstant.subfolders.get("Maps")) );
				maps = names.toArray( new String[0] );
			}
			catch( Exception e )
			{
				maps = null;
			}
			
			if( (maps == null) || (maps.length == 0) )
				maps = new String[]{ "ExampleMap", "EpicCitadel", "DM-Deck" };
			return maps;
		}
		private static void getMapNamesRecursive( ArrayList<String> names, File file ) throws Exception
		{
			if( file.exists() )
			{
				if( file.isDirectory() )
				{
					File[] subfiles = file.listFiles();
					if( subfiles != null )
					{
						for( File subfile : subfiles )
						{
							getMapNamesRecursive( names, subfile );
						}
					}
				}
				else
				{
					if( file.getAbsolutePath().endsWith(".udk") )
					{
						names.add( file.getName() );
					}
				}
			}
		}
		
		public static String getClassName( String classContent )
		{
			return UnrealScriptClassHierarchyParser.getClassName( classContent );
		}
		
		public static String getFileContent( IFile file )
		{
			InputStream stream = null;
			Scanner scanner = null;
			try
			{
				stream = file.getContents();
				scanner = new Scanner( stream, "UTF-8" ).useDelimiter( "\\A" );
				if( scanner.hasNext() )
					return scanner.next();
				return "";
			}
			catch( Exception e )
			{
				return "";
			}
			finally
			{
				try
				{
					if( stream != null )
					{
						stream.close();
					}
				}
				catch( Exception e )
				{
				}
				
				try
				{
					if( scanner != null )
					{
						scanner.close();
					}
				}
				catch( Exception e )
				{
				}
			}
		}
	// static methods <<
	
	
	@Override
	public void dispose()
	{
		updateMarkersThreadRunning = false;
		super.dispose();
	}
}
