package com.interview.codedecode.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, 29, "tom", new Address("Street1", 456));
		Employee e2 = new Employee(2, 30, "jerry", new Address("Street2", 12));
		Employee e3 = new Employee(3, 22, "code", new Address("Street3", 344));
		Employee e4 = new Employee(4, 51, "decode", new Address("Street4", 567));
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		System.out.println(list);
		
		Collections.sort(list, new AgeComparator());
		System.out.println("*********************************************************************");
		System.out.println("Age sorting ! "+list);
		
		System.out.println("*********************************************************************");
		Collections.sort(list, new NameComparator());
		System.out.println("Name sorting ! "+list);
		
		System.out.println("*********************************************************************");
		Collections.sort(list, new AddressComparator());
		System.out.println("Address sorting ! "+list);
	}

}
