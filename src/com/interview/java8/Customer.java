package com.interview.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record Customer(String name, int totalSpent) {

	public static void main(String[] args) {

		List<Customer> list = List.of(new Customer("cust1", 13000), new Customer("cust2", 8500),
				new Customer("cust3", 15000), new Customer("cust4", 18300), new Customer("cust5", 2000));

		Map<Boolean, List<Customer>> result = list.stream()
				.collect(Collectors.partitioningBy(c -> c.totalSpent >= 10000));
		
		List<Customer> loyal = result.get(true);
		List<Customer> newCustomer = result.get(false);
		

	}

}
