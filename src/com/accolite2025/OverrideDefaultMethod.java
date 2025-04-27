package com.accolite2025;

interface defaultMethodInterface{
	default void test() {
		System.out.println("I am defaultMethodInterface method");
	}
}

public class OverrideDefaultMethod implements defaultMethodInterface{
	
	public static void main(String[] args) {
		new OverrideDefaultMethod().test();

	}

	@Override
	public void test() {
		System.out.println("I am OverrideDefaultMethod class methdo ...");
	}
	
}
