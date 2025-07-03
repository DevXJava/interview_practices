package com.interview.singleton.preventing;

public class SingletonPattern {

	private static SingletonPattern SINGLETON_PATTERN = null;

	private SingletonPattern() {

	}

	public static SingletonPattern getInstance() {
		synchronized (SingletonPattern.class) {
			if (SINGLETON_PATTERN == null) {
				SINGLETON_PATTERN = new SingletonPattern();
			}

			return SINGLETON_PATTERN;
		}
	}

	public static void main(String[] args) {
		SingletonPattern singletonPattern = SingletonPattern.getInstance();
		SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
		
		System.out.println(singletonPattern.hashCode()+"   "+singletonPattern2.hashCode());

	}

}
