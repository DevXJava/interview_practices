package com.interview.strings;

import java.util.concurrent.*;
import java.util.*;

public class MultipleCallableTasksExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Create a thread pool with 3 threads
		ExecutorService executor = Executors.newFixedThreadPool(3);

		// Create a list of Callable tasks
		List<Callable<String>> tasks = Arrays.asList(() -> {
			Thread.sleep(1000);
			return "Task 1 completed";
		}, () -> {
			Thread.sleep(2000);
			return "Task 2 completed";
		}, () -> {
			Thread.sleep(1500);
			return "Task 3 completed";
		}, () -> {
			Thread.sleep(500);
			return "Task 4 completed";
		});

		// Submit all tasks and get list of Future objects
		List<Future<String>> futures = executor.invokeAll(tasks);

		// Loop over Futures and get results
		for (Future<String> future : futures) {
			System.out.println(future.get());
		}

		// Shutdown the executor
		executor.shutdown();
	}
}
