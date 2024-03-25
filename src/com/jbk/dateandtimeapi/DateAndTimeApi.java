package com.jbk.dateandtimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTimeApi 
{

	public static void main(String[] args) 
	{

		//Question->What are the main drawbacks of the old java.util.Date and java.util.Calendar classes?
		//The old classes were not thread-safe, mutable, 
		//and had poor API design. 
		//They also lacked support for modern date and time concepts like time zones and were error-prone.

        //Question->What are the core classes of the Java 8 Date and Time API?
        //The core classes are LocalDate, LocalTime, LocalDateTime, Instant, Duration, and Period.
		
		
		
		//LocalDate: Represents a date without time (year-month-day).
		LocalDate today = LocalDate.now();
		System.out.println("Todays Date="+today);
		System.out.println(today.getYear());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfMonth());

		//Question->How do you manipulate dates and times, for example, adding days or hours?
		System.out.println("Yesterday="+today.minusDays(1));
		System.out.println("After 11 Months Date="+today.plusMonths(11));
		LocalDate birthday = LocalDate.of(1989, 8, 26);
		System.out.println("My Birth Date="+birthday);
		//Question->How do you check if a date is before or after another date?
		boolean after = today.isBefore(birthday);
		System.out.println(after);
		String date3="2020-05-15";
		LocalDate parse3 = LocalDate.parse(date3);
		System.out.println(parse3);



		//LocalTime: Represents a time without a date (hour-minute-second).
		LocalTime now = LocalTime.now();
		System.out.println("Todays Current Time="+now);
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.minusHours(1));
		LocalTime meetingTime = LocalTime.of(14, 30);
		System.out.println("Todays meetingTime="+meetingTime);
		String time="15:30";
		LocalTime parse = LocalTime.parse(time);
		System.out.println(parse);



		//LocalDateTime: Represents a date and time (year-month-day-hour-minute-second).
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Todays Date & Current Time="+dateTime);
		LocalDateTime specificDateTime = LocalDateTime.of(2022, 2, 14, 12, 30);
		System.out.println("Todays Date & meetingTime="+specificDateTime);		
		//Question->How do you manipulate dates and times, for example, adding days or hours?
		LocalDateTime newDateTime = dateTime.plusDays(1).plusHours(2);
		System.out.println("Adding 1Day & 2Hr in Current Date & Time="+newDateTime);		

		String date2="2020-05-15T16:40";
		LocalDateTime parse2 = LocalDateTime.parse(date2);
		System.out.println(parse2);


		//Question->What is the purpose of the Instant class?
		//Instant: Represents a point in time on the time line in UTC.
		Instant instant = Instant.now();//Gives in nanoisec time from 1 jan 1970 i.e Epoc Time
		System.out.println("instant Time="+instant);



		//Duration: Represents a duration of time between two instants.

		//Duration used to get time in  Hr,Min & Sec
		Instant start = Instant.now();
		int sum=0;
		for(int i=0;i<1000000;i++)
		{
			sum=sum+i;
		}
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println("Duration Between start and End= "+duration);



		//Question->How do you calculate the difference between two dates?
		//Period: Represents a period of time between two dates.
		//Period Used to get time in Day,Month& Year
		Period period = Period.between(LocalDate.now(), LocalDate.of(1989, 8, 26));
		System.out.println("Your Age="+period);



		//Formatting and Parsing: Format date and time objects into strings and parse strings into date and time objects.
		//Converting YYYY-mm-dd to "dd/MM/yyyy" i.e in string
		//Question->How do you format a LocalDateTime object into a string?
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		DateTimeFormatter patteren = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String format = localDate.format(patteren);
		System.out.println("Giving Date In dd/MM/yyyy format="+format);

		//Example2 Converting our Pattern("dd/MM/yyyy") to dd-MM-yy
		//Question->How do you parse a string into a LocalDateTime object?
		String date4="25/12/2025";
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(LocalDate.parse(date4, pattern));


		//Question->How do you convert a LocalDate, LocalTime, or LocalDateTime object to a legacy java.util.Date object?
		//Use the from method:
		Date legacyDate = Date.from(instant);
		System.out.println(legacyDate);



	}

}
