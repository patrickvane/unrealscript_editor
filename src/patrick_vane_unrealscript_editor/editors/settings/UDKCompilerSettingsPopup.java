package patrick_vane_unrealscript_editor.editors.settings;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.Dimension;


public class UDKCompilerSettingsPopup extends JDialog
{
	private static final long	serialVersionUID	= 6238284241701313436L;
	
	private JTextField			inputUdkPath;
	private JButton				buttonUdkPath;
	private JCheckBox 			checkbox64Bit;
	private JCheckBox 			checkboxStripSource;
	private JButton 			buttonFullRebuild;
	private JButton 			buttonSave;
	private JButton 			buttonCancel;
	
	
	public UDKCompilerSettingsPopup()
	{
		setTitle( "UDK Settings" );
		setType( Type.NORMAL );
		setAlwaysOnTop( true );
		getContentPane().setLayout( null );
		getContentPane().setPreferredSize( new Dimension(340, 220) );
		pack();
		
		
		inputUdkPath = new JTextField();
		inputUdkPath.setBounds( 21, 20, 221, 23 );
		inputUdkPath.setToolTipText( "Path of UDK Installation" );
		inputUdkPath.setText( "C:/UDK/" );
		getContentPane().add( inputUdkPath );
		inputUdkPath.setColumns( 10 );
		
		buttonUdkPath = new JButton( "Browse" );
		buttonUdkPath.setBounds( 243, 20, 78, 22 );
		buttonUdkPath.setToolTipText( "Browse for the UDK Installation Path" );
		getContentPane().add( buttonUdkPath );
		
		
		checkbox64Bit = new JCheckBox( "64 bit" );
		checkbox64Bit.setToolTipText( "Uses the 64 bit UDK.exe" );
		checkbox64Bit.setBounds( 63, 63, 62, 21 );
		getContentPane().add( checkbox64Bit );
		
		checkboxStripSource = new JCheckBox( "strip source" );
		checkboxStripSource.setToolTipText( "Removes the source from the compiled .u files (it won't remove the comments!)" );
		checkboxStripSource.setBounds( 189, 63, 102, 21 );
		getContentPane().add( checkboxStripSource );
		
		buttonFullRebuild = new JButton( "Full Rebuild" );
		buttonFullRebuild.setToolTipText( "Save and Full Rebuild" );
		buttonFullRebuild.setBounds( 121, 111, 99, 23 );
		getContentPane().add( buttonFullRebuild );
		
		buttonSave = new JButton( "Save" );
		buttonSave.setToolTipText( "Save and Close" );
		buttonSave.setBounds( 121, 150, 99, 23 );
		getContentPane().add( buttonSave );
		
		buttonCancel = new JButton( "Cancel" );
		buttonCancel.setToolTipText( "Close without Saving" );
		buttonCancel.setBounds( 121, 180, 99, 23 );
		getContentPane().add( buttonCancel );
	}
}
