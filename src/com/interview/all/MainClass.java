package com.interview.all;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainClass {

	//First Approach
	public static void countOccurance() {
		int visited = -1;
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		int frequency[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					frequency[j] = visited;
				}
			}
			
			if(frequency[i]!=visited) 
				frequency[i] = count; 
		}

		for (int i = 0; i < frequency.length; i++) {
			if(frequency[i]!=visited)
				System.out.println(arr[i]+" | "+ frequency[i]);
		}
	
	}
	
	
	public static void main(String[] args) {
		//Second Approach 
		List<Integer> list = Arrays.asList(1,3,5,8,3,4,11,6,2,6,89,21,11,34,44,56,78,99,23);
		Map<Integer, Long> list_one = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		list_one.forEach((k,v)->{System.out.println(k+"  "+v);});
		
		// Third Approach write above in core java
		Set<Integer> set = new HashSet<Integer>(list);
		for(Integer ins :set) {
			System.out.println(ins+"   "+Collections.frequency(list,ins));
		}
		//find second max from list
		int secondLargest = list.stream().sorted(Comparator.reverseOrder())
				.limit(2).skip(1).findFirst().get();
		System.out.println("secondLargest number is :"+secondLargest);
		
		// can we declare abstract class as a final
		//can we in declare interface data member as private 
	    //how to search text on vim 
	   // difference between Query param  & Path Variable which one is optional 
		
		Map<Integer, Long> map = new HashMap<Integer, Long>();
		
		System.out.println(0.1*3 == 0.3);
		System.out.println(0.1*2 == 0.2);
		
		//write a program for represent heap & stack
	
		

	}

}
