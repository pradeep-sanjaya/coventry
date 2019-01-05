/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 20
PriorityQueue Integer
*/

package pdsa;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueInteger {

    public static Queue<Integer> queue = new PriorityQueue<>();

    public static void main(String[] args) {

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("head element: " + queue.element());
        System.out.println("head peek: " + queue.peek());

        print();

        Integer e1 = queue.remove();
        System.out.println("removed - queue: " + e1);

        Integer e2 = queue.poll();
        System.out.println("removed - poll: " + e2);

        print();
    }

    public static void print() {
        System.out.println("\nIterating the queue");

        Iterator iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n");
    }
}
