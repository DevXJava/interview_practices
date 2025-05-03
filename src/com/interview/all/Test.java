package com.interview.all;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		// input  JAVA_WORLD
		// output Java World

		String str = "JAVA_WORLD";

		String strArr = str.replace("_", " ");

		String s1[] = strArr.split(" ");
		
		if (s1[0].startsWith("J") && s1[1].startsWith("W")) {
			String s = s1[0];
			String sss = s.replace("JAVA", "Java") + " ";
			String ss = s1[1];
			String ssss = ss.replace("WORLD", "World");
			//System.out.print(sss+ssss);
			}
		
		// or we can use 

		for (int i = 0; i < s1.length; i++) {

			if (s1[i].startsWith("J")) {
				String s = s1[i];
				//System.out.print(s.replace("JAVA", "Java") + " ");
			}
			if (s1[i].startsWith("W")) {
				String s = s1[i];
				//System.out.print(s.replace("WORLD", "World"));
			}

		}
		
		//-----------------------------------------------
		HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
		hashMap.put(2, "dev");
		hashMap.put(7, "qa");
		hashMap.put(1, "pod");
		hashMap.put(5, "uat");
		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(hashMap.entrySet());
		Collections.sort(list,(i1,i2)->i1.getValue().compareTo(i2.getValue()));
		HashMap<Integer, String> map = new LinkedHashMap<Integer,String>();
		for(Map.Entry<Integer, String> entry:list) {
			map.put(entry.getKey(), entry.getValue());
		}
		
		map.forEach((k,v)->{System.out.println(k+" "+v);});
		

	}

}
