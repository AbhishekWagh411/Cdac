package com.assi7;

public class Main {
public static void main(String[] args) {
	Student s = new Student("Vijay", 20);
	MyInterface ref = System.out::println;
	ref.show(s);
	
}
}
