package com.interview.objectsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparableStudentSorting implements Comparable<ComparableStudentSorting> {
	
	private int studentid;
	private String studentname;
	private String studentAddress;
	
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
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public ComparableStudentSorting(int studentid,String studentname,String studentAddress) {
		this.studentid=studentid;
		this.studentname=studentname;
		this.studentAddress=studentAddress;
	}
	
	@Override
	public int compareTo(ComparableStudentSorting o) {
		// TODO Auto-generated method stub
		//return (this.studentid-o.studentid);
		if(studentid==o.studentid)
			return 0;
		else if(studentid<o.studentid)  //it will ascending order //studentid<o.studentid  it will return in descending order
			return 1;
		else
			return -1;
			
		
	}
	
	// sorting by name using Comparator interface
	public static Comparator<ComparableStudentSorting> sortingByName = new Comparator<ComparableStudentSorting>() {
		@Override
		public int compare(ComparableStudentSorting o1, ComparableStudentSorting o2) {
			// TODO Auto-generated method stub
			return o1.getStudentname().compareTo(o2.getStudentname());
		}
	};
	
	public static void main(String[] args) {
		
		ArrayList<ComparableStudentSorting> al = new ArrayList<ComparableStudentSorting>();
		al.add(new ComparableStudentSorting(3, "Devedra", "Indore"));
		al.add(new ComparableStudentSorting(2, "Vidya", "Jabalpur"));
		al.add(new ComparableStudentSorting(1, "Bhavesh", "Khandwa"));
		
		Collections.sort(al);
		for (ComparableStudentSorting comp : al) {
			System.out.println(comp.studentid);
			
		}
		//===============================================
		Comparator<ComparableStudentSorting> byName = Comparator.comparing(ComparableStudentSorting::getStudentname);
		Collections.sort(al,byName);
		for (ComparableStudentSorting comp : al) {
			System.out.println(comp.studentname);
			
		}
		
	}

}
