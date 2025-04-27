package com.academian;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FruitGrouping {

	public static void main(String[] args) {
		
		List<String> fruits =Arrays.asList("apple", "avocado" , "banana", "blue", "berry" , "cherry");
		// Group fruits by their starting letter
        Map<Character, List<String>> groupedFruits = fruits.stream()
                .collect(Collectors.groupingBy(fruit -> Character.toUpperCase(fruit.charAt(0))));

        // Format and print the result
        groupedFruits.forEach((letter, fruitList) -> {
            String fruitsString = String.join(", ", fruitList);
            System.out.println(letter + " = " + fruitsString);
        });
        
     // Group fruits by their starting letter
        Map<String,Integer> lengthFruits = fruits.stream()
                .collect(Collectors.toMap(fruit->fruit, String::length));
        
        Set<Entry<String, Integer>> entry = lengthFruits.entrySet();
        
        for(Entry<String, Integer> entry2:entry) {
        	System.out.println(entry2.getKey()+"   :  "+entry2.getValue());
        }
		
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3);
        int sum = numbers.stream().reduce(0, Integer::sum); 
        int min = numbers.stream().reduce(0, Integer::min); 
        int max = numbers.stream().reduce(0, Integer::max);
        
        System.out.println("sum : "+sum+" min : "+min+" max : "+max);

	}

}
