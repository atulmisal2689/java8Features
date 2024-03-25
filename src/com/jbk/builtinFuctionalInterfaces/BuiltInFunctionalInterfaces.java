package com.jbk.builtinFuctionalInterfaces;


import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class BuiltInFunctionalInterfaces 
{

	public static void main(String[] args) 
	{
		//1]Predicate<T>
		Predicate<String>predicate=(s)->s!=null && s.length()>0;
		boolean isNotNull = predicate.test("Atul Misal");
		System.out.println("Predicate="+isNotNull);
		System.out.println("Predicate="+ predicate.test(null));
		//Example2
		//boolean return type
		String string="Atul";
		Predicate<String>predicate2=x->x.isEmpty() && x.length()>0;
		boolean test = predicate2.test(string);
		System.out.println(test);

		//2]Function<T,R>
		Function<String,Integer> fuction=(s)->s.length();
		Integer i = fuction.apply("Atul Misal");
		System.out.println("Function="+i);
		System.out.println("Function="+fuction.apply("Arya"));
		//Example2
		//2nd type parameter return type
		Function<String, Integer>function=x->x.length();
		Integer length = function.apply(string);
		System.out.println(length);

		//Diff Between Predicate & Function
		//In Predicate return Type is always Boolean
		//In Function you have Control Over Return Type
		Function<String,Boolean> fuction2=(s)->s!=null && s.length()>0;
		System.out.println("Function2="+fuction2.apply("Arya"));


		//3]Consumer<T>
		Consumer<Integer>consumer=(x)->System.out.println("Consumer="+x);
		consumer.accept(77);
		//Example2
		//void return type 
		int a=20;
		Consumer<Integer>consumer2=x->System.out.println(x);
		consumer2.accept(20);

		//4]Supplier<T>
		Supplier<Date>supplier=()->new Date();
		System.out.println("supplier="+supplier.get());
		//Example2
		//type parameter is return type 
		Supplier<String>supplier2=()->"Atul Misal";
		String string2 = supplier2.get();
		System.out.println(string2);

		//5]UnaryOperator<T>
		UnaryOperator<Integer>unaryOperator=(x)->x*x*x;
		System.out.println("UnaryOperator="+unaryOperator.apply(10));
		//Example2
		//type parameter is return type 
		UnaryOperator<Integer>unaryOperator2=x->x*x;
		Integer integer = unaryOperator2.apply(10);
		System.out.println(integer);



		//6]Predicate Joining
		Predicate<String>p1=(s)->s!=null && s.length()>0;
		Predicate<String>p2min=(s)->s.length()>4;
		Predicate<String>p2max=(s)->s.length()<10;
		System.out.println("Predicate Joining By And="+p1.and(p2min).and(p2max).test("okj"));
		System.out.println("Predicate Joining By Or="+p1.or(p2min).or(p2max).test("okj"));

		//7] Function chaining

		//Example1
		List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant","Ananas");
		// Function chaining using Stream API
		String result = words.stream()
				.map(String::toUpperCase) // Convert each word to uppercase
				.filter(s -> s.startsWith("A")) // Filter words starting with "A"
				.collect(Collectors.joining(", ")); // Join the filtered words
		System.out.println("Result: " + result);       

		//Example2
		Function<Integer, Integer> addOne = num -> num + 1;
		Function<Integer, Integer> multiplyByTwo = num -> num * 2;

		// Chain the functions together using andThen
		Function<Integer, Integer> addOneThenMultiplyByTwo = addOne.andThen(multiplyByTwo);

		// Apply the chained function to an integer value
		int result2 = addOneThenMultiplyByTwo.apply(5);
		System.out.println("Result: " + result2); // Output: Result: 12
	}

}
