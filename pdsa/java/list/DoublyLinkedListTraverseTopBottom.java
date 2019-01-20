/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 15
DoublyLinkedList, addNodeAtStart, addNodeAtEnd, Traverse head to tail and tail to head
*/
package pdsa.list;

public class DoublyLinkedListTraverseTopBottom {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    public static int size;

    public static void main(String[] args) {

        System.out.println("\nadd 20 at start");
        addNodeAtStart(20);
        printHeadToTail();
        printTailToHead();

        System.out.println("\nadd 10 at start");
        addNodeAtStart(10);
        printHeadToTail();
        printTailToHead();

        System.out.println("\nadd 30 at end");
        addNodeAtEnd(30);
        printHeadToTail();
        printTailToHead();
    }

    public static void printHeadToTail() {
        System.out.println("\n==== print head to tail");
        Node tmp = head;
        for (int cou = 0; cou < size; cou++) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    public static void printTailToHead() {
        System.out.println("\n==== print tail to head");
        System.out.println("size: " + size);
        Node tmp = tail;
        for (int cou = size; cou > size; cou--) {
            System.out.println(tmp.data);
            tmp = tmp.prev;
        }
    }

    public static void addNodeAtStart(int data) {
        if (head == null && tail == null) {
            addFirst(data);
        } else {
            head = new Node(data, head, tail);
            tail.next = head;
        }
        size++;
    }

    public static void addNodeAtEnd(int data) {
        if (head == null && tail == null) {
            addFirst(data);
        } else {
            Node current = new Node(data, head, tail);
            tail.next = current;
        }
        size++;
    }

    public static void deleteNodeFromStart() {
        if (head == null && tail == null) {

        } else {

        }
    }

    public static void addFirst(int data) {
        Node current = new Node(data, null, null);
        head = current;
        tail = current;
    }
}
