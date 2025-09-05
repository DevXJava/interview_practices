package com.interview.basics.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindStringPermutation {

	public static ArrayList<String> findUniquePermutations(String s) {
        // Code here
        Set<String> result = new HashSet<>();
        permute("", s, result);
        return new ArrayList<>(result); // Convert set to list
        
    }
    
    private static void permute(String prefix, String remaining,Set<String> result){
        if(remaining.isEmpty()){
            result.add(prefix);
            return;
        }
        
        for(int i=0;i<remaining.length();i++){
            char ch = remaining.charAt(i);
            String newPrefix = prefix + ch;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            permute(newPrefix,newRemaining,result);
        }
    }
	
	
	public static void main(String[] args) {
		String s = "ABC";
        ArrayList<String> permutations = findUniquePermutations(s);
        System.out.println(permutations);

	}

}
