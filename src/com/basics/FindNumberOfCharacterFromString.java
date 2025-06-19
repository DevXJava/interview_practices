package com.basics;

import java.util.Arrays;

public class FindNumberOfCharacterFromString {

	public static void main(String[] args) {
		String sentence = "Java 8 stream API is powerful";
		
		Long countNumberOfWords = Arrays.stream(sentence.split(" ")).count();
		System.out.println("countNumberOfWords : "+countNumberOfWords);

	}

}
