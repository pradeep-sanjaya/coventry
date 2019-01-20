package pdsa.queue;

import pdsa.utility.Performance;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class JavaCollectionsQueuePerformance {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        Performance pf = new Performance();
        pf.setNoOfTests(10000);

        System.out.println("Java Priority performance evaluation - " + pf.getFormatedNumber() + " add\n");

        long startMemory = pf.getMemory();
        long start = System.nanoTime();

        for (int cou = 0 ; cou < pf.getNoOfTests(); cou++) {
            queue.add(cou);
        }

        System.out.println("\n" + pf.getFormatedNumber() + " - add\n");
        System.out.println("Elapsed time for add");
        pf.printTime(start);
        pf.printMemory(startMemory);

        start = System.nanoTime();
        startMemory = pf.getMemory();
        int cou;
        for (cou = 0 ; cou < pf.getNoOfTests(); cou++) {
            try {
                queue.poll();
            } catch (Exception e) {

            }
        }

        System.out.println("\n" + pf.getFormatedNumber() + " - poll\n");
        System.out.println("Elapsed time for poll");
        pf.printTime(start);
        pf.printMemory(startMemory);

    }
}
