package com.interview.threads;

public class World extends Thread {
	@Override
	public void run() {
		for(;;) {
			System.out.println("World !");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
