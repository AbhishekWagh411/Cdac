package com.day9.clone;

public class CarDemo {

	public static void main(String[] args) {
		Car c = new Car("Swift");
		c.getE().setSpeed(150);
		System.out.println(c);
		System.out.println("After clone");
		try {
			Car c1= (Car)c.clone();
			c1.getE().setSpeed(250);
			
			System.out.println(c);
			System.out.println(c1);
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
	}
}
