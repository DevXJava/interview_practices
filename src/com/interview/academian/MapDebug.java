package com.interview.academian;

import java.util.HashMap;
import java.util.Map;

public class MapDebug {

	public static void main(String[] args) {
		//Generating same hash code 
		//String s1 = "FB";
		//String s2 = "Ea";
		//System.out.println(s1.hashCode()+" : "+s2.hashCode());
		Map<String, Integer> map = new HashMap<>();
		//map.put(null, 1); //always it will store in zeroth index
		//Here both key is same so it will update value with same key
		/*map.put("bb", 1); 
		  map.put("bb", 2);
		  
		  // Testing Hashmap collision it will generate same hash code
		  map.put(s1, 1); 
		  map.put(s2, 2);
		
		 * map.put("aaa", 1); 
		 * map.put("bbb", 2); 
		 * map.put("ccc", 3); 
		 * map.put("ddd", 4);
		 */

		/*Now we are going to test capacity means threshold * capacity = size 
		 size will double automatically when capacity will more then 12 in hashmap
		*/
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.put("f", 6);
		map.put("g", 7);
		map.put("h", 8);
		map.put("i", 9);
		map.put("j", 10);
		map.put("k", 11);
		map.put("l", 12);
		map.put("m", 13);
		map.put("n", 14);
		
		String a = "FB"; // hashCode = 2236
		String b = "Ea"; // hashCode = 2236

		System.out.println(a.hashCode()); // 2236
		System.out.println(b.hashCode()); // 2236
		System.out.println(a.equals(b));  // false
		
		//Collision Demo
		Map<String, String> map1 = new HashMap<>();
		map1.put("FB", "Value1");
		map1.put("Ea", "Value2"); // Same hash, different key

		System.out.println(map1.get("FB")); // Value1
		System.out.println(map1.get("Ea")); // Value2

	}

}
