package com.practice;

import java.io.Serializable;

public class Engine implements Serializable {

	private static final long serialVersionUID = 5714529796094244748L;
	private int speed;
	private String type;
	
	public Engine(int speed, String type) {
		super();
		this.speed = speed;
		this.type = type;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Engine [speed=" + speed + ", type=" + type + "]";
	}
	
}
