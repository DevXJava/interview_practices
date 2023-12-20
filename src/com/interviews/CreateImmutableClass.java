package com.interviews;

public final class CreateImmutableClass {

	private int i;
	public CreateImmutableClass(int i) {
		this.i=i;
	}
	public CreateImmutableClass modify(int i) {
		if(this.i==i)
			return this;
		else return  (new CreateImmutableClass(i));
	}
	public static void main(String[] args) {
		
		CreateImmutableClass class1 = new CreateImmutableClass(10);
		CreateImmutableClass class2 = class1.modify(100); // 100==10
		CreateImmutableClass class3 = class1.modify(10); // 10==10
		
		System.out.println(class1==class2); // false 
		System.out.println(class1==class3); // trues
		
		CreateImmutableClass class4 = class1.modify(100); // 100==10
		System.out.println(class2==class4); //false

	}

}
