package com.interview.java8;

import java.util.List;

public class FP01Program {
	
	public static void print(int number) {
		System.out.println(number);
	}
	public static boolean isEeven(int number) {
		return number%2==0;
	}
	public static void prinListOfNumbers(List<Integer> list) {
		//list.stream().forEach(FP01Program::print);
		
		list.forEach(System.out::println);
	}
	private static void prinListOfEeveNumbers(List<Integer> numbers) {
		
		numbers.stream().filter(FP01Program::isEeven).forEach(System.out::println);
		
		//numbers.stream().filter(n->n%2==0).forEach((a)->System.out.println(a));
		
	}
	
	public static void prinListOfSquareNumbers(List<Integer> numbers) {
		numbers.stream().filter(n->n%2==0)
		.map(sq->sq*sq)
		.forEach((a)->System.out.println(a));
	}
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(10,4,2,38,3,4,5,1);
		//prinListOfNumbers(numbers);
		//prinListOfEeveNumbers(numbers);
		//prinListOfSquareNumbers(numbers);
		List<String> strings = List.of("Spring boot","Spring","Java","DBMS","MySql");
		
		strings.stream().filter(s->s.contains("Spring")).forEach(System.out::println);
		strings.stream().map(course->course+"  :  "+course.length()).forEach(System.out::println);
		//Q. at least have four character
		
		strings.stream().filter(b->b.length()==4).forEach(System.out::println);

	}

	

}
