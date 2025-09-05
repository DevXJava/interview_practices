package com.interview.javaconceptoftheday;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashMapByKeyNaturalOrder {

	public static void main(String[] args) {
		Map<String, Integer> studentMap = new HashMap<String, Integer>();
        
        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);
        
        System.out.println("===========================By Key Reverse natuarl order on key=======================================");
        Map<String, Integer> sortedStudentMap = studentMap
        		                              .entrySet().stream()
        		                              .sorted(Entry.comparingByKey())
        		                              .collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2) -> e2,LinkedHashMap::new));
        
        System.out.println("Before Sorting : ");
        
        System.out.println(studentMap);
         
        System.out.println("After Sorting : ");
         
        System.out.println(sortedStudentMap);
        
        
        System.out.println("===========================By Key Reverse order on key=======================================");
        
        Map<String, Integer> sortedStudentMapByKeyReverseOrder = studentMap.entrySet().stream()
        		                                            .sorted(Collections.reverseOrder(Entry.comparingByKey()))
        		                                            .collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
        
        
        System.out.println("=========================By Value Reverse natural order==================================");
        
        Map<String,Integer> sortedStudentMapByValueNaturalOrder = studentMap.entrySet().stream()
        		 .sorted(Entry.comparingByValue())
        		 .collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        		 
        System.out.println("Before Sorting : ");
        
        System.out.println(studentMap);
         
        System.out.println("After Sorting : ");
         
        System.out.println(sortedStudentMapByValueNaturalOrder);
        
        
        

	}

}
