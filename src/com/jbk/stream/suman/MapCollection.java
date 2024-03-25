package com.jbk.stream.suman;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapCollection 
{

	public static void main(String[] args) 
	{
		Map<Integer,String>map=new HashMap<>();
		
		map.put(99, "Phy");
		map.put(90, "Math");
		map.put(97, "Scien");
		map.put(84, "Histry");
		
		System.out.println("Keys Printing");
		map.keySet().stream().forEach(System.out::println);
		System.out.println();
		
		System.out.println("Values Printing");
		map.values().stream().forEach(System.out::println);
		System.out.println();
		
		System.out.println("Key & Values Printing (Random Order Printing)");
		map.entrySet().stream().forEach(System.out::println);
		System.out.println();
		
		System.out.println("Key Printing in Accending Order");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println();
		
		System.out.println("Key Printing in Decending Order");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Collections.reverseOrder())).forEach(System.out::println);
		System.out.println();
		
		
		System.out.println("Values Printing in Accending Order");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println();
		
		
		System.out.println("Values Printing in Decending Order");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).forEach(System.out::println);
		System.out.println();
		
		
		System.out.println("Converting Map Keys into List");
		List<Integer> list = map.keySet().stream().collect(Collectors.toList());
		System.out.println(list);
		System.out.println();
		
		System.out.println("Converting Map Values into List");
		List<String> list2 = map.values().stream().collect(Collectors.toList());
		System.out.println(list2);
		System.out.println();
		
		
	}

}
