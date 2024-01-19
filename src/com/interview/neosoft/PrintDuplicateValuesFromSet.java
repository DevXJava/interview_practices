package com.interview.neosoft;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateValuesFromSet {

	public static void main(String[] args) {
		Set<String> stringSet = new HashSet<>();
        stringSet.add("apple");
        stringSet.add("orange");
        stringSet.add("banana");
        stringSet.add("apple");
        stringSet.add("grape");
        stringSet.add("banana");

        System.out.println("Original Set: " + stringSet);
        
        
        Set<String> uniqueSet = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String element : stringSet) {
            if (!uniqueSet.add(element)) {
                // If not added to uniqueSet, it's a duplicate
                duplicates.add(element);
            }
        }

        System.out.println("Duplicate Values: " + duplicates);

//        Set<String> duplicates = stringSet.stream()
//                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() > 2)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toSet());
//
//        System.out.println("Duplicate Values: " + duplicates);

	}

}
