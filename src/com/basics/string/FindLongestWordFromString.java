package com.basics.string;

import java.util.Arrays;

public class FindLongestWordFromString {

	public static void main(String[] args) {
		String sentence = "Java 8 stream API is powerful";
		
		String longestWord = Arrays.stream(sentence.split("\\s+")).max((s1,s2)->Integer.compare(s1.length(), s2.length())).orElse("");
		
		System.out.println("longestWord : "+longestWord);
	}

}
