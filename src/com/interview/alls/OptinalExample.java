package com.interview;

import java.util.Arrays;

public class OptinalExample {

	public static void main(String[] args) {
		int max1 = Arrays.stream(new int[] {1,2,3,4,5,6}).max().orElse(0);
		System.out.println("max number is :"+max1);
		int min1 = Arrays.stream(new int[] {3,1,8,4,2,}).min().orElse(0);
		System.out.println("min number is :"+min1);

	}

}
