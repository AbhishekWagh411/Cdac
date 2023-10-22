package assi2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;

public class Assi2 {
public static void main(String[] args) {
//	Student s= new Student(007, "Abhi", 23);
//	try(FileOutputStream fos = new FileOutputStream("D:\\for_client\\abc.txt")){
//		try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
//			oos.writeObject(s);
//		}
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	Student s = null;
	try(FileInputStream fis = new FileInputStream("D:\\for_client//abc.txt")){
		try(ObjectInputStream oos = new ObjectInputStream(fis)){
			s=(Student)oos.readObject();
			
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
	System.out.println(s);
	
	
}
}
