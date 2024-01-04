package com.interview.volkasvegon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMostReapetedStringFormArray {

	public static void main(String[] args) {

		String[] str = { "pune", "pune", "pune", "mumbai", "mumbai", "indore" };
		List<String> list = Arrays.asList(str);
		Set<String> set = new HashSet<String>(list);
		for (String string : set) {
           
			System.out.println(string + "  " + Collections.frequency(list, string));

		}
		
		
	 	Stream.of(str)
	      .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Comparator.comparing(Entry::getValue))
	      .ifPresent(System.out::println);
	 	//======================================================
	 Optional<Entry<String, Long>>	maxStr = list.stream()
			 .collect(Collectors.groupingBy(s->s,Collectors.counting()))
	 	     .entrySet().stream().max(Comparator.comparing(Entry::getValue));
	 
	 System.out.println(maxStr.get().getValue());
	 
	 

	}

}
