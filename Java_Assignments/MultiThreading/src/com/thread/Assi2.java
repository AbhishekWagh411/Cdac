package com.thread;

public class Assi2 implements Runnable{

	@Override
	public void run() {
		char ch = 'A';
		for(int i=0;i<10;i++) {
			System.out.print(ch++ +" ");
		}
		
	}
	public static void main(String[] args) {
		Assi2 a = new Assi2();
		Thread t = new Thread(a);
		t.start();
		
	}

}
