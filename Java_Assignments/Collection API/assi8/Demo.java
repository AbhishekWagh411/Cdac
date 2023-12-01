package com.assi8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Abhishek", " ae", 12000);
		Employee e2 = new Employee(2, "Mayur", " je", 22000);
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		
		try(FileOutputStream fos = new FileOutputStream("D:\\abc.txt")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(list);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("D:\\abc.txt")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				try {
					List<Employee> list1=(List<Employee>)ois.readObject();
					Iterator<Employee> itr = list1.iterator();
					while(itr.hasNext()) {
						String s =itr.next().disp();
						System.out.println(s);
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e3) {
			e3.printStackTrace();
		} catch (IOException e3) {
			e3.printStackTrace();
		}
		
	}
}
