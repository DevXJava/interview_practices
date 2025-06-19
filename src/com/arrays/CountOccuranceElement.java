package com.arrays;

public class CountOccuranceElement {

	public static void main(String[] args) {
		
		int visited = -1;
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		int frequency[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					frequency[j] = visited;
				}
			}
			if(frequency[i]!=visited) 
				frequency[i] = count; 
		}
		for (int i = 0; i < frequency.length; i++) {
			if(frequency[i]!=visited)
				System.out.println(arr[i]+" | "+ frequency[i]);
		}
		
	}

}
