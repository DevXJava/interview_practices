package com.interview.lang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	private static final long serialVersionUID = -791280482011292693L;
	String dogColor;
	String dogBread;

	public Dog(String dogColor, String dogBread) {
		this.dogColor = dogColor;
		this.dogBread = dogBread;
	}
}

public class SerializationExample {

	public static void main(String[] args) {
		Dog dog = new Dog("black", "vodafone dog");
		Dog dog1=null;
		String filenme = "file.ser";
		try {
			FileOutputStream fos = new FileOutputStream(filenme);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dog);
			fos.close();
			oos.close();
			//now will deserialize
			FileInputStream fis = new FileInputStream(filenme);
			ObjectInputStream ois = new ObjectInputStream(fis);
			dog1 =(Dog)ois.readObject();
			fis.close();
			oos.close();
			System.out.println(dog1.dogColor+"   "+dog1.dogBread);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
