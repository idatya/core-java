package com.sh.java8.functionalinterface;

//@FunctionalInterface annotation is used to ensure an interface can’t have more than one abstract method. The use of this annotation is optional.

/*
 * 
 *	lambda operator -> body
	where lambda operator can be:

		Zero parameter:
		() -> System.out.println("Zero parameter lambda");
		
		One parameter:–
		(p) -> System.out.println("One parameter: " + p);
		It is not mandatory to use parentheses, if the type of that variable can be inferred from the context

		Multiple parameters :
		(p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);
		
		===========================================================================
		interface Foo { boolean equals(Object obj); }
		// Not functional because equals is already an implicit member (Object class)

		interface Comparator<T> {
 			boolean equals(Object obj);
 			int compare(T o1, T o2);
		}
		// Functional because Comparator has only one abstract non-Object method
		===========================================================================
 */

@FunctionalInterface
interface Square {
	int calculate(int x);
}

public class FunctionalInterfaceAnnonation {
	public static void main(String args[]) {
		int a = 5;

		// lambda expression to define the calculate method
		Square s = (int x) -> x * x;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);
	}
}
