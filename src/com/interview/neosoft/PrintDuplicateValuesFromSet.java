package com.interview.neosoft;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateValuesFromSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("A");
		set.add("A");
		set.add("C");
		set.add("B");
		
		//using normal java
		
		for(String string : set) {
			if(set.add(string)==false) {
				System.out.println("duplicates is : "+string);
			}
		}

		//List<String> list = set.stream().filter(s->!s.add(s)).collect(Collectors.toList()); 

	}

}
