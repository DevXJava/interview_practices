package com.basics;

import java.util.Scanner;

public class FIndOddEven {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number:  ");
		int number = scanner.nextInt();
		if(number % 2 == 0) {
			System.out.println(number + " is even ");
			
		}else {
			System.out.println(number + " is odd ");
		}
		scanner.close();

	}

}
