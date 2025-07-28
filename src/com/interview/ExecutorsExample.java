package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 Executors are part of the java.util.concurrent package and provide a high-level API for managing threads and concurrency. 
 Instead of manually creating and starting threads, 
 you can use an Executor to manage them more efficiently. No need to use Thread and Runnable 
 */
public class ExecutorsExample {
	// 1.
	public void multipleTaskExecutors() {
		ExecutorService executor = Executors.newFixedThreadPool(3); // 3 threads
		//At most 3 threads will run in parallel at any given time.
		//If you submit more than 3 tasks, the extra tasks will wait in a queue until a thread is free.


		for (int i = 1; i <= 5; i++) {
			int taskId = i;
			executor.execute(() -> {
				System.out.println("Running Task " + taskId + " by " + Thread.currentThread().getName());
			});
		}
		executor.shutdown(); // Don't forget to shutdown
	}

	// 2.
	public void invokeAllExample() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<Callable<String>> tasks = Arrays.asList(
				() -> "Task A by " + Thread.currentThread().getName(),
				() -> "Task B by " + Thread.currentThread().getName(),
				() -> "Task C by " + Thread.currentThread().getName()

		);
		List<Future<String>> results = executorService.invokeAll(tasks);
		for (Future<String> future : results) {
            System.out.println(future.get());  // blocking call
        }

        executorService.shutdown();
	}

	// 3.
	public void multipleCallableTasks() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		Callable<String> task1 = () -> {
			return "Task1 completed by " + Thread.currentThread().getName();
		};

		Callable<String> task2 = () -> {
			return "Task2 completed by " + Thread.currentThread().getName();
		};

		Future<String> future1 = executorService.submit(task1);
		Future<String> future2 = executorService.submit(task2);
		System.out.println(future1.get());
		System.out.println(future2.get());
		executorService.shutdown();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		new ExecutorsExample().multipleCallableTasks();

	}

}
