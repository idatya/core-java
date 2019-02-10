package com.sh.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bohr", "Darwin", "Galilei", "Tesla", "Einstein", "Newton");
		//sort based on length
		list.sort((a, b) -> a.length() - b.length());
		System.out.println(list);
		list = Arrays.asList("Bohr", "Darwin", "Galilei", "Tesla", "Einstein", "Newton");
		System.out.println(list);
		list.sort(Comparator.comparing(n -> n.length())); 
		System.out.println(list);
		list = Arrays.asList("Bohr", "Darwin", "Galilei", "Tesla", "Einstein", "Newton");
		System.out.println(list);
		list.sort(Comparator.comparing(String::length));
	}

}
