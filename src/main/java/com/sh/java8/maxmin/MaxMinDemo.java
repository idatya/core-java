package com.sh.java8.maxmin;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxMinDemo {
	public static void main(String[] args) {
		dateDemo();
		numberDemo();
		charStringDemo();
		objectDemo();
	}

	private static void objectDemo() {
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(1, "Lokesh", 36));
		employees.add(new Employee(2, "Alex", 46));
		employees.add(new Employee(3, "Brian", 52));

		Comparator<Employee> comparator = Comparator.comparing(Employee::getAge);

		// Get Min or Max Object
		Employee minObject = employees.stream().min(comparator).get();
		Employee maxObject = employees.stream().max(comparator).get();

		System.out.println("minObject = " + minObject);
		System.out.println("maxObject = " + maxObject);
	}

	private static void charStringDemo() {
		String maxChar = Stream.of("H", "T", "D", "I", "J").max(Comparator.comparing(String::valueOf)).get();

		String minChar = Stream.of("H", "T", "D", "I", "J").min(Comparator.comparing(String::valueOf)).get();

		System.out.println("maxChar = " + maxChar);
		System.out.println("minChar = " + minChar);
	}

	private static void numberDemo() {
		Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();

		Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(Comparator.comparing(Integer::valueOf)).get();

		System.out.println("maxNumber = " + maxNumber);
		System.out.println("minNumber = " + minNumber);
	}

	private static void dateDemo() {
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.now().plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());

		// Create stream of dates
		List<LocalDate> dates = Stream.iterate(start, date -> date.plusDays(1))
				.limit(ChronoUnit.DAYS.between(start, end)).collect(Collectors.toList());

		// Get Min or Max Date
		LocalDate maxDate = dates.stream().max(Comparator.comparing(LocalDate::toEpochDay)).get();

		LocalDate minDate = dates.stream().min(Comparator.comparing(LocalDate::toEpochDay)).get();

		System.out.println("maxDate = " + maxDate);
		System.out.println("minDate = " + minDate);
	}
}

class Employee {
	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder str = null;
		str = new StringBuilder();
		str.append("Id:- " + getId() + " Name:- " + getName() + " Age:- " + getAge());
		return str.toString();
	}
}
