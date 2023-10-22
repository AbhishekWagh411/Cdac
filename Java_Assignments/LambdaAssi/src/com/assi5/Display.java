package com.assi5;

public class Display {
	synchronized void disp() {
		for(int i = 1; i<11;i++) {
			System.out.println(i);
		}
	}
}
