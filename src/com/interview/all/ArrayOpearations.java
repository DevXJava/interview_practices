package com.interview.all;

public class ArrayOpearations {

	public void sortArray() {
		int arr[] = {3,2,1,5,4};
		int temp =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				 
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("sorted array is "+arr[i]);
			
		}
	}
	
	//---------------------------------------------------------------------------------
	public void findEvenElementOfArray () {
		int arr[] = {3,1,7,9,8,2};
		
		
		
	}
	public static void main(String[] args) {
		
	
		
	}

}
