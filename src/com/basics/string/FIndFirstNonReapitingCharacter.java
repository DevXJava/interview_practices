package com.basics.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FIndFirstNonReapitingCharacter {
	
	public static void fIndFirstNonReapitingCharacter(String string) {
		char c ='\0';
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char ch : string.toLowerCase().toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				c = entry.getKey();
				System.out.println("first non reapeted character : "+c);
				return;
			}
		}
		
	}

	public static void main(String[] args) {
		String string ="hhello";
		
		 // Use a LinkedHashMap to maintain insertion order of characters
        // and store their counts.
		Optional<Character> firstNonReapingChar = string.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst();
		
		
		
		if(firstNonReapingChar.isPresent()) {
			Character character = firstNonReapingChar.get();
			System.out.println("firstNonReapingChar : "+character);
		}
		
		fIndFirstNonReapitingCharacter(string);

	}
	

}
