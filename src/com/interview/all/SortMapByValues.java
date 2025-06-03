package com.interview.all;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValues {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
		hashMap.put(2, "bev");
		hashMap.put(7, "aa");
		hashMap.put(1, "cod");
		hashMap.put(5, "dat");
		
		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(hashMap.entrySet());
		
		Collections.sort(list,(v1,v2)->v1.getValue().compareTo(v2.getValue()));
		
		HashMap<Integer, String> map = new LinkedHashMap<>();
		
		for(Map.Entry<Integer, String> entry : list) {
			map.put(entry.getKey(), entry.getValue());
		}

		map.forEach((k,v)->{System.out.println(k+" "+v);});
		
		
		
		// ===================Second way=========================
				HashMap<Integer, String> shortedhashMap = map.entrySet().stream()
						.sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
						.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

				shortedhashMap.forEach((k, v) -> {
					System.out.println(k + " " + v);
				});
	}

}
