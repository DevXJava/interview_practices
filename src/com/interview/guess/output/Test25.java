package com.interview.guess.output;

public class Test25 implements Runnable{

	public void run(){

		System.out.printf("GFG ");

	}

	public static void main(String[] args) throws InterruptedException{

		Thread thread1 = new Thread(new Test25());

		thread1.start();

		thread1.start();

		System.out.println(thread1.getState()+"Hi");

	}
}