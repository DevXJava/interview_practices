package com.interview.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class User {
	public int age;
	public String name;

	public User(int age, String name) {

		this.age = age;
		this.name = name;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}


}

public class FindMaxAge{
	
	public static void main(String[] args) {
		List<User> l = new ArrayList<User>();
		l.add(new User(24,"Max"));
		l.add(new User(34,"Aux"));
		l.add(new User(44,"John"));

		User maxageUser = l.stream().max(Comparator.comparing(User :: getAge)).get();
		System.out.println(maxageUser);
		User minAgeUser = l.stream().min(Comparator.comparing(User::getAge)).get();
		System.out.println(minAgeUser);
		
		List<String> str = l.stream().map(User::getName).filter(name->name.startsWith("J")).collect(Collectors.toList());
		
		System.out.println(str);
		
		l.stream().mapToInt(age->age.getAge()).average().ifPresent(age->System.out.println("age avg is: "+age));
		
	}
	
}
