package com.interview.strings;

public class ImmutableStringExample {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = s1;  // we can not reassign s2 to it again 
		s1 = s1 + "World";
		System.out.println("s1 = "+s1); // we can concat
		System.out.println("s2 = "+s2);  // Hello o/p it is immutable
		
		
		String s = "Test";
        System.out.println("Before: " + s.hashCode());
        s = s.concat("123");
        System.out.println("After: " + s.hashCode());

	}

}
