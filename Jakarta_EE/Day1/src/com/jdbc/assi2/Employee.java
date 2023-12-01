package com.jdbc.assi2;

public class Employee {

	private int eid ;
	private String name ;
	private String desig ;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", desig=" + desig + "]";
	}
	
}
