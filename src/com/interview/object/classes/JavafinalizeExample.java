package com.interview.object.classes;

public class JavafinalizeExample {

	public static void main(String[] args) {
		JavafinalizeExample example = new JavafinalizeExample();
		// System.out.println(example.hashCode());
		example = null;
		System.gc();
		// System.out.println("calling system gc");
	}
    
	@Override
	protected void finalize() throws Throwable {

		System.out.println("Finalize method is called ");
	}

}
