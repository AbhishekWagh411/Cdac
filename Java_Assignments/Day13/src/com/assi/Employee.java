package com.assi;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = -4046582468755777471L;
	private int empid;
	private String name,desig;
	private double salary;
	public Employee(int empid, String name, String desig, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", desig=" + desig + ", salary=" + salary + "]";
	}
	
	
}
