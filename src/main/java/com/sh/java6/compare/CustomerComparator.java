package com.sh.java6.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;
/*
 * Unlike Comparable, Comparator is external to the element type we are comparing. 
 * It’s a separate class. We create multiple separate classes (that implement Comparator) to compare by different members.
 * A comparator object is capable of comparing two different objects. The class is not comparing its instances, but some other class’s instances.
 * The Comparator interface defines a compare(arg1, arg2) method with two arguments which represent compared objects and works similarly to the Comparable.compareTo() method.
 */
class Employee {

	// instance member variables
	String Name;
	int Age;

	// parameterized constructor
	public Employee(String Name, Integer Age) {
		this.Name = Name;
		this.Age = Age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer Age) {
		this.Age = Age;
	}

	// overriding toString() method
	@Override
	public String toString() {
		return "Customer{" + "Name=" + Name + ", Age=" + Age + '}';
	}

}

class CustomerSortingComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee customer1, Employee customer2) {

		// for comparison
		int NameCompare = customer1.getName().compareTo(customer2.getName());
		int AgeCompare = customer1.getAge().compareTo(customer2.getAge());

		// 2-level comparison using if-else block
		if (NameCompare == 0) {
			return ((AgeCompare == 0) ? NameCompare : AgeCompare);
		} else {
			return NameCompare;
		}
	}
}

class CustomerComparator {
	public static void main(String[] args) {

		// create ArrayList to store Employee
		List<Employee> al = new ArrayList<>();

		// create customer objects using constructor initialization
		Employee obj1 = new Employee("Ajay", 27);
		Employee obj2 = new Employee("Sneha", 23);
		Employee obj3 = new Employee("Simran", 37);
		Employee obj4 = new Employee("Ajay", 22);
		Employee obj5 = new Employee("Ajay", 29);
		Employee obj6 = new Employee("Sneha", 22);

		// add customer objects to ArrayList
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);

		// before Sorting arraylist: iterate using Iterator
		Iterator<Employee> custIterator = al.iterator();

		System.out.println("Before Sorting:\n");
		while (custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}

		// sorting using Collections.sort(al, comparator);
		Collections.sort(al, new CustomerSortingComparator());

		// after Sorting arraylist: iterate using enhanced for-loop
		System.out.println("\n\nAfter Sorting:\n");
		for (Employee customer : al) {
			System.out.println(customer);
		}
		
		
	}
}