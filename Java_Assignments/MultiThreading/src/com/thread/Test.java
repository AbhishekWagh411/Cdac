package com.thread;

public class Test extends Thread {

	@Override
	public void run() {
		char ch= 'A';
		for(int i = 0;i<10;i++) {
			System.out.print(ch++ +" ");
		}
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.start();
	}
}
