package com.globant;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		String a = "Java";
		String s = new String("Java");
		System.out.println(a.equals(s)); // true

		String b = "Java";
		System.out.println(a.equals(b)); // true

		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1 == s2);
		System.out.println(s1+"  "+s2);
		

		int arr[] = { 1, 3, 5, 7, 4 };
		int target = 9;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == 10) {

					System.out.println(arr[i]+"  "+arr[j]);

				}

			}
		}
	}

}
