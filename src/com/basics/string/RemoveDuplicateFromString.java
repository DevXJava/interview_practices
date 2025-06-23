package com.basics.string;

import java.util.stream.Collectors;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String string = "devendra";
		
		String uniqueString = string.chars().mapToObj(c->(char)c).distinct().map(String::valueOf).collect(Collectors.joining());
		System.out.println("uniqueString is :"+uniqueString);
		

	}

}
