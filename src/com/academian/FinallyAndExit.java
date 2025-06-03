package com.academian;

public class FinallyAndExit {

	public static void main(String[] args) {
		try {
			System.out.println("Inside try block !");
			System.exit(0);
		} finally {
			System.out.println("Inside finally block !");
		}
	}

}
