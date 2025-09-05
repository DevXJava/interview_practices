package com.interview.basics.string;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagrams {

	public static void main(String[] args) {
		String string = "silent";
		String string2 = "listen";
		
		//1. converting to arrays
		char[] ch = string.toCharArray();
		char[] ch1 = string2.toCharArray();
		
		//2.Sorting arrays 
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		//3.checking both are equals are not!
		if(Arrays.equals(ch, ch1)) {
			System.out.println("strings are Anagrams !!!");
		}else {
			System.out.println("Not Anagrams !!!");
		}
		
		// using Java 8

	}

}
