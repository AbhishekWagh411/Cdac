package com.assi2;

public class Demo {
public static void main(String[] args) {
	Second ref1 = ()-> {System.out.println("Using lambda disp4");};
	Second ref2= ()-> {
		System.out.println("Using lambda ref2 disp4");
	};
	ref1.disp4();
	ref2.disp4();
}
}
