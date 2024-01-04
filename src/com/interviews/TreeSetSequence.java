package com.interviews;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSequence {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("one");

		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {

			System.out.print(iterator.next() + " ");

		}

	}

}
