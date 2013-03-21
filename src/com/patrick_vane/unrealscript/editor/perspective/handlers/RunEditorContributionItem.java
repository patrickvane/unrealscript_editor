package com.patrick_vane.unrealscript.editor.perspective.handlers;

import java.util.HashMap;
import java.util.Map.Entry;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.Menu;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.default_classes.HashMapOrderer;
import com.patrick_vane.unrealscript.editor.default_classes.MySerializer;
import com.patrick_vane.unrealscript.editor.executable.Profile;
import com.patrick_vane.unrealscript.editor.executable.UDKEditor;


public class RunEditorContributionItem extends ContributionItem
{
	public void fill( Menu menu )
	{
		IProject projectTmp = null;
		HashMap<String,Profile> profilesTmp = null;
		try
		{
			projectTmp = UnrealScriptEditor.getSelectedOrActiveProject();
			profilesTmp = getProfiles( projectTmp );
		}
		catch( Exception e )
		{
		}
		if( profilesTmp == null )
			return;
		final IProject project = projectTmp;
		final HashMap<String,Profile> profiles = profilesTmp;
		
		for( final Entry<String,Profile> entry : profiles.entrySet() )
		{
			addActionToMenu
			(
				menu, 
				new Action( entry.getKey(), IAction.AS_PUSH_BUTTON )
				{
					@Override
					public void run()
					{
						UDKEditor.run( project, entry.getValue() );
					}
				}
			);
		}
	}
	
	
	@Override
	public void fill( Menu menu, int index )
	{
		super.fill( menu, index );
		fill( menu );
	}
	
	public void addActionToMenu( Menu menu, Action action )
	{
		ActionContributionItem item = new ActionContributionItem( action );
		item.fill( menu, -1 );
	}
	
	
	@Override
	public boolean isDynamic()
	{
		return true;
	}
	
	
	private static HashMap<String,Profile> getProfiles( IProject project )
	{
		String profilesString;
		try
		{
			profilesString = project.getPersistentProperty( UnrealScriptID.PROPERTY_EXECUTE_SETTINGS_PROFILES );
		}
		catch( CoreException e )
		{
			profilesString = null;
		}
		
		HashMap<String,Profile> profiles;
		try
		{
			profiles = (HashMap<String,Profile>) MySerializer.fromString( profilesString );
		}
		catch( Exception e )
		{
			profiles = null;
		}
		if( (profiles == null) || profiles.isEmpty() )
		{
			profiles = new HashMap<String,Profile>();
			profiles.put( "Default", new Profile() );
		}
		profiles = HashMapOrderer.orderHashMap( profiles );
		
		return profiles;
	}
}
