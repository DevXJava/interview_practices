package com.interview.map;
import java.util.*;
public class TestMapSize {

	public static void main(String[] args) {
	  Map map = new HashMap();
	  
	  map.put(new String("Dayanand"),  "Hi");
	  map.put(new String("Dayanand"),  "Hello");
	  
	  System.out.println("map size is :"+map.size());
	  
	  String s1 = "Dayanand";
	  s1.concat("Rai");
	  System.out.println(s1); 

	}

}
