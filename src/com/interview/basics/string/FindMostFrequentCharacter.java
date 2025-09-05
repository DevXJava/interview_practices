package com.interview.basics.string;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMostFrequentCharacter {

	public static void main(String[] args) {
		String string = "devendra";
		
		List<Character> characters = string.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		Optional<Entry<Character, Long>> map = characters.stream().collect(Collectors.groupingBy(Character::charValue,Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue());
		System.out.println(map);
	}

}
