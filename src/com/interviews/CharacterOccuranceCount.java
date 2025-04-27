package com.interviews;

import java.util.HashMap;

public class CharacterOccuranceCount {

	public static void main(String[] args) {
		String string = "devendra kumar rahangdale";
		HashMap<Character, Integer> hashMap = new HashMap<>();
	    char[] toArrays = string.toCharArray();
	    for (char c : toArrays) {
	      if(hashMap.containsKey(c)) {
	    	  hashMap.put(c, hashMap.get(c)+1);
	      }else {
	    	  hashMap.put(c, 1);
	      }
		}
	    System.out.println("map is :"+hashMap);
				

	}

}
