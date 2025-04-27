package com.nisum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	
	public static void main(String[] args) {
		
		// Q. Find non repetitive character using java 8?
		String string = "devendra";
		char[] ch = string.toCharArray();
		List<Character> listch = new ArrayList<>();
		for(Character character:ch) {
			listch.add(character);
			
		}
		
		//Convert String to Character using java 8
		List<Character> charactersFromString = string.chars().mapToObj(c ->(char) c).collect(Collectors.toList());
		
		List<Character> listNonre = listch.stream().distinct().collect(Collectors.toList());
		listNonre.forEach(System.out::println);
		System.out.println("------------------------------------------------------------");
		// Q. Count Each Character occurrence using java 8?
		char[] characters = string.toCharArray();
		List<Character> list = new ArrayList<>();
		for(Character character : characters) {
			list.add(character);
		}
		
		Map<Character, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		map.forEach((k,v)->{
			System.out.println(k+ " : "+v);
		});
		

	}

}
