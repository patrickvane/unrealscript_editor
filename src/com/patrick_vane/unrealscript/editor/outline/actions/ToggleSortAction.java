package com.patrick_vane.unrealscript.editor.outline.actions;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.outline.OutlineContentPage;


public class ToggleSortAction extends Action
{
	private final OutlineContentPage page;
	
	
	public ToggleSortAction( OutlineContentPage page )
	{
		this.page = page;
		
		setDescription( "Toggle Alphabetic Sorting" );
		setImageDescriptor( UnrealScriptEditor.getImageDescriptor("outline/button_sort.gif") );
	}
	
	
	@Override
	public void run()
	{
		try
		{
			UnrealScriptEditor.getRoot().setPersistentProperty( UnrealScriptID.PROPERTY_SORT_ALPHABETIC, Boolean.toString(!isChecked()) );
			page.update();
		}
		catch( CoreException e )
		{
		}
	}
	
	
	@Override
	public boolean isChecked()
	{
		try
		{
			return Boolean.valueOf( UnrealScriptEditor.getRoot().getPersistentProperty(UnrealScriptID.PROPERTY_SORT_ALPHABETIC) );
		}
		catch( CoreException e )
		{
		}
		return false;
	}
}
