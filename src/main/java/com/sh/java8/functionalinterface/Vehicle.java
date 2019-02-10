package com.sh.java8.functionalinterface;

public interface Vehicle {
	void drive();

	default public void fly() {
		System.out.println("I can fly now.");
	}
}
