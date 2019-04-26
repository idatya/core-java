package com.sh.java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class IntSummaryStatisticsDemo {
	public static void main(String[] args) {
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(stats);
		
		List<Integer> list = Arrays.asList(1,2,3);
		int sum = list.stream().map(x -> x * x).reduce((x, y) -> x + y).get();
	    System.out.println("sum of squares: " + sum);
	    
	    sum = list.stream().mapToInt(x -> x * x).sum();
	    System.out.println("sum of squares: " + sum);
	    
	    sum = list.stream().mapToInt(x -> x).map(x -> x * x).sum();
	    System.out.println("sum of squares: " + sum);
	    
	    sum = list.stream().collect(Collectors.summingInt(x -> x * x));
	    System.out.println("sum of squares: " + sum);
	}
}
