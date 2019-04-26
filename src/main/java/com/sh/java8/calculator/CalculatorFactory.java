package com.sh.java8.calculator;

public abstract class CalculatorFactory {

	public static Calculator getInstance() {
		return new BasicCalculator();
	}
}