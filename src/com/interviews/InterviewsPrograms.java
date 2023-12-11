package com.interviews;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewsPrograms {
	
	public static void occuranceOfArrayElement() {
		List<String> list = Arrays.asList("Deven","Kumar","Deven","Rahangdale");
		Set<String> set = new HashSet<String>(list);
		for(String string: set) {
			System.out.println(string+"   "+Collections.frequency(list, string));
		}
	}
	public static void countCharacterSequencialy() {
		String str = "VVTTVVVTTTUUU";
		int count;
		for(int i=0;i<str.length();i++) {
			count=1;
			while(i+1<str.length()&&str.charAt(i)==str.charAt(i+1)) {
				i++;
				count++;
			}
			System.out.println(str.charAt(i)+"   "+count);
		}
	}
	
	public static void printDigitOcuuranceUsingJavaEight() {
		List<Integer> list = Arrays.asList(1,1,3,4,4,2,2,1);
		Map<Integer, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		map.forEach((key,value)->System.out.println(key+"  "+value));
	}
	
	public static void findDuplicateFromArrayList() {
		List<Integer> list = Arrays.asList(1,1,4,5,5,6,6,8,9);
		Set<Integer> integers = new HashSet<>();
		Set<Integer> set = list.stream().filter(n->!integers.add(n)).collect(Collectors.toSet());
		set.forEach((v)->System.out.println(v));
	}
	
	public static void findStartWith1() {
		List<Integer> list = Arrays.asList(12,13,4,5,5,6,16,8,9);
		List<Integer> l = list.stream().filter(item->String.valueOf(item).startsWith("1"))
				.collect(Collectors.toList());
		l.forEach((v)->System.out.println(v));
	}
	
	public static void shortArrayList() {
		List<String> list = Arrays.asList("java","sql","Abc","bcd");
		Collections.sort(list);
		list.forEach((item)->System.out.println(item));
	}
	
	public static void countEachWordOccurancr() {
		String str = "devendra";
		HashMap<Character, Integer> hashMap = new HashMap<>();
		char ch[] = str.toCharArray();
		for(char c:ch) {
			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			}else {
				hashMap.put(c, 1);
			}
		}
		hashMap.forEach((k,v)->System.out.println(k+"  :  "+v));
	}

	public static void main(String[] args) {
		InterviewsPrograms.countEachWordOccurancr();

	}

}
