package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCompletableExa {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		Callable<String> t1 = () ->{return "Thread : 1";};
		Callable<String> t2 = () ->{return "Thread : 2";};
		Callable<String> t3 = () ->{return "Thread : 3";};
		
		List<Callable<String>> callables = Arrays.asList(t1,t2,t3);
		
		try {
			List<Future<String>> completableFutures = executorService.invokeAll(callables);
			for(Future<String> future : completableFutures) {
				System.out.println("futures is : "+future.get());
			}
		} catch (InterruptedException | ExecutionException e) {

			e.printStackTrace();
		}
		
		//using completableFuture
		ExecutorService executors = Executors.newFixedThreadPool(3);
		
		CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(()->"CF Thread : 1",executors);
		CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(()->"CF Thread : 2",executors);
		CompletableFuture<String> cf3 = CompletableFuture.supplyAsync(()->"CF Thread : 3",executors);

		CompletableFuture.allOf(cf1,cf2,cf3).thenRun(()->{
			
			try {
				System.out.println(cf1.get());
				System.out.println(cf2.get());
				System.out.println(cf3.get());
			} catch (InterruptedException  | ExecutionException e) {
				e.printStackTrace();
			} 
			
		});
		
	}

}
