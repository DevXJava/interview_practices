package com.academian;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println("In side try block !!!");
		}finally {
			System.out.println("In side finally block !!!");
			notification();
		}

	}
	
	static void notification() {
		System.out.println("NOTIFICATION SENT !!!");
	}

}
