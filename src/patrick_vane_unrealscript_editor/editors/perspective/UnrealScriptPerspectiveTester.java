package patrick_vane_unrealscript_editor.editors.perspective;

import org.eclipse.core.expressions.PropertyTester;


public class UnrealScriptPerspectiveTester extends PropertyTester 
{
	@Override
	public boolean test( Object receiver, String property, Object[] args, Object expectedValue )
	{
		return UDKPerspective.isActive();
	}
}
