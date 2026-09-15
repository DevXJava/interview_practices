package com.interview;

public class CountStringWithSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "VVTTVVVTTTUUU";
		int count;
		for(int i=0;i<str.length();i++) {
			count=1;
			while(i+1<str.length()&&str.charAt(i)==str.charAt(i+1)) {
				i++;
				count++;
			}
			System.out.println(str.charAt(i)+"   "+count);
		}
		

	}

}
