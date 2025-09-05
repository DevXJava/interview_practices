package com.interview.java8;
@FunctionalInterface
interface Maths{
	int add (int a,int b);
	
	default int sub(int a,int b) {
		int sub = a-b;
		return sub;
	}
	default int multiPly(int a,int b) {
		int mult = a*b;
		return mult;
	}
}
public class FunctionInterfaceTest {

	public static void main(String[] args) {
		
		Maths maths = (a,b)->a+b;
		int sum = maths.add(12, 12);
		System.out.println("sum is : "+sum);
		
		Maths math = (a,b) ->a*b;
		
		int ml = math.multiPly(12, 12);

	}
	/*
	Runnable –> This interface only contains the run() method.
	Comparable –> This interface only contains the compareTo() method.
	ActionListener –> This interface only contains the actionPerformed() method.
	Callable –> This interface only contains the call() method.
	  
	 */

}
