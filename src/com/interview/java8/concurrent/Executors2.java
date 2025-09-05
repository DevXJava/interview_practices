package com.interview.java8.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Executors2 {

	private static void test1() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		// using the future we can return some tasks values
		Future<Integer> future = executorService.submit(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				return 123;
			} catch (InterruptedException e) {
				throw new IllegalStateException("task interrupted", e);
			}
		});
		System.out.println("future done : " + future.isDone());
		Integer result = future.get();
		System.out.println("future done : " + future.isDone());
		System.out.println("result : " + result);
		executorService.shutdown();
	}

	private static void test2() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<Integer> future = executorService.submit(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				return 123;
			} catch (InterruptedException e) {
				throw new IllegalStateException("task interrupted", e);
			}
		});
		executorService.shutdown();
		future.get();
	}

	private static void test3() throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService executor = Executors.newFixedThreadPool(1);

		Future<Integer> future = executor.submit(() -> {
			try {
				TimeUnit.SECONDS.sleep(2);
				return 123;
			} catch (InterruptedException e) {
				throw new IllegalStateException("task interrupted", e);
			}
		});

		future.get(1, TimeUnit.SECONDS);
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		test2();

	}

}
