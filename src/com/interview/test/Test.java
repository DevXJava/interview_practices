package com.interview.test;

public class Test {

	public static void methodOne(boolean i) {
		System.out.println("i am boolean :"+i);
	}
	public static void methodOne(byte i) {
		System.out.println("I am byte :"+i);
	}
	public static void methodOne(char i) {
		System.out.println("I am char :"+i);
	}
	public static void methodOne(short i) {
		System.out.println("I am short :"+i);
	}
	public static void methodOne(int i) {
		System.out.println("I am int :"+i);
	}
	public static void methodOne(long i) {
		System.out.println("I am long :"+i);
	}
	public static void methodOne(double i) {
		System.out.println("I am double :"+i);
	}
	
	public static void  methodOne(String str) {
		System.out.println("I am String");
	}
	public static void methodOne(StringBuffer strbfr) {
		System.out.println("I am StringBuffer ");
	}
	public static void methodOne(Object obj) {
		System.out.println("I am Object ");
	}
	
	
	public static void main(String[] args) {
		//Test.methodOne(null);   it is ambiguous 

	}

}
