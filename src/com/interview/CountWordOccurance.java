package com.interview;

import java.util.Arrays;
import java.util.List;

public class CountWordOccurance {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
		
		long count = strings.stream().flatMap(s->Arrays.stream(s.split(" ")))
		                .filter(a->a.equals("java")).count();
		System.out.println("Occurrences of \"" + "java" + "\": " + count);
	}

}
