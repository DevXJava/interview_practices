package com.interview.guess.output;

import java.util.HashMap;
import java.util.Map;

public class Test12 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put(null, "first");
		map.put(null, "second");
		/*
		 As Hashmap allow one null key and multiple null values. 
		 Internally, the null key is treated as a special case and stored in a designated bucket.
		 Here as you try to put another entry with a null key, it will overwrite the first value.
		 So, answer will be - second 
		  */
		System.out.println(map.get(null));

	}

}
