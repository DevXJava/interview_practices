package com.interview.strings;

public class HarryPotterStringCut {
    static int itarations =0;
	public static String shiftString(String str,int shiftCount) {
		String result="";
		
		result = str.substring(str.length()-shiftCount, str.length())+str.substring(0,str.length()-shiftCount); 
		
		
		return result;
	}
	
	public static void findRotation(String str,int harryCuts,int potterCuts) {
		String afterCuts = str;
		while(true) {
		 itarations ++;
		 if(shiftString(afterCuts, harryCuts).equals(str)) {
			 itarations ++;
			 break;
		 }
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
