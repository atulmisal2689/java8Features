package com.jbk.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

        //Question1
		// ArrayList of ten numbers
		// display the numbers
		// find out the numbers which are divisible by 3
		// use concept of stream

public class Homework1 
{

	public static void main(String[] args) 
	{

		List<Integer> list=Arrays.asList(11,22,33,44,55,66,77,88,99,100);
		
		//List<Integer> list2 = list.stream().filter(x-> x%3==0).collect(Collectors.toList());
		
		list.stream().filter(x-> x%3==0).forEach(System.out::println);;
		
		//System.out.println(list2);
		

		
		//Question2
		// Create an ArraList of 10 nos
		// display list of numbers who are >75
		// use streams 
		
		List<Integer> list3=Arrays.asList(11,22,33,44,55,66,77,88,99,100);
		
		List<Integer> list4 = list3.stream().filter(x->x>75).collect(Collectors.toList());
		
		System.out.println(list4);
				

	}

}
