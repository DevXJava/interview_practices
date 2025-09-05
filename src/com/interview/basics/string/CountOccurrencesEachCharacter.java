package com.interview.basics.string;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrencesEachCharacter {

	public static void main(String[] args) {
		String string ="devendra";
		List<Character> list = string.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		Map<Character,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    map.forEach((k,v)->System.out.println("char : "+k+" occurance : "+v));
				

	}

}
