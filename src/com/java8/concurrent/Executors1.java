package com.java8.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executors1 {

	private static void test1(long seconds) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.submit(()->{
			try {
				TimeUnit.SECONDS.sleep(seconds);
				String name = Thread.currentThread().getName();
				System.out.println("taks finised : "+name);
			} catch (InterruptedException e) {
				System.err.println("task interrupted");
				e.printStackTrace();
			}
		});
		ConcurrentUtils.stop(executorService);
	}
	
	public static void main(String[] args) {
		test1(5);

	}

}
