package com.interview.all;

abstract class AbstractTest {

	public AbstractTest(int a, int b) {

	}

	public abstract int sum(int a, int b);

	public int mult(int a, int b) {
		System.out.println("Hi i am mult method");
		return a * b;
	}
}

public class AbstractClassObject extends AbstractTest{
	
	
	public AbstractClassObject(int a, int b) {
		super(a, b);
		System.out.println("super values : "+a+" :  "+b);
		
	}
	
	@Override
	public int sum(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
     AbstractTest  abstractTest = new AbstractClassObject(10,20);
     int sum = abstractTest.sum(10, 20);
     System.out.println("sum is : "+sum);
     
     int mult =  abstractTest.mult(10, 10);
     System.out.println("mult is : "+mult);
	}

	
}
