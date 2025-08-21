package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllInterviewsPrograms {

	public static void occuranceOfArrayElement() {
		List<String> list = Arrays.asList("Deven", "Kumar", "Deven", "Rahangdale");
		Set<String> set = new HashSet<String>(list);
		for (String string : set) {
			System.out.println(string + "   " + Collections.frequency(list, string));
		}
	}

	public static void countCharacterSequencialy() {
		String str = "VVTTVVVTTTUUU";
		int count;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				i++;
				count++;
			}
			System.out.println(str.charAt(i) + "   " + count);
		}
	}

	public static void printDigitOcuuranceUsingJavaEight() {
		List<Integer> list = Arrays.asList(1, 1, 3, 4, 4, 2, 2, 1);
		Map<Integer, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.forEach((key, value) -> System.out.println(key + "  " + value));
	}

	public static void findDuplicateFromArrayList() {
		List<Integer> list = Arrays.asList(1, 1, 4, 5, 5, 6, 6, 8, 9);
		Set<Integer> integers = new HashSet<>();
		Set<Integer> set = list.stream().filter(n -> !integers.add(n)).collect(Collectors.toSet());
		set.forEach((v) -> System.out.println(v));
	}

	public static void findStartWith1() {
		List<Integer> list = Arrays.asList(12, 13, 4, 5, 5, 6, 16, 8, 9);
		List<Integer> l = list.stream().filter(item -> String.valueOf(item).startsWith("1"))
				.collect(Collectors.toList());
		l.forEach((v) -> System.out.println(v));
	}

	public static void shortArrayList() {
		List<String> list = Arrays.asList("java", "sql", "Abc", "bcd");
		Collections.sort(list);
		list.forEach((item) -> System.out.println(item));
		
		List<String> sortedListReversed = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		List<String> sortedListNatural = list.stream().sorted().collect(Collectors.toList());
	}

	public static void countEachCharacterOccurancrance() {
		String str = "devendra";
		HashMap<Character, Integer> hashMap = new HashMap<>();
		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c) + 1);
			} else {
				hashMap.put(c, 1);
			}
		}
		hashMap.forEach((k, v) -> System.out.println(k + "  :  " + v));
		
		//Another way .
		List<Character> list = str.chars().mapToObj(c->(char)c).collect(Collectors.toList());
				
	}
	
	public static void countEachCharacterOccurancranceUsingJava8() {
		String str = "devendra";
		List<Character> list = str.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		Map<Character,Long> map = list.stream().collect(Collectors.groupingBy(Character::charValue,Collectors.counting()));
		System.out.println("map is : "+map);
	}

	public static void getMinMaxSecondHighestNumberUsingJava8() {
		int arr[] = { 4, 5, 2, 6, 7 };
		//converting primitive to Object type
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		Integer min = list.stream().min(Integer::compareTo).get();
		System.out.println("min is : " + min);

		Integer max1 = list.stream().max(Integer::compareTo).get();
		System.out.println("max is : " + max1);

		Integer secondLargest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("secondLargest : " + secondLargest);
		
		IntSummaryStatistics statistics = list.stream().mapToInt(Integer::intValue).summaryStatistics();
		System.out.println("Min : "+statistics.getMin());
		System.out.println("Max : "+statistics.getMax());
		System.out.println("Average :"+statistics.getAverage());
		System.out.println("Sum :"+statistics.getSum());
		System.out.println("Count : "+statistics.getCount());
		
	}

	public static void getMaxAndSecondMax() {
		Integer arr[] = { 4, 5, 2, 7 };
		int secondmax = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {  
				max = arr[i];
			}

		}
		System.out.println("max : " + max);
		
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);
		int total = arr.length;
		secondmax = list.get(total - 2);
		System.out.println("second max is : " + secondmax);

	}

	public static void main(String[] args) {
		AllInterviewsPrograms.countEachCharacterOccurancranceUsingJava8();

	}

}
