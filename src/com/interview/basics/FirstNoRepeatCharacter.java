package com.interview.basic;

public class FirstNoRepeatCharacter {

	public static void main(String[] args) {
		String string = "devendra";
		Character result = '\0';
		for (int i = 0; i < string.length(); i++) {
			//boolean isRepeating = false;
			int count =0;
			for (int j = 0; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j) && i != j) {
					//isRepeating = true;
					count++;
					break;
				}
			}
			if (count==0) { //!isRepeating
				result = string.charAt(i);
				System.out.println("first non repaeat  character is : " + result);
				return;
			}
		}

	}

}
