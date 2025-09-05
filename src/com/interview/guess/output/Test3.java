package com.interview.guess.output;

public class Test3 {

	public static void main(String[] args) {
		String s = new String("CDE");  // Line A
		String s2 = "CDE";             // Line B

		System.out.println(s == s2);   // Line C 
		// O/P : false 

	}

}
