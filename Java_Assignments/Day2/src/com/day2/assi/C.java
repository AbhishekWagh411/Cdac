package com.day2.assi;

public class C {
	private static int num1=150;
	private static int num2= 250;
	static {
		System.out.println("Inside class C  ");
	}
	
	public int getnum1() {
		return num1;
	}
	public static int getnum2() {
		return num2;
	}
}
