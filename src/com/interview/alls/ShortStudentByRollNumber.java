package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShortStudentByRollNumber implements Comparable<ShortStudentByRollNumber>{
	private Integer rollNumber;
	private String studentName;
	public ShortStudentByRollNumber(Integer rollNumber, String studentName) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public int compareTo(ShortStudentByRollNumber o) {
		return this.rollNumber-o.rollNumber;
	}

	public static void main(String[] args) {
		//1st Way 
		
		List<ShortStudentByRollNumber> list = new ArrayList<>();
		list.add(new ShortStudentByRollNumber(4, "C"));
		list.add(new ShortStudentByRollNumber(2, "B"));
		list.add(new ShortStudentByRollNumber(3, "A"));
		list.add(new ShortStudentByRollNumber(1, "D"));
		Collections.sort(list,(l1,l2)->l1.getRollNumber()-l2.getRollNumber());
        for (ShortStudentByRollNumber student : list) {
		     System.out.println(student.getRollNumber()+"  "+student.getStudentName());
		}
        //2nd way
        Collections.sort(list);
        for (ShortStudentByRollNumber student : list) {
		     System.out.println(student.getRollNumber()+"  "+student.getStudentName());
		}
        
        //Second way
        List<ShortStudentByRollNumber> byRollNumbers = list.stream()
        		.sorted((v1,v2)->v1.getRollNumber()-v2.getRollNumber())
        		.collect(Collectors.toList());
        byRollNumbers.forEach((l)->System.out.print(l.getRollNumber()));
        
        //Third Way
        List<ShortStudentByRollNumber> byRollNumbers2 = list.stream()
        		.sorted(Comparator.comparing(ShortStudentByRollNumber::getRollNumber).reversed()).collect(Collectors.toList());

	}
}
