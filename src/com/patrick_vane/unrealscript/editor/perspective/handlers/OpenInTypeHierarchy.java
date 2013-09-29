package com.patrick_vane.unrealscript.editor.perspective.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.TypeHierarchyView;


public class OpenInTypeHierarchy extends AbstractHandler
{
	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException
	{
		TypeHierarchyView.expandToClass( UnrealScriptEditor.getActiveUnrealScriptClass() );
		return null;
	}
}
