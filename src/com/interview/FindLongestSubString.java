package com.interview;

import java.util.HashSet;

public class FindLongestSubString {

	public static void main(String[] args) {
		String string = "devendra";
		String longest = longest(string);
		System.out.println(longest);

	}

	private static String longest(String string) {
		String longestOverAll = " ";
		String longestTillNow = " ";
		HashSet<Character> set = new HashSet<>();
		for(int i=0;i<string.length();i++) {
			char c = string.charAt(i);
			if(set.contains(c)) {
				longestTillNow =" ";
				set.clear();
			}
			set.add(c);
			longestTillNow +=c;
			if(longestTillNow.length()>longestOverAll.length()) {
				longestOverAll = longestTillNow;
			}
		}
		return longestOverAll;
	}

}
