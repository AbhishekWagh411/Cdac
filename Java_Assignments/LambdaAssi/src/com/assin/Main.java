package com.assin;

public class Main {
public static void main(String[] args) {
	First ref = ()-> {System.out.println("Using Lambda Expression");};
	ref.disp1();
	ref.disp2();
	First.disp3();
}
}
