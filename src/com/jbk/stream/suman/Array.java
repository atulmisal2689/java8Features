package com.jbk.stream.suman;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Array 
{

	public static void main(String[] args) 
	{

		int[]arr= {10,50,30,70,70,10,50};

		//Q1] Arrays element count
		long count = Arrays.stream(arr).count();
		System.out.println("Count="+count);
		System.out.println();


		//Q2] Arrays element itirate
		System.out.println("Elements Itirate");
		Arrays.stream(arr).forEach(x->{System.out.println(x);});
		//Arrays.stream(arr).forEach(System.out::println);
		System.out.println();

		//Q3] Arrays element sort in acending order
		System.out.println("Elements sort in acending order");
		Arrays.stream(arr).sorted().forEach(x->{System.out.println(x);});
		System.out.println();

		//Q4] Arrays element sort in decending order
		System.out.println("Elements sort in decending order");
		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder())
				.forEach(x->{System.out.println(x);});				
		System.out.println();

		//Q5] Arrays duplicate element remove
		System.out.println("Remove Duplicate elements");
		Arrays.stream(arr).distinct().forEach(x->{System.out.println(x);});
		System.out.println();
		
		//Q6] Arrays duplicate element remove + Decending Order
		System.out.println("Remove Duplicate elements+ Decending Order");
		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
		System.out.println();

		//Q7] Arrays elements sum
		int sum = Arrays.stream(arr).sum();
		System.out.println("Sum Of Arrays Elements="+sum);
		System.out.println();


		//Q8] Arrays elements average
		OptionalDouble average = Arrays.stream(arr).average();
		System.out.println("Average Of Arrays Elements="+average);
		System.out.println();

		//Q9] Arrays elements even no find out
		System.out.println("Arrays even no find out");
		Arrays.stream(arr).filter(x->x%2==0).forEach(x->{System.out.println(x);});
		System.out.println();


		//Q10] Get minimum Arrays elements
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("minimum Arrays elements is ="+min.getAsInt());
		System.out.println();


		//Q11] Get maximun Arrays elements
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("maximun Arrays elements is ="+max.getAsInt());
		System.out.println();


		//Q12] To check stream is parallel or sequential
		//By Using Array or Collection Object we always get sequential stream
		boolean isparallel = Arrays.stream(arr).isParallel();
		if(isparallel)
		{
			System.out.println("Stream is Parallel");
		}
		else
		{
			System.out.println("Stream is Sequential");
		}
		System.out.println();


		//Q13] To convert sequential stream into parallel   
		boolean isparallel2 = Arrays.stream(arr).parallel().isParallel();
		if(isparallel2)
		{
			System.out.println("Stream is Parallel");
		}
		else
		{
			System.out.println("Stream is Sequential");
		}
		System.out.println();

	}

}
