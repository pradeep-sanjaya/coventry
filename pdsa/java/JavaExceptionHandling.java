/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 2
Exception Handling
*/

package pdsa;

public class JavaExceptionHandling {
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
