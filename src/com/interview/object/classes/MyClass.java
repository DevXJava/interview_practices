package com.interview.object.classes;

import java.util.Objects;

public class MyClass {
	
	private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyClass other = (MyClass) obj;
        return id == other.id && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }

	public static void main(String[] args) {
		
		MyClass class1 = new MyClass(1, "A");
		MyClass class2 = new MyClass(1, "A");
		
		System.out.println(class1.hashCode()+"   "+class2.hashCode());
		
		System.out.println(class1==class2);
		
		System.out.println(class1.equals(class2));

	}

}
