package com.interview.hcl;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		//without type safety o/p: four one three two  
		// it will short basis of alphabet 
		TreeSet<String> map = new TreeSet<String>();

		map.add("one");

		map.add("two");

		map.add("three");

		map.add("four");

		map.add("one");

		Iterator<String> it = map.iterator();

		while (it.hasNext()){

			System.out.print(it.next() + " ");

		}

	}

}
