package com.interview.object.classes;

public class Test {
	int x;
	public Test(int x) {
		
	}

	
	public Object clone() {
		
		Test test = new Test(this.x);
		return test;
		
	}
	
	public String toString() {
		return ""+x;
	}
	
	public static void main(String[] args) {
		
		Test test = new Test(56);
	
		

	}

}
