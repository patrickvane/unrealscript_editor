package com.patrick_vane.unrealscript.editor.executable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.eclipse.core.resources.IProject;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.console.UnrealScriptCompilerConsole;


public class UDKCompiler
{
	private static final ArrayList<String> params = new ArrayList<String>();
	static
	{
		params.add( 0, "make" );
		params.add( "-unattended" );
		params.add( "-debug" );
	}
	
	public static final HashMap<IProject,Long>	compilingProjects		= new HashMap<IProject,Long>();
	public static final HashSet<IProject>		waitForCompileProjects	= new HashSet<IProject>();
	
	
	public static void compile( final IProject project )
	{
		compile( project, false, (ArrayList<String>) params.clone() );
	}
	public static void compileForced( final IProject project )
	{
		compile( project, true, (ArrayList<String>) params.clone() );
	}
	public static void compile( final IProject project, final String... extraParams )
	{
		ArrayList<String> newParams = (ArrayList<String>) params.clone();
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		compile( project, false, newParams );
	}
	public static void compileForced( final IProject project, final String... extraParams )
	{
		ArrayList<String> newParams = (ArrayList<String>) params.clone();
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		compile( project, true, newParams );
	}
	
	
	public static void waitForCompiles()
	{
		IProject activeProject = UnrealScriptEditor.getActiveProject();
		if( activeProject == null )
			return;
		while( true )
		{
			synchronized( compilingProjects )
			{
				Long time = compilingProjects.get( activeProject );
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
		
		try
		{
			//FIX ERROW! org.eclipse.swt.SWTException: Invalid thread access
			/*Display.getDefault().syncExec
			(
				new Runnable()
				{
					@Override
					public void run()
					{
						try
						{
							project.getWorkspace().save( true, new NullProgressMonitor() );
						}
						catch( Exception e )
						{
						}
					}
				}
			);*/
			Thread.sleep( 1000 );
		}
		catch( Exception e )
		{
		}
		UDKCompiler.waitForCompiles();
	}
	
	
	private static void compile( final IProject project, final boolean forced, final ArrayList<String> params )
	{
		if( project == null )
			return;
		new Thread()
		{
			@Override
			public void run()
			{
				while( true )
				{
					synchronized( compilingProjects )
					{
						Long time = compilingProjects.get( project );
						if( time == null )
						{
							compilingProjects.put( project, System.currentTimeMillis() );
							waitForCompileProjects.remove( project );
							break;
						}
						else if( !forced )
						{
							if( System.currentTimeMillis()-time >= 200 )
							{
								waitForCompileProjects.add( project );
								return;
							}
							else
							{
								return;
							}
						}
						else
						{
							try
							{
								Thread.sleep( 100 );
							}
							catch( Exception e )
							{
							}
						}
					}
				}
				
				boolean stripSources;
				try
				{
					stripSources = Boolean.parseBoolean( UnrealScriptEditor.getActiveProject().getPersistentProperty(UnrealScriptID.PROPERTY_STRIP_SOUCE) );
				}
				catch( Exception e )
				{
					stripSources = false;
					e.printStackTrace();
				}
				if( stripSources )
					params.add( "-stripsource" );
				
				synchronized( UnrealScriptCompilerConsole.getSynchronizer() )
				{	
					UnrealScriptCompilerConsole.clear();
					UnrealScriptEditor.runUDK( false, UnrealScriptCompilerConsole.getPrintStream(), UnrealScriptCompilerConsole.getPrintStream(), params );
				}
				
				synchronized( compilingProjects )
				{
					compilingProjects.remove( project );
					if( waitForCompileProjects.contains(project) )
					{
						compile( project, false, params );
					}
				}
			}
		}.start();
	}
}
