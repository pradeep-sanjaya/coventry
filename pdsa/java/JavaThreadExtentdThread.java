/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 3
Java Threads, extend Thread class
*/

package pdsa;

public class JavaThreadExtentdThread extends Thread {
    String name;

    public JavaThreadExtentdThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        int i;
        for (i = 0; i < 500 ; i++) {
            try {
                System.out.println(name);
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        JavaThreadExtentdThread a1 = new JavaThreadExtentdThread("*");
        JavaThreadExtentdThread a2 = new JavaThreadExtentdThread("-");
        JavaThreadExtentdThread a3 = new JavaThreadExtentdThread("=");

        a1.start();
        a2.start();
        a3.start();
    }
}
