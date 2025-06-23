package com.basics.string;

public class FibonacciSeries {

	public static void fibonacciNormal() {
		int n = 10; // Number of terms
		int a = 0, b = 1;

		System.out.print("Fibonacci Series up to " + n + " terms: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
	}

	public static int fibonacciRecursive(int n) {
		if (n <= 1)
			return n;
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

	}

	public static void main(String[] args) {
		int n = 10;
		System.out.print("Fibonacci Series using recursion: ");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacciRecursive(i) + " ");
		}

	}

}
