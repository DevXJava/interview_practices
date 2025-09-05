package com.interview.javaconceptoftheday.tricky;

public class MethodOverloading {

	public static void hello(String str) {
		System.out.println("String parameter");
	}
	public static void hello(Object object) {
		System.out.println("Object parameter");
	}
	public static void hello(StringBuffer stringBuffer) {
		System.out.println("Object parameter");
	}
	
	public static void main(String[] args) {
		//hello(null);   //with single child parameter of Object class method its working fine 

	}

}
