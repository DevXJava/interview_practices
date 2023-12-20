package com.javatechonline;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Book {
	private int id;
	private String name;
	private String author;
	private int cost;

	public Book(int id, String name, String author, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.cost = cost;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public static void main(String[] args) {
		
		List<Book> list = new ArrayList<Book>();
		list.add(new Book(1, "Java", "James down", 2000));
		list.add(new Book(4, "C", "Deepali Shriwastaw", 8000));
		list.add(new Book(3, "C++", "James Gosling", 6000));
		list.add(new Book(5, "Php", "Gosling", 1000));
		list.add(new Book(2, "Sql", "James ", 3000));
		
		Comparator<Book> shortById = (i1,i2)->Integer.compare(i1.getId(), i2.getId());
		Comparator<Book> shortByName = (n1,n2)->n2.getName().compareToIgnoreCase(n1.getName());
		//list.stream().sorted(shortById).for-Each((i)->System.out.println(i.getId()));
		
		List<Book> byId = list.stream().sorted(shortById).collect(Collectors.toList());
		byId.forEach(i->System.out.println(i.getId()));
		
		List<Book> byName = list.stream().sorted(shortByName).collect(Collectors.toList());
		byName.forEach(n->System.out.println(n.getName()));
		
		list.stream().map(a->a.getId ()+" : "+a.getName()).forEach(System.out::println);
				
		List<Book> byName1 = list.stream().sorted((n1,n2)->n1.getAuthor().compareToIgnoreCase(n2.getAuthor())).collect(Collectors.toList());
		
		

	}

}
