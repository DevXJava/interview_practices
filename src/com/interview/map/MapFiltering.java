package com.interview.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapFiltering {
	

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(3);
		list1.add(2);
		list1.add(4);
		list1.add(6);
		List<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(7);
		list2.add(9);
		list2.add(8);
		list2.add(10);

		Map<String, List<Integer>> map = new HashMap<>();
		map.put("even", list1);
		map.put("odd", list2);
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();

		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, List<Integer>> entry = (Map.Entry<String, List<Integer>>) iterator.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());

			for (Integer integer : entry.getValue()) {
				if (integer % 2 == 0) {
					even.add(integer);
				} else if (integer % 2 != 0) {
					odd.add(integer);
				}
				
				if(entry.getKey().equals("even")) {
					map.put("even", even);
				}else if(entry.getKey().equals("odd")){
					map.put("odd", odd);
				}
			}
		}

		System.out.println("even : " + even + "    " + "  odd :" + odd);

		
		System.out.println("map is :"+map);
	}

}
