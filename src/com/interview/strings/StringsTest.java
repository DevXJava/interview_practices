package com.interview.strings;

public class StringsTest {

	public static void main(String[] args) {
		String s1 = "codejavadevendra";
		String s2 = "codejava";
		System.out.println(s1 == s2);

		String s3 = new String("code");
		String s4 = new String("code");
		System.out.println(s3 == s1);

		System.out.println(s1.equals(s4));
		// count repetition of a
		int count = 0;
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a') {
				count++;
			}
		}
		System.out.println(" " + count);

	}

}