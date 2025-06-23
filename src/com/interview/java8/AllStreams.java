package com.interview.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllStreams {

	public static void main(String[] args) {
		//1. count frequency
		List<String> list = Arrays.asList("banana","apple","orange","apple");
		// LinkedHashMap for maintaining insertion order 
		//default hashmap doesn't maintain insertion order 
		Map<String, Long> freq = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println("freq :"+freq);
		//2. Divide Integer in two parts even and odd using partitioningBy method
		List<Integer> integers = Arrays.asList(1,4,3,6,5,8,9);
		Map<Boolean, List<Integer>> evenOdd = integers.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println("even : "+evenOdd.get(true));
		System.out.println("odd : "+evenOdd.get(false));
		//# use partitionBy for binary split like even/odd, active/inactive, valid/invalid also 
		
		//3. Group Integer by Range (0-10,11-20 etc)
		List<Integer> integers2 = Arrays.asList(5,8,15,18,25,28,35);
		Map<Integer, List<Integer>> rangeMap = integers2.stream()
				.collect(Collectors.groupingBy(n->n/10*10,LinkedHashMap::new,Collectors.toList()));
		System.out.println("rangeMap : "+rangeMap);
		
		
	}

}
