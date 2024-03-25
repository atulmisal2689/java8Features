package com.jbk.staticDefaultMethods;

public class WebDeveloper implements Developer
{

	@Override
	public void develope() 
	{
		System.out.println("Web Developer");
		
	}
	
	//This is not over ridden method,this method only hides implementation of 
	//Developer interface destroy() method
	static void destroy()
	{
		System.out.println("I am WebDeveloper Destroy");
	}

}
