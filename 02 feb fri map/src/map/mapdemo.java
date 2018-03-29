package map;

import java.util.HashMap;
import java.util.Map;

public class mapdemo {
	public static void main(String[] args) {
		//List l= new ArrayList();
		Map m= new HashMap<>();
		
		m.put(1,"one");
		m.put(2,"two");
		m.put(3,"three");
		m.put(4,"four");
		
		System.out.println(m.get(2));
		System.out.println(m.get(9));
		
	}
}
