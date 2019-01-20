/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 25
Java TreeSet, String
*/

package pdsa.collections.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class JavaTreeSetString {

    public static void main(String[] args) {

        System.out.println("String TreeSet");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("One");
        treeSet.add("Two");
        treeSet.add("Three");
        treeSet.add("Four");
        treeSet.add("Five");

        Iterator<String> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}