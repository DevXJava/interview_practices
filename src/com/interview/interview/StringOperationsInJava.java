package com.interview.interview;

import java.util.stream.IntStream;

public class StringOperationsInJava {

	 
	
	public static void main(String[] args) {
		
		String  str = "  HeLlo this is devendra rahangdale  ";
		
		String subStr = str.substring(1, 3); // its will skip first string and print 2 and 3 
		System.out.println("sub string is "+subStr);
		System.out.println("---------------------------");
		
		char charAt = str.charAt(2); // it will work with index its returning 0th index of 
		System.out.println("charAt is:  "+charAt);
		System.out.println("---------------------------");
		
		IntStream chars = str.chars();
		System.out.println("chars is: "+chars.count());
		System.out.println("----------------------------");
		
		String[] split = str.split(" "); // it will remove space and split string
		for (String string : split) {
			System.out.println("splited string is: "+string);
		}
		System.out.println("---------------------------");
		String splitInd[] = str.split(" ", 10);
		for (String string : splitInd) {
			System.out.println("splited Ind string is: "+string);
		}
		System.out.println("---------------------------");
		String trim = str.trim(); // it will remove first and last space of sentence 
		System.out.println("trim: "+trim);	

	}

}
