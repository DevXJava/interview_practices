package com.interview.guess.output;

import java.util.ArrayList;
import java.util.List;

public class Test19 {

	public static void main(String[] args) {
		List<Object> listObj = new ArrayList<>();
		List<String> listStr = new ArrayList<>();
		
		//👉 Meaning: List<String> is NOT a subtype of List<Object> — even though String is a subtype of Object
		//listObj = listStr;   This is the question 
		
		
		
		List<? extends Object> listObj1 = new ArrayList<String>();
		List<String> listStr1 = new ArrayList<>();
		
		listObj1 = listStr1;  
		
		List<Object> listObj2 = new ArrayList<>(listStr); //Option 2: Copy elements
		
		//? super String = a list that can accept Strings safely, but when you read from it, you only get Objects.
		List<? super String> listObj3 = new ArrayList<Object>(); //✅ Option 3: Use upper/lower bounds (depends on use case)
		listObj3.add("string");
		
		
	}
}
