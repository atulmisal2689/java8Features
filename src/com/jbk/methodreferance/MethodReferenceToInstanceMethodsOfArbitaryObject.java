//Method Reference to the instance methods of arbitary object particular type
package com.jbk.methodreferance;
import java.util.Arrays;

public class MethodReferenceToInstanceMethodsOfArbitaryObject 
{
	public static void main(String[] args) 
	{		
		String[] strArray1= {"Akshita","Trainer","Sunbeam","Pune","Java","Python"};
		Arrays.sort(strArray1);
		System.out.println(Arrays.toString(strArray1));
		
		System.out.println();		

		String[] strArray2= {"Akshita","Trainer","Sunbeam","Pune","Java","Python"};
		Arrays.sort(strArray2);
		Arrays.stream(strArray2).forEach(System.out::println);
		
		System.out.println();
		
		//Method Reference to the compareTo methods of String class object 
		String[] strArray3= {"Akshita","Trainer","Sunbeam","Pune","Java","Python"};
		Arrays.sort(strArray3,String::compareTo);
		Arrays.stream(strArray3).forEach(System.out::println);
		
		System.out.println();
		
		String[] strArray4 = {"Akshita", "Trainer", "Sunbeam", "Pune", "Java", "Python"};
        Arrays.sort(strArray4, (s1, s2) -> s1.compareTo(s2));
        Arrays.stream(strArray4).forEach(s -> System.out.println(s));

	}

}
