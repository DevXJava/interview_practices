package com.interview.staticblock.test;

public class StaticFlowParentChild {
	static int i = 10;
	static {
		System.out.println("first static block...");
	}

	public static void main(String[] args) {
       methodOne();
       System.out.println("main method...");
	}

	public static void methodOne() {
      System.out.println("method one ..."+j);
	}

	static {
		System.out.println("second static block ...");
	}
	
	static int j=20;
  
}
