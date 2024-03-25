package com.jbk.stream;
import java.util.Arrays;
import java.util.List;

//DECLARATIVE STYLE 

public class Day19_1 
{

	public static void main(String[] args)
	{
		//Question 1]-->In List collection,Find the nos which are divisible by 2 
		//and then multiply them by 2 
		//and then get sum of all that numbers
		List<Integer> list=Arrays.asList(11,22,33,44,55,66,77,88,99,100);				
		int sum = list.stream().filter((x)-> x%2==0).mapToInt(e->e*2).sum();
		System.out.println(sum); //640
		
		//Question 2]-->Sort the List elements
		List<Integer> list2=Arrays.asList(401,22,303,4444,55,606,77,8,979,100);		
		list2.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		//Question 3]-->Find distinct elements in the List 
		List<Integer> list3=Arrays.asList(401,55,303,401,55,303,77,8,979,8);
        list3.stream().distinct().forEach(System.out::println);	

	}
	
}
/*
//IMPERTATIVE STYLE 
// have we specified using for loop
// what is to be performed and how it is to be performed

public class Day19_1 {

	public static void main(String[] args)
	{
		List<Integer> numbers=Arrays.asList(11,22,33,44,55,66,77,88,99,100);
		int result = 0 ;
		for(Integer n:numbers)
		{
			if(n%2==0)
			{
				result+=n*2;
			}
		}
		System.out.println("Result = "+result);
	}
	

}
*/