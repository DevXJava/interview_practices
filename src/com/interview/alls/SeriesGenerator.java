package com.interview;

public class SeriesGenerator {
   // o/p : 1 3 7 13 21 31 43 57 73 91 
	public static void main(String[] args) {
		int[] arr = new int[10];
        arr[0] = 1;
        int diff = 2;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + diff;
            diff = diff + 2;
        }

        // Print the array
        for (int num : arr) {
            System.out.print(num + " ");
        }

	}

}
