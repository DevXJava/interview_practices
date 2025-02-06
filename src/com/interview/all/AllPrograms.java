package com.interview.all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllPrograms {
	// 1.
	public static void countArrayOccuranceEelementUsingNromalJava() {
		int visited = -1;
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		int frequency[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					frequency[j] = visited;
				}
			}
			if (frequency[i] != visited)
				frequency[i] = count;
		}
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != visited)
				System.out.println(arr[i] + " | " + frequency[i]);
		}

	}

//2.
	public static void countArrayOccuranceEelementUsingStream() {
		// printing number of occurrence
		List<Integer> numList = Arrays.asList(2, 13, 4, 4, 2, 3, 5, 6, 1, 1);
		Map<Integer, Long> map = numList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map.forEach((key, value) -> {
			System.out.println("ocuurance: " + key + "   " + value);
		});
	}

// 3.
	public static void shortArrayUsingNormalJava() {
		int arr[] = { 8, 4, 9, 3, 1, 7, 5 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

//4. 
	public static void shortArrayWithSingleforLoop() {
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		for (int i = 0; i < arr.length - 1; i++) {
			// Checking the condition for two simultaneous elements of the array
			if (arr[i] > arr[i + 1]) {
				// Swapping the elements.
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				// updating the value of i = -1
				// so after getting updated for i++
				// in the loop it becomes 0 and
				// the loop begins from the start.
				i = -1;
			}
		}
	}

//5.
	public static void reverseArrayUsingNormalJava() {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int temp = arr.length;
		int b[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			b[temp - 1] = arr[i];
			temp = temp - 1;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print("  " + b[i] + ":");
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print("   " + arr[i]);
		}
	}

//6.
	public static void shortMapByValues() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(2, "bev");
		hashMap.put(7, "aa");
		hashMap.put(1, "cod");
		hashMap.put(5, "dat");
		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(hashMap.entrySet());
		Collections.sort(list, (v1, v2) -> v1.getValue().compareTo(v2.getValue()));
		HashMap<Integer, String> map = new LinkedHashMap<>();
		for (Map.Entry<Integer, String> entry : list) {
			map.put(entry.getKey(), entry.getValue());
		}
		map.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
		// ===================Second way=========================
		HashMap<Integer, String> shortedhashMap = map.entrySet().stream()
				.sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		shortedhashMap.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
	}

//7.
	public static void countCharacterOccuranceBySequence() {
		String str = "deeevennndrrra";
		int count;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				i++;
				count++;
			}
			System.out.print(+count + "" + str.charAt(i) + " ");

		}
	}

//8.
	public static void countCharacterOccuranceNormaly() {
		String str = "devendra";
		HashMap<Character, Integer> charCount = new HashMap<>();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (charCount.containsKey(str.charAt(i))) {
				int count_1 = charCount.get(str.charAt(i));
				// System.out.println(count);
				charCount.put(str.charAt(i), ++count_1);
			} else {
				charCount.put(str.charAt(i), 1);
			}
		}
		System.out.println(charCount);
	}
//8.
	public static void countCharacterOccuranceUsingStream() {
		String str = "devendra";
		Map<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
		result.forEach((k,v)->{System.out.println(k+"  "+v);});
	}
	
//9.
	public static void countWordOccuranceOfArrayList() {
		// count occurrence of string
		List<String> list = Arrays.asList("Jon", "Ajeet", "Steve", "Ajeet", "Jon", "Ajeet");
		Set<String> st = new HashSet<String>(list);
		for (String s : st)
			System.out.println(s + ": " + Collections.frequency(list, s));
	}

//10.
	public static void findMostOcuuranceStringFromArraList() {
		List<String> list = Arrays.asList("Jon", "Ajeet", "Steve", "Ajeet", "Jon", "Ajeet");
		Optional<Entry<String, Long>> maxOccurString = list.stream()
				.collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet().stream()
				.max(Comparator.comparing(Entry::getValue));
		System.out.println("maxOccurString :" + maxOccurString);
	}

