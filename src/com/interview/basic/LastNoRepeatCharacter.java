package com.interview.basic;

public class LastNoRepeatCharacter {

	public static void main(String[] args) {
		String string = "devendra";

		for (int i = string.length() - 1; i >= 0; i--) {
			int count = 0;
			for (int j = 0; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j) && i != j) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.println("Last non repeated character is : " + string.charAt(i) + " index is :" + i);
				break;
			}
		}

	}

}
