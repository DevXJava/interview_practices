package com.interview.basic;

public class ReverseString {

	public static void main(String[] args) {
		String string = "devendra";
		String reverse = "";
		for(int i=string.length()-1;i>=0;i--) {
			reverse = reverse + string.charAt(i);
		}
         System.out.println("reverse : "+reverse);
         
         System.out.println("=========Another way===================");
         String reversed2 = new StringBuilder(string).reverse().toString();
         System.out.println("reversed2 : "+reversed2);
	}

}
