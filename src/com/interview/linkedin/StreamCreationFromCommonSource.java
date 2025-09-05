package com.interview.linkedin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationFromCommonSource {

	public static void main(String[] args) {
	    //1. From a list 
		List<String> names = List.of("Alice","Bob","Charlie");
		Stream<String> nameStream = names.stream();
		
	    //2. From a Map 
		Map<String, Integer> scores = Map.of("Math",85,"Science",95);
		Stream<Map.Entry<String, Integer>> scoreStream = scores.entrySet().stream();
		
		//3. From a Set
		Set<String> fruitSet = Set.of("apple","banana","cherry");
		Stream<String> fruitStream = fruitSet.stream();
		
		//4. From an array 
		int numbers[] =  {1,2,3,4};
		IntStream numStream = Arrays.stream(numbers);
		
		//5. Form values 
		Stream<String> streamWord = Stream.of("One","Two","Three");
		
		//6.From List to List 
		List<String> listWords = List.of("Hello","World","Java","Stream");
		
		//7. Basic transformations 
		List<Integer> lengths = listWords.stream().map(String::length).collect(Collectors.toList());
		
		//8. Use of filter, sorted, map & distinct
		List<String> emails = List.of("test@xyz.com", "user@xyz.com",
		"admin@xyz.com");
		List<String> xyzEmails = emails.stream()
		.filter(email -> email.endsWith("@xyz.com"))
		.map(String::toUpperCase)
		.sorted()
		.distinct()
		.collect(Collectors.toList());
		
		//9.flatMap - flatten nested collections 
		List<List<String>> nested = List.of(List.of("a","b"),List.of("c"));
		List<String> flatList = nested.stream().flatMap(List::stream).collect(Collectors.toList());
		
		//Aggregation — collect, group, partition, reduce, count, max/min
		List<String> fruits =  List.of("apple", "banana", "avocado", "blueberry");
		
		//10.Grouping by first letter 
		Map<Character, List<String>> groupByFirstCharacter = fruits.stream()
				.collect(Collectors.groupingBy(f->f.charAt(0)));
		//11. Partitioning into two groups 
		Map<Boolean, List<String>> partitionTwogroup = fruits.stream()
				.collect(Collectors.partitioningBy(f->f.startsWith("a")));
		System.out.println("partitionTwogroup : "+partitionTwogroup);
		
		//12. Reducing values 
		String joined = fruits.stream().collect(Collectors.joining(" "));
		System.out.println("joined is : "+joined);
		
		//13. total length
		int totalLength = fruits.stream().mapToInt(String::length).reduce(0, Integer::sum);
		System.out.println("totalLength : "+totalLength);
		
		//14. Finding extremes
		Optional<String> longestWord = fruits.stream().max(Comparator.comparing(String::length));
		
		//Utility – limit, skip, match, find, forEach, toArray
		List<Integer> nums = List.of(10, 15, 20, 25, 30, 35);
		
		//15. limit and skip 
		nums.stream().skip(2).limit(3).forEach(n->System.out.println(n));
		
		//16. Matching 
		boolean allEeven = nums.stream().allMatch(n->n%2==0);
		boolean anyAbove25 = nums.stream().anyMatch(n->n>25);
		boolean nonNeagtive = nums.stream().noneMatch(n->n<0);
		
		//17. Finding Elements
		Optional<Integer> first = nums.parallelStream().findFirst();
		Optional<Integer> findAny = nums.parallelStream().findAny();
		
		//18. Convert to array 
		Integer[] array = nums.stream().toArray(Integer[]::new);
		
		//19. convert to array type to double type .
		double[] doubles = List.of("3.14","2.17").stream().mapToDouble(Double::parseDouble).toArray();
		
		//Important - Sort Map by key or value
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("a", 2);
		hashMap.put("b", 1);
		hashMap.put("c", 3);
		
		//Sort map by value() method
		hashMap.values().stream().sorted().forEach(System.out::println);
		
		//Sort map by keySet() method
		hashMap.keySet().stream().sorted().forEach(System.out::println);
		
		//Sort map by value using entrySet and return Object
		Map<String,Integer> shortByValue = hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldV,nVal)->oldV, LinkedHashMap::new));
		System.out.println("shortByValue : "+shortByValue);
		//Sort map by key using entrySet and return Object
		Map<String,Integer> shortByKey = hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (oldValue,newValue)-> oldValue,LinkedHashMap::new));
		System.out.println("shortByKey : "+shortByKey);	
		
		// Sort map by value using entrySet
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x -> System.out.println(x.getKey() + " : "+x.getValue()));
		// Sort map by key using entrySet
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x -> System.out.println(x.getKey() + " : "+x.getValue()));
		

		
		
				
		
		
		

	}

}
