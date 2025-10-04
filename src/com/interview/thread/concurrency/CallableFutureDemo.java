package com.interview.thread.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {

	public static void main(String[] args) {
		
		//create a thread pool of 2 threads
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		//submit a Callable task 
		Callable<Integer> task =()->{
			System.out.println("Task executed by : "+Thread.currentThread().getName());
			Thread.sleep(1000); //simulate delay
			return 10*10; //return result 
		};

		Future<Integer> future = executorService.submit(task);
		
		System.out.println("Waitting for result");
		
		try {
			Integer result = future.get();
			System.out.println("Result is : "+result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} 
		executorService.shutdown();
	}

}
