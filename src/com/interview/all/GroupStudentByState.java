package com.interview.all;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StudentStateGroup {

	int studentid;
	String studentname;
	String studentstate;

	public StudentStateGroup(int studentid, String studentname, String studentstate) {
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
		List<StudentStateGroup> list = new ArrayList<StudentStateGroup>();

		list.add(new StudentStateGroup(1, "jack", "MH"));
		list.add(new StudentStateGroup(2, "jack", "MH"));
		list.add(new StudentStateGroup(3, "jack", "MP"));
		list.add(new StudentStateGroup(4, "jack", "DL"));
		list.add(new StudentStateGroup(5, "jack", "GJ"));
		list.add(new StudentStateGroup(6, "jack", "UP"));
		list.add(new StudentStateGroup(7, "jack", "UP"));
		
		Map<String, List<StudentStateGroup>> map = list.stream().collect(Collectors.groupingBy(StudentStateGroup::getStudentstate));
		
		System.out.println(map);

	}

}
