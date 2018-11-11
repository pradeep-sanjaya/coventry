public class Assignment8 {

    static Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        head.next = n2;
        n2.next = n3;

        display(head);
    }

    public static void display(Node node) {
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
