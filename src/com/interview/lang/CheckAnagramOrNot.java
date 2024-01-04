package com.interview.lang;

import java.util.Arrays;

public class CheckAnagramOrNot {

    static boolean areAnagram(char[] str1,char[] str2) {
    	
    	int n1 = str1.length;
    	int n2 = str2.length;
    	if(n1!=n2)
    		return false;
    	Arrays.sort(str1);
    	Arrays.sort(str2);
    	
    	for(int i=0;i<n1;i++)
    		if(str1[i]!=str2[i])
    			return false;
    	return true;
    }
	
	
	public static void main(String[] args) {
		String s1 ="geeksforgeeks";
		String s2 ="forgeeksgeeks";
		char str1[] = s1.toCharArray();
        char str2[] = s2.toCharArray();
        boolean checking = CheckAnagramOrNot.areAnagram(str1, str2);
        System.out.println(checking);

	}

}
