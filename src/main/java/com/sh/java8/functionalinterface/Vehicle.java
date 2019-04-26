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
public interface Vehicle {
	void drive();
	default public void fly() {
		System.out.println("I can fly now.");
	}
}
