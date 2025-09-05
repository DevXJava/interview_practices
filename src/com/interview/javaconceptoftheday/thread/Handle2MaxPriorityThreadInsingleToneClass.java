package com.interview.javaconceptoftheday.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SingletonThreadManager{
	
	private static volatile SingletonThreadManager instance;
	private final ExecutorService executorService;
	
	public SingletonThreadManager() {
		executorService = Executors.newFixedThreadPool(2);
	}
	public static SingletonThreadManager getInstance() {
		if(instance==null) {
			synchronized (SingletonThreadManager.class) {
				if(instance==null) {
					instance = new SingletonThreadManager();
				}
				
			}
		}
		return instance;
	}
	public void executeTask(Runnable task) {
		Thread thread = new Thread(task);
		thread.setPriority(Thread.MAX_PRIORITY);
		executorService.execute(thread);
	}
	public void shutDown() {
		executorService.shutdown();
	}
}



public class Handle2MaxPriorityThreadInsingleToneClass {
	
	public static void main(String[] args) {
		SingletonThreadManager manager = new SingletonThreadManager();
		manager.executeTask(()->System.out.println("Thread 1 executing"));
		manager.executeTask(()->System.out.println("Thread 2 executing"));
		manager.shutDown();

	}

}
