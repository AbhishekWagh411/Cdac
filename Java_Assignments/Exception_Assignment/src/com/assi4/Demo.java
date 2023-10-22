package com.assi4;

public class Demo {
public static void main(String[] args) {

	Authenticator a = null;
	try {
		a= new Authenticator("abc");
	} catch (InvalidLengthException e) {
		
		e.printStackTrace();
	}
	a.done();
}
}
