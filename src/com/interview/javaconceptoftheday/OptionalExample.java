package com.interview.javaconceptoftheday;

import java.util.Optional;

class Person {
	Optional<House> house;

	public Optional<House> getHouse() {
		return house;
	}

}

class House {
	Optional<HouseLoan> houseLoan;

	public Optional<HouseLoan> getHoseLoan() {
		return houseLoan;
	}
}

class HouseLoan {
	String houseLoanDetails;

	public String getHouseLoanDetails() {
		return houseLoanDetails;
	}
}

public class OptionalExample {
//https://javaconceptoftheday.com/java-8-optional-class/
	public static void main(String[] args) {
		Optional<House> empty = Optional.empty();
		
		Optional<House> house = Optional.of(new House());
		
		House h = new House();
		Optional<House> optionalHouse = Optional.ofNullable(h);
		optionalHouse.get();
		

	}

}
