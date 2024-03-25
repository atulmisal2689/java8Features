package com.jbk.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice 
{


	public static void main(String[] args) 
	{
		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(now.plusMonths(11));
		System.out.println(now.minusDays(10));
		System.out.println(now.getMonthValue());
		System.out.println(now.getYear());
		
		LocalDate of = LocalDate.of(1989, 8, 26);
		System.out.println(of);
		System.out.println(of.plusMonths(11));
		
		System.out.println(now.isAfter(of));
		
		String date3="15-05-2015";
		LocalDate parse = LocalDate.parse(date3);
		System.out.println(parse);
		
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 System.out.println(LocalDate.parse(date3,ofPattern));


	}

}
