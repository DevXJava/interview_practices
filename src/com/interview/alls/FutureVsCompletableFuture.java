package com.interview;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureVsCompletableFuture {

	
	public void FutureExample() throws InterruptedException, ExecutionException {
		/*
		 a Future represents the result of an asynchronous computation — something
		 that may not be immediately available but will be computed in the background
		 and retrieved later.
		  
		 🔁 Real-life analogy:
           Think of it like ordering food in a restaurant. You get a token (like Future) and continue chatting. 
            When your food is ready, you can use the token to get it.
		 */


		ExecutorService executor = Executors.newSingleThreadExecutor();
        // Submit a task that returns a result
        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(2000); // simulate delay
            return 42;
        });

        System.out.println("Task submitted. Doing other work...");

        // Get result (blocks until ready)
        Integer result = future.get();

        System.out.println("Result: " + result);

        executor.shutdown();
	}
	public void CompletableFutureExample() {
		/*
		 CompletableFuture in Java is an enhanced version of Future, introduced in
		 Java 8. It supports asynchronous, non-blocking, and functional-style
		 programming. Unlike Future, it allows you to chain tasks, register call backs,
		 and compose multiple asynchronous operations.
		 
		 */
		
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            // Simulate long-running task
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            return 42;
        });

        future.thenApply(result -> result * 2)
              .thenAccept(finalResult -> System.out.println("Final result: " + finalResult));

        System.out.println("Task is running...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
