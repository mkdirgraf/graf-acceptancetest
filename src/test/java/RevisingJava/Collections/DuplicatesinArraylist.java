package RevisingJava.Collections;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesinArraylist {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Tima");
        list.add("Tima");
        list.add("Dovlet");
        System.out.println(list.size()!=list.stream().distinct().count());
        System.out.println(list.stream().distinct().count());
        System.out.println(list.size());

        List<Integer> numbers=new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        int[] nm=numbers.stream().mapToInt(Integer::intValue).toArray();

        String[] str=list.toArray(new String[0]);
        System.out.println(str[2]);



    }
}
