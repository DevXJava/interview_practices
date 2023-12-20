package com.interviews;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetStudentStatesWise {

	private int studentId;
	private String studentsName;
	private String studentState;

	public GetStudentStatesWise(int studentId, String studentsName, String studentState) {
		super();
		this.studentId = studentId;
		this.studentsName = studentsName;
		this.studentState = studentState;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentsName() {
		return studentsName;
	}

	public void setStudentsName(String studentsName) {
		this.studentsName = studentsName;
	}

	public String getStudentState() {
		return studentState;
	}

	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}

	@Override
	public String toString() {
		return "GetStudentStatesWise [studentId=" + studentId + ", studentsName=" + studentsName + ", studentState="
				+ studentState + "]";
	}

	public static void main(String[] args) {
		List<GetStudentStatesWise> list = new ArrayList<GetStudentStatesWise>();
		list.add(new GetStudentStatesWise(1, "jack1", "MH"));
		list.add(new GetStudentStatesWise(2, "jack2", "MH"));
		list.add(new GetStudentStatesWise(3, "jack3", "MP"));
		list.add(new GetStudentStatesWise(4, "jack4", "DL"));
		list.add(new GetStudentStatesWise(5, "jack5", "GJ"));
		list.add(new GetStudentStatesWise(6, "jack6", "UP"));
		list.add(new GetStudentStatesWise(7, "jack7", "UP"));
		Map<String, List<GetStudentStatesWise>> map = list.stream()
				.collect(Collectors.groupingBy(GetStudentStatesWise::getStudentState));
		//map.forEach((states, students) -> System.out.println(states + "  :  " + students));

		for (Entry<String, List<GetStudentStatesWise>> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+"  :  "+entry.getValue().listIterator());

		}
		
	}

}