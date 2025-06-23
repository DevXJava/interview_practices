package com.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintOnlyDuplicateValuesUsingJavaEight {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,1,2,3,4,5,5,6,7,7);
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> duplicatelist = list.stream().filter(printDuplicates->!set.add(printDuplicates)).collect(Collectors.toList());

		for(Integer integer:duplicatelist) {
			System.out.println(integer);
		}
	}

}
