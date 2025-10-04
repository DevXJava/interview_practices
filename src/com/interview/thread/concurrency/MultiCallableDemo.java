package com.interview.thread.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//🔹 Example 2: Multiple Callable Tasks
public class MultiCallableDemo {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		List<Callable<String>> callables = Arrays.asList(
				
				()-> "Task 1 executed by " + Thread.currentThread().getName(),
				()-> "Task 2 executed by " + Thread.currentThread().getName(),
				()-> "Task 3 executed by " + Thread.currentThread().getName()
				
				);
		
		try {
			//invoke all runs all tasks and return future
			List<Future<String>> futures = executorService.invokeAll(callables);
			for(Future<String> future : futures) {
				System.out.println("result is : "+future.get());
			}
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
			
		executorService.shutdown();

	}

}
