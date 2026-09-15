package com.interview.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindNearestNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 }; 
		int target = 7;
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		
		Integer nearest = list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).findFirst().get();
		System.out.println("nearest is : "+nearest);
				

	}

}
