package com.interviews;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GetMaxAgeOfPerson {
    private int age;
    private String name;
    public GetMaxAgeOfPerson(int age, String name) {
		super();
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
		return "GetMaxAgeOfPerson [age=" + age + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		List<GetMaxAgeOfPerson> list = new ArrayList<>();
		list.add(new GetMaxAgeOfPerson(80, "A"));
		list.add(new GetMaxAgeOfPerson(70, "C"));
		list.add(new GetMaxAgeOfPerson(90, "B"));
		list.add(new GetMaxAgeOfPerson(100, "D"));
		
		GetMaxAgeOfPerson l = list.stream().max(Comparator.comparing(GetMaxAgeOfPerson::getAge)).get();

		System.out.println(l);
		
	}

	

}
