package com.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Stududent implements Comparable<Stududent>{
	private int id;
	private String name;
	private String address;

	public Stududent(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Stududent [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Stududent o) {
		if(this.id==o.id)
		   return 0;
		else if(this.id>o.id) // > for ascending , < for descending order
			return 1;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		List<Stududent> list = new ArrayList<>();
		list.add(new Stududent(4, "dawn", "London1"));
		list.add(new Stududent(1, "adawn", "London4"));
		list.add(new Stududent(3, "cdawn", "London3"));
		list.add(new Stududent(5, "bdawn", "London2"));
		list.add(new Stududent(2, "dawn", "London5"));
		Collections.sort(list);
		
		list.stream().forEach((id)->System.out.println(id.id));

	}

}
