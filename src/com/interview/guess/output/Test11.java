package com.interview.guess.output;

import java.util.HashMap;
import java.util.Map;

public class Test11 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("Key1","Key2");
		map.put("Key2","Key3");
		System.out.println(map.get("Key3")); // null
	}

}
