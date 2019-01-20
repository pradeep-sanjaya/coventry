/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 28
Java TreeSet, implement comparable interface to custom class
*/

package pdsa.collections.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class JavaTreeSetComparable {

    public static void main(String[] args) {

        // User defined objects, TreeSet, implement comparable interface to user defined object
        System.out.println("\nUser defined TreeSet, implement comparable interface in user defined object");
        TreeSet<Student> treeSetStudent = new TreeSet<>();
        treeSetStudent.add(new Student(1, "Student1"));
        treeSetStudent.add(new Student(2, "Student2"));
        treeSetStudent.add(new Student(3, "Student3"));
        treeSetStudent.add(new Student(4, "Student4"));
        treeSetStudent.add(new Student(5, "Student5"));

        Iterator<Student> iteratorStudent = treeSetStudent.iterator();

        while (iteratorStudent.hasNext()) {
            System.out.println(iteratorStudent.next());
        }
    }
}