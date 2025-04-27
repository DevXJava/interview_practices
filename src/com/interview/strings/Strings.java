package com.interview.strings;

import java.util.Collection;
import java.util.Collections;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "knowledge";
	    String s = str;
		str = str.concat("base");
		System.out.println(str);
		
		Collections collections=null;
		Collection<String> collection=null;
		
		String s1 = new String("JAVA");
		String s2 = new String("JAVA");
		
		boolean operator = s1==s2;
		System.out.println("operator : "+operator);
		
		boolean equalsMethod = s1.equals(s2);
		System.out.println(" equalsMethod : "+equalsMethod);
		
		boolean hashCodeCompareOperator = s1.hashCode() == s2.hashCode();
		int s1HashCode = s1.hashCode();
		int s2HashCode = s2.hashCode();
		
		System.out.println(" s1HashCode :"+s1HashCode +" s2HashCode : "+s2HashCode);
		
		System.out.println("hashCodeCompareOperator : "+hashCodeCompareOperator);
		
		String s11 = "0-42L";
		 
		String s22 = "0-43-";

	}

}
