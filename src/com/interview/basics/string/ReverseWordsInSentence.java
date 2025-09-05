package com.interview.basics.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String string = "hello this javas world";

		String reversedWords = Arrays.stream(string.trim().split("\\s+"))
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list);
					return String.join(" ", list);

				}));

		System.out.println("reversedWords is : " + reversedWords);

		// 2. Reverse Each Word for Sentence
		String reversedEachWordOfSentence = Arrays.stream(string.split(" "))
				.map(s -> new StringBuilder(s).reverse().toString()).collect(Collectors.joining(" "));
		System.out.println("reversedEachWordOfSentence :" + reversedEachWordOfSentence);

		// 3
		String input = "hello my name is Devendra";
		// output --> "Devendra is name my hello"
		String reverse = Arrays.stream(input.split(" "))
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list);
					return String.join(" ",list);

				}));
		System.out.println("reverse is :"+reverse);
		//4 Find unique values 
		List<Integer> integers = Arrays.asList(10,20,10,30,20,40,50,10);
		List<Integer> unique = integers.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
		
		//5. 
		String input1 = "hello my name is Devendra";
		// Step 1: Split the sentence into words
		String[] input1Array = input1.trim().split("\\s+");
		String str[] = input1.split(" ");
		// Step 2: Convert the array of words to a mutable List
		List<String> lists = new ArrayList<>(Arrays.asList(str ));
		// Step 3: Reverse the order of words in the list
		Collections.reverse(lists);
		// Step 4: Join the words back into a sentence
		String reversedList = String.join(" ", lists);
		System.out.println("reversedList : "+reversedList);

	}

}
