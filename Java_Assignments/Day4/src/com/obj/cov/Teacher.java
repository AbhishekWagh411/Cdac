package com.obj.cov;

public class Teacher extends Person {
	private String school_name;
	private double salary;
	private int experience;
	
	
	public Teacher() {
		super();
	}
	public Teacher(String name, int age,String school_name, double salary, int experience) {
		super(name,age);
		this.school_name = school_name;
		this.salary = salary;
		this.experience = experience;
	}
	/**
	 * @return the school_name
	 */
	public String getSchool_name() {
		return school_name;
	}
	/**
	 * @param school_name the school_name to set
	 */
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Teacher ['"+"Name="+super.getName() +", Age="+super.getAge()+", school_name=" + school_name + ", salary=" + salary + ", experience=" + experience + "]";
	}
	
	
}
