/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 22
PriorityQueue with a custom class
Use Comparator in initialization
Override compare method
*/

package pdsa.collections.queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueComparator {


    public static Queue<String> queue = new java.util.PriorityQueue<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    });

    public static void main(String[] args) {

        //add few strings with different length
        queue.add("===");
        queue.add("======");
        queue.add("====");
        queue.add("=========");
        queue.add("===");
        queue.add("=");

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
