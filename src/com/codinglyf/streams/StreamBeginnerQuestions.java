package com.codinglyf.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamBeginnerQuestions {
	
	public static void filterEvenNumber() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNumbers = list.stream().filter(even->even%2==0).collect(Collectors.toList());
	}
	public static void convertStringToUpperCase() {
		List<String> list = Arrays.asList("apple","banana","cherry");
		List<String> upperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
	}
	public static void firstElementStartWithS() {
		List<String> names = Arrays.asList("John", "Smith", "Sara", "Michael");
		Optional<String> list = names.stream().filter(n->n.startsWith("S")).findFirst();
	}
	
	public static void sumOfAllElements() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Optional<Integer> sum = numbers.stream().reduce((num1,num2)->num1+num2);
		
	}
	// 5. Count Words with Length > 3
	public static void countWordsLengthGreateThanThree() {
		 List<String> wordList = Arrays.asList("a", "the", "cat", "elephant", "dog");
		 long count = wordList.stream().filter(word->word.length()>3).count();
	}
	// 6. Sorting Numbers in Descending Order
	public static void sortingNumberInDescendingOrder() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> sortedDesc = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}
	// 7. Remove Duplicates from a List
	public static void removeDuplicates() {
		List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);
		List<Integer> list = duplicateNumbers.stream().distinct().collect(Collectors.toList());
	}
	 // 8. Convert List of Strings to a Single Comma-Separated String
	public static void convertListofStringsToaSingleCommaSeparatedString() {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		String joinedWords = words.stream().collect(Collectors.joining(", "));
		System.out.println("joinedWords :  "+joinedWords+ "words    : "+words);
	}
	// 9. Find the Maximum Value
	public static void findTheMaximumValue() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Optional<Integer> maxVlaue = numbers.stream().max(Comparator.naturalOrder());
		Optional<Integer> minVlaue = numbers.stream().min(Comparator.naturalOrder());
		System.out.println("maxVlaue : "+maxVlaue+"  minVlaue : "+minVlaue);
	}
	// 10. Check if Any String Starts with 'A'
	public static void CheckifAnyStringStartswithA() {
		 List<String> nameList = Arrays.asList("Bob", "Alice", "Charlie", "Andrew");
		 boolean anyStartWithA = nameList.stream().anyMatch(a->a.startsWith("A"));
	}
	public static void main(String[] args) {
		StreamBeginnerQuestions.findTheMaximumValue();

	}

}
