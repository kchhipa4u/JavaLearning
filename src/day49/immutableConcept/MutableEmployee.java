package day49.immutableConcept;

import java.util.HashMap;
import java.util.Map;

public final class MutableEmployee {

	private final int salary;
	private final String name;
	private final Map map;
	
	public MutableEmployee(int salary, String name, Map map) {
		this.salary = salary;
		this.name = name;
		this.map = map;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}
	
	public Map getMap() {
		Map m = new HashMap(map);
		return m;
	}

	@Override
	public String toString() {
		return "MutableEmployee [salary=" + salary + ", name=" + name + ", map=" + map + "]";
	}

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		MutableEmployee emp1 = new MutableEmployee(50000, "Abu", map1);
		System.out.println(emp1);
		
		Map map2 = emp1.getMap();
		map2.put(4, "D");
		
		System.out.println(emp1);
		
		System.out.println(map2);
		
		
	}

	
	
}
