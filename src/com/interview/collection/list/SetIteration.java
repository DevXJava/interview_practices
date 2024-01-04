package com.interview.collection.list;
import java.util.Set;
import java.util.HashSet;
public class SetIteration {
	
	public void m1(String str) {
		System.out.println("Hi i am String ...");
	}
	public void m1(Object obj) {
		System.out.println("Hi i am Object ...");
	}

	public static void main(String[] args) {
		
		SetIteration s = new SetIteration();
		s.m1(null);
		s.m1(null);
		
		Set set = new HashSet();
		set.add(1);
		set.add("2");
		
		for (Object object : set) {
			if(object instanceof String) {
				String str = (String)object;
				System.out.println(" Hi String "+str);
			}
			if(object instanceof Integer) {
				Integer num = (Integer) object;
				System.out.println("Hi Integer " +num);
			}
		}
		

	}

}
