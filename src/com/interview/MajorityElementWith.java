package com.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MajorityElementWith {

	public static void main(String[] args) {
		int[] arr = {2, 3, 1, 2, 6, 2, 7, 2, 2};
		
		Map<Integer, Long> map = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()>arr.length/2)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println("map is : "+map);
		
		Optional<Integer> majority = map.entrySet().stream().filter(e->e.getValue()>arr.length/2)
				.map(Map.Entry::getKey).findFirst();
		
		Integer values = majority.get();
		System.out.println(values);

	}

}
