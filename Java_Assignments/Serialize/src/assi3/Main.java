package assi3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
public static void main(String[] args) {
//	Student s1= new Student();
//	s1.setAge(23);
//	s1.setName("Abhi");
//	s1.setRollNo(007);
//	Student s2= new Student();
//	s2.setAge(22);
//	s2.setName("Wagh");
//	s2.setRollNo(8);
//	
//	try(FileOutputStream fos= new FileOutputStream("D:\\SM_VITA\\abc.txt")){
//		try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
//			oos.writeObject(s1);
//			oos.writeObject(s2);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	} catch (FileNotFoundException e1) {
//		e1.printStackTrace();
//	} catch (IOException e1) {
//		e1.printStackTrace();
//	}
	Student s3=null;
	Student s4= null;
	try(FileInputStream fos= new FileInputStream("D:\\SM_VITA\\abc.txt")){
		try(ObjectInputStream oos = new ObjectInputStream(fos)){
			s3=(Student)oos.readObject();
			s4=(Student)oos.readObject();			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	System.out.println(s3);
	System.out.println(s4);
}
}
