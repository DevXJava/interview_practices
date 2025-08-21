package com.interview;

import java.util.List;

public class ShortStringInSequence {

	public static void main(String[] args) {
		String string = "devendra";
		List<Character> characters = string.chars().mapToObj(c->(char)c).toList();
		
		List<String> shorted = characters.stream().sorted().map(String::valueOf).toList();
		System.out.println("shorted string : "+ shorted);

	}

}
