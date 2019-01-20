/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 5
Java Threads, implement Runnable interface
*/

package pdsa;

public class JavaThreadImplementRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("im in thread");
    }

    public static void main(String[] args) {
        (new Thread(new JavaThreadImplementRunnable())).start();
    }
}
