package com.interview.basics.arrays;

import java.util.Arrays;
import java.util.List;

public class SubArraysOfSumOfArray {
	public static List<Integer> findSubarrayWithSum(int[] arr, int target) {
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum = sum + arr[end];

            // Shrink window from left if sum exceeds target
            while (sum > target && start < end) {
                sum = sum - arr[start];
                start++;
            }

            // If sum matches target, return 1-based indices
            if (sum == target) {
                return Arrays.asList(start + 1, end + 1);
            }
        }

        return Arrays.asList(-1);
    }

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(findSubarrayWithSum(arr, target)); // Output: [2, 4]

	}

}
