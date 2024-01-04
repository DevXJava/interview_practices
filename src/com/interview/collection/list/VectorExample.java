package com.interview.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("vetor capacity is --"+v.capacity());
		
		for (int i = 1; i < 10; i++) {
			
			v.addElement(i);
			
		}

		System.out.println("vetor capacity is --"+v.capacity());
		v.addElement("A");
		System.out.println("vetor capacity is --"+v.capacity());
		System.out.println(v);
		//Enumeration 
		Enumeration enumeration = v.elements();
		while (enumeration.hasMoreElements()) {
			Object object = (Object) enumeration.nextElement();
			System.out.println("object is "+object);
		}
		
		
		
		
	}

}
