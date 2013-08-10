package com.patrick_vane.unrealscript.editor.constants;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class KeywordInfoConstants
{
	private static HashMap<String,String> keywordInfo = new HashMap<String,String>();
	
	
	static
	{
		addKeyword( "Abstract", "No instances can be created of this class." );
		addKeyword( "ArrayCount", "The ArrayCount pseudo-function can be used to get the length of a static array. Note that it is actually evaluated at compile time and replaced by an integer value in the UnrealScript bytecode. As such it can be used even with a complex argument and is guaranteed to never throw any runtime warnings. Also, because it's not really a function call, ArrayCount can be used as the value of constants and as the length value of other static array declarations." );
		addKeyword( "Assert", "The assert statement can be used to add a check for critical prerequisites. It should probably not be used in production code, as a failed assertion will intentionally make the engine crash with a message stating the source file and line number of the failed assertion." );
		addKeyword( "Atomic/AtomicWhenCooked", "Indicates that this struct should always be serialized as a single unit, meaning that if any element of an instance of this struct differs from its default values, then all elements of the instance of the struct will be serialized." );
		addKeyword( "Auto", "Specifies that this state is the initial state of an Actor. This causes all new actors to be placed in that state on the SetInitialState() event." );
		addKeyword( "AutoCollapseCategories/DontAutoCollapseCategories", "Automatic collapses the specified variable category, categories with no name can be specified by inputting the class's name where the variable is declared in. This is just like CollapseCategories but can specify which category." );
		addKeyword( "AutoExpandCategories", "Automatic expands the specified variable category, categories with no name can be specified by inputting the class's name where the variable is declared in." );
		
		addKeyword( "ClassGroup", "Indicates that this class and its subclasses should be shown in the specified groups in the editor's Actor Classes browser when Group View is enabled." );
		addKeyword( "Client", "Specifies that this function should be replicated to the client owning the actor if it is called on the server. This modifier automatically makes the function simulated as well." );
		addKeyword( "Coerce", "Automatically performs typecasting of values passed to this parameter, if the parameter is of a primitive type other than enum. Note that the built-in numeric types int, float and byte are automatically typecasted to each other even without this modifier. Enum conversion to these numeric types is automatic as well. This modifier can also be applied to the return type of the function." );
		addKeyword( "CollapseCategories/DontCollapseCategories", "Whether to hide variable group headers (i.e. collapse variable groups) in property windows. This modifier is inherited and dontcollapsecategories is the default." );
		addKeyword( "Config", "Makes the variable configurable. The default variable value is read from an INI file when the class is loaded. Each subclass has its own version of the variable value in its INI file section. If the class is declared with the PerObjectConfig modifier, the initial instance value of the variable is read from a separate INI section for that object instance." );
		addKeyword( "CppText/CppStruct/StructCppText", "The cpptext is a block declaration where programmers can implement C++ functions, it also can only be declared in native classes, any text within this block will then be exported to the corresponding native class prefixClasses.h file when compiled." );
		
		addKeyword( "DataBinding", "The variable can be manipulated by Unreal Engine 3's data store system." );
		addKeyword( "Delegate", "A delegate is a special kind of variable/function combination. Delegates were introduced in Unreal Engine 2 and are declared similar to regular functions. The difference is, that instead of the keyword function or event, delegate functions are declared with the keyword delegate. In Unreal Engine 3, delegate functions were accompanied by a delegate variable type, so delegates can now also be stored in structs or arrays and can be passed into or returned by a function." );
		addKeyword( "DemoRecording", "Specifies that this function should be replicated to the demorecording driver. It will only be executed during demo playback. This modifier automatically makes the function simulated as well, which makes sense since demo playback essentially is a client environment." );
		addKeyword( "DependsOn", "Specifies a class that must be parsed before this one. This is only necessary if the class is in the same package and declares a struct or enum type this class wants to use. Note that parent classes and implemented interfaces are always parsed before child classes. Only one class can be specified in the dependson definition, but you can add multiple dependson definitions per class declaration. \nImportant: The compiler is quite sensitive to bad dependson definitions. If the compiler gets stuck or crashes at the \"Analyzing...\" stage, make sure your dependson definitons specify valid class names in the same package and do not create circular dependencies." );
		addKeyword( "DllBind", "Enables the DLLBind feature for this class. The class can implement functions that call C functions with the same name in the specified dynamic-link library." );
		addKeyword( "DLLImport", "Indicates that the function should be linked to the specified DLL in DLLBind." );
		addKeyword( "DuplicateTransient", "Similar to transient but applies to object duplication. \n{[Transient]}" );
		
		addKeyword( "EdFindable", "Adds a 'Find' button to the variable in the property window, which can be used to select an actor from the UnrealEd viewports. For obvious reasons this only makes sense for variables of type Actor or any of its subclasses." );
		addKeyword( "EditConst", "The variable is read-only in the property window." );
		addKeyword( "EditConstArray/EditFixedSize", "For dynamic arrays, removes the buttons from the properties window that would change the array length." );
		addKeyword( "EditHide", "Hide in UnrealEd property lists." );
		addKeyword( "EditorOnly", "The variable value is only loaded for UnrealEd." );
		addKeyword( "EditInline", "Only meaningful for object variables. Displays the referenced object's properties as a subgroup below the variable in the property window. If the variable has the value None, a drop-down list of allowed (editinlinenew, non-abstract) classes can be used to create a new object which is assigned to this variable." );
		addKeyword( "EditInlineNew/NotEditInlineNew", "Whether instances of this class can be created for editable object variables via a button in the properties window. The editor allows you to select a non-abstract editinlinenew class via a drop-down list." );
		addKeyword( "EditInlineNotify", "Seems to provide special feedback to native code if the variable is edited in a property window. Seems only relevant for native classes and implies editinline." );
		addKeyword( "EditInlineUse", "Same as editinline, but also adds a 'Use' button to the variable to apply the object selected in the relevant browser for this type of object. Note that the 'Use' button is always available in Unreal Engine 3. \n{[EditInline]}" );
		addKeyword( "EditorTextBox", "Replaces the usual input box with a button for opening a separate dialog with a multi-line text box for entering. Probably only useful for string variables." );
		addKeyword( "EnumCount", "Enum types an implicit property EnumCount. This property is similar to the Length property of a dynamic array in that it returns the number of values declared for that enum. In Unreal Engine 1 and 2 it is only available at runtime, but in Unreal Engine 3 it can also be used at compile-time to define static array sizes. For some reason it doesn't count as constant expression when defining constants." );
		addKeyword( "Event", "The keyword event can be used instead of function without any difference at the UnrealScript level. The event keyword will only become relevant when writing native code. When exporting native header files from script code, event functions will have calling stubs generated so the UnrealScript function can be called more easily from C++ code." );
		addKeyword( "Exec", "Marks the function as potential console command. Note that exec functions are only really called via console commands for certain objects, such as the local PlayerController, that player's HUD, Pawn or selected Weapon and a few other places. The possible places for exec functions may vary from game to game, so have a look at the UnrealScript source code of your game to find out where you can put exec functions that actually work. \nWhen overriding functions, you must also declare the new function with the exec modifier if and only if the overridden function was declared with it. This means you cannot turn a regular function into a console command!" );
		addKeyword( "Expands", "A synonym for Extends" );
		addKeyword( "Export", "For object properties. Objects assigned to this variable are exported as subobjects when exporting class scripts or when exporting actors to T3D files or clipboard." );
		addKeyword( "ExportStructs", "All structs declared in this non-native class should be exported to native header files. Structs declared in native classes or with the native modifier are also exported without this modifier." );
		
		addKeyword( "Global", "The keyword Global is used to call the most-derived non-state version of a function. If the instance is not in any state, this has the same effect as calling that function directly." );
		addKeyword( "GlobalConfig", "Similar to the config modifier, but a globalconfig variable's default value is always read from the INI section of its declaring class, even for subclasses. \n{[Config]}" );
		
		addKeyword( "HideCategories/ShowCategories", "Whether to hide the specified property groups from property windows. By default all property groups are displayed. The special group name None contains all properties not belonging to any specific group. This special group is only included in the properties window if it was opened via debug console commands from within the game." );
		addKeyword( "HideDropdown", "Hide this class from various drop-down lists in the editor." );
		
		addKeyword( "Ignores", "A state can optionally use the ignores keyword to ignore non-final functions while in a state." );
		addKeyword( "Immutable/ImmutableWhenCooked", "The struct uses binary serialization (in previous engine versions some structs used hardcoded binary serialization in c++ e.g. Vector, Rotator and Color etc). Without this flag, each struct member will be saved with a nameindex followed by a packedbyte, size and arrayindex, then the value of the specific member, thus increases file size and slows down the serialization process." );
		addKeyword( "Inherits", "The native implementation of this class not only inherits from the native implementation of its parent class, but also from the specified C++ class." );
		addKeyword( "Input", "Attaches the variable to the input system. This is only meaningful for float and byte variables, which can be tied to axis and button input respectively. Input variables are only filled for the local player actor." );
		addKeyword( "Instanced", "Only meaningful for reference variables. Subobjects assigned to instanced variables are duplicated when an instance of the class is created." );
		addKeyword( "Interp", "The variable can be manipulated by Unreal Engine 3's Matinee system. Only really meaningful for float and vector variables." );
		addKeyword( "Intrinsic", "A synonym for native. \n{[Native]}" );
		
		addKeyword( "K2Call/K2Override/K2Pure", "Related to Kismet 2. Effect unknown." );
		
		addKeyword( "Latent", "Native functions with the latent modifier may only be called directly from state code (but not within any ForEach loop) and usually pause state code execution at least until the next tick, possibly even longer. This modifier may not be used for non-native functions." );
		addKeyword( "Localized", "Makes the variable localizable. The default value of the variable is read from a localization file when the class is loaded. Each subclass can have its own localized versions of the variable value. If the class is declared as PerObjectLocalized, each instance of the class can have its own set of localized variable values. This is useful for actors placed in a map." );
		
		addKeyword( "Native", "Native variables are variables that are loaded and saved in native code. Native functions are functions that are defined in native code. Native classes contains some kind of native code. A class may only be declared as native if it has a native parent class. A C++ declaration for this class is exported to packagenameClasses.h at compile time unless the noexport modifier is specified. The exported C++ declaration includes all variables, structs, enums, delegates and any functions declared with the native or event modifier." );
		addKeyword( "NativeOnly", "This class cannot contain non-native functions. And other classes cannot access this class's properties. NativeOnly classes cannot extend non-native classes." );
		addKeyword( "NativeReplication", "The conditions for replicating variables contained in this class are specified in native code. The replication block usually only contains an approximate representation of these conditions so UnrealScript programmers can see what is going on. This does not affect conditions for function replication." );
		addKeyword( "NoExport", "Used in two ways. One is as a modifier for preventing a variable's value from being exported to clipboard, T3D or script. One is as a modifier for preventing functions and classes from being exported to native headers." );
		addKeyword( "NoExportHeader", "Prevents this function from being exported to native headers." );
		addKeyword( "NoClear", "Instructs the editor to prevent the user from setting this variable to None. Only really meaningful for object variables." );
		addKeyword( "NoImport", "The variable's value will not be imported from text representation, i.e. when importing from a T3D file or pasting from clipboard." );
		addKeyword( "NonTransactional", "The variable is not affected by UnrealEd's undo/redo features." );
		addKeyword( "NonTransient/Transient", "Whether instances of this class should be marked as \"transient\". Transient objects can only exist at runtime, but not in package files. This modifier is inherited by subclasses, but it can only be removed from subclasses in Unreal Engine 3 via the nontransient modifier. By default classes are not transient, for obvious reasons." );
		addKeyword( "NotPlaceable/Placeable", "Whether instances of this class can be created in the editor. This modifier is inherited to subclasses and the default is notplaceable." );
		addKeyword( "NoUserCreate", "Instances of this class can not be created in the editor. Unlike the newer placeable modifier, nousercreate is not inherited." );
		
		addKeyword( "Operator/PreOperator/PostOperator", "An operator in UnrealScript is a special kind of function. Besides these regular operators, UnrealScript also provides a number of special operators. \nInfix operators always have two operands, while prefix and postfix operators have exactly one operand. All operator declarations must include the modifier final. The operator name can either be a single symbol character (^, !, $, %, &, /, ?, *, +, ~, @, -, >, <, |), a symbol combination (!=, $=, /=, ==, @=, +=, *=, ~=, -=, ^^, &&, ++, **, --, <<, >>, >>>, ||) or a standard function name. (examples in the engine are dot, cross and clockwisefrom). \nOperators can be overloaded, that means multiple operators with the same name or symbol can be defined, as long as they differ in their operand types. Overloading with identical operand types is not allowed as the engine would not be able to distinguish between the definitions." );
		
		addKeyword( "ParseConfig", "The config file name for this class can be specified at the command line via the parameter classname=..." );
		addKeyword( "PerObjectConfig", "Each instance of this class has its own section in configuration files. The non-static SaveConfig() function doesn't propagate the instance values to default values." );
		addKeyword( "PerObjectLocalized", "Each instance of this class can have its own section in localization files." );
		addKeyword( "PrivateWrite", "Related to the private access modifier. Causes the variable to be treated as private for writing, but public for reading." );
		addKeyword( "ProtectedWrite", "Related to the protected access modifier. Causes the variable to be treated as protected for writing, but public for reading." );
		
		addKeyword( "RepNotify", "Can be used on replicated actor variables to instruct the engine to call the ReplicatedEvent function whenever a value was received for the variable." );
		addKeyword( "RepRetry", "If replication of this variable was not successful the replication will be tried again." );
		
		addKeyword( "SafeReplace", "Instances of this class can safely be replaced by some kind of default instance if a specific instance is unavailable. This is only used for Textures, which are replaced by the default texture if the specific texture object does not exist." );
		addKeyword( "Server", "Specifies that this function should be replicated to the server if it was called on a replicated actor that is owned by the local client." );
		addKeyword( "Simulated", "The keyword simulated is used as a modifier for functions and states whose code should be executable even if the context object is an Actor with Role <= ROLE_SimulatedProxy. \nThis modifier is not inherited when overriding functions - every super function call evaluates that super function's simulated modifier separately, potentially breaking the chain of super calls on clients!" );
		addKeyword( "Singular", "Restricts recursive function calls by only ever allowing a single singular function to execute per object instance. If a singular function is called, the engine first checks if the object instance the function was called on already executes a singular function. If it does, the new function call is ignored." );
		addKeyword( "Skip", "Only allowed for the second parameter of a native operator declaration. The native implementation of the operator may choose to not evaluate the second operand if the operator result can be determined by evaluating only the first operand. This is used for the operators && and || to skip evaluating the second boolean expression if it is not required." );
		addKeyword( "Stop", "The stop statement is only allowed in state code and immediately halts state code execution without leaving the state. To restart state code again, you need to call the GotoState() function with the desired new state and/or label name. \nTo stop function code execution use the return statement instead. \nPS: stop is used like \"stop;\", not like \"stop();\"" );
		addKeyword( "StrictConfig", "When the struct variable is flagged with config/globalconfig then only members with the flag config/globalconfig will be readable from the .ini, instead of all members." );
		
		addKeyword( "Travel", "For single player gametypes where a player advances from one map to the next, carrying over all inventory items. Instance variables marked as travel will keep their value across the map change. Only has an effect for the PlayerPawn in UE1 (or the PlayerController and its Pawn in UE2) and its Inventory chain." );
		
		addKeyword( "Virtual", "This modifier is just passed through to exported native headers. It has no effect in UnrealScript." );
		
		addKeyword( "Within", "The within clause is an optional part of class declarations that defines the class to be an inner class. It was introduced in Unreal Engine 2 and forces instances of a class to be created within instances of another class. \nInner classes declared with a within clause can access members of the specified outer class without having to qualify the access with the Outer property declared in Object. If a member of the inner class hides a member of the specified outer class, the access can be qualified with the Outer property without having to typecast it as the Outer property is guaranteed to reference an instance of the outer class or one of its subclasses." );
		
		fillLinksOfAllKeywords();
		fillLinksOfAllKeywords();
		fillLinksOfAllKeywords();
	}
	
	private static void addKeyword( String keyword, String info )
	{
		for( String word : keyword.split( "/" ) )
		{
			keywordInfo.put( word.toLowerCase(), info.replaceAll( "\n", "\n\n" ) );
		}
	}
	
	private static void fillLinksOfAllKeywords()
	{
		HashMap<String,String> newKeywordInfo = new HashMap<String,String>();
		for( Entry<String,String> entry : keywordInfo.entrySet() )
		{
			newKeywordInfo.put( entry.getKey(), fillLinks(entry.getValue()) );
		}
		keywordInfo = newKeywordInfo;
	}
	/**
	 *  Replaces
	 *    "{[" + word + "]}"
	 *  with
	 *    word + ": " + getKeywordInfo( word.toLowerCase() )
	 */
	private static String fillLinks( String info )
	{
		Pattern pattern = Pattern.compile( "\\{+\\[+[a-zA-Z_]+\\]+\\}" );
		Matcher matcher = pattern.matcher( info );
		while( matcher.find() )
		{
			String start = info.substring( 0, matcher.start() );
			String end = info.substring( matcher.end() );
			
			String match = matcher.group();
			String newMatch = "";
			
			String word = match.substring( 2, match.length() - 2 );
			String wordInfo = getKeywordInfo( word.toLowerCase() );
			if( wordInfo != null )
			{
				newMatch = word + ": " + wordInfo;
			}
			
			info = start + newMatch + end;
		}
		return info;
	}
	
	
	public static String getKeywordInfo( String keyword )
	{
		if( keyword == null )
			return null;
		return keywordInfo.get( keyword.toLowerCase() );
	}
}
