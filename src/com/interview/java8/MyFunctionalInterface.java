package com.interview.java8;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	void m1();
	
	default void m2() {
		System.out.println("default method 1");
	}
	
	default void m3() {
		System.out.println("default method 2");
	}
	
	default void m4() {
		System.out.println("default method 3");
	}

}
