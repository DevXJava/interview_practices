package com.interview;

import java.util.Arrays;

public class AnagramProgram {

	public AnagramProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String str = "abc";
        String str1 = "acb";
        
        char ch[] = str.toCharArray();
        char ch1[] = str1.toCharArray();
        
        boolean flag = false;
        for(int i = 0;i<ch.length;i++){
            for(int j = i+1;j<ch1.length;j++){
                if(ch[i]==ch1[j]){
                    flag = true;
                }else {
                	flag = false;
                }
            }
            
        }
        if(flag==true){
            System.out.println("String are anagram ");
        }else {
        	System.out.println("String are not anagram ");
        }
        
        //=========================================================
        String str2 = "race";
        String str3 = "care";

        // Check if the strings are the same length
        if (str2.length() != str3.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }

        // Convert the strings to lowercase
        str2 = str2.toLowerCase();
        str3 = str3.toLowerCase();

        // Sort the strings
        char[] arr1 = str2.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str3.toCharArray();
        Arrays.sort(arr2);

        // Check if the sorted strings are equal
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

	}

}
