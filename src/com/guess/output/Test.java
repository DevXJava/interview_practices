package com.guess.output;

public class Test {
	int x;

    // Parameterized constructor
    Test(int i) {
        x = i;
    }
    // Default constructor
    Test() {
        x = 0;
    }
    public static void change(Test t) {
        t = new Test();  // This creates a new object that only lives in this method
        t.x = 10;        // Modifies the new object, not the original one
    }
	public static void main(String[] args) {
		Test t = new Test(5);   // Create object with x = 5
        change(t);              // Try to change it
        System.out.println(t.x); // Output the value of x

	}

}
