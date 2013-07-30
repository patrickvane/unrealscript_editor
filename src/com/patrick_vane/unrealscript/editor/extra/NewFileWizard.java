package com.patrick_vane.unrealscript.editor.extra;


import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;


public class NewFileWizard extends Wizard implements IWorkbenchWizard, INewWizard
{
	protected IWorkbench			workbench;
	protected IStructuredSelection	selection;
	
	protected NewFileWizardPage		one;
	
	
	@Override
	public void init( IWorkbench workbench, IStructuredSelection selection )
	{
		this.workbench = workbench;
		this.selection = selection;
	}
	
	
	public NewFileWizard()
	{
		super();
		setNeedsProgressMonitor( false );
	}
	
	@Override
	public void addPages()
	{
		one = new NewFileWizardPage( selection );
		addPage( one );
	}
	
	@Override
	public boolean performFinish()
	{
		if( one.createNewFile() != null )
    		return true;
    	else
    		return false;
	}
}
