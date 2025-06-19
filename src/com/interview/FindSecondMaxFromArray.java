package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondMaxFromArray {

	public static void main(String[] args) {
		int[] arr = {5,2,8,10,23,3, 14};
		
		List<Integer> integers = Arrays.stream(arr).mapToObj(Integer::valueOf).collect(Collectors.toList());
		
		Integer secondMax = integers.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().orElse(0);
		System.out.println("secondMax : "+secondMax);

	}

}
