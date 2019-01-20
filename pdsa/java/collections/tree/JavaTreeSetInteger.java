/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 26
Java TreeSet, Integer
*/

package pdsa.collections.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class JavaTreeSetInteger {

    public static void main(String[] args) {

        System.out.println("\nInteger TreeSet");
        TreeSet<Integer> intTreeSet = new TreeSet<>();
        intTreeSet.add(1);
        intTreeSet.add(2);
        intTreeSet.add(3);
        intTreeSet.add(4);
        intTreeSet.add(5);

        Iterator<Integer> iterator = intTreeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}