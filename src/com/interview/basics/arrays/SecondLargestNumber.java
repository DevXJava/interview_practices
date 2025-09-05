package com.interview.basics.arrays;

public class SecondLargestNumber {
   
	public static int getSeondLargest(int[] arr,int total) {
		int temp;
		for (int i = 0; i < total; i++){  
            for (int j = i + 1; j < total; j++){  
                if (arr[i] > arr[j]){  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
		for (int i = 0; i < arr.length; i++) {
			System.out.println("sorted array is: "+arr[i]);
		}
		return arr[total-3];
	}
	
	
	public static void main(String[] args) {
		int arr[] = {8,4,9,3,1,7,5};
		int total = arr.length;
		
		int seconLargest = SecondLargestNumber.getSeondLargest(arr, total);
		
		System.out.println(seconLargest);

	}

}
