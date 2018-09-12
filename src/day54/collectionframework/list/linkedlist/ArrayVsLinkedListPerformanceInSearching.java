package day54.collectionframework.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayVsLinkedListPerformanceInSearching {

	public static void main(String[] args) {
		// search

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 1; i <= 1000000; i++) {
			al.add(i);
		}
		long start = System.nanoTime();
		al.get(800000);

		long totalTime = System.nanoTime() - start;
		System.out.println("Time taken by ArrayList (ns): " + totalTime);

		LinkedList<Integer> ll = new LinkedList<>(al);
		long start1 = System.nanoTime();
		ll.get(800000);
		long totalTime1 = System.nanoTime() - start1;
		System.out.println("Time taken by LinkedList (ns): " + totalTime1);

	}
}
