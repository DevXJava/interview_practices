package com.interview.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person{
	
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class StreamFunctions{
	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("max", 18));
		list.add(new Person("peter", 23));
		list.add(new Person("pamila", 23));
		list.add(new Person("David", 12));
		//group by age
		Map<Integer,List<Person>> personsByage = list
				                                .stream()
				                                .collect(Collectors.groupingBy(p->p.age));
		personsByage.forEach((age,p)->System.out.println(age+"  "+p));
		// name is start with age
		List<Person> startWith = list.stream().filter(p->p.name.startsWith("p")).collect(Collectors.toList());
		for(Person p : startWith) {
			System.out.println(p.name);
		}
		//
	}
		
}