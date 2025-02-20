package com.academian;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashMapVsIdentyHashMap {
	static {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String key1 = new String("Dev");
		String key2 = new String("Dev");
		map.put(key1, 10);
		map.put(key2, 20);
		
		System.out.println("map ================: "+map);
		
		Map<String, Integer> imap = new IdentityHashMap();
		String ikey1 = new String("Dev");
		String ikey2 = new String("Dev");
		imap.put(ikey1, 10);
		imap.put(ikey2, 20);
		
		System.out.println("imap ================: "+imap);
		
		

	}

}
