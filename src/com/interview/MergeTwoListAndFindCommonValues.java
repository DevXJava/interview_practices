package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MergeTwoListAndFindCommonValues {

	public static void main(String[] args) {
		List<String> l1= Arrays.asList("interview");
		 
		List<String> l2= Arrays.asList("interview","dev");
		
		List<String> merge = new ArrayList<>();
		
		merge.addAll(l1);
		merge.addAll(l2);
		
		System.out.println(merge);

		Set<String> set = new HashSet<String>();
		Set<String> l4 =  new HashSet<String>();
		l4 = merge.stream().filter(item->!set.add(item)).collect(Collectors.toSet());

		for(String str:l4){
		System.out.println(str);

		}

	}

}
