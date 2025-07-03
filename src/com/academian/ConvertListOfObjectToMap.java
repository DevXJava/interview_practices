package com.academian;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Product {
	private int id;
	private String name;
	private double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

public class ConvertListOfObjectToMap {

	public static void main(String[] args) {
		List<Product> list = Arrays.asList(new Product(101, "Laptop", 2009),
				new Product(102, "Smart phone", 2009),
				new Product(103, "Land line", 2009),
				new Product(103, "Bluetooth", 2009));
		
		Map<Integer, Product> map = list.stream().collect(Collectors.toMap(Product::getId, Function.identity(),
				(existing,replacement)->existing));
		System.out.println("map is : "+map);
		
		Map<Integer, String> map2 = list.stream().collect(Collectors.toMap(Product::getId, Product::getName,
				(existing,replacement)->existing));
		System.out.println("map2 is : "+map2);

	}

}
