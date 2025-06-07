package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccuranceCount {

	public static void characterOccuranceCountUsingJava8() {
		String string = "devendra kumar rahangdale";
		List<String> list = Arrays.stream(string.split(" ")).collect(Collectors.toList());
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}
	public static void main(String[] args) {
		String string = "devendra kumar rahangdale";
		HashMap<Character, Integer> hashMap = new HashMap<>();
	    char[] toArrays = string.toCharArray();
	    for (char c : toArrays) {
	      if(hashMap.containsKey(c)) {
	    	  hashMap.put(c, hashMap.get(c)+1);
	      }else {
	    	  hashMap.put(c, 1);
	      }
		}
	    System.out.println("map is :"+hashMap);
				
	    CharacterOccuranceCount.characterOccuranceCountUsingJava8();
	}

}
