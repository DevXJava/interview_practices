package com.interview.javatechonline;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GuessTheOutPut {
	
	public static void _1() {
		List<Integer> integers = Arrays.asList(11, 20, 33, 45, 52);
		int sum = integers.stream().filter(i->i%4==0)
				.map(n->n*2)
				.reduce(0, Integer::sum);
		System.out.println(sum);
		
	}

	public static void _2() {
		Stream.of(1, 2, 3)
	      .flatMap(n -> Stream.of(n, n * 2))
	      .forEach(System.out::print);
	}
	public static void _3() {
		List<Integer> numbers = Arrays.asList(12, 8, 13, 24, 15);

		Optional<Integer> result = numbers.stream()
		                                  .filter(n -> n > 25)
		                                  .reduce((a, b) -> a + b);
		System.out.println(result);
	}
	public static void _4() {
		List<String> words = Arrays.asList("hello", "world");
		List<String> letters = words.stream()
		                               .flatMap(s -> Stream.of(s.split("")))
		                               .collect(Collectors.toList());
		System.out.println(letters);
	}
	
	public static void _5() {
		IntStream.rangeClosed(1, 10)
        .filter(n -> n % 2 == 0)
        .forEach(System.out::print);
	}
	public static void _6() {
		Stream.of("Cognizant", "Infosys", "Amdocs")
	      .map(s -> s.length())
	      .reduce(0, Integer::sum);
	}
	
	public static void _7() {
		Map<String, Integer> ages = new HashMap<>();
		  ages.put("Robert", 30);
		  ages.put("Mary", 25);
		  ages.put("Peterson", 40);
		  ages.put("Jinny", 35);

		int result = ages.entrySet().stream()
		                 .filter(entry -> entry.getValue() > 30)
		                 .mapToInt(entry -> entry.getValue())
		                 .sum();
		System.out.println(result);
	}
	public static void _8() {
		Stream.of("java", "javascript", "angular")
	      .filter(s -> s.startsWith("b"))
	      .findFirst()
	      .ifPresent(System.out::println);
	}
	
	public static void _9() {
		IntStream.range(0, 5)
		.mapToObj(b->"a"+b)
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
	}
	
	public static void _10() {
		Stream.of("java", "python", "react")
	      .flatMap(s -> s.chars().boxed())
	      .forEach(System.out::print);
	}
	public static void _11() {
		Stream.of("spring", "hibernate", "jdbc")
	      .map(s -> s.substring(2, 3))
	      .forEach(System.out::print);
	}
	public static void _12() {
		IntStream.rangeClosed(1, 5)
        .map(i -> i * i)
        .skip(2)
        .forEach(System.out::print);
	}
	public static void _13() {
		Stream.of("A","B","C").flatMap(s->Stream.of(s,s.toLowerCase()))
		 .forEach(System.out::print);
	}
	public static void _14() {
		List<Integer> numbers = Arrays.asList(5, 4, 3, 2, 1);
		int sum = numbers.stream()
				.reduce(20, (a, b) -> a + b);
		System.out.println(sum);

	}
	
	public static void _15() {
		Stream.of(3, 4, 2, 5, 1)
		.map(i->i*2)
		.skip(1)
		.limit(3)
		.forEach(System.out::println);
	}
	
	public static void _16() {
		List<String> words = Arrays.asList("java", "springboot", "angular", "javascript", "springframework");
		String result = words.stream()
				.filter(s->s.length()>15)
				.findFirst()
				.orElse("none");
		System.out.println(result);
	}
	public static void _17() {
		IntStream.range(24, 96)
		.limit(3)
		.mapToObj(Integer::toString)
		.forEach(System.out::print);
	}
	public static void _18() {
		List<String> words = Arrays.asList("one", "two", "three", "four", "five");
		Map<Integer, List<String>> map = words.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println(map);
	}
	public static void _19() {
		List<Integer> numbers = Arrays.asList(15, 24, 33, 12, 19);

		Map<Boolean, List<Integer>> result = numbers.stream()
		                 .collect(Collectors.partitioningBy(n -> n % 2 == 0));

		System.out.println(result);
	}
	
	public static void _20() {
		List<String> words = Arrays.asList("java", "typescript", "angular", "javascript", "react");
		Set<String> result = words.stream()
		                          .flatMap(s -> Arrays.stream(s.split("")))
		                          .collect(Collectors.toSet());
		System.out.println(result);
	}
	public static void _21() {
		List<String> words = Arrays.asList("one", "two", "three", "four", "five");
		Map<Integer, String> result = words.stream()
		             .collect(Collectors.toMap(String::length, 
		                 Function.identity(), (s1, s2) -> s1 + "|" + s2));
		System.out.println(result);
	}
	public static void main(String[] args) {
		_21();

	}

}
