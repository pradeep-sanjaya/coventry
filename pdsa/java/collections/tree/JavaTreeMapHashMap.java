/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 31
Java TreeMap and HashMap
*/

package pdsa.collections.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaTreeMapHashMap {

    public static void main(String[] args) {

        //TreeMap Integer, Integer
        //TreeMap keys cannot be null
        System.out.println("TreeMap Integer, String");
        TreeMap<Integer, String> treeMapInteger = new TreeMap<Integer, String>();

        treeMapInteger.put(1000, "Student1");
        treeMapInteger.put(15000, "Student2");
        treeMapInteger.put(30000, "Student3");
        treeMapInteger.put(30, "Student4");
        //treeMapInteger.put(null, "NULL"); //NullPointerException

        for (Map.Entry m : treeMapInteger.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        //TreeMap String, String
        System.out.println("\nTreeMap String, String");
        TreeMap<String, String> treeMapString = new TreeMap<String, String>();

        treeMapString.put("1000", "Student1");
        treeMapString.put("15000", "Student2");
        treeMapString.put("30000", "Student3");
        treeMapString.put("30", "Student4");
        //treeMapString.put(null, "NULL"); NullPointerException

        for (Map.Entry m : treeMapString.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        //HashMap Integer, String
        System.out.println("\nHashMap Integer, String");
        HashMap<Integer, String> hashMapInteger = new HashMap<Integer, String>();

        hashMapInteger.put(1000, "Student1");
        hashMapInteger.put(15000, "Student2");
        hashMapInteger.put(30000, "Student3");
        hashMapInteger.put(30, "Student4");
        hashMapInteger.put(null, "NULL");

        for (Map.Entry m : hashMapInteger.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        //HashMap String, String
        System.out.println("\nHashMap String, String");
        HashMap<String, String> hashMapString = new HashMap<String, String>();

        hashMapString.put("1000", "Student1");
        hashMapString.put("15000", "Student2");
        hashMapString.put("30000", "Student3");
        hashMapString.put("30", "Student4");
        hashMapString.put(null, "NULL");

        for (Map.Entry m : hashMapString.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}