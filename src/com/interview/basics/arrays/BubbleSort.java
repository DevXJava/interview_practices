package com.interview.basics.arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {8,4,9,3,1,7,5};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
