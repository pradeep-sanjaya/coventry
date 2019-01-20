package pdsa.queue;

public class Queue implements Queueable {

    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return head;
    }

    @Override
    public boolean add(int data) {
        if (head == null) {
            Node node = new Node(data, null, null);
            head = node;
            tail = node;
        } else {
            Node node = new Node(data, null, tail);
            tail.setNext(node);
            tail = node;
        }

        return false;
    }

    @Override
    public void remove() {
        head = null;
        tail = null;
    }

    @Override
    public int poll() throws Exception {

        if (head == null) {
            throw new Exception("queue is empty");
        }

        int value = head.getData();
        head = head.getNext();

        return value;
    }

    @Override
    public int peek() throws Exception {

        if (head == null) {
            throw new Exception("queue is empty");
        }

        return head.getData();
    }
}
