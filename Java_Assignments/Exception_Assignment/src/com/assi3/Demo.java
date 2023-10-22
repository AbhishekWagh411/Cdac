package com.assi3;

public class Demo {

	public int show1(int num) throws MyExceptions {
		return show2(num);
	}
	public int show2(int num) throws MyExceptions {
		return show3(num);
	}
	public int show3(int num)throws MyExceptions {
		if(num>10) {
			throw new MyExceptions("number is greater than 10");
		}
		else return num;
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		try {
			int res=d.show1(1);
			System.out.println(res);
		}
		catch(MyExceptions m) {
			m.printStackTrace();
		}
	}
}
