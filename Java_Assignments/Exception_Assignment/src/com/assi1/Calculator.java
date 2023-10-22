package com.assi1;

public class Calculator {
	public int calDouble(int i) throws MyArithException {
		if(i<0) {
			throw new MyArithException("negative is not allowed");
		}else if(i==0) {
			throw new MyArithException("Zero is not allowed");
		}
		return 2*i;
	}
}
