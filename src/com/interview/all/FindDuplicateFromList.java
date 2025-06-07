package com.interview.all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
/*Write a java function which will accept the below input as a parameter and returns the below output.
Input : {"Banana", "Apple", "Kivi", "Banana", "Mango", "Kivi", "Orange"}
Output : {"Banana", "Kivi"}
Note: Input and Output both should be the list of strings.
*/
public class FindDuplicateFromList {

	public static List<String> findDuplicates(List<String> inputList) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new LinkedHashSet<>();

        for (String item : inputList) {
            if (!seen.add(item)) {
                duplicates.add(item); // Already seen → it's a duplicate
            }
        }

        return new ArrayList<>(duplicates); // Convert to List
    }

	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Banana", "Apple", "Kivi", "Banana", "Mango", "Kivi", "Orange");
		
		List<String> duplicates = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(entry->entry.getValue()>1) // filter duplicates
				.map(Map.Entry::getKey) // get only the key (String)
				.collect(Collectors.toList()); 
		
		System.out.println("duplicates : "+duplicates);
		
		
		List<String> output = findDuplicates(list);
        System.out.println(output); // Output: [Banana, Kivi]

	}

}
