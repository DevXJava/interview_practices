package com.academian;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ConvertListOfStringToMapAndShortListOString {

	public static void main(String[] args) {	
		List<String> list2 = Arrays.asList(null, "kiwi", "banana", "apple", "berry", "mango");
		System.out.println("before sorting : " + list2);
		// Short the above list
		List<String> list3 = list2.stream().sorted(Comparator.nullsLast(Comparator.naturalOrder()))
				.collect(Collectors.toList());
		System.out.println("After sorting : " + list3);

		// Convert list3 to Map
		Map<String, String> map2 = list3.stream().filter(Objects::nonNull).collect(Collectors.toMap(k -> k, v -> v));
		System.out.println("converted list to map is : " + map2);

	}

}
