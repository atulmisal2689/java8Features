package com.jbk.stream.suman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Question3
//Create a class Student (name,id,marks)
//Create an ArraList
//display list of students who got marks >75
//use streams 

class Student
{
	private String name;
	private int id;
	private int marks;

	public Student(String name, int id, int marks) 
	{
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	public String getName()
	{
		return name;
	}

	public int getId() {
		return id;
	}

	public Integer getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", id=" + id +
				", marks=" + marks +
				'}';
	}
}

public class OperationsOnCustomStudentClass 
{
	public static void main(String[] args) 
	{
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("Alice", 1, 80));
		studentList.add(new Student("Bob", 2, 90));
		studentList.add(new Student("Charlie", 3, 70));
		studentList.add(new Student("David", 4, 85));
		studentList.add(new Student("Eva", 5, 60));

		System.out.println("Students with marks > 75:"); 
		studentList.stream().filter(x->x.getMarks()>75).forEach(System.out::println);

		studentList.stream().filter(x -> x.getMarks() > 75).forEach(System.out::println);
		System.out.println();


		System.out.println("Students Total Count whose with marks > 75");
		long count = studentList.stream().filter(x -> x.getMarks() > 75).count();
		System.out.println("Count="+count);
		System.out.println();

		System.out.println("Students Having Maximum Marks");
		Optional<Student> max = studentList.stream().max(Comparator.comparing(Student::getMarks));
		//OR//Optional<Student> max2 = studentList.stream().max((a,b)->a.getMarks().compareTo(b.getMarks()));
		System.out.println(max.get());
		System.out.println();

		System.out.println("Students Having 2nd Highest Marks");
		int secondHighestMark =studentList.stream().mapToInt(Student::getMarks).distinct().boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1) // Skip the highest mark
				.findFirst()
				.orElse(-1);
		
		//studentList.stream().mapToInt(Student::getMarks).boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(System.out::println);
		System.out.println(secondHighestMark);
		System.out.println();


		System.out.println("Students Having name Alice");
		studentList.stream().filter(x->x.getName().contains("Alice")).forEach(System.out::println);
		System.out.println();
		
		
		
		System.out.println("Sort StudentsBy Name in Acending & Decending order");
		//studentList.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
		Collections.sort(studentList, Comparator.comparing(Student::getName));
		//Descending order
		//Collections.sort(studentList, Comparator.comparing(Student::getName).reversed());
		//studentList.stream().sorted(Comparator.comparing(Student::getName).reversed()).forEach(System.out::println);		
		studentList.stream().forEach(System.out::println);
		System.out.println();

		
		System.out.println("Sort Students By Marks in Accending order");
		Collections.sort(studentList, Comparator.comparing(Student::getMarks));
		//Descending order
		//Collections.sort(studentList, Comparator.comparing(Student::getMarks).reversed());
		studentList.stream().forEach(System.out::println);
		System.out.println();
	}
}
