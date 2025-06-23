package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Product{
	private int productid;
	private String brandname;
	private float price;
	public Product(int productid, String brandname, float price) {
		super();
		this.productid = productid;
		this.brandname = brandname;
		this.price = price;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
public class RemoveLaptopWordFromProduct {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 50000f));
		productsList.add(new Product(2, "Dell Laptop", 28000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 70000f));

		productsList.replaceAll(employee -> {
		      employee.setBrandname(employee.getBrandname().replace("Laptop", ""));
		      return employee;
		    });
		
		
		productsList.forEach(product->System.out.println(product.getBrandname()));
		
		List<Product> products = productsList.stream().map(l->{
			l.setBrandname(l.getBrandname().replace("Laptop", ""));
			return l;
		}).collect(Collectors.toList());
				
	}

}
