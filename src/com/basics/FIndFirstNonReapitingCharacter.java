package com.basics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FIndFirstNonReapitingCharacter {

	public static void main(String[] args) {
		String string ="hello";
		
		 // Use a LinkedHashMap to maintain insertion order of characters
        // and store their counts.
		Optional<Character> firstNonReapingChar = string.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst();
		
		
		
		if(firstNonReapingChar.isPresent()) {
			Character character = firstNonReapingChar.get();
			System.out.println("firstNonReapingChar : "+character);
		}

	}
	

}
