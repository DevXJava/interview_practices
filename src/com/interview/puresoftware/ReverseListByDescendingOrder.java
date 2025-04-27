package com.interview.puresoftware;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseListByDescendingOrder {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		list.stream()
		    .sorted(Collections.reverseOrder()) 
		    .forEach(System.out::println);

	}

}
