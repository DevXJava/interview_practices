package com.interview.all;

import java.util.Optional;

public class CreateOptionalObject {

	public void check(Object k) {
	    Optional<Object> optional = Optional.ofNullable(k);

	    if (optional.isPresent()) {
	        System.out.println("Value: " + optional.get());
	    } else {
	        System.out.println("Value is null");
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
