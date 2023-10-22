import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	Iterator<Integer> itr = list.iterator();
	list.add(3);
	while(itr.hasNext()) {
		//list.remove(0);
		itr.remove();
		//list.add(2);
	}
	List<? super Thread> list3= new ArrayList<Object>();
	list3.add(new Thread());
}
}
