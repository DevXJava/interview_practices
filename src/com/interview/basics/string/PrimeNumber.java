package com.interview.basics.string;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number:  ");
		int number = scanner.nextInt();
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
		scanner.close();
	}

}
