package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOcuuranceCounting {

	public static void main(String[] args) {
		 List<String> list = Arrays.asList("Jon", "Ajeet", "Steve","Ajeet", "Jon", "Ajeet");
		 
		 Map<String, Long> map=list.stream()
				 .collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));
		 map.forEach((k,v)->{System.out.println(k+" = "+v);});

	}

}
