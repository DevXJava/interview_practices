package com.interview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOperationByJavaEight_8 {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();

		hashMap.put(3, "Devendra");
		hashMap.put(1, "Kumar");
		hashMap.put(4, "Java");
		hashMap.put(6, "Python");
		hashMap.put(5, "Mysql");

		//1.0 get string contents
		Map<Integer, String> getFilteredValues = hashMap.entrySet().stream().filter(v1 -> v1.getValue().equalsIgnoreCase("Mysql"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		getFilteredValues.forEach((k, v) -> System.out.println("getFilteredValues : "+v));
		
		//1.1 Short by Values
		Map<Integer, String> shortByValues = hashMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(v1,v2)->v1,LinkedHashMap::new));
		shortByValues.forEach((k, v) -> System.out.println("By Values :  "+k+"  :  "+v));
		
		//1.2 short by Keys
		Map<Integer, String> shortByKey = hashMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(v1,v2)->v1,LinkedHashMap::new));
		
		shortByKey.forEach((k, v) -> System.out.println("By keys :  "+k+"  :  "+v));
		
		//1.3 short by Keys descending order
		LinkedHashMap<Integer, String> sortedByKeyDescOrder = hashMap.entrySet().stream()
			    .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
			    .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		sortedByKeyDescOrder.forEach((k, v) -> System.out.println("By keys desc :  "+k+"  :  "+v));

	}
}
