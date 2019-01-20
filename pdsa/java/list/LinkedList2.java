/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 9
LinkedList, implement addFirst, addLast, addAfter, insertBefore
*/

package pdsa.list;

public class LinkedList2 {

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node temp = new Node(17, null);
        temp = new Node(23, temp);
        temp = new Node(97, temp);
        head = new Node(44, temp);

        display(head);

        addFirst(10);
        display(head);

        addLast(100);
        display(head);

        addAfter(44, 200);
        display(head);

        insertBefore(10, 111);
        display(head);

        remove(100);
        display(head);

        try {
            int first = getFirst();
            System.out.println("===== =====");
            System.out.println("First: " + first);

            int last = getLast();
            System.out.println("===== =====");
            System.out.println("Last: " + last);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void display(Node currentNode) {
        System.out.println("===== =====");

        while (currentNode != null) {
            System.out.println("Value : " + currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void addFirst(int value) {
        head = new Node(value, head);
    }

    public static void addLast(int value) {
        if (head == null) {
            addFirst(value);
        } else {

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = new Node(value, null);
        }
    }

    public static void addAfter(int key, int value) {
        Node current = head;

        while (current != null && current.data != key) {
            current = current.next;
        }

        current.next = new Node(value, current.next);
    }

    public static void insertBefore(int key, int value) {

        Node current = head;

        if (current == null || current.data == key) {
            addFirst(value);
        } else {
            while (current.next != null) {
                if (current.next.data == key) {
                    current.next = new Node(value, current.next);
                    return;
                }
                current = current.next;
            }
        }
    }

    public static void remove(int value) {
        Node current = head;
        Node prev = null;

        while (current.next != null && current.data != value) {
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            prev.next = current.next;
        }

    }

    public static int getLast() throws Exception {

        Node current = head;

        if (head == null) {
            throw new Exception("head is null");
        }

        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

    public static int getFirst() throws Exception {

        if (head == null) {
            throw new Exception("head is null");
        }

        return head.data;
    }
}