package com.interview.guess.output;

class Exam {
	String value;

	public void processString(String value) {
		int len = this.value.length();
		try {
			throw new Exception("process error");
		} catch (Exception e) {
			System.out.println("Caught in processString: " + e.getMessage());
		} finally {
			System.out.println("Finally in processString");
		}
	}
}

public class Test21 {

	public static void main(String[] args) {
		try {
			new Exam().processString("hii");
		} catch (Exception e) {
			System.out.println("Caught in Main: " + e.getMessage());
		} finally {
			System.out.println("Finally in Main");
		}
		
		new Exam().processString("hii");

	}
}
