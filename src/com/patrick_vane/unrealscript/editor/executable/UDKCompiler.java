package com.patrick_vane.unrealscript.editor.executable;

import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
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
		params.add( "-debug" );
	}
	
	protected static final HashMap<Object,Long>					compilingProjects		= new HashMap<Object,Long>();
	protected static final HashMap<Object,ArrayList<String>>	waitForCompileProjects	= new HashMap<Object,ArrayList<String>>();
	
	protected final static MySynchronizer<String>				projectsToSync			= new MySynchronizer<String>();
	
	
	public static void compile( final IProject project )
	{
		compile( project, false, false, (ArrayList<String>) params.clone() );
	}
	public static void compileForced( final IProject project )
	{
		compile( project, false, true, (ArrayList<String>) params.clone() );
	}
	public static void compile( final IProject project, final String... extraParams )
	{
		ArrayList<String> newParams = (ArrayList<String>) params.clone();
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		compile( project, false, false, newParams );
	}
	public static void compileForced( final IProject project, final String... extraParams )
	{
		ArrayList<String> newParams = (ArrayList<String>) params.clone();
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
		
		final ArrayList<String> params = (ArrayList<String>) parameters.clone();
		
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
				
				UnrealScriptCompilerConsole.clear();
				UnrealScriptEditor.runUDK( project, false, UnrealScriptCompilerConsole.getPrintStream(ColorConstant.INFO_COLOR), UnrealScriptCompilerConsole.getPrintStream(ColorConstant.ERROR_COLOR), params );
				
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
}
