package day53.collectionframework.list;

import java.util.ArrayList;

public class EnsureCapacityDemo {

	public static void main(String[] args) {

		// ArrayList with Capacity 4
		ArrayList<String> studentList = new ArrayList<String>(4);
		// Added 4 elements
		studentList.add("A");
		studentList.add("B");
		studentList.add("C");
		studentList.add("D");
		
		// Increase capacity to 14
		studentList.ensureCapacity(14);
		
		studentList.add("E");
		studentList.add("F");
		studentList.add("G");
		studentList.add("I");
		studentList.add("J");
		studentList.add("K");
		studentList.add("L");

		// Print all the elements available in list
		for (String s : studentList) {
			System.out.println(s);
		}
	}
}
