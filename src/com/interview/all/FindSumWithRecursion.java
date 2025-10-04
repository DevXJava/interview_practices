package com.interview.all;

public class FindSumWithRecursion {

	public static int sum(int number) {
		if(number<=0) {
			return 0;
		}
		return number + sum(number-1);
	}
	
	public static void main(String[] args) {
		int sum = FindSumWithRecursion.sum(10);
		System.out.println("sum is : "+sum);

	}

}
