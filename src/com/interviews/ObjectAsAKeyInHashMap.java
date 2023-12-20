package com.interviews;

import java.util.HashMap;

class Employee{
	private int empno;
	private String empname;
	public Employee(int empno, String empname) {
		super();
		this.empno = empno;
		this.empname = empname;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
}


class Student {
	private int rollno;
	private String name;
	// Constructor
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	public String getname() {
		return this.name;
	}
	public int getmarks() {
		return this.rollno;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setmarks(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public int hashCode() {
		final int temp =14;
		int ans =1;
		ans = temp*ans+rollno;
		return ans;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(this.getClass()!=obj.getClass()) {
			return false;
		}
		Student student = (Student)obj;
		if(this.rollno!=student.rollno) {
			return false;
		}
		return true;
	}
}

public class ObjectAsAKeyInHashMap {

	public static void main(String[] args) {
		HashMap<Student, String> map = new HashMap<>(); 
		  
        Student one = new Student(1, "Geeks1"); // key1 
  
        Student two = new Student(2, "Geeks2"); // key2 
  
        // put keys in map 
        map.put(one, one.getname()); 
        map.put(two, two.getname()); 
  
        // changing key state so that 
        // hashcode() should be calculated again 
        one.setname("Not Geeks1"); 
        two.setname("Not Geeks2"); 
  
        // still prints Geeks1 
        System.out.println(map.get(one)); 
  
        // still prints Geeks1 
        System.out.println(map.get(two)); 
  
        // try with newly created key with same Rollno 
        Student three = new Student(1, "Geeks3"); 
  
        // we get Geeks1 
        System.out.println(map.get(three)); 
        
        Employee emp1 = new Employee(1, "John");
        Employee emp2 = new Employee(2, "Johns");
        Employee emp3 = new Employee(3, "Johnsd");
        
        HashMap<Employee, String> mapEmp = new HashMap<>(); 
        mapEmp.put(emp1, "Aa");
        mapEmp.put(emp2, "Ab");
        mapEmp.put(emp3, "Ac");
        
        System.out.println("size is : "+mapEmp.size());
        
        mapEmp.forEach((k,v)->System.out.println(k.getEmpno()));
    } 

}
