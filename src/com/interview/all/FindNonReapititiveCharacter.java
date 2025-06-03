package com.interview.all;

import java.util.List;
import java.util.stream.Collectors;

public class FindNonReapititiveCharacter {

	public static void main(String[] args) {
		String str = "This is my string";
		
		List<Character> list = str.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		List<Character> nonReapitive = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(nonReapitive);

	}

}
