package com.interview.guess.output;

public class Test27 {

	public void show(Object object) {
		System.out.println("hello i am object : "+object);
	}
	public void show(String string) {
		System.out.println("hello i am string : "+string);
	}
	public void show(Integer integer) {
		System.out.println("hello i am wrapper Integer : "+integer);
	}
	public void show(int ins) {
		System.out.println("hello i am primitive object : "+ins);
	}
	
	
	public static void main(String[] args) {
		Test27 test27 = new Test27();
		
		test27.show(new Object());
		test27.show("string");
		test27.show(100); // in both it will priority to primitive integer
		test27.show(500); // in both it will priority to primitive integer
		//test27.show(null); // It will compile time error because we have 2 object and both default value is null

	}

}
