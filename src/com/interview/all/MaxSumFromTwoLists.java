package com.interview.all;

import java.util.Arrays;
import java.util.List;

public class MaxSumFromTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 4, 3, 7);
        List<Integer> list2 = Arrays.asList(2, 5, 8, 1);

        int maxSum = findMaxSum(list1, list2);
        System.out.println("Maximum sum from corresponding elements: " + maxSum);
    }

    public static int findMaxSum(List<Integer> list1, List<Integer> list2) {
        int maxSum = Integer.MIN_VALUE;
        int minSize = Math.min(list1.size(), list2.size());

        for (int i = 0; i < minSize; i++) {
            int sum = list1.get(i) + list2.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}

