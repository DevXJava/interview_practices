package com.interview.threads;

public class ThreadPriority extends Thread {
	public ThreadPriority(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Thread is Running...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }
	}

	public static void main(String[] args) {
		ThreadPriority low = new ThreadPriority("Low Priority Thread");
		ThreadPriority medium = new ThreadPriority("Medium Priority Thread");
		ThreadPriority high = new ThreadPriority("High Priority Thread");
		System.out.println("---------------------------------------------------");
		low.setPriority(Thread.MIN_PRIORITY);
		medium.setPriority(Thread.NORM_PRIORITY);
		high.setPriority(Thread.MAX_PRIORITY);
		low.start();
		medium.start();
		high.start();

	}

}
