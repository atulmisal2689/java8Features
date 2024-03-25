package com.jbk.lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//lambda expression returns one object as a reference
//lambda expression stored in a variable and printing it
public class Day18_1
{

	public static void main(String[] args) 
	{
		List<Integer> al = Arrays.asList(10,20,30,40);
		Consumer<Integer> action = x->System.out.print(x+"  ");
		al.forEach(action);
		
		System.out.println();

	   // Printing List Using Method Reference
	     al.forEach(System.out ::println);
	}
}

/*
public class Day18_2 {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);
		al.add(55);
		
		//lambda expression
		al.forEach(x->System.out.print(x +" \t "));
		
		System.out.println();
		
		
		// Method Reference
		al.forEach(System.out ::println);
		
	}

}
*/

/*
public class Day18_1
{
	public static void main(String[] args) 
	{
		ArrayList<Float> al=new ArrayList<Float>();
		al.add(11.5f);
		al.add(22.5f);
		al.add(33.5f);
		al.add(44.5f);
		al.add(55.5f);
		
		//lambda expression
		System.out.println("Displaying the elements using Lambda");
		al.forEach(x->System.out.print(x +" \t "));
		
		System.out.println();
		System.out.println("Displaying the elements using Method Reference");
		// Method Reference
		al.forEach(System.out ::println);
	}
}
*/

/*
 ////lambda expression working with Non Primitive Data Type
public class Day18_1 {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Akshita");
		al.add("Pune");
		al.add("sunbeam");
		
		
		al.forEach((String x)->{
			System.out.print("Data = " +x+" \t ");
		});
	}
}
*/



/*
Global Static VARIABLE CAPTURE 
public class Day18_1 
{

	static float fval=3.5f; //static varible
	
	public static void main(String[] args)
	{
		List<Integer> l1=Arrays.asList(11,22,33,44,55);
		
		l1.forEach(x->System.out.print(x+fval +" \t "));
	}
}
*/

/*
// fetching local variable inside lambda 
//Local VARIABLE CAPTURE 

public class Day18_1 {

	public static void main(String[] args)
	{
		List<Integer> l1=Arrays.asList(11,22,33,44,55);
		float fval=3.5f;
		
		l1.forEach(x->System.out.print(x+fval +" \t "));
	}
}

*/


/*
//lambda expression with type parameter
 
public class Day18_1 {

	public static void main(String[] args)
	{
		List<Integer> l1=Arrays.asList(11,22,33,44,55);
		l1.forEach((Integer x)->{
			x+=4;
			System.out.print(x+" \t ");
		});
	}
}


*/


/*
//lambda expression with local variable 

public class Day18_1 {

	public static void main(String[] args)
	{
		List<Integer> l1=Arrays.asList(11,22,33,44,55);

		l1.forEach(x -> {
			int y= x*3;
			System.out.print(y + " \t ");
		});
	}
}
*/

/*
// Multi Line Lambda Expression

public class Day18_1 {

	public static void main(String[] args)
	{
		List<Integer> l1=Arrays.asList(11,22,33,44,55);
		l1.forEach(x -> {
			x+=5;
			System.out.print(x+" \t " );
		});
	}
}

*/


//print list of integers with a lambda expressions
//single line lambda expressions

/*
public class Day18_1 {

	public static void main(String[] args)
	{
		List<Integer> l1=Arrays.asList(1,2,3,4,5);
		l1.forEach(x -> System.out.print(x + " \t ")); 
		System.out.println();
		l1.forEach(x -> System.out.print(x*x +" \t ")); 
		
	}

}

*/
