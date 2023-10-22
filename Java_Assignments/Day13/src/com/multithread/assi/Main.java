package com.multithread.assi;
class B {
	synchronized public void disp1() {
		for(int i =1;i<=50;i++) {
			System.out.println(i);
		}
	}
	 public void disp2() {
		for(int i=50;i>0;i--) {
			System.out.println(i);
		}
	}
}
class A implements Runnable{

	@Override
	 public void run() {
		B b = new B();
		b.disp1();
		try {
			b.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.disp2();
		}
	}
	

public class Main {
	public static void main(String[] args) {
	
	A a = new A();
	Thread t1= new Thread(a);
	Thread t2= new Thread(a);
	//Thread t3= new Thread(a);
	t1.start();
	t2.start();
	//t3.start();
	}
}
