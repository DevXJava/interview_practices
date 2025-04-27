package com.interview.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Stream<String> stream = Stream.empty();
		stream.forEach(System.out::println);

		Collection<String> strings = Arrays.asList("Devendra", "Kumar", "Rahangdale");
		Stream<String> stream2 = strings.stream();

		stream2.forEach(System.out::println);

		try {
			// count number of elements
			long numberofelements = stream2.count();
			System.out.println("count number of elements " + numberofelements);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Supplier<Stream<String>> streamSupplier = () -> Stream.of("A", "B", "C", "D");
		Optional<String> result1 = streamSupplier.get().findAny();
		System.out.println("result1 " + result1);

	}

}
