package com.day7.assi10;

public class Demo {
	int sum;
public int disp(int...k) {
	for (int i : k) {
		sum+=i;
	}
	return sum;
}

public static void main(String[] args) {
	Demo d = new Demo();
	System.out.println(d.disp(10,20,30));
}
}
