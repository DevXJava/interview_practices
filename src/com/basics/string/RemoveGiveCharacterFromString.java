package com.basics.string;

import java.util.stream.Collectors;

public class RemoveGiveCharacterFromString {

	public static void removeGiveCharacterFromString(Character characterRmoval) {
		
		String sentence = "Java 8 stream API is powerful";
		String afterRemoved = sentence.chars()
				.filter(c -> c != characterRmoval && c != Character.toLowerCase(characterRmoval))
				.mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
		System.out.println("After removing the character is : " + afterRemoved);
	}

	public static void main(String[] args) {
		RemoveGiveCharacterFromString.removeGiveCharacterFromString('A');

	}

}
