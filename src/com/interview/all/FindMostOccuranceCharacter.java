package com.interview.all;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMostOccuranceCharacter {

	public static void main(String[] args) {
		String str ="devendra";

		List<Character> strTOChar = str.chars().mapToObj(c->(char)c).collect(Collectors.toList());

		Optional<Entry<Character, Long>> mostOccuranceChar = strTOChar.stream().collect(Collectors.groupingBy(Character::charValue,Collectors.counting()))
		                                       .entrySet().stream().max(Map.Entry.comparingByValue());
		
		System.out.println(mostOccuranceChar);
		
		                                       
	}

}
