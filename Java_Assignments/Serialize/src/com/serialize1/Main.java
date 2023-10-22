package com.serialize1;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
	Student s1= new Student(1, "Abhi");
	Student s2 = new Student(2, "Wagh");
	List<Student> list = new ArrayList<>();
	list.add(s1);
	list.add(s2);
	WriteRead wr = new WriteRead();
	wr.write(list);
	wr.read();
	
	}}
