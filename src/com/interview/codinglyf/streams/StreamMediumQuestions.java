package com.interview.codinglyf.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMediumQuestions {
	
	// 1. Find the Second-Highest Number
    // Steps: Remove duplicates -> Sort in descending order -> Skip the highest -> Get the second-highest
	public static void findTheSecondHighestNumber() {
		List<Integer> numbers = Arrays.asList(10, 20, 5, 8, 30, 25, 30);
		Integer secondHighest = numbers.stream().distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(null);
		System.out.println("secondHighest : "+secondHighest);
	}
	// 2. Count Occurrences of Each Word
    // Steps: Group words -> Count occurrences
	public static void countOccuranceOfEachWord() {
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
		Map<String, Long> wordCount = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Set<Entry<String, Long>> entry = wordCount.entrySet();
		
		for(Entry<String, Long> entry2 :entry) {
			System.out.println(entry2.getKey()+"   :  "+entry2.getValue());
		}
	}
	// 3. Remove Null and Empty Values
    // Steps: Remove null values -> Remove empty string
	public static void removeNullAndEmptyStringValues() {
		 List<String> values = Arrays.asList("Hello", "", null, "World", "Java", "");
		 List<String> filteredValues  = values.stream().filter(Objects::nonNull).filter(s-> !s.isEmpty()).collect(Collectors.toList());
		 System.out.println("Non null and non Empty values is : "+filteredValues);
	}
	// 4. Find the Longest Word
    // Steps: Compare word lengths -> Get the longest
	public static void findLongestWord() {
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
		String longestWord = words.stream().max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println("Longest Word: " + longestWord);
	}
	// 5. Convert List of Objects to a Map
    // Steps: Convert List<Employee> to Map<Id, Name>
	public static void convertListOfObjectToMap() {
		List<Employee> employees = Arrays.asList(new Employee(1, "John"), new Employee(2, "Jane"));
		Map<Integer, String> employeeMap = employees.stream()
				.collect(Collectors.toMap(Employee::getId, Employee::getName));
		System.out.println("employeeMap : "+employeeMap);
	}
	// 6. Flatten a List of Lists into a Single List
    // Steps: Flatten nested lists into a single list
	public static void flattenNestedListsIntoaSingleList() {
		 List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
		 List<Integer> flatList=nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
		 System.out.println("flatList : "+flatList);
	}
	// 7. Find First Non-Repeating Character in a String
    // Steps: Convert to stream -> Count occurrences -> Find the first unique character
   public static void findFirstNonRepeatingCharacterInaString() {
	   String input = "aabbcdeffg";
	   Character firstNonReating = input.chars()
			                       .mapToObj(c->(char)c) // Convert int stream to Character Stream 
			                       .collect(Collectors.groupingBy(Function.identity(), // Group by characters
			                    		   LinkedHashMap::new,
			                    		   Collectors.counting())) //Count characters 
			                       .entrySet().stream()
			                       .filter(entry->entry.getValue()==1)// Filters characters occurring only once
			                       .map(Map.Entry::getKey)// Extracts the character
			                       .findFirst()// Finds the first match
			                       .orElse(null);// Returns null if no match found
	   System.out.println("firstNonReating : "+firstNonReating);		                       		                   		                       
   }
   // 8. Group Numbers into Even and Odd
   // Steps: Partition numbers into even and odd groups
	public static void groupNumbersIntoEvenAndOdd() {
		List<Integer> numbers = Arrays.asList(10, 20, 5, 8, 30, 25, 30);
		Map<Boolean, List<Integer>> evenOddGrouping = numbers.stream()
				.collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println("evenOddGrouping : "+evenOddGrouping);
	}
	// 9. Sort Strings by Length
    // Steps: Sort words based on length
	public static void sortStringsByLength() {
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
		List<String> sortedByLength = words.stream()
				                           .sorted(Comparator.comparingInt(String::length))
				                           .collect(Collectors.toList());
		System.out.println("sortedByLength : "+sortedByLength);
	}
	// 10. Find the Most Repeated Number
    // Steps: Count occurrences -> Get the most repeated number
	public static void findTheMostRepeatedNumber() {
		List<Integer> numbers = Arrays.asList(10, 20, 5, 8, 30, 25, 30,30,20);
		Integer mostRepeated = numbers.stream()
				               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				                 // Group numbers and counts occurrence
				               .entrySet().stream()
				               .max(Map.Entry.comparingByValue())// Finds entry with the highest count
				               .map(Map.Entry::getKey)// Extracts the number from the entry
				               .orElse(null);
		System.out.println("Most Repeated Number: " + mostRepeated);
	}
	
	public static void main(String[] args) {
		StreamMediumQuestions.findTheMostRepeatedNumber();

	}

}

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}