package com.academian;

public class GfG {

	public static void main(String args[]) { 
		String s1 = new String("geeksforgeeks"); 
		String s2 = new String("geeksforgeeks"); 
		String s3 ="geeksforgeeks";
		if (s1 != s2) { //comparing object
			System.out.println("Equal"); 
		}else {
			System.out.println("Not equal"); 
		}
		System.out.println(s1.hashCode()+"     "+s3.hashCode());
		
		
		if (s1.equals(s3)) {  //comparing contents
			System.out.println("Equal"); 
		}else {
			System.out.println("Not equal"); 
		}
		
		System.out.println(s1+"     "+s3);
	} 

}
