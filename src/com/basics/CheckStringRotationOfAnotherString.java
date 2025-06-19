package com.basics;

public class CheckStringRotationOfAnotherString {

	public static boolean isRotation(String s1, String s2) {
		// Check lengths and non-null
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}

		// Combine s1 with itself and check if s2 is substring
		String combined = s1 + s1;
		return combined.contains(s2);
	}

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "cdab";  
		if (isRotation(s1, s2)) {
			System.out.println(s2 + " is a rotation of " + s1);
		} else {
			System.out.println(s2 + " is NOT a rotation of " + s1);
		}

	}

}
