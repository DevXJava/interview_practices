package com.interview.volkasvegon;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {

	int studentid;
	String studentname;
	String studentstate;

	public Student(int studentid, String studentname, String studentstate) {
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentstate = studentstate;

	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentstate() {
		return studentstate;
	}

	public void setStudentstate(String studentstate) {
		this.studentstate = studentstate;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentstate=" + studentstate
				+ "]";
	}
	
	

}

public class GroupStudentByState {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();

		list.add(new Student(1, "jack", "MH"));
		list.add(new Student(2, "jack", "MH"));
		list.add(new Student(3, "jack", "MP"));
		list.add(new Student(4, "jack", "DL"));
		list.add(new Student(5, "jack", "GJ"));
		list.add(new Student(6, "jack", "UP"));
		list.add(new Student(7, "jack", "UP"));
		
		Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(Student::getStudentstate));
		
		System.out.println(map);

	}

}
