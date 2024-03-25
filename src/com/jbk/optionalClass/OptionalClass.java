package com.jbk.optionalClass;

import java.util.Optional;

public class OptionalClass 
{
	public static Optional<String> getName()
	{
		String name=null;
		//return Optional.ofNullable(Optional.ofNullable(name).orElse("GetName Method is Null"));
		return Optional.ofNullable(name);
	}	
	
	public static String view()
	{				
		return "Misal Misal";		
	}
	
	public static String display()
	{		
		
		return null;		
	}

	public static void main(String[] args) 
	{
		String str=null;
				
		Optional<String> optional = Optional.ofNullable(str);		
		//System.out.println(optional.get()); // Throws NoSuchElementException
		System.out.println(Optional.empty()); // Optional.empty
		System.out.println(optional.isPresent());				
		System.out.println(optional.orElse("String Is Empty"));

		
		//Calling To View Method
		String string = view();		
		Optional<String> optional2 = Optional.ofNullable(string);		
		System.out.println(optional2.orElse("View Is Null"));
		
		
		//Calling To Display Method
		String string2 = display();
		Optional<String> optional3 = Optional.ofNullable(string2);
		System.out.println(optional3.orElse("Display is Null"));
		
		
		//Calling To getName Method
		Optional<String> optional4 = getName();
		//System.out.println(optional4.get());
		System.out.println(optional4.orElse("GetName Method is Null"));

	}

}
