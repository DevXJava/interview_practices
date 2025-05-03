package com.interview.all;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoArrayJava8 {

	public static void main(String[] args) {
		
		// merge 2 Array in Single Array 
		Integer[] a = {1,2,3,4};
		Integer[] b = {5,6,7,8,1,1,8,8,8};
		Integer[] merged = Stream.concat(Arrays.stream(a), Arrays.stream(b)).toArray(Integer[]::new);
		
		List<Integer> list = Arrays.asList(merged);
		
		// Find the most frequent digit
        Optional<Integer> mostFrequent = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey);

        mostFrequent.ifPresent(digit -> 
            System.out.println("Most frequent digit: " + digit));
		
        
     // Find the most frequent digit and its count
        Optional<Map.Entry<Integer, Long>> mostFrequentEntry = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .max(Map.Entry.comparingByValue());

        mostFrequentEntry.ifPresent(entry -> 
            System.out.println("Most frequent digit: " + entry.getKey() + " (occurrences: " + entry.getValue() + ")"));
		
		
				                          

	}

}
