package com.assi3;

public class Demo {
public static void main(String[] args) {
	Math1 m = new Math1();
	Fifth f= m::calc;
	System.out.println(f.add(10, 20));
}
}
