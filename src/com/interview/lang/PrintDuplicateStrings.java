package com.interview.lang;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateStrings {

	public static void main(String[] args) {
		String [] names = {"Shraddha", "Suzie", "Shraddha", "Suzie","Shraddha", "Suzie","Shraddha","Shraddha","Shraddha","Sarika"};
        //Output - Shraddha, Suzie, Shraddha,Suzie, Shraddha,Shraddha,Shraddha
//		for(int i=0;i<names.length;i++){
//		   
//		      if(names[i].equals("Shraddha")&&names[i]=="0"){
//		    	  System.out.println(names[i]);
//		       }
//		    }
		
		Map<String, Integer> countMap = new HashMap<>();

        // First pass: count occurrences
        for (String name : names) {
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
            System.out.println(name+"  :  "+countMap.getOrDefault(name, 0) + 1);
        }

        // Second pass: print only duplicates in original order
        for (String name : names) {
            if (countMap.get(name) > 1) {
                System.out.print(name + ", ");
            }
        }
		    
		 }

}
