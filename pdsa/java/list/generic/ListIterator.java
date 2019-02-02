package pdsa.list.generic;

import java.util.Iterator;

public class ListIterator<T> implements Iterator<T> {
    Node<T> current;

    public ListIterator(LinkedList linkedList) {
        current = linkedList.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }
}
