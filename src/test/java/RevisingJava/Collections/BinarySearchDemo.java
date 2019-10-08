package RevisingJava.Collections;

import io.cucumber.java.it.Ma;

import java.text.CollationElementIterator;
import java.util.*;

public class BinarySearchDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tima");
        list.add("Zema");
        list.add("Graf");

        String name = "Tima";
        findElement(list, "Tima");
        findElement(list, "Temirlan");
       // int i = Collections.binarySearch(list, "");

        Map<String, Object> map = new LinkedHashMap<>();
        map.put("name", "Tima");
        map.put("age", 26);
        Object[] obj=map.values().toArray();
        for (int i=0;i<obj.length;i++){
            System.out.println(obj[i]);
            System.out.println(System.currentTimeMillis());
        }

    }

    public static void findElement(List<String> list, String searchingElement) {
        Collections.sort(list);
        if (Collections.binarySearch(list, searchingElement) == -1) {
            System.out.println(searchingElement + " was not found in the list");
        } else if (Collections.binarySearch(list, searchingElement) != -1) {
            System.out.println(Collections.binarySearch(list, searchingElement) + " is the index of " + searchingElement);
        }
    }

}
