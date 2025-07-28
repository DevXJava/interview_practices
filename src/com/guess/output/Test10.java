package com.guess.output;

public class Test10 {
	int a;
	static int b;
	static {
		//a = 5; // here can not call non static variable to static block
		b = 7;
	}

	public Test10() {
		a = 10;
		b = 20;
	}

	public static void main(String[] args) {
		//System.out.println(a); // here can not call non static variable to static block
		System.out.println(b);

	}

}
