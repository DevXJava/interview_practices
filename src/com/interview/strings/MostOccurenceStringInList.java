package com.interview.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student {
	int id;
	String name;
	double salary;

	public Student(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class MostOccurenceStringInList {

	public static Optional<Double> findNthHighestSalary(Map<Integer, Student> map, int n) {

		return map.values().stream().map(Student::getSalary).sorted(Comparator.reverseOrder()).skip(n - 1).findFirst();

	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("dev", "ved", "dev", "etc", "dev", "nap");
		Optional<Entry<String, Long>> optional = list.stream()
				.collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet().stream()
				.max(Comparator.comparing(Entry::getValue));

		optional.ifPresent(entry -> {
			System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
		});
		
		//-------------------------------------------------------------------------------
		Map<Integer, Student> studentMap = new HashMap<>();
		studentMap.put(1, new Student(1, "Niraj", 5000));
		studentMap.put(2, new Student(2, "Ravi", 7000));
		studentMap.put(3, new Student(3, "Ankit", 6000));
		studentMap.put(4, new Student(4, "Pooja", 7000));
		
		Optional<Double> nthSalary =  MostOccurenceStringInList.findNthHighestSalary(studentMap, 3);
		System.out.println("nthSalary :"+nthSalary);
		
		
		String string = "devendra";
		List<String> lists = new ArrayList<>();
		for(char ch : string.toCharArray()) {
			lists.add(String.valueOf(ch));
		}
		Map<String,Long> map = lists.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("map is : "+map);
		Map<String, Long> frequencyMap = lists.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(frequencyMap);
		
		// Q. How To Reverse Each Word Of A String In Java?
		String input = "Welcome to Powerplay !";
		String result = Arrays.stream(input.split(" "))
				              .map(word->new StringBuilder(word).reverse().toString())
				              .collect(Collectors.joining(" "));
		System.out.println("result : "+result);

		StringBuilder builder = new StringBuilder(input);
		
		String string2 = builder.reverse().toString();
		System.out.println(string2);
        

	}

}
