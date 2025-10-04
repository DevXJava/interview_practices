package com.interview.all;

@FunctionalInterface
interface Calculator {
	
	//abstract method
	int calculate(int a, int b);

	//default method
	default void message() {
		System.out.println("Hello how are you , I am default !!");
	}

	//static method
	static void staticTest() {
		System.out.println("Hello , I am static method !!");
	}
}

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		Calculator calculator = (a,b)->a+b;
		
		int sum = calculator.calculate(10, 20);
		System.out.println("sum is : "+sum);
		
		//calling default method
		calculator.message();
		
		//calling static method
		Calculator.staticTest();

	}

}
