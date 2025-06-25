package com.interview.basic;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void removeDuplicateusingJava8() {
		String string = "java developer";
		
		List<Character> listChar = string.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		List<Character> afterDuplicateRemoving = listChar.stream().distinct().collect(Collectors.toList());
		System.out.println("after removing duplicates :"+afterDuplicateRemoving);
		
	}
	
	public static void removeDuplicatenonInbuiltMethod() {
		String string = "java developer";
		StringBuilder distinct = new StringBuilder();
		for(int i=0;i<string.length();i++) {
			char character = string.charAt(i);
			int count =0;
			for (int j = 0; j < string.length(); j++) {
				if(string.charAt(j)==character && (i!=j)) {
					count++;
					
				}
			}
			if(count==0) {
				distinct.append(character);	
			}
		}
		System.out.println("distinct is : "+distinct);
	}
	public static void main(String[] args) {
		RemoveDuplicate.removeDuplicatenonInbuiltMethod();

	}

}
