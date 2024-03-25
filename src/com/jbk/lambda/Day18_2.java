package com.jbk.lambda;


@FunctionalInterface 
interface Name
{
	public String getName();
}


@FunctionalInterface
interface Square
{
	// getArea() it is single abstract method 
	public int getArea(int side); 
	
}

public class Day18_2 
{
	public static void main(String[] args) 
	{
		Name name =( ()->{return "Hi !! Everyone ";} );
		         //Or
		//Namedd nmd=()->"Atul";
		String string = name.getName();
		System.out.println("Name="+string);
		
		
        Square area = ((x)->{return x * x;});
                   //Or
       // Squaredd sqd=(x)->x*x;
		int i = area.getArea(5);
		System.out.println("area="+i);
		
	}
}
