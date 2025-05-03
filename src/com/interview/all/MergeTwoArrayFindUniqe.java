package com.interview.all;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoArrayFindUniqe {

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 5, 2 };
		  // Merge arrays and find unique values
        Set<Integer> uniqueValues = IntStream.concat(Arrays.stream(a), Arrays.stream(b)) // Merge arrays
                                             .boxed() // Convert int to Integer
                                             .collect(Collectors.toSet()); // Store unique values in a Set

        // Print unique values
        System.out.println("Unique values: " + uniqueValues);
        
        System.out.println("==========================================================");
        List<Integer> uniqueList = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .boxed()
                .distinct() // Ensures uniqueness
                .collect(Collectors.toList());

        System.out.println("Unique values as List: " + uniqueList);


	}

}
