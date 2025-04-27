package com.strings.methods;

public class StringTest {
	
	public static void main(String[] args) {
		String string = "John DEER Tractors";
		String string2 = "John DEER Tractors";
		//1.
		char ch = string.charAt(0);
		System.out.println("char at is : "+ch);
		
		//2.
		System.out.println("-----------------------------------");
		int compareto = string.compareTo(string2);
		System.out.println("compare to is : "+compareto);
		
		//3.
		System.out.println("-----------------------------------");
		String s1="java string";    
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
		s1.concat("is immutable");    
		System.out.println(s1);    
		s1=s1.concat(" is immutable so assign it explicitly");    
		System.out.println(s1); 
		
		//4.
		System.out.println("-----------------------------------");
		String name="what do you know about me";  
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("about"));  
		System.out.println(name.contains("hello"));  
		
		//5.
		System.out.println("-----------------------------------");
		String s2="java by javatpoint";  
		System.out.println(s2.endsWith("t"));  
		System.out.println(s2.endsWith("point"));
		
		//6.
		System.out.println("-----------------------------------");
		String s11="javatpoint";  
		String s22="javatpoint";  
		String s33="JAVATPOINT";  
		String s44="python";  
		System.out.println(s11.equals(s22));//true because content and case is same  
		System.out.println(s11.equals(s33));//false because case is not same  
		System.out.println(s11.equals(s44));//false because content is not same 
	}

}
