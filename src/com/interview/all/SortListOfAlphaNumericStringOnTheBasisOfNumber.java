package com.interview.all;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListOfAlphaNumericStringOnTheBasisOfNumber {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("manish-2");
		list.add("mayank-6");
		list.add("ajay-7");
		list.add("trisha-1");
		list.add("shubh-4");
		list.add("mark-3");
		list.add("vinay-5");
		list.add("veer-1");
		// Sort list alphabetically by name part, and numerically by number part
        Collections.sort(list, Comparator.comparing((String s) -> s.split("-")[0].toLowerCase())
                                         .thenComparingInt(s -> Integer.parseInt(s.split("-")[1])));

        // Print sorted list
        list.forEach(System.out::println);
		

	}

}
