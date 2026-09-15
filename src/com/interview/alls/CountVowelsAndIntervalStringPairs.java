package com.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class CountVowelsAndIntervalStringPairs {
	public static ArrayList<Integer> countVowels(ArrayList<String> strings, ArrayList<Integer> intervals) {
		ArrayList<Integer> result = new ArrayList<>();
		String vowels = "aeiouAEIOU";

		for (int i = 0; i < intervals.size(); i =i + 2) {
			int start = intervals.get(i);
			int end = intervals.get(i + 1);
			int count = 0;

			for (int j = start; j <= end && j < strings.size(); j++) {
				String str = strings.get(j);
				for (char c : str.toCharArray()) {
					if (vowels.indexOf(c) >= 0) {
						count++;
					}
				}
			}
			result.add(count);
		}

		return result;
	}

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date"));
		ArrayList<Integer> intervals = new ArrayList<>(Arrays.asList(0, 1, 2, 3));

		ArrayList<Integer> result = countVowels(strings, intervals);
		System.out.println("result is :"+result);
		// Output: [5, 3]
		// Explanation:
		// Interval [0,1] = "apple", "banana" → vowels = 2 + 3 = 5
		// Interval [2,3] = "cherry", "date" → vowels = 2 + 1 = 3

	}

}
