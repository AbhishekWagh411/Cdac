package com.day2.assi;

public class A {
private static int num1=10;
private int num2=20;
static {
	System.out.println("Inside class A");
}
public static int getNum1() {
	return num1;
}
public static void setNum1(int num1) {
	A.num1 = num1;
}
public int getNum2() {
	return num2;
}
public void setNum2(int num2) {
	this.num2 = num2;
}

}
