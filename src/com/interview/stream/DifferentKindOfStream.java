package com.interview.stream;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class DifferentKindOfStream {

	public static void main(String[] args) {
	
     List<String> list = Arrays.asList("Devendra","Kumar","Rahangdale");
     list.stream().findFirst().ifPresent(System.out::println);
     //
     Stream.of("Devendra","Kumar","Rahangdale").findAny().ifPresent(System.out::println);
     //
     IntStream.range(1, 4).forEach(System.out::println);
     //
     Arrays.stream(new int[] {1,2,3,4}).map(n->2*n+1).average().ifPresent(System.out::println);
     //
     Stream.of("a1","a2","a3")
           .map(s->s.substring(1))
           .mapToInt(Integer::parseInt)
           .max()
           .ifPresent(System.out::println);
	}

}
