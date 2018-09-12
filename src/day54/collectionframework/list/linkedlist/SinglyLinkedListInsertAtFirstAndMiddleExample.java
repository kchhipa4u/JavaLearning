package day54.collectionframework.list.linkedlist;

import java.util.NoSuchElementException;

class Node {
	public Integer data; // data in Node.
	public Node next; // points to next Node in list.

	public Node() {
	}

	public Node(Integer data) {
		this.data = data;
	}

	public void displayNode() {
		System.out.print(data + " ");
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}

class LinkedList {

	private Node first; // ref to first link on list

	public void addFirst(Object obj) {
		Node newNode = new Node();
		newNode.data = (Integer) obj;
		newNode.next = first;
		first = newNode;
	}
	
	public Object removeFirst() {
		if (first == null)
	         throw new NoSuchElementException();
		
		first = first.next;
		return first.data;
	}
	
	public void add(int index, Object element) {
		int count = 1;
		Node previous = first;
		Node newNode = new Node();
		newNode.data = (Integer) element;
		
		if(index == 0) {
			newNode.next = first;
			first = newNode;
			return;
		}
		
		while(count < index-1) {
			previous = previous.next;
			count++;
		}
		
		Node current = previous.next;
		
		newNode.next = current;
		previous.next = newNode;
		
	}

	@Override
	public String toString() {
		return "LinkedList [first=" + first + "]";
	}
}

public class SinglyLinkedListInsertAtFirstAndMiddleExample {

	public static void main(String[] args) {
		LinkedListExamples linkedList = new LinkedListExamples(); // creation of Linked List
		linkedList.addFirst(10);
		linkedList.addFirst(20);
		linkedList.addFirst(30);
		linkedList.addFirst(50);

		System.out.println(linkedList);
		
		//linkedList.removeFirst();
		//System.out.println(linkedList);
		
		linkedList.add(1, 40);
		
		System.out.println(linkedList);
	}
}
