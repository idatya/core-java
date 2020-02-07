package com.sh.java8.predicate;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple("green", 120.0), new Apple("red", 110.0),
				new Apple("brown", 150.0), new Apple("green", 160.0), new Apple("red", 122.0));
		ApplePredicates.filterApples(apples, ApplePredicates.isWeightAbove150()).forEach(System.out::println);
		
		String ref = "";
		ref = "test";
		ref = "test2";
		System.out.println(ref);
	}

}
