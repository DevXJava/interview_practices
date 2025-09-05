package com.interview.thread.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsAndExecutorServices {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("Asynchronous Task !");
			}
		});

	}

}
