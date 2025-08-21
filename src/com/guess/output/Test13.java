package com.guess.output;

import java.util.Arrays;
import java.util.List;

public class Test13 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("one", "two", "three");
		list.stream()
		    .filter(s -> {
		        System.out.println("Filtering: " + s);
		        return s.length() > 3;
		    })
		    .findFirst(); // one , two , three

	}

}
