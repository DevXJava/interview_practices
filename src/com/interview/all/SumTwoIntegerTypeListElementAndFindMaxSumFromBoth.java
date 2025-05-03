package com.interview.all;

import java.util.Arrays;
import java.util.List;

public class SumTwoIntegerTypeListElementAndFindMaxSumFromBoth {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,-8,3,5,-20,51,8);

		List<Integer> list2 = Arrays.asList(12,-81,32,55,-20,51,54);

		
		
		int sum1 = list1.stream().mapToInt(Integer::intValue).sum();
        int sum2 = list2.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum of list1: " + sum1);
        System.out.println("Sum of list2: " + sum2);

        if (sum1 > sum2) {
            System.out.println("List1 has the maximum sum: " + sum1);
        } else if (sum2 > sum1) {
            System.out.println("List2 has the maximum sum: " + sum2);
        } else {
            System.out.println("Both lists have equal sum: " + sum1);
        }
	}

}
