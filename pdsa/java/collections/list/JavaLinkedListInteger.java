/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 11
Java LinkedList, Integer
*/

package pdsa.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class JavaLinkedListInteger {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(34);
        list.add(55);
        list.add(67);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
