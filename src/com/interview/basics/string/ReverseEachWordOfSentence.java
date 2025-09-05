package com.interview.basics.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfSentence {

	public static void main(String[] args) {
		String string = "hello this is javas world!";
		String reversedEachWordOfSentence = Arrays.stream(string.split(" ")).map(s->new StringBuilder(s).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println("reversedEachWordOfSentence :"+reversedEachWordOfSentence);

	}

}
