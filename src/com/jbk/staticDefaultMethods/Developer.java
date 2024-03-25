package com.jbk.staticDefaultMethods;

public interface Developer 
{
	//Abstract Method
	void develope();
	
	/*
	   Default method->
	   The concept of default method is used to
	   define a method with default implementation.
	   You can override default method also 
	   to provide more specific implementation for the method.
    */
	default void init()
	{
		System.out.println("I am Developer Init ");
	}
	
	//Static methods->
	//are used to define utility methods
	static void destroy()
	{
		System.out.println("I am Developer Destroy");
	}
	

}
