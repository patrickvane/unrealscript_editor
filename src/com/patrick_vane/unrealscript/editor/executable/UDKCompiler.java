package com.patrick_vane.unrealscript.editor.executable;

import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.console.UnrealScriptCompilerConsole;
import com.patrick_vane.unrealscript.editor.constants.ColorConstant;


public class UDKCompiler
{
	private static final ArrayList<String> params = new ArrayList<String>();
	static
	{
		params.add( 0, "make" );
		params.add( "-unattended" );
		params.add( "-debug" );
	}
	
	public static final HashMap<IProject,Long>					compilingProjects		= new HashMap<IProject,Long>();
	public static final HashMap<IProject,ArrayList<String>>		waitForCompileProjects	= new HashMap<IProject,ArrayList<String>>();
	
	
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
	
	
	public static void waitForCompiles( final IProject project )
	{
		if( project == null )
			return;
		while( true )
		{
			synchronized( compilingProjects )
			{
				Long time = compilingProjects.get( project );
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
			Thread.sleep( 1000 );
		}
		catch( Exception e )
		{
		}
		UDKCompiler.waitForCompiles( project );
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
								waitForCompileProjects.put( project, params );
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
				
				UnrealScriptCompilerConsole.clear();
				UnrealScriptEditor.runUDK( project, UnrealScriptCompilerConsole.getPrintStream(ColorConstant.INFO_COLOR), UnrealScriptCompilerConsole.getPrintStream(ColorConstant.ERROR_COLOR), params );
				
				ArrayList<String> newParams;
				synchronized( compilingProjects )
				{
					compilingProjects.remove( project );
					newParams = waitForCompileProjects.get( project );
					if( newParams == null )
					{
						return;
					}
				}
				compile( project, false, newParams );
			}
		}.start();
	}
}
