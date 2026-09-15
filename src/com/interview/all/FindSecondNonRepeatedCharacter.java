package com.interview.all;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSecondNonRepeatedCharacter {

	public static void main(String[] args) {
		String string = "aaabccccdeeefffg";	
		
		Optional<Character> secondNonRepeatedCharacter = string.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				                   .entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).skip(1).findFirst();
		
		System.out.println("secondNonRepeatedCharacter : "+secondNonRepeatedCharacter.get());
		
		

	}

}
