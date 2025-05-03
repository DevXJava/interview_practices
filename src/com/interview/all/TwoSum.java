package com.interview.all;

/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == target) {

					System.out.println("elements is :" + arr[i] + "  " + arr[j]);

				}

			}

			sum = sum + arr[i];
		}
		System.out.println("sum of array is :" + sum);
		System.out.println("--------------------------------------");
		
		int bulb = (int) Math.sqrt(3);
		System.out.println("bulb is :"+bulb);

	}

}
