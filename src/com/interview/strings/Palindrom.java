package com.interview.strings;

public class Palindrom {

	public static void main(String[] args) {
		String originStr="nayand";
		String reversed = "";
		for (int i = originStr.length()-1; i>=0; i--) {
			reversed=reversed+originStr.charAt(i);
			
		}
		if(originStr.equalsIgnoreCase(reversed)) {
			System.out.println("String is palindrom ...");
		}else {
			System.out.println("Its not palindrom ....");
		}

	}

}
