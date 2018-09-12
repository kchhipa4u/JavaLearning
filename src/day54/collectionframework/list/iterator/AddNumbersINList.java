package day54.collectionframework.list.iterator;

import java.util.ArrayList;
import java.util.List;

public class AddNumbersINList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		// add initial 20 numbers in the list
		for(int i = 1; i <=20; i++) {
			numbers.add(i);
		}
		
		// Range View
		
		List<Integer> subList = numbers.subList(4, 9);
		System.out.println(subList);
		
		/*int total = 0;
		
		for (Integer integer : numbers) {
			if( integer%2 == 0) {
				total = total + integer;
			}
		}
		System.out.println(total);*/
	}
}
