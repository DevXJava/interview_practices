package com.interview.interview;

class Parent {
	int x = 10;

	public void show() {
		System.out.println("Inside parent show method");
	}

	public void show1() {
		System.out.println("Inside parent show1 method");
	}

}

public class Child extends Parent {

	int x = 20;

	@Override
	public void show() {
		System.out.println("Inside child show method");

	}

	public void display() {
		System.out.println("Inside child display method");
	}

	void print(double i, int j) {
		System.out.println("This is meth1");
	}

	void print(int i, double j) {
		System.out.println("This is meth2");
	}

	public static void main(String[] args) {
		Parent parent = new Child();
		// Child child = new Parent(); // child can not give reference to parent
		parent.show();
		parent.show1();
		// parent.display();
		System.out.println(parent.x);
		Child child = new Child();
		child.print(10.0, 10); // it will give ambiguous 
		child.print(10, 10.0); 
	}

}
