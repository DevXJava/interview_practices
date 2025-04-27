package com.javaconceptoftheday.thread;

class ThreadUingThreadClass extends Thread {

	@Override
	public void run() {
		// Task of this thread is to print multiplication of successive numbers up to
		// 1000 numbers
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " * " + (i + 1) + " = " + i * (i + 1));
		}
		System.out.println("============================================");
	}

}

//==============================================================
class ThreadUsingRunnableInterface implements Runnable {
	@Override
	public void run() {
		// Task of this thread is to print multiplication of successive numbers up to
		// 1000 numbers
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " * " + (i + 1) + " = " + i * (i + 1));
		}

	}
}

public class CreatingThread {

	public static void main(String[] args) {
		ThreadUingThreadClass threadUingThreadClass = new ThreadUingThreadClass();
		threadUingThreadClass.start();
		
		ThreadUsingRunnableInterface usingRunnableInterface = new ThreadUsingRunnableInterface();
		Thread thread = new Thread(usingRunnableInterface);
		thread.start();
		

	}

}
