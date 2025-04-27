package com.interview.java.eight;

import java.util.Arrays;
import java.util.List;

public class SequencialyCountCharatersAndMostOccurance {

	public static void main(String[] args) {

		// Input: VVVVVTTTTKKKVV Output: 5V4T3K2V
		String str = "VVVVVTTTTKKKVV";
		int[] freq = new int[str.length()];
		char maxChar = str.charAt(0);
		int j, max;
		char string[] = str.toCharArray();
		int count;

		for (int i = 0; i < str.length(); i++) {
			count = 1;
			while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				i++;
				count++;
			}
			System.out.print(+count + "" + str.charAt(i) + " ");
		}

		// Determine minimum and maximum occurring characters
		max = freq[0];
		for (j = 0; j < freq.length; j++) {

			// If max is less than frequency of a character
			// then, store frequency in max and corresponding character in maxChar
			if (max < freq[j]) {
				max = freq[j];
				maxChar = string[j];
			}
		}
		System.out.println("Maximum occurring character: " + maxChar);

	}

}
