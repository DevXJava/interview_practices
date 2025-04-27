package com.interview.josh;

import java.util.*;
import java.util.stream.Collectors;

public class CountWordOccuranceNormally {

	public static void main(String[] args) {
		String str = "devendra";
		Map<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
		result.forEach((k,v)->{System.out.println(k+"  "+v);});

		// HashMap char as a key and occurrence as a value
		HashMap<Character, Integer> charCount = new HashMap<>();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (charCount.containsKey(str.charAt(i))) {
				int count = charCount.get(str.charAt(i));
				//System.out.println(count);
				charCount.put(str.charAt(i), ++count);
			} else {
				charCount.put(str.charAt(i), 1);
			}
		}
		System.out.println(charCount);

	}

}
