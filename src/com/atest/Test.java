package com.atest;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		int[] arr = {2,7,9,3,1};
		int[] arr2 = {1,5,1,1,6}; //
		
		
		int[] arr3 = {2,2,0,1,1,0};
		
		int temp =0;
		for(int i=0;i<arr3.length;i++) {
			if(arr3[i]<arr3[i+1]) {
				temp = arr[i];
				
			}
			
		}

	}

}
