package com.interview.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListExersice {
	
	public static <T> Set<T> findDuplicates(T[] array){
		Set<T> seenRecords = new HashSet<>();
		return Arrays.stream(array)
				.filter(val -> !seenRecords.add(val))
				.collect(Collectors.toSet());
	}

	public static void main(String[] args) {
		/*Explain the different ways of constructing an ArrayList?*/
		ArrayList<Integer> list1 = new ArrayList<>(); //First Method
		
		ArrayList<Integer> list2 = new ArrayList<>(10); //Second method
		
		ArrayList<Integer> list3 = new ArrayList<>(list1); //Third method
		
		/*How do you increase the current capacity of an ArrayList?*/
		list1.ensureCapacity(50);
		
		/*How do you decrease the current capacity of an ArrayList to the current size?*/
		list1.trimToSize();
		
		/*4) How do you find the number of elements present in an ArrayList?*/
		list1.size();
		
		/*How do you find out whether the given ArrayList is empty or not?*/
		boolean isEmpty = list1.isEmpty();
		
		/* How do you check whether the given element is present in an ArrayList or not?*/
		ArrayList<Double> list4 = new ArrayList<Double>();
				list4.add(1.1);
				 
		        list4.add(11.11);
		 
		        list4.add(111.111);
		 
		        list4.add(1111.1111);
		        
		        System.out.println(list4.contains(1.12));
		        
	   /*How do you get the position of a particular element in an ArrayList?*/	
		        
		        ArrayList<String> list = new ArrayList<String>();
		        
		        list.add("JAVA");
		 
		        list.add("J2EE");
		 
		        list.add("JSP");
		 
		        list.add("JAVA");
		 
		        list.add("SERVLETS");
		 
		        list.add("JAVA");
		 
		        list.add("STRUTS");
		        
		        System.out.println(list.indexOf("STRUTS"));
		        
		        System.out.println(list.indexOf("JSP"));
		        
		        
		        /*How do you convert an ArrayList to Array?*/
		        
		        Object[] array = list.toArray();
		        
		        /*How do you retrieve an element from a particular position of an ArrayList?*/
		   
		        Integer[] genericArray = {1,2,3,2,4,5,1,6,3};
		        
		        System.out.println(findDuplicates(genericArray));
		        
		        IntStream.of(new int[] {1,3,8,6,9,5,4,7}).filter((int i)->i>5).distinct().forEach(System.out::print);
		        

	}

}
