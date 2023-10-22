package com.obj.pr;

import java.util.Scanner;

public class Pr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student[]= new Student[3];
		
		for(int i= 0;i<student.length;i++) {
			System.out.println("Enter Details:- ");
			int id= sc.nextInt();
			sc.nextLine();
			String name= sc.nextLine();
			String address= sc.nextLine();
			student[i]= new Student(id, name, address);
		}
		for(int i= 0; i<student.length;i++) {
			System.out.println(" Id:- "+student[i].getId()+" Name:- "+student[i].getName()+" Address:- "+student[i].getAddress());
		}
		sc.close();
	}

}
