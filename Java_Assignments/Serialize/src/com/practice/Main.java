package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
public static void main(String[] args) {
	Car c1 = new Car(new Engine(200, "Rb26"), "GTR");
	Car c2 = new Car(new Engine(300, "W11"), "F1");
	Map<Integer, Car> map= new HashMap<>();
	map.put(1, c1);
	map.put(2, c2);
	ReadWrite rw = new ReadWrite();
	rw.write(map);	
	Set<?> set=rw.read();
	Iterator<?> itr = set.iterator();
	while(itr.hasNext()) {
		Map.Entry<?, ?> m= (Map.Entry<?, ?>) itr.next();
		System.out.println(m.getKey()+" = "+m.getValue());
	}
}

}
