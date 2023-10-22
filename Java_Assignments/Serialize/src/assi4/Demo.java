package assi4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
public static void main(String[] args) {
	Car c = new Car();
	Engine engine = new Engine();
	c.setEngine(engine);
	try(FileOutputStream file = new FileOutputStream("D:\\SM_VITA\\abc.txt")){
		try(ObjectOutputStream oos = new ObjectOutputStream(file)){
			oos.writeObject(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	}Car c2= null;
	try(FileInputStream file= new FileInputStream("D:\\SM_VITA\\abc.txt")){
		try(ObjectInputStream fis= new ObjectInputStream(file)){
			c2=(Car)fis.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	System.out.println(c2);
}
}
