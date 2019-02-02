package pdsa.graph;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {

    Node current;

    public LinkedListIterator(Node node) {
        this.current = node;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        Object data = current.getData();
        current = current.getNext();
        return (T)data;
    }
}
