package com.interview.all;

public class CalculateValueOfPiUsingFirstNGivenFormula {

	// Function to calculate PI
	static double calculatePI(double PI, double n, double sign) {
		// Add for 1000000 terms
		for (int i = 0; i <= 1000000; i++) {
			PI = PI + (sign * (4 / ((n) * (n + 1) * (n + 2))));

			// Addition and subtraction
			// of alternate sequences
			sign = sign * (-1);

			// Increment by 2 according to formula
			n += 2;
		}

		// Return the value of Pi
		return PI;
	}

	public static void main(String[] args) {
		// Initialise sum=3, n=2, and sign=1
			    double PI = 3, n = 2, sign = 1;
			 
			    // Function call
			    System.out.print("The approximation of Pi is ");
			    System.out.printf("%.8f%n", calculatePI(PI, n, sign));

	}

}
