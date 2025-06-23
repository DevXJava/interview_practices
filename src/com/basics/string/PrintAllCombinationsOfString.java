package com.basics.string;

public class PrintAllCombinationsOfString {

	public static void generateCombination(String string, String result) {
		if (string.length() == 0) {
			System.out.println("result is : " + result);
			return;
		}
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			String remaining = string.substring(0, i) + string.substring(i + 1);
			generateCombination(remaining, result+ch);

		}
	}

	public static void main(String[] args) {
		String str = "ABC";
		String result = "";
		 System.out.println("Combinations of " + str + " are:");
		generateCombination(str, result);
		

	}

}
