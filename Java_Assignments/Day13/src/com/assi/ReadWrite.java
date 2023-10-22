package com.assi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ReadWrite {

	public void write(List<Object> list) {
		try(FileOutputStream fos= new FileOutputStream("D:\\abc2.txt")){
			try(ObjectOutputStream oos= new ObjectOutputStream(fos)){
				oos.writeObject(list);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	public List<?> read() {
		List<?> list = null;
		try(FileInputStream fis = new FileInputStream("D:\\abc2.txt")){
			try(ObjectInputStream ois= new ObjectInputStream(fis) ){
				list=(List<?>)ois.readObject();
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
