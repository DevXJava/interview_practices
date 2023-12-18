package com.interviews;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ShortMapByValues {

	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<>();
		hashmap.put(22, "A");
		hashmap.put(55, "B");
		hashmap.put(33, "Z");
		hashmap.put(44, "M");
		hashmap.put(99, "I");
		hashmap.put(88, "X");

		Map<Integer, String> map = hashmap.entrySet()
				      .stream()
				      .sorted(Map.Entry.comparingByValue())
	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));
	 map.forEach((k, v) -> System.out.println(k + "  :   " + v));

	}

}
