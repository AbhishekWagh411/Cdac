package com.jdbc.day1;

public class Product {

	private int pid;
	private int qty;
	private double cost;
	private String pname;
	
	
	
	public Product(int pid, int qty, double cost, String pname) {
		super();
		this.pid = pid;
		this.qty = qty;
		this.cost = cost;
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", qty=" + qty + ", cost=" + cost + ", pname=" + pname + "]";
	}

}
