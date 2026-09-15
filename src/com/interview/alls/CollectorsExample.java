package com.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class ProductCollect{  
    private int id;  
    private String name;  
    private float price;  
      
    public ProductCollect(int id, String name, float price) {  
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
public class CollectorsExample {

	public static void main(String[] args) {
		List<ProductCollect> productsList = new ArrayList<ProductCollect>();  
        //Adding Products  
        productsList.add(new ProductCollect(1,"HP Laptop",25000f));  
        productsList.add(new ProductCollect(2,"Dell Laptop",30000f));  
        productsList.add(new ProductCollect(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductCollect(4,"Sony Laptop",28000f));  
        productsList.add(new ProductCollect(5,"Apple Laptop",90000f));  
        
        Set<Float> set = productsList.stream()
        		.map(product->product.getPrice()).collect(Collectors.toSet());
        
        //1. sort Product by price
        List<ProductCollect> sortByPrice = productsList.stream()
        		.sorted(Comparator.comparing(ProductCollect::getPrice).reversed()).collect(Collectors.toList());
        sortByPrice.forEach(l->System.out.println(l.getPrice()));

	}

}
