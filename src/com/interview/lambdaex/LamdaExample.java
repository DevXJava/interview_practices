package com.interview.lambdaex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaExample {
	
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Devedra","Kumar","Rahangdale");
		List<String> filterName = list.stream().filter(name -> name.startsWith("D"))
				                       .map(name -> name.toUpperCase())
				                       .collect(Collectors.toList());
		System.out.println(filterName);
				                 
	}

}
