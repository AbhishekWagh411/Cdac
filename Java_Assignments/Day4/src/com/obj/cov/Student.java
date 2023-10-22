package com.obj.cov;

public class Student extends Person {
	private int id ;
	private int marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age,int id, int marks) {
		super(name, age);
		this.id=id;
		this.marks= marks;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student ["+"Name="+super.getName() +", Age="+super.getAge()+", id=" + id + ", marks=" + marks + "]";
	}
	
}
