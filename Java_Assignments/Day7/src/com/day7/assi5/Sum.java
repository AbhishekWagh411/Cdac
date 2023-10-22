package com.day7.assi5;

public class Sum {
public static void main(String[] args) {
	int sum=0;
	for (String string : args) {
		int k= Integer.parseInt(string);
		sum+=k;
	}
	System.out.println(sum);
}
}
