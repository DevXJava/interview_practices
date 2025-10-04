package com.interview.thread.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAnyDemo {

	public static void main(String[] args) {
	
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		List<Callable<String>> callables = Arrays.asList(
				
				()-> { Thread.sleep(1000); return "Thread 1 executing "+Thread.currentThread().getName();},
				()-> { Thread.sleep(1000); return "Thread 2 executing "+Thread.currentThread().getName();},
				()-> { Thread.sleep(1000); return "Thread 3 executing "+Thread.currentThread().getName();},
				()-> { Thread.sleep(1000); return "Thread 4 executing "+Thread.currentThread().getName();},
				()-> { Thread.sleep(1000); return "Thread 5 executing "+Thread.currentThread().getName();}
				);
		
		       try {
				String futures = executorService.invokeAny(callables);
				System.out.println("result is : "+futures);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		    
		executorService.shutdown();

	}

}
