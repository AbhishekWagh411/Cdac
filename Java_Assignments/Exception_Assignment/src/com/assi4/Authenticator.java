package com.assi4;

public class Authenticator {
private	String password;
public Authenticator(String password) throws InvalidLengthException {
	this.password=password;
	if(password.length()<5||password.length()>9) {
		throw new InvalidLengthException("Invalid Length");
	}
}
public void done() {
	if(this.password=="abcdef") {
		System.out.println("successful Authentication");
	}
}
}
