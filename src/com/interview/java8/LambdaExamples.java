package com.interview.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

@FunctionalInterface
interface ZeroParameter{
	//void display();
	
	double operation(double a, double b);
}


public class LambdaExamples {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		/*Collections.sort(names, new Comparator<String>() {
		    @Override
		    public int compare(String a, String b) {
		        return a.compareTo(b);
		    }
		});*/
		
		Collections.sort(names, (a, b) -> a.compareTo(b));
		
		for(String str : names){
			System.out.println(str);
		}
		
		
		List<EmployeeEight> list = new ArrayList<>();
		list.add(new EmployeeEight(1, "Devendra"));
		list.add(new EmployeeEight(2, "Java"));
		
		Comparator<EmployeeEight> compareByName = (EmployeeEight e1,EmployeeEight e2)-> {return e1.getName().compareTo(e2.getName());};
				
		
		int arr[] = {5,3,1,8,9,2,4};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println("=============================================");
		List<Integer> list2 = List.of(11,14,15,61,90,89,18,15,90);
		
		//Start with 1
		List<Integer> list3 = list2.stream().filter(a->String.valueOf(a).startsWith("1")).collect(Collectors.toList());
		list3.forEach(System.out::println);
		
		//Find duplicate from list
		List<Integer> list4 = List.of(11, 14, 15, 61, 90, 89, 18, 15, 90, 14);
		System.out.println("===========================================");
		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicate = list4.stream().filter(item->!set.add(item)).collect(Collectors.toSet());
		System.out.println("Duplicate is : "+duplicate);
		
		System.out.println("----------------Without parameter lambda---------------------------");
	
		//ZeroParameter zeroParameter = () -> System.out.println("Hi I am zero parametr function");
		//zeroParameter.display();
		
		System.out.println("----------------With parameter lambda---------------------------");
		
		ZeroParameter add = (a,b) -> a+b;
		ZeroParameter mult = (a,b) -> a*b;
		
		System.out.println(add.operation(78, 93));
		System.out.println(mult.operation(58, 78));
		
		System.out.println("-------------ArrayList with Lambda-----------------------------");
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        System.out.println("Elements of the ArrayList " + "before sorting : " + al);
        
        //Descending
        Collections.sort(al,(o1,o2)->(o1>o2) ? -1 : (o1<o2) ? 1 : 0);
        //Ascending
        //Collections.sort(al,(o1,o2)->(o1>o2) ? 1 : (o1<o2) ? -1 : 0);
        
        System.out.println("Elements of the ArrayList " + "after sorting : " + al);
        
        System.out.println("================Sorting Tree Map ============================");
        
        TreeMap<Integer, String> m = new TreeMap<>((o1,o2)->(o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        m.put(1, "Apple");
        m.put(4, "Mango");
        m.put(5, "Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");
        System.out.println("Elements of the TreeMap " + "after sorting are : " + m);
        
        System.out.println("===============Sorting Tree Set===============================");
        TreeSet<String> ts = new TreeSet<>((str1,str2) -> str2.compareTo(str1));
     // Add elements to the Treeset
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        ts.add("G");
        
        //Display the elements .
        for(String element : ts)
          System.out.println(element + "");
         
        System.out.println();
		
		
	}
}
