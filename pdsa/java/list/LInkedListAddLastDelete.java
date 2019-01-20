/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 12
LinkedList, addLast, delete
*/

package pdsa.list;

public class LInkedListAddLastDelete {

    private static class Node {
        int data;
        Node prev;
        Node next;

        public Node() {}
        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public static Node head;
    public static Node last;

    public static void main(String[] args) {

        //head = new Node(1, null, null);

        addLast(1);
        addLast(2);
        addLast(3);
        //addLast(4);

        System.out.println("===== initial state");
        print(head);

        System.out.println("===== delete - 2");
        delete(2);
        print(head);
    }

    public static void addLast(int data) {
        if (last == null) {
            Node current = new Node(data, null, null);
            head = current;
            last = current;
        } else {
            Node current = new Node(data, last, null);
            last.next = current;
            last = current;
        }
    }

    public static void delete(int key) {
        Node current = head;
        while (current.data != key) {
            current = current.next;
        }

        if (current.prev != null && current.next != null) {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        } else {
            if (current.prev == null && current.next != null) {
                head = current;
                current.next.prev = null;
            }

            if (current.prev == null) {
                last = current;
                //current.prev.next = null;
            }
        }
    }

    public static void print(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
