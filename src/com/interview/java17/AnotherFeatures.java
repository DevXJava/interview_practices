package com.interview.java17;

public class AnotherFeatures {

	public static void main(String[] args) {
		//1. Old way
		String json = """
			    {
			      "name": "Alice",
			      "age": 25,
			      "city": "New York"
			    }
			    """;
			System.out.println(json);
			// Using java 17
			String text = """
			        Line 1
			            Line 2
			        Line 3
			        """.stripIndent();

			System.out.println(text);
			
			//Enhance in instanceof operator 
			//2. Old way 
			Object obj = "Hello, Java 17!";

			if (obj instanceof String) {
			    String str = (String) obj;  // Manual casting required
			    System.out.println(str.toUpperCase());
			}
			//using java 17
			Object obj1 = "Hello, Java 17!";

			if (obj1 instanceof String str) {  // Direct variable declaration
			    System.out.println(str.toUpperCase());
			}
			
			//3. before java 17
			Object obj2 = 42;

			if (obj2 instanceof Integer) {
			    Integer num = (Integer) obj2;
			    if (num > 10) {
			        System.out.println("Number is greater than 10");
			    }
			}
			//With Java 17
			Object obj3 = 42;

			if (obj3 instanceof Integer num && num > 10) {
			    System.out.println("Number is greater than 10");
			}

		   //4.
			Object obj4 = null;

			if (obj4 instanceof String str) { //  No need for explicit null checks
			    System.out.println(str.toUpperCase());  // This won't execute
			} else {
			    System.out.println("Object is null"); 
			}
	}

}
