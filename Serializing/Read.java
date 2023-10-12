package com.serialize1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Read {
public void read() {
	List<?> list= new ArrayList<>();
	try(FileInputStream fio = new FileInputStream("D:\\SM_VITA\\abc")){
		try(ObjectInputStream oos = new ObjectInputStream(fio)){
			list= (List<?>) oos.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Iterator<?> itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
