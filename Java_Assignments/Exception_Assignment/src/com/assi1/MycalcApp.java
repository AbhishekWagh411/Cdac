package com.assi1;

public class MycalcApp {
public static void main(String[] args) {
	Calculator c = new Calculator();
	try {
		int result=c.calDouble(-20);
	System.out.println(result);
	} catch (MyArithException e) {
		e.printStackTrace();
	}
}
}
