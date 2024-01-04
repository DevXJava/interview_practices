package com.interview.generic;
class GenericSingleEelement<T>{
	T obj;
	public GenericSingleEelement(T obj) {
		// TODO Auto-generated constructor stub
		this.obj=obj;
	}
	public T getObject() {
		return this.obj;
	}
}
class GenericDualEelement<U,T>{
    U key;
	T value;
	public GenericDualEelement(U key,T value) {
		this.key = key;
		this.value = value;
	}
	public void print() {
		System.out.println("key is :"+key);
		System.out.println("value is :"+value);
	}
}
class GenericMethods{
	//Generic method
	public static<E> void printArray(E[] e) {
		for (E e2 : e) {
			System.out.println("elements :"+e2);
		}
		
	}
}
public class GenericTest {

	public static void main(String[] args) {
		
		GenericSingleEelement<Integer> genericInt = new GenericSingleEelement<Integer>(50);
		System.out.println(genericInt.getObject());
		GenericSingleEelement<String>  genericStr = new GenericSingleEelement<String>("Devendra");
		System.out.println(genericStr.getObject());
		
		GenericDualEelement<Integer,String> dualEelement = new GenericDualEelement<Integer,String>(1, "Apple");
		dualEelement.print();
		
		Integer arr[] = {1,2,3,4,5,6,7};
		
		GenericMethods genericMethods = new GenericMethods();
		
		genericMethods.printArray(arr);

	}

}
