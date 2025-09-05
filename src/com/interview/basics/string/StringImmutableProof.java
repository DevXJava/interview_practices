package com.interview.basics.string;

public class StringImmutableProof {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = s1;
		s1 = s1.concat("world");
		System.out.println("s1 = " + s1); // hello world
        System.out.println("s2 = " + s2); // hello

	}

}
