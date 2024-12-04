package com.clairvoyant;

public class MergeTwoArrayAndFindUniqueValue {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 5, 2 };

		int a1 = a.length;
		int b1 = b.length;
		int c1 = a1 + b1;

		int mergeArray[] = new int[c1];

		for (int i = 0; i < a.length; i = i + 1) {
			mergeArray[i] = a[i];

		}

		for (int i = 0; i < b.length; i = i + 1) {
			mergeArray[b1+i] = b[i];
		}

		for (int k = 0; k < mergeArray.length; k++) {
			System.out.print(mergeArray[k]);
		}
		
		

	}

}
