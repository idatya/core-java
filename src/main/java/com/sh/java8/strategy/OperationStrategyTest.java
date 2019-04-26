package com.sh.java8.strategy;

public class OperationStrategyTest {

	public static void main(String[] args) {
		shouldAddTwoNumbers();
		shouldSubtractTwoNumbers();
		shouldMultiplyTwoNumbers();
		shouldDivideTwoNumbers();
		shouldDetermineMaximumOfTwoNumbers();
	}

	public static void shouldAddTwoNumbers() {
		System.out.println((Operation.ADD.compute(5d, 5d)));
	}

	public static void shouldSubtractTwoNumbers() {
		System.out.println(Operation.SUBTRACT.compute(10d, 5d));
	}

	public static void shouldMultiplyTwoNumbers() {
		System.out.println(Operation.MULTIPLY.compute(5d, 5d));
	}

	public static void shouldDivideTwoNumbers() {
		System.out.println(Operation.DIVIDE.compute(10d, 2d));
	}

	public static void shouldDetermineMaximumOfTwoNumbers() {
		System.out.println(Operation.MAX.compute(10d, 5d));
	}
}
