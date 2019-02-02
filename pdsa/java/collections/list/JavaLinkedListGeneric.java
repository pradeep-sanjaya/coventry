/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 12
Java LinkedList, methods
*/

package pdsa.collections.list;

import java.util.LinkedList;

public class JavaLinkedListGeneric {

    public static void main(String[] args) {

        LinkedList list = new LinkedList<>();

        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        list.addLast("Z");
        list.addFirst("A");
        list.add(1, "A2");

        System.out.println(list);

        list.remove("D");
        list.remove(3);
        System.out.println(list);

        // remove first and last elements
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        // get set values
        list.set(2, (String)list.get(2) + " changed");
        System.out.println(list);

    }

}
