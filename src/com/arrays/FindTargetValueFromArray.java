package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindTargetValueFromArray {

	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 7};
        int target = 9;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++) {
        	int key = target - arr[i];
        	if(map.containsKey(key)) {
        		System.out.println("Target: "+target +" found at index: "+map.get(key)+" and: "+i);
        		return;
        	}
        	map.put(arr[i], i);
        }
        System.out.println("No two indices found with target sum " + target);
	}

}
