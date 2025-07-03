package com.interview.threads;

public class Test1 {

	public static void main(String[] args) {
		World world = new World();
        world.start();
        for (; ; ) {  // cause of infinite loop
            System.out.println("Hello");
        }
	}

}
