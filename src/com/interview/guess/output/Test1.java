package com.interview.guess.output;

public class Test1 {

	public static void main(String[] args) {
		String s1 = "ABC";      // s1 refers to the string "ABC"
		String s2 = s1;         // s2 also refers to "ABC" (same object in memory)
		s1 = null;              // s1 now points to null, s2 still points to "ABC"

		System.out.println(s1);  // SOP(s1)
		System.out.println(s2);  // SOP(s2)


	}

}
