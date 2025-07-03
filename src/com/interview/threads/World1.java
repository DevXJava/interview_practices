package com.interview.threads;

public class World1 implements Runnable{
    
	public static void main(String[] args) {
		Thread thread = new Thread(new World1());
		thread.start();

	}

	@Override
	public void run() {
		for(;;) {
			System.out.println("Hello World !");
		}
		
	}

}
