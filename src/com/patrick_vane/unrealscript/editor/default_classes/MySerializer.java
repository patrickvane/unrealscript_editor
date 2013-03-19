package com.patrick_vane.unrealscript.editor.default_classes;

import javax.xml.bind.DatatypeConverter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class MySerializer
{
	public static String toString( Serializable object ) throws IOException
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream( baos );
		oos.writeObject( object );
		try
		{
			oos.close();
		}
		catch( Exception e )
		{
		}
		return DatatypeConverter.printBase64Binary( baos.toByteArray() );
	}
	
	public static Object fromString( String string ) throws ClassNotFoundException
	{
		try
		{
			byte[] data = DatatypeConverter.parseBase64Binary( string );
			ObjectInputStream ois = new ObjectInputStream( new ByteArrayInputStream(data) );
			Object o = ois.readObject();
			try
			{
				ois.close();
			}
			catch( Exception e )
			{
			}
			return o;
		}
		catch( IOException e )
		{
			return null;
		}
	}
}
