package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public interface CodeAttribute
{
	/** Is function or variable? */
	public boolean isFunction();
	
	public ArrayList<String> getModifiers();
	public String getType();
	public String getName();
	public ArrayList<CodeAttributeVariable> getParameters();
}
