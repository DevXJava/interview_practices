package com.interview.all;

import java.util.Arrays;

public class MaxSumOfArray {

	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 3, 14, 5, 2};

		Arrays.sort(arr);
		int maxTwoSum = arr[arr.length - 1] + arr[arr.length - 2];

		System.out.println("Max sum of any two elements: " + maxTwoSum);  // 14 + 5 = 19

	}

}
