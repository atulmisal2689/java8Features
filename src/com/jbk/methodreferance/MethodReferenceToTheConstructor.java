//Method Reference to the constructor 
package com.jbk.methodreferance;
@FunctionalInterface
interface MyInterface
{
	Hello display(String str);
}

class Hello
{
	public Hello(String str) // Parameterized Constructor 
	{
		System.out.println(str);
	}
}

public class MethodReferenceToTheConstructor 
{

	public static void main(String[] args)
	{
		MyInterface ref=Hello::new;
		ref.display("Hello Everyone");
	}

}
