package com.interview.java8;

interface Calculater {
	// An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
       System.out.println("Hello");
    }
}

public class LamdaFunctionImpl {

	public static void main(String[] args) {
		Calculater calculater = (int x) -> 	System.out.println(2*x);
		
		calculater.abstractFun(5);
	}

}
