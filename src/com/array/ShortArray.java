package com.array;

import java.util.Arrays;

public class ShortArray {
	
	public static void shortArray() {
		int arr[] = {9,3,7,1,4,8,6};
		//Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args) {
		shortArray();

	}

}
