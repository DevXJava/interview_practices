package com.interview.lang;

public class TypeCastingDownCastingAndUpcasting {
	
//byte=>short=>int=>long=>float=>double [its a up casting or widening cast]
	public static void main(String[] args) {
		
		byte b = 123;
		short s =12;
		
		short c = (short)b; //up casting
		
		int i = 2345;
		double d = (double)i; // up casting
		
		double dd = 123456.789;
		System.out.println("only double is :"+dd);
		
		int ii = (int) dd; //it a down casting
		System.out.println("down casting is :"+ii);
		

	}

}
