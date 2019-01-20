package pdsa.stack;

public class Stack implements Stackable {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void push(int data) {
        if (head == null) {
            head = new Node(data, null);
        } else {
            head = new Node(data, head);
        }
    }

    public int pop() throws Exception {

        if (head == null) {
            throw new Exception("stack is empty");
        }

        int value = head.getData();

        if (head.getNext() != null) {
            head = head.getNext();
        } else {
            head = null;
        }

        return value;
    }

    public int peek() throws Exception {
        if (head == null) {
            throw new Exception("stack is empty");
        }

        return head.getData();
    }

    public void empty() {
        head = null;
    }
}
