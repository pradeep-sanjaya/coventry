/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 18
Java Collections Integer Stack
Push multiple elements and pop
*/

package pdsa;

import java.util.Stack;

public class CollectionsStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        System.out.println(stack);

        stack.push(3);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        stack.push(7);
        System.out.println(stack);

    }
}
