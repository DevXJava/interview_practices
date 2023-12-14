package com.cloneable;

public class ObjectCloneTest implements Cloneable {
	private int id;
	private String name;

	public ObjectCloneTest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public static void main(String[] args) {
		ObjectCloneTest  cloneTest = new ObjectCloneTest(1, "Devendra");
		System.out.println("Before cloaning : "+cloneTest.id+"  : "+cloneTest.name);
		//cloning objects
		
		try {
			ObjectCloneTest cloneTest2 = (ObjectCloneTest)cloneTest.clone();
			System.out.println("After cloaning : "+cloneTest2.id+"  : "+cloneTest2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
