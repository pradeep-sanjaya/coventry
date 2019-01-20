package pdsa.stack;

import pdsa.utility.Performance;

public class StackConsumerPerformance {

    public static void main(String[] args) {

        Performance pf = new Performance();

        System.out.println("Stack performance evaluation - " + pf.getFormatedNumber() + " push\n");

        long startMemory = pf.getMemory();
        long start = System.nanoTime();

        Stack stack = new Stack();
        for (int cou = 0 ; cou < pf.getNoOfTests(); cou++) {
            stack.push(cou);
        }

        System.out.println("\n" + pf.getFormatedNumber() + " - push\n");
        System.out.println("Elapsed time for push");
        pf.printTime(start);
        pf.printMemory(startMemory);

        start = System.nanoTime();
        startMemory = pf.getMemory();
        int cou;
        for (cou = 0 ; cou < pf.getNoOfTests(); cou++) {
            try {
                stack.pop();
            } catch (Exception e) {

            }
        }

        System.out.println("\n" + pf.getFormatedNumber() + " - pop\n");
        System.out.println("Elapsed time for pop");
        pf.printTime(start);
        pf.printMemory(startMemory);
    }
}
