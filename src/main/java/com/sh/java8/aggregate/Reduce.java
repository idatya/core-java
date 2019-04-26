package com.sh.java8.aggregate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Reduce {
	public static void main(String[] args) {
		List<Integer> primes = Arrays.asList(2, 3);
		Integer totalAgeReduce = primes.stream().map(x -> x).reduce(1, (a, b) -> a * b); // The identity element is both
																							// the initial value of the
																							// reduction and the default
																							// result if there are no
																							// elements in the stream.
		System.out.println(totalAgeReduce);

		List<Person> roster = new ArrayList<Person>() {
			{
				add(new Person("aditya", LocalDate.now().minusYears(35), Person.Sex.MALE, ""));
				add(new Person("sudha", LocalDate.now().minusYears(30), Person.Sex.FEMALE, ""));
				add(new Person("samar", LocalDate.now().minusYears(1), Person.Sex.MALE, ""));
			}
		};
		Map<Person.Sex, List<Person>> byGender = roster.stream().collect(Collectors.groupingBy(Person::getGender));

		long maleCount = byGender.get(Person.Sex.MALE).stream().map(x -> x.getName()).peek(s -> System.out.println(s))
				.count();
		long femaleCount = byGender.get(Person.Sex.FEMALE).stream().map(x -> x.getName())
				.peek(s -> System.out.println(s)).count();
		System.out.println(maleCount);
		System.out.println(femaleCount);

	}

}
