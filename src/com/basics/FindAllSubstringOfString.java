package com.basics;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubstringOfString {

	public static void main(String[] args) {
		String input = "abc";
		List<String> substrings = new ArrayList<>();

		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				substrings.add(input.substring(i, j));
			}
		}

		// Print all substrings
		System.out.println("All Substrings:");
		substrings.forEach(System.out::println);

	}

}
