package com.interview.javaconceptoftheday;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExample {

	public static void main(String[] args) {
		//1. pipe line operation
		IntStream.of(new int[] {4, 7, 1, 8, 3, 9, 7}).filter(i->i>5).distinct().forEach(System.out::println);

		//2. Parallel Execution 
		List<String> names = new ArrayList<String>();
		names.add("David");
		names.add("David");
		names.add("Johnson");      
		names.add("Samontika");      
		names.add("Brijesh");     
		names.add("John"); 
		names.add("John"); 
		//names.stream().filter((String s)->s.length()>5).skip(2).forEach(System.out::println);
		//names.parallelStream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);
		//names.stream().limit(2).forEach(System.out::println);
		//names.stream().distinct().forEach(System.out::println);
		names.stream().skip(2).forEach(System.out::println);

	}

}
