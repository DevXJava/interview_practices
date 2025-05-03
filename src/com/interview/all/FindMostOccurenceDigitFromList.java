package com.interview.all;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostOccurenceDigitFromList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(111,1,1,2,2,3,3,4,4,4,4,5);
		// Find the most frequent digit and its count
        Optional<Map.Entry<Integer, Long>> mostFrequentEntry = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .max(Map.Entry.comparingByValue());

        mostFrequentEntry.ifPresent(entry -> 
            System.out.println("Most frequent digit: " + entry.getKey() + " (occurrences: " + entry.getValue() + ")"));
        
        
        //Max occurrence characters 
        String string = "devendraaa";
        List<Character> characters = string.chars().mapToObj(c->(char) c).collect(Collectors.toList());
        
        Optional<Map.Entry<Character, Long>> maxOccurCharacters = characters.stream()
        		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        		.entrySet().stream().max(Map.Entry.comparingByValue());
        
        System.out.println("maxOccurCharacters : "+maxOccurCharacters);
        
      //Max occurrence word
        String string2 = "dev dev kumar java,";
        
        Optional<Map.Entry<String, Long>> maxOccuWord = Arrays.stream(string2.split(" "))
        		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        		.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println("max occur word "+maxOccuWord);
        
        
		

	}

}
