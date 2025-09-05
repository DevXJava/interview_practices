package com.interview.javaconceptoftheday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaEightPrograms {

	public static void separateEevenOdd() {
		List<Integer> list = Arrays.asList(1, 9, 4, 2, 5, 6, 11, 8);

		List<Integer> integerEeven = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		List<Integer> integersOdd = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println("Even Numbers are :" + integerEeven + " Odd Numbers are :  " + integersOdd);
	}

	public static void frequencyOfEachCharacterOnString() {
      String string = "devendra";
      Map<Character, Long> map = string.chars().mapToObj(c->(char) c)
    		  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      map.forEach((chars,occurance)->System.out.println(chars+" : "+occurance));
	}
    public static void shortListInReverseOrder() {
    	List<Integer> list = Arrays.asList(1, 9, 4, 2, 5, 6, 11, 8);
    	List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    	System.out.println("list in reverse order "+list2);
    }
	public static void main(String[] args) {
		JavaEightPrograms.shortListInReverseOrder();

	}

}
