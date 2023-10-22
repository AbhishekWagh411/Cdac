package com.assi2;

import com.assi1.MyArithException;

public class MyMath {
public void disp(int num) throws NumberNotDivisibleBySevenException{
	if(num%7!=0) {
		throw new NumberNotDivisibleBySevenException("Not Divisible By 7");
	}else
		System.out.println(num);
}
}
