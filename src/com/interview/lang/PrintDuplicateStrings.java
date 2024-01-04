package com.interview.lang;

public class PrintDuplicateStrings {

	public static void main(String[] args) {
		String [] names = {"Shraddha", "Suzie", "Shraddha", "Suzie","Shraddha", "Suzie","Shraddha","Shraddha","Shraddha","Sarika"};
        //Output - Shraddha, Suzie, Shraddha,Suzie, Shraddha,Shraddha,Shraddha
		for(int i=0;i<names.length;i++){
		   
		      if(names[i].equals("Shraddha")&&names[i]=="0"){
		    	  System.out.println(names[i]);
		       }
		    }
		    
		 }

}
