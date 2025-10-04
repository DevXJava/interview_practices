package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArrayAndFindMaxOccurrenceStream {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 2, 5};
        int[] arr2 = {2, 5, 2, 3, 3};
        
        //step 1: merge arrays into a stream 
        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
        Optional<Entry<Integer, Long>> map = Arrays.stream(merged).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        		.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));
        
        System.out.println("map is : "+map);
	}

}
