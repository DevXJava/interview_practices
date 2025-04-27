package com.interview.singleton.preventing;



public final class Singleton {

	private static volatile Singleton instance = null;
	

	private Singleton() {
	}
	
	// preventing from cloning
	@Override
    protected Object clone() throws CloneNotSupportedException{  
        return super.clone();
    }
	// preventing from serialization
	protected Object readResolveObject() { 
		return instance; 
		} 
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}