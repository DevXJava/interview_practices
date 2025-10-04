package com.interview.thread.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledPoolDemo {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
		
		List<Callable<String>> callables = Arrays.asList(
				
				()->{Thread.sleep(100); return "Thread 1 is executing"+Thread.currentThread().getName();},
				()->{Thread.sleep(100); return "Thread 2 is executing"+Thread.currentThread().getName();},
				()->{Thread.sleep(100); return "Thread 3 is executing"+Thread.currentThread().getName();}
				
				);
		try {
			List<Future<String>> futures = new ArrayList<>();
			//schedule each task with a delay of 1 second
			for(Callable<String> callable : callables) {
				Future<String> future = scheduledExecutorService.schedule(callable, 10, TimeUnit.SECONDS);
				//If you want repeated execution
				//Starts after 2s.
				//Repeats every 3s.
				//scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("Running: " + Thread.currentThread().getName()),2, 3, TimeUnit.SECONDS);
				futures.add(future);
			}
			
			//collect result 
			for(Future<String> future:futures) {
				System.out.println(future.get());
			}
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		scheduledExecutorService.shutdown();
		
	}

}
