package day54.collectionframework.list.customlinkedlist;

public class TestCustomLinkedList {

	public static void main(String[] args) {
		CustomLinkedList ll = new CustomLinkedList();
		Node<Integer> n1 = new Node<>(50);		
		ll.addFirst(n1);
		
		Node<Integer> n2 = new Node<>(40);		
		ll.addFirst(n2);
		
		Node<Integer> n3 = new Node<>(30);		
		ll.addFirst(n3);
		
		Node<Integer> n4 = new Node<>(60);
		ll.addLast(n4);
		
		Node<Integer> n5 = new Node<>(45);
		ll.insertAfter(n2, n5);
		
		Node<Integer> n6 = new Node<>(35);
		ll.insertAfter(n3, n6);
		
		ll.removeHead();
		ll.removeHead();
		
		System.out.println(ll);
		/*ll.addFirst(new Node<Integer>(50));
		Node<Integer> n2 = new Node<>(40);
		ll.addFirst(n2);
		ll.addFirst(new Node<Integer>(30));
		
		
		ll.addLast(new Node<Integer>(60));
		
		
		ll.insertAfter(n2, new Node<Integer>(45));
		System.out.println(ll.get(2));
		System.out.println(ll);*/
		
	}
}
