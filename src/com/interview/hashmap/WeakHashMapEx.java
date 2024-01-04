package com.interview.hashmap;

import java.util.Map;
import java.util.WeakHashMap;
/*
 A WeakHashMap discards entries when the key is no longer strongly reachable from live code. 
 Since the HashMap maintains a hard reference to the keys, 
 the keys are still reachable and the WeakHashMap doesn't discard the entries.
The point is that the behavior has to do with references to the key objects, not to the value of any variable that might have at one time had a reference to the keys.
  
 Role of Garbage Collector: Garbage Collected : In HashMap , entry object(entry object stores key-value pairs) is not eligible for garbage collection i.e Hashmap is dominant over Garbage Collector. 
In WeakHashmap, When a key is discarded then its entry is automatically removed from the map, in other words, garbage collected
  
  
 */
public class WeakHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Key k1 = new Key("Hello");
	    Key k2 = new Key("World");
	    Key k3 = new Key("Java");
	    Key k4 = new Key("Programming");

	    Map<Key, String> wm = new WeakHashMap<Key, String>();


	    wm.put(k1, "Hello");
	    wm.put(k2, "World");
	    wm.put(k3, "Java");
	    wm.put(k4, "Programming");
	    k1=null;
	    k2=null;
	    k3=null;
	    k4=null;
	    System.gc();
	    System.out.println("Weak Hash Map :"+wm);

	}

}
