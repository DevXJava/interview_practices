package com.academian;

public class TestM {
	
	public static String method() {
		try {
			System.out.println("A");
			return "B";
		} catch (Exception e) {
			return "C";
		}finally {
			System.out.println("D");
		}
		
	}

	public static void main(String[] args) {
		System.out.println(method());

	}

}
