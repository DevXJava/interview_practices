package com.interview.academian;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//case 1. if 2 second max same select 1
//case 2. if 2 second max different find 1
//case 3. handle null array  
public class FindSecondMax {
	public static Integer findSecondMax(int[] arr) {
		// Case 3: Handle null or empty array
        if (arr == null || arr.length == 0) {
            System.out.println("Input array is null or empty.");
            return null;
        }
        Integer secondMaxUnique =0;
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> secondMax = list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).limit(2).collect(Collectors.toList()); 
        //System.out.println("second max is :"+secondMax);

        for(Integer n : secondMax){
           secondMaxUnique = n;
        }
     return secondMaxUnique;
   }

   public static void main(String args[]) {
       int[] arr1 = {2, 3, 4, 5, 4};
       int[] arr2 = {5, 5, 5, 5};
       int[] arr3 = {1};
       int[] arr4 = {};

       System.out.println("Second max of arr1: " + findSecondMax(arr1));
       System.out.println("Second max of arr2: " + findSecondMax(arr2));
       System.out.println("Second max of arr3: " + findSecondMax(arr3));
       System.out.println("Second max of arr4: " + findSecondMax(arr4));
   }
}
