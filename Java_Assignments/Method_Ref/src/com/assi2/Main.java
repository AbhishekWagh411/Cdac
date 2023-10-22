package com.assi2;

public class Main {
public static void main(String[] args) {
	Sample s= new Sample();
	Third ref = s::disp;
	ref.show(100);
}
}
