package day54.collectionframework.list.customlinkedlist;
public class Node<T> {

    @SuppressWarnings("rawtypes")
	public Node next;
    public T data;

    public Node(T data) {
        this.data = data;
    }

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}