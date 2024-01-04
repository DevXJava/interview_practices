package com.interview.singleton.preventing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeserializationSingleton implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)   {

		
		try {
			Singleton instanceOne = Singleton.getInstance();
	        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
	        out.writeObject(instanceOne);
	        out.close();

	        ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
	        Singleton instanceTwo = (Singleton) in.readObject();
	        in.close();

	        System.out.println("hashCode of instance 1 is - " + instanceOne.hashCode());
	        System.out.println("hashCode of instance 2 is - " + instanceTwo.hashCode());
		}catch(Exception ex) {ex.printStackTrace();}
        
    }
}
