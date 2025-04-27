package com.interview.singleton.preventing;

public class CloningSingleton implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException, Exception {
        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = (Singleton) instanceOne;
        System.out.println("hashCode of instance 1 - " + instanceOne.hashCode());
        System.out.println("hashCode of instance 2 - " + instanceTwo.hashCode());
    }

}
