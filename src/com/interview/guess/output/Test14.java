package com.interview.guess.output;

import java.util.stream.IntStream;

public class Test14 {

	public static void main(String[] args) {
		IntStream.range(1, 5).map(i -> i * i).peek(System.out::println).count(); //1,4,9,16

	}

}
