package com.java8.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Synchronized1 {

	private static final int NUM_INCREMENT = 100000;
	private static int count = 0;

	private static synchronized void incrementSync() {
		count = count + 1;
	}

	private static void increment() {
		count = count + 1;
	}

	private static void testSyncIncrement() {
		count = 0;
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		IntStream.range(0, NUM_INCREMENT).forEach(i -> executorService.submit(Synchronized1::incrementSync));
		ConcurrentUtils.stop(executorService);
		System.out.println(" Sync: "+count);
	}

	private static void testNonSyncIncrement() {
		count =0;
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		IntStream.range(0, NUM_INCREMENT).forEach(i->executorService.submit(Synchronized1::increment));
		ConcurrentUtils.stop(executorService);
		System.out.println(" Sync: "+count);
	}
	public static void main(String[] args) {
		//testSyncIncrement();
		testNonSyncIncrement();
	}

}
