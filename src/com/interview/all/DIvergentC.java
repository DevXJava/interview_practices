package com.interview.all;

class A {
	void show() {
		System.out.println("A");
	}
}

class B extends A {
	void show() {
		System.out.println("B");
	}
}

public class DIvergentC extends B{
	void show() {
		System.out.println("C");
	}

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		DIvergentC c = new DIvergentC();
		A a1 = new B(); // its possible Here Parent is holding Child property
		//C c1 = new A(); // here Child giving property to Parent 
		//B b1 = new A(); // Child can not hold parent property

	}

}
