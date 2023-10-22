package com.assi4;

public class Display {
	public static void main(String[] args) {
		Calculator cal=(a, b)->{return a*b;};
		System.out.println(cal.multiply(10, 20));
	}
}
