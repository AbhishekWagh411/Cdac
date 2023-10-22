package com.assi1;

public class Demo {
public static void main(String[] args) {
	Second s = new Second();
	First ref= s::fun1;
	ref.disp1();
	
}
}
