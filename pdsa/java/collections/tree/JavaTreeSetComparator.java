/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 27
Java TreeSet, Comparator
*/

package pdsa.collections.tree;

import pdsa.collections.Book;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class JavaTreeSetComparator {

    public static void main(String[] args) {

        System.out.println("\nUser defined TreeSet");
        TreeSet<Book> treeSetUserDefined = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() == o2.getId()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        treeSetUserDefined.add(new Book(1, "Book1", "Publisher1", "Auther1"));
        treeSetUserDefined.add(new Book(2, "Book2", "Publisher2", "Auther2"));
        treeSetUserDefined.add(new Book(3, "Book3", "Publisher3", "Auther3"));
        treeSetUserDefined.add(new Book(4, "Book4", "Publisher4", "Auther4"));
        treeSetUserDefined.add(new Book(5, "Book5", "Publisher5", "Auther5"));

        Iterator<Book> userDefinedIterator = treeSetUserDefined.iterator();

        while (userDefinedIterator.hasNext()) {
            System.out.println(userDefinedIterator.next());
        }
    }
}