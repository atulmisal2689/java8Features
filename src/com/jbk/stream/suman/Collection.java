package com.jbk.stream.suman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Collection 
{

	public static void main(String[] args)
	{
		List<String> list=new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(null);


		//Q.1]Remove Null elements
		System.out.println("Remove Null elements");
		list.stream().filter(x->x!=null).forEach(y->System.out.println(y));
		System.out.println();


		//Q.2]-->Remove Duplicate elements from the List 
		System.out.println("Remove Duplicate elements");
		List<Integer> list2=Arrays.asList(401,55,303,401,55,303,77,8,979,8);
		list2.stream().distinct().forEach(System.out::println);	
		System.out.println();

		//Q.3]-->Remove Null & Duplicate Both elements from the List 
		System.out.println("Remove  Null & Duplicate elements");
		List<Integer> list3=Arrays.asList(401,55,303,null,401,55,303,77,8,979,8);
		list3.stream().distinct().filter(x->x!=null).forEach(System.out::println);	
		System.out.println();


		//Q.4]-->Remove Null & Duplicate & Sort Accending elements from the List 
		System.out.println("Remove  Null & Duplicate  & Sort Accending Order elements");
		List<Integer> list4=Arrays.asList(401,55,303,null,401,55,303,77,8,979,8);
		list3.stream().distinct().filter(x->x!=null).sorted().forEach(System.out::println);	
		System.out.println();


		//Q.5]-->Remove Null & Duplicate & Sort Decending elements from the List 
		System.out.println("Remove  Null & Duplicate  & Sort Decending Order elements");
		List<Integer> list40=Arrays.asList(401,55,303,null,401,55,303,77,8,979,8);
		list40.stream().distinct().filter(x->x!=null).sorted(Comparator.reverseOrder()).forEach(System.out::println);	
		System.out.println();

		//Q.5]-->Remove Null & Duplicate & Uppercase & Sort elements from the List 
		System.out.println("Remove Null & Duplicate &Upper case & Sort elements");
		List<String> list5=new ArrayList<>();
		list5.add("atul");
		list5.add("misal");
		list5.add("atul");
		list5.add(null);
		list5.add("rupali");
		list5.add("palli");
		list5.add(null);
		list5.stream().distinct().filter(x->x!=null).map(y->y.toUpperCase()).sorted().forEach(System.out::println);	
		System.out.println();

		//Q.6]-->Limit to the List elements printing 
		System.out.println("Limit to the List elements printing");
		list5.stream().limit(2).forEach(System.out::println);
		System.out.println();
		list5.stream().limit(4).forEach(System.out::println);
		System.out.println();


		//Q.7]-->skip some List elements and printing remaining elements 
		System.out.println("Skip List elements and printing remaining elements");
		list5.stream().skip(2).forEach(System.out::println);
		System.out.println();
		list5.stream().skip(4).forEach(System.out::println);
		System.out.println();

		//Q.8]-->skip 2 List elements and printing next elements
		System.out.println("skip 2 List elements and printing next elements");
		list5.stream().skip(2).limit(1).forEach(System.out::println);
		System.out.println();

		//Q.9]-->limit 3 List elements and printing 3rd elements
		System.out.println("skip 2 List elements and printing next elements");
		list5.stream().limit(3).skip(2).forEach(System.out::println);
		System.out.println();

		                //Terminating Operations

		//Q.10]-->Get Count & Sum of List elements and printing sum
		System.out.println("Count & Sum of List elements and printing sum");
		List<Integer> list6=Arrays.asList(401,55,303,401,55,303,77,8,979,8);
		long count = list6.stream().count();
		System.out.println("Count="+count);
		Optional<Integer> reduce = list6.stream().reduce((a,b)->a+b);
		System.out.println("Sum of List elements="+reduce.get());
		System.out.println();


		//Q.11]-->Converting list to Array by toArray() method
		System.out.println("Converting list to Array by toArray() method & Printing Elements");
		List<Integer> list7=Arrays.asList(401,55,303,401,55,303,77,8,979,8);
		Object[] objects = list7.stream().toArray();
		Arrays.stream(objects).forEach(System.out::println);
		System.out.println();


		//Q.12]-->Finding Maximum element
		System.out.println("Finding Maximum element");
		List<Integer> list8=Arrays.asList(401,55,303,401,55,303,77,8,979,8);
		Optional<Integer> max = list8.stream().max((a,b)->a.compareTo(b));
		System.out.println("Maximum element="+max.get());
		System.out.println();

		//Q.12]-->Finding Minimum element
		System.out.println("Finding Minimum element");
		List<Integer> list9=Arrays.asList(401,55,303,401,55,303,77,8,979,8);
		Optional<Integer> min = list8.stream().min((a,b)->a.compareTo(b));
		System.out.println("Minimum element="+min.get());
		System.out.println();

		//Q.12]-->Collect() method
		System.out.println("Use Of Collect Method");
		List<Integer> list10=Arrays.asList(401,55,303,401,55,303,77,8,979,8);
		List<Integer> listElements = list10.stream().distinct().collect(Collectors.toList());
		System.out.println("listElements Are"+listElements);
		System.out.println();

		Set<Integer> set = list10.stream().distinct().collect(Collectors.toSet());
		System.out.println("Set Elements Are"+set);
		System.out.println();

		List<Integer> list100=Arrays.asList(1,2,3,4,5,6);
		Map<Integer, Integer> map = list100.stream().collect(Collectors.toMap(i -> i, i -> i * i));
		System.out.println("Map Elements Are"+map);
		System.out.println();

		//Q.13]-->findFirst() method
		System.out.println("Use Of findFirst Method");
		List<Integer> list11=Arrays.asList(401,55,303,401,55,303,77,8,979,8);
		Optional<Integer> findFirst = list11.stream().findFirst();
		System.out.println("First Element="+findFirst.get());
		System.out.println();


		//Q.14]-->findAny() method
		System.out.println("Use Of findFirst Method");
		List<Integer> list12=Arrays.asList(401,55,303,401,55,303,77,8,979,8);
		Optional<Integer> findAny = list12.stream().findAny();
		System.out.println("FindAny Element="+findAny.get());
		System.out.println();

		//Q.15]-->anyMatch() method
		List<String> list13=new ArrayList<>();
		list13.add("atul");
		list13.add("misal");
		list13.add("rupali");
		list13.add("ashsih");
		list13.add("palli");

		boolean anyMatch = list13.stream().anyMatch(x->x.startsWith("rupali"));
		if(anyMatch==true)
		{
			System.out.println("Match Found");
		}
		else
		{
			System.out.println("No Match Found");
		}
		System.out.println();


		//Q.16]-->allMatch() method
		boolean allMatch = list13.stream().allMatch(x->x.startsWith("a"));
		if(allMatch)
		{
			System.out.println("Match Found");
		}
		else
		{
			System.out.println("No Match Found");
		}
		System.out.println();


		//Q.17]-->noneMatch() method
		boolean noneMatch = list13.stream().noneMatch(x->x.startsWith("a"));
		if(noneMatch)
		{
			System.out.println("Match Found");
		}
		else
		{
			System.out.println("No Match Found");
		}
		System.out.println();
	}

}
