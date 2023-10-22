package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Set;

public class ReadWrite {
public void write(Map<Integer, Car> map) {
	try(FileOutputStream fos = new FileOutputStream("D:\\abc.txt")){
		try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(map);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public Set<?> read(){
	Map<?,?> map= null;
	Set<?> set= null;
	try(FileInputStream fis = new FileInputStream("D:\\abc.txt")){
		try(ObjectInputStream ois = new ObjectInputStream(fis)){
			map= (Map<?,?>)ois.readObject();
			set= map.entrySet();
		} catch (ClassNotFoundException  e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	return set;
}
}
