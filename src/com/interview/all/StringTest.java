package com.interview.all;

public class StringTest {
	public static void stringTest() {
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
	public static void main(String[] args) {
		String a = "Java";
		String s = new String("Java");
		System.out.println(a.equals(s)); // true

		String b = "Java";
		System.out.println(a.equals(b)); // true

		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1 == s2); //false because we are comparing object by == operator
		System.out.println(s1+"  "+s2);
		

		int arr[] = { 1, 3, 5, 7, 4 };
		int target = 9;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == 10) {

					System.out.println(arr[i]+"  "+arr[j]);

				}

			}
		}
		
		
	}

}
