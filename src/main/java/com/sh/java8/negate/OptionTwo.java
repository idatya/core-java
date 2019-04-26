package com.sh.java8.negate;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionTwo {

	public static <T> Predicate<T> predicate(Predicate<T> predicate) {
		return predicate;
	}

	public static void main(String... args) {
		System.out.println(
				Stream.of("Cat", "", "Dog").filter(predicate(String::isEmpty).negate()).collect(Collectors.toList()));

	}
}
