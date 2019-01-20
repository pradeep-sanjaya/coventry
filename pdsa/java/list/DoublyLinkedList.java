/*
Take Home Assignment 2 - Link Lists
2. Implement the following methods for doubly link lists in java
    addLast
    addFirst
    addAfter
    addBefore
    Delete

Student Name: Pradeep Sanjaya
Student Id : cobsccomp182p-030
Batch: 18.2
*/
package pdsa.list;

public class DoublyLinkedList {

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
    public static int size = 0;

    public static void main(String[] args) {

        try {
            System.out.println("\naddLast 10");
            addLast(10);
            printHeadToTail();
            printTailToHead();

            System.out.println("\naddLast 20");
            addLast(20);
            printHeadToTail();
            printTailToHead();

            System.out.println("\naddAfter - add 30 after 10");
            addAfter(30, 10);
            printHeadToTail();
            printTailToHead();

            System.out.println("\naddBefore - add 40 before 30");
            addBefore(40, 30);
            printHeadToTail();
            printTailToHead();

            System.out.println("\ndelete 30");
            delete(30);
            printHeadToTail();
            printTailToHead();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void addLast(int data) {
        if (size == 0) {
            addFirst(data);
        } else {
            Node current = new Node(data, null, tail);
            tail.next = current;
            tail = current;
        }
        size++;
    }

    public static void addFirst(int data) {
        Node current = new Node(data, null, null);
        head = current;
        tail = current;
    }

    public static void addAfter(int data, int key) throws Exception {

        if (size == 0) {
            throw new Exception("List is empty");
        }

        Node current = head;

        while (current.data != key) {
            current = current.next;
        }

        if (current != null) {
            Node node = new Node(data, current.next, current);
            current.next.prev = node;
            current.next = node;
        }

        size++;
    }

    public static void addBefore(int data, int key) throws Exception {

        if (size == 0) {
            throw new Exception("List is empty");
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            if (current.data == key) {
                break;
            }
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            Node node = new Node(data, prev.next, prev);
            prev.next.prev = node;
            prev.next = node;
        }

        size++;
    }

    public static void delete(int data) throws Exception {

        if (size == 0) {
            throw new Exception("List is empty");
        }

        Node current = head;
        Node prev = null;

        while (current.data != data) {
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            current.next.prev = prev;
            prev.next = current.next;
        }

        size--;
    }

    public static void printHeadToTail() {
        System.out.println("\n==== print head to tail");
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    public static void printTailToHead() {
        System.out.println("\n==== print tail to head");
        Node tmp = tail;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.prev;
        }
    }

}
