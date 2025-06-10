package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class ProductCollect{  
    int id;  
    String name;  
    float price;  
      
    public ProductCollect(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
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
        		.map(product->product.price).collect(Collectors.toSet());

	}

}
