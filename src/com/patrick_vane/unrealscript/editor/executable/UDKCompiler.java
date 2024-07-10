package com.patrick_vane.unrealscript.editor.executable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor.StartAndEnd;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.console.UnrealScriptCompilerConsole;
import com.patrick_vane.unrealscript.editor.constants.ColorConstant;
import com.patrick_vane.unrealscript.editor.constants.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.default_classes.MySynchronizer;


public class UDKCompiler
{
	private static final ArrayList<String> params = new ArrayList<String>();
	static
	{
		params.add( 0, "make" );
		params.add( "-unattended" );
	}
	
	protected static final HashMap<Object,Long>					compilingProjects		= new HashMap<Object,Long>();
	protected static final HashMap<Object,ArrayList<String>>	waitForCompileProjects	= new HashMap<Object,ArrayList<String>>();
	
	protected final static MySynchronizer<String>				projectsToSync			= new MySynchronizer<String>();
	
	public static void compile( final IProject project )
	{
		compile( project, false, false, new ArrayList<String>(params) );
	}

	public static void compileForced( final IProject project )
	{
		compile( project, false, true, new ArrayList<String>(params) );
	}

	public static void compile( final IProject project, final String... extraParams )
	{
		ArrayList<String> newParams = new ArrayList<String>(params);
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		compile( project, false, false, newParams );
	}

	public static void compileForced( final IProject project, final String... extraParams )
	{
		ArrayList<String> newParams = new ArrayList<String>(params);
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		compile( project, false, true, newParams );
	}
	
	
	public static void waitForCompiles( final IProject project )
	{
		if( project == null )
			return;
		final Object sync = projectsToSync.get( project.getName() );
		while( true )
		{
			synchronized( sync )
			{
				Long time = compilingProjects.get( sync );
				if( time == null )
				{
					return;
				}
			}
			
			try
			{
				Thread.sleep( 100 );
			}
			catch( Exception e )
			{
			}
		}
	}
	
