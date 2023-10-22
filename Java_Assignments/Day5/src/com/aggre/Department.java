package com.aggre;

public class Department {
	private String departmentName;
	private Teacher teacher;
	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
		
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getTeacher() {
		return teacher.toString();
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", " + teacher.toString() + "]";
	}
	
	
	
}
