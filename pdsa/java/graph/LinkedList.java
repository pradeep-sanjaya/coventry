package pdsa.graph;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    private Node head;

    public void addFirst(T data) {
        if (head == null) {
            head = new Node(data, null);
        } else {
            head = new Node(data, head);
        }
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator(head);
    }
}
