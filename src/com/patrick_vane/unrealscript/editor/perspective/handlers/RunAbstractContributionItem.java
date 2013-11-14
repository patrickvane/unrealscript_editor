package com.patrick_vane.unrealscript.editor.perspective.handlers;

import java.util.HashMap;
import java.util.Map.Entry;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.Menu;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.default_classes.MyArraySorter;
import com.patrick_vane.unrealscript.editor.executable.Profile;

public abstract class RunAbstractContributionItem extends ContributionItem
{
	public abstract QualifiedName getLastUsedProfileKey();
	public abstract void run( IProject project );
	public abstract void run( IProject project, Profile profile );
	
	
	public void fill( Menu menu )
	{
		IProject projectTmp = null;
		HashMap<String,Profile> profilesTmp = null;
		try
		{
			projectTmp = UnrealScriptEditor.getSelectedOrActiveProject();
			profilesTmp = UnrealScriptEditor.getProfiles( projectTmp );
		}
		catch( Exception e )
		{
		}
		if( profilesTmp == null )
			return;
		final IProject project = projectTmp;
		final HashMap<String,Profile> profiles = profilesTmp;
		
		for( final Entry<String,Profile> entry : MyArraySorter.sort(profiles).entrySet() )
		{
			addActionToMenu
			(
				menu, 
				new Action( entry.getKey(), IAction.AS_PUSH_BUTTON )
				{
					@Override
					public void run()
					{
						RunAbstractContributionItem.this.run( project, entry.getValue() );
						UnrealScriptEditor.saveProfileName( getLastUsedProfileKey(), project, entry.getKey() );
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
}
