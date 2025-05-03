package com.interview.all;

class Parenti {
	int x = 10;

	public void show() {
		System.out.println("Inside parent show method");
	}

	public void show1() {
		System.out.println("Inside parent show1 method");
	}

}

public class Childi extends Parenti {

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
		Parenti parenti = new Childi();
		// Child child = new Parent(); // child can not give reference to parent
		parenti.show();
		parenti.show1();
		// parent.display();
		System.out.println(parenti.x);
		Childi child = new Childi();
		child.print(10.0, 10); // it will give ambiguous 
		child.print(10, 10.0); 
	}

}
