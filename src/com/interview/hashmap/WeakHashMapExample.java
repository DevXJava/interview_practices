package com.interview.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Key{
	
	String key;
	public Key(String key) {
		this.key=key;
	}
	@Override
	public boolean equals(Object obj) {
		return this.equals((String)obj);
	}
	@Override
	public int hashCode() {
		return key.hashCode();
	}
	@Override
	public String toString() {
		return key;
	}
	
}
public class WeakHashMapExample {

	public static void main(String[] args) {
		Key k1 = new Key("Hello");
	    Key k2 = new Key("World");
	    Key k3 = new Key("Java");
	    Key k4 = new Key("Programming");

	    Map<Key, String> wm = new WeakHashMap<Key, String>();
	    Map<Key, String> hm=new HashMap<Key, String>();

	    wm.put(k1, "Hello");
	    wm.put(k2, "World");
	    wm.put(k3, "Java");
	    wm.put(k4, "Programming");
        
	    hm.put(k1, "Hello");
	    hm.put(k2, "World");
	    hm.put(k3, "Java");
	    hm.put(k4, "Programming");
	    k1=null;
	    k2=null;
	    k3=null;
	    k4=null;
	    System.gc();
	    System.out.println("Weak Hash Map :"+wm.toString());
	    System.out.println("Hash Map :"+hm.toString());

	}

}
