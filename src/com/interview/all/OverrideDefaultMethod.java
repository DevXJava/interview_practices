package com.interview.all;

interface defaultMethodInterface{
	default void test() {
		System.out.println("I am default Method Interface method");
	}
}

public class OverrideDefaultMethod implements defaultMethodInterface{
	
	public static void main(String[] args) {
		new OverrideDefaultMethod().test();

	}

	@Override
	public void test() {
		System.out.println("I am Override Default Method class methdo ...");
	}
	
}
