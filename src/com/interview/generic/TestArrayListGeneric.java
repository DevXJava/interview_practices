package com.interview.generic;

import java.util.ArrayList;

public class TestArrayListGeneric {

	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		
		l.add("Devendra");
		l.add("Rahangdale");
		l.add(new Integer(40));
		
		String n1=(String)l.get(0);
		String n2=(String)l.get(1);
		String n3=(String)l.get(2);//it will give exception
		
		//type casted array list
		ArrayList<String>  list = new ArrayList<>();
		list.add("Devendra");
		//list.add(19); // its invalid
		

	}

}
