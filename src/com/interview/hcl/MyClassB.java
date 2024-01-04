package com.interview.hcl;

class MyClassA {

	static int num = 10;

	static {

		int a = 10, b = 20;

		num = b;

		System.out.println(a + b);

	}

	public MyClassA() {

		System.out.println(++num);

	}

}

public class MyClassB extends MyClassA {

	static {

		int x = 20, y = 50;

		System.out.println(x + y);

	}

	public static void main(String[] args) {

		MyClassB bObj = new MyClassB();
		

	}

}