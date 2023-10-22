package assi1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Assign1 {
	public static void main(String[] args) {

//		 Customer customer= new Customer(1, "Abhi", "xyz", 23);
//	
//		try(FileOutputStream fos = new FileOutputStream("D:\\for_client\\abc.txt")){
//			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
//						
//							oos.writeObject(customer);
//						
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		Customer cust= null;
		try(FileInputStream fis = new FileInputStream("D:\\for_client\\abc.txt")){
				try(ObjectInputStream ois = new ObjectInputStream(fis)){
					cust=(Customer) ois.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cust);
	
	}
	}
	
