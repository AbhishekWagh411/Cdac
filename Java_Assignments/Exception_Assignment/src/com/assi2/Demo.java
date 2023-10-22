package com.assi2;

public class Demo {
public static void main(String[] args) {
	MyMath m = new MyMath();
	try {
		m.disp(8);
	}catch(NumberNotDivisibleBySevenException n){
		n.printStackTrace();
	}
}
}
