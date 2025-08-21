package com.interview.all;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitVsExecuteMethod {

	public static void main(String[] args) {
		ExecutorService executors = Executors.newFixedThreadPool(3);
		executors.execute(()->{
			System.out.println("Executing Task !!!!");
		});
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		Future<String> future = executorService.submit(()->{
			return "Result : 1";
		});
		try {
			String string = future.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}
