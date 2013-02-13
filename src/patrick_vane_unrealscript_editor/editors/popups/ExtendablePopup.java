package patrick_vane_unrealscript_editor.editors.popups;

import javax.swing.JDialog;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ExtendablePopup extends JDialog
{
	private static final long	serialVersionUID	= 4665137732519823141L;
	
	private boolean 			done;
	private boolean 			canceled;
	
	
	public ExtendablePopup( String title, int width, int height )
	{
		setTitle( title );
		setType( Type.NORMAL );
		setAlwaysOnTop( true );
		getContentPane().setLayout( null );
		getContentPane().setPreferredSize( new Dimension(width, height) );
		pack();
		setLocationRelativeTo( null );
		setAutoRequestFocus( true );
		
		addWindowListener
		(
			new WindowAdapter()
			{
				@Override
				public void windowClosing( WindowEvent e )
				{
					done = true;
					canceled = true;
				}
			}
		);
	}
	
	
	@Override
	public void setVisible( boolean visible )
	{
		if( visible == false )
		{
			super.setVisible( false );
			return;
		}
		
		done = false;
		canceled = false;
		
		new Thread()
		{
			@Override
			public void run()
			{
				ExtendablePopup.super.setVisible( true );
			}
		}.start();
		
		while( !isDone() )
		{
			try
			{
				Thread.sleep( 200 );
			}
			catch( Exception e )
			{
			}
		}
		super.setVisible( false );
	}
	
	
	public boolean isDone()
	{
		return done;
	}
	public boolean isCanceled()
	{
		return canceled;
	}
	
	
	protected void success()
	{
		done = true;
		canceled = false;
	}
	protected void canceled()
	{
		done = true;
		canceled = true;
	}
}
