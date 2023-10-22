package com.assi3;

public class Demo {
static void perform() {
	System.out.println("staic perform");
}
public static void main(String[] args) {
	MyInterface ref =()-> {
		perform();
	};
	ref.fun();
}
}
