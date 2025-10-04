package com.interview.all;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapSynchronization {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");

		// wrap with synchronized Map
		Map<Integer, String> synchMap = Collections.synchronizedMap(map);

		// multiple operation safely: check then put
		synchronized (synchMap) {
			if (!synchMap.containsKey(3)) {
				synchMap.put(3, "Papaya");
			}
		}

		// safe iteration + modification
		synchronized (synchMap) {
			Iterator<Map.Entry<Integer, String>> iterator = synchMap.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<Integer, String> entry = iterator.next();
				if (entry.getValue().equals("Banana")) {
					iterator.remove();
				}
			}

		}

		// while iterating, you must synchronize manually
		synchronized (synchMap) {
			for (Map.Entry<Integer, String> entry : synchMap.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
		
		
		/*
		 Input String : Java Concept Of The Day
         Output String : Day The Of Concept Java
		 
		 */
		
		String str = "Day The Of Concept Java";
		String reversed = Arrays.stream(str.split(" ")).collect(Collectors.collectingAndThen(Collectors.toList(),list->{
			Collections.reverse(list);
			return list.stream();
		})).collect(Collectors.joining(" "));
		
		//reverse each word 
		String reveseEachWord = Arrays.stream(str.split(" ")).map(s->new StringBuilder(s).reverse().toString()).collect(Collectors.joining(" "));
		System.out.println(reversed + " : "+reveseEachWord);

	}

}
