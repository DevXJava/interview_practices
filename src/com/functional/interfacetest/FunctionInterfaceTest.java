package com.functional.interfacetest;
@FunctionalInterface
interface Maths{
	int add (int a,int b);
}
public class FunctionInterfaceTest {

	public static void main(String[] args) {
		
		Maths maths = (a,b)->a+b;
		int sum = maths.add(12, 12);
		System.out.println("sum is : "+sum);

	}
	/*
	Runnable –> This interface only contains the run() method.
	Comparable –> This interface only contains the compareTo() method.
	ActionListener –> This interface only contains the actionPerformed() method.
	Callable –> This interface only contains the call() method.
	  
	 */

}
