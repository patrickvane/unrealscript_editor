package com.patrick_vane.unrealscript.editor.perspective;

import org.eclipse.core.expressions.PropertyTester;


public class UDKPerspectiveTester extends PropertyTester 
{
	@Override
	public boolean test( Object receiver, String property, Object[] args, Object expectedValue )
	{
		return UDKPerspective.isActive();
	}
}
