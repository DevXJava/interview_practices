package com.java8.concurrent;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture2 {
	/*flexible way to write asynchronous, non-blocking code. It was introduced in Java 8 and has become popular due 
	  to its ease of use and ability to handle complex asynchronous workflows*/
	 


	public static void main(String[] args) {
		//Example with Chaining:
		CompletableFuture.supplyAsync(()->10)
		.thenApply(x -> x * 2)
		.thenApply(x -> x + 5)
		.thenAccept(result->System.out.println(result));

	}

}
