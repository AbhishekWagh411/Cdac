package com.assi.hashmap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
public static void main(String[] args) {
	Map<Integer, String> map= new HashMap<>();
	map.put(1, "Abhi");
	map.put(2, "Wagh");
	map.put(3, "Abhishek");
	map.put(4, "Mayur");
	
	try(FileOutputStream fos = new FileOutputStream("D:\\abc2.txt")){
		try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(map);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try(FileInputStream fis = new FileInputStream("D:\\abc2.txt")){
		try(ObjectInputStream ois= new ObjectInputStream(fis)){
			Map<?,?> m1 = (Map<?, ?>) ois.readObject();
			Set<?> set =  m1.entrySet();
			Iterator<?> itr= set.iterator();
			while(itr.hasNext()) {
				Map.Entry<?,?> map2= (Map.Entry<?,?>)itr.next();
				System.out.println(map2);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}

