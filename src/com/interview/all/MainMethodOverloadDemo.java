package com.interview.all;

public class MainMethodOverloadDemo {

	public static void main(String arg) {
        System.out.println("Overloaded main with String: " + arg);
    }

    public static void main(int num) {
        System.out.println("Overloaded main with int: " + num);
    }
	public static void main(String[] args) {
		System.out.println("Main method with String[] args");
        main("Hello");
        main(100);

	}
	
	

}
