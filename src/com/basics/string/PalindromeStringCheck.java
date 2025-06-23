package com.basics.string;

public class PalindromeStringCheck {

	public static void main(String[] args) {
		String string = "madam";
		String cleanedStr = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String reversed = string.chars().mapToObj(c->String.valueOf((char)c)).reduce("", (a,b)->b+a);
		
		if(cleanedStr.equals(reversed)) {
			System.out.println("its is palindrom !!!");
		}else {
			System.out.println("Not palibdrom !!!!");
		}
		

	}

}
