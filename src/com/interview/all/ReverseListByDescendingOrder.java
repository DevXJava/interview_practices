package com.interview.all;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseListByDescendingOrder {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> reversed = integers.stream()
		    .sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		//Another Way
		List<Integer> reversed2 = integers.stream().sorted(Comparator.comparing(Integer::intValue).reversed())
				.collect(Collectors.toList());
		   
		

	}

}
