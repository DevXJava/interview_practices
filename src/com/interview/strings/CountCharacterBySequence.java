package com.interview.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountCharacterBySequence {
	
	public static void main(String[] args) {
		// counting word sequentially 
		String str ="deeevennndrrra";
		int count;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			while (i+1<str.length() && str.charAt(i)==str.charAt(i+1)) {
				i++;
				count++;
			}
			System.out.print(+count+""+str.charAt(i)+" ");
			
		}
		
		//Checking normal occurrence 
		HashMap<Character, Integer> charCount = new HashMap<>();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (charCount.containsKey(str.charAt(i))) {
				int count_1 = charCount.get(str.charAt(i));
				//System.out.println(count);
				charCount.put(str.charAt(i), ++count_1);
			} else {
				charCount.put(str.charAt(i), 1);
			}
		}
		System.out.println(charCount);
		
		//count occurrence of string
		List<String> list = Arrays.asList("Jon", "Ajeet", "Steve","Ajeet", "Jon", "Ajeet");
		Set<String> st = new HashSet<String>(list);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(list, s));
		

	}

}
