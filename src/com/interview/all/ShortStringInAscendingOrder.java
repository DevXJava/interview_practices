package com.interview.all;

import java.util.List;
import java.util.stream.Collectors;

public class ShortStringInAscendingOrder {

	public static void main(String[] args) {
		 String input = "devendra";
			List<Character> soterd = input.chars().mapToObj(c->(char)c).collect(Collectors.toList());
			
			List<String> listSort = soterd.stream().sorted().map(String::valueOf).collect(Collectors.toList());
			
			listSort.forEach(c->System.out.print(c));

	}

}
