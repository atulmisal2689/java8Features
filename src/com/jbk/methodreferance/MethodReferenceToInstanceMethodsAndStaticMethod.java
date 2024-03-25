package com.jbk.methodreferance;

import java.util.function.BiFunction;

@FunctionalInterface 
interface Named
{
	public void view();
}

class StaticAndNonStaticMethods 
{
	public void display()
	{
		System.out.println("In Display Method");
	}
	
	public static void display2()
	{
		System.out.println("In Display 2 Method");
	}
	
	public static int display3(int a,int b)
	{
		return a*b;
	}
}


public class MethodReferenceToInstanceMethodsAndStaticMethod 
{
	public static void main(String[] args) 
	{
		//Instance method call
		StaticAndNonStaticMethods snm=new StaticAndNonStaticMethods();
        Named nm1=snm::display;
		nm1.view();
		
		
		//Static method call
		Named nm2=StaticAndNonStaticMethods::display2;
		nm2.view();
		
		//Static method call using BiFunction
		BiFunction<Integer, Integer, Integer>bFunction=StaticAndNonStaticMethods::display3;
		int result = bFunction.apply(5,4);
		System.out.println(result);
	}

}
