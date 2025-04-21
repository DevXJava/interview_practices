package com.interview.strings;

public class ReverseEachWordOfAString {
	
	
	public static void reverseEachWordOfString(String string) {
		String[] words = string.split(" ");
		String reverseString = "";
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String reverseWord = "";
			for(int j=word.length()-1; j>=0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println(reverseString);
	}

	public static void main(String[] args) {
		
		ReverseEachWordOfAString.reverseEachWordOfString("Java Concept Of The Day!");
		
	}

}
