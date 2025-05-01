package com.interview.lang;

public class PalindromCheckString {
	
	public static boolean isPalindrom(String str) {
		String rev="";
		boolean ans=false;
		for (int i = str.length()-1; i>=0; i--) {
			
			rev = rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			return true;
		}
		return ans;
	}

	public static void main(String[] args) {
		
		String str="nayan";
		
		boolean checking = PalindromCheckString.isPalindrom(str);
		System.out.println("is it palindrom : "+checking);

	}

}
