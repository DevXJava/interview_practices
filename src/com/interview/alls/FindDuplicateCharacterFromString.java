package com.interview;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindDuplicateCharacterFromString {

	public static void main(String[] args) {
		String string = "devendra kumrar";
		
		List<Character> characters = string.chars().mapToObj(ch->(char)ch).collect(Collectors.toList());
		
		Map<Character, Long> map = characters.stream().collect(Collectors.groupingBy(Character::charValue,Collectors.counting()))
				                      .entrySet().stream().filter(v->v.getValue()>1)
				                      .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		
		System.out.println(map);
		
		Optional<Entry<Character, Long>> max = characters.stream().collect(Collectors.groupingBy(Character::charValue,Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
               

	}

}
