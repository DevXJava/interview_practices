package com.interview;

public abstract class AbstractParent {
	private int id;
	private String name;

	public AbstractParent() {
		
	}

	public AbstractParent(int id, String name) {
		this.id=id;
		this.name = name;
	}

	// Abstract method
    abstract void makeSound();

    // Concrete method
    public void displayInfo() {
        System.out.println("Animal Name: " + name);
    }
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
