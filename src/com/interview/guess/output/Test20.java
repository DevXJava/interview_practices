package com.interview.guess.output;

public class Test20 {
	public static void main(String[] args) {
		String s1 = "March";
		String s2 = "March";
		String s3 = s1;
		
		s1 = "April";
		s2.concat("May");
		String newS3 = s3.concat("June");
		
		System.out.println(s1);//April
		System.out.println(s2); //March
		System.out.println(s3); //March
		System.out.println(newS3); //MarchJune
		
				
	}

}
