public class Assignment5 implements Runnable {

    @Override
    public void run() {
        System.out.println("im in thread");
    }

    public static void main(String[] args) {
        (new Thread(new Assignment5())).start();
    }
}
