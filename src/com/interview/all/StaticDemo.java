package com.interview.all;

public class StaticDemo {

	public StaticDemo() {

	}

	{
		System.out.println("I am normal block");

	}

	static {
		System.out.println("I am static block ...");
	}

	public static void staticMethod() {
		System.out.println(" I am stattic method");
	}

	public void normalMethod() {
		System.out.println("I m normal method ...");
	}

	public static void main(String[] args) {
		new StaticDemo();
		StaticDemo.staticMethod();
		StaticDemo demo = new StaticDemo();
		demo.normalMethod();

	}

}
