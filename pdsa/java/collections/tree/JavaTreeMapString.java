/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 30
Java TreeMap, String
*/

package pdsa.collections.tree;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class JavaTreeMapString {

    public static void main(String[] args) {

        TreeMap<String, String> treeMap = new TreeMap<String, String>();

        treeMap.put("100", "Student1");
        treeMap.put("200", "Student2");
        treeMap.put("300", "Student3");
        treeMap.put("400", "Student4");

        for (Map.Entry m : treeMap.entrySet()) {
            System.out.println(m.getValue());
        }
    }
}