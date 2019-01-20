/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 4
Java Threads, extend Thread class
*/

package pdsa;

public class JavaThreadExtendthreadOneThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("im a thrread");
    }

    public static void main(String[] args) {
        JavaThreadExtendthreadOneThread a4 = new JavaThreadExtendthreadOneThread();
        a4.run();
    }
}
