package com.interview.all;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {

	public static void main(String[] args) {
		
		//input
		int a[]={1,0,1,0,1,0,1,0};
		//output ={1,1,1,1,0,0,0,0};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) { 
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int k=0;k<a.length;k++) {
			System.out.print(" "+a[k]);
		}
		
		
		//ip = 1,2,3,4,5
		//out =5,10,15,20,25
				
	    List<Integer> list = Arrays.asList(1,2,3,4,5);
	    
	    List<Integer> upList = list.stream().map(b -> b*4).collect(Collectors.toList());
	    System.out.println(upList);
	    
			
	}

}
