public class Assignment2 {
    public static void main(String[] args) {

        int[] arr = new int[4];

        try {
            //System.out.println(5/0);
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
