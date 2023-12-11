package com.functional.programing;

import java.util.List;

public class SP01StructuredPrograming {
	
	public static void prinListOfNumbers(List<Integer> list) {
		for(Integer integer:list) {
			System.out.println(integer);
		}
	}
	public static void prinListOEeveNumbers(List<Integer> list) {
		for(Integer integer:list) {
			if(integer%2==0) {
				System.out.println(integer);
			}	
		}
	}
	public static void main(String[] args) {
		List<Integer> numbers = List.of(10,4,2,38,3,4,5,1);
		prinListOfNumbers(numbers);
		prinListOEeveNumbers(numbers);

	}

}
