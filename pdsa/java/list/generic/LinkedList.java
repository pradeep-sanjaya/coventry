package pdsa.list.generic;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    Node<T> head, tail;

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void add(T data) {
        Node<T> node = new Node<>(data, null);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(this);
    }
}