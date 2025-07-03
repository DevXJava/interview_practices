package com.guess.output;

public class Test6 {

	public static void main(String[] args) {
		try {
			System.out.println("In side try block !!!");
		} finally {
			System.out.println("In side finally block !!!");
			notification();
		}
		System.out.println("---------------------------------------");
		try {
			System.out.println("tyr");
			int a = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println("catch");
			int a = 0 / 5;
			System.out.println("a is " + a);
			return;
		} finally {
			System.out.println("finally");
		}

	}

	static void notification() {
		System.out.println("NOTIFICATION SENT !!!");
	}

}
