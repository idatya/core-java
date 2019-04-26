package com.sh.java8.negate;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionOne {

	public static <R> Predicate<R> not(Predicate<R> predicate) {
		return predicate.negate();
	}

	public static void main(String... args) {
		System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7).filter(not(c -> c % 2 == 0)).collect(Collectors.toList()));

		System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7).filter(((Predicate<Integer>) c -> c % 2 == 0).negate())
				.collect(Collectors.toList()));
	}
}
