package com.sh.java8.foreach;

import java.util.stream.IntStream;

public class Producer {
	public static void main(String... args) {

		IntStream.range(1, 100).forEach(Consumer::multiplyByFive);

	}

}