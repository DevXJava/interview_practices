package com.interview;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

	public static void main(String[] args) {
		int number = 3;
		CompletableFuture.supplyAsync(()->{
			return number*number;
		}).thenAccept(result->System.out.println("Result : "+result));

	}

}
