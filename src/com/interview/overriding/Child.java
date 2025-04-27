package com.interview.overriding;
class Parent{
	
	public void methodOne() {
		System.out.println("methodOne from parent class ..");
	}
	public void methodTwo() {
		System.out.println("methodTwo from parent class ..");
	}
}
public class Child extends Parent{
	public void methodOne() {
		System.out.println("methodOne from Child class ..");
	}
	public void methodTwo() {
		System.out.println("methodTwo from Child class ..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent parent = new Child();
		parent.methodOne();
		parent.methodTwo();

	}

}
