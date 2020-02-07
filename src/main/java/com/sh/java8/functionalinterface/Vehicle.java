package com.sh.java8.functionalinterface;

//A functional interface has only one abstract method but it can have multiple default methods.

/*
 * 	1.Lambda Expressions vs. Anonymous Interface Implementations
	Even though lambda expressions are close to anonymous interface implementations, there are a few differences that are worth noting.

	The major difference is, that an anonymous interface implementation can have state (member variables) whereas a lambda expression cannot.
	A lambda expression cannot have such fields. A lambda expression is thus said to be stateless.
	
	2.Lambdas as Objects
	A Java lambda expression is essentially an object. You can assign a lambda expression to a variable and pass it around, like you do with any other object.
 */

/*
 * What is Lambda Expression?
	Lambda Expression is an anonymous function which accepts a set of input parameters and returns results.
	Lambda Expression is a block of code without any name, with or without parameters and with or without results. This block of code is executed on demand.
 * */

/*
 * What is Optional in Java 8? What is the use of Optional?Advantages of Java 8 Optional?
	Optional:
	Optional is a final Class introduced as part of Java SE 8. It is defined in java.util package.
	
	It is used to represent optional values that is either exist or not exist. It can contain either one value or zero value. If it contains a value, we can get it. Otherwise, we get nothing.
	
	It is a bounded collection that is it contains at most one element only. It is an alternative to “null” value.
	
	Main Advantage of Optional is:
	
	It is used to avoid null checks.
	It is used to avoid “NullPointerException”.		
 * */
public interface Vehicle {
	void drive();
	default public void fly() {
		System.out.println("I can fly now.");
	}
}
