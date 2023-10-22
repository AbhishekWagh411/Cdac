package com.obj.cov;

public class Main {
public static void main(String[] args) {
	Person p[]= new Person[3];
	p[0]=new Student("Abhishek Wagh",23,1,213);
	p[1]= new Student("Mahanag", 23,2,220);
	p[2]= new Teacher("Mayur", 22,"kkwagh",100000,54);
	for(int i=0;i<p.length;i++) {
		System.out.println(p[i].toString());
	}
}
}
