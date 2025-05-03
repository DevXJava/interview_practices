package com.interview.all;

import java.util.Arrays;
import java.util.List;

public class SumOfListEeveNumbers {

	public static void main(String[] args) {
		
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Integer integer = integers.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		
		System.out.println("sum of even is : "+integer);

	}

}
