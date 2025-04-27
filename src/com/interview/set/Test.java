package com.interview.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		Set set = new HashSet<>();
		set.add("devendra");
		set.add("Kumar");
		set.add("rahangdale");
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String string = iterator.next();
			//System.out.println(string);
			
		}
		
		Set<String> set2 = new HashSet<>();
		set2.add("Dev");
		set2.add("Dev");
		System.out.println(set2);
		for(String str:set2) {
		
		}

	}

}
