package day54.collectionframework.list.customlinkedlist;
public class CustomLinkedList {

    public Node head;
    public Node tail;
    public int size;

    // O(1)
    public void addFirst(Node n) {
        n.next = head;
        head = n;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // O(1)
    public void addLast(Node n) {
        if (head == null) {
            addFirst(n);
        } else {
            tail.next = n;  // link with new node
            tail = n;   // tail will point out to newly added node
            size++;
        }
    }

    // O(1)
    public void insertAfter(Node node, Node newNode) {
        if (node.equals(tail)) {
            tail = newNode;
        }
        newNode.next = node.next;
        node.next = newNode;
        size++;
    }

    // O(1)
    public void removeAfter(Node n) {
        if (n.next != null) {
            if (n.next.equals(tail)) {
                tail = n;
            }
            n.next = n.next.next;
            size--;
        }
    }

    // O(1)
    void removeHead() {
        if (head != null) {
            head = head.next;
            size--;

            if (head == null) {
                tail = null;
            }
        }
    }

    // O(n)
    public Node get(int index) {
        if (index > size - 1) {
            return null;
        }
        Node n = head;

        while (n.next != null && index > 0) {
            n = n.next;
            index--;
        }
        return n;
    }

	@Override
	public String toString() {
		return "CustomLinkedList [head=" + head + ", tail=" + tail + ", size=" + size + "]";
	}
}