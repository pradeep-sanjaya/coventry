/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 32
Java HashMap
*/

package pdsa.collections;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(100, "Student1");
        hashMap.put(104, "Student2");
        hashMap.put(102, "Student3");
        hashMap.put(103, "Student4");

        for (Map.Entry m : hashMap.entrySet()) {
            System.out.println(m.getValue());
        }
    }
}