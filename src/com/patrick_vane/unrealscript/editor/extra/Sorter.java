package com.patrick_vane.unrealscript.editor.extra;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.parser.CodeAttribute;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeFunction;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeLocalVariable;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeParameterLocalVariable;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeVariable;


public class Sorter
{
	public static UnrealScriptClass[] sortClasses( Collection<UnrealScriptClass> values )
	{
		return sortClasses( values.toArray(new UnrealScriptClass[0]) );
	}
	public static UnrealScriptClass[] sortClasses( UnrealScriptClass[] values )
	{
		Arrays.sort( values, classComparator );
		return values;
	}
	
	public static CodeAttribute[] sortAttributes( Collection<CodeAttribute> values )
	{
		return sortAttributes( values.toArray(new CodeAttribute[0]) );
	}
	public static CodeAttribute[] sortAttributes( CodeAttribute[] values )
	{
		Arrays.sort( values, attributeComparator );
		return values;
	}
	
	public static CodeAttributeVariable[] sortAttributeVariables( Collection<CodeAttributeVariable> values )
	{
		return sortAttributeVariables( values.toArray(new CodeAttributeVariable[0]) );
	}
	public static CodeAttributeVariable[] sortAttributeVariables( CodeAttributeVariable[] values )
	{
		Arrays.sort( values, attributeComparator );
		return values;
	}
	
	public static CodeAttributeLocalVariable[] sortAttributeLocalVariables( Collection<CodeAttributeLocalVariable> values )
	{
		return sortAttributeLocalVariables( values.toArray(new CodeAttributeLocalVariable[0]) );
	}
	public static CodeAttributeLocalVariable[] sortAttributeLocalVariables( CodeAttributeLocalVariable[] values )
	{
		Arrays.sort( values, attributeComparator );
		return values;
	}
	
	public static CodeAttributeParameterLocalVariable[] sortAttributeParameterLocalVariables( Collection<CodeAttributeParameterLocalVariable> values )
	{
		return sortAttributeParameterLocalVariables( values.toArray(new CodeAttributeParameterLocalVariable[0]) );
	}
	public static CodeAttributeParameterLocalVariable[] sortAttributeParameterLocalVariables( CodeAttributeParameterLocalVariable[] values )
	{
		Arrays.sort( values, attributeComparator );
		return values;
	}
	
	public static CodeAttributeFunction[] sortAttributeFunctions( Collection<CodeAttributeFunction> values )
	{
		return sortAttributeFunctions( values.toArray(new CodeAttributeFunction[0]) );
	}
	public static CodeAttributeFunction[] sortAttributeFunctions( CodeAttributeFunction[] values )
	{
		Arrays.sort( values, attributeComparator );
		return values;
	}
	
	
	private static Comparator<UnrealScriptClass> classComparator = new Comparator<UnrealScriptClass>()
	{
		@Override
		public int compare( UnrealScriptClass o1, UnrealScriptClass o2 )
		{
			return o1.getName().compareToIgnoreCase( o2.getName() );
		}
	};
	private static Comparator<CodeAttribute> attributeComparator = new Comparator<CodeAttribute>()
	{
		@Override
		public int compare( CodeAttribute o1, CodeAttribute o2 )
		{
			return o1.getName().compareToIgnoreCase( o2.getName() );
		}
	};
}
