package com.interview;

public class UseOfFinalClass {

	public static void main(String[] args) {
		FinalClassExample finalClassExample = new FinalClassExample(1, "John", "London");
		finalClassExample = new FinalClassExample(1, "John", "London");
		System.out.println(finalClassExample.getAddress());
		
		//1. Final means that you can't change the object reference to point to another reference or another object, but you can still mutate its state (by using the setter method). Where immutable means that the object's actual value can't be changed, but you can change its reference to another one.
		final StringBuffer sb = new StringBuffer("Hello");
		 
        // Even though reference variable sb is final
        // We can perform any changes
        sb.append("GFG");
 
        System.out.println(sb);
 
        // Here we will get Compile time error
        // Because reassignment is not possible for final variable
        //sb = new StringBuffer("Hello World");
 
        System.out.println(sb);

	}

}
