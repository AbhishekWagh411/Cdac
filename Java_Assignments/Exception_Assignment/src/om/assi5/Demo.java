package om.assi5;

public class Demo {
public static void main(String[] args) {
	MyResource m=null;
	try {
		m = new MyResource(010);
	} catch (ResourceNotAllocatedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	m.disp();
}
}
