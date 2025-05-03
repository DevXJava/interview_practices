package com.interview.all;

public class DivergentTest {
	public void show(Object obj) {
		System.out.println("Object");
	}

	public void show(String string) {
		System.out.println("String");
	}

	public void show(Integer ints) {
		System.out.println("Integer");
	}

	public void show(int ins) {
		System.out.println("int");
	}

	public static void main(String[] args) {
		DivergentTest t = new DivergentTest();
        t.show("hello");     // Output?
        t.show(10);          // Output?
        t.show(new Integer(10)); // Output?
        t.show(3.14);        // Output?
         
//		Test t = new Test();
//        t.show(null);     // Output?
//        t.show(10);          // Output?
//        t.show(new Integer(10)); // Output?
//        t.show(3.14);        // Output?
	}

}
