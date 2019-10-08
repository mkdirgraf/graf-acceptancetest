package RevisingJava.Collections;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        /**
         * Set is an interface that doesn't allow duplicate values, you can use HashSet and TreeSet
         * HashSet is faster than TreeSet performance vise
         * HashSet allows null objects whereas TreeSet doesn't allow null objects(it throws a NullPointerException)
         * TreeSet is sorted automatically and HashSet is not
         */




        ArrayList<String> names = new ArrayList<>();
        names.add("Tima");
        names.add("Eldiar");
        names.add("Beksultan");
        names.add("Ilias");
        names.add("Nurkan");
        names.add("Alisher");
        names.add("Tima");
        String name = "Tima";
        int count = 0;

        for (String firstName : names) {
            if (firstName.equals(name)) {
                count++;
            }
        }
        System.out.println(count);

       String[] ar=names.toArray(new String[0]);



        System.out.println(names.get(0));
        System.out.println("============");

        ArrayList<String> copy = (ArrayList) names.clone();

        Collections.sort(copy);
        for (String copies : copy) {
            System.out.println(copies);

        }
        System.out.println("=============");
        System.out.println("removing all the duplicates from the Arraylist");
        Set<String> unique = new HashSet<>();
        for (String removingDuplicates : copy) {
            unique.add(removingDuplicates);

        }

        for (String uniq:unique){
            System.out.println(uniq);
        }

        Set<String> sorted=new TreeSet<>();
        for (String sorting:unique){
            sorted.add(sorting);
        }
        System.out.println("=============");
        for (String alreadySorted:sorted){
            System.out.println(alreadySorted);
        }

    }
}
