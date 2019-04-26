package com.sh.java8.aggregate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class ParallelStream {
	public static void main(String[] args) {
		/*
		 * 
		 * A parallel stream has a much higher overhead compared to a sequential one.
		 * Coordinating the threads takes a significant amount of time. I would use
		 * sequential streams by default and only consider parallel ones if
		 * 
		 * I have a massive amount of items to process (or the processing of each item
		 * takes time and is parallelizable)
		 * 
		 * I have a performance problem in the first place
		 * 
		 * I don't already run the process in a multi-thread environment (for example:
		 * in a web container, if I already have many requests to process in parallel,
		 * adding an additional layer of parallelism inside each request could have more
		 * negative than positive effects)
		 */

		List<Person> roster = new ArrayList<Person>() {
			{
				add(new Person("aditya", LocalDate.now().minusYears(35), Person.Sex.MALE, ""));
				add(new Person("sudha", LocalDate.now().minusYears(30), Person.Sex.FEMALE, ""));
				add(new Person("samar", LocalDate.now().minusYears(1), Person.Sex.MALE, ""));
			}
		};
		ConcurrentMap<Person.Sex, List<Person>> byGenderByParallelStream = roster.parallelStream()
				.collect(Collectors.groupingByConcurrent(Person::getGender));

		long count = byGenderByParallelStream.get(Person.Sex.MALE).stream().map(x -> x.getName())
				.peek(s -> System.out.println(s)).count();
		long count2 = byGenderByParallelStream.get(Person.Sex.FEMALE).stream().map(x -> x.getName())
				.peek(s -> System.out.println(s)).count();
		System.out.println(count);
		System.out.println(count2);
	}
}
