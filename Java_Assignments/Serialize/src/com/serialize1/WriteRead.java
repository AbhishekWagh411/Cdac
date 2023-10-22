package com.serialize1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WriteRead {
public void write(List<Student> list) {

	try(FileOutputStream fos = new FileOutputStream("D:\\SM_VITA\\abc")){
		try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(list);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public void read() {
	List<?> list= new ArrayList<>();
	try(FileInputStream fio = new FileInputStream("D:\\SM_VITA\\abc")){
		try(ObjectInputStream oos = new ObjectInputStream(fio)){
			list= (List<?>) oos.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	Iterator<?> itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
