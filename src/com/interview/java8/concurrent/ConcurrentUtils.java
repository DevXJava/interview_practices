package com.interview.java8.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class ConcurrentUtils {
	
	public static void stop(ExecutorService executorService) {
		
		try {
			executorService.shutdown();
			executorService.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println("termination interrupted");
			e.printStackTrace();
		}finally {
			if(!executorService.isTerminated()) {
				System.out.println("Killing non finish tasks !");
			}
			executorService.shutdown();
			System.out.println("shutdown finished");
		}
		
	}
	
	public static void sleep(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			throw new IllegalStateException();
		}
		
	}

}
