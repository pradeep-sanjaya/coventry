package pdsa.queue;

import jdk.nashorn.internal.runtime.ECMAException;

public class QueueConsumer {
    public static void main(String[] args) {
        System.out.println("Queue methods - add, remove, poll, peek\n");

        System.out.println("Create a queue");
        Queue queue = new Queue();
        print(queue);

        System.out.println("Add 10, 20, 30");
        queue.add(10);
        queue.add(20);
        queue.add(30);
        print(queue);

        System.out.println("Poll a value from queue");
        try {
            System.out.println("poll value: " + queue.poll());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        print(queue);

        System.out.println("Peek a value from queue");
        try {
            System.out.println("peek value: " + queue.peek());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        print(queue);

        System.out.println("Call queue remove");

        queue.remove();

        print(queue);

    }

    public static void print(Queue queue) {

        System.out.println("--- queue values ---");

        Node current = queue.getTail();
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }

        System.out.println("--------------------\n");
    }
}
