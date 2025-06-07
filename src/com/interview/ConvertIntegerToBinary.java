package com.interview;

public class ConvertIntegerToBinary {
	
	public static void usingInBuiltMethod() {
		int num =15;
		String binary = Integer.toBinaryString(num);
	}

	public static void main(String[] args) {
		int number = 15;
        String binary = "";

        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;  // Prepend remainder
            number = number / 2;
        }

        System.out.println("Binary of 15 is: " + binary);  // Output: 1111

	}

}
