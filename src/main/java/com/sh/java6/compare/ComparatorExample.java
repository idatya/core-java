package com.sh.java6.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	int rollno;
	String name, address;

	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;

	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Used to print Student details in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

class Sortbyroll implements Comparator<Student> {
	// Used for sorting in ascending order of roll number
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}

class Sortbyname implements Comparator<Student> {
	// Used for sorting in ascending order of roll name
	public int compare(Student a, Student b) {
		return a.name.compareTo(b.name);
	}
}

public class ComparatorExample {
	public static void main(String[] args) {
		List<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "bbbb", "london"));
		ar.add(new Student(131, "aaaa", "nyc"));
		ar.add(new Student(121, "cccc", "jaipur"));

		System.out.println("Unsorted");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		/*
		 * Comparator<Student> byRollno = (Student s1, Student s2) -> s1.getRollno() -
		 * s2.getRollno();
		 */

		System.out.println("\nSorted by rollno");
		Collections.sort(ar, new Sortbyroll());
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		System.out.println("\nSorted by name");
		/*
		 * Collections.sort(ar, new Sortbyname()); for (int i = 0; i < ar.size(); i++)
		 * System.out.println(ar.get(i));
		 */
		Comparator<Student> byName = Comparator.comparing(Student::getName);
	}
}
