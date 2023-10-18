package com.assi9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Map<Integer, String> map = new HashMap<>();
	map.put(1, "Virat");
	map.put(2, "Babar");
	map.put(3, "Rohit");
	map.put(4, "Smith");
	map.put(5, "Rizwan");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Rank");
	Integer i = sc.nextInt();
	System.out.println(map.get(i));
	sc.close();
}
}
