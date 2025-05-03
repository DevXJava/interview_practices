package com.interview.all;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountCharacterSequencialy {

	public static void main(String[] args) {
		String str = "ddeevendrad";
		int count;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				i++;
				count++;
			}
			System.out.println(+count + "" + str.charAt(i) + " ");
		}
		
		//counting word occurrence 
		List<String> list = Arrays.asList("Deve5","Deve4","Deve2","Deve1","Deve1");
		Set<String> set = new HashSet<String>(list);
		for (String string : set) {
			System.out.println(string+"  "+Collections.frequency(list, string));
		
		}
	
	}

}
