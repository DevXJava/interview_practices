package com.interview.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterator {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Deve");
		map.put(5, "Dev");
		map.put(4, "De");
		map.put(2, "D");
		map.put(1, "Devendra");
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
		  Map.Entry<Integer, String>  entry = (Map.Entry<Integer, String>)iterator.next();
		  System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		// Another way
		map.forEach((k,v) -> System.out.println(k+"   "+v));

	}

}
