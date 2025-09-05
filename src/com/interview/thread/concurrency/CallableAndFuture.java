package com.interview.thread.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableAndFuture {
//https://medium.com/@AlexanderObregon/concurrent-programming-in-java-simplifying-complex-tasks-d7adab6d25c6
//https://medium.com/@ShantKhayalian/advanced-java-concurrency-patterns-and-best-practices-6cc071b5d96c	
	static Callable<Integer> task=() ->{
		TimeUnit.SECONDS.sleep(5);
		return 123;
	};
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		Future<Integer> future = executorService.submit(task);
		System.out.println("Future Done ? "+future.isDone());
		
		try {
			Integer result = future.get();
			System.out.println("Future done? " + future.isDone());
			System.out.println("Result: " + result);
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		executorService.shutdown();

	}

}
