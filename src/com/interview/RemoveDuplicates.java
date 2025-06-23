package com.interview;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,3,3,5,4,6);
		List<Integer> l= list.stream().distinct().collect(Collectors.toList());
		System.out.println(l);
		

	}

}
