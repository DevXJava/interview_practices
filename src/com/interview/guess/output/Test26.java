package com.interview.guess.output;

public class Test26 {
	int x;

    // Parameterized constructor
    Test26(int i) {
        x = i;
    }
    // Default constructor
    Test26() {
        x = 0;
    }
    public static void change(Test26 t) {
        t = new Test26();  // This creates a new object that only lives in this method
        t.x = 10;        // Modifies the new object, not the original one
    }
	public static void main(String[] args) {
		Test26 t = new Test26(5);   // Create object with x = 5
        change(t);              // Try to change it
        System.out.println(t.x); // Output the value of x

	}

}
