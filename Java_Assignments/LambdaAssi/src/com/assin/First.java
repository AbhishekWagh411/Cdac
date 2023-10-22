package com.assin;
@FunctionalInterface
public interface First {
	void disp1();
	default void disp2() {
		System.out.println("Disp 2");
	}
	static void disp3() {
		System.out.println("Disp 3");
	}
	
}
