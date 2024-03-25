package com.jbk.stream;

import java.util.Arrays;
import java.util.List;

public class Day19_2 
{

	public static void main(String[] args)
	{
		
		
		List<Integer> list=Arrays.asList(1,2,3,4);
		
		          //Do square of nos and then sum of them
		int sum=list.stream().map(x -> x*x ).reduce((x,y)->x+y).get();
		System.out.println("Sum of sqaures of numbers in  list= "+sum);  //30
		                      //or
		//Optional<Integer> sum = list.stream().map(x->x*x).reduce(Integer::sum);
		
		
		
		                  //Sum Of Even Nos
		int sum_even=list.stream().filter(x->x%2==0).reduce((x,y)->x+y).get();
		System.out.println("Sum of Even "+sum_even);  //6
		
		                    //OR//		
		int sum_even1=list.stream().filter(x->x%2==0).mapToInt(e->e*1).sum();
		System.out.println("Sum of Even "+sum_even1);  //6
		
		
		
		                     //Sum Of Odd Nos
		int sum_odd=list.stream().filter(x->x%2!=0).reduce((x,y)->x+y).get();
		System.out.println("Sum of Odd "+sum_odd); //4
		

		                         //OR//
		int sum_odd1=list.stream().filter(x->x%2!=0).mapToInt(e->e*1).sum();
		System.out.println("Sum of Odd "+sum_odd1);  //4
		
		
		
	}
}

/*
public class Day19_2 
{

	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(1,2,3,4,2);
		int value = (int) list.stream().count();
		System.out.println("Value = "+value);
		
		System.out.println("First Element "+list.stream().findFirst());
		
		System.out.println(list.stream().distinct());
		
	}

}
*/
