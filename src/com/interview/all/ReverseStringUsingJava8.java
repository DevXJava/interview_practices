package com.interview.all;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringUsingJava8 {

	public static void main(String[] args) {
		
		//=======================Reverse Word Only=====================================
		String string = "this is java program";
		String reversed = Arrays.stream(string.split(" "))
				.collect(Collectors.collectingAndThen(Collectors.toList(), str->{
					Collections.reverse(str);
					return str.stream();
				})).collect(Collectors.joining(" "));
		
		System.out.println(reversed);
		
		
		//=============================================================
		List<String> reversedStr = Arrays.stream(string.split(" ")).map(word->new StringBuilder(word).reverse().toString()).collect(Collectors.toList());
		System.out.println("reversedStr : "+reversedStr);
		//==========================Reverse Each Word Without Inbuilt Function=================================
		String reverseEachWord = "";
		for(int i=string.length()-1;i>=0;i--) {
			reverseEachWord = reverseEachWord+string.charAt(i);
		}
		System.out.println("reverse each word: "+reverseEachWord);

	}

}
