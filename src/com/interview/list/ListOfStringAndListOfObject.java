package com.interview.list;

import java.util.ArrayList;
import java.util.List;

public class ListOfStringAndListOfObject {

	public static void main(String[] args) {
		List<Object> objects = new ArrayList<>();
		List<String> strings = new ArrayList<>();
		
		//objects = strings;  // It will give exception because string is not sub type of Object
		
		List<? extends Object> objects1 = new ArrayList<>();
		List<String> strings1 = new ArrayList<>();
		
		objects1 = strings1;

	}

}
