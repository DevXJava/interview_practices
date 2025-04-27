package com.codinglyf.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.management.RuntimeErrorException;

public class JavaStreamUsages {
	
	
	
	// 1. Finding common elements between two list 
	public static  List<Integer> getCommonElementsInTwoLists(List<Integer> list1,List<Integer> list2) {
		//Approach 1
		List<Integer> commonValues1 = list1.stream().filter(list2::contains).collect(Collectors.toList());
		
		//Approach 2
		Set<Integer> set2 = new HashSet<>(list2);
		List<Integer> commonValues2 = list1.stream().filter(set2::contains).collect(Collectors.toList());
		
		//Approach 3
		List<Integer> commonValues3 = list1.stream().filter(e->list2.stream().anyMatch(e::equals)).collect(Collectors.toList());
		
		return commonValues3;

	}
	//Find elements in present in list1 but Not in list2
	public static List<Integer> findElementsInList1ButNotInList2(List<Integer> list1,List<Integer> list2) {
		return list1.stream().filter(e->list2.stream().noneMatch(e::equals)).collect(Collectors.toList());
	}
	
	//Combine Two List without Duplicate 
	public static List<Integer> combineDistinctElements(List<Integer> list1,List<Integer> list2){
		return Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
	}
	
	//4. Find Duplicate Elements Within a Single List If you want to identify which elements are repeated in a single list:
	public static List<Integer> findDuplicateElementsWithinaSingleList(List<Integer> list1){
		List<Integer> listDuplicate = list1.stream().filter(e->Collections.frequency(list1, e)>1).distinct().collect(Collectors.toList());
		return listDuplicate;
	}
	//5. Sort Two Lists and Merge into a Single Sorted List If you want to combine two lists and get them sorted:
	public static List<Integer> mergeIntoSortedList(List<Integer> list1,List<Integer> list2) {
		return Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
	}

	//6. Find the Maximum Element in a List Use reduce or max to find the largest element in a list.
	public int findMaxElementInAsList(List<Integer> list) {
		int max = list.stream().max(Integer::compareTo).orElseThrow(()->new RuntimeException("List is empty !"));
		return max;
	}
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,2,3,4,4,5,6);
		List<Integer> list2 = Arrays.asList(3,4,6,7);
		List<String>  list  = Arrays.asList("abc","def","ghi","jkl");
		
		JavaStreamUsages.findDuplicateElementsWithinaSingleList(list1);
		
		List<Integer> integers= JavaStreamUsages.getCommonElementsInTwoLists(list1, list2);
		System.out.println(" integers  " +integers);
		
		List<Integer> integers2 = JavaStreamUsages.findElementsInList1ButNotInList2(list1, list2);
		System.out.println(" integers2 "+integers2);
		
		List<Integer> integers3 = JavaStreamUsages.combineDistinctElements(list1, list2);
		System.out.println(" integers3 " +integers3);
		
		
		boolean hasNegative =  list1.stream().anyMatch(n->n<0);
		boolean allPositive =  list1.stream().anyMatch(n->n>0);
		boolean noneNegative = list1.stream().noneMatch(n->n<0);
		
		//Transform elements using map:
		List<String> strings = list.stream().map(Object::toString).collect(Collectors.toList());
		
		//Flatten nested streams with flatMap:
		List<List<Integer>> nested = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
		List<Integer> flatList = nested.stream().flatMap(Collection::stream).collect(Collectors.toList());
		
		//To a list or set:
		Set<Integer> set = list1.stream().collect(Collectors.toSet());
		
		//Grouping elements by a property:
		Map<Boolean, List<Integer>> groupingEvenOdd = list1.stream().collect(Collectors.partitioningBy(e->e%2==0));
		
		//Joining elements into a string 
		String joined = list.stream().map(Object::toString).collect(Collectors.joining(", "));
		
		//4. Reducing (Aggregation)
		//. Sum or combine elements:
		Integer sum = list1.stream().reduce(0, Integer::sum); // Initial value is 0
		
		//Find the maximum or minimum element:
		Integer maxValue = list1.stream().max(Integer::compareTo).orElseThrow(()-> new IllegalStateException("List is empty"));
		
		//5. Sort elements naturally or with a comparator:
		List<Integer> sorted = list1.stream().sorted().collect(Collectors.toList());
		
		//custom sorting 
		List<String> customSorted = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		
		//6. Iterating Through a Stream
		list.stream().forEach(System.out::println);
		
		//8. Parallel Streams
		//Process elements concurrently for better performance
		List<Integer> doubled = list1.parallelStream().map(n -> n * 2).collect(Collectors.toList());
		
		//9. Peek for Debugging
		//Inspect elements during processing (not modifying them)
		List<Integer> result = list1.stream().peek(System.out::println).filter(n->n>5).collect(Collectors.toList());
		
		//7. Flatten a List of Lists If you have a List<List> and want to flatten it into a single list:
		
		List<List<Integer>> nestedLists = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5),
			    Arrays.asList(6, 7, 8)
			);
		
		List<Integer> flatLists = nestedLists.stream().flatMap(List::stream).collect(Collectors.toList());
		
		
	}

}
