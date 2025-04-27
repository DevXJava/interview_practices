package com.interview.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringPrefixFilter {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","jacala","apple","action","jacob");
		
		List<String> str = list.stream().filter(a->a.startsWith("j")).collect(Collectors.toList());
		
		System.out.println(str);

	}

}
