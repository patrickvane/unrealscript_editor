package com.patrick_vane.unrealscript.editor.extra;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.patrick_vane.unrealscript.editor.UnrealScriptActivator;

public class NewFileWizardPage extends WizardNewFileCreationPage
{
	private Text inputSuperclass;
	
	
	public NewFileWizardPage( IStructuredSelection selection )
	{
		super( "UnrealScript Class", selection );
		setTitle( "UnrealScript Class" );
		setDescription( "Creates a new UnrealScript class." );
		setFileExtension( "uc" );
	}
	
	
	@Override
	protected void createAdvancedControls( Composite parent )
	{
		IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(UnrealScriptActivator.getSymbolicName());
		prefs.putBoolean(ResourcesPlugin.PREF_DISABLE_LINKING, true);

		super.createAdvancedControls(  parent  );
		
		Font font = parent.getFont();
		
		Composite composite = new Composite( parent, SWT.NONE );
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		composite.setLayout( layout );
		composite.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
		composite.setFont( font );
		
		Composite nameGroup = new Composite( composite, SWT.NONE );
		layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = 0;
		nameGroup.setLayout( layout );
		nameGroup.setLayoutData( new GridData( GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL ) );
		nameGroup.setFont( font );
		
		
		Label labelSuperclass = new Label( nameGroup, SWT.NONE );
		labelSuperclass.setText( "Superclass:" );
		labelSuperclass.setFont( font );
		
		inputSuperclass = new Text( nameGroup, SWT.BORDER );
		GridData data = new GridData( GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL );
		data.widthHint = 250;
		inputSuperclass.setLayoutData( data );
		inputSuperclass.setFont( font );
	}
	
	@Override
	protected String getNewFileLabel()
	{
		return "Name:";
	}
	
	
	@Override
	protected InputStream getInitialContents()
	{
		try
		{
			String content = 	"class "+getNameInput()+" extends "+getSuperclassInput()+";" + "\n" +
								"\n" +
								"\n" +
								"defaultproperties" + "\n" +
								"{" + "\n" +
								"}" + "\n";
			return new ByteArrayInputStream( content.getBytes("UTF-8") );
		}
		catch( Exception e )
		{
			return null;
		}
	}
	
	
	public String getNameInput()
	{
		String name = getFileName();
		if( name == null )
			return "NewClass";
		
		int extensionLength = 0;
		String extension = getFileExtension();
		if( extension != null )
			extensionLength = extension.length()+1;
		
		return name.substring( 0, name.length()-extensionLength );
	}
	public String getSuperclassInput()
	{
		if( (inputSuperclass == null) || (inputSuperclass.getText() == null) || inputSuperclass.getText().isEmpty() )
			return "Object";
		return inputSuperclass.getText();
	}
}
