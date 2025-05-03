package com.interview.all;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestMphasis {

	public static void main(String[] args) {
		
		String str = "Bangalore Bangalore Pune Mumbai Delhi Noida Pune Pune";
		
		String[] strArray = str.split(" ");
		List<String> list = Arrays.asList(strArray);
		//List<String> list = Arrays.asList("Bangalore", "Bangalore", "Pune", "Mumbai", "Delhi", "Noida", "Pune", "Pune");
		Set<String> st = new HashSet<String>(list);
		// here set we are using for only print the unique character
		for (String s : st)
			System.out.println(s + ": " + Collections.frequency(list, s));

	}

}
