package com.clairvoyant;

import java.util.List;
import java.util.stream.Collectors;

public class FindValuesBetween10To20FromListUsingJava8 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        // Find all values between 10 to 20 from the list
        List<Integer> valuesBetween10To20 = numbers.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());

        // Print the values
        System.out.println(valuesBetween10To20);
	}

}
