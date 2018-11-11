public class Assignment4 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("im a thrread");
    }

    public static void main(String[] args) {
        Assignment4 a4 = new Assignment4();
        a4.run();
    }
}
