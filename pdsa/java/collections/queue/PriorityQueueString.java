/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 19
PriorityQueue String
Compare iterator order of String PriorityQueue vs Integer PriorityQueue
*/

package pdsa.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueString {

    public static Queue<String> queue = new PriorityQueue<>();

    public static void main(String[] args) {

        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");

        System.out.println("head element: " + queue.element());
        System.out.println("head peek: " + queue.peek());

        print();

        String e1 = queue.remove();
        System.out.println("removed - queue: " + e1);

        String e2 = queue.poll();
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
