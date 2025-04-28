package com.wipro27042025;

import java.util.Arrays;
import java.util.List;

public class SumOfNestedList {
	
	static int sumNestedList(List<Object> list) {
		return list.stream().mapToInt(obj->{
			
			if(obj instanceof Integer) {
				return  (Integer) obj; // Type casting object to integer 
				
			}else if(obj instanceof List) {
				
				return sumNestedList( (List<Object>) obj);
			}else {
				return 0;
			}
		}).sum();
	}
	
	public static void main(String[] args) {
		
		List<Object> list = Arrays.asList(1,Arrays.asList(2,3),Arrays.asList(4,Arrays.asList(5,6)));
		
		int sum = sumNestedList(list);
		
		System.out.println("sum is : "+sum);
		
		

	}

}
