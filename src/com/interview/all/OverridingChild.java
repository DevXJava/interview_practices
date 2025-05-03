package com.interview.all;
class OverridingParent{
	
	public void methodOne() {
		System.out.println("methodOne from parent class ..");
	}
	public void methodTwo() {
		System.out.println("methodTwo from parent class ..");
	}
}
public class OverridingChild extends OverridingParent{
	public void methodOne() {
		System.out.println("methodOne from Child class ..");
	}
	public void methodTwo() {
		System.out.println("methodTwo from Child class ..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverridingParent parent = new OverridingChild();
		parent.methodOne();
		parent.methodTwo();

	}

}
