package com.interview.guess.output;

public class Test2 {

	public static void objectTypesParameter(String string) {
		System.out.println("string !");
	}
	public static void objectTypesParameter(StringBuffer stringBuffer) {
		System.out.println("string buffer !");
	}
	
	public static void objectTypesParameter(Object object) {
		System.out.println("object !");
	}
	
	
	public static void main(String[] args) {
		//objectTypesParameter(null);  o/p : Compile-time error: reference to objectTypeParameters(null) is ambiguous,ambiguity because for Two Child class of Object String and StringBuffer

	}

}
