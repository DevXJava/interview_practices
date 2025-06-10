package com.interview.all;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTop3DigitFromList {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(2,1,5,8,1000,56,87,54,90,89,67,2000,400,98);
		
		List<Integer> top3Int = integers.stream().sorted(Comparator.naturalOrder()).limit(3).collect(Collectors.toList());
		
		top3Int.forEach(n->System.out.println(n));

	}

}
