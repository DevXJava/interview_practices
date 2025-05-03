package com.interview.all;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterface implements Callable<String> {

	@Override
	public String call() throws Exception {
		return "Callable result !";
	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<String> future = executorService.submit(new CallableInterface());

		try {
			String result = future.get();
			System.out.println("result is :"+result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		executorService.shutdown();

	}

}
