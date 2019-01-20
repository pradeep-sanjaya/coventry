/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 10
DoublyLinkedList, traverse head to tail and tail to head
*/

package pdsa.list;

public class DoublyLinkedListTraverse {

    public static String TYPE_ASC  = "asc";
    public static String TYPE_DESC = "desc";

    private static Node head = null;

    private static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        head = new Node(10, null, null);

        Node first = new Node(20, head, null);
        head.next = first;

        Node second = new Node(30, first, null);
        first.next = second;

        display(head, TYPE_ASC);

        Node tail = getLast();
        display(tail, TYPE_DESC);
    }

    private static Node getLast() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    private static void display(Node current, String type) {

        System.out.println("===== =====");

        while (current != null) {
            System.out.println(current.data);
            if (type == TYPE_ASC) {
                current = current.next;
            } else if (type == TYPE_DESC) {
                current = current.prev;
            }
        }

    }
}
