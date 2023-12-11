package com.academian;

public class Test implements Runnable{

	public void run(){

		System.out.printf("GFG ");

	}

	public static void main(String[] args) throws InterruptedException{

		Thread thread1 = new Thread(new Test());

		thread1.start();

		thread1.start();

		System.out.println(thread1.getState());

	}
}