//11.
	public static void printOnlyDuplicateValuesFromArrayList() {
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 5, 6, 7, 7);
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> duplicatelist = list.stream().filter(printDuplicates -> !set.add(printDuplicates))
				.collect(Collectors.toList());
		for (Integer integer : duplicatelist) {
			System.out.println(integer);
		}
	}

//12.
	public static void printOnlyDistinctValueFromList() {
		List<Integer> list = Arrays.asList(1, 1, 3, 3, 5, 4, 6);
		List<Integer> distinctValues = list.stream().distinct().collect(Collectors.toList());
		System.out.println("distinctValues :" + distinctValues);
	}

//13.
	public static void printStartWithCharacterFromArrayList() {
		List<String> list = Arrays.asList("java", "jacala", "apple", "action", "jacob");
		List<String> str = list.stream().filter(a -> a.startsWith("j")).collect(Collectors.toList());
		System.out.println("Start with :"+str);
	}
//14.
	public static int[][] addThreeByThreeMatrix(int A[][], int B[][], int size) {

		int i, j;
		int c[][] = new int[size][size];
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				c[i][j] = A[i][j] + B[i][j];
			}
		}
		return c;
	}
//14.
	public static void printThreeByThreeMatrix(int M[][], int rowSize, int columnSize) {

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				System.out.println(M[i][j] + " ");
			}
		}

	}
//15.
	public static void flatMapExample() {
		// making the arrayList object of List of Integer
        List<List<Integer> > number = new ArrayList<>();
        // adding the elements to number arrayList
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
        System.out.println("List of list-" + number);
        List<Integer> flatList = number.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println("Flat list is :"+flatList);
	}
//16.
	public static void iterateMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Deve");
		map.put(5, "Dev");
		map.put(4, "De");
		map.put(2, "D");
		map.put(1, "Devendra");
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
		  Map.Entry<Integer, String>  entry = (Map.Entry<Integer, String>)iterator.next();
		  System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		// Another way
		map.forEach((k,v) -> System.out.println(k+"   "+v));
	}
//17.
	public static void removeDuplicateCharacterFromString() {
		String str = "devendraa";
		Set<Character> hasSet = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			hasSet.add(str.charAt(i));
		}
		for (Character c : hasSet) {
			System.out.print(" : "+c);
		}
		System.out.println("==========Another way================");
	    String orignalString = "devendra";
		StringBuilder builder = new StringBuilder();
		Set<Character> set2 = new HashSet<Character>();
		char[] chars = orignalString.toCharArray();
		for (char ch : chars) {
			if (set2.add(ch)) {
				builder.append(ch);
			}
		}
		System.out.println("Original String : " + orignalString);
		System.out.println("After removing the duplicates : " + builder.toString());
	}
//18.
	public static void findSecondHighestElement(ArrayList<Integer> list) {
		int secondLargest = list.stream().sorted(Comparator.reverseOrder())
				.limit(2).skip(1).findFirst().get();
		System.out.println("secondLargest number is :"+secondLargest);
	}
//19.
	public static void findMostOccuranceStringFromAndArrayList() {
		String[] str = { "pune", "pune", "pune", "mumbai", "mumbai", "indore" };
		
		Stream.of(str).collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet()
	      .stream()
	      .max(Comparator.comparing(Entry::getValue))
	      .ifPresent(System.out::println);
		System.out.println("======================================================");
	 	//========================Another way==============================
		List<String> list = Arrays.asList(str);
	    Optional<Entry<String, Long>>	maxStr = list.stream()
			 .collect(Collectors.groupingBy(s->s,Collectors.counting()))
	 	     .entrySet().stream().max(Comparator.comparing(Entry::getValue));
	 
	 System.out.println(maxStr.get().getValue());
	}
	public static void findOutPut() {
		System.out.println(0.1*3 == 0.3);
		System.out.println(0.1*2 == 0.2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
