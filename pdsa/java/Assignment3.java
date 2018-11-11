public class Assignment3 extends Thread {
    String name;

    public Assignment3 (String name) {
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
        Assignment3 a1 = new Assignment3("*");
        Assignment3 a2 = new Assignment3("-");
        Assignment3 a3 = new Assignment3("=");

        a1.start();
        a2.start();
        a3.start();
    }
}
