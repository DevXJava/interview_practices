package com.guess.output;

public class Test15 {

	public static void main(String[] args) {
		try {
			String str = null;
			str.trim();
		} catch (Exception ex) {
			System.out.println("Exception Handled");
			// } catch (NullPointerException ex) { // compile time exception
			// System.out.println("Null Pointer Exception Handled");
			// }

		}
	}
}
