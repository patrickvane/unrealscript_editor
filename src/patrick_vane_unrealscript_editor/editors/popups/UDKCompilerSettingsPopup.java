package patrick_vane_unrealscript_editor.editors.popups;

import javax.swing.JButton;
import javax.swing.JCheckBox;


public class UDKCompilerSettingsPopup extends ExtendablePopup
{
	private static final long	serialVersionUID	= 6238284241701313436L;
	private JCheckBox 			checkbox64Bit;
	private JCheckBox 			checkboxStripSource;
	private JButton 			buttonFullRebuild;
	private JButton 			buttonSave;
	private JButton 			buttonCancel;
	
	
	public UDKCompilerSettingsPopup()
	{
		super( "UDK Compiler Settings", 135, 200 );
		
		
		checkbox64Bit = new JCheckBox( "64 bit" );
		checkbox64Bit.setToolTipText( "Uses the 64 bit UDK.exe" );
		checkbox64Bit.setBounds( 21, 23, 62, 21 );
		getContentPane().add( checkbox64Bit );
		
		checkboxStripSource = new JCheckBox( "strip source" );
		checkboxStripSource.setToolTipText( "Removes the source from the compiled .u files (it won't remove the comments!)" );
		checkboxStripSource.setBounds( 21, 50, 102, 21 );
		getContentPane().add( checkboxStripSource );
		
		buttonFullRebuild = new JButton( "Full Rebuild" );
		buttonFullRebuild.setToolTipText( "Save and Full Rebuild" );
		buttonFullRebuild.setBounds( 18, 92, 99, 23 );
		getContentPane().add( buttonFullRebuild );
		
		buttonSave = new JButton( "Save" );
		buttonSave.setToolTipText( "Save and Close" );
		buttonSave.setBounds( 18, 131, 99, 23 );
		getContentPane().add( buttonSave );
		
		buttonCancel = new JButton( "Cancel" );
		buttonCancel.setToolTipText( "Close without Saving" );
		buttonCancel.setBounds( 18, 161, 99, 23 );
		getContentPane().add( buttonCancel );
	}
}
