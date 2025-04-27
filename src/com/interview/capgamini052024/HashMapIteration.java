package com.interview.capgamini052024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "deve");
		map.put(8, "deve");
		map.put(2, "deve");
		map.put(4, "deve");
		
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) iterator.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		map.forEach((k,v)->System.out.println(k+"  "+v));
		

	}

}
