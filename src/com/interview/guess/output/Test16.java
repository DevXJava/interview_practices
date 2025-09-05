package com.interview.guess.output;

class A {

	void a1() {
		B b = new B();
		try {
			System.out.println("try block");
			b.b1();
		} catch (NullPointerException e) {
			System.out.println("catch block");
		}
	}
}

class B {
	void b1() throws ArithmeticException {
		System.out.println("B1 method");
	}
}

public class Test16 {
	public static void main(String[] args) {
		A a = new A();
		a.a1();
	}
}
