package com.interview.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SortHashMapByValue {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(2, "dev");
		map.put(7, "qa");
		map.put(1, "pod");
		map.put(5, "uat");

		HashMap<Integer, String> hashMap = map.entrySet().stream()
				.sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		hashMap.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
//=========================Second Way=======================================================
		// Create a list from elements of HashMap
		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(map.entrySet());

		// Sort the list using lambda expression
		Collections.sort(list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));

		// put data from sorted list to hashmap
		HashMap<Integer, String> temp = new LinkedHashMap<Integer, String>();
		for (Map.Entry<Integer, String> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		
		

	}

}
