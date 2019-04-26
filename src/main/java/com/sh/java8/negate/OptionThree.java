package com.sh.java8.negate;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionThree {
	public static void main(String... args) {

		System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7).filter((c -> c % 2 != 0)).collect(Collectors.toList()));
		System.out.println(Stream.of("Cat", "", "Dog").filter(str -> !str.isEmpty()).collect(Collectors.toList()));
	}
}
