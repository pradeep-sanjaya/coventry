/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 16
CircularLinkedList
Add multiple elements to the list,
Implement LinkedList methods
Print elements from head to tail and tail to head
*/

package pdsa.list;

public class CircularLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    public static int size;

    public static void main(String[] args) {

        try {

            System.out.println("\nadd 20 at start");
            addNodeAtStart(20);
            printHeadToTail();

            System.out.println("\nadd 10 at start");
            addNodeAtStart(10);
            printHeadToTail();

            System.out.println("\nadd 30 to end");
            addNodeAtEnd(30);
            printHeadToTail();

            System.out.println("\ndelete node from start");
            deleteNodeFromStart();
            printHeadToTail();

            System.out.println("\ndelete node 30");
            delete(30);
            printHeadToTail();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void printHeadToTail() throws Exception {
        Node tmp = head;
        if (size <= 0) {
            throw new Exception("list is empty");
        } else {
            do {
                System.out.println(tmp.data);
                tmp = tmp.next;
            } while (tmp != head);
        }
    }

    public static void addNodeAtStart(int data) {

        Node node = new Node(data, null);

        if (size == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
            tail.next = node;
        }

        size++;
    }

    public static void addNodeAtEnd(int data) {

        if (size == 0) {
            addNodeAtStart(data);
        } else {
            Node node = new Node(data, null);
            tail.next = node;
            node.next = head;
            tail = node;
        }
        size++;
    }

    public static void deleteNodeFromStart() throws Exception {
        if (size == 0) {
            throw new Exception("list is empty");
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
    }

    public static void delete(int data) throws Exception {
        if (size == 0) {
            throw new Exception("list is empty");
        } else {
            Node node = head;
            Node prev = null;
            while (node.data != data) {
                node = node.next;
                prev = node;
            }

            if (prev != null) {
                prev.next = node.next;

                //check if deleting node is head, correct it


                //check if deleting node is tail, correct it

            }

            size--;

            if (size == 1) {
                prev.next = prev;
            }
        }
    }

}
