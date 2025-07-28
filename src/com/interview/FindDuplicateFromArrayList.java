package com.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateFromArrayList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 1, 4, 5, 5, 6, 6, 8, 9);
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> set = list.stream().filter(n -> !hashSet.add(n)).collect(Collectors.toSet());
		set.forEach((v) -> System.out.println(v));

	}

}
