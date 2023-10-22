package com.hashmap;

import java.util.*;
import java.util.Iterator;
import java.util.Map;

public class Hm {
	int num;
public static void main(String[] args) {
	Set<String> hm = new HashSet<>();
	hm.add( "Abhi");
	hm.add( "Ajya");
	hm.add( "Mayur");
	hm.add( "Sushi");
	Iterator<String> itr = hm.iterator();
	while(itr.hasNext()) {
		System.out.println( itr.next());
		//itr.remove();
		//hm.remove(0);
	}
	System.out.println(hm);
}
}
