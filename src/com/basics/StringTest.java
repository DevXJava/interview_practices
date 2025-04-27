package com.basics;

public class StringTest {

	public static void main(String[] args) {
		String str = new String("JAVA").intern();
		 String str1 = "JAVA";

		 System.out.println(str.equals(str1));
		 System.out.println(str==str1);

	}

}
