/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 13
Java LinkedList, Custom class
*/

package pdsa.collections.list;

import pdsa.collections.Book;

import java.util.LinkedList;

public class JavaLinkedListCustomClass {

    public static void main(String[] args) {

        LinkedList<Book> linkedList = new LinkedList<Book>();

        linkedList.add(new Book(1, "name1", "publisher1", "author1"));
        linkedList.add(new Book(2, "name2", "publisher2", "author2"));
        linkedList.add(new Book(3, "name3", "publisher3", "author3"));
        linkedList.add(new Book(4, "name4", "publisher4", "author4"));

        print(linkedList);
    }

    public static void print(LinkedList<Book> list) {
        for (Book book: list) {
            System.out.println(book);
        }
    }

}
