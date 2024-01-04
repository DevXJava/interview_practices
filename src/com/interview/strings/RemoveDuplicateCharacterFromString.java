package com.interview.strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		String str="devendra";
	    LinkedHashSet<Character> hashSet = new LinkedHashSet<Character>();
	    for (int i = 0; i < str.length(); i++) {
			hashSet.add(str.charAt(i));
		}
	    for (Character character : hashSet) {
	    	System.out.print(" : "+character);
			
		}
	    System.out.println("==========================");
	    String orignalString = "devendra";
		StringBuilder builder = new StringBuilder();
		Set<Character> set2 = new HashSet<Character>();
		char[] chars = orignalString.toCharArray();
		for (char ch : chars) {
			if (set2.add(ch)) {
				builder.append(ch);
			}
		}
		System.out.println("Original String : " + orignalString);
		System.out.println("After removing the duplicates : " + builder.toString());
	}

}
