package com.assi8;

import java.io.Serializable;

public class Employee implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 257060737238166725L;
private int empid;
private String name;
private String desig;
private double basic;

public Employee(int empid, String name, String desig, double basic) {
	super();
	this.empid = empid;
	this.name = name;
	this.desig = desig;
	this.basic = basic;
}

public String disp() {
	return "Employee [empid=" + empid + ", name=" + name + ", desig=" + desig + ", basic=" + basic + "]";
}

}
