package com.interview.test;

public class VarArgExample {
	
	public static void varArgExample(String ... str) {
		// using var arg method over loading is not required 
		for (String string : str) {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		varArgExample();
		varArgExample("Deve");
		varArgExample("Devendra","Kumar","Rahangdale");

	}

}
