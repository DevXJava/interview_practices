package com.basics.arrays;

public class ShortArrayWithSingleforLoop {

	public static int[] sortArrays(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			// Checking the condition for two simultaneous elements of the array
			if(arr[i]>arr[i+1]) {
				// Swapping the elements.
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				// updating the value of i = -1
                // so after getting updated for i++
                // in the loop it becomes 0 and
                // the loop begins from the start.
				i = -1;
			}	
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {8,3,5,1,9};
		
		int sortedArr[] = ShortArrayWithSingleforLoop.sortArrays(arr);
		
		for (int i = 0; i < sortedArr.length; i++) {
			System.out.println(sortedArr[i]);
		}

	}

}
