package com.interview.academian;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Parent{
	public void friend() {
		System.out.println("friend ...");
	}
}
public class Child extends Parent{
	public void friend2() {
		System.out.println("friend2 ...");
	}

	public static void main(String[] args) {
	  Parent parent = new Child();
	  //parent.friend2();  // compile time error because friend2 is not available
	  
	  /*
	    ArrayList<String> c = new ArrayList<String>("23",76,"45");
         c.streams.filter()
        .filter(x->x/2)
	   */
	  
	  List<String> c = Arrays.asList("23", "76", "45");
	  List<Integer> result = c.stream()
			    .map(Integer::parseInt)         // Convert String to Integer
			    .filter(x -> x % 2 == 0)        // Keep only even numbers
			    .collect(Collectors.toList());  // Collect into a new list

			System.out.println(result); // Output: [76]



	}

}
