package com.interview.all;

import java.util.TreeSet;

class EmpTreeSet implements Comparable<EmpTreeSet>{
	private int id;
	private String name;
	public EmpTreeSet(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	@Override
	public int compareTo(EmpTreeSet o) {
		return this.id-o.id;
	}
	
	
}

public class TreeSetCustomObjectSort {

	public static void main(String[] args) {
		TreeSet<EmpTreeSet> set = new TreeSet<>();
		set.add(new EmpTreeSet(1, "cbz"));
		set.add(new EmpTreeSet(4, "cbz"));
		set.add(new EmpTreeSet(2, "cbz"));
		set.add(new EmpTreeSet(3, "cbz"));
		
		set.forEach(e->{
			System.out.println(e.getId());
		});

	}

}
