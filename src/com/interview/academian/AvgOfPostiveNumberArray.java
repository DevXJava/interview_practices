package com.interview.academian;

public class AvgOfPostiveNumberArray {

	public static void main(String[] args) {
		int[] arr = {-3,-2,0,-7,25,12,-11};
		int sum=0;
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				sum=sum+arr[i];
				count++;
			}
		}
		if(count>0) {
			double avg=(double)sum/count;
			System.out.println("Average of positive numbers : "+ avg);
		}else {
			System.out.println("positive number is not present in array");
		}
		
		System.out.println("-----------------------------");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
			System.out.println("Negative number is : "+arr[i]);
		}

	}

}
