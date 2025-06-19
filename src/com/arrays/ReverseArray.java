package com.interview.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		int temp = arr.length;
		int b[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			b[temp-1] = arr[i];
			temp = temp-1;
			
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print("  "+b[i]+":");
		}
		
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print("   "+arr[i]);
		}
	}

}
