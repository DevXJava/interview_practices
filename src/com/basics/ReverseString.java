package com.basics;

public class ReverseString {

	public static void main(String[] args) {
		//1. using java 7
		String string = "devendra";
		String reversed = new StringBuilder(string).reverse().toString();
		System.out.println("reversed string is :"+reversed);
		
		//2. using java 8
		String reverseUsingJava8 = string.chars().mapToObj(c->String.valueOf((char)c)).reduce("", (a,b)-> b+a);
		System.out.println("reverseUsingJava8 :"+reverseUsingJava8);

	}

}
