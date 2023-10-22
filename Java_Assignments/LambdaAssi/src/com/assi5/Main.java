package com.assi5;

public class Main {
public static void main(String[] args) {
	Display d= new Display();
	Runnable ref =()->{d.disp();};
	Thread t1 = new Thread(ref);
	Thread t2 = new Thread(ref);
	t1.start();
	t2.start();
	
}
}
