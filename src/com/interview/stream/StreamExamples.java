package com.interview.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	
	int id ;
	String name;
	float price;
	public Product(int id, String name, float price) {
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

public class StreamExamples {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Graps", 100f));
		list.add(new Product(2, "Apple", 200f));
		list.add(new Product(3, "Orange",300f));
		list.add(new Product(4, "Papaya",400f));
		list.add(new Product(5, "Gauwa", 500f));
		list.add(new Product(6, "Gauwa", 500f));
		
		list.forEach((product)->System.out.println(product.id+"  "+product.name+"  "+product.price));
		
		
		List<Float> floatproductPriceList = new ArrayList<Float>(); 
		for (Product product:list) {
			if(product.price<300) {
				floatproductPriceList.add(product.price);
			}
			
		}
		
		List<Float> list2 = list.stream().filter(p->p.price>200).map(p->p.price).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		System.out.println("--------------");
		
		Stream.iterate(1, element->element+1)
		.filter(element->element%5==0)
		.limit(5)
		.forEach(System.out::println);
		// this is more compact for filtering data
		System.out.println("--------------");
		list.stream().filter(product ->product.price==100)
		.forEach(product -> System.out.println(product.name));
		
		//this is more compact finding total price 
		Float totalPrice = list.stream()
				.map(product->product.price)
				.reduce(0.0f, (sum,price)->sum+price);
		
		System.out.println("total price "+totalPrice);
		//we can use scope resolution operator for sum also 
		float totalPrice2 = list.stream()
				.map(product->product.price)
				.reduce(0.0f, Float::max);
		
		System.out.println("totalPrice2   "+totalPrice2);
		
		//using collectors for sum also 
		double totalPrice3 = list.stream().collect(Collectors.summingDouble(product->product.price));
		System.out.println("totalPrice3  "+totalPrice3);
		
		//remove duplicate values of list using java 8
		//converting product list in to set
		Set<Float> productPriceList = list.stream()
				.filter(priceList->priceList.price<30000)
				.map(priceList->priceList.price)
				.collect(Collectors.toSet()); // collect it as Set(remove duplicate element) 
		
		System.out.println("set productPriceList  "+productPriceList);
		
		
		//converting list into map 
		Map<Integer, String> productListMap = list.stream()
				.collect(Collectors.toMap(p->p.id, p->p.name));
		
		System.out.println("list of map is --"+productListMap);
		
		//method reference in stream 
		
		List<Float> listFloat = list.stream()
				.filter(p->p.price>300) // // filtering data
				.map(Product::getPrice) // fetching price by referring getPrice method 
				.collect(Collectors.toList()); // collecting as list  
		
		System.out.println("listFloat  ---"+listFloat);
		

	}

}
