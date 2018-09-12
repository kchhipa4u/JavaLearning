package day54.collectionframework.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayVsLinkedListPerformanceInAddElement {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 1; i <= 1000000; i++) {
			al.add(i);
		}
		
		LinkedList<Integer> ll = new LinkedList<>(al);
		
		long start = System.nanoTime();
		al.add(500, 40);
		long totalTime = System.nanoTime() - start;
		System.out.println("Time taken by ArrayList (ns): " + totalTime);
		
		
		long start1 = System.nanoTime();
		ll.add(500, 40);
		long totalTime1 = System.nanoTime() - start1;
		System.out.println("Time taken by LinkedList (ns): " + totalTime1);
		
	}
}
