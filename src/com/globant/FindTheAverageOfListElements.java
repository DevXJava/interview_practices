package com.globant;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class FindTheAverageOfListElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 5, 9, 4, 7);
		IntSummaryStatistics iss = list.stream().mapToInt((e) -> e).summaryStatistics();
		
		System.out.println("average : "+iss.getAverage());
		
		System.out.println("sum : "+iss.getSum());
		
		System.out.println("min : "+iss.getMin());
		
		System.out.println("min : "+iss.getMax());
		
		System.out.println("get count : "+iss.getCount());
	}
}
