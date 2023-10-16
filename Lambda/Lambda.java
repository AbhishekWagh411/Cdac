package com.patterns;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
public static void main(String[] args) {
	List<Integer> list= new ArrayList<>();
	list.add(100);
	list.add(50);
	list.add(200);
	list.add(60);
	list.add(500);
	list.stream().sorted((a,b)->{return a.compareTo(b);}).forEach(System.out::println);
	
}
}
