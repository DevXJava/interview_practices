package com.interview.garbage.collector;

public class TestGarbageCollector {
	
	public void finalize() throws Throwable {
		super.finalize();
		System.out.println("Object is garbage collected");
	}
	
	public static void main(String[] args) {
		TestGarbageCollector collector = new TestGarbageCollector();
		TestGarbageCollector collector2 = new TestGarbageCollector();
		collector = null;
		collector2 = null;
		
		System.gc();

	}

}
