package com.interview.threadpool.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {
	
	
	public static void main(String[] args) {
		ExecutorService executors = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread(""+i);
			executors.execute(worker);
			
		}
		executors.shutdown();
        while (!executors.isTerminated()) {
        	//System.out.println("all thread finished");
        }
        System.out.println("Finished all threads");
        
        
	}

}
