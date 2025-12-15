package com.interview.all;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {

		String str = "devendraa";
		Set<Character> hasSet = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			hasSet.add(str.charAt(i));
		}

		for (Character c : hasSet) {

			System.out.print(c);

		}
		
		//Remove duplicate character using java 8?
		
		List<Character> characters = str.chars().mapToObj(c->(char)c).toList();
		List<Character> uniqueChar = characters.stream().distinct().toList();

		// Checking normal occurrence
		HashMap<Character, Integer> charCount = new HashMap<>();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (charCount.containsKey(str.charAt(i))) {
				int count_1 = charCount.get(str.charAt(i));
				// System.out.println(count);
				charCount.put(str.charAt(i), ++count_1);
			} else {
				charCount.put(str.charAt(i), 1);
			}
		}
		System.out.println(charCount);

	}

}
