package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindLessThen9000SalaryDepartmentWise {

	private int empId;
	private String empName;
	private String empDepartment;
	private int empSalary;

	public FindLessThen9000SalaryDepartmentWise(int empId, String empName, String empDepartment, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "FindLissThen9000SalaryDepartmentWise [empId=" + empId + ", empName=" + empName + ", empDepartment="
				+ empDepartment + ", empSalary=" + empSalary + "]";
	}

	public static void main(String[] args) {
		
		List<FindLessThen9000SalaryDepartmentWise> list = new ArrayList<>();
		list.add(new FindLessThen9000SalaryDepartmentWise(1, "A", "Teacher", 9000));
		list.add(new FindLessThen9000SalaryDepartmentWise(2, "B", "Teacher", 7000));
		list.add(new FindLessThen9000SalaryDepartmentWise(3, "C", "Doctor", 8000));
		list.add(new FindLessThen9000SalaryDepartmentWise(4, "D", "Collector", 6000));
		list.add(new FindLessThen9000SalaryDepartmentWise(5, "E", "Teacher", 5000));
		
		Map<String,List<FindLessThen9000SalaryDepartmentWise>> map = list.stream()
				.filter(e->e.getEmpSalary()<9000)
				.collect(Collectors.groupingBy(FindLessThen9000SalaryDepartmentWise::getEmpDepartment));
		map.forEach((k,v)->System.out.println(k+"   "+v));
		
	}

}
