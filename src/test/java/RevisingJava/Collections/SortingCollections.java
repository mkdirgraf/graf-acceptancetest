package RevisingJava.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tima");
        list.add("Ilias");
        list.add("Beksultan");
        list.add("Eldiiar");
        Collections.sort(list);
        Collections.reverse(list);
        list.forEach(e -> System.out.println(e));

        String[] str = list.toArray(new String[0]);

        //Converting int array to List
        int[] arr = new int[]{2, 3, 7, 4, 7, 3};
        List<Integer> integer=new ArrayList<>();
        integer= Arrays.stream(arr).boxed().collect(Collectors.toList());
        //converting from Integer list to array of int
        int[] tima=integer.stream().mapToInt(Integer::intValue).toArray();



        //How to sort an arraylist
        List<Integer> numbers=new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(0);
        numbers.add(9);
        Collections.sort(numbers);
        numbers.forEach(e-> System.out.println(e));
        System.out.println(Collections.binarySearch(numbers,3));
    }
}
