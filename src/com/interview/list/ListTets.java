package com.interview.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTets {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("c");
		list.add("b");
		list.add("a");
		list.add("d");
        Collections.sort(list);
        //Collections.reverse(list);
		System.out.println(list);
	}

}
