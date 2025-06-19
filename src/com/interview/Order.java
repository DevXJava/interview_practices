package com.interview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record Order(String customerId,double amount) {

	
	public static void main(String[] args) {
		List<Order> list = List.of(new Order("cust1", 2000),
				new Order("cust1", 270),
				new Order("cust1", 240),
				new Order("cust2", 40),
				new Order("cust2", 200),
				new Order("cust3", 90),
				new Order("cust3", 35));
		
		Map<String, List<Order>> map = list.stream().collect(Collectors.groupingBy(Order::customerId,
				Collectors.filtering(o->o.amount>=100, Collectors.toList())));
		System.out.println("map is : "+map);
	}

}
