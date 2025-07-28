package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveArrayZerosToRight {

	public static void moveArrayZerosToRight() {
		int[] arr = { 10, 2, 0, 7, 1, 0, 5, 6 };
		int n = arr.length;
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}

		while (index < n) {
			arr[index++] = 0;
		}

		for (int num : arr) {
			System.out.println("num is : " + num);
		}
	}

	public static void moveArrayZerosToLeft() {
		int[] arr = { 10, 2, 0, 7, 1, 0, 5, 6 };
		int n = arr.length;
		int index = n - 1;
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[index--] = arr[i];
			}
		}
		while (index >= 0) {
			arr[index--] = 0;
		}
		for (int num : arr) {
			System.out.println("num is : " + num);
		}
	}

	public static void usingSingleLoopMoveZeroLeft() {
		int[] arr = {10, 20, 0, 0, 15, 25, 10, 0};
		int write = 0;                     // next position for a non‑zero value
		for (int read = 0; read < arr.length; read++) {
		    if (arr[read] != 0) {          // found a non‑zero element
		        int temp     = arr[read];  // swap arr[read] ↔ arr[write]
		        arr[read]    = arr[write];
		        arr[write]   = temp;
		        write++;                   // move write pointer forward
		    }
		}

		// print result
		System.out.println(Arrays.toString(arr));

	}
	
	public static void moveArrayZerosToRightJava8Stream() {
		List<Integer> integers = List.of(1,0,-3,0,5,-2,0,8,0,-4);
	    List<Integer> integers2=	Stream.concat(integers.stream().filter(n->n!=0), integers.stream().filter(n->n==0)).collect(Collectors.toList());
	    System.out.println("integers2 : "+integers2);
	    //Order of n space complexity
	}
	public static void main(String[] args) {
		MoveArrayZerosToRight.moveArrayZerosToRightJava8Stream();
	}

}
