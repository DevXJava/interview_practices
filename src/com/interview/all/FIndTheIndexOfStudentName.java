package com.interview.all;

import java.util.Arrays;
import java.util.List;

public class FIndTheIndexOfStudentName {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Devendra","Java","Spring Boot");
		int index = -1;
		for(int i =0;i<names.size();i++) {
			if(names.get(i).equalsIgnoreCase("Java")) {
				index = i;
			}
		}
		
		System.out.println("actual target is :"+index);

	}

}
