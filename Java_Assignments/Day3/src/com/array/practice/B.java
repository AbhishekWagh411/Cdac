package com.array.practice;

import java.util.Scanner;

public class B {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			/*
			int num;
			A[] a = new A[3];
			for(int i=0;i<a.length;i++) {
				a[i]= new A();
			}
			for(int i =0;i<a.length;i++) {
				System.out.println("Enter number:- ");
				num= sc.nextInt();
				a[i].setI(num);
			}
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i].getI());
			}*/
			int[][] a={{10,20},{30,40},{50,60}};
			
			for(int i=0;i<a.length;i++) {
				for(int j =0;j<a[i].length;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			sc.close();
		}
}
