package com.interview.codedecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		String[] str = new String[] {"Android","Java","Dot Net","Pytthon"};
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ruby");
		
		Collections.addAll(arrayList,str);
		System.out.println(arrayList);
		
		//Using Java 8
		
		List<Object> list = Arrays.stream(str).collect(Collectors.toList());
		System.out.println(list);
		
		/*How do you increase the current capacity of an ArrayList?*/
		arrayList.ensureCapacity(20);
		
		/*How do you decrease the current capacity of an ArrayList to the current size?*/
		arrayList.trimToSize();
		
		/*How do you convert an ArrayList to Array?*/
		
		Object[]  array = arrayList.toArray();
		
		System.out.println("=================================================");
		
		//1. map(): Transforms each element in a stream. Example: Convert a list of names to uppercase.
		
		List<String> names = List.of("John","Doe");
		List<String> upperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("upper case is : "+upperCase);
		
		
		//2. Filter find even numbers 
		
		List<Integer> numbers = List.of(1,2,5,3,6,4);
		List<Integer> evenNumbers = numbers.stream().filter(even->even%2==0).collect(Collectors.toList());
		System.out.println("Eeven number is : "+evenNumbers);
		
		//3. flatMap():Flattens nested structures like lists of lists into a single stream.Example: Combine lists into one.
		
		List<List<Integer>> listOfList = List.of(List.of(1,2,3,4),List.of(5,6,7,8,10));
		List<Integer> flatList = listOfList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(" flat list is : "+flatList);
		
		//4. reduce(): Reduces elements to a single value using an accumulator.Example: Sum a list of numbers.
		List<Integer> listNumber = List.of(1,2,3,4,5);
		int sumNumber = listNumber.stream().reduce(5, Integer::sum);
		System.out.println("sumNumber  :"+sumNumber);
		
		//



	}

}
