package pdsa.utility;

import java.text.DecimalFormat;

public class Performance {

    private int noOfTests = 10000000;
    public static DecimalFormat formatter = new DecimalFormat("###,###.###");

    public int getNoOfTests() {
        return noOfTests;
    }

    public void setNoOfTests(int noOfTests) {
        this.noOfTests = noOfTests;
    }

    public String getFormatedNumber() {
        return formatter.format(noOfTests);
    }

    public void printTime (long start) {
        long elapsedTime  = System.nanoTime() - start;
        double mseconds = (double)elapsedTime / 1_000_000.0;

        System.out.println("elapsed nanoseconds : " + formatter.format(elapsedTime));
        System.out.println("elapsed milliseconds : " + mseconds);
    }

    public void printMemory (long start) {
        long used =  getMemory() - start;
        System.out.println("used memory byte : " + formatter.format(used));
        System.out.println("used memory MB : " + readable(used, 2));
    }

    public long getMemory() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public String readable(double bytes, int digits) {
        String[] dictionary = { "bytes", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB" };
        int cou;

        for (cou = 0; cou < dictionary.length; cou++) {
            if (bytes < 1024) {
                break;
            }
            bytes = bytes / 1024;
        }

        return String.format("%." + digits + "f", bytes) + " " + dictionary[cou];
    }
}
