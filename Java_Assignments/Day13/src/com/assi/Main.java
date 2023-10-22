package com.assi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
public static void main(String[] args) {
	Employee e1 = new Employee(1, "Abhishek", "N/A", 35000);
	Employee e2 = new Employee(2, "Wagh", "N/A", 30000);
	Employee e3 = new Employee(3, "Snehal", "DATA", 75000);
	Employee e4 = new Employee(4, "Tayde", "ANALYST", 70000);
	
	List<Object> list = new ArrayList<>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	//System.out.println(list);
//	for(Employee e :list) {
//		System.out.println(e);
//	}
//	Iterator<Employee> itr = list.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
//	list.stream().forEach(System.out::println);
	
	ReadWrite rw= new ReadWrite();
	rw.write(list);
	List<?> list2=rw.read();
	Iterator<?> itr= list2.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