	public static void saveAndWaitForCompiles( final IProject project )
	{
		if( project == null )
			return;
		if( !UnrealScriptEditor.isProjectUDK(project) )
			return;
		try
		{
			Display.getDefault().syncExec
			(
				new Runnable()
				{
					@Override
					public void run()
					{
						PlatformUI.getWorkbench().saveAllEditors( false );
					}
				}
			);
			
			try
			{
				Thread.sleep( 100 );
			}
			catch( Exception e )
			{
			}
		}
		catch( Exception e )
		{
		}
		UDKCompiler.waitForCompiles( project );
	}
	
	
	private static void compile( final IProject project, final boolean ignoreCompilingProjects, final boolean forced, ArrayList<String> parameters )
	{
		if( project == null )
			return;

		final ArrayList<String> params = new ArrayList<String>(parameters);

		if( !UnrealScriptEditor.isProjectUDK(project) )
			return;
		
		new Thread()
		{
			@Override
			public void run()
			{
				final Object sync = projectsToSync.get( project.getName() );
				
				if( ignoreCompilingProjects )
				{
					synchronized( sync )
					{
						compilingProjects.put( sync, System.currentTimeMillis() );
					}
				}
				else
				{
					while( true )
					{
						synchronized( sync )
						{
							Long time = compilingProjects.get( sync );
							if( time == null )
							{
								compilingProjects.put( sync, System.currentTimeMillis() );
								waitForCompileProjects.remove( sync );
								break;
							}
							else if( !forced )
							{
								if( System.currentTimeMillis()-time >= 2000 )
								{
									waitForCompileProjects.put( sync, params );
									return;
								}
								else
								{
									return;
								}
							}
						}
						
						try
						{
							Thread.sleep( 100 );
						}
						catch( Exception e )
						{
						}
					}
				}
				
				boolean stripSources;
				boolean debug;
				try
				{
					stripSources = UnrealScriptEditor.parseBoolean( UnrealScriptEditor.getActiveProject(), UnrealScriptID.PROPERTY_STRIP_SOUCE, false );
					debug = UnrealScriptEditor.parseBoolean( UnrealScriptEditor.getActiveProject(), UnrealScriptID.PROPERTY_DEBUG, true );
				}
				catch( Exception e )
				{
					stripSources = false;
					debug = true;
					e.printStackTrace();
				}
				
				if( stripSources )
					params.add( "-stripsource" );
				if( debug )
					params.add( "-debug" );
				
				UnrealScriptCompilerConsole.clear();
				UnrealScriptEditor.runUDK( project, false, UnrealScriptCompilerConsole.getPrintStream(ColorConstant.INFO_COLOR), UnrealScriptCompilerConsole.getPrintStream(ColorConstant.ERROR_COLOR), params );
				
				IWorkspaceRunnable runnable = new IWorkspaceRunnable()
				{
					@Override
					public void run( IProgressMonitor monitor ) throws CoreException
					{
						ArrayList<CompilerError> errors = parseCompilerErrors( UnrealScriptCompilerConsole.getContent() );
						UnrealScriptEditor.clearAllMarkers();
						for( CompilerError error : errors )
						{
							try
							{
								IDocument doc = UnrealScriptEditor.getOpenedFileDocument( error.className );
								if( doc != null )
								{
									String content = doc.get();
									
									int start = doc.getLineOffset( error.lineNumber-1 );
									int end = doc.getLineLength( error.lineNumber-1 ) + start;
									
									start = UnrealScriptEditor.trimStartPosition( content, start );
									end = UnrealScriptEditor.trimEndPosition( content, end );
									
									if( error.isWarning )
										UnrealScriptEditor.addWarningMarker( error.className, start, end, error.message );
									else
										UnrealScriptEditor.addErrorMarker( error.className, start, end, error.message );
								}
							}
							catch( Exception e )
							{
								e.printStackTrace();
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
				
				ArrayList<String> newParams;
				synchronized( sync )
				{
					newParams = waitForCompileProjects.get( sync );
					waitForCompileProjects.remove( sync );
					if( newParams == null )
					{
						compilingProjects.remove( sync );
						return;
					}
				}
				compile( project, true, false, newParams );
			}
		}.start();
	}
	
	
	public static class CompilerError
	{
		public final boolean isWarning;
		
		public final String className;
		public final int lineNumber;
		public final String message;
		
		public CompilerError( boolean isWarning, String className, int lineNumber, String message )
		{
			this.isWarning = isWarning;
			this.className = className;
			this.lineNumber = lineNumber;
			this.message = message;
		}
	}
	
	public static ArrayList<CompilerError> parseCompilerErrors( String compilerOutput )
	{
		ArrayList<CompilerError> errors = new ArrayList<CompilerError>();
		
		if( compilerOutput == null )
			return errors;
		compilerOutput = compilerOutput.replaceAll( "\r", "" );
		
		// get begin and end of compiler errors >>
			int begin = compilerOutput.indexOf( "Warning/Error Summary" );
			if( begin < 0 )
				return errors;
			begin += "Warning/Error Summary".length();
			
			for( int i=begin; i<compilerOutput.length(); i++ )
			{
				char now = compilerOutput.charAt( i );
				
				if( (now == '\n') || (now == '-') )
					continue;
				
				begin = i;
				break;
			}
			
			int end = compilerOutput.indexOf( "\n\n", begin );
			if( end < 0 )
				end = compilerOutput.length() - 1;
		// get begin and end of compiler errors <<
		
		try
		{
			String errorsString = compilerOutput.substring( begin, end );
			for( String errorString : errorsString.split("\n") )
			{
				Pattern pattern = Pattern.compile( "\\.uc\\(+[0-9]+\\) : " );
				Matcher matcher = pattern.matcher( errorString );
				if( matcher.find() )
				{
					try
					{
						String classPath = errorString.substring( 0, matcher.start() );
						String[] classPathParts = classPath.split( "\\\\" );
						String className = classPathParts[classPathParts.length-1];
						
						String message = errorString.substring( matcher.end() );
						
						String match = matcher.group();
						match = match.replace( ".uc(", "" );
						match = match.replace( ") : ", "" );
						
						int lineNumber = Integer.parseInt( match );
						
						boolean isWarning = message.toLowerCase().startsWith( "warning" );
						
						if( !message.contains("in defaults") )
						{
							UnrealScriptClass unrealscriptClass = UnrealScriptEditor.getUnrealScriptClass( className );
							if( unrealscriptClass != null )
							{
								StartAndEnd defaultPropertiesLines = UnrealScriptEditor.getDefaultPropertiesStartAndEndLineNumber( UnrealScriptEditor.getFileContent(unrealscriptClass.getFile()) );
								if( defaultPropertiesLines != null )
								{
									if( lineNumber >= defaultPropertiesLines.start )
									{
										lineNumber += defaultPropertiesLines.end - defaultPropertiesLines.start + 1;
									}
								}
							}
						}
						
						errors.add( new CompilerError(isWarning, className, lineNumber, message) );
					}
					catch( Exception e )
					{
					}
				}
			}
		}
		catch( Exception e )
		{
		}
		return errors;
	}
}
