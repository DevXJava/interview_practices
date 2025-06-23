package com.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamJavaEightPractice {

	public static void main(String[] args) {
		//printing number of occurrence 
		List<Integer> numList = Arrays.asList(2,13,4,4,2,3,5,6,1,1);
		Map<Integer, Long> map = numList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		map.forEach((key,value)->{
			System.out.println("ocuurance: "+key+"   "+value);
		});
		System.out.println("Start with 1-----------------------------");
		
		
		//printing number start with 1
		numList.stream().map(a->a+"") //converting Integer to String
		.filter(a->a.startsWith("1"))
		.forEach(System.out::println);
		
		System.out.println("printing duplicate values-----------------------------");
		
		//printing duplicate values from list
		Set<Integer> set = new HashSet<Integer>();
		numList.stream().filter(n->!set.add(n))
		.forEach(System.out::println);

		System.out.println("Eeven Values-----------------------------");
		//even numbers
		numList.stream().filter(n->n%2==0).forEach(System.out::println);
		
		System.out.println("Odd values -----------------------------");
		numList.stream().filter(n->n%2!=0).forEach(System.out::println);
		
		System.out.println("Getting distict values --------------------------");
		List<String> names =Arrays.asList("Apple","Apple","orange","banana","Kiwi","banana");
		System.out.println(names);
		List<String> list = names.stream().distinct().collect(Collectors.toList());
		System.out.println("distict name is :"+list);
		
		System.out.println("===============remove duplicate character of string================== ");
		String orignalString = "devendra";

		StringBuilder builder = new StringBuilder();
		Set<Character> set2 = new HashSet<Character>();
		char[] chars = orignalString.toCharArray();
		for (char ch : chars) {
			if (set2.add(ch)) {
				builder.append(ch);
			}
		}
		System.out.println("Original String : " + orignalString);
		System.out.println("After removing the duplicates : " + builder.toString());
		
		try {
			
		} catch (Throwable e) {
			
		}
		
		System.out.println("calculating average ========================");
		numList.stream().mapToInt(i->i).average().ifPresent(avg->System.out.println("average is "+avg));
		
	}

}
