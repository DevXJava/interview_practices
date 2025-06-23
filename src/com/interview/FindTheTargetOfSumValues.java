package com.interview;

import java.util.HashSet;

public class FindTheTargetOfSumValues {

	public static void optimizedWay() {
		int arr[] = { 1, 3, 5, 7, 4 };
		int target = 8;
		HashSet<Integer> seen = new HashSet<>();

		for (int num : arr) {
		    int complement = target - num;

		    if (seen.contains(complement)) {
		        System.out.println(complement + "  " + num);
		    }

		    seen.add(num);
		}

	}
	
	
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 4 };
		int target = 8;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == target) {

					System.out.println(arr[i]+"  "+arr[j]);

				}

			}
		}

	}

}